package co.com.procinal.certification.tasks;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import co.com.procinal.certification.ui.procinalLandingPage;

public class click implements Task{
	
	private PageObject page;

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(procinalLandingPage.BOTON_MEDELLIN));
	}
	
	public static click on(PageObject page){
		return Tasks.instrumented(click.class, page);
	}

}
