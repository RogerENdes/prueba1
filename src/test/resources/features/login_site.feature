Feature: login test

  Scenario Outline: testing the successful login
    Given the user is on the demoblaze
    When attempts to log in
      | user   | pass   |
      | <user> | <pass> |
    Then validate the text on screen <message>
    Examples:
      | user  | pass     | message   |
      | rogerUser | 123456 | Welcome |
