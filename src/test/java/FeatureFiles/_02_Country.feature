Feature: Country Functionality

  Scenario: Create Country
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Navigate to country page
    When Create a Country
    Then Success Message Should Be displayed


