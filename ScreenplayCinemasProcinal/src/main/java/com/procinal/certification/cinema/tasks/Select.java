package com.procinal.certification.cinema.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class Select implements Task {

	PageObject theProcinalSelectedMoviePage;
	
	public Select(PageObject page) {
		theProcinalSelectedMoviePage = page;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(theProcinalSelectedMoviePage));
	}

	public static Select aMovie(PageObject page) {
		return instrumented(Select.class, page);
	}

}
