package Co.com.google.StepsDefinitions;

import Co.Com.google.page.BusquedadEnGooglePOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuscarAlgoStepsDefinitions {
	BusquedadEnGooglePOM controlador;
	@Given("Abrimos el navegador")
	public void abrimos_el_navegador() {
	    // Write code here that turns the phrase above into concrete actions
		controlador.UbicarControlador();
	}

	@When("Ingreso a Google")
	public void ingreso_a_Google() {
	    // Write code here that turns the phrase above into concrete actions
		controlador.AbrirNavegador();
	}

	@When("Busco errores de la realidad")
	public void busco_errores_de_la_realidad() {
	    // Write code here that turns the phrase above into concrete actions
		controlador.RealizarBusqueda("Errores de la realidad");
	}

	@Then("Valido que encuentra el video que quiero ver")
	public void valido_que_encuentra_el_video_que_quiero_ver() {
	    // Write code here that turns the phrase above into concrete actions
	}

}
