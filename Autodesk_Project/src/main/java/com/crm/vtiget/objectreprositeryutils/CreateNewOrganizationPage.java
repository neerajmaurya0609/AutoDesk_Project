package com.crm.vtiget.objectreprositeryutils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrganizationPage {
	/**
	 * @author NEERAJ
	 * 
	 */
	
	@FindBy(name="accountname")
	private WebElement orgNameTF;

	@FindBy(name="industry")
	private WebElement indDropDown;

	@FindBy(xpath = "(//input[@name='assigntype'])[2]")
	private WebElement assigGroupRadioBTN;

	@FindBy(name="rating")
	private WebElement ratingDropDown;

	@FindBy(name="notify_owner")
	private WebElement noifyOwnerRadioBtn;

	@FindBy(xpath = "(//input[@class='crmbutton small save'])[1]")
	private WebElement saveBTN;

	public CreateNewOrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickOnSaveBTN() {
		saveBTN.click();		
	}
	
	public WebElement getOrgNameTF() {
		return orgNameTF;
	}

	public WebElement getIndDropDown() {
		return indDropDown;
	}

	public WebElement getAssigGroupRadioBTN() {
		return assigGroupRadioBTN;
	}

	public WebElement getRatingDropDown() {
		return ratingDropDown;
	}

	public WebElement getNoifyOwnerRadioBtn() {
		return noifyOwnerRadioBtn;
	}

	public WebElement getSaveBTN() {
		return saveBTN;
	}
}
