
@AccountManagement
Feature: Account Management

  @CreateAccount
  Scenario Outline: Create an account using valid email address
    Given I am on create an account page
    When I enter "<firstname>" "<lastname>" "<email>" "<password>" "<confirmpassword>"
    And I click on create an account
    Then My account page is display


    Examples:
      | firstname | lastname | email                 | password | confirmpassword |
      | Danny     | Brown    | dannybrown2@gmail.com | London@1 | London@1        |


  @Login
  Scenario Outline: Login into an account using valid email address
    Given I am on login page
    When I enter my "<email>" and "<password>"
    And I click on sign in
    Then My account page is display


    Examples:
      | email                 | password |
      | dannybrown2@gmail.com | London@1 |


  @DuplicateAccount
  Scenario Outline: Create an Account - Duplicate account creation not allowed
    Given I am on create an account page
    When I enter "<firstname>" "<lastname>" "<email>" "<password>" "<confirmpassword>"
    And I click on create an account
    Then Error message should be displayed that account already exist


    Examples:
      | firstname | lastname | email                 | password | confirmpassword |
      | Danny     | Brown    | dannybrown2@gmail.com | London@1 | London@1        |

  @UnregisteredLogin
  Scenario Outline: Account Login - Unregistered customer should see an error message on the page
    Given I am on login page
    When I enter my "<email>" and "<password>"
    And I click on sign in
    Then An error message should displayed on page


    Examples:
      | email                 | password |
      | dannybrown2@gmail.com | London@1 |