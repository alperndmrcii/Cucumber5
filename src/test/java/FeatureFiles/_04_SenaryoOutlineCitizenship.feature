#Senaryo Citizenship sayfasına gidiniz
  #Create işlemini doğrulayınız
  #daha sonra aynı bilgilerle tekrar Create yapılamadığını doğrulayınız

  Feature: Citizenship Functionality
    Background: # Before Scenario
      Given Navigate to Campus
      When Enter username and password and click login button
      Then User should login succesfully
      And Navigate to Citizenship page

      Scenario Outline: Citizenship Create
        When Citizenship name as "<name>" short name as "<short>"
        Then Success Message Should Be displayed

        When Citizenship name as "<name>" short name as "<short>"
        Then Already exists message should be displayed
        Examples:
          | name | short |
          | alpull1| alperr1 |
          | alpull2| alperr2 |
          | alpull3| alperr3 |
          | alpull4| alperr4 |