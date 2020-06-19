@Unit
Feature: Test database steps with quoted identifiers

  # Note that for this scenario to succeed, when editing in Eclipse the Eclipse file encoding needs to be UTF-8
  # https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
  Background: 
    Given the source table Table with strangé character$ is empty

  Scenario: Insert data into a table
    When I insert the following data in source table Table with strangé character$:
      | ID   | Fie#ld with \\Strange namë |
      | 1234 | Test value                 |
    And I retrieve the contents of the source Table with strangé character$ table
    Then I expect the following result:
      | ID   | Fie#ld with \\Strange namë |
      | 1234 | Test value                 |

  Scenario: Insert and select data using a update statement
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
