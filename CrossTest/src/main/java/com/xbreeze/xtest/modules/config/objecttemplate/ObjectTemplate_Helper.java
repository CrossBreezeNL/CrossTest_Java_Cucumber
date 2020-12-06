package com.xbreeze.xtest.modules.config.objecttemplate;

import com.xbreeze.xtest.config.ObjectTemplateConfig;
import com.xbreeze.xtest.config.XTestConfig;
import com.xbreeze.xtest.exception.XTestException;
import com.xbreeze.xtest.result.ResultContext;

public class ObjectTemplate_Helper {

	private XTestConfig _config;
	private ResultContext _resultContext;
	
	public ObjectTemplate_Helper(XTestConfig config, ResultContext resultContext) throws XTestException {
		this._config = config.getConfig();
		this._resultContext = resultContext;
	}
	
	public void SetAttributeValueForObjectTemplate (
          String  object_template,
          String  attribute_name,
          String  attribute_property,
          String  property_value
        ) throws Throwable {
		//Get the object template from the config
		ObjectTemplateConfig objectTemplateConfig = this._config.getObjectTemplateConfig(object_template);
		//If property_value refers to one or more XTest variables, replace them first
		if (property_value.contains(ResultContext.VARIABLE_PREFIX)) {
			property_value = _resultContext.substituteVariables(property_value);			
		}		
		objectTemplateConfig.setObjectTemplateAttributeProperty(attribute_name, attribute_property, property_value);		
	}
}
