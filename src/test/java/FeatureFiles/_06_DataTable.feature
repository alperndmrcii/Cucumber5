Feature: DataTable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
@Regression
  Scenario: Create Country
    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | countries  |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | ismetUlk12312 |
      | codeInput | i3434         |

    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed

    And  User delete item from dialog content

      | ismetUlk12312 |

    Then Success message should be displayed
@Regression
  Scenario: Create Nationality

    And Click on the element in LeftNav
      | setup         |
      | parameters    |
      | nationalities |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | ismetUlk11551 |

    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete item from dialog content
      | ismetUlk11551 |

    Then Success message should be displayed

  Scenario: Fee Functionality
    Then Click on the element in LeftNav
      | setup      |
      | parameters |
      | Fees       |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput       | ismetFee11551 |
      | codeInput       | i343434       |
      | integrationCode | 121           |
      | priorityCode    | 121           |

    And Click on the element in Dialog
      | toggleBar  |
      | saveButton |
    Then Success message should be displayed

    And User delete item from dialog content
      | ismetFee11551 |
    Then Success message should be displayed



















