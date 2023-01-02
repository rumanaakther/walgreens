Feature: Registration
  @Test
  Scenario: Create a new account
    Given  I am at the walgreens homepage
    And I click on Account
    And I click on Register
   And I enter valid First Name
    And I enter valid Last Name
    And I enter valid Email Address
   And I enter valid Password
    And I click on I read and agree to the Walgreens terms of use
   When I click on continue button