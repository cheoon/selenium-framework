Feature: Account Management

  Scenario Outline: create an account using valid email
    Given I am on create an account pages
    When I enter "<firstname>" "<lastname>" "<email>" "<password>" "<confirm password>"
    And  I click on create an accounts
    Then My account page is displaye


    Examples:
      | firstname | lastname | email                 | password | confirm password |
      | Larry     | Cooper   | larrycooper@yahoo.com | London1  | London1          |


