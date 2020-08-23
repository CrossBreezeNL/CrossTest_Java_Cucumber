@Unit @Database @Debug
Feature: Apply prefix and suffix to table names

  Scenario Outline: Apply template name: <scenario>
    Given the <dbconfig> table <table> is empty
    When I insert the following data in <dbconfig> table <table>:
      | TextColumn |
      | <value>    |
    And I retrieve the contents of the <dbconfig> <table> table
    Then I expect the following result:
      | TextColumn |
      | <value>    |

    @Positive
    Examples: 
      | scenario                | dbconfig                       | table       | value            |
      | no prefix or suffix     | source                         | plain_table | plain            |
      | prefix                  | prefix_source                  | table       | prefix           |
      | suffix                  | suffix_source                  | table       | suffix           |
      | use parent prefix       | prefix_parent_source           | table       | prefix1          |
      | use parent suffix       | suffix_parent_source           | table       | suffix1          |
      | overwrite parent prefix | overwrite_prefix_parent_source | table       | overwrite prefix |
      | overwrite parent suffix | overwrite_suffix_parent_source | table       | overwrite suffix |
      | composed prefix         | composed_prefix_source         | table       | composed prefix  |
