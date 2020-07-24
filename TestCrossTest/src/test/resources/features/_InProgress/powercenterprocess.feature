Feature: Test powercenter process
  I want to test if the powercenter process steps work


  Scenario: Starting a powercenter process
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
  
  	