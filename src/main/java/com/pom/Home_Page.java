package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

	WebDriver driver;
	public Home_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href=\"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&\"]")
	WebElement signin_Button;
	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement search_Button;
	
	@FindBy(xpath = "//input[@type='email']")
	WebElement username;
	
	@FindBy(id = "continue")
	WebElement continue_Button;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement password;
	
	@FindBy(id = "signInSubmit")
	WebElement singin_Button;
	
	@FindBy(id = "twotabsearchtextbox")
	WebElement data_input;
	
	@FindBy(xpath = "//span[text()='Apple iPhone 13 (128GB) - Starlight']")
	WebElement product;
	
	@FindBy(xpath = "//input[@title='Add to Shopping Cart']")
	WebElement add_to_Cart;
	
	@FindBy(xpath = "//span[@class=\"a-price-whole\"]")
	WebElement price_Assert;
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getContinue_Button() {
		return continue_Button;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSingin_Button() {
		return singin_Button;
	}

	public WebElement getData_input() {
		return data_input;
	}

	public WebElement getProduct() {
		return product;
	}

	public WebElement getAdd_to_Cart() {
		return add_to_Cart;
	}

	public WebElement getPrice_Assert() {
		return price_Assert;
	}

	
	
	public WebElement getSearch_Button() {
		return search_Button;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSignin_Button() {
		return signin_Button;
	}
}
