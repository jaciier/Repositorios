package com.procinal.certification.cinema.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/SearchProcinal.feature",
		glue = "com.procinal.certification.cinema.stepdefinitions",
		snippets = SnippetType.CAMELCASE)

public class ProcinalRunner {

}
