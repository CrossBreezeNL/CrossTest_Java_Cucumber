@Unit @Database
Feature: Execute a query or statement on a database

  @Positive
  Scenario: Test insert on composite object
    Given the object Customer is empty
    When I insert the following data for object Customer:
      | CUST_ID | Cust_Name | CUST_DOB   |
      |    1234 | Mr. Smith | 1970-10-13 |
      |     431 | Ms. Jones | 1985-12-01 |
    And I execute the following query on source:
      """
      SELECT CUST_ID, CREATE_DD
      FROM source.CUST_HUB
      """
    Then I expect the following result:
      | CUST_ID | CREATE_DD |
      |    1234 |           |
      |     431 |           |

  @Positive
  Scenario: Test query with update stament
    Given the source table CUST_HUB is empty
    When I insert the following data in source table CUST_HUB:
      | CUST_ID |
      |    1234 |
      |     431 |
    And I execute the following statement on source:
      """
      UPDATE source.CUST_HUB
      SET CUST_ID = 444
      WHERE CUST_ID = 431
      """
    And I retrieve the contents of the source CUST_HUB table
    Then I expect the following result:
      | CUST_ID |
      |    1234 |
      |     444 |

  @Positive
  Scenario: Only one column with NULL
    When I execute the following query on source:
      """
      SELECT NULL AS FieldA
      """
    Then I expect the following result:
      | FieldA |
      |        |

  @Positive
  Scenario: One column with no name
    When I execute the following query on source:
      """
      SELECT 'Test' 
      """
    Then I expect the following result:
      |      |
      | Test |

  @Positive
  Scenario: One column with whitespace as name
    When I execute the following query on source:
      """
      SELECT 'Test' AS ' '
      """
    Then I expect the following result:
      |      |
      | Test |

  @Positive
  Scenario: Compare on partial result of select
    When I execute the following query on source:
      """
      SELECT 1 as firstField, 2 as secondField
      """
    Then I expect the following result:
      | firstField |
      |          1 |

  @Positive
  Scenario: Compare on empty result of select
    When I execute the following query on source:
      """
      SELECT 1 as firstField
      WHERE 1 = 0
      
      """
    Then I expect the following result:
      | firstField |

  @Negative
  Scenario: Expect empty result but get data back
    When I execute the following query on source:
      """
      SELECT 1 as firstField      
      
      """
    Then I expect the following result:
      | firstField |

  @Negative
  Scenario: Test the command timeout
    When I execute the following query on timeout_source:
      """
      WAITFOR DELAY '00:00:05'
      SELECT *
      FROM [Source].[CUST_HUB]
      
      """

  @Positive
  Scenario: Insert and select data using a update statement
    Given the source table Table with strangé character$ is empty
    When I execute the following statement on source:
      """
      	INSERT INTO [Source].[Table with strangé character$]
      	SELECT 1, 'Test'
      """
    And I execute the following query on source:
      """
      	SELECT *
      	FROM [Source].[Table with strangé character$]
      """
    Then I expect the following result:
      | ID | Fie#ld with \\Strange namë |
      |  1 | Test                       |

  @Positive
  Scenario Outline: Operation on Float datatype on <DatabaseConnection>
    When I execute the following query on <DatabaseConnection>:
      """
        SELECT CAST (1 as FLOAT) + CAST(<INPUT> AS FLOAT) AS RESLT
      """
    Then I expect the following result:
      | RESLT    |
      | <OUTPUT> |

    Examples: 
      | DatabaseConnection | INPUT       | OUTPUT      |
      | teradata1          |       0.123 |       1.123 |
      | teradata1          |      0.1234 |      1.1234 |
      | teradata1          |     0.12345 |     1.12345 |
      | teradata1          |    0.123456 |    1.123456 |
      | teradata1          |   0.1234567 |   1.1234567 |
      | teradata1          |  0.12345678 |  1.12345678 |
      | teradata1          | 0.123456789 | 1.123456789 |
      | sqlserver          |       0.123 |       1.123 |
      | sqlserver          |      0.1234 |      1.1234 |
      | sqlserver          |     0.12345 |     1.12345 |
      | sqlserver          |    0.123456 |    1.123456 |
      | sqlserver          |   0.1234567 |   1.1234567 |
      | sqlserver          |  0.12345678 |  1.12345678 |
      | sqlserver          | 0.123456789 | 1.123456789 |

  @Positive
  Scenario Outline: Pass through Float datatype on <DatabaseConnection>
    When I execute the following query on <DatabaseConnection>:
      """
        SELECT CAST(<INPUT> AS FLOAT) AS RESLT
      """
    Then I expect the following result:
      | RESLT    |
      | <OUTPUT> |

    Examples: 
      | DatabaseConnection | INPUT       | OUTPUT      |
      | teradata1          |       0.123 |       0.123 |
      | teradata1          |      0.1234 |      0.1234 |
      | teradata1          |     0.12345 |     0.12345 |
      | teradata1          |    0.123456 |    0.123456 |
      | teradata1          |   0.1234567 |   0.1234567 |
      | teradata1          |  0.12345678 |  0.12345678 |
      | teradata1          | 0.123456789 | 0.123456789 |
      | sqlserver          |       0.123 |       0.123 |
      | sqlserver          |      0.1234 |      0.1234 |
      | sqlserver          |     0.12345 |     0.12345 |
      | sqlserver          |    0.123456 |    0.123456 |
      | sqlserver          |   0.1234567 |   0.1234567 |
      | sqlserver          |  0.12345678 |  0.12345678 |
      | sqlserver          | 0.123456789 | 0.123456789 |
