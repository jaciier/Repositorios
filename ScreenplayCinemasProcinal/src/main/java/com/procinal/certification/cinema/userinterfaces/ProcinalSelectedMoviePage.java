package com.procinal.certification.cinema.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://procinal.com/peliculas/bohemian-rhapsodyla-historia-de-freddie-mercury")
public class ProcinalSelectedMoviePage extends PageObject{
	
	public static final Target SELECT_THEATER =
			Target.the("Select theater").locatedBy(
					"//*[@id=\"teatrosite-3787\"]");
	
	public static final Target SELECT_THEATER_OPTION =
			Target.the("Select theater option").locatedBy(
					"//select[@id='teatrosite-3787']/option[2]");
	
	public static final Target SELECT_DATE =
			Target.the("Select date").locatedBy(
					"//input[@id='date-3787']");
	
	public static final Target SELECT_DATE_OPTION =
			Target.the("Select date option").locatedBy(
					"//div[@class='picker__day picker__day--infocus picker__day--today picker__day--highlighted']");
	
	public static final Target BUTTON_BUSCAR_RESULTADOS =
			Target.the("Button buscar resultados").locatedBy(
					"//button[contains(text(),'BUSCAR RESULTADOS')]");
	
	public static final Target OPTION_PREMIERE_TIME =
			Target.the("Option premiere time").locatedBy(
					"//ul[@id='slide_hours_3787']/li[1]/div[2]/a[1]");
	
	public static final Target BUTTON_COMPRA_AQUI =
			Target.the("Button compra aqui").locatedBy(
					"/html[1]/body[1]/section[1]/section[3]/section[1]/section[1]/section[1]/section[1]/article[3]/div[1]/div[4]/a[1]");
}
