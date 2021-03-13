Feature: login validation

Background:  
Given open browser
|chrome|
|firefox|
|ie|
And nevigate to url
@smoke
Scenario: as a user using valid credatial should be logged in


When user type userid in usertext box
And user type password in password box
And user click on login button
Then user should be in his profile page

@regression
Scenario Outline: as a user using invalid credatial should not be logged in

When user type <"userid"> in usertext box
And user type <"password"> in password box
And user click on login button
Then user should not be in his profile page

Examples:
|userid|password|
|user1|ds2334|
|user2|dsf3|


Scenario: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters Credentials to LogIn
	| Username   | Password |
    | testuser_1 | Test@153 |
	Then Message displayed Login Successfully