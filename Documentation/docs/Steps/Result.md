# Step documentation for Result

## Compare expected and actual result
Compare expected and actual result

### Sentences
| Type          | Language         | Sentence      |
|:---           |:---              |:---           |
| Then | en | I expect the following results: |
| Then | nl | verwacht ik het volgende resultaat: |
| Then | en | I expect the following result: |

### Arguments
| Parameter    | Datatype          | Description          |
|:---          |:---               |:---                  |
|expected results | DataTable | The table with the expected results. See [TestDataTable](../Tables#testdatatable). |

### Examples


```gherkin
 Then I expect the following results:
  | Id | Description    |
  | 1  | 'FirstRow'       |
  | 2  | 'SecondRow' |
```


```gherkin
 Dan verwacht ik het volgende resultaat:         
  | Id | Description    |
  | 1  | 'FirstRow'       |
  | 2  | 'SecondRow' |
```


```gherkin
 Then I expect the following result:
  | Id | Description    |
  | 1  | 'FirstRow'       |
  | 2  | 'SecondRow' |
```
## Store contents of field in variable
Fetch the value of a column in the result and store it in a variable. The result should only contain one record. Variables can be used in data tables using the name prefixed with XTestVariabes.

### Sentences
| Type          | Language         | Sentence      |
|:---           |:---              |:---           |
| Given | en | ^I store the contents of the field (.+) into variable ([a-zA-Z0-9_@$#]+)$ |

### Arguments
| Parameter    | Datatype          | Description          |
|:---          |:---               |:---                  |
|field name | String | Name of the field that holds the value to store |
|variable name | String | Name of the variable used to store the value |

### Examples


```gherkin
 Given I execute the following query on source:
    """
     SELECT TOP 1 CUST_ID FROM CUST_HUB ORDER BY CUST_ID 
    """ 
   And I store the contents of the field Cust_ID into variable CustomerID
   And I insert the following data in demo table CUST_SAT:
  | Id                         | Description |
  | XTestVariables.CustomerID  | &apos;FirstRow&apos;  |
```
