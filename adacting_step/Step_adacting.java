package com.adacting_step;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adacting_Runner.Adaction;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_adacting {
	public static WebDriver driver = Adaction.driver;

	@Given("user Launch The Url")
	public void user_launch_the_url() {
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
	}

	@When("user Enter The Username In The Text Box")
	public void user_enter_the_username_in_the_text_box() {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("KarthickSanjay");

	}

	@When("user Enter The Password In The Text Box")
	public void user_enter_the_password_in_the_text_box() {
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		pwd.sendKeys("2760RY");

	}

	@Then("user Click The Login button and Navigate The Search Hotel")
	public void user_click_the_login_button_and_navigate_the_search_hotel() {
		WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
		login.click();

	}

	@When("user Select The Location")
	public void user_select_the_location() {
		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		Select s = new Select(location);
		s.selectByValue("Melbourne");

	}

	@When("user Select The Hotel")
	public void user_select_the_hotel() {
		WebElement hotel = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select s1 = new Select(hotel);
		s1.selectByVisibleText("Hotel Sunshine");

	}

	@When("user Select The Room_Type")
	public void user_select_the_room_type() {
		WebElement room = driver.findElement(By.id("room_type"));
		Select s2 = new Select(room);
		s2.selectByIndex(3);

	}

	@When("user Select The Room_Number")
	public void user_select_the_room_number() {
		WebElement roomno = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select s3 = new Select(roomno);
		s3.selectByValue("3");

	}

	@When("user Select The Adult_Room")
	public void user_select_the_adult_room() {
		WebElement adultroom = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(adultroom);
		s4.selectByValue("2");

	}

	@When("user Select The Child_Room")
	public void user_select_the_child_room() {
		WebElement child = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select s5 = new Select(child);
		s5.selectByIndex(3);

	}

	@Then("user Click The Submit button Navigate To The Select Hotel")
	public void user_click_the_submit_button_navigate_to_the_select_hotel() throws InterruptedException {

		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
		Thread.sleep(3000);

	}

	@When("user click the Radio button")
	public void user_click_the_radio_button() throws InterruptedException {
		WebElement radio = driver.findElement(By.id("radiobutton_0"));
		radio.click();
		Thread.sleep(2000);

	}

	@Then("user click the Continue button and Navigate The Book A Hotel")
	public void user_click_the_continue_button_and_navigate_the_book_a_hotel() {
		driver.findElement(By.xpath("//input[@name='continue']")).click();

	}

	@When("user Enter The First Name In The Text Box")
	public void user_enter_the_first_name_in_the_text_box() {
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Karthick");

	}

	@When("user Enter The Last Name In The Text Box")
	public void user_enter_the_last_name_in_the_text_box() {
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Sanjay");

	}

	@When("user Enter The Address In The Text Box")
	public void user_enter_the_address_in_the_text_box() throws InterruptedException {
		WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
		Thread.sleep(2000);
		address.sendKeys("abc 17/10 miller street austraila victoria 87653");

	}

	@When("user Enter The CC_Number In The Text Box")
	public void user_enter_the_cc_number_in_the_text_box() {
		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("1234567890123456");

	}

	@When("user Select The Card Type")
	public void user_select_the_card_type() {
		WebElement cardtype = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select s8 = new Select(cardtype);
		s8.selectByValue("VISA");

	}

	@When("user Select The Expiry Month")
	public void user_select_the_expiry_month() {
		WebElement expmonth = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select s9 = new Select(expmonth);
		s9.selectByVisibleText("March");

	}

	@When("user Select The Expiry Year")
	public void user_select_the_expiry_year() {
		WebElement expyear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select s10 = new Select(expyear);
		s10.selectByValue("2022");

	}

	@When("user Enter The CVV Number In The Text Box")
	public void user_enter_the_cvv_number_in_the_text_box() {
		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("765");

	}

	@When("user Click The Book Now button")
	public void user_click_the_book_now_button() {
		driver.findElement(By.id("book_now")).click();

	}

	@Then("user Click The Myitinerary button and Navigate Booked Itenerary")
	public void user_click_the_myitinerary_button_and_navigate_booked_itenerary() {
		driver.findElement(By.xpath("//input[@id='my_itinerary']")).click();

	}

	@When("user Takes The Screenshot")
	public void user_takes_the_screenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sc = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\sanja\\eclipse-workspace\\Cucum\\scrn\\cucu.png");
		FileUtils.copyFile(sc, des);
	}


}
