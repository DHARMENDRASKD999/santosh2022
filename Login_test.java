package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import testingbaba_pages.Login_page;

public class Login_test extends Baselibrary
{
	Login_page ob;
	@BeforeTest
	public void getlaunch_testingbaba()
	{
		getLaunch("https://www.testingbaba.com/old/");
		ob = new  Login_page();
	}
	@Test(priority = 0)
	public void getTitle()
	{
		ob.gettitle_testingbaba();
	}
	
}
