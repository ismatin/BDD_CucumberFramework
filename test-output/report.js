$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:FeatureFiles/Account.feature");
formatter.feature({
  "name": "Account",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Create users account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Launches chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.user_Launches_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Opens an application as \"http://www.automationpractice.pl/index.php?\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.user_Opens_an_application_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Clicks on Sign In link",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.user_Clicks_on_Sign_In_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify user navigates to the \"CREATE AN ACCOUNT\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.verify_user_navigates_to_the_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters an email id as \"Test604@gmail.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.user_enters_an_email_id_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Create an Account button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_Create_an_Account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User fills all personal details",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.user_fills_all_personal_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on register link",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_register_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify confirmation message for successful registration as \"Your account has been created.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.verify_confirmation_message_for_successful_registration_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:FeatureFiles/Login.feature");
formatter.feature({
  "name": "Login Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify successful user login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Launches chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.user_Launches_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Opens an application as \"http://www.automationpractice.pl/index.php?\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.user_Opens_an_application_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Clicks on Sign In link",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.user_Clicks_on_Sign_In_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enters a valid email address \"Test99@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.user_Enters_a_valid_email_address(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters a valid password \"Test@123\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.user_enters_a_valid_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Sign In button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_Sign_In_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify profile name should be displayed as \"Matin shaikh\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.verify_profile_name_should_be_displayed_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});