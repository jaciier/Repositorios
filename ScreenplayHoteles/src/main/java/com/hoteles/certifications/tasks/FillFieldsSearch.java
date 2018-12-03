package com.hoteles.certifications.tasks;

import static com.hoteles.certifications.userinterfaces.HotelesComponents.BUTTON_SEARCH;
import static com.hoteles.certifications.userinterfaces.HotelesComponents.DESTINATION;
import static com.hoteles.certifications.userinterfaces.HotelesComponents.SELECT_DESTINE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.hoteles.certifications.model.LoginModel;
import com.hoteles.certifications.model.SearchModel;
import com.hoteles.certifications.userinterfaces.HotelesComponents;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class FillFieldsSearch implements Task{
	private SearchModel searchmodel;
	private HotelesComponents component;
	public FillFieldsSearch(SearchModel searchModel) {
		this.searchmodel = searchModel;
	}
	//llenar campos de busquedad de hotel con destino.
	@Override
	@Step("{0} Full Fuelds login")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(searchmodel.getDestination()).into(DESTINATION));
		actor.attemptsTo(Click.on(SELECT_DESTINE));
		actor.attemptsTo(Click.on(BUTTON_SEARCH));

	}
	public static FillFieldsSearch enter(SearchModel searchModel) {
		return instrumented(FillFieldsSearch.class, searchModel);
	}
}
