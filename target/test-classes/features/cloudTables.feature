Feature: DDT example with CloudTables

  @wip
  Scenario: Adding one person
    Given user is on cloudTable home page
    When user clicks on new button
    And user enters "Chuck" to firstname field
    And user enters "Norris" to lastname field
    And user enters "unknown" to position field
    And user enters "20000" to salary field
    And user clicks on create button
    Then user should be able to find person at the search box

    #change this scenario into DDT format--> turn it into scenario outline