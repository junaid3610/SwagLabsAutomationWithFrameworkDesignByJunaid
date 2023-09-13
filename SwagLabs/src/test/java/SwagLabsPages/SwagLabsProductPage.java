package SwagLabsPages;

import java.time.Duration;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwagLabsProductPage {

	WebDriver driver;
// decleration	

	//click on SauceLabs Backpacks 
	@FindBy(xpath="//a[@id=\"item_4_title_link\"]")
	private WebElement Saucbag;
	
	// click on Add To Cart button
	@FindBy(xpath="//button[@class=\"btn_primary btn_inventory\"]")
	 private WebElement addc;
	
	
	//check the cart
	@FindBy(xpath="//a[@class=\"shopping_cart_link fa-layers fa-fw\"]")
	private WebElement cart;
	
	// click on remove add to cart
	@FindBy(xpath="//button[@class=\"btn_secondary cart_button\"]")
	private WebElement remove;
	
// ===========================	
	// Initialisation
	
	public SwagLabsProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
// ===========================	
	
	// Usage

	//click on SauceLabs Backpacks 
//Note= in this case i am using thread sleep, b'coz this element is taking more to load.
	public void SauceBag() throws InterruptedException
	{
		Thread.sleep(3000);;
		Saucbag.click();		
	}
	
	// click on Add to cart
	public void Add()
	{
		addc.click();
	}
	
	// check cart
	public void checkcart()
	{
		cart.click();
	}
	
	// click on remove button from add to cart
	
	public void removebtn() 
	{
		remove.click();
		
	}
	
	

}
