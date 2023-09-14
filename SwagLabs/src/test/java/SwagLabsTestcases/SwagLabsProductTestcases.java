package SwagLabsTestcases;

import org.testng.annotations.Test;

import SwagLabsPages.SwagLabsProductPage;

public class SwagLabsProductTestcases extends SwagLabLoginTestCases {
	
	
	@Test(priority = 5)
	public void ClickOnSauceLabsBackPack() throws InterruptedException
	{
		SwagLabsProductPage s = new SwagLabsProductPage(driver);
		s.SauceBag();
	} 
	
	@Test(priority = 6)
	public void AddToCart()
	{
		SwagLabsProductPage s = new SwagLabsProductPage(driver);
		s.Add();
	}
	
	// check add to cart option
	@Test(priority = 7)
	public void CheckCart()
	{
		SwagLabsProductPage s = new SwagLabsProductPage(driver);
		s.checkcart();
	}
	
	// click on remove button from add to cart
	@Test(priority = 8)
	public void ClickOnRemoveButton() throws InterruptedException
	{
		SwagLabsProductPage s = new SwagLabsProductPage(driver);
		s.removebtn();
	}
	
	// come back to continue shopping page
	
	@Test(priority = 9)
	public void ClickOnContinueShoppingButton()
	{
		SwagLabsProductPage s = new SwagLabsProductPage(driver);
		s.clickoncontshop();
	}
	
	//count the total products on product page
	@Test(priority = 10)
	public void CounTheProducts()
	{
		SwagLabsProductPage s = new SwagLabsProductPage(driver);
		s.countprod();
	}
	
	// click on meno button
	@Test(priority = 11)
	public void ClickOnMenuBar()
	{
		SwagLabsProductPage s = new SwagLabsProductPage(driver);
		s.clickonmenu();
	}
	
	// Click On Logout to application
	@Test(priority = 12)
	public void ClickOnLogOut()
	{
		SwagLabsProductPage s = new SwagLabsProductPage(driver);
		s.LOGout();
	}
	
	
	
	

}
