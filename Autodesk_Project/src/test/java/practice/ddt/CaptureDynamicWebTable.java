package practice.ddt;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CaptureDynamicWebTable {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");	}
/*	@Test
	public void captureOrganizationName() {
		//step1: open browser
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//step2: navigate to vtiger by provide vtiger url 
		driver.get("http://localhost:8888/");
		//step3: login to the vtiger application
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		//step4: navigate to organizations page
		driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']")).click();
		
		
		//step5: capturing all the organization name
		String path = "//table[@class='lvt small']/tbody/tr/td[3]/a";
		List<WebElement> oNames = driver.findElements(By.xpath(path));
		for (WebElement e : oNames) {
			String oName = e.getText();
			if(!oName.equals("Organization Name")) {
				System.out.println(oName);
			}
		}
		
		//step6: click on last check boxes
		//String checkBox = "(//table[@class='lvt small']/tbody/tr/td[1]/input)[last()]";
		//driver.findElement(By.xpath(checkBox)).click();

		String checkBox = "//table[@class='lvt small']/tbody/tr/td[1]/input";
		List<WebElement> checkBoxs = driver.findElements(By.xpath(checkBox));
		for (int i = 1; i < checkBoxs.size(); i++) {
			System.out.println(i);
			checkBoxs.get(i).click();
		}
		int size = checkBoxs.size();
		//checkBoxs.get(size-1).click();
	}*/
/*	@Test
	public void compareActualWithExpectedReasult() {
		//step1: open browser
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//step2: navigate to vtiger by provide vtiger url 
		driver.get("http://localhost:8888/");
		//step3: login to the vtiger application
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		//step4: navigate to organizations page
		driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']")).click();
		
		
		//step5: capturing all the organization name
		String path = "//table[@class='lvt small']/tbody/tr/td[3]/a";
		List<WebElement> oNames = driver.findElements(By.xpath(path));
		String actual = "Skillrarry2";
		boolean flag = false;
		for (WebElement e : oNames) {
			String oName = e.getText();
			if(oName.equals(actual)) {
				e.click();
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("organization is present");
		}
		else {
			System.out.println("no organization is not present");
		}
	}*/
	
	@Test
	public void compareDataIsPresentOrNotAndDeleteIt() {
		//step1: open browser
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//step2: navigate to vtiger by provide vtiger url 
		driver.get("http://localhost:8888/");
		//step3: login to the vtiger application
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		//step4: navigate to organizations page
		driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']")).click();
		
		
		//step5: capturing all the organization name
		String path = "//table[@class='lvt small']/tbody/tr/td[3]/a";
		List<WebElement> oNames = driver.findElements(By.xpath(path));
		String actual = "Skillrarry2";
		int counter=0;
		for (WebElement e : oNames) {
			counter++;
			String oName = e.getText();
			if(oName.equals(actual)) {								
				break;
			}			
		}
		System.out.println(counter);
		String p = "//table[@class='lvt small']/tbody/tr["+counter+"]/td[8]/a[2]";
		driver.findElement(By.xpath(p)).click();
		driver.switchTo().alert().accept();
	}
}
//case 1: capture all the organization names in a webtable.
//
//Case 2: click on all the check boxes
//
//Case 3: click on last check box
