package com.xbreeze.xtest.customdatatypes.teradata;

import java.sql.Date;
import java.sql.SQLException;
import java.sql.SQLInput;
import java.sql.SQLOutput;
import java.sql.Struct;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Map;

import com.xbreeze.xtest.database.helpers.CustomDataType;

public class TeraDataPeriodTimestampDataType implements CustomDataType {

	private String typeName;
	private Timestamp[] attributes;
	
	
	public TeraDataPeriodTimestampDataType() {
		this.typeName = "PERIOD(TIMESTAMP)";
		this.attributes = new Timestamp[2];
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
		attributes[0] = stream.readTimestamp();
		attributes[1]= stream.readTimestamp();
	}

	@Override
	public void writeSQL(SQLOutput stream) throws SQLException {
		stream.writeTimestamp(attributes[0]);		
		stream.writeTimestamp(attributes[1]);
		
		
	}
	
	@Override
	public void initalize(String[] attributes) {
		//Shoud have 2 attributes
		
		if (attributes.length> 0) {
			this.attributes[0] = getTimeStamp(attributes[0].trim());
		}
		if (attributes.length> 1) {
			this.attributes[1] = getTimeStamp(attributes[1].trim());
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
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
	
	private Timestamp getTimeStamp(String value) {
		Timestamp tsVal;
		try {
			// try to parse the field value as a timestamp
			tsVal = Timestamp.valueOf(value);
			
		}
		catch (IllegalArgumentException exc) {
			//If not parseable as timestamp, process as datetime.
			Date dateVal = Date.valueOf(value);
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String timeVal =df.format(dateVal);
			tsVal = Timestamp.valueOf(timeVal);	
		}
		return tsVal;
	}
}
