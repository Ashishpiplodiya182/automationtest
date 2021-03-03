package test;

import org.testng.annotations.Test;

import generics.baseclass;
import pom.clearTrip;

public class cleartrip_Test extends baseclass
{
	@Test
	public void validatehotelname() throws InterruptedException
	{
		clearTrip c = new clearTrip(driver);
		
		/*click on hotel link*/
		Thread.sleep(2000);
		c.clkhotellink();
		
		/*search the location*/
		Thread.sleep(2000);
		c.selectlocation("bhopal");
		
		/*click checkin calander icon*/
		Thread.sleep(2000);
		c.clkcalendericon();
		
		/*select the checkin date*/
		Thread.sleep(2000);
		c.sltcheckindate();
		
		/*select checkout date*/
		Thread.sleep(2000);
		c.sltcheckoutdate();
		
		/*select the value from dropdown*/
		Thread.sleep(2000);
		c.dwntraveller("1 room, 2 adults");
		
		/*click on search button hotel*/
		Thread.sleep(2000);
        c.btnsearchhotel();
		
        /*select the star filter*/
        Thread.sleep(2000);
        c.filterstar();
        
        /*select the travellers filter*/
        Thread.sleep(2000);
        c.filtertravellers();
        
        /*select the amenties filter*/
        Thread.sleep(2000);
        c.filteramenties();
        
        /*select the price filter*/
        Thread.sleep(2000);
        c.filterprice();
        
        /*click on view details button*/
        Thread.sleep(2000);
        c.btnviewdetails();
        
        /*switch to window*/
        Thread.sleep(2000);
        c.childWindowSwitch();
        
        /*get the expected hotel name*/
        Thread.sleep(2000);
        String exphotelname = c.exphotelname();
        System.out.println(exphotelname);
        /*click on select room button*/
        Thread.sleep(2000);
        c.btnselectroom();
        
        /*get expected hotel price*/
        Thread.sleep(2000);
        String exphotelprice = c.exphotelprice();
		
        /*click on book now button*/
        Thread.sleep(2000);
        c.btnbookroom();
        
        /*validate hotelname*/
        Thread.sleep(2000);
        c.validatehotelname(exphotelname);
        
        /*validate hotelprice*/
        Thread.sleep(2000);
        c.validatehotelprice(exphotelprice);
        
        
        
        
	}

}
