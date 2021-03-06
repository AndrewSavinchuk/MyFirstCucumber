Feature: Google search functionality
  Agile story: AS a user, when I am on the Google search page
  I should be able to search whatever I want and see relevant information

  Scenario: Search page title verification
    Given user is on Google search page
    Then user should see title is Google

#  TC#1: Google Search Functionality Title Verification
#  1. User is on Google search page
#  2. User types apple in the google search box and clicks enter
#  3. User sees Steve Jobs is in the google title
#  Note: Follow POM


  Scenario: Search functionality result title verification
    Given user is on Google search page
    When user types apple and clicks enter
    Then user sees apple in the google title

  Scenario: Search functionality result title verification
    Given user is on Google search page
    When user types "big bang" and clicks enter
    Then user sees "big bang" in the google title


