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

public class CompositeObjectConfig {
	private String _name;
	private ArrayList<CompositeObjectTableConfig> _keyTables;
	private ArrayList<CompositeObjectTableConfig> _contextTables;
	
	public CompositeObjectConfig() {
		super();
		_keyTables = new ArrayList<>();
		_contextTables = new ArrayList<>();
	}
	
	@XmlAttribute(name="name")
	public String getName() {
		return this._name;
	}
	
	public void setName(String name) {
		this._name = name;
	}
	@XmlElement(name="KeyTable")
	@XmlElementWrapper(name="KeyTables")
	public ArrayList<CompositeObjectTableConfig> getKeyTables(){
		return this._keyTables;
	}
	
	public void setKeyTables(ArrayList<CompositeObjectTableConfig> keyTables) {
		this._keyTables = keyTables;
	}	

	@XmlElement(name="ContextTable")
	@XmlElementWrapper(name="ContextTables")
	public ArrayList<CompositeObjectTableConfig> getContextTables(){
		return this._contextTables;
	}
	
	public void setContextTables(ArrayList<CompositeObjectTableConfig> contextTables) {
		this._contextTables = contextTables;
	}	
	
	public void addKeyTable(String tableName, String databaseConfigName) {
		CompositeObjectTableConfig cotc = new CompositeObjectTableConfig(databaseConfigName, tableName);
		if (!this._keyTables.contains(cotc)) {
			this._keyTables.add(cotc);
		}
	}
	
	public void addContextTable(String tableName, String databaseConfigName) {
		CompositeObjectTableConfig cotc = new CompositeObjectTableConfig(databaseConfigName, tableName);
		if (!this._contextTables.contains(cotc)) {
			this._contextTables.add(cotc);
		}
	}
	
	
}
