#Author: Nista Shrestha
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Verify login functionality

  @regression @smoke @login
  Scenario: Verify that user is succesfully logged in with successfull credential
    Given User opens browser
    And user navigated to Travel app url
    When user enters the useremail
    And user enters the password
    And clicks on submit button
    Then users should successfully log in
    And home page should be displayed



