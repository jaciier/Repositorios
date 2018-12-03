package com.hoteles.certifications.tasks;

import com.hoteles.certifications.exceptions.UnableLogin;
import com.hoteles.certifications.model.Change;
import com.hoteles.certifications.model.LoginModel;
import com.hoteles.certifications.userinterfaces.HotelesComponents;
import com.hoteles.certifications.userinterfaces.HotelesPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class FillFields implements Task{
	private LoginModel loginModel;
	private HotelesComponents component;
	HotelesPage hotelespage;
	Change change;
	private WebDriver driver2;

	public FillFields(LoginModel loginmodel) {
		this.loginModel = loginmodel;
	}
	
	@SuppressWarnings("null")
	@Override
	@Step("{0} Full Fuelds login")
	public <T extends Actor> void performAs(T actor) {
	//	WebDriver driver=null;

	//	actor.attemptsTo(Click.on(component.LOGIN_GMAIL));
	//	ArrayList<String> tabs = new ArrayList<String>(driver2.getWindowHandles());
	//	((WebDriver) BrowseTheWeb.as(actor)).switchTo().window(tabs.get(1));
	//	actor.attemptsTo(Change.change());
		actor.attemptsTo(Enter.theValue(loginModel.getUser()).into(hotelespage.USER_NAME));
		actor.attemptsTo(Enter.theValue(loginModel.getPasswoord()).into(hotelespage.PASSWOORD));
		actor.attemptsTo(Click.on(hotelespage.SIGN_BUTTON));
		actor.attemptsTo(Click.on(component.CLOSED_WINDOWS));
		
		
	}
	
	public static FillFields enter(LoginModel loginmodel) {
		return instrumented(FillFields.class, loginmodel);
	}
	public String getUnableLoginMessage() {
		return String.format(UnableLogin.getUnableLoginMessage());
	}
}
