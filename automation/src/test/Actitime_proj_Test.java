package test;

import org.testng.annotations.Test;

import generics.baseclass;
import pom.ActitimeProject_page;

public class Actitime_proj_Test extends baseclass
{
	@Test
	public void actitimeValidation() throws InterruptedException
	{
		ActitimeProject_page act = new ActitimeProject_page(driver);
		
		String customername ="anuj";
		String customerdescription ="ajay123";
		 
		String projectname = "testyantra.com";
		String projectdesc = "testyantra";
		
		Thread.sleep(2000);
		/*enter username */
		act.txtusername("admin");
		
		Thread.sleep(2000);
		/*enter password */
		act.txtpassword("manager");
		
		Thread.sleep(2000);
		/*click on login button*/
		act.clkLoginbtn();
		
		Thread.sleep(2000);
		/*click on task tab*/
		act.clkTaskTab();
		
		Thread.sleep(2000);
		/*click on project and customer*/
		act.clkProjCustTab();
		
		Thread.sleep(2000);
		/*click create customer*/
		act.clkCreateCustomer();
 		
		Thread.sleep(2000);
		/*enter customer name*/
		act.txtCustomerName(customername);
		
		Thread.sleep(2000);
		/*enter customer description*/
		act.txtCustomerDesc(customerdescription);
		
		Thread.sleep(2000);
		/*click on create customer button*/
		act.btnCreateCustomer();
		
		Thread.sleep(2000);
		/*validate customer creation*/
		act.validateCustcreation(customername);
		
		Thread.sleep(2000);
		/*click create project button*/
		act.clkCeateProjectBtn();
		
		Thread.sleep(2000);
		/*select customer dropdown*/
		act.selectCustomerdropdn(customername);
		
		Thread.sleep(2000);
		/*enter project name*/
		act.txtProjectName(projectname);
		
		Thread.sleep(2000);
		/*enter project description*/
		act.txtProjectDesc(projectdesc);
		
		Thread.sleep(2000);
		/*click on create project button*/
		act.clkCeateProject();
		
		Thread.sleep(2000);
		/*validate project creation*/
		act.validateProjcreation(projectname);
		
		
		
	}

}
