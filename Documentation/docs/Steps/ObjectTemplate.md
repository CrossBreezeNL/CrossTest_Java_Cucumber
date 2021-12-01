# ObjectTemplate
This page describes the ObjectTemplate steps.

## Set attribute value  for object template
For the given scenario attribute, overwrite the default value set in the object template, or add it as new entry


### Sentences
| Type          | Language         | Sentence      |
|:---           |:---              |:---           |
| When | en | ^I set (value|seed|increment) for attribute ([a-zA-Z0-9_@$#-]+) in template ([a-zA-Z0-9_@$#-]+) to (.*)$ |


### Arguments
The detals of every argument of the step is listed below.

| Parameter    | Datatype          | Description          |
|:---          |:---               |:---                  |
|attribute property | String | The property of the attribute to set |
|attribute name | String | The attribute name to add or update on the object template |
|object template | String | The object template to add or overwrite the attribute definition to |
|property value | String | The value to set for the property |

### Examples


```gherkin
 When I set value for attribute LOAD_DTS in template demo to 2020-01-01
 When I set seed for attribute CUST_ID in template demo to 2
 When I set increment for attribute CUST_ID in template demo to 1
```


