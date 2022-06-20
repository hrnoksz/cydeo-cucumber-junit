Feature: Web table user order feature


  Scenario: User should be able to place order and order seen in web table
    Given user is already logged in and on order page
    When user selects product type "Familybea"
    And user enters quantity 2
    And user enters customer name "Sherlock Holmes"
    And user enters street "221B Baker Street"
    And user enters city "London"
    And user enters state "England"
    And user enters zipcode "50505"
    And user selects credit card type "american express"
    And user enters credit card number "1111222233334444"
    And user enters expiry date "12/23"
    And user enters process order button
    Then user should see "Sherlock Holmes" in first row of the web table

  @wip
  Scenario Template: User should be able to place order and order seen in web table
    Given user is already logged in and on order page
    When user selects product type "<productType>"
    And user enters quantity <quantity>
    And user enters customer name "<customerName>"
    And user enters street "<street>"
    And user enters city "<city>"
    And user enters state "<state>"
    And user enters zipcode "<zipcode>"
    And user selects credit card type "<cardType>"
    And user enters credit card number "<cardNumber>"
    And user enters expiry date "<expDate>"
    And user enters process order button
    Then user should see "<expectedName>" in first row of the web table

    Examples: Famous female scientists
      | productType | quantity | customerName       | street    | city   | state   | zipcode | cardType | cardNumber       | expDate | expectedName       |
      | MoneyCog    | 2        | Marie Curie        | London st | London | England | 50505   | Visa     | 1111222233334444 | 12/24   | Marie Curie        |
      | Familybea   | 3        | Rosalind Franklin  | London st | London | England | 50505   | Visa     | 1111222233334444 | 12/24   | Rosalind Franklin  |
      | Screenable  | 4        | Lise Meitner       | London st | London | England | 50505   | Visa     | 1111222233334444 | 12/24   | Lise Meitner       |
      | MoneyCog    | 5        | Chien-Shiung Wu    | London st | London | England | 50505   | Visa     | 1111222233334444 | 12/24   | Chien-Shiung Wu    |
      | MoneyCog    | 6        | Barbara McClintock | London st | London | England | 50505   | Visa     | 1111222233334444 | 12/24   | Barbara McClintock |







#TC #: Order place scenario
#1- Given user is already logged in to web table app
#2- When user is on the “Order” page
#3- Then user enters appropriate test data
#a. Product
#b. Quantity
#c. Customer name
#d. Street
#e. City
#f. State
#g. Zip
#h. Payment info:
#i. Card type: Visa/MasterCard/American Express
#ii. Card No
#iii. Expire date
#4- And user clicks to “Process Order”
#5- Then user should see new order in the table on “View all orders”
#page
#Note: Follow POM
##1- Parameterize scenario
##2- Scenario Outline after.