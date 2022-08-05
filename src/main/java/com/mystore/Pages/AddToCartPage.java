package com.mystore.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import  com.Actiondriver.ActionClass;

import com.Actiondriver.ActionClass;
import com.BaseClass.BaseClass;

public class AddToCartPage extends BaseClass {
	
	ActionClass act ;
	
	@FindBy(xpath = "//input[@id='quantity_wanted']") WebElement quantity ;

	
	@FindBy(xpath = "//select[@id='group_1']") WebElement sizeSelect ;

	@FindBy(xpath="//span[text()='Add to cart']") WebElement addToCartButton ;

	@FindBy(xpath="icon-ok") WebElement icon_ok ;

	@FindBy(xpath="//span[contains(text(),'Proceed')]") WebElement proceedToCheckout ;

	public AddToCartPage() {
		PageFactory.initElements(driver, this);
	}

	public void totalQuantity(String quan) {
		quantity.sendKeys(quan);
	}
	public void selectSize(String value) {
		act = new ActionClass();

		act.selectByValue(sizeSelect,value);

	}
	public void addToCart() {
		addToCartButton.click();
	}

	public boolean validateAddedTOcart() {
		boolean is_ok =icon_ok.isDisplayed();
		return is_ok ;
	}

	public OrderPage proceedToCheckout() {
		act = new ActionClass();
		act.JSClick(driver,proceedToCheckout ) ;
		return new OrderPage(); 
	}



}
