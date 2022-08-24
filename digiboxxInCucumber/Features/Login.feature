@sanity
Feature: Login and upload files
  I want to login and upload files in this feature

  Scenario: Login to reach homepage
    Given I press the skip button
    And I press the continue button
    When I input the email
    And I input the password
    And I input the digispace
    And I click the signin button
    Then verify that I have reached the homepage
 