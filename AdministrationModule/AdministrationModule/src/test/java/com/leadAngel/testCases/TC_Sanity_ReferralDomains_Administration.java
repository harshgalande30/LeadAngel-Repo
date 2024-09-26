package com.leadAngel.testCases;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.leadAngel.pageObjects.AdministrationPageObjectModel;
import com.leadAngel.pageObjects.Forms_PageObjectModel;
import com.leadAngel.pageObjects.HomePage;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
public class TC_Sanity_ReferralDomains_Administration extends BaseClass {
	private static final Logger Logger = LogManager.getLogger(TC_Sanity_ReferralDomains_Administration.class);

	@Test(description = "Administration_ReferralDomains_Section")
	@Step("Administration_ReferralDomains_Section")
	@Description("Administration_ReferralDomains_Section")
	public void AdministrationTest() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		HomePage hp = new HomePage(driver);
		AdministrationPageObjectModel APOM=new AdministrationPageObjectModel(driver);
		Forms_PageObjectModel FPOM=new Forms_PageObjectModel(driver);
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
			FPOM.ClickOnWebToLeadDropdown();
			Logger.info("Click On WebToLead Dropdown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On WebToLead Dropdown is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnReferralDomains();
			Logger.info("Click On Referral Domains is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Referral Domains is Failed",e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		if (APOM.DisplayedAlreadyPresentDomainList()==true) {
			Logger.info("Displayed Already Present Domain List");
			Thread.sleep(2500);
			try {
				APOM.ClickOnDeleteButtonForDomainUrl();
				Logger.info("Click On Delete Icon is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Delete Icon is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnDeleteButtonForRecaptchaConfirmationPopup();
				Logger.info("Click On Delete Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Delete Button is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(800);
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
		} else {
			sa.assertTrue(true);
		}

		Thread.sleep(2500);
		if (APOM.DisplayedAlreadyPresentEditDomainList()==true) {
			Logger.info("Displayed Already Present Edit Domain List");
			Thread.sleep(2500);
			try {
				APOM.ClickOnDeleteButtonForEditDomainUrl();
				Logger.info("Click On Delete Icon is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Delete Icon is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnDeleteButtonForRecaptchaConfirmationPopup();
				Logger.info("Click On Delete Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Delete Button is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(800);
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
		} else {
			sa.assertTrue(true);
		}

		Logger.info("*********************************** Add New Domain URL ************************************");
		Thread.sleep(2500);
		try {
			APOM.ClickOnAddDomainURLbutton();
			Logger.info("Click On Add Domain URL button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Add Domain URL button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.EnterDomainURL();
			Logger.info("Enter Domain URL is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Domain URL is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnSaveButtonForReferralDomains();
			Logger.info("Click On Save Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button is Failed", e);
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

		Logger.info("*********************************** Edit Domain URL ************************************");
		Thread.sleep(2500);
		try {
			APOM.ClickOnEditButtonForDomainUrl();
			Logger.info("Click On Edit Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Edit Button is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.EditDomainURL();
			Logger.info("Edit Domain URL is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Edit Domain URL  is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnSaveButtonForReferralDomains();
			Logger.info("Click On Save Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button is Failed", e);
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


		Logger.info("*********************************** Filter Operation ************************************");
		Thread.sleep(2500);
		try {
			APOM.EnterDomainURLInsideFilterBox();
			Logger.info("Enter Domain URL Inside FilterBox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Domain URL Inside FilterBox is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (APOM.DisplayedAlreadyPresentEditDomainList()==true) {
				Logger.info("Displayed DomainURL Which is entered in filtered box is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed DomainURL Which is entered in filtered box is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.CleareFilterBox();
			Logger.info("Clear Filter Box is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clear Filter Box is Failed", e);
			sa.assertAll();
		}

		Logger.info("*********************************** Delete Domain URL ************************************");
		Thread.sleep(2500);
		try {
			APOM.ClickOnDeleteButtonForEditDomainUrl();
			Logger.info("Click On Delete Icon is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Icon is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnDeleteButtonForRecaptchaConfirmationPopup();
			Logger.info("Click On Delete Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(800);
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
	}
}
