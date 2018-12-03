package com.hoteles.certifications.stepsdefinitions;

import org.openqa.selenium.WebDriver;

import com.hoteles.certifications.tasks.FieldsReservation;
import com.hoteles.certifications.tasks.Reservation;
import com.hoteles.certifications.tasks.ReservationRoom;
import com.hoteles.certifications.userinterfaces.HotelesPage;
import com.hoteles.certifications.userinterfaces.ReserPage;

import java.util.List;
import static com.hoteles.certifications.exceptions.CopException.getUnableLoginMessage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


import com.hoteles.certifications.exceptions.CopException;

import com.hoteles.certifications.model.ReservationModel;

import com.hoteles.certifications.questions.CopPageVisible;

import com.hoteles.certifications.tasks.OpenTheBrowser;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class ReservationStepDefinition {
	
	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	
	private Actor pacho = Actor.named("pacho");
	private ReserPage page;
	
	@Before
	public void setUp() {
		pacho.can(BrowseTheWeb.with(hisBrowser));
		pacho.wasAbleTo(OpenTheBrowser.on(page));
	}
	
	@Given("^He will reserve the selected room$")
	public void heWillReserveTheSelectedRoom() {
		pacho.attemptsTo(Reservation.Button());
	}

	@When("^fill out the reservation forms$")
	public void fillOutTheReservationForms(List<ReservationModel> date) {
	    pacho.attemptsTo(FieldsReservation.enter(date));
	}

	@Then("^He will book the room$")
	public void heWillBookTheRoom() {
		pacho.attemptsTo(ReservationRoom.Button());
	}

	@Then("^check that the cost is in Colombian peso$")
	public void checkThatTheCostIsInColombianPeso() {
		pacho.should(seeThat(CopPageVisible.isVisible()).orComplainWith(CopException.class, 
				getUnableLoginMessage()));
	}

}
