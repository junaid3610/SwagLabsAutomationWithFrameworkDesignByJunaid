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
	public void ClickOnRemoveButton()
	{
		SwagLabsProductPage s = new SwagLabsProductPage(driver);
		s.removebtn();
	}
	
	
	
	
	
	
	
	
	

}
