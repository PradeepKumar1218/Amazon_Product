package com.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base_components.Base_Component;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\featurefiles\\folder.feature", glue = "com.stepdefinition", plugin = {
		"html:report" })

public class TestRunner {
	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		driver = Base_Component.browser_Launch();
	}

	@AfterClass
	public static void tearDown() {

		driver.close();
	}
}
