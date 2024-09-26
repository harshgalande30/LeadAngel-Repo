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
public class TC_Sanity_RejectConfirmation_Administration extends BaseClass{
	private static final Logger Logger = LogManager.getLogger(TC_Sanity_RejectConfirmation_Administration.class);

	@Test(description = "Administration_RejectConfirmation_Section")
	@Step("Administration_RejectConfirmation_Section")
	@Description("Administration_RejectConfirmation_Section")
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
			Logger.info("Click on Notifications DropDown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Notifications DropDown is Failed",e);
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
			OTSnt.ClickOnRejectConfirmation();
			Logger.info("Click On RejectConfirmation is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On RejectConfirmation is Failed",e);
			sa.assertAll();
		}
		
		Logger.info("=========================================  LeadRejectConfirmationTab Operation ======================================");
		Thread.sleep(2500);
		try {
			OTSnt.ClickOnRestoreDefaultButton();
			Logger.info("Click On RestoreDefault Button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On RestoreDefault Button is Faileed",e);
			sa.assertAll();
		}	
		Thread.sleep(500);
		try {
			driver.findElement(By.xpath("//font[text()='Thank you!']")).click();
			Logger.info("Click inside message body is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click inside message body is Faileed",e);
			sa.assertAll();
		}

		Thread.sleep(1000);
		try {
			driver.findElement(By.xpath("//button[@title='align center'][@class='st-button st-toolbar-item active']")).isDisplayed();
			Logger.info("Bydefault texts are perfrctly located in center of the Message Body is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Bydefault texts are perfrctly located in center of the Message Body is failed",e);
			sa.assertAll();
		}



		for (int k = 0; k < 2; k++) {

			if (k==1) {
				Logger.info("=========================================  ContactRejectConfirmationTab Operation=========================================");

				WebElement ContactRejctConfirmationTab = driver.findElement(By.xpath("//li[text()=' Contact : Reject Confirmation ']"));

				Actions action=new Actions(driver);
				action.moveToElement(ContactRejctConfirmationTab).click().perform();
				Logger.info("Click on ContactRejectConfirmationTab is PASSED!!");

				Thread.sleep(3000);
				try {
					OTSnt.ClickOnContactRejctConfirmationTab();
					Logger.info("Click On ContactRejctConfirmation Tab is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On ContactRejctConfirmation Tab is Failed",e);
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
					Logger.info("Click On RestoreDefault Button is Passed");
				}catch(Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On RestoreDefault Button is Faileed",e);
					sa.assertAll();
				}
				Thread.sleep(500);
				try {
					driver.findElement(By.xpath("//font[text()='Thank you!']")).click();
					Logger.info("Click inside message body is Passed");
				}catch(Exception e) {
					sa.assertTrue(false);
					Logger.error("Click inside message body is Faileed",e);
					sa.assertAll();
				}

				Thread.sleep(1000);
				try {
					driver.findElement(By.xpath("//button[@title='align center'][@class='st-button st-toolbar-item active']")).isDisplayed();
					Logger.info("Bydefault texts are perfrctly located in center of the Message Body is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.info("Bydefault texts are perfrctly located in center of the Message Body is failed",e);
					sa.assertAll();
				}
			}
			Logger.info("******************************************* snippet operation ***************************************");
			Thread.sleep(6000);
			try {
				APOM.ClickOnInsertSnippetButtonForEmailBody();
				Logger.info("Click On Insert Snippet Button For Message Body is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Insert Snippet Button For Message Body is FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(3000);
			try {
				EATP.ClickOnSelectObjectDropDownForInsertValueInSubject();
				Logger.info("Click On Select Object DropDown For Insert Value is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Select Object DropDown For Insert Value is FAILED!!!",e);
				sa.assertAll();
			}
			List<WebElement> AllLinksOfSelectObjectListBox = driver.findElements(By.xpath("//ng-dropdown-panel[@role='listbox']//div//span[text()]"));
			int CountAllLinks =AllLinksOfSelectObjectListBox.size();

			for (int i = 0; i < CountAllLinks; i++) {

				if (i!=0) {
					Thread.sleep(2500);
					try {
						APOM.ClickOnInsertSnippetButtonForEmailBody();
						Logger.info("Click On Insert Snippet Button For Message Body is PASSED!!");
					}catch(Exception e) {
						sa.assertTrue(false);
						Logger.error("Click On Insert Snippet Button For Message Body  is FAILED!!!",e);
						sa.assertAll();
					}
					Thread.sleep(2500);
					try {
						EATP.ClickOnSelectObjectDropDownForInsertValueInSubject();
						Logger.info("Click On Select Object DropDown For Insert Value is PASSED!!");
					}catch(Exception e) {
						sa.assertTrue(false);
						Logger.error("Click On Select Object DropDown For Insert Value is FAILED!!!",e);
						sa.assertAll();
					}
				}
				List<WebElement> AllLinksOfSelectObjectListBox1 = driver.findElements(By.xpath("//ng-dropdown-panel[@role='listbox']//div//span[text()]"));
				WebElement getLinkSelectObjectListBox1 = AllLinksOfSelectObjectListBox1.get(i);
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
			}
			Thread.sleep(2500);
			try {
				OTSnt.EnterTextInsideThankYouPageRejectConfirmation();
				Logger.info("Enter Text Inside RejectConfirmation Message body is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter Text Inside RejectConfirmation Message body is FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			Robot r=new Robot();
			r.delay(1000);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_A);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_A);
			Logger.info("Selected all the text from the RejectConfirmation Message body");

			Logger.info("******************************************* Toolbar operation ***************************************");
			Thread.sleep(2500);
			try {
				OTSnt.ClickOnBoldButton();
				Logger.info("Click On Bold Button is PASSED");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Bold Button is FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(800);
			try {
				if (OTSnt.DisplayedSelectedTextIsBold()==true) {
					Logger.info("Displayed Selected Text Is Bold is Passed");
				}
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Selected Text Is Bold is FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				OTSnt.ClickOnItalicButton();
				Logger.info("Click On Italic Button is PASSED");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Italic Button is FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(800);
			try {
				if (OTSnt.DisplayedSelectedTextIsItalic()==true) {
					Logger.info("Displayed Selected Text Is Italic is Passed");
				}
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Selected Text Is Italic is FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				OTSnt.ClickOnUnderlineButton();
				Logger.info("Click On Underline Button is PASSED");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Underline Button is FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(800);
			try {
				if (OTSnt.DisplayedSelectedTextIsUnderlined()==true) {
					Logger.info("Displayed Selected Text Is Underlined is Passed");
				}
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Selected Text Is Underlined is FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				OTSnt.ClickOnOrderedListButton();
				Logger.info("Click On OrderedList Button is PASSED");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On OrderedList Button is FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(800);
			try {
				if (OTSnt.DisplayedSelectedTextIsOrderedList()==true) {
					Logger.info("Displayed Selected Text Is OrderedList is Passed");
				}
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Selected Text Is OrderedList is FAILED!!!",e);
				sa.assertAll();
			}

			Thread.sleep(2500);
			try {
				OTSnt.ClickOnUnOrderedListButton();
				Logger.info("Click On UnOrderedList Button is PASSED");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On UnOrderedList Button is FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(800);
			try {
				if (OTSnt.DisplayedSelectedTextIsUnOrderedList()==true) {
					Logger.info("Displayed Selected Text Is UnOrderedList is Passed");
				}
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Selected Text Is UnOrderedList is FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				OTSnt.ClickOnIndentButton();
				Logger.info("Click On Indent Button is PASSED");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Indent Button is FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(800);
			try {
				if (OTSnt.DisplayedSelectedTextIsIndent()==true) {
					Logger.info("Displayed Selected Text Is Indent is Passed");
				}
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Selected Text Is Indent is FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				OTSnt.ClickOnAlignJustifyButton();
				Logger.info("Click On AlignJustify Button is PASSED");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On AlignJustify Button is FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(800);
			try {
				if (OTSnt.DisplayedSelectedTextIsAlignJustify()==true) {
					Logger.info("Displayed Selected Text Is AlignJustify is Passed");
				}
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Selected Text Is AlignJustify is FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				OTSnt.ClickOnAlignCenterButton();
				Logger.info("Click On AlignCenter Button is PASSED");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On AlignCenter Button is FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(800);
			try {
				if (OTSnt.DisplayedSelectedTextIsAligncenter()==true) {
					Logger.info("Displayed Selected Text Is AlignCenter is Passed");
				}
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Selected Text Is AlignCenter is FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				OTSnt.ClickOnAlignLeftButtonv();
				Logger.info("Click On AlignLeft Button is PASSED");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On AlignLeft Button is FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(800);
			try {
				if (OTSnt.DisplayedSelectedTextIsAlignLeft()==true) {
					Logger.info("Displayed Selected Text Is AlignLeft is Passed");
				}
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Selected Text Is AlignLeft is FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				OTSnt.ClickOnAlignRightButton();
				Logger.info("Click On AlignRight Button is PASSED");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On AlignRight Button is FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(800);
			try {
				if (OTSnt.DisplayedSelectedTextIsAlignRight()==true) {
					Logger.info("Displayed Selected Text Is AlignRight is Passed");
				}
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Selected Text Is AlignRight is FAILED!!!",e);
				sa.assertAll();
			}

			Thread.sleep(2500);
			try {
				OTSnt.ChangeFontSize();
				Logger.info("Font size has been changed for all text is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Font size has been changed for all text is Faileed",e);
				sa.assertAll();
			}
			Thread.sleep(800);
			try {
				if (OTSnt.DisplayedSelectedTextFontSizeHasBeenChanged()==true) {
					Logger.info("Displayed Selected Text Font Size Has Been Changed to 7 is Passed");
				}
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Selected Text Font Size Has Been Changed to 7 is FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				OTSnt.ClickOnUndoButton();
				Logger.info("Click On Undo Button is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Undo Button is Faileed",e);
				sa.assertAll();
			}
			Thread.sleep(800);
			try {
				if (OTSnt.DisplayedSelectedTextFontSizeHasBeenChanged()==false) {
					Logger.info("The font size of the selected text reverted to the default size, So the undo operation is successfully completed");
				}
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("The font size of the selected text reverted to the default size, So the undo operation is not successfully completed",e);
				sa.assertAll();
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

			Thread.sleep(500);
			try {
				driver.findElement(By.xpath("//font[text()='Thank you!']")).click();
				Logger.info("Click inside message body is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click inside message body is Faileed",e);
				sa.assertAll();
			}

			Thread.sleep(1000);
			try {
				driver.findElement(By.xpath("//button[@title='align center'][@class='st-button st-toolbar-item active']")).isDisplayed();
				Logger.info("Bydefault texts are perfrctly located in center of the Message Body is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.info("Bydefault texts are perfrctly located in center of the Message Body is failed",e);
				sa.assertAll();
			}


			WebElement MessageBodyInformationCircle = driver.findElement(By.xpath("//i-tabler[@name='info-circle']"));

			Actions action=new Actions(driver);
			action.moveToElement(MessageBodyInformationCircle).perform();
			Thread.sleep(2500);
			try {
				OTSnt.DisplayedhasPopup();
				Logger.info("Displayed hasPopup is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed hasPopup is Faileed",e);
				sa.assertAll();
			}
			continue;
		}//End loop
	}	
}
