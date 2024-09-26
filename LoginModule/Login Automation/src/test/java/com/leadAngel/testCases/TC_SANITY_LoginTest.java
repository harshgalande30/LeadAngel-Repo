package com.leadAngel.testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.time.Duration;
import com.leadAngel.pageObjects.LoginPage;
//import com.leadAngel.utilities.TestAllureListener;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;

@Listeners({ com.leadAngel.utilities.TestAllureListener.class })
public class TC_SANITY_LoginTest extends BaseClass {
	//private final static Logger logger = org.apache.logging.log4j.LogManager.getLogger(TC_SANITY_LoginTest.class);
	private static final Logger logger = LogManager.getLogger(TC_SANITY_LoginTest.class);

	@Epic("Sanity")
	@Feature("LoginTest SANITY")
	@Description("Login Module Sanity Test Description")
	@Test(description = "All Positive Cases of SSO, Forgot Password & Login Section")
	@Step("ForgotPassword Login TEST")

	public void SanityloginTest() throws InterruptedException, IOException {
	
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        
		SoftAssert sa = new SoftAssert();
		logger.info("URL is Opened");
		LoginPage lp = new LoginPage(driver);
		Thread.sleep(6200);
		driver.get(baseURL);
		logger.info("==========Forgot Password Scenario Started=============");
		Thread.sleep(1200);
		try {
			lp.ClickForgotButton();
			logger.info("Clicked in Forgot Password Button");
		} catch (Exception e) {
			sa.assertTrue(false);
			logger.error("Clicking in Forgot Password Button FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(900);
		lp.CidForgotPassword(clientid);
		logger.info("Entered Correct Client ID");
		Thread.sleep(900);
		lp.EmailForgotPassword(emailid);
		logger.info("Entered Correct Email ID");
		Thread.sleep(900);
		lp.clickRequestPassword();
		logger.info("Clicked on Forgot Password Button");
		
//		if (lp.DisplayForgotPasswordCenternotify(true)) {
//			try { 
//				sa.assertTrue(true);
//				logger.info("DisplayForgotPasswordCenternotify is PASS");
//
//			} catch (Exception e) {
//				sa.assertTrue(false);
//				logger.error("DisplayForgotPasswordCenternotify is FAIL" ,e);
//				sa.assertAll();
//			}
//		}
//		else {
//			lp.DisplaySuccessForgotPassword(true);
//			try { 
//				sa.assertTrue(true);
//				logger.info("DisplaySuccessForgotPassword is PASS");
//
//			} catch (Exception e) {
//				sa.assertTrue(false);
//				logger.error("DisplaySuccessForgotPassword is FAIL" ,e);
//				sa.assertAll();
//			}
//		}

		
		logger.info("==================================Login Scenario Started===============================");
		Thread.sleep(1200);
		try {
		lp.setClientId(clientid);
		logger.info("Entered ClientID");
		}catch(Exception e) {
			sa.assertTrue(false);
			logger.error("Entering ClientID FAILED!!!",e);
			sa.assertAll();
		}
		lp.setEmail(emailid);
		logger.info("Entered Email");
		lp.setPassword(password);
		logger.info("Entered Password");

		lp.clickSubmit();
		logger.info("Click on Submit");

		Thread.sleep(3000);

		String CurrentUrl = driver.getCurrentUrl();

		try {

			if (CurrentUrl.contains("pre-dashboard")) {
				sa.assertTrue(true);
				logger.info(" Login Test PASS");
			}
		} catch (Exception e) {

			sa.assertTrue(false);
			logger.error("Login Test FAIL",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		driver.navigate().back();

		logger.info("==========================SSO Login Scenario Started=============================");
		try {
		lp.CidSSO(clientid);
		logger.info("Entered ClientID");
		}catch(Exception e) {
			sa.assertTrue(false);
			logger.error("Entering ClientID FAILED!!!",e);
			sa.assertAll();
		}
		lp.clickloginSSO();
		logger.info("Click on Login");
		Thread.sleep(4000);
		String Url = driver.getCurrentUrl();
		try {
			if (Url.contains("okta")) {
				sa.assertTrue(true);
				logger.info("SSO Login Test PASS");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			logger.error("SSO Login Test FAIL");
			sa.assertAll();
		}

	}



}
