package com.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.mystore.Pages.IndexPom;
import com.mystore.Pages.SignInPage;
import com.mystore.Pages.SignUpPage;

public class SignUpPageTest extends BaseClass {
	IndexPom index ;
	SignInPage signInPage;
	SignUpPage signup ;


	@BeforeTest
	public void setup() {
		launchApp();
	}

	@Test
	public void validateSignUpPageTest() {
		index =  new IndexPom();
		index.signInClick();
		signInPage=  new SignInPage();
		signup = signInPage.createNewAccount("nwswws@dd.co");
		boolean val=signup.create_an_accoun_textValidate();
		Assert.assertTrue(val);

	}

}
