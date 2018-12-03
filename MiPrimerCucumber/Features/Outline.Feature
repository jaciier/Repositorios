#Author: javiier.leoon15@gmail.com

@tag
Feature: Ingresamos a Hoteles.com y realizamos un log in
 Yo quiero ingresar mi usuario y contraseña en Hoteles.com
  @tag1
  Scenario Outline: Realizamos un Log in
    Given Ingrese el usuario "<Name>"
    When Ingresamos <password>
    Then Verificamos el log in <status>
    
    Examples:
    	| name | value | status  |
    	| name1|      5| success |
    	| name2|	  7| Fail    |