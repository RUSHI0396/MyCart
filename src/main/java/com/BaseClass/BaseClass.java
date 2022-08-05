package com.BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.Actiondriver.ActionClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver ;
	public static Properties prop ;


	//	@BeforeMethod
	//	public void setUp() {
	//		readConfig();
	//		System.setProperty("webdriver.chrome.driver","C:\\Users\\91888\\Desktop\\Automation\\MyStore\\Drivers\\chromedriver.exe" );
	//		driver = new ChromeDriver();
	//		driver.manage().window().maximize();
	//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	//		driver.get(prop.getProperty("url"));
	//
	//	}
	@BeforeTest
	public void readConfig() {
		prop =  new Properties();
		FileInputStream input = null;
		try {
			input = new FileInputStream(System.getProperty("user.dir")+
					"/Configuration/Config.properties");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		try {
			prop.load(input);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}



	public static void launchApp() {
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.iedriver().setup();
		String browserName = prop.getProperty("browser");
		if(browserName.contains("Chrome")) {
			driver = new ChromeDriver();
		} else if(browserName.contains("FireFox")) {
			driver  = new FirefoxDriver();
		} else if(browserName.contains("IE")) {
			driver  = new InternetExplorerDriver();
		} 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(35,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(35,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

//	@AfterMethod
//	public void tearDown() {
//		driver.close();
//	}

}
