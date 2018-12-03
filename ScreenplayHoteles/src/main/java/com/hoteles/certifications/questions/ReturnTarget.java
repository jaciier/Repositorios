package com.hoteles.certifications.questions;

import com.hoteles.certifications.userinterfaces.HotelesComponents;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ReturnTarget implements Question<Target>{

	static Target  holi;
	public static ReturnTarget page() {
		return new ReturnTarget();
	}

	@Override
	public Target answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return holi;//the(HotelesComponents.HOTEL).answeredBy(actor);
	}

}
