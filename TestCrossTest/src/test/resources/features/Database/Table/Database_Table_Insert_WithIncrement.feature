@Database
Feature: Write to and retrieve from database tables using auto increment

  @Positive
  Scenario: Insert data in table
    Given the source table CUST_HUB is empty
    When I insert the following data in source table CUST_HUB:
      | CREATE_DD  |
      | 2019-11-01 |
      | 2020-01-01 |
    And I insert the following data in source table CUST_HUB:
      | CREATE_DD  |
      | 2021-01-01 |
      | 2022-01-01 |
    And I retrieve the contents of the source CUST_HUB table
    Then I expect the following result:
      | CUST_ID | CREATE_DD  |
      |       1 | 2019-11-01 |
      |       3 | 2020-01-01 |
      |       5 | 2021-01-01 |
      |       7 | 2022-01-01 |
