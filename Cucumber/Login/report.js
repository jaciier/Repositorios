$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/Prueba2.Feature");
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
formatter.step({
  "name": "Ingresamos a la pagina Hoteles",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepsDefinitions.Ingresamos_a_la_pagina_Hoteles()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Localizamos el Log in",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepsDefinitions.Localizamos_el_Log_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Ingresamos los datos",
  "rows": [
    {
      "cells": [
        "Fields",
        "Value"
      ]
    },
    {
      "cells": [
        "name",
        "Javier"
      ]
    },
    {
      "cells": [
        "Passwoord",
        "1234"
      ]
    },
    {
      "cells": [
        "name",
        "Leon"
      ]
    },
    {
      "cells": [
        "Passwoord",
        "1203"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepsDefinitions.Ingresamos_los_datos(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verificamos el log in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepsDefinitions.verificamos_el_log_in()"
});
formatter.result({
  "status": "passed"
});
});