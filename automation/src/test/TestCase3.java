package test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import generics.Filelib;

public class TestCase3
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		Filelib f = new Filelib();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.nykaa.com/");
		
		
		WebElement makeup =	driver.findElement(By.xpath("//div[@id='my-menu']/ul[1]/li[1]/a[1]"));
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		 Actions a = new Actions(driver);
	     
	     a.moveToElement(makeup).build().perform();
	    
	    WebElement kajol = driver.findElement(By.linkText("Kajal"));
	    
	    kajol.click();
	   
	    Set<String> wh = driver.getWindowHandles();
	    
	    Iterator<String> itr = wh.iterator();
	    
	    String pit = itr.next();
	    
	    String cid = itr.next();
	    
	    driver.switchTo().window(cid);
	    
	    driver.findElement(By.cssSelector("i.fa.fa-angle-down")).click();
	   
	    driver.findElement(By.xpath("//span[text()='price: high to low']")).click();
	    
	    driver.findElement(By.xpath("//div[text()='Brand']/../div[2]/i[1]")).click();
	    
	    driver.findElement(By.xpath("//span[contains(text(),'Lakme')]/../div[1]")).click();
	    
	    driver.findElement(By.xpath("//span[contains(text(),'BOLLYGLOW')]/../div[1]")).click();
	    
	    driver.findElement(By.xpath("//div[text()='Brand']/../div[2]/i[1]")).click();
	    
	    driver.findElement(By.xpath("//div[text()='Price']/../div[2]/i[1]")).click();
	    
	    driver.findElement(By.xpath("//span[contains(text(),'Rs. 500 ')]/../div[1]")).click();
	    
	    driver.findElement(By.xpath("//div[text()='Discount']/../div[2]/i[1]")).click();
	    
	    driver.findElement(By.xpath("//span[contains(text(),'20% and above')]/../div[1]")).click();
	    
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//div[text()='Gender']/../div[2]")).click();
	    
	    driver.findElement(By.xpath("//span[contains(text(),'Female ')]/../div[1]")).click();
	    
	   
	    
	    List<WebElement> Alloptions = driver.findElements(By.xpath("//span[contains(text(),'Lakme') or contains(text(),'BOLLYGLOW ')]"));
	  
	    for(WebElement al : Alloptions)
	    {
	    	System.out.println(al.getText());
	    	
	    }
	   
	    driver.findElement(By.xpath("(//span[contains(text(),'Lakme ')])[2]")).click();
	  

	    Set<String> wh1 = driver.getWindowHandles();
	    
	    Iterator<String> itr2 = wh1.iterator();
	   
	    String currentid = driver.getWindowHandle();
	    while(itr2.hasNext())
	    {
	    	String wh2 = itr2.next();
	    	if(wh2.equals(currentid))
	    	{
	    		continue;
	    	}
	    	else
	    	{
	    		driver.switchTo().window(wh2);
	    	}
	    	
	    }
	    
	    
	    driver.findElement(By.xpath("//input[@placeholder='Enter Pincode']")).sendKeys("450001");
	    
	    driver.findElement(By.className("product-des__details-delivery-btn")).click();
	    
	     
	     
	  
	    
	    
	    
	    
	    
		
	}
}
