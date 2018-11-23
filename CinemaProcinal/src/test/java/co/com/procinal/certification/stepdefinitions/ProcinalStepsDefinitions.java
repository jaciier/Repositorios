package co.com.procinal.certification.stepdefinitions;


import org.openqa.selenium.WebDriver;

import co.com.procinal.certification.tasks.OpenTheBrowser;
import co.com.procinal.certification.tasks.click;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import co.com.procinal.certification.ui.procinalLandingPage;

public class ProcinalStepsDefinitions {
	@Managed(driver ="chrome")
	private WebDriver hisBrowser; // variable de clase correctamente instanciada
	private Actor pacho = new Actor ("Pacho");
	private procinalLandingPage page;
	@Before
	public void setUp() {
		pacho.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^Actor go to procinal$")
	public void actorGoToProcinal() throws Exception{
		pacho.wasAbleTo(OpenTheBrowser.on(page));
	}


	@When("^the actor enter city$")
	public void theActorEnterCity() {
	//	System.out.println(RequirementProcinal.the(ComponentsProcinal.Enter_City));
		pacho.wasAbleTo(click.on(page));
		}

	@When("^perform a search$")
	public void performASearch() throws Exception{
	//	pacho.wasAbleTo(SearchMovie.the());
	}

	@Then("^review your search$")
	public void reviewYourSearch() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	}


}
