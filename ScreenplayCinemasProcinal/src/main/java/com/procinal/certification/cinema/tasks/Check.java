package com.procinal.certification.cinema.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import com.procinal.certification.cinema.userinterfaces.ProcinalSelectedMoviePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Check implements Task {

    @Override
    //Cualquier instancia de task debe implementar el metodo perfomAs
    public <T extends Actor> void performAs(T actor) {
    	actor.attemptsTo(
    			Scroll.to(ProcinalSelectedMoviePage.SELECT_DATE),
    			Click.on(ProcinalSelectedMoviePage.SELECT_THEATER),
    			Click.on(ProcinalSelectedMoviePage.SELECT_THEATER_OPTION),
    			Click.on(ProcinalSelectedMoviePage.SELECT_DATE),
    			Click.on(ProcinalSelectedMoviePage.SELECT_DATE_OPTION),
    			Click.on(ProcinalSelectedMoviePage.BUTTON_BUSCAR_RESULTADOS),
    			Click.on(ProcinalSelectedMoviePage.OPTION_PREMIERE_TIME)
    			);
    }

	public static Check forADate() {
		return instrumented(Check.class);
	}
    
    
}