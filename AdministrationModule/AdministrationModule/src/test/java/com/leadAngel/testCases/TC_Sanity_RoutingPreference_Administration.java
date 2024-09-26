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
public class TC_Sanity_RoutingPreference_Administration extends BaseClass{
	private static final Logger Logger = LogManager.getLogger(TC_Sanity_RoutingPreference_Administration.class);

	@Test(description = "Administration_RoutingPreference_Section")
	@Step("Administration_RoutingPreference_Section")
	@Description("Administration_RoutingPreference_Section")
	public void AdministrationTest() throws InterruptedException,AWTException {
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
			if (APOM.DisplyedRoutingPreference()==true) {
				Logger.info("Displyed Routing Preference Icon is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displyed Routing Preference Icon is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnRoutingPreferenceIcon();
			Logger.info("Click On Routing Preference Icon is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Routing Preference Icon is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (APOM.DisplayedRoutingPreferenceInTabsRow()==true) {
				Logger.info("Displayed Routing Preference In Tabs Row is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Routing Preference In Tabs Row is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (APOM.DisplayedRoutingPreferenceInLeftSideMenu()==true) {
				Logger.info("Displayed Routing Preference In Left Side Menu is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Routing Preference In Left Side Menu is Failed",e);
			sa.assertAll();
		}

		Logger.info("*************************** Operation on Assignment Options ********************************");
		Thread.sleep(2500);
		if (APOM.DisplayedDropdownRotate180degAssignmentOptions()==true) {
			sa.assertTrue(true);
		} else {
			Thread.sleep(2500);
			try {
				APOM.ClickOnAssignmentOptionsDropdown();
				Logger.info("Click On Assignment Options Dropdown is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Assignment Options Dropdown is Failed",e);
				sa.assertAll();
			}
		}

		Thread.sleep(2500);
		if (APOM.DisplayedAssignToInactiveOwnersManagerCheckBoxIsChecked()==true) {
			Thread.sleep(2500);
			try {
				APOM.ClickOnAssignToInactiveOwnersManagerCheckBox();
				Logger.info("UnChecked the Assign To Inactive Owners Manager CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("UnChecked the Assign To Inactive Owners Manager CheckBox is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnAssignToInactiveOwnersManagerCheckBox();
				Logger.info("Click On Assign To Inactive Owners Manager CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Assign To Inactive Owners Manager CheckBox is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				if (APOM.DisplayedAssignToInactiveOwnersManagerCheckBoxIsChecked()==true) {
					Logger.info("Displayed Assign To Inactive Owners Manager CheckBox is Checked");
				}	
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Assign To Inactive Owners Manager CheckBox is not Checked",e);
				sa.assertAll();
			}	
		}
		else
		{
			Thread.sleep(2500);
			try {
				APOM.ClickOnAssignToInactiveOwnersManagerCheckBox();
				Logger.info("Click On Assign To Inactive Owners Manager CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Assign To Inactive Owners Manager CheckBox is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				if (APOM.DisplayedAssignToInactiveOwnersManagerCheckBoxIsChecked()==true) {
					Logger.info("Displayed Assign To Inactive Owners Manager CheckBox is Checked");
				}	
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Assign To Inactive Owners Manager CheckBox is not Checked",e);
				sa.assertAll();
			}		
		}

		Thread.sleep(2500);
		if (APOM.DisplayedReassignPartnerLeadsCheckBoxIsChecked()==true) {
			Thread.sleep(2500);
			try {
				APOM.ClickOnReassignPartnerLeadsCheckBox();
				Logger.info("UnChecked the Reassign Partner Leads CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("UnChecked the Reassign Partner Leads CheckBox is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnReassignPartnerLeadsCheckBox();
				Logger.info("Click On Reassign Partner Leads CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Reassign Partner Leads CheckBox is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				if (APOM.DisplayedReassignPartnerLeadsCheckBoxIsChecked()==true) {
					Logger.info("Displayed Reassign Partner Leads CheckBox is Checked");
				}	
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Reassign Partner Leads CheckBox is not Checked",e);
				sa.assertAll();
			}	
		}
		else
		{
			Thread.sleep(2500);
			try {
				APOM.ClickOnReassignPartnerLeadsCheckBox();
				Logger.info("Click On Reassign Partner Leads CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Reassign Partner Leads CheckBox is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				if (APOM.DisplayedReassignPartnerLeadsCheckBoxIsChecked()==true) {
					Logger.info("Displayed Reassign Partner Leads CheckBox is Checked");
				}	
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Reassign Partner Leads CheckBox is not Checked",e);
				sa.assertAll();
			}		
		}

		Thread.sleep(2500);
		try {
			APOM.SelectNumberOfInactivityDaysToReassignLeads();
			Logger.info("Select Number Of Inactivity Days To Reassign Leads is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Number Of Inactivity Days To Reassign Leads is Failed",e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		try {
			APOM.ClickOnSelectLabelNameDropdown();
			Logger.info("click on Label Name dropdown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("click on Label Name dropdown is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.SelectCreateDedupeGroupByOption();
			Logger.info("Click On Label Name Option is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Label Name Option is Failed",e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		try {
			APOM.ClickOnSaveButtonForDataCleanupProcess();
			Logger.info("Click On Save Button For Assignment Options is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button For Assignment Options is Failed",e);
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

		Logger.info("*************************** Operation on Custom Groups ********************************");
		Thread.sleep(2500);
		if (APOM.DisplayedCustomGroups180degAssignmentOptions()==true) {
			sa.assertTrue(true);
		} else {
			Thread.sleep(2500);
			try {
				APOM.ClickOnCustomGroupsDropdown();
				Logger.info("Click On Custom Groups Dropdown is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Custom Groups Dropdown is Failed",e);
				sa.assertAll();
			}
		}
		Logger.info("********Group Leads By********");
		Thread.sleep(2500);
		if (APOM.DisplayedCrossMarkForGroupLeadsBy()==true) {
			Thread.sleep(2500);
			try {
				APOM.ClickOnCrossMarkForGroupLeadsBy();
				Logger.info("Clear the selected attribute For GroupLeadsBy is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Clear the selected attribute For GroupLeadsBy is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnSaveButtonForMergedublicateContact();
				Logger.info("Click On Custom Groups Save Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Custom Groups Save Button is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnConfirmButton();
				Logger.info("Click On Confirm Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Confirm Button is Failed",e);
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
			Thread.sleep(2500);
			if (APOM.DisplayedCustomGroups180degAssignmentOptions()==false) {
				Thread.sleep(2500);
				try {
					APOM.ClickOnCustomGroupsDropdown();
					Logger.info("Click On Custom Groups Dropdown is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Custom Groups Dropdown is Failed",e);
					sa.assertAll();
				}
			}else {
				Thread.sleep(2500);
				try {
					APOM.ClickOnDropdownForGroupLeadsBy();
					Logger.info("Click On Dropdown For GroupLeadsBy is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Dropdown For GroupLeadsBy is Failed",e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					APOM.SelectCreateDedupeGroupByOption();
					Logger.info("Select Lead Attribute Option is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select Lead Attribute Option is Failed",e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					APOM.ClickOnSaveButtonForMergedublicateContact();
					Logger.info("Click On Custom Groups Save Button is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Custom Groups Save Button is Failed",e);
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
			}
			//****************
			Thread.sleep(2500);
			try {
				APOM.ClickOnDropdownForGroupLeadsBy();
				Logger.info("Click On Dropdown For GroupLeadsBy is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Dropdown For GroupLeadsBy is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.SelectCreateDedupeGroupByOption();
				Logger.info("Select Lead Attribute Option is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select Lead Attribute Option is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnSaveButtonForMergedublicateContact();
				Logger.info("Click On Custom Groups Save Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Custom Groups Save Button is Failed",e);
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
			//****************
			Thread.sleep(2500);
			try {
				APOM.ClickOnDropdownForGroupLeadsBy();
				Logger.info("Click On Dropdown For GroupLeadsBy is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Dropdown For GroupLeadsBy is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.SelectCreateDedupeGroupByOption2();
				Logger.info("Select Lead Attribute Option is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select Lead Attribute Option is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnSaveButtonForMergedublicateContact();
				Logger.info("Click On Custom Groups Save Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Custom Groups Save Button is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnConfirmButton();
				Logger.info("Click On Confirm Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Confirm Button is Failed",e);
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
		}
		else
		{
			Thread.sleep(2500);
			try {
				APOM.ClickOnDropdownForGroupLeadsBy();
				Logger.info("Click On Dropdown For GroupLeadsBy is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Dropdown For GroupLeadsBy is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.SelectCreateDedupeGroupByOption();
				Logger.info("Select Lead Attribute Option is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select Lead Attribute Option is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnSaveButtonForMergedublicateContact();
				Logger.info("Click On Custom Groups Save Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Custom Groups Save Button is Failed",e);
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
		}	

		Logger.info("********Group Contact by********");
		Thread.sleep(2500);
		if (APOM.DisplayedCrossMarkForGroupContactBy()==true) {
			Thread.sleep(2500);
			try {
				APOM.ClickOnCrossMarkForGroupContactBy();
				Logger.info("Clear the selected attribute For GroupContactBy is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Clear the selected attribute For GroupContactBy is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(3500);
			try {
				APOM.ClickOnSaveButtonForMergedublicateContact();
				Logger.info("Click On Custom Groups Save Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Custom Groups Save Button is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnConfirmButton();
				Logger.info("Click On Confirm Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Confirm Button is Failed",e);
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
			Thread.sleep(2500);
			if (APOM.DisplayedCustomGroups180degAssignmentOptions()==false) {
				Thread.sleep(2500);
				try {
					APOM.ClickOnCustomGroupsDropdown();
					Logger.info("Click On Custom Groups Dropdown is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Custom Groups Dropdown is Failed",e);
					sa.assertAll();
				}
			}else {
				Thread.sleep(2500);
				try {
					APOM.ClickOnDropdownForGroupContactBy();
					Logger.info("Click On Dropdown For GroupContactBy is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Dropdown For GroupContactBy is Failed",e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					APOM.SelectCreateDedupeGroupByOption();
					Logger.info("Select Contact Attribute Option is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select Contact Attribute Option is Failed",e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					APOM.ClickOnSaveButtonForMergedublicateContact();
					Logger.info("Click On Custom Groups Save Button is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Custom Groups Save Button is Failed",e);
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
			}
			//********************
			Thread.sleep(2500);
			try {
				APOM.ClickOnDropdownForGroupContactBy();
				Logger.info("Click On Dropdown For GroupContactBy is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Dropdown For GroupContactBy is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.SelectCreateDedupeGroupByOption();
				Logger.info("Select Contact Attribute Option is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select Contact Attribute Option is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnSaveButtonForMergedublicateContact();
				Logger.info("Click On Custom Groups Save Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Custom Groups Save Button is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(800);
			try {
				if (APOM.DisplayedSuccessMessageDataCleanup()==false) {
					Logger.info("Displayed Success Message is Passed");
				}	
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Success Message is Failed",e);
				sa.assertAll();
			}
			//********************
			Thread.sleep(2500);
			try {
				APOM.ClickOnDropdownForGroupContactBy();
				Logger.info("Click On Dropdown For GroupContactBy is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Dropdown For GroupContactBy is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.SelectCreateDedupeGroupByOption2();
				Logger.info("Select Contact Attribute Option is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select Contact Attribute Option is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnSaveButtonForMergedublicateContact();
				Logger.info("Click On Custom Groups Save Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Custom Groups Save Button is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnConfirmButton();
				Logger.info("Click On Confirm Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Confirm Button is Failed",e);
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

		}
		else
		{
			Thread.sleep(2500);
			try {
				APOM.ClickOnDropdownForGroupContactBy();
				Logger.info("Click On Dropdown For GroupContactBy is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Dropdown For GroupContactBy is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.SelectCreateDedupeGroupByOption();
				Logger.info("Select Contact Attribute Option is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select Contact Attribute Option is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnSaveButtonForMergedublicateContact();
				Logger.info("Click On Custom Groups Save Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Custom Groups Save Button is Failed",e);
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
		}

		Logger.info("******** Group Account by ********");
		Thread.sleep(2500);
		if (APOM.DisplayedCrossMarkForGroupAccountBy()==true) {
			Thread.sleep(2500);
			try {
				APOM.ClickOnCrossMarkForGroupAccountBy();
				Logger.info("Clear the selected attribute For GroupAccountBy is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Clear the selected attribute For GroupAccountBy is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnSaveButtonForMergedublicateContact();
				Logger.info("Click On Custom Groups Save Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Custom Groups Save Button is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnConfirmButton();
				Logger.info("Click On Confirm Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Confirm Button is Failed",e);
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
			Thread.sleep(2500);
			if (APOM.DisplayedCustomGroups180degAssignmentOptions()==false) {
				Thread.sleep(2500);
				try {
					APOM.ClickOnCustomGroupsDropdown();
					Logger.info("Click On Custom Groups Dropdown is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Custom Groups Dropdown is Failed",e);
					sa.assertAll();
				}
			}else {
				Thread.sleep(2500);
				try {
					APOM.ClickOnDropdownForGroupAccountBy();
					Logger.info("Click On Dropdown For GroupAccountBy is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Dropdown For GroupAccountBy is Failed",e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					APOM.SelectCreateDedupeGroupByOption();
					Logger.info("Select Account Attribute Option is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select Account Attribute Option is Failed",e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					APOM.ClickOnSaveButtonForMergedublicateContact();
					Logger.info("Click On Custom Groups Save Button is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Custom Groups Save Button is Failed",e);
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
			}
			//******************
			Thread.sleep(2500);
			try {
				APOM.ClickOnDropdownForGroupAccountBy();
				Logger.info("Click On Dropdown For GroupAccountBy is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Dropdown For GroupAccountBy is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.SelectCreateDedupeGroupByOption();
				Logger.info("Select Account Attribute Option is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select Account Attribute Option is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnSaveButtonForMergedublicateContact();
				Logger.info("Click On Custom Groups Save Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Custom Groups Save Button is Failed",e);
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
			//******************
			Thread.sleep(2500);
			try {
				APOM.ClickOnDropdownForGroupAccountBy();
				Logger.info("Click On Dropdown For GroupAccountBy is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Dropdown For GroupAccountBy is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.SelectCreateDedupeGroupByOption2();
				Logger.info("Select Account Attribute Option is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select Account Attribute Option is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnSaveButtonForMergedublicateContact();
				Logger.info("Click On Custom Groups Save Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Custom Groups Save Button is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnConfirmButton();
				Logger.info("Click On Confirm Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Confirm Button is Failed",e);
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
		}
		else
		{
			Thread.sleep(2500);
			try {
				APOM.ClickOnDropdownForGroupAccountBy();
				Logger.info("Click On Dropdown For GroupAccountBy is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Dropdown For GroupAccountBy is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.SelectCreateDedupeGroupByOption();
				Logger.info("Select Account Attribute Option is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select Account Attribute Option is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnSaveButtonForMergedublicateContact();
				Logger.info("Click On Custom Groups Save Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Custom Groups Save Button is Failed",e);
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
		}

		Logger.info("******** Group Opportunity by ********");
		Thread.sleep(2500);
		if (APOM.DisplayedCrossMarkForGroupOpportunityBy()==true) {
			Thread.sleep(2500);
			try {
				APOM.ClickOnCrossMarkForGroupOpportunityBy();
				Logger.info("Clear the selected attribute For GroupOpportunityBy is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Clear the selected attribute For GroupOpportunityBy is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnSaveButtonForMergedublicateContact();
				Logger.info("Click On Custom Groups Save Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Custom Groups Save Button is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnConfirmButton();
				Logger.info("Click On Confirm Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Confirm Button is Failed",e);
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
			Thread.sleep(2500);
			if (APOM.DisplayedCustomGroups180degAssignmentOptions()==false) {
				Thread.sleep(2500);
				try {
					APOM.ClickOnCustomGroupsDropdown();
					Logger.info("Click On Custom Groups Dropdown is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Custom Groups Dropdown is Failed",e);
					sa.assertAll();
				}
			}else {
				Thread.sleep(2500);
				try {
					APOM.ClickOnDropdownForGroupOpportunityBy();
					Logger.info("Click On Dropdown For GroupOpportunityBy is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Dropdown For GroupOpportunityBy is Failed",e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					APOM.SelectCreateDedupeGroupByOption();
					Logger.info("Select Opportunity Attribute Option is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select Opportunity Attribute Option is Failed",e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					APOM.ClickOnSaveButtonForMergedublicateContact();
					Logger.info("Click On Custom Groups Save Button is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Custom Groups Save Button is Failed",e);
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
			}
			//********************
			Thread.sleep(2500);
			try {
				APOM.ClickOnDropdownForGroupOpportunityBy();
				Logger.info("Click On Dropdown For GroupOpportunityBy is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Dropdown For GroupOpportunityBy is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.SelectCreateDedupeGroupByOption();
				Logger.info("Select Opportunity Attribute Option is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select Opportunity Attribute Option is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnSaveButtonForMergedublicateContact();
				Logger.info("Click On Custom Groups Save Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Custom Groups Save Button is Failed",e);
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
			//********************
			Thread.sleep(2500);
			try {
				APOM.ClickOnDropdownForGroupOpportunityBy();
				Logger.info("Click On Dropdown For GroupOpportunityBy is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Dropdown For GroupOpportunityBy is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.SelectCreateDedupeGroupByOption2();
				Logger.info("Select Opportunity Attribute Option is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select Opportunity Attribute Option is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnSaveButtonForMergedublicateContact();
				Logger.info("Click On Custom Groups Save Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Custom Groups Save Button is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnConfirmButton();
				Logger.info("Click On Confirm Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Confirm Button is Failed",e);
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
		}
		else
		{
			Thread.sleep(2500);
			try {
				APOM.ClickOnDropdownForGroupOpportunityBy();
				Logger.info("Click On Dropdown For GroupOpportunityBy is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Dropdown For GroupOpportunityBy is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.SelectCreateDedupeGroupByOption();
				Logger.info("Select Opportunity Attribute Option is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select Opportunity Attribute Option is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnSaveButtonForMergedublicateContact();
				Logger.info("Click On Custom Groups Save Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Custom Groups Save Button is Failed",e);
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
		}

		Logger.info("//******************************* Detail Tab ************************");
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
