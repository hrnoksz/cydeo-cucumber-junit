Feature: Movie suggestion feature
  As a user I should be able to get movies according to my preference


  Scenario: Movie search
    Given I like "actions"
    And I like "drama"
    And I like "cartoon"
    And I like "adventure"
    When I go to homepage
    Then I should get right recommendation

  @wip
  Scenario: Movie search datatable list
    Given I like
      | actions   |
      | drama     |
      | cartoon   |
      | adventure |
    When I go to homepage
    Then I should get right recommendation