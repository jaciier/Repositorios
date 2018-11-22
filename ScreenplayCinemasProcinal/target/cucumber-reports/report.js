$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Buy_Movie.feature");
formatter.feature({
  "name": "Buy Movie in Procinal",
  "description": "\tAs a web user\n\tI want to buy a movie\n\tTo go and watch it",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Buy a movie",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that Ana selected a movie",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "she buy the movie",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "she checks the details",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});