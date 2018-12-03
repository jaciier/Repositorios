package com.hoteles.certifications.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.hoteles.com/")
public class HotelesPage extends PageObject{
	public static final Target SELECT_LOGIN = Target.the("Login button").located(By.id("hdr-account"));
	public static final Target SIGN_IN = Target.the("Login star").located(By.id("hdr-signin"));
//	public static final Target LOGIN_WITH_GMAIL = Target.the("Login with gmail in hoteles").locatedBy("//div[6]/div/div/div/div/div/button");
	public static final Target SIGN_BUTTON = Target.the("Sign in button").located(By.xpath("(//button[@type='submit'])[2]"));
	public static final Target USER_NAME = Target.the("username text").located(By.id("sign-in-email"));
	public static final Target PASSWOORD = Target.the("passwoord text").located(By.id("sign-in-password"));
	public static final Target CHANGE = Target.the("changa").located(By.cssSelector("body"));
}
