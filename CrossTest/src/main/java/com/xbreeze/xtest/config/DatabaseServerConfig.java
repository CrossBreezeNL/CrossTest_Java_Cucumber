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

import javax.xml.bind.annotation.XmlAttribute;

public class DatabaseServerConfig {
	private String _name;
	private String _JDBCUrl;
	private String _JDBCDriver;
	private String _username;
	private String _password;
	private String _setSchemaTemplate;
	
	public DatabaseServerConfig(String name, String JDBCUrl, String userName, String password, String JDBCDriver, String setSchemaTemplate) {
		this._name = name;
		this._JDBCUrl = JDBCUrl;
		this._username = userName;
		this._password = password;				
		this._JDBCDriver = JDBCDriver;
		this._setSchemaTemplate = setSchemaTemplate;
	}
	
	public DatabaseServerConfig() {
		super();
	}	
	
	@XmlAttribute(name="name")
	public String getName() {
		return this._name;
	}
	
	public void setName(String name) {
		this._name = name;
	}
	
	/**
	 * @return the _JDBCUrl
	 */
	@XmlAttribute(name="JDBCUrl")
	public String getJDBCUrl() {
		return _JDBCUrl;
	}
	/**
	 * @param JDBCUrl the _JDBCUrl to set
	 */
	public void setJDBCUrl(String JDBCUrl) {
		this._JDBCUrl = JDBCUrl;
	}
	
	/**
	 * @return the _JDBCUrl
	 */
	@XmlAttribute(name="JDBCDriver")
	public String getJDBCDriver() {
		return _JDBCDriver;
	}
	/**
	 * @param JDBCUrl the _JDBCUrl to set
	 */
	public void setJDBCDriver(String JDBCDriver) {
		this._JDBCDriver = JDBCDriver;
	}
	
	/**
	 * @return the _username
	 */
	@XmlAttribute(name="username")
	public String getUsername() {
		return _username;
	}
	/**
	 * @param username the _username to set
	 */
	public void setUsername(String username) {
		this._username = username;
	}
	/**
	 * @return the _password
	 */
	@XmlAttribute(name="password")
	public String getPassword() {
		return _password;
	}
	/**
	 * @param password the _password to set
	 */
	public void setPassword(String password) {
		this._password = password;
	}
	
	/**
	 * @return the _setSchemaTemplate
	 */
	@XmlAttribute(name="setSchemaTemplate")
	public String getSetSchemaTemplate() {
		return _setSchemaTemplate;
	}
	/**
	 * @param setSchemaTemplate the _setSchemaTemplate to set
	 */
	public void setSetSchemaTemplate(String setSchemaTemplate) {
		this._setSchemaTemplate = setSchemaTemplate;
	}
	
}
