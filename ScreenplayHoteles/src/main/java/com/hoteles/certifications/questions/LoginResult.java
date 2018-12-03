package com.hoteles.certifications.questions;
import static com.hoteles.certifications.userinterfaces.HotelesComponents.WELCOME;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import com.hoteles.certifications.userinterfaces.HotelesComponents;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class LoginResult implements Question<Boolean>{
	private static String errorMessage = "Wrong login";
	@Override
	public Boolean answeredBy(Actor actor) {
		return the(WELCOME).answeredBy(actor).isCurrentlyVisible();
	}
	
	public static LoginResult page() {
		return new LoginResult();
	}
	public static String getErrorMessage() {
		return errorMessage;
	}
	

}
