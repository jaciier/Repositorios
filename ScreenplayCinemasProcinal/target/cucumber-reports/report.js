$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Choose_Movie.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "that the user wants to choose a new movie",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.thatTheUserWantsToChooseANewMovie()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user manages to find the movie that he wants",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.theUserManagesToFindTheThatHeWants(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he should have found it",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});