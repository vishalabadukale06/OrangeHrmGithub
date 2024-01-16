Feature: Orange Hrm Application

  Scenario: validate Login Page
    Given user is on login page
    When user enter valid email and password
    Then user is on home page and validate user url
