
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

