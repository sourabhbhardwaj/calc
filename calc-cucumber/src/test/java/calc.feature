Feature: Calculator

  Scenario: calculate add
    Given I have two numbers
    When I ask it to say add
    Then it should answer with addition 

  Scenario: calculate subtract
    Given I have two numbers
    When I ask it to say subtract
    Then it should answer with subtraction

  Scenario: calculate multiply
    Given I have two numbers
    When I ask it to say multiply
    Then it should answer with multiplication

  Scenario: calculate divide
    Given I have two numbers
    When I ask it to say divide
    Then it should answer with division
