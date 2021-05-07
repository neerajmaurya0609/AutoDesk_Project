package com.crm.vtiget.objectreprositeryutils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationRecordsPage {
	/**
	 * @author NEERAJ
	 * 
	 */
	
	WebDriver driver;
	
	@FindBy(xpath ="//img[@alt='Create Organization...']")
	private WebElement crtOrgBtn;
	
	public OrganizationRecordsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	public WebElement getCrtOrgBtn() {
		return crtOrgBtn;
	}
	/**
	 * this method is for click on crate organization button
	 * @return
	 */
	public CreateNewOrganizationPage getCrtOrg() {
		crtOrgBtn.click();
		return new CreateNewOrganizationPage(driver);
	}
	
}
