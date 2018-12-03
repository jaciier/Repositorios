package com.hoteles.certifications.tasks;

import static com.hoteles.certifications.userinterfaces.HotelesComponents.CLOSED;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import org.openqa.selenium.WebDriver;

import com.hoteles.certifications.exceptions.WithoutConnection;
import com.hoteles.certifications.questions.HotelesPageVisible;
import com.hoteles.certifications.userinterfaces.HotelesComponents;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class OpenTheBrowser implements Task{
	private PageObject page;
	private HotelesComponents component;
	public OpenTheBrowser(PageObject page) {
		this.page = page;
	}
	
	//ejecucion de navegador

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub

		actor.attemptsTo(Open.browserOn(page));
		try {
			actor.attemptsTo(Click.on(CLOSED));
			
		} catch(Exception e) {
		actor.should(seeThat(HotelesPageVisible.isVisible()).orComplainWith(WithoutConnection.class, 
	    	getNoConectionWithInternet()));
		}
	}
	
	public static OpenTheBrowser on(PageObject page){
		return Tasks.instrumented(OpenTheBrowser.class, page);
	}
	public String getNoConectionWithInternet() {
		return String.format(WithoutConnection.getErrorHottelesMessage());
	}
}
