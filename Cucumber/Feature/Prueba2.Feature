#Author: your.email@your.domain.com
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given Ingresamos a la pagina Hoteles
    When Localizamos el Log in
    And Ingresamos los datos
      | Fields    | Value  |
      | name      | Javier |
      | Passwoord |   1234 |
      | name      | Leon   |
      | Passwoord |   1203 |
    Then Verificamos el log in