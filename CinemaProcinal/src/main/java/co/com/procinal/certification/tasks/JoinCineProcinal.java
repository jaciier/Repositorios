package co.com.procinal.certification.tasks;
import co.com.procinal.certification.tasks.SearchProcinal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class JoinCineProcinal implements Task{
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SearchProcinal.Select_Procinal_Page));
		
	}


	public static JoinCineProcinal the() {
		return Tasks.instrumented(JoinCineProcinal.class);
	}

	
	

}
