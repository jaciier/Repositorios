package co.com.procinal.certification.tasks;

import co.com.procinal.certification.tasks.RequirementProcinal;
import co.com.procinal.certification.userinterfaces.CinemaProcinalPage;
import co.com.procinal.certification.userinterfaces.ComponentsProcinal;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class RequirementProcinal implements Task{

	private PageObject page;

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(CinemaProcinalPage.BOTON_MEDELLIN));
	}
	
	public static RequirementProcinal on(PageObject page){
		return Tasks.instrumented(RequirementProcinal.class, page);
	}

}
