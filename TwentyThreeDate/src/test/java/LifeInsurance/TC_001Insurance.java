package LifeInsurance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_001Insurance extends HomePageInsurance {
	String clientPassword="@123@";
	String name="Virat";
	String Gender="MALE";
	String BirthDate="04/06/2000";
	String MaritalStatus="Single";
	String NationalID="4782647";
	String Phone="89045634";
	String Address="Mangaluru";
	String PolicyID="0746650";
	String NomName="Kohli";
	String NomGENDER="MALE";
	String NomBirthDate="08/04/1999";
	String NomNationalID="78554152";
	String NomRelationship="Single";
	String NomPriority="High";
	String NomPhone="9785419546";
	
	
	
	
	@Test
public void TC_001Insurance() throws InterruptedException{
	
		HomePageInsurance("555","666");
		//driver.
		WebElementRepository wer=new WebElementRepository(driver);
		wer.getClientModule().click();
		wer.getAddClient().click();
		wer.getClientpasswordtextefield().sendKeys(clientPassword);
		wer.getName().sendKeys(name);
		wer.getGender().sendKeys(Gender);
		wer.getMarital_Status().sendKeys(MaritalStatus);
		wer.getNID().sendKeys(NationalID);
		wer.getPhone().sendKeys(Phone);
		wer.getAddress().sendKeys(Address);
		wer.getPolicy_id().sendKeys(PolicyID);
		wer.getNominee_name().sendKeys(NomName);
		wer.getNominee_sex().sendKeys(NomGENDER);
		wer.getNominee_birth_date().sendKeys(NomBirthDate);
		wer.getNominee_nid().sendKeys(NomNationalID);
		wer.getNominee_relationship().sendKeys(NomRelationship);
		wer.getPriority().sendKeys(NomPriority);
		wer.getPhone().sendKeys(NomPhone);
		wer.getSubmit().click();
		Thread.sleep(3000);
		driver.quit();
		
		
		
}
}
