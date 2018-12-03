package com.hoteles.certifications.tasks;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenTheBrowser implements Task{
	private PageObject page;
	
	public OpenTheBrowser(PageObject page) {
		// TODO Auto-generated constructor stub
		this.page = page;
	}
	

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Open.browserOn(page));
	}
	
	public static OpenTheBrowser on(PageObject page){
		return Tasks.instrumented(OpenTheBrowser.class, page);
	}

}
