package com.procinal.certification.cinema.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static org.hamcrest.Matchers.*;

import org.openqa.selenium.WebDriver;

import com.procinal.certification.cinema.questions.ThePurchase;
import com.procinal.certification.cinema.tasks.Buy;
import com.procinal.certification.cinema.tasks.Check;
import com.procinal.certification.cinema.tasks.Select;
import com.procinal.certification.cinema.userinterfaces.ProcinalSelectedMoviePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class BuyMovieProcinalStepDefinition {
	
	@Managed(driver = "chrome")
	private WebDriver herBrowser;
	
	private Actor ana = Actor.named("Ana");
	
	private ProcinalSelectedMoviePage inThePage;
	
	@Given("^that Ana selected a movie$")
	public void thatAnaSelectedAMovie() throws Exception {
		givenThat(ana).can(BrowseTheWeb.with(herBrowser));
		givenThat(ana).wasAbleTo((Select.aMovie(inThePage)));
	}
	
	@When("^she checks for a date$")
	public void sheChecksForADate() throws Exception {
		when(ana).attemptsTo(Check.forADate());
	}

	@When("^she clicks on the buy button$")
	public void sheClicksOnTheBuyButton() throws Exception {
		when(ana).attemptsTo(Buy.aTicket());
	}

	@Then("^she should see the purchase details$")
	public void sheShouldSeeThePurchaseDetails() throws Exception {
		then(ana).should(seeThat(ThePurchase.pageChangedTo(), is("Fandango")));
	}


}
