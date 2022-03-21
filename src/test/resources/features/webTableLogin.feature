Feature: user should be able to login using correct credentials

  @wip
  Scenario: Positive login scenario
    Given user is on the login page of a web table app
    When user enters username "Test"
    When user enters password "Tester"
    And user clicks Login button
    Then user should see url contains orders

  Scenario: Positive login scenario
    Given user is on the login page of a web table app
    When user enters username "Test" password "Tester" and logins
    Then user should see url contains orders

    #1- implement this new step
    #2- create login method in WebTableLoginPage
    # this login method should have multiple different overloaded version