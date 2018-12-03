#Author: javiier.leoon15@gmail.com
@tag
Feature: Buscar en Google
Yo quiero usar Google para buscar una cadena

  @tag1
  Scenario: Busquedad exitosa
    Given Que puedo abrir el navegador
    When Voy a Google
    And Realizo una busqueda
    Then Valido que el resultado sea el esperado
 
  