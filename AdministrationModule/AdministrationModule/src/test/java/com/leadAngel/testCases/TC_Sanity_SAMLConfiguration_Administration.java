package com.leadAngel.testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.leadAngel.pageObjects.AdministrationPageObjectModel;
import com.leadAngel.pageObjects.HomePage;

import io.qameta.allure.Description;
import io.qameta.allure.Step;

public class TC_Sanity_SAMLConfiguration_Administration extends BaseClass {

	private static final Logger Logger = LogManager.getLogger(TC_Sanity_SAMLConfiguration_Administration.class);

	@Test(description = "Administration_Integrations_Section")
	@Step("Administration_SAMLConfiguration")
	@Description("Administration_SAMLConfiguration")
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
			APOM.ClickOnIntegrations();
			Logger.info("Click On Integrations is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Integrations is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnConnectSAMLBox();
			Logger.info("Click On ConnectSAML Box is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On ConnectSAML Box is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			if (APOM.DisplayedSAMLConfiguration()==true) {
				Logger.info("Displayed SAML Configuration Page is Passed");
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed SAML Configuration Page is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			APOM.EnterEntityID();
			Logger.info("Enter EntityID is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter EntityID is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			APOM.EnterEntityID();
			Logger.info("Enter EntityID is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter EntityID is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			APOM.EnterSingleSignIOn_Url();
			Logger.info("Enter SingleSignIOn_Url is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter SingleSignIOn_Url is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			APOM.EnterLogout_Url();
			Logger.info("Enter Logout_Url is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Logout_Url is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			APOM.EnterLogout_Certificate();
			Logger.info("Enter Logout_Certificate is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Logout_Certificate is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			APOM.ClickOnSandBoxRadioButton();
			Logger.info("Click On SandBoxRadio Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On SandBoxRadio Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if(APOM.DisplayedSandboxRadioButtonIsClicked()==true)
				Logger.info("Displayed SandboxRadioButton Is Checked is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed SandboxRadioButton Is Checked is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			APOM.ClickOnTestRadioButton();
			Logger.info("Click On TestRadio Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On TestRadio Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if(APOM.DisplayedTestboxRadioButtonIsClicked()==true)
				Logger.info("Displayed TestRadioButton Is Checked is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed TestRadioButton Is Checked is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			APOM.ClickOnCpyButton();
			Logger.info("Click On Copy Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Copy Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(500);
		try {
			if(APOM.DisplayedCpiedSuccessMessage()==true)
				Logger.info("Displayed 'Copied Successfully' Message is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed 'Copied Successfully' Message is Failed",e);
			sa.assertAll();
		}


		if (APOM.DisplayedUpdatedMessage()==true) {
			Thread.sleep(3500);
			try {
				APOM.ClickOnUpdateButtonSAML();
				Logger.info("Click On Update Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Update Button is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(500);
			try {
				if(APOM.DisplayedUpdatedSuccessMessage()==true)
					Logger.info("Displayed 'UpdatedSuccessfuly' Message is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed 'UpdatedSuccessfuly' Message is Failed",e);
				sa.assertAll();
			}
		}else if(APOM.DisplayedSavedMessage()==true){
			Thread.sleep(3500);
			try {
				APOM.ClickOnSaveButtonSAML();
				Logger.info("Click On Save Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Save Button is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(500);
			try {
				if(APOM.DisplayedInsertedSuccessfullyMessage()==true)
					Logger.info("Displayed 'InsertedSuccessfully' Message is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed 'InsertedSuccessfully' Message is Failed",e);
				sa.assertAll();
			}

		}

	}	
}
