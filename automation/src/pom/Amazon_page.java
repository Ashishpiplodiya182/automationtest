package pom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import generics.baseclass;

public class Amazon_page extends baseclass
{
	

	public Amazon_page(WebDriver driver)
{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	/*search box*/
	@FindBy(id="twotabsearchtextbox")
	private WebElement serachbox;
	
	/*search button*/
	@FindBy(id="nav-search-submit-button")
	private WebElement btnsearch;

	/*see more dropdown*/
	@FindBy(xpath="//span[text()='See more']/../i")
	private WebElement seeMoredrpdn;
	
	/*lg serach box*/
	@FindBy(xpath="//span[text()='LG']/..//label/i")
	private WebElement LgSearchchkbox;
	
	/*split system checkbox*/
	@FindBy(xpath="//span[text()='Split System']/ancestor::a/div/label/i")
	private WebElement splitSysemtchkbox;
	
	/*Air conditioning capacity*/
	@FindBy(xpath="//span[text()='1.4 to 1.5 Tons']/ancestor::a/div/label/i")
	private WebElement tonCapacitychkbox;
	
	/*discount tab */
	@FindBy(xpath="//span[text()='25% Off or more']")
	private WebElement discounttab;
	
	/*product name*/
	@FindBy(xpath="//span[@class='a-price-whole']/../../../../../../../../../../../div[1]/div[1]/div[1]/div[1]/h2[1]/a/span")
	private List<WebElement> LgSearchresuslt;
	

	/*product price*/
	@FindBy(xpath="//span[@class='a-price-whole']")
	private List<WebElement> Lgproductprice;

	

	/*actual product price*/
	@FindBy(xpath="//span[@id='priceblock_ourprice']")
	private WebElement actproductprice;
	
	
	
	
	/**
	 * Description :- Method enter value in searchbox and click on serach button
	 * Authod :- ashish piplodiya
	 **/
	public void txtSearchBox(String value)
	{
		serachbox.sendKeys(value);
		btnsearch.click();
		
	}
	
	/**
	 * Description :- Method click on seemore dropdown
	 * Authod :- ashish piplodiya
	 **/
	public void dropSeeMore()
	{
		seeMoredrpdn.click();
		LgSearchchkbox.click();
		
	}
	
	/**
	 * Description :- Method click on select system checkbox
	 * Authod :- ashish piplodiya
	 **/
	public void sllitSystem()
	{
		splitSysemtchkbox.click();
	}
	

	/**
	 * Description :- Method click on ton capality checkbox
	 * Authod :- ashish piplodiya
	 **/
	public void tonPower()
	{
		tonCapacitychkbox.click();
	}
	
	/**
	 * Description :- Method click on discount tab
	 * Authod :- ashish piplodiya
	 **/
	public void discount()
	{
		discounttab.click();
	}
	
	/**
	 * Description :- Method click on productname
	 * Authod :- ashish piplodiya
	 **/
	public void clkProductName()
	{
      LgSearchresuslt.get(0).click();
	}
	
	/**
	 * Description :- Method get the product price
	 * Authod :- ashish piplodiya
	 **/
	public String expectedPrice()
	{
    String expected =  Lgproductprice.get(0).getText();
     
     return expected;
	}
	
	
	
	/**
	 * Description :- Method switch to child window
	 * Authod :- ashish piplodiya
	 **/
	public void switchWindow()
	{

		 Set<String> wh = driver.getWindowHandles();
		 Iterator<String> itr = wh.iterator();
		 String parentid = itr.next();
		 String childid = itr.next();
		 driver.switchTo().window(childid);
		 
	}
	
	/**
	 * Description :- Method validate the product price
	 * Authod :- ashish piplodiya
	 **/
	public void validateProductPrice(String expected)
	{
		String actprodprice = actproductprice.getText();
		
		Assert.assertTrue(actprodprice.contains(expected));
		System.out.println("validation successful");
		
		
	}
	
	
/**
	 * Description :- Method click on seemore dropdown
	 * Authod :- ashish piplodiya
	 **/
	public void productNameprice()
	{
		ArrayList<String> lst = new ArrayList<>();
		
		//String a =  LgSearchresuslt.get(i).getText();
		for (int i = 0; i <LgSearchresuslt.size(); i++) 
		{

			String b =   Lgproductprice.get(i).getText();
			lst.add(b);
			
		}
		 Collections.sort(lst);
		 
		 System.out.println("==========================================");
		 for(String a:lst)
		 {
			
			WebElement text = driver.findElement(By.xpath("//span[text()='"+a+"']/../../../../../../../../../../../div[1]/div[1]/div[1]/div[1]/h2[1]/a/span"));
			 System.out.println(text.getText()+"   "+a);
			 
			 
		 }
		
		
		
	}
	
	
	
	
	
	
	
}