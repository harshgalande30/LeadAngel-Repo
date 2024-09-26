package com.leadAngel.testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
	//private final static Logger Logger = org.apache.logging.log4j.LogManager
			//.getLogger(TC_CrudOperation_AccountRouter_AccountManagement.class);
	private static final Logger Logger = LogManager.getLogger(TC_CrudOperation_AccountRouter_AccountManagement.class);

	@Test(description = "AccountManagement_AccountRoute _Section")
	@Step("AccountManagement_LeadRouting_AccountRoute")

	public void LeadManagementTest() throws InterruptedException {
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
		Thread.sleep(2500);
		try {
			AM.AccountManagement();
			Logger.info("Clicked on AccountManagement is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking on AccountManagement FAILED!!",e);
			sa.assertAll();
		}
		try {
			crm.ProgressSpinnerLeft();
			Logger.info("Progressbar loading successfully PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Progressbar loading FAILED!", e);
			sa.assertAll();

		}
		Thread.sleep(2500);
		try {
			AM.RightClickOnAccountRouter();
			Logger.info("RightClickOnAccountRouter is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClickOnAccountRouter FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);

		try {
			LMP.ClickOnNewObject();
			Logger.info("Clicked on New CRM Account Filter is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked on New CRM Account Filter is Failed",e);
			sa.assertAll();
		}
		Logger.info("//===============================CREATE OBJECT SCENARIO START========================================!");
		Thread.sleep(2500);
		try {
			LMP.NameInCrudObject();
			Logger.info("Entered AutoTestName PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.info("Entered AutoTestName FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.DescInRRT();
			Logger.info("Entered in Description");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("input in Description FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);

		try {
			LMP.clickOnSaveNewObject();
			Logger.info("Clicked on Save Button NewCRM Account Filter is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked on Save Button NewCRM Account Filter is Failed", e);
			sa.assertAll();
		} 
		Thread.sleep(2500);

		//IF condition agar Error isDisplayed to AutoTestObject ko jaa ke delete krna hai and fir se AutoTestObject naam ka Obj banana hai ELSE : Continue programme.
		Thread.sleep(2500);
		if(ae.DisplaySameAEerror() == true) {
			Logger.info("Duplicate Object Found, Deleting Object NOW!!! then Creating New Object!!");
			Thread.sleep(2500);
			try {
				AM.AccountRouterDropDown();
				Logger.info("ClickOnLeadProcessingWithoutRoutingDropDown  PASSED!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("ClickOnLeadProcessingWithoutRoutingDropDown  Failed", e);
				sa.assertAll();
			}
			Thread.sleep(3100);
			try {
				LMP.ContextClickOnAutoTestObject();           
				Logger.info("RightClick On AutoTestObject PASSED!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("RightClick On AutoTestObject Failed!!", e);
				sa.assertAll();
			}

			Thread.sleep(2900);
			try {
				LMP.ClickOnDeleteOnClonedAutoTestObject();
				Logger.info("Click On Delete Btn in AutoTestObject!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Delete Btn in AutoTestObject FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(2400);

			try {
				LMP.ClickOnDeletebtn();
				Logger.info("Click On Delete Btn in AutoTestObject!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Delete Btn in AutoTestObject FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(2800);
			try {
				if (LMP.DisplayDeleteAutoTestObject() == true) {
					Logger.info("Display AutoTestObject Copy Deleted  PASSED!!!");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Display AutoTestObject Copy Deleted FAILED!", e);
				sa.assertAll();
			}


			Logger.info("Creating New Object After Deleting Old One!!!");
			Thread.sleep(5200);
			try {
				AM.AgainClickAccountRouter();
				Thread.sleep(5200);
				AM.RightClickOnAccountRouter();
				Logger.info("RightClickOnAccountRouter PASSED!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("RightClickonLeadProcessingWithoutRouting  Failed", e);
				sa.assertAll();
			}
			Thread.sleep(3100);
			try {
				LMP.ClickOnNewObject();
				Logger.info("Clicked on New CRM_LeadFilter PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Clicking on New CRM_LeadFilter FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(3100);
			try {
				LMP.NameInCrudObject();
				Logger.info("Entered Random Name PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.info("Entered Random Name FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(2600);

			try {
				LMP.DescInRRT();
				Logger.info("Entered in Description");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("input in Description FAILED!!", e);         
				sa.assertAll();
			}
			Thread.sleep(2000);
			try {
				LMP.clickOnSaveNewObject();
				Logger.info("Clicked on Save Btn AEtoSDR");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Clicking on SaveBtn AEtoSDR FAILED!!", e);
				sa.assertAll();
				Thread.sleep(1000);
			}
		}
		else {
			sa.assertTrue(true);
		}	

		Thread.sleep(4200);
		driver.navigate().refresh();
		Logger.info("Refreshing The Page!!");

		Thread.sleep(100);
		try {
			crm.ProgressSpinnerLeft();
			Logger.info("Progressbar loading successfully PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Progressbar loading FAILED!", e);
			sa.assertAll();

		}
		try {
			crm.ProgressSpinnerCenter();
			Logger.info("Progressbar loading for center successfully PASSED!!");
		} catch (Exception e) {
			Logger.error("Progressbar loading for center FAILED!", e);
			sa.assertTrue(false);
			sa.assertAll();
		}

		try {
			crm.ProgressSpinnerCenter();
			Logger.info("Progressbar loading for center successfully PASSED!!");
		} catch (Exception e) {
			Logger.error("Progressbar loading for center FAILED!", e);
			sa.assertTrue(false);
			sa.assertAll();
		}

		try {
			if(AM.AccountRouterOverview()==true) {
				Logger.info("DisplayLeadProcessingWithoutRoutingOverView passed");
				{
					Thread.sleep(2500);
					try {
						AM.AccountRouterDropDown();
						Logger.info("ClickOnLeadProcessingWithoutRoutingDropDown  PASSED!!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("ClickOnLeadProcessingWithoutRoutingDropDown  Failed", e);
						sa.assertAll();
					}
					Thread.sleep(2500);
					try {
						LMP.ClickOnAutoTestObject();           
						Logger.info("Click On AutoTestObject PASSED!!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Click On AutoTestObject FAILED!", e);
						sa.assertAll();
					}
				}
			}
		} catch (Exception e) {
			sa.assertTrue(true);
		}
		Thread.sleep(5700);
		try {
			LR.ClickOnDNDdiagramDropDown();
			Logger.info("Click On DNDdiagram DropDown is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DNDdiagram DropDown is Failed!!", e);
			sa.assertAll();
		}

		Logger.info("***************************************Account Filter1  DND****************************************");
		Thread.sleep(5800);
		try {
			AM.AccountFilter_DND();
			Logger.info("Drag And Drop AccountFilter is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag And Drop AccountFilter is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(3200);
		try {
			LR.ConnectStartBlock_To_DecisionBlock();
			Logger.info("ConnectStartBlock_To_DecisionBlock is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("ConnectStartBlock_To_DecisionBlock is Failed!!", e);
			sa.assertAll();
		}
		Logger.info("***************************************Assignment Block 1 DND****************************************");
		Thread.sleep(4800);
		try {
			LR.AssignmentBlock1_DND();
			Logger.info("Drag And Drop AssignmentBlock1 is Passed!!");

		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag And Drop AssignmentBlock1 is Failed!!", e);
			sa.assertAll();
		}

		Thread.sleep(4800);
		try {
			LR.ConnectDecisionBlock_To_assignmentBlock1();
			Logger.info("ConnectDecisionBlock_To_assignmentBlock1 is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("ConnectDecisionBlock_To_assignmentBlock1 is Failed!!!!", e);
			sa.assertAll();
		}
		Logger.info("***************************************Account Filter2  DND****************************************");
		Thread.sleep(2600);
		try {
			AM.AccountFilter2_DND();
			Logger.info("Drag And Drop AccountFilter2_DND is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag And Drop AccountFilter2_DND is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(3600);
		try {
			LR.ConnectDecisionBlock1_To_DecisionBlock2();
			Logger.info("ConnectDecisionBlock1_To_DecisionBlock2 is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("ConnectDecisionBlock1_To_DecisionBlock2 is Failed!!", e);
			sa.assertAll();
		}
		Logger.error("***************************************Assignment Block 2 DND****************************************");
		Thread.sleep(4400);
		try {
			LR.AssignmentBlock2_DND();
			Logger.error("Drag And Drop AssignmentBlock2 is Passed!!");

		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Drag And Drop AssignmentBlock2 is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(3900);
		try {
			LR.ConnectDecisionBlock2_To_assignmentBlock2();
			Logger.info("ConnectDecisionBlock2_To_AssignmentBlock2() is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("ConnectDecisionBlock2_To_AssignmentBlock2() is Failed!!", e);
			sa.assertAll();
		}
		Logger.info("***************************************Assignment Block 3 DND****************************************");
		Thread.sleep(4600);
		try {
			LR.AssignmentBlock3_DND();
			Logger.info("Drag And Drop AssignmentBlock2 is Passed!!");

		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag And Drop AssignmentBlock2 is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(4100);
		try {
			LR.ConnectDecisionBlock2_To_assignmentBlock3();
			Logger.info("ConnectDecisionBlock2_To_ActionBlock() is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("ConnectDecisionBlock2_To_ActionBlock() is Failed!!", e);
			sa.assertAll();
		}
		Logger.info("//========================================ENTERING DETAILS PAGE======================================");	
		Thread.sleep(4000);
		rrp.ClickOnDetail();
		Thread.sleep(900);
		rrp.ClickOnDetail();
		Logger.info("Entering Details Page!!!");
		Thread.sleep(2900);
		try {
			detrrt.ClickOnSuggestedNewOwnerDropDown();
			Logger.info("ClickOnSuggestedNewOwnerDropDown is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("ClickOnSuggestedNewOwnerDropDown is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(3100);
		try {
			detrrt.SelectSuggestedNewOwnerOption();
			Logger.info("SelectSuggestedNewOwnerOption is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("SelectSuggestedNewOwnerOption is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(900);
		try {
			detrrt.CheckBoxForSuggestedNewOwner();
			Logger.info("CheckBoxForSuggestedNewOwner Passed!!");

		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("CheckBoxForSuggestedNewOwner Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(900);
		try {
			detrrt.DisplaySuccessForSuggestedNewOwner();
			Logger.info("DisplaySuccessForSuggestedNewOwner is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("DisplaySuccessForSuggestedNewOwner is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(3100);
		try {
			detrrt.LeadProcessingFeederFilterDropDown();
			Logger.info("LeadProcessingFeederFilterDropDown is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("LeadProcessingFeederFilterDropDown is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			detrrt.SelectLeadProcessingFeederFilterOption();
			Logger.info("SelectLeadProcessingFeederFilterOption is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("SelectLeadProcessingFeederFilterOption is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(900);
		try {
			detrrt.CheckBoxForLeadProcessingFeederFilter();
			Logger.info("CheckBoxForLeadProcessingFeederFilter is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("CheckBoxForLeadProcessingFeederFilter is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(1900);
		try {
			detrrt.DisplaySuccessForLeadProcessingFeederFilter();
			Logger.info("DisplaySuccessForLeadProcessingFeederFilter is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("DisplaySuccessForLeadProcessingFeederFilter is Failed!!", e);
			sa.assertAll();
		}
	
		Thread.sleep(3100);
		try {
			detrrt.DataValueUpdateWhenRoutedToDefaultLeadOwnerAddButton();
			Logger.info("DataValueUpdateWhenRoutedToDefaultLeadOwnerAddButton is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("DataValueUpdateWhenRoutedToDefaultLeadOwnerAddButton is Failed!!", e);
			sa.assertAll();
		}
		try {
			AM.DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown1ForAccMangmnt();
			Logger.info("DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown1 is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown1 is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(900);
		try {
			detrrt.SelectDataValueUpdateWhenRoutedToDefaultLeadOwnerOption1();
			Logger.info("SelectDataValueUpdateWhenRoutedToDefaultLeadOwnerOption1 is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("SelectDataValueUpdateWhenRoutedToDefaultLeadOwnerOption1 is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(900);
		try {
			detrrt.DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown2();
			Logger.info("DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown2 is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown2 is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			detrrt.SelectDataValueUpdateWhenRoutedToDefaultLeadOwnerOption2();
			Logger.info("SelectDataValueUpdateWhenRoutedToDefaultLeadOwnerOption2 is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("SelectDataValueUpdateWhenRoutedToDefaultLeadOwnerOption2 is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			AM.CheckBoxForDataValueUpdateWhenRoutedToDefaultLeadOwnerForAccMangmnt();
			Logger.info("CheckBoxForDataValueUpdateWhenRoutedToDefaultLeadOwner is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("CheckBoxForDataValueUpdateWhenRoutedToDefaultLeadOwner is Failed!!", e);
			sa.assertAll();
		}

		try {
			crm.ProgressSpinnerCenter();
			Logger.info("Progressbar loading for center successfully PASSED!!");
		} catch (Exception e) {
			Logger.error("Progressbar loading for center FAILED!", e);
			sa.assertTrue(false);
			sa.assertAll();
		}
		Thread.sleep(500);
		try {
			detrrt.DisplaySuccessForDataValueUpdateWhenRoutedToDefaultLeadOwner();
			Logger.info("DisplaySuccessForDataValueUpdateWhenRoutedToDefaultLeadOwner is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("DisplaySuccessForDataValueUpdateWhenRoutedToDefaultLeadOwner is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(3100);
		detrrt.ClickOnEditbtn();
		Logger.info("Clicked On Description Edit button");

		detrrt.InputDesc();
		Logger.info("Input on Details TextArea");
		detrrt.ClickOnbtnSaveDescForAccList();
		Logger.info("Clicked On Description Save button");
		Thread.sleep(800);
		driver.navigate().refresh();
		Logger.info("Page Refresh Successfully");
		Thread.sleep(100);
		try {
			crm.ProgressSpinnerLeft();
			Logger.info("Progressbar loading for Left Side successfully PASSED!!");
		} catch (Exception e) {
			Logger.error("Progressbar loading Left Side FAILED!", e);
			sa.assertTrue(false);
			sa.assertAll();
		}

		try {
			crm.ProgressSpinnerCenter();
			Logger.info("Progressbar loading for center successfully PASSED!!");
		} catch (Exception e) {
			Logger.error("Progressbar loading for center FAILED!", e);
			sa.assertTrue(false);
			sa.assertAll();
		}

		try {
			crm.ProgressSpinnerRight();
			Logger.info("Progressbar loading for Right Side successfully PASSED!!");
		} catch (Exception e) {
			Logger.error("Progressbar for Right Side loading FAILED!", e);
			sa.assertTrue(false);
			sa.assertAll();
		}
		Thread.sleep(7000);
		try {
			rrp.ClickOnDetail();
			Thread.sleep(3100);
			rrp.ClickOnDetail();
			Logger.info("Entering Details Page!!!");
		} catch (Exception e) {
			Logger.error("Entering Details Page FAILED!!!",e);
			sa.assertTrue(false);
			sa.assertAll();
		}
		Thread.sleep(5000);
		try {
			detrrt.DisplayDescMsg();
			Logger.info("Description Message Updated successfully!");
		} catch (Exception e) {
			Logger.error("Description Message Updated FAILED!", e);
			sa.assertTrue(false);
			sa.assertAll();
		}
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
		Logger.error("***************************************Decision block Operation***************************************");
		Thread.sleep(2000);
		try {
			LR.DoubleClickOnDecisionBlock();
			Logger.info("Double Click On DecisionBlock is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Double Click On DecisionBlock is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2000);
		try {
			LR.SelectDecisionBlockListElem();
			Logger.info("Click On NewCustomerAccountListOption is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On NewCustomerAccountListOption is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2000);
		try {
			LR.ClickOnAddButton();
			Logger.info("Click On AddButton is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On AddButton is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2000);
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
			if (LR.DisplayDecisionBlockBorderColour()==true) {
				Logger.info(LR.DisplayDecisionBlockBorderColour());	
				Logger.info("DecisionBlock Border Colour is Green and  Passed !!");	
			}

		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("DecisionBlock Border Colour is not green and  Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3950);
		Logger.info("***************************************Decision block2 Operation***************************************");

		Thread.sleep(4100);
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
			Logger.info("Click On NewCustomerAccountListOption is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On NewCustomerAccountListOption is Failed !!", e);
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
		Thread.sleep(3100);
		try {
			if (LR.DisplayDecisionBlockBorderColour()==true) {
				Logger.info(LR.DisplayDecisionBlockBorderColour());	
				Logger.info("DecisionBlock Border Colour is Green and  Passed !!");	
			}

		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("DecisionBlock Border Colour is not green and  Failed !!",e);
			sa.assertAll();
		}
		Logger.info("*********************************************Assignment block1 Operation********************************************");	
		Thread.sleep(3000);
		try {
			LR.DoubleClickOnAssignmentBlock();
			Logger.info("Double Click On Assignment Block is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Double Click On Assignment Block is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.InputOnApiInAssignmentBlock();
			Logger.info("Input On ApiInAssignmentBlock is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Input On ApiInAssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3800);
		try {
			LR.ClickOnDropDownAssignmentBlock();
			Logger.info("Click On DropDown AssignmentBlock is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Click On DropDown AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(4100);
		try {
			LR.SelectSalesRepInAssignmentBlock();
			Logger.info("Select SalesRep In AssignmentBlock is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Select SalesRep In AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			LR.DropDown2InAssignmentBlockWithoutRoutingSalesRepValue();
			Logger.info("DropDown2InAssignmentBlockWithoutRoutingSalesRepValue is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("DropDown2InAssignmentBlockWithoutRoutingSalesRepValue is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			LR.SelectOptionInAssignmentBlockWithoutRoutingSalesRepValue();
			Logger.info("SelectOptionInAssignmentBlockWithoutRoutingSalesRepValue is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("SelectOptionInAssignmentBlockWithoutRoutingSalesRepValue is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			AM.CheckBoxForAssignmentBlockAEtoSDRForAccMngmt();
			Logger.info("Click On CheckBoxForAssignmentBlockAEtoSDR is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Click On CheckBoxForAssignmentBlockAEtoSDR is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3100);
		try {
			LR.ClickedOnSelectMappedSDR();
			Logger.info("Clicked On SelectMappedSDR is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Clicked On SelectMappedSDR is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3100);
		try {
			LR.ClickedOnSelectMappedSDROption();
			Logger.info("Clicked On SelectMappedSDROption is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Clicked On SelectMappedSDROption is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3100);
		try {
			LR.ClickedOnSaveButtonForAssignmentBlock();
			Logger.info("Clicked On Save Button For AssignmentBlock is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Clicked On Save Button For AssignmentBlock is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2000);
		try {
			if (LR.DisplayAssignmentBlock1BorderColour()==true) {
				Logger.info(LR.DisplayAssignmentBlock1BorderColour());
				Logger.info("AssignmentBlock1 Border Colour is Green and  Passed !!");	
			}

		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("AssignmentBlock1 Border Colour is not green and  Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		Logger.info("*********************************************Assignment block2 Operation****************************************************");	
		Thread.sleep(4100);
		try {
			LR.DoubleClickOnAssignmentBlock2();
			Logger.info("Double Click On Assignment Block is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Double Click On Assignment Block is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(4200);
		try {
			LR.InputOnApiInAssignmentBlock();
			Logger.info("Input On ApiInAssignmentBlock is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Input On ApiInAssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			LR.ClickOnDropDownAssignmentBlock();
			Logger.info("Click On DropDown AssignmentBlock is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Click On DropDown AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3100);
		try {
			LR.SelectSalesRepInAssignmentBlock();
			Logger.info("Select SalesRep In AssignmentBlock is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Select SalesRep In AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}

		Thread.sleep(3000);
		try {
			LR.DropDown2InAssignmentBlockWithoutRoutingSalesRepValue();
			Logger.info("DropDown2InAssignmentBlockWithoutRoutingSalesRepValue is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("DropDown2InAssignmentBlockWithoutRoutingSalesRepValue is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			LR.SelectOptionInAssignmentBlockWithoutRoutingSalesRepValue();
			Logger.info("SelectOptionInAssignmentBlockWithoutRoutingSalesRepValue is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("SelectOptionInAssignmentBlockWithoutRoutingSalesRepValue is Failed !!",e);
			sa.assertAll();
		}

		Thread.sleep(3100);
		try {
			AM.CheckBoxForAssignmentBlockAEtoSDRForAccMngmt();
			Logger.info("Click On CheckBoxForAssignmentBlockAEtoSDR is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Click On CheckBoxForAssignmentBlockAEtoSDR is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2900);
		try {
			LR.ClickedOnSelectMappedSDR();
			Logger.info("Clicked On SelectMappedSDR is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Clicked On SelectMappedSDR is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);

		try {
			LR.ClickedOnSelectMappedSDROption();
			Logger.info("Clicked On SelectMappedSDROption is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Clicked On SelectMappedSDROption is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickedOnSaveButtonForAssignmentBlock();
			Logger.info("Clicked On Save Button For AssignmentBlock is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Clicked On Save Button For AssignmentBlock is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			if (LR.DisplayAssignmentBlock2BorderColour()==true) {
				Logger.info(LR.DisplayAssignmentBlock2BorderColour());
				Logger.info("AssignmentBlock1 Border Colour is Green and  Passed !!");	
			}

		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("AssignmentBlock1 Border Colour is not green and  Failed !!",e);
			sa.assertAll();
		}
		Logger.info("*********************************************Assignment block3 Operation****************************************************");	
		Thread.sleep(4500);
		try {
			LR.DoubleClickOnAssignmentBlock3();
			Logger.info("Double Click On Assignment Block is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Double Click On Assignment Block is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			LR.InputOnApiInAssignmentBlock();
			Logger.info("Input On ApiInAssignmentBlock is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Input On ApiInAssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(4100);
		try {
			LR.ClickOnDropDownAssignmentBlock();
			Logger.info("Click On DropDown AssignmentBlock is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Click On DropDown AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(4100);
		try {
			LR.SelectSalesRepInAssignmentBlock();
			Logger.info("Select SalesRep In AssignmentBlock is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Select SalesRep In AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(4100);
		try {
			LR.DropDown2InAssignmentBlockWithoutRoutingSalesRepValue();
			Logger.info("DropDown2InAssignmentBlockWithoutRoutingSalesRepValue is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("DropDown2InAssignmentBlockWithoutRoutingSalesRepValue is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3800);
		try {
			LR.SelectOptionInAssignmentBlockWithoutRoutingSalesRepValue();
			Logger.info("SelectOptionInAssignmentBlockWithoutRoutingSalesRepValue is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("SelectOptionInAssignmentBlockWithoutRoutingSalesRepValue is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3100);
		try {
			AM.CheckBoxForAssignmentBlockAEtoSDRForAccMngmt();
			Logger.info("Click On CheckBoxForAssignmentBlockAEtoSDR is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Click On CheckBoxForAssignmentBlockAEtoSDR is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3100);
		try {
			LR.ClickedOnSelectMappedSDR();
			Logger.info("Clicked On SelectMappedSDR is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Clicked On SelectMappedSDR is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3100);
		try {
			LR.ClickedOnSelectMappedSDROption();
			Logger.info("Clicked On SelectMappedSDROption is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Clicked On SelectMappedSDROption is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2900);
		try {
			LR.ClickedOnSaveButtonForAssignmentBlock();
			Logger.info("Clicked On Save Button For AssignmentBlock is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Clicked On Save Button For AssignmentBlock is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2100);
		try {
			if (LR.DisplayAssignmentBlock3BorderColour()==true) {
				Logger.info(LR.DisplayAssignmentBlock2BorderColour());
				Logger.info("AssignmentBlock1 Border Colour is Green and  Passed !!");	
			}

		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("AssignmentBlock1 Border Colour is not green and  Failed !!",e);
			sa.assertAll();
		}
		Logger.info("//===============================================APPROVE SCENARIO START========================================//");
		Thread.sleep(3200);
		try {
			LMP.ContextClickOnAutoTestObject();           
			Logger.info("RightClick On AutoTestObject PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On AutoTestObject FAILED!!", e);
			sa.assertAll();
		} 
		Thread.sleep(3100);
		try {
			rrp.ClickOnApproveObject();
			Logger.info("Clicked on Approve Button PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked on Approve Button FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2400);
		try {
			rrp.ApproveSubmitbtnForLeadRouter();
			Logger.info("Clicked on Approve  Submit button on Approve Dialog PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked on Approve  Submit button on Approve Dialog FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2600);
		try {
			rrp.DisplayApproved();
			Thread.sleep(1000);
			Logger.info("Approved Successfully PASSED!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Approved FAILED!!", e);
			sa.assertAll();
		}	
		Logger.info("//=================================================EDIT SCENARIO START=======================================//");
		Thread.sleep(42000);
		try {
			LMP.ClickagainAutoTestObject();
			Thread.sleep(4100);
			LMP.ContextClickOnAutoTestObject();      
			Logger.info("RightClick On AutoTestObject PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On AutoTestObject FAILED!!", e);
			sa.assertAll();
		}	
		Thread.sleep(8000);
		try {
			rrp.ClickOnObjectEdit();
			Logger.info("clicked on Edit Button PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("clicked on Edit Button FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(400);
		try {
			crm.ProgressSpinnerCenter();
			Logger.info("Progressbar loading for center successfully PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Progressbar loading for center FAILED!", e);
			sa.assertAll();
		}
		Logger.error("***************************************Edit Decision block2 Operation***************************************");

		Thread.sleep(3950);
		try {
			LR.DoubleClickOnDecisionBlock2();
			Logger.info("Double Click On DecisionBlock is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Double Click On DecisionBlock is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(3900);
		try {
			LR.SelectEditDecisionBlockListElem();
			Logger.info("Click On NewCustomerAccountListOption is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On NewCustomerAccountListOption is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(3400);
		try {
			LR.ClickOnAddButton();
			Logger.info("Click On AddButton is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On AddButton is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2000);
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
			if (LR.DisplayDecisionBlockBorderColour()==true) {
				Logger.info(LR.DisplayDecisionBlockBorderColour());	
				Logger.info("DecisionBlock Border Colour is Green and  Passed !!");	
			}

		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("DecisionBlock Border Colour is not green and  Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		Logger.info("*********************************************EditAssignment block2 Operation********************************************");	

		Thread.sleep(4300);
		try {
			LR.DoubleClickOnAssignmentBlock2();
			Logger.info("Double Click On Assignment Block is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Double Click On Assignment Block is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3900);
		try {
			LR.ClickOnDropDownAssignmentBlock();
			Logger.info("Click On DropDown AssignmentBlock is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Click On DropDown AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3100);
		try {
			LR.EditSelectSalesRepInAssignmentBlock();
			Logger.info("Select SalesRep In AssignmentBlock is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Select SalesRep In AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3900);
		try {
			LR.DropDown2InAssignmentBlockWithoutRoutingSalesRepValue();
			Logger.info("Click On DropDown2 AssignmentBlock is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Click On DropDown2 AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			LR.EditSelectSalesRepValueInAssignmentBlock();
			Logger.info("Select SalesRep Value In AssignmentBlock is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Select SalesRep Value In AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3600);
		try {
			LR.ClickedOnSaveButtonForAssignmentBlock();
			Logger.info("Clicked On Save Button For AssignmentBlock is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Clicked On Save Button For AssignmentBlock is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (LR.DisplayAssignmentBlock2BorderColour()==true) {
				Logger.info(LR.DisplayAssignmentBlock2BorderColour());
				Logger.info("AssignmentBlock1 Border Colour is Green and  Passed !!");	
			}

		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("AssignmentBlock1 Border Colour is not green and  Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		Logger.info("*********************************************Edit Assignment block3 Operation****************************************************");	
		Thread.sleep(4100);
		try {
			LR.DoubleClickOnAssignmentBlock3();
			Logger.info("Double Click On Assignment Block is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Double Click On Assignment Block is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			LR.ClickOnDropDownAssignmentBlock();
			Logger.info("Click On DropDown AssignmentBlock is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Click On DropDown AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3100);
		try {
			LR.EditSelectSalesRepInAssignmentBlock();
			Logger.info("Select SalesRep In AssignmentBlock is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Select SalesRep In AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3900);
		try {
			LR.DropDown2InAssignmentBlockWithoutRoutingSalesRepValue();
			Logger.info("Click On DropDown2 AssignmentBlock is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Click On DropDown2 AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			LR.EditSelectSalesRepValueInAssignmentBlock();
			Logger.info("Select SalesRep Value In AssignmentBlock is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Select SalesRep Value In AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3200);
		try {
			LR.ClickedOnSaveButtonForAssignmentBlock();
			Logger.info("Clicked On Save Button For AssignmentBlock is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Clicked On Save Button For AssignmentBlock is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			if (LR.DisplayAssignmentBlock3BorderColour()==true) {
				Logger.info(LR.DisplayAssignmentBlock2BorderColour());
				Logger.info("AssignmentBlock1 Border Colour is Green and  Passed !!");	
			}

		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("AssignmentBlock1 Border Colour is not green and  Failed !!",e);
			sa.assertAll();
		}
		Logger.info("//======================================RENAME SCENARIO START==========================================//");
		Thread.sleep(3100);
		try {
			LMP.ClickagainAutoTestObject();
			Thread.sleep(3100);
			LMP.ContextClickOnAutoTestObject();
			Logger.info("RightClick On AutoTestObject PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On AutoTestObject FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2100);
		try {
			rrp.ClickOnObjectRename();
			Logger.info("Clicked on Rename Object PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked on Rename Object FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(2100);
		try {
			LMP.InputOnRenameAutoTestObject();
			Logger.info("Input on Rename AutoTestObject!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Input on Rename AutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2000);
		try {
			rrp.ClickOnRenameBtn();
			Logger.info("Clicked Rename Button is  PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked Rename Button is FAILED!!!", e);
			sa.assertAll();
		}	

		//IF condition agar Error isDisplayed to AutoTestObject ko jaa ke delete krna hai and fir se AutoTestObject naam ka Obj banana hai ELSE : Continue programme.

		if(ae.DisplaySameAEerror() == true) {
			Logger.info("Duplicate Object Found, Deleting Object NOW!!! then Creating New Object!!");
			//	Thread.sleep(1500);
			Thread.sleep(4000);

			if (LMP.DisplayRenameAutoTestObject() == true) {
				Logger.info("Renaming AutoTestObject PASSED!!!");			
				Thread.sleep(4000);	

				try {
					LMP.ContextClickOnRenameAutoTestObject();
					Logger.info("RightClick On RenamedAutoTestObject PASSED!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("RightClick On RenamedAutoTestObject FAILED!", e);
					sa.assertAll();
				}
				Thread.sleep(2000);
				try {
					LMP.ClickOnDeleteOnClonedAutoTestObject();
					Logger.info("Click On Delete Btn in AutoTestObject!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Delete Btn in AutoTestObject FAILED!", e);
					sa.assertAll();
				}
				Thread.sleep(2000);
				try {
					LMP.ClickOnDeletebtn();
					Logger.info("Click On Delete Btn in AutoTestObject!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Delete Btn in AutoTestObject FAILED!", e);
					sa.assertAll();
				}
				try {
					if (LMP.DisplayDeleteAutoTestObject() == true) {
						Logger.info("Display AutoTestObject Copy Deleted  PASSED!!!");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Display AutoTestObject Copy Deleted FAILED!", e);
					sa.assertAll();
				}
				Logger.info("Creating New Object After Deleting Old One!!!");
				Thread.sleep(2800);

			} else 
			{
				rrp.AccRouterAccMgmtFolder();
				Logger.info("Clicking On Folder is PASSED!!!");
				Thread.sleep(2000);
				try {
					LMP.ContextClickOnRenameAutoTestObject();
					Logger.info("RightClick On RenamedAutoTestObject PASSED!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("RightClick On RenamedAutoTestObject FAILED!", e);
					sa.assertAll();
				}
				try {
					LMP.ClickOnDeleteOnClonedAutoTestObject();
					Logger.info("Click On Delete Btn in AutoTestObject!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Delete Btn in AutoTestObject FAILED!", e);
					sa.assertAll();
				}
				try {
					LMP.ClickOnDeletebtn();
					Logger.info("Click On Delete Btn in AutoTestObject!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Delete Btn in AutoTestObject FAILED!", e);
					sa.assertAll();
				}
				Thread.sleep(3200);
				try {
					if (LMP.DisplayDeleteAutoTestObject() == true) {
						Logger.info("Display AutoTestObject Copy Deleted  PASSED!!!");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Display AutoTestObject Copy Deleted FAILED!", e);
					sa.assertAll();
				}
				Logger.info("Creating New Object After Deleting Old One!!!");

			}
			Thread.sleep(6200);		
			Logger.info("=============================================RENAME SCENARIO START====================================");
			try {
				LMP.ClickagainAutoTestObject();
				Thread.sleep(4500);		
				LMP.ContextClickOnAutoTestObject();
				Logger.info("RightClick On AutoTestObject PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("RightClick On AutoTestObject FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(6100);
			try {
				LMP.ClickOnRenameAutoTestObject();
				Logger.info("Click On Rename AutoTestObject!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Rename AutoTestObject FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(6000);
			try {
				LMP.InputOnRenameAutoTestObject();
				Logger.info("Input on Rename AutoTestObject!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Input on Rename AutoTestObject FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(4200);
			try {
				LMP.ClickOnRenameBtn();
				Logger.info("Click on RenameBtn AutoTestObject!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Clicking on RenameBtn AutoTestObject FAILED!", e);
				sa.assertAll();
			}
		}
		else{
			sa.assertTrue(true);
		}
		//=====================================================================================================================	
		Thread.sleep(4900); 	
		try {
			if (LMP.DisplayRenameAutoTestObject() == true) {
				Logger.info("Renaming AutoTestObject PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Renaming AutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		Logger.info("//========================================CLONE SCENARIO START======================================//");
		try {
			LMP.ContextClickOnRenameAutoTestObject();
			Logger.info("RightClick On RenamedAutoTestObject PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On RenamedAutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3800);
		try {
			LMP.ClickOnCloneAutoTestObject();
			Logger.info("Click On Clone in RenamedAutoTestObject PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking On Clone in RenamedAutoTestObject FAILED!", e);
			sa.assertAll();

		}
		Thread.sleep(4500);
		try {
			LMP.ClickOnCloneBtn();
			Logger.info("Click On Clone Btn in RenamedAutoTestObject PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking On Clone Btn in RenamedAutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			if (LMP.DisplayCloneAutoTestObject() == true) {
				Logger.info("Cloning RenamedAutoTestObject PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Cloning  in RenamedAutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(4000);
		try {
			LMP.ContextClickOnCloneAutoTestObject();
			Logger.info("RightClick On ClonedAutoTestObject PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On ClonedAutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Logger.info("//===============================DELETE CLONED OBJECT SCENARIO START========================================!");
		Thread.sleep(2000);
		try {
			LMP.ClickOnDeleteOnClonedAutoTestObject();
			Logger.info("Click On Delete Btn in Clone AutoTestObject!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Btn in Cloned AutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2000);
		try {
			LMP.ClickOnDeletebtn();
			Logger.info("Click On Delete Btn in Clone AutoTestObject!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Btn in Cloned AutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(150);
		try {
			if (LMP.DisplayDeleteAutoTestObject() == true) {
				Logger.info(" Display Cloned AutoTestObject Deleted successfully PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Cloned AutoTestObject Deleted  FAILED!", e);
			sa.assertAll();
		}

		try {
			crm.ProgressSpinnerCenter();
			Logger.info("Progressbar loading for center successfully PASSED!!");
		} catch (Exception e) {
			Logger.error("Progressbar loading for center FAILED!", e);
			sa.assertTrue(false);
			sa.assertAll();
		}
		Thread.sleep(5200);
		try {
			LMP.ClickOnAgainRenameAutoTestObject();
			Thread.sleep(5200);
			LMP.ContextClickOnRenameAutoTestObject();
			Logger.info("RightClick On RenamedAutoTestObject!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On RenamedAutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(1500); 
		Logger.info("//===============================MOVE OBJECT SCENARIO START========================================");
		Thread.sleep(6100); 

		try {
			LMP.ClickOnMoveAutoTestObject();
			Logger.info("Click On Move Renamed AutoTestObject!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Move Renamed AutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(5100);
		try {
			rrp.ClickOnMoveFolder();
			Logger.info("Select Folder in MoveWST!!!");
		} catch (Exception e) {
			Logger.info("Folder Not Found!! Craeting New Folder.");
			Thread.sleep(2500);
			rrp.ClickOnCancel();
			Thread.sleep(1000);
			AM.RightClickOnAccountRouter();
			Logger.info("RightClickOnAccountRouter();");
			Thread.sleep(1000);
			LMP.ClickOnNewFolder();
			Logger.info("Click on New Folder");
			LMP.NameInObject();
			Logger.info("Entered Random Name");
			LMP.clickOnSaveNewObject();
			Thread.sleep(4800);
			try {
				LMP.ContextClickOnRenameAutoTestObject();
				Logger.info("RightClick On RenamedAutoTestObject!!!");
			} catch (Exception g) {
				sa.assertTrue(false);
				Logger.error("RightClick On RenamedAutoTestObject FAILED!", g);
				sa.assertAll();
			}
			Thread.sleep(4500);
			try {
				LMP.ClickOnMoveAutoTestObject();
				Logger.info("Click On Move Renamed AutoTestObject!!!");
			} catch (Exception f) {
				sa.assertTrue(false);
				Logger.error("Click On Move Renamed AutoTestObject FAILED!", f);
				sa.assertAll();
			}
			Thread.sleep(4800);
			try {
				rrp.ClickOnMoveFolder();
				Logger.info("Select Folder in MoveWST passed!!!");		

			} catch (Exception e2) {
				sa.assertTrue(false);
				Logger.error("Select Folder in MoveWST Failed!!!", e2);
				sa.assertAll();
			}
			Thread.sleep(900);
		}

		try {
			rrp.ClickOnMoveBtn();
			Logger.info("Click On MoveBtn!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On MoveBtn FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(170);
		try {
			crm.ProgressSpinnerRight();
			Logger.info("Progressbar loading for Right Side successfully PASSED!!");
		} catch (Exception e) {
			Logger.error("Progressbar for Right Side loading FAILED!", e);
			sa.assertTrue(false);
			sa.assertAll();
		}
		Thread.sleep(5100);
		Logger.info("Waited 5 Seconds to Reload!!!");
		Thread.sleep(3500);

		try {
			LMP.ClickOnAgainRenameAutoTestObject();
			Thread.sleep(3600);
			LMP.ContextClickOnRenameAutoTestObject();
			Logger.info("RightClick On RenamedAutoTestObject PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On RenamedAutoTestObject FAILED!", e);
			sa.assertAll();
		}

		Logger.info("//===============================DELETE OBJECT SCENARIO START========================================");
		Thread.sleep(5100);
		try {
			LMP.ClickOnDeleteOnClonedAutoTestObject();
			Logger.info("Click On Delete Btn in Clone AutoTestObject!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Btn in Cloned AutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			LMP.ClickOnDeletebtn();
			Logger.info("Click On Delete Btn in Clone AutoTestObject!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Btn in Cloned AutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3200);
		try {
			if (LMP.DisplayDeleteAutoTestObject() == true) {
				Logger.info("Display AutoTestObject Deleted  PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display AutoTestObject Deleted FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2000);	
	}
}
