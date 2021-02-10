Feature: Test powercenter process
  I want to test if the powercenter process steps work

  Background:
    Given the pwcSource table Customer is empty
    And the pwcTarget table Customer is empty
    When I insert the following data in pwcSource table Customer:
      | Customer_ID | Customer_Name | Country |
      |        1234 | Henk          | NL      |
      |         431 | Harry         | USA     |


  Scenario: Starting a powercenter workflow process
    When I run the demo process load_Customer
    And I retrieve the contents of the pwcTarget Customer table
    Then I expect the following result:
      | Customer_ID | Customer_Name | Country |
      |        1234 | Henk          | NL      |
      |         431 | Harry         | USA     |
      |        1234 | Henk          | NL      |
      |         431 | Harry         | USA     |

  Scenario: Starting a powercenter task process
    When I run the demotask process wf_m_load_Customer.s_m_load_Customer
    And I retrieve the contents of the pwcTarget Customer table
    Then I expect the following result:
      | Customer_ID | Customer_Name | Country |
      |        1234 | Henk          | NL      |
      |         431 | Harry         | USA     |
      
  Scenario: Starting a powercenter task process in a worklet
    When I run the demotask process wf_m_load_Customer.wklt_loadCustomer.s_m_load_Customer1
    And I retrieve the contents of the pwcTarget Customer table
    Then I expect the following result:
      | Customer_ID | Customer_Name | Country |
      |        1234 | Henk          | NL      |
      |         431 | Harry         | USA     |     

