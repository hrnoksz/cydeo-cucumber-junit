Feature: User should be able to login using correct credentials

  @wip
  Scenario: Positive login scenario
    Given user is on the login page of web table app
    When user enters username "Test"
    And user enters password "Tester"
    And user clicks to login button
    Then user should see url contains order









#TC #: Login scenario
#1- Open a chrome browser
#2- Go to: https://web-table-2.cydeo.com/login
#3- Enter username: Test
#4- Enter password: Tester
#5- Verify URL:
#Expected: URL should end with “orders”
#Note: Follow POM
#Try different ways of implementing this step:
#TC #: Login scenario using maps/ alternative practice
#Scenario: User should be able to see all 12 months in
#months
#dropdown
# Given User is on the login page of Web table app
# When User enters below credentials
# | username | Test |
# | password | Tester |
# Then User should see url contains orders