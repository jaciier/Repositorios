package com.royalfilms.certification.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.royalfilms.certification.tasks.OpenTheBrowser;
import com.royalfilms.certification.userinterfaces.RoyalHomePage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class RoyalFilmsStepsDefinitions {
	
@Managed(driver ="chrome")
	private WebDriver hisBrowser; // variable de clase correctamente instanciada
	private Actor pacho = Actor.named("Pacho");
	
	private RoyalHomePage royalHomePage;
	
	@Before
	public void setUp() {
		pacho.can(BrowseTheWeb.with(hisBrowser));
	}

	@Given("^that jhon can open the browser$")
	public void thatJhonCanOpenTheBrowser() {
		pacho.wasAbleTo(OpenTheBrowser.on(royalHomePage));
	}


	@When("^ge goes to the Royal-Films url$")
	public void geGoesToTheRoyalFilmsUrl() {
	}

	@Then("^He check if there were results$")
	public void heCheckIfThereWereResults() {
	}

}
