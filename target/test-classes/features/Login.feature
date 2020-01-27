@login
Feature: Users should be able to login
  @driver @VYT-123
  Scenario: Login as a driver
    #each Scenario is like a test case
    Given the user is on the login page
    When the users enter the driver info
    Then the user should be able to login

    #hashtag is comment

  @sales_manager @VYT-123
  Scenario: Login as a Sales Manager
    Given the user is on the login page
    When the user enters the sales manager info
    Then the user should be able to login

    @store_manager @VYT-123
    Scenario: Login as a store manager
      Given the user is on the login page
      When the user enters the store manager info
      Then the user should be able to login