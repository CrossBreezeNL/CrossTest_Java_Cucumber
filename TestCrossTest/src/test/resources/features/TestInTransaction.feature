# Transaction support is not yet supported, so this test scenaro is not labeled unit
# @Unit
Feature: Running a test in a transaction

  Background: 

  Scenario: Start a transaction, Clear a table, insert sample data and check result  
    Given the test is being executed within a transaction
    And the source table CUST_HUB is empty
    
   # When I insert the following data in source table CUST_HUB:
   #   | CUST_ID | CREATE_DD  |
   #   |    4444 | 2019-11-01 |
   #   |     431 | 2018-01-01 |
    
    When I execute the following statement on source:
    """
    	INSERT INTO SOURCE.CUST_HUB(CUST_ID, CREATE_DD)
    		SELECT 4444, '2019-11-01'
    		UNION ALL
    		SELECT 431, '2018-01-01'
    """
      
    And I retrieve the contents of the source CUST_HUB table
    
    Then I expect the following result:
      | CUST_ID | CREATE_DD  |
      |    4444 | 2019-11-01 |
      |     431 | 2018-01-01 |
    