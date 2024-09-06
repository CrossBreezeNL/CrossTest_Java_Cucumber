# Introduction
This repo contains the libraries that form the Java/Cucumber version of CrossTest.
With CrossTest you can write test scenario's for data platform solutions using Gherkin.

For more information on how to use CrossTest see the [online documentation](http://x-test.nl)

# License
CrossTest is released as open source software under the [GPL v3](https://opensource.org/licenses/gpl-3.0.html) license. See the COPYING file in the project root for the full license text.

# Example
Below is a simple example of a test scenario where data is inserted into a table, then a ETL proces is run and finally the contents of a table is compared with an expected result.

```gherkin
Feature: A simple demo of CrossTest
  I want to create a simple test scenario using CrossTest


  Scenario: Simple scenario
   Given the source table Customer is empty
   And the target table Customer is empty
   
   When I insert the following data in source table Customer:
      | Customer_ID | Customer_Name | Country |
      |        1234 | Henk          | NL      |
      |         431 | Harry         | USA     |
   
   And I run the demo process load_Customer  
   
   And I retrieve the contents of the target Customer table
   Then I expect the following result:
      | Customer_ID | Customer_Name | Country |
      |        1234 | Henk          | NL      |
      |         431 | Harry         | USA     |
```
