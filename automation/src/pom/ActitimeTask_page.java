package pom;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import generics.Filelib;

public class ActitimeTask_page
{

	
 Filelib f = new Filelib();
	

	/*username textbox*/
	@FindBy(id="username")
	private WebElement untbx;
	
	/*password textbox*/
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement pwdtbx;
	
	/*login button*/
	@FindBy(id="loginButton")
	private WebElement loginbtn;
	
	/*task button*/
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement taskbtn;
	
	/*create task button*/
	@FindBy(xpath="//div[contains(@id,'ext-comp')]")
	private WebElement createtaskbtn;
	
	/*select customer dropdown*/
	@FindBy(xpath="//select[@name='customerId']")
	private WebElement customerdwn;
	
	/*customer name textbox*/
	@FindBy(xpath="//input[@name='customerName']")
	private WebElement txtcustomername;
	
	/*project name textbox*/
	@FindBy(xpath="//input[@name='projectName']")
	private WebElement txtprojectname;
	
	
	
	/*select project dowpdown*/
	@FindBy(xpath="//select[@name='projectId']")
	private WebElement projectdwn;
	
	/*task name textbox*/
	@FindBy(id="task[0].name")
	private WebElement txttask;
	
	/*deadline calender*/
	@FindBy(id="ext-gen7")
	private WebElement caldeadline;
	
	/*date from calender*/
	@FindBy(xpath="//span[text()='24']")
	private WebElement clkdate;
	
	/*Time track checkbox*/
	@FindBy(id="task[0].markedToBeAddedToUserTasks")
	private WebElement chbktimetrack;
	
	/*Create Tasks button*/
	@FindBy(xpath="//input[@class='hierarchy_element_wide_button']")
	private WebElement btncreatetask;
	
	/*created custome message*/
	@FindBy(xpath="(//span[@class='successmsg'])[1]")
	private WebElement customercreationmsg;
	
	/*created project message*/
	@FindBy(xpath="(//span[@class='successmsg'])[2]")
	private WebElement projectcreationmsg;
	
	/*customername in table*/
	@FindBy(xpath="(//td[@class='listtblcell'])[1]")
	private WebElement validatecustomername;
	
    /*projectname in table */	
	@FindBy(xpath="(//td[@class='listtblcell'])[2]")
	private WebElement validateprojectname;
	
	
      public ActitimeTask_page(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}

	
	/**
	 * Description  Method enter username
	 * @author Ashish piplodiya
	 * 
	 */
	public void txtusername(String username)
	{
		untbx.sendKeys(username);
		
	}
	
	
	/**
	 * Description  Method enter password
	 * @author Ashish piplodiya
	 * 
	 */
	public void txtpassword(String password)
	{
		pwdtbx.sendKeys(password);
		
	}
	
	/**
	 * Description  Method click on login button
	 * @author Ashish piplodiya
	 * 
	 */
	public void clkLoginbtn()
	{
		loginbtn.click();
	}
	
	/**
	 * Description  Method click on task tab
	 * @author Ashish piplodiya
	 * 
	 */
	public void clkTaskTab()
	{
		taskbtn.click();
	}
	
	/**
	 * Description  Method click on create task
	 * @author Ashish piplodiya
	 * 
	 */
	public void clkCreateTaskbtn()
	{
		createtaskbtn.click();
	}
		
	/**
	 * Description  Method select customer to add task
	 * @author Ashish piplodiya
	 * 
	 */
	public void customerDropdown(String value)
	{
		f.selectbytext(customerdwn, value);
		
	}
	
	/**
	 * Description  Method enter customername
	 * @author Ashish piplodiya
	 * 
	 */
	public void txtCustomerName(String value)
	{
		txtcustomername.sendKeys(value);
		
		
	}
	
	/**
	 * Description  Method enter projectname
	 * @author Ashish piplodiya
	 * 
	 */
	public void txtProjectName(String value)
	{
		txtprojectname.sendKeys(value);
		
		
	}
	
	/**
	 * Description  Method will create the task
	 * @author Ashish piplodiya
	 * 
	 */
	
	public void createTask(String value)
	{
		txttask.sendKeys(value);
		
		
	    caldeadline.click();
		
	    clkdate.click();
		
		chbktimetrack.click();
		
		btncreatetask.click();
	}
	
	/**
	 * Description  Method will validate customer name and project name
	 * @author Ashish piplodiya
	 * 
	 */
	
	public void messagevalidation(String customer , String project)
	{
		String actualcustmsg = customercreationmsg.getText();
		String actualprojmsg = projectcreationmsg.getText();
		
		System.out.println(actualcustmsg);
		System.out.println(actualprojmsg);
		Assert.assertTrue(actualcustmsg.contains(customer));
		Assert.assertTrue(actualprojmsg.contains(project));
		
	}
	
	/**
	 * Description  Method will validate customer name and project name under table
	 * @author Ashish piplodiya
	 * 
	 */
	
	public void validateundertable(String customer , String project)
	{
		String actualcustomer = validatecustomername.getText();
				
	    String actualproject = validateprojectname.getText();
	    
	 Assert.assertEquals(actualcustomer ,customer);
	 System.out.println(actualcustomer);
	Assert.assertEquals(actualproject, project);
	System.out.println(actualproject);
	}
	
	
	
	
		
		
	
	
	
	
	
}
