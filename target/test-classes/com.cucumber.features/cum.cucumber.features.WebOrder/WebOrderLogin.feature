Feature: WebOrders Login functionality

  Background:
    Given the user navigate to web orders page

  @positive @smoke
 Scenario: WebOrders login positive Testing 1
   When the user provide user name
   And the user provide valid password
   Then the user should see home page

@negative
   Scenario: Web order Login negative Testing 1
     When the user provide username "Test"
     And the user provide password "admin"
     Then user validate text "Invalid Login or Password."

  @negative @smoke
  Scenario: Web order Login negative Testing 2
    When the user provide username 1234
    And the user provide password 4567
    Then user validate text "Invalid Login or Password."

  @negative
  Scenario: Web order Login negative Testing 3
    When the user provide username "Tester" and password "Test"
    Then user validate text "Invalid Login or Password."


