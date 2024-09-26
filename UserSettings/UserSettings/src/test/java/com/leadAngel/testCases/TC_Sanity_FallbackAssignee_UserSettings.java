package com.leadAngel.testCases;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.leadAngel.pageObjects.UserSettings;
@Test
public class TC_Sanity_FallbackAssignee_UserSettings extends BaseClass{
	private static final Logger Logger = LogManager.getLogger(TC_Sanity_FallbackAssignee_UserSettings.class);

	public void UserSetting() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		UserSettings US = new UserSettings(driver);

		Logger.info("***************************************** Displayed HomePage *******************************************");
		Thread.sleep(2500);
		try {
			US.ClickOnUserSettingsModule();
			Logger.info("Click On User Settings Module is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On User Settings Module is Failed!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			US.ClickOnPreferenceDropdown();
			Logger.info("Click On Preference Dropdown is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Preference Dropdown is Failed!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			US.ClickOnFallbackAssignee();
			Logger.info("Click On Fallback Assignee Feature is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Fallback Assignee Feature is Failed!!",e);
			sa.assertAll();
		}
		Logger.info("***************************** Clear Fallback Assignee list box Operation ********************************");
		Thread.sleep(2500);
		try {
			US.ClickOnCancelButton();
			Logger.info("Click On Cancel Button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Cancel Button is Failed!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (US.DisplayedFallbackAssigneeTextBoxIsEmpty()==true) {
				Logger.info("Displayed Fallback Assignee ListBox Is Empty is Passed");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Fallback Assignee ListBox Is Empty is Failed!!",e);
			sa.assertAll();
		}
		Logger.info("********************** Selecting the Fallback Assignee list box Options Operation ************************");
		Thread.sleep(2500);
		try {
			US.ClickOnFallbackAssigneeDropdown();
			Logger.info("Click On Fallback Assignee Dropdown is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Fallback Assignee Dropdown is Failed!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			US.SelectedAnOption();
			Logger.info("Select an option from the Fallback Assignee listbox is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select an option from the Fallback Assignee listbox is Failed!!",e);
			sa.assertAll();
		}
		Logger.info("******************************************* Save Operation **********************************************");
		Thread.sleep(2500);
		try {
			US.ClickOnSaveButton();
			Logger.info("Click On Save Button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button is Failed!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (US.DisplayedSuccesMessage()==true) {
				Logger.info("Displayed 'Saved Successfully' message is Passed");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed 'Saved Successfully' message is Failed!!",e);
			sa.assertAll();
		}
	}
}
