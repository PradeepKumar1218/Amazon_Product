$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/com/featurefiles/folder.feature");
formatter.feature({
  "name": "Order products in Amazon application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Home page in amazon application",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user launch the application url",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_launch_the_application_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on signin button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_signin_button()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.WebDriver.manage()\" because \"com.stepdefinition.StepDefinition.driver\" is null\r\n\tat com.stepdefinition.StepDefinition.user_clicks_on_signin_button(StepDefinition.java:33)\r\n\tat ✽.user clicks on signin button(file:src/test/java/com/featurefiles/folder.feature:5)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Sign in module",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user enter mobile number in mobile number field",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enter_mobile_number_in_mobile_number_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on continue button",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "enter password",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click on sign in button",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Home page after signed in",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "enter iphone in search module",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click on search icon",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Product page of amazon application",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "select product from the product page",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click on add to cart",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click on proceed to checkout",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Product quantity page in application",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "capture the screen",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Assert the price and put it in excel",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});