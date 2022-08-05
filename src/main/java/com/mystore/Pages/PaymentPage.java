package com.mystore.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class PaymentPage extends BaseClass {

	@FindBy(xpath="//a[@class='cheque']") WebElement payByBankwire ;
	
	@FindBy(xpath="//a[@class='cheque']") WebElement payBycheck ;

	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}
	public OrderSummary clickOnpayByBankwire() {
		
		payByBankwire.click();
		
		return new OrderSummary();
	}
}
