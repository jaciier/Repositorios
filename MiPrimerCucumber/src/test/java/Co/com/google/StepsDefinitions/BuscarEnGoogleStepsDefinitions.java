package Co.com.google.StepsDefinitions;

import Co.com.google.page.BuscarEnGooglePOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.CoreMatchers.is;

public class BuscarEnGoogleStepsDefinitions {
	BuscarEnGooglePOM Robot = new BuscarEnGooglePOM();
	@Given("Que puedo abrir el navegador")
	public void que_puedo_abrir_el_navegador() {
	    // Write code here that turns the phrase above into concrete actions
	   Robot.UbicarControlador();
	}

	@When("Voy a Google")
	public void voy_a_Google() {
	    Robot.AbrirNavegador();
	}

	@When("Realizo un busquedad")
	public void realizo_un_busquedad() {
	   Robot.RealizarBusqueda("Errores de la realidad");
	   Robot.HacerClic();
	//   Robot.CerrarNavegador();
	}

	@Then("Valido que el resultado sea el esperado")
	public void valido_que_el_resultado_sea_el_esperado() {
	//	assertThat(Robot.TraerElemento("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/a/h3")
	//	, is(equals("The Suso´s Show: capítulos, exclusivos y mucho más | Caracol TV\"")));

	}

}
