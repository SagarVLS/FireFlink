package LifeInsurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase_005 extends HomePageInsurance {

	// Comparing Client ID in nominee module
	@Test
	public void addClient() throws InterruptedException {
		HomePageInsurance("555", "666");
		WebDriverWait explicitwait = new WebDriverWait(driver, 15);

		WebElementRepository addclient = new WebElementRepository(driver);
		addclient.getClientModule().click();
		addclient.getAddClient().click();
		WebElement clientNomineeClientID = addclient.getClientidtextfield();

		String expectedNomineeClientId = clientNomineeClientID.getAttribute("value");
		Reporter.log(expectedNomineeClientId, true);
		addclient.getClientpasswordtextefield().sendKeys("123@");
		addclient.getName().sendKeys("Shubman");
		WebElement imagefileuploadbutton = addclient.getFileuploadbutton();
		imagefileuploadbutton.sendKeys("C:\\Users\\HP\\Downloads\\ty logo.png");
		Reporter.log("file uploaded successfully", true);
		addclient.getGender().sendKeys("male");
		addclient.getBirthDate().sendKeys("01-01-2001");

		addclient.getMarital_Status().sendKeys("single");
		addclient.getNID().sendKeys("UG91");
		addclient.getPhone().sendKeys("1234567890");
		addclient.getAddress().sendKeys("Mumbai");
		addclient.getPolicy_id().sendKeys("lic123456");
		addclient.getNominee_name().sendKeys("Gill");
		addclient.getNominee_sex().sendKeys("male");
		addclient.getNominee_birth_date().sendKeys("04-06-2008");

		addclient.getNominee_nid().sendKeys("in09");
		addclient.getNominee_relationship().sendKeys("tribute");
		addclient.getPriority().sendKeys("low");
		addclient.getNominee_phone().sendKeys("635289876543");
		addclient.getSubmit().click();

		addclient.getNomineeModule().click();
		WebElement referenceNomineeClientID = driver
				.findElement(By.xpath("//td[text()='Gill']/..//td[text()='" + expectedNomineeClientId + "']"));
		explicitwait.until(ExpectedConditions.visibilityOf(referenceNomineeClientID));
		String actualNomineeClientId = referenceNomineeClientID.getText();
		Reporter.log("actual Nominee Name is: " + actualNomineeClientId, true);

		Assert.assertEquals(expectedNomineeClientId, actualNomineeClientId, "Client Id is not matching");
		Reporter.log("Client Id is mathching", true);

	}

}
