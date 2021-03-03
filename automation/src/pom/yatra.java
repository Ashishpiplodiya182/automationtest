package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class yatra
{
	/*depart from txt box*/
	@FindBy(xpath="//input[@id='BE_flight_origin_city']")
	private WebElement txtdepart;
	
	/*banglore*/
	@FindBy(xpath="//p[text()='Bangalore ']/../..")
	private WebElement selectdepart;
	
	/*mumbai*/
	@FindBy(xpath="//p[text()='Mumbai ']/..")
	private WebElement selectarrival;
	
	/*departure calander*/
	@FindBy(xpath="//span[text()='Departure Date']/..")
	private WebElement departurecal;
	
	/*departure date*/
	@FindBy(xpath="//td[@data-date='27/02/2021']")
	private WebElement depdate;
	
	/* travaller selector class*/
	@FindBy(xpath="//i[contains(@class,'icon-angle-right')]")
	private WebElement traveller;

	/*no of adult*/
	@FindBy(xpath="//span[@id='adultPax']/following::div[1]/div/span[2]")
	private WebElement adult;
	
	/*select class*/
	@FindBy(xpath="//span[text()='Business']/..")
	private WebElement businessclass;
	
	/*search flight button*/
	@FindBy(id="BE_flight_flsearch_btn")
	private WebElement btnsearchflight;
	
	/*price filter*/
	@FindBy(xpath="//span[text()='Price ']/span")
	private WebElement clkfilterprice;
	
	/*no of stops*/
	@FindBy(xpath="//p[@class='font-lightgrey' and text()='0' ]")
	private WebElement sltnoOfStops;
	
	/*airlines checkbox*/
	@FindBy(xpath="//span[text()='Air India Business']/../span/i")
	private WebElement sltairLines;
	
	/*apply filter button*/
	@FindBy(xpath="//input[@value='Apply Filters']")
	private WebElement btnapplyFilter;
	
	/*flightdetails*/
	@FindBy(xpath="//div[text()='Flight Details']")
	private WebElement flightDetails;
	
	/*flightname*/
	@FindBy(xpath="//span[@class='i-b text ellipsis']")
	private WebElement flightname;
	
	/*flight code*/
	@FindBy(xpath="//span[@class='i-b text ellipsis']/following-sibling::p/span")
	private WebElement flightcode;
	
	/*departure  location*/
	@FindBy(xpath="//div[@class='pr-18 depart-det city pull-left text-left']/div[1]")
	private WebElement departureloc;
	
	/*departure time*/
	@FindBy(xpath="//div[@class='pr-18 depart-det city pull-left text-left']/div[2]")
	private WebElement departuretime;
	
	/*departure date*/
	@FindBy(xpath="//div[@class='pr-18 depart-det city pull-left text-left']/div[3]")
	private WebElement departuredate;
	
	/*arrival location*/
	@FindBy(xpath="//div[@class='text-center full-width schedule-det clearfix']/div[3]/div[1]")
	private WebElement arrivalloc;
	
	/*arrival time*/
	@FindBy(xpath="//div[@class='text-center full-width schedule-det clearfix']/div[3]/div[2]")
	private WebElement arrivaltime;
	
	/*arrival date*/
	@FindBy(xpath="//div[@class='text-center full-width schedule-det clearfix']/div[3]/div[3]")
	private WebElement arrivaldate;
	
	/*flight details close*/
	@FindBy(xpath="//span[@class='fs-22 i-b pr-15 pt-2 pull-right cursor-pointer ytfi-cancel']")
	private WebElement closedetails;
	
	/*book button*/
	@FindBy(xpath="//span[text()='AI-608']//following::div/button")
	private WebElement btnbook;
	
	/*validate flight code*/
	@FindBy(xpath="//span[@class='fs-xs gray-light ng-binding']")
	private WebElement validateflightcode;
	
	public yatra(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	/**
	 * Description Method depart textbox
	 * @author Ashish piplodiya
	 * @throws InterruptedException 
	 * 
	 */
	public void txtdepart(String depart) throws InterruptedException
	{
		txtdepart.click();
        Thread.sleep(2000);
		txtdepart.sendKeys(depart);
		txtdepart.sendKeys(Keys.ENTER);
		 /*Thread.sleep(2000);
		selectdepart.click();
		*/
	}


	
	/**
	 * Description Method select arrival
	 * @author Ashish piplodiya
	 * 
	 */
	public void toLoc()
	{
		selectarrival.click();
		
	}
	
	/**
	 * Description Method select departure date
	 * @author Ashish piplodiya
	 * @throws InterruptedException 
	 * 
	 */
	public void departurecal() throws InterruptedException
	{
		departurecal.click();
		Thread.sleep(2000);
		depdate.click();
		
	}
	
	/**
	 * Description Method select traveller
	 * @author Ashish piplodiya
	 * @throws InterruptedException 
	 * 
	 */
	public void traveller() throws InterruptedException
	{
		traveller.click();
		Thread.sleep(2000);
		adult.click();
		
	}

	/**
	 * Description Method select business class
	 * @author Ashish piplodiya
	 * 
	 */
	public void businessclass()
	{
		businessclass.click();
	}

	/**
	 * Description Method click on search flight button
	 * @author Ashish piplodiya
	 * 
	 */
	public void btnsearchFlight()
	{
		btnsearchflight.click();
	}

	/**
	 * Description Method click on price filter
	 * @author Ashish piplodiya
	 * 
	 */
	public void pricefilter()
	{
	 clkfilterprice.click();
	}
	

	/**
	 * Description Method click on noOfStops
	 * @author Ashish piplodiya
	 * 
	 */
	public void noOfStops()
	{
	 sltnoOfStops.click();
	}
	
	/**
	 * Description Method click on airlines
	 * @author Ashish piplodiya
	 * 
	 */
	public void airlines()
	{
	 sltairLines.click();
	}
	
	/**
	 * Description Method click on applyfilter button
	 * @author Ashish piplodiya
	 * 
	 */
	public void btnApplyFilter()
	{

btnapplyFilter.click();
	}
	
	/**
	 * Description Method click on flight details
	 * @author Ashish piplodiya
	 * 
	 */
	public  void clkflightdetails()
	{

     flightDetails.click();
	}
	
	
	/**
	 * Description Method give flight Name
	 * @author Ashish piplodiya
	 * 
	 */
	public String flightName()
	{

     String fliName = flightname.getText();
	return fliName;
	}
	
	
	
	/**
	 * Description Method give flight code
	 * @author Ashish piplodiya
	 * 
	 */
	public String flightCode()
	{

     String flcode = flightcode.getText();
	return flcode;
	}
	
	/**
	 * Description Method give dep location
	 * @author Ashish piplodiya
	 * 
	 */
	public String departureLoc()
	{

     String locdep = departureloc.getText();
	return locdep;
    		 
	}
	
	/**
	 * Description Method give dep date
	 * @author Ashish piplodiya
	 * 
	 */
	public String departureDate()
	{

     String dateDep = departuredate.getText();
	return dateDep;
    		 
	}
	
	/**
	 * Description Method give departrure time
	 * @author Ashish piplodiya
	 * 
	 */
	public String departureTime()
	{

     String dateTime = departuretime.getText();
	return dateTime;
    		 
	}
	
	/**
	 * Description Method give all the departure details
	 * @author Ashish piplodiya
	 * 
	 */
	
	public void alldeparturedetails()
	{
		System.out.println(flightName()+"  "+flightCode()+"  "+departureLoc()+" "+departureDate()+" "+departureTime() );
		
	}
	

	/**
	 * Description Method give arrival loc
	 * @author Ashish piplodiya
	 * 
	 */
	public String arrivalLoc()
	{

     String arrivalLoc = arrivalloc.getText();
	return arrivalLoc;
    		 
	}
	
	/**
	 * Description Method give arrival date
	 * @author Ashish piplodiya
	 * 
	 */
	public String arrivalDate()
	{

     String arrivalDate = arrivaldate.getText();
	return arrivalDate;
    		 
	}
	
	/**
	 * Description Method give arrival time
	 * @author Ashish piplodiya
	 * 
	 */
	public String arrivalTime()
	{

     String arrivalTime =arrivaltime.getText();
	return arrivalTime;
    		 
	}
	
	/**
	 * Description Method give all arrival details
	 * @author Ashish piplodiya
	 * 
	 */
	public void allarrivalDetails()
	{

    System.out.println(arrivalloc+" "+arrivaldate+" "+arrivaltime);
	}
	

	/**
	 * Description Method click on close details button
	 * @author Ashish piplodiya
	 * 
	 */
	public void closedetails()
	{
		closedetails.click();
	}
	

	/**
	 * Description Method click on book button
	 * @author Ashish piplodiya
	 * 
	 */
	public void bookButton()
	{
		btnbook.click();
	}


	/**
	 * Description Method validate flight code
	 * @author Ashish piplodiya
	 * 
	 */
	public void flightcode(String expected)
	{
		String actual = validateflightcode.getText();
		
		Assert.assertTrue(actual.contains(expected));
	}
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	

}
