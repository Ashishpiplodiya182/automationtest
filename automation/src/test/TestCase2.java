package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.baseclass;
import pom.searchpom;

public class TestCase2 extends baseclass
{
	@Test
	public void test2() throws InterruptedException, IOException
	{
		searchpom p = new searchpom(driver);
		
		p.pincodecheck();
		
	}

}
