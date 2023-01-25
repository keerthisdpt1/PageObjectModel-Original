package com.Guru.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	public HomePage (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[3]/td")
	WebElement loginID;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/marquee")
	WebElement title;
	
	
	public String checkTitle()
	{
		return title.getText();
		
	}
	
	public String checkLoginID()
	{
		String s = loginID.getText();
		System.out.println("loginID "+loginID.getText());
		
		return s;
	}

	

}
