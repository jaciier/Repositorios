$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/BuscarEnGoogle.Feature");
formatter.feature({
  "name": "Buscar en Google",
  "description": "  Yo usar Google para buscar una cadena",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Busqueda exitosa",
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
formatter.step({
  "name": "Que puedo abrir el navegador",
  "keyword": "Given "
});
formatter.match({
  "location": "BuscarEnGoogleStepsDefinitions.que_puedo_abrir_el_navegador()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Voy a Google",
  "keyword": "When "
});
formatter.match({
  "location": "BuscarEnGoogleStepsDefinitions.voy_a_Google()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Realizo un busquedad",
  "keyword": "And "
});
formatter.match({
  "location": "BuscarEnGoogleStepsDefinitions.realizo_un_busquedad()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Valido que el resultado sea el esperado",
  "keyword": "Then "
});
formatter.match({
  "location": "BuscarEnGoogleStepsDefinitions.valido_que_el_resultado_sea_el_esperado()"
});
formatter.result({
  "status": "passed"
});
});