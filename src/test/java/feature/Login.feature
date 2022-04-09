@F_LoginPage
Feature: This feature would be used to design the login page of the application

  Background: Open the application
    Given I have opened the application in the browser

  @Regression @Rapid
  Scenario: Validate the successful login
    When I click on the Login Link
    And I enter the username
    And I enter the password
    And I click on the Login Button
    Then I should land on the home page

  @Regression
  Scenario: Validate the successful login using test data
    When I click on the Login Link
    And I enter the username "abc@xyz.com"
    And I enter the password "Pqr@1234"
    And I click on the Login Button
    Then I should land on the home page

  @Ignore
  Scenario Outline: Validate the successful login using multiple test data
    When I click on the Login Link
    And I enter the username "<UserName>"
    And I enter the password "<Password>"
    And I click on the Login Button
    Then I should land on the home page

    Examples: 
      | UserName    | Password |
      | abc@xyz.com | Pqr@1234 |
      | sha@abc.com | Pqr@1234 |

  @Sanity
  Scenario: Validate the negative login using test data
    When I click on the Login Link
    And I enter the username "abc@xyz.com"
    And I enter the password "Pqr@1234"
    And I click on the Login Button
    Then I should get the message "The email or password you have entered is invalid."
