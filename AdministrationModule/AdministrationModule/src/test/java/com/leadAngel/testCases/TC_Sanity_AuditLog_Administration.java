package com.leadAngel.testCases;
import java.awt.AWTException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.leadAngel.pageObjects.AdministrationPageObjectModel;
import com.leadAngel.pageObjects.HomePage;
import com.leadAngel.pageObjects.LoginPage;

import io.qameta.allure.Description;
import io.qameta.allure.Step;

public class TC_Sanity_AuditLog_Administration extends BaseClass{
	private static final Logger Logger = LogManager.getLogger(TC_Sanity_AuditLog_Administration.class);

	@Test(description = "Administration_AuditLog_Section")
	@Step("Administration_AuditLog_Section")
	@Description("Administration_AuditLog_Section")
	public void AdministrationTest() throws InterruptedException, AWTException {
		SoftAssert sa = new SoftAssert();
		HomePage hp = new HomePage(driver);
		AdministrationPageObjectModel APOM=new AdministrationPageObjectModel(driver);
		LoginPage lp = new LoginPage(driver);
		// Fetch current date and time
		LocalDateTime now = LocalDateTime.now(); 
		// Define the custom date and time format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy, hh:mm");     
		// Format the current date and time
		String formattedDateTime = now.format(formatter); 
		// Print the formatted date and time
		Logger.info("Formatted Date and Time: '"+formattedDateTime+"'");

		Thread.sleep(2500);
		try {
			hp.ClickOnAdministration();
			Logger.info("Click on Administration is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Administration is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			APOM.ClickOnAuditLogFearure();
			Logger.info("Click On AuditLog Fearure is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On AuditLog Fearure is Failed",e);
			sa.assertAll();
		}

		Logger.info("************ Calender Operation *************");
		Thread.sleep(3500);
		try {
			APOM.ClickOnCalendarButton1();
			Logger.info("Click On CalendarButton is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CalendarButton is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnSearchButton();
			Logger.info("Click On Search Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Search Button is Passed",e);
			sa.assertAll();
		}

		Logger.info("************ Search Operation *************");
		Thread.sleep(3500);
		try {
			driver.findElement(By.xpath("//input[@formcontrolname='searchInput']")).sendKeys(formattedDateTime);
			Logger.info("Enter Login Date&Time in Search field is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Login Date&Time in Search field is Failed",e);
			sa.assertAll();
		}


		Logger.info("************ Verification Login Date and Time *************");
		Thread.sleep(3500);
		String FetchLoginTime="";
		try {
			FetchLoginTime = driver.findElement(By.xpath("((//div[text()=' LOGIN ']//..//..//div[text()='"+emailid+"'])[1]//..//div[text()])[2]")).getText();
			Logger.info("Fetch LoginTime from AuditLog is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Fetch LoginTime from AuditLog is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if(FetchLoginTime.contains(formattedDateTime))
				Logger.info("Login date&Time: "+formattedDateTime);	
			Logger.info("Fetched Login date&Time from AuditLog: "+FetchLoginTime);	
			Logger.info("The date and time are matched");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Login date&Time: "+formattedDateTime);	
			Logger.info("Fetched Login date&Time from AuditLog: "+FetchLoginTime);
			Logger.error("The date and time are not matched",e);
			sa.assertAll();
		}

		Logger.info("************ Login status Verification *************");
		Thread.sleep(2500);
		try {
			driver.findElement(By.xpath("(//div[text()=' LOGIN ']//..//..//div[text()='"+emailid+"'])[1]//..//div[text()='"+FetchLoginTime+"']//..//..//..//td[contains(@class,'mat-column-Status')]//div[text()=' true ']")).isDisplayed();
			Logger.info("Displayed Login status is True");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Login status is False",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		String Status="";
		try {
			Status=driver.findElement(By.xpath("(//div[text()=' LOGIN ']//..//..//div[text()='"+emailid+"'])[1]//..//div[text()='"+FetchLoginTime+"']//..//..//..//td[contains(@class,'mat-column-Status')]//div[text()=' true ']")).getText();
			Logger.info("Login status is :"+Status);
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Login status is :"+Status,e);
			sa.assertAll();
		}

		Logger.info("************ Login Email Verification *************");
		String emailid = readconfig.getEmail();
		Thread.sleep(2500);
		try {
			driver.findElement(By.xpath("(//div[text()=' LOGIN ']//..//..//div[text()='"+emailid+"'])[1]//..//div[text()='"+FetchLoginTime+"']//..//..//..//button[@mattooltip='View Details']")).click();
			Logger.info("Click On Visibility Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Visibility Button is Passed",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		String EmailIdFromActionsPopup="";
		try {
			EmailIdFromActionsPopup = driver.findElement(By.xpath("(//as-split-area//div[text()='Request Body']//..//div[text()])[4]")).getText();
			Logger.info("Fetch EmailId From ActionsPopup is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Fetch EmailId From ActionsPopup is Passed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if(EmailIdFromActionsPopup.contains(emailid))
				Logger.info("Login EmailId :"+ emailid);
			Logger.info("Fetch EmailId From ActionsPopup :"+ EmailIdFromActionsPopup);
				Logger.info("Login EmailId is matched");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Login EmailId is not matched",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnCloseButton();
			Logger.info("Click On Close Button From ActionsPopup is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Close Button From ActionsPopup is Passed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnCloseIconInSearchField();
			Logger.info("Click On Close Icon from Search Field is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Close Icon from Search Field is Passed",e);
			sa.assertAll();
		}

		Logger.info("************ Enteries PerPage Verification *************");
		Thread.sleep(2500);
		try {
			APOM.ClickOnItemsPerPageDropDown();
			Logger.info("Click On Entries Per Page DropDown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Entries Per Page DropDown is Passed",e);
			sa.assertAll();
		}

		List<WebElement> AllOptionsLimitsPerpage = driver.findElements(By.xpath("//mat-option[@role='option']//span[text()]"));
		int CountAllOptions =AllOptionsLimitsPerpage.size();

		for (int i = 0; i < CountAllOptions; i++) {

			if (i!=0) {
				Thread.sleep(1500);
				try {
					APOM.ClickOnItemsPerPageDropDown();
					Logger.info("Click On Items Per Page DropDown is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Items Per Page DropDown is Passed",e);
					sa.assertAll();
				}
			}

			List<WebElement> AllOptionsLimitsPerpagee = driver.findElements(By.xpath("//mat-option[@role='option']//span[text()]"));
			WebElement getLinkLimitsPerpagee = AllOptionsLimitsPerpagee.get(i);
			String getLinkTextLimitsPerpagee = getLinkLimitsPerpagee.getText();
			Thread.sleep(2500);
			try {
				getLinkLimitsPerpagee.click();
				Logger.info("Select "+getLinkTextLimitsPerpagee+" is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select "+getLinkTextLimitsPerpagee+" is Failed",e);
				sa.assertAll();
			}


			if (getLinkTextLimitsPerpagee.contentEquals("10")) {
				if (APOM.Display1to10()==true) {
					Logger.info(getLinkTextLimitsPerpagee+" range label is matched");
				}
				else {
					Logger.info(getLinkTextLimitsPerpagee+" range label is not matched");
				}
			}

			else if (getLinkTextLimitsPerpagee.contentEquals("20")) {
				if (APOM.Display1to20()==true) {
					Logger.info(getLinkTextLimitsPerpagee+" range label is matched");
				}
				else {
					Logger.info(getLinkTextLimitsPerpagee+" range label is not matched");
				}
			}
			else if (getLinkTextLimitsPerpagee.contentEquals("50")) {
				if (APOM.Display1to50()==true) {
					Logger.info(getLinkTextLimitsPerpagee+" range label is matched");
				}
				else {
					Logger.info(getLinkTextLimitsPerpagee+" range label is not matched");
				}
			}
			else if (getLinkTextLimitsPerpagee.contentEquals("100")) {
				if (APOM.Display1to100()==true) {
					Logger.info(getLinkTextLimitsPerpagee+" range label is matched");	
				}
				else {
					Logger.info(getLinkTextLimitsPerpagee+" range label is not matched");
				}
			}
			continue;
		}

	}	
}
