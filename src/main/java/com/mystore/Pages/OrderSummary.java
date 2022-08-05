package com.mystore.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class OrderSummary extends BaseClass {

	@FindBy(xpath="//span[text()='I confirm my order']") WebElement confirmOrderBTN ;

	public  OrderSummary() {
		PageFactory.initElements(driver, this);

	}
	public OrderConfirmationPage clickOnconfirmOrderBTN() {
		confirmOrderBTN.click();
		return new OrderConfirmationPage();
	}


}
