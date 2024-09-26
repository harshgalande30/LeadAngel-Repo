package com.leadAngel.testCases;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.leadAngel.pageObjects.AEtoSDR_Page;
import com.leadAngel.pageObjects.AdministrationPageObjectModel;
import com.leadAngel.pageObjects.CRM_Account_FilterPage;
import com.leadAngel.pageObjects.DetailsPage_SalesTeam;
import com.leadAngel.pageObjects.EmailAlertsTemplatesPageObjectModel;
import com.leadAngel.pageObjects.Forms_PageObjectModel;
import com.leadAngel.pageObjects.HomePage;
import com.leadAngel.pageObjects.LeadManagementPage;
import com.leadAngel.pageObjects.LeadRouterPageObjectModel;
import com.leadAngel.pageObjects.LoginPage;
import com.leadAngel.pageObjects.ResponseMappingPageObjectModel;
import com.leadAngel.pageObjects.RoundRobinPage;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
@Listeners({ com.leadAngel.utilities.TestAllureListener.class })
public class TC_CrudOperation_Forms extends BaseClass{	
	private static final Logger Logger = LogManager.getLogger(TC_CrudOperation_Forms.class);

	@Test(description = "Administration_Forms_Section")
	@Step("Administration_Forms_Section")
	@Description("Administration_Forms_Section")
	public void AdministrationTest() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		LeadManagementPage LMP = new LeadManagementPage(driver);
		AdministrationPageObjectModel APOM=new AdministrationPageObjectModel(driver);
		EmailAlertsTemplatesPageObjectModel EATP=new EmailAlertsTemplatesPageObjectModel(driver);
		CRM_Account_FilterPage crm = new CRM_Account_FilterPage(driver);
		AEtoSDR_Page ae = new AEtoSDR_Page(driver);
		LeadRouterPageObjectModel LR=new LeadRouterPageObjectModel(driver);
		RoundRobinPage rrp = new RoundRobinPage(driver);
		DetailsPage_SalesTeam dp=new DetailsPage_SalesTeam(driver);
		ResponseMappingPageObjectModel RM=new ResponseMappingPageObjectModel(driver);
		Forms_PageObjectModel FPOM=new Forms_PageObjectModel(driver);

