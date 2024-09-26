package com.leadAngel.testCases;
import java.awt.AWTException;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.leadAngel.pageObjects.AdministrationPageObjectModel;
import com.leadAngel.pageObjects.HomePage;
import io.qameta.allure.Description;
import io.qameta.allure.Step;

public class TC_Sanity_CopyAccountDataToLead_Administration extends BaseClass{
	private static final Logger Logger = LogManager.getLogger(TC_Sanity_CopyAccountDataToLead_Administration.class);
	@Test(description = "Administration_CopyAccountDataToLead_Section")
	@Step("Administration_CopyAccountDataToLead_Section")
	@Description("Administration_CopyAccountDataToLead_Section")
	public void AdministrationTest() throws InterruptedException, AWTException {
		SoftAssert sa = new SoftAssert();
		HomePage hp = new HomePage(driver);
		AdministrationPageObjectModel APOM=new AdministrationPageObjectModel(driver);

		Thread.sleep(3000);
		try {
			hp.ClickOnAdministration();
			Logger.info("Click on Administration is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Administration is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			APOM.ClickOnCopyAccountDataToLead();
			Logger.info("Click On Copy Account Data To Lead Fearure is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Copy Account Data To Lead Fearure is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2000);
		if (APOM.DisplayUpdateOnlyBlankFieldsCheckBoxChecked()==true) {
			Thread.sleep(2000);
			try {
				APOM.ClickOnUpdateOnlyBlankFieldsCheckBox();
				Logger.info("Unchecked the Update Only Blank Fields CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Unchecked the Update Only Blank Fields CheckBox is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2000);
			try {
				APOM.ClickOnConfirm();
				Logger.info("Click On Confirm is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Confirm is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(400);
			try {
				if(APOM.DisplayedConfirmSuccessMessage()==true)
					Logger.info("Displayed 'Native Enable Updated' Success Message is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed 'Native Enable Updated' Success Message is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(3500);
			try {
				APOM.ClickOnUpdateOnlyBlankFieldsCheckBox();
				Logger.info("Click on Update Only Blank Fields CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on  Update Only Blank Fields CheckBox is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2000);
			try {
				APOM.ClickOnConfirm();
				Logger.info("Click On Confirm is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Confirm is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(400);
			try {
				if(APOM.DisplayedConfirmSuccessMessage()==true)
					Logger.info("Displayed 'Native Enable Updated' Success Message is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed 'Native Enable Updated' Success Message is Failed",e);
				sa.assertAll();
			}
		} else {
			Thread.sleep(2000);
			try {
				APOM.ClickOnUpdateOnlyBlankFieldsCheckBox();
				Logger.info("Click on Update Only Blank Fields CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on  Update Only Blank Fields CheckBox is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2000);
			try {
				APOM.ClickOnConfirm();
				Logger.info("Click On Confirm is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Confirm is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(400);
			try {
				if(APOM.DisplayedConfirmSuccessMessage()==true)
					Logger.info("Displayed 'Native Enable Updated' Success Message is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed 'Native Enable Updated' Success Message is Failed",e);
				sa.assertAll();
			}
		}
		Thread.sleep(2000);
		if (APOM.DisplayedDeleteButton()==true) {
			Logger.info("************************* Delete Operation ********************");
			List<WebElement> TotalNumberOfDeleteButton = driver.findElements(By.xpath("//i-tabler[@name='trash']"));
			int CountAllDeleteButton =TotalNumberOfDeleteButton.size();

			for (int i = 0; i < CountAllDeleteButton; i++) {
				Thread.sleep(3000);
				try {
					APOM.ClickOnDeleteIcon();
					Logger.info("Click On Delete Button is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Delete Button is Failed",e);
					sa.assertAll();
				}
				Thread.sleep(3000);
				try {
					APOM.ClickAgainDeleteButton();
					Logger.info("Click On Delete Button is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Delete Button is Failed",e);
					sa.assertAll();
				}
				Thread.sleep(600);
				try {
					APOM.DisplayDeletedSuccessfuly();
					Logger.info("Displayed 'DeletedSuccessfuly' is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed 'DeletedSuccessfuly' is is Failed",e);
					sa.assertAll();
				}
				Thread.sleep(3500);
			}
		}else {
			Thread.sleep(2000);
			try {
				APOM.DisplayedNoRecordsFound();
				Logger.info("Displayed 'No Records Found',So continue the precesss is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed 'No Records Found',So continue the precesss is Failed",e);
				sa.assertAll();
			}
		}
		Thread.sleep(5500);
		try {
			APOM.ClickOnAddButtonForCopyAccountDataToLead();
			Logger.info("Click On Add Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Add Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			APOM.ClickOnCRMleadDropDown();
			Logger.info("Click On CRM lead DropDown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CRM lead DropDown is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			APOM.SelectAnOption();
			Logger.info("Select An Option for CRM lead is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select An Option for CRM lead is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			APOM.ClickOnCRMAccountDropDown();
			Logger.info("Click On CRM Account DropDown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CRM Account DropDown is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			APOM.SelectAnOption();
			Logger.info("Select An Option for CRM Account is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select An Option for CRM Account is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			APOM.ClickOnSaveButtonAddRowPopup();
			Logger.info("Click On Save Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(800);
		try {
			APOM.DisplayedSuccessMessage();
			Logger.info("Displayed Success Message is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Success Message is Failed",e);
			sa.assertAll();
		}
		Logger.info("********************************** Edit Operation **********************************");
		Thread.sleep(3000);
		try {
			APOM.ClickOnEditIcon();
			Logger.info("Click On Edit Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Edit Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			APOM.ClickOnCRMleadDropDown();
			Logger.info("Click On CRM lead DropDown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CRM lead DropDown is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			APOM.SelectCRMLeadLabelOption();
			Logger.info("Select Edit Option for CRM lead is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Edit Option for CRM lead is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			APOM.ClickOnCRMAccountDropDown();
			Logger.info("Click On CRM Account DropDown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CRM Account DropDown is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			APOM.SelectCRMAccountLabelOption();
			Logger.info("Select Edit Option for CRM Account is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Edit Option for CRM Account is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			APOM.ClickOnSaveButtonAddRowPopup();
			Logger.info("Click On Save Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(600);
		try {
			APOM.DisplayedUpdateSuccessMessage();
			Logger.info("Displayed Updated Success Message is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Updated Success Message is Failed",e);
			sa.assertAll();
		}

		Logger.info("//*************** Verifying 'Data type must be match' Error message ******************");
		Thread.sleep(3000);
		try {
			APOM.ClickOnAddButtonForCopyAccountDataToLead();
			Logger.info("Click On Add Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Add Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			APOM.ClickOnCRMleadDropDown();
			Logger.info("Click On CRM lead DropDown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CRM lead DropDown is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			APOM.SelectLeadOption();
			Logger.info("Select Lead Option for CRM Account is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Lead Option for CRM Account is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			APOM.ClickOnCRMAccountDropDown();
			Logger.info("Click On CRM Account DropDown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CRM Account DropDown is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			APOM.SelectDeletedOption();
			Logger.info("Select Deleted Option for CRM Account is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Deleted Option for CRM Account is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			APOM.ClickOnSaveButtonAddRowPopup();
			Logger.info("Click On Save Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(600);
		try {
			APOM.DispalyDataTypeMissMatchWarningMessage();
			Logger.info("Display Data Type MissMatch Warning Message is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Data Type MissMatch Warning Message is Failed",e);
			sa.assertAll();
		}
		Logger.info("//*************** Verifying 'Maping Already Present' Error message ******************");
		Thread.sleep(3000);
		try {
			APOM.ClickOnCRMleadDropDown();
			Logger.info("Click On CRM Lead DropDown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CRM Lead DropDown is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			APOM.SelectCRMLeadLabelOption();
			Logger.info("Select an Option which is alredy selected before operation for CRM Account is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select an Option which is alredy selected before operation for CRM Account is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			APOM.ClickOnCRMAccountDropDown();
			Logger.info("Click On CRM Account DropDown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CRM Account DropDown is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			APOM.SelectCRMAccountLabelOption();
			Logger.info("Select an Option which is alredy selected before operation for CRM Account is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select an Option which is alredy selected before operation for CRM Account is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			APOM.ClickOnSaveButtonAddRowPopup();
			Logger.info("Click On Save Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button is Failed",e);
			sa.assertAll();
		}	
		Thread.sleep(600);
		try {
			APOM.DisplayedMappingAlreadyPresentMessage();
			Logger.info("Displayed 'Mapping Already Present' Error Message is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed 'Mapping Already Present' Error Message is Failed",e);
			sa.assertAll();
		}

		Logger.info("//*********************************************** Detail Tab *******************************************");
		Thread.sleep(3000);
		try {
			APOM.ClickOnDetailTab();
			Logger.info("Click On Detail Tab is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Detail Tab is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		if (APOM.GettextLastUpdatedOnForCopyAccountDatatoLead().contains("Undefined")) {
			sa.assertTrue(false);
			Logger.error("'"+APOM.GettextLastUpdatedOnForCopyAccountDatatoLead()+"' is Showing for Last Updated On");
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
			Logger.error("'"+APOM.GettextLastUpdatedBy()+"' is Showing for Last Updated By");
			sa.assertAll();
		}
		else {
			sa.assertTrue(true);
			Logger.info("Not showing 'Undefined' for Last Updated By");
			sa.assertAll();	
		}

	}
}
