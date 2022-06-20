Feature: DDT example with CloudTables


  Scenario: Adding one person
    Given user is on cloudTable home page
    When user clicks on new button
    And user enters "firstname" to firstname field
    And user enters "lastname" to lastname field
    And user enters "position" to position field
    And user enters "salary" to salary field
    Then user should be able to find person at the search box
