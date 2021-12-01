package com.xbreeze.xtest.test;

import java.util.logging.Logger;

import com.xbreeze.xtest.config.ConfigProperty;
import com.xbreeze.xtest.config.CredentialProviderConfig;
import com.xbreeze.xtest.database.helpers.DataHelper;
import com.xbreeze.xtest.exception.XTestException;
import com.xbreeze.xtest.modules.security.CredentialProvider;

public class TestCredentialProvider implements CredentialProvider {
	static final Logger logger = Logger.getLogger(DataHelper.class.getName());

	@Override
	public void initialize(CredentialProviderConfig cpConfig) throws XTestException {
		for (ConfigProperty cp:cpConfig.getProperties()) {
			logger.info(String.format("TestCredentialProvider - Found property %s with value %s", cp.getName(), cp.getValue()));
		}

	}

	@Override
	public String resolveCredential(String credential) throws XTestException {
		logger.info("TestCredentialProvider - Going to resolve " + credential);
		return credential;
	}

}
