#Author: DanielJose
  #Language: en

Feature: User Registration
  As an admin I want to register new users to grant access to the application

  Scenario: Register a new user successfully
    Given I am on the users tab as an administrator
    When I select register new user and fill all the required data
    Then The new user should be created successfully