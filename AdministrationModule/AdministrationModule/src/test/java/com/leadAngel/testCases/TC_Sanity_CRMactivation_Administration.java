package com.leadAngel.testCases;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.leadAngel.pageObjects.AdministrationPageObjectModel;
import com.leadAngel.pageObjects.HomePage;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
public class TC_Sanity_CRMactivation_Administration extends BaseClass{
	private static final Logger Logger = LogManager.getLogger(TC_Sanity_CRMactivation_Administration.class);

	@Test(description = "Administration_CRMactivation_Section")
	@Step("Administration_CRMactivation_Section")
	@Description("Administration_CRMactivation_Section")
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
			APOM.ClickOnConnectCRMbutton();
			Logger.info("Click On Connect CRM button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Connect CRM button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (APOM.DisplayedCRMactivationInTabsRow()==true) {
				Logger.info("Displayed CRM Activation In Tabs Row is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed CRM Activation In Tabs Row is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (APOM.DisplayedCRMactivationInLeftSideMenu()==true) {
				Logger.info("Displayed CRM Activation In Left Side Menu is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed CRM Activation In Left Side Menu is Failed",e);
			sa.assertAll();
		}

		String ExpectedSalesForceProdURL="https://login.salesforce.com/";
		String CurrentSalesForceProdURL="";
		String ExpectedSalesForceTestURL="https://test.salesforce.com/";
		String CurrentSalesForceTestURL="";
		String LeadAngelURL="https://app.leadangel.com/";

		Thread.sleep(3500);
		try {
			APOM.ClickOnSFDCAppforProductionButton();
			Logger.info("Click On SFDC App for Production Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On SFDC App for Production Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnSFDCappforSandboxButton();
			Logger.info("Click On SFDC App for Sandbox Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On SFDC App for Sandbox Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		Set<String> SFDCProdWH = driver.getWindowHandles();// this will fetch Parent Id,Child Id,SubChild Id...

		for (String wh : SFDCProdWH) {
			driver.switchTo().window(wh);
			if (driver.getCurrentUrl().contains(ExpectedSalesForceProdURL)) {
				Thread.sleep(2500);
				CurrentSalesForceProdURL=driver.getCurrentUrl();
				Logger.info("CurrentSalesForceProdURL :"+CurrentSalesForceProdURL);
				Logger.info("SalesForce Production URL is successfuly navigated is Passed");
				driver.close();
				Logger.info("Close Tab is Passed");
			}
			else if (driver.getCurrentUrl().contains(ExpectedSalesForceTestURL)) {
				Thread.sleep(2500);
				CurrentSalesForceTestURL=driver.getCurrentUrl();
				Logger.info("CurrentSalesForceTestURL :"+CurrentSalesForceTestURL);
				Logger.info("SalesForce Test URL is successfuly navigated is Passed");
				driver.close();
				Logger.info("Close Tab is Passed");
			}
			else if (driver.getCurrentUrl().contains(LeadAngelURL)) {
				Thread.sleep(2500);
				try {
					APOM.ClickOnSFDCAppforProductionCopyButton();
					Logger.info("Click On SFDC App for Production Copy Button is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On SFDC App for Production Copy Button is Failed",e);
					sa.assertAll();
				}
				Thread.sleep(400);
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
					APOM.ClickOnSFDCappforSandboxCopyButton();
					Logger.info("Click On SFDC App for Sandbox Copy Button is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On SFDC App for Sandbox Copy Button is Failed",e);
					sa.assertAll();
				}
				Thread.sleep(400);
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
					APOM.ClickOnSFDCappActivationKeyCopyButton();
					Logger.info("Click On SFDC App ActivationKey Copy Button is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On SFDC App ActivationKey Copy Button is Failed",e);
					sa.assertAll();
				}
				Thread.sleep(400);
				try {
					if (APOM.DisplayedSuccessMessageCopied()==true) {
						Logger.info("Displayed Success Message is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed Success Message is Failed",e);
					sa.assertAll();
				}
			}
			else {
				sa.assertTrue(false);
				Logger.error("SFDC URL is not navigated properly");
				sa.assertAll();
			}
			Thread.sleep(2500);
		}
		driver.quit();
	}	
}
