package com.crm.vtiger.script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.vtiger.GerericUtils.WebDriverUtility;

public class CreateOrganizationWithIndustryTest {
	static {
		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\driver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", ".\\src\\main\\resources\\driver\\geckodriver.exe");	
	}
	WebDriverUtility wdu=new WebDriverUtility();
	@Test
	public void createOrganization() throws InterruptedException {
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
		driver.findElement(By.name("accountname")).sendKeys("skillrarry7");


		//select industry type
		WebElement indDropDown = driver.findElement(By.name("industry"));		
//		Select s=new Select(indDropDown);
//		s.selectByVisibleText("Education");
		wdu.selectOption(indDropDown, "Education");

		driver.findElement(By.xpath("(//input[@class='crmbutton small save'])[1]")).click();
		//WebDriverWait wait=new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//td[contains(@onmouseover,'fnDropDownUser')])[1]")));
		//logout to the application
//		Actions a=new Actions(driver);
//		int counter=0;
//		while(counter<1000) {
//			try {
//				WebElement lo1 = driver.findElement(By.xpath("(//td[contains(@onmouseover,'fnDropDownUser(this,')])[1]"));		
//				a.moveToElement(lo1).perform();		
//				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
//				driver.findElement(By.linkText("Sign Out")).click();
//				break;
//			}
//			catch(Exception e) {
//				counter++;
//			}
//		}	
		
		WebElement lo = driver.findElement(By.xpath("(//td[contains(@onmouseover,'fnDropDownUser(this,')])[1]"));		

		
		wdu.mouseOver(driver, lo);				
				
		
		driver.findElement(By.linkText("Sign Out")).click();

		//driver.close();
	}
}
