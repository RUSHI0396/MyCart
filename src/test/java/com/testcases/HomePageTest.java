package com.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.mystore.Pages.HomePage;
import com.mystore.Pages.IndexPom;
import com.mystore.Pages.SignInPage;

public class HomePageTest extends BaseClass {

	IndexPom index ;
	SignInPage signInpage ; 
	HomePage homepage ;

	@BeforeTest
	public void setup() {
		launchApp();
	}

	@Test
	public void validateMyWishListTest() {

		homepage= new HomePage();
		index =  new IndexPom();
		index.signInClick();
		SignInPage signInpage =	index.signInClick();
		signInpage.login(prop.getProperty("username"), prop.getProperty("password"));

		boolean actualhomepageval=	homepage.validateMyWishList();
		Assert.assertTrue(actualhomepageval);


	}
	@Test
	public void validateOrderHistoryTest() {
		
		index =  new IndexPom();
		index.signInClick();
		SignInPage signInpage = index.signInClick();
		signInpage.login(prop.getProperty("username"), prop.getProperty("password"));

		boolean actualOrderHistory=	homepage.validateOrderHistory();
		Assert.assertTrue(actualOrderHistory);


	}


}
