Feature: Google Search

  Scenario: Simple Google search
    Given Load Google website
    When Look up the word Lion
    Then Result is displayed Lion

