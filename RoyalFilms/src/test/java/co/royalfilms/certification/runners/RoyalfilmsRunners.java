package co.royalfilms.certification.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/SearchFilm.feature", 
				 glue="com.royalfilms.certification.stepdefinitions",
				 snippets = SnippetType.CAMELCASE
				 )
public class RoyalfilmsRunners {

}
