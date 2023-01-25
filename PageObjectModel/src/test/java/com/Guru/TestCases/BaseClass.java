package com.Guru.TestCases;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Guru.Utilities.ReadConfig;


import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {

	public static WebDriver driver;
	static Logger log = Logger.getLogger(BaseClass.class);
	
	@BeforeTest
	public static void setup() throws Exception
	{
		Properties p = ReadConfig.readConfigProperties();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(p.getProperty("URL"));
		
		log=log.getLogger("Guru99");
		PropertyConfigurator.configure(".\\Configuration\\log4j.properties");
	}
	
	
	
	
	@AfterTest
	public static void teardown()
	{
		driver.quit();
		log.info("Testing log ");
	}
	
	

}
