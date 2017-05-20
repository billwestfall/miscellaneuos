Feature: Find the TripIt Website

Scenario: Search for the website        
	Given I am on the Google homepage
	Then I will search for "TripIt"
	Then I should see "TripIt - Travel Itinerary - Trip Planner"
	Then I will click the TripIt link
        Then I should see "About Us"
