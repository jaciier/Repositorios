package com.hoteles.certifications.tasks;

import static com.hoteles.certifications.userinterfaces.HotelesComponents.CONFIR_RESERVATION;
import static com.hoteles.certifications.userinterfaces.HotelesComponents.RESERVATION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.hoteles.certifications.userinterfaces.HotelesComponents;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Reservation implements Task{
	HotelesComponents component;
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(RESERVATION));
		actor.attemptsTo(Click.on(CONFIR_RESERVATION));
	}
	public static Reservation Button() {
		
		return instrumented(Reservation.class); 
	}


}
