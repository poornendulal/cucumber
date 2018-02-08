$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/demo.feature");
formatter.feature({
  "name": "search google",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "direct search page",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Enter search term",
  "keyword": "Given "
});
formatter.write("entered search text");
formatter.match({
  "location": "SearchGoogle.given()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Do search",
  "keyword": "When "
});
formatter.write("searched");
formatter.match({
  "location": "SearchGoogle.when()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Results are shown for",
  "keyword": "Then "
});
formatter.write("verified");
formatter.match({
  "location": "SearchGoogle.then()"
});
formatter.result({
  "status": "passed"
});
});