package com.leadAngel.testCases;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.leadAngel.pageObjects.AdministrationPageObjectModel;
import com.leadAngel.pageObjects.HomePage;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
public class TC_Sanity_UserAndAccess_Administration extends BaseClass{
	private static final Logger Logger = LogManager.getLogger(TC_Sanity_UserAndAccess_Administration.class);

	@Test(description = "Administration_UserAndAccess_Section")
	@Step("Administration_UserAndAccess_Section")
	@Description("Administration_UserAndAccess_Section")
	public void AdministrationTest() throws InterruptedException {
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
			APOM.ClickOnUserAndAcces();
			Logger.info("Click on User And Acces is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on User And Acces is Failed",e);
			sa.assertAll();
		}

		Logger.info("************************ Delete If Already AutomationTest User Role Is Present *************************");
		Thread.sleep(2500);
		if (APOM.DisplayedAlreadyAutomationTestUserRoleIsPresent()==true) {
			Logger.info("Displayed Already AutomationTest User Role Is Present");
			Thread.sleep(2500);
			try {
				APOM.ClickOnDeleteButtonForUserAndAccess();
				Logger.info("Click On Delete Button For UserAndAccess is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Delete Button For UserAndAccess is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnDeleteButtonForRecaptchaConfirmationPopup();
				Logger.info("Click On Delete Button For Confirmation Popup is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Delete Button For Confirmation Popup is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(500);
			try {
				if (APOM.DisplayedSuccessMessageCopied()==true) {
					Logger.info("Displayed Success Message is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Success Message is Failed",e);
				sa.assertAll();
			}
		} else {
			sa.assertTrue(true);
		}


		Logger.info("************************************** Create New User Role *************************************");
		Thread.sleep(2500);
		try {
			APOM.ClickOnAddButtonForUserAndAccess();
			Logger.info("Click On AddButton is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On AddButton is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		if (APOM.DisplayedYourCalendarUserLicenseLimitIsExceededWarningMessage()==true) {
			Logger.info("Displayed 'Your Calendar User License Limit Is Exceeded' Warning Message ");
			Thread.sleep(2500);
			try {
				APOM.ClickOnCancelButton();
				Logger.info("Click On Cancel For Add new User Popup is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Cancel For Add new User Popup is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnEditButtonForWarningMessagePurpose();
				Logger.info("Click On Edit Button of any calendar user is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Edit Button of any calendar user is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.UnCheckCalendarUserCheckBox();
				Logger.info("UnCheck the Calendar User CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("UnCheck the Calendar User CheckBox is Failed",e);
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
			try {
				if (APOM.DisplayedSuccessMessageCopied()==true) {
					Logger.info("Displayed Success Message is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Success Message is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnAddButtonForUserAndAccess();
				Logger.info("Click On AddButton is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On AddButton is Failed",e);
				sa.assertAll();
			}
		} else {
			sa.assertTrue(true);
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnDropdownForRole();
			Logger.info("Click On Dropdown For Role is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Dropdown For Role is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.SelectAdminAsARole();
			Logger.info("Select Admin As A Role is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Admin As A Role is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.EnterFirstName();
			Logger.info("Enter First Name is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter First Name is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.EnterLastName();
			Logger.info("Enter Last Name is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Last Name is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.EnterEmailId();
			Logger.info("Enter Email Id is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Email Id is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnCalendarUserCheckBoxEdit();
			Logger.info("Click On Calendar User CheckBox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Calendar User CheckBox is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(500);
		try {
			if (APOM.DisplayedCalendarUserCheckBoxIsChecked()==true) {
				Logger.info("Displayed Calendar User CheckBox Is Checked is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Calendar User CheckBox Is Checked is Failed",e);
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
		try {
			if (APOM.DisplayedSuccessMessageCopied()==true) {
				Logger.info("Displayed 'New user has been added successfully' message is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed 'New user has been added successfully' message is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (APOM.DisplayedCrossMarkCircleInSSOEnabledColumn()==true) {
				Logger.info("Displayed Cross Mark Circle In SSO Enabled Column is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Cross Mark Circle In SSO Enabled Column is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.DisplayedINACTIVEInStatusColumn();
			Logger.info("Displayed INACTIVE In Status Column is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed INACTIVE In Status Column is Failed",e);
			sa.assertAll();
		}
		Logger.info("************************************** Reset Password Operation *************************************");
		Thread.sleep(2500);
		try {
			APOM.ClickOnResetPasswordIcon();
			Logger.info("Click On Reset Password Icon is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Reset Password Icon is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnSendLinkButton();
			Logger.info("Click On SendLink Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On SendLink Button is Failed",e);
			sa.assertAll();
		}
		try {
			if (APOM.DisplayedReseyPasswordSuccessMessage()==true) {
				Logger.info("Displayed 'Reset password link has been sent successfully' message is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed 'Reset password link has been sent successfully' message is Failed",e);
			sa.assertAll();
		}



		//Here We need to Automate the Email and Then create password and Then log out LA and again login as a new user role 

		//	Logger.info("************************************** Verification after login as new User role *************************************");
		//	Thread.sleep(2500);
		//	try {
		//		APOM.DisplayedAsAdminUserRoleInRoleColumn();
		//		Logger.info("Displayed As Admin UserRole In Role Column is Passed");
		//	} catch (Exception e) {
		//		sa.assertTrue(false);
		//		Logger.error("Displayed As Admin UserRole In Role Column is Failed",e);
		//		sa.assertAll();
		//	}
		//	Thread.sleep(2500);
		//	try {
		//		APOM.DisplayedCircleCheckInCalendarEnabledColumn();
		//		Logger.info("Displayed Circle Check In Calendar Enabled Column is Passed");
		//	} catch (Exception e) {
		//		sa.assertTrue(false);
		//		Logger.error("Displayed Circle Check In Calendar Enabled Column is Failed",e);
		//		sa.assertAll();
		//	}
		//	Thread.sleep(2500);
		//	try {
		//		APOM.DisplayedCrossMarkCircleInSSOEnabledColumn();
		//		Logger.info("Displayed Cross Mark Circle In SSO Enabled Column is Passed");
		//	} catch (Exception e) {
		//		sa.assertTrue(false);
		//		Logger.error("Displayed Cross Mark Circle In SSO Enabled Column is Failed",e);
		//		sa.assertAll();
		//	}
		//	Thread.sleep(2500);
		//	try {
		//		APOM.DisplayedEditButtonIsDisabledInActionsColumn();
		//		Logger.info("Displayed Edit Button Is Disabled In Actions Column is Passed");
		//	} catch (Exception e) {
		//		sa.assertTrue(false);
		//		Logger.error("Displayed Edit Button Is Disabled In Actions Column is Failed",e);
		//		sa.assertAll();
		//	}
		//	Thread.sleep(2500);
		//	try {
		//		APOM.DisplayedResetPasswordButtonIsDisabledInActionsColumn();
		//		Logger.info("Displayed Reset Password Button Is Disabled In Actions Column is Passed");
		//	} catch (Exception e) {
		//		sa.assertTrue(false);
		//		Logger.error("Displayed Reset Password Button Is Disabled In Actions Column is Failed",e);
		//		sa.assertAll();
		//	}
		//	Thread.sleep(2500);
		//	try {
		//		APOM.DisplayedDeleteButtonIsDisabledInActionsColumn();
		//		Logger.info("Displayed Delete Button Is Disabled In Actions Column is Passed");
		//	} catch (Exception e) {
		//		sa.assertTrue(false);
		//		Logger.error("Displayed Delete Button Is Disabled In Actions Column is Failed",e);
		//		sa.assertAll();
		//	}

//		Logger.info("************************************** Filter Roles Operation *************************************");
//		Thread.sleep(2500);
//		try {
//			APOM.ClickOnRoleTab();
//			Logger.info("Click On Role Tab is Passed");
//		} catch (Exception e) {
//			sa.assertTrue(false);
//			Logger.error("Click On Role Tab is Failed",e);
//			sa.assertAll();
//		}
//		Thread.sleep(2500);
//		try {
//			APOM.ClickOnAdminCheckBox();
//			Logger.info("Click On Admin CheckBox is Passed");
//		} catch (Exception e) {
//			sa.assertTrue(false);
//			Logger.error("Click On Admin CheckBox is Failed",e);
//			sa.assertAll();
//		}
//		Thread.sleep(2500);
//		try {
//			if (APOM.DisplayedAdminCheckBoxIsCheckedInFilterRole()==true) {
//				Logger.info("Displayed Admin CheckBox Is Checked is Passed");
//			}
//		} catch (Exception e) {
//			sa.assertTrue(false);
//			Logger.error("Displayed Admin CheckBox Is Checked is Failed",e);
//			sa.assertAll();
//		}
//		Thread.sleep(2500);
//		try {
//			APOM.ClickOnStandardUserCheckBox();
//			Logger.info("Click On Standard User CheckBox is Passed");
//		} catch (Exception e) {
//			sa.assertTrue(false);
//			Logger.error("Click On Standard User CheckBox is Failed",e);
//			sa.assertAll();
//		}
//		Thread.sleep(2500);
//		try {
//			if (APOM.DisplayedStandardUserCheckBoxIsCheckedFilterRole()==true) {
//				Logger.info("Displayed Standard User CheckBox Is Checked is Passed");
//			}
//		} catch (Exception e) {
//			sa.assertTrue(false);
//			Logger.error("Displayed Standard User CheckBox Is Checked is Failed",e);
//			sa.assertAll();
//		}
//		Thread.sleep(2500);
//		try {
//			APOM.ClickOnReadOnlyCheckBox();
//			Logger.info("Click On Read Only CheckBox is Passed");
//		} catch (Exception e) {
//			sa.assertTrue(false);
//			Logger.error("Click On ReadOnly CheckBox is Failed",e);
//			sa.assertAll();
//		}
//		Thread.sleep(2500);
//		try {
//			if (APOM.DisplayedReadOnlyCheckBoxIsCheckedFilterRole()==true) {
//				Logger.info("Displayed Read Only CheckBox Is Checked is Passed");
//			}
//		} catch (Exception e) {
//			sa.assertTrue(false);
//			Logger.error("Displayed Read Only CheckBox Is Checked is Failed",e);
//			sa.assertAll();
//		}
//		Thread.sleep(2500);
//		try {
//			APOM.ClickOnCalendarUserCheckBox();
//			Logger.info("Click On Calendar User CheckBox is Passed");
//		} catch (Exception e) {
//			sa.assertTrue(false);
//			Logger.error("Click On Calendar User CheckBox is Failed",e);
//			sa.assertAll();
//		}
//		Thread.sleep(2500);
//		try {
//			if (APOM.DisplayedCalendarUserCheckBoxIsCheckedFilterRole()==true) {
//				Logger.info("Displayed Calendar User CheckBox Is Checked is Passed");
//			}
//		} catch (Exception e) {
//			sa.assertTrue(false);
//			Logger.error("Displayed Calendar User CheckBox Is Checked is Failed",e);
//			sa.assertAll();
//		}
//		Thread.sleep(2500);
//		try {
//			APOM.ClickOnPartnerAdminCheckBox();
//			Logger.info("Click On Partner Admin CheckBox is Passed");
//		} catch (Exception e) {
//			sa.assertTrue(false);
//			Logger.error("Click On Partner Admin CheckBox is Failed",e);
//			sa.assertAll();
//		}
//		Thread.sleep(2500);
//		try {
//			if (APOM.DisplayedPartnerAdminCheckBoxIsCheckedFilterRole()==true) {
//				Logger.info("Displayed Partner Admin CheckBox Is Checked is Passed");
//			}
//		} catch (Exception e) {
//			sa.assertTrue(false);
//			Logger.error("Displayed Partner Admin CheckBox Is Checked is Failed",e);
//			sa.assertAll();
//		}
//		Thread.sleep(2500);
//		try {
//			APOM.ClickOnSalesReadOnlyCheckBox();
//			Logger.info("Click On Sales Read Only CheckBox is Passed");
//		} catch (Exception e) {
//			sa.assertTrue(false);
//			Logger.error("Click On Sales Read Only CheckBox is Failed",e);
//			sa.assertAll();
//		}
//		Thread.sleep(2500);
//		try {
//			if (APOM.DisplayedSalesReadOnlyCheckBoxIsCheckedFilterRole()==true) {
//				Logger.info("Displayed Sales Read Only CheckBox Is Checked is Passed");
//			}
//		} catch (Exception e) {
//			sa.assertTrue(false);
//			Logger.error("Displayed Sales Read Only CheckBox Is Checked is Failed",e);
//			sa.assertAll();
//		}
//		Thread.sleep(2500);
//		try {
//			APOM.ClickOnSalesTeamManagerCheckBox();
//			Logger.info("Click On Sales Team Manager CheckBox is Passed");
//		} catch (Exception e) {
//			sa.assertTrue(false);
//			Logger.error("Click On Sales Team Manager CheckBox is Failed",e);
//			sa.assertAll();
//		}
//		Thread.sleep(2500);
//		try {
//			if (APOM.DisplayedSalesTeamManagerCheckBoxIsCheckedFilterRole()==true) {
//				Logger.info("Displayed Sales Team Manager CheckBox Is Checked is Passed");
//			}
//		} catch (Exception e) {
//			sa.assertTrue(false);
//			Logger.error("Displayed Sales Team Manager CheckBox Is Checked is Failed",e);
//			sa.assertAll();
//		}
//		Thread.sleep(2500);
//		try {
//			APOM.ClickOnClearSelectionButton();
//			Logger.info("Click On Clear Selection Button is Passed");
//		} catch (Exception e) {
//			sa.assertTrue(false);
//			Logger.error("Click On Clear Selection Button is Failed",e);
//			sa.assertAll();
//		}

		Logger.info("************************************** Edit Operation *************************************");
		Thread.sleep(2500);
		try {
			APOM.ClickOnEditButtonForUserAndAccess();
			Logger.info("Click On Edit Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Edit Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnCheckBoxSSOEnabled();
			Logger.info("Click On SSO Enabled CheckBox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On SSO Enabled CheckBox is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(500);
		try {
			if (APOM.DisplayedSSOEnabledCheckBoxIsChecked()==true) {
				Logger.info("Displayed SSO Enabled CheckBox Is Checked is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed SSO Enabled CheckBox Is Checked is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnCheckBoxFrozen();
			Logger.info("Click On Frozen CheckBox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Frozen CheckBox is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(500);
		try {
			if (APOM.DisplayedFrozenCheckBoxIsChecked()==true) {
				Logger.info("Displayed Frozen CheckBox Is Checked is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Frozen CheckBox Is Checked is Failed",e);
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
		try {
			if (APOM.DisplayedSuccessMessageCopied()==true) {
				Logger.info("Displayed 'Edit successfully' message is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed 'Edit successfully' message is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (APOM.DisplayedCircleCheckInSSOEnabledColumn()==true) {
				Logger.info("Displayed CircleCheck In SSO Enabled Column is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed CircleCheck In SSO Enabled Column is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (APOM.DisplayedActiveInStatusColumn()==true) {
				Logger.info("Displayed Active In Status Column is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Active In Status Column is Failed",e);
			sa.assertAll();
		}


		Logger.info("************************************** Delete Operation *************************************");
		Thread.sleep(2500);
		try {
			APOM.ClickOnDeleteButtonForUserAndAccess();
			Logger.info("Click On Delete Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnDeleteAgainForCompanyPreference();
			Logger.info("Click On Delete Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(500);
		try {
			if (APOM.DisplayedSuccessMessageCopied()==true) {
				Logger.info("Displayed 'Deleted successfully' message is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed 'Deleted successfully' message is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);

	}
}
