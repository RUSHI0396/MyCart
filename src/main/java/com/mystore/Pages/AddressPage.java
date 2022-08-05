package com.mystore.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class AddressPage extends BaseClass {
	
	@FindBy(xpath="//span[text()='Proceed to checkout']") WebElement  proceedToCheckOut  ;
	
	public AddressPage() {
		
		PageFactory.initElements(driver, this);
	}

	
	public ShippingPage clickOnCheckOutBtn() {
		proceedToCheckOut.click();
		return new ShippingPage();
	}
}
