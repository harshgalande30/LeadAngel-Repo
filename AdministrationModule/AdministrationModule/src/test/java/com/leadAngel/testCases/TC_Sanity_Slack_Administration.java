package com.leadAngel.testCases;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.leadAngel.pageObjects.AdministrationPageObjectModel;
import com.leadAngel.pageObjects.HomePage;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
public class TC_Sanity_Slack_Administration extends BaseClass{
	private static final Logger Logger = LogManager.getLogger(TC_Sanity_Slack_Administration.class);

	@Test(description = "Administration_Slack_Section")
	@Step("Administration_Slack_Section")
	@Description("Administration_Slack_Section")
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
			APOM.ClickOnConnectSlack();
			Logger.info("Click On Connect Slack is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Connect Slack is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			if (APOM.DisplayedSlackIntegrationInToolbar()==true) {
				Logger.info("Displayed Slack Integration In Toolbar is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Slack Integration In Toolbar is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (APOM.DisplayedSlackInLeftsideMenu()==true) {
				Logger.info("Displayed Slack In Left side Menu is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Slack In Left side Menu is Failed",e);
			sa.assertAll();
		}

		Logger.info("***************************************** User Auth Access Token *************************************");
		Thread.sleep(2500);
		try {
			APOM.EnterUserOAuthAccessToken();
			Logger.info("Enter User OAuth Access Token is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click User OAuth Access Token is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnUserOAuthAccessTokenCopyButton();
			Logger.info("Click On User OAuth Access Token Copy Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On User OAuth Access Token Copy Button is Failed",e);
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

		Logger.info("***************************************** Salesforce Field *************************************");

		Thread.sleep(2500);
		try {
			APOM.ClearSalesforceFieldSelectbox();
			Logger.info("Clear Salesforce FieldSelectbox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clear Salesforce FieldSelectbox is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnSalesforceFieldDropdown();
			Logger.info("Click On Salesforce Field Dropdown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Salesforce Field Dropdown is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickAnOptionEmailFromListBox();
			Logger.info("Click an Option is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click an Option is Failed", e);
			sa.assertAll();
		}

		Logger.info("***************************************** Slack Field *************************************");

		Thread.sleep(2500);
		try {
			APOM.ClearSlackFieldSelectbox();
			Logger.info("Clear SlackField Select box is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clear SlackField Select box is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnSlackFieldDropdown();
			Logger.info("Click On SlackField Dropdown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On SlackField Dropdown is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickAnOptionFromListBox();
			Logger.info("Click an Option is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click an Option is Failed", e);
			sa.assertAll();
		}

		if (APOM.DisplayedSendSlackNotificationsToBothPublicAndPrivateChannelsCheckBoxIsChecked() == true) {
			Thread.sleep(2500);
			try {
				APOM.ClickOnSendSlackNotificationsToBothPublicAndPrivateChannelsCheckBox();
				Logger.info("Uncheck Send Slack Notifications To Both Public And Private Channels CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Uncheck Send Slack Notifications To Both Public And Private Channels CheckBox is Failed",
						e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnSendSlackNotificationsToBothPublicAndPrivateChannelsCheckBox();
				Logger.info("Click On Send Slack Notifications To Both Public And Private Channels CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Send Slack Notifications To Both Public And Private Channels CheckBox is Failed",
						e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				if (APOM.DisplayedSendSlackNotificationsToBothPublicAndPrivateChannelsCheckBoxIsChecked() == true) {
					Logger.info(
							"Displayed Send Slack Notifications To Both Public And Private Channels Check Box Is Checked is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error(
						"Displayed Send Slack Notifications To Both Public And Private Channels Check Box Is Checked is Failed",
						e);
				sa.assertAll();
			} 
		}else {
			try {
				APOM.ClickOnSendSlackNotificationsToBothPublicAndPrivateChannelsCheckBox();
				Logger.info("Click On Send Slack Notifications To Both Public And Private Channels CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Send Slack Notifications To Both Public And Private Channels CheckBox is Failed",
						e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				if (APOM.DisplayedSendSlackNotificationsToBothPublicAndPrivateChannelsCheckBoxIsChecked() == true) {
					Logger.info(
							"Displayed Send Slack Notifications To Both Public And Private Channels Check Box Is Checked is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error(
						"Displayed Send Slack Notifications To Both Public And Private Channels Check Box Is Checked is Failed",
						e);
				sa.assertAll();
			} 
		}
		Thread.sleep(2500);
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
		Thread.sleep(2500);
		try {
			APOM.ClickOnSendSlackNotificationsToBothPublicAndPrivateChannelsCheckBox();
			Logger.info("Click On Send Slack Notifications To Both Public And Private Channels CheckBox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Send Slack Notifications To Both Public And Private Channels CheckBox is Failed",
					e);
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
