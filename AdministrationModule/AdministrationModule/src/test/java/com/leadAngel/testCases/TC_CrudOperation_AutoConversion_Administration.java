package com.leadAngel.testCases;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.leadAngel.pageObjects.AEtoSDR_Page;
import com.leadAngel.pageObjects.AccountListPage;
import com.leadAngel.pageObjects.AccountMaanagement_PageObjectModel;
import com.leadAngel.pageObjects.AdministrationPageObjectModel;
import com.leadAngel.pageObjects.CRM_Account_FilterPage;
import com.leadAngel.pageObjects.DetailsPage_SalesTeam;
import com.leadAngel.pageObjects.EmailAlertsTemplatesPageObjectModel;
import com.leadAngel.pageObjects.Forms_PageObjectModel;
import com.leadAngel.pageObjects.HomePage;
import com.leadAngel.pageObjects.LeadManagementPage;
import com.leadAngel.pageObjects.LeadRouterPageObjectModel;
import com.leadAngel.pageObjects.ResponseMappingPageObjectModel;
import com.leadAngel.pageObjects.RoundRobinPage;
import com.leadAngel.pageObjects.WebhookPageObjectModel;
import io.qameta.allure.Description;
import io.qameta.allure.Step;

public class TC_CrudOperation_AutoConversion_Administration extends BaseClass{
	private static final Logger Logger = LogManager.getLogger(TC_CrudOperation_AutoConversion_Administration.class);

	@Test(description = "Administration_AutoConversion_Section")
	@Step("Administration_AutoConversion_Section")
	@Description("Administration_AutoConversion_Section")
	public void AdministrationTest() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		HomePage hp = new HomePage(driver);
		LeadManagementPage LMP = new LeadManagementPage(driver);
		AdministrationPageObjectModel APOM=new AdministrationPageObjectModel(driver);
		EmailAlertsTemplatesPageObjectModel EATP=new EmailAlertsTemplatesPageObjectModel(driver);
		CRM_Account_FilterPage crm = new CRM_Account_FilterPage(driver);
		AEtoSDR_Page ae = new AEtoSDR_Page(driver);
		LeadRouterPageObjectModel LR=new LeadRouterPageObjectModel(driver);
		RoundRobinPage rrp = new RoundRobinPage(driver);
		DetailsPage_SalesTeam dp=new DetailsPage_SalesTeam(driver);
		WebhookPageObjectModel WPOM=new WebhookPageObjectModel(driver);
		AccountListPage ALP = new AccountListPage(driver);
		ResponseMappingPageObjectModel RM=new ResponseMappingPageObjectModel(driver);
		DetailsPage_SalesTeam detrrt = new DetailsPage_SalesTeam(driver);	
		AccountMaanagement_PageObjectModel AM=new AccountMaanagement_PageObjectModel(driver);
		Forms_PageObjectModel FPOM=new Forms_PageObjectModel(driver);

