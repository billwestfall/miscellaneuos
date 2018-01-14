Feature: Find the GameSparks Website

Scenario: Search for the website        
	Given I am on the Google homepage
	Then I will search for "GameSpark"
	Then I should see "GameSpark"
	Then I will click the about link
