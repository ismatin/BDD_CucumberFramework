Feature: Login Functionality

@sanity
Scenario: Verify successful user login
Given User Launches chrome browser
When User Opens an application as "http://www.automationpractice.pl/index.php?" 
And User Clicks on Sign In link
And User Enters a valid email address "Test99@gmail.com"
And User enters a valid password "Test@123"
And User clicks on Sign In button
Then Verify profile name should be displayed as "Matin shaikh"
And Close the browser

 

