# Process
This page describes the Process steps.

## Run templated process
Execute an (ETL) process using the engine configured in a CrossTest process server configuration


### Sentences
| Type          | Language         | Sentence      |
|:---           |:---              |:---           |
| When | en | ^I run the ([a-zA-Z0-9_@$#]+) process ([a-zA-Z0-9_@$#.]+)$ |


### Arguments
The details of every argument of the step are listed below.

| Parameter    | Datatype          | Description          |
|:---          |:---               |:---                  |
|process config | String | Name of the process config |
|process name | String | Name of the process |

### Examples


```gherkin
 When I run the demo process load_Customer
```

## Close process connections
Close all process connections

### Hooks
Below the hooks are given which are configured for this step. This means if you add the specified tag(s) on a scenario, the step will be executed automatically before or after (see Type) the scenario.

| Type          | Tag(s)         | Description      |
|:---           |:---              |:---           |
| After |  |  |






