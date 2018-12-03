package Co.com.google.Runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/BuscarEnGoogle.Feature",
glue="Co.com.google.StepsDefinitions"
, plugin ={"pretty" , "html:C:\\Users\\SBMEDADMIN\\eclipse-workspace\\MiPrimerCucumber\\Prueba"})
public class BuscarEnGoogleRunner {
	
}