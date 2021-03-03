package pom;

import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.CheckedInputStream;

import org.apache.poi.xssf.streaming.SXSSFPicture;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import generics.Filelib;
import generics.baseclass;

public class clearTrip extends baseclass
{
	/*hotels link*/
	@FindBy(xpath="//li[@id='hotelLink']/a[1]")
	private WebElement hotels;
	
	/*location search box*/
	@FindBy(xpath="//input[@id='Tags']")
	private WebElement txtsearch;
	
	/*check in calender*/
	@FindBy(xpath="(//i[@class='calendarIcon datePicker'])[1]")
	private WebElement calcheckin;
	
	/*checkout calender*/
	@FindBy(xpath="(//i[@class='calendarIcon datePicker'])[2]")
	private WebElement calcheckout;
	
	/*from date*/
	@FindBy(xpath="(//a[text()='27'])[1]")
	private WebElement sltfromdate;
	
	/*to date*/
	@FindBy(xpath="(//a[text()='28'])[1]")
	private WebElement slttoDate;
	
	/*travellers information*/
	@FindBy(id="travellersOnhome")
	private WebElement dwntravellers;
	
	/*search hotel button*/
	@FindBy(id="SearchHotelsButton")
	private WebElement btnsearchhotel;
	
	/*price filter*/
	@FindBy(xpath="//input[@value='4000-6000']/following-sibling::div[1]")
	private WebElement pricefilter;
	
	/*star ratings*/
	@FindBy(xpath="//input[@value='3']/following-sibling::div[1]")
	private WebElement starfilter;

	/*traveller rating*/
	@FindBy(xpath="//input[@value='3.5-5']/following-sibling::div[1]")
	private WebElement travellerfilter;
	
	/*amenties*/
	@FindBy(xpath="//input[@value='amAC']/following-sibling::div[1]")
	private WebElement amentiesfilter;
	
	/*view details button*/
	@FindBy(xpath="//button[@class='button booking hotelDetails']")
	private WebElement btnviewdetails;
	
	/*exp hotel name*/
	@FindBy(xpath="//h1[contains(text(),'Hotel Tulsi Exotic')]")
	private WebElement exphotelname;
	
	/*select room*/
	@FindBy(xpath="//a[@class='button booking scrollToRoomRates']")
	private WebElement btnselectroom;
	
	/*exp hotel price*/
	@FindBy(xpath="//h4[contains(text(),'Luxury Room')]/following-sibling::div/div[2]/ul[1]/li[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]")
	private WebElement exppricehotel;
	
	/*book button*/
	@FindBy(xpath="//h4[contains(text(),'Luxury Room')]/following-sibling::div/div[2]/ul[1]/li[1]/div[2]/div[1]/div[2]/div[1]/button")
	private WebElement btnbook;
	
	/*actual hotel name*/
	@FindBy(xpath="//div[@class='row hotelItinerary']/h1")
	private WebElement acthotelname;
	
	/*actual hotel price*/
	@FindBy(xpath="//span[@id='counter']")
	private WebElement acthotelprice;
	
	public clearTrip(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * Description Method click on hotel links
	 * @author Ashish piplodiya
	 * 
	 */
	public void clkhotellink()
	{
		hotels.click();
	}
	

	/**
	 * Description Method enter the location
	 * @author Ashish piplodiya
	 * @throws InterruptedException 
	 * 
	 */
	public void selectlocation(String loc) throws InterruptedException
	{
		txtsearch.sendKeys(loc);
		//txtsearch.sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		txtsearch.sendKeys(Keys.ENTER);
	}
	
	
	/**
	 * Description Method click the calender icon
	 * @author Ashish piplodiya
	 * 
	 */
	public void clkcalendericon()
	{
		
		calcheckin.click();
	}
	
	
	/**
	 * Description Method select the from date
	 * @author Ashish piplodiya
	 * 
	 */
	public void sltcheckindate()
	{
	
		sltfromdate.click();
	}
	
	/**
	 * Description Method select the to date
	 * @author Ashish piplodiya
	 * 
	 */
	public void sltcheckoutdate()
	{
	
		slttoDate.click();
	}
	
	/**
	 * Description Method select travellers from the dropdown
	 * @author Ashish piplodiya
	 * 
	 */
	public void dwntraveller(String value)
	{
	Filelib f = new Filelib();
	f.selectbytext(dwntravellers,value);
	}
	
	/**
	 * Description Method click on search hotel button
	 * @author Ashish piplodiya
	 * 
	 */
	public void btnsearchhotel()
	{
	
		btnsearchhotel.click();
	}
	
	/**
	 * Description Method select the stars
	 * @author Ashish piplodiya
	 * 
	 */
	public void filterstar()
	{
	
		starfilter.click();
	}
	
	/**
	 * Description Method select the travelers filter
	 * @author Ashish piplodiya
	 * 
	 */
	public void filtertravellers()
	{
	
	travellerfilter.click();
	}
	
	/**
	 * Description Method select the amenties filter
	 * @author Ashish piplodiya
	 * 
	 */
	public void filteramenties()
	{
	
	amentiesfilter.click();
	}
	
	/**
	 * Description Method select the travelers filter
	 * @author Ashish piplodiya
	 * 
	 */
	public void filterprice()
	{
	
	pricefilter.click();
	}
	
	/**
	 * Description Method click on view details button
	 * @author Ashish piplodiya
	 * 
	 */
	public void btnviewdetails()
	{
	
	btnviewdetails.click();
	}
	
	/**
	 * Description Method click on select room button
	 * @author Ashish piplodiya
	 * 
	 */
	public void btnselectroom()
	{
	
	   btnselectroom.click();
	}
	
	/**
	 * Description Method will give expected hotel price
	 * @author Ashish piplodiya
	 * 
	 */
	public String exphotelprice()
	{
	
	  String expprice = exppricehotel.getText();
	return expprice;
	}
	
	/**
	 * Description Method will give expected hotel name
	 * @author Ashish piplodiya
	 * 
	 */
	public String exphotelname()
	{
	
	  String exphotel = exphotelname.getText();
	return exphotel;
	}
	
	
	/**
	 * Description Method click on book button
	 * @author Ashish piplodiya
	 * 
	 */
	public void btnbookroom()
	{
	
	   btnbook.click();
	}
	
	
	
	/**
	 * Description Method validate hotel name
	 * @author Ashish piplodiya
	 * 
	 */
	public void validatehotelname(String expected)
	{
		String actual = acthotelname.getText();
		System.out.println(actual);
		Assert.assertTrue(expected.contains(actual));
	}
	/**
	 * Description Method validate hotel price
	 * @author Ashish piplodiya
	 * 
	 */
	public void validatehotelprice(String expected)
	{
		String actual = acthotelprice.getText();
		System.out.println(actual
				);
		Assert.assertTrue(expected.contains(actual));
	}
	
	/**
	 * Description Method switchToChildWindow
	 * @author Ashish piplodiya
	 * 
	 */
	public void childWindowSwitch()
	{
		 Set<String> wh = driver.getWindowHandles();
		 
		 Iterator<String> itr = wh.iterator();
		 
		 String parentid = itr.next();
		 String childid = itr.next();
		 driver.switchTo().window(childid);
   }
	
    	

}
