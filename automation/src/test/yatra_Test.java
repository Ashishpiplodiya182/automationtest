package test;

import org.testng.annotations.Test;

import generics.baseclass;
import pom.yatra;

public class yatra_Test extends baseclass
{
	@Test
	public void yantracodevalidate() throws InterruptedException
	{
		
		yatra y = new yatra(driver);
		
		/*enter on departure*/
		Thread.sleep(2000);
		y.txtdepart("ban");
		
		/*select to location*/
		Thread.sleep(2000);
		y.toLoc();
		
		/*select departure location*/
		Thread.sleep(2000);
		y.departurecal();
		
		/*select the traveller*/
		Thread.sleep(2000);
		y.traveller();
		
		/*select the class*/
		Thread.sleep(2000);
		y.businessclass();
		
		/*click on search flight*/
		Thread.sleep(2000);
		y.btnsearchFlight();
		
		/*click on price filter*/
		Thread.sleep(2000);
		y.pricefilter();
		
		/*click on no of stops*/
		Thread.sleep(2000);
		y.noOfStops();
		
		/*click on airlines*/
		Thread.sleep(2000);
		y.airlines();
		
		/*click on btnapply filter*/
		Thread.sleep(2000);
		y.btnApplyFilter();
		
		/*click on flight details*/
		Thread.sleep(4000);
		y.clkflightdetails();
		
		/*all deparrture details*/
		Thread.sleep(2000);
		y.alldeparturedetails();
		
		/*all arrival details*/
		Thread.sleep(2000);
		y.allarrivalDetails();
		
		/*click on close details*/
		Thread.sleep(2000);
		y.closedetails();
		
		/*click on book details*/
		Thread.sleep(2000);
		y.bookButton();
		
		
		
		
		
	}

}
