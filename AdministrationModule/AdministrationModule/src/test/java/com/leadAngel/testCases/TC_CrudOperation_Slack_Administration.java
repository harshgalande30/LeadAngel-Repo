package com.leadAngel.testCases;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
public class TC_CrudOperation_Slack_Administration extends BaseClass{
	private static final Logger Logger = LogManager.getLogger(TC_CrudOperation_Slack_Administration.class);

	@Test(description = "Administration_Slack _Section")
	@Step("Administration_Slack_Section")
	@Description("Administration_Slack_Section")
	public void AdministrationTest() throws InterruptedException, AWTException {
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
			APOM.RightClickonSlack();
			Logger.info("Right click on Slack is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right click on Slack is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnNewSlack();
			Logger.info("Click on NewSlack is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on NewSlack is Failed",e);
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
				APOM.ClickSlackDropdown();
				Logger.info("Click on Slack Dropdown is passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on Slak Dropdown is FAILED!!", e);
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
				APOM.RightClickonSlack();
				Logger.info("Right Click on Slack is PASSED!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Right Click on Slack is Failed!!", e);
				sa.assertAll();
			}
			Thread.sleep(3500);
			try {
				LMP.ClickOnNewObject();
				Logger.info("Click on New Slack is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on New Slack is FAILED!!", e);
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


		Thread.sleep(4500);
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
			EATP.ClickSelectDropDownFor_Recipient_TO_LeadOwnerMappedSDRSlack();
			Logger.info("Click Select DropDown For_Recipient_TO_LeadOwnerMappedSDR is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Select DropDown For_Recipient_TO_LeadOwnerMappedSDR is FAILED!!!",e);
			sa.assertAll();
		}
		//****************
		Thread.sleep(3000);
		String ObjectNameBeforeClickNewTabLink = driver.findElement(By.xpath("(//mat-icon[@fonticon='open_in_new'])[1]//..//..//span[text()]")).getText();
		Logger.info("Object Name Before Click NewTab Link: "+ObjectNameBeforeClickNewTabLink);
		Thread.sleep(3000);
		try {
			APOM.ClickOnOpenInNewTabLinkSlack();
			Logger.info("Click On Open In New Tab Link is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Open In New Tab Link is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(5500);
		Set<String> Allwindow = driver.getWindowHandles();
		Thread.sleep(4500);
		for (String wh : Allwindow) {
			driver.switchTo().window(wh);
			if (wh.equals(ParentWindow)) {
				continue;
			} else {
				Thread.sleep(4500);
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
			EATP.ClickSelectDropDownFor_Recipient_TO_AccountOwnerMappedSDRSlack();
			Logger.info("Click Select DropDown For_Recipient_TO_AccountOwnerMappedSDR is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Select DropDown For_Recipient_TO_AccountOwnerMappedSDR is FAILED!!!",e);
			sa.assertAll();
		}
		//****************
		Thread.sleep(3000);
		String ObjectNameBeforeClickNewTabLink1 = driver.findElement(By.xpath("(//mat-icon[@fonticon='open_in_new'])[1]//..//..//span[text()]")).getText();
		Logger.info("Object Name Before Click NewTab Link: "+ObjectNameBeforeClickNewTabLink1);
		Thread.sleep(3000);
		try {
			APOM.ClickOnOpenInNewTabLinkSlack();
			Logger.info("Click On Open In New Tab Link is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Open In New Tab Link is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(5500);
		Set<String> Allwindow1 = driver.getWindowHandles();
		Thread.sleep(4500);
		for (String wh : Allwindow1) {
			driver.switchTo().window(wh);
			if (wh.equals(ParentWindow)) {
				continue;
			} else {
				Thread.sleep(4500);
				String ObjectNameAfterClickNewTabLink = driver.findElement(By.xpath("(//i[text()='description']//..//span[text()])[2]")).getText();
				Logger.info("Object Name After Click NewTab Link: "+ObjectNameAfterClickNewTabLink);
				Thread.sleep(4500);
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
			EATP.CheckBoxFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccountSlack();
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
			Logger.info("Select First Option For NotifyBasedLookUpField is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select First Option For NotifyBasedLookUpField is FAILED!!!",e);
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
		Thread.sleep(1500);
		try {
			if (EATP.DisplaySuccesMessageFor_Recipient_TO_SlackChannels() == true) {
				Logger.info("Displayed Success message is  PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Success message is FAILED!", e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		try {
			EATP.ClickOnDropDownFor_Recipient_TO_OTSBroadcastNotificationRecipientsSlack();
			Logger.info("Click On DropDown For_Recipient_TO_OTSBroadcastNotificationRecipients is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DropDown For_Recipient_TO_OTSBroadcastNotificationRecipients is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			EATP.SelectFirstOptionForAccTeamAndNotifyBasedLookUpField();
			Logger.info("Select First Option For OTSBroadcastNotificationRecipients is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select First Option For OTSBroadcastNotificationRecipients is FAILED!!!",e);
			sa.assertAll();
		}

		Logger.info("************************************* Slack Channels ****************************************");
		Thread.sleep(2500);
		try {
			EATP.CheckBoxFor_Recipient_TO_SlackChannels();
			Logger.info("CheckBox For_Recipient_TO_SlackChannels is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("CheckBox For_Recipient_TO_SlackChannels is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			EATP.ClickOnRefreshButtonFor_Recipient_TO_SlackChannels();
			Logger.info("Click On Refresh Button For_Recipient_TO_SlackChannels is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Refresh Button For_Recipient_TO_SlackChannels is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			if (EATP.DisplaySuccesMessageFor_Recipient_TO_SlackChannels() == true) {
				Logger.info("Displayed Success message is  PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Success message is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			EATP.ClickSelectDropDownFor_Recipient_TO_SlackChannels();
			Logger.info("Click Select DropDown For_Recipient_TO_SlackChannels is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Select DropDown For_Recipient_TO_SlackChannels is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			EATP.SelectFirstOptionForAccTeamAndNotifyBasedLookUpField();
			Logger.info("Select FirstOption For_RecipientTO is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select First Option For_RecipientTO is FAILED!!!",e);
			sa.assertAll();
		}

		Logger.info("************************************* Slack Users ****************************************");
		Thread.sleep(2500);
		try {
			EATP.CheckBoxFor_Recipient_TO_SlackUsers();
			Logger.info("Check Box For_Recipient_TO_SlackUsers is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Check Box For_Recipient_TO_SlackUsers is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			EATP.ClickOnRefreshButtonFor_Recipient_TO_SlackUsers();
			Logger.info("Click On Refresh Button For_Recipient_TO_SlackUsers is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Refresh Button For_Recipient_TO_SlackUsers is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			if (EATP.DisplaySuccesMessageFor_Recipient_TO_SlackChannels() == true) {
				Logger.info("Displayed Success message is  PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Success message is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			EATP.ClickSelectDropDownFor_Recipient_TO_SlackUsers();
			Logger.info("Click Select DropDown For_Recipient_TO_SlackUsers is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Select DropDown For_Recipient_TO_SlackUsers is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			EATP.SelectFirstOptionFor_RecipientTO_OR_RecipientCC();
			Logger.info("Select First Option For_RecipientTO is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select First Option For_RecipientTO is FAILED!!!",e);
			sa.assertAll();
		}

		Logger.info("*************************************Additional Recipients ****************************************");
		Thread.sleep(2500);
		try {
			EATP.CheckBoxFor_Recipient_TO_AdditionalRecipientsSlack();
			Logger.info("Click On Check Box For_Recipient_TO_AdditionalRecipients is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CheckBox For_Recipient_TO_AdditionalRecipients is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			EATP.EnterMailIDFor_Recipient_TO_AdditionalRecipientsSlack();
			Logger.info("Enter MailID For_Recipient_TO_AdditionalRecipients is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter MailID For_Recipient_TO_AdditionalRecipients is FAILED!!!",e);
			sa.assertAll();
		}


		Logger.info("=======================================================Header====================================================================");
		Thread.sleep(2500);
		try {
			EATP.EnterHeader();
			Logger.info("Enter Header is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Header is FAILED!!!",e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		try {
			EATP.ClickOnBracesButtonForHeader();
			Logger.info("Click On Braces Button For Header is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Braces Button For Header is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			EATP.ClickOnSelectObjectDropDownForInsertValueInSubject();
			Logger.info("Click On Select Object DropDown For Insert Value In Header is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Select Object DropDown For Insert Value In Header is FAILED!!!",e);
			sa.assertAll();
		}
		List<WebElement> AllLinksOfOptionn = driver.findElements(By.xpath("//ng-dropdown-panel[@aria-label='Options list']//div[@role='option']"));
		int CountAllLinks =AllLinksOfOptionn.size();
		for (int i = 0; i < 3;i++) {

			if (i!=0) {
				Thread.sleep(3000);
				try {
					EATP.ClickOnBracesButtonForHeader();
					Logger.info("Click On Braces Button For Header is PASSED!!");
				}catch(Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Braces Button For Header is FAILED!!!",e);
					sa.assertAll();
				}
				Thread.sleep(3500);
				try {
					EATP.ClickOnSelectObjectDropDownForInsertValueInSubject();
					Logger.info("Click On Select Object DropDown For Insert Value In Header is PASSED!!");
				}catch(Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Select Object DropDown For Insert Value In Header is FAILED!!!",e);
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
			EATP.EnterBodyForSlack();
			Logger.info("Enter Message Body is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Message Body is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			EATP.ClickOnBracesButtonForBody();
			Logger.info("Click On Braces Button For Body is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Braces Button For Body is FAILED!!!",e);
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
		for (int i = 0; i < 3; i++) {

			if (i!=0) {
				Thread.sleep(2500);
				try {
					EATP.ClickOnBracesButtonForBody();
					Logger.info("Click On Braces Button For Body is PASSED!!");
				}catch(Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Braces Button For Body is FAILED!!!",e);
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


		Thread.sleep(2500);
		Robot r=new Robot();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		Logger.info("Selected all the text from the message body input box");
		Thread.sleep(2500);
		try {
			APOM.ClickOnBoldButton();
			Logger.info("Click On Bold Button is PASSED");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Bold Button is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(800);
		try {
			if (APOM.DisplayedSelectedTextIsBold()==true) {
				Logger.info("Displayed Selected Text Is Bold is Passed");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Selected Text Is Bold is FAILED!!!",e);
			sa.assertAll();
		}	

		Thread.sleep(2500);
		try {
			APOM.ClickOnItalicButton();
			Logger.info("Click On Italic Button is PASSED");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Italic Button is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(800);
		try {
			if (APOM.DisplayedSelectedTextIsItalic()==true) {
				Logger.info("Displayed Selected Text Is Italic is Passed");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Selected Text Is Italic is FAILED!!!",e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		try {
			APOM.ClickOnStrikethroughButton();
			Logger.info("Click On Strikethrough Button is PASSED");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Strikethrough Button is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(800);
		try {
			if (APOM.DisplayedSelectedTextIsStrikethrough()==true) {
				Logger.info("Displayed Selected Text Is Strikethrough is Passed");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Selected Text Is Strikethrough is FAILED!!!",e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		try {
			APOM.ClickOnBlockquoteButton();
			Logger.info("Click On Blockquote Button is PASSED");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Blockquote Button is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(800);
		try {
			if (APOM.DisplayedSelectedTextIsBlockquote()==true) {
				Logger.info("Displayed Selected Text Is Blockquote is Passed");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Selected Text Is Blockquote is FAILED!!!",e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		try {
			APOM.ClickOnListNumbersButton();
			Logger.info("Click On ListNumbers Button is PASSED");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On ListNumbers Button is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(800);
		try {
			if (APOM.DisplayedSelectedTextIsListNumbers()==true) {
				Logger.info("Displayed Selected Text Is ListNumbers is Passed");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Selected Text Is ListNumbers is FAILED!!!",e);
			sa.assertAll();
		}


		Thread.sleep(2500);
		try {
			APOM.ClickOnListButton();
			Logger.info("Click On UnorderList Button is PASSED");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On UnorderList Button is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(800);
		try {
			if (APOM.DisplayedSelectedTextIsIncertUnorderList()==true) {
				Logger.info("Displayed Selected Text Is UnorderList is Passed");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Selected Text Is UnorderList is FAILED!!!",e);
			sa.assertAll();
		}

		Logger.info("******************** Link Operation ********************");
		Thread.sleep(2500);
		try {
			APOM.ClickOnLinkButton();
			Logger.info("Click On Link Button is PASSED");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Link Button is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.EnterURL();
			Logger.info("Enter URL is PASSED");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter URL is FAILED!!!",e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		try {
			APOM.ClickOnBracesForURL();
			Logger.info("Click On Braces For URL is PASSED");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Braces For URL is FAILED!!!",e);
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
		Thread.sleep(2500);
		try {
			LR.ClickOnInsertValueSelectFieldOptionUpdateDataValue();
			Logger.info("Click On Select Object Option is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Select Object Option is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickOnInsertValueSelectFieldDropDownUpdateDataValue();
			Logger.info("Click On Select Field DropDown is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Select Field DropDown is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickOnInsertValueSelectFieldOptionUpdateDataValue();
			Logger.info("Click On Select Field Option is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Select Field Option is FAILED!!!",e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		try {
			APOM.ClickOnMergeButton();
			Logger.info("Click On Merge Button is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Merge Button is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnAddURLButton();
			Logger.info("Click On AddURL Button is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On AddURL Button is FAILED!!!",e);
			sa.assertAll();
		}

		Logger.info("******************** Footer  ********************");
		Thread.sleep(2500);
		try {
			APOM.EnterFooter();
			Logger.info("Enter Footer is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Footer is FAILED!!!",e);
			sa.assertAll();
		}


		Logger.info("=======================================================Save====================================================================");
		Thread.sleep(2500);
		try {
			EATP.SaveButtonForEmailAlertTemplate();
			Logger.info("Save Button For slack is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Save Button For slack is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(300);
		try {
			EATP.SavingVerificationMessageForSlack();
			Logger.info("Saving Verification Message is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Saving Verification Message is FAILED!!!",e);
			sa.assertAll();
		}
		Logger.info("====================================================Refresh==================================================================");
		driver.navigate().refresh();
		Logger.info("Refreshing The Page!!");


		Logger.info("====================================================Verification of Recipient_TO_ Operation==================================================================");
		Thread.sleep(4000);
		Thread.sleep(2500);
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
		Thread.sleep(500);
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
		Thread.sleep(500);
		try {
			if (EATP.VerifyCheckBoxFor_Recipient_TO_LeadOwnerMappedSDR()==true) {
				Logger.info(EATP.VerifyCheckBoxFor_Recipient_TO_LeadOwnerMappedSDR());
				Logger.info("Verify CheckBox For_Recipient_TO_LeadOwnerMappedSDR is Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verify CheckBox For_Recipient_TO_LeadOwnerMappedSDR is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(500);
		try {
			if (EATP.VerificatinOfSelectTextBoxBorderFor_Recipient_TO_LeadOwnerMappedSDRSlack()==true) {
				Logger.info(EATP.VerificatinOfSelectTextBoxBorderFor_Recipient_TO_LeadOwnerMappedSDRSlack());
				Logger.info("Verification Of Select TextBox Border For_Recipient_TO_LeadOwnerMappedSDR is Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verification Of Select TextBox Border For_Recipient_TO_LeadOwnerMappedSDR is Failed !!",e);
			sa.assertAll();
		}
		Logger.info("*************************************Verification AccountOwnerMappedSDR ****************************************");
		Thread.sleep(500);
		try {
			if (EATP.VerifyCheckBoxFor_Recipient_TO_AccountOwnerMappedSDR()==true) {
				Logger.info(EATP.VerifyCheckBoxFor_Recipient_TO_AccountOwnerMappedSDR());
				Logger.info("Verify CheckBox For_Recipient_TO_AccountOwnerMappedSDR is Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verify CheckBox For_Recipient_TO_AccountOwnerMappedSDR is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(500);
		try {
			if (EATP.VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AccountOwnerMappedSDRSlack()==true) {
				Logger.info(EATP.VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AccountOwnerMappedSDRSlack());
				Logger.info("Verification Of Select TextBox Border For_Recipient_TO_AccountOwnerMappedSDR is Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verification Of Select TextBox Border For_Recipient_TO_AccountOwnerMappedSDR is Failed !!",e);
			sa.assertAll();
		}
		Logger.info("*************************************Verification AccountTeam ****************************************");
		Thread.sleep(500);
		try {
			if (EATP.VerifyCheckBoxFor_Recipient_TO_AccountTeam()==true) {
				Logger.info(EATP.VerifyCheckBoxFor_Recipient_TO_AccountTeam());
				Logger.info("Verify CheckBox For_Recipient_TO_AccountTeam is Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verify CheckBox For_Recipient_TO_AccountTeam is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(5000);
		try {
			if (EATP.VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AccountTeam()==true) {
				Logger.info(EATP.VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AccountTeam());
				Logger.info("Verification Of Select TextBox Border For_Recipient_TO_AccountTeam is Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verification Of Select TextBox Border For_Recipient_TO_AccountTeam is Failed !!",e);
			sa.assertAll();
		}
		Logger.info("*************************************Verification NotifyBasedOnTheLookupFieldOnAccount****************************************");
		Thread.sleep(500);
		try {
			if (EATP.VerifyCheckBoxFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccountSlack()==true) {
				Logger.info(EATP.VerifyCheckBoxFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccountSlack());
				Logger.info("Verify CheckBox For_Recipient_TO_NotifyBasedOnTheLookupField On Account is Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verify CheckBox For_Recipient_TO_NotifyBasedOnTheLookupField On Account is Failed !!",e);
			sa.assertAll();
		}		
		Thread.sleep(500);
		try {
			if (EATP.VerificatinOfSelectTextBoxBorderFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccountSlack()==true) {
				Logger.info(EATP.VerificatinOfSelectTextBoxBorderFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccountSlack());
				Logger.info("Verification of Select TextBox Border For_Recipient_TO_NotifyBasedOnTheLookupField On Account is Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verification of Select TextBox Border For_Recipient_TO_NotifyBasedOnTheLookupField On Account is Failed !!",e);
			sa.assertAll();
		}
		Logger.info("*************************************Verification OTS Broadcast Notification Recipients****************************************");
		Thread.sleep(500);
		try {
			if (EATP.VerifyCheckBoxFor_Recipient_TO_OTSBroadcastNotificationRecipients()==true) {
				Logger.info(EATP.VerifyCheckBoxFor_Recipient_TO_OTSBroadcastNotificationRecipients());
				Logger.info("Verify Check Box For_Recipient_TO_OTSBroadcastNotificationRecipients is Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verify CheckBox For_Recipient_TO_OTSBroadcastNotificationRecipients is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(500);
		try {
			if (EATP.VerificatinOfSelectTextBoxBorderFor_Recipient_TO_OTSBroadcastNotificationRecipientsSlack()==true) {
				Logger.info(EATP.VerificatinOfSelectTextBoxBorderFor_Recipient_TO_OTSBroadcastNotificationRecipientsSlack());
				Logger.info("Verification Of Select TextBox Border For_Recipient_TO_OTSBroadcastNotificationRecipients is Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verification Of Select TextBox Border For_Recipient_TO_OTSBroadcastNotificationRecipients is Failed !!",e);
			sa.assertAll();
		}


		Logger.info("*************************************Verification Slack Channels****************************************");
		Thread.sleep(500);
		try {
			if (EATP.VeryfyCheckBoxFor_Recipient_TO_SlackChannels()==true) {
				Logger.info(EATP.VeryfyCheckBoxFor_Recipient_TO_SlackChannels());
				Logger.info("Veryfy CheckBox For_Recipient_TO_SlackChannels is Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Veryfy CheckBox For_Recipient_TO_SlackChannels is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(500);
		try {
			if (EATP.VerifyBorderFor_Recipient_TO_SlackChannels()==true) {
				Logger.info(EATP.VerifyBorderFor_Recipient_TO_SlackChannels());
				Logger.info("Verify Border For_Recipient_TO_SlackChannels is Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verify BorderFor_Recipient_TO_SlackChannels is Failed !!",e);
			sa.assertAll();
		}

		Logger.info("*************************************Verification Slack Channels****************************************");
		Thread.sleep(500);
		try {
			if (EATP.VeryfyCheckBoxFor_Recipient_TO_SlackUsers()==true) {
				Logger.info(EATP.VeryfyCheckBoxFor_Recipient_TO_SlackUsers());
				Logger.info("Veryfy CheckBox For_Recipient_TO_SlackUsers is Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("VeryfyCheckBoxFor_Recipient_TO_SlackUsers is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(500);
		try {
			if (EATP.VerifyBorderFor_Recipient_TO_SlackUsers()==true) {
				Logger.info(EATP.VerifyBorderFor_Recipient_TO_SlackUsers());
				Logger.info("Verify Border For_Recipient_TO_SlackUsers is Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verify Border For_Recipient_TO_SlackUsers is Failed !!",e);
			sa.assertAll();
		}

		Logger.info("*************************************Verification AdditionalRecipients****************************************");
		Thread.sleep(500);
		try {
			if (EATP.VerifyCheckBoxFor_Recipient_TO_AdditionalRecipientsSlack()==true) {
				Logger.info(EATP.VerifyCheckBoxFor_Recipient_TO_AdditionalRecipientsSlack());
				Logger.info("Verify CheckBox For_Recipient_TO_AdditionalRecipients is Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verify CheckBox For_Recipient_TO_AdditionalRecipients is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(500);
		try {
			if (EATP.VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AdditionalRecipientsSlack()==true) {
				Logger.info(EATP.VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AdditionalRecipientsSlack());
				Logger.info("Verification Of Select TextBox Border For_Recipient_TO_AdditionalRecipients is Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Verification Of Select TextBox Border For_Recipient_TO_AdditionalRecipients is Failed !!",e);
			sa.assertAll();
		}

		Logger.info("//*********************************************** Verification link PopUp*******************************************");

		Thread.sleep(2500);
		try {
			EATP.DoubleClickOnLink();
			Logger.info("Double Click On Assignment3 Block is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Double Click On Assignment3 Block is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnBracesForURL();
			Logger.info("Click On Braces For URL is PASSED");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Braces For URL is FAILED!!!",e);
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
		Thread.sleep(2500);
		try {
			LR.ClickOnInsertValueSelectFieldOption2UpdateDataValue();
			Logger.info("Click On Select Object Option is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Select Object Option is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickOnInsertValueSelectFieldDropDownUpdateDataValue();
			Logger.info("Click On Select Field DropDown is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Select Field DropDown is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickOnInsertValueSelectFieldOptionUpdateDataValue();
			Logger.info("Click On Select Field Option is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Select Field Option is FAILED!!!",e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		try {
			APOM.ClickOnMergeButton();
			Logger.info("Click On Merge Button is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Merge Button is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnAddURLButton();
			Logger.info("Click On AddURL Button is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On AddURL Button is FAILED!!!",e);
			sa.assertAll();
		}
		Logger.info("======================= Save ===========================");
		Thread.sleep(2500);
		try {
			EATP.SaveButtonForEmailAlertTemplate();
			Logger.info("Save Button For slack is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Save Button For slack is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(300);
		try {
			EATP.SavingVerificationMessageForSlack();
			Logger.info("Saving Verification Message is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Saving Verification Message is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			EATP.DoubleClickOnLink();
			Logger.info("Double Click On Assignment3 Block is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Double Click On Assignment3 Block is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if(APOM.DisplayedAddURLButton()==true);
			Logger.info("Displayed AddURL Button is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed AddURL Button is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnCancelButton();
			Logger.info("Click On Cancel Button is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Cancel Button is Failed !!",e);
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
			Logger.error("Click On Copy Button  is Failed",e);
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
			APOM.ClickOnSlackFeature();
			Logger.info("Click On Slack Feature is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Slack Feature is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(4000);
		try {
			if(APOM.DisplaySlackOverview()==true) {
				Logger.info("Display Slack OverView Page is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Slack OverView Page is Failed", e);
			sa.assertAll();
		}

		Thread.sleep(1500);
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

		Thread.sleep(3500);
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
		Thread.sleep(4500);
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
			APOM.ClickOnSlackCheckBox();
			Logger.info("Click On Salck  CheckBox is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Slack  CheckBox is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			OTS.ClickOnSlackNotificationDropDown();
			Logger.info("Click On Slack  DropDown is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Slack  DropDown is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			APOM.SelectAutotestEmailObject();
			Logger.info("Select AutotestSlack Object is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select AutotestSlack Object is Failed !!", e);
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
		Logger.info("********************* Go back to Slack Object In Administartion ********************");
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
			APOM.ClickSlackDropdown();
			Logger.info("Click on Slack Dropdown is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Slak Dropdown is FAILED!!", e);
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

		Logger.info("********************* Go back to Slack Object In Administartion ********************");
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
			APOM.ClickSlackDropdown();
			Logger.info("Click on Slack Dropdown is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Slak Dropdown is FAILED!!", e);
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


			Logger.info("Creating New Object!!");

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
			if (EATP.SavingVerificationMessageSlack()==true) {
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
			APOM.ClickOnSlackFeature();
			Logger.info("Click On Slack Feature is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Slack Feature is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if(APOM.DisplaySlackOverview()==true) {
				Logger.info("Display Slack OverView Page is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Slack OverView Page is Failed", e);
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
