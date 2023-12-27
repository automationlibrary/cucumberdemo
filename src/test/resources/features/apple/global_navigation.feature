Feature: Global Navigation Feature

  @global_navigation
  Scenario: Global Navigation functionality
    Given user navigates to "Home" page
    When user selects "Mac" from global navigation
    Then user should see "MacBook Air" product in top list
