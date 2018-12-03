package com.hoteles.certifications.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HotelesComponents extends PageObject{
	public static final Target SIGN_IN = Target.the("Selec sign in list").located(By.id("hdr-signin"));
	public static final Target WELCOME = Target.the("Text Welcome").located(By.xpath("//span[@class='welcome-msg icon-afternoon']"));
	public static final Target CLOSED = Target.the("Closed advertising window").located(By.xpath("//*[@id=\"managed-overlay\"]/button"));
	public static final Target DESTINATION = Target.the("Enter a destination").located(By.name("q-destination"));
	public static final Target DEPARTURE_DATE = Target.the("Departure date to hotel").located(By.name("q-localised-check-in"));
	public static final Target RETUR_DATE = Target.the("Return date to origin").located(By.name("q-localised-check-out"));
	public static final Target SELECT_ROOM = Target.the("Select room in search").located(By.xpath("//*[@id=\"qf-0q-compact-occupancy\"]"));
	public static final Target BUTTON_SEARCH = Target.the("Button search hotel").located(By.xpath("//button[@type='submit']"));
	public static final Target NUMBER_ROOM = Target.the("Select number room").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Habitaciones'])[2]/following::select[1]"));
	public static final Target NUMBER_ADULT = Target.the("Select number of adult").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Adultos'])[1]/following::select[2]"));
	public static final Target NUMBER_CHILDREN = Target.the("Select number of children").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Niños'])[1]/following::select[1]"));
	public static final Target SELECT_DESTINE = Target.the("select destine of list").located(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ciudades/zonas'])[1]/following::div[1]"));
	public static final Target CLOSED_WINDOWS = Target.the("closed window login").located(By.xpath("//button[@class='cta widget-overlay-close']"));
	public static final Target SELECT_NUMBER_OCUPATION = Target.the("Select number ocupations room").located(By.xpath("/html/body/div[2]/main/div/div/div[1]/div/div[1]/div[1]/div/div/form/div[4]/div/select/option[2]"));
	public static final Target RESERVATION = Target.the("Reservation of hotel").located(By.id("book-now-button"));
	public static final Target CONFIR_RESERVATION = Target.the("confirmation of reservation").located(By.xpath("//form[@id='room-1-rateplan-1']//button[@type='submit'][contains(text(),'Reservar')]"));
	public static final Target RESERVATION_HOTEL = Target.the("confirmation").located(By.id("book-button"));
	public static final Target HOTEL = Target.the("select hotel").located(By.className("cta-wrap"));
	public static final Target OLD_CHILDREN = Target.the("Old children").located(By.name("q-room-0-child-0-age"));
	public static final Target NAME_RESERVATION = Target.the("Name of who reservation").located(By.id("room-details-room-0-first-name"));
	public static final Target SURNAME_RESERVATION = Target.the("Surname of who reservation").located(By.id("room-details-room-0-last-name"));
	public static final Target EMAIL = Target.the("email").located(By.id("contact-details-email"));
	public static final Target PHONE = Target.the("phone").located(By.id("contact-details-phone"));
	public static final Target NAME_CARD = Target.the("Name of card").located(By.id("payment-details-first-name"));
	public static final Target SURNAME_CARD = Target.the("Surname of card").located(By.id("payment-details-last-name"));
	public static final Target NUMBRE_CARD = Target.the("Number of card").located(By.id("payment-details-card-number"));
	public static final Target CCV = Target.the("ccv card").located(By.id("payment-details-cvv"));
	public static final Target MONTH = Target.the("Month expired card").located(By.id("expiry-month"));
	public static final Target YEAR = Target.the("Year expired card").located(By.id("expiry-year"));
	public static final Target COP = Target.the("COP").located(By.id("financial-details-total-price"));
	public static final Target LOGIN_GMAIL = Target.the("login with gmail").locatedBy("//button[@class='social-btn social-btn--googleplus']");
}
