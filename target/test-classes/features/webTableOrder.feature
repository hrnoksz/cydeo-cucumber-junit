Feature: Web table user order feature

  @wip
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