		Thread.sleep(4200);
		try {
			hp.ClickOnAdministration();
			Logger.info("Click on Administration is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Administration is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			FPOM.ClickOnWebToLeadDropdown();
			Logger.info("Click On WebToLead Dropdown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On WebToLead Dropdown is Failed",e);
			sa.assertAll();
		}

		Logger.info("//===============================CREATE OBJECT SCENARIO START========================================!");
		Thread.sleep(4100);
		try {
			FPOM.ContextClickOnForms();
			Logger.info("Context Click On Forms is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Context Click On Forms is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnNewObject();
			Logger.info("Click On NewOForms is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On NewOForms is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.EnterNameInCrudObject();
			Logger.info("Enter AutoTestObject is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter AutoTestObject is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnSaveButtonCrudObject();
			Logger.info("Click On Save Button is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button is FAILED!!!",e);
			sa.assertAll();
		}


		Thread.sleep(800);
		if(ae.DisplaySameAEerror() == true) {
			Logger.info("Duplicate Object Found, Try to delete the Object NOW!!! then Creating New Object!!");
			Thread.sleep(4000);
			try {
				FPOM.ClickOnFormsDropdown();
				Logger.info("Click On Forms Dropdown is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Forms Dropdown is FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(3500);
			try {
				LMP.ContextClickOnAutoTestObject();           
				Logger.info("RightClick On AutoTestObject is PASSED!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("RightClick On AutoTestObject is Failed!!", e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				LMP.ClickOnDeleteOnClonedAutoTestObject();
				Logger.info("Click On Delete button is Passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Delete button is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(3200);
			try {
				LMP.ClickOnDeletebtn();
				Logger.info("Click Again Delete button is Passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click Again Delete button is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(400);
			try {
				if (APOM.DisplayedCannotDeleteErrorSuccessMessage() == true) 
				{
					Logger.info("Displayed 'Cannot Delete' Error Message");
					Thread.sleep(4500);
					try {
						LMP.ContextClickOnAutoTestObject();           
						Logger.info("RightClick On AutoTestObject is PASSED!!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("RightClick On AutoTestObject is Failed!!", e);
						sa.assertAll();
					}
					Thread.sleep(2500);
					try {
						rrp.ClickOnObjectRename();
						Logger.info("Click on Rename Object is PASSED!!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Click on Rename Object is FAILED!!!", e);
						sa.assertAll();
					}
					Thread.sleep(2500);
					try {
						String randomString = APOM.generateRandomString(APOM.length);
						APOM.InputRename_AutoTestObject.clear();
						APOM.InputRename_AutoTestObject.sendKeys(randomString);
						Logger.info("Enter Rename is Passed!!!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Enter Rename is FAILED!", e);
						sa.assertAll();
					}
					Thread.sleep(2500);
					try {
						rrp.ClickOnRenameBtn();
						Logger.info("Click Rename Button is PASSED!!!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Click Rename Button is FAILED!!!", e);
						sa.assertAll();
					}	
				}
			} catch (Exception e) {
				sa.assertTrue(true);
			}
			Thread.sleep(5500);
			try {
				FPOM.ContextClickOnForms();
				Logger.info("Context Click On Forms is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Context Click On Forms is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnNewObject();
				Logger.info("Click On NewForms is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On NewForms is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(3500);
			try {
				LMP.NameInCrudObject();
				Logger.info("Enter AutoTestObject Name is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter AutoTestObject Name is FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				LMP.clickOnSaveNewObject();
				Logger.info("Click on Save Button is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on Save Button is FAILED!!", e);
				sa.assertAll();
			}
		}
		else {
			sa.assertTrue(true);
		}

		driver.navigate().refresh();
		Logger.info("Refreshing The Page!!");
		Thread.sleep(5000);
		try {
			Thread.sleep(2500);
			if( FPOM.DisplayFormsOverViewPage()==true) {
				Logger.info("Display FormsOverView Page is passed");
				{
					Thread.sleep(2500);
					try {
						FPOM.ClickOnFormsDropDown();
						Logger.info("Click On Forms DropDown is passed");
					}catch(Exception e) {
						sa.assertTrue(false);
						Logger.error("Click On Forms DropDown is FAILED!!", e);
						sa.assertAll();
					}
					Thread.sleep(2500);
					try {
						LMP.ClickOnAutoTestObject();           
						Logger.info("Click On AutoTestObject is PASSED!!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Click On AutoTestObject is FAILED!", e);
						sa.assertAll();
					}
				}
			}
		} catch (Exception e) {
			sa.assertTrue(true);
		}


		Logger.info("===========================================SetUp Page Operation===========================================!");
		String ParentWindow = driver.getWindowHandle();
		Thread.sleep(3500);
		try {
			FPOM.ClickOnSetUpButton();
			Logger.info("Click On SetUp Button is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On SetUp Button is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			dp.ClickOnLeadRouterDropDown();
			Logger.info("Click On LeadRouter DropDown is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On LeadRouter DropDown is FAILED!!!",e);
			sa.assertAll();
		}

		//****************
		Thread.sleep(3000);
		String ObjectNameBeforeClickNewTabLink1 = driver.findElement(By.xpath("(//a[text()=' open_in_new '])[1]//..//span[text()]")).getText();
		Logger.info("Object Name Before Click NewTab Link: "+ObjectNameBeforeClickNewTabLink1);
		Thread.sleep(3000);
		try {
			APOM.ClickOnOpenInNewTabLink();
			Logger.info("Click On Open In New Tab Link is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Open In New Tab Link is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(5500);
		Set<String> Allwindow1 = driver.getWindowHandles();
		Thread.sleep(4000);
		for (String wh : Allwindow1) {
			driver.switchTo().window(wh);
			if (wh.equals(ParentWindow)) {
				continue;
			} else {
				Thread.sleep(4000);
				String ObjectNameAfterClickNewTabLink = driver.findElement(By.xpath("(//i[text()='description']//..//span[text()])[2]")).getText();
				Logger.info("Object Name After Click NewTab Link: "+ObjectNameAfterClickNewTabLink);
				Thread.sleep(4000);
				try {
					if (ObjectNameBeforeClickNewTabLink1.contentEquals(ObjectNameAfterClickNewTabLink)) {
						Logger.info("Open in New tab link is properly redirected is Passed !!");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Open in New tab link is properly redirected is Failed !!", e);
					sa.assertAll();
				}
				driver.close();	
				break;
			}
		}
		Thread.sleep(2500);
		try {
			driver.switchTo().window(ParentWindow);
			Logger.info("Swicth back to parent window is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Swicth back to parent window is Failed !!", e);
			sa.assertAll();
		}
		//****************

		Thread.sleep(2500);
		try {
			FPOM.EnterDefaultCalenderURL();
			Logger.info("Enter Default Calender URL is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Default Calender URL is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			FPOM.EnterThankYouPageURL();
			Logger.info("Enter ThankYouPage URL is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter ThankYouPage URL is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			FPOM.ClickOnCheckBoxForAlwaysRedirectToThankYouPage();
			Logger.info("Click On Radio button For AlwaysRedirectToThankYouPage is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Radio button For AlwaysRedirectToThankYouPage is FAILED!!!",e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		try {
			FPOM.ClickOnCheckBoxForUseTheCalendarLinkOnCRMUsersProfileIfAvailable();
			Logger.info("Click On Radio button For UseTheCalendarLinkOnCRMUsersProfileIfAvailable is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Radio button For UseTheCalendarLinkOnCRMUsersProfileIfAvailable is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			FPOM.ClickOnDropDownForSelectCRmField();
			Logger.info("Click On DropDown For SelectCRmField is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DropDown For SelectCRmField is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			FPOM.ClickOnOptionForSelectCRmField();
			Logger.info("Click On Option For SelectCRmField is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Option For SelectCRmField is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			FPOM.ClickOnCheckBoxForAcceptAllDomains();
			Logger.info("Click On CheckBox For AcceptAllDomains is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CheckBox For AcceptAllDomains is FAILED!!!",e);
			sa.assertAll();
		}
//		Thread.sleep(500);
//		try {
//			if(FPOM.DisplayedAlwaysAcceptAllDomainsCheckboxIsChecked()==true)
//				Logger.info("Displayed AlwaysAcceptAllDomains Checkbox Is Checked");
//		}catch(Exception e) {
//			sa.assertTrue(false);
//			Logger.error("Displayed AlwaysAcceptAllDomains Checkbox Is not Checked",e);
//			sa.assertAll();
//		}
//		Thread.sleep(2500);
//		try {
//			FPOM.ClickOnCheckBoxForUploadToCRM();
//			Logger.info("Click On CheckBox For UploadToCRM is PASSED!!");
//		}catch(Exception e) {
//			sa.assertTrue(false);
//			Logger.error("Click On CheckBox For UploadToCRM is FAILED!!!",e);
//			sa.assertAll();
//		}
		Thread.sleep(500);
		try {
			if(FPOM.DisplayedUploadToCRMCheckboxIsChecked()==true)
				Logger.info("Displayed UploadToCRM Checkbox Is Checked");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed UploadToCRM Checkbox Is not Checked",e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		try {
			FPOM.ClickOnSaveButtonForSetUpPage();
			Logger.info("Click On Save Button For SetUpPage is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button For SetUpPage is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			dp.DislaySuccessMessage();
			Logger.info("Dislayed Success Message is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Dislayed Success Message is FAILED!!!",e);
			sa.assertAll();
		}
		Logger.info("===========================================Web To Lead Form Operation===========================================!");
		Thread.sleep(3500);
		try {
			dp.ClickOnWebToLead();
			Logger.info("Click On WebToLeadForm is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On WebToLeadForm is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			FPOM.SelectFieldnameOption1();
			Logger.info("Click on SelectFieldName Option1 is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on SelectFieldName Option1 is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			FPOM.SelectFieldnameOption2();
			Logger.info("Click on SelectFieldName Option2 is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on SelectFieldName Option2 is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			FPOM.SelectFieldnameOption3();
			Logger.info("Click on SelectFieldName Option3 is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on SelectFieldName Option3 is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			FPOM.ClickOnArrowButton();
			Logger.info("Click On Arrow Button is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Arrow Button is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			FPOM.ClickOnCheckBoxIncludeAvailableDate();
			Logger.info("Click On CheckBox IncludeAvailableDate is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CheckBox IncludeAvailableDate is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(500);
		try {
			if(FPOM.DisplayedIncludeAvailableDateTimeCheckboxIsChecked()==true)
				Logger.info("Displayed IncludeAvailableDate/Time Checkbox Is Checked");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed IncludeAvailableDate/Time Checkbox Is not Checked",e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		try {
			FPOM.ClickOnCheckBoxAssignmentRollback();
			Logger.info("Click On CheckBox AssignmentRollback is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CheckBox AssignmentRollback is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			FPOM.SelectRollbackTime();
			Logger.info("Select RollbackTime is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select RollbackTime is FAILED!!!",e);
			sa.assertAll();
		}
		Logger.info("********************* Re-Captcha operation *********************");
		Thread.sleep(2500);
		try {
			FPOM.ClickOnCheckBoxIncludeReCaptcha();
			Logger.info("Click On CheckBox IncludeReCaptcha is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CheckBox IncludeReCaptcha is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			FPOM.ClickOnDropDownReCaptcha();
			Logger.info("Click On DropDown ReCaptcha is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DropDown ReCaptcha is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			FPOM.SelectReacaptchaOption();
			Logger.info("Select Reacaptcha Option is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Reacaptcha Option is FAILED!!!",e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		try {
			FPOM.ClickOnAddMoreReccaptchaKeyNameLink();
			Logger.info("Click On AddMoreReccaptchaKeyName Link is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On AddMoreReccaptchaKeyName Link is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			String randomString = FPOM.generateRandomString(FPOM.length);
			FPOM.EnterRecaptchaKeyName.clear();
			FPOM.EnterRecaptchaKeyName.sendKeys(randomString);
			Logger.info("Enter Key Name is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Key Name is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			FPOM.EnterSiteKey();
			Logger.info("Enter SiteKey is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter SiteKey is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			FPOM.EnterSecurityKey();
			Logger.info("Enter SecurityKey is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter SecurityKey is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			FPOM.ClickOnAddbutton();
			Logger.info("Click On Addbutton is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Addbutton is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(450);
		try {
			if(FPOM.DisplayedNewRecaptchaIncertedSuccessfullyMessage()==true)
				Logger.info("Displayed NewRecaptchaIncertedSuccessfully Message is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed NewRecaptchaIncertedSuccessfully Message is FAILED!!!",e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		try {
			FPOM.ClickOnGenerateButton();
			Logger.info("Click On Generate Button is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Generate Button is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			FPOM.ClickOnCopyButton();
			Logger.info("Click On Copy Button is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Copy Button is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(150);
		try {
			FPOM.DislayCodeCopiedSuccessfullyMessage();
			Logger.info("Dislay CodeCopied Successfully Message is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Dislay CodeCopied Successfully Message is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			FPOM.ClickOnCloseButton();
			Logger.info("Click On Close Button is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Close Button is FAILED!!!",e);
			sa.assertAll();
		}
		Logger.info("===========================================DetailsPage Operation===========================================!");
		Thread.sleep(4500);
		try {
			FPOM.ClickOnDetailButton();
			Logger.info("Click On details button is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On details button is FAILED",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			FPOM.ClickOnEditButtonForDescription();
			Logger.info("Click On Edit Button For Description is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Edit Button For Description is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			FPOM.EditDescription();
			Logger.info("Edit Description is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Edit Description is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			FPOM.ClickkOnSaveButtonForDescription();
			Logger.info("Click On Save Button For Description is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button For Description is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(4000);
		try {
			APOM.ClickOnCopyButton();
			Logger.info("Click On Copy Button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Copy Button  is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(500);
		try {
			if (APOM.DisplayedCopyMessage()==true) {
				Logger.info("Displayed 'Id copied to clipboard' message is Passed");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed 'Id copied to clipboard' message is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		if (FPOM.GettextLastUpdated().contains("Undefined")) {
			sa.assertTrue(false);
			Logger.error("'"+FPOM.GettextLastUpdated()+"' is Showing for Last Updated On");
			sa.assertAll();
		}
		else {
			sa.assertTrue(true);
			Logger.info("Not showing 'Undefined' for Last Updated");
			sa.assertAll();	
		}
		Thread.sleep(2500);
		if (FPOM.GettextLastUpdatedBy().contains("Undefined")) {
			sa.assertTrue(false);
			Logger.error("'"+FPOM.GettextLastUpdatedBy()+"' is Showing for Last Updated By");
			sa.assertAll();
		}
		else {
			sa.assertTrue(true);
			Logger.info("Not showing 'Undefined' for Last Updated By");
			sa.assertAll();	
		}


		Logger.info("====================================================Crud operation==================================================================");
		Logger.info("====================================================Rename Scenario==================================================================");
		Thread.sleep(4000);
		try {
			LMP.ContextClickOnAutoTestObject();       
			Logger.info("Right Click On AutoTestObject is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On AutoTestObject is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			rrp.ClickOnObjectRename();
			Logger.info("Click on Rename option is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Rename option is FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.InputOnRenameAutoTestObject();
			Logger.info("Enter Rename is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Rename is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			rrp.ClickOnRenameBtn();
			Logger.info("Click Rename Button is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Rename Button is FAILED!!!", e);
			sa.assertAll();
		}	

		Thread.sleep(2500);
		if(ae.DisplaySameAEerror() == true) {
			Logger.info("Duplicate Object Found, Deleting Object NOW!!! then Creating New Object!!");
			Thread.sleep(3500);
			try {
				LMP.ContextClickOnRenameAutoTestObject();
				Logger.info("Right Click On RenamedAutoTestObject is PASSED!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Right Click On RenamedAutoTestObject is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				LMP.ClickOnDeleteOnClonedAutoTestObject();
				Logger.info("Click On Delete Button is Passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Delete Button is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				LMP.ClickOnDeletebtn();
				Logger.info("Click again Delete Button is Passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click again Delete Button is FAILED!", e);
				sa.assertAll();
			}	

			Thread.sleep(400);
			try {
				if (APOM.DisplayedCannotDeleteErrorSuccessMessage() == true) 
				{
					Logger.info("Displayed 'Cannot Delete' Error Message");
					Thread.sleep(4000);
					try {
						LMP.ContextClickOnRenameAutoTestObject();
						Logger.info("Right Click On RenamedAutoTestObject is PASSED!!!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Right Click On RenamedAutoTestObject is FAILED!", e);
						sa.assertAll();
					}
					Thread.sleep(2500);
					try {
						rrp.ClickOnObjectRename();
						Logger.info("Click on Rename option is PASSED!!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Click on Rename option is FAILED!!!", e);
						sa.assertAll();
					}
					Thread.sleep(2500);
					try {
						String randomString = APOM.generateRandomString(APOM.length);
						APOM.InputRename_AutoTestObject.clear();
						APOM.InputRename_AutoTestObject.sendKeys(randomString);
						Logger.info("Enter Rename is Passed!!!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Enter Rename is FAILED!", e);
						sa.assertAll();
					}
					Thread.sleep(2500);
					try {
						rrp.ClickOnRenameBtn();
						Logger.info("Click Rename Button is PASSED!!!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Click Rename Button is FAILED!!!", e);
						sa.assertAll();
					}	
				}
			} catch (Exception e) {
				sa.assertTrue(true);
			}

			Logger.info("*******************************************Rename*********************************************");
			Thread.sleep(4500);
			try {
				LMP.ContextClickOnAutoTestObject();        
				Logger.info("Right Click On AutoTestObject is PASSED!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Right Click On AutoTestObject is Failed!!", e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				rrp.ClickOnObjectRename();
				Logger.info("Click on Rename option is PASSED!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on Rename option is FAILED!!!", e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				LMP.InputOnRenameAutoTestObject();
				Logger.info("Enter Rename is Passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter Rename is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				LMP.ClickOnRenameBtn();
				Logger.info("Click on Rename button is Passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on Rename button is FAILED!", e);
				sa.assertAll();
			}
		}
		else{
			sa.assertTrue(true);
		}

		Logger.info("//===================================CLONE SCENARIO START================================================//");
		Thread.sleep(4500);
		while (APOM.DisplayedAutoTestObjectRenameCopy()==true) {
			Logger.info("Displayed AutoTestObjectRenameCopy Object,So Delete that Object");
			Thread.sleep(5000);
			try {
				APOM.ContextClickOnAutoTestObjectRenameCopyObject();
				Logger.info("Right Click On AutoTestObjectRenameCopy Object is PASSED!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Right Click On AutoTestObjectRenameCopy Object is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(3500);
			try {
				LMP.ClickOnDeleteOnClonedAutoTestObject();
				Logger.info("Click On Delete Button is Passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Delete Button is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(4000);
			try {
				LMP.ClickOnDeletebtn();
				Logger.info("Click again Delete Button is Passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click again Delete Button is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(400);
			try {
				if (APOM.DisplayedCannotDeleteErrorSuccessMessage() == true) 
				{
					Logger.info("Displayed 'Cannot Delete' Error Message");
					Thread.sleep(3500);
					try {
						APOM.ContextClickOnAutoTestObjectRenameCopyObject();           
						Logger.info("RightClick On AutoTestObjectRenameCopy Object is PASSED!!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("RightClick On AutoTestObjectRenameCopy Object is Failed!!", e);
						sa.assertAll();
					}
					Thread.sleep(2500);
					try {
						rrp.ClickOnObjectRename();
						Logger.info("Click on Rename Object is PASSED!!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Click on Rename Object is FAILED!!!", e);
						sa.assertAll();
					}
					Thread.sleep(2500);
					try {
						String randomString = APOM.generateRandomString(APOM.length);
						APOM.InputRename_AutoTestObject.clear();
						APOM.InputRename_AutoTestObject.sendKeys(randomString);
						Logger.info("Enter Rename is Passed!!!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Enter Rename is FAILED!", e);
						sa.assertAll();
					}
					Thread.sleep(2500);
					try {
						rrp.ClickOnRenameBtn();
						Logger.info("Click Rename Button is PASSED!!!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Click Rename Button is FAILED!!!", e);
						sa.assertAll();
					}	
				}
			} catch (Exception e) {
				sa.assertTrue(true);
			}
			Thread.sleep(4500);
			continue;
		}
		Thread.sleep(4500);
		try {
			LMP.ContextClickOnRenameAutoTestObject();
			Logger.info("Right Click On RenamedAutoTestObject is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On RenamedAutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3800);
		try {
			LMP.ClickOnCloneAutoTestObject();
			Logger.info("Click On Clone in RenamedAutoTestObject is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Clone in RenamedAutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			LMP.ClickOnCloneBtn();
			Logger.info("Click On Clone Button in RenamedAutoTestObject is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Clone Button in RenamedAutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			if (LMP.DisplayCloneAutoTestObject() == true) {
				Logger.info("Display cloned RenamedAutoTestObject is PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display cloned RenamedAutoTestObject is FAILED!", e);
			sa.assertAll();
		}

		Logger.info("//===============================Approve Cloned Object========================================!");
		Thread.sleep(2500);
		try {
			FPOM.ClickOnSaveButtonForSetUpPage();
			Logger.info("Click On Save Button For SetUpPage is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button For SetUpPage is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			dp.DislaySuccessMessage();
			Logger.info("Dislayed SuccessMessage is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Dislayed SuccessMessage is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			dp.ClickOnWebToLead();
			Logger.info("Click On WebToLeadForm is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On WebToLeadForm is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			FPOM.ClickOnGenerateButton();
			Logger.info("Click On Generate Button is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Generate Button is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			FPOM.ClickOnCopyButton();
			Logger.info("Click On Copy Button is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Copy Button is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(150);
		try {
			FPOM.DislayCodeCopiedSuccessfullyMessage();
			Logger.info("Dislay CodeCopied Successfully Message is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Dislay CodeCopied Successfully Message is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			FPOM.ClickOnCloseButton();
			Logger.info("Click On Close Button is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Close Button is FAILED!!!",e);
			sa.assertAll();
		}

		Logger.info("********************************DELETE CLONED OBJECT SCENARIO*********************************");
		Thread.sleep(2500);
		try {
			APOM.ClickOnDeleteAgainForCompanyPreference();
			Logger.info("Click On Delete Button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnDelete();
			Logger.info("Click again Delete Button	is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click again Delete Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(400);
		try {
			if (LMP.DisplayDeleteAutoTestObject() == true) {
				Logger.info("Display Cloned AutoTestObject Deleted successfully is PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Cloned AutoTestObject Deleted successfully is FAILED!", e);
			sa.assertAll();
		}

		Logger.info("============================================DELETE OBJECT SCENARIO START====================================================");
		Thread.sleep(4600);
		try {
			LMP.ContextClickOnRenameAutoTestObject();
			Logger.info("Right Click On RenamedAutoTestObject is Passed!!!");
		} catch (Exception g) {
			sa.assertTrue(false);
			Logger.error("Right Click On RenamedAutoTestObject is FAILED!", g);
			sa.assertAll();
		}
		Thread.sleep(3600);
		try {
			LMP.ClickOnDeleteOnClonedAutoTestObject();
			Logger.info("Click On Delete button is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete button is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2800);
		try {
			LMP.ClickOnDeletebtn();
			Logger.info("Click again Delete button is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click again Delete button is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(300);
		try {
			if (LMP.DisplayDeleteAutoTestObject() == true) {
				Logger.info("Display Deleted Successfully message is PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Deleted Successfully message is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(1500);	
	}		
}
