package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

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
			driver.manage().window().maximize();
			return driver;
		}
		
		@Test
		public void title()
		{
			System.out.println("Title is => "+driver.getTitle());
			Reporter.log("Title is => "+driver.getTitle());
		}
		
		
		
		
		

}
