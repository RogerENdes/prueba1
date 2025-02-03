Feature: contact test

  Scenario Outline: testing the successful contact
    Given the user is on the demoblaze
    When attempts to contact in
      | email   | name  |message|
      | <email> | <name> |<message>|
    Then Validate text for contact entry <title>
    Examples:
      | email  | name     | message   |title|
      | roger@mail.com | roger | Hola a todos |Contact|