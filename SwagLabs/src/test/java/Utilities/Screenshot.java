package Utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Screenshot {
	
	
	
	WebDriver driver;
	
	
	public void TakeScreenShot() throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\hp\\OneDrive\\Desktop\\New folder (4)\\SwagLabs.png");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		
		FileUtils.contentEquals(src, dest);
	}
	
	
	
	
	
	
	

}
