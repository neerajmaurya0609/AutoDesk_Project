package com.crm.vtiger.OrganizationTest;


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
public class TC_14_CreateOrganizationWithNotifyOwnerTest extends BaseClass {
		
	@Test(groups="regrassion_test")
	public void createOrganizationWithNotifyOwner() throws Throwable {
		
		new HomePage(driver).getOrg().getCrtOrg().getOrgNameTF().sendKeys(eu.getDataFromExcelSheet("CreateOrganization", "TC_11", "OrganizationName")+ju.getRandomData());
		
		CreateNewOrganizationPage cnop=new CreateNewOrganizationPage(driver);
		cnop.getNoifyOwnerRadioBtn().click();
				
		cnop.clickOnSaveBTN();	
		
	}
}
