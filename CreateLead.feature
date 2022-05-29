@Createlead
Feature: LeafTaps Create Lead functionality

#Background:
#Given Open the new browser
#And Load the application URl

@functional @smoke
Scenario: Login with positive credential
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on login button
Then Homepage wil be displayed
When Click on CRMSFA link
Then MyHomepage wil be displayed

