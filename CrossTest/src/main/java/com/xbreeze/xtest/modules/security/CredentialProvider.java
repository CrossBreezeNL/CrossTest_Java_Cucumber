package com.xbreeze.xtest.modules.security;

import com.xbreeze.xtest.config.CredentialProviderConfig;
import com.xbreeze.xtest.exception.XTestException;

public interface CredentialProvider {
	/**
	 * Method receives an unresolved credential and returns the resolved credential
	 * The unresolved credential can be an encrypted value or something else that the implementing class can resolve
	 * @param unresolvedCredential
	 * @return the resolved value for the unresolvedCredential
	 * @throws an XTestEXception in case of an error
	 */
	public String resolveCredential(String unresolvedCredential) throws XTestException;
	/**
	 * Initializes the credential provider with the configured values.
	 * @param credentialProviderConfig The config values to use
	 * @throws XTestException in case of a initialization error
	 */
	public void initialize(CredentialProviderConfig credentialProviderConfig) throws XTestException;
	

}
