$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/Tharini/Eclips WorkSpace/walmart.com/src/test/resources/Features/LoginPage.feature");
formatter.feature({
  "name": "Login Walmart",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch chrome browser and load url",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionWalmart.launch_chrome_browser_and_load_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "One",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Click women and hoodies",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionWalmart.click_women_and_hoodies()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click size and choose s",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionWalmart.click_size_and_choose_s()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click autumn and click purple",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionWalmart.click_autumn_and_click_purple()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch chrome browser and load url",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionWalmart.launch_chrome_browser_and_load_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Two",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Click men and tees",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionWalmart.click_men_and_tees()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click colour and size s",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionWalmart.click_colour_and_size_s()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat walmart.com.StepDefinitionWalmart.click_colour_and_size_s(StepDefinitionWalmart.java:54)\r\n\tat ✽.click colour and size s(E:/Tharini/Eclips WorkSpace/walmart.com/src/test/resources/Features/LoginPage.feature:17)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});