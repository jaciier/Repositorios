package co.com.procinal.certification.userinterfaces;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.procinal.certification.tasks.SearchProcinal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
public class GoProcinal implements Task {
	
	private Target Procinal;
	
	public  GoProcinal(Target GoProcinal) {
		this.Procinal = GoProcinal;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SearchProcinal.Search_Bar), Enter.theValue("Procinal").into(SearchProcinal.Search_Bar),Click.on(SearchProcinal.Go_Search),Click.on("GoProcinal"));
	
	}

	public static GoProcinal theSearch(Target GoProcinal) {
		
		return instrumented(GoProcinal.class,GoProcinal); //instrumented va y buscar la clase goto, un constructor que reciba un target, lo llama y asì le otorga valor
		
	}

			
}
