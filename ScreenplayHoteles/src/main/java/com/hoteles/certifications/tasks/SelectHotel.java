package com.hoteles.certifications.tasks;

import static com.hoteles.certifications.userinterfaces.HotelesComponents.HOTEL;

import java.util.List;

import com.hoteles.certifications.interactions.RandomSelect;
import com.hoteles.certifications.model.HotelModel;
import com.hoteles.certifications.userinterfaces.HotelesComponents;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Scroll;

public class SelectHotel implements Task{
	private List<HotelModel> date;
	HotelesComponents component;
	public SelectHotel(List<HotelModel> date) {
		this.date = date;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Scroll.to(HOTEL.resolveAllFor(actor).get(3)));
		actor.attemptsTo(RandomSelect.join(HOTEL, date.get(0).getHotel()));
	}
	public static SelectHotel reservation(List<HotelModel> date) {
		return Tasks.instrumented(SelectHotel.class, date);
	}
}
