Feature: LeafTaps login functionality

#Background:
#Given Open the new browser
#And Load the application URl

@smoke @regression
Scenario Outline: Login with positive credential
Given Enter the username as <username>
And Enter the password as <password>
When Click on login button
Then Homepage wil be displayed

Examples:
|username|password|
|'demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

@functional @regression
Scenario: Login with negative credential
Given Enter the username as 'demosales'
And Enter the password as 'crmsfa'
When Click on login button
But Error message should be displayed
