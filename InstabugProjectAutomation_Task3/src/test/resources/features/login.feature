Feature: Login
  Scenario: Successfully Login
    Given The user opens Facebook Login page
    And the user write login email address "eofuqhumac_1655068289@tfbnw.net"
    And the user write login password "Heba@12345"
    When the user click loginBTN
    Then the dashboard appears with "Mike Alhbbehgghhbe Romansen"

  Scenario: Error when login with wrong email (unregistered)
    Given The user opens Facebook Login page
    And the user write login email address "eofuqhumsdadad"
    And the user write login password "Heba@12345"
    When the user click loginBTN
    Then the error message appears with "The email address or mobile number you entered isn't connected to an account. Find your account and log in."

  Scenario: Error when login with wrong password
    Given The user opens Facebook Login page
    And the user write login email address "eofuqhumac_1655068289@tfbnw.net"
    And the user write login password "Heba@1234"
    When the user click loginBTN
    Then the error message appears with "The password that you've entered is incorrect. Forgotten password?"