package com.mystore.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Actiondriver.ActionClass;
import com.BaseClass.BaseClass;

public class SignInPage extends BaseClass {

	ActionClass act ;
	private @FindBy(id="email") WebElement emailTab ;
	private @FindBy(id="passwd") WebElement passwordTab ;
	private @FindBy(xpath="//button[@id='SubmitLogin']") WebElement submitLogin ;
	private @FindBy(id="email_create") WebElement emailAccountCreateInputTab ;
	private @FindBy(id="SubmitCreate") WebElement createNewAccountButton ;

	public SignInPage() {
		PageFactory.initElements(driver, this);
	}
	public HomePage login(String uname ,String pass) { //we will pass the parameter from test class
		act = new ActionClass();
		act.type(emailTab, uname) ;
		act.type(passwordTab, pass);
		act.scrollByVisibilityOfElement(driver, submitLogin);
		act.JSClick(driver, submitLogin);
		//		act.click(driver, submitLogin);
		return new HomePage(); 

	}

	public SignUpPage createNewAccount(String newEmail) { //we will pass the parameter from test class
		act = new ActionClass();
		act.type(emailAccountCreateInputTab, newEmail);
		act.click(driver, createNewAccountButton);
		return new SignUpPage();
	}
	public String getcurrnetURL() {
		act.fluentWait(driver, submitLogin, 10);
		String SigncurrURL = driver.getCurrentUrl();
		return SigncurrURL ;
	}
}
