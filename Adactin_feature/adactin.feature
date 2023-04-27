Feature: It Is An Adactin Application.
Scenario: Login page
Given user Launch The Url
When user Enter The Username In The Text Box
And user Enter The Password In The Text Box
Then user Click The Login button and Navigate The Search Hotel 

Scenario: Search Hotel Page
When user Select The Location
And  user Select The Hotel
And  user Select The Room_Type
And  user Select The Room_Number
And  user Select The Adult_Room
And  user Select The Child_Room
Then  user Click The Submit button Navigate To The Select Hotel

Scenario: Select The Hotel Page
When user click the Radio button
Then  user click the Continue button and Navigate The Book A Hotel

Scenario: Book A Hotel Page
When user Enter The First Name In The Text Box
And  user Enter The Last Name In The Text Box
And  user Enter The Address In The Text Box
And  user Enter The CC_Number In The Text Box
And  user Select The Card Type
And  user Select The Expiry Month
And  user Select The Expiry Year
And  user Enter The CVV Number In The Text Box
And  user Click The Book Now button
Then user Click The Myitinerary button and Navigate Booked Itenerary

Scenario: Booked Itenerary Page
When user Takes The Screenshot


 


