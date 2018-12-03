package co.com.google.stepsdefinitions;

import java.util.List;

import co.com.google.page.RealizarLoginPOM;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
public class LoginStepsDefinitions {
	RealizarLoginPOM controlador = new RealizarLoginPOM();
	
	@Given("Ingresamos a la pagina Hoteles")
	public void Ingresamos_a_la_pagina_Hoteles() {
		controlador.Controlador();
	}

	@When("Localizamos el Log in")
	public void Localizamos_el_Log_in() {
	    // Write code here that turns the phrase above into concrete actions
		controlador.AbrirPagina();
		controlador.RealizarBusquedadLogin();

	}
	
	@And("Ingresamos los datos")
	public void Ingresamos_los_datos(DataTable table) {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println(table);
	   String usuario;
	   List<List<String>> date = table.asLists(String.class);
	//   for(int i = 5; i<=5;i++) {
	   System.out.println(date.get(1));
	   System.out.println(date.get(2));
	  // if(i%2==1) {
	   usuario = date.get(1).toString();
	   controlador.IngresarDatoUsuario(usuario);
	   //}
	   usuario = date.get(2).toString();
	   controlador.IngresarDatoContraseña(usuario);
	   //}
	}
	
	@Then("Verificamos el log in")
	public void verificamos_el_log_in() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
}
