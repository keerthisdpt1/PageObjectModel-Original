package com.Guru.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	public static Properties readConfigProperties() throws Exception 
	{
		FileInputStream fis = new FileInputStream("./Configuration/config.properties");
		Properties p = new Properties();
		p.load(fis);
		
		return p;
		
	}
	public static Properties readORProperties() throws Exception
	{
		FileInputStream fis = new FileInputStream("./Configuration/OR.properties");
		Properties p = new Properties();
		p.load(fis);
		
		return p;
	}

}