		Thread.sleep(3500);
		try {
			hp.ClickOnAdministration();
			Logger.info("Click on Administration is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Administration is Failed",e);
			sa.assertAll();
		}
		Logger.info("//===============================CREATE OBJECT SCENARIO START========================================!");
		Thread.sleep(3500);
		try {
			APOM.RightClickOnAutoConversion();
			Logger.info("Right Click on AutoConversion is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click on AutoConversion is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnNewObject();
			Logger.info("Click On NewAutoConversion is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On NewAutoConversion is Failed",e);
			sa.assertAll();
		}
		if (APOM.DisplayErrorMessage()==true) {
			Logger.info("Only upto 3 auto conversion rules can be created message is displayed");
			Thread.sleep(2500);
			try {
				APOM.ClickOnAutoConversion();
				Logger.info("Click on AutoConversion dropdown is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on AutoConversion dropdown is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			if (APOM.DisplayAutoTestObject() == true) {
				Logger.info("Displayed Already AutoTestObject is Present");
				if (APOM.VerifyApprovedSignForAutoTestObject()==true) {
					Thread.sleep(2500);
					try {
						APOM.ClickApprovedAutoTestObject();
						Logger.info("Click on Approved AutoTestObject is Passed");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Click on Approved AutoTestObject is Failed",e);
						sa.assertAll();
					}
					Thread.sleep(2500);
					try {
						APOM.ClickOnEditButton();
						Logger.info("Click On Edit Button is Passed");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Click On Edit Button is Failed",e);
						sa.assertAll();
					}

				}
				else if(APOM.VerifyEditSignForAutoTestObject()==true){
					Thread.sleep(2500);
					try {
						APOM.ClickEditObject();
						Logger.info("Click an Edit Object is Passed");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Click an Edit Object is Failed",e);
						sa.assertAll();
					}	
				}	
			}
			else if (APOM.VerifyApprovedSign()==true) {
				Thread.sleep(2500);
				try {
					APOM.ClickApprovedObject();
					Logger.info("Click on Approved Object is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click on Approved Object is Failed",e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					APOM.ClickOnEditButton();
					Logger.info("Click On Edit Button is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Edit Button is Failed",e);
					sa.assertAll();
				}

			}
			else if(APOM.VerifyEditSign()==true){
				Thread.sleep(2500);
				try {
					APOM.ClickEditObject();
					Logger.info("Click an Edit Object is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click an Edit Object is Failed",e);
					sa.assertAll();
				}	
			}
		}
		
		
		Thread.sleep(2500);
		while (APOM.DisplayClearIcon()==true) {
			Thread.sleep(2500);
			try {
				APOM.ClickOnClearIcon();
				Logger.info("Click On Clear Icon is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Clear Icon is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(4500);
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnAutoPreferenceFolder();
			Logger.info("Click On Auto Preference Folder is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Auto Preference Folder is Failed",e);
			sa.assertAll();
		}

		Logger.info("//================================================MergeLeadsWithContact DND Operation===============================================");
		Thread.sleep(2500);
		try {
			APOM.DNDMergeLeadsWithContact();
			Logger.info("Drag and Drop Merge Leads with Contact is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag and Drop Merge Leads with Contact is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.SelectMergeLeadswithContactOption();
			Logger.info("Select Merge Leads with Contact is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Merge Leads with Contact is Failed",e);
			sa.assertAll();
		}


		Logger.info("//================================================ConvertLeadToContact DND Operation===============================================");
		Thread.sleep(2500);
		try {
			APOM.DNDConvertLeadToContact();
			Logger.info("Drag and Drop Convert Lead To Contact is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag and Drop Convert Lead To Contact is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.SelectConvertLeadtoContactOption();
			Logger.info("Select Convert Lead to Contact Option is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Convert Lead to Contact Option is Failed",e);
			sa.assertAll();
		}
		Logger.info("//================================================ConvertLeadToContactAndAccount DND Operation===============================================");
		Thread.sleep(2500);
		try {
			APOM.DNDConvertLeadToContactAndAccount();
			Logger.info("Drag and Drop Convert Lead To Contact And Account is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag and Drop Convert Lead To Contact And Account is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.SelectConvertLeadtoContactandAccountOption();
			Logger.info("Select Convert Lead to Contact and Account Option is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Convert Lead to Contact and Account Option is Failed",e);
			sa.assertAll();
		}
		Logger.info("//================================================CreateOppWhileMerging DND Operation===============================================");
		Thread.sleep(2500);
		try {
			APOM.DNDCreateOppWhileMerging();
			Logger.info("Drag and Drop Create Opp While Merging is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag and Drop Create Opp While Merging is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.SelectCreateOppWhileMergingOption();
			Logger.info("Select Create Opp While Merging Option is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Create Opp While Merging Option is Failed",e);
			sa.assertAll();
		}

		Logger.info("//========================================ENTERING DETAILS PAGE======================================");
		Thread.sleep(3600);
		rrp.ClickOnDetail();
		Logger.info("Entering Details Page is Passed!!!");  		  		  		  		
		Thread.sleep(2500);
		detrrt.ClickOnEditbtn();
		Logger.info("Click On Description Edit button is passed");
		Thread.sleep(2500);
		detrrt.InputDesc();
		Logger.info("Enter Description is Passed");
		Thread.sleep(2500);
		detrrt.ClickOnbtnSaveDescForAccList();
		Logger.info("Click On Description Save button is passed");

		Logger.info("//======================================APPROVE SCENARIO START===================================//");
		Thread.sleep(3000);
		try {
			APOM.ClickOnDraftButton();
			Logger.info("Click On Draft Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Draft Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			APOM.ApproveTheObjectAfterEdit();
			Logger.info("Approve The Object is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Approve The Object is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			rrp.ClickOnApproveSubmit();
			Logger.info("Click on Approve button is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Approve button is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			rrp.DisplayApproved();
			Logger.info("Display Approved button is PASSED!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Approved button is FAILED!!", e);
			sa.assertAll();
		}

		Logger.info("//============================================EDIT SCENARIO START======================================");
		Thread.sleep(3500);
		try {
			APOM.ClickOnEditButtton();
			Logger.info("Click On Edit is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Edit is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(6000);
		try {
			APOM.ClickOnClearIcon();
			Logger.info("Delete one Drag and Drop container is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Delete one Drag and Drop container is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(4000);
		try {
			APOM.ApproveTheObjectAfterEdit();
			Logger.info("Approve The Object After Edit is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Approve The Object After Edit is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			rrp.ClickOnApproveSubmit();
			Logger.info("Click on Approve button is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Approve button is FAILED!", e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		WebElement DetailsName1 = driver.findElement(By.xpath("(//i[text()='description']//..//..)[5][text()]"));
		String DetailasTestStored1= DetailsName1.getText();
		Logger.info(DetailasTestStored1);
		if (DetailasTestStored1.contentEquals("AutoTestObject_Rename")) {
			Thread.sleep(2500);
			try {
				WebElement xpathForObject=driver.findElement(By.xpath("(//span[text()='"+DetailasTestStored1+" '])[1]"));
				Actions action=new Actions(driver);
				action.moveToElement(xpathForObject).click(xpathForObject).contextClick(xpathForObject).build().perform();
				Logger.info("Right click an object is PASSED!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Right click an object is FAILED!!!", e);
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
			Thread.sleep(3500);
			try {
				LMP.ClickOnRenameBtn();
				Logger.info("Click on Rename button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on Rename button is FAILED!", e);
				sa.assertAll();
			}
		}
		else {
			sa.assertTrue(true);
		}
		String DetailasTestStored="";
		Logger.info("//======================================= RENAME SCENARIO START ================================//");
		Thread.sleep(3000);
		try {
			WebElement DetailsName = driver.findElement(By.xpath("(//i[text()='description']//..//..)[5][text()]"));
			DetailasTestStored= DetailsName.getText();
			Thread.sleep(2500);
			WebElement xpathForObject=driver.findElement(By.xpath("(//span[text()='"+DetailasTestStored+" '])[1]"));
			Actions action=new Actions(driver);
			action.moveToElement(xpathForObject).click(xpathForObject).contextClick(xpathForObject).build().perform();
			Logger.info("Right click the object is passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right click the object is FAILED!", e);
			sa.assertAll();
		}

		Thread.sleep(4500);
		try {
			LMP.ClickOnRenameAutoTestObject();
			Logger.info("Click On RenameAutoTestObject is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On RenameAutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			LMP.InputOnRenameAutoTestObject();
			Logger.info("Input on RenameAutoTestObject is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Input on RenameAutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			LMP.ClickOnRenameBtn();
			Logger.info("Click on Rename Button is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Rename Button is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(400);
		try {
			if (APOM.DisplayedCannotDeleteErrorSuccessMessage() == true) 
			{
				Logger.info("Displayed 'Cannot Delete' Error Message");
				Thread.sleep(3500);
				try {
					WebElement DetailsName = driver.findElement(By.xpath("(//i[text()='description']//..//..)[5][text()]"));
					DetailasTestStored= DetailsName.getText();
					Thread.sleep(2500);
					WebElement xpathForObject=driver.findElement(By.xpath("(//span[text()='"+DetailasTestStored+" '])[1]"));
					Actions action=new Actions(driver);
					action.moveToElement(xpathForObject).click(xpathForObject).contextClick(xpathForObject).build().perform();
					Logger.info("Right click the object is passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Right click the object is FAILED!", e);
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
		
		Logger.info("//==================================== OverView Page Opeartion Before Used  ==================================");
		Thread.sleep(3500);
		try {
			APOM.ClickOnAutoConversionFeature();
			Logger.info("Click On AutoConversion Feature is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on AutoConversion Feature is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if(APOM.DisplayAutoConversionOverview()==true) {
				Logger.info("Display AutoConversion OverView Page is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display AutoConversion OverView Page is Failed", e);
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
			if (APOM.DisplayedRenameAutTestObjectCheckBox() == true) {
				Logger.info("Displayed RenameAutTestObject CheckBox is Passed");
				try {
					if (APOM.DisplayedRenameAutTestObjectCheckBoxIsChecked() == true) {
						Logger.info("Displayed RenameAutTestObject CheckBox Is Checked is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed RenameAutTestObject CheckBox Is Checked is Failled", e);
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
			if (APOM.DisplayedRenameAutTestObjectCheckBox() == true) {
				Logger.info("Displayed RenameAutTestObject CheckBox is Passed");
				try {
					if (APOM.DisplayedRenameAutTestObjectCheckBoxIsNotChecked() == true) {
						Logger.info("Displayed RenameAutTestObject CheckBox Is Not Checked is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed RenameAutTestObject CheckBox Is Not Checked is Failled", e);
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
				if (APOM.DisplayedRennameAutoTestObject() == true) {
					Logger.info("Displayed RenameAutoTestObject is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed RenameAutoTestObject is Failled", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			if (APOM.DisplayedRenameAutTestObjectCheckBox() == true) {
				Logger.info("Displayed RenameAutTestObject CheckBox is Passed");
				try {
					if (APOM.DisplayedRenameAutTestObjectCheckBoxIsNotChecked() == true) {
						Logger.info("Displayed RenameAutTestObject CheckBox Is Not Checked is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed RenameAutTestObject CheckBox Is Not Checked is Failled", e);
					sa.assertAll();
				}
			}  else {

				try {
					if (APOM.DisplayedRenameAutoTestObjectIsUsed() == true) {
						Logger.info("Displayed RenameAutoTestObject Is Used is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed RenameAutoTestObject Is Used is Failled", e);
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
				if( APOM.DisplayedRenameAutoTestObject()==true) {
					Logger.info("Displayed RenameAutoTestObject is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed RenameAutoTestObject is Failled", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			if (APOM.DisplayedRenameAutTestObjectCheckBox() == true) {
				Logger.info("Displayed RenameAutTestObject CheckBox is Passed");
				try {
					if (APOM.DisplayedRenameAutTestObjectCheckBoxIsNotChecked() == true) {
						Logger.info("Displayed RenameAutTestObject CheckBox Is Not Checked is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed RenameAutTestObject CheckBox Is Not Checked is Failled", e);
					sa.assertAll();
				}
			}  else {

				try {
					if (APOM.DisplayedRenameAutoTestObjectIsUsed() == true) {
						Logger.info("Displayed RenameAutoTestObject Is Used is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed RenameAutoTestObject Is Used is Failled", e);
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

		Logger.info("//*********************************************** Make Use of this Object In LeadRouter(LeadManagement) *******************************************");
		Thread.sleep(3000);
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
		Thread.sleep(3500);
		try {
			LMP.ClickOnLeadRouting();
			Logger.info("Click on leadRouting is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on leadRouting is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(4900);
		try {
			LMP.RightClickOnLeadRouter();
			Logger.info("Right click on leadRouter is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right click on leadRouter is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickOnNewObject();
			Logger.info("Click on New Lead Router is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on New Lead Router is Failed",e);
			sa.assertAll();
		}

		Logger.info("//===============================CREATE OBJECT SCENARIO START========================================!");
		Thread.sleep(2500);
		try {
			LMP.NameInCrudObject();
			Logger.info("Enter Object name is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Object name is FAILED!!!",e);
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
				LMP.getLeadRouterDropDown();
				Logger.info("Click on LeadRouter DropDown is passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on LeadRouter DropDown is FAILED!!", e);
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
			Thread.sleep(600);
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
					Thread.sleep(3500);
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
			Thread.sleep(5500);
			try {
				LMP.RightClickOnLeadRouter();
				Logger.info("Right Click on LeadRouter is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Right Click on LeadRouter is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(4100);
			try {
				LMP.ClickOnNewObject();
				Logger.info("Click on New Lead Router is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on New Lead Router is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(4900);
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
		Thread.sleep(5600);
		try {
			Thread.sleep(2500);
			if(LR.isDisplayLeadRouterOverview()==true) {
				Logger.info("Displayed LeadRouter Overview page");
				{
					Thread.sleep(2600);
					try {
						LMP.getLeadRouterDropDown();
						Logger.info("Click on Lead Router Dropdown is passed");
					}catch(Exception e) {
						sa.assertTrue(false);
						Logger.error("Click on Lead Router Dropdown is FAILED!!", e);
						sa.assertAll();
					}
					Thread.sleep(2600);
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
		Thread.sleep(4200);
		try {
			LR.ClickOnDNDdiagramDropDown();
			Logger.info("Click On DNDdiagram DropDown is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DNDdiagram DropDown is Failed!!", e);
			sa.assertAll();
		}

		Logger.info("*************************************** Decision Block DND ****************************************");
		Thread.sleep(4500);
		try {
			APOM.Decisionblock_DND();
			Logger.info("Drag And Drop Decision Block is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag And Drop Decision Block is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(4800);
		try {
			LR.ConnectStartBlock_To_DecisionBlock();
			Logger.info("Connect StartBlock To DecisionBlock is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Connect StartBlock To DecisionBlock is Failed!!", e);
			sa.assertAll();
		}
		Logger.info("***************************************Assignment Block DND****************************************");
		Thread.sleep(4500);
		try {
			APOM.AssignmentBlock1_DND();
			Logger.info("Drag And Drop AssignmentBlock1 is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag And Drop AssignmentBlock1 is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			LR.ConnectDecisionBlock_To_assignmentBlock1();
			Logger.info("Connect Decision Block To assignmentBlock1 is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Connect Decision Block To assignmentBlock1 is Failed!!!!", e);
			sa.assertAll();
		}
		Logger.info("***************************************Decision block Operation***************************************");
		Thread.sleep(3500);
		try {
			LR.DoubleClickOnDecisionBlock();
			Logger.info("Double Click On DecisionBlock is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Double Click On DecisionBlock is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			LR.SelectDecisionBlockListElem();
			Logger.info("Click On Data dictionary option is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Data dictionary option is Failed !!", e);
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
		Thread.sleep(2500);
		try {
			if (APOM.VerifiedDecisionBlockBorderColor()==true) {
				Logger.info(APOM.VerifiedDecisionBlockBorderColor());
				Logger.info("Decision Block Border Color is Verified and Passed");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Decision Block Border Color is Verified and Failed !!",e);
			sa.assertAll();
		}
		Logger.info("*********************************************Assignment block1 Operation********************************************");	
		Thread.sleep(3000);
		try {
			LR.DoubleClickOnAssignmentBlock();
			Logger.info("Double Click On Assignment Block is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Double Click On Assignment Block is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			LR.ClickOnDropDownAssignmentBlock();
			Logger.info("Click On DropDown AssignmentBlock is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DropDown AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			APOM.SelectSalesTeam();
			Logger.info("Select SalesTeam In AssignmentBlock is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select SalesTeam In AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			LR.ClickOnDropDown2AssignmentBlock();
			Logger.info("Click On DropDown2 AssignmentBlock is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DropDown2 AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			LR.SelectOptionsFromtheDropdown();
			Logger.info("Select Option From the Dropdown is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Option From the Dropdown is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickAutoConvertLeadsIntoContactCheckBox();
			Logger.info("Click AutoConvertLeadsIntoContact CheckBox is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click AutoConvertLeadsIntoContact CheckBox is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (APOM.DisplayedAutoConvertLeadsIntoContactAndorAccountsCheckBoxIsChecked()==true) {
				Logger.info("Displayed Auto Convert Leads Into Contact And or Accounts CheckBox Is Checked!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Auto Convert Leads Into Contact And or Accounts CheckBox Is Not Checked!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickAutoConvertLeadsIntoContactDropdown();
			Logger.info("Click AutoConvertLeadsIntoContact DropDown is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click AutoConvertLeadsIntoContact DropDown is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			LMP.selectAutoTestObject_Rename();
			Logger.info("Select AutoTestObject_Rename is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select AutoTestObject_Rename is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickedOnSaveButtonForAssignmentBlock();
			Logger.info("Click On Save Button For AssignmentBlock is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button For AssignmentBlock is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (APOM.VerifiedAssignmentBlockBorderColor()==true) {
				Logger.info(APOM.VerifiedAssignmentBlockBorderColor());
				Logger.info("AssignmentBlock Border Colour is Verified and Passed!!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("AssignmentBlock Border Colour is Verified and Failed !!",e);
			sa.assertAll();
		}
		Logger.info("//==============================  ENTERING DETAILS PAGE ==============================");			
		Thread.sleep(3600);
		try {
			rrp.ClickOnDetail();
			Logger.info("Entering Details Page is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Entering Details Page is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			detrrt.ClickOnDefaultLeadOwnerDropDown();
			Logger.info("Click On DefaultLeadOwner DropDown is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DefaultLeadOwner DropDown is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			detrrt.ClickOnDefaultLeadOwnerSelectAllaLebedevaOption();
			Logger.info("Select Option is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Option is is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			detrrt.ClickOnCheckBox();
			Logger.info("Click On ClickOnCheckBox is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On ClickOnCheckBox is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(1300);
		try {
			detrrt.DisplaySuccessForLeadRouter();
			Logger.info("Display Success is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Success is Failed!!", e);
			sa.assertAll();
		}

		Logger.info("//===============================================APPROVE SCENARIO START========================================//");
		Thread.sleep(6200);
		try {
			LMP.ContextClickOnAutoTestObject();           
			Logger.info("Right Click On AutoTestObject is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On AutoTestObject is FAILED!!", e);
			sa.assertAll();
		} 
		Thread.sleep(3100);
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
			rrp.ClickOnApproveSubmit();
			Logger.info("Click again Approve Button is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click again Approve Button is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(4000);
		try {
			rrp.DisplayApproved();
			Logger.info("Displayed Success Message is PASSED!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Success Message is FAILED!!",e);
			sa.assertAll();
		}
		Logger.info("********************* Go back to AutoConversion In Administartion ********************");
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
		Thread.sleep(3500);
		try {
			APOM.ClickOnAutoConversion();
			Logger.info("Click on Auto Conversion dropdown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Auto Conversion dropdown is Failed",e);
			sa.assertAll();
		}

		Logger.info("//========================== Verifying Delete operaion Once after Used =======================");
		Thread.sleep(2500);
		try {
			LMP.ClickOnAgainRenameAutoTestObject();
			Logger.info("Click on RenameAutoTestObject is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on RenameAutoTestObject is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnDeleteButtonForWebhook();
			Logger.info("Click On Delete Button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			APOM.ClickOnDelete();
			Logger.info("Click again Delete Button	is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click again Delete Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(500);
		try {
			if (APOM.DisplayedCannotDeleteFromErrorMessage()==true) {
				Logger.info("Displayed 'Cannot delete,It is Used' Error message is Passed");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed 'Cannot delete,It is Used' Error message is Failed",e);
			sa.assertAll();
		}

		Logger.info("//========================================Delete Craft scenario=======================================");
		Thread.sleep(5500);
		try {
			LMP.ClickOnEditButton();
			Logger.info("Click On Edit button is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Edit button is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			ALP.ClickOnDeleteCraft();
			Logger.info("Click On DeleteCraft buton is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DeleteCraft buton is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(5500);
		Thread.sleep(7000);
		try {
			if (ALP.VerifyApprovedSignForAutoConversion()==true) {
				Logger.info("Dispalying Verified Sign is PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Dispalying Verified Sign is FAILED!", e);
			sa.assertAll();

		}
	}
}
