package com.hoteles.certifications.tasks;

import static com.hoteles.certifications.userinterfaces.HotelesComponents.DEPARTURE_DATE;
import static com.hoteles.certifications.userinterfaces.HotelesComponents.RETUR_DATE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hoteles.certifications.model.HotelDateModel;
import com.hoteles.certifications.model.LoginModel;
import com.hoteles.certifications.userinterfaces.HotelesComponents;
import com.hoteles.certifications.userinterfaces.HotelesPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class FillDate implements Task {
	private HotelDateModel hoteldatemodel;
	private HotelesComponents component;
	List<HotelDateModel> date;

	/*public FillDate(HotelDateModel hoteldatemodel) {
		this.hoteldatemodel = hoteldatemodel;
	}*/
	public FillDate(List<HotelDateModel> date) {
		this.date = date;
	}
	@Override
	@Step("{0} Full Fuelds login")
	public <T extends Actor> void performAs(T actor) {
		//WebDriver clean = new ChromeDriver();
		//WebElement fromDateBox= clean.findElement(By.id("qf-0q-localised-check-in"));
		//fromDateBox.clear();
		actor.attemptsTo(Click.on(DEPARTURE_DATE));
		actor.attemptsTo(Enter.theValue(date.get(0).getDeparture()).into(DEPARTURE_DATE));
		//actor.attemptsTo(Enter.theValue(hoteldatemodel.getDeparture()).into(component.DEPARTURE_DATE));
		actor.attemptsTo(Click.on(RETUR_DATE));
	//	actor.attemptsTo(Enter.theValue(hoteldatemodel.getDateReturn()).into(component.RETUR_DATE));
		//actor.attemptsTo(Enter.theValue(date.get(0).getDeparture()).into(component.DEPARTURE_DATE));
		//WebElement fromDateBox2= clean.findElement(By.id("qf-0q-localised-check-out"));
		//fromDateBox2.clear();
		actor.attemptsTo(Enter.theValue(date.get(0).getDateReturn()).into(RETUR_DATE));
		
	}
	public static FillDate enter(List<HotelDateModel> date) {
		return instrumented(FillDate.class, date);
	}

}
