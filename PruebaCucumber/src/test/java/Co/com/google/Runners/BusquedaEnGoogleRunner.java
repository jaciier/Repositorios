package Co.com.google.Runners;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature/BusquedadEnGoogle.Feature",
glue="co.com.google.StepsDefinitions", tags = "@Tag1", dryRun = false ,
plugin ={"pretty", "html:Pruebas"})
public class BusquedaEnGoogleRunner {

}
