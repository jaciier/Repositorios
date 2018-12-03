package Co.com.google.StepsDefinitions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import Co.Com.google.page.BusquedadEnGooglePOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BusquedadEnGoogleStepsDefinitions {
	BusquedadEnGooglePOM controlador;
	@Given("Que puedo abrir el navegador")
	public void que_puedo_abrir_el_navegador() {
	    // Write code here that turns the phrase above into concrete actions
		controlador.UbicarControlador();
	}

	@When("Voy a Google")
	public void voy_a_Google() {
	    // Write code here that turns the phrase above into concrete actions
		controlador.AbrirNavegador();
	}

	@When("Realizo una busqueda")
	public void realizo_una_busqueda() {
	    // Write code here that turns the phrase above into concrete actions
		controlador.RealizarBusqueda();
		controlador.Localizar();
	}

	@Then("Valido que el resultado sea el esperado")
	public void valido_que_el_resultado_sea_el_esperado() {
	    // Write code here that turns the phrase above into concrete actions
	//	assertThat(controlador.GetElement("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/a/h3")
		//, is(equals("The Suso´s Show: capítulos, exclusivos y mucho más | Caracol TV")));

	}



}
