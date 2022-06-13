Feature: Register
  Scenario: Successfully Register
    Given The user opens Facebook Login page
    And The user click on Create new Account
    When the user write First name "Heba"
    And the user write Last name "Ashraf"
    And the user write email address "hebaadadvasveeceacaassaa@gmail.com"
    And the user rewrite the email address "hebaadadvasveeceacaassaa@gmail.com"
    And the user write password "Heba@1234"
    And the user select day "27"
    And the user select month "Nov"
    And the user select year "1996"
    And the user select gender female
    And the user click signUpBTN
    Then the code page appears with "We need more information"