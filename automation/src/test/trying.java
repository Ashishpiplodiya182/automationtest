package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import generics.baseclass;

public class trying 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	
	
   public static void main(String[] args) 
   {
	WebDriver driver = new ChromeDriver();

        driver.get("https://www.snapdeal.com");
    	WebElement b = driver.findElement(By.className("navlink"));
    	Actions a = new Actions(driver);
    	a.moveToElement(b);
    	
    }
	

}
