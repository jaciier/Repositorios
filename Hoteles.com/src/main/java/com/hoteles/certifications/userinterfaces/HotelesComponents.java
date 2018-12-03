package com.hoteles.certifications.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HotelesComponents extends PageObject{
	public static final Target SIGN_IN = Target.the("Selec sign in list").located(By.id("hdr-signin"));
}
