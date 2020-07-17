Feature: Login to Test Environment

  Background: 
    Given User is on TEST Environment page

  @loginTest
  Scenario: Login to MyAccount
    When User click on MyAccount
    And User click on Login
    And User enters username 'sdet@tekschool.us' and Password 'sdet'
    And User click on Login button
    Then User Should be logged in to user Dashboard

  @multiple
  Scenario Outline: Login to My Account with multiple users
    When User click on MyAccount
    And User click on Login
    And User enters username 'sdet@tekschool.us' and Password '<password>'
    And User click on Login button
    Then User should be logged in to user Dashboard

    Examples: 
      | userName             | Password |
      | sdet@tekschool.us    | sdet     |
      | sdet@tekschool.us    | test     |
      | student@tekschool.us | sdet     |
      | sdet@tekschool.com   | Welcome1 |

  @logout
  Scenario: Log out from  MyAccount
    When User click on MyAccount
    And User click on Login
    And User enters username 'sdet@tekschool.us' and Password 'sdet'
    And User click on Login button
    Then User Should be logged in to user Dashboard
    When User click on MyAccount
    And User click on Logout
    Then User should be logged out

  @AccountRegistration
  Scenario: User Account Registration
    When User click on MyAccount
    And User click on Register
    Then User enter firstName 'Divid'
    And User enter lastName 'Jackson'
    Then User enter a valid email 'ad20395@email.com'
    And User enter valid phoneNumber '5712609435'
    And User enter the password 'zebra123'
    And User enter confirm password 'zebra123'
    And User Verify that No option is selected as default
    And User clicks on privacey policy check box
    And Click on Continue button
    And Verify the Congratulation message

  @Register
  Scenario: Register Account for new User
    Given User is on TEST Environment page
    When User click on MyAccount
    And User click on Register
    And User fills Register form with below information
      |firstName|LastName|E-mail|Telephone|password|
      | Rahim | Abid | Nasru3@test.us | 5725653422 |Afghanistan |
    And User select 'yes' for Subscribe
    And User click privacy and policy button
    And User click Continue button
    Then User should see message  'Your Account Has Been Created!'
