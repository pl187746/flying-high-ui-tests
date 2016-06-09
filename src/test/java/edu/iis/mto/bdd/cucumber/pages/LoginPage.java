package edu.iis.mto.bdd.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebElement email;
	private WebElement password;
	private WebElement signin;
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void open() {
		driver.get("http://localhost:8080/#/welcome");
	}
	
	public void signInWithCredintials(String userEmail, String userPassword) {
		email.sendKeys(userEmail);
		password.sendKeys(userPassword);
		signin.click();
	}

}
