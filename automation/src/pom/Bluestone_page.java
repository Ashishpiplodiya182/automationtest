package pom;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import generics.Filelib;
import generics.baseclass;

public class Bluestone_page extends baseclass
{

	public Bluestone_page(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}
	Filelib f = new Filelib();
	
	/*rings tab*/
	@FindBy(xpath="//a[text()='Rings ']")
	private WebElement ringsTab;


	/*diamondring tab*/
	@FindBy(xpath="//a[text()='Diamond']")
	private WebElement diamondring;
	
	/*0% making charge*/
	@FindBy(xpath="//span[text()='0% making charge']/../../../../../div[1]/div[1]/span[1]/span/span[1]/span[1]")
	private List<WebElement> makingcharge;
	
	/*first option*/
	@FindBy(xpath="//img[@alt='The Jhonita Two Finger Ring']")
    private WebElement mosehoverfirst;	
	
	/*view details button*/
	@FindBy(xpath="//a[text()='View Details >>']")
	private WebElement btnviewdetails;
	
	/*product name*/
	@FindBy(xpath="//input[@id='product_type_name']/following-sibling::h1")
	private WebElement txtproductname;
	
	/*product price*/
	@FindBy(id="discountedPriceSpan")
	private WebElement priceproduct;
	
	/*pincode txtbox*/
	@FindBy(id="getNearestStore")
	private WebElement txtpincode;
	
	/*update button*/
	@FindBy(xpath="//div[text()='Update']")
	private WebElement btnupdate;
	
	
	/*elivery text*/
	@FindBy(className="store-delivery")
	private WebElement txtdelivery;
	
	/*select ring dropdown*/
	@FindBy(className="size-box-overlay")
	private WebElement dropringsize;
	
	/*select ringsize*/
	@FindBy(xpath="//li[@data-key='07']")
	private WebElement ringsize;
	
	/*buy now button*/
	@FindBy(id="buy-now")
	private WebElement btnbuynow;
	
	/*productverify*/
	@FindBy(xpath="//a[@target='_blank']")
	private WebElement vernameproduct;
	
	/*product price verify*/
	@FindBy(xpath="//span[contains(@id,'total_quantity_price_')]")
	private WebElement verpriceproduct;
	
	
	/**
	 * Description Method mousehover on rings tab
	 * @author Ashish piplodiya
	 * 
	 */
	public void hoverRingsTab()
	{
		f.mouseHover(ringsTab);
	}
	
	/**
	 * Description Method clicks on Diamond ring tab
	 * @author Ashish piplodiya
	 * 
	 */
	public void clkDiamondRing()
	{
		diamondring.click();
	}
	/**
	 * Description Method print all the 0% making charge price
	 * @author Ashish piplodiya
	 * 
	 */
	public void printMakingCharge()
	{
		
		for(WebElement opt : makingcharge)
		{
			String allmakingcharge = opt.getText();
			System.out.println(allmakingcharge);
		}
		
	}
	/**
	 * Description Method mousehover on product
	 * @author Ashish piplodiya
	 * 
	 */
	public void hoverFirstProduct()
	{
		f.mouseHover(mosehoverfirst);
		
	}
	/**
	 * Description Method click on view details button
	 * @author Ashish piplodiya
	 * 
	 */
	public void btnViewDetetails()
	{
		btnviewdetails.click();
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
	/**
	 * Description Method take visible name of the product
	 * @author Ashish piplodiya
	 * 
	 */
	public String getProductName()
	{
	
		String productname = txtproductname.getText();
		return productname;
	}
	
	/**
	 * Description Method take visible price of the product
	 * @author Ashish piplodiya
	 * 
	 */
	public String getProductPrice()
	{
	
		String productprice = priceproduct.getText();
		return productprice;
	}
	/**
	 * Description Method validate whether delivery is posible at particular pincode
	 * @author Ashish piplodiya
	 * 
	 */
	
	public void validatePincode(String pincode)
	{
		txtpincode.clear();
		
		txtpincode.sendKeys(pincode);
		
		btnupdate.click();
		
		String deliveryText = txtdelivery.getText();
		
		if(deliveryText.contains("Delivery"));
		System.out.println("delivery is possible");
		System.out.println(deliveryText);
	 }
	/**
	 * Description Method select the ringsize from dropdown
	 * @author Ashish piplodiya
	 * @throws InterruptedException 
	 * 
	 */
	public void ringSize() throws InterruptedException
	{
		dropringsize.click();
		
		Thread.sleep(2000);
		ringsize.click();
		
	}
	/**
	 * Description Method click on buynow button
	 * @author Ashish piplodiya
	 * 
	 */

	 public void clkBuyNowbtn()
	 {
		btnbuynow.click(); 
	 }
	 
	 /**
		 * Description Method validate product name 
		 *  @author Ashish piplodiya
		 * 
		 */

		 public void validateProductname(String expectedproductname)
		 {
			
			 String actualproductname = vernameproduct.getText();
			 
			Assert.assertTrue(actualproductname.contains(expectedproductname));
			
			System.out.println("productname validation succesful");
			 
		 }
		 
		 /**
			 * Description Method validate product price
			 *  @author Ashish piplodiya
			 * 
			 */

			 public void validateProductprice( String expectedproductprice)
			 {
				 
				String actualproductprice = verpriceproduct.getText();
				
				Assert.assertTrue(actualproductprice.contains(expectedproductprice));
				
				System.out.println("productprice validation succesful");
				 
			 }
			 
	 
}