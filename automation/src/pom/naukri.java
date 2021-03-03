package pom;

import java.io.File;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import generics.Filelib;

public class naukri 
{
	/*register free*/
	@FindBy(xpath="//button[contains(text(),'Register for')]")
	private WebElement btnRegisterfree;
	
	/*fresher button*/
	@FindBy(xpath="//button[@titile='I am a Fresher']")
	private WebElement btnFresher;
	
	/*name textbox*/
	@FindBy(id="fname")
	private WebElement txtname;
	
	/*email textbox*/
	@FindBy(id="email")
	private WebElement txtemail;
	
	/*password textbox*/
	@FindBy(xpath="//input[@name='password']")
	private WebElement txtpassword;
	
	/*mobno textbox*/
	@FindBy(xpath="//input[@name='number']")
	private WebElement txtmobileno;
	
	/*currentcity textbox*/
	@FindBy(className="sugInp")
	private WebElement txtcurrentcity;
	
	/*
	/*select state dropdown*/
	//@FindBy(xpath="//input[@name='state']")
	//private WebElement dwnstate;
	
	/*select state*/
	//@FindBy(xpath="//span[text()='Assam']")
	//private WebElement sltstate;
	
	/*outside india checkbox*/
	@FindBy(id="outsideIndia")
	private WebElement chkboxindia;
	
	
	/*upload resume button*/
	@FindBy(xpath="//input[@name='uploadCV']")
	private WebElement btnuploadresume;
	
	/*register now button*/
	@FindBy(xpath="//button[text()='Register Now']")
	private WebElement btnregisternow;
	
	/* qualifiation dropdown*/
	@FindBy(xpath="//input[@placeholder='Select your highest qualification']")
	private WebElement dwnhighestquali;
	
	/*select highest qualificationt*/
	@FindBy(xpath="//span[text()='12th']")
	private WebElement Slthighestquali;
	
	/* board dropdown*/
	@FindBy(xpath="//input[@name='schoolBoardId_0']")
	private WebElement dwnSelectboard;
	
	/*select board*/
	@FindBy(xpath="//span[text()='CBSE']")
	private WebElement sltboard;
	
	/*year of passing dropdown*/
	@FindBy(xpath="//input[@name='schoolCompletionYear_0']")
	private WebElement dwnyearofpassing;
	
	/*select year*/
	@FindBy(xpath="//span[text()='2020']")
	private WebElement sltyearofpassing;
	
	/*medium dropdown*/
	@FindBy(xpath="//input[@name='schoolMediumId_0']")
	private WebElement dwnmedium;
	
	/*select medium*/
	@FindBy(xpath="//span[text()='English']")
	private WebElement sltmedium;
	
	/*percentage dropdown*/
	@FindBy(xpath="//input[@name='schoolPercentageId_0']")
	private WebElement dwnpercentage;
	
	/*select percentage*/
	@FindBy(xpath="//span[text()='80-84.9%']")
	private WebElement sltpercentage;
	
	/*other education close button*/
	@FindBy(xpath="//span[text()='X']")
	private WebElement btncloseicon;
	
	/*skills textbox*/
	@FindBy(xpath="//input[@name='keyskills']")
	private WebElement txtskills;
	
	/*select skills autosuggestion*/
	@FindBy(xpath="//span[text()='java']")
	private WebElement sltskills;
	
	/*continue button*/
	@FindBy(xpath="//button[@name='submitEducationDetail']")
	private WebElement btncontinue;
	
	
	/*describe profession textbox*/
	@FindBy(xpath="//textarea[@id='title']")
	private WebElement txtprofession;
	
	/*preffered work location dropdown*/
	@FindBy(xpath="//input[@name='locationPref']")
	private WebElement dwnprefferedloc;
	
	/*select city*/
	@FindBy(xpath="//span[text()='Bengaluru/Bangalore']")
	private WebElement sltprefferedloc;
	
	/*desired job type*/
	@FindBy(xpath="(//label[@class='customRadioLbl' and @data-content='Both'])[1]")
	private WebElement both1;
	
	/*desired employemen type*/
	@FindBy(xpath="(//label[@class='customRadioLbl' and @data-content='Both'])[2]")
	private WebElement both2;
	
	/*gender btn*/
	@FindBy(xpath="//label[@data-content='Male']")
	private WebElement btnmale;
	
	/*submit button*/
	@FindBy(className="primary-btn")
	private WebElement btnsubmit;
	
	/*validate name*/
	@FindBy(xpath="//div[contains(@class,'user-name')]")
	private WebElement user;
	
