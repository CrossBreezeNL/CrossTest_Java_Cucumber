1. Install Docker voor Windows https://www.docker.com/get-started (kies voor linux containers)
2. Install to needed images into your Docker:
	- Open PowerShell and execute the docker pull command for the required images listed below.

DBMS:

	Microsft SQL Server
	- https://hub.docker.com/_/microsoft-mssql-server
	 -> docker pull mcr.microsoft.com/mssql/server
	 -> Dit is SQL Server op Linux en daardoor alleen het DBMS. Als SSIS ook gewenst is, is hier een artikel over:
	 	-> https://andyleonard.blog/2019/04/ssis-docker-and-windows-containers-part-4-adding-an-ssis-catalog-attempt-2/.
	 	-> https://github.com/lizbaron/ssis-devops-with-azure-containers/tree/master/docker/mssqlssis
	 	-> https://cloud.pass.org/MeetingDetails.aspx?EventID=14137
	 	-> Bijbehorende YouTube van SqlPass: https://www.youtube.com/watch?v=88jRgKPE544&feature=youtu.be
		
	SAP HANA - Express Edition
	- https://hub.docker.com/_/sap-hana-express-edition
	 -> docker pull store/saplabs/hanaexpress:2.00.045.00.20200121.1
	
	MySQL
	- https://hub.docker.com/_/mysql
	 -> docker pull mysql
	
	Postgres
	- https://hub.docker.com/_/postgres
	 -> docker pull postgres
	
	Oracle
	- https://hub.docker.com/_/oracle-database-enterprise-edition
	 -> docker pull store/oracle/database-enterprise:12.2.0.1


DevOps:

	Maven:
	- https://hub.docker.com/_/maven
	 -> docker pull maven

	SonarQube:
	- https://hub.docker.com/_/sonarqube
	 -> docker pull sonarqube
