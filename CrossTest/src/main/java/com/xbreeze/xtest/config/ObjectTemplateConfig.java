/*******************************************************************************
 * Copyright (c) 2019 CrossBreeze
 *
 *  This file is part of CrossTest.
 *
 *     CrossTest is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     CrossTest is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with CrossTest.  If not, see <https://www.gnu.org/licenses/>.
 *     
 * Contributors:
 *     Willem Otten - CrossBreeze
 *     Harmen Wessels - CrossBreeze
 *******************************************************************************/
package com.xbreeze.xtest.config;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import com.xbreeze.xtest.exception.XTestException;

public class ObjectTemplateConfig {

	private String _name;
	private String _prefix;
	private String _suffix;
	private String _appendPrefix="";
	private String _parentName = "";
	private ObjectTemplateConfig _parent;
	private ArrayList<ObjectTemplateAttributeConfig> _attributes;
	
	@XmlAttribute(name="parent")
	public String getParentName() {
		return _parentName;
	}

	public void setParentName(String parentName) {
		this._parentName = parentName;
	}

	@XmlElement(name="Attribute")
	@XmlElementWrapper(name="Attributes")
	public ArrayList<ObjectTemplateAttributeConfig> getAttributes() {
		return _attributes;
	}

	public void setAttributes(ArrayList<ObjectTemplateAttributeConfig> attributes) {
		this._attributes = attributes;
	}

	public ObjectTemplateConfig() {		
		this._attributes = new ArrayList<>();
	}

	@XmlAttribute(name="name")
	public String getName() {
		return _name;
	}

	public void setName(String name) {
		this._name = name;
	}
	
	@XmlAttribute(name="prefix")
	public String getPrefix() {
		return _prefix;
	}

	public void setPrefix(String prefix) {
		this._prefix = prefix;
	}

	@XmlAttribute(name="suffix")
	public String getSuffix() {
		return _suffix;
	}

	public void setSuffix(String suffix) {
		this._suffix = suffix;
	}

	@XmlAttribute(name="appendPrefix")
	public String getAppendPrefix() {
		return _appendPrefix;
	}

	public void setAppendPrefix(String appendPrefix) {
		this._appendPrefix = appendPrefix;
	}

	public ObjectTemplateConfig getParent() {
		return _parent;
	}

	public void setParent(ObjectTemplateConfig parent) {
		this._parent = parent;
	}
	
	public void setParentTemplateConfig(XTestConfig config) throws XTestException{		
		this._parent = config.getObjectTemplateConfig(_parentName);
	}
	
	/**
	 * Applies the template to a given name
	 * @param name the name to apply the template to
	 * @return the name with the template (recursively) applied to it
	 */
	public String applyTemplateToName(String name) {
		return this.getRecursivePrefix().concat(this.getRecursiveAppendPrefix()).concat(name).concat(this.getRecursiveSuffix());
	}
	
	/**
	 * Get a default value for a specified field. If the field is specified in the object template or in one of its parents
	 * the default value is returned from te first level it is found
	 * @param fieldName the field to get the default value for
	 * @return the default value or null if not found
	 */
	public String getDefaultValue(String fieldName) {
		for (ObjectTemplateAttributeConfig attribute:this._attributes) {
			if (attribute.getName().equalsIgnoreCase(fieldName)) {
				return attribute.getValue();
			}
		}
		if (_parent != null) {
			return _parent.getDefaultValue(fieldName);
		}
		return null;
	}
	
	private String getRecursivePrefix() {
		if (this._prefix != null) {
			return this.getPrefix();
		}
		if (this._parent != null) {
			return _parent.getRecursivePrefix();
		}
		return "";
	}
	
	private String getRecursiveAppendPrefix() {
		if (this._parent == null) {
			return this.getAppendPrefix();
		}
		else return _parent.getAppendPrefix().concat(this.getAppendPrefix());
	}
	
	private String getRecursiveSuffix() {
		if (this._suffix != null) {
			return this.getSuffix();
		}
		if (this._parent != null) {
			return _parent.getRecursiveSuffix();
		}
		return "";
	}
	
	
	
}
