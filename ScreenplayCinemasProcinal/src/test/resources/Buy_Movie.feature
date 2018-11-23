#Author: your.email@your.domain.com

Feature: Buy Movie Ticket in Procinal
	As a web user
	I want to buy a movie ticket
	To watch the film
	Background: Ana navigate and enter in Cinema Procinla
	  Given Actor go to procinal
    When the actor enter city
    
		Given that the user wants to choose a new movie
    When the user manages to find the <movie> that he wants
    Then he should have found the <movie>
   
		
  Scenario: Buy a movie ticket
    Given that Ana selected a movie
    When she checks for a date
    And she clicks on the buy button
    Then she should see the purchase details