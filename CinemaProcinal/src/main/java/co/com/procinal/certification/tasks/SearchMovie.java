package co.com.procinal.certification.tasks;

import co.com.procinal.certification.userinterfaces.ComponentsProcinal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SearchMovie implements Task{
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(ComponentsProcinal.Search_Movie));
		
	}

	public static SearchMovie the() {
		return Tasks.instrumented(SearchMovie.class);
	}

}
