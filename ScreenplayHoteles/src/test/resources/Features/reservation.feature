#Author: javiier.leoon15@gmail.com
@tag
Feature: Room reservation
  He will reserve the room with the selected features

  Background: 
    Given He clicks on start secion
   When He make login and complete the fields with the data user and passwoord
      | user                      | passwoord |
      | javiier.leoon15@gmail.com | sophos1   |
    Then He validate that the login is successful
    
    Given He search a destinatio in the search engine
      | destination |
      | Santa Marta |
    When Select the date departure and return
     | departure  | return     |
      | 10/12/2018 | 20/12/2018 |
    And Select Room with number of Adults and childen
      | Room | Adults | children |
     |    1 |      2 |        1 |
    And Select old children and search room
      | old children |
     |           12 |
    Then search a room and select

  @tag1
  Scenario: Reservation
    Given He will reserve the selected room
    When fill out the reservation forms
      | name      | surname | email                   | phone     | name card | surname card | numbre card | code card | month | year |
      | francisco | leon    | javii.leoon15@gmail.com | 132123123 | francisco | leon         | 12312512312 |       123 |    12 |   22 |
    Then He will book the room
    And check that the cost is in Colombian peso
