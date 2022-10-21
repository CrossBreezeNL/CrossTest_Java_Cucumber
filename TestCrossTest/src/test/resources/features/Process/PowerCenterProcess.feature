@PowerCenter
Feature: Test powercenter process
  I want to test if the powercenter process steps work

  Background: 
    Given the pwcSource table Customer is empty
    And the pwcTarget table Customer is empty
    When I insert the following data in pwcSource table Customer:
      | Customer_ID | Customer_Name | Country |
      |        1234 | Henk          | NL      |
      |         431 | Harry         | USA     |

	@Positive
  Scenario: Starting a powercenter workflow process
    When I run the demo process m_load_Customer
    And I retrieve the contents of the pwcTarget Customer table
    Then I expect the following result:
      | Customer_ID | Customer_Name | Country |
      |        1234 | Henk          | NL      |
      |         431 | Harry         | USA     |
      |        1234 | Henk          | NL      |
      |         431 | Harry         | USA     |

	@Positive
  Scenario: Starting a powercenter workflow process with parameters
    When I run the demoWithParameters process m_load_Customer
    And I retrieve the contents of the pwcTarget Customer table
    Then I expect the following result:
      | Customer_ID | Customer_Name    | Country |
      |        1234 | Henkfirstsecond  | NL      |
      |         431 | Harryfirstsecond | USA     |
      |        1234 | Henkfirstsecond  | NL      |
      |         431 | Harryfirstsecond | USA     |

	@Positive
  Scenario: Starting a powercenter task process
    When I run the demotask process wf_m_load_Customer.s_m_load_Customer
    And I retrieve the contents of the pwcTarget Customer table
    Then I expect the following result:
      | Customer_ID | Customer_Name | Country |
      |        1234 | Henk          | NL      |
      |         431 | Harry         | USA     |

	@Positive
  Scenario: Starting a powercenter task process in a worklet
    When I run the demotask process wf_m_load_Customer.wklt_loadCustomer.s_m_load_Customer1
    And I retrieve the contents of the pwcTarget Customer table
    Then I expect the following result:
      | Customer_ID | Customer_Name | Country |
      |        1234 | Henk          | NL      |
      |         431 | Harry         | USA     |

	@Positive
  Scenario: Starting a powercenter worklet
    When I run the demotask process wf_m_load_Customer.wklt_loadCustomer
    And I retrieve the contents of the pwcTarget Customer table
    Then I expect the following result:
      | Customer_ID | Customer_Name | Country |
      |        1234 | Henk          | NL      |
      |         431 | Harry         | USA     |

	@Positive
  Scenario: Starting a powercenter task process with parameters
    When I run the demotaskWithParameters process wf_m_load_Customer.s_m_load_Customer
    And I retrieve the contents of the pwcTarget Customer table
    Then I expect the following result:
      | Customer_ID | Customer_Name | Country |
      |        1234 | Henk12        | NL      |
      |         431 | Harry12       | USA     |

	@Positive
  Scenario: Starting a powercenter task process in a worklet with parameters
    When I run the demotaskWithParameters process wf_m_load_Customer.wklt_loadCustomer.s_m_load_Customer1
    And I retrieve the contents of the pwcTarget Customer table
    Then I expect the following result:
      | Customer_ID | Customer_Name | Country |
      |        1234 | Henk34        | NL      |
      |         431 | Harry34       | USA     |

	@Positive
  Scenario: Starting a powercenter worklet with parameters
    When I run the demotaskWithParameters process wf_m_load_Customer.wklt_loadCustomer
    And I retrieve the contents of the pwcTarget Customer table
    Then I expect the following result:
      | Customer_ID | Customer_Name | Country |
      |        1234 | Henk34        | NL      |
      |         431 | Harry34       | USA     |

	@Positive
  Scenario: Starting a powercenter task process with overridden parameters
    When I set parameter $$WFL_CustParam1 for process config demotaskWithParameters to 2
    And I run the demotaskWithParameters process wf_m_load_Customer.s_m_load_Customer
    And I retrieve the contents of the pwcTarget Customer table
    Then I expect the following result:
      | Customer_ID | Customer_Name | Country |
      |        1234 | Henk22        | NL      |
      |         431 | Harry22       | USA     |

	@Positive
  Scenario: Starting a powercenter task process with new parameters
    When I set parameter $$WFL_CustParam3 for process config demotaskWithParameters to 3
    And I run the demotaskWithParameters process wf_m_load_Customer.s_m_load_Customer
    And I retrieve the contents of the pwcTarget Customer table
    Then I expect the following result:
      | Customer_ID | Customer_Name | Country |
      |        1234 | Henk123       | NL      |
      |         431 | Harry123      | USA     |

	@Positive
  Scenario: Starting a powercenter task multiple times and add new parameters
    When I run the demotaskWithParameters process wf_m_load_Customer.s_m_load_Customer
    And I set parameter $$WFL_CustParam3 for process config demotaskWithParameters to 3
    And I run the demotaskWithParameters process wf_m_load_Customer.s_m_load_Customer
    And I retrieve the contents of the pwcTarget Customer table
    Then I expect the following result:
      | Customer_ID | Customer_Name | Country |
      |        1234 | Henk12        | NL      |
      |         431 | Harry12       | USA     |
      |        1234 | Henk123       | NL      |
      |         431 | Harry123      | USA     |

	@Positive
  Scenario: Starting a powercenter workflow and specify starttime for parameter
    When I execute the following query on source:
      """
      	SELECT CONCAT(CONVERT(VARCHAR, GetDate(), 101),' ', CONVERT(VARCHAR, GetDate(), 108)) as currentDT
      """
    And I store the contents of the field currentDT into variable CurrentDT
    When I set parameter $$wfl_starttime for process config demo to XTestVariables.CurrentDT
    And I run the demo process test_parameter
