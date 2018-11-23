package com.procinal.certification.cinema.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/Choose_Movie.feature", 
				 glue="com.procinal.certification.cinema.stepdefinitions",
				 snippets = SnippetType.CAMELCASE,
				 plugin=  {"pretty","json:target/json-report/LoginReport.json",
					"html:target/cucumber-reports"}
				 )
public class ChooseAMovieRunner {

}
