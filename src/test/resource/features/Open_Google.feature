Feature: Open Google

@SanityCheck1235
  Scenario: Launch browser and open Google homepage
    Given I open the "chrome" browser
    When I navigate to "https://www.google.com"
    Then I should see the Google homepage