package com.testcases;

import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.mystore.Pages.IndexPom;
import com.mystore.Pages.SignInPage;

public class SignInPageTest extends BaseClass{
	
	IndexPom index ;
	
	@BeforeTest
	public void setup() {
		launchApp();
	}
	
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}
	
	@Test
	public void signInClick() {
		
		index = new IndexPom();
		SignInPage signInpage=	index.signInClick();
		
		signInpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		String actualURL = signInpage.getcurrnetURL();
		String expectedURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
		
		Assert.assertEquals(actualURL, expectedURL);
	}

}
