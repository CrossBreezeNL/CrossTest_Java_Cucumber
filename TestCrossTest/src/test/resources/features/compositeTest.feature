@Unit
Feature: Test composite object
  
  Scenario: Test data insertion in composite object
    Given the object Customer is empty
    When I insert the following data for object Customer:
      | CUST_ID | Cust_Name | CUST_DOB   |
      |    1234 | Mr. Smith | 1970-10-13 |
      |     431 | Ms. Jones | 1985-12-01 |
      
    And I retrieve the contents of the source CUST_HUB table
    Then I expect the following result:
      | CUST_ID | CREATE_DD |
      |    1234 |           |
      |     431 |           |
      
    And I retrieve the contents of the source CUST_SAT table
    Then I expect the following result:
      | CUST_ID | Cust_Name  |
      |    1234 | Mr. Smith  |
      |     431 | Ms. Jones |

  Scenario: Insert data in composite object
    Given the object Customer is empty
    When I insert the following data for object Customer:
      | Cust_ID | Cust_Name | Cust_Region | Cust_Rating |
      |    1234 | Mr. Smith | NL          |         6.6 |
      |     431 | Ms. Jones | USA         |         6.7 |

  Scenario: Define additional objects in composite object
    Given I have a context table named CUST_CLASS_SAT in source for object Customer
    And the object Customer is empty
    When I insert the following data for object Customer:
      | Cust_ID | Cust_Name | Cust_Region | Cust_Rating |
      |    1234 | Mr. Smith | NL          |         6.6 |
      |     431 | Ms. Jones | USA         |         6.7 |
      |     431 | Ms. Jones | USA         |         7.2 |
