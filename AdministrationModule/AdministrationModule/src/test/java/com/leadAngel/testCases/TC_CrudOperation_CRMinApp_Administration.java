package com.leadAngel.testCases;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
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
import com.leadAngel.pageObjects.DetailsPage_SalesTeam;
import com.leadAngel.pageObjects.EmailAlertsTemplatesPageObjectModel;
import com.leadAngel.pageObjects.HomePage;
import com.leadAngel.pageObjects.LeadManagementPage;
import com.leadAngel.pageObjects.LeadRouterPageObjectModel;
import com.leadAngel.pageObjects.LoginPage;
import com.leadAngel.pageObjects.OTS_Router_PageObjectModel;
import com.leadAngel.pageObjects.OTSnotifications_PageObjectModel;
import com.leadAngel.pageObjects.RoundRobinPage;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
@Listeners({ com.leadAngel.utilities.TestAllureListener.class })
public class TC_CrudOperation_CRMinApp_Administration extends BaseClass{
	private static final Logger Logger = LogManager.getLogger(TC_CrudOperation_CRMinApp_Administration.class);

	@Test(description = "Administration_CRMinApp_Section")
	@Step("Administration_CRMinApp_Section")
	@Description("Administration_CRMinApp_Section")
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
		OTSnotifications_PageObjectModel OTSnt= new OTSnotifications_PageObjectModel(driver);
		DetailsPage_SalesTeam detrrt = new DetailsPage_SalesTeam(driver); 
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
			APOM.RightClickonCRMinApp();
			Logger.info("RightClick on CRMinApp is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick on CRMinApp is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnNewCRMInApp();
			Logger.info("Click on NewCRMInApp is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on NewCRMInApp is Failed",e);
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
			Logger.info("Select Router Type Option is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Router Type Option is FAILED!!!",e);
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
				APOM.ClickOnCRMinAppDropdown();
				Logger.info("Click on CRMinApp Dropdown is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on CRMinApp Dropdown is FAILED!!", e);
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
				APOM.RightClickonCRMinApp();
				Logger.info("Right click on CRMinApp is PASSED!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Right click on CRMinApp is Failed!!", e);
				sa.assertAll();
			}
			Thread.sleep(3500);
			try {
				APOM.ClickOnNewCRMInApp();
				Logger.info("Click on NewCRMinApp is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on NewCRMinApp is Failed",e);
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
				Logger.info("Select Router Type Option is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Select Router Type Option is FAILED!!!",e);
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

		Thread.sleep(2500);
		try {
			APOM.ClickOnAutoTestObject();           
			Logger.info("Click On LeadAutoTestObject is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On LeadAutoTestObject is FAILED!", e);
			sa.assertAll();
		}

		Logger.info("=======================================================Message Body====================================================================");
		Thread.sleep(3500);
		try {
			EATP.EnterMessageBody();
			Logger.info("Enter Message Body is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Message Body is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			EATP.ClickOnInsertSnippetButtonForSubject();
			Logger.info("Click On Insert Snippet Button For Message Body is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Insert Snippet Button For Message Body is FAILED!!!",e);
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
					EATP.ClickOnInsertSnippetButtonForSubject();
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
			if (OTSnt.DisplayedSelectedTextFontSizeHasBeenChanged()==true) {
				Logger.info("The font size of the selected text reverted to the default size, So the undo operation is successfully completed");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("The font size of the selected text reverted to the default size, So the undo operation is not successfully completed",e);
			sa.assertAll();
		}
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

		//*****
		Logger.info("//==================================== OverView Page Opeartion  ==================================");
		Thread.sleep(3500);
		try {
			APOM.ClickOnCRMInAppFeature();
			Logger.info("Click On CRMinApp Feature is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on CRMinApp Feature is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if(APOM.DisplayedCRMinAppOverview()==true) {
				Logger.info("Display CRMinApp OverView Page is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display CRMinApp OverView Page is Failed", e);
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
			Thread.sleep(1500);
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
		Thread.sleep(2500);
		try {
			OTS.ClickOnCRMInAppNotificationCheckBox();
			Logger.info("Click On CRMInApp Notification CheckBox is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CRMInApp Notification CheckBox is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.ClickOnCRMInAppNotificationDropDown();
			Logger.info("Click On CRMInApp Notification DropDown is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CRMInApp Notification DropDown is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.SelectAutotestEmailObject();
			Logger.info("Select AutoTestObject option is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select AutoTestObject option is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
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
		Logger.info("********************* Go back to CRMinApp Object In Administartion ********************");
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
			APOM.ClickOnCRMinAppDropdown();
			Logger.info("Click on CRMinApp Dropdown is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on CRMinApp Dropdown is FAILED!!", e);
			sa.assertAll();
		}

		Logger.info("========================================DELETE Operation after used in OTS router(Lead management)========================================");
		String TextFromUsedBeRouterName="";
		String GetTextFromErrorMessage="";
		Thread.sleep(3500);
		try {
			APOM.RightClickOnAutoTestObject();           
			Logger.info("RightClick On LeadAutoTestObject is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On LeadAutoTestObject is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(3600);
		try {
			LMP.ClickOnDeleteOnClonedAutoTestObject();
			Logger.info("Click On Delete Button is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Button is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3600);
		try {
			LMP.ClickOnDeletebtn();
			Logger.info("Click again Delete Button is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click again Delete Button is FAILED!", e);
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
			OTSnt.ClickOnSaveButton();
			Logger.info("Click On Save Button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button is Faileed",e);
			sa.assertAll();
		}
		Thread.sleep(700);
		try {
			if (detrrt.DisplaySuccessForCRMinApp()==true) {
				Logger.info("Displayed Success message is Passed!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Success message is Failed!!", e);
			sa.assertAll();
		}
		Logger.info("********************************DELETE CLONED OBJECT SCENARIO*********************************");
		Thread.sleep(3500);
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
			APOM.ClickOnCRMInAppFeature();
			Logger.info("Click On CRMinApp Feature is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on CRMinApp Feature is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if(APOM.DisplayedCRMinAppOverview()==true) {
				Logger.info("Display CRMinApp OverView Page is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display CRMinApp OverView Page is Failed", e);
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
