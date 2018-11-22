package com.procinal.certification.cinema.questions;

import com.procinal.certification.cinema.utils.WebBrowser;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ThePurchase implements Question<String>{

	private int toNextTab = 2;
	
	@Override
	public String answeredBy(Actor actor) {
		WebBrowser.changeTab(toNextTab, BrowseTheWeb.as(actor).getDriver());
		return BrowseTheWeb.as(actor).getTitle();
	}

	public static ThePurchase pageChangedTo() {
		return new ThePurchase();
	}

	
	
}
