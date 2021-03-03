package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import generics.Filelib;

public class ActitimeProject_page 
{

	public ActitimeProject_page(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}

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
	
	/*project and customer tab*/
	@FindBy(xpath="//a[text()='Projects & Customers']")
	private WebElement projandcust;
	
	/*create customer button*/
	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement createCustometbtn;
	
	/*customer name textbox*/
	@FindBy(xpath="//input[@type='text']")
	private WebElement txtcustomername;
	
	/*customer name textbox*/
	@FindBy(xpath="//textarea[@name='description']")
	private WebElement txtcustdescription;
	

	/*create customer button*/
	@FindBy(xpath="//input[@value='Create Customer']")
	private WebElement btncreatecustomer;
	
	/*customer success messsage*/
	@FindBy(xpath="//span[@class='successmsg']")
	private WebElement msgcustomer;
	
	/*create project button*/
	@FindBy(xpath="//span[text()='Create Project']")
	private WebElement createprojbtn;
	
	/*customer select dropdown*/
	@FindBy(xpath="//select[@name='customerId']")
	private WebElement customerselectdropdn;
	
	/*project name textbox*/
	@FindBy(xpath="//input[@name='name']")
	private WebElement txtprojectname;
	
	/*project description*/
	@FindBy(xpath="//textarea[@name='description']")
	private WebElement txtprojectDesc;
	
	/*create project button*/
	@FindBy(xpath="//input[@name='createProjectSubmit']")
	private WebElement btnCreateProject;
	
	/*project success message*/
	@FindBy(xpath="//span[@class='successmsg']")
	private WebElement msgproject;
	
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
	 * Description  Method click on projandcust tab
	 * @author Ashish piplodiya
	 * 
	 */
	public void clkProjCustTab()
	{
		projandcust.click();
	}
	
	/**
	 * Description  Method click on Createcustomer btn
	 * @author Ashish piplodiya
	 * 
	 */
	public void clkCreateCustomer()
	{
		createCustometbtn.click();
	}
	
	/**
	 * Description  Method enter customer name 
	 * @author Ashish piplodiya
	 * 
	 */
	public void txtCustomerName(String customer)
	{
		txtcustomername.sendKeys(customer);
	}
	
	/**
	 * Description  Method enter customer description
	 * @author Ashish piplodiya
	 * 
	 */
	public void txtCustomerDesc(String description)
	{
		txtcustdescription.sendKeys(description);
		
	}
	/**
	 * Description  Method click on create customer button
	 * @author Ashish piplodiya
	 * 
	 */
	public void btnCreateCustomer()
	{
		btncreatecustomer.click();
	}
	
	/**
	 * Description  Method validate customer creation
	 * @author Ashish piplodiya
	 * 
	*/
	public void validateCustcreation(String customer)
	{
		String expectedmsg = customer;
		String actualmessage =  msgcustomer.getText();
		Assert.assertTrue(actualmessage.contains(expectedmsg));
		
		System.out.println("customer is created");
		
	}
	
	/**
	 * Description  Method click on createproject button
	 * @author Ashish piplodiya
	 * 
	*/
	public void clkCeateProjectBtn()
	{
	 createprojbtn.click();
	}
	
	/**
	 * Description  Method select customer from dropdown
	 * @author Ashish piplodiya
	 * 
	*/
	public void selectCustomerdropdn(String value)
	{
	
		f.selectbytext(customerselectdropdn, value);
    
		
	}
	
	/**
	 * Description  Method enter project name
	 * @author Ashish piplodiya
	 * 
	*/
	public void txtProjectName(String projectname)
	{
	
	  txtprojectname.sendKeys(projectname);
		
	}
	/**
	 * Description  Method enter project desc
	 * @author Ashish piplodiya
	 * 
	*/
	public void txtProjectDesc(String projectDesc)
	{
	
	 txtprojectDesc.sendKeys(projectDesc);
		
	}
	
	/**
	 * Description  Method click on createproject button
	 * @author Ashish piplodiya
	 * 
	*/
	public void clkCeateProject()
	{
	 btnCreateProject.click();
		
	}
	
	/**
	 * Description  Method validate project creation
	 * @author Ashish piplodiya
	 * 
	*/
	public void validateProjcreation(String project)
	{
		String expectedmsg = project;
		String actualmessage =  msgproject.getText();
		Assert.assertTrue(actualmessage.contains(expectedmsg));
		System.out.println("project is created");
	}
	
	

}
