package com.hoteles.certifications.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.hoteles.com/")
public class HotelesPage extends PageObject{
	public static final Target SELECT_LOGIN = Target.the("Login button").located(By.id("hdr-account"));

}
