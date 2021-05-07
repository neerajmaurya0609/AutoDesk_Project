package com.crm.vtiger.OrganizationTest;



import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.vtiger.GerericUtils.BaseClass;
import com.crm.vtiget.objectreprositeryutils.CreateNewOrganizationPage;
import com.crm.vtiget.objectreprositeryutils.HomePage;
/**
 * 
 * @author NEERAJ
 *
 */

@Listeners(com.crm.vtiger.GerericUtils.ListenerImplementation.class)
public class TC_12_CreateOrganizationWithRatingTest extends BaseClass {
		
	@Test(groups="regrassion_test")
	public void createOrganizationWithRating() throws Throwable {
				
		new HomePage(driver).getOrg().getCrtOrg().getOrgNameTF().sendKeys(eu.getDataFromExcelSheet("CreateOrganization", "TC_11", "OrganizationName")+ju.getRandomData());

		CreateNewOrganizationPage cnop=new CreateNewOrganizationPage(driver);
		WebElement rating = cnop.getRatingDropDown();
		wdu.selectOption(rating, eu.getDataFromExcelSheet("CreateOrganization", 3, 3));	
				
		cnop.clickOnSaveBTN();	
		
	}
}
