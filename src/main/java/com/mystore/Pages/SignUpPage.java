package com.mystore.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class SignUpPage extends BaseClass {

	@FindBy(xpath="//div[@id='noSlide']/child::h1") WebElement create_an_accoun_text ;
    
	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean create_an_accoun_textValidate() {
		boolean formvalidate = create_an_accoun_text.isDisplayed();
		return formvalidate ;
	}
	
}



