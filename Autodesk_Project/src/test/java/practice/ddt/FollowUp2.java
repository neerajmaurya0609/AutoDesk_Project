package practice.ddt;

import org.testng.annotations.Test;


public class FollowUp2 {		
		@Test(retryAnalyzer = com.crm.vtiger.GerericUtils.RetryAnalyzer.class)
		public void try1() {		
			System.out.println(10/0);
		}	
}
