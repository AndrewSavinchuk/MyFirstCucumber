Feature: Wikipedia search functionality and verifications

  #WSF-45234
  Scenario: Wikipedia Search Functionality Title Verifications
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the wiki title
  #Note: Follow POM


 #WSF-45235
  Scenario: Wikipedia Search Functionality Header Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the main header
  #Note: Follow POM

  #WSF-45236
  @scenarioOutline
  Scenario Outline: Wikipedia Search Functionality Header Verification
    Given User is on Wikipedia home page
    When User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
    And User sees "<expectedTitle>" is in the wiki title
    Then User sees "<expectedMainHeader>" is in the main header

    Examples: search value we are going to be using is this scenario is as below
      | searchValue      | expectedTitle    | expectedMainHeader |

      | Steve Jobs       | Steve Jobs       | Steve Jobs         |
      | Chuck Norris     | Chuck Norris     | Chuck Norris       |
      | Bob Marley       | Bob Marley       | Bob Marley         |
      | Barbra Streisand | Barbra Streisand | Barbra Streisand   |




  #Note: Follow POM
