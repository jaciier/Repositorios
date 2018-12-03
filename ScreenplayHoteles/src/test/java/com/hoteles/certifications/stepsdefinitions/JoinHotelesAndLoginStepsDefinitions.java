package com.hoteles.certifications.stepsdefinitions;
import java.util.List;

import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static com.hoteles.certifications.exceptions.UnableLogin.getUnableLoginMessage;


import com.hoteles.certifications.exceptions.UnableLogin;
import com.hoteles.certifications.model.LoginModel;
import com.hoteles.certifications.questions.LoginResult;
import com.hoteles.certifications.tasks.ChangeTab;
import com.hoteles.certifications.tasks.FillFields;
import com.hoteles.certifications.tasks.OpenTheBrowser;
import com.hoteles.certifications.tasks.Select;
import com.hoteles.certifications.userinterfaces.HotelesPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
public class JoinHotelesAndLoginStepsDefinitions {
	
	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	
	private HotelesPage page;
	
	private Actor pacho = Actor.named("pacho");
	@Before
	public void setUp() {
		pacho.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^He clicks on start secion$")
	public void heClicksOnStartSecion()  {
		pacho.wasAbleTo(OpenTheBrowser.on(page));
		pacho.attemptsTo(Select.Button());
		pacho.attemptsTo(ChangeTab.Change());
		}

/*	@When("^He make login and complete the fields with the data user and passwoord $")
	public void heMakeLoginAndCompleteTheFieldsWithTheDataUserAndPasswoord(List<LoginModel> data) {
		pacho.attemptsTo(FillFields.enter(data.get(0)));
	}*/
	@When("^He make login and complete the fields with the data user and passwoord$")
	public void heMakeLoginAndCompleteTheFieldsWithTheDataUserAndPasswoord(List<LoginModel> data) {
		pacho.attemptsTo(FillFields.enter(data.get(0)));

	}


	@Then("^He validate that the login is successful$")
	public void heValidateThatTheLoginIsSuccessful() {
	//	pacho.should(seeThat(LoginResult.page()).orComplainWith(UnableLogin.class, 
		//		getUnableLoginMessage()));
	    	}

}
