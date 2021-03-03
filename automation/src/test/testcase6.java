package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.Filelib;
import generics.baseclass;
import pom.actitime;

public class testcase6  extends baseclass
{
@Test
public void createcustomer() throws IOException
{
	actitime act = new actitime(driver);
	Filelib f = new Filelib();
	
	act.enterusername(f.propertydata("username"));

	act.enterpassword(f.propertydata("password"));
	
	act.loginbutton();
	
	act.userlink();
	
	act.user();
	
	act.usercreation("ashish", "piplodiya", "piplodiyaashu@gmail.com", "ashish123", "ashish12345");
	
	
}
	
	
}
