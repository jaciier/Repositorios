#Author: your.email@your.domain.com

Feature: Buy Movie Ticket in Procinal
	As a web user
	I want to buy a movie ticket
	To watch the film
	
  Scenario: Buy a movie ticket
    Given that Ana selected a movie
    When she checks for a date
    And she clicks on the buy button
    Then she should see the purchase details