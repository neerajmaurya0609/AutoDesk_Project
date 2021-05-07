package com.crm.vtiger.script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateOrganizationTest {
	static {
		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\driver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", ".\\src\\main\\resources\\driver\\geckodriver.exe");	
	}
	@Test
	public void createOrganization() {
		//launch browser

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		//get url

		driver.get("http://localhost:8888/");

		//login to vtiger application

		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();

		//navigate to organizations
		driver.findElement(By.linkText("Organizations")).click();

		//navigate to create organization
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		driver.findElement(By.name("accountname")).sendKeys("skillrarry5");
		driver.findElement(By.xpath("(//input[@class='crmbutton small save'])[1]")).click();

		//driver.findElement(By.linkText("Organizations")).click();
		driver.close();
	}
}
//1.Create Oragnization and signout
//2.Create Contact with organization and signout
//3.Create Organization with insustry and signout


