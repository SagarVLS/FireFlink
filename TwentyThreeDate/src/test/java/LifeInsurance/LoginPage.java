package LifeInsurance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class LoginPage {
	@Test
	public void LoginPage() {
	
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver(); 
	driver.manage().window().maximize();
	driver.get("http://elftestingserver/domain/"); 
	driver.findElement(By.xpath("//span[text()='Life Insurance Management System']")).click();
	

}
}