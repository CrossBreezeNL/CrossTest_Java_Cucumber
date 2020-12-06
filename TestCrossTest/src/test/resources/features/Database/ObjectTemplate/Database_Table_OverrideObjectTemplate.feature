@Unit @Database
Feature: Override object template

  Background: 
    Given the source table CUST_HUB is empty

  Scenario Outline: Use the default object template and a override <scenario>
    When I insert the following data in source table CUST_HUB:
      | CREATE_DD  | CUST_ID |
      | 2019-01-01 |       1 |
      |            |       2 |
    And I insert the following data using template <template> in source table CUST_HUB:
      | CUST_ID |
      |       3 |
    And I retrieve the contents of the source CUST_HUB table
    Then I expect the following result:
      | CUST_ID | CREATE_DD     |
      |       1 | 2019-01-01    |
      |       2 |               |
      |       3 | <defaultDate> |

    Examples: 
      | scenario       | template             | defaultDate |
      | current period | source_currentperiod | 2020-01-01  |
      | next period    | source_nextperiod    | 2020-02-01  |

  Scenario: Set default value from config
    Given I set value for attribute CREATE_DD in template source_plain to 2020-03-01
    And I insert the following data in source table CUST_HUB:
      | CUST_ID |
      |       1 |
    And I retrieve the contents of the source CUST_HUB table
    Then I expect the following result:
      | CUST_ID | CREATE_DD  |
      |       1 | 2020-03-01 |

  Scenario: check that default value from previous scenario is no longer applied
    When I insert the following data in source table CUST_HUB:
      | CUST_ID |
      |       1 |
    And I retrieve the contents of the source CUST_HUB table
    Then I expect the following result:
      | CUST_ID | CREATE_DD |
      |       1 |           |

  Scenario: Set seed and increment from config
    Given I set seed for attribute CUST_ID in template source_currentperiod to 25
    And I set increment for attribute CUST_ID in template source_currentperiod to 3
    And I insert the following data using template source_currentperiod in source table CUST_HUB:
      | CREATE_DD  |
      | 2020-01-01 |
      | 2020-02-01 |
      | 2020-03-01 |
    And I retrieve the contents of the source CUST_HUB table
    Then I expect the following result:
      | CUST_ID | CREATE_DD  |
      |      25 | 2020-01-01 |
      |      28 | 2020-02-01 |
      |      31 | 2020-03-01 |

 
  Scenario: Use XTest variable to set seed
    Given I insert the following data in source table CUST_HUB:
      | CUST_ID | CREATE_DD  |
      |       1 | 2020-01-01 |
      |       2 | 2020-02-02 |
      |       3 | 2020-03-03 |
      
    And I execute the following query on source:
      """
      SELECT max(CUST_ID) + 1 as CUST_ID FROM [Source].CUST_HUB
      """
      
    And I store the contents of the field Cust_ID into variable newSeed
    
    And I set seed for attribute CUST_ID in template source_plain to XTestVariables.newSeed
    And I insert the following data in source table CUST_HUB:
      | CREATE_DD  |
      | 2020-04-04 |
      | 2020-05-05 |
    
     And I retrieve the contents of the source CUST_HUB table
    	Then I expect the following result:
      | CUST_ID | CREATE_DD  |
      |       1 | 2020-01-01 |
      |       2 | 2020-02-02 |
      |       3 | 2020-03-03 |
      |       4 | 2020-04-04 |
      |       6 | 2020-05-05 |
