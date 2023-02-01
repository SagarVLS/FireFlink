package LifeInsurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchingWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.puma.com/in/en");
		String ParentWindow = driver.getWindowHandle();
		driver.findElement(By.id("nav-cart-link")).click();
		String collectionWindow = driver.getWindowHandle();
		Thread.sleep(5000);
		driver.navigate().back();
		/*driver.switchTo().window(ParentWindow);
		Thread.sleep(3000);
		driver.switchTo().window(collectionWindow);
		Thread.sleep(3000);*/
		driver.quit();
	}

}
