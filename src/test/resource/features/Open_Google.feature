Feature: Open Google

@SanityCheck1235
  Scenario: Open a browser and navigate to Google
    Given I open the "chrome" browser
    When I navigate to "https://www.google.com"
    Then The page title should contain "Google"