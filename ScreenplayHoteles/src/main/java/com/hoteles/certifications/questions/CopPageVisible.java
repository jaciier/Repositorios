package com.hoteles.certifications.questions;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import com.hoteles.certifications.userinterfaces.HotelesComponents;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CopPageVisible implements Question<Boolean>{

	@Override
	public Boolean answeredBy(Actor actor) {
		return the(HotelesComponents.COP).answeredBy(actor).isCurrentlyVisible();

	}
	public static Question<Boolean> isVisible(){
		return new CopPageVisible();
	}

}
