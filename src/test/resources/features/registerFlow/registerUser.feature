Feature: Register User
  Scenario: Successful user registration
    Given I navigate to url 'url'
    Then I verify that home page is visible successfully
    When I click on signUp button
    Then I verify New User Signup! is visible
    When I enter name "Lamiya" and email address "nenene@gmail.com" and click signup button
    And I fill in account details with Title "Mrs.", Password "password123", and Date of birth Day "25" Month "January" Year "2003"
    And I select the checkbox Sign up for our newsletter!
    And I select the checkbox Receive special offers from our partners!
    And I fill address details: First name "Lamiya", Last name "Gafarli", Company "Automation", Address "123 Main Street", Address2 "Apt 4B", Country "United States", State "New York", City "New York", Zipcode "10001", Mobile Number "1234567890"
    And I click Create Account button
    Then I verify that 'ACCOUNT CREATED!' is visible
    Then I click Continue button
