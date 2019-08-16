Feature: Recipe Section
 		As a user
 	    I want to navigate to the recipe section
 	    
Background:
 	Given Open Chrome and launch the application
    And I am on the home page 
    And I hover over Recipe link
    When I click on Healthy dinner
 	And Healthy dinner page open
 	
    
#   Scenario: User clicks recipe link
#    Then click Spanish chicken stew text
#    And I land on Spanish chicken stew recipe page 
#    And Close browser
# 
#  Scenario: User clicks recipe image
#    Then click on Tandoori trout
#	And land on Tandoori trout recipe page 
#    And Close browser

	Scenario: broken link
	Then look for broken link
	And exit browser