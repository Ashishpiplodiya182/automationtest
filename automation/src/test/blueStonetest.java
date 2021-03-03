package test;

import org.testng.annotations.Test;

import generics.baseclass;
import pom.Bluestone_page;

public class blueStonetest extends baseclass

{
    @Test
	public void validateProduct() throws InterruptedException
	{
		
	Bluestone_page pages = new Bluestone_page(driver);	
		
	    Thread.sleep(2000);
	    /*mouse hover on rings*/
		pages.hoverRingsTab();
		
		Thread.sleep(2000);
		/*click on diamond ring*/
		pages.clkDiamondRing();
		
		Thread.sleep(2000);
		/*click print all 0% making change price*/
		pages.printMakingCharge();
		
		Thread.sleep(2000);
		/*mouse hover on first product*/
		pages.hoverFirstProduct();
		
		Thread.sleep(2000);
		/*click on view details tab*/
		pages.btnViewDetetails();
		
		Thread.sleep(2000);
		/*switch to child window*/
		pages.childWindowSwitch();
		
		Thread.sleep(2000);
		/*enter pincode and validate text*/
		pages.validatePincode("450001");
		
		Thread.sleep(2000);
		/*select ring size*/
		pages.ringSize();
		
	    /*getproduct name*/
		String expectedname = pages.getProductName();
		
		/*get product price*/
		String expectedprice = pages.getProductPrice();
		
		Thread.sleep(2000);
		/*click on buynow button*/
		pages.clkBuyNowbtn();
		
		Thread.sleep(2000);
		/*validate producat name*/
		pages.validateProductname(expectedname);
		
		Thread.sleep(2000);
		/*valiate product price*/
		pages.validateProductprice(expectedprice);
		
		
	}
	
}
