package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.mystore.Pages.IndexPom;

public class IndexPageTest extends BaseClass{

	IndexPom index ;
	@BeforeMethod
	public void setup() {
		launchApp();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test()
	public void verifyLogo() {
		index = new IndexPom(); // global variable index
		boolean resultLogo = index.validateLogo();
		Assert.assertTrue(resultLogo); //expected is true and actual 
	}

	@Test
	public void verifyTitle() {
		String title =index.myStoreTitle();
		Assert.assertEquals(title, "My Store");

	}

}
