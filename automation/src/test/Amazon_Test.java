package test;

import org.testng.annotations.Test;

import generics.baseclass;
import pom.Amazon_page;

public class Amazon_Test extends baseclass 
{
	@Test
	public void Amazontest() throws InterruptedException
	{
		Amazon_page a = new Amazon_page(driver);
		
		/*search for for product*/
		Thread.sleep(3000);
		a.txtSearchBox("AC");
		
		/*click on seemore tab*/
		Thread.sleep(3000);
		a.dropSeeMore();
		
		/*print all the product in ascending order*/
		Thread.sleep(3000);
		a.productNameprice();
	
		/*select split system filter*/
		Thread.sleep(2000);
		a.sllitSystem();
		
		/*select ton capacity*/
		Thread.sleep(2000);
		a.tonPower();
		
		/*select the discount*/
		Thread.sleep(2000);
		a.discount();
		
		/*get the expected price of product*/
		Thread.sleep(2000);
		 String expected = a.expectedPrice();
		
		/*click on the product*/
		Thread.sleep(2000);
		a.clkProductName();
		
		/*switch to window*/
		a.switchWindow();
		
		/*validate the product price*/
		Thread.sleep(2000);
		a.validateProductPrice(expected);
		
		
	}
	

}
