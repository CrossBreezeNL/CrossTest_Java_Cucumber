@Unit @Database
Feature: Use different databases
  # Database objects used in this test:
#CREATE DATABASE [TestDB1]
# CONTAINMENT = NONE
# ON  PRIMARY 
#( NAME = N'TestDB1', FILENAME = N'E:\SQLData\MSSQL14.LOCALDEV2017\MSSQL\DATA\TestDB1.mdf' , SIZE = 8192KB , FILEGROWTH = 65536KB )
# LOG ON 
#( NAME = N'TestDB1_log', FILENAME = N'E:\SQLData\MSSQL14.LOCALDEV2017\MSSQL\DATA\TestDB1_log.ldf' , SIZE = 8192KB , FILEGROWTH = 65536KB )
#GO
#ALTER DATABASE [TestDB1] SET COMPATIBILITY_LEVEL = 140
#GO
#GO
#ALTER DATABASE [TestDB1] SET  READ_WRITE 
#GO
#ALTER DATABASE [TestDB1] SET  MULTI_USER 
#GO
#
#CREATE DATABASE [TestDB2]
# CONTAINMENT = NONE
# ON  PRIMARY 
#( NAME = N'TestDB2', FILENAME = N'E:\SQLData\MSSQL14.LOCALDEV2017\MSSQL\DATA\TestDB2.mdf' , SIZE = 8192KB , FILEGROWTH = 65536KB )
# LOG ON 
#( NAME = N'TestDB2_log', FILENAME = N'E:\SQLData\MSSQL14.LOCALDEV2017\MSSQL\DATA\TestDB2_log.ldf' , SIZE = 8192KB , FILEGROWTH = 65536KB )
#GO
#ALTER DATABASE [TestDB2] SET COMPATIBILITY_LEVEL = 140
#GO
#GO
#ALTER DATABASE [TestDB2] SET  READ_WRITE 
#GO
#ALTER DATABASE [TestDB2] SET  MULTI_USER 
#GO
  
# use testdb1;
# go
# create table test1
# 	(test1field varchar(100));
# 
# use testdb2;
# go
# 
# create table test2
# 	(test2field varchar(100));
# USE [TestDB1]
# GO
# CREATE USER [tester] FOR LOGIN [tester] WITH DEFAULT_SCHEMA=[dbo]
# GO
# 
# USE [TestDB2]
# GO
# CREATE USER [tester] FOR LOGIN [tester] WITH DEFAULT_SCHEMA=[dbo]
# GO

# USE [TestDB1]
# GO
# ALTER ROLE [db_owner] ADD MEMBER [tester]
# GO
# 
# USE [TestDB2]
# GO
# ALTER ROLE [db_owner] ADD MEMBER [tester]
# GO
  

  
  @Positive  
  Scenario: set db context from scenario
  	Given I execute the following statement on NoDB:
  	"""
  	Use testdb1
  	"""
    And the NoDB table test1 is empty
    And the NoDB table testdb2.dbo.test2 is empty
       
    When I insert the following data in NoDB table test1:
      | test1field |
      | hallo |
    
    And I insert the following data in NoDB table testdb2.dbo.test2:
      | test2field |
      | hallo2 |
    
      
    And I retrieve the contents of the NoDB test1 table
    Then I expect the following result:
      | test1field |
      | hallo |
      