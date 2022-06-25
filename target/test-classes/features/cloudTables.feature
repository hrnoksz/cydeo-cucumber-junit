Feature: DDT example with CloudTables


  Scenario: Adding one person
    Given user is on cloudTable home page
    When user clicks on new button
    And user enters "Chuck" to firstname field
    And user enters "Norris" to lastname field
    And user enters "unknown" to position field
    And user enters "20000" to salary field
    And user clicks on create button
    Then user should be able to find person at the search box "positive"
    And user deletes the person created
    Then user should be able to find person at the search box "negative"

    #change this scenario into DDT format--> turn it into scenario outline


  Scenario Outline:
    Given user is on cloudTable home page
    When user clicks on new button
    When user enters "<firstName>" to firstname field
    And user enters "<lastName>" to lastname field
    And user enters "<position>" to position field
    And user enters "<salary>" to salary field
    And user clicks on create button
    Then user should be able to find person at the search box "positive"
    And user deletes the person created
    Then user should be able to find person at the search box "negative"
    Examples:
      | firstName | lastName   | position  | salary |
      | Marie     | Curie      | SDET      | 100000 |
      | Rosalind  | Franklin   | Developer | 150000 |
      | List      | Meitner    | QA        | 135000 |
      | Chien     | Wu         | SDET      | 125000 |
      | Barbara   | McClintock | QA        | 118000 |