package com.leadAngel.testCases;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.leadAngel.pageObjects.UserSettings;
@Test
public class TC_Sanity_Availability_UserSettings  extends BaseClass{
	private static final Logger Logger = LogManager.getLogger(TC_Sanity_Availability_UserSettings.class);

	public void UserSetting() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		UserSettings US = new UserSettings(driver);

		Logger.info("************************************ Displayed HomePage *************************************");
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
			US.ClickOnAvailabilityFeature();
			Logger.info("Click On Availability Feature is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Availability Feature is Failed!!",e);
			sa.assertAll();
		}

		Logger.info("********************************* Available Hours Operation *********************************");
		Logger.info("-------Select Start Available Hours-------");
		Thread.sleep(2500);
		try {
			US.ClickOnAvailableHoursFirstClockIcon();
			Logger.info("Click On First Clock Icon is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On First Clock Icon is Failed!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			US.ClickOnTimehours1();
			Logger.info("Select Required Time(hours) from the First Clock Icon is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Required Time(hours) from the First Clock Icon is Failed!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			US.ClickOnOkButton();
			Logger.info("Click on 'OK' button for First Clock is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on 'OK' button for First Clock is Failed!!",e);
			sa.assertAll();
		}
		Logger.info("-------Select End Available Hours-------");
		Thread.sleep(2500);
		try {
			US.ClickOnAvailableHoursSecondClockIcon();
			Logger.info("Click On Second Clock Icon is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Second Clock Icon is Failed!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			US.ClickOnTimehours2();
			Logger.info("Select Required Time(hours) from the Second Clock Icon is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Required Time(hours) from the Second Clock Icon is Failed!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			US.ClickOnOkButton();
			Logger.info("Click on 'OK' button for First Clock is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on 'OK' button for First Clock is Failed!!",e);
			sa.assertAll();
		}

		Logger.info("********************************** Vacation date Operation **********************************");
		Thread.sleep(2500);
		if (US.DisplayedCrossButtonForVacasion()==true) {
			try {
				US.ClearStartDateAndEndDate();
				Logger.info("Clear StartDate And EndDate is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Clear StartDate And EndDate is Failed!!",e);
				sa.assertAll();
			}
		}else {
			sa.assertTrue(true);
		}
		
	
		Thread.sleep(2500);
		try {
			US.ClickOnVacationFirstCalendarButton();
			Logger.info("Click on Vacation First Calendar Button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Vacation First Calendar Button is Failed!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			US.ClickOnStartDate();
			Logger.info("Select vacation start date is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select vacation start date is Failed!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			US.ClickOnVacationSecondCalendarButton();
			Logger.info("Click on Vacation Second Calendar Button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Vacation Second Calendar Button is Failed!!",e);
			sa.assertAll();
		}
		if (US.DisplayedEndDate30th()==true) {
			Thread.sleep(2500);
			try {
				US.ClickOnEndDate30th();
				Logger.info("Select vacation End date is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Select vacation End date is Failed!!",e);
				sa.assertAll();
			}
		}
		else if (US.DisplayedEndDate31st()==true) {
			Thread.sleep(2500);
			try {
				US.ClickOnEndDate31st();
				Logger.info("Select vacation End date is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Select vacation End date is Failed!!",e);
				sa.assertAll();
			}
		}

		Logger.info("*************************************** Save Operation **************************************");
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

		Logger.info("========== Verifying when selecting start and End available hours are same,Error message Displayed Or Not =========");
		Logger.info("-------Select Start Available Hours-------");
		Thread.sleep(2500);
		try {
			US.ClickOnAvailableHoursFirstClockIcon();
			Logger.info("Click On First Clock Icon is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On First Clock Icon is Failed!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			US.ClickOnTimehours1();
			Logger.info("Select Required Time(hours) from the First Clock Icon is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Required Time(hours) from the First Clock Icon is Failed!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			US.SelectedAMmode();
			Logger.info("Select 'AM' mode is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select 'AM' mode is Failed!!",e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		try {
			US.ClickOnOkButton();
			Logger.info("Click on 'OK' button for First Clock is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on 'OK' button for First Clock is Failed!!",e);
			sa.assertAll();
		}
		Logger.info("-------Select End Available Hours-------");
		Thread.sleep(2500);
		try {
			US.ClickOnAvailableHoursSecondClockIcon();
			Logger.info("Click On Second Clock Icon is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Second Clock Icon is Failed!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			US.ClickOnTimehours1();
			Logger.info("Select Required Time(hours) from the second Clock Icon is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Required Time(hours) from the second Clock Icon is Failed!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			US.SelectedAMmode();
			Logger.info("Select 'AM' mode is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select 'AM' mode is Failed!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			US.ClickOnOkButton();
			Logger.info("Click on 'OK' button for First Clock is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on 'OK' button for First Clock is Failed!!",e);
			sa.assertAll();
		}
		Logger.info("*************************************** Save Operation **************************************");
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
			if (US.DisplayedErrorMessage()==true) {
				Logger.info("Displayed 'Ending time should be greater' Error message is Passed");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed 'Ending time should be greater' Error message is Failed!!",e);
			sa.assertAll();
		}

		Logger.info("-------Select End Available Hours-------");
		Thread.sleep(2500);
		try {
			US.ClickOnAvailableHoursSecondClockIcon();
			Logger.info("Click On Second Clock Icon is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Second Clock Icon is Failed!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			US.ClickOnTimehours2();
			Logger.info("Select Required Time(hours) from the Second Clock Icon is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Required Time(hours) from the Second Clock Icon is Failed!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			US.ClickOnOkButton();
			Logger.info("Click on 'OK' button for First Clock is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on 'OK' button for First Clock is Failed!!",e);
			sa.assertAll();
		}
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
