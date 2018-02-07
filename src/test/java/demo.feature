Feature: search google
  Scenario: direct search page
    Given Enter search term
    When Do search
    Then Results are shown for