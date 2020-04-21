Feature: To test the login feature of Actitime

Background:
Given when the User Opens the Browser and load the Application

Scenario Outline: Testing the Login Feature with valid data

And the User Enters the Valid "<UserName>" and "<PassWord>"
And Clicks on Login Button
Then User Should go to HomePage

Examples:
|UserName|PassWord|
|admin|manager|
|trainee|trainee|