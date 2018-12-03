package com.hoteles.certifications.stepsdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.hoteles.certifications.model.HotelDateModel;
import com.hoteles.certifications.model.HotelModel;
import com.hoteles.certifications.model.LoginModel;
import com.hoteles.certifications.model.OldChildrenModel;
import com.hoteles.certifications.model.RoomModel;
import com.hoteles.certifications.model.SearchModel;
import com.hoteles.certifications.tasks.FieldOld;
import com.hoteles.certifications.tasks.FillDate;
import com.hoteles.certifications.tasks.FillDateRoom;
import com.hoteles.certifications.tasks.FillFields;
import com.hoteles.certifications.tasks.FillFieldsSearch;
import com.hoteles.certifications.tasks.OpenTheBrowser;
import com.hoteles.certifications.tasks.SelectHotel;
import com.hoteles.certifications.userinterfaces.HotelesPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class SearchOfHotelStepDefinition {
	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	
	private Actor pacho = Actor.named("pacho");
	private HotelesPage page;
	
	@Before
	public void setUp() {
		pacho.can(BrowseTheWeb.with(hisBrowser));
	//	pacho.wasAbleTo(OpenTheBrowser.on(page));
	}
	
	@Given("^He search a destinatio in the search engine$")
	public void heSearchADestinatioInTheSearchEngine(List<SearchModel> data) {
	
		pacho.attemptsTo(FillFieldsSearch.enter(data.get(1)));
	}


	@When("^Select the date departure and return$")
	public void selectTheDateDepartureAndReturn(List<HotelDateModel> data) {
		pacho.attemptsTo(FillDate.enter(data));
	}

	@When("^Select Room with number of Adults and childen$")
	public void selectRoomWithNumberOfAdultsAndChilden(List<RoomModel> data) throws Exception {
	   // pacho.attemptsTo(FillDateRoom.enter(data));
	}

	@When("^Select old children and search room$")
	public void selectOldChildrenAndSearchRoom(List<OldChildrenModel> data) throws Exception {
	  //pacho.attemptsTo(FieldOld.enter(data));
	}

	@Then("^search a room and select$")
	public void searchtARoomAndSelect(List<HotelModel> date) throws Exception {
		pacho.attemptsTo(SelectHotel.reservation(date));
	}
}
