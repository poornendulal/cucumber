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
formatter.step({
  "name": "Enter search term",
  "keyword": "Given "
});
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
formatter.match({
  "location": "SearchGoogle.then()"
});
formatter.result({
  "status": "passed"
});
});