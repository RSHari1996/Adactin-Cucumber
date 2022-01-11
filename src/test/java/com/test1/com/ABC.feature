Feature: Test scope

Scenario: Login
Given precondition
When username
And password
Then click

Scenario: User search for the Hotels availability 
	Given User should logged in the application 
	When User select the Location 
	And User select the Hotel 
	And User select the Room type 
	And User select the Number of Rooms 
	And User enter the Checkin date 
	And User enter the Checkout date 
	And User select the Adults per Room 
	Then User click the Search button 
	
	
Scenario: User Select the searched hotel 
	Given User should have searched the hotel 
	When User select the hotel 
	Then User click the Continue button 
	
	
Scenario: User Booking the selected Hotel 
	Given User should have selected the Hotel 
	When User enter the First Name 
	And User enter the Last Name 
	And User enter the Billing Address 
	And User enter the Credit card number 
	And User select the Credit card type 
	And User select the Expiry Month 
	And User select the Expiry year 
	And User enter the CVV number 
	Then User click the Book Now button 