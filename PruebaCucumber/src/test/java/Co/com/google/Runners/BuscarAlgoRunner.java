package Co.com.google.Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/BuscarPalabra.Feature",
glue="Co.com.google.StepsDefinitions", plugin ={"pretty" , "html:C:\\Users\\SBMEDADMIN\\eclipse-workspace\\PruebaCucumber\\Pruebas"})
public class BuscarAlgoRunner {

}
