package practice.ddt;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandleCalendarPopUp {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");	
	}
	@Test
	public void calendarPopUp() {
		Date dObj=new Date();
		String today = dObj.toString();
		System.out.println(today);
		//Tue Apr 27 17:49:42 IST 2021
		String[] split = today.split(" ");
		String s1 = split[0];
		String s2 = split[1];
		String s3 = split[2];
		String s4 = split[5];
		System.out.println(s1+" "+s2+" "+s3+" "+s4);
		//String date = s1+" "+s2+" "+s3+" "+s4;
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		
		Actions action=new Actions(driver);
		action.moveByOffset(10, 10).click().perform();
		
		driver.findElement(By.id("fromCity")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//ul[@class='react-autosuggest__suggestions-list']")).click();
		
		driver.findElement(By.id("toCity")).sendKeys("Pune");
		driver.findElement(By.xpath("//ul[@class='react-autosuggest__suggestions-list']")).click();

		
		driver.findElement(By.xpath("//span[.='DEPARTURE']")).click();
		//driver.findElement(By.xpath("//div[@class='DayPicker-Day DayPicker-Day--today']")).click();
		
		//driver.findElement(By.xpath("//div[@aria-label='"+date+"']")).click();
		
		int count = 0;
		while(count<12) {
			try {
				driver.findElement(By.xpath("//div[@aria-label='Tue Jun 29 2021']")).click();
				break;
			}
			catch(Exception e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
				count++;
			}
		}

	}
}
