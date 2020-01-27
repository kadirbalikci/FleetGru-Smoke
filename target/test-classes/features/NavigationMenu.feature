@navigate
Feature:Navigation Menu
  @vehicles @url
  Scenario: comparing vehicles url
    Given the user is on the login page
    And the user enters the sales manager info
    When go to Fleet -> Vehicles module
    Then compare vehicle urls

    @campaigns @url
    Scenario: comparing campaigns url
      Given the user is on the login page
      And the user enters the sales manager info
      When go to Marketing—> Campaigns module
      Then compare campaigns urls
  @calendar_events @url
  Scenario: comparing Calendar Events url
    Given the user is on the login page
    And  the user enters the sales manager info
    When go to Activities—> Calendar Events module
    Then compare calendar events urls

