package co.com.procinal.certification.userinterfaces;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
public class ComponentsProcinal extends PageObject{
	//public static final Target Enter_City = Target.the("select city where you live").located(By.xpath("//ul[@class='clearfix']//li[4]//a[1]"));
	public static final Target Search_Movie = Target.the("Search Movie In Page").locatedBy("//li[@class='icon1 downpeliculas']//a[@class='waves-button waves-effect waves-light']");
	public static final Target BOTON_MEDELLIN = Target.the("el boton de medellin").located(By.xpath("//ul[@class='clearfix']//li[4]//a[1]"));


}
