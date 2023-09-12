package SwagLabsTestcases;

import org.testng.annotations.Test;

import Driver.ChromeBrowser;
import SwagLabsPages.SwagLabLoginPage;

public class SwagLabLoginTestCases extends ChromeBrowser {
	
	
	// username field for swaglabs
	
	@Test(priority = 1)
	public void UsernameSwaglabs()
	{
		SwagLabLoginPage s = new SwagLabLoginPage(driver);
		s.usarname();
	}
	
	// password field for swaglabs
	
	@Test(priority = 2)
	public void PasswordSwaglabs()
	{
		SwagLabLoginPage s = new SwagLabLoginPage(driver);
		s.password();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
