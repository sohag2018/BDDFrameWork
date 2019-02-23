$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ManyLogin.feature");
formatter.feature({
  "line": 2,
  "name": "Many login feature",
  "description": "",
  "id": "many-login-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@many"
    }
  ]
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Many login feature test",
  "description": "",
  "id": "many-login-feature;many-login-feature-test",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is in the signin page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\"\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 7,
  "name": "",
  "description": "",
  "id": "many-login-feature;many-login-feature-test;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 8,
      "id": "many-login-feature;many-login-feature-test;;1"
    },
    {
      "cells": [
        "kashem1956@gmail.com",
        "Kashem5000"
      ],
      "line": 9,
      "id": "many-login-feature;many-login-feature-test;;2"
    },
    {
      "cells": [
        "nafasatzayan@gmail.com",
        "sohag123"
      ],
      "line": 10,
      "id": "many-login-feature;many-login-feature-test;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 9,
  "name": "Many login feature test",
  "description": "",
  "id": "many-login-feature;many-login-feature-test;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@many"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is in the signin page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters \"kashem1956@gmail.com\" and \"\u003cpassword\"\u003e",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "ManyLoginSteps.user_is_in_the_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 10,
  "name": "Many login feature test",
  "description": "",
  "id": "many-login-feature;many-login-feature-test;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@many"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is in the signin page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters \"nafasatzayan@gmail.com\" and \"\u003cpassword\"\u003e",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "ManyLoginSteps.user_is_in_the_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});