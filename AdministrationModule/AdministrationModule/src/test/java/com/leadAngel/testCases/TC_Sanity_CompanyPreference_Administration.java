package com.leadAngel.testCases;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.leadAngel.pageObjects.AdministrationPageObjectModel;
import com.leadAngel.pageObjects.HomePage;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
public class TC_Sanity_CompanyPreference_Administration extends BaseClass{
	private static final Logger Logger = LogManager.getLogger(TC_Sanity_CompanyPreference_Administration.class);

	@Test(description = "Administration_CompanyPreference_Section")
	@Step("Administration_CompanyPreference_Section")
	@Description("Administration_CompanyPreference_Section")
	public void AdministrationTest() throws InterruptedException, AWTException {
		SoftAssert sa = new SoftAssert();
		HomePage hp = new HomePage(driver);
		AdministrationPageObjectModel APOM=new AdministrationPageObjectModel(driver);

		Thread.sleep(3500);
		try {
			hp.ClickOnAdministration();
			Logger.info("Click on Administration is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Administration is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnPreference();
			Logger.info("Click On Preference is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Preference is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (APOM.DisplyedCompanyPreference()==true) {
				Logger.info("Displyed Company Preference Icon is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displyed Company Preference Icon is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnTheCompanyPreference();
			Logger.info("Click On Company Preference is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Company Preference is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (APOM.DisplayedCompanyPrefernceInTabsRow()==true) {
				Logger.info("Displayed Company Prefernce In Tabs Row is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Company Prefernce In Tabs Row is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (APOM.DisplayedCompanyPrefernceInLeftSideMenu()==true) {
				Logger.info("Displayed Company Prefernce In Left Side Menu is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Company Prefernce In Left Side Menu is Failed",e);
			sa.assertAll();
		}

		Logger.info("//***************************  Upload Logo Imagen  ***********************");
		Thread.sleep(2500);
		driver.findElement(By.xpath("//input[@id='file']")).sendKeys("C:\\LeadAngelLogo\\LeadAngel.png");
		Thread.sleep(2500);
		try {
			APOM.ClickOnUploadButton();
			Logger.info("Click On Upload Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Upload Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(4000);
		try {
			if (APOM.DisplyedFileUploadSuccessMessage()==true) {
				Logger.info("Displyed File Upload Success Message is Passed");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displyed File Upload Success Message is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		Actions action=new Actions(driver);
		action.moveToElement(APOM.CompanyLogoToolTipIcon).perform();
		Thread.sleep(2500);
		try {
			if (APOM.DisplayedCompanyLogoToolTip()==true) {
				Logger.info("Displayed Company Logo ToolTip is Passed");	
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Company Logo ToolTip is Faileed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		action.moveToElement(APOM.Click).click().perform();
		Logger.info("//********************************  Enter Company/Client Name ************************");
		Thread.sleep(2500);
		try {
			APOM.EnterCompanyOrClientName();
			Logger.info("Enter Company/Client Name is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Company/Client Name is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		action.moveToElement(APOM.CompanyOrClientNameToolTipIcon).perform();
		try {
			if (APOM.DisplayedCompanyNameToolTip()==true) {
				Logger.info("Displayed Company/client Name ToolTip is Passed");	
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Company/client Name ToolTip is Faileed",e);
			sa.assertAll();
		}	Thread.sleep(2500);

		Thread.sleep(2500);
		action.moveToElement(APOM.Click).click().perform();
		Logger.info("//*********************************** Select TimeZone ************************");
		if (APOM.DisplayedCrossMarkInTimeZone()==true) {
			Thread.sleep(2500);
			try {
				APOM.ClearSelectedTimeZoneOption();
				Logger.info("Clear Selected TimeZone Option is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Clear Selected TimeZone Option is Failed", e);
				sa.assertAll();
			} 
		}else {
			sa.assertTrue(true);
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnTimeZoneDrodown();
			Logger.info("Click On Time Zone Drodown is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Time Zone Drodown is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			APOM.SelectTimeZoneOption();
			Logger.info("Select Time Zone Option is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Time Zone Option is Failed",e);
			sa.assertAll();
		}

		Logger.info("//*******************************Edit Logo Image ************************");		
		Thread.sleep(3000);
		try {
			APOM.ClickOnEditButtonForEitLogo();
			Logger.info("Click On Edit Button For EditLogo is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Edit Button For EditLogo is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2000);
		Robot rb= new Robot();
		StringSelection str= new StringSelection("C:\\LeadAngelLogo\\LA.png");
		//Here robot class is copy the file location which we need to upload
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Logger.info("Copied the file location which we need to upload");
		//Then we need to paste the location on upload file tab
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		Logger.info("Copy paste the file location on upload file tab");
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Logger.info("Click on Open button");
		Thread.sleep(2500);
		try {
			APOM.ClickOnUploadButton();
			Logger.info("Click On Upload Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Upload Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(4000);
		try {
			if (APOM.DisplyedFileUploadSuccessMessage()==true) {
				Logger.info("Displyed File Upload Success Message is Passed");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displyed File Upload Success Message is Failed",e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		try {
			APOM.ClickOnSaveButtonForCompanyPreference();
			Logger.info("Click On Save Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			if (APOM.DisplayedUpdatedSuccessfullyMessage()==true) {
				Logger.info("Displyed Updated Successfully Message is Passed");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displyed Updated Successfully Message is Failed",e);
			sa.assertAll();
		}
		driver.navigate().refresh();
		Logger.info("Page is Refreshed");
		Thread.sleep(5500);

		Logger.info("//*******************************Verification Company name ************************");
		Thread.sleep(3500);
		try {
			APOM.ClickOnProfile();
			Logger.info("Click On Profile is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Profile is Failed",e);
			sa.assertAll();
		}

		String CompanyName="Vyakar Technologies Private Limited India"+APOM.randomInt;
		Logger.info("Company name Which we have Enter: "+CompanyName);
		Thread.sleep(3500);

		if (CompanyName.contentEquals(APOM.FetchComapnyNameFromProfile())) {
			Logger.info("Company name is matched");
			Logger.info("Fetch company name from profile: "+APOM.FetchComapnyNameFromProfile());
		}	
		else {
			sa.assertTrue(false);
			Logger.error("Company name is not matched");
			Logger.info("Fetch company name from profile: "+APOM.FetchComapnyNameFromProfile());
			sa.assertAll();
		}
		Thread.sleep(2000);
		try {
			APOM.ClickOnDomainIcon();
			Logger.info("Click On Domain Icon is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Domain Icon is Failed",e);
			sa.assertAll();
		}

		Logger.info("//*******************************Detail Tab ************************");
		Thread.sleep(3500);
		try {
			APOM.ClickOnDetailTab();
			Logger.info("Click On Detail Tab is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Detail Tab is Failed",e);
			sa.assertAll();
		}

		Thread.sleep(4000);
		if (APOM.GettextLastUpdatedOnForCopyAccountDatatoLead().contains("Undefined")) {
			sa.assertTrue(false);
			Logger.error(APOM.GettextLastUpdatedOnForCopyAccountDatatoLead()+" is Showing for Last Updated On");
			sa.assertAll();
		}
		else {
			sa.assertTrue(true);
			Logger.info("Not showing 'Undefined' for Last Updated On");
			sa.assertAll();	
		}
		Thread.sleep(2500);
		if (APOM.GettextLastUpdatedBy().contains("Undefined")) {
			sa.assertTrue(false);
			Logger.error(APOM.GettextLastUpdatedBy()+" is Showing for Last Updated By");
			sa.assertAll();
		}
		else {
			sa.assertTrue(true);
			Logger.info("Not showing 'Undefined' for Last Updated By");
			sa.assertAll();	
		}
		Thread.sleep(2500);
		try {
			APOM.ClcikOnCompanyPrefernceInTabsRow();
			Logger.info("Click On CompanyPrefernce Tab is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CompanyPrefernce Tab is Failed",e);
			sa.assertAll();
		}
		Logger.info("//*******************************Delete Logo Image ************************");
		Thread.sleep(3500);
		try {
			APOM.ClickOnDeleteButtonForCompanyPreference();
			Logger.info("Click On Delete Button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnDeleteAgainForCompanyPreference();
			Logger.info("Click On Delete Again is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Again is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			if (APOM.DisplyedFileDeletedSuccessMessage()==true) {
				Logger.info("Displyed File Deleted Success Message is Passed");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displyed File Deleted Success Message is Faileed",e);
			sa.assertAll();
		}
		Thread.sleep(1500);
	}	
}
