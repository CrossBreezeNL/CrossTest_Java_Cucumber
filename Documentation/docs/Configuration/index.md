# Configuration

CrossTest has several configuration options. The configuration below shows an example configuration that can be used.
The configuration should be stored in a file called XTestConfig.xml that is in the working directory of where Cucumber is running.
See the [schema file of the config](./CrossTestConfig.xsd)
The configuration can be [splitted in multiple files](./config_include.md)

```xml
<?xml version="1.0" encoding="UTF-8"?>
<XTestConfig debug="true">
	<CompositeObjects>
        <!-- Composite objects can be configured in the config or defined/modified via step sentences -->
		<CompositeObject name="Customer">
			<ContextTables>
				<ContextTable tableName="CUST_SAT" databaseConfigName="demo"/>						
			</ContextTables>
			<KeyTables>
				<KeyTable tableName="CUST_HUB" databaseConfigName="demo"/>
			</KeyTables>
		</CompositeObject>
	</CompositeObjects>
	<DatabaseConfigs>	
		<!-- the command timeout is in seconds and specifieds how long CrossTest waits for a command to finish. if not specified CrossTest uses the JDBC settings if any or waits indefinitely-->	
		<!-- if quoteObjectNames is set to true (default is no) alle table and column names are enclosed in double quotes, except for those in executing sql queries or statements, since these can be typed using quotes where desired-->
		<DatabaseConfig 
			name="demo" 
			databaseServerConfigName="test"		
			schema="dbo"
			template="demo"						
			commandTimeOut ="4"
			quoteObjectNames="true"/>	
	</DatabaseConfigs>
	<DatabaseServerConfigs>
        <!-- The JDBC driver used should be available on the class path and is loaded at runtime -->
		<!-- With the setSchemaTemplate attribute a template can be set for a SQL statement used to set the current schema or database. {SCHEMA} will be replaced by the schema attribute from the database config -->
		<DatabaseServerConfig 
			name="test" 
			JDBCUrl="jdbc:sqlserver://localhost:1436;databaseName=TestDB" 
			username="USERNAME" 
			password ="PASSWORD"
			setSchemaTemplate="DATABASE {SCHEMA};" />  		
	</DatabaseServerConfigs>
	<ObjectTemplates>
        <!-- Object template can be used to add prefix, suffix and default attributes to a database config -->		
        <!-- Object templates are hierarchical, a parent template can be defined on a template so the child template inherits all that is configured on the parent (and its ancestors) -->
		<ObjectTemplate name="demo">
			<Attributes>
				<Attribute name="CREATE_DD" value="2010-01-01" />
			</Attributes>
		</ObjectTemplate>
	</ObjectTemplates>
	<ProcessConfigs>
        <!-- The prefix is applied to the process name that is used in the step sentence -->
		<ProcessConfig name="demo" container="Demo" processServerConfigName="demo" prefix="wf_m_"/>
	</ProcessConfigs>
	<ProcessServerConfigs>
        <!-- The executionClass specifies the process executor, in this example our Informatica PowerCenter process executor -->
        <!-- The jar file containing the executor should be available on the classpath and is loaded at runtime -->
        <!-- The Properties collection is executor-specific, this example shows the properties needed for the PowerCenter executor -->
		<ProcessServerConfig 
			name="demo"             
			executionClass="com.xbreeze.xtest.process.informaticapowercenter.execution.InformaticaPowerCenterExecutor"
			serverUrl="http://10.1.0.5:7333/wsh/services/BatchServices/DataIntegration">
				<Properties>
					<Property name="UserName" value="USER" />
					<Property name="Password" value="PASSWORD" />
					<Property name="Domain" value="InfaDemo"/>
					<Property name="Repository" value="InfaDemo-RS"/>
					<Property name="IntegrationService" value = "InfaDemo_IS"/>
				</Properties>
			</ProcessServerConfig>
	</ProcessServerConfigs>
</XTestConfig>
```


