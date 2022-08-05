package com.mystore.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class HomePage extends BaseClass{
	
	@FindBy(xpath="//span[text()='My wishlists']") WebElement mywishList ;
	@FindBy(xpath="//span[text()='Order history and details']") WebElement orderHistory ;


	public 	HomePage() {
		PageFactory.initElements(driver, this);
	}
	public boolean validateMyWishList() {
		boolean wishList = mywishList.isDisplayed();
		return wishList ;
	}
	
	public boolean validateOrderHistory() {
		boolean historyorder=orderHistory.isDisplayed();
		return historyorder ;
	}

}