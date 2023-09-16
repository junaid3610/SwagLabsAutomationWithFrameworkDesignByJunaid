package ExtentReports;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BasicExtentReports {
	
	
	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeTest
	public void startReport()
	{
		// initialise the varibale
		htmlReporter = new ExtentSparkReporter("ExtentReportDemo.html");
		reports = new ExtentReports();
		// now attache htmlReporter to reports
		reports.attachReporter(htmlReporter);
		
		// add environment details
		
		reports.setSystemInfo("Machine", "HP");
		reports.setSystemInfo("OS", "Windows 10");
		reports.setSystemInfo("Ram", "4 GB");
		reports.setSystemInfo("Harddisk", "1 TB");
		reports.setSystemInfo("Browser", "Chrome");
		 
		// configurationto change look
		
		htmlReporter.config().setDocumentTitle("Extent Report Demo");
		htmlReporter.config().setReportName("Test Report");
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy,hh:mm a '('zzz')'");
		
	}
	
	// this method will execute after every method to collect the result of that method
	@AfterMethod
	public void getTestResult(ITestResult result)
	{
		// this is for fail testcases
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" Failed",ExtentColor.RED ));
			
		}
		// this is for pass testcases
		else if(result.getStatus()==ITestResult.SUCCESS )
		{
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+ " Passed",ExtentColor.GREEN ));
			
		}
		
		// this is for Skip testcases
		else if(result.getStatus()==ITestResult.SKIP )
		{
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+ " Skipped",ExtentColor.YELLOW ));
			
		}
		
	}
	
	
	// creating one method to write al log information of test result this is mandatory method
	
	@AfterTest
	public void tearDown()
	{
		reports.flush();
	}
	
	
	
	
	
	
	
	

}
