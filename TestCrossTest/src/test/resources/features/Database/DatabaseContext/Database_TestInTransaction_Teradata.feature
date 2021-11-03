@Teradata
Feature: Running a test in a transaction in Teradata

	Scenario: Empty the source table
		Given the teradata table TransactionTest is empty
  
  Scenario: Insert and check data
    Given the test is being executed within a transaction
    When I insert the following data in teradata table TransactionTest:
      | SomeColumn  |
      |           A |
    When I retrieve the contents of the teradata TransactionTest table
    Then I expect the following result:
      | SomeColumn  |
      |           A |

  Scenario: Check there is no data from previous scenario
    When I retrieve the contents of the teradata TransactionTest table
    Then I expect the following result:
      | SomeColumn  |
