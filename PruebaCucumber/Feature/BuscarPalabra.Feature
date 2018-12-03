#Author: javiier.leoon15@gmail.com

@tag
Feature: Buscar errores de la realidad en youtube
 Yo quieo buscar en Google errores de la realidad
  @tag1
  Scenario: Encuentra varios errores
    Given Abrimos el navegador
    When Ingreso a Google
    And Busco "errores de la realidad captadas en video"
    Then Valido que encuentra el video que quiero ver
    
    