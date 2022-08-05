package com.mystore.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class OrderConfirmationPage extends BaseClass {


	@FindBy(xpath="//strong[contains(text(),'Your order on')]") WebElement confirmedOrder ;

	public OrderConfirmationPage() {
		PageFactory.initElements(driver, this);
	}

	public String confirmedOrderText() {
		String confirmOrderText=	confirmedOrder.getText();
		return confirmOrderText ;
	}

}
