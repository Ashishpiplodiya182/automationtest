package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


//write a script to go the cleartrip.com type banglore to goa and print the depatrure date and flight name of all the flights
public class TestCase4 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		//open the browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//enter the url
		driver.get("https://www.cleartrip.com/");
		
		
	     WebElement from = driver.findElement(By.xpath("//input[@id='FromTag']"));
		
	    //type banglore in from field
	 	from.sendKeys("bangalore");
		
		
		
		//press enter
		from.sendKeys(Keys.ENTER);
		
	  WebElement to = driver.findElement(By.xpath("//input[@id='ToTag']"));
		
	  //type goa in to field
		to.sendKeys("goa");
		
	  //press enter
		to.sendKeys(Keys.ENTER);
	 
	  //selecting the date	
	   driver.findElement(By.xpath("//i[@class='icon ir datePicker']")).click();
	   
	   driver.findElement(By.xpath("(//a[text()='25'])[1]")).click();
	   
	   //click on search flight button
	    driver.findElement(By.id("SearchBtn")).click();
	   
	   Thread.sleep(4000);
	   
	   //address of all the departure time
	   List<WebElement> departure = driver.findElements(By.xpath("//div[@class='ow-tuple-container__details ms-grid-row-2']/div[2]/div[1]/div[1]"));
	 
	   //address of all the flights
	  List<WebElement> flights = driver.findElements(By.xpath("//img[@class='br-2 o-hidden mx-1']"));
	   
	    // no of flights
	   System.out.println(departure.size());
	   
	 
	   for(int i=1;i<departure.size();i++)
	   {
		   
		  String flightname= flights.get(i).getAttribute("alt");
		  
		  String departuretime = departure.get(i).getText();
		  
	      System.out.println("flightname ="+flightname+ "     departuretime ="+departuretime);
		  
		  System.out.println("==============================================================");
		   
	   }
	
	   
	   
	   
}

}
