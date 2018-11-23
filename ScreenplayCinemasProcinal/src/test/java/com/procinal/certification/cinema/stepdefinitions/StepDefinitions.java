package com.procinal.certification.cinema.stepdefinitions;


import org.openqa.selenium.WebDriver;

import com.procinal.certification.cinema.tasks.GoTo;
import com.procinal.certification.cinema.tasks.OpenTheBrowser;
import com.procinal.certification.cinema.tasks.SelectTheWantedMovie;
import com.procinal.certification.cinema.tasks.verifyTheResult;
import com.procinal.certification.cinema.userinterfaces.ProcinalComponents;
import com.procinal.certification.cinema.userinterfaces.ProcinalHomePage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class StepDefinitions {
	
	@Managed(driver ="chrome")
	
	private WebDriver hisBrowser; // variable de clase  instanciada
	
	private Actor usuario = Actor.named("Usuario");
	
	private ProcinalHomePage googleHomePage;
	
	@Before
	public void setUp() {
		usuario.can(BrowseTheWeb.with(hisBrowser));}
	
	
	@Given("^that the user wants to choose a new movie$")
	public void thatTheUserWantsToChooseANewMovie() throws InterruptedException {
		usuario.wasAbleTo(OpenTheBrowser.on(googleHomePage),
				GoTo.theApp(ProcinalComponents.CARTELERA_BUTTON)); 
		
		
	}

	@When("^the user manages to find the (.*) that he wants$")
	public void theUserManagesToFindTheThatHeWants(String movieName) throws Exception {
usuario.wasAbleTo(SelectTheWantedMovie.inThe(ProcinalComponents.SELECT_WANTED_MOVIE,movieName));
		
		Thread.sleep(10000);	
		}

	@Then("^he should have found the (.*)$")
	public void heShouldHaveFoundThe(String movieName) throws Exception {
		usuario.wasAbleTo(verifyTheResult.inThe(ProcinalComponents.LABEL_MOVIE_TITLE_SHOPPING_PAGE,movieName));
	}

}
