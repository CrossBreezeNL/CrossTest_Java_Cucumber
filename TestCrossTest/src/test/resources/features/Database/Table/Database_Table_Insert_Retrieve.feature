@Unit @Database

Feature: Write to and retrieve from database tables

  Scenario Outline: Insert data in table and check result <scenario>
    Given the source table CUST_HUB is empty
    When I insert the following data in source table CUST_HUB:
      | CUST_ID | CREATE_DD  |
      | 1234    | 2019-11-01 |
      | 431     |            |
    And I retrieve the contents of the source CUST_HUB table
    Then I expect the following result:
      | CUST_ID          | CREATE_DD  |
      | 1234             | 2019-11-01 |
      | <expectedOutput> |            |

    @Positive
    Examples:
      | scenario   | expectedOutput |
      | No error   | 431            |

    @Negative
    Examples:
      | scenario   | expectedOutput |
      | With error | 432            |

  @Positive
  Scenario: Insert only null
    Given the source table CUST_HUB is empty
    When I insert the following data in source table CUST_HUB:
      | CUST_ID | CREATE_DD |
      | 1234    |           |
    And I retrieve the contents of the source CUST_HUB table
    Then I expect the following result:
      | CUST_ID | CREATE_DD |
      | 1234    |           |

  @Positive
  Scenario: Apply date and null
    Given the source table CUST_HUB is empty
    When I insert the following data in source table CUST_HUB:
      | CUST_ID | CREATE_DD  |
      | 1234    | 2019-11-01 |
      | 431     |            |
    And I retrieve the contents of the source CUST_HUB table
    Then I expect the following result:
      | CUST_ID | CREATE_DD  |
      | 1234    | 2019-11-01 |
      | 431     |            |

  @Positive
  Scenario: Ignore unspecified column in output
    Given the source table CUST_HUB is empty
    When I insert the following data in source table CUST_HUB:
      | CUST_ID | CREATE_DD  |
      | 1234    | 2019-11-01 |
    And I retrieve the contents of the source CUST_HUB table
    Then I expect the following result:
      | CUST_ID |
      | 1234    |

  @Negative
  Scenario: Fail on invalid column
    Given the source table CUST_HUB is empty
    When I insert the following data in source table CUST_HUB:
      | CUST_ID | CREATE_DD  |
      | 1234    | 2019-11-01 |
    And I execute the following query on source:
      """
      SELECT * FROM Source.CUST_HUB
      """
    Then I expect the following result:
      | CUST_ID | CREATE_D   |
      | 1234    | 2019-11-01 |

  @Positive
  Scenario: get duplicate records
    Given the source table cUST_HUB is empty
    When I insert the following data in source table CUST_HUB:
      | CUST_ID | CREATE_DD  |
      | 1234    | 2019-11-01 |
      | 1234    | 2019-11-01 |
      | 1234    | 2019-11-01 |
      | 1235    | 2019-11-01 |
    And I retrieve the contents of the source CUST_HUB table
    Then I expect the following result:
      | CUST_ID | CREATE_DD  |
      | 1234    | 2019-11-01 |
      | 1234    | 2019-11-01 |
      | 1234    | 2019-11-01 |
      | 1235    | 2019-11-01 |

  @Positive
  # Note that for this scenario to succeed, when editing in Eclipse the Eclipse file encoding needs to be UTF-8
  # https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
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
    Examples:
      | Datatype | Value               |
      | BigInt   | 1234567891234512345 |
      | Boolean  | 1                   |
      | Varchar  | Some text           |
      | Char     | Not25Chars          |