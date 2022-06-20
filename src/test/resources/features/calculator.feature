Feature: Calculator Tests

  Background:
    Given user is on calculator page

  Scenario: Test Adding
    When user clicks "5" on calculator
    And user clicks "+" on calculator
    And user clicks "5" on calculator
    Then result "10" should be displayed


  Scenario: Test Subtracting
    When user clicks "9" on calculator
    And user clicks "–" on calculator
    And user clicks "5" on calculator
    Then result "4" should be displayed


  Scenario Outline: Testing whole functionality
    When user clicks "<button1>" on calculator
    And user clicks "<operator>" on calculator
    And user clicks "<button2>" on calculator
    Then result "<result>" should be displayed

    Examples:
      | button1 | operator | button2 | result |
      | 5       | +        | 5       | 10     |
      | 3       | ×        | 6       | 18     |
      | 6       | /        | 2       | 3      |

