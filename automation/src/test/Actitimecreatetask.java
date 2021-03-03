package test;

import org.testng.annotations.Test;

import generics.baseclass;
import pom.ActitimeTask_page;

public class Actitimecreatetask extends baseclass
{
	@Test
	public void createTask() throws InterruptedException
	{
		ActitimeTask_page act = new ActitimeTask_page(driver);
		
		String customername ="ajay1234";
		String projectname ="testyantra";
		
		/*enter username*/
		act.txtusername("admin");
		
		Thread.sleep(3000);
		/*enter passowrd*/
		act.txtpassword("manager");
		
		Thread.sleep(3000);
		/*click on loginbutton*/
		act.clkLoginbtn();
		
		Thread.sleep(3000);
		/*click task tab*/
		act.clkTaskTab();
		
		Thread.sleep(3000);
		/*click create task button*/
		act.clkCreateTaskbtn();
		
		Thread.sleep(3000);
		/*click customer dropdown*/
		act.customerDropdown("-- new customer --");
		
		Thread.sleep(3000);
		/*enter customer name*/
		act.txtCustomerName(customername);
		
		Thread.sleep(3000);
		/*enter project name*/
		act.txtProjectName(projectname);
		
		Thread.sleep(3000);
		/*create task*/
		act.createTask("main");
		
		Thread.sleep(3000);
		/*check the message validation*/
		act.messagevalidation(customername, projectname);
		
		Thread.sleep(3000);
		/*validate customer name and project name*/
		act.validateundertable(customername, projectname);
		
		
	}

}
