package com.hoteles.certifications.tasks;

import static com.hoteles.certifications.userinterfaces.HotelesComponents.CCV;
import static com.hoteles.certifications.userinterfaces.HotelesComponents.EMAIL;
import static com.hoteles.certifications.userinterfaces.HotelesComponents.MONTH;
import static com.hoteles.certifications.userinterfaces.HotelesComponents.NAME_CARD;
import static com.hoteles.certifications.userinterfaces.HotelesComponents.NAME_RESERVATION;
import static com.hoteles.certifications.userinterfaces.HotelesComponents.NUMBRE_CARD;
import static com.hoteles.certifications.userinterfaces.HotelesComponents.PHONE;
import static com.hoteles.certifications.userinterfaces.HotelesComponents.SURNAME_CARD;
import static com.hoteles.certifications.userinterfaces.HotelesComponents.YEAR;
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
		actor.attemptsTo(Enter.theValue(date.get(0).getName()).into(NAME_RESERVATION));
		actor.attemptsTo(Enter.theValue(date.get(0).getSurname()).into(SURNAME_CARD));
		actor.attemptsTo(Enter.theValue(date.get(0).getEmail()).into(EMAIL));
		actor.attemptsTo(Enter.theValue(date.get(0).getPhone()).into(PHONE));
		actor.attemptsTo(Enter.theValue(date.get(0).getNameCard()).into(NAME_CARD));
		actor.attemptsTo(Enter.theValue(date.get(0).getSurnameCard()).into(SURNAME_CARD));
		actor.attemptsTo(Enter.theValue(date.get(0).getCard()).into(NUMBRE_CARD));
		actor.attemptsTo(Enter.theValue(date.get(0).getCode()).into(CCV));
		actor.attemptsTo(Enter.theValue(date.get(0).getMonth()).into(MONTH));
		actor.attemptsTo(Enter.theValue(date.get(0).getYear()).into(YEAR));
		
		
	}
	public static FieldsReservation enter(List<ReservationModel> date) {
		return instrumented(FieldsReservation.class, date);
	}

}
