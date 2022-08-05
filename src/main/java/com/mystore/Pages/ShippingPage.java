package com.mystore.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class ShippingPage extends BaseClass {

	@FindBy(xpath="//input[@id='cgv']") WebElement agrreTerms ;

	@FindBy(xpath="//button[@type='submit']//span[contains(text(),'Proceed to checkout')]") WebElement checkOutButton;

	public ShippingPage() {
		PageFactory.initElements(driver, this);
	}

	public void agrreTermsClick() {
		agrreTerms.click();
	}

	public PaymentPage clickOncheckOutButton() {
		
		checkOutButton.click();
		return new PaymentPage();
	}

}
