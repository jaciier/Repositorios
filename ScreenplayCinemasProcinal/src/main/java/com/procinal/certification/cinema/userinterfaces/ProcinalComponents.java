package com.procinal.certification.cinema.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


public class ProcinalComponents {
	
	public static final Target SELECT_CITY = Target.the("Medellin city button").located(By.id("12"));
	public static final Target SELECT_CITY_AGAIN = Target.the("Medellin city button").located(By.id("12"));
	public static final Target SELECT_OPTIONS_MOVIES = Target.the("Button for select options of movie").locatedBy("/html/body/section/section[2]/header/section/section/nav/ul/li[1]/a");
	public static final Target SELECT_MOVIE=Target.the("Button for select a movie").locatedBy("/html/body/section/section[6]/article/section/ul/li[2]/div[1]/div[2]/img");
	public static final Target SELECT_OPTIONS_TEATRO = Target.the("Buttonf for options of teatro").located(By.id("teatrosite-3808"));
	public static final Target SELECT_OPTIONS_DATE = Target.the("Buttonf for options of date").located(By.id("date-3808"));
	public static final Target SELECT_SEARCH_RESULTS=Target.the("Button for search results").locatedBy("//*[@id=\"form-pelicula-3808\"]/fieldset[4]/center/button");
	public static final Target DIV_PELICULAS=Target.the("That is the div space, where are all billboard movies").locatedBy("//div[@class='internal-box']");
	public static final Target IMG_PROCINAL=Target.the("That is the div space, where are all billboard movies").locatedBy("/html/body/section/section[2]/header/section/a/img");
	public static final Target CARTELERA_BUTTON=Target.the("Button to go to the billboard´s movies page").locatedBy("/html/body/section/section[4]/li[4]/a/h3/strong");
	
	///After click billboard´s button
	public static final Target SELECT_WANTED_MOVIE=Target.the("That is the section space, where are all billboard movies").locatedBy("//*[@class='tab_cont']//ul[@class='gallery-items list_peliculas']//img[@alt='BOHEMIAN RHAPSODY']");
	public static final Target RESULT_SECTION=Target.the("That is the section space, where are all billboard movies").locatedBy("//ul[@class='gallery-items list_peliculas']");
	public static final Target SELECT_WANTED_MOVIE_CONCAT=Target.the("That is the section space, where are all billboard movies").locatedBy("//*[@class='tab_cont']//ul[@class='gallery-items list_peliculas']//img[@alt='");
	
	///In the shopping page
	public static final Target LABEL_MOVIE_TITLE_SHOPPING_PAGE=Target.the("That is the section space, where are all billboard movies").locatedBy("//div[@class='txt_detail']//p[contains(text(),'BOHEMIAN ')]//span[contains(text(),'Título:')]");
	
	public static final Target LABEL_MOVIE_TITLE_SHOPPING_PAGE2=Target.the("That is the section space, where are all billboard movies").locatedBy("//div[@class='txt_detail']//p[contains(text(),'");
	
	
	

}
