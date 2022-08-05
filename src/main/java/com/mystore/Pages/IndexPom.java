package com.mystore.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Actiondriver.ActionClass;
import com.BaseClass.BaseClass;
import com.actionInterface.ActionInterface;

public class IndexPom extends BaseClass  {
	ActionClass act ;
	private @FindBy(xpath="//div[@class='header_user_info']/child::a[1]") WebElement signIn ;
	private	@FindBy (xpath="//div[@id='header_logo']//following::img[@class='logo img-responsive']") WebElement logo ;
	private @FindBy(id="search_query_top") WebElement searchProductTab ;
	private @FindBy(xpath="//button[@name='submit_search']") WebElement searchButton ;

	public IndexPom() {
		PageFactory.initElements(driver, this); // intilize all WebElement 
	}

	public SignInPage signInClick() {
		act=new ActionClass();
		act.click(driver, signIn);
		return new SignInPage();
	}

	public boolean validateLogo() {
		boolean val =logo.isDisplayed();
		return val ;
	}
	public String myStoreTitle() {
		String mystoretitle =driver.getTitle();
		return mystoretitle ;
	}

	public SearchResultPage searchProduct(String productName ) {
		act=new ActionClass();
		act.type(searchProductTab, productName);
		act.click(driver, searchButton);
		return new SearchResultPage() ;
	}

}
