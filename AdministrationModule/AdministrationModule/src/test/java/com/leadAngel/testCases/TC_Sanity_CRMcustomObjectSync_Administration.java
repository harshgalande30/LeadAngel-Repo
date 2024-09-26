package com.leadAngel.testCases;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.leadAngel.pageObjects.AdministrationPageObjectModel;
import com.leadAngel.pageObjects.HomePage;
import io.qameta.allure.Description;
import io.qameta.allure.Step;

public class TC_Sanity_CRMcustomObjectSync_Administration extends BaseClass{
	private static final Logger Logger = LogManager.getLogger(TC_Sanity_CRMcustomObjectSync_Administration.class);

	@Test(description = "Administration_CRMcustomObjectSync_Section")
	@Step("Administration_CRMcustomObjectSync_Section")
	@Description("Administration_CRMcustomObjectSync_Section")
	public void AdministrationTest() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		HomePage hp = new HomePage(driver);
		AdministrationPageObjectModel APOM=new AdministrationPageObjectModel(driver);

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
			APOM.ClickOnIntegrations();
			Logger.info("Click On Integrations is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Integrations is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			APOM.ClickOnCustomObject();
			Logger.info("Click On Custom Object button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Custom Object button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (APOM.DisplayedCRMCustomObjectSync()==true) {
				Logger.info("Displayed CRM Custom Object Sync is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed CRM Custom Object Sync is Failed",e);
			sa.assertAll();
		}

		Logger.info("******************************* Custom Object API Name Operation ***************************");

		Thread.sleep(2500);
		try {
			if (APOM.DisplayedCustomObjectAPInameInputBoxIsDisabled()==true) {
				Logger.info("Displayed Custom Object API name InputBox Is Disabled is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Custom Object API name InputBox Is Disabled is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (APOM.DisplayedCustomObjectAPInameSaveButtonIsDisabled()==true) {
				Logger.info("Displayed Custom Object API name Save Button Is Disabled is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Custom Object API name Save Button Is Disabled is Failed",e);
			sa.assertAll();
		}


		Logger.info("*************************************** Related To ***************************************");
		for (int i = 0;i < 2; i++) {

			if (i==0) {
				Thread.sleep(2500);
				try {
					APOM.ClickOnAccountRadioButton();
					Logger.info("Click On Account Radio button is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Account Radio button is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					if (APOM.DisplayedAccountRadioButtonIsChecked() == true) {
						Logger.info("Displayed Account Radio Button Is Checked is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed Account Radio Button Is Checked is Failed", e);
					sa.assertAll();
				} 
			} 
			if (i==1) {
				Thread.sleep(2500);
				try {
					APOM.ClickOnLeadRadioButton();
					Logger.info("Click On Lead Radio button is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Lead Radio button is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					if (APOM.DisplayedLeadRadioButtonIsChecked() == true) {
						Logger.info("Displayed Lead Radio Button Is Checked is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed Lead Radio Button Is Checked is Failed", e);
					sa.assertAll();
				} 
			} 

			Thread.sleep(2500);
			try {
				APOM.ClickOnDropdownForCustomObjectAttribute();
				Logger.info("Click On Custom Object Attribute Dropdown is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Custom Object Attribute Dropdown is Failed", e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.SelectAnOption();
				Logger.info("Click an Option is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click an Option is Failed", e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnDropdownForRelatedObjectAttribute();
				Logger.info("Click On Related Object Attribute Dropdown is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Related Object Attribute Dropdown is Failed", e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.SelectAnOption();
				Logger.info("Click an Option is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click an Option is Failed", e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnSaveButtonForRelatedTo();
				Logger.info("Click On Save Button ForRelatedTo is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Save Button ForRelatedTo is Failed", e);
				sa.assertAll();
			}
			Thread.sleep(500);
			try {
				if (APOM.DisplayedSuccessMessageCopied() == true) {
					Logger.info("Displayed Success Message is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Success Message is Failed", e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				if (APOM.DisplayedRelatedToSaveButtonIsDisabled() == true) {
					Logger.info("Displayed Related To Save Button Is Disabled is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Related To Save Button Is Disabled is Failed", e);
				sa.assertAll();
			}


		}


		Logger.info("*************************************** Map Attribute Details ***************************************");

		Thread.sleep(2500);
		while (APOM.DisplayedDeleteToolTipButton()==true) {
			Thread.sleep(2000);
			try {
				APOM.ClickOnDeleteToolTipButton();
				Logger.info("Click On Delete Tool Tip Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Delete Tool Tip Button is Failed",e);
				sa.assertAll();
			}
		}

		for (int i = 0;i <2; i++) {
			Thread.sleep(2500);
			try {
				APOM.ClickOnAddButton();
				Logger.info("Click On Add Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Add Button is Failed", e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnCustomAttributeDropdown();
				Logger.info("Click On Custom Attribute Dropdown is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Custom Attribute Dropdown is Failed", e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.SelectAnOption();
				Logger.info("Click an Option is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click an Option is Failed", e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnOperatorDropdown();
				Logger.info("Click On Operator Dropdown is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Operator Dropdown is Failed", e);
				sa.assertAll();
			}
			if (i==0) {
				Thread.sleep(2500);
				try {
					APOM.SelectMatchesLeadAttributeOption();
					Logger.info("Select Matches Lead Attribute Option is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select Matches Lead Attribute Option is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					APOM.SelectValueDropdown();
					Logger.info("Select Value Dropdown is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select Value Dropdown is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					APOM.SelectAnOption();
					Logger.info("Click an Option is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click an Option is Failed", e);
					sa.assertAll();
				}
			}
			if (i==1) {
				Thread.sleep(2500);
				try {
					APOM.SelectEqualToValueOption();
					Logger.info("Select Equal To Value Option is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select Equal To Value Option is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					APOM.EnterValue();
					Logger.info("Enter Value is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Enter Value is Failed", e);
					sa.assertAll();
				}
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnAddButtonForAddPopup();
				Logger.info("Click On AddButton For Add Popup is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On AddButton For Add Popup is Failed", e);
				sa.assertAll();
			}
			Thread.sleep(2500);
		}


		Logger.info("************ Edit Operation for Matches Lead Attribute Operator***************");
		Thread.sleep(2500);
		try {
			APOM.ClickOnEditButtonForMatchesLeadAttributeOperator();
			Logger.info("Click On Edit Button For Matches Lead Attribute Operator is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Edit Button For Matches Lead Attribute Operator is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnOperatorDropdown();
			Logger.info("Click On Operator Dropdown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Operator Dropdown is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.SelectEqualToValueOption();
			Logger.info("Select Equal To Value Option is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Equal To Value Option is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.EnterValue();
			Logger.info("Enter Value is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Value is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnUpdateButtonEditAttribute();
			Logger.info("Click On Update Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Update Button is Failed", e);
			sa.assertAll();
		}

		Logger.info("************ Edit Operation for Equal to value Operator***************");
		Thread.sleep(3500);
		try {
			APOM.ClickOnEditButtonForEqualToValueOperator();
			Logger.info("Click On Edit Button For Equal To Value Operator is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Edit Button For Equal To Value Operator is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnOperatorDropdown();
			Logger.info("Click On Operator Dropdown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Operator Dropdown is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.SelectMatchesLeadAttributeOption();
			Logger.info("Select Matches Lead Attribute Option is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Matches Lead Attribute Option is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.SelectValueDropdown();
			Logger.info("Select Value Dropdown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Value Dropdown is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.SelectAnOption();
			Logger.info("Click an Option is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click an Option is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnUpdateButtonEditAttribute();
			Logger.info("Click On Update Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Update Button is Failed", e);
			sa.assertAll();
		}

		Logger.info("******************************** Default Filter Operation **********************************");
		Thread.sleep(2500);
		try {
			APOM.ClickOnDefaultFilter();
			Logger.info("Click On Default Filter is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Default Filter is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.SelectCustomFilter();
			Logger.info("Select Custom Filter is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Custom Filter is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.EnterValueForCustomFilter();
			Logger.info("Enter Value For Custom Filter is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Value For Custom Filter is Failed", e);
			sa.assertAll();
		}


		Thread.sleep(2500);
		try {
			APOM.ClickOnSaveButtonForMapAttribute();
			Logger.info("Click On Save Button For Map Attribute is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button For Map Attribute is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(500);
		try {
			if (APOM.DisplayedSuccessMessageCopied() == true) {
				Logger.info("Displayed Success Message is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Success Message is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (APOM.DisplayedMatAttributeDetailsSaveButtonIsDisabled() == true) {
				Logger.info("Displayed Mat Attribute Details Save Button Is Disabled is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Mat Attribute Details Save Button Is Disabled is Failed", e);
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
			Logger.error("Not showing 'Undefined' for Last Updated On");
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
			Logger.error("Not showing 'Undefined' for Last Updated By");
			sa.assertAll();	
		}
	}
}
