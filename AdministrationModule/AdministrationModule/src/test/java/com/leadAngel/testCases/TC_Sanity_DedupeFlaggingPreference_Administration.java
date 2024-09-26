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
public class TC_Sanity_DedupeFlaggingPreference_Administration extends BaseClass{
	private static final Logger Logger = LogManager.getLogger(TC_Sanity_DedupeFlaggingPreference_Administration.class);

	@Test(description = "Administration_DedupeFlaggingPreference_Section")
	@Step("Administration_DedupeFlaggingPreference_Section")
	@Description("Administration_DedupeFlaggingPreference_Section")
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
			if (APOM.DisplyedDedupeFlaggingPreference()==true) {
				Logger.info("Displyed Dedupe Flagging Preference Icon is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displyed Dedupe Flagging Preference Icon is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnDedupeFlaggingPreferenceIcon();
			Logger.info("Click On Dedupe Flagging Preference Icon is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Dedupe Flagging Preference Icon is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (APOM.DisplayedDedupeFlaggingPreferenceInTabsRow()==true) {
				Logger.info("Displayed Dedupe Flagging Preference In Tabs Row is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Dedupe Flagging Preference In Tabs Row is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (APOM.DisplayedDedupeFlaggingPreferenceInLeftSideMenu()==true) {
				Logger.info("Displayed Dedupe Flagging Preference In Left Side Menu is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Dedupe Flagging Preference In Left Side Menu is Failed",e);
			sa.assertAll();
		}

		Logger.info("***************************Operation on Flag Duplicate Leads ********************************");

		if (APOM.DisplayedFlagDuplicateLeadsCheckBoxIsChecked()==true) {
			Thread.sleep(1000);
			try {
				APOM.ClickOnFlagDuplicateLeadsCheckBox();
				Logger.info("UnChecked the Flag Duplicate Leads CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("UnChecked the Flag Duplicate Leads CheckBox is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1000);
			try {
				APOM.ClickOnFlagDuplicateLeadsCheckBox();
				Logger.info("Click On Flag Duplicate Leads CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Flag Duplicate Leads CheckBox is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1000);
			try {
				if (APOM.DisplayedFlagDuplicateLeadsCheckBoxIsChecked()==true) {
					Logger.info("Displayed Flag Duplicate Leads CheckBox is Checked");
				}	
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Flag Duplicate Leads CheckBox is not Checked",e);
				sa.assertAll();
			}	
		}
		else
		{
			Thread.sleep(1000);
			try {
				APOM.ClickOnFlagDuplicateLeadsCheckBox();
				Logger.info("Click On Flag Duplicate Leads CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Flag Duplicate Leads CheckBox is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1000);
			try {
				if (APOM.DisplayedFlagDuplicateLeadsCheckBoxIsChecked()==true) {
					Logger.info("Displayed Flag Duplicate Leads CheckBox is Checked");
				}	
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Flag Duplicate Leads CheckBox is not Checked",e);
				sa.assertAll();
			}	
		}

		Thread.sleep(1000);
		if (APOM.DisplayedDropdownRotate180degFlagDuplicateLeads()==true) {
			sa.assertTrue(true);
		} else {
			try {
				APOM.ClickOnFlagDuplicateLeadsDropdown();
				Logger.info("Click On Flag Duplicate Leads Dropdown is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Flag Duplicate Leads Dropdown is Failed",e);
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
			if (APOM.DisplayedEmailOnlyCheckBoxIsCheckedForDedupeFlagging()==true) {
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
			if (APOM.DisplayedFirstNameLastNameAndPhoneNumberCheckBoxIsCheckedForFlagDuplicate()==true) {
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
			if (APOM.DisplayedFirstNameLastNameEmailCheckBoxIsCheckedForFlagDuplicate()==true) {
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
			if (APOM.DisplayedAllTheseConditionsMustSatisfyToIdentifyDuplicateRadioButtonIsClickedForFlagDuplicate()==true) {
				Logger.info("Displayed All These Conditions Must Satisfy To Identify Duplicate RadioButton Is Clicked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed All These Conditions Must Satisfy To Identify Duplicate RadioButton Is Not Clicked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnCreateDedupeGroupByDropdownForFlagDuplicateLead();
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
			APOM.ClickOnNewestLeadIsTheMasterRecordRadioButton();
			Logger.info("Click On Newest Lead Is The Master Record RadioButton is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Newest Lead Is The Master Record RadioButton is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedNewestLeadIsTheMasterRecordRadioButtonIsClicked()==true) {
				Logger.info("Displayed Newest Lead Is The Master Record RadioButton Is Clicked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Newest Lead Is The Master Record RadioButton Is Not Clicked",e);
			sa.assertAll();
		}


		Thread.sleep(1000);
		try {
			APOM.ClickOnOldestLeadIsTheMasterRecordRadioButton();
			Logger.info("Click On Oldest Lead Is The Master Record RadioButton is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Oldest Lead Is The Master Record RadioButton is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedOldestLeadIsTheMasterRecordRadioButtonIsClicked()==true) {
				Logger.info("Displayed Oldest Lead Is The Master Record RadioButton Is Clicked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Oldest Lead Is The Master Record RadioButton Is Not Clicked",e);
			sa.assertAll();
		}


		Thread.sleep(1000);
		try {
			APOM.ClickOnLeadWithMostRecentActivityIsTheMasterRecordRadioButton();
			Logger.info("Click On Lead With Most Recent Activity Is The Master Record RadioButton is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Lead With Most Recent Activity Is The Master Record RadioButton is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedLeadWithMostRecentActivityIsTheMasterRecordRadioButtonIsClicked()==true) {
				Logger.info("Displayed Lead With Most Recent Activity Is The Master Record RadioButton Is Clicked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Lead With Most Recent Activity Is The Master Record RadioButton Is Not Clicked",e);
			sa.assertAll();
		}


		Thread.sleep(1000);
		try {
			APOM.ClickOnNewestLeadIsTheMasterRecordRadioButtonn();
			Logger.info("Click On Newest Lead Is The Master Record RadioButton is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Newest Lead Is The Master Record RadioButton is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedNewestLeadIsTheMasterRecordRadioButtonnIsClicked()==true) {
				Logger.info("Displayed Newest Lead Is The Master Record RadioButton Is Clicked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Newest Lead Is The Master Record RadioButton Is Not Clicked",e);
			sa.assertAll();
		}


		Thread.sleep(1000);
		try {
			APOM.ClickOnOldestLeadIsTheMasterRecordRadioButtonn();
			Logger.info("Click On Oldest Lead Is The Master Record RadioButton is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Oldest Lead Is The Master Record RadioButton is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedOldestLeadIsTheMasterRecordRadioButtonnIsClicked()==true) {
				Logger.info("Displayed Oldest Lead Is The Master Record RadioButton Is Clicked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Oldest Lead Is The Master Record RadioButton Is Not Clicked",e);
			sa.assertAll();
		}

		
		Thread.sleep(1000);
		try {
			APOM.ClickOnUploadDedupeMasterGroupIDToCRMForFlagDupicateLeads();
			Logger.info("Click On Upload Dedupe Master Group ID To CRM is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Upload Dedupe Master Group ID To CRM is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			APOM.SelectCreateDedupeGroupByOption();
			Logger.info("Click On Upload Dedupe Master Group ID To CRM Option is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Upload Dedupe Master Group ID To CRM Option is Failed",e);
			sa.assertAll();
		}

		
		Thread.sleep(1000);
		try {
			APOM.ClickOnSaveButtonForDataCleanupProcess();
			Logger.info("Click On Save Button For Flag Duplicate Leads is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button For Flag Duplicate Leads is Failed",e);
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

		Logger.info("***************************Operation on Flag Duplicate Contacts ********************************");

		if (APOM.DisplayedFlagDuplicateContactsCheckBoxIsChecked()==true) {
			Thread.sleep(1000);
			try {
				APOM.ClickOnFlagDuplicateContactsCheckBox();
				Logger.info("UnChecked the Flag Duplicate Contacts CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("UnChecked the Flag Duplicate Contacts CheckBox is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1000);
			try {
				APOM.ClickOnFlagDuplicateContactsCheckBox();
				Logger.info("Click On Flag Duplicate Contacts CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Flag Duplicate Contacts CheckBox is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1000);
			try {
				if (APOM.DisplayedFlagDuplicateContactsCheckBoxIsChecked()==true) {
					Logger.info("Displayed Flag Duplicate Contacts CheckBox is Checked");
				}	
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Flag Duplicate Contacts CheckBox is not Checked",e);
				sa.assertAll();
			}	
		}
		else
		{
			Thread.sleep(1000);
			try {
				APOM.ClickOnFlagDuplicateContactsCheckBox();
				Logger.info("Click On Flag Duplicate Contacts CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Flag Duplicate Contacts CheckBox is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1000);
			try {
				if (APOM.DisplayedFlagDuplicateContactsCheckBoxIsChecked()==true) {
					Logger.info("Displayed Flag Duplicate Contacts CheckBox is Checked");
				}	
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Flag Duplicate Contacts CheckBox is not Checked",e);
				sa.assertAll();
			}	
		}

		Thread.sleep(1000);
		if (APOM.DisplayedDropdownRotate180degFlagDuplicateContacts()==true) {
			sa.assertTrue(true);
		} else {
			try {
				APOM.ClickOnFlagDuplicateContactsDropdown();
				Logger.info("Click On Flag Duplicate Contacts Dropdown is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Flag Duplicate Contacts Dropdown is Failed",e);
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
			if (APOM.DisplayedAccountNameOnlyCheckBoxIsCheckedFlagDudupecontact()==true) {
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
			APOM.ClickOnNewestContactIsTheMasterRecordRadioButton();
			Logger.info("Click On Newest Contact Is The Master Record RadioButton is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Newest Contact Is The Master Record RadioButton is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedNewestcontactIsTheMasterRecordRadioButtonIsClicked()==true) {
				Logger.info("Displayed Newest Contact Is The Master Record RadioButton Is Clicked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Newest Contact Is The Master Record RadioButton Is Not Clicked",e);
			sa.assertAll();
		}


		Thread.sleep(1000);
		try {
			APOM.ClickOnOldestContactIsTheMasterRecordRadioButton();
			Logger.info("Click On Oldest Contact Is The Master Record RadioButton is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Oldest Contact Is The Master Record RadioButton is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedOldestContactIsTheMasterRecordRadioButtonIsClicked()==true) {
				Logger.info("Displayed Oldest Contact Is The Master Record RadioButton Is Clicked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Oldest Contact Is The Master Record RadioButton Is Not Clicked",e);
			sa.assertAll();
		}


		Thread.sleep(1000);
		try {
			APOM.ClickOnContactWithmostRecentActivityIsTheMasterRecordRadioButton();
			Logger.info("Click On Contact With most Recent Activity Is The Master Record RadioButton is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Contact With most Recent Activity Is The Master Record RadioButton is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedContactWithmostRecentActivityIsTheMasterRecordRadioButtonIsClicked()==true) {
				Logger.info("Displayed Contact With most Recent Activity Is The Master Record RadioButton Is Clicked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Contact With most Recent Activity Is The Master Record RadioButton Is Not Clicked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnNewestContactIsTheMasterRecordRadioButtonn();
			Logger.info("Click On Newest Contact Is The Master Record RadioButton is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Newest Contact Is The Master Record RadioButton is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedNewestContactIsTheMasterRecordRadioButtonnIsClicked()==true) {
				Logger.info("Displayed Newest Contact Is The Master Record RadioButton Is Clicked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Newest Contact Is The Master Record RadioButton Is Not Clicked",e);
			sa.assertAll();
		}


		Thread.sleep(1000);
		try {
			APOM.ClickOnOldestcontctsIsTheMasterRecordRadioButtonn();
			Logger.info("Click On oldest Contact Is The Master Record RadioButton is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On oldest Contact Is The Master Record RadioButton is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (APOM.DisplayedOldestcontsctIsTheMasterRecordRadioButtonnIsClicked()==true) {
				Logger.info("Displayed oldest Contact Is The Master Record RadioButton Is Clicked");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed oldest Contact Is The Master Record RadioButton Is Not Clicked",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			APOM.ClickOnUploadDedupeMasterGroupIDToCRMForFlagDupicateContacts();
			Logger.info("Click On Upload Dedupe Master Group ID To CRM is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Upload Dedupe Master Group ID To CRM is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			APOM.SelectCreateDedupeGroupByOption();
			Logger.info("Click On Upload Dedupe Master Group ID To CRM Option is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Upload Dedupe Master Group ID To CRM Option is Failed",e);
			sa.assertAll();
		}
		
		Thread.sleep(1000);
		try {
			APOM.ClickOnSaveButtonForMergedublicateContact();
			Logger.info("Click On Save Button For Flag Duplicate Contacts is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button For Flag Duplicate Contacts is Failed",e);
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


		Logger.info("***************************Flag duplicate leads against matching contact records  ********************************");

		Thread.sleep(1000);
		if (APOM.DisplayedFlagDuplicateLeadsAgainstMatchingContactRecordsCheckBoxIsChecked()==true) {
			Thread.sleep(1000);
			try {
				APOM.ClickOnFlagDuplicateLeadsAgainstMatchingContactRecordsCheckBox();
				Logger.info("UnChecked the Flag Duplicate Leads Against Matching Contact Records CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("UnChecked the Flag Duplicate Leads Against Matching Contact Records CheckBox is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1000);
			try {
				APOM.ClickOnFlagDuplicateLeadsAgainstMatchingContactRecordsCheckBox();
				Logger.info("Click On Flag Duplicate Leads Against Matching Contact Records CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Flag Duplicate Leads Against Matching Contact Records CheckBox is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1000);
			try {
				if (APOM.DisplayedFlagDuplicateLeadsAgainstMatchingContactRecordsCheckBoxIsChecked()==true) {
					Logger.info("Displayed Flag Duplicate Leads Against Matching Contact Records CheckBox is Checked");
				}	
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Flag Duplicate Leads Against Matching Contact Records CheckBox is not Checked",e);
				sa.assertAll();
			}
		}
		else
		{
			Thread.sleep(1000);
			try {
				APOM.ClickOnFlagDuplicateLeadsAgainstMatchingContactRecordsCheckBox();
				Logger.info("Click On Flag Duplicate Leads Against Matching Contact Records CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Flag Duplicate Leads Against Matching Contact Records CheckBox is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1000);
			try {
				if (APOM.DisplayedFlagDuplicateLeadsAgainstMatchingContactRecordsCheckBoxIsChecked()==true) {
					Logger.info("Displayed Flag Duplicate Leads Against Matching Contact Records CheckBox is Checked");
				}	
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Flag Duplicate Leads Against Matching Contact Records CheckBox is not Checked",e);
				sa.assertAll();
			}
		}

		Thread.sleep(1000);
		if (APOM.DisplayedDropdownRotate180degFlagDuplicateLeadsAgainstMatchingContactRecords()==true) {
			sa.assertTrue(true);
		} else {
			try {
				APOM.ClickOnFlagDuplicateLeadsAgainstMatchingContactRecordsDropdown();
				Logger.info("Click On Flag Duplicate Contacts Dropdown is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Flag Duplicate Contacts Dropdown is Failed",e);
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
			APOM.ClickOnUploadDedupeMasterGroupIDToCRMForDuplicateLeadsAgainstMatchingContact();
			Logger.info("Click On Upload Dedupe Master Group ID To CRM is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Upload Dedupe Master Group ID To CRM is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			APOM.SelectCreateDedupeGroupByOption();
			Logger.info("Click On Upload Dedupe Master Group ID To CRM Option is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Upload Dedupe Master Group ID To CRM Option is Failed",e);
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
		Thread.sleep(1500);
	}
}
