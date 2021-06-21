package Selenium.E2EProject;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.LandingPage;
import pageobject.LoginPage;

public class HomePage extends Base {

	@BeforeTest
	public void init() throws IOException {
		driver = initializeDriver();

		System.out.println(prop.getProperty("url"));
		driver.get(prop.getProperty("url"));
		

	}

	@Test(dataProvider = "getData")
	public void basePageNavigation(String userName, String password) throws IOException {
		LandingPage lp = new LandingPage(driver);		
		//lp.getLogin().click();
		
//		LoginPage loginPage = new LoginPage(driver);
//		loginPage.getEmailAddress().sendKeys(userName);
//		loginPage.getPassword().sendKeys(password);
//		loginPage.getLogin().click();

	}

	@AfterTest
	public void finish() {

	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[1][2];
		data[0][0] = "abc@gmail.com";
		data[0][1] = "gfsdg";

		return data;
	}
}
