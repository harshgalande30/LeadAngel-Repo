package com.leadAngel.testCases;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.leadAngel.pageObjects.AEtoSDR_Page;
import com.leadAngel.pageObjects.CalendarIntegrationPageObjectModel;
import com.leadAngel.pageObjects.DetailsPage_SalesTeam;
import com.leadAngel.pageObjects.LeadManagementPage;
import com.leadAngel.pageObjects.ResponseMappingPageObjectModel;
import com.leadAngel.pageObjects.RoundRobinPage;
@Listeners({ com.leadAngel.utilities.TestAllureListener.class })
@Test
public class TC_CrudOperation_EventTemplate extends BaseClass{

	private static final Logger Logger= LogManager.getLogger(TC_CrudOperation_EventTemplate.class);
	public void crud_AccountList() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		DetailsPage_SalesTeam detrrt = new DetailsPage_SalesTeam(driver);	
		LeadManagementPage LMP = new LeadManagementPage(driver);
		CalendarIntegrationPageObjectModel CL=new CalendarIntegrationPageObjectModel(driver);
		AEtoSDR_Page ae = new AEtoSDR_Page(driver);
		RoundRobinPage rrp = new RoundRobinPage(driver);
		ResponseMappingPageObjectModel RM=new ResponseMappingPageObjectModel(driver);

