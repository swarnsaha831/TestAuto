Feature: Mouse Functionality

	Scenario: Successful Mouse Functionality
		Given User has mouse
		When User clicks mouse
		And User moves it
		Then User should be able to use the mouse