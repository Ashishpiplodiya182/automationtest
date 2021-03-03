package generics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class baseclass
{
	static
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
	}

	public static WebDriver driver;
	@BeforeClass
	public void openbrowser() throws IOException, InterruptedException
	{ 
	
	 //open browser
	 driver = new ChromeDriver();
	 
	 //maximizing window
	 driver.manage().window().maximize();
	 
	 Filelib f = new Filelib();
	 //enter tha url
	 driver.get(f.propertydata("url"));
	 
	
	}
	
	@AfterClass
	public void closebrowser()
	{
		//close browser
		//driver.quit();
	}

}
