package com.mystore.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class SearchResultPage extends BaseClass {
	
	@FindBy(xpath="//div[@id='center_column']//following::img") WebElement product ;

	
	public SearchResultPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean productAvailable() {
		
		return product.isDisplayed();
	}
    public AddToCartPage clickToProduct() {
    	product.click();
    	return new AddToCartPage();
    }
    
}
