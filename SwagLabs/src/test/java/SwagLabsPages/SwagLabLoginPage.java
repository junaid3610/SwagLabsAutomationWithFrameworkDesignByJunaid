package SwagLabsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage {
	
//Declarations parts
	
	// sending user name into login field of swaglabs
	@FindBy(xpath="//input[@id=\"user-name\"]")
	private WebElement usrnm;
	
	// sending password into login field of swaglabs
	@FindBy(xpath="//input[@id=\"password\"]")
	private WebElement pswrd;
	
	// SwagLabs Image
	@FindBy(xpath="//img[@class=\"bot_column\"]")
	private WebElement img;
	
	// click on Login Button of Swaglabs
	@FindBy(xpath="//input[@id=\"login-button\"]")
	private WebElement login;
	
	
	
	
//  =============
	
	// initialisations
	// constructor
	
	public SwagLabLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
//=========================================	
	
// usage
	
	// usarname to login of swaglabs
	public void usarname()
	{
		usrnm.sendKeys("standard_user");
	}
	
	
	// password to login of swaglabs
	
	public void password()
	{
		pswrd.sendKeys("secret_sauce");
	}
	
	
	// check image is present or not
	public void image()
	{
		img.isDisplayed();
	}
	
	
	// click on Login Button
	public void Login()
	{
		login.click();
	}
	
	
	
	
	
	
	

}
