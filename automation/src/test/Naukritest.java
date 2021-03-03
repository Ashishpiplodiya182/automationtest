package test;

import org.testng.annotations.Test;

import generics.Filelib;
import generics.baseclass;
import pom.naukri;

public class Naukritest extends baseclass
{
	@Test
	public void profileNaukri() throws Exception
	{
		Filelib f = new Filelib();
		
		
		String username =f.getExceldata("main",0,1);
		String emaildid = f.getExceldata("main",1,1);
		
		
		String pass = f.getExceldata("main",2,1);
		String mobno = f.propertydata("mob");
		String currentcity = f.getExceldata("main",4,1);
		String skills = f.getExceldata("main",5,1);
		String desc = f.getExceldata("main",6,1);
				
		
		
		
		
		naukri n = new naukri(driver)   ;
		
		/*close all the child window*/
		Thread.sleep(2000);
		n.childwindowclose();
		
		/*click on register free button*/
		Thread.sleep(2000);
		n.clkregisterfree();
		
		/*click on fresher button*/
		Thread.sleep(2000);
		n.clkFresherBtn();
		
		/*enter the name*/ 
		Thread.sleep(2000);
		n.txtname(username);
		
		/*enter the mail*/
		Thread.sleep(2000);
		n.txtemail(emaildid);
		
		/*enter the password*/
		Thread.sleep(2000);
		n.txtpass(pass);
		
		/*enter the mobile no*/
		Thread.sleep(2000);
		n.txtmobileno(mobno);
		
		Thread.sleep(2000);
		/*enter the current city*/
		n.txtcurrentcity(currentcity);
		
		Thread.sleep(2000);
		/*upload the resume*/
		n.uploadresume();
		
		Thread.sleep(2000);
		/*click on registered now button*/
		n.btnRegisterNow();
		
		Thread.sleep(2000);
		/*select highest qualification*/
		n.highestQualification();
		
		Thread.sleep(2000);
		/*select board education*/
		n.boardeducation();
		
		Thread.sleep(2000);
		/*select year of passing*/
		n.yearofpassing();
		
		Thread.sleep(2000);
		/*select education medium*/
		n.educationMedium();
		
		Thread.sleep(2000);
		/*select percentage*/
		n.selectpercentage();
		
		Thread.sleep(2000);
		/*close other education icon*/
		n.closeothereducation();
		
		Thread.sleep(2000);
		/*select skills*/
		n.sltSkill(skills);
		
		Thread.sleep(2000);
		/*click on continue button*/
		n.btnContinue();
		
		Thread.sleep(2000);
		/*enter proffesion description*/
		n.txtprofession(desc);
		
		Thread.sleep(2000);
		/*select prefered location*/
		n.selectprefferedloc();
		
		Thread.sleep(2000);
		/*select on desired job*/
		n.clkdesiredjob();
		
		Thread.sleep(2000);
		/*select desired employment*/
		n.selectGender();
		
		Thread.sleep(2000);
		/*final submit*/
		n.finalSubmit();
		

		Thread.sleep(3000);
		/*user validation*/
		n.validateUser(username);
		
		
	}
	

}
