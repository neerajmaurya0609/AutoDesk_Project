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
public class TC_11_CreateOrganizationWithAssignedToAndMarkatingGroupTest extends BaseClass{	
	
	
	@Test(groups="smoke_test")
	public void createOrganizationWithAssignedToInMarkatingGroup() throws Throwable {	
				
		new HomePage(driver).getOrg().getCrtOrg().getOrgNameTF().sendKeys(eu.getDataFromExcelSheet("CreateOrganization", "TC_11", "OrganizationName")+ju.getRandomData());
						
		CreateNewOrganizationPage cnop=new CreateNewOrganizationPage(driver);
		cnop.getAssigGroupRadioBTN().click();
					
		cnop.clickOnSaveBTN();			
	}
}
