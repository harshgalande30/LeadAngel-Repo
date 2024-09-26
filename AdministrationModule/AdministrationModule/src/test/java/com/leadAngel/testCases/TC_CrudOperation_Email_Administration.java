package com.leadAngel.testCases;
import java.util.List;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.leadAngel.pageObjects.AEtoSDR_Page;
import com.leadAngel.pageObjects.AdministrationPageObjectModel;
import com.leadAngel.pageObjects.CRM_Account_FilterPage;
import com.leadAngel.pageObjects.EmailAlertsTemplatesPageObjectModel;
import com.leadAngel.pageObjects.HomePage;
import com.leadAngel.pageObjects.LeadManagementPage;
import com.leadAngel.pageObjects.LeadRouterPageObjectModel;
import com.leadAngel.pageObjects.LoginPage;
import com.leadAngel.pageObjects.OTS_Router_PageObjectModel;
import com.leadAngel.pageObjects.RoundRobinPage;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
@Listeners({ com.leadAngel.utilities.TestAllureListener.class })
public class TC_CrudOperation_Email_Administration extends BaseClass{
	private static final Logger Logger = LogManager.getLogger(TC_CrudOperation_Email_Administration.class);

	@Test(description = "Administration_Email_Section")
	@Step("Administration_Email_Section")
	@Description("Administration_Email_Section")

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
		OTS_Router_PageObjectModel OTS=new OTS_Router_PageObjectModel(driver);

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
			APOM.ClickNotificationsDropDown();
			Logger.info("Click on Notifications DropDown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Notifications DropDown is Failed",e);
			sa.assertAll();
		}
		Logger.info("//===============================CREATE OBJECT SCENARIO START========================================!");
		Thread.sleep(3500);
		try {
			APOM.RightClickonEmailDropDown();
			Logger.info("Right click on Email is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right click on Email is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickNewEmail();
			Logger.info("Click on New Email is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on New Email is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.EnterNameInCrudObject();
			Logger.info("Enter AutoTestObject Name is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter AutoTestObject Name is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.SelectRouterTypeOption();
			Logger.info("Select Router Type is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Router Type is FAILED!!!",e);
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
				APOM.ClickOnEmailDropdown();
				Logger.info("Click on Email Dropdown is passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on Email Dropdown is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(3500);
			try {
				APOM.RightClickOnAutoTestObject();           
				Logger.info("RightClick On LeadAutoTestObject is PASSED!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("RightClick On LeadAutoTestObject is Failed!!", e);
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
						APOM.RightClickOnAutoTestObject();           
						Logger.info("RightClick On LeadAutoTestObject is PASSED!!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("RightClick On LeadAutoTestObject is Failed!!", e);
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
				APOM.RightClickonEmailDropDown();
				Logger.info("Right click on Email is PASSED!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Right click on Email is Failed!!", e);
				sa.assertAll();
			}
			Thread.sleep(3500);
			try {
				LMP.ClickOnNewObject();
				Logger.info("Click on New Email is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on New Email is FAILED!!", e);
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
			Thread.sleep(3500);
			try {
				APOM.SelectRouterTypeOption();
				Logger.info("Select Router Type is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Select Router Type is FAILED!!!",e);
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


		Thread.sleep(2500);
		try {
			APOM.ClickOnAutoTestObject();           
			Logger.info("Click On LeadAutoTestObject is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On LeadAutoTestObject is FAILED!", e);
			sa.assertAll();
		}


		Logger.info("===================================================Recipient_TO_  Operation===================================================");
		Logger.info("*************************************LeadOwner ****************************************");
		Thread.sleep(4200);
		try {
			EATP.ClickOnCheckBoxFor_Recipient_TO_LeadOwner();
			Logger.info("Click On CheckBox For_Recipient_TO_LeadOwner is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CheckBox For_Recipient_TO_LeadOwner is FAILED!!!",e);
			sa.assertAll();
		}
		Logger.info("************************************* AccountOwner ****************************************");
		Thread.sleep(2500);
		try {
			EATP.ClickOnCheckBoxFor_Recipient_TO_AccountOwner();
			Logger.info("Click On CheckBox For_Recipient_TO_AccountOwner is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CheckBox For_Recipient_TO_AccountOwner is FAILED!!!",e);
			sa.assertAll();
		}

		Logger.info("*************************************LeadOwnerMappedSDR ****************************************");
		String ParentWindow = driver.getWindowHandle();
		Thread.sleep(2500);
		try {
			EATP.ClickOnCheckBoxFor_Recipient_TO_LeadOwnerMappedSDR();
			Logger.info("Click On CheckBox For_Recipient_TO_LeadOwnerMappedSDR is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CheckBox For_Recipient_TO_LeadOwnerMappedSDR is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			EATP.ClickSelectDropDownFor_Recipient_TO_LeadOwnerMappedSDR();
			Logger.info("Click Select DropDown For_Recipient_TO_LeadOwnerMappedSDR is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Select DropDown For_Recipient_TO_LeadOwnerMappedSDR is FAILED!!!",e);
			sa.assertAll();
		}
		//****************
		Thread.sleep(3000);
		String ObjectNameBeforeClickNewTabLink = driver.findElement(By.xpath("(//a[text()=' open_in_new '])[1]//..//span[text()]")).getText();
		Logger.info("Object Name Before Click NewTab Link: "+ObjectNameBeforeClickNewTabLink);
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
		Set<String> Allwindow = driver.getWindowHandles();
		Thread.sleep(4000);
		for (String wh : Allwindow) {
			driver.switchTo().window(wh);
			if (wh.equals(ParentWindow)) {
				continue;
			} else {
				Thread.sleep(4000);
				String ObjectNameAfterClickNewTabLink = driver.findElement(By.xpath("(//i[text()='description']//..//span[text()])[2]")).getText();
				Logger.info("Object Name After Click NewTab Link: "+ObjectNameAfterClickNewTabLink);
				Thread.sleep(4000);
				try {
					if (ObjectNameBeforeClickNewTabLink.contentEquals(ObjectNameAfterClickNewTabLink)) {
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
		Logger.info("*************************************AccountOwnerMappedSDR ****************************************");
		Thread.sleep(3500);
		try {
			EATP.ClickOnCheckBoxFor_Recipient_TO_AccountOwnerMappedSDR();
			Logger.info("Click On CheckBox For_Recipient_TO_AccountOwnerMappedSDR is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CheckBox For_Recipient_TO_AccountOwnerMappedSDR is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			EATP.ClickSelectDropDownFor_Recipient_TO_AccountOwnerMappedSDR();
			Logger.info("Click Select DropDown For_Recipient_TO_AccountOwnerMappedSDR is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Select DropDown For_Recipient_TO_AccountOwnerMappedSDR is FAILED!!!",e);
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
		Logger.info("********************************************AccountTeam **********************************************");
		Thread.sleep(3500);
		try {
			EATP.ClickOnCheckBoxFor_Recipient_TO_AccountTeam();
			Logger.info("Click On CheckBox For_Recipient_TO_AccountTeam is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CheckBox For_Recipient_TO_AccountTeam is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			EATP.ClickSelectDropDownFor_Recipient_TO_AccountTeam();
			Logger.info("Click Select DropDown For_Recipient_TO_AccountTeam is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Select DropDown For_Recipient_TO_AccountTeam is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			EATP.SelectFirstOptionForAccTeamAndNotifyBasedLookUpField();
			Logger.info("Select First Option For AccountTeam And NotifyBasedLookUpField is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select First Option For AccountTeam And NotifyBasedLookUpField is FAILED!!!",e);
			sa.assertAll();
		}
		Logger.info("*************************************Notify Based On The Lookup Field On Account ****************************************");
		Thread.sleep(2500);
		try {
			EATP.ClickOnCheckBoxFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccount();
			Logger.info("Click On CheckBox For_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccount is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CheckBox For_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccount is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			EATP.ClickSelectDropDownFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccount();
			Logger.info("Click Select DropDown For_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccount is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Select DropDown For_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccount is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			EATP.SelectFirstOptionForAccTeamAndNotifyBasedLookUpField();
			Logger.info("Select First Option For Account Team And NotifyBasedLookUpField is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select First Option For Account Team And NotifyBasedLookUpField is FAILED!!!",e);
			sa.assertAll();
		}

		Logger.info("************************************* OTS Broadcast Notification Recipients ****************************************");
		Thread.sleep(2500);
		try {
			EATP.CheckBoxFor_Recipient_TO_OTSBroadcastNotificationRecipients();
			Logger.info("Check Box For_Recipient_TO_OTSBroadcastNotificationRecipients is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Check Box For_Recipient_TO_OTSBroadcastNotificationRecipients is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			EATP.EnterEmailIdFor_Recipient_TO_OTSBroadcastNotificationRecipients();
			Logger.info("Enter EmailId For_Recipient_TO_OTSBroadcastNotificationRecipients is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter EmailId For_Recipient_TO_OTSBroadcastNotificationRecipients is FAILED!!!",e);
			sa.assertAll();
		}

		Logger.info("*************************************Additional Recipients ****************************************");
		Thread.sleep(2500);
		try {
			EATP.ClickOnCheckBoxFor_Recipient_TO_AdditionalRecipients();
			Logger.info("Click On Check Box For_Recipient_TO_AdditionalRecipients is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CheckBox For_Recipient_TO_AdditionalRecipients is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			EATP.EnterMailIDFor_Recipient_TO_AdditionalRecipients();
			Logger.info("Enter MailID For_Recipient_TO_AdditionalRecipients is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter MailID For_Recipient_TO_AdditionalRecipients is FAILED!!!",e);
			sa.assertAll();
		}

		Logger.info("===================================================Recipient_CC_ Operation===================================================");
		Thread.sleep(2500);
		try {
			EATP.ClickOnRecipientCC_DropDown();
			Logger.info("Click On RecipientCC_DropDown is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On RecipientCC_DropDown is FAILED!!!",e);
			sa.assertAll();
		}

		Logger.info("*************************************LeadOwner ****************************************");
		Thread.sleep(2500);
		try {
			EATP.ClickOnCheckBoxFor_Recipient_CC_LeadOwner();
			Logger.info("Click On CheckBox For_Recipient_CC_LeadOwner is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CheckBox For_Recipient_CC_LeadOwner is FAILED!!!",e);
			sa.assertAll();
		}

		Logger.info("*************************************AccountOwner ****************************************");
		Thread.sleep(2500);
		try {
			EATP.ClickOnCheckBoxFor_Recipient_CC_AccountOwner();
			Logger.info("Click On Check Box For_Recipient_CC_AccountOwner is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CheckBox For_Recipient_CC_AccountOwner is FAILED!!!",e);
			sa.assertAll();
		}
		Logger.info("*************************************LeadOwnerMappedSDR ****************************************");
		Thread.sleep(2500);
		try {
			EATP.ClickOnCheckBoxFor_Recipient_CC_LeadOwnerMappedSDR();
			Logger.info("Click On Check Box For_Recipient_CC_LeadOwnerMappedSDR is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Check Box For_Recipient_CC_LeadOwnerMappedSDR is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			EATP.ClickSelectDropDownFor_Recipient_CC_LeadOwnerMappedSDR();
			Logger.info("Click Select DropDown For_Recipient_CC_LeadOwnerMappedSDR is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Select DropDown For_Recipient_CC_LeadOwnerMappedSDR is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			EATP.SelectFirstOptionFor_RecipientTO_OR_RecipientCC();
			Logger.info("Select First Option For_Recipient_CC_LeadOwnerMappedSDR is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select First Option For_Recipient_CC_LeadOwnerMappedSDR is FAILED!!!",e);
			sa.assertAll();
		}

		Logger.info("*************************************AccountOwnerMappedSDR ****************************************");
		Thread.sleep(2500);
		try {
			EATP.ClickOnCheckBoxFor_Recipient_CC_AccountOwnerMappedSDR();
			Logger.info("Click On CheckBox For_Recipient_CC_AccountOwnerMappedSDR is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CheckBox For_Recipient_CC_AccountOwnerMappedSDR is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			EATP.ClickSelectDropDownFor_Recipient_CC_AccountOwnerMappedSDR();
			Logger.info("Click SelectDropDown For_Recipient_CC_AccountOwnerMappedSDR is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click SelectDrop DownFor_Recipient_CC_AccountOwnerMappedSDR is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			EATP.SelectFirstOptionFor_RecipientTO_OR_RecipientCC();
			Logger.info("Select First Option For_Recipient_CC_AccountOwnerMappedSDR is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select First Option For_Recipient_CC_AccountOwnerMappedSDR is FAILED!!!",e);
			sa.assertAll();
		}
		Logger.info("*************************************AccountTeam ****************************************");
		Thread.sleep(2500);
		try {
			EATP.ClickOnCheckBoxFor_Recipient_CC_AccountTeam();
			Logger.info("Click On CheckBox For_Recipient_CC_AccountTeam is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CheckBox For_Recipient_CC_AccountTeam is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			EATP.ClickSelectDropDownFor_Recipient_CC_AccountTeam();
			Logger.info("Click Select DropDown For_Recipient_CC_AccountTeam is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Select DropDown For_Recipient_CC_AccountTeam is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			EATP.SelectFirstOptionForAccTeamAndNotifyBasedLookUpField();
			Logger.info("Select First Option For_Recipient_CC_AccountTeam is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select First Option For_Recipient_CC_AccountTeam is FAILED!!!",e);
			sa.assertAll();
		}

		Logger.info("*************************************Notify Based On The Lookup Field On Account ****************************************");
		Thread.sleep(2500);
		try {
			EATP.ClickOnCheckBoxFor_Recipient_CC_NotifyBasedOnTheLookupFieldOnAccount();
			Logger.info("Click On CheckBox For_Recipient_CC_NotifyBasedOnTheLookupField On Account is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CheckBox For_Recipient_CC_NotifyBasedOnTheLookupField On Account is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			EATP.ClickSelectDropDownFor_Recipient_CC_NotifyBasedOnTheLookupFieldOnAccount();
			Logger.info("Click Select DropDown For_Recipient_CC_NotifyBasedOnTheLookupField On Account is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Select DropDown For_Recipient_CC_NotifyBasedOnTheLookupField On Account is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			EATP.SelectFirstOptionForAccTeamAndNotifyBasedLookUpField();
			Logger.info("Select First Option For_Recipient_CC_NotifyBasedOnTheLookupField On Account is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select First Option For_Recipient_CC_NotifyBasedOnTheLookupField On Account is FAILED!!!",e);
			sa.assertAll();
		}

		Logger.info("*************************************Additional Recipients ****************************************");
		Thread.sleep(2500);
		try {
			EATP.ClickOnCheckBoxFor_Recipient_CC_AdditionalRecipients();
			Logger.info("Click On CheckBox For_Recipient_CC_AdditionalRecipients is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CheckBox For_Recipient_CC_AdditionalRecipients is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			EATP.EnterMailIDFor_Recipient_CC_AdditionalRecipients();
			Logger.info("Enter MailID For_Recipient_CC_AdditionalRecipients is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter MailID For_Recipient_CC_AdditionalRecipients is FAILED!!!",e);
			sa.assertAll();
		}
		Logger.info("=======================================================Subject====================================================================");
		Thread.sleep(2500);
		try {
			EATP.EnterSubject();
			Logger.info("Enter Subject is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Subject is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			EATP.ClickOnInsertSnippetButtonForSubject();
			Logger.info("Click On Insert Snippet Button For Subject is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Insert Snippet Button For Subject is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			EATP.ClickOnSelectObjectDropDownForInsertValueInSubject();
			Logger.info("Click On Select Object DropDown For Insert Value In Subject is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Select Object DropDown For Insert Value In Subject is FAILED!!!",e);
			sa.assertAll();
		}
		List<WebElement> AllLinksOfOptionn = driver.findElements(By.xpath("//ng-dropdown-panel[@aria-label='Options list']//div[@role='option']"));
		int CountAllLinks =AllLinksOfOptionn.size();
		for (int i = 0; i < CountAllLinks;i++) {

			if (i!=0) {
				Thread.sleep(3000);
				try {
					EATP.ClickOnInsertSnippetButtonForSubject();
					Logger.info("Click On Insert Snippet Button For Subject is PASSED!!");
				}catch(Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Insert Snippet Button For Subject is FAILED!!!",e);
					sa.assertAll();
				}
				Thread.sleep(3500);
				try {
					EATP.ClickOnSelectObjectDropDownForInsertValueInSubject();
					Logger.info("Click On Select Object DropDown For Insert Value In Subject is PASSED!!");
				}catch(Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Select Object DropDown For Insert Value In Subject is FAILED!!!",e);
					sa.assertAll();
				}
			}
			List<WebElement> AllLinksOfOption = driver.findElements(By.xpath("//ng-dropdown-panel[@aria-label='Options list']//div[@role='option']"));
			WebElement getLinksOfOption = AllLinksOfOption.get(i);
			String getLinkTextOption = getLinksOfOption.getText();
			Thread.sleep(3500);
			try {
				getLinksOfOption.click();
				Logger.info("Select "+getLinkTextOption+" is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select "+getLinkTextOption+" is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				LR.ClickOnInsertValueSelectFieldDropDownUpdateDataValue();
				Logger.info("Click On Insert Value Select Field DropDown is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Insert Value Select Field DropDown is FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				LR.ClickOnInsertValueSelectFieldOptionUpdateDataValue();
				Logger.info("Click On Insert Value Select Field Option is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Insert Value Select Field Option is FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				LR.ClickOnIncertButton();
				Logger.info("Click On Incert Button is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Incert Button is FAILED!!!",e);
				sa.assertAll();
			}

		}//for


		Logger.info("=======================================================EmailBody====================================================================");
		Thread.sleep(2500);
		try {
			EATP.EnterEmailBody();
			Logger.info("Enter Email Body is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Email Body is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			EATP.ClickOnInsertSnippetButtonForEmailBody();
			Logger.info("Click On Insert Snippet Button For Email Body is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Insert Snippet Button For Email Body is FAILED!!!",e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		try {
			EATP.ClickOnSelectObjectDropDownForInsertValueInSubject();
			Logger.info("Click On Select Object DropDown is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Select Object DropDown is FAILED!!!",e);
			sa.assertAll();
		}
		List<WebElement> AllLinksOfOption2 = driver.findElements(By.xpath("//ng-dropdown-panel[@aria-label='Options list']//div[@role='option']"));
		int CountAllLinks2 =AllLinksOfOption2.size();
		for (int i = 0; i < CountAllLinks2; i++) {

			if (i!=0) {
				Thread.sleep(2500);
				try {
					EATP.ClickOnInsertSnippetButtonForEmailBody();
					Logger.info("Click On Insert Snippet Button For Email Body is PASSED!!");
				}catch(Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Insert Snippet Button For Email Body is FAILED!!!",e);
					sa.assertAll();
				}
				Thread.sleep(3500);
				try {
					EATP.ClickOnSelectObjectDropDownForInsertValueInSubject();
					Logger.info("Click On Select Object DropDown is PASSED!!");
				}catch(Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Select Object DropDown is FAILED!!!",e);
					sa.assertAll();
				}
			}
			List<WebElement> AllLinksOfOption = driver.findElements(By.xpath("//ng-dropdown-panel[@aria-label='Options list']//div[@role='option']"));
			WebElement getLinksOfOption = AllLinksOfOption.get(i);
			String getLinkTextOption = getLinksOfOption.getText();
			Thread.sleep(2000);
			try {
				getLinksOfOption.click();
				Logger.info("Select "+getLinkTextOption+" is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select "+getLinkTextOption+" is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				LR.ClickOnInsertValueSelectFieldDropDownUpdateDataValue();
				Logger.info("Click On Insert Value Select Field DropDown is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Insert Value Select Field DropDown is FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				LR.ClickOnInsertValueSelectFieldOptionUpdateDataValue();
				Logger.info("Click On Insert Value Select Field Option is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Insert Value Select Field Option is FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				LR.ClickOnIncertButton();
				Logger.info("Click On Incert Button is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Incert Button is FAILED!!!",e);
				sa.assertAll();
			}

		}//for

		Logger.info("=======================================================Save====================================================================");
		Thread.sleep(2500);
		try {
			EATP.SaveButtonForEmailAlertTemplate();
			Logger.info("Save Button For Email is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Save Button For Email is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(700);
		try {
			if (EATP.SavingVerificationMessage()==true) {
				Logger.info("Displayed Saving Verification Message is PASSED!!");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Saving Verification Message is FAILED!!!",e);
			sa.assertAll();
		}

		driver.navigate().refresh();
		Logger.info("Refreshing The Page!!");
		Thread.sleep(5500);

		Logger.info("====================================================Verification of Recipient_TO_ Operation==================================================================");
		Thread.sleep(4000);

		Logger.info("*************************************Verification LeadOwner ****************************************");
		try {
			if (EATP.VeryfyCheckBoxFor_Recipient_TO_LeadOwner()==true) {
				Logger.info(EATP.VeryfyCheckBoxFor_Recipient_TO_LeadOwner());
				Logger.info("Veryfy CheckBox For_Recipient_TO_LeadOwner is Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Veryfy CheckBox For_Recipient_TO_LeadOwner is Failed !!",e);
			sa.assertAll();
		}

		Logger.info("*************************************Verification AccountOwner ****************************************");
		Thread.sleep(1000);
		try {
			if (EATP.VerifyCheckBoxFor_Recipient_TO_AccountOwner()==true) {
				Logger.info(EATP.VerifyCheckBoxFor_Recipient_TO_AccountOwner());
				Logger.info("Verify CheckBox For_Recipient_TO_AccountOwner is Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verify CheckBox For_Recipient_TO_AccountOwner is Failed !!",e);
			sa.assertAll();
		}
		Logger.info("*************************************Verification LeadOwnerMappedSDR ****************************************");
		Thread.sleep(1000);
		try {
			if (EATP.VerifyCheckBoxFor_Recipient_TO_LeadOwnerMappedSDR()==true) {
				Logger.info(EATP.VerifyCheckBoxFor_Recipient_TO_LeadOwnerMappedSDR());
				Logger.info("Verify CheckBox For_Recipient_TO_LeadOwnerMappedSDR  Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verify CheckBox For_Recipient_TO_LeadOwnerMappedSDR  Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (EATP.VerificatinOfSelectTextBoxBorderFor_Recipient_TO_LeadOwnerMappedSDR()==true) {
				Logger.info(EATP.VerificatinOfSelectTextBoxBorderFor_Recipient_TO_LeadOwnerMappedSDR());
				Logger.info("Verification Of Select TextBox Border For_Recipient_TO_LeadOwnerMappedSDR  Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verification Of Select TextBox Border For_Recipient_TO_LeadOwnerMappedSDR Failed !!",e);
			sa.assertAll();
		}
		Logger.info("*************************************Verification AccountOwnerMappedSDR ****************************************");
		Thread.sleep(1000);
		try {
			if (EATP.VerifyCheckBoxFor_Recipient_TO_AccountOwnerMappedSDR()==true) {
				Logger.info(EATP.VerifyCheckBoxFor_Recipient_TO_AccountOwnerMappedSDR());
				Logger.info("Verify CheckBox For_Recipient_TO_AccountOwnerMappedSDR  Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verify CheckBox For_Recipient_TO_AccountOwnerMappedSDR Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (EATP.VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AccountOwnerMappedSDR()==true) {
				Logger.info(EATP.VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AccountOwnerMappedSDR());
				Logger.info("Verification Of Select TextBox Border For_Recipient_TO_AccountOwnerMappedSDR  Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verification Of Select TextBox Border For_Recipient_TO_AccountOwnerMappedSDR Failed !!",e);
			sa.assertAll();
		}
		Logger.info("*************************************Verification AccountTeam ****************************************");
		Thread.sleep(1000);
		try {
			if (EATP.VerifyCheckBoxFor_Recipient_TO_AccountTeam()==true) {
				Logger.info(EATP.VerifyCheckBoxFor_Recipient_TO_AccountTeam());
				Logger.info("Verify CheckBox For_Recipient_TO_AccountTeam  Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verify CheckBox For_Recipient_TO_AccountTeam Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (EATP.VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AccountTeam()==true) {
				Logger.info(EATP.VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AccountTeam());
				Logger.info("Verification Of Select TextBox Border For_Recipient_TO_AccountTeam  Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verification Of Select TextBox Border For_Recipient_TO_AccountTeam Failed !!",e);
			sa.assertAll();
		}
		Logger.info("*************************************Verification OTS Broadcast Notification Recipients****************************************");
		Thread.sleep(1000);
		try {
			if (EATP.VerifyCheckBoxFor_Recipient_TO_OTSBroadcastNotificationRecipients()==true) {
				Logger.info(EATP.VerifyCheckBoxFor_Recipient_TO_OTSBroadcastNotificationRecipients());
				Logger.info("Verify Check Box For_Recipient_TO_OTSBroadcastNotificationRecipients  Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verify CheckBox For_Recipient_TO_OTSBroadcastNotificationRecipients Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (EATP.VerificatinOfSelectTextBoxBorderFor_Recipient_TO_OTSBroadcastNotificationRecipients()==true) {
				Logger.info(EATP.VerificatinOfSelectTextBoxBorderFor_Recipient_TO_OTSBroadcastNotificationRecipients());
				Logger.info("Verification Of Select TextBox Border For_Recipient_TO_OTSBroadcastNotificationRecipients  Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verification Of Select TextBox Border For_Recipient_TO_OTSBroadcastNotificationRecipients Failed !!",e);
			sa.assertAll();
		}

		Logger.info("*************************************Verification AdditionalRecipients****************************************");
		Thread.sleep(1000);
		try {
			if (EATP.VerifyCheckBoxFor_Recipient_TO_AdditionalRecipients()==true) {
				Logger.info(EATP.VerifyCheckBoxFor_Recipient_TO_AdditionalRecipients());
				Logger.info("Verify CheckBox For_Recipient_TO_AdditionalRecipients  Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verify CheckBox For_Recipient_TO_AdditionalRecipients Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (EATP.VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AdditionalRecipients()==true) {
				Logger.info(EATP.VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AdditionalRecipients());
				Logger.info("Verification Of Select TextBox Border For_Recipient_TO_AdditionalRecipients  Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verification Of Select TextBox Border For_Recipient_TO_AdditionalRecipients Failed !!",e);
			sa.assertAll();
		}

		Logger.info("*************************************Verification NotifyBasedOnTheLookupFieldOnAccount****************************************");
		Thread.sleep(1000);
		try {
			if (EATP.VerifyCheckBoxFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccount()==true) {
				Logger.info(EATP.VerifyCheckBoxFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccount());
				Logger.info("Verify CheckBox For_Recipient_TO_NotifyBasedOnTheLookupField On Account  Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verify CheckBox For_Recipient_TO_NotifyBasedOnTheLookupField On Account Failed !!",e);
			sa.assertAll();
		}		
		Thread.sleep(1000);
		try {
			if (EATP.VerificatinOfSelectTextBoxBorderFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccount()==true) {
				Logger.info(EATP.VerificatinOfSelectTextBoxBorderFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccount());
				Logger.info("Verification of Select TextBox Border For_Recipient_TO_NotifyBasedOnTheLookupField On Account  Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verification of Select TextBox Border For_Recipient_TO_NotifyBasedOnTheLookupField On Account Failed !!",e);
			sa.assertAll();
		}
		Logger.info("====================================================Verification of Recipient_CC_ Operation==================================================================");
		Thread.sleep(2500);
		try {
			EATP.ClickOnRecipientCC_DropDown();
			Logger.info("Click On RecipientCC_DropDown is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On RecipientCC_DropDown is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		Logger.info("*************************************Verification LeadOwner ****************************************");
		try {
			if (EATP.VerifyCheckBoxFor_Recipient_CC_LeadOwner()==true) {
				Logger.info(EATP.VerifyCheckBoxFor_Recipient_CC_LeadOwner());
				Logger.info("Verify CheckBox For_Recipient_CC_LeadOwner is Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verify CheckBox For_Recipient_CC_LeadOwner is Failed !!",e);
			sa.assertAll();
		}
		Logger.info("*************************************Verification AccountOwner****************************************");
		Thread.sleep(1000);
		try {
			if (EATP.VerifyCheckBoxFor_Recipient_CC_AccountOwner()==true) {
				Logger.info(EATP.VerifyCheckBoxFor_Recipient_CC_AccountOwner());
				Logger.info("Verify CheckBox For_Recipient_CC_AccountOwner is Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verify CheckBox For_Recipient_CC_AccountOwner is Failed !!",e);
			sa.assertAll();
		}
		Logger.info("*************************************Verification LeadOwnerMappedSDR****************************************");
		Thread.sleep(1000);
		try {
			if (EATP.VerifyCheckBoxFor_Recipient_CC_LeadOwnerMappedSDR()==true) {
				Logger.info(EATP.VerifyCheckBoxFor_Recipient_CC_LeadOwnerMappedSDR());
				Logger.info("Verify CheckBox For_Recipient_CC_LeadOwnerMappedSDR is Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verify CheckBox For_Recipient_CC_LeadOwnerMappedSDR is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (EATP.VerificatinOfSelectTextBoxBorderFor_Recipient_CC_LeadOwnerMappedSDR()==true) {
				Logger.info(EATP.VerificatinOfSelectTextBoxBorderFor_Recipient_CC_LeadOwnerMappedSDR());
				Logger.info("Verification Of Select TextBox BorderFor_Recipient_CC_LeadOwnerMappedSDR is Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verification Of Select TextBox BorderFor_Recipient_CC_LeadOwnerMappedSDR is Failed !!",e);
			sa.assertAll();
		}
		Logger.info("*************************************Verification AccountOwnerMappedSDR****************************************");
		Thread.sleep(1000);
		try {
			if (EATP.VerifyCheckBoxFor_Recipient_CC_AccountOwnerMappedSDR()==true) {
				Logger.info(EATP.VerifyCheckBoxFor_Recipient_CC_AccountOwnerMappedSDR());
				Logger.info("Verify CheckBox For_Recipient_CC_AccountOwnerMappedSDR is Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verify CheckBox For_Recipient_CC_AccountOwnerMappedSDR is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (EATP.VerificatinOfSelectTextBoxBorderFor_Recipient_CC_AccountOwnerMappedSDR()==true) {
				Logger.info(EATP.VerificatinOfSelectTextBoxBorderFor_Recipient_CC_AccountOwnerMappedSDR());
				Logger.info("Verification Of Select Text BoxBorder For_Recipient_CC_AccountOwnerMappedSDR is Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verification Of Select Text BoxBorder For_Recipient_CC_AccountOwnerMappedSDR is Failed !!",e);
			sa.assertAll();
		}
		Logger.info("*************************************Verification AccountTeam****************************************");
		Thread.sleep(1000);
		try {
			if (EATP.VerifyCheckBoxFor_Recipient_CC_AccountTeam()==true) {
				Logger.info(EATP.VerifyCheckBoxFor_Recipient_CC_AccountTeam());
				Logger.info("Verify CheckBox For_Recipient_CC_AccountTeam  Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verify CheckBox For_Recipient_CC_AccountTeam Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (EATP.VerificatinOfSelectTextBoxBorderFor_Recipient_CC_AccountTeam()==true) {
				Logger.info(EATP.VerificatinOfSelectTextBoxBorderFor_Recipient_CC_AccountTeam());
				Logger.info("Verification Of SelectText BoxBorder For_Recipient_CC_AccountTeam is Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verification Of SelectText BoxBorder For_Recipient_CC_AccountTeam is Failed !!",e);
			sa.assertAll();
		}
		Logger.info("*************************************Verification NotifyBasedOnTheLookupFieldOnAccount****************************************");
		Thread.sleep(1000);
		try {
			if (EATP.VerifyCheckBoxFor_Recipient_CC_NotifyBasedOnTheLookupFieldOnAccount()==true) {
				Logger.info(EATP.VerifyCheckBoxFor_Recipient_CC_NotifyBasedOnTheLookupFieldOnAccount());
				Logger.info("Verify CheckBox For_Recipient_CC_NotifyBasedOnTheLookupField On Account  Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verify CheckBox For_Recipient_CC_NotifyBasedOnTheLookupField On Account Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (EATP.VerificatinOfSelectTextBoxBorderFor_Recipient_CC_NotifyBasedOnTheLookupFieldOnAccount()==true) {
				Logger.info(EATP.VerificatinOfSelectTextBoxBorderFor_Recipient_CC_NotifyBasedOnTheLookupFieldOnAccount());
				Logger.info("Verificatin Of Select TextBox Border For_Recipient_CC_NotifyBasedOnTheLookupField On Account is Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verificatin Of Select TextBox Border For_Recipient_CC_NotifyBasedOnTheLookupField On Account is Failed !!",e);
			sa.assertAll();
		}
		Logger.info("*************************************Verification AdditionalRecipients****************************************");
		Thread.sleep(1000);
		try {
			if (EATP.VerifyCheckBoxFor_Recipient_CC_AdditionalRecipients()==true) {
				Logger.info(EATP.VerifyCheckBoxFor_Recipient_CC_AdditionalRecipients());
				Logger.info("Verify CheckBox For_Recipient_CC_AdditionalRecipients is Passed!!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verify CheckBox For_Recipient_CC_AdditionalRecipients is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (EATP.VerificatinOfSelectTextBoxBorderFor_Recipient_CC_AdditionalRecipients()==true) {
				Logger.info(EATP.VerificatinOfSelectTextBoxBorderFor_Recipient_CC_AdditionalRecipients());
				Logger.info("Verification Of Select Text Box Border For_Recipient_CC_AdditionalRecipients  Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verification Of Select Text Box Border For_Recipient_CC_AdditionalRecipients Failed !!",e);
			sa.assertAll();
		}
		Logger.info("====================================================Verification of Subject==================================================================");
		Thread.sleep(1000);
		try {
			if (EATP.VerificatinOfSubjectTextBoxBorderForSubject()==true) {
				Logger.info(EATP.VerificatinOfSubjectTextBoxBorderForSubject());
				Logger.info("Verification Of Subject TextBox Border For Subject  Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verification Of Subject TextBox Border For Subject Failed !!",e);
			sa.assertAll();
		}
		Logger.info("====================================================Verification of Email Body==================================================================");
		Thread.sleep(1000);
		try {
			if (EATP.VerificatinOfEmailBodyTextBoxBorderForEmailBody()==true) {
				Logger.info(EATP.VerificatinOfEmailBodyTextBoxBorderForEmailBody());
				Logger.info("Verification Of EmailBody TextBox Border For EmailBody  Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verification Of EmailBody TextBox Border For EmailBody Failed !!",e);
			sa.assertAll();
		}
		Logger.info("//*********************************************** Detail Tab *******************************************");
		String TextFromUsedBeRouterName="";
		String GetTextFromErrorMessage="";
		Thread.sleep(3000);
		try {
			APOM.ClickOnDetailTab();
			Logger.info("Click On Detail Tab is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Detail Tab is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(4000);
		try {
			APOM.ClickOnCopyButton();
			Logger.info("Click On Copy Button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Copy Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(400);
		try {
			if (APOM.DisplayedCopyMessage()==true) {
				Logger.info("Displayed 'Id copied to clipboard' maessage is Passed");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed 'Id copied to clipboard' maessage is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		if (APOM.GettextLastUpdated().contains("Undefined")) {
			sa.assertTrue(false);
			Logger.error("'"+APOM.GettextLastUpdated()+"' is Showing for Last Updated On");
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

		Thread.sleep(2500);
		try {
			if (APOM.DisplayedNoRecordFound() == true) {
				Logger.info("Display 'No Record Found' is PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display 'No Record Found' is FAILED!", e);
			sa.assertAll();
		}
		//*****
		Logger.info("//==================================== OverView Page Opeartion Before Used  ==================================");
		Thread.sleep(3500);
		try {
			APOM.ClickOnEmailFeature();
			Logger.info("Click On Email Feature is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Email Feature is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if(APOM.DisplayEmailOverview()==true) {
				Logger.info("Display Email OverView Page is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Email OverView Page is Failed", e);
			sa.assertAll();
		}


		if (APOM.DisplayedColumnHeaderCheckIsDisabled()==false) {
			Logger.info("***************** Column Header Check Box Operation ******************");
			Logger.info("Displayed Column Header Checkbox Is Not Disabled ");

			Thread.sleep(1500);
			try {
				APOM.ClickOnColumnHeaderCheckBox();
				Logger.info("Click On ColumnHeader CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On ColumnHeader CheckBox is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				if (APOM.DisplayedColumnHeaderCheckBoxIsChecked() == true) {
					Logger.info("Displayed ColumnHeader CheckBox Is Checked is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed ColumnHeader CheckBox Is Checked is Failed", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			if (APOM.DisplayedAutTestObjectCheckBox() == true) {
				Logger.info("Displayed LeadAutTestObject CheckBox is Passed");
				try {
					if (APOM.DisplayedAutTestObjectCheckBoxIsChecked() == true) {
						Logger.info("Displayed LeadAutTestObject CheckBox Is Checked is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed LeadAutTestObject CheckBox Is Checked is Failled", e);
					sa.assertAll();
				}
			} else {
				sa.assertTrue(true);
			}
			Thread.sleep(1500);
			try {
				if (APOM.DisplayedDeleteButtonIsDisabled() == false) {
					Logger.info("Displayed Delete Button is Enabled is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Delete Button is Enabled is Failled", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				APOM.ClickOnColumnHeaderCheckBox();
				Logger.info("Uncheck the ColumnHeader CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Uncheck the ColumnHeader CheckBox is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			if (APOM.DisplayedAutTestObjectCheckBox() == true) {
				Logger.info("Displayed LeadAutTestObject CheckBox is Passed");
				try {
					if (APOM.DisplayedAutTestObjectCheckBoxIsNotChecked() == true) {
						Logger.info("Displayed LeadAutTestObject CheckBox Is Not Checked is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed LeadAutTestObject CheckBox Is Not Checked is Failled", e);
					sa.assertAll();
				}
			} else {
				sa.assertTrue(true);
			}
			Thread.sleep(1500);
			try {
				if (APOM.DisplayedDeleteButtonIsDisabled() == true) {
					Logger.info("Displayed Delete Button is Disable is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Delete Button is Disable is Failled", e);
				sa.assertAll();
			}
			Logger.info("********************** Filter Operation *************************");
			Thread.sleep(1500);
			try {
				APOM.EnterTextInFilterBox();
				Logger.info("Enter Text In FilterBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter Text In FilterBox is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				if (APOM.DisplayedLeadAutoTestObject() == true) {
					Logger.info("Displayed LeadAutoTestObject is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed LeadAutoTestObject is Failled", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			if (APOM.DisplayedAutTestObjectCheckBox() == true) {
				Logger.info("Displayed LeadAutoTestObject CheckBox is Passed");
				try {
					if (APOM.DisplayedLeadAutoTestObjectIsNotUsed() == true) {
						Logger.info("Displayed LeadAutoTestObject Is Not Used is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed LeadAutoTestObject Is Not Used is Failled", e);
					sa.assertAll();
				}
			} else {

				try {
					if (APOM.DisplayedLeadAutoTestObjectIsUsed() == true) {
						Logger.info("Displayed LeadAutoTestObject Is Used is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed LeadAutoTestObject Is Used is Failled", e);
					sa.assertAll();
				}
			}
			Thread.sleep(2000);
			try {
				APOM.ClearTestFromTheFilterBox();
				Logger.info("Clear Test From The FilterBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Clear Test From The FilterBox is FAILED!!", e);
				sa.assertAll();
			} 
		}else {
			Logger.info("***************** Column Header Check Box Operation ******************");
			Thread.sleep(2500);
			try {
				if(APOM.DisplayedColumnHeaderCheckIsDisabled()==true) {
					Logger.info("Displayed Column Header Checkbox Is Disabled is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Column Header Checkbox Is Disabled is is Failed", e);
				sa.assertAll();
			}

			Logger.info("********************** Filter Operation *************************");

			Thread.sleep(1500);
			try {
				APOM.EnterTextInFilterBox();
				Logger.info("Enter Text In FilterBox is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter Text In FilterBox is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				if( APOM.DisplayedLeadAutoTestObject()==true) {
					Logger.info("Displayed LeadAutoTestObject is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed LeadAutoTestObject is Failled", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			if (APOM.DisplayedAutTestObjectCheckBox()==true) {
				Logger.info("Displayed LeadAutoTestObject CheckBox is Passed");
				try {
					if (APOM.DisplayedLeadAutoTestObjectIsNotUsed() == true) {
						Logger.info("Displayed LeadAutoTestObject is not Uesed is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed LeadAutoTestObject is not Used is Failled", e);
					sa.assertAll();
				} 
			}else {
				try {
					if( APOM.DisplayedLeadAutoTestObjectIsUsed()==true) {
						Logger.info("Displayed LeadAutoTestObject Is Used is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed LeadAutoTestObject Is Used is Failled", e);
					sa.assertAll();
				}
			}
			Thread.sleep(1500);
			try {
				APOM.ClearTestFromTheFilterBox();
				Logger.info("Clear Test From The FilterBox is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Clear Test From The FilterBox is FAILED!!", e);
				sa.assertAll();
			}

		}

		//******

		Logger.info("//*********************************************** Make Use of this Object In OTS Router(LeadManagement) *******************************************");
		Thread.sleep(2500);
		try {
			APOM.ClickOnDropDownForMenutab();
			Logger.info("Click On DropDown For Menu tab is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DropDown For Menu tab is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			APOM.ClickOnLeadManagementOption();
			Logger.info("Click On LeadManagement from menu is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On LeadManagement from menu is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(7500);
		try {
			APOM.ClickOnDropDownForLeadRouting();
			Logger.info("Click On dropdown for lead Routing is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On dropdown for lead Routing is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.RightClickOnOTSrouter();
			Logger.info("Right Click on OTSrouter is passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click on OTSrouter is failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickOnNewObject();
			Logger.info("Click on New OTSrouter is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on New OTSrouter is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.NameInCrudObject();
			Logger.info("Enter AutoTestObject Name is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter AutoTestObject Name is FAILED!!!");
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.DescInRRT();
			Logger.info("Enter Description is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Description is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.clickOnSaveNewObject();
			Logger.info("Click on Save Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Save Button is Failed", e);
			sa.assertAll();
		} 

		Thread.sleep(800);
		if(ae.DisplaySameAEerror() == true) {
			Logger.info("Duplicate Object Found, Try to delete the Object NOW!!! then Creating New Object!!");
			Thread.sleep(3500);
			try {
				OTS.ClickOnOTSrouterDropDownsymbol();
				Logger.info("Click on OTSrouter DropDown is passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on OTSrouter DropDown is FAILED!!", e);
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
			Thread.sleep(2500);
			try {
				LMP.ClickOnDeletebtn();
				Logger.info("Click Again Delete button is Passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click Again Delete button is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(500);
			try {
				if (APOM.DisplayedCannotDeleteErrorSuccessMessage() == true) 
				{
					Logger.info("Displayed 'Cannot Delete' Error Message");
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
			try {
				OTS.RightClickOnOTSrouter();
				Logger.info("Right Click on OTSrouter is passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Right Click on OTSrouter is failed",e);
				sa.assertAll();
			}
			Thread.sleep(3000);
			try {
				LMP.ClickOnNewObject();
				Logger.info("Click on New OTS Router is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on New OTS Router is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(2500);
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
				LMP.DescInRRT();
				Logger.info("Enter Description is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter Description is FAILED!!", e);         
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
				Thread.sleep(1000);
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
			if( OTS.DisplayOTSrouterOverView()==true) {
				Logger.info("Display OTS router Overview");
				Thread.sleep(3000);
				try {
					OTS.ClickOnOTSrouterDropDownsymbol();
					Logger.info("Click on OTSrouter DropDown is passed");
				}catch(Exception e) {
					sa.assertTrue(false);
					Logger.error("Click on OTSrouter DropDown is FAILED!!", e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					LMP.ClickOnAutoTestObject();           
					Logger.info("Click On LeadAutoTestObject is PASSED!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On LeadAutoTestObject is FAILED!", e);
					sa.assertAll();
				}
			}
		} catch (Exception e) {
			sa.assertTrue(true);
		}

		Thread.sleep(4500);
		try {
			LR.ClickOnDNDdiagramDropDown();
			Logger.info("Click On DNDdiagram DropDown is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DNDdiagram DropDown is Failed!!", e);
			sa.assertAll();
		}
		Logger.info("******************** Decision Block DND************************");
		Thread.sleep(4500);
		try {
			APOM.Decisionblock_DND();
			Logger.info("Drag And Drop Decision Block is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag And Drop Decision Block is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			APOM.ConnectStartBlock_To_DecisionBlock();
			Logger.info("Connect StartBlock_To_DecisionBlock is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Connect StartBlock_To_DecisionBlock is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			APOM.DoubleClickOnDecisionBlock();
			Logger.info("Double Click On DecisionBlock is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Double Click On DecisionBlock is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			LR.SelectDecisionBlockListElem();
			Logger.info("Click On NewCustomerAccountListOption is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On NewCustomerAccountListOption is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickOnAddButton();
			Logger.info("Click On AddButton is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On AddButton is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickOnSaveButtonForDecisionBlock();
			Logger.info("Click On Save Button For DecisionBlock is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button For DecisionBlock is Failed !!", e);
			sa.assertAll();
		}
		Logger.info("******************** OTS Assignment Block DND ***************************");
		Thread.sleep(4500);
		try {
			APOM.OTSAssignmentBlockDND();
			Logger.info("Drag And Drop AssignmentBlock is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag And Drop AssignmentBlock is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(4000);
		try {
			APOM.ConnectionDecisionBlockY_To_OTSAssignmentBlock();
			Logger.info("Connect RandomSlitA_To_OTSassignmentBlock is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Connect RandomSlitA_To_OTSassignmentBlock is Failed!!!!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			APOM.DoubleClickOnOTSAssignmentBlock();
			Logger.info("Double Click On OTS Assignment Block is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Double Click On OTS Assignment Block is Failed !!",e);
			sa.assertAll();
		}

		Thread.sleep(4500);
		try {
			OTS.ClickOnSelectAssignmentTypeDropDown();
			Logger.info("Click On Assignment Type DropDown is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Assignment Type DropDown is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.SelectLiveClaimOption();
			Logger.info("Select LiveClaim Option is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select LiveClaim Option is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.ClickOnAssignmentOptionDropDown();
			Logger.info("Click On Assignment Option DropDown is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Assignment Option DropDown is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.SelectOptionFromAssignmentOption();
			Logger.info("Select Option From Assignment Option is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Option From Assignment Option is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			OTS.ClickOnEmailNotificationCheckBox();
			Logger.info("Click On Email Notification CheckBox is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Email Notification CheckBox is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			OTS.ClickOnEmailNotificationDropDown();
			Logger.info("Click On Email Notification DropDown is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Email Notification DropDown is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			APOM.SelectAutotestEmailObject();
			Logger.info("Select AutoTestEmailObject is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select AutoTestEmailObject is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			LR.SaveButtonForOTSAssignmentBlock();
			Logger.info("Click On Save Button For AssignmentBlock is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button For AssignmentBlock is Failed",e);
			sa.assertAll();
		}
		Logger.info("*********************** Details Page ************************");
		Thread.sleep(2500);
		try {
			rrp.ClickOnDetail();
			Logger.info("Enter Details Page is passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Details Page is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.DefaultLeadOwnerDropDownforLPWRDropDown();
			Logger.info("Default Lead Owner DropDown is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Default Lead Owner DropDown is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.SelectDefaultLeadOwnerLPWROption();
			Logger.info("SelectDefaultLeadOwnerOption is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("SelectDefaultLeadOwnerOption is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnSaveButtonFordetailsPageOTSCR();
			Logger.info("Click On Save Button For details Page OTS is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button For details Page OTS is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(800);
		try {
			OTS.DisplaySuccessForDefaultLeadOwnerLPWR();
			Logger.info("Display Success is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Success is Failed!!", e);
			sa.assertAll();
		}

		Logger.info("//===============================================APPROVE SCENARIO START========================================//");
		Thread.sleep(4000);
		try {
			LMP.ContextClickOnAutoTestObject();           
			Logger.info("Right Click On AutoTestObject is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On AutoTestObject is FAILED!!", e);
			sa.assertAll();
		} 
		Thread.sleep(2500);
		try {
			rrp.ClickOnApproveObject();
			Logger.info("Click on Approve Button is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Approve Button is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			rrp.ApproveSubmitbtnForTaskList();
			Logger.info("Click again Approve Button is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click again Approve Button is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(4000);
		try {
			rrp.DisplayApproved();
			Logger.info("Displayed Approved button is PASSED!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Approved button is FAILED!!", e);
			sa.assertAll();
		}
		Logger.info("********************* Go back to Email Object In Administartion ********************");
		Thread.sleep(4500);
		try {
			APOM.ClickOnDropDownForMenutab1();
			Logger.info("Click On DropDown For Menu tab is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DropDown For Menu tab is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnAdministrationOption();
			Logger.info("Click On Administration from menu is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Administration from menu is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(7500);
		try {
			APOM.ClickNotificationsDropDown();
			Logger.info("Click on Notifications DropDown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Notifications DropDown is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnDropDownForEmail();
			Logger.info("Click on Email DropDown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Email DropDown is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnAutoTestObject();
			Logger.info("Click On AutoTestObject is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On AutoTestObject is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			APOM.ClickOnDetailTab();
			Logger.info("Click On Detail Tab is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Detail Tab is Failed",e);
			sa.assertAll();
		}
		//************
		Thread.sleep(3500);
		try {
			APOM.ClickOnUsedByDropdown();
			Logger.info("Click On UsedBy Dropdown is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On UsedBy Dropdown is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			TextFromUsedBeRouterName = APOM.GetTextFromUsedBeRouterName.getText();
			Logger.info("Fetch used by router name is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Fetch used by router name is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnDeleteAgainForCompanyPreference();
			Logger.info("Click On Delete Button from the detail tab	is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Button from the detail tab is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnDelete();
			Logger.info("Click On Delete Button	is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			GetTextFromErrorMessage=APOM.GetTextFromErrorMessage.getText();
			Logger.info("Get Text From Error Message is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Get Text From Error Message is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (GetTextFromErrorMessage.contains(TextFromUsedBeRouterName)) {
				Logger.info("Displayed 'Cannot delete,It is Used' Error message is Passed");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed 'Cannot delete,It is Used' Error message is Failed",e);
			sa.assertAll();
		}
		//****

		Logger.info("===================== Used By Operation in Details Page =====================");
		Thread.sleep(3500);
		String TextFromUsedByRouterName="";
		Thread.sleep(2500);
		try {
			TextFromUsedByRouterName = APOM.GetTextFromUsedByRouterName.getText();
			Logger.info("Fetch used by router name is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Fetch used by router name is Failed",e);
			sa.assertAll();
		}

		Logger.info("********* Verify that the 'Used By' object module name and the left menu title are Same Or Not, Once clicking the 'Used By' Router name ************");

		String TextFromLeftMenuTitleAfter="";
		String TextFromLeftMenuTitleBefore ="";
		String TextFromDetails="";
		Thread.sleep(4500);
		try {
			TextFromLeftMenuTitleBefore =APOM.GetTextOfLeftMenuTitle.getText();
			Logger.info("Get Menu Title From Left tree Menu is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Get Menu Title From Left tree Menu is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickUsedByRouterName();
			Logger.info("Click Used By Router Name is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Used By Router Name is FAILED!!!",e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		try {
			TextFromLeftMenuTitleAfter=APOM.GetTextOfLeftMenuTitle.getText();
			Logger.info("Get Menu Title From Left tree Menu is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Get Menu Title From Left tree Menu is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (TextFromLeftMenuTitleBefore.contentEquals(TextFromLeftMenuTitleAfter)) {
				Logger.info(TextFromLeftMenuTitleBefore);
				Logger.info(TextFromLeftMenuTitleAfter);
				Logger.info("Left menu titlt is Not same before and after clicking UsedBy object name is Passed");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.info(TextFromLeftMenuTitleBefore);
			Logger.info(TextFromLeftMenuTitleAfter);
			Logger.error("Left menu titlt is same before and after clicking UsedBy object name is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(6500);
		try {
			TextFromDetails = driver.findElement(By.xpath("(//i[text()='description']//..//span[text()])[2]")).getText();
			Logger.info("Get Object Name From Details tab : "+TextFromDetails);
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Get Object Name From Details tab is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (TextFromDetails.contains("AutoTestObject")) {
				Logger.info("AutoTest Object Name matched with the name from Details tab is Passed");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("AutoTest Object Name matched with the name from Details tab is Failed",e);
			sa.assertAll();
		}

		Logger.info("********************* Go back to Email Object In Administartion ********************");
		Thread.sleep(4500);
		try {
			APOM.ClickOnDropDownForMenutab1();
			Logger.info("Click On DropDown For Menu tab is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DropDown For Menu tab is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnAdministrationOption();
			Logger.info("Click On Administration from menu is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Administration from menu is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(7500);
		try {
			APOM.ClickNotificationsDropDown();
			Logger.info("Click on Notifications DropDown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Notifications DropDown is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnDropDownForEmail();
			Logger.info("Click on Email DropDown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Email DropDown is Failed",e);
			sa.assertAll();
		}

		Logger.info("====================================================Crud operation==================================================================");
		Logger.info("====================================================Rename Scenario==================================================================");
		Thread.sleep(4000);
		try {
			APOM.RightClickOnAutoTestObject();           
			Logger.info("Right Click On LeadAutoTestObject is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On LeadAutoTestObject is Failed!!", e);
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
				APOM.ContextClickOnRenameAutoTestObject();
				Logger.info("Right Click On LeadRenamedAutoTestObject is PASSED!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Right Click On LeadRenamedAutoTestObject is FAILED!", e);
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
						APOM.ContextClickOnRenameAutoTestObject();
						Logger.info("Right Click On LeadRenameAutoTestObject is PASSED!!");
					}catch(Exception e) {
						sa.assertTrue(false);
						Logger.error("Right Click On LeadRenameAutoTestObject is FAILED!!", e);
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
				APOM.RightClickOnAutoTestObject();           
				Logger.info("Right Click On LeadAutoTestObject is PASSED!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Right Click On LeadAutoTestObject is Failed!!", e);
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

		Logger.info("====================================================Clone Scenario==================================================================");
		Thread.sleep(4500);
		while (APOM.DisplayedLeadAutoTestObjectRenameCopy()==true) {
			Logger.info("Displayed LeadAutoTestObjectRenameCopy Object,So Delete that Object");
			Thread.sleep(5000);
			try {
				APOM.RightClickLeadAutoTestObjectAfterClone();
				Logger.info("Right Click On LeadAutoTestObjectRenameCopy Object is PASSED!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Right Click On LeadAutoTestObjectRenameCopy Object is FAILED!", e);
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
						APOM.RightClickLeadAutoTestObjectAfterClone();           
						Logger.info("RightClick On LeadAutoTestObjectRenameCopy Object is PASSED!!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("RightClick On LeadAutoTestObjectRenameCopy Object is Failed!!", e);
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
			Thread.sleep(4500);
			continue;
		}


		Thread.sleep(4000);
		try {
			APOM.ContextClickOnRenameAutoTestObject();
			Logger.info("Right Click On LeadRenamedAutoTestObject is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On LeadRenamedAutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickOnCloneAutoTestObject();
			Logger.info("Click On Clone option is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Clone option is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickOnCloneBtn();
			Logger.info("Click On Clone button is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Clone button is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			if (APOM.DisplayCloneAutoTestObject() == true) {
				Logger.info("Displayed Cloned LeadRenameAutoTestObject is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Cloned LeadRenameAutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Logger.info("=======================================================Save CLONED OBJECT====================================================================");
		Thread.sleep(3000);
		try {
			EATP.SaveButtonForEmailAlertTemplate();
			Logger.info("Save Button For Email is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Save Button For Email is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(700);
		try {
			if (EATP.SavingVerificationMessage()==true) {
				Logger.info("Displayed Saving Verification Message is PASSED!!");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Saving Verification Message is FAILED!!!",e);
			sa.assertAll();
		}
		Logger.info("********************************DELETE CLONED OBJECT SCENARIO*********************************");
		Thread.sleep(2500);
		try {
			APOM.ClickOnDeleteAgainForCompanyPreference();
			Logger.info("Click On Delete Button from the detail tab	is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Button from the detail tab is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnDelete();
			Logger.info("Click On Delete Button	is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Button is Failed",e);
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


		//***
		Logger.info("//==================================== OverView Page Opeartion After approved  ==================================");
		Thread.sleep(3500);
		try {
			APOM.ClickOnEmailFeature();
			Logger.info("Click On Email Feature is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Email Feature is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if(APOM.DisplayEmailOverview()==true) {
				Logger.info("Display Email OverView Page is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Email OverView Page is Failed", e);
			sa.assertAll();
		}


		Logger.info("*****************Verifying Column Header Check Is Disabled******************");
		Thread.sleep(2500);
		try {
			if(APOM.DisplayedColumnHeaderCheckIsDisabled()==true) {
				Logger.info("Displayed Column Header Checkbox Is Disabled is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Column Header Checkbox Is Disabled is is Failed", e);
			sa.assertAll();
		}

		Logger.info("********************** Filter Operation *************************");

		Thread.sleep(1500);
		try {
			APOM.EnterTextInFilterBox();
			Logger.info("Enter Text In FilterBox is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Text In FilterBox is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			if( APOM.DisplayedLeadAutoTestObjectRename()==true) {
				Logger.info("Displayed LeadAutoTestObjectRename is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed LeadAutoTestObjectRename is Failled", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		if (APOM.DisplayedLeadAutTestObjectRenameCheckBox()==true) {
			Logger.info("Displayed LeadAutTestObjectRename CheckBox is Passed");
			try {
				if (APOM.DisplayedLeadAutoTestObjectRenameIsNotUsed() == true) {
					Logger.info("Displayed LeadAutoTestObjectRename is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed LeadAutoTestObjectRename is Failled", e);
				sa.assertAll();
			} 
		}else {
			try {
				if( APOM.DisplayedLeadAutoTestObjectRenameIsUsed()==true) {
					Logger.info("Displayed LeadAutoTestObjectRename Is Used is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed LeadAutoTestObjectRename Is Used is Failled", e);
				sa.assertAll();
			}
		}
		Thread.sleep(1500);
		try {
			APOM.ClearTestFromTheFilterBox();
			Logger.info("Clear Test From The FilterBox is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Clear Test From The FilterBox is FAILED!!", e);
			sa.assertAll();
		}

		//****
	}	
}
