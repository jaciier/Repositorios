package com.hoteles.certifications.model;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.hoteles.certifications.tasks.FillFieldsSearch;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;


public class Change implements Interaction{
	static WebDriver driver;
	
	private WebDriver driver2;

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub

		actor.can(BrowseTheWeb.with(driver2));
		ArrayList<String> tabs = new ArrayList<String>(driver2.getWindowHandles());
		((WebDriver) BrowseTheWeb.as(actor)).switchTo().window(tabs.get(1));
	}
	public static Change change() {
		return instrumented(Change.class);
	}
}
