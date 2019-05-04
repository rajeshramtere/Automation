package com.basic.allfilesinsamefolder;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test1StepDefs {
	
	WebDriver driver;

	@Given("the user is on facebook login page")
	public void the_user_is_on_facebook_login_page()
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\SeleniumSoftwares\\Selenium\\chromedriver_win32_B45\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
	}
	
	//^String$ = Looks for exact string

@When("^he enters \"([^\"]*)\" as username$")
public void he_enters_as_username(String arg1) {

	//driver.findElement(By.xpath("//table/tbody/tr/td/input[@name = 'email']")).sendKeys(arg1);
	driver.findElement(By.id("email")).sendKeys(arg1);
    
}

@When("^he enteres \"([^\"]*)\" as password$")
public void he_enteres_as_password(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   // driver.findElement(By.xpath("//table/tbody/tr/td/input[@name = 'pass']")).sendKeys(arg1);
}

@Then("^check username is present in textbox$")
public void check_username_is_present_in_textbox() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("^I am checking facebook login page$")
public void i_am_checking_facebook_login_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}


}
