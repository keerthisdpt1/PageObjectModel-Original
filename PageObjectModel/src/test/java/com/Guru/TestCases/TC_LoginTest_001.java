package com.Guru.TestCases;

import org.testng.annotations.Test;

import com.Guru.PageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	
	@Test
	public static void loginTest()
	{
		System.out.println("first testcase");
		
		LoginPage l = new LoginPage(driver);
		l.setUsername("mngr471123");
		l.setPassword("ybAdyty");
		l.clickLogin();
		log.info("Testing log");
	}
}
