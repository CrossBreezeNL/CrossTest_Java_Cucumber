# Step documentation for ProcessConfig

## Set parameter value for process config
Overwrite a parameter value for a process config parameter, or add it as a new entry if it does not exist

### Sentences
| Type          | Language         | Sentence      |
|:---           |:---              |:---           |
| When | en | ^I set parameter {parameter name} for process config {process config name} to {parameter value}$ |

### Arguments
| Parameter    | Datatype          | Description          |
|:---          |:---               |:---                  |
|parameter name | String |  |
|process config name | String |  |
|parameter value | String |  |

### Examples


```gherkin
 When I set parameter $$WFL_CustParam1 for process config demo to test123
```
