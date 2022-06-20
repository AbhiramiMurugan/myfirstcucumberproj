Feature: Login Action

@tag1
Scenario Outline: Login to WhiteBox Learning 

Given user is already on home Page
When title of home page 
Then user clicks on login button
Then user enters "<username>" and "<password>"
Then user is on login page
Then Close the browser

Examples:
	| username                |    password     |
	| abhi.murugan@gmail.com  | abhiramimurugan | 
	| abc@gmail.com           | abcd	          |