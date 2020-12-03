package com.xbreeze.xtest.modules.config.objecttemplate;

import com.xbreeze.xtest.config.ObjectTemplateConfig;
import com.xbreeze.xtest.config.XTestConfig;

public class ObjectTemplate_Helper {

	private XTestConfig _config;
	
	public ObjectTemplate_Helper(XTestConfig config) {
		this._config = config;
	}
	
	public void SetAttributeValueForObjectTemplate (
          String  object_template,
          String  attribute_name,
          String  attribute_property,
          String  property_value
        ) throws Throwable {
		//Get the object template from the config
		ObjectTemplateConfig objectTemplateConfig = this._config.getObjectTemplateConfig(object_template);
		
		
	}
}
