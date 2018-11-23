package com.procinal.certification.cinema.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.procinal.certification.cinema.userinterfaces.ProcinalComponents;

public class GoTo implements Task{
	
	private Target procinalApp;
	
	public  GoTo(Target procinalApp) {
		this.procinalApp = procinalApp;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
			

			actor.attemptsTo(Click.on(ProcinalComponents.CARTELERA_BUTTON));
		
		
	}
	
	/**
	 * 
	 * @param procinalApp
	 * @return instrumented finds in the goto class, a constructor that receive a target,
	 * calls this and set the value
		
	 */
	public static GoTo theApp(Target procinalApp) {
		
		return instrumented(GoTo.class,procinalApp); 
	}


}