	/*current city button*/
	@FindBy(xpath="//button[text()='SKIP AND CONTINUE']")
	private WebElement btnskip;
	
	
	
	
	public naukri(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	/**
	 * Description Method click on register free button
	 * @author Ashish piplodiya
	 * 
	 */
	public void clkregisterfree()
	{
		
		btnRegisterfree.click();
	}
	
	/**
	 * Description Method click on fresher buttoen
	 * @author Ashish piplodiya
	 * 
	 */
	public void clkFresherBtn()
	{
		
		btnFresher.click();
	}
	
	/**
	 * Description Method enter the username
	 * @author Ashish piplodiya
	 * 
	 */
	public void txtname(String name)
	{
		
		txtname.sendKeys(name);
	}
	
	/**
	 * Description Method enter the email
	 * @author Ashish piplodiya
	 * 
	 */
	public void txtemail(String email)
	{
		
		txtemail.sendKeys(email);
	}
	
	/**
	 * Description Method enter the password
	 * @author Ashish piplodiya
	 * 
	 */
	public void txtpass(String pass)
	{
		
		txtpassword.sendKeys(pass);
	}
	
	/**
	 * Description Method enter the mobileno
	 * @author Ashish piplodiya
	 * 
	 */
	public void txtmobileno(String mobno)
	{
		
		txtmobileno.sendKeys(mobno);
	}
	
	/**
	 * Description Method enter the current city
	 * @author Ashish piplodiya
	 * 
	 */
	public void txtcurrentcity(String currentcity)
	{
		
		txtcurrentcity.sendKeys(currentcity);
		txtcurrentcity.sendKeys(Keys.DOWN);
		txtcurrentcity.sendKeys(Keys.ENTER);
		//chkboxindia.click();
	}
	
	/**
	 * Description Method will upload the resume
	 * @author Ashish piplodiya
	 * 
	 */
	public void uploadresume()
	{
		File d = new File("./data/uploadresume.docx");
		
		String absolute = d.getAbsolutePath();
		
		btnuploadresume.sendKeys(absolute);
	}
	
	/**
	 * Description Method will click register now button
	 * @author Ashish piplodiya
	 * 
	 */
	public void btnRegisterNow()
	{
		btnregisternow.click();
	}
	
	/**
	 * Description Method will select highest qualification
	 * @author Ashish piplodiya
	 * 
	 */
	public void highestQualification()
	{
		dwnhighestquali.click();
		
		Slthighestquali.click();
	}
	
	
	/**
	 * Description Method will select highest qualification
	 * @author Ashish piplodiya
	 * 
	 */
	public void boardeducation()
	{
		dwnSelectboard.click();
		
		sltboard.click();
	}
	
	/**
	 * Description Method will select year of passing
	 * @author Ashish piplodiya
	 * 
	 */
	public void yearofpassing()
	{
		dwnyearofpassing.click();
		
		sltyearofpassing.click();
	}
	
	/**
	 * Description Method will select education medium
	 * @author Ashish piplodiya
	 * 
	 */
	public void educationMedium()
	{
		dwnmedium.click();
		
		sltmedium.click();
	}
	
	/**
	 * Description Method will select percenatge
	 * @author Ashish piplodiya
	 * 
	 */
	public void selectpercentage()
	{
		dwnpercentage.click();
		
		sltpercentage.click();
	}
	
	/**
	 * Description Method will close the other education
	 * @author Ashish piplodiya
	 * 
	 */
	public void closeothereducation()
	{
		btncloseicon.click();
	}
	
	/**
	 * Description Method will close the other education
	 * @author Ashish piplodiya
	 * 
	 */
	public void sltSkill(String skill)
	{
		txtskills.sendKeys(skill);
		txtskills.sendKeys(Keys.DOWN);
		txtskills.sendKeys(Keys.ENTER);
		
	}
	

	/**
	 * Description Method will click on continue button
	 * @author Ashish piplodiya
	 * 
	 */
	public void btnContinue()
	{
		btncontinue.click();
	}
	
	/**
	 * Description Method will enter the profession
	 * @author Ashish piplodiya
	 * 
	 */
	public void txtprofession(String text)
	{
	  txtprofession.sendKeys(text);
	}
	
	/**
	 * Description Method will select the preffered location
	 * @author Ashish piplodiya
	 * 
	 */
	public void selectprefferedloc()
	{
	  dwnprefferedloc.click();
	  
	  sltprefferedloc.click();
	}
	
	/**
	 * Description Method will click on
	 * @author Ashish piplodiya
	 * 
	 */
	public void clkdesiredjob()
	{
	  both1.click();
	}
	
	/**
	 * Description Method will click on desired employment
	 * @author Ashish piplodiya
	 * 
	 */
	public void clkdesiredemployment()
	{
	  both2.click();
	}
	
	/**
	 * Description Method will select the gender
	 * @author Ashish piplodiya
	 * 
	 */
	public void selectGender()
	{
	 btnmale.click();
	}
	
	/**
	 * Description Method will click on final submit
	 * @author Ashish piplodiya
	 * 
	 */
	public void finalSubmit()
	{
	 btnsubmit.click();
	}
	
	/**
	 * Description Method will validate user creation
	 * @author Ashish piplodiya
	 * @throws InterruptedException 
	 * 
	 */
	public void validateUser(String expecteduser) throws InterruptedException
	{
		 Thread.sleep(2000);
	  btnskip.click();
		
	  Thread.sleep(2000);
	  String actualuser = user.getText();
	  
	  Assert.assertTrue(expecteduser.contains(actualuser));
	  
	  
	}
	
	/**
	 * Description Method will switchwindow
	 * @author Ashish piplodiya
	 * 
	 */
	
	public void childwindowclose()
	{
		Filelib f = new Filelib();
		f.windowswitch();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
