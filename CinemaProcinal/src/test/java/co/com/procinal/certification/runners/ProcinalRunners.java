package co.com.procinal.certification.runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/SearchProcinal.feature", 
				 glue="co.com.procinal.certification.stepdefinitions",
				 snippets = SnippetType.CAMELCASE
				 )
public class ProcinalRunners {

}
