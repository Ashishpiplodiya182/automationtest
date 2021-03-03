package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.baseclass;



public class actitime extends baseclass
{
	public WebDriver driver;
	

	public actitime(WebDriver driver)
			{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement password;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginbtn;
	
	@FindBy(xpath="//div[text()='Users']/..")
	private WebElement userslink;
	
	@FindBy(id="ext-comp-1003")
	private WebElement users;
	
	@FindBy(id="userDataLightBox_firstNameField")
	private WebElement firstname;

	@FindBy(id="userDataLightBox_lastNameField")
	private WebElement lastname;
	
	@FindBy(id="userDataLightBox_usernameField")
	private WebElement createusername;
	
	@FindBy(id="userDataLightBox_passwordField")
	private WebElement createpassword;
	
	@FindBy(id="userDataLightBox_passwordCopyField")
	private WebElement retypepassword;
	
	
	@FindBy(id="userDataLightBox_commitBtn")
	private WebElement createbtn;
	
	@FindBy(className="emailField")
	private WebElement emailbox;
	
	@FindBy(id="logoutLink")
	private WebElement logoutlink;
	 
	public void enterusername(String usernam)
	{
		username.sendKeys(usernam);
	}
	
	public void enterpassword(String pasword)
	{
		password.sendKeys(pasword);
	}
	
	public void loginbutton()
	{
		loginbtn.click();
	}
	public void userlink()
	{
		userslink.click();
	}
	
	public void user()
	{
		users.click();
	}
	
	public void usercreation(String first, String last, String email , String user , String pass)
	{
	 firstname.sendKeys(first);
	 lastname.sendKeys(last);
	 emailbox.sendKeys(email);
	 createusername.sendKeys(user);
	 createpassword.sendKeys(pass);
	 retypepassword.sendKeys(pass);
	 
	}
	
	public void createbutton()
	{
		createbtn.click();
	}
}
