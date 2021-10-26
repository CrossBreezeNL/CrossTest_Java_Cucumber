# Transaction support is not yet supported, so this test scenaro is not labeled unit
# @Unit
Feature: Running a test in a transaction
  
  Scenario: Empty the source table
		Given the source table Customer is empty  

  Scenario: Insert and rollback in transaction check nothing happened
    Given the test is being executed within a transaction
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

	@Debug
	# It looks like when we retrieve data a implicit commit is performed on the transaction, since the previous scenario works and the following one doesn't.
  Scenario: Insert, check and rollback in transaction check nothing happened
    Given the test is being executed within a transaction
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