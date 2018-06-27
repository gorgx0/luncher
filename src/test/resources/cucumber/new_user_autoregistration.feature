Feature: Autoregistraion of a new user

  Scenario: new user is autoregistered
    Given a new user
    When user enters the luncher
    Then user is registered in the luncher
    And user can create a new group and join it
    And user can add a new restaurant
    And user can send an invitation for other users

  Scenario: invated new user is registered and added to the group
    Given a new user with invitation
    When user enters the luncher
    Then user joins the group the invate was issued for
    And user can add a new restaurant
    And user can send an invitation for other users
    And user can create a new group and join it