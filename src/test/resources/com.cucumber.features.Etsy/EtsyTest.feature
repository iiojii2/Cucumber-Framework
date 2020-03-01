Feature: Etsy.com
  Background: It will navigate the page in every scenario
    Given the user navigate to Esty webPage

  Scenario: Test woodenSpoon
    Then the user search for "wooden spoon"
    And the user validate with "Wooden spoon | Etsy"


Scenario: test make up
  Then the user search for "makeup organizer"
  And the user validate with "Makeup organizer | Etsy"