		Thread.sleep(3500);
		try {
			CL.ClickOnCalendarIntegration();
			Logger.info("Click on Calendar Integration is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Calendar Integration is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			CL.RightClickOnEventTemplate();
			Logger.info("Right Click On EventTemplate is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On EventTemplate is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickOnNewObject();
			Logger.info("Click on New EventTemplate is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on New EventTemplate is FAILED!!", e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		Logger.info("//===============================CREATE OBJECT SCENARIO START========================================!");
		try {
			LMP.NameInCrudObject();
			Logger.info("Enter AutoTestObject Name is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter AutoTestObject Name is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.DescInRRT();
			Logger.info("Enter Description is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Description is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.clickOnSaveNewObject();
			Logger.info("Click on Save Button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Save Button is FAILED!!", e);
			sa.assertAll();
		}

		Thread.sleep(800);
		if(ae.DisplaySameAEerror() == true) {
			Logger.info("Duplicate Object Found, Try to delete the Object NOW!!! then Creating New Object!!");
			Thread.sleep(4000);
			try {
				CL.DropDownEventTemplate();
				Logger.info("Click on EventTemplate is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on EventTemplate is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(3500);
			try {
				LMP.ContextClickOnAutoTestObject();           
				Logger.info("RightClick On AutoTestObject is PASSED!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("RightClick On AutoTestObject is Failed!!", e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				LMP.ClickOnDeleteOnClonedAutoTestObject();
				Logger.info("Click On Delete button is Passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Delete button is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(3200);
			try {
				LMP.ClickOnDeletebtn();
				Logger.info("Click Again Delete button is Passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click Again Delete button is FAILED!", e);
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
			Thread.sleep(3500);
			try {
				CL.RightClickOnEventTemplate();
				Logger.info("Right Click On EventTemplate is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Right Click On EventTemplate is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(4100);
			try {
				LMP.ClickOnNewObject();
				Logger.info("Click on New EventTemplate is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on New EventTemplate is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(4900);
			try {
				LMP.NameInCrudObject();
				Logger.info("Enter AutoTestObject Name is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter AutoTestObject Name is FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(3500);
			try {
				LMP.DescInRRT();
				Logger.info("Enter Description is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter Description is FAILED!!", e);         
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				LMP.clickOnSaveNewObject();
				Logger.info("Click on Save Button is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on Save Button is FAILED!!", e);
				sa.assertAll();
				Thread.sleep(1000);
			}
		}
		else {
			sa.assertTrue(true);
		}	
		driver.navigate().refresh();
		Logger.info("Refreshing The Page!!");
		Thread.sleep(5000);
		try {
			Thread.sleep(2500);
			if( CL.DisplayedEventTemplatesOverviewPage()==true) {
				Logger.info("Displayed CRM Lead Filetr Overview");
				Thread.sleep(3500);
				try {
					CL.ClickOnEventTemplatesDropDown();
					Logger.info("Click on CRMLeedFilter DropDown is passed");
				}catch(Exception e) {
					sa.assertTrue(false);
					Logger.error("Click on CRMLeedFilter DropDown is FAILED!!", e);
					sa.assertAll();
				}
				Thread.sleep(4900);
				try {
					LMP.ClickOnAutoTestObject();           
					Logger.info("Click On AutoTestObject is PASSED!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On AutoTestObject is FAILED!", e);
					sa.assertAll();
				}
			}
		} catch (Exception e) {
			sa.assertTrue(true);
		}

		Logger.info("//===============================(What Event Is This) Operation========================================!");
		String ParentWindow = driver.getWindowHandle();
		Thread.sleep(3000);
		try {
			CL.SelectCustomInThankYouPageURL();
			Thread.sleep(3000);
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
		Thread.sleep(3000);
		try {
			CL.ClickOnCheckBoxForAllowGuestsToCancelOrRescheduleMeeting();
			Logger.info("Click On CheckBox For AllowGuestsToCancelOrRescheduleMeeting is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CheckBox For AllowGuestsToCancelOrRescheduleMeeting is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
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
		
		Thread.sleep(3500);
		try {
			CL.EnterEventName();
			Logger.info("Enter Event Name is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Event Name is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(3000);
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
	
		Thread.sleep(3000);
		try {
			CL.ClickOnEnterNextButton();
			Logger.info("Click On Next Button is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Next Button is FAILED!!", e);
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
			CL.SelectOptionInviteesCantScheduleWithin();
			Logger.info("Select Option InviteesCantScheduleWithin is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Option InviteesCantScheduleWithin is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			CL.ClickOnCloseButtonForWhenCanPeopleBookThisEvent();
			Logger.info("Click On Close Button For WhenCanPeopleBookThisEvent is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Close Button For WhenCanPeopleBookThisEvent is FAILED!!", e);
			sa.assertAll();
		}

		Logger.info("//===============================(Invitee Questions) Operation========================================!");
		Thread.sleep(2500);
		try {
			CL.ClickOnDropDownInviteeQuetions();
			Logger.info("Click On DropDown InviteeQuetions is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DropDown InviteeQuetions is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			CL.ClickOnCheckBoxForAcceptOnlyNonISPEmailAddress();
			Logger.info("Click On CheckBox For AcceptOnlyNonISPEmailAddress is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CheckBox For AcceptOnlyNonISPEmailAddress is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			CL.ClickOnNextButtonInAdditionalOptions();
			Logger.info("Click On NextButton In AdditionalOptions is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On NextButton In AdditionalOptions is FAILED!!", e);
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
			CL.ClickOnCloseButtonForNotificationsPolicy();
			Logger.info("Click On Close Button For NotificationsPolicy is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Close Button For NotificationsPolicy is FAILED!!", e);
			sa.assertAll();
		}

		Logger.info("//=======================================APPROVE SCENARIO START======================================//");
		Thread.sleep(3500);
		try {
			LMP.ContextClickOnAutoTestObject();    
			Logger.info("RightClick On AutoTestObject is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On AutoTestObject is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickOnApproveBtn();
			Logger.info("Click On Approve button is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Approve button is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		ae.ClickOnApproveSubmit();
		Logger.info("Click on again Approve button is Passed");
		Thread.sleep(5500);
		try {
			ae.DisplayApproved();
			Logger.info("Displayed Approved button is PASSED!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Approved button is FAILED!!", e);
			sa.assertAll();
		}

		Logger.info("//================================================ENTERING DETAILS PAGE===============================================");
		Thread.sleep(3500);
		try {
			rrp.ClickOnDetail();
			Logger.info("Enter Details Page is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Details Page is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			CL.ClickOnAutomaticallyPublishThisEventCkeckBox();
			Logger.info("Click On Automatically publish this event for all the new calendar integrations CheckBox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Automatically publish this event for all the new calendar integrations CheckBox is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			CL.DisplayedAutomaticallyPublishThisEventCkeckBoxIsChecked();
			Logger.info("Displayed Automatically publish this event for all the new calendar integrations CheckBox Is Checked is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Automatically publish this event for all the new calendar integrations CheckBox Is Checked is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		detrrt.ClickOnEditbtn();
		Logger.info("Click On Description Edit button is Passed");
		Thread.sleep(2500);
		detrrt.InputDesc();
		Logger.info("Enter Description is Passed");
		Thread.sleep(2500);
		detrrt.ClickOnbtnSaveDescForAccList();
		Logger.info("Click On Description Save button is Passed");
		Logger.info("//==================================== OverView Page Opeartion  ==================================");
		Thread.sleep(3500);
		try {
			CL.ClickOnEventTemplatesFeature();
			Logger.info("Click On EventTemplates Feature is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on EventTemplates Feature is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if( CL.DisplayedEventTemplatesOverviewPage()==true) {
				Logger.info("Display EventTemplates OverView Page is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display EventTemplates OverView Page is Failed", e);
			sa.assertAll();
		}

		if (CL.DisplayedColumnHeaderCheckIsDisabled()==false) {
			Logger.info("***************** Column Header Check Box Operation ******************");
			Logger.info("Displayed Column Header Checkbox Is Not Disabled ");

			Thread.sleep(1500);
			try {
				CL.ClickOnColumnHeaderCheckBox();
				Logger.info("Click On ColumnHeader CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On ColumnHeader CheckBox is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				if (CL.DisplayedColumnHeaderCheckBoxIsChecked() == true) {
					Logger.info("Displayed ColumnHeader CheckBox Is Checked is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed ColumnHeader CheckBox Is Checked is Failed", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			if (CL.DisplayedAutTestObjectCheckBox() == true) {
				try {
					if (CL.DisplayedAutTestObjectCheckBoxIsChecked() == true) {
						Logger.info("Displayed AutTestObject CheckBox Is Checked is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed AutTestObject CheckBox Is Checked is Failled", e);
					sa.assertAll();
				}
			} else {
				sa.assertTrue(true);
			}
			Thread.sleep(1500);
			try {
				if (CL.DisplayedDeleteButtonIsDisabled() == false) {
					Logger.info("Displayed Delete Button is Enabled is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Delete Button is Enabled is Failled", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				CL.ClickOnColumnHeaderCheckBox();
				Logger.info("Uncheck the ColumnHeader CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Uncheck the ColumnHeader CheckBox is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(1000);
			if (CL.DisplayedAutTestObjectCheckBox() == true) {
				try {
					if (CL.DisplayedAutTestObjectCheckBoxIsNotChecked() == true) {
						Logger.info("Displayed AutTestObject CheckBox Is Not Checked is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed AutTestObject CheckBox Is Not Checked is Failled", e);
					sa.assertAll();
				}
			} else {
				sa.assertTrue(true);
			}
			Thread.sleep(1500);
			try {
				if (CL.DisplayedDeleteButtonIsDisabled() == true) {
					Logger.info("Displayed Delete Button is Disable is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Delete Button is Disable is Failled", e);
				sa.assertAll();
			}
			Logger.info("********************** Filter Operation *************************");
			Thread.sleep(1500);
			try {
				CL.EnterTextInFilterBox();
				Logger.info("Enter Text In FilterBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter Text In FilterBox is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				if (CL.DisplayedAutoTestObject() == true) {
					Logger.info("Displayed AutoTestObject is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed AutoTestObject is Failled", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			if (CL.DisplayedAutTestObjectCheckBox() == true) {
				Logger.info("Displayed AutoTestObject CheckBox");
				try {
					if (CL.DisplayedAutoTestObjectIsNotUsed() == true) {
						Logger.info("Displayed AutoTestObject Is Not Used is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed AutoTestObject Is Not Used is Failled", e);
					sa.assertAll();
				}
			} else {

				try {
					if (CL.DisplayedAutoTestObjectIsUsed() == true) {
						Logger.info("Displayed AutoTestObject Is Used is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed AutoTestObject Is Used is Failled", e);
					sa.assertAll();
				}
			}
			Thread.sleep(1500);
			try {
				CL.ClearTestFromTheFilterBox();
				Logger.info("Clear Test From The FilterBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Clear Test From The FilterBox is FAILED!!", e);
				sa.assertAll();
			} 
			if (CL.DisplayedAutTestObjectCheckBox()==true) {
				Logger.info("********************** Delete AutoTestObject Operation *************************");
				Thread.sleep(3500);
				try {
					CL.ClickOnAutTestObjectCheckBox();
					Logger.info("Click On AutTestObject CheckBox is Passed");
				}catch(Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On AutTestObject CheckBox is FAILED!!", e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					if( CL.DisplayedAutTestObjectCheckBoxIsChecked()==true) {
						Logger.info("Displayed AutTestObject CheckBox Is Checked is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed AutTestObject CheckBox Is Checked is Failled", e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					CL.ClickOnDeleteButtonOverViewPage();
					Logger.info("Click On Delete Button is Passed");
				}catch(Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Delete Button is FAILED!!", e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					CL.ClickAgainDeleteButtonOverViewPage();
					Logger.info("Click Again Delete Button is Passed");
				}catch(Exception e) {
					sa.assertTrue(false);
					Logger.error("Click Again Delete Button is FAILED!!", e);
					sa.assertAll();
				}
				Thread.sleep(3600);
				try {
					if(CL.DisplayedSuccessMessage()==true) {
						Logger.info("Display Deleted success message is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Display Deleted success message is Failled", e);
					sa.assertAll();
				}

			} else {
				sa.assertTrue(true);
			}

		}else {
			Logger.info("***************** Column Header Check Box Operation ******************");
			Thread.sleep(2500);
			try {
				if(CL.DisplayedColumnHeaderCheckIsDisabled()==true) {
					Logger.info("Displayed Column Header Checkbox Is Disabled is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Column Header Checkbox Is Disabled is Failed", e);
				sa.assertAll();
			}

			Logger.info("********************** Filter Operation *************************");

			Thread.sleep(1500);
			try {
				CL.EnterTextInFilterBox();
				Logger.info("Enter Text In FilterBox is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter Text In FilterBox is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				if(CL.DisplayedAutoTestObject()==true) {
					Logger.info("Displayed AutoTestObject is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed AutoTestObject is Failled", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			if (CL.DisplayedAutTestObjectCheckBox()==true) {
				try {
					if (CL.DisplayedAutoTestObjectIsNotUsed() == true) {
						Logger.info("Displayed AutoTestObject Is Not Used is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed AutoTestObject Is Not Used is Failled", e);
					sa.assertAll();
				} 
			}else {
				try {
					if(CL.DisplayedAutoTestObjectIsUsed()==true) {
						Logger.info("Displayed AutoTestObject Is Used is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed AutoTestObject Is Used is Failled", e);
					sa.assertAll();
				}
			}
			Thread.sleep(1500);
			try {
				CL.ClearTestFromTheFilterBox();
				Logger.info("Clear Test From The FilterBox is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Clear Test From The FilterBox is FAILED!!", e);
				sa.assertAll();
			}
		}


		Logger.info("//========================================EDIT SCENARIO START=======================================");
		Thread.sleep(4000);	
		try {
			LMP.ContextClickOnAutoTestObject();      
			Logger.info("RightClick On AutoTestObject is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On AutoTestObject is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			LMP.ClickOnEditAutoTestObject();
			Logger.info("Click On Edit button is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Edit button is FAILED!", e);
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
			Logger.info("Select WebToLead Forms Dropdown is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select WebToLead Forms Dropdown is FAILED!!", e);
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

		Logger.info("*********************************************Approve*******************************************************");
		Thread.sleep(4000);	
		try {
			LMP.ContextClickOnAutoTestObject();      
			Logger.info("RightClick On AutoTestObject is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On AutoTestObject is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			CL.ClickOnApproveButtonEventTemplate();  
			Logger.info("Click On Approve Button is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Approve Button is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		ae.ClickOnApproveSubmit();
		Logger.info("Click on Approve button is Passed");

		Thread.sleep(4500);
		try {
			ae.DisplayApproved();
			Logger.info("Displayed Approved button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Approved button is Failled", e);
			sa.assertAll();
		}
		//*************************************************************************************************************
		Thread.sleep(2500);
		try {
			rrp.CollapseAll();
			Logger.info("Click on CollapseAll is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on CollapseAll is Failed", e);
			sa.assertAll();
		}	
		Thread.sleep(2500);
		try {
			RM.ExpandAllForResponseMapping();
			Logger.info("Click on ExpandAll is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on ExpandAll is Failed", e);
			sa.assertAll();
		}

		Logger.info("//======================================RENAME SCENARIO START=============================================//");
		Thread.sleep(4000);
		try {
			LMP.ContextClickOnAutoTestObject();
			Logger.info("Right Click On AutoTestObject is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On AutoTestObject is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			rrp.ClickOnObjectRename();
			Logger.info("Click on Rename Object is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Rename Object is FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.InputOnRenameAutoTestObject();
			Logger.info("Input on Rename AutoTestObject is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Input on Rename AutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			rrp.ClickOnRenameBtn();
			Logger.info("Click Rename Button is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Rename Button is FAILED!!!", e);
			sa.assertAll();
		}	
		Thread.sleep(400);
		if(ae.DisplaySameAEerror() == true) {
			Logger.info("Duplicate Object Found, Deleting Object NOW");
			Thread.sleep(4000);
			if (LMP.DisplayRenameAutoTestObject() == true) {
				Logger.info("Display RenameAutoTest Object");			
				Thread.sleep(4000);	
				try {
					LMP.ContextClickOnRenameAutoTestObject();
					Logger.info("Right Click On RenamedAutoTestObject is PASSED!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Right Click On RenamedAutoTestObject is FAILED!", e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					LMP.ClickOnDeleteOnClonedAutoTestObject();
					Logger.info("Click On Delete Button in RenameAutoTestObject is Passed!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Delete Button in RenameAutoTestObject is FAILED!", e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					LMP.ClickOnDeletebtn();
					Logger.info("Click On Delete Button in RenameAutoTestObject is Passed!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Delete Button in RenameAutoTestObject is FAILED!", e);
					sa.assertAll();
				}
			} else 
			{
				Thread.sleep(3000);
				CL.ClickOnCrudFolderDropdown();
				Logger.info("Click On CrudFolder Dropdown is PASSED!!!");
				Thread.sleep(4000);
				try {
					LMP.ContextClickOnRenameAutoTestObject();
					Logger.info("Right Click On RenamedAutoTestObject is PASSED!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Right Click On RenamedAutoTestObject is FAILED!", e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					LMP.ClickOnDeleteOnClonedAutoTestObject();
					Logger.info("Click On Delete Button in AutoTestObject is Passed!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Delete Button in AutoTestObject is FAILED!", e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					LMP.ClickOnDeletebtn();
					Logger.info("Click On Delete Button in AutoTestObject is Passed!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Delete Button in AutoTestObject is FAILED!", e);
					sa.assertAll();
				}
			}
			Thread.sleep(6200);	
			Thread.sleep(4500);
			try {
				LMP.ContextClickOnAutoTestObject();
				Logger.info("Right Click On AutoTestObject is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Right Click On AutoTestObject is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(4000);
			try {
				LMP.ClickOnRenameAutoTestObject();
				Logger.info("Click On Rename AutoTestObject is Passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Rename AutoTestObject is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(4000);
			try {
				LMP.InputOnRenameAutoTestObject();
				Logger.info("Input on Rename AutoTestObject is passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Input on Rename AutoTestObject is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				LMP.ClickOnRenameBtn();
				Logger.info("Click on Rename Button AutoTestObject is Passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on Rename Button AutoTestObject is FAILED!", e);
				sa.assertAll();
			}
		}
		else{
			sa.assertTrue(true);
		}
		Thread.sleep(5000); 	
		try {
			if (LMP.DisplayRenameAutoTestObject() == true) {
				Logger.info("Renamed AutoTestObject is Displayed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Renamed AutoTestObject is not Displayed", e);
			sa.assertAll();
		}


		Logger.info("//===================================CLONE SCENARIO START================================================//");
		Thread.sleep(4500);
		while (CL.DisplayedAutoTestObjectRenameCopy()==true) {
			Logger.info("Displayed AutoTestObjectRenameCopy Object,So Delete that Object");
			Thread.sleep(5000);
			try {
				CL.ContextClickOnAutoTestObjectRenameCopyObject();
				Logger.info("Right Click On AutoTestObjectRenameCopy Object is PASSED!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Right Click On AutoTestObjectRenameCopy Object is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(3500);
			try {
				LMP.ClickOnDeleteOnClonedAutoTestObject();
				Logger.info("Click On Delete Button is Passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Delete Button is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(4000);
			try {
				LMP.ClickOnDeletebtn();
				Logger.info("Click again Delete Button is Passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click again Delete Button is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(4500);
			continue;
		}
		Thread.sleep(4500);
		try {
			LMP.ContextClickOnRenameAutoTestObject();
			Logger.info("Right Click On RenamedAutoTestObject is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On RenamedAutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3800);
		try {
			LMP.ClickOnCloneAutoTestObject();
			Logger.info("Click On Clone in RenamedAutoTestObject is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Clone in RenamedAutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			LMP.ClickOnCloneBtn();
			Logger.info("Click On Clone Button in RenamedAutoTestObject is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Clone Button in RenamedAutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			if (LMP.DisplayCloneAutoTestObject() == true) {
				Logger.info("Display clocned RenamedAutoTestObject is PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display clocned RenamedAutoTestObject is FAILED!", e);
			sa.assertAll();
		}

		Logger.info("//===============================Approve Cloned Object========================================!");
		Thread.sleep(5000);
		try {
			LMP.ContextClickOnCloneAutoTestObject();
			Logger.info("Right Click On ClonedAutoTestObject is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On ClonedAutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3100);
		try {
			rrp.ClickOnApproveObject();
			Logger.info("Click on Approve Button is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Approve Button is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			CL.ClickApproveButtonAgainAfterEdit();
			Logger.info("Click again Approve Button is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click again Approve Button is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3800);
		try {
			rrp.DisplayApproved();
			Logger.info("Displayed Success Message is PASSED!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Success Message is FAILED!!",e);
			sa.assertAll();
		}

		Logger.info("//===============================DELETE CLONED OBJECT SCENARIO START========================================!");
		Thread.sleep(5000);
		try {
			CL.ClickOnDeleteButtonFromTheConsole();
			Logger.info("Click On Delete Button From The Console is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Button From The Console is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			LMP.ClickOnDeleteOnClonedAutoTestObject();
			Logger.info("Click On Delete Button is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Button is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(4000);
		try {
			LMP.ClickOnDeletebtn();
			Logger.info("Click On Delete Button is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Button is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(300);
		try {
			if (LMP.DisplayDeleteAutoTestObject() == true) {
				Logger.info("Display Cloned AutoTestObject Deleted successfully is PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Cloned AutoTestObject Deleted successfully is FAILED!", e);
			sa.assertAll();
		}

		Logger.info("//===============================MOVE OBJECT SCENARIO START========================================");
		Thread.sleep(4500);
		Thread.sleep(6500);
		try {
			LMP.ContextClickOnRenameAutoTestObject();
			Logger.info("Right Click On RenamedAutoTestObject is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On RenamedAutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(4500); 
		try {
			LMP.ClickOnMoveAutoTestObject();
			Logger.info("Click On Move Renamed AutoTestObject is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Move Renamed AutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(5100);
		try {
			CL.SelectFolderToAutotestObject();
			Logger.info("Select Folder to move the Autotest object is Passed !!!");
		} catch (Exception e) {
			Logger.info("Folder Not Found!! Craeting New Folder.");
			Thread.sleep(2500);
			rrp.ClickOnCancel();
			Logger.info("Click On Cancel button is Passed");
			Thread.sleep(4000);
			CL.RightClickOnEventTemplate();
			Logger.info("Right Click On EventTemplate is Passed");
			Thread.sleep(2500);
			LMP.ClickOnNewFolder();
			Logger.info("Click on New Folder is Passed");
			Thread.sleep(2500);
			CL.NameInObject();
			Logger.info("Enter Folder Name is Passed");
			Thread.sleep(2500);
			LMP.clickOnSaveNewObject();
			Logger.info("click On Save is Passed");
			Thread.sleep(4800);
			try {
				LMP.ContextClickOnRenameAutoTestObject();
				Logger.info("Right Click On RenamedAutoTestObject is Passed!!!");
			} catch (Exception g) {
				sa.assertTrue(false);
				Logger.error("Right Click On RenamedAutoTestObject is  FAILED!", g);
				sa.assertAll();
			}
			Thread.sleep(4500);
			try {
				LMP.ClickOnMoveAutoTestObject();
				Logger.info("Click On Move Renamed AutoTestObject is Passed!!!");
			} catch (Exception f) {
				sa.assertTrue(false);
				Logger.error("Click On Move Renamed AutoTestObject is FAILED!", f);
				sa.assertAll();
			}
			Thread.sleep(4800);
			try {
				CL.SelectFolderToAutotestObject();
				Logger.info("Select Folder to move the Autotest object is passed!!!");		
			} catch (Exception e2) {
				sa.assertTrue(false);
				Logger.error("Select Folder to move the Autotest object is Failed!!!", e2);
				sa.assertAll();
			}
			Thread.sleep(2000);
		}
		Thread.sleep(2500);
		try {
			rrp.ClickOnMoveBtn();
			Logger.info("Click On Move Button is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Move Button is FAILED!", e);
			sa.assertAll();
		}

		Logger.info("******************************* Move Back the AutoTestobject to the Main folder *****************************");
		Thread.sleep(5000);
		try {
			LMP.ContextClickOnRenameAutoTestObject();
			Logger.info("Right Click On RenamedAutoTestObject is Passed!!!");
		} catch (Exception g) {
			sa.assertTrue(false);
			Logger.error("Right Click On RenamedAutoTestObject is  FAILED!", g);
			sa.assertAll();
		}
		Thread.sleep(3000); 
		try {
			LMP.ClickOnMoveAutoTestObject();
			Logger.info("Click On Move Renamed AutoTestObject is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Move Renamed AutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			CL.SelectMainFolder();
			Logger.info("Select Main Folder is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Main Folder is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			rrp.ClickOnMoveBtn();
			Logger.info("Click On Move Button is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Move Button is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
	}	
}
