# Query
This page describes the Query steps.

## Execute the following query on connection
Execute a SQL query on a database and fetch the result (if any) for comparison. Use this for queries that should return a result


### Sentences
| Type          | Language         | Sentence      |
|:---           |:---              |:---           |
| When | en | ^I execute the following query on ([a-zA-Z0-9_@$#-]+):$ |


### Arguments
The detals of every argument of the step is listed below.

| Parameter    | Datatype          | Description          |
|:---          |:---               |:---                  |
|database config | String | The database config used to execute the query |
|query text | String | The query to execute |

### Examples


```gherkin
 When I execute the following query on demo:
           """
           SELECT CUST_ID, CUST_NAME
           FROM CUST_HUB
           """
```

## Execute the following statement on connection
Execute a SQL statement on a database without fetching the result. Use this for updates, deletes, stored procedures without result set


### Sentences
| Type          | Language         | Sentence      |
|:---           |:---              |:---           |
| When | en | ^I execute the following statement on ([a-zA-Z0-9_@$#-]+):$ |


### Arguments
The detals of every argument of the step is listed below.

| Parameter    | Datatype          | Description          |
|:---          |:---               |:---                  |
|database config | String | The database config used to execute the query |
|query text | String | The statement to execute |

### Examples


```gherkin
 When I execute the following statement on demo:
           """
           UPDATE CUST_HUB
           SET CUST_ID = 4444
           WHERE CUST_ID = 432
           """
```


