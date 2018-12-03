package com.hoteles.certifications.tasks;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ChangeTab implements Interaction{
	WebDriver driver;
	
	
	public ChangeTab() {
		// TODO Auto-generated constructor stub
	}
	
/*	public void changeTabHoteles() {
		Actions action= new Actions(driver); 
		action.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys(Keys.TAB).build().perform();   
	}
*/
	@Override
	public <T extends Actor> void performAs(T actor) {
		//		Actions action= new Actions(driver); 
	//	action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform(); 
	//	BrowseTheWeb.as(actor).switchToPage(pageObjectClass);

	}
	public static ChangeTab Change(){
		return Tasks.instrumented(ChangeTab.class);
	}
}
