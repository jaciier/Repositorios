package com.procinal.certification.cinema.utils;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.By;

@DefaultUrl("https://procinal.com/landing")
public class procinalLandingPage extends PageObject{

	public static final Target BOTON_MEDELLIN = Target.the("el boton de medellin").located(By.xpath("//ul[@class='clearfix']//li[4]//a[1]"));
}
