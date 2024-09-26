package com.leadAngel.testCases;
import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.leadAngel.pageObjects.UserSettings;
import com.leadAngel.utilities.ReadConfig;
@Test
public class TC_Profile_UserSettings extends BaseClass{
	private static final Logger Logger = LogManager.getLogger(TC_Profile_UserSettings.class);

	public void UserSetting() throws InterruptedException, AWTException {
		SoftAssert sa = new SoftAssert();
		UserSettings US = new UserSettings(driver);
		ReadConfig readconfig = new ReadConfig(); 
		String password = readconfig.getPassword();
		String emailid = readconfig.getEmail();
		String clientid = readconfig.getClientid();

		Logger.info("***************************************** Displayed HomePage *******************************************");
		Thread.sleep(3500);
		try {
			US.ClickOnUserSettingsModule();
			Logger.info("Click On User Settings Module is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On User Settings Module is Failed!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			US.ClickOnPreferenceDropdown();
			Logger.info("Click On Preference Dropdown is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Preference Dropdown is Failed!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			US.ClickOnProfileFeature();
			Logger.info("Click On Profile Feature is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Profile Feature is Failed!!",e);
			sa.assertAll();
		}

		Logger.info("***************************************** Upload Profile Picture Operation *******************************************");
		Thread.sleep(2500);
		if (US.DisplayedUploadButton()==true) {
			Thread.sleep(2500);
			try {
				US.ClickOnUploadButton();
				Logger.info("Click On Upload Button is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Upload Button is Failed!!",e);
				sa.assertAll();
			}
			Thread.sleep(3500);
			try {
				Robot rb= new Robot();
				StringSelection str= new StringSelection("C:\\LeadAngelLogo\\LA.png");
				//Here robot class is copy the file location which we need to upload
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
				Logger.error("Copied the file location which we need to upload");
				//Then we need to paste the location on upload file tab
				Thread.sleep(2500);
				rb.keyPress(KeyEvent.VK_CONTROL);
				rb.keyPress(KeyEvent.VK_V);
				rb.keyRelease(KeyEvent.VK_CONTROL);
				rb.keyRelease(KeyEvent.VK_V);
				Logger.error("Copy paste the file location on upload file tab");
				Thread.sleep(2500);
				rb.keyPress(KeyEvent.VK_ENTER);
				rb.keyRelease(KeyEvent.VK_ENTER);
				Logger.error("Click on Open button");
			} catch (HeadlessException e) {
				sa.assertTrue(false);
				Logger.error("Getting Error while uploading profile picture",e);
				sa.assertAll();
			} 
			Thread.sleep(3000);
			try {
				US.ClickOnAgainUploadButtonForChangeforUpload();
				Logger.info("Click On again upload Button is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On again upload Button is Failed!!",e);
				sa.assertAll();
			}
		}
		else if (US.DisplayedChangeButton()==true) {
			try {
				US.ClickOnChangeButton();
				Logger.info("Click On Change Button is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Change Button is Failed!!",e);
				sa.assertAll();
			}
			Thread.sleep(3500);
			try {
				Robot rb= new Robot();
				StringSelection str= new StringSelection("C:\\LeadAngelLogo\\LA.png");
				//Here robot class is copy the file location which we need to upload
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
				Logger.error("Copied the file location which we need to upload");
				//Then we need to paste the location on upload file tab
				Thread.sleep(2500);
				rb.keyPress(KeyEvent.VK_CONTROL);
				rb.keyPress(KeyEvent.VK_V);
				rb.keyRelease(KeyEvent.VK_CONTROL);
				rb.keyRelease(KeyEvent.VK_V);
				Logger.error("Copy paste the file location on upload file tab");
				Thread.sleep(2500);
				rb.keyPress(KeyEvent.VK_ENTER);
				rb.keyRelease(KeyEvent.VK_ENTER);
				Logger.error("Click on Open button");
			} catch (HeadlessException e) {
				sa.assertTrue(false);
				Logger.error("Getting Error while uploading profile picture",e);
				sa.assertAll();
			} 
			Thread.sleep(3000);
			try {
				US.ClickOnAgainUploadButtonForChange();
				Logger.info("Click On again upload Button is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On again upload Button is Failed!!",e);
				sa.assertAll();
			}
		}

		Thread.sleep(2000);
		try {
			if (US.DisplayedFileUploadSuccessMessage()==true) {
				Logger.info("Displayed 'File Uploaded Successfully' message is Passed");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed 'File Uploaded Successfully' message is Failed!!",e);
			sa.assertAll();
		}


		Logger.info("*****************Enter Description**********************");
		Thread.sleep(2500);
		try {
			US.EnterDescription();
			Logger.info("Enter Description is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Description is Failed!!",e);
			sa.assertAll();
		}
		Logger.info("*****************Change Password Operation**********************");
		Thread.sleep(2500);
		String Tech4Vyakar="@Tech4Vyakar";
		String Tech4Lead="@Tech4Lead";
		Thread.sleep(2500);
		if (password.contentEquals(Tech4Lead)) {
			Logger.info("Current Password :"+password);
			Thread.sleep(2500);
			try {
				US.ClickOnChangePasswordTab();
				Logger.info("Click On Change Password Tab row is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Change Password Tab row is Failed!!",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				driver.findElement(By.xpath("//input[@formcontrolname='currentpassword']")).clear();
				driver.findElement(By.xpath("//input[@formcontrolname='currentpassword']")).sendKeys(password);
				Logger.info("Enter Current Password is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter Current Password is Failed!!",e);
				sa.assertAll();
			}

			Logger.info("*****************Verifying Last Update Error Message When we change password**********************");
			Thread.sleep(2500);
			try {
				US.EnterNewPassword1();
				Logger.info("Enter New Password is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter New Password is Failed!!",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				US.EnterConfirmedPassword1();
				Logger.info("Enter Confirmed Password is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter Confirmed Password is Failed!!",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				US.ClickOnSaveButton();
				Logger.info("Click On Save Button is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Save Button is Failed!!",e);
				sa.assertAll();
			}
			Thread.sleep(800);
			try {
				if (US.DisplayedChangePasswordErrorMessage()==true) {
					Logger.info("Displayed 'Please verify your current password before proceeding with the password change' Error message is Passed");
				}
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed 'Please verify your current password before proceeding with the password change' Error message is Failed!!",e);
				sa.assertAll();
			}
			Logger.info("************************************** Change Password Operation ***************************************");

			Thread.sleep(2500);
			try {
				US.EnterNewPassword();
				Logger.info("Enter New Password is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter New Password is Failed!!",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				US.EnterConfirmedPassword();
				Logger.info("Enter Confirmed Password is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter Confirmed Password is Failed!!",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				US.ClickOnSaveButton();
				Logger.info("Click On Save Button is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Save Button is Failed!!",e);
				sa.assertAll();
			}
			Thread.sleep(800);
			try {
				if (US.DisplayedChangePasswordSuccessMessage()==true) {
					Logger.info("Displayed 'Your password has been changed successfully' message is Passed");
				}
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed 'Your password has been changed successfully' message is Failed!!",e);
				sa.assertAll();
			}
			Logger.info("Changed Password is :"+Tech4Vyakar);

			Logger.info("***************************************** Remove Profile Picture Operation *******************************************");
			Thread.sleep(2500);
			try {
				US.ClickOnRemoveButton();
				Logger.info("Click On Remove Button is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Remove Button is Failed!!",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				US.ClickOnDeleteButton();
				Logger.info("Click On Delete Button is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Delete Button is Failed!!",e);
				sa.assertAll();
			}
			Thread.sleep(800);
			try {
				if (US.DisplayedRemoveSuccessMessage()==true) {
					Logger.info("Displayed 'File Deleted Successfully' message is Passed");
				}
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed 'File Deleted Successfully' message is Failed!!",e);
				sa.assertAll();
			}
			Logger.info("************************************** Logout and Login Scenario ***************************************");
			Thread.sleep(4500);
			try {
				US.ClickOnProfilePicture();
				Logger.info("Click On Profile Picture is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Profile Picture is Failed!!",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				US.ClickOnLogOutLink();
				Logger.info("Click On LogOut button is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On LogOut button is Failed!!",e);
				sa.assertAll();
			}
			Thread.sleep(5000);
			try {
				driver.findElement(By.xpath("//h1[text()='Login']//..//input[@name='clientID']")).sendKeys(clientid);
				Logger.info("Enter Client ID is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter Client ID is Failed!!",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				driver.findElement(By.xpath("//h1[text()='Login']//..//input[@name='emailId']")).sendKeys(emailid);
				Logger.info("Enter Email is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter Email is Failed!!",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				driver.findElement(By.xpath("//h1[text()='Login']//..//input[@name='password']")).sendKeys(Tech4Vyakar);
				Logger.info("Enter Password is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter Password is Failed!!",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				US.ClickOnLoginButton();
				Logger.info("Click on login button is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on login button is Failed!!",e);
				sa.assertAll();
			}	
		}else if (password.contentEquals(Tech4Vyakar)) {
			Logger.info("Current Password :"+password);
			Thread.sleep(2500);
			try {
				US.ClickOnChangePasswordTab();
				Logger.info("Click On Change Password Tab row is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Change Password Tab row is Failed!!",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				driver.findElement(By.xpath("//input[@formcontrolname='currentpassword']")).sendKeys(password);
				Logger.info("Enter Current Password is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter Current Password is Failed!!",e);
				sa.assertAll();
			}
			Logger.info("*****************Verifying Last Update Error Message When we change password**********************");		
			Thread.sleep(2500);
			try {
				US.EnterNewPassword();
				Logger.info("Enter New Password is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter New Password is Failed!!",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				US.EnterConfirmedPassword();
				Logger.info("Enter Confirmed Password is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter Confirmed Password is Failed!!",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				US.ClickOnSaveButton();
				Logger.info("Click On Save Button is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Save Button is Failed!!",e);
				sa.assertAll();
			}

			Thread.sleep(800);
			try {
				if (US.DisplayedChangePasswordErrorMessage()==true) {
					Logger.info("Displayed 'Please verify your current password before proceeding with the password change' Error message is Passed");
				}
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed 'Please verify your current password before proceeding with the password change' Error message is Failed!!",e);
				sa.assertAll();
			}

			Logger.info("************************************** Change Password Operation ***************************************");
			Thread.sleep(2500);
			try {
				US.EnterNewPassword1();
				Logger.info("Enter New Password is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter New Password is Failed!!",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				US.EnterConfirmedPassword1();
				Logger.info("Enter Confirmed Password is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter Confirmed Password is Failed!!",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				US.ClickOnSaveButton();
				Logger.info("Click On Save Button is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Save Button is Failed!!",e);
				sa.assertAll();
			}
			Thread.sleep(800);
			try {
				if (US.DisplayedChangePasswordSuccessMessage()==true) {
					Logger.info("Displayed 'Your password has been changed successfully' message is Passed");
				}
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed 'Your password has been changed successfully' message is Failed!!",e);
				sa.assertAll();
			}
			Logger.info("Changed Password is :"+Tech4Lead);

			Logger.info("***************************************** Remove Profile Picture Operation *******************************************");
			Thread.sleep(2500);
			try {
				US.ClickOnRemoveButton();
				Logger.info("Click On Remove Button is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Remove Button is Failed!!",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				US.ClickOnDeleteButton();
				Logger.info("Click On Delete Button is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Delete Button is Failed!!",e);
				sa.assertAll();
			}
			Thread.sleep(800);
			try {
				if (US.DisplayedRemoveSuccessMessage()==true) {
					Logger.info("Displayed 'File Deleted Successfully' message is Passed");
				}
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed 'File Deleted Successfully' message is Failed!!",e);
				sa.assertAll();
			}
			Logger.info("************************************** Logout and Login Scenario ***************************************");
			Thread.sleep(4500);
			try {
				US.ClickOnProfilePicture();
				Logger.info("Click On Profile Picture is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Profile Picture is Failed!!",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				US.ClickOnLogOutLink();
				Logger.info("Click On LogOut button is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On LogOut button is Failed!!",e);
				sa.assertAll();
			}
			Thread.sleep(5000);
			try {
				driver.findElement(By.xpath("//h1[text()='Login']//..//input[@name='clientID']")).sendKeys("1002");
				Logger.info("Enter Client ID is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter Client ID is Failed!!",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				driver.findElement(By.xpath("//h1[text()='Login']//..//input[@name='emailId']")).sendKeys("ganesh@leadangel.com");
				Logger.info("Enter Email is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter Email is Failed!!",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				driver.findElement(By.xpath("//h1[text()='Login']//..//input[@name='password']")).sendKeys(Tech4Lead);
				Logger.info("Enter Password is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter Password is Failed!!",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				US.ClickOnLoginButton();
				Logger.info("Click On Login Button is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Login Button is Failed!!",e);
				sa.assertAll();
			}	
		}

		Thread.sleep(5500);
		try {
			US.ClickOnProfilePicture();
			Logger.info("Click On Profile Picture is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Profile Picture is Failed!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			US.ClikconUserProfileLink();
			Logger.info("Click On User Profile link is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On User Profile link is Failed!!",e);
			sa.assertAll();
		}
		Thread.sleep(6500);
		try {
			if (US.DisplayedUserProfilePage()==true) {
				Logger.info("Displayed 'User Profile' page is Passed");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed 'User Profile' page is Failed!!",e);
			sa.assertAll();
		}
		Logger.info("*****************Verifying Status**********************");
		Thread.sleep(2500);
		try {
			if (US.DisplayedActiveStatus()==true) {
				Logger.info("Displayed 'Active' status is Passed");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed 'Active' status is Failed!!",e);
			sa.assertAll();
		}
		Logger.info("*****************Verifying Last Login Date and Time**********************");
		String LastLogindate="";
		Thread.sleep(2500);
		try {
			LastLogindate=driver.findElement(By.xpath("//div[text()='Last Login Date and Time']//..//div[@class='fs-12'][text()]")).getText();
			Logger.info("Get Last Login date is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Get Last Login date is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		if (LastLogindate.contains("Invalid Date")) {
			sa.assertTrue(false);
			Logger.info("Displayed 'Invalid Date' in Last Login Date and Time section");
			Logger.info("Get Last Login date and Time is: "+LastLogindate);
			sa.assertAll();
		}else {
			sa.assertTrue(true);
			Logger.info("Not Displayed 'Invalid Date' in Last Login Date and Time section");
			Logger.info("Get Last Login date and Time is: "+LastLogindate);
		}

		Logger.info("************************************** Send Reset Password Link ***************************************");
		Thread.sleep(3000);
		try {
			US.ClickOnProfilePicture();
			Logger.info("Click On Profile Picture is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Profile Picture is Failed!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			US.ClickOnSendResetPasswordLink();
			Logger.info("Click On Send Reset Password Link is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Send Reset Password Link is Failed!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			US.ClickOnSendLinkButton();
			Logger.info("Click On Send Link Button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Send Link Button is Failed!!",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (US.DisplayedActiveStatus()==true) {
				Logger.info("Displayed 'Active' status is Passed");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed 'Active' status is Failed!!",e);
			sa.assertAll();
		}
	}
}
