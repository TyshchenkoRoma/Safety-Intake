Feature: Mock-up pages

  Scenario: All required elements are present on the Home page
    Given user opened the login page
    When user entered login password and enter
    When user go to Home page via AppLauncher
    Then Source Document Status Review is present
    Then Source document list is present
    Then Chatter is present
    Then Recent Records is present