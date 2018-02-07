Feature: search google
  Scenario: direct search page
    Given Enter search term 'Cucumber'
    When Do search
    Then Results are shown for 'Cucumber'