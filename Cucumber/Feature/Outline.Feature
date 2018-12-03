#Author: Javiier.leoon15@gmail.com
Feature: Ingresamos a Hoteles.com y realizamos un log in
  Yo quiero ingresar mi usuario y contraseña en Hoteles.com

  @tag2
  Scenario: Realizamos un Log in
    Given Ingresamos a la pagina Hoteles.com
    When Localizamos el Log in
    And Ingresamos los datos
      | Fields    | Value  |
      | name      | Javier |
      | Passwoord |   1234 |
    Then Verificamos el log in
