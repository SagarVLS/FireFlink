package LifeInsurance;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePageInsurance {
	WebDriver driver;

	public void HomePageInsurance(String username, String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://elftestingserver/domain/");
		Thread.sleep(3000);
		WebElement page = driver.findElement(By.xpath("//span[text()='Life Insurance Management System']"));
		page.click();
		Set<String> parentPage = driver.getWindowHandles();
		for (String windowid : parentPage) {
			driver.switchTo().window(windowid);
		}

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='login']")).click();
		Thread.sleep(5000);
//	//driver.findElement(By.linkText("CLIENTS")).click();
//		WebElementRepository wer=new WebElementRepository(driver);
//		wer.getClientModule().click();
//	//	wer.getAddClient().click();
//		wer.getParticularClientEditOption().click();
//		Thread.sleep(3000);
//		driver.quit();

		// wer.getParticularClientEditOption().click();

	}

	// @Test
	public void datas() throws InterruptedException {

		HomePageInsurance("555", "666");

	}
}
