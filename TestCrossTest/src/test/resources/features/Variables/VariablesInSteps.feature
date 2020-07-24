@Unit @Variables

Feature: Use variables in steps

  Background: 
    Given the source table CUST_HUB is empty
    And the source table CUST_SAT is empty
    And I insert the following data in source table CUST_HUB:
      | CUST_ID |
      |    1234 |
      |     431 |
    And I execute the following query on source:
      """
      	SELECT TOP 1 CUST_ID FROM Source.CUST_HUB ORDER BY CUST_ID 
      """
    And I store the contents of the field Cust_ID into variable CustomerID

  @Positive
  Scenario: Test variable assignment
    When I retrieve the contents of the source CUST_HUB table
    Then I expect the following result:
      | CUST_ID                   |
      | XTestVariables.CustomerID |
      |                      1234 |

  @Positive
  Scenario: Write variable to table
    Given I insert the following data in source table CUST_SAT:
      | Cust_ID                   | Cust_Name |
      | XTestVariables.CustomerID | Mr. Smith |
    When I retrieve the contents of the source CUST_SAT table
    Then I expect the following result:
      | Cust_ID | Cust_Name |
      |    431  | Mr. Smith |
