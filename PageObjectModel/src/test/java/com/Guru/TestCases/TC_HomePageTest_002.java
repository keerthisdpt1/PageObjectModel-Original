package com.Guru.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Guru.PageObjects.HomePage;
import com.Guru.PageObjects.LoginPage;


public class TC_HomePageTest_002 extends BaseClass {
	
	
	@Test
	public static void homePage_Title_Validation_Test()
	{
		HomePage h = new HomePage(driver);
	//	LoginPage l = new LoginPage();
		
	
		System.out.println("2nd testcase : TITLE");
		h.checkTitle();
		System.out.println("title = "+h.checkTitle());
	}
	
	@Test
	public static void homePage_LoginID_Validation_Test()
	{
		HomePage h = new HomePage(driver);
		Assert.assertEquals(h.checkLoginID(), "Manger Id : mngr471123");	
		
	}

}
