@Unit @Database 
Feature: Running a test in a transaction
  
  @Positive
  Scenario: Insert and rollback in transaction check nothing happened
  	Given the source table Customer is empty  
    And the test is being executed within a transaction
    When I execute the following statement on source:
      """
      	BEGIN TRANSACTION;
      """
    When I insert the following data in source table Customer:
      | Customer_ID | Customer_Name | Country | IsActive |
      |           1 | Smith         | NL      |        1 |
    When I execute the following statement on source:
      """
      	ROLLBACK TRANSACTION;
      """
    When I retrieve the contents of the source Customer table
    Then I expect the following result:
      | Customer_ID | Customer_Name | Country | IsActive |

	@Positive
  Scenario: Insert, check and rollback in transaction check nothing happened
  	Given the source table Customer is empty  
    And the test is being executed within a transaction
    When I execute the following statement on source:
      """
      	BEGIN TRANSACTION;
      """
    When I insert the following data in source table Customer:
      | Customer_ID | Customer_Name | Country | IsActive |
      |           1 | Smith         | NL      |        1 |
    And I retrieve the contents of the source Customer table
    Then I expect the following result:
      | Customer_ID | Customer_Name | Country | IsActive |
      |           1 | Smith         | NL      |        1 |
    When I execute the following statement on source:
      """
      	ROLLBACK TRANSACTION;
      """
    When I retrieve the contents of the source Customer table
    Then I expect the following result:
      | Customer_ID | Customer_Name | Country | IsActive |
