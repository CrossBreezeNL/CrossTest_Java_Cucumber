# ProcessConfig
This page describes the ProcessConfig steps.

## Set parameter value for process config
Overwrite a parameter value for a process config parameter, or add it as a new entry if it does not exist


### Sentences
| Type          | Language         | Sentence      |
|:---           |:---              |:---           |
| When | en | ^I set parameter ([a-zA-Z0-9_@$#-]+) for process config ([a-zA-Z0-9_@$#-]+) to (.*)$ |


### Arguments
The detals of every argument of the step is listed below.

| Parameter    | Datatype          | Description          |
|:---          |:---               |:---                  |
|parameter name | String |  |
|process config name | String |  |
|parameter value | String |  |

### Examples


```gherkin
 When I set parameter $$WFL_CustParam1 for process config demo to test123
```


