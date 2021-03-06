package com.hoteles.certifications.tasks;

import static com.hoteles.certifications.userinterfaces.HotelesPage.SELECT_LOGIN;
import static com.hoteles.certifications.userinterfaces.HotelesPage.SIGN_IN;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.hoteles.certifications.userinterfaces.HotelesPage;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Select implements Task{
	//private Target hotelesComponents;
	private PageObject page;
	HotelesPage hotelespage;
	//public  Select(Target HotelesComponents) {
		//this.hotelesComponents = HotelesComponents;
	//}

	@Override
	public <T extends Actor> void performAs(T actor) {
			actor.attemptsTo(Click.on(SELECT_LOGIN));
			actor.attemptsTo(Click.on(SIGN_IN));
	}
	public static Select Button() {
		
		return instrumented(Select.class); 
	}


}
