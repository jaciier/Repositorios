package com.hoteles.certifications.questions;

import com.hoteles.certifications.userinterfaces.HotelesComponents;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class HotelesPageVisible implements Question<Boolean>{

	@Override
	public Boolean answeredBy(Actor actor) {
		return the(HotelesComponents.SIGN_IN).answeredBy(actor).isCurrentlyVisible();
	}
	public static Question<Boolean> isVisible(){
		return new HotelesPageVisible();
	}

}
