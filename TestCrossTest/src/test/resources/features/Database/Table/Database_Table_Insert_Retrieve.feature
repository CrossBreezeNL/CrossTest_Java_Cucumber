@Unit @Database
Feature: Write to and retrieve from database tables

  @Positive
  Scenario: Insert data in table
    Given the source table CUST_HUB is empty
    When I insert the following data in source table CUST_HUB:
      | CUST_ID | CREATE_DD  |
      |    1234 | 2019-11-01 |
    And I retrieve the contents of the source CUST_HUB table
    Then I expect the following result:
      | CUST_ID | CREATE_DD  |
      |    1234 | 2019-11-01 |

  @Positive
  Scenario: Insert and retrieve a null
    Given the source table CUST_HUB is empty
    When I insert the following data in source table CUST_HUB:
      | CUST_ID | CREATE_DD |
      |     431 |           |
    And I retrieve the contents of the source CUST_HUB table
    Then I expect the following result:
      | CUST_ID | CREATE_DD |
      |     431 |           |

  @Positive
  Scenario: Do select on empty table
    Given the source table CUST_HUB is empty
    When I retrieve the contents of the source CUST_HUB table
    Then I expect the following result:
      | CUST_ID | CREATE_DD |

  @Negative
  Scenario: Expect empty result but get a record back
    Given the source table CUST_HUB is empty
    When I insert the following data in source table CUST_HUB:
      | CUST_ID | CREATE_DD |
      |     431 |           |
    And I retrieve the contents of the source CUST_HUB table
    Then I expect the following result:
      | CUST_ID | CREATE_DD |

  # Note that for this scenario to succeed, when editing in Eclipse the Eclipse file encoding needs to be UTF-8
  # https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
  @Positive
  Scenario: Insert data into a table with strange characters
    Given the source table Table with strangé character$ is empty
    When I insert the following data in source table Table with strangé character$:
      | ID   | Fie#ld with \\Strange namë |
      | 1234 | Test value                 |
    And I retrieve the contents of the source Table with strangé character$ table
    Then I expect the following result:
      | ID   | Fie#ld with \\Strange namë |
      | 1234 | Test value                 |

  Scenario Outline: Test with <Datatype> field
    Given the source table DataTypeTest is empty
    When I insert the following data in source table DataTypeTest:
      | Test_<Datatype> |
      | <Value>         |
    And I retrieve the contents of the source DataTypeTest table
    Then I expect the following result:
      | Test_<Datatype> |
      | <Value>         |

    @Positive
    @Debug
    Examples: 
      | Datatype | Value                    |
      | BigInt   |      1234567891234512345 |
      | Boolean  |                        1 |
      | Varchar  | Some text                |
      | Char     | Not25Chars               |
      | Date     | 2019-11-01               |
      | Decimal  | 123456789012345678901.02 |

  @Negative
  Scenario: Char unexpected result comparison
    Given the source table DataTypeTest is empty
    When I insert the following data in source table DataTypeTest:
      | Test_Char |
      | Input     |
    And I retrieve the contents of the source DataTypeTest table
    Then I expect the following result:
      | Test_Char |
      | Output    |
