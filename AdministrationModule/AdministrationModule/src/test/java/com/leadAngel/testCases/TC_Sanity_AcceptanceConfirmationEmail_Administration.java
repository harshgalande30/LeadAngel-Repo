package com.leadAngel.testCases;
import java.awt.AWTException;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
public class TC_Sanity_AcceptanceConfirmationEmail_Administration extends BaseClass{
	private static final Logger Logger = LogManager.getLogger(TC_Sanity_AcceptanceConfirmationEmail_Administration.class);

	@Test(description = "Administration_AcceptanceConfirmationEmail_Section")
	@Step("Administration_AcceptanceConfirmationEmail_Section")
	@Description("Administration_AcceptConfirmation_Section")
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
			OTSnt.ClickOnAcceptanceConfirmationEmail();
			Logger.info("Click On AcceptanceConfirmationEmail is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On AcceptanceConfirmationEmail is Failed",e);
			sa.assertAll();
		}
		Logger.info("=========================================  LeadAcceptanceConfirmationEmail Operation ======================================");

		Thread.sleep(2500);
		try {
			OTSnt.ClickOnRestoreDefaultButton();
			Logger.info("Click On RestoreDefault Button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On RestoreDefault Button is Faileed",e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		String textInsideTextareaLead="";
		String textInsideTextareaContact="";
		try {
			WebElement textarea = driver.findElement(By.tagName("textarea"));
			textInsideTextareaLead = textarea.getAttribute("value");
			System.out.println("Text inside the textarea Click On RestoreDefault Button: " + textInsideTextareaLead);
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Fetching Text inside the textarea is Faileed",e);
			sa.assertAll();
		}

		for (int i = 0; i <2; i++) {

			if (i==1) {
				Logger.info("=========================================  ContactAcceptanceConfirmationEmail Operation ======================================");

				Thread.sleep(3000);
				try {
					OTSnt.ClickOnContactAcceptanceConfirmationEmailTab();
					Logger.info("Click On Contact AcceptanceConfirmationEmail Tab is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Contact AcceptanceConfirmationEmail Tab is Failed",e);
					sa.assertAll();
				}
				Thread.sleep(1500);
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
					Logger.info("Click On RestoreDefault Button for Contact AcceptanceConfirmationEmail is Passed");
				}catch(Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On RestoreDefault Button for Contact AcceptanceConfirmationEmail is Failed",e);
					sa.assertAll();
				}	
				Thread.sleep(1500);
				try {
					WebElement textarea = driver.findElement(By.tagName("textarea"));
					textInsideTextareaContact = textarea.getAttribute("value");
					System.out.println("Text inside the textarea Click On RestoreDefault Button: " + textInsideTextareaContact);
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Fetching Text inside the textarea is Faileed",e);
					sa.assertAll();
				}
			}

			Logger.info("******************************************* Subject snippet operation ***************************************");
			Thread.sleep(6000);
			try {
				OTSnt.ClickOnInsertSnippetButtonForSubject();
				Logger.info("Click On InsertSnippet Button is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On InsertSnippet Button is FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(3000);
			try {
				EATP.ClickOnSelectObjectDropDownForInsertValueInSubject();
				Logger.info("Click On SelectObject DropDown For InsertValue is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On SelectObject DropDown For InsertValue is FAILED!!!",e);
				sa.assertAll();
			}
			List<WebElement> AllLinksOfSelectObjectListBox = driver.findElements(By.xpath("//ng-dropdown-panel[@role='listbox']//div//span[text()]"));
			int CountAllLinks =AllLinksOfSelectObjectListBox.size();

			for (int j = 0; j < CountAllLinks; j++) {

				if (j!=0) {
					Thread.sleep(2500);
					try {
						OTSnt.ClickOnInsertSnippetButtonForSubject();
						Logger.info("Click On InsertSnippet Button is PASSED!!");
					}catch(Exception e) {
						sa.assertTrue(false);
						Logger.error("Click On InsertSnippet Button is FAILED!!!",e);
						sa.assertAll();
					}
					Thread.sleep(2500);
					try {
						EATP.ClickOnSelectObjectDropDownForInsertValueInSubject();
						Logger.info("Click On SelectObject DropDown For InsertValue is PASSED!!");
					}catch(Exception e) {
						sa.assertTrue(false);
						Logger.error("Click On SelectObject DropDown For InsertValue is FAILED!!!",e);
						sa.assertAll();
					}
				}
				List<WebElement> AllLinksOfSelectObjectListBox1 = driver.findElements(By.xpath("//ng-dropdown-panel[@role='listbox']//div//span[text()]"));
				WebElement getLinkSelectObjectListBox1 = AllLinksOfSelectObjectListBox1.get(j);
				String getLinkTextSelectObjectListBox1 = getLinkSelectObjectListBox1.getText();
				Thread.sleep(2500);
				try {
					getLinkSelectObjectListBox1.click();
					Logger.info("Select "+getLinkTextSelectObjectListBox1+" is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select "+getLinkTextSelectObjectListBox1+" is Failed",e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					LR.ClickOnInsertValueSelectFieldDropDownUpdateDataValue();
					Logger.info("Click On InsertValue SelectField DropDown is PASSED!!");
				}catch(Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On InsertValue SelectField DropDown is FAILED!!!",e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					LR.ClickOnInsertValueSelectFieldOptionUpdateDataValue();
					Logger.info("Click On InsertValue SelectField Option is PASSED!!");
				}catch(Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On InsertValue SelectField Option is FAILED!!!",e);
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
			}


			Logger.info("******************************************* Message Body snippet operation ***************************************");

			Thread.sleep(3500);
			try {
				OTSnt.ClickOnInsertSnippetButtonForMessageBody();
				Logger.info("Click On InsertSnippet Button For Message body is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On InsertSnippet Button For Message body is FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(3000);
			try {
				EATP.ClickOnSelectObjectDropDownForInsertValueInSubject();
				Logger.info("Click On SelectObject DropDown For InsertValue is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On SelectObject DropDown For InsertValue is FAILED!!!",e);
				sa.assertAll();
			}
			List<WebElement> AllLinksOfSelectObjectListBox1 = driver.findElements(By.xpath("//ng-dropdown-panel[@role='listbox']//div//span[text()]"));
			int CountAllLinks1 =AllLinksOfSelectObjectListBox1.size();

			for (int k = 0; k < CountAllLinks1; k++) {

				if (k!=0) {
					Thread.sleep(2500);
					try {
						OTSnt.ClickOnInsertSnippetButtonForMessageBody();
						Logger.info("Click On InsertSnippetButton For Message body is PASSED!!");
					}catch(Exception e) {
						sa.assertTrue(false);
						Logger.error("Click On InsertSnippetButton For Message body is FAILED!!!",e);
						sa.assertAll();
					}
					Thread.sleep(2500);
					try {
						EATP.ClickOnSelectObjectDropDownForInsertValueInSubject();
						Logger.info("Click On SelectObject DropDown For InsertValue is PASSED!!");
					}catch(Exception e) {
						sa.assertTrue(false);
						Logger.error("Click On SelectObject DropDown For InsertValue is FAILED!!!",e);
						sa.assertAll();
					}
				}
				List<WebElement> AllLinksOfSelectObjectListBox2 = driver.findElements(By.xpath("//ng-dropdown-panel[@role='listbox']//div//span[text()]"));
				WebElement getLinkSelectObjectListBox2 = AllLinksOfSelectObjectListBox2.get(k);
				String getLinkTextSelectObjectListBox2 = getLinkSelectObjectListBox2.getText();
				Thread.sleep(2500);
				try {
					getLinkSelectObjectListBox2.click();
					Logger.info("Select "+getLinkTextSelectObjectListBox2+" is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select "+getLinkTextSelectObjectListBox2+" is Failed",e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					LR.ClickOnInsertValueSelectFieldDropDownUpdateDataValue();
					Logger.info("Click On InsertValue SelectField DropDown is PASSED!!");
				}catch(Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On InsertValue SelectField DropDown is FAILED!!!",e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					LR.ClickOnInsertValueSelectFieldOptionUpdateDataValue();
					Logger.info("Click On InsertValue SelectField Option is PASSED!!");
				}catch(Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On InsertValue SelectField Option is FAILED!!!",e);
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
			}
			Logger.info("******************************************* Save operation ***************************************");
			Thread.sleep(1500);
			try {
				OTSnt.ClickOnSaveButton();
				Logger.info("Click On Save Button is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Save Button is Faileed",e);
				sa.assertAll();
			}
			Thread.sleep(400);
			try {
				if (detrrt.DisplaySuccessForCRMinApp()==true) {
					Logger.info("Displayed Success message is Passed!!");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Success message is Failed!!", e);
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

			String textInsideTextareaLeadAfterSave="";
			String textInsideTextareaContactAfterSave="";
			if (i==0) {
				Thread.sleep(1000);
				try {
					WebElement textarea = driver.findElement(By.tagName("textarea"));
					textInsideTextareaLeadAfterSave = textarea.getAttribute("value");
					Logger.info("Text inside the textarea Click On RestoreDefault Button: " + textInsideTextareaLeadAfterSave);
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Fetching Text inside the textarea is Faileed",e);
					sa.assertAll();
				}
				Thread.sleep(1000);
				if (textInsideTextareaLead.contentEquals(textInsideTextareaLeadAfterSave)) {
					Logger.info("Message body for lead has been restored correctly is Passed");
				}else {
					sa.assertTrue(false);
					Logger.error("Message body for lead has not been restored correctly is Failed");
					sa.assertAll();
				}	
			}

			if (i==1) {
				Thread.sleep(1500);
				try {
					WebElement textarea = driver.findElement(By.tagName("textarea"));
					textInsideTextareaContactAfterSave = textarea.getAttribute("value");
					Logger.info("Text inside the textarea Click On RestoreDefault Button: " + textInsideTextareaContactAfterSave);
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Fetching Text inside the textarea is Faileed",e);
					sa.assertAll();
				}
				Thread.sleep(1000);
				if (textInsideTextareaContact.contentEquals(textInsideTextareaContactAfterSave)) {
					Logger.info("Message body for Contact has been restored correctly is Passed");
				}else {
					sa.assertTrue(false);
					Logger.error("Message body for Contact has not been restored correctly is Failed");
					sa.assertAll();
				}
			}


			continue;
		}//end loop
	}
}
