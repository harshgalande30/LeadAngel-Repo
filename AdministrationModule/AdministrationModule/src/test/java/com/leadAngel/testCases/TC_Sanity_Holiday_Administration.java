package com.leadAngel.testCases;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.leadAngel.pageObjects.AEtoSDR_Page;
import com.leadAngel.pageObjects.AdministrationPageObjectModel;
import com.leadAngel.pageObjects.HomePage;
import com.leadAngel.pageObjects.LeadManagementPage;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
public class TC_Sanity_Holiday_Administration extends BaseClass{
	private static final Logger Logger = LogManager.getLogger(TC_Sanity_Holiday_Administration.class);

	@Test(description = "Administration_Holiday_Section")
	@Step("Administration_Holiday_Section")
	@Description("Administration_Holiday_Section")
	public void AdministrationTest() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		HomePage hp = new HomePage(driver);
		AdministrationPageObjectModel APOM=new AdministrationPageObjectModel(driver);
		LeadManagementPage LMP = new LeadManagementPage(driver);
		AEtoSDR_Page ae = new AEtoSDR_Page(driver);

		Thread.sleep(2500);
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
			APOM.ClickOnHoliday();
			Logger.info("Click On Holiday is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Holiday is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnDrodownToChangeYearORmonth();
			Logger.info("Click On Drodown To Change Year is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Drodown To Change Year is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ChooseYearButton();
			Logger.info("Choose Year Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Choose Year Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnDrodownToChangeYear();
			Logger.info("Click On Drodown To Change Year is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Drodown To Change Year is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.SelectTheYear();
			Logger.info("Select The Year is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select The Year is Failed",e);
			sa.assertAll();
		}

		Logger.info("//===============================Create New Holiday========================================!");
		Thread.sleep(2500);
		try {
			APOM.ClickOnAddHolidayButton();
			Logger.info("Click On Add Holiday Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Add Holiday Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.EnterHolidayTitle();
			Logger.info("Enter Holiday Title is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Holiday Title is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.EnterHolidayDescription();
			Logger.info("Enter Holiday Description is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Holiday Description is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnCalendarButton1();
			Logger.info("Click On First CalendarButton is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On First CalendarButton is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnYearButton1();
			Logger.info("Click On Year Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Year Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ChooseAnYear();
			Logger.info("Choose An Year is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Choose An Year is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ChooseAmonth();
			Logger.info("Choose A Month is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Choose A Month is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ChooseADate();
			Logger.info("Choose A Date is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Choose A Date is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnSaveButtonForHoliday();
			Logger.info("Click On Save Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button is Failed",e);
			sa.assertAll();
		}

		Thread.sleep(500);
		if (ae.DisplaySameAEerror() == true) {
			Logger.error("Holiday details already exists foor this date, Deleting Object NOW!!! then Creating New Object!!");
			Thread.sleep(2500);
			try {
				APOM.ClickOnCancelButtonForHoliday();
				Logger.info("Click On Cancel Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Cancel Button is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnDeleteButtonForHoliday();
				Logger.info("Click On Delete Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Delete Button is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnDeletebutton();
				Logger.info("Click On Delete button is Passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Delete button is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(600);
			try {
				if (APOM.DisplayedDeleteMessage() == true) {
					Logger.info("Holiday object successfully deleted is PASSED!!!");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Holiday object successfully deleted is FAILED!", e);
				sa.assertAll();
			}
			Logger.info("Creating New Object After Deleting Old One!!!");
			Thread.sleep(2500);
			try {
				APOM.ClickOnAddHolidayButton();
				Logger.info("Click On Add Holiday Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Add Holiday Button is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.EnterHolidayTitle();
				Logger.info("Enter Holiday Title is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter Holiday Title is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.EnterHolidayDescription();
				Logger.info("Enter Holiday Description is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter Holiday Description is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnCalendarButton1();
				Logger.info("Click On First CalendarButton is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On First CalendarButton is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnYearButton1();
				Logger.info("Click On Year Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Year Button is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ChooseAnYear();
				Logger.info("Choose An Year is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Choose An Year is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ChooseAmonth();
				Logger.info("Choose A Month is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Choose A Month is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ChooseADate();
				Logger.info("Choose A Date is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Choose A Date is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnSaveButtonForHoliday();
				Logger.info("Click On Save Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Save Button is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				if (APOM.DisplayedSuccesMessage()==true) {
					Logger.info("Displayed Success Message is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Success Message is Failed",e);
				sa.assertAll();
			}
		}
		else{
			sa.assertTrue(true);
		}

		Logger.info("//===============================Edit Opration Holiday========================================!");
		Thread.sleep(2500);
		try {
			APOM.ClickOnEditButtonForHoliday();
			Logger.info("Click On Edit Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Edit Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.EditHolidayDescription();
			Logger.info("Edit Holiday Description is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Edit Holiday Description is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnUpdateButton();
			Logger.info("Click On Update Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Update Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(800);
		try {
			if (APOM.DisplayedUpdatedSuccesMessage()==true) {
				Logger.info("Displayed Update Success Message is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Update Success Message is Failed",e);
			sa.assertAll();
		}

		Logger.info("//===============================Verification created New Holiday by changing the year========================================!");
		Thread.sleep(2500);
		try {
			APOM.ClickOnDrodownToChangeYearORmonth();
			Logger.info("Click On Drodown To Change Year is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Drodown To Change Year is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ChooseYearButton();
			Logger.info("Choose Year Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Choose Year Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		if (APOM.DisplayedAutomationHolidayObject()==true) {
			sa.assertTrue(false);
			Logger.info("Holiday object is displayed,In this case holiday object should not displayed,So failed");
			sa.assertAll();
		}
		else {
			sa.assertTrue(true);
			Logger.info("Not displayed holiday object,In this case holiday object should not displayed,So Passed");
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnDrodownToChangeYear();
			Logger.info("Click On Drodown To Change Year is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Drodown To Change Year is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.SelectTheYear();
			Logger.info("Select The Year is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select The Year is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		if (APOM.DisplayedAutomationHolidayObject()==true) {
			Logger.info("Holiday object is displayed,In this case holiday object should be displayed,So passed");
			sa.assertAll();
		}
		else {
			sa.assertTrue(false);
			Logger.info("Not displayed holiday object,In this case holiday object should be displayed,So Failed");
			sa.assertAll();
		}

		Logger.info("//===============================Verification created New Holiday by changing the Month========================================!");
		Thread.sleep(2500);
		try {
			APOM.ClickOnDrodownToChangeYearORmonth();
			Logger.info("Click On Drodown To Change Year is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Drodown To Change Year is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ChooseMonthButton();
			Logger.info("Choose Year Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Choose Year Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		if (APOM.DisplayedAutomationHolidayObject()==true) {
			sa.assertTrue(false);
			Logger.info("Holiday object is displayed,In this case holiday object should not displayed,So failed");
			sa.assertAll();
		}
		else {
			sa.assertTrue(true);
			Logger.info("Not displayed holiday object,In this case holiday object should not displayed,So Passed");
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnDrodownToChangeYearORmonth();
			Logger.info("Click On Drodown To Change Year is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Drodown To Change Year is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ChooseYearButton();
			Logger.info("Choose Year Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Choose Year Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnDrodownToChangeYear();
			Logger.info("Click On Drodown To Change Year is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Drodown To Change Year is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.SelectTheYear();
			Logger.info("Select The Year is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select The Year is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		if (APOM.DisplayedAutomationHolidayObject()==true) {
			Logger.info("Holiday object is displayed,In this case holiday object should be displayed,So passed");
			sa.assertAll();
		}
		else {
			sa.assertTrue(false);
			Logger.info("Not displayed holiday object,In this case holiday object should be displayed,So Failed");
			sa.assertAll();
		}

		Logger.info("//===============================Delete Operation Holiday ========================================!");
		Thread.sleep(2500);
		try {
			APOM.ClickOnDeleteButtonForHoliday();
			Logger.info("Click On Delete Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnDeletebutton();
			Logger.info("Click On Delete button is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete button is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(600);
		try {
			if (APOM.DisplayedDeleteMessage() == true) {
				Logger.info("Holiday object successfully deleted is PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Holiday object successfully deleted is FAILED!", e);
			sa.assertAll();
		}
	}	
}
