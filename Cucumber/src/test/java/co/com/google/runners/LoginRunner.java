package co.com.google.runners;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="Feature/Prueba2.Feature",tags = "@tag1", 
glue="co.com.google.stepsdefinitions", plugin ={"pretty", "html:C:\\Users\\SBMEDADMIN\\eclipse-workspace\\Cucumber\\Login"})
public class LoginRunner {

}
