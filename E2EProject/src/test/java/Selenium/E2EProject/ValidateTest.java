package Selenium.E2EProject;

import static org.testng.Assert.assertEquals;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pageobject.LandingPage;
import pageobject.LoginPage;

public class ValidateTest extends Base{
	
	
	@BeforeTest
	public void init() throws IOException {
		driver = initializeDriver();		
		driver.get(prop.getProperty("url"));					
		
		log.info("Finally in validate initialize!!!!!!!!!!!!!!!!!!!!!!");
	}

	@Test
	public void validateCourseTitle() {
					
		
		LoginPage loginPage = new LoginPage(driver);
		
		Assert.assertEquals(loginPage.getTitle().getText(),"FEATURED COURSES");
		
	}
	
	@AfterTest
	public void finish() {
		
	}
	
}
