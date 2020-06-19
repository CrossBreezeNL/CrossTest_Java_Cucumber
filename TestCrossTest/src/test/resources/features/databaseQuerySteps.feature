@Unit
Feature: Test database query steps

  Scenario: Test Query output
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

  Scenario: Only one column with NULL
    When I execute the following query on source:
      """
      	SELECT NULL AS FieldA
      """
    Then I expect the following result:
      | FieldA |
      |        |

  @Debug      
  Scenario: Compare on partial result of select
  When I execute the following query on source:
  """
  	SELECT 1 as firstField, 2 as secondField
  """
  Then I expect the following result:
  | firstField | 
  | 1 |
  
      