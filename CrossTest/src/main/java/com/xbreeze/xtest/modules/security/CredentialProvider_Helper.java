package com.xbreeze.xtest.modules.security;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

import com.xbreeze.xtest.config.CredentialProviderConfig;
import com.xbreeze.xtest.config.XTestConfig;
import com.xbreeze.xtest.exception.XTestException;


/**
 * Helper class for credential providers
 * @author Willem
 *
 */
public class CredentialProvider_Helper {
	private HashMap<String, CredentialProvider> _credentialProviders;
	private XTestConfig _config;
	
	public CredentialProvider_Helper(XTestConfig cfg) throws XTestException{
		this._credentialProviders = new HashMap<>();		
		_config = cfg.getConfig();		
	}
	
	/**
	 * Get a credential provider from the collection of providers and if it is not already initialized, initialize a new instance
	 * The class is dynamically loaded based on the configured executionclass
	 * @param name
	 * @return the initialized credentialprovider
	 * @throws XTestException
	 */
	private CredentialProvider getCredentialProvider(String name) throws XTestException{
		if (!_credentialProviders.containsKey(name)) {
			//Get the config for the credentialprovider
			CredentialProviderConfig cpc = _config.getCredentialProviderConfig(name);
			try {
			    //Create an instance of the class and initialize it, then return it
				Class<?> c = this.getClass().getClassLoader().loadClass(cpc.getExecutionClass());
				CredentialProvider cp = (CredentialProvider)c.getDeclaredConstructor().newInstance();
				cp.initialize(cpc);			
				_credentialProviders.put(name, cp);
			}catch(ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException exc) {
				throw new XTestException (String.format("Error loading Credential Provider %s: %s", name, exc.getMessage()));
			}
		}
		return _credentialProviders.get(name);
	}
	
	/**
	 * Resolve a credential using the specified credentialprovider
	 * @param provider the credentialprovider to use
	 * @param credential the credential to resolve
	 * @return the resolved credential
	 * @throws XTestException in case of an error
	 */
	public String resolveCredential(String provider, String credential) throws XTestException{		
		return getCredentialProvider(provider).resolveCredential(credential);
	}
	
	
	

}
