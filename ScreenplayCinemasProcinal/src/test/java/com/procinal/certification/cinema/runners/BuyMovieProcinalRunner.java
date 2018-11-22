package com.procinal.certification.cinema.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/Buy_Movie.feature",
		glue = "com.procinal.certification.cinema.stepdefinitions",
		snippets = SnippetType.CAMELCASE
)

public class BuyMovieProcinalRunner {

}
