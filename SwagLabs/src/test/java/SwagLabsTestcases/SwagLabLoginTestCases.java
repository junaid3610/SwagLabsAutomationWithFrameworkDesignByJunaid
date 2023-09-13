package SwagLabsTestcases;



import org.testng.annotations.Test;
import Driver.ChromeBrowser;
import SwagLabsPages.SwagLabLoginPage;


public class SwagLabLoginTestCases extends ChromeBrowser {
	
// Note :- if you are getting TestNg Exception so in this case you need to update your project.
	// you can update project like this, right click on project and goto maven and select update project.
	
	
	
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
	
	// Swaglabs image 
	@Test(priority = 3)
	public void DisplayImage()
	{
		SwagLabLoginPage s = new SwagLabLoginPage(driver);
		s.image();
	}
	
	
	// click on login button
	
	@Test(priority = 4)
	public void ClickOnLoginButton()
	{
		SwagLabLoginPage s = new SwagLabLoginPage(driver);
		s.Login();
	}
	
	
	
	
	
	
	
	
	
	

}
