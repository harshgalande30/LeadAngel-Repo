package com.leadAngel.testCases;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.leadAngel.pageObjects.AEtoSDR_Page;
import com.leadAngel.pageObjects.AccountMaanagement_PageObjectModel;
import com.leadAngel.pageObjects.CRM_Account_FilterPage;
import com.leadAngel.pageObjects.CRM_Lead_FilterPage;
import com.leadAngel.pageObjects.DetailsPage_SalesTeam;
import com.leadAngel.pageObjects.HomePage;
import com.leadAngel.pageObjects.LeadManagementPage;
import com.leadAngel.pageObjects.LeadRouterPageObjectModel;
import com.leadAngel.pageObjects.LoginPage;
import com.leadAngel.pageObjects.RoundRobinPage;
import io.qameta.allure.Step;
@Listeners({ com.leadAngel.utilities.TestAllureListener.class })
public class TC_CrudOperation_AccountRouter_AccountManagement extends BaseClass{
	private static final Logger Logger = LogManager.getLogger(TC_CrudOperation_AccountRouter_AccountManagement.class);
	@Test(description = "AccountManagement_AccountRoute _Section")
	@Step("AccountManagement_LeadRouting_AccountRoute")
	public void AccountManagementTest() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		CRM_Lead_FilterPage LF = new CRM_Lead_FilterPage(driver);
		CRM_Account_FilterPage crm = new CRM_Account_FilterPage(driver);
		RoundRobinPage rrp = new RoundRobinPage(driver); 
		DetailsPage_SalesTeam detrrt = new DetailsPage_SalesTeam(driver); 
		AEtoSDR_Page ae = new AEtoSDR_Page(driver);
		LeadManagementPage LMP = new LeadManagementPage(driver);
		LeadRouterPageObjectModel LR=new LeadRouterPageObjectModel(driver);
		AccountMaanagement_PageObjectModel AM=new AccountMaanagement_PageObjectModel(driver);


