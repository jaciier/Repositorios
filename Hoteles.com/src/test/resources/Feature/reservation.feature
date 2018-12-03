#Author: javiier.leoon15@gmail.com

@tag
Feature: Room reservation
  He will reserve the room with the selected features
	Background: 
	  Given He clicks on start secion
    When He make a login with gmail
    And He complete the fields with the data <user> and <passwoord>
      | user                      | passwoord  |
      | javiier.leoon15@gmail.com | 990310cdof |
    Then He validate that the login is successful
    
    Given He search a hotel in the search engine
    When Select the characteristics of the room and search
    Then select a room and 
    
  @tag1
  Scenario: Reservation
    Given He will reserve the selected room
    When fill out the reservation forms
    Then He will book the room
    And check that the cost is in Colombian peso
