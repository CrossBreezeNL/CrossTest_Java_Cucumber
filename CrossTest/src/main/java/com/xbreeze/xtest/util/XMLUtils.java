package com.xbreeze.xtest.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import java.util.logging.LogManager;
import java.util.logging.Logger;

import com.xbreeze.xtest.exception.XTestException;
import com.ximpleware.AutoPilot;
import com.ximpleware.FastLongBuffer;
import com.ximpleware.ModifyException;
import com.ximpleware.NavException;
import com.ximpleware.ParseException;
import com.ximpleware.TranscodeException;
import com.ximpleware.VTDGen;
import com.ximpleware.VTDNav;
import com.ximpleware.XMLModifier;
import com.ximpleware.XPathEvalException;
import com.ximpleware.XPathParseException;

public class XMLUtils {
	// The logger for this class.
		protected static final Logger logger = Logger.getLogger(XMLUtils.class.getName());
		
		/**
		 * Escape XML characters.
		 * @param input The text to escape.
		 * @return The escaped input.
		 */
		public static String excapeXMLChars(String input) {
			return input.replaceAll("\\<", "&lt;").replaceAll("\\>", "&gt;");
		}
		
		/**
		 * Get the VTDNav object for a XML document.
		 * @param xmlDocument The XML document as a String.
		 * @return The VTDNav.
		 * @throws GeneratorException
		 */
		public static VTDNav getVTDNav(String xmlDocument) throws XTestException {
			return getVTDNav(xmlDocument, false);
		}
		
		/**
		 * Get the VTDNav object for a XML document.
		 * See: https://vtd-xml.sourceforge.io/javadoc/.
		 * @param xmlDocument The XML document as a String.
		 * @param namespaceAware Whether the parser is namespace aware.
		 * @return The VTDNav.
		 * @throws GeneratorException
		 */
		public static VTDNav getVTDNav(String xmlDocument, boolean namespaceAware) throws XTestException {
			// Create a VTGGen object.
			VTDGen vg = new VTDGen();
			
			// Enable collecting all whitespaces.
			vg.enableIgnoredWhiteSpace(true);
			
			// Set the document (in UTF-8 encoding).
			// Currently the encoding is set to US_ASCII, cause this solves the issue for special characters and doesn't seem to break anything.
			// Question is asked to the vtd-gen developer if this is a bug in vtg-gen.
			// https://stackoverflow.com/questions/51507388/vtd-xml-element-fragment-incorrect
			vg.setDoc(xmlDocument.getBytes(StandardCharsets.US_ASCII));
			
			// When enabling namespace awareness, you must map the URLs of all used namespaces here.
			try {
				vg.parse(namespaceAware);
			} catch (ParseException e) {
				throw new XTestException(String.format("Error while reading file as XML document: %s.", e.getMessage()));
			}
			
			// Create a VTDNav for navigating the document.
			return vg.getNav();
		}
		
		/**
		 * Write the new XML structure to a String.
		 * @param xm The XMLModifier
		 * @return The resulting XML document as a String.
		 * @throws GeneratorException 
		 */
		public static String getResultingXml(XMLModifier xm) throws XTestException {
			// Write the XML document into a ByteArray.
	        ByteArrayOutputStream baos = new ByteArrayOutputStream();
	        try {
				xm.output(baos);
			} catch (ModifyException | TranscodeException | IOException e) {
				throw new XTestException(String.format("Error while getting resulting XML document after modification(s): %s.", e.getMessage()));
			}
	        // Store the ByteArray into a String.
	        String modifiedTemplate = baos.toString();
	        // Close the output stream.
	        try {
				baos.close();
			} catch (IOException e) {
				throw new XTestException(String.format("Error while closing ByteArrayOutputStream after writing XML document.", e.getMessage()));
			}
	        // Return the XML document as a String.
	        return modifiedTemplate;
		}
		
		/**
		 * Apply a XPath expression on a XML document and return the resulting nodes as a XML fragment in a string
		 * @param xmlDoc a String object containing a XML document
		 * @param xPath the XPath expression to evaluate
		 * @return a String object containing the result of the Xpath evaluated against xmlDoc
		 * @throws ConfigException
		 */
		public static String getXmlFragment(String xmlDoc, String xPath) throws XTestException {
			try {
				logger.info(String.format("Applying xpointer %s on config file %s", xPath, xmlDoc));
				StringBuilder sb = new StringBuilder();
				VTDNav nav = getVTDNav(xmlDoc);
				AutoPilot ap = new AutoPilot(nav);
				ap.selectXPath(xPath);
				FastLongBuffer flb = new FastLongBuffer();
				//Store the record identifiers from matching elements
				while ((ap.evalXPath()) != -1) {
					flb.append(nav.getElementFragment());				
				}
				logger.info(String.format("Found %d matches", flb.size()));
				//Process matched elements by extracting them from xml and appending to stringbuilder.
				byte[] xml = nav.getXML().getBytes();
				for (int i = 0; i < flb.size(); i++) {
					sb.append(new String(xml, flb.lower32At(i), flb.upper32At(i)));
				}
				return sb.toString();
			} catch (XTestException e) {
				throw new XTestException(String.format("Error parsing %s as XML: %", xmlDoc, e.getMessage()));
			} catch (XPathParseException | XPathEvalException e) {
				throw new XTestException(getAutopilotExceptionMessage(xPath, e));		
			} catch (NavException e) {
				throw new XTestException(String.format("Error navigating %s: %s", xmlDoc, e.getMessage()));
			}		
		}
		
		
		/**
		 * Function to get a more informative error message when a XPathParseException is fired while using the VTD-Gen AutoPilot.
		 * @param xPath The XPath which was parsed.
		 * @param e The exception which was thrown.
		 * @return The improved exception message.
		 */
		public static String getAutopilotExceptionMessage(String xPath, Exception e) {
			// Init the exception message.
			String exceptionMessage = e.getMessage();
			// If the exception is a XPathParseException, create a exception message using the offset.
			if (e instanceof XPathParseException && ((XPathParseException) e).getOffset() > 0) {
				int substringEnd = ((XPathParseException) e).getOffset();
				int substringStart = (substringEnd <= 10) ? 0 : substringEnd - 10;
				exceptionMessage = String.format("Syntax error after or around the end of Â´%sÂ´", xPath.substring(substringStart, substringEnd));
			}
			// Return the exception message.
			return exceptionMessage;
		}
}
