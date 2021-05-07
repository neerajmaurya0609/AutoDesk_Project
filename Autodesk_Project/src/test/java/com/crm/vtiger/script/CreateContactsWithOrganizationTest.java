package com.crm.vtiger.script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.vtiger.GerericUtils.WebDriverUtility;

public class CreateContactsWithOrganizationTest {
	static {
		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\driver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", ".\\src\\main\\resources\\driver\\geckodriver.exe");	
	}
	WebDriverUtility wdu=new WebDriverUtility();
	@Test
	public void createContactsWithOrganization() throws InterruptedException {
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
				driver.findElement(By.linkText("Contacts")).click();
				
				//navigate to create organization
				driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
				driver.findElement(By.name("lastname")).sendKeys("vigyan");
				driver.findElement(By.xpath("(//img[@title='Select'])[1]")).click();
				//String parentW = driver.getWindowHandle();
				//Set<String> windows = driver.getWindowHandles();
				//System.out.println(windows.size());
//				for(String st:windows) {
//					driver.switchTo().window(st);
//					String title = driver.getTitle();
//					if (!title.contains("Administrator")) {
//						System.out.println(title);
//						break;
//					}					
//				}
				wdu.switchToWindow(driver,"Accounts");
				driver.findElement(By.id("search_txt")).sendKeys("Skillrarry1");
				driver.findElement(By.name("search")).click();
				driver.findElement(By.id("1")).click();
				wdu.switchToWindow(driver,"Contacts");
				driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
				
				//logout to the application
//				Actions a=new Actions(driver);
//				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				WebElement lo = driver.findElement(By.xpath("(//td[contains(@onmouseover,'fnDropDownUser')])[1]"));
				wdu.mouseOver(driver, lo);
				//a.moveToElement(lo).perform();
				//Thread.sleep(5000);
				driver.findElement(By.linkText("Sign Out")).click();
				driver.close();

	}
}
