@Unit @Process @Debug
Feature: Invoke a custom process executor with a securable config property

  @Positive
  Scenario: Execute a process
    
    When I run the executordemo process dummyProcess
    