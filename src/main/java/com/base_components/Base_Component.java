package com.base_components;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.stepdefinition.FileInputStream;

public class Base_Component {
	public static WebDriver driver;

	public static WebDriver browser_Launch() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Santhosh\\SeleniumCourse\\CucumberMavenProject\\Drivers\\chromedriver.exe");
		return driver = new ChromeDriver();
	}

	public static void open_Url(String url) {
		driver.get(url);
	}

	public static void input_Data(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static void clickonElement(WebElement element) {
		element.click();
	}

	public static void screenShot(String ImageName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sc = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(
				"C:\\Users\\Santhosh\\SeleniumCourse\\CucumberMavenProject\\Screenshot_Proudct\\" + ImageName + ".png");
		FileHandler.copy(sc, des);
	}

	public static void write_Into_Excel(WebElement e, String text) {
		// TODO Auto-generated method stub
		text = e.getText();

	}

	public static void code_Read() {
		// TODO Auto-generated method stub
		File f = new File("C:\\\\Users\\\\Santhosh\\\\SeleniumCourse\\\\CucumberMavenProject\\\\data.xlsx");

		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet("TestData");
		Row row = sheet.createRow(1);
		Cell cell = row.createCell(1);
		FileOutputStream fos = new FileOutputStream("C:\\\\\\\\Users\\\\\\\\Santhosh\\\\\\\\SeleniumCourse\\\\\\\\CucumberMavenProject\\\\\\\\data.xlsx");
		workbook.write(fos);
		fos.close();

	}
}