		Thread.sleep(3500);
		try {
			AM.AccountManagement();
			Logger.info("Click on AccountManagement is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on AccountManagement is FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			AM.RightClickOnAccountRouter();
			Logger.info("Right Click On AccountRouter is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On AccountRouter is FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickOnNewObject();
			Logger.info("Click on New AccountRouter is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on New AccountRouter is Failed",e);
			sa.assertAll();
		}
		Logger.info("//===============================CREATE OBJECT SCENARIO START========================================!");
		Thread.sleep(2500);
		try {
			LMP.NameInCrudObject();
			Logger.info("Enter AutoTestName is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.info("Enter AutoTestName is FAILED!!!",e);
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
				AM.AccountRouterDropDown();
				Logger.info("Click on AccountRouter DropDown is passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on AccountRouter DropDown is FAILED!!", e);
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
				if (LR.DisplayedCannotDeleteErrorSuccessMessage() == true) 
				{
					Logger.info("Displayed 'Cannot Delete' Error Message");
					Thread.sleep(4000);
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
						String randomString = LR.generateRandomString(LR.length);
						LR.InputRename_AutoTestObject.clear();
						LR.InputRename_AutoTestObject.sendKeys(randomString);
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
				AM.RightClickOnAccountRouter();
				Logger.info("Right Click on AccountRouter is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Right Click on AccountRouter is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(4100);
			try {
				LMP.ClickOnNewObject();
				Logger.info("Click on New Account Router is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on New Account Router is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(4900);
			try {
				LMP.NameInCrudObject();
				Logger.info("Enter Object Name is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter Object Name is FAILED!!!",e);
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
			if(AM.AccountRouterOverview()==true) {
				Logger.info("Displayed AccountRouter Overview page");
				{
					Thread.sleep(2600);
					try {
						AM.AccountRouterDropDown();
						Logger.info("Click on AccountRouter DropDown is passed");
					}catch(Exception e) {
						sa.assertTrue(false);
						Logger.error("Click on AccountRouter DropDown is FAILED!!", e);
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
		Thread.sleep(3500);
		try {
			LR.ClickOnDNDdiagramDropDown();
			Logger.info("Click On DNDdiagram DropDown is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DNDdiagram DropDown is Failed!!", e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		try {
			LR.ClickOnPannerButton();
			Logger.info("Minimize the Panner is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Minimize the Panner is Failed!!", e);
			sa.assertAll();
		}

		Logger.info("*************************************** Decision Block DND ****************************************");
		Thread.sleep(4500);
		try {
			LR.DND_decisionBlock();
			Logger.info("Drag And Drop Decision block is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);	
			Logger.error("Drag And Drop Decision block is Failed!!", e);
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


		Logger.info("***************************************Assignment Block 1 DND****************************************");
		Thread.sleep(4500);
		try {
			LR.AssignmentBlock1_DND();
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

		Logger.info("***************************************DecisionBlock2 DND****************************************");
		Thread.sleep(4500);
		try {
			LR.DND_decisionBlock2();
			Logger.info("Drag And Drop DecisionBlock2 is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag And Drop DecisionBlock2 is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			LR.ConnectDecisionBlock1_To_DecisionBlock2();
			Logger.info("Connect DecisionBlock1 To DecisionBlock2 is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Connect DecisionBlock1 To DecisionBlock2 is Failed!!", e);
			sa.assertAll();
		}
		Logger.info("***************************************Assignment Block 2 DND****************************************");
		Thread.sleep(4500);
		try {
			LR.AssignmentBlock2_DND();
			Logger.info("Drag And Drop AssignmentBlock2 is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag And Drop AssignmentBlock2 is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			LR.ConnectDecisionBlock2_To_assignmentBlock2();
			Logger.info("Connect Decision Block2NO To AssignmentBlock2 is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Connect Decision Block2NO To AssignmentBlock2 is Failed!!", e);
			sa.assertAll();
		}

		Logger.info("***************************************Assignment Block 3 DND****************************************");
		Thread.sleep(4500);
		try {
			LR.AssignmentBlock3_DND();
			Logger.info("Drag And Drop AssignmentBlock3 is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag And Drop AssignmentBlock3 is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			LR.ConnectDecisionBlock2_To_assignmentBlock3();
			Logger.info("Connect Decision Block2YES To AssignmentBlock3 is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Connect Decision Block2YES To AssignmentBlock3 is Failed!!", e);
			sa.assertAll();
		}


		Logger.info("//========================================ENTERING DETAILS PAGE======================================");	
		Thread.sleep(3500);
		try {
			rrp.ClickOnDetail();
			Logger.info("Click on Detail Button is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Detail Button is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			detrrt.ClickOnSuggestedNewOwnerDropDown();
			Logger.info("Click On AccountRouterFeeder DropDown is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On AccountRouterFeeder DropDown is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(3100);
		try {
			detrrt.SelectSuggestedNewOwnerOption();
			Logger.info("Select AccountRouterFeeder Option is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select AccountRouterFeeder Option is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			detrrt.CheckBoxForSuggestedNewOwner();
			Logger.info("Click on CheckBox For AccountRouterFeeder is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on CheckBox For AccountRouterFeeder is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(900);
		try {
			detrrt.DisplaySuccessForSuggestedNewOwner();
			Logger.info("Display Success For AccountRouterFeeder is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Success For AccountRouterFeeder is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(3100);
		try {
			detrrt.LeadProcessingFeederFilterDropDown();
			Logger.info("Click on DefaultAccountOwner DropDown is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on DefaultAccountOwner DropDown is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			detrrt.SelectLeadProcessingFeederFilterOption();
			Logger.info("Select DefaultAccountOwner Option is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select DefaultAccountOwner Option is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			detrrt.CheckBoxForLeadProcessingFeederFilter();
			Logger.info("Click on CheckBox For DefaultAccountOwner is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on CheckBox For DefaultAccountOwner is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(800);
		try {
			detrrt.DisplaySuccessForLeadProcessingFeederFilter();
			Logger.info("Display Success For DefaultAccountOwner is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Success For DefaultAccountOwner is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(3100);
		try {
			detrrt.DataValueUpdateWhenRoutedToDefaultLeadOwnerAddButton();
			Logger.info("Click on DataValueUpdateWhenRoutedToDefaultAccountOwner AddButton is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on DataValueUpdateWhenRoutedToDefaultAccountOwner AddButton is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			AM.DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown1ForAccMangmnt();
			Logger.info("Click on DataValueUpdateWhenRoutedToDefaultAccountOwner DropDown1 is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on DataValueUpdateWhenRoutedToDefaultAccountOwner DropDown1 is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			detrrt.SelectDataValueUpdateWhenRoutedToDefaultLeadOwnerOption1();
			Logger.info("Select DataValueUpdateWhenRoutedToDefaultAccountOwner Option1 is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select DataValueUpdateWhenRoutedToDefaultAccountOwner Option1 is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			detrrt.DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown2();
			Logger.info("Click on DataValueUpdateWhenRoutedToDefaultAccountOwner DropDown2 is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on DataValueUpdateWhenRoutedToDefaultAccountOwner DropDown2 is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			detrrt.SelectDataValueUpdateWhenRoutedToDefaultLeadOwnerOption2();
			Logger.info("Select DataValueUpdateWhenRoutedToDefaultAccountOwner Option2 is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select DataValueUpdateWhenRoutedToDefaultAccountOwner Option2 is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			AM.CheckBoxForDataValueUpdateWhenRoutedToDefaultLeadOwnerForAccMangmnt();
			Logger.info("Click on CheckBox For DataValueUpdateWhenRoutedToDefaultAccountOwner is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on CheckBox For DataValueUpdateWhenRoutedToDefaultAccountOwner is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(500);
		try {
			detrrt.DisplaySuccessForDataValueUpdateWhenRoutedToDefaultLeadOwner();
			Logger.info("Display Success For DataValueUpdateWhenRoutedToDefaultAccountOwner is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Success For DataValueUpdateWhenRoutedToDefaultAccountOwner is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		detrrt.ClickOnEditbtn();
		Logger.info("Click On Description Edit button is Passed");
		Thread.sleep(1000);
		detrrt.InputDesc();
		Logger.info("Enter description is Passed");
		Thread.sleep(1000);
		detrrt.ClickOnbtnSaveDescForAccList();
		Logger.info("Click On Description Save button is Passed");

		Logger.info("***************************************Decision block Operation***************************************");
		Thread.sleep(3000);
		try {
			LR.ClickOndraftbox();
			Logger.info("Click On draftbox is Passed!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On draftbox is Failed!", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		Thread.sleep(2000);
		try {
			LR.DoubleClickOnDecisionBlock();
			Logger.info("Double Click On DecisionBlock is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Double Click On DecisionBlock is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
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
			if (LR.VerifiedDecisionBlockBorderColor()==true) {
				Logger.info(LR.VerifiedDecisionBlockBorderColor());
				Logger.info("Decision Block Border Color is Verified and Passed");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Decision Block Border Color is Verified and Failed !!",e);
			sa.assertAll();
		}

		Logger.info("***************************************Decision block2 Operation***************************************");
		Thread.sleep(5000);
		try {
			LR.DoubleClickOnDecisionBlock2();
			Logger.info("Double Click On DecisionBlock is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Double Click On DecisionBlock is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(4600);
		try {
			LR.SelectDecisionBlockListElem();
			Logger.info("Select Decision Block List Element is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Decision Block List Element is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(4300);
		try {
			LR.ClickOnAddButton();
			Logger.info("Click On AddButton is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On AddButton is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(3800);
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
			if (LR.VerifiedDecisionBlock2BorderColor()==true) {
				Logger.info(LR.VerifiedDecisionBlock2BorderColor());
				Logger.info("Decision Block2 Border Color is Verified and Passed");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Decision Block2 Border Color is Verified and Failed !!",e);
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
		Thread.sleep(4200);
		try {
			LR.ClickOnDropDownAssignmentBlock();
			Logger.info("Click On DropDown AssignmentBlock is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DropDown AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(4200);
		try {
			LR.SelectSalesRepInAssignmentBlock();
			Logger.info("Select SalesRep In AssignmentBlock is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select SalesRep In AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(5200);
		try {
			LR.DropDown2InAssignmentBlockForEscalationRouter();
			Logger.info("Click On DropDown2 AssignmentBlock is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DropDown2 AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(4200);
		try {
			LR.SelectSalesRepValueInAssignmentBlock();
			Logger.info("Select SalesRep Value In AssignmentBlock is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select SalesRep Value In AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.CheckBoxForAssignmentBlockAEtoSDRAccountRouter();
			Logger.info("Click On CheckBox For AssignmentBlock is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CheckBox For AssignmentBlock is is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickedOnSelectMappedSDR();
			Logger.info("Click On SelectMappedSDR is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On SelectMappedSDR is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);

		try {
			LR.ClickedOnSelectMappedSDROption();
			Logger.info("Click On SelectMappedSDR Option is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On SelectMappedSDR Option is Failed !!",e);
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
			if (LR.VerifiedAssignmentBlockBorderColor()==true) {
				Logger.info(LR.VerifiedAssignmentBlockBorderColor());
				Logger.info("AssignmentBlock Border Colour is Verified and Passed!!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("AssignmentBlock Border Colour is Verified and Failed !!",e);
			sa.assertAll();
		}

		Logger.info("*********************************************Assignment block2 Operation****************************************************");	
		Thread.sleep(4000);
		try {
			LR.DoubleClickOnAssignmentBlock2();
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
		Thread.sleep(3100);
		try {
			LR.SelectSalesRepInAssignmentBlock();
			Logger.info("Select SalesRep In AssignmentBlock is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select SalesRep In AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(5200);
		try {
			LR.DropDown2InAssignmentBlockForEscalationRouter();
			Logger.info("Click On DropDown2 AssignmentBlock is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DropDown2 AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			LR.SelectSalesRepValueInAssignmentBlock2();
			Logger.info("Select SalesRep Value In AssignmentBlock is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select SalesRep Value In AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.CheckBoxForAssignmentBlockAEtoSDRAccountRouter();
			Logger.info("Click On CheckBox For AssignmentBlock is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CheckBox For AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickedOnSelectMappedSDR();
			Logger.info("Click On SelectMappedSDR is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On SelectMappedSDR is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickedOnSelectMappedSDROption();
			Logger.info("Click On SelectMappedSDR Option is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On SelectMappedSDR Option is Failed !!",e);
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
			if (LR.VerifiedAssignmentBlock2BorderColor()==true) {
				Logger.info(LR.VerifiedAssignmentBlock2BorderColor());
				Logger.info("AssignmentBlock2 Border Colour is Verified and Passed!!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("AssignmentBlock2 Border Colour is Verified and Failed !!",e);
			sa.assertAll();
		}

		Logger.info("*********************************************Assignment block3 Operation****************************************************");	
		Thread.sleep(4100);
		try {
			LR.DoubleClickOnAssignmentBlock3();
			Logger.info("Double Click On Assignment3 Block is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Double Click On Assignment3 Block is Failed !!",e);
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
		Thread.sleep(3200);
		try {
			LR.SelectSalesRepInAssignmentBlock();
			Logger.info("Select SalesRep In AssignmentBlock is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select SalesRep In AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3200);

		try {
			LR.DropDown2InAssignmentBlockForEscalationRouter();
			Logger.info("Click On DropDown2 AssignmentBlock is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DropDown2 AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3200);
		try {
			LR.SelectSalesRepValueInAssignmentBlock2();
			Logger.info("Select SalesRep Value In AssignmentBlock is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select SalesRep Value In AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3100);
		try {
			LR.CheckBoxForAssignmentBlockAEtoSDRAccountRouter();
			Logger.info("Click On CheckBox For AssignmentBlock is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CheckBox For AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3100);
		try {
			LR.ClickedOnSelectMappedSDR();
			Logger.info("Click On SelectMappedSDR is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On SelectMappedSDR is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3100);
		try {
			LR.ClickedOnSelectMappedSDROption();
			Logger.info("Click On SelectMappedSDR Option is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On SelectMappedSDR Option is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3100);
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
			if (LR.VerifiedAssignmentBlock3BorderColor()==true) {
				Logger.info(LR.VerifiedAssignmentBlock3BorderColor());
				Logger.info("AssignmentBlock3 Border Color is Verified and Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("AssignmentBlock3 Border Color is Verified and Failed !!",e);
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
			rrp.ApproveSubmitbtnForLeadRouter();
			Logger.info("Click again Approve Button is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click again Approve Button is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(4000);
		try {
			rrp.DisplayApproved();
			Logger.info("Displayed Approved Button is PASSED!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Approved Button is FAILED!!",e);
			sa.assertAll();
		}

		Logger.info("//=================================================EDIT SCENARIO START=======================================//");
		Thread.sleep(7500);
		try {
			LMP.ContextClickOnAutoTestObject();      
			Logger.info("Right Click On AutoTestObject is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On AutoTestObject is FAILED!!", e);
			sa.assertAll();
		}	
		Thread.sleep(4500);
		try {
			rrp.ClickOnObjectEdit();
			Logger.info("Click on Edit Button is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Edit Button is FAILED!", e);
			sa.assertAll();
		}

		Logger.info("***************************************Edit Decision block2 Operation***************************************");
		Thread.sleep(4500);
		try {
			LR.DoubleClickOnDecisionBlock2();
			Logger.info("Double Click On DecisionBlock2 is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Double Click On DecisionBlock2 is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			LR.SelectDecisionBlock2ListElem();
			Logger.info("Select Edit DecisionBlock List Element is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Edit DecisionBlock List Element is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(3600);
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
			if (LR.VerifiedDecisionBlock2BorderColor()==true) {
				Logger.info(LR.VerifiedDecisionBlock2BorderColor());
				Logger.info("Decision Block2 Border Color is Verified and Passed");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Decision Block2 Border Color is Verified and Failed !!",e);
			sa.assertAll();
		}

		Logger.info("*********************************************EditAssignment block1 Operation********************************************");	
		Thread.sleep(4300);
		try {
			LR.DoubleClickOnAssignmentBlock2();
			Logger.info("Double Click On Assignment Block is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Double Click On Assignment Block is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3900);
		try {
			LR.ClickOnDropDownAssignmentBlock();
			Logger.info("Click On DropDown AssignmentBlock is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DropDown AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3100);
		try {
			LR.EditSelectSalesRepInAssignmentBlock();
			Logger.info("Select SalesRep In AssignmentBlock is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select SalesRep In AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3900);
		try {
			LR.DropDown2InAssignmentBlockForEscalationRouter();
			Logger.info("Click On DropDown2 AssignmentBlock is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DropDown2 AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			LR.EditSelectSalesRepValueInAssignmentBlock();
			Logger.info("Select SalesRep Value In AssignmentBlock is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select SalesRep Value In AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3600);
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
			if (LR.VerifiedAssignmentBlockBorderColor()==true) {
				Logger.info(LR.VerifiedAssignmentBlockBorderColor());
				Logger.info("AssignmentBlock1 Border Colour is Verified and Passed!!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("AssignmentBlock1 Border Colour is Verified and Failed !!",e);
			sa.assertAll();
		}

		Logger.info("//===============================================After Edit,Then Approve the Object========================================//");
		Thread.sleep(3500);
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
			rrp.ApproveSubmitbtnForLeadRouter();
			Logger.info("Click again Approve Button is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click again Approve Button is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3800);
		try {
			rrp.DisplayApproved();
			Logger.info("Displayed Approved Button is PASSED!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Approved Button is FAILED!!",e);
			sa.assertAll();
		}

		Logger.info("//======================================RENAME SCENARIO START=============================================//");
		Thread.sleep(3500);
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
			rrp.ClickOnObjectRename();
			Logger.info("Click on Rename Object is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Rename Object is FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.InputOnRenameAutoTestObject();
			Logger.info("Input on Rename AutoTestObject is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Input on Rename AutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			rrp.ClickOnRenameBtn();
			Logger.info("Click Rename Button is  PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Rename Button is FAILED!!!", e);
			sa.assertAll();
		}	
		Thread.sleep(400);
		if(ae.DisplaySameAEerror() == true) {
			Logger.info("Duplicate Object Found, Deleting Object NOW");
			Thread.sleep(4000);
			if (LMP.DisplayRenameAutoTestObject() == true) {
				Logger.info("Display RenameAutoTest Object");			
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
					LMP.ClickOnDeleteOnClonedAutoTestObject();
					Logger.info("Click On Delete Button in AutoTestObject is Passed!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Delete Button in AutoTestObject is FAILED!", e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					LMP.ClickOnDeletebtn();
					Logger.info("Click On Delete Button in AutoTestObject is Passed!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Delete Button in AutoTestObject is FAILED!", e);
					sa.assertAll();
				}
				Thread.sleep(400);
				try {
					if (LR.DisplayedCannotDeleteErrorSuccessMessage() == true) 
					{
						Logger.info("Displayed 'Cannot Delete' Error Message");
						Thread.sleep(4000);
						try {
							LMP.ContextClickOnRenameAutoTestObject();
							Logger.info("Right Click On RenameAutoTestObject is PASSED!!");
						}catch(Exception e) {
							sa.assertTrue(false);
							Logger.error("Right Click On RenameAutoTestObject is FAILED!!", e);
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
							String randomString = LR.generateRandomString(LR.length);
							LR.InputRename_AutoTestObject.clear();
							LR.InputRename_AutoTestObject.sendKeys(randomString);
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

			} else 
			{
				Thread.sleep(2500);
				LR.ClickOnCrudFolderDropdown();
				Logger.info("Click On CrudFolder Dropdown is PASSED!!!");
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
					LMP.ClickOnDeleteOnClonedAutoTestObject();
					Logger.info("Click On Delete Button in AutoTestObject is Passed!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Delete Button in AutoTestObject is FAILED!", e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					LMP.ClickOnDeletebtn();
					Logger.info("Click On Delete Button in AutoTestObject is Passed!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Delete Button in AutoTestObject is FAILED!", e);
					sa.assertAll();
				}
				Thread.sleep(400);
				try {
					if (LR.DisplayedCannotDeleteErrorSuccessMessage() == true) 
					{
						Logger.info("Displayed 'Cannot Delete' Error Message");
						Thread.sleep(4000);
						try {
							LMP.ContextClickOnRenameAutoTestObject();
							Logger.info("Right Click On RenameAutoTestObject is PASSED!!");
						}catch(Exception e) {
							sa.assertTrue(false);
							Logger.error("Right Click On RenameAutoTestObject is FAILED!!", e);
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
							String randomString = LR.generateRandomString(LR.length);
							LR.InputRename_AutoTestObject.clear();
							LR.InputRename_AutoTestObject.sendKeys(randomString);
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
			}
			Thread.sleep(5500);		
			Thread.sleep(4000);	
			try {
				LMP.ContextClickOnAutoTestObject();
				Logger.info("Right Click On AutoTestObject is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Right Click On AutoTestObject is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(6100);
			try {
				LMP.ClickOnRenameAutoTestObject();
				Logger.info("Click On Rename AutoTestObject is Passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Rename AutoTestObject is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(6000);
			try {
				LMP.InputOnRenameAutoTestObject();
				Logger.info("Input on Rename AutoTestObject is passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Input on Rename AutoTestObject is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(4200);
			try {
				LMP.ClickOnRenameBtn();
				Logger.info("Click on Rename Button AutoTestObject is Passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on Rename Button AutoTestObject is FAILED!", e);
				sa.assertAll();
			}
		}
		else{
			sa.assertTrue(true);
		}
		Thread.sleep(5000); 	
		try {
			if (LMP.DisplayRenameAutoTestObject() == true) {
				Logger.info("Renamed AutoTest Object is Displayed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Renamed AutoTest Object is not Displayed", e);
			sa.assertAll();
		}

		Logger.info("//===================================CLONE SCENARIO START================================================//");
		Thread.sleep(4500);
		while (LR.DisplayedAutoTestObjectRenameCopy()==true) {
			Logger.info("Displayed AutoTestObjectRenameCopy Object,So Delete that Object");
			Thread.sleep(5000);
			try {
				LR.ContextClickOnAutoTestObjectRenameCopyObject();
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
				if (LR.DisplayedCannotDeleteErrorSuccessMessage() == true) 
				{
					Logger.info("Displayed 'Cannot Delete' Error Message");
					Thread.sleep(4000);
					try {
						LR.ContextClickOnAutoTestObjectRenameCopyObject();           
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
						String randomString = LR.generateRandomString(LR.length);
						LR.InputRename_AutoTestObject.clear();
						LR.InputRename_AutoTestObject.sendKeys(randomString);
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
		Thread.sleep(5000);
		try {
			LMP.ContextClickOnCloneAutoTestObject();
			Logger.info("Right Click On ClonedAutoTestObject is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On ClonedAutoTestObject is FAILED!", e);
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
			rrp.ApproveSubmitbtnForLeadRouter();
			Logger.info("Click again Approve Button is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click again Approve Button is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3800);
		try {
			rrp.DisplayApproved();
			Logger.info("Displayed Approved button is PASSED!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Approved button is FAILED!!",e);
			sa.assertAll();
		}

		Logger.info("//===============================DELETE CLONED OBJECT SCENARIO START========================================!");
		Thread.sleep(5000);
		try {
			LMP.ContextClickOnCloneAutoTestObject();
			Logger.info("Right Click On ClonedAutoTestObject is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On ClonedAutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			LMP.ClickOnDeleteOnClonedAutoTestObject();
			Logger.info("Click On Delete Button in Cloned AutoTestObject is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Button in Clonedd AutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(4000);
		try {
			LMP.ClickOnDeletebtn();
			Logger.info("Click On Delete Button in Clone AutoTestObject is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Button in Cloned AutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(300);
		try {
			if (LMP.DisplayDeleteAutoTestObject() == true) {
				Logger.info("Display Cloned AutoTestObject Deleted successfully is PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Cloned AutoTestObject Deleted successfully is FAILED!", e);
			sa.assertAll();
		}

		Logger.info("//===============================MOVE OBJECT SCENARIO START========================================");
		Thread.sleep(6500);
		try {
			LMP.ContextClickOnRenameAutoTestObject();
			Logger.info("Right Click On RenamedAutoTestObject is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On RenamedAutoTestObject is FAILED!", e);
			sa.assertAll();
		}

		Thread.sleep(4500); 
		try {
			LMP.ClickOnMoveAutoTestObject();
			Logger.info("Click On Move Renamed AutoTestObject is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Move Renamed AutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(5100);
		try {
			LR.SelectFolderToAutotestObject();
			Logger.info("Select Folder to move the Autotest object is Passed !!!");
		} catch (Exception e) {
			Logger.info("Folder Not Found!! Craeting New Folder.");
			Thread.sleep(2500);
			rrp.ClickOnCancel();
			Logger.info("Click On Cancel button is Passed");
			Thread.sleep(4000);
			AM.RightClickOnAccountRouter();
			Logger.info("Right Click On AccountRouter is Passed");
			Thread.sleep(2500);
			LMP.ClickOnNewFolder();
			Logger.info("Click on New AccountRouter is Passed");
			Thread.sleep(2500);
			LR.NameInObject();
			Logger.info("Enter Folder Name is Passed");
			Thread.sleep(2500);
			LMP.clickOnSaveNewObject();
			Logger.info("Click On Save is Passed");
			Thread.sleep(4800);
			try {
				LMP.ContextClickOnRenameAutoTestObject();
				Logger.info("Right Click On RenamedAutoTestObject is Passed!!!");
			} catch (Exception g) {
				sa.assertTrue(false);
				Logger.error("Right Click On RenamedAutoTestObject is FAILED!", g);
				sa.assertAll();
			}
			Thread.sleep(4500);
			try {
				LMP.ClickOnMoveAutoTestObject();
				Logger.info("Click On Move Renamed AutoTestObject is Passed!!!");
			} catch (Exception f) {
				sa.assertTrue(false);
				Logger.error("Click On Move Renamed AutoTestObject is FAILED!", f);
				sa.assertAll();
			}
			Thread.sleep(4800);
			try {
				LR.SelectFolderToAutotestObject();
				Logger.info("Select Folder to move the Autotest object is passed!!!");		
			} catch (Exception e2) {
				sa.assertTrue(false);
				Logger.error("Select Folder to move the Autotest object is Failed!!!", e2);
				sa.assertAll();
			}
			Thread.sleep(2000);
		}
		Thread.sleep(2500);
		try {
			rrp.ClickOnMoveBtn();
			Logger.info("Click On Move Button is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Move Button is FAILED!", e);
			sa.assertAll();
		}

		Logger.info("******************************* Move Back the AutoTestobject to the Main folder *****************************");
		Thread.sleep(5000);
		try {
			LMP.ContextClickOnRenameAutoTestObject();
			Logger.info("Right Click On RenamedAutoTestObject is Passed!!!");
		} catch (Exception g) {
			sa.assertTrue(false);
			Logger.error("Right Click On RenamedAutoTestObject is FAILED!", g);
			sa.assertAll();
		}
		Thread.sleep(3000); 
		try {
			LMP.ClickOnMoveAutoTestObject();
			Logger.info("Click On Move Renamed AutoTestObject is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Move Renamed AutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.SelectMainFolder();
			Logger.info("Select Main Folder is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Main Folder is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			rrp.ClickOnMoveBtn();
			Logger.info("Click On Move Button is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Move Button is FAILED!", e);
			sa.assertAll();
		}

		Logger.info("//=============================== Activate and DeActivate Operation ===================================");
		Thread.sleep(5500);
		try {
			LMP.ContextClickOnRenameAutoTestObject();
			Logger.info("Right Click On RenamedAutoTestObject is Passed!!!");
		} catch (Exception g) {
			sa.assertTrue(false);
			Logger.error("Right Click On RenamedAutoTestObject is  FAILED!", g);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickOnActiveButton();
			Logger.info("Click On Active Button is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Active Button is FAILED!", e);
			sa.assertAll();
		}
		if (LR.DisplayedAlreadyUsedErrorMessage()==true) {
			Logger.info("Displayed Already Used Error Message");
			Thread.sleep(2500);
			try {
				rrp.ClickOnDetail();
				Logger.info("Click on Detail Button is Passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on Detail Button is Failed!!", e);
				sa.assertAll();
			}

			Thread.sleep(2900);
			try {
				detrrt.ClickOnSuggestedNewOwnerDropDown();
				Logger.info("Click On AccountRouterFeeder DropDown is Passed!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On AccountRouterFeeder DropDown is Failed!!", e);
				sa.assertAll();
			}

			List<WebElement> AllLinks1 = driver.findElements(By.xpath("//span[@class='ng-option-label ng-star-inserted']"));
			int Count = AllLinks1.size();
			Logger.info("Count:- "+Count);

			for (int i = 0; i < Count; i++) {

				if (i!=0) {
					Thread.sleep(1500);
					try {
						detrrt.ClickOnSuggestedNewOwnerDropDown();
						Logger.info("Click On AccountRouterFeeder DropDown is Passed!!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Click On AccountRouterFeeder DropDown is Failed!!", e);
						sa.assertAll();
					}	
				}


				List<WebElement> AllLinks = driver.findElements(By.xpath("//span[@class='ng-option-label ng-star-inserted']"));
				WebElement getLink = AllLinks.get(i);
				String getLinkText = getLink.getText();
				Thread.sleep(2000);
				try {
					getLink.click();
					Logger.info("Select "+getLinkText+" is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select "+getLinkText+" is Failed",e);
					sa.assertAll();
				}


				if (LR.DisplayedAccountRouterFeederCheckBox()==false) {

					continue;
				}
				else {
					sa.assertTrue(true);
				}
				Thread.sleep(2500);
				try {
					detrrt.CheckBoxForSuggestedNewOwner();
					Logger.info("Click on CheckBox For AccountRouterFeeder is Passed!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click on CheckBox For AccountRouterFeeder is Failed!!", e);
					sa.assertAll();
				}
				Thread.sleep(900);
				try {
					detrrt.DisplaySuccessForSuggestedNewOwner();
					Logger.info("Display Success For AccountRouterFeeder is Passed!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Display Success For AccountRouterFeeder is Failed!!", e);
					sa.assertAll();
				}
				Thread.sleep(3500);
				try {
					LMP.ContextClickOnRenameAutoTestObject();
					Logger.info("Right Click On RenamedAutoTestObject is Passed!!!");
				} catch (Exception g) {
					sa.assertTrue(false);
					Logger.error("Right Click On RenamedAutoTestObject is  FAILED!", g);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					LR.ClickOnActiveButton();
					Logger.info("Click On Active Button is Passed!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Active Button is FAILED!", e);
					sa.assertAll();
				}

				Thread.sleep(3000);

				if (LR.DisplayedAlreadyUsedErrorMessage()==true) {
					Logger.info("Displayed Already Used Error Message,Change the account router feeder option");	
					if (i==Count-1) {

						Thread.sleep(3000);
						try {
							LR.RightClickonAnyOnOftheActivatedObject();
							Logger.info("Right Click on Any One Of the Activated Object is Passed!!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Right Click on Any One Of the Activated Object is Failed!!", e);
							sa.assertAll();
						}	
						Thread.sleep(2500);
						try {
							LR.ClickOnDeActiveButton();
							Logger.info("Click On DeActive Button is Passed!!!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Click On DeActive Button is FAILED!", e);
							sa.assertAll();
						}
						Thread.sleep(2500);
						try {
							LR.ClickAgainDeActiveButton();
							Logger.info("Click Again DeActive Button is Passed!!!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Click Again DeActive Button is FAILED!", e);
							sa.assertAll();
						}

						Thread.sleep(400);
						try {
							if (LR.DisplayedDeActiveSuccessMessage() == true) {
								Logger.info("Displayed DeActivated Success Message is PASSED!!!");
							}
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Displayed DeActivated Success Message is FAILED!", e);
							sa.assertAll();
						}
						Thread.sleep(3500);
						try {
							LMP.ClickOnAgainRenameAutoTestObject();
							Logger.info("Click On RenameAutoTest Object is Passed!!!");
						} catch (Exception g) {
							sa.assertTrue(false);
							Logger.error("Click On RenameAutoTest Object is FAILED!", g);
							sa.assertAll();
						}
						Thread.sleep(3500);
						try {
							rrp.ClickOnDetail();
							Logger.info("Click on Detail Button is Passed!!!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Click on Detail Button is Failed!!", e);
							sa.assertAll();
						}

						i=0;
						continue;
					}
				}
				else {
					break;
				}
			}
		} else {
			sa.assertTrue(true);
		}


		Logger.info("************************** DeActivate Operation **************************");
		Thread.sleep(5500);
		try {
			LR.RightClickonActiveRouterRenameAutoTestObject();
			Logger.info("Right Click On Activated Object is Passed!!!");
		} catch (Exception g) {
			sa.assertTrue(false);
			Logger.error("Right Click On Activated Object is FAILED!", g);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickOnDeActiveButton();
			Logger.info("Click On DeActive Button is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DeActive Button is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickAgainDeActiveButton();
			Logger.info("Click Again DeActive Button is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Again DeActive Button is FAILED!", e);
			sa.assertAll();
		}

		Thread.sleep(400);
		try {
			if (LR.DisplayedDeActiveSuccessMessage() == true) {
				Logger.info("Displayed DeActivated Success Message is PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed DeActivated Success Message is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2000);
	}
}
