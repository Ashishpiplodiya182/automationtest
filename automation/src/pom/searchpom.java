package pom;



import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import generics.Filelib;
import generics.baseclass;

public class searchpom extends baseclass
{
	@FindBy(id="inputValEnter")
	private WebElement searchbox;
	
	@FindBy(className="searchTextSpan")
	private WebElement searchbtn;
	

	@FindBy(xpath="//label[@for=\"Color_s-Black\"]")
	private WebElement colorfilter;
	

	@FindBy(xpath="//label[@for='Material_s-Leather']")
	private WebElement materialfilter;
	
	@FindBy(xpath="//p[contains(text(),'Apple') or contains(text(),'iPhone')]")
	private List<WebElement> allresults;
	
	@FindBy(xpath="//div[@class='product-tuple-image ']")
	private WebElement firstresult; 
	
	@FindBy(xpath="//p[@class='product-title']/../div[1]/div[1]/span")
	private WebElement expprice;
	
	@FindBy(xpath="//span[@class=\"pdp-final-price\"]")
	private WebElement actprice;
	
	@FindBy(id="pushDenied")
	private WebElement popup;
	
	@FindBy(xpath="(//span[@class='labelIcon'])[1]")
	private WebElement alloffers;
	
	@FindBy(xpath="//span[text()='Shirts']")
	private WebElement shirts;
	
	@FindBy(xpath="//i[contains(@class,'sd-icon sd-icon-expand-arrow')]")
	private WebElement sortby;
	
	@FindBy(xpath="//ul[@class='sort-value']/li[2]")
	private WebElement lowtohigh;
	
	@FindBy(xpath="//label[@for='Color_s-Blue']")
	private WebElement bluecolor;
	
	@FindBy(xpath="//label[@for='Size_s-37']")
	private WebElement shirtsize;
	
	@FindBy (xpath="//p[@class='product-title']")
	private WebElement firstshirt;
	
	@FindBy(id="pincode-change")
	private WebElement changepincode;
	
	@FindBy(xpath="//input[@placeholder='Enter pincode']")
	private WebElement enterpincode;
	
	@FindBy(xpath="//span[text()='check']")
	private WebElement checkbtn;
	
	@FindBy(className="itm-avail")
	private WebElement itemavaibility;
	
	public searchpom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	Filelib f = new Filelib();
	public void searchbox(String val)
	{
		searchbox.sendKeys(val);
	}
	
	public void clickonsearchbtn()
	{
		searchbtn.click();
	}
	
	public void selectcolour()
	{
		colorfilter.click();
		
	}
	
	public void selectmaterial()
	{
		materialfilter.click();
	}
	
	public void pricevalidation()
	{
		 firstresult.click();
		 
		 String expectedprice = expprice.getText();
		
		// String childid = f.windowswitch("child");
		 
		// driver.switchTo().window(childid);
		 
		String actualprice = actprice.getText();
		
		if(expectedprice.equals(actualprice))
		{
			System.out.println("price is correct");
		}
		
		driver.switchTo().defaultContent();
	}
	
	public void getAlloptions() throws Exception
	{
		
		
		for(int i=0;i<allresults.size();i++)
		{
			String opt = allresults.get(i).getText();
			
			for(int j=0 ; j<1 ;j++)
			{
				f.writeExcel("main", opt, i, 0);
				
			}
			
		}
		
	 }
	
	public void pincodecheck() throws InterruptedException, IOException
	{
		popup.click();
		f.mouseHover(alloffers);
		shirts.click();
		Thread.sleep(5000);
		sortby.click();
		Thread.sleep(3000);
		lowtohigh.click();
		Thread.sleep(3000);
		bluecolor.click();
		Thread.sleep(3000);
		shirtsize.click();
		Thread.sleep(3000);
		firstshirt.click();
		Thread.sleep(3000);
		//String childid = f.windowswitch("child");
	   // driver.switchTo().window(childid);
	    String pincode = f.propertydata("pincode");
	    enterpincode.sendKeys(pincode);
		Thread.sleep(3000);
		checkbtn.click();
		String avaibility = itemavaibility.getText();
	     
		Assert.assertTrue(avaibility.contains("Item is available at "));
		
		System.out.println(avaibility+" "+pincode);
	
	}

	

}

