#Author: javiier.leoon15@gmail.com

@tag
Feature: The actor enters Cinemas Procinal.
  Enter Procinal with your city and perform a search

  @tag1
  Scenario: Search Procinal and movie
    Given Actor go to procinal
    When the actor enter city
    Then review your search
