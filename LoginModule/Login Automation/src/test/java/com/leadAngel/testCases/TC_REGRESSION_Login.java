package com.leadAngel.testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.io.IOException;
import com.leadAngel.pageObjects.LoginPage;
import io.qameta.allure.Step;

@Listeners({ com.leadAngel.utilities.TestAllureListener.class })
public class TC_REGRESSION_Login extends BaseClass {
	private static final Logger Logger = LogManager.getLogger(TC_REGRESSION_Login.class);
	@Step()
	@Test(description = "All Negative & Positive Scenario of SSO, Forgot Password & Login Section")
	public void RegressionloginTest() throws InterruptedException, IOException {

		LoginPage lp = new LoginPage(driver);
		SoftAssert sa = new SoftAssert();


		Thread.sleep(4500);
		driver.get(baseURL);
	
		Logger.info("URL is Opened");
		Logger.info("================Not Configured ClientID in SSO-Scenario Started=================");
		Thread.sleep(3500);
		try {
			lp.CidSSO(clientidNsso);
			Logger.info("Entered Not Configured ClientID in SSO");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Entered Not Configured ClientID in SSO FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		lp.clickloginSSO();
		Logger.info("Click on Loginbtn in SSO");

		Boolean DEFP = lp.DisplayErrorForgotPassword(true);
		try {

			if (DEFP == true) {
				Logger.info("Incorrect Client ID in SSO- Test PASS");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Incorrect Client ID in SSO- Test FAIL",e);
			sa.assertAll();
		}


		Logger.info("============================Incorrect ClientID in Login Scenario Started===========================");
		driver.get(baseURL);
		try {
			lp.setClientId(Wclientid);
			Logger.info("Entered Wrong ClientID in Login");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("IEntered Wrong ClientID in Login FAILED",e);
			sa.assertAll();
		}
		lp.setEmail(emailid);
		Logger.info("Entered Correct Email in Login");
		lp.setPassword(password);
		Logger.info("Entered Correct Password in Login");

		lp.clickSubmit();
		Logger.info("Clicked on Submitbtn");

		try {

			if (lp.DisplayErrorLogin(true)) {
				sa.assertTrue(true);
				Logger.info("Incorrect Client ID in Login Test PASS");

			}
		} catch (Exception e) {
			//	captureScreen(driver, "Incorrect Client ID in Login Test FAIL");
			Logger.error("Incorrect Client ID in Login Test FAIL",e);
			sa.assertTrue(false);
			sa.assertAll();
		}

		driver.get(baseURL);
		Logger.info("=============================Incorrect Email in Login Scenario Started============================");
		 Thread.sleep(2500);
		try {
			lp.setClientId(clientid);
			Logger.info("Entered Correct ClientID in Login");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Entered Correct ClientID in Login FAILED!!",e);
			sa.assertAll();
		}
		lp.setEmail(Wemailid);
		Logger.info("Entered Wrong Email in Login");
		lp.setPassword(password);
		Logger.info("Entered Correct Password in Login");
        Thread.sleep(2500);
		lp.clickSubmit();
		Logger.info("Clicked on Submitbtn");
		// Thread.sleep(3000);
		try {

			if (lp.DisplayErrorLogin(true)) {
				sa.assertTrue(true);
				Logger.info("Incorrect Email ID in Login Test PASS");

			}
		} catch (Exception e) {
			Logger.error("Incorrect Email ID in Login Test FAIL",e);
			sa.assertTrue(false);
			sa.assertAll();
		}

		driver.get(baseURL);
		Logger.info("==========================Incorrect Password in Login Scenario Started=======================================");
		 Thread.sleep(2500);
		try {
			lp.setClientId(clientid);
			Logger.info("Entered Correct ClientID in Login");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Entered Correct ClientID in Login FAILED!!",e);
			sa.assertAll();
		}
		lp.setEmail(emailid);
		Logger.info("Entered  Correct Email in Login");
		lp.setPassword(Wpassword);
		Logger.info("Entered Wrong Password in Login");

		lp.clickSubmit();
		Logger.info("Clicked on Submitbtn");
		try {

			if (lp.DisplayErrorLogin(true)) {
				sa.assertTrue(true);
				Logger.info("Incorrect Password  in Login Test PASS");

			}
		} catch (Exception e) {
			Logger.error("Incorrect Password in Login Test FAIL",e);
			sa.assertTrue(false);
			sa.assertAll();
		}
		Logger.info("***************************** Login scenario for Incurrect ClientId, Currect emailID,Incurrect Password ****************************");
		try {
			lp.setClientId(Wclientid);
			Logger.info("Entered Wrong ClientID in Login");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Entered Wrong ClientID in Login is FAILED",e);
			sa.assertAll();
		}

		try {
			lp.setEmail(emailid);
			Logger.info("Entered currect EmailID in Login");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Entered Correct EmailID in Login is FAILED!!",e);
			sa.assertAll();
		}

		try {
			lp.setPassword(Wpassword);
			Logger.info("Entered Wrong Password in Login");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Entered inCorrect password in Login is FAILED!!",e);
			sa.assertAll();
		}
		lp.clickSubmit();
		Logger.info("Clicked on Submitbtn");

		try {

			if (lp.DisplayErrorLogin(true)) {
				sa.assertTrue(true);
				Logger.info("Incurrect ClientId, Currect emailID,Incurrect Password in Login Test is PASS");

			}
		} catch (Exception e) {
			Logger.error("Incurrect ClientId, Currect emailID,Incurrect Password in Login Test is FAILED",e);
			sa.assertTrue(false);
			sa.assertAll();
		}

		Logger.info("***************************** Login scenario for Incurrect ClientId ,Incurrect emailID,Incurrect Password  ****************************");

		try {
			lp.setClientId(Wclientid);
			Logger.info("Entered Wrong ClientID in Login");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Entered Wrong ClientID in Login is FAILED",e);
			sa.assertAll();
		}

		try {
			lp.setEmail(Wemailid);
			Logger.info("Entered Incurrect EmailID in Login");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Entered Incorrect EmailID in Login is FAILED!!",e);
			sa.assertAll();
		}

		try {
			lp.setPassword(Wpassword);
			Logger.info("Entered Wrong Password in Login");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Entered inCorrect password in Login is FAILED!!",e);
			sa.assertAll();
		}

		lp.clickSubmit();
		Logger.info("Clicked on Submitbtn");

		try {

			if (lp.DisplayErrorLogin(true)) {
				sa.assertTrue(true);
				Logger.info("Incurrect ClientId ,Incurrect emailID,Incurrect Password in Login Test is PASS");

			}
		} catch (Exception e) {
			Logger.error("Incurrect ClientId ,Incurrect emailID,Incurrect Password in Login Test is FAILED",e);
			sa.assertTrue(false);
			sa.assertAll();
		}

		Logger.info("***************************** Login scenario for Incurrect ClientId ,Incurrect emailID,Currect Password  ****************************");

		try {
			lp.setClientId(Wclientid);
			Logger.info("Entered Wrong ClientID in Login");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Entered Wrong ClientID in Login is FAILED",e);
			sa.assertAll();
		}
		Thread.sleep(2800);
		try {
			lp.setEmail(Wemailid);
			Logger.info("Entered Incurrect EmailID in Login");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Entered Incorrect EmailID in Login is FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(2800);
		try {
			lp.setPassword(password);
			Logger.info("Entered Currect Password in Login");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Entered Correct password in Login is FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(2800);
		lp.clickSubmit();
		Logger.info("Clicked on Submitbtn");
		Thread.sleep(150);

		try {

			if (lp.DisplayErrorLogin(true)) {
				sa.assertTrue(true);
				Logger.info("Incurrect ClientId ,Incurrect emailID,Currect Password in Login Test is PASS");

			}
		} catch (Exception e) {
			Logger.error("Incurrect ClientId ,Incurrect emailID,Currect Password in Login Test is FAILED",e);
			sa.assertTrue(false);
			sa.assertAll();
		}

		Logger.info("***************************** Login scenario for Currect ClientId ,Incurrect emailID,Inurrect Password  ****************************");
		Thread.sleep(2800);
		try {
			lp.setClientId(clientid);
			Logger.info("Entered Currect ClientID in Login");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Entered Currect ClientID in Login is FAILED",e);
			sa.assertAll();
		}

		try {
			lp.setEmail(Wemailid);
			Logger.info("Entered Incurrect EmailID in Login");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Entered Incorrect EmailID in Login is FAILED!!",e);
			sa.assertAll();
		}

		try {
			lp.setPassword(Wpassword);
			Logger.info("Entered Wrong Password in Login");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Entered inCorrect password in Login is FAILED!!",e);
			sa.assertAll();
		}

		lp.clickSubmit();
		Logger.info("Clicked on Submitbtn");

		try {

			if (lp.DisplayErrorLogin(true)) {
				sa.assertTrue(true);
				Logger.info("Currect ClientId ,Incurrect emailID,Inurrect Password in Login Test is PASS");

			}
		} catch (Exception e) {
			Logger.error("Currect ClientId ,Incurrect emailID,Inurrect Password in Login Test is FAILED",e);
			sa.assertTrue(false);
			sa.assertAll();
		}
		Logger.info("=======================Incorrect ClientID in ForgotPassword Scenario Started====================================");
		Thread.sleep(1500);
		try {
			lp.ClickForgotButton();
			Logger.info("Click in ForgotPasswordButton");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click in ForgotPasswordButton FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		lp.CidForgotPassword(Wclientid);
		Logger.info("Entered Incorrect ClientId in Forgot Password");
		Thread.sleep(1500);
		lp.EmailForgotPassword(emailid);
		Logger.info(" Entered Correct EmailId in Forgot Password");
		Thread.sleep(1500);
		lp.clickRequestPassword();
		Logger.info("Clicked in Forgot Password Button");

		try {

			if (lp.DisplayErrorForgotPassword2(true)) {
				Logger.info("Incorrect ClientID in ForgotPassword Login Test PASS");
				sa.assertTrue(true);

			}
		} catch (Exception e) {
			Logger.error("Incorrect ClientID in ForgotPassword Login Test FAIL",e);
			sa.assertTrue(false);
			sa.assertAll();
		}

		Logger.info("===========================================Incorrect Email in ForgotPassword Scenario Started=====================================");
		Thread.sleep(1500);
		lp.ClickForgotButton();
		Thread.sleep(1500);
		lp.CidForgotPassword(clientid);
		Logger.info(" Entered Correct ClientId in Forgot Password");

		lp.EmailForgotPassword(Wemailid);
		Logger.info(" Entered Incorrect EmailId in Forgot Password");

		lp.clickRequestPassword();
		Logger.info("Clicked in Forgot Password Button");

		try {

			if (lp.DisplayErrorForgotPassword2(true)) {
				Logger.info("Incorrect Email in ForgotPassword Login Test PASS");

			}
		} catch (Exception e) {

			//	captureScreen(driver, "Incorrect Email in ForgotPassword Login Test FAIL");
			Logger.error("Incorrect Email in ForgotPassword Login Test FAIL",e);
			sa.assertTrue(false);
			sa.assertAll();
		}

		Logger.info("***************************** ForgotPasswordLink scenario for Clicking RequestPasswordResetLink button using incurrect ClientId ,InCurrect emailID ****************************");

		Thread.sleep(1500);
		try {
			lp.ClickForgotButton();
			Logger.info("Click in ForgotPasswordButton");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click in ForgotPasswordButton is FAILED!!!",e);
			sa.assertAll();
		}


		try {
			lp.CidForgotPassword(Wclientid);
			Logger.info("Entered Wrong ClientID in Login");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Entered Wrong ClientID in Login is FAILED",e);
			sa.assertAll();
		}

		try {
			lp.EmailForgotPassword(Wemailid);
			Logger.info("Entered Incurrect EmailID in Login");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Entered Incorrect EmailID in Login is FAILED!!",e);
			sa.assertAll();
		}


		try {
			lp.clickRequestPassword();
			Logger.info("Clicked on RequestPassword Button");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on RequestPassword Button is FAILED!!",e);
			sa.assertAll();
		}
		Logger.info("***************************** ForgotPasswordLink scenario for click forgot password Cancel button whenever we click forgot password link ****************************");
		Thread.sleep(2000);
		try {
			lp.ClickForgotButton();
			Logger.info("Click in ForgotPasswordButton");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click in ForgotPasswordButton is FAILED!!!",e);
			sa.assertAll();
		}

		try {
			lp.clickCancelForgotPassword();
			Logger.info("Clicked CancelForgotPasswordButton");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click in CancelForgotPasswordButton is FAILED!!!",e);
			sa.assertAll();
		}


		driver.get(baseURL);

		Logger.info("==============POSITIVE Scenario Start================");

		Logger.info("ForgotPassword scenario Started");
		try {
			lp.ClickForgotButton();
			Logger.info("Click in ForgotPasswordButton");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click in ForgotPasswordButton FAILED!!!",e);
			sa.assertAll();
		}
		lp.CidForgotPassword(clientid);
		Thread.sleep(500);
		lp.EmailForgotPassword(emailid);
		Thread.sleep(700);
		lp.clickRequestPassword();


		//		if (lp.DisplayForgotPasswordCenternotify(true)) {
		//			try { 
		//				sa.assertTrue(true);
		//				Logger.info("DisplayForgotPasswordCenternotify is PASS");
		//
		//			} catch (Exception e) {
		//				sa.assertTrue(false);
		//				Logger.error("DisplayForgotPasswordCenternotify is FAIL" ,e);
		//				sa.assertAll();
		//			}
		//		}
		//		else {
		//			lp.DisplaySuccessForgotPassword(true);
		//			try { 
		//				sa.assertTrue(true);
		//				Logger.info("DisplaySuccessForgotPassword is PASS");
		//
		//			} catch (Exception e) {
		//				sa.assertTrue(false);
		//				Logger.error("DisplaySuccessForgotPassword is FAIL" ,e);
		//				sa.assertAll();
		//			}
		//		}


		Thread.sleep(1500);
		Logger.info("Login via cid,email,password Started");
		lp.setClientId(clientid);
		Logger.info("Entered ClientID");
		lp.setEmail(emailid);
		Logger.info("Entered Email");
		lp.setPassword(password);
		Logger.info("Entered Password");

		lp.clickSubmit();
		Logger.info("Click on Submitbtn");

		Thread.sleep(1000);

		String CurrentUrl = driver.getCurrentUrl();

		try {

			if (CurrentUrl.contains("pre-dashboard")) {
				sa.assertTrue(true);
				Logger.info(" Login Test PASS");
			}
		} catch (Exception e) {
			Logger.error(" Login Test FAIL",e);
			sa.assertTrue(false);
			sa.assertAll();
		}
		Thread.sleep(1000);
		driver.navigate().back();

		Logger.info("=================================SSO Login Scenario Started=====================================");

		try {
			lp.CidSSO(clientid);
			Logger.info("Entered ClientID");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Entered ClientID FAILED!!!",e);
			sa.assertAll();
		}
		lp.clickloginSSO();
		Logger.info("Click on Login");
		Thread.sleep(1000);
		String Url = driver.getCurrentUrl();
		try {
			if (Url.contains("okta")) {
				sa.assertTrue(true);
				Logger.info("SSO Login Test PASS");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("SSO Login Test FAIL",e);
			sa.assertAll();
		}


	}

}
