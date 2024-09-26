package com.leadAngel.testCases;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.leadAngel.pageObjects.AEtoSDR_Page;
import com.leadAngel.pageObjects.AdministrationPageObjectModel;
import com.leadAngel.pageObjects.DetailsPage_SalesTeam;
import com.leadAngel.pageObjects.Forms_PageObjectModel;
import com.leadAngel.pageObjects.HomePage;
import com.leadAngel.pageObjects.LeadManagementPage;
import com.leadAngel.pageObjects.RoundRobinPage;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
public class TC_Sanity_Recaptcha_Administartion extends BaseClass{
	private static final Logger Logger = LogManager.getLogger(TC_Sanity_Recaptcha_Administartion.class);

	@Test(description = "Administration_Recaptcha_Section")
	@Step("Administration_Recaptcha_Section")
	@Description("Administration_Recaptcha_Section")
	public void AdministrationTest() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		HomePage hp = new HomePage(driver);
		AdministrationPageObjectModel APOM=new AdministrationPageObjectModel(driver);
		Forms_PageObjectModel FPOM=new Forms_PageObjectModel(driver);
		LeadManagementPage LMP = new LeadManagementPage(driver);
		AEtoSDR_Page ae = new AEtoSDR_Page(driver);
		RoundRobinPage rrp = new RoundRobinPage(driver);
		DetailsPage_SalesTeam dp=new DetailsPage_SalesTeam(driver);
		Thread.sleep(2500);
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
			FPOM.ClickOnWebToLeadDropdown();
			Logger.info("Click On WebToLead Dropdown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On WebToLead Dropdown is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnRecaptcha();
			Logger.info("Click On Recaptcha is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Recaptcha is Failed",e);
			sa.assertAll();
		}

