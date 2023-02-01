package LifeInsurance;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage {
	 @FindBy(name = "username")
	 private WebElement username;
	  
	 @FindBy(name = "password")
	 private WebElement password;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}
}
