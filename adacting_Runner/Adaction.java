package com.adacting_Runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\sanja\\eclipse-workspace\\Cucum\\src\\test\\java\\com\\Adactin_feature", glue = "com.adacting_step")
public class Adaction {
	public static WebDriver driver;

	@BeforeClass
	public static void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sanja\\eclipse-workspace\\Cucum\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	public static void teardown() {

	}
}