		Logger.info("*********************************** Add New re-Captcha************************************");
		Thread.sleep(2500);
		try {
			APOM.ClickOnAddButtonFromConsole();
			Logger.info("Click On AddButton From Console is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On AddButton From Console is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		String randomString="";
		try {
			randomString = APOM.generateRandomString(APOM.length);
			APOM.EnterKeyName.sendKeys(randomString);
			Logger.info("Enter EnterKeyName is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter EnterKeyName is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.EnterSiteKey();
			Logger.info("Enter Site Key Name is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Site Key Name is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.EnterSecurityKey();
			Logger.info("Enter Security Key is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Security Key is Failed",e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		try {
			APOM.ClickOnAddButtonForNewRecaptcha();
			Logger.info("Click On Add Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Add Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(800);
		try {
			if (APOM.DisplayedIncertedSuccessMessage()==true) {
				Logger.info("Displayed 'Inserted Successfully' Message is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed 'Inserted Successfully' Message is Failed",e);
			sa.assertAll();
		}

		Logger.info("*********************************** Edit Operation************************************");
		Thread.sleep(3500);
		try {
			driver.findElement(By.xpath("//div[text()='Key Name: "+randomString+" ']//..//..//..//i-tabler[@name='edit']")).click();
			Logger.info("Click On Edit Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Edit Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.EditSiteKey();
			Logger.info("Edit Site Key is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Edit Site Key is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnUpdateButtonForEditRecaptcha();
			Logger.info("Click On Update Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Update Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(800);
		try {
			if (APOM.DisplayedUpdateSuccessMessage()==true) {
				Logger.info("Displayed Update Success Message is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Update Success Message is Failed",e);
			sa.assertAll();
		}


		Logger.info("*********************************** Search Operation************************************");
		Thread.sleep(3500);
		try {
			APOM.EnterTextInSearchBox.clear();
			APOM.EnterTextInSearchBox.sendKeys(randomString);
			Logger.info("Enter EnterKeyName is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter EnterKeyName is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			driver.findElement(By.xpath("//div[text()='Key Name: "+randomString+" ']")).isDisplayed();
			Logger.info("Displayed Text which is Entered in search box is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Text which is Entered in search box is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnCrossMarkFromTheSearchBox();
			Logger.info("Click On Close Mark From The SearchBox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Close Mark From The SearchBox is Failed",e);
			sa.assertAll();
		}

		Logger.info("*********************************** Visibility Icon Operation************************************");
		Thread.sleep(2500);
		try {
			driver.findElement(By.xpath("//div[text()='Key Name: "+randomString+" ']//..//label[@for='siteKey']//..//button[@aria-label='Toggle Visibility']")).click();
			Logger.info("Click On Site key Visibility Icon is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Site key Visibility Icon is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			driver.findElement(By.xpath("//div[text()='Key Name: "+randomString+" ']//..//label[@for='siteKey']//..//input[@type='text']")).isDisplayed();
			Logger.info("Displayed SiteKey in text formate is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed SiteKey in text formate is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			driver.findElement(By.xpath("//div[text()='Key Name: "+randomString+" ']//..//label[@for='siteKey']//..//button[@aria-label='Toggle Visibility']")).click();
			Logger.info("Click again Site key Visibility Icon is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click again Site key Visibility Icon is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			driver.findElement(By.xpath("//div[text()='Key Name: "+randomString+" ']//..//label[@for='siteKey']//..//input[@type='password']")).isDisplayed();
			Logger.info("Displayed SiteKey in Doted symbol formate is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed SiteKey in Doted symbol formate is Failed",e);
			sa.assertAll();
		}

		Logger.info("//*********************************************** Detail Tab *******************************************");
		Thread.sleep(2500);
		try {
			APOM.ClickOnDetailTab();
			Logger.info("Click On Detail Tab is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Detail Tab is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		if (APOM.GettextLastUpdatedOnForCopyAccountDatatoLead().contains("Undefined")) {
			sa.assertTrue(false);
			Logger.error("'"+APOM.GettextLastUpdatedOnForCopyAccountDatatoLead()+"' is Showing for Last Updated On");
			sa.assertAll();
		}
		else {
			sa.assertTrue(true);
			Logger.info("Not showing 'Undefined' for Last Updated");
			sa.assertAll();	
		}
		Thread.sleep(2500);
		if (APOM.GettextLastUpdatedBy().contains("Undefined")) {
			sa.assertTrue(false);
			Logger.error("'"+APOM.GettextLastUpdatedBy()+"' is Showing for Last Updated By");
			sa.assertAll();
		}
		else {
			sa.assertTrue(true);
			Logger.info("Not showing 'Undefined' for Last Updated By");
			sa.assertAll();	
		}


		Logger.info("*********************************** Use Recaptch In Forms ************************************");
		Thread.sleep(2500);
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
						String randomString1 = APOM.generateRandomString(APOM.length);
						APOM.InputRename_AutoTestObject.clear();
						APOM.InputRename_AutoTestObject.sendKeys(randomString1);
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
		Thread.sleep(2500);
		try {
			dp.SelectLeadRouterOption();
			Logger.info("Select LeadRouter Option is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select LeadRouter Option is FAILED!!!",e);
			sa.assertAll();
		}

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
			driver.findElement(By.xpath("//div[@role='option']//span[text()='"+randomString+"']")).click();
			Logger.info("Select Reacaptcha Option is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Reacaptcha Option is FAILED!!!",e);
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

		Logger.info("=================================== Go back to Recaptcha =======================================");

		Logger.info("************************* Delete Operation **************************");
		Thread.sleep(2500);
		try {
			APOM.ClickOnRecaptcha();
			Logger.info("Click On Recaptcha is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Recaptcha is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			driver.findElement(By.xpath("//div[text()='Key Name: "+randomString+" ']//..//..//..//i-tabler[@name='trash']")).click();
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
			if (APOM.DisplayedCannotDeleteErrorMessage()==true) {
				Logger.info("Displayed Cannot Delete Error Message is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Cannot Delete Error Message is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		Logger.info("*********************************** Edit Operation after Used Recaptcha in Forms************************************");
		Thread.sleep(3500);
		try {
			driver.findElement(By.xpath("//div[text()='Key Name: "+randomString+" ']//..//..//..//i-tabler[@name='edit']")).click();
			Logger.info("Click On Edit Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Edit Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.EditSiteKey();
			Logger.info("Edit Site Key is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Edit Site Key is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnUpdateButtonForEditRecaptcha();
			Logger.info("Click On Update Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Update Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(800);
		try {
			if (APOM.DisplayedCannotEditErrorMessage()==true) {
				Logger.info("Displayed Cannot Edit Error Message is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Cannot Edit Error Message is Failed",e);
			sa.assertAll();
		}

		Logger.info("*********************************** UnUsed Recaptcha in Forms and Perform delete Operation************************************");
		Thread.sleep(2500);
		try {
			APOM.ClickOnFormsAutoTestObject();
			Logger.info("Click On AutoTestObject is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On AutoTestObject is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			dp.ClickOnWebToLead();
			Logger.info("Click On WebToLeadForm is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On WebToLeadForm is FAILED!!!",e);
			sa.assertAll();
		}
		Logger.info("********************* Re-Captcha operation *********************");
		Thread.sleep(3500);
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
		
		Logger.info("================================= Go back to Recaptcha ===================================");

		Logger.info("************************* Delete Operation **************************");
		Thread.sleep(2500);
		try {
			APOM.ClickOnRecaptcha();
			Logger.info("Click On Recaptcha is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Recaptcha is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			driver.findElement(By.xpath("//div[text()='Key Name: "+randomString+" ']//..//..//..//i-tabler[@name='trash']")).click();
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
			if (APOM.DisplayedDeleteSuccessMessage()==true) {
				Logger.info("Displayed DeleteSuccess Message is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed DeleteSuccess Message is Failed",e);
			sa.assertAll();
		}

	}
}
