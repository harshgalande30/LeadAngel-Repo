package com.leadAngel.testCases;
import java.awt.AWTException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.leadAngel.pageObjects.AdministrationPageObjectModel;
import com.leadAngel.pageObjects.HomePage;
import io.qameta.allure.Description;
import io.qameta.allure.Step;

public class TC_Sanity_DataCleanupPreference_Administration extends BaseClass{
	private static final Logger Logger = LogManager.getLogger(TC_Sanity_DataCleanupPreference_Administration.class);

	@Test(description = "Administration_DataCleanupPreference_Section")
	@Step("Administration_DataCleanupPreference_Section")
	@Description("Administration_DataCleanupPreference_Section")
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
			if (APOM.DisplyedDataCleanupPreferenceIcon()==true) {
				Logger.info("Displyed Data Cleanup Preference Icon is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displyed Data Cleanup Preference Icon is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnDataCleanupPreferenceIcon();
			Logger.info("Click On Data Cleanup Preference is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Data Cleanup Preference is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (APOM.DisplayedDataCleanupPreferencePrefernceInTabsRow()==true) {
				Logger.info("Displayed Data Cleanup Prefernce In Tabs Row is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Data Cleanup Prefernce In Tabs Row is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (APOM.DisplayedDataCleanupCompanyPrefernceInLeftSideMenu()==true) {
				Logger.info("Displayed Data Cleanup Prefernce In Left Side Menu is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Data Cleanup Prefernce In Left Side Menu is Failed",e);
			sa.assertAll();
		}

		Logger.info("***************************Operation on Merge Duplicate Leads********************************");

		if (APOM.DisplayedMergeDuplicateLeadsCheckBoxIsChecked()==true) {
			Thread.sleep(1000);
			try {
				APOM.ClickOnMergeDuplicateLeadsCheckBox();
				Logger.info("UnChecked the Merge Duplicate Leads CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("UnChecked the Merge Duplicate Leads CheckBox is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1000);
			try {
				APOM.ClickOnMergeDuplicateLeadsCheckBox();
				Logger.info("Click On Merge Duplicate Leads CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Merge Duplicate Leads CheckBox is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1000);
			try {
				if (APOM.DisplayedMergeDuplicateLeadsCheckBoxIsChecked()==true) {
					Logger.info("Displayed Merge Duplicate Leads CheckBox is Checked");
				}	
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Merge Duplicate Leads CheckBox is not Checked",e);
				sa.assertAll();
			}
		}
		else
		{
			Thread.sleep(1000);
			try {
				APOM.ClickOnMergeDuplicateLeadsCheckBox();
				Logger.info("Click On Merge Duplicate Leads CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Merge Duplicate Leads CheckBox is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1000);
			try {
				if (APOM.DisplayedMergeDuplicateLeadsCheckBoxIsChecked()==true) {
					Logger.info("Displayed Merge Duplicate Leads CheckBox is Checked");
				}	
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Merge Duplicate Leads CheckBox is not Checked",e);
				sa.assertAll();
			}	
		}
		Thread.sleep(1000);
		if (APOM.DisplayedDropdownRotate180deg()==true) {
			sa.assertTrue(true);
		} else {
			try {
				APOM.ClickOnMergeDublicateLeadsDropdown();
				Logger.info("Click On Merge Dublicate Leads Dropdown is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Merge Dublicate Leads Dropdown is Failed",e);
				sa.assertAll();
			}
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnEmailOnlyCheckBox();
			Logger.info("Click On Email Only CheckBox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Email Only CheckBox is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedEmailOnlyCheckBoxIsChecked()==true) {
				Logger.info("Displayed Email Only CheckBox is Checked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Email Only CheckBox is not Checked",e);
			sa.assertAll();
		}


		Thread.sleep(1000);
		try {
			APOM.ClickOnCompanyNameOnlyCheckBox();
			Logger.info("Click On Company Name Only CheckBox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Company Name Only CheckBox is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedCompanyNameOnlyCheckBoxIsChecked()==true) {
				Logger.info("Displayed Company Name Only CheckBox is Checked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Company Name Only CheckBox is not Checked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnEmailAndCompanyNameCheckBox();
			Logger.info("Click On Email And Company Name CheckBox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Email And Company Name CheckBox is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedEmailAndCompanyNameCheckBoxIsChecked()==true) {
				Logger.info("Displayed Email And Company Name CheckBox is Checked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Email And Company Name CheckBox is not Checked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnFirstNameLastNameAndCompanyNameCheckBox();
			Logger.info("Click On First Name Last Name And Company Name CheckBox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On First Name Last Name And Company Name CheckBox is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedFirstNameLastNameAndCompanyNameCheckBoxIsChecked()==true) {
				Logger.info("Displayed First Name Last Name And Company Name CheckBox is Checked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed First Name Last Name And Company Name CheckBox is not Checked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnFirstNameLastNameAndPhoneNumberCheckBox();
			Logger.info("Click On First Name Last Name And Phone Number CheckBox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On First Name Last Name And Phone Number CheckBox is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedFirstNameLastNameAndPhoneNumberCheckBoxIsChecked()==true) {
				Logger.info("Displayed First Name Last Name And Phone Number CheckBox is Checked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed First Name Last Name And Phone Number CheckBox is not Checked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnFirstNameLastNameEmailCheckBox();
			Logger.info("Click On First Name Last Name Email CheckBox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On First Name Last Name Email CheckBox is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedFirstNameLastNameEmailCheckBoxIsChecked()==true) {
				Logger.info("Displayed First Name Last Name Email CheckBox is Checked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed First Name Last Name Email CheckBox is not Checked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnAllTheseConditionsMustSatisfyToIdentifyDuplicateRadioButton();
			Logger.info("Click On All These Conditions Must Satisfy To Identify Duplicate RadioButton is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On All These Conditions Must Satisfy To Identify Duplicate RadioButton is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedAllTheseConditionsMustSatisfyToIdentifyDuplicateRadioButtonIsClicked()==true) {
				Logger.info("Displayed All These Conditions Must Satisfy To Identify Duplicate RadioButton Is Clicked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed All These Conditions Must Satisfy To Identify Duplicate RadioButton Is Not Clicked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnCreateDedupeGroupByDropdown();
			Logger.info("Click On Create Dedupe Group By Dropdown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Create Dedupe Group By Dropdown is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			APOM.SelectCreateDedupeGroupByOption();
			Logger.info("Click On Create Dedupe Group By Option is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Create Dedupe Group By Option is Failed",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnNewRecordIsMasterLeadRecordRadioButton();
			Logger.info("Click On New Record Is Master Lead Record RadioButton is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On New Record Is Master Lead Record RadioButton is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedNewRecordIsMasterLeadRecordRadioButtonIsClicked()==true) {
				Logger.info("Displayed New Record Is Master Lead Record RadioButton Is Clicked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed New Record Is Master Lead Record RadioButton Is Not Clicked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnOldRecordIsMasterLeadRecordRadioButton();
			Logger.info("Click On Old Record Is Master Lead Record RadioButton is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Old Record Is Master Lead Record RadioButton is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedOldRecordIsMasterLeadRecordRadioButtonIsClicked()==true) {
				Logger.info("Displayed Old Record Is Master Lead Record RadioButton Is Clicked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Old Record Is Master Lead Record RadioButton Is Not Clicked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnLeadWithMostRecentActivityIsTheMasterLeadRecordRadioButton();
			Logger.info("Click On Lead With Most Recent Activity Is The Master Lead Record RadioButton is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Lead With Most Recent Activity Is The Master Lead Record RadioButton is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedLeadWithMostRecentActivityIsTheMasterLeadRecordRadioButtonIsClicked()==true) {
				Logger.info("Displayed Lead With Most Recent Activity Is The Master Lead Record RadioButton Is Clicked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Lead With Most Recent Activity Is The Master Lead Record RadioButton Is Not Clicked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnNewRecordIsTheMasterLeadRecordRecordRadioButton();
			Logger.info("Click On Newest Lead Is The Master Record RadioButton is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Newest Lead Is The Master Record RadioButton is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedNewRecordIsTheMasterLeadRecordRecordRadioButtonIsClicked()==true) {
				Logger.info("Displayed Newest Lead Is The Master Record RadioButton Is Clicked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Newest Lead Is The Master Record RadioButton Is Not Clicked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnOldRecordIsTheMasterLeadRecordRecordRadioButton();
			Logger.info("Click On Oldest Lead Is The Master Record RadioButton is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Oldest Lead Is The Master Record RadioButton is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedOldRecordIsTheMasterLeadRecordRecordRadioButtonIsClicked()==true) {
				Logger.info("Displayed Oldest Lead Is The Master Record RadioButton Is Clicked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Oldest Lead Is The Master Record RadioButton Is Not Clicked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnSendMergedLeadsForRoutingCheckBox();
			Logger.info("Click On Send Merged Leads For Routing Check box is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Send Merged Leads For Routing check box is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedSendMergedLeadsForRoutingCheckBoxIsChecked()==true) {
				Logger.info("Displayed Send Merged Leads For Routing Check box Is Clicked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Send Merged Leads For Routing Check box Is Not Clicked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnSaveButtonForDataCleanupProcess();
			Logger.info("Click On Save Button For Merge Duplicate Leads is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button For Merge Duplicate Leads is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(800);
		try {
			if (APOM.DisplayedSuccessMessageDataCleanup()==true) {
				Logger.info("Displayed Success Message is Passed");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Success Message is Failed",e);
			sa.assertAll();
		}

		Logger.info("***************************Operation on Merge Duplicate Contacts ********************************");
		Thread.sleep(1000);
		if (APOM.DisplayedMergeDuplicateContactsCheckBoxIsChecked()==true) {
			Thread.sleep(1000);
			try {
				APOM.ClickOnMergeDuplicateContactsCheckBox();
				Logger.info("UnChecked the Merge Duplicate Contacts CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("UnChecked the Merge Duplicate Contacts CheckBox is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1000);
			try {
				APOM.ClickOnMergeDuplicateContactsCheckBox();
				Logger.info("Click On Merge Duplicate Contacts CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Merge Duplicate Contacts CheckBox is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1000);
			try {
				if (APOM.DisplayedMergeDuplicateContactsCheckBoxIsChecked()==true) {
					Logger.info("Displayed Merge Duplicate Contacts CheckBox is Checked");
				}	
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Merge Duplicate Contacts CheckBox is not Checked",e);
				sa.assertAll();
			}
		}
		else
		{
			Thread.sleep(1000);
			try {
				APOM.ClickOnMergeDuplicateContactsCheckBox();
				Logger.info("Click On Merge Duplicate Contacts CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Merge Duplicate Contacts CheckBox is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1000);
			try {
				if (APOM.DisplayedMergeDuplicateContactsCheckBoxIsChecked()==true) {
					Logger.info("Displayed Merge Duplicate Contacts CheckBox is Checked");
				}	
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Merge Duplicate Contacts CheckBox is not Checked",e);
				sa.assertAll();
			}
		}
		Thread.sleep(1000);
		if (APOM.DisplayedDropdownRotate180degDuplicateContacts()==true) {
			sa.assertTrue(true);
		} else {
			try {
				APOM.ClickOnMergeDublicateContactsDropdown();
				Logger.info("Click On Merge Dublicate Contacts Dropdown is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Merge Dublicate Contacts Dropdown is Failed",e);
				sa.assertAll();
			}
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnEmailOnlyCheckBoxForContact();
			Logger.info("Click On Email Only CheckBox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Email Only CheckBox is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedEmailOnlyCheckBoxIsCheckedForContact()==true) {
				Logger.info("Displayed Email Only CheckBox is Checked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Email Only CheckBox is not Checked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnEmailAndAccountNameCheckBox();
			Logger.info("Click On Email And Account Name CheckBox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Email And Account Name CheckBox is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedEmailAndAccountNameCheckBoxIsChecked()==true) {
				Logger.info("Displayed Email And Account Name CheckBox is Checked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Email And Account Name CheckBox is not Checked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnFirstNameLastNameAndAccountNameCheckBox();
			Logger.info("Click On First Name, Last Name And Account Name CheckBox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On First Name, Last Name And Account Name CheckBox is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedFirstNameLastNameAndAccountNameCheckBoxIsChecked()==true) {
				Logger.info("Displayed First Name, Last Name And Account Name CheckBox is Checked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed First Name, Last Name And Account Name CheckBox is not Checked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnAccountNameOnlyCheckBox();
			Logger.info("Click On Account Name Only CheckBox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Account Name Only CheckBox is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedAccountNameOnlyCheckBoxIsChecked()==true) {
				Logger.info("Displayed Account Name Only CheckBox is Checked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Account Name Only CheckBox is not Checked",e);
			sa.assertAll();
		}


		Thread.sleep(1000);
		try {
			APOM.ClickOnFirstNameLastNameAndPhoneNumberCheckBoxForContact();
			Logger.info("Click On First Name, Last Name And Phone Number CheckBox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On First Name, Last Name And Phone Number CheckBox is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedFirstNameLastNameAndPhoneNumberCheckBoxIsCheckedForContact()==true) {
				Logger.info("Displayed First Name, Last Name And Phone Number CheckBox is Checked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed First Name, Last Name And Phone Number CheckBox is not Checked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnFirstNameLastNameAndEmailCheckBoxForContact();
			Logger.info("Click On First Name, Last Name And Email CheckBox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On First Name, Last Name And Email CheckBox is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedFirstNameLastNameAndEmailCheckBoxIsCheckedForContact()==true) {
				Logger.info("Displayed First Name, Last Name And Email CheckBox is Checked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed First Name, Last Name And Email CheckBox is not Checked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnAllTheseConditionsMustSatisfyToIdentifyDuplicateCheckBoxForContact();
			Logger.info("Click On All These Conditions Must Satisfy To Identify Duplicate RadioButton is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On All These Conditions Must Satisfy To Identify Duplicate RadioButton is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedAllTheseConditionsMustSatisfyToIdentifyDuplicateRadioButtonIsClickedForContact()==true) {
				Logger.info("Displayed All These Conditions Must Satisfy To Identify Duplicate RadioButton Is Clicked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed All These Conditions Must Satisfy To Identify Duplicate RadioButton Is Not Clicked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnCreateDedupeGroupByDropdownForContact();
			Logger.info("Click On Create Dedupe Group By DropDown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Create Dedupe Group By DropDown is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			APOM.SelectCreateDedupeGroupByOption();
			Logger.info("Click On Create Dedupe Group By Option is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Create Dedupe Group By Option is Failed",e);
			sa.assertAll();
		}


		Thread.sleep(1000);
		try {
			APOM.ClickOnNewRecordIsMasterContactRecordCheckBox();
			Logger.info("Click On New Record Is Master Contact Record RadioButton is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On New Record Is Master Contact Record RadioButton is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedNewRecordIsMasterContactRecordRadioButtonIsClicked()==true) {
				Logger.info("Displayed New Record Is Master Contact Record RadioButton Is Clicked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed New Record Is Master Contact Record RadioButton Is Not Clicked",e);
			sa.assertAll();
		}


		Thread.sleep(1000);
		try {
			APOM.ClickOnOldRecordIsMasterContactRecordCheckBox();
			Logger.info("Click On Old Record Is Master Contact Record RadioButton is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Old Record Is Master Contact Record RadioButton is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedOldRecordIsMasterContactRecordRadioButtonIsClicked()==true) {
				Logger.info("Displayed Old Record Is Master Contact Record RadioButton Is Clicked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Old Record Is Master Contact Record RadioButton Is Not Clicked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnContactWithMostRecentActivityIsTheMasterContactRecordCheckBox();
			Logger.info("Click On Contact With Most Recent Activity Is The Master Contact Record RadioButton is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Contact With Most Recent Activity Is The Master Contact Record RadioButton is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedContactWithMostRecentActivityIsTheMasterContactRecordRadioButtonIsClicked()==true) {
				Logger.info("Displayed Contact With Most Recent Activity Is The Master Contact Record RadioButton Is Clicked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Contact With Most Recent Activity Is The Master Contact Record RadioButton Is Not Clicked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnNewRecordIsTheMasterContactRecordCheckBox();
			Logger.info("Click On Newest Contact Is The Master Record RadioButton is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Newest Contact Is The Master Record RadioButton is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedNewRecordIsTheMasterContactRecordRadioButtonIsClicked()==true) {
				Logger.info("Displayed Newest Contact Is The Master Record RadioButton Is Clicked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Newest Contact Is The Master Record RadioButton Is Not Clicked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnOldRecordIsTheMasterContactRecordCheckBox();
			Logger.info("Click On oldest Contact Is The Master Record RadioButton is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On oldest Contact Is The Master Record RadioButton is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedOldRecordIsTheMasterContactRecordRadioButtonIsClicked()==true) {
				Logger.info("Displayed oldest Contact Is The Master Record RadioButton Is Clicked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed oldest Contact Is The Master Record RadioButton Is Not Clicked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnSendMergedContactForRoutingCheckBox();
			Logger.info("Click On Send Merged Contact For Routing Check box is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Send Merged Contact For Routing check box is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedSendMergedContactForRoutingCheckBoxIsChecked()==true) {
				Logger.info("Displayed Send Merged Contact For Routing Check box Is Clicked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Send Merged Contact For Routing Check box Is Not Clicked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnSaveButtonForMergedublicateContact();
			Logger.info("Click On Save Button For Merge Duplicate Contacts is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button For Merge Duplicate Contacts is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(800);
		try {
			if (APOM.DisplayedSuccessMessageDataCleanup()==true) {
				Logger.info("Displayed Success Message is Passed");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Success Message is Failed",e);
			sa.assertAll();
		}

		Logger.info("***************************Operation on  Merge Leads against matching Contacts  ********************************");
		Thread.sleep(1000);
		if (APOM.DisplayedMergeLeadsAgainstMatchingContactsCheckBoxIsChecked()==true) {
			Thread.sleep(1000);
			try {
				APOM.ClickOnMergeLeadsAgainstMatchingContactsCheckBox();
				Logger.info("UnChecked the Merge Leads Against Matching Contacts CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("UnChecked the Merge Leads Against Matching Contacts CheckBox is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1000);
			try {
				APOM.ClickOnMergeLeadsAgainstMatchingContactsCheckBox();
				Logger.info("Click On Merge Leads Against Matching Contacts CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Merge Leads Against Matching Contacts CheckBox is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1000);
			try {
				if (APOM.DisplayedMergeLeadsAgainstMatchingContactsCheckBoxIsChecked()==true) {
					Logger.info("Displayed Merge Leads Against Matching Contacts CheckBox is Checked");
				}	
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Merge Leads Against Matching Contacts CheckBox is not Checked",e);
				sa.assertAll();
			}
		}
		else
		{
			Thread.sleep(1000);
			try {
				APOM.ClickOnMergeLeadsAgainstMatchingContactsCheckBox();
				Logger.info("Click On Merge Leads Against Matching Contacts CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Merge Leads Against Matching Contacts CheckBox is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1000);
			try {
				if (APOM.DisplayedMergeLeadsAgainstMatchingContactsCheckBoxIsChecked()==true) {
					Logger.info("Displayed Merge Leads Against Matching Contacts CheckBox is Checked");
				}	
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Merge Leads Against Matching Contacts CheckBox is not Checked",e);
				sa.assertAll();
			}
		}
		Thread.sleep(1000);
		if (APOM.DisplayedDropdownRotate180degLeadsAgainstMatchingContacts()==true) {
			sa.assertTrue(true);
		} else {
			try {
				APOM.ClickOnMergeLeadsAgainstMatchingContactsDropdown();
				Logger.info("Click On Merge Leads Against Matching Contacts Dropdown is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Merge Leads Against Matching Contacts Dropdown is Failed",e);
				sa.assertAll();
			}
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnEmailOnlyCheckBoxForMatchingContact();
			Logger.info("Click On Email Only CheckBox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Email Only CheckBox is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedEmailOnlyCheckBoxIsCheckedForMatchingContact()==true) {
				Logger.info("Displayed Email Only CheckBox is Checked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Email Only CheckBox is not Checked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnEmailAndCompanyOrAccountNameCheckBox();
			Logger.info("Click On Email And Company Or Account Name CheckBox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Email And Company Or Account Name CheckBox is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedEmailAndCompanyOrAccountNameCheckBoxIsChecked()==true) {
				Logger.info("Displayed Email And Company Or Account Name CheckBox is Checked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Email And Company Or Account Name CheckBox is not Checked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnFirstNameLastNameAndCompanyOrAccountNameCheckBox();
			Logger.info("Click On FirstName, LastName And Company Or AccountName CheckBox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On FirstName, LastName And Company Or AccountName CheckBox is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedFirstNameLastNameAndCompanyOrAccountNameCheckBoxIsChecked()==true) {
				Logger.info("Displayed FirstName, LastName And Company Or AccountName CheckBox is Checked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed FirstName, LastName And Company Or AccountName CheckBox is not Checked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnAccountNameOnlyCheckBoxForMatchingContact();
			Logger.info("Click On Account Name Only CheckBox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Account Name Only CheckBox is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedAccountNameOnlyCheckBoxIsCheckedForMatchingContact()==true) {
				Logger.info("Displayed Account Name Only CheckBox is Checked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Account Name Only CheckBox is not Checked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnFirstNameLastNameAndPhoneNumberCheckBoxForMatchingContact();
			Logger.info("Click On FirstName, LastName And PhoneNumber CheckBox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On FirstName, LastName And PhoneNumber CheckBox is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedAccountNameOnlyCheckBoxIsCheckedForMatchingContact()==true) {
				Logger.info("Displayed FirstName, LastName And PhoneNumber CheckBox is Checked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed FirstName, LastName And PhoneNumber CheckBox is not Checked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnFirstNameLastNameAndEmailCheckBoxForMatchingContact();
			Logger.info("Click On FirstName, LastName And Email CheckBox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On FirstName, LastName And Email CheckBox is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedFirstNameLastNameAndEmailCheckBoxIsCheckedForMatchingContact()==true) {
				Logger.info("Displayed FirstName, LastName And Email CheckBox is Checked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed FirstName, LastName And Email CheckBox is not Checked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnAllTheseConditionsMustSatisfyToIdentifyDuplicateRadioButtonForMatchingContact();
			Logger.info("Click On All These Conditions Must Satisfy To Identify Duplicate RadioButton is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On All These Conditions Must Satisfy To Identify Duplicate RadioButton is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedAllTheseConditionsMustSatisfyToIdentifyDuplicateRadioButtonIsClickedForMatchingContact()==true) {
				Logger.info("Displayed All These Conditions Must Satisfy To Identify Duplicate RadioButton Is Clicked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed All These Conditions Must Satisfy To Identify Duplicate RadioButton Is Not Clicked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnNewContactRecordIsTheMasterRecordRadioButton();
			Logger.info("Click On New Contact Record Is The Master Record RadioButton is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On New Contact Record Is The Master Record RadioButton is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedNewContactRecordIsTheMasterRecordRadioButtonIsClicked()==true) {
				Logger.info("Displayed New Contact Record Is The Master Record RadioButton Is Clicked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed New Contact Record Is The Master Record RadioButton Is Not Clicked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnExistingContactOwnerOwnsTheMergedRecordRadioButton();
			Logger.info("Click On Existing Contact Owner Owns The Merged Record RadioButton is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Existing Contact Owner Owns The Merged Record RadioButton is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedExistingContactOwnerOwnsTheMergedRecordRadioButtonIsClicked()==true) {
				Logger.info("Displayed Existing Contact Owner Owns The Merged Record RadioButton Is Clicked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Existing Contact Owner Owns The Merged Record RadioButton Is Not Clicked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnExistingLeadOwnerOwnsTheMergedRecordRadioButton();
			Logger.info("Click On Existing Lead Owner Owns The Merged Record RadioButton is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Existing Lead Owner Owns The Merged Record RadioButton is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedExistingLeadOwnerOwnsTheMergedRecordRadioButtonIsClicked()==true) {
				Logger.info("Displayed Existing Lead Owner Owns The Merged Record RadioButton Is Clicked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Existing Lead Owner Owns The Merged Record RadioButton Is Not Clicked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnOldContactRecordIsTheMasterRecordRadioButton();
			Logger.info("Click On Old Contact Record Is The Master Record RadioButton is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Old Contact Record Is The Master Record RadioButton is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedOldContactRecordIsTheMasterRecordRadioButtonIsClicked()==true) {
				Logger.info("Displayed Old Contact Record Is The Master Record RadioButton Is Clicked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Old Contact Record Is The Master Record RadioButton Is Not Clicked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnExistingContactOwnerOwnsTheMergedRecordRadioButton();
			Logger.info("Click On Existing Contact Owner Owns The Merged Record RadioButton is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Existing Contact Owner Owns The Merged Record RadioButton is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedExistingContactOwnerOwnsTheMergedRecordRadioButtonIsClicked()==true) {
				Logger.info("Displayed Existing Contact Owner Owns The Merged Record RadioButton Is Clicked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Existing Contact Owner Owns The Merged Record RadioButton Is Not Clicked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnExistingLeadOwnerOwnsTheMergedRecordRadioButton();
			Logger.info("Click On Existing Lead Owner Owns The Merged Record RadioButton is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Existing Lead Owner Owns The Merged Record RadioButton is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedExistingLeadOwnerOwnsTheMergedRecordRadioButtonIsClicked()==true) {
				Logger.info("Displayed Existing Lead Owner Owns The Merged Record RadioButton Is Clicked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Existing Lead Owner Owns The Merged Record RadioButton Is Not Clicked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnSendMergedContactForRoutingCheckBoxFOrMatchingContact();
			Logger.info("Click On Send Merged Contact For Routing CheckBox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Send Merged Contact For Routing CheckBox is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedSendMergedContactForRoutingCheckBoxIsCheckedFOrMatchingContact()==true) {
				Logger.info("Displayed Send Merged Contact For Routing CheckBox is Checked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Send Merged Contact For Routing CheckBox is not Checked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnSaveButtonForMergeLeadsAgainstMatchingContacts();
			Logger.info("Click On Save Button For Merge Leads Against Matching Contacts is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button For Merge Leads Against Matching Contacts is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(800);
		try {
			if (APOM.DisplayedSuccessMessageDataCleanup()==true) {
				Logger.info("Displayed Success Message is Passed");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Success Message is Failed",e);
			sa.assertAll();
		}

		Logger.info("***************************Operation on Convert Leads into Contact if a matching account is found ********************************");
		Thread.sleep(1000);
		if (APOM.DisplayedConvertLeadsInToContactIfAMatchingAccountIsFoundCheckBoxIsChecked()==true) {
			Thread.sleep(1000);
			try {
				APOM.ClickOnConvertLeadsInToContactIfAMatchingAccountIsFoundCheckBox();
				Logger.info("UnChecked the Convert Leads In To Contact If A Matching Account Is Found CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("UnChecked the Convert Leads In To Contact If A Matching Account Is Found CheckBox is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1000);
			try {
				APOM.ClickOnConvertLeadsInToContactIfAMatchingAccountIsFoundCheckBox();
				Logger.info("Click On Convert Leads In To Contact If A Matching Account Is Found CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Convert Leads In To Contact If A Matching Account Is Found CheckBox is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1000);
			try {
				if (APOM.DisplayedConvertLeadsInToContactIfAMatchingAccountIsFoundCheckBoxIsChecked()==true) {
					Logger.info("Displayed Convert Leads In To Contact If A Matching Account Is Found CheckBox is Checked");
				}	
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Convert Leads In To Contact If A Matching Account Is Found CheckBox is not Checked",e);
				sa.assertAll();
			}
		}
		else
		{
			Thread.sleep(1000);
			try {
				APOM.ClickOnConvertLeadsInToContactIfAMatchingAccountIsFoundCheckBox();
				Logger.info("Click On Convert Leads In To Contact If A Matching Account Is Found CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Convert Leads In To Contact If A Matching Account Is Found CheckBox is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1000);
			try {
				if (APOM.DisplayedConvertLeadsInToContactIfAMatchingAccountIsFoundCheckBoxIsChecked()==true) {
					Logger.info("Displayed Convert Leads In To Contact If A Matching Account Is Found CheckBox is Checked");
				}	
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Convert Leads In To Contact If A Matching Account Is Found CheckBox is not Checked",e);
				sa.assertAll();
			}
		}
		Thread.sleep(1000);
		if (APOM.DisplayedDropdownRotate180degLeadsInToContactIfAMatchingAccountIsFound()==true) {
			sa.assertTrue(true);
		} else {

			try {
				APOM.ClickOnConvertLeadsInToContactIfAMatchingAccountIsFoundDropdown();
				Logger.info("Click On Convert Leads into Contact if a matching account is found Dropdown is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Convert Leads into Contact if a matching account is found dropdown is Failed",e);
				sa.assertAll();
			}
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnExistingAccountOwnerOwnsTheNewContactRecordRadioButton();
			Logger.info("Click On Existing Account Owner Owns The New Contact Record RadioButton is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Existing Account Owner Owns The New Contact Record RadioButton is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedExistingAccountOwnerOwnsTheNewContactRecordRadioButtonIsClicked()==true) {
				Logger.info("Displayed Existing Account Owner Owns The New Contact Record RadioButton Is Clicked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Existing Account Owner Owns The New Contact Record RadioButton Is Not Clicked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnExistingLeadOwnerOwnsTheNewContactRecordRadioButton();
			Logger.info("Click On Existing Leads Owner Owns The New Contact Record RadioButton is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Existing Leads Owner Owns The New Contact Record RadioButton is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedExistingLeadOwnerOwnsTheNewContactRecordRadioButtonIsClicked()==true) {
				Logger.info("Displayed Existing Leads Owner Owns The New Contact Record RadioButton Is Clicked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Existing Leads Owner Owns The New Contact Record RadioButton Is Not Clicked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnSaveButtonForConvertLeadsInToContactIfAMatchingAccountIsFound();
			Logger.info("Click On Save Button For Convert Leads InTo Contact If A Matching Account Is Found is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button For Convert Leads InTo Contact If A Matching Account Is Found is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(800);
		try {
			if (APOM.DisplayedSuccessMessageDataCleanup()==true) {
				Logger.info("Displayed Success Message is Passed");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Success Message is Failed",e);
			sa.assertAll();
		}

		Logger.info("*************************** Convert leads into contact and account if no matching account is found ********************************");
		Thread.sleep(1000);
		if (APOM.DisplayedConvertLeadsInToContactAndAccountIfAMatchingAccountIsFoundCheckBoxIsChecked()==true) {
			Thread.sleep(1000);
			try {
				APOM.ClickOnConvertLeadsInToContactAndAccountIfAMatchingAccountIsFoundCheckBox();
				Logger.info("UnChecked the Convert Leads In To Contact And Account If A Matching Account Is Found CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("UnChecked the Convert Leads In To Contact And Account If A Matching Account Is Found CheckBox is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1000);
			try {
				APOM.ClickOnConvertLeadsInToContactAndAccountIfAMatchingAccountIsFoundCheckBox();
				Logger.info("Click On Convert Leads In To Contact And Account If A Matching Account Is Found CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Convert Leads In To Contact And Account If A Matching Account Is Found CheckBox is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1000);
			try {
				if (APOM.DisplayedConvertLeadsInToContactAndAccountIfAMatchingAccountIsFoundCheckBoxIsChecked()==true) {
					Logger.info("Displayed Convert Leads In To Contact And Account If A Matching Account Is Found CheckBox is Checked");
				}	
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Convert Leads In To Contact And Account If A Matching Account Is Found CheckBox is not Checked",e);
				sa.assertAll();
			}
		}
		else
		{
			Thread.sleep(1000);
			try {
				APOM.ClickOnConvertLeadsInToContactAndAccountIfAMatchingAccountIsFoundCheckBox();
				Logger.info("Click On Convert Leads In To Contact And Account If A Matching Account Is Found CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Convert Leads In To Contact And Account If A Matching Account Is Found CheckBox is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1000);
			try {
				if (APOM.DisplayedConvertLeadsInToContactAndAccountIfAMatchingAccountIsFoundCheckBoxIsChecked()==true) {
					Logger.info("Displayed Convert Leads In To Contact And Account If A Matching Account Is Found CheckBox is Checked");
				}	
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Convert Leads In To Contact And Account If A Matching Account Is Found CheckBox is not Checked",e);
				sa.assertAll();
			}
		}
		Thread.sleep(1000);
		if (APOM.DisplayedDropdownRotate180degLeadsInToContactAndAccountIfAMatchingAccountIsFound()==true) {
			sa.assertTrue(true);
		} else {
			try {
				APOM.ClickOnConvertLeadsInToContactAndAccountIfAMatchingAccountIsFoundDropdown();
				Logger.info("Click On Convert leads into contact and account if no matching account is found Dropdown is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Convert leads into contact and account if no matching account is found dropdown is Failed",e);
				sa.assertAll();
			}
		}

		Thread.sleep(1500);
		try {
			APOM.ClickOnSFDCAdminOwnsTheNewContactAndAccountRecordRadioButton();
			Logger.info("Click On SFDCA dmin Owns The New Contact And Account Record RadioButton is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On SFDCA dmin Owns The New Contact And Account Record RadioButton is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedExistingLeadOwnerOwnsTheNewContactRecordRadioButtonIsClicked()==true) {
				Logger.info("Displayed SFDCA dmin Owns The New Contact And Account Record RadioButton Is Clicked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed SFDCA dmin Owns The New Contact And Account Record RadioButton Is Not Clicked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnExistingLeadOwnerOwnsTheNewContactAndAccountRecordCheckBox();
			Logger.info("Click On Existing Lead Owner Owns The New Contact And Account Record RadioButton is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Existing Lead Owner Owns The New Contact And Account Record RadioButton is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedExistingLeadOwnerOwnsTheNewContactAndAccountRecordRadioButtonIsClicked()==true) {
				Logger.info("Displayed Existing Lead Owner Owns The New Contact And Account Record RadioButton Is Clicked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Existing Lead Owner Owns The New Contact And Account Record RadioButton Is Not Clicked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnSaveButtonForConvertLeadsInToContactAndAccountIfAMatchingAccountIsFound();
			Logger.info("Click On Save Button For Convert leads into contact and account if no matching account is found is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button For Convert leads into contact and account if no matching account is found is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(800);
		try {
			if (APOM.DisplayedSuccessMessageDataCleanup()==true) {
				Logger.info("Displayed Success Message is Passed");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Success Message is Failed",e);
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
	}
}
