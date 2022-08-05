package com.mystore.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Actiondriver.ActionClass;
import com.BaseClass.BaseClass;

public class OrderPage extends BaseClass {

	ActionClass act ;

	@FindBy(xpath="//span[@id='product_price_1_1_726325']/span") WebElement unitPrice ;
	@FindBy(xpath="//span[@id='total_price']") WebElement totalPrice ;
	@FindBy(xpath="//span[text()='Proceed to checkout']") WebElement proceedTochekOut ;


	public OrderPage() {
		PageFactory.initElements(driver,this);
	}
	public double unitPrice() {
		String unitPrice1  = unitPrice.getText();
		String unitConverted = unitPrice1.replaceAll("[^a-zA-Z0-9]", unitPrice1);
		Double finalUnitPrice = Double.parseDouble(unitConverted);
		return finalUnitPrice/100 ;
	}
	public double gettotalPrice() {
		String finalTotalPrice1  = totalPrice.getText();
		String finalTotalPriceConverted = finalTotalPrice1.replaceAll("[^a-zA-Z0-9]", finalTotalPrice1);
		Double finalTotalPrice = Double.parseDouble(finalTotalPriceConverted);
		return finalTotalPrice/100 ;
	}
	public AddressPage clickOnCheckout() {
		act = new ActionClass();
		act.JSClick(driver, proceedTochekOut) ;
		return new AddressPage();

	}
}
