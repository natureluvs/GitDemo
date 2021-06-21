package Selenium.E2EProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Base {
	
	public WebDriver driver ;
	public Properties prop ;
	
	public static Logger log;
	
	@SuppressWarnings("deprecation")
	public WebDriver initializeDriver() throws IOException {
				
		log = LogManager.getLogger(getClass());
		
		prop = new Properties();
				
		FileInputStream fis = new FileInputStream("C:\\Users\\Muthu\\eclipse-workspace\\Selenium\\E2EProject\\src\\resources\\data.properties");
		prop.load(fis);
		
		String browserName = prop.getProperty("broswer");
		
		switch(browserName){
			case "chrome":
				System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Browser Drivers\\\\\\\\chromedriver.exe");
				driver = new ChromeDriver();
				break;
			case "firefox":
				System.setProperty("webdriver.gecko.driver", "C:\\\\\\\\Browser Drivers\\\\\\\\geckodriver.exe");
				driver = new FirefoxDriver();
				break;
			case "IE":
				System.setProperty("webdriver.ie.driver", "C:\\\\\\\\Browser Drivers\\\\\\\\IEDriverServer.exe");				
				
				InternetExplorerOptions options = new InternetExplorerOptions();
				options.ignoreZoomSettings();
				WebDriver driver = new RemoteWebDriver(options);
				break;
			default:
				System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Browser Drivers\\\\\\\\chromedriver.exe");
				driver = new ChromeDriver();
				
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
		
	}
}
