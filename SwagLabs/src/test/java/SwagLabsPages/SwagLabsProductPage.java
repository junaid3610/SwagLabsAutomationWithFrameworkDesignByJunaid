package SwagLabsPages;

import java.time.Duration;
import java.util.List;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

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
	
	// come back to continue shopping page
	@FindBy(xpath="//a[@class=\"btn_secondary\"]")
	private WebElement contshop;
	
	//count the total products on product page
	@FindBys({@FindBy(xpath="//div[@class=\"inventory_list\"]/div")})
	private List<WebElement> countproducts;
	
	// click on meno button
	@FindBy(xpath="//button[text()=\"Open Menu\"]")
	private WebElement menu;
	
	// Click On Logout to application
	@FindBy(xpath="//a[@id=\"logout_sidebar_link\"]")
	private WebElement logout;
	
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
	
	public void removebtn() throws InterruptedException 
	{
		Thread.sleep(2000);
		remove.click();
		
	}
	
	// come back to continue shopping page
	public void clickoncontshop()
	{
		contshop.click();
	}
	
	//count the total products on product page
	public void countprod()
	{
		try {
			for(int i=1;i<=countproducts.size();i++) {
				System.out.println(countproducts.get(i).getText());
				
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	// click on meno button
	public void clickonmenu()
	{
		menu.click();
		Reporter.log("This method is for to click on menu bar");
	}
			
	// Click On Logout to application
	public void LOGout()
	{
		logout.click();
		Reporter.log("This method is for Logout to application");
	}
	
	
	
	
}
