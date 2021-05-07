package com.crm.vtiget.objectreprositeryutils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author NEERAJ
 *
 */
public class LoginPage {
	@FindBy(name="user_name")
	private WebElement untbx;

	@FindBy(name="user_password")
	private WebElement pwtbx;

	@FindBy(id="submitButton")
	private WebElement lgbtn;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUntbx() {
		return untbx;
	}

	public WebElement getPwtbx() {
		return pwtbx;
	}

	public WebElement getLgbtn() {
		return lgbtn;
	}

	/**
	 * this method is for login to the app
	 * @param username
	 * @param password
	 */
	public void setLogin(String username,String password) {
		untbx.sendKeys(username);
		pwtbx.sendKeys(password);
		lgbtn.click();
	}
}
