Feature: Registration functionality
  As a user, I should be able to create a new account and delete existing account

  Scenario: Create and delete account
    Given user is on the main page "AutomationExercise"
    Then page is loaded
    When user clicks singuplogin button
    Then "New User Signup!" is visible
    When user enters name and email address
    And user clicks signup button
    Then "ENTER ACCOUNT INFORMATION" is visible
    When user fills the signup forms
    And user clicks create account button
    Then "ACCOUNT CREATED!" is visible
    When user clicks continue button
    Then "Logged in as username" is visible
    When user clicks delete account button
    Then "ACCOUNT DELETED!" is visible
    When user clicks Continue button after account deleted
