package com.procinal.certification.cinema.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.procinal.certification.cinema.userinterfaces.ProcinalComponents;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class verifyTheResult implements Task{
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		
		actor.attemptsTo(Click.on(ProcinalComponents.LABEL_MOVIE_TITLE_SHOPPING_PAGE));
	}
	public static Performable inThe(Target resultSection, String movieName) {
		// TODO Auto-generated method stub
		//(ProcinalComponents.LABEL_MOVIE_TITLE_SHOPPING_PAGE).getCssOrXPathSelector().concat(movieName+"')]//span[contains(text(),'Título:')]");
		return instrumented(verifyTheResult.class);
	}
}
