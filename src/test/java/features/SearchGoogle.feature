Feature: Google Search

  Background:
    Given Load Google website

  @Test1 @All
  Scenario: Simple Google search
    When Look up the word Lion
    Then Result is displayed Lion

  @Test2 @All
  Scenario: Simple Google search
    When Look up the word Dog
    Then Result is displayed Dog