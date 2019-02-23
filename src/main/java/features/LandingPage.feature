@landing
Feature: Landing Page Feature
Scenario: Landing Page Main Features Test
Given user is on Landing page
Then user clicks on Your Amazon
Then user clicks on Today's Deal
Then user clicks on Gift Cards
Then user clicks on Whole Foods
Then user clicks on Registry
Then user clicks on Sell
Then user clicks on Help


Scenario: Search Items Test
Given user is already on Landing page
When user clicks on serchbox
Then user enters iphone
Then user clicks on search button
Then user clicks the first item
Then user goes back to home Page


