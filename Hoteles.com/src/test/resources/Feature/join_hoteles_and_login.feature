#Author: javiier.leoon15@gmail.com
@tag
Feature: Join Hoteles.Com and perform a Login
  He join Hoteles.com and perform an action

  @tag1
  Scenario: Login in Hoteles.com
    Given He clicks on start secion
    When He make a login with gmail
    And He complete the fields with the data <user> and <passwoord>
      | user                      | passwoord  |
      | javiier.leoon15@gmail.com | 990310cdof |
    Then He validate that the login is successful
