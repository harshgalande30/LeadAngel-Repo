package com.leadAngel.testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.leadAngel.pageObjects.AdministrationPageObjectModel;
import com.leadAngel.pageObjects.HomePage;

import io.qameta.allure.Description;
import io.qameta.allure.Step;

public class TC_Sanity_PartnerManagement_Administration extends BaseClass{
	private static final Logger Logger = LogManager.getLogger(TC_Sanity_PartnerManagement_Administration.class);

	@Test(description = "Administration_PartnerManagement_Section")
	@Step("Administration_PartnerManagement_Section")
	@Description("Administration_PartnerManagement_Section")
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
			APOM.ClickOnPartnerManagement();
			Logger.info("Click On Partner Management is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Partner Management is Failed",e);
			sa.assertAll();
		}


		Logger.info("*********************************** Create New Partner *************************************");
		Thread.sleep(4500);
		try {
			APOM.ClickOnNewPartnerButton();
			Logger.info("Click On New Partner Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On New Partner Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		String randomStringName="";
		try {
			randomStringName = APOM.generateRandomString(APOM.length);
			driver.findElement(By.xpath("//input[@name='partnername']")).sendKeys(randomStringName);
			Logger.info("Enter PartnerName is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter PartnerName is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		String randomString="";
		try {
			randomString = APOM.generateRandomString(APOM.length);
			driver.findElement(By.xpath("//input[@name='partneradminemailid']")).sendKeys("ganesh+"+randomString+"@leadangel.com");
			Logger.info("Enter Partner Email Id is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Partner Email Id is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.EnterParnerLocation();
			Logger.info("Enter Partner Location is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Partner Location is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.EnterParnerSpeciality();
			Logger.info("Enter Partner Speciality is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Partner Speciality is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.EnterParnerCustomfield1();
			Logger.info("Enter Partner Customfield1 is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Partner Customfield1 is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.EnterParnerCustomfield1notes();
			Logger.info("Enter Partner Customfield1 notes is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Partner Customfield1 notes is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.EnterParnerCustomfield2();
			Logger.info("Enter Partner Customfield2 is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Partner Customfield2 is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.EnterParnerCustomfield2notes();
			Logger.info("Enter Partner Customfield2 notes is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Partner Customfield2 notes is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnViaEmailCheckBox();
			Logger.info("Click On Via Email CheckBox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Via Email CheckBox is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.EnterViaEmail();
			Logger.info("Enter Via Email is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Via Email is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClikcOnAddButtonForNewPartnerPopup();
			Logger.info("Click On Add Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Add Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(500);
		try {
			if (APOM.DisplayedSuccessMessagePartner()==true) {
				Logger.info("Displayed 'New Partner has been Added' message is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed 'New Partner has been Added' message is Failed",e);
			sa.assertAll();
		}	

		Logger.info("*********************************** Edit Operation *************************************");
		Thread.sleep(2500);
		try {
			driver.findElement(By.xpath("//td[contains(@class,'mat-column-PartnerAdminEmailID')]//span[text()='ganesh+"+randomString+"@leadangel.com']//..//..//..//mat-icon[text()='edit']")).click();
			Logger.info("Click On Edit Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Add Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (APOM.DisplayedPartnerNameTextboxIsDisabled()==true) {
				Logger.info("Displayed PartnerName Textbox Is Disabled is Passed");	
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed PartnerName Textbox Is Disabled is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			if (APOM.DisplayedEmailIdTextboxIsDisabled()==true) {
				Logger.info("Displayed EmailId Textbox Is Disabled is Passed");	
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed EmailId Textbox Is Disabled is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnUpdateButtonEditAttribute();
			Logger.info("Click On Update Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Update Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(500);
		try {
			if (APOM.DisplayedSuccessMessagePartner()==true) {
				Logger.info("Displayed 'Partner has been updated successfully' message is Passed");	
			}	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed 'Partner has been updated successfully' message is Failed",e);
			sa.assertAll();
		}
		Logger.info("*********************************** Filter Operation *************************************");
		Thread.sleep(2500);
		String GetPartnerIdText="";
		try {
			GetPartnerIdText = driver.findElement(By.xpath("//td[contains(@class,'mat-column-PartnerAdminEmailID')]//span[text()='ganesh+"+randomString+"@leadangel.com']//..//..//..//td[contains(@class,'mat-column-partnerID')]//span[text()]")).getText();
			Logger.info("Fetch Partner Id Text is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Fetch Partner Id Text is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			driver.findElement(By.xpath("//input[@placeholder='Filter']")).sendKeys(GetPartnerIdText);
			Logger.info("Enter Partner Id in filter box is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Partner Id in filter box is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);

		try {
			boolean PartnerIdIsDisplayed = driver.findElement(By.xpath("//td[contains(@class,'mat-column-partnerID')]//span[text()='"+GetPartnerIdText+"']")).isDisplayed();
			if (PartnerIdIsDisplayed==true) {
				Logger.info("The partner ID entered in the filter box is displayed in the console is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("The partner ID entered in the filter box is displayed in the console is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClearFilterBox();
			Logger.info("Clear Filter Box is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clear Filter Box is Failed",e);
			sa.assertAll();
		}

		Logger.info("*********************************** Verification data in Visibility popup *************************************");
		String GetPartnaerNameText="";
		String GetPartnerAdminEmailIDText="";
		String GetLocationText="";
		String GetSpecialityText="";
		Thread.sleep(3000);
		try {
			GetPartnaerNameText = driver.findElement(By.xpath("//td[contains(@class,'mat-column-PartnerAdminEmailID')]//span[text()='ganesh+"+randomString+"@leadangel.com']//..//..//..//td[contains(@class,'mat-column-partnerName')]//span[text()]")).getText();
			Logger.info("Fetch Partner Name from console is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Fetch Partner Name from console is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			GetPartnerAdminEmailIDText = driver.findElement(By.xpath("//td[contains(@class,'mat-column-PartnerAdminEmailID')]//span[text()='ganesh+"+randomString+"@leadangel.com']//..//..//..//td[contains(@class,'mat-column-PartnerAdminEmailID')]//span[text()]")).getText();
			Logger.info("Fetch Partner Admin EmailID from console is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Fetch Partner Admin EmailID Text from console is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			GetLocationText = driver.findElement(By.xpath("//td[contains(@class,'mat-column-PartnerAdminEmailID')]//span[text()='ganesh+"+randomString+"@leadangel.com']//..//..//..//td[contains(@class,'mat-column-Location')]//span[text()]")).getText();
			Logger.info("Fetch Location from console is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Fetch Location from console is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			GetSpecialityText = driver.findElement(By.xpath("//td[contains(@class,'mat-column-PartnerAdminEmailID')]//span[text()='ganesh+"+randomString+"@leadangel.com']//..//..//..//td[contains(@class,'mat-column-Speciality')]//span[text()]")).getText();
			Logger.info("Fetch Speciality from console is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Fetch Speciality from console is Failed",e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		try {
			driver.findElement(By.xpath("//td[contains(@class,'mat-column-PartnerAdminEmailID')]//span[text()='ganesh+"+randomString+"@leadangel.com']//..//..//..//mat-icon[text()='visibility']")).click();
			Logger.info("Click On Visibility Icon is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Visibility Icon is Failed",e);
			sa.assertAll();
		}

		Thread.sleep(3500);
		try {
			boolean PartnaerName=driver.findElement(By.xpath("//label[text()='Partner Name']//..//label[text()='"+GetPartnaerNameText+"']")).isDisplayed();
			if (PartnaerName==true) {
				Logger.info("Partner Name Is Displayed In The Visibility Popup As Similar To Console Output is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Partner Name Is Displayed In The Visibility Popup As Similar To Console Output is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2000);
		try {
			Logger.info("'"+GetPartnerAdminEmailIDText+"'");
			boolean PartnerAdminEmailID=driver.findElement(By.xpath("//label[text()='Partner Admin Email Id']//..//label[text()='"+GetPartnerAdminEmailIDText+"']")).isDisplayed();
			if (PartnerAdminEmailID==true) {
				Logger.info("Partner Admin Email Id Is Displayed In The Visibility Popup As Similar To Console Output is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Partner Admin Email Id Is Displayed In The Visibility Popup As Similar To Console Output is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			boolean Location=driver.findElement(By.xpath("//label[text()='Location']//..//label[text()='"+GetLocationText+"']")).isDisplayed();
			if (Location==true) {
				Logger.info("Location Is Displayed In The Visibility Popup As Similar To Console Output is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Location Is Displayed In The Visibility Popup As Similar To Console Output is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			boolean Speciality=driver.findElement(By.xpath("//label[text()='Speciality']//..//label[text()='"+GetSpecialityText+"']")).isDisplayed();
			if (Speciality==true) {
				Logger.info("Speciality Is Displayed In The Visibility Popup As Similar To Console Output is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Speciality Is Displayed In The Visibility Popup As Similar To Console Output is Failed",e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		try {
			APOM.ClickOnCloseButton();
			Logger.info("Click On Close Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Close Button is Failed",e);
			sa.assertAll();
		}


		Logger.info("*********************************** Use Partner Management Object In User & Access *************************************");		
		Thread.sleep(3500);
		try {
			APOM.ClickOnUserAndAcces();
			Logger.info("Click on User And Acces is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on User And Acces is Failed",e);
			sa.assertAll();
		}

		Logger.info("************************ Delete If Already AutomationTest User Role Is Present *************************");
		Thread.sleep(2500);
		if (APOM.DisplayedAlreadyAutomationTestUserRoleIsPresent()==true) {
			Logger.info("Displayed Already AutomationTest User Role Is Present");
			Thread.sleep(2500);
			try {
				APOM.ClickOnDeleteButtonForUserAndAccess();
				Logger.info("Click On Delete Button For UserAndAccess is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Delete Button For UserAndAccess is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnDeleteButtonForRecaptchaConfirmationPopup();
				Logger.info("Click On Delete Button For Confirmation Popup is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Delete Button For Confirmation Popup is Failed",e);
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
		} else {
			sa.assertTrue(true);
		}

		Logger.info("******************************** Create New User Role *************************************");
		Thread.sleep(2500);
		try {
			APOM.ClickOnAddButtonForUserAndAccess();
			Logger.info("Click On AddButton is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On AddButton is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnDropdownForRole();
			Logger.info("Click On Dropdown For Role is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Dropdown For Role is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.SelectPartnerAdminAsARole();
			Logger.info("Select Partner Admin As a Role is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Partner Admin As a Role is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.SelectPartnerIdDropdown();
			Logger.info("Select PartnerId Dropdown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select PartnerId Dropdown is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			driver.findElement(By.xpath("//mat-option//span[contains(text(),'"+randomStringName+"')]")).click();
			Logger.info("Select PartnerId option is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select PartnerId option is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.EnterFirstName();
			Logger.info("Enter First Name is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter First Name is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.EnterLastName();
			Logger.info("Enter Last Name is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Last Name is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.EnterEmailId();
			Logger.info("Enter Email Id is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Email Id is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnSaveButtonForHoliday();
			Logger.info("Click On Save Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(500);
		try {
			if (APOM.DisplayedSuccessMessageCopied()==true) {
				Logger.info("Displayed 'New user has been added successfully' message is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed 'New user has been added successfully' message is Failed",e);
			sa.assertAll();
		}

		Logger.info("************************ Go back to Partner Management *************************");
		Thread.sleep(2500);
		try {
			APOM.ClickOnPartnerManagement();
			Logger.info("Click On Partner Management is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Partner Management is Failed",e);
			sa.assertAll();
		}

		Logger.info("*********************************** Delete Operation after Used *************************************");
		Thread.sleep(2500);
		try {
			driver.findElement(By.xpath("//td[contains(@class,'mat-column-PartnerAdminEmailID')]//span[text()='ganesh+"+randomString+"@leadangel.com']//..//..//..//mat-icon[text()='delete']")).click();
			Logger.info("Click On Delete Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnDeleteAgainForCompanyPreference();
			Logger.info("Click again Delete Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click again Delete Button is Failed",e);
			sa.assertAll();
		}

		Thread.sleep(700);
		try {
			if (APOM.DisplayedCannotDeleteErrorMessagePartner()==true) {
				Logger.info("Displayed 'Can not delete Partner,It is used' Error Message is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed 'Can not delete Partner,It is used' Error Message is Failed",e);
			sa.assertAll();
		}	


		Logger.info("*********************************** UnUsed Recaptcha in Forms and Perform delete Operation************************************");
		Thread.sleep(2500);
		try {
			APOM.ClickOnUserAndAcces();
			Logger.info("Click on User And Acces is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on User And Acces is Failed",e);
			sa.assertAll();
		}
		Logger.info("************************************** Delete Operation *************************************");
		Thread.sleep(2500);
		try {
			APOM.ClickOnDeleteButtonForUserAndAccess();
			Logger.info("Click On Delete Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnDeleteAgainForCompanyPreference();
			Logger.info("Click On Delete Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(500);
		try {
			if (APOM.DisplayedSuccessMessageCopied()==true) {
				Logger.info("Displayed 'Deleted successfully' message is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed 'Deleted successfully' message is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);

		Logger.info("************************ Go back to Partner Management *************************");
		Thread.sleep(2500);
		try {
			APOM.ClickOnPartnerManagement();
			Logger.info("Click On Partner Management is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Partner Management is Failed",e);
			sa.assertAll();
		}

		Logger.info("*********************************** Delete Operation after Used *************************************");
		Thread.sleep(3500);
		try {
			driver.findElement(By.xpath("//td[contains(@class,'mat-column-PartnerAdminEmailID')]//span[text()='ganesh+"+randomString+"@leadangel.com']//..//..//..//mat-icon[text()='delete']")).click();
			Logger.info("Click On Delete Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnDeleteAgainForCompanyPreference();
			Logger.info("Click again Delete Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click again Delete Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(500);
		try {
			if (APOM.DisplayedSuccessMessagePartner()==true) {
				Logger.info("Displayed 'Partner has been deleted successfully' message is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed 'Partner has been deleted successfully' message is Failed",e);
			sa.assertAll();
		}	
	}
}
