Feature: Home page

  Scenario: 01. Home page
    When Home page is opened
    Then About Wiggle is displayed
    And Account Link is displayed
    Given Home page is opened
    And Click on Arrow
#    When About Wiggle is displayed
#    Then Account Link is displayed