package co.com.procinal.certification.tasks;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

import co.com.procinal.certification.tasks.SearchProcinal;

public class SearchProcinal {
	public static final Target Search_Bar = Target.the("Google bar search ").located(By.id("q"));
	public static final Target Go_Search = Target.the("search button").located(By.name("btnK"));
	public static final Target Select_Procinal_Page = Target.the("Select Page Web Of Procinal").locatedBy("//h3[contains(text(),'Cinemas Procinal')]");

}
