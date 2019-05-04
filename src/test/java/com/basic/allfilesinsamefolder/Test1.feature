Feature: Facebook login
As a facebook user, I want to enter username and password as 

Scenario: Validate facebook login Scenario1
Given the user is on facebook login page
When he enters "rajesh" as username
When he enteres "pwd" as password
Then check username is present in textbox
Then I am checking facebook login page