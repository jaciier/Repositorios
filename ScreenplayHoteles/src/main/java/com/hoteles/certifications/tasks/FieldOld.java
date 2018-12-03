package com.hoteles.certifications.tasks;

import static com.hoteles.certifications.userinterfaces.HotelesComponents.OLD_CHILDREN;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import com.hoteles.certifications.model.HotelDateModel;
import com.hoteles.certifications.model.OldChildrenModel;
import com.hoteles.certifications.userinterfaces.HotelesComponents;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class FieldOld implements Task  {
	private OldChildrenModel oldchildren;
	private HotelesComponents component;
	List<OldChildrenModel> date;
	public FieldOld(List<OldChildrenModel> date) {
		this.date = date;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(SelectFromOptions.byVisibleText(date.get(0).getOldChildren()).from(OLD_CHILDREN));
		
	}
	public static FieldOld enter(List<OldChildrenModel> date) {
		return instrumented(FieldOld.class, date);
	}

}
