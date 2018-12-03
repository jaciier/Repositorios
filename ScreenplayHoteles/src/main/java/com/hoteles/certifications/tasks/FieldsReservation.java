package com.hoteles.certifications.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import com.hoteles.certifications.model.HotelDateModel;
import com.hoteles.certifications.model.OldChildrenModel;
import com.hoteles.certifications.model.ReservationModel;
import com.hoteles.certifications.userinterfaces.HotelesComponents;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

public class FieldsReservation implements Task {
	private HotelesComponents component;
	List<ReservationModel> date;
	public FieldsReservation(List<ReservationModel> date) {
		this.date = date;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(date.get(0).getName()).into(component.NAME_RESERVATION));
		actor.attemptsTo(Enter.theValue(date.get(0).getSurname()).into(component.SURNAME_CARD));
		actor.attemptsTo(Enter.theValue(date.get(0).getEmail()).into(component.EMAIL));
		actor.attemptsTo(Enter.theValue(date.get(0).getPhone()).into(component.PHONE));
		actor.attemptsTo(Enter.theValue(date.get(0).getNameCard()).into(component.NAME_CARD));
		actor.attemptsTo(Enter.theValue(date.get(0).getSurnameCard()).into(component.SURNAME_CARD));
		actor.attemptsTo(Enter.theValue(date.get(0).getCard()).into(component.NUMBRE_CARD));
		actor.attemptsTo(Enter.theValue(date.get(0).getCode()).into(component.CCV));
		actor.attemptsTo(Enter.theValue(date.get(0).getMonth()).into(component.MONTH));
		actor.attemptsTo(Enter.theValue(date.get(0).getYear()).into(component.YEAR));
		
		
	}
	public static FieldsReservation enter(List<ReservationModel> date) {
		return instrumented(FieldsReservation.class, date);
	}

}
