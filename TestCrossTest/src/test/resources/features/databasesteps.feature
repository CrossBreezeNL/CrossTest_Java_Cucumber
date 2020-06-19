@Unit
Feature: Test database table steps
  Scenario Outline: Insert data in table and check result <scenario>
    Given the source table CUST_HUB is empty
    When I insert the following data in source table CUST_HUB:
      | CUST_ID | CREATE_DD  |
      |    1234 | 2019-11-01 |
      |     431 |            |
    And I retrieve the contents of the source CUST_HUB table
    Then I expect the following result:
      | CUST_ID          | CREATE_DD  |
      |             1234 | 2019-11-01 |
      | <expectedOutput> |            |

    Examples: 
      | scenario   | expectedOutput |
      | No error   |            431 |
      | With error |            432 |
 
  Scenario: Insert only null
    Given the source table CUST_HUB is empty
    When I insert the following data in source table CUST_HUB:
      | CUST_ID | CREATE_DD  |
      |    1234 | |
  
    And I retrieve the contents of the source CUST_HUB table
    Then I expect the following result:
      | CUST_ID | CREATE_DD  |
      |    1234 | |
  
  Scenario: Apply date and null
    Given the source table CUST_HUB is empty
    When I insert the following data in source table CUST_HUB:
      | CUST_ID | CREATE_DD  |
      |    1234 | 2019-11-01 |
      |     431 |            |
    And I retrieve the contents of the source CUST_HUB table
    Then I expect the following result:
      | CUST_ID | CREATE_DD  |
      |    1234 | 2019-11-01 |
      |     431 |            |

  Scenario: Ignore unspecified column in output
    Given the source table CUST_HUB is empty
    When I insert the following data in source table CUST_HUB:
      | CUST_ID | CREATE_DD  |
      |    1234 | 2019-11-01 |
      |     431 |            |
    And I retrieve the contents of the source CUST_HUB table
    Then I expect the following result:
      | CUST_ID |
      |    1234 |
      |     431 |


  Scenario: Fail on invalid column
    Given the source table CUST_HUB is empty
    When I insert the following data in source table CUST_HUB:
      | CUST_ID | CREATE_DD  |
      |    1234 | 2019-11-01 |
      |     431 |            |
    
    And I execute the following query on source:
    """
    	SELECT * FROM Source.CUST_HUB
    """
    
    Then I expect the following result:
      | CUST_ID | CREATE_D   |
      |    1234 | 2019-11-01 |
      |     431 |            |

  Scenario: get duplicate records
    Given the source table cUST_HUB is empty
    When I insert the following data in source table CUST_HUB:
      | CUST_ID | CREATE_DD  |
      |    1234 | 2019-11-01 |
      |    1234 | 2019-11-01 |
      |    1234 | 2019-11-01 |
      |    1235 | 2019-11-01 |
    And I retrieve the contents of the source CUST_HUB table
    Then I expect the following result:
      | CUST_ID | CREATE_DD  |
      |    1234 | 2019-11-01 |
      |    1234 | 2019-11-01 |
      |    1234 | 2019-11-01 |
      |    1235 | 2019-11-01 |

	Scenario: Bigint Customer ID
    Given the source table Customer is empty
    When I insert the following data in source table Customer:
      | Customer_ID 				|			 
      | 1234567891234512345 |
    And I retrieve the contents of the source Customer table
    Then I expect the following result:
      | Customer_ID 				|
      | 1234567891234512345 |    

  Scenario: boolean(bit) field
      Given the source table Customer is empty
    When I insert the following data in source table Customer:
      | Customer_ID| isActive |			 
      | 123 | 1 |
    And I retrieve the contents of the source Customer table
    Then I expect the following result:
      | Customer_ID | isactive | 
      | 123 |  1 |