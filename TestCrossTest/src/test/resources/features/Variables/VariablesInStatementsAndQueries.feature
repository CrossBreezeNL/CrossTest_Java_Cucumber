@Unit @Variables

Feature: Use variables in statements and queries

   Background:
      Given the source table CUST_HUB is empty
      And the source table CUST_SAT is empty
      And I insert the following data in source table CUST_HUB:
         | CUST_ID |
         | 1234    |
         | 431     |

      And I execute the following query on source:
         """
         SELECT TOP 1 CUST_ID FROM [Source].CUST_HUB ORDER BY CUST_ID
         """

      And I store the contents of the field Cust_ID into variable CustomerID

   @Positive
   Scenario: Test using variable in a statement

      When I execute the following query on source:
         """
         SELECT *
         FROM [SOURCE].CUST_HUB
         WHERE CUST_ID = XTestVariables.CustomerID
         """
      Then I expect the following result:
         | CUST_ID                   |
         | XTestVariables.CustomerID |

   @Positive
   Scenario: Define multiple variables with overlapping names

      When I execute the following query on source:
         """
         SELECT TOP 1 CUST_ID FROM [Source].CUST_HUB ORDER BY CUST_ID DESC
         """

      And I store the contents of the field Cust_ID into variable CustomerIDLowest

      And I execute the following query on source:
         """
         SELECT * FROM [Source].CUST_HUB WHERE CUST_ID IN (
         XTestVariables.CustomerID,
         XTestVariables.CustomerIDLowest
         )
         """

      Then I expect the following result:
         | CUST_ID                         |
         | XTestVariables.CustomerID       |
         | XTestVariables.CustomerIDLowest |
