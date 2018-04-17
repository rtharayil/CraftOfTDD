Feature: Refund item

  Scenario: Single variable template
    Given template "Hello, ${name}" 
    And the value "Reader" for variable "name"
    When Evaluated 
    Then results should be "Hello, Reader"

 Scenario: Multiple variable template
    Given template "${greeting}, ${name}" 
    And the value "Hi" for variable "greeting"
    And the value "Reader" for variable "name"
    When Evaluated 
    Then results should be "Hi, Reader"
    
  Scenario: Template  variable value missing
    Given template "Hello, ${name}" 
    And the value "null" for variable "name"
    When Evaluated 
    Then Error should be thrown    
    
  Scenario: Multiple variable template
    Given template "Hello, ${name}" 
    And the value "Hi" for variable "greeting"
    And the value "Reader" for variable "name"
    When Evaluated 
    Then results should be "Hello, Reader"