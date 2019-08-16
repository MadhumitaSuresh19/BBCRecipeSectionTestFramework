Feature: Login Test Free CRM create contacts

Scenario Outline: Login test Create new contacts 

Given Open Chrome and launch the application
When Enter the "<username>" and "<password>"
And user Click log in button
Then the User is on home page
Then the user moves to new contact page
Then user enters "<firstname>" and "<lastname>" and "<position>"
Then close the browser

Examples:

|username|password|firstname|lastname|position|
| madhu06.suresh@gmail.com|London1!|Peter|Tom| Manager|
| madhu06.suresh@gmail.com| London1!|David|Harry|Director|
