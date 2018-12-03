#Author: javiier.leoon15@gmail.com
@tag
Feature: Search of a hotel with some features
  He perform a search and select the one you like

  @tag1
  Scenario: Search
    Given He search a hotel in the search engine
    When Select the <destination> <Check-in> <Check-out> <Room> <Adults> <children>
      | destination | Check-in   | Check-out  | Room | Adults | children |
      | Santa Marta | 29/11/2018 | 30/11/2018 |    1 |      2 |        2 |
    And Select <old children> and search room
      | old children |
      |           12 |
      |            9 |
    Then select a room
