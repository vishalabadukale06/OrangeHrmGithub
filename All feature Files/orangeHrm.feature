Feature: Orange Hrm Application

  Scenario: validate Login Page
    Given user is on login page
    When user enter valid email and password
    Then user is on home page and validate user url

  Scenario: validate pim page
    When user click on pim page
    Then validate user is on pim page
