package com.leadAngel.testCases;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.leadAngel.pageObjects.HomePage;
import com.leadAngel.pageObjects.LoginPage;
import com.leadAngel.pageObjects.SRandmappings_POM;
@Test
public class TC_Sanity_SRandGroupMapping_LeadManagement extends BaseClass{
	private final static Logger Logger = org.apache.logging.log4j.LogManager.getLogger(SRandAccountMapping_LeadManagement.class);
	public void LeadManagement() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		LoginPage lp = new LoginPage(driver);
		SRandmappings_POM SR= new SRandmappings_POM(driver);
		HomePage hp = new HomePage(driver);

		Thread.sleep(2500);
		try {
			hp.ClickOnLeadManagement();
			Logger.info("Click on Lead Management is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Lead Management is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			SR.ClickedOnSalesTeamDropdown();
			Logger.info("Click On Sales Team Dropdown is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Sales Team Dropdown is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			SR.ClickedOnSRandGroupMapping();
			Logger.info("Click On SR and Group Mapping is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On SR and Group Mapping is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		if (SR.DisplayedNoRecordFound()==true) {
			Logger.info("Displayed No Record Found");
			sa.assertTrue(false);
			sa.assertAll();
		} else {
			sa.assertTrue(true);
		}

		Thread.sleep(2500);
		try {
			SR.ClickedOnDownloadButton();
			Logger.info("Click On Download Button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Download Button is FAILED!!", e);
			sa.assertAll();
		}
		try {
			if (SR.DisplayedFileIsDownloaded()==true) {
				Logger.info("Displayed File Is Downloaded is Passed");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed File Is Downloaded is Failed", e);
			sa.assertAll();
		}

		Logger.info("************************************ Filter Operation **************************************");
		Thread.sleep(3500);
		String Text="";
		try {
			Text=SR.FetchedTextFromSalesRepName();
			Logger.info("Fetch the SalesRep Name Text From Console is Passed");
			Logger.info("SalesRep Name Is: "+Text);
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Fetch the SalesRep Name Text From Console is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			driver.findElement(By.xpath("//input[@placeholder='Filter']")).sendKeys(Text);
			Logger.info("Enter Fetched salesRep name in filter box is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Fetched salesRep name in filter box is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		boolean isDisplayed = driver.findElement(By.xpath("((//td[contains(@class,'mat-column-SalesRepName')])[1]//span[text()])[1]")).isDisplayed();
		if (isDisplayed==true) {
			Logger.info("Displayed Fetched SalesRep name in console is Passed");
			Thread.sleep(2500);
			try {
				SR.ClearedFilterBox();
				Logger.info("Clear Filter Box is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Clear Filter Box is FAILED!!", e);
				sa.assertAll();
			}
		}else {
			sa.assertTrue(false);
			Logger.error("Not Displayed Fetched SalesRep name in console");
			sa.assertAll();
		}


		Logger.info("************************************ Edit Senasrio **************************************");
		Thread.sleep(2500);

		String SalesRepNameBeforeEdit = driver.findElement(By.xpath("(//td[contains(@class,'mat-column-SalesRepName')])[1]//span[text()]")).getText();

		Thread.sleep(2500);
		try {
			SR.ClickedOnEditButton();
			Logger.info("Click On Edit Button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Edit Button is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			SR.ClickedOnDropdownForSalesRepName();
			Logger.info("Click On Dropdown For SalesRep Name is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Dropdown For SalesRep Name is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			SR.ClickedOnOptionFromSalesRepNameDropDown();
			Logger.info("Click On Option From SalesRep Name DropDown is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Option From SalesRep Name DropDown is Failed", e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		try {
			SR.ClickedOnSaveButton();
			Logger.info("Click On Save Button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(500);
		try {
			if (SR.DisplayedUpdateSuccessMessage()==true) {
				Logger.info("Displayed Update Success Message is Passed");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Update Success Message is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		String SalesRepNameSfterEdit = driver.findElement(By.xpath("(//td[contains(@class,'mat-column-SalesRepName')])[1]//span[text()]")).getText();

		Thread.sleep(2500);
		if (SalesRepNameBeforeEdit.contentEquals(SalesRepNameSfterEdit)) {
			Logger.info("SalesRep Name has not changed Once after Edit");
			sa.assertTrue(false);
			sa.assertAll();
		}else {
			sa.assertTrue(true);
		}
		Thread.sleep(2500);

		Logger.info("************************************ Bulk Transfer Senasrio **************************************");
		Thread.sleep(2500);
		try {
			SR.ClickedOnBulkTransferButton();
			Logger.info("Click On Bulk Transfer Button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Bulk Transfer Button is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			SR.ClickedOnFromCurrentSalesRepDropdown();
			Logger.info("Click On From Current SalesRep Dropdown is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On From Current SalesRep Dropdown is Failed", e);
			sa.assertAll();
		}

		List<WebElement> AllLinksOfCurrentSalesRep = driver.findElements(By.xpath("//select[@id='currentSalesRep']//..//select//option[text()]"));
		int countCSR=AllLinksOfCurrentSalesRep.size();
		String getLinkTextCSR="";
		for (int i = 1; i < countCSR; i++) {
			WebElement getLinkCSR = AllLinksOfCurrentSalesRep.get(i);
			getLinkTextCSR = getLinkCSR.getText();
			Thread.sleep(1500);
			try {
				getLinkCSR.click();
				Logger.info("Select "+getLinkTextCSR+" is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select "+getLinkTextCSR+" is Failed",e);
				sa.assertAll();
			}
			break;
		}
		Thread.sleep(2500);
		try {
			SR.ClickedOnToSalesRepDropdown();
			Logger.info("Click On 'To SalesRep' Dropdown is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On 'To SalesRep' Dropdown is Failed", e);
			sa.assertAll();
		}

		List<WebElement> AllLinksOfToSalesRep = driver.findElements(By.xpath("//select[@id='newSalesRep']//..//select//option[text()]"));
		int countTSR=AllLinksOfToSalesRep.size();
		String getLinkTextTSR="";
		for (int i = 1; i < countTSR; i++) {
			WebElement getLinkTSR = AllLinksOfToSalesRep.get(i);
			getLinkTextTSR = getLinkTSR.getText();
			Thread.sleep(1500);
			if (getLinkTextCSR.contentEquals(getLinkTextTSR)) {
				continue;
			}
			else{
				try {
					getLinkTSR.click();
					Logger.info("Select "+getLinkTextTSR+" is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select "+getLinkTextTSR+" is Failed",e);
					sa.assertAll();
				}
				break;
			}	
		}
		Thread.sleep(2500);
		try {
			SR.ClickedOnTransferButton();
			Logger.info("Click On Transfer Button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Transfer Button is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			SR.ClickedOnConfirmButton();
			Logger.info("Click On Confirm Button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Confirm Button is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(500);
		try {
			if (SR.DisplayedBulkTransferSuccessMessage()==true) {
				Logger.info("Displayed Bulk Transfer Success Message is Passed");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Bulk Transfer Success Message is Failed", e);
			sa.assertAll();
		}

		Logger.info("************************************ Delete Operation **************************************");
		Thread.sleep(2500);
		try {
			SR.ClickedOnDeleteIcon();
			Logger.info("Click On DeleteIcon is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Transfer Button is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			SR.ClickedOnDeleteButton();
			Logger.info("Click On Delete Button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Button is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(500);
		try {
			if (SR.DisplayedDeleteSuccessMessage()==true) {
				Logger.info("Displayed Delete Success Message is Passed");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Delete Success Message is Failed", e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		if (SR.DisplayedNoRecordFound()==true) {
			Logger.info("Displayed No Record Found is Passed");
			sa.assertTrue(false);
			sa.assertAll();
		} else {
			sa.assertTrue(true);
		}
		Logger.info("************************************ Bulk Delete Operation **************************************");
		Thread.sleep(2500);
		try {
			SR.ClickedOnBulkDelete();
			Logger.info("Click On Bulk Delete is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Bulk Delete is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			SR.ClickedOnFromCurrentSalesRepDropdown();
			Logger.info("Click On From Current SalesRep Dropdown is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On From Current SalesRep Dropdown is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			SR.SelectedTheFromCurrentSalesRepFirstOption();
			Logger.info("Select the option 'From Current SalesRep' Dropdown is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select the option 'From Current SalesRep' Dropdown is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			SR.ClickedOnDeleteButton();
			Logger.info("Click On Delete Button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Button is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			SR.ClickedOnConfirmButton();
			Logger.info("Click On Confirm Button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Confirm Button is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(500);

		if (SR.DisplayedDeleteSuccessMessage()==true) {
			Logger.info("Displayed Delete Success Message is Passed");
		}
		else {
			Logger.info("Displayed Record Not Found Continued Operation");
			sa.assertTrue(true);
		}
		Thread.sleep(2500);
		if (SR.DisplayedNoRecordFound()==true) {
			Logger.info("Displayed No Record Found");
			sa.assertTrue(false);
			sa.assertAll();
		} else {
			sa.assertTrue(true);
		}
		Logger.info("**************** Bulk Transfer ******************");
		Thread.sleep(2500);
		try {
			SR.ClickedOnBulkTransferButton();
			Logger.info("Click On Bulk Transfer Button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Bulk Transfer Button is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			SR.SelectedTheFromCurrentSalesRepAllOption();
			Logger.info("Select The 'All' Option From Current SalesRep  is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select The 'All' Option From Current SalesRep is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			SR.SelectedTheToSalesRepFirstOption();
			Logger.info("Select The 'ToSalesRep' First Option is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select The 'ToSalesRep' First Option is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			SR.ClickedOnTransferButton();
			Logger.info("Click On Transfer Button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Transfer Button is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			SR.ClickedOnConfirmButton();
			Logger.info("Click On Confirm Button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Confirm Button is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(500);
		try {
			if (SR.DisplayedBulkTransferSuccessMessage()==true) {
				Logger.info("Displayed Bulk Transfer Success Message is Passed");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Bulk Transfer Success Message is Failed", e);
			sa.assertAll();
		}

		Logger.info("*******************Bulk All delete ************************");
		Thread.sleep(5500);
		try {
			SR.ClickedOnBulkDelete();
			Logger.info("Click On Bulk Delete is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Bulk Delete is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			SR.ClickedOnFromCurrentSalesRepDropdown();
			Logger.info("Click On From Current SalesRep Dropdown is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On From Current SalesRep Dropdown is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			SR.SelectedTheFromCurrentSalesRepAllOption();
			Logger.info("Select The From Current SalesRep All Option is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select The From Current SalesRep All Option is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			SR.ClickedOnDeleteButton();
			Logger.info("Click On Delete Button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Button is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			SR.ClickedOnConfirmButton();
			Logger.info("Click On Confirm Button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Confirm Button is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(500);

		if (SR.DisplayedDeleteSuccessMessage()==true) {
			Logger.info("Displayed Delete Success Message is Passed");
		}
		else {
			Logger.info("Displayed Record Not Found Continued Operation");
			sa.assertTrue(true);
		}
		Thread.sleep(2500);
		try {
			if (SR.DisplayedNoRecordFound()==true) {
				Logger.info("Displayed No Record Found is Passed");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed No Record Found is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
	}
}
