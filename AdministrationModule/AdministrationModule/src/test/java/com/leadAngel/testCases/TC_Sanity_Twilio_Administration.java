package com.leadAngel.testCases;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.leadAngel.pageObjects.AdministrationPageObjectModel;
import com.leadAngel.pageObjects.HomePage;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
public class TC_Sanity_Twilio_Administration extends BaseClass{
	private static final Logger Logger = LogManager.getLogger(TC_Sanity_Twilio_Administration.class);

	@Test(description = "Administration_Twilio_Section")
	@Step("Administration_Twilio_Section")
	@Description("Administration_Twilio_Section")
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
		Thread.sleep(2500);
		try {
			APOM.ClickOnConnectTwilio();
			Logger.info("Click On Connect Twilio is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Connect Twilio is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			if (APOM.DisplayedTwilioIntegrationInToolbar()==true) {
				Logger.info("Displayed Twilio Integration In Toolbar is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Twilio Integration In Toolbar is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (APOM.DisplayedTwilioInLeftsideMenu()==true) {
				Logger.info("Displayed Twilio In Left side Menu is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Twilio In Left side Menu is Failed",e);
			sa.assertAll();
		}

		Logger.info("***************************************** User Auth Token *************************************");
		Thread.sleep(2500);
		try {
			APOM.EnterUserAuthToken();
			Logger.info("Enter User Auth Token is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter User Auth Token is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnUserAuthTokenCopyButton();
			Logger.info("Click On User Auth Token Copy Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On User Auth Token Copy Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(500);
		try {
			if (APOM.DisplayedSuccessMessageCopied()==true) {
				Logger.info("Displayed Success Message Copied is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Success Message Copied is Failed",e);
			sa.assertAll();
		}


		Logger.info("***************************************** User Account SID *************************************");
		Thread.sleep(2500);
		try {
			APOM.EnterUserAccountSIDToken();
			Logger.info("Enter User Account SID is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter User Account SID is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnUserAccountSIDTokenCopyButton();
			Logger.info("Click On User Account SID Token Copy Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On User Account SID Token Copy Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(500);
		try {
			if (APOM.DisplayedSuccessMessageCopied()==true) {
				Logger.info("Displayed Success Message Copied is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Success Message Copied is Failed",e);
			sa.assertAll();
		}


		Logger.info("***************************************** User Account SID *************************************");
		Thread.sleep(2500);
		try {
			APOM.EnterPhoneNumber();
			Logger.info("Enter Phone Number is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Phone Number is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnPhoneNumberCopyButton();
			Logger.info("Click On Phone Number Copy Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Phone Number Copy Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(500);
		try {
			if (APOM.DisplayedSuccessMessageCopied()==true) {
				Logger.info("Displayed Success Message Copied is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Success Message Copied is Failed",e);
			sa.assertAll();
		}

		Thread.sleep(3500);
		try {
			APOM.ClickOnSaveButtonForSlack();
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
		Thread.sleep(3500);
	}
}
