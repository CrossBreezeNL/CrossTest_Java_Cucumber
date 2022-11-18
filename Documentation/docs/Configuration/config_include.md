# Configuration includes
The configuration for CrossTest can be splitted in multiple files for example for reuse or for separation of environment specific and non specific parts. For this the XML feature XML Inclusions is used.
In order to use XML inclusion, the appropriate XML namespace, xmlns:xi="http://www.w3.org/2001/XInclude", needs to be declared in each XML file that includes another XML file. XML files that are included in a config file can also include other XML files, which enables nested includes of configuration elements. The path to the XML file being included can be absolute or relative to config file where the include is defined. To re-use only a portion of a config file, the include directive can be provided with an `xpointer` attribute containing the XPath expression for selecting the portion of the file to be included.

### Example config with include
As can be seen in this example, parts of the config can be stored in a separate file. In this case, the composite object declaration could be used in multiple config files.

#### Main config file (fragment)
``` xml
<?xml version="1.0" encoding="UTF-8"?>
<XTestConfig xmlns:xi="http://www.w3.org/2001/XInclude">
	<!-- Read composite objects from separate file -->
    <xi:include href="CompositeObjects.xml"/>
	<DatabaseConfigs>		
		<DatabaseConfig 
			name="demo" 
			databaseServerConfigName="test"		
			schema="dbo"
			template="demo"/>	
	</DatabaseConfigs>
	...
</XTestConfig>
```

### CompositeObjects.xml
``` xml
<?xml version="1.0" encoding="UTF-8"?>     
<CompositeObjects>
    <CompositeObject name="Customer">
        <ContextTables>
            <ContextTable tableName="CUST_SAT" databaseConfigName="demo"/>						
        </ContextTables>
        <KeyTables>
            <KeyTable tableName="CUST_HUB" databaseConfigName="demo"/>
        </KeyTables>
    </CompositeObject>
</CompositeObjects>
```

### Example include with xpointer
The example below illustrates the use of xpointer for referring to a certain selection within a referenced file. The `xpointer` directive in the config file below results in only the specific server config elements to be included from ServerConfig.xml

#### Main config file (fragment)
``` xml
<?xml version="1.0" encoding="UTF-8"?>
<XTestConfig xmlns:xi="http://www.w3.org/2001/XInclude">
	<DatabaseConfigs>		
		<DatabaseConfig 
			name="demo" 
			databaseServerConfigName="test"		
			schema="dbo"
			template="demo"/>	
	</DatabaseConfigs>
    <DatabaseServerConfigs>		
		<!--  Get the server configuration from a separate config file -->
		<xi:include href="ServerConfig.xml" xpointer="//DatabaseServerConfig"/>		
	</DatabaseServerConfigs>
    <ProcessServerConfigs>
		<!--  Get the server configuration from a separate config file -->
		<xi:include href="ServerConfig.xml" xpointer="//ProcessServerConfig"/>
	</ProcessServerConfigs>
	...
</XTestConfig>
```


#### ServerConfig.xml
``` xml
<?xml version="1.0" encoding="UTF-8"?>     
<ServerConfigs>
	<DatabaseServerConfigs>
		<DatabaseServerConfig 
				name="test" 
				JDBCUrl="jdbc:sqlserver://localhost:1436;databaseName=TestDB" 
				username="USER" 
				password ="PASSWORD" />
	</DatabaseServerConfigs>
	<ProcessServerConfigs>
		<ProcessServerConfig 
				name="demo" 
				executionClass="com.xbreeze.xtest.process.informaticapowercenter.execution.InformaticaPowerCenterExecutor"
				serverUrl="http://10.1.0.5:7333/wsh/services/BatchServices/DataIntegration">
				<Properties>
					<Property name="UserName" value="USER" />
					<Property name="Password" value="PASSWORD" />
					<!-- Optional parameter to specify the security domain used to log in -->
					<Property name="UserNameSpace" value="Native"/>
					<Property name="Domain" value="InfaDemo"/>
					<Property name="Repository" value="InfaDemo-RS"/>
					<Property name="IntegrationService" value = "InfaDemo_IS"/>
				</Properties>
		</ProcessServerConfig>
	</ProcessServerConfigs>
</ServerConfigs>
```