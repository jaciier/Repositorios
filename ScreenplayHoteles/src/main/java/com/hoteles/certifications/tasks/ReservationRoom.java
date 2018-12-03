package com.hoteles.certifications.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.hoteles.certifications.userinterfaces.HotelesComponents;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ReservationRoom implements Task{
	HotelesComponents component;

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(component.RESERVATION_HOTEL));
		
	}
	public static ReservationRoom Button() {
		
		return instrumented(ReservationRoom.class); 
	}

}
