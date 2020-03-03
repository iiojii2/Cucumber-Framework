Feature: List of All Order

@order @smoke
  Scenario: Test1
    Given the user navigate to web orders page
    When the user provide user name
    And the user provide valid password
    Then the user should see "List of All Orders"
