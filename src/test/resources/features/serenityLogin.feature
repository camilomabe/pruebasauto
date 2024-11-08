Feature: login test

  Scenario Outline: testing the successful login
    Given Camilo is on the demo page
    When attempts to log in
      | user   | pass   |
      | <user> | <pass> |
    Then validates the text on screen <message>
    Examples:
      | user    | pass     | message            |
      | usuario | password | Formulario de pago |



