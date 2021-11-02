package com.xbreeze.xtest.test;

import com.xbreeze.xtest.config.ConfigProperty;
import com.xbreeze.xtest.config.CredentialProviderConfig;
import com.xbreeze.xtest.exception.XTestException;
import com.xbreeze.xtest.modules.security.CredentialProvider;

public class TestCredentialProvider implements CredentialProvider {

	@Override
	public void initialize(CredentialProviderConfig cpConfig) throws XTestException {
		for (ConfigProperty cp:cpConfig.getProperties()) {
			System.out.println(String.format("Found property %s with value %s", cp.getName(), cp.getValue()));
		}

	}

	@Override
	public String resolveCredential(String credential) throws XTestException {
		// TODO Auto-generated method stub
		System.out.println("Going to resolve " + credential);
		return credential;
	}

}
