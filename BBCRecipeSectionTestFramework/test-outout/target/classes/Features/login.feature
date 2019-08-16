#Feature: Logging into BBC Good Food
# 		As a user
# 	    I want to login into BBC Good Food
# 	    
#Background:
# 	Given Open Chrome and launch the application
#    And I am on the home page 
#    And I hoover over and click Sign in link 
#    When Sign in page is displayed
# 
#  Scenario: User enters valid username and password
#    Then I enter valid username and password
#	|MadhuSuresh|London1!|
#    And click Sign in
#    And I should be sucessfully logged in
#    And Close the browser
#    
#   Scenario: User enters invalid username and password
#    Then I enter invalid username and password
#	|msdf|London1!|
#    And Sign in
##    And I should see an error message Sorry, unrecognised username or password.
##    And a link Have you forgotten your password?
#    And I should land on Sign in page
#    And exit browser
# 
#  Scenario: User enters invalid password
#    Then I enter valid username and invalid password
#	|MadhuSuresh|London|
#    And click on Sign in
##    And I should see an error message Sorry, unrecognised username or password.
##    And a link Have you forgotten your password?
#    And land on Sign in page
#    And exit
# 
#  Scenario: User leaves username and password blank
#    Then I leave username and password blank
#		| | |
#    And I click Sign in
# # And I should see an error message Username or e-mail address field is required. Password field is required.
#    And I should not be signed in
#    And Close browser  
