package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	By emailAddress = By.cssSelector("#user_email");
	By password = By.cssSelector("#user_password");
	By login = By.xpath("//input[@type=\"submit\"]");
	By title = By.xpath("//*[@id='content']/div/div/h2");
	
	public WebElement getEmailAddress() {
		return driver.findElement(emailAddress);
	}
	
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	public WebElement getLogin() {
		return driver.findElement(login);
	}
	
	
	public WebElement getTitle() {
		return driver.findElement(title);
	}

}
