Feature: Account

@regression
Scenario: Create users account

Given User Launches chrome browser
When User Opens an application as "http://www.automationpractice.pl/index.php?" 
And User Clicks on Sign In link

Then Verify user navigates to the "CREATE AN ACCOUNT" page
When User enters an email id as "Test604@gmail.com"
And User clicks on Create an Account button
And User fills all personal details
And User clicks on register link
Then Verify confirmation message for successful registration as "Your account has been created."
And Close the browser
