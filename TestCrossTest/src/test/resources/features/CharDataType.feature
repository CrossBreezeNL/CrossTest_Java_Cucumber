@Unit
@Debug
Feature: Test the char datatype

  Scenario: Test with char data
    Given the source table Customer is empty
    When I insert the following data in source table Customer:
      | Customer_ID | Customer_class |
      |           1 | SMALL          |
