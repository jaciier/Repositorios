package com.procinal.certification.cinema.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.procinal.certification.cinema.userinterfaces.ProcinalSelectedMoviePage;

public class Buy implements Task{
    @Override
    //Cualquier instancia de task debe implementar el metodo perfomAs
    public <T extends Actor> void performAs(T actor) {
    	actor.attemptsTo(
    			Click.on(ProcinalSelectedMoviePage.BUTTON_COMPRA_AQUI));
    }

	public static Buy aTicket() {
		return instrumented(Buy.class);
	}
}
