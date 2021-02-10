@Unit @Database
Feature: Use different databases
    
  @Positive  
  Scenario: set db context from scenario
  	Given I execute the following statement on NoDB:
  	"""
  	Use testdb1
  	"""
    And the NoDB table test1 is empty
    And the NoDB table testdb2.dbo.test2 is empty
       
    When I insert the following data in NoDB table test1:
      | test1field |
      | hallo |
    
    And I insert the following data in NoDB table testdb2.dbo.test2:
      | test2field |
      | hallo2 |
    
      
    And I retrieve the contents of the NoDB test1 table
    Then I expect the following result:
      | test1field |
      | hallo |
      