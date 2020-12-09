# Tables
On this page the different tables which can be used in several tests are described.

## TestDataTable
This table is used to specify test data. For example to insert data into a table, or to specify the expected results. When using this table to insert data into a table, make sure that the column names are exactly equal to the target (case sensitive). Also only include the columns in the table you want to load. There is no need to include all columns.

### Example
An example of a testdata table.
```gherkin
| SomeColumn         | SomeOtherColumn         |
| SomeFirstRowValue  | SomeOtherFirstRowValue  |
| SomeSecondRowValue | SomeOtherSecondRowValue |
```