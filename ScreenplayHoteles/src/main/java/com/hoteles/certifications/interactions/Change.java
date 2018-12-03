package com.hoteles.certifications.interactions;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hoteles.certifications.questions.CopPageVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;


public class Change implements Question{
	static WebDriver driver;
	private Target select;

	/*public static void ChangeTab() {
		driver = new ChromeDriver();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
	}*/
	public Change(Target select) {
		this.select = select;
	}
	/*@Override
	public <T extends Actor> void performAs(T actor) {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
	}*/
	//public static Change join(Target change) {
		//return Tasks.instrumented(Change.class, change);
//	}
	@Override
	public Object answeredBy(Actor actor) {
		driver = new ChromeDriver();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		return driver.switchTo().window(tabs.get(1));
	}
	

}
