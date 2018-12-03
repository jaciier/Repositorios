package com.hoteles.certifications.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/Features/reservation.feature",
		glue = "com.hoteles.certifications.stepsdefinitions",
		snippets = SnippetType.CAMELCASE)

public class ReservationRunner {

}
