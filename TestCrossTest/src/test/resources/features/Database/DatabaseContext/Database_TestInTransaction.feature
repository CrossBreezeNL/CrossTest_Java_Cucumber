@Unit @Database
Feature: Running a test in a transaction

	@Positive
  Scenario: Empty the source table.
  	Given the source table Customer is empty
  
  @Positive
  Scenario: Insert and rollback in transaction check nothing happened
  	Given the source table Customer is empty  
    And the test is being executed within a transaction
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

	@Positive
  Scenario: Insert, check and rollback in transaction configured on server
  	Given the transactional_source table Customer is empty
    When I insert the following data in transactional_source table Customer:
      | Customer_ID | Customer_Name | Country | IsActive |
      |           1 | Smith         | NL      |        1 |
    And I retrieve the contents of the transactional_source Customer table
    Then I expect the following result:
      | Customer_ID | Customer_Name | Country | IsActive |
      |           1 | Smith         | NL      |        1 |
    When I execute the following statement on transactional_source:
      """
      	ROLLBACK TRANSACTION;
      """
    When I retrieve the contents of the transactional_source Customer table
    Then I expect the following result:
      | Customer_ID | Customer_Name | Country | IsActive |
      
	@Positive @Transactional @Debug
  Scenario: Insert, check and rollback in transaction configured using hook
  	Given the source table Customer is empty
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