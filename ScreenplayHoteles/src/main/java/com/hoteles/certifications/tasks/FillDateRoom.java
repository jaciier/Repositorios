package com.hoteles.certifications.tasks;

import static com.hoteles.certifications.userinterfaces.HotelesComponents.BUTTON_SEARCH;
import static com.hoteles.certifications.userinterfaces.HotelesComponents.NUMBER_ROOM;
import static com.hoteles.certifications.userinterfaces.HotelesComponents.SELECT_NUMBER_OCUPATION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.FindActiveElement;

import com.hoteles.certifications.model.HotelDateModel;
import com.hoteles.certifications.model.RoomModel;
import com.hoteles.certifications.userinterfaces.HotelesComponents;

import net.serenitybdd.core.pages.FindAllWaitOptions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class FillDateRoom implements Task{
	List<RoomModel> date;
	HotelesComponents components;
	public FillDateRoom(List<RoomModel> date) {
		this.date = date;
		
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(NUMBER_ROOM));
		actor.attemptsTo(Click.on(SELECT_NUMBER_OCUPATION));
		//actor.attemptsTo(selectOptionByValue(components.SELECT_ROOM));
		//actor.attemptsTo(SelectFromOptions.byValue(FindActiveElement(components.SELECT_ROOM)));
	//	actor.attemptsTo(SelectFromOptions.byVisibleText(date.get(0).getRoom()).from(components.NUMBER_ROOM));
	//	actor.attemptsTo(Enter.theValue(date.get(0).getRoom()).into(components.NUMBER_ROOM));
	//	actor.attemptsTo(Enter.theValue(date.get(0).getAdult()).into(components.NUMBER_ADULT));
	//	actor.attemptsTo(Enter.theValue(date.get(0).getChildren()).into(components.NUMBER_CHILDREN));
		actor.attemptsTo(Click.on(BUTTON_SEARCH));
	}
	public static FillDateRoom enter(List<RoomModel> date) {
		return instrumented(FillDateRoom.class, date);
	}

}
