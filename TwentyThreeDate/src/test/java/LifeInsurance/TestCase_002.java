package LifeInsurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase_002 extends HomePageInsurance {

	// Comparing Cleint Birth Date
	@Test
	public void addClient() throws InterruptedException {
		HomePageInsurance("555", "666");
		WebDriverWait explicitwait = new WebDriverWait(driver, 15);

		WebElementRepository addclient = new WebElementRepository(driver);
		addclient.getClientModule().click();
		addclient.getAddClient().click();

		addclient.getClientpasswordtextefield().sendKeys("123@");
		addclient.getName().sendKeys("Yuvraj");
		WebElement imagefileuploadbutton = addclient.getFileuploadbutton();
		imagefileuploadbutton.sendKeys("C:\\Users\\HP\\Downloads\\ty logo.png");
		Reporter.log("file uploaded successfully", true);
		addclient.getGender().sendKeys("male");
		addclient.getBirthDate().sendKeys("01-02-2003");
		WebElement clientidBirthDAte = addclient.getBirthDate();
		String expectedclientBirthDate = clientidBirthDAte.getAttribute("value");
		Reporter.log(expectedclientBirthDate, true);
		addclient.getMarital_Status().sendKeys("single");
		addclient.getNID().sendKeys("UG91");
		addclient.getPhone().sendKeys("1234567890");
		addclient.getAddress().sendKeys("Mumbai");
		addclient.getPolicy_id().sendKeys("lic123456");
		addclient.getNominee_name().sendKeys("dhoni");
		addclient.getNominee_sex().sendKeys("male");
		addclient.getNominee_birth_date().sendKeys("04-06-2008");
		addclient.getNominee_nid().sendKeys("in09");
		addclient.getNominee_relationship().sendKeys("Marr");
		addclient.getPriority().sendKeys("low");
		addclient.getNominee_phone().sendKeys("9876543210");
		addclient.getSubmit().click();

		addclient.getClientModule().click();
		WebElement referenceBirthDate = driver
				.findElement(By.xpath("//td[text()='Yuvraj']/..//td[text()='" + expectedclientBirthDate + "']"));
		explicitwait.until(ExpectedConditions.visibilityOf(referenceBirthDate));
		// explicitwait.until(ExpectedConditions.textToBePresentInElement(referenceid,
		// expectedclientid));
		// (ExpectedConditions.textToBePresentInElement(referenceid, expectedclientid));
		String actualBirthDate = referenceBirthDate.getText();
		Reporter.log("actual id is: " + actualBirthDate, true);

		Assert.assertEquals(expectedclientBirthDate, actualBirthDate, "client Birth Date is not matching");
		Reporter.log("client Birth Date is mathching", true);

	}

}
