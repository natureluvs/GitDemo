package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	By login = By.xpath("//*[@id=\"homepage\"]/header/div[1]/div/nav/ul/li[4]/a/span");
	
	public WebElement getLogin() {
		return driver.findElement(login);
	}

}
