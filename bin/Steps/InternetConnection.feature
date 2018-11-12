Feature: Internet Connection and Location Activation Test

	Scenario: User opens Settings, then clicks connections then Checks internet Connection.
						If the internet is off, user turns on the internet. 
						If the location is off, user turns on the location and then 
						clicks home button.

		Given User is on Setting
		When User clicks Connections 
		Then if the internet is not connected, user turns on Wifi
		Then if the location is not on, user turns on Wifi
		Then User clicks Home button