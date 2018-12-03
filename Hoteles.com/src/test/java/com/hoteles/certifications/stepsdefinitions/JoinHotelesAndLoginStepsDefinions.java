package com.hoteles.certifications.stepsdefinitions;

import org.openqa.selenium.WebDriver;
import com.hoteles.certifications.tasks.OpenTheBrowser;
import com.hoteles.certifications.tasks.Select;
import com.hoteles.certifications.userinterfaces.HotelesPage;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class JoinHotelesAndLoginStepsDefinions {

	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	
	private HotelesPage page;
	
	private Actor pacho = Actor.named("pacho");
	
	@Before
	public void setUp() {
		pacho.can(BrowseTheWeb.with(hisBrowser));
	}
	@Given("^He clicks on start secion$")
	public void heClicksOnStartSecion() throws Exception {
		pacho.wasAbleTo(OpenTheBrowser.on(page));
		pacho.attemptsTo(Select.Button());
	//	pacho.attemptsTo(Select.Button(HotelesComponents.SIGN_IN));
	}


	@When("^He make a login with gmail$")
	public void heMakeALoginWithGmail()throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^He complete the fields with the data (.*) and (.*)$")
	public void heCompleteTheFieldsWithTheDataAnd(String arg1, String arg2, DataTable arg3) throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc).
	    // Field names for YourType must match the column names in 
	    // your feature file (except for spaces and capitalization).
	}

	@Then("^He validate that the login is successful$")
	public void heValidateThatTheLoginIsSuccessful() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	}


}
