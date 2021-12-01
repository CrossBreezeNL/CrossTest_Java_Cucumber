@Unit @Database
Feature: Running a test in a transaction

  @Positive
  Scenario: Empty the source table.
    Given the source table Customer is empty

  @Positive
  Scenario: Insert and rollback in transaction check nothing happened
    Given the test is being executed within a transaction
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
    Given the test is being executed within a transaction
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

  @Positive @Transactional
  Scenario: Insert, check and rollback in transaction configured using hook
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

  @Positive @Transactional
  Scenario: Insert, check and rollback in transaction cross database
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
    When I retrieve the contents of the other vw_Customer view
    Then I expect the following result:
      | Customer_ID | Customer_Name | Country | IsActive |

  @Positive @Transactional
  Scenario: Insert, check and rollback in transaction cross database
    When I insert the following data in source table Customer:
      | Customer_ID | Customer_Name | Country | IsActive |
      |           1 | Smith         | NL      |        1 |
    And I retrieve the contents of the source Customer table
    Then I expect the following result:
      | Customer_ID | Customer_Name | Country | IsActive |
      |           1 | Smith         | NL      |        1 |
      
  @Positive
  # When running in parallel the tests within one feature should be run sequential.
  # So this means when this feature file is the only one to use transactions, there can be nog active transactions during the following scenario.
  Scenario: Check no active transactions
    When I execute the following query on source:
      """
      	SELECT * FROM sys.sysprocesses WHERE open_tran = 1;
      """
    Then I expect the following result:
      | spid | open_tran | status |
