package com.leadAngel.testCases;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.leadAngel.pageObjects.AdministrationPageObjectModel;
import com.leadAngel.pageObjects.HomePage;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
public class TC_Sanity_UploadCSVtoCRM_Analytics extends BaseClass {
	private static final Logger Logger = LogManager.getLogger(TC_Sanity_UploadCSVtoCRM_Analytics.class);
	@Test(description = "Administration_UploadCSVtoCRM_Section")
	@Step("Administration_UploadCSVtoCRM_Section")
	@Description("Administration_UploadCSVtoCRM_Section")
	public void AdministrationTest() throws InterruptedException, AWTException {
		SoftAssert sa = new SoftAssert();
		HomePage hp = new HomePage(driver);
		AdministrationPageObjectModel APOM=new AdministrationPageObjectModel(driver);

		Thread.sleep(3500);
		try {
			hp.ClickOnAdministration();
			Logger.info("Clicked on Administration is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked on Administration is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnUploadCSVtoCRM();
			Logger.info("Click On Upload CSV to CRM is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Upload CSV to CRM is Failed",e);
			sa.assertAll();
		}
		Logger.info("********************************* Upload File *************************************");
		Thread.sleep(3000);
		try {
			driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Arosys\\OneDrive\\Desktop\\Ganesh\\Automation\\CsvTest.csv");
			Logger.info("Upload CSV file is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Upload CSV file is Failed",e);
			sa.assertAll();
		}

		Logger.info("********************************* Filter Operation *************************************");
		Logger.info("******** FirstName ********");
		Thread.sleep(3500);
		String FirstName = driver.findElement(By.xpath("(//td[@class='mat-cell cdk-cell cdk-column-FirstName mat-column-FirstName ng-star-inserted'])[1]")).getText();

		Thread.sleep(2500);
		try {
			driver.findElement(By.xpath("//input[@placeholder='Filter']")).sendKeys(FirstName);
			Logger.info("Entered FirstName inside filter box is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Entered FirstName inside filter box is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			boolean DisplayedFirstName = driver.findElement(By.xpath("//td[@class='mat-cell cdk-cell cdk-column-FirstName mat-column-FirstName ng-star-inserted'][text()=' "+FirstName+" ']")).isDisplayed();
			if (DisplayedFirstName==true) {
				Logger.info("Displayed First name in console is Passed");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed First name in console is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClearFilterBox();
			Logger.info("Clear Filter Box is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clear Filter Box is Failed",e);
			sa.assertAll();
		}

		Logger.info("******** LastName ********");
		Thread.sleep(2500);
		String LastName = driver.findElement(By.xpath("(//td[@class='mat-cell cdk-cell cdk-column-LastName mat-column-LastName ng-star-inserted'])[1]")).getText();
		Thread.sleep(2500);
		try {
			driver.findElement(By.xpath("//input[@placeholder='Filter']")).sendKeys(LastName);
			Logger.info("Entered LastName inside filter box is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Entered LastName inside filter box is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			boolean DisplayedLastName = driver.findElement(By.xpath("//td[@class='mat-cell cdk-cell cdk-column-LastName mat-column-LastName ng-star-inserted'][text()=' "+LastName+" ']")).isDisplayed();
			if (DisplayedLastName==true) {
				Logger.info("Displayed Last name in console is Passed");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Last name in console is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClearFilterBox();
			Logger.info("Clear Filter Box is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clear Filter Box is Failed",e);
			sa.assertAll();
		}

		Logger.info("******** Company ********");
		Thread.sleep(2500);
		String Company = driver.findElement(By.xpath("(//td[@class='mat-cell cdk-cell cdk-column-Company mat-column-Company ng-star-inserted'])[1]")).getText();
		Thread.sleep(2500);
		try {
			driver.findElement(By.xpath("//input[@placeholder='Filter']")).sendKeys(Company);
			Logger.info("Entered Company inside filter box is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Entered Company inside filter box is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			boolean DisplayedCompany = driver.findElement(By.xpath("//td[@class='mat-cell cdk-cell cdk-column-Company mat-column-Company ng-star-inserted'][text()=' "+Company+" ']")).isDisplayed();
			if (DisplayedCompany==true) {
				Logger.info("Displayed Company in console is Passed");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Comapny in console is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClearFilterBox();
			Logger.info("Clear Filter Box is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clear Filter Box is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnNextButton();
			Logger.info("Click On Next Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Next Button is Failed",e);
			sa.assertAll();
		}


		Logger.info("************************************* Column Mapping Operation *******************************");
		Logger.info("******** FirstName Mapping ********");
		Thread.sleep(2500);
		try {
			APOM.ClickOnFirstNameDropdown();
			Logger.info("Click On FirstName Dropdown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On FirstName Dropdown is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.SelectFirstNameOption();
			Logger.info("Select FirstName Option is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select FirstName Option is Failed",e);
			sa.assertAll();
		}

		Logger.info("******** LastName Mapping ********");
		Thread.sleep(2500);
		try {
			APOM.ClickOnLastNameDropdown();
			Logger.info("Click On LastName Dropdown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On LastName Dropdown is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.SelectLastNameOption();
			Logger.info("Select LastName Option is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select LastName Option is Failed",e);
			sa.assertAll();
		}


		Logger.info("******** Company Mapping ********");
		Thread.sleep(2500);
		try {
			APOM.ClickOnCompanyDropdown();
			Logger.info("Click On Company Dropdown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Company Dropdown is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.SelectCompanyOption();
			Logger.info("Select Company Option is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Company Option is Failed",e);
			sa.assertAll();
		}

		Logger.info("********************************** Verification for Disabled Options *************************************");
		Thread.sleep(2500);
		try {
			APOM.ClickOnFirstNameDropdown();
			Logger.info("Click On FirstName Dropdown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On FirstName Dropdown is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (APOM.DisplayedLastNameIsDisabled()==true) {
				Logger.info("Displayed LastName Is Disabled is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed LastName Is Disabled is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (APOM.DisplayedCompanyIsDisabled()==true) {
				Logger.info("Displayed Company Is Disabled is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Company Is Disabled is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnFirstNameDropdown();
			Logger.info("Close FirstName Dropdown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Close FirstName Dropdown is Failed",e);
			sa.assertAll();
		}


		Thread.sleep(2500);
		try {
			APOM.ClickOnLastNameDropdown();
			Logger.info("Click On LastName Dropdown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On LastName Dropdown is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (APOM.DisplayedFirstNameIsDisabled()==true) {
				Logger.info("Displayed FirstName Is Disabled is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed FirstName Is Disabled is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (APOM.DisplayedCompanyIsDisabled()==true) {
				Logger.info("Displayed Company Is Disabled is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Company Is Disabled is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnLastNameDropdown();
			Logger.info("Close LastName Dropdown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Close LastName Dropdown is Failed",e);
			sa.assertAll();
		}


		Thread.sleep(2500);
		try {
			APOM.ClickOnCompanyDropdown();
			Logger.info("Click On Company Dropdown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Company Dropdown is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (APOM.DisplayedFirstNameIsDisabled()==true) {
				Logger.info("Displayed FirstName Is Disabled is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed FirstName Is Disabled is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (APOM.DisplayedLastNameIsDisabled()==true) {
				Logger.info("Displayed LastName Is Disabled is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed LastName Is Disabled is Failed",e);
			sa.assertAll();
		}

		Logger.info("****************************************** Save And Upload ***************************************");
		Thread.sleep(2500);
		try {
			APOM.ClickSaveAndUploadButton();
			Logger.info("Click SaveAndUpload Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click SaveAndUpload Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(600);
		try {
			if (APOM.DisplayedFileUploadSuccesMessage()==true) {
				Logger.info("Displayed File Upload Success Message is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed File Upload Success Message is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
	}	
}
