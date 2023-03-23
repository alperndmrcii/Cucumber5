#Senaryo Citizenship sayfasına gidiniz
  #Create işlemini doğrulayınız
  #daha sonra aynı bilgilerle tekrar Create yapılamadığını doğrulayınız

  Feature: Citizenship Functionality
    Background: # Before Scenario
      Given Navigate to Campus
      When Enter username and password and click login button
      Then User should login succesfully
      And Navigate to Citizenship page

      Scenario: Citizenship Create
        When Citizenship name as "AlpernCitizen112" short name as "AlpCT1"
        Then Success Message Should Be displayed

        When Citizenship name as "AlpernCitizen112" short name as "AlpCT1"
        Then Already exists message should be displayed