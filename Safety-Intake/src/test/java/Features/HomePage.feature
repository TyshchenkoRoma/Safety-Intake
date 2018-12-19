Feature: Home page mockup tests

  Scenario: All required elements are present on the Home page mockup
    Given user opened the safary browzer
    Given user opened the login page
    When user entered login and "password" and clicked "login" button
    Then Safety home page was opened
    Then browser was closed