package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generics.Filelib;
import generics.baseclass;
import pom.searchpom;

public class TestCase1 extends baseclass
{


     @Test
     public void test1() throws Exception
     {	
    	 
    	//creating object of pom class
		searchpom s = new searchpom(driver);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//search for mobile phone
		s.searchbox("iphone");
		
		//click on serach button
		s.clickonsearchbtn();
		
		//select on colour filter
		s.selectcolour();
        
		//select the material
		s.selectmaterial();
		
		/*JavascriptExecutor jsp = (JavascriptExecutor)driver;
		
		jsp.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		*/
		//s.getAlloptions();
		
		Thread.sleep(3000);
		s.pricevalidation();
		
	
	 }
		
		
	}
	
	
	

