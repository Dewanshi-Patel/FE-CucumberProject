@LoginFeature
Feature: Background Change Functionality validation

  @Blue
  Scenario: 1 Sky Blue Background
    Given Set SkyBlue Background button exists
    When I click on the button
    Then the background color will change to sky blue

  @White
  Scenario: 2 White Background Change
    Given Set White Background button exists
    When I click on the button
    Then the background color will change to white
