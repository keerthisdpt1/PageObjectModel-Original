package com.Guru.PageObjects;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Guru.Utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;



public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/form/table/tbody/tr[1]/td[2]/input") 
	WebElement txtUsername;
	
	@FindBy(xpath="/html/body/form/table/tbody/tr[2]/td[2]/input")
	WebElement txtPassword;
	
	@FindBy(xpath="/html/body/form/table/tbody/tr[3]/td[2]/input[1]")
	WebElement bttnLogin;

	public void setUsername(String username)
	{
		
		txtUsername.sendKeys(username);
		System.out.println("set username"+username);
	}
	
	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	public void clickLogin()
	{
		bttnLogin.click();
	}


}
