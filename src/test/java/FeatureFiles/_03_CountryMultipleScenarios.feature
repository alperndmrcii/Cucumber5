Feature: Country Multi Scenario

  Background: # Before Scenario
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Navigate to country page


  Scenario: Create Country
    When Create a Country
    Then Success Message Should Be displayed

    Scenario: Create  Country 2
      When Create a Country name as "ismulk35543" code as "is122"
      Then Success Message Should Be displayed