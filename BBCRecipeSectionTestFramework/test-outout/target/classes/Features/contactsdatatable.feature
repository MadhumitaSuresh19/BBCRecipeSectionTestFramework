Feature: Login Test Free CRM create contacts with data table

Scenario: Login test Create new contacts with data table

Given Open Chrome and launch the application
When user enter the username and password
|madhu06.suresh@gmail.com|London1!|
And user Click log in button
Then the User is on home page
Then the user moves to new contact page
Then user fills contact details
|Peter|Tom| Manager|
Then close the browser


