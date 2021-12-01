# Context
This page describes the Context steps.

## Specify test transaction
Specify wether test steps should be executed within a transaction and rolled back afterwards

### Hooks
Below the hooks are given which are configured for this step. This means if you add the specified tag(s) on a scenario, the step will be executed automatically before or after (see Type) the scenario.

| Type          | Tag(s)         | Description      |
|:---           |:---              |:---           |
| Before | @Transactional | If the @Transactional tag is set on a scenario a transaction will automatically be started at the beginnng of the scenario. |

### Sentences
| Type          | Language         | Sentence      |
|:---           |:---              |:---           |
| Given | en | the test has been executed within a transaction |
| When | en | the test is being executed within a transaction |
| Given | nl | de test binnen een transactie wordt uitgevoerd |
| When | nl | de test binnen een transactie uitgevoerd wordt |



### Examples


```gherkin
 Given the test has been executed within a transaction
```


```gherkin
 When the test is being executed within a transaction
```


```gherkin
 Gegeven de test binnen een transactie wordt uitgevoerd
```


```gherkin
 Als de test binnen een transactie uitgevoerd wordt
```

## Close connections
This step closes all open database connection. If there are any open transactions these are also rolled back.

### Hooks
Below the hooks are given which are configured for this step. This means if you add the specified tag(s) on a scenario, the step will be executed automatically before or after (see Type) the scenario.

| Type          | Tag(s)         | Description      |
|:---           |:---              |:---           |
| After |  | After each scenario this hook is always executed (no matter the tags). |






