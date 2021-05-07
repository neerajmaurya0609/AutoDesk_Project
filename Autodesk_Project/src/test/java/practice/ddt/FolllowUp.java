package practice.ddt;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.vtiger.GerericUtils.BaseClass;

@Listeners(com.crm.vtiger.GerericUtils.ListenerImplementation.class)
public class FolllowUp extends BaseClass{
	
	@Test
	public void try1() {		
		System.out.println(10/0);
	}
}
