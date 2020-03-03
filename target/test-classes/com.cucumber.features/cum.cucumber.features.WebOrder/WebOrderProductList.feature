Feature: This is for Web Order all products Gherkin lenguage
  @smoke
  Scenario: Validation of all product data
    Given the user navigate to web orders page
    When the user provide user name
    And the user provide valid password
    Then the user click view all products button
    And the user validate product table