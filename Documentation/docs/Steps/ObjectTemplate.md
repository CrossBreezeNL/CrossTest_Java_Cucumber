# Step documentation for ObjectTemplate

## Set attribute value  for object template
For the given scenario attribute, overwrite the default value set in the object template, or add it as new entry

### Sentences
| Type          | Language         | Sentence      |
|:---           |:---              |:---           |
| When | en | ^I set ([a-zA-Z0-9_@$#-]+) for attribute ([a-zA-Z0-9_@$#-]+) in template (value|seed|increment) to (.*)$ |

### Arguments
| Parameter    | Datatype          | Description          |
|:---          |:---               |:---                  |
|object template | String | The object template to add or overwrite the attribute definition to |
|attribute name | String | The attribute name to add or update on the object template |
|attribute property | String | The property of the attribute to set |
|property value | String | The value to set for the property |

### Examples
