package com.procinal.certification.cinema.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.procinal.certification.cinema.userinterfaces.ProcinalComponents;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class SelectTheWantedMovie implements Task{
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		
		actor.attemptsTo(Click.on(ProcinalComponents.SELECT_WANTED_MOVIE));
	}
	public static Performable inThe(Target resultSection, String movieName) {
		// TODO Auto-generated method stub
		(ProcinalComponents.SELECT_WANTED_MOVIE).getCssOrXPathSelector().concat(movieName+"']");
		return instrumented(SelectTheWantedMovie.class);
	}



}
