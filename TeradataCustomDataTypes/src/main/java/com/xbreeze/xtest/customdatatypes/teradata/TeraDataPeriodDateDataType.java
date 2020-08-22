package com.xbreeze.xtest.customdatatypes.teradata;

import java.sql.Date;
import java.sql.SQLException;
import java.sql.SQLInput;
import java.sql.SQLOutput;
import java.sql.Struct;
import java.text.SimpleDateFormat;
import java.util.Map;

import com.xbreeze.xtest.database.helpers.CustomDataType;

public class TeraDataPeriodDateDataType implements CustomDataType {

	private String typeName;
	private Date[] attributes;
	
	
	public TeraDataPeriodDateDataType() {
		this.typeName = "PERIOD(DATE)";
		this.attributes = new Date[2];
	}
	
	@Override
	public Object[] getAttributes() throws SQLException {
		return this.attributes;
	}

	@Override
	public Object[] getAttributes(Map<String, Class<?>> map) throws SQLException {
		return this.attributes;
	}
	@Override
	public String getSQLTypeName() throws SQLException {
		return typeName;
	}

	@Override
	public void readSQL(SQLInput stream, String typeName) throws SQLException {
		attributes[0] = stream.readDate();
		attributes[1]= stream.readDate();
	}

	@Override
	public void writeSQL(SQLOutput stream) throws SQLException {
		stream.writeDate(attributes[0]);		
		stream.writeDate(attributes[1]);
		
		
	}
	
	@Override
	public void initalize(String[] attributes) {
		//Shoud have 2 attributes
		
		if (attributes.length> 0) {
			this.attributes[0] = Date.valueOf(attributes[0].trim());
		}
		if (attributes.length> 1) {
			this.attributes[1] = Date.valueOf(attributes[1].trim());
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String args = " ";
		for (int i = 0; i < attributes.length;i++) {
			String val = "";
			if (attributes[i] != null ) {
				val = df.format(attributes[i]);
			}
			args = args.trim().concat(String.format(",%s",val));
		}
		return String.format("%s{%s}", typeName, args.substring(1));
	}
	
}
