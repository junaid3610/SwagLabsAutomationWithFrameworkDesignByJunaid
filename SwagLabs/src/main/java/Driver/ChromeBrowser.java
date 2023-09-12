package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ChromeBrowser {
	
	
	 protected WebDriver driver;
		
		@BeforeClass
		public WebDriver ChromeDriver() 
		{
			System.setProperty("webdriver.chrome,driver", "C:\\Users\\hp\\Downloads\\Selenium jars\\chromedriver_win32 (5)\\chromedriver.exe");		
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*");		
			driver = new ChromeDriver(opt);
			driver.get("https://www.saucedemo.com/v1/");
			return driver;
		}
		
		@Test
		public void title()
		{
			System.out.println("Title is => "+driver.getTitle());
			Reporter.log("Title is => "+driver.getTitle());
		}
		

}
