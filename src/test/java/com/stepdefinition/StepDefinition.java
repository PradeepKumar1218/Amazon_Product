package com.stepdefinition;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.base_components.Base_Component;
import com.pom.Home_Page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends Base_Component {
	public static WebDriver driver;

	public static Home_Page hp = new Home_Page(driver);

	@Given("user launch the application url")
	public void user_launch_the_application_url() {
		open_Url("https://www.amazon.in/");
	}

	@Then("user clicks on signin button")
	public void user_clicks_on_signin_button() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		clickonElement(hp.getSingin_Button());
	}

	@When("user enter mobile number in mobile number field")
	public void user_enter_mobile_number_in_mobile_number_field() {
		input_Data(hp.getUsername(), "9629611959");
	}

	@Then("click on continue button")
	public void click_on_continue_button() {
		// Write code here that turns the phrase above into concrete actions
		clickonElement(hp.getContinue_Button());
	}

	@When("enter password")
	public void enter_password() {
		// Write code here that turns the phrase above into concrete actions
		input_Data(hp.getPassword(), "9629611959");
	}

	@Then("click on sign in button")
	public void click_on_sign_in_button() {
		// Write code here that turns the phrase above into concrete actions
		clickonElement(hp.getSingin_Button());
	}

	@When("enter iphone in search module")
	public void enter_iphone_in_search_module() {
		// Write code here that turns the phrase above into concrete actions
		input_Data(hp.getData_input(), "iphone" + Keys.ENTER);
	}

	@When("select product from the product page")
	public void select_product_from_the_product_page() {
		// Write code here that turns the phrase above into concrete actions
		clickonElement(hp.getProduct());
	}

	@Then("click on add to cart")
	public void click_on_add_to_cart() {
		// Write code here that turns the phrase above into concrete actions
		clickonElement(hp.getAdd_to_Cart());
	}

	@When("capture the screen")
	public void capture_the_screen() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		screenShot("proeedtocheckout");
	}

	@Then("Assert the price and put it in excel")
	public void assert_the_price_and_put_it_in_excel() {
		// Write code here that turns the phrase above into concrete actions
		write_Into_Excel(hp.getPrice_Assert(), code_Read());

	}

}
