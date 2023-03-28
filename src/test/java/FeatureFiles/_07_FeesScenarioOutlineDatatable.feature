Feature: Fees multiple values functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario Outline: Fee Functionality
    Then Click on the element in LeftNav
      | setup      |
      | parameters |
      | Fees       |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput       | <name> |
      | codeInput       | <code>       |
      | integrationCode | <intCode>           |
      | priorityCode    | <priority>           |

    And Click on the element in Dialog
      | toggleBar  |
      | saveButton |
    Then Success message should be displayed

    And User delete item from dialog content
      | <name> |
    Then Success message should be displayed
    Examples:
      | name  | code | intCode | priority |
      | alp35  | 3535 | payPal | 1863 |
      | alp36  | 3536 | cash | 1864 |
      | alp37  | 3537 | cheque | 1865 |
      | alp38  | 3538 | applePay | 1866 |
      | alp39  | 3539 | crypto | 1867 |