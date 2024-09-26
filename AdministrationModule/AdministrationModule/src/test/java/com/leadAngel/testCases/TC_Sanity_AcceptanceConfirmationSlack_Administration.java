package com.leadAngel.testCases;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.leadAngel.pageObjects.AdministrationPageObjectModel;
import com.leadAngel.pageObjects.DetailsPage_SalesTeam;
import com.leadAngel.pageObjects.EmailAlertsTemplatesPageObjectModel;
import com.leadAngel.pageObjects.HomePage;
import com.leadAngel.pageObjects.LeadRouterPageObjectModel;
import com.leadAngel.pageObjects.OTSnotifications_PageObjectModel;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
public class TC_Sanity_AcceptanceConfirmationSlack_Administration extends BaseClass{
	private static final Logger Logger = LogManager.getLogger(TC_Sanity_AcceptanceConfirmationSlack_Administration.class);

	@Test(description = "Administration_AcceptanceConfirmationSlack_Section")
	@Step("Administration_AcceptanceConfirmationSlack_Section")
	@Description("Administration_AcceptanceConfirmationSlack_Section")
	public void AdministrationTest() throws InterruptedException, AWTException {
		SoftAssert sa = new SoftAssert();
		HomePage hp = new HomePage(driver);
		AdministrationPageObjectModel APOM=new AdministrationPageObjectModel(driver);
		OTSnotifications_PageObjectModel OTSnt= new OTSnotifications_PageObjectModel(driver);
		EmailAlertsTemplatesPageObjectModel EATP=new EmailAlertsTemplatesPageObjectModel(driver);
		LeadRouterPageObjectModel LR=new LeadRouterPageObjectModel(driver);
		DetailsPage_SalesTeam detrrt = new DetailsPage_SalesTeam(driver); 

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
			APOM.ClickNotificationsDropDown();
			Logger.info("Click on NotificationsDropDown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on NotificationsDropDown is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTSnt.ClickOnOTSnotificationsDropDown();
			Logger.info("Click On OTSnotifications DropDown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On OTSnotifications DropDown is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTSnt.ClickOnAcceptanceConfirmationSlackTab();
			Logger.info("Click On AcceptanceConfirmationSlack is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On AcceptanceConfirmationSlack is Failed",e);
			sa.assertAll();
		}

		Logger.info("========================================= Lead AcceptanceConfirmationCRM Operation ======================================");
		Thread.sleep(2500);
		try {
			OTSnt.ClickOnRestoreDefaultButton();
			Logger.info("Click On RestoreDefault Button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On RestoreDefault Button is Faileed",e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		WebElement NameContentinLeadd = driver.findElement(By.xpath("//div[@id='editor']//div[text()='Name: {!LeadOwner.Name}']"));
		String NameTextLeadd = NameContentinLeadd.getText();
		String locationOfNameLeadd=NameContentinLeadd.getLocation().toString();
		try {
			if (OTSnt.locationOfNameSlack.contentEquals(locationOfNameLeadd)&&OTSnt.NameTextLeadSlack.contentEquals(NameTextLeadd)) {
				Logger.info(NameTextLeadd+" is perfectly located in Lead Acceptance Confirmation Slack Message Body");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error(NameTextLeadd+" is not perfectly located in Lead Acceptance Confirmation Slack Message Body",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		WebElement EmailContentLeadd = driver.findElement(By.xpath("//div[@id='editor']//div[text()='Email: {!LeadOwner.Email}']"));
		String EmailTextLeadd = EmailContentLeadd.getText();
		String locationOfEmailLeadd=EmailContentLeadd.getLocation().toString();
		Thread.sleep(2500);
		try {
			if (OTSnt.locationOfEmailSlack.contentEquals(locationOfEmailLeadd)&&OTSnt.EmailTextLeadSlack.contentEquals(EmailTextLeadd)) {
				Logger.info(EmailTextLeadd+" is perfectly located in Lead Acceptance Confirmation Slack Message Body");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error(EmailTextLeadd+" is not perfectly located in Lead Acceptance Confirmation Slack Message Body",e);
			sa.assertAll();
		}


		for (int k = 0; k < 2; k++) {

			if (k==1) {
				Logger.info("========================================= Contact AcceptanceConfirmationSlack Operation ======================================");
				Thread.sleep(3000);
				try {
					OTSnt.ClickOnContactAcceptanceConfirmationSlackTab();
					Logger.info("Click On Contact AcceptanceConfirmationSlack Tab is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Contact AcceptanceConfirmationSlack Tab is Failed",e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					OTSnt.ClickOnContinueButton();
					Logger.info("Click On Continue Button is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Continue Button is Failed",e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					OTSnt.ClickOnRestoreDefaultButton();
					Logger.info("Click On RestoreDefault Button for Contact AcceptanceConfirmationSlack is Passed");
				}catch(Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On RestoreDefault Button for Contact AcceptanceConfirmationSlack is Faileed",e);
					sa.assertAll();
				}

				Thread.sleep(2500);
				WebElement NameContentContact = driver.findElement(By.xpath("//div[@id='editor']//div[text()='Name: {!ContactOwner.Name}']"));
				String NameTextContact = NameContentContact.getText();
				String locationOfNameContact=NameContentContact.getLocation().toString();
				try {
					if (OTSnt.locationOfNameSlack.contentEquals(locationOfNameContact)&&OTSnt.NameTextContactSlack.contentEquals(NameTextContact)) {
						Logger.info(NameTextContact+" is perfectly located in Contact AcceptanceConfirmationSlack Message Body");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error(NameTextContact+" is not perfectly located in Contact AcceptanceConfirmationSlack Message Body",e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				WebElement EmailContentContact = driver.findElement(By.xpath("//div[@id='editor']//div[text()='Email: {!ContactOwner.Email}']"));
				String EmailTextContact = EmailContentContact.getText();
				String locationOfEmailContact=EmailContentContact.getLocation().toString();
				Thread.sleep(2500);
				try {
					if (OTSnt.locationOfEmailSlack.contentEquals(locationOfEmailContact)&&OTSnt.EmailTextContactSlack.contentEquals(EmailTextContact)) {
						Logger.info(EmailTextContact+" is perfectly located in Contact AcceptanceConfirmationSlack Message Body");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error(EmailTextContact+" is not perfectly located in Contact AcceptanceConfirmationSlack Message Body",e);
					sa.assertAll();
				}
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
			for (int i = 0; i < CountAllLinks;i++) {

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
				Thread.sleep(2500);
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
			for (int i = 0; i < CountAllLinks2; i++) {

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

			Logger.info("******************************************* Restore operation ***************************************");
			Thread.sleep(2500);
			try {
				OTSnt.ClickOnRestoreDefaultButton();
				Logger.info("Click On RestoreDefault Button is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On RestoreDefault Button is Faileed",e);
				sa.assertAll();
			}
			if (k==0) {
				Thread.sleep(2500);
				WebElement NameContentinLead = driver.findElement(By.xpath("//div[@id='editor']//div[text()='Name: {!LeadOwner.Name}']"));
				String NameTextLead = NameContentinLead.getText();
				String locationOfNameLead=NameContentinLead.getLocation().toString();
				try {
					if (OTSnt.locationOfNameSlack.contentEquals(locationOfNameLead)&&OTSnt.NameTextLeadSlack.contentEquals(NameTextLead)) {
						Logger.info(NameTextLead+" is perfectly located in Lead Acceptance Confirmation Slack Message Body");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error(NameTextLead+" is not perfectly located in Lead Acceptance Confirmation Slack Message Body",e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				WebElement EmailContentLead = driver.findElement(By.xpath("//div[@id='editor']//div[text()='Email: {!LeadOwner.Email}']"));
				String EmailTextLead = EmailContentLead.getText();
				String locationOfEmailLead=EmailContentLead.getLocation().toString();
				Thread.sleep(2500);
				try {
					if (OTSnt.locationOfEmailSlack.contentEquals(locationOfEmailLead)&&OTSnt.EmailTextLeadSlack.contentEquals(EmailTextLead)) {
						Logger.info(EmailTextLead+" is perfectly located in Lead Acceptance Confirmation Slack Message Body");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error(EmailTextLead+" is not perfectly located in Lead Acceptance Confirmation Slack Message Body",e);
					sa.assertAll();
				}
			}

			if (k==1) {
				Thread.sleep(2500);
				WebElement NameContentContact = driver.findElement(By.xpath("//div[@id='editor']//div[text()='Name: {!ContactOwner.Name}']"));
				String NameTextContact = NameContentContact.getText();
				String locationOfNameContact=NameContentContact.getLocation().toString();
				try {
					if (OTSnt.locationOfNameSlack.contentEquals(locationOfNameContact)&&OTSnt.NameTextContactSlack.contentEquals(NameTextContact)) {
						Logger.info(NameTextContact+" is perfectly located in Contact AcceptanceConfirmationSlack Message Body");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error(NameTextContact+" is not perfectly located in Contact AcceptanceConfirmationSlack Message Body",e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				WebElement EmailContentContact = driver.findElement(By.xpath("//div[@id='editor']//div[text()='Email: {!ContactOwner.Email}']"));
				String EmailTextContact = EmailContentContact.getText();
				String locationOfEmailContact=EmailContentContact.getLocation().toString();
				Thread.sleep(2500);
				try {
					if (OTSnt.locationOfEmailSlack.contentEquals(locationOfEmailContact)&&OTSnt.EmailTextContactSlack.contentEquals(EmailTextContact)) {
						Logger.info(EmailTextContact+" is perfectly located in Contact AcceptanceConfirmationSlack Message Body");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error(EmailTextContact+" is not perfectly located in Contact AcceptanceConfirmationSlack Message Body",e);
					sa.assertAll();
				}
			}
			continue;
		}//for
	}
}
