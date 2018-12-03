#Author: javiier.leoon15@gmail.com
@tag
Feature: Search of a hotel with some features
  He perform a search and select the one you like

  Background: 
    Given He clicks on start secion
    When He make login and complete the fields with the data user and passwoord
      | user                          | passwoord  |
      | fraanciisco.javiier@gmail.com | 990310cdof |
    Then He validate that the login is successful

  @tag1
  Scenario: Search
    Given He search a destinatio in the search engine
      | destination |
      | Santa Marta |
    When Select the date departure and return
      | departure  | returno    |
      | 10/12/2018 | 20/12/2018 |
    And Select Room with number of Adults and childen
      | room | adults | children |
      |    1 |      2 |        1 |
    And Select old children and search room
      | oldchildren |
      |           12 |
    Then search a room and select
      | hotel   |
      | <hotel> |
