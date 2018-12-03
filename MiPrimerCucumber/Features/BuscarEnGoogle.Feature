#Author: Javiier.leoon15@gmail.com 

@tag 
Feature: Buscar en Google
  Yo usar Google para buscar una cadena
## para comentar
  @tag1
  Scenario: Busqueda exitosa
    Given Que puedo abrir el navegador
    When Voy a Google
    And Realizo un busquedad
    Then Valido que el resultado sea el esperado 