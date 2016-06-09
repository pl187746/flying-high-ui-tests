package edu.iis.mto.bdd.cucumber.pages;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(id="welcome-message")
	private WebElement welcomeMessage;
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void open() {
		driver.get("http://localhost:8080/#/home");
	}
	
	public void checkWelcomeMessage(String userFirstName) {
		assertThat(welcomeMessage.getText(), equalTo("Witaj " + userFirstName));
	}

}
