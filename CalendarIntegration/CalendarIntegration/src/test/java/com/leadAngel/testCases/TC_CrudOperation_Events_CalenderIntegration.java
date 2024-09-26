package com.leadAngel.testCases;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.leadAngel.pageObjects.CalendarIntegrationPageObjectModel;
@Listeners({ com.leadAngel.utilities.TestAllureListener.class })
@Test
public class TC_CrudOperation_Events_CalenderIntegration extends BaseClass{
	private static final Logger Logger= LogManager.getLogger(TC_CrudOperation_Events_CalenderIntegration.class);
	public void crud_AccountList() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		CalendarIntegrationPageObjectModel CL=new CalendarIntegrationPageObjectModel(driver);

		Thread.sleep(3500);
		try {
			CL.ClickOnCalendarIntegration();
			Logger.info("Click on Calendar Integration is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Calendar Integration is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			CL.ClickOnEventsFeature();
			Logger.info("Click On Events Feature is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Events Feature is FAILED!!", e);
			sa.assertAll();
		}

		Logger.info("************************************** Booking HomePage Operation ***************************************");
		String ParentWindow = driver.getWindowHandle();
		Thread.sleep(3500);
		try {
			CL.ClickOnCopyIcon();
			Logger.info("Click On Booking HomePage CopyIcon is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Booking HomePage CopyIcon is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(400);
		try {
			if(CL.DisplayedCopiedSuccessMessage()==true)
				Logger.info("Displayed CopiedSuccess Message is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed CopiedSuccess Message is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		if(CL.DisplayedWeCouldntAccessYourCalendarMessage()==true) {
			Logger.info("Displayed 'We Couldnt Access Your Calendar' Message");
			Thread.sleep(1500);
			try {
				CL.ClickOnBookingHomePageLink();
				Logger.info("Click On BookingHomePageLink is Passed !!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On BookingHomePageLink is Failed !!", e);
				sa.assertAll();
			}
			Thread.sleep(3500);
			Set<String> Allwindow1 = driver.getWindowHandles();
			for (String wh : Allwindow1) {
				driver.switchTo().window(wh);
				if (wh.equals(ParentWindow)) {
					continue;
				} else {
					Thread.sleep(4500);
					try {
						if(CL.DisplayedThisEventHasBeenRemovedYouCannotAccessThisLinkAlertMessage()==true)
							Logger.info("Displayed 'This event has been removed, you cannot access this link.' is Passed !!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Displayed 'This event has been removed, you cannot access this link.' is Failed !!", e);
						sa.assertAll();
					}
					driver.close();	
					break;
				}
			}
		}else{
			Thread.sleep(1500);
			try {
				CL.ClickOnBookingHomePageLink();
				Logger.info("Click On BookingHomePageLink is Passed !!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On BookingHomePageLink is Failed !!", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			Set<String> Allwindow1 = driver.getWindowHandles();
			for (String wh : Allwindow1) {
				driver.switchTo().window(wh);
				if (wh.equals(ParentWindow)) {
					continue;
				} else {
					Thread.sleep(4500);
					try {
						if(CL.DisplayedWelcomeToMySchedulingPage()==true)
							Logger.info("Displayed 'Welcome to my scheduling page please follow the instructions to add an event to my calendar' is Passed !!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Displayed 'Welcome to my scheduling page please follow the instructions to add an event to my calendar' is Failed !!", e);
						sa.assertAll();
					}
					driver.close();	
					break;
				}
			}	
		}

		Thread.sleep(2500);
		try {
			driver.switchTo().window(ParentWindow);
			Logger.info("Swicth back to parent window is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Swicth back to parent window is Failed !!", e);
			sa.assertAll();
		}

		Logger.info("************************************** Create Event Operation ***************************************");
		Thread.sleep(2000);
		while(CL.VerifyDisplayAutoTestObject()==true) {
			Logger.info("Displayed AutoTestObject is passed");
			{
				if(CL.DisplayedRadioButtonIsUnchecked()==true) {
					Logger.info("Displayed RadioButton Is Unchecked is Passed !!");
					Thread.sleep(1500);
					try {
						CL.ClickOnRadioButton();
						Logger.info("Click On RadioButton is passed");
					}catch(Exception e) {
						sa.assertTrue(false);
						Logger.error("Click On RadioButton is FAILED!!", e);
						sa.assertAll();
					}
				}else {
					sa.assertTrue(true);
				}
				Thread.sleep(3000);
				try {
					CL.ClickOnDropDownButtonForAutoTestObject();
					Logger.info("Click On DropDown Button For AutoTestObject is passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On DropDown Button For AutoTestObject is FAILED!!", e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					CL.ClickOnDeleteButtonForAutoTestObject();
					Logger.info("Click On Delete Button For AutoTestObject is passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Delete Button For AutoTestObject is FAILED!!", e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					CL.ClickOnDelete();
					Logger.info("Click On Delete is PASSED!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Delete is FAILED!", e);
					sa.assertAll();
				} 
				Thread.sleep(300);
				try {
					if (CL.VerifySuccessmessage() == true) {
						Logger.info("Verify Success message is PASSED!!!");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Verify Success message is FAILED!", e);
					sa.assertAll();
				}
			}
			Thread.sleep(3500);
			continue;
		}

		Thread.sleep(2500);
		try {
			CL.ClickOnNewEventButton();
			Logger.info("Click On NewEvent Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On NewEvent Button is FAILED!!", e);
			sa.assertAll();
		}	
		Thread.sleep(200);
		if (CL.DisplayedWeCouldNotAccessYourCalendarErrorMessage()==true) {
			sa.assertTrue(false);
			Logger.error("Displayed 'We Could Not Access Your Calendar' ErrorMessage, So closed Event feature Operation");
			sa.assertAll();
		}else {
			sa.assertTrue(true);
		}
		Thread.sleep(2500);
		try {
			CL.ClickOnCreateButton();
			Logger.info("Click On Create Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Create Button is FAILED!!", e);
			sa.assertAll();
		}

		Logger.info("//===============================(What Event Is This) Operation========================================!");
		Thread.sleep(5000);
		try {
			CL.EnterEventNameEvents();
			Logger.info("Enter Event Name is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Event Name is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			CL.SelectLocation();
			Logger.info("Select Location is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Location is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			CL.EnterAddLocation();
			Logger.info("Enter Add Location is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Add Location is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			CL.SelectCustomInThankYouPageURL();
			Thread.sleep(3500);
			CL.SelectCustomInThankYouPageURL();
			Logger.info("Select Custom In ThankYouPageURL is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Custom In ThankYouPageURL is FAILED!!", e);
			sa.assertAll();
		}	
		Thread.sleep(2500);
		try {
			CL.EnterCustomURL();
			Logger.info("Enter Custom URL is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Custom URL is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			CL.ClickOnCheckBoxForAllowGuestsToCancelOrRescheduleMeetingEvents();
			Logger.info("Click On CheckBox For AllowGuestsToCancelOrRescheduleMeeting is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CheckBox For AllowGuestsToCancelOrRescheduleMeeting is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if(CL.DisplayedAllowGuestsToCancelOrRescheduleMeetingEventsCheckboxIsChecked()==true) {
				Logger.info("Displayed AllowGuestsToCancelOrRescheduleMeetingEvents Checkbox Is Checked is Passed");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed AllowGuestsToCancelOrRescheduleMeetingEvents Checkbox Is Checked is FAILED!!", e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		try {
			CL.ClickOnRadioButtonForShowThisEventOnlyForSelectedWebToLeadForms();
			Logger.info("Click On Radio Button For ShowThisEventOnlyForSelectedWebToLeadForms is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Radio Button For ShowThisEventOnlyForSelectedWebToLeadForms is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			CL.SelectedWebToLeadFormsDropdown();
			Logger.info("Click on WebToLeadForms Dropdown is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on WebToLeadForms Dropdown is FAILED!!", e);
			sa.assertAll();
		}

		//****************
		Thread.sleep(3500);
		String ObjectNameBeforeClickNewTabLink1 = driver.findElement(By.xpath("(//a[text()=' open_in_new '])[1]//..//span[text()]")).getText();
		Logger.info("Object Name Before Click NewTab Link: "+ObjectNameBeforeClickNewTabLink1);
		Thread.sleep(3500);
		try {
			CL.ClickOnOpenInNewTabLink();
			Logger.info("Click On Open In New Tab Link is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Open In New Tab Link is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(5500);
		Set<String> Allwindow1 = driver.getWindowHandles();
		Thread.sleep(4000);
		for (String wh : Allwindow1) {
			driver.switchTo().window(wh);
			if (wh.equals(ParentWindow)) {
				continue;
			} else {
				Thread.sleep(4500);
				try {
					CL.ClickOnDetailPage();
					Logger.info("Click On Detail Page is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Detail Page is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(4500);
				String ObjectNameAfterClickNewTabLink = driver.findElement(By.xpath("//div[contains(text(),'ID')]//..//span[text()]")).getText();
				Logger.info("Object Name After Click NewTab Link: "+ObjectNameAfterClickNewTabLink);
				Thread.sleep(4000);
				try {
					if (ObjectNameBeforeClickNewTabLink1.contentEquals(ObjectNameAfterClickNewTabLink)) {
						Logger.info("Open in New tab link is properly redirected is Passed !!");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Open in New tab link is properly redirected is Failed !!", e);
					sa.assertAll();
				}
				driver.close();	
				break;
			}
		}
		Thread.sleep(2500);
		try {
			driver.switchTo().window(ParentWindow);
			Logger.info("Swicth back to parent window is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Swicth back to parent window is Failed !!", e);
			sa.assertAll();
		}
		//****************

		Thread.sleep(2500);
		try {
			CL.EnterDiscription();
			Logger.info("Enter Discription is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Discription is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			CL.ClickOnEnterNextButton();
			Logger.info("Click On Next Button is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Next Button is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(300);
		try {
			if (CL.VerifySuccessmessage() == true) {
				Logger.info("Verify Success message is PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verify Success message is FAILED!", e);
			sa.assertAll();
		}

		Logger.info("//===============================(Host) Operation========================================!");
		Thread.sleep(3000);
		try {
			CL.EnterEmailIDforHOST();
			Logger.info("Enter EmailID for HOST is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter EmailID for HOST is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			CL.ClickOnNextButtonForHOST();
			Logger.info("Click On Next Button For HOST is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Next Button For HOST is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(300);
		try {
			if (CL.VerifySuccessmessage() == true) {
				Logger.info("Verify Success message is PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verify Success message is FAILED!", e);
			sa.assertAll();
		}

		Logger.info("//===============================(When Can Peaple book this event) Operation========================================!");
		Thread.sleep(3500);
		try {
			CL.EnterDateRange();
			Logger.info("Enter DateRange is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter DateRange is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			CL.SelectMeetingDuration();
			Logger.info("Select MeetingDuration is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select MeetingDuration is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			CL.SelectBufferBeforeEvent();
			Logger.info("Select Buffer Before Event is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Buffer Before Event is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			CL.SelectBufferAfterEvent();
			Logger.info("Select Buffer After Event is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Buffer After Event is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			CL.SelectStartTimeIncrements();
			Logger.info("Select Start Time Increments is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Start Time Increments is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			CL.Enter2digitNumbersInviteesCantScheduleWithin();
			Logger.info("Enter 2 digit Numbers InviteesCantScheduleWithin is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter 2 digit Numbers InviteesCantScheduleWithin is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			CL.ClickOnSaveAndCloseButton();
			Logger.info("Click On SaveAndClose Button is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On SaveAndClose Button is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(300);
		try {
			if (CL.VerifySuccessmessage() == true) {
				Logger.info("Verify Success message is PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verify Success message is FAILED!", e);
			sa.assertAll();
		}

		Logger.info("//===============================(Invitee Questions) Operation========================================!");
		Thread.sleep(3000);
		try {
			CL.ClickOnCheckBoxForAcceptOnlyNonISPEmailAddressEvents();
			Logger.info("Click On CheckBox For AcceptOnlyNonISPEmailAddress is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CheckBox For AcceptOnlyNonISPEmailAddress is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			CL.ClickOnSaveAndCloseButtonForInvitee();
			Logger.info("Click On SaveAndClose Button is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On SaveAndClose Button is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(300);
		try {
			if (CL.VerifySuccessmessage() == true) {
				Logger.info("Verify Success message is PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verify Success message is FAILED!", e);
			sa.assertAll();
		}

		Logger.info("//===============================(Notifications Policy) Operation========================================!");
		Thread.sleep(3500);
		try {
			CL.ClickOnRadioButtonForEmailReminders();
			Logger.info("Click On Radio Button For EmailReminders is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Radio Button For EmailReminders is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			CL.ClickOnRadioButtonForCreateAnEvenetInCRM();
			Logger.info("Click On RadioButton For CreateAnEvenetInCRM is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On RadioButton For CreateAnEvenetInCRM is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			CL.ClickOnSaveAndCloseButtonForNotificationPolicy();
			Logger.info("Click On SaveAndClose Button is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On SaveAndClose Button is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(300);
		try {
			if (CL.VerifySuccessmessage() == true) {
				Logger.info("Verify Success message is PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verify Success message is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			CL.ClickOnBackButton();
			Logger.info("Click On Back Button is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Back Button is FAILED!!", e);
			sa.assertAll();
		}


		Logger.info("//======================================== Radio Button & Copy link Operation =======================================");
		Thread.sleep(3500);
		try {
			CL.ClickOnCopyLinkIconFromTheAutoTestObject();
			Logger.info("Click On Back Button is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Back Button is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(400);
		try {
			if(CL.DisplayedCopiedSuccessMessage()==true)
				Logger.info("Displayed CopiedSuccess Message is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed CopiedSuccess Message is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			CL.ClickOnRadioButton();
			Logger.info("Click On RadioButton is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On RadioButton is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(400);
		try {
			if(CL.DisplayedRadioButtonIsUnchecked()==true)
				Logger.info("Displayed RadioButton Is Unchecked is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed RadioButton Is Unchecked is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			CL.ClickOnRadioButton();
			Logger.info("Click On RadioButton is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On RadioButton is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(400);
		try {
			if(CL.DisplayedRadioButtonIsChecked()==true)
				Logger.info("Displayed RadioButton Is Checked is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed RadioButton Is Checked is Failed !!", e);
			sa.assertAll();
		}


		Logger.info("//========================================EDIT SCENARIO START=======================================");
		Thread.sleep(3500);
		try {
			CL.ClickOnDropDownButtonForAutoTestObject();
			Logger.info("Click On DropDown Button For AutoTestObject is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DropDown Button For AutoTestObject is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			CL.ClickOnEditButtonForAutoTestObject();
			Logger.info("Click On Edit Button For AutoTestObject is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Edit Button For AutoTestObject is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			CL.EditSelectLocation();
			Logger.info("Edit Select Location is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Edit Select Location is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			CL.SelectedWebToLeadFormsDropdown();
			Logger.info("Selected WebToLead Forms Dropdown is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Selected WebToLead Forms Dropdown is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			CL.EditSelectedWebToLeadFormsOption();
			Logger.info("Edit Selected WebToLeadForms Option is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Edit Selected WebToLeadForms Option is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			CL.ClickOnEnterNextButton();
			Logger.info("Click On Next Button is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Next Button is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(300);
		try {
			if (CL.VerifySuccessmessage() == true) {
				Logger.info("Verify Success message is PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verify Success message is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			CL.ClickOnBackButton();
			Logger.info("Click On Back Button is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Back Button is FAILED!!", e);
			sa.assertAll();
		}

		Logger.info("//========================================Clone SCENARIO START=======================================");
		Thread.sleep(3500);
		try {
			CL.ClickOnDropDownButtonForAutoTestObject();
			Logger.info("Click On DropDown Button For AutoTestObject is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DropDown Button For AutoTestObject is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			CL.ClickOnCloneButtonForAutoTestObject();
			Logger.info("Click On Clone Button For AutoTestObject is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Clone Button For AutoTestObject is FAILED!!", e);
			sa.assertAll();
		}

		Logger.info("//========================================Delete cloned object SCENARIO START=======================================");
		Thread.sleep(3500);
		try {
			CL.ClickOnDropDownButtonForAutoTestObjectCopy1();
			Logger.info("Click On DropDown Button For AutoTestObjectCopy(1) is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DropDown Button For AutoTestObjectCopy(1) is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			CL.ClickOnDeleteButtonForAutoTestObject();
			Logger.info("Click On Delete Button For AutoTestObjectCopy(1) is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Button For AutoTestObjectCopy(1) is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			CL.ClickOnDelete();
			Logger.info("Click On Delete is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete is FAILED!", e);
			sa.assertAll();
		}
	}	
}
