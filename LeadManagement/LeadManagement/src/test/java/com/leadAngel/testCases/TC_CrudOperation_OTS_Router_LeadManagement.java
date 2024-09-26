package com.leadAngel.testCases;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.leadAngel.pageObjects.AEtoSDR_Page;
import com.leadAngel.pageObjects.AccountListPage;
import com.leadAngel.pageObjects.CRM_Account_FilterPage;
import com.leadAngel.pageObjects.CRM_Lead_FilterPage;
import com.leadAngel.pageObjects.DetailsPage_SalesTeam;
import com.leadAngel.pageObjects.HomePage;
import com.leadAngel.pageObjects.LeadManagementPage;
import com.leadAngel.pageObjects.LeadProcessingWithoutRouting_FlowChartPage;
import com.leadAngel.pageObjects.LeadRouterPageObjectModel;
import com.leadAngel.pageObjects.LoginPage;
import com.leadAngel.pageObjects.OTS_Router_PageObjectModel;
import com.leadAngel.pageObjects.RoundRobinPage;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
public class TC_CrudOperation_OTS_Router_LeadManagement extends BaseClass {
	private final static Logger Logger = org.apache.logging.log4j.LogManager
			.getLogger(TC_CrudOperation_OTS_Router_LeadManagement.class);
	@Test(description = "LeadManagement_LeadRouting_Section")
	@Step("LeadManagement_LeadRouting_OTSrouter")
	@Description("LeadManagement_LeadRouting_OTSrouter")
	public void LeadManagementTest() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		LoginPage lp = new LoginPage(driver);
		LeadManagementPage LMP = new LeadManagementPage(driver);
		CRM_Account_FilterPage crm = new CRM_Account_FilterPage(driver);
		RoundRobinPage rrp = new RoundRobinPage(driver); // Used For Saving... Display
		DetailsPage_SalesTeam detrrt = new DetailsPage_SalesTeam(driver); //Used For Details Page
		AEtoSDR_Page ae = new AEtoSDR_Page(driver);
		HomePage hp = new HomePage(driver);
		CRM_Lead_FilterPage LF = new CRM_Lead_FilterPage(driver);
		AccountListPage ALP = new AccountListPage(driver);
		OTS_Router_PageObjectModel OTS=new OTS_Router_PageObjectModel(driver);
		LeadRouterPageObjectModel LR=new LeadRouterPageObjectModel(driver);
		LeadProcessingWithoutRouting_FlowChartPage LPWR=new LeadProcessingWithoutRouting_FlowChartPage(driver);

		Thread.sleep(3500);
		try {
			hp.ClickOnLeadManagement();
			Logger.info("Click on Lead Management is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Lead Management is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			LMP.ClickOnLeadRouting();
			Logger.info("Click on Lead Routing is passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Lead Routing is Failed",e);
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
			Logger.info("Click on New OTS Router is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on New OTS Router is Failed",e);
			sa.assertAll();
		}
		Logger.info("//===============================CREATE OBJECT SCENARIO START========================================!");
		Thread.sleep(2500);
		try {
			LMP.NameInCrudObject();
			Logger.info("Enter AutoTestName is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter AutoTestName is FAILED!!!");
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
				if (LR.DisplayedCannotDeleteErrorSuccessMessage() == true) 
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
				Logger.info("Enter Object Name is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter Object Name is FAILED!!!",e);
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
					Logger.info("Click On AutoTestObject is PASSED!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On AutoTestObject is FAILED!", e);
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
		Thread.sleep(2500);
		try {
			LR.ClickOnPannerButton();
			Logger.info("Minimize the Panner is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Minimize the Panner is Failed!!", e);
			sa.assertAll();
		}


		Logger.info("*************************************** Decision block DND ****************************************");
		Thread.sleep(4500);
		try {
			LR.DND_decisionBlock();
			Logger.info("Drag And Drop Decision block is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);	
			Logger.error("Drag And Drop Decision block is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			LR.ConnectStartBlock_To_DecisionBlock();
			Logger.info("Connect StartBlock To DecisionBlock is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Connect StartBlock To DecisionBlock is Failed!!", e);
			sa.assertAll();
		}


		Logger.info("*************************************** Action Block DND ****************************************");
		Thread.sleep(4500);
		try {
			LR.DND_ActionBlock();
			Logger.info("Drag And Drop ActionBlock is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag And Drop ActionBlock is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			LR.ConnectDecisionBlock_To_ActionBlock();
			Logger.info("Connect DecisionBlock(No) To Action Block is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Connect DecisionBlock(No) To Action Block is Failed!!", e);
			sa.assertAll();
		}


		Logger.info("*************************************** OTS Assignment Block DND And Random Split DND ****************************************");
		Thread.sleep(4500);
		try {
			LR.DND_OTSAssignment();
			Logger.info("Drag And Drop OTS AssignmentBlock is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag And Drop OTS AssignmentBlock is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			LR.DND_RandomSplit();
			Logger.info("Drag And Drop RandomSplit is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag And Drop RandomSplit is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			LR.ConnectActionBlock_To_RandomSplitBlock();
			Logger.info("Connect ActionBlock To RandomSplitBlock is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Connect ActionBlock To RandomSplitBlock is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			LR.ConnectionRandomSlitB_To_ActionBlock();
			Logger.info("Connect RandomSlitB To ActionBlock is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Connect RandomSlitB To ActionBlock is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			LR.ConnectionRandomSlitA_To_OTSAssignmentBlock();
			Logger.info("Connect RandomSlitA To OTSassignmentBlock is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Connect RandomSlitA To OTSassignmentBlock is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			LR.ConnectionDecisionBlockYES_To_OTSAssignmentBlock();
			Logger.info("Connect DecisionBlock(YES) To OTSAssignmentBlock is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Connect DecisionBlock(YES) To OTSAssignmentBlock is Failed!!!!", e);
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
		Thread.sleep(2500);
		try {
			LPWR.EnterDescriptionActionBlock();
			Logger.info("Enter Description is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Description is Failed !!", e);
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
			LPWR.ClickOnCustomFilter();
			Logger.info("Click On CustomFilter is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CustomFilter is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LPWR.EnterCustomFilter();
			Logger.info("Enter CustomFilter is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter CustomFilter is Failed !!", e);
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


		Logger.info("*********************************************ActionBlock Operation********************************************");	
		Thread.sleep(3500);
		try {
			LR.DoubleClickOnActionBlock();
			Logger.info("Double Click On Action Block is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Double Click On Action Block is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LPWR.EnterDescriptionActionBlock();
			Logger.info("Enter Description is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Description is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.SelectOnWeighBookOptionActionBlock();
			Logger.info("Select Call Webhook Option is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Call Webhook Option is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.SelectListBoxActionBlockOTS();
			Logger.info("Select On Second ListBox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select On Second ListBox is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.SelectWeighBookOptionActionBlock();
			Logger.info("Select Webhook Option is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Webhook Option is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickOnContinueProcessingCheckBoxActionBlockOTS();
			Logger.info("Click On Continue processing CheckBox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Continue processing CheckBox is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.SaveButtonForActionBlockOTS();
			Logger.info("Click On Save Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (LR.VerifiedActionBlockBorderColor()==true) {
				Logger.info(LR.VerifiedActionBlockBorderColor());
				Logger.info("Action Block Border Color is Verified and Passed");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Action Block Border Color is Verified and Failed !!",e);
			sa.assertAll();
		}

		Logger.info("*********************************************RandomSplit Operation****************************************************");	
		Thread.sleep(3500);
		try {
			LR.DoubleClickOnRandomSplit();
			Logger.info("Double Click On RandomSplit Block is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Double Click On RandomSplit Block is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickOnDescriptionOfUpdateToCRMBlock();
			Logger.info("Click On Description Of Random Split Block is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Description Of Random Split Block is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.WriteValueInsidePercentageAllocationForA();
			Logger.info("Write Value Inside PercentageAllocation For A is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Write Value Inside PercentageAllocation For A is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.WriteValueInsidePercentageAllocationForB();
			Logger.info("Write Value Inside PercentageAllocation For B is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Write Value Inside PercentageAllocation For B is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.WriteValueInsidePercentageAllocationForC();
			Logger.info("Write Value Inside PercentageAllocation For C is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Write Value Inside PercentageAllocation For C is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickOnSaveButtonForRandomSplit();
			Logger.info("Click On Save Button For RandomSplit is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button For RandomSplit is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (LR.VerifiedRandomSplitBlockBorderColor()==true) {
				Logger.info(LR.VerifiedRandomSplitBlockBorderColor());
				Logger.info("Display Random Split Border Colour is Verified and Passed!!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Random Split Border Colour is Verified and Failed!!",e);
			sa.assertAll();
		}


		Logger.info("********************************************* Assignment block Operation ****************************************************");	
		Logger.info("=========================== Details Page Operation in OTS assignment block ===========================");	
		Thread.sleep(3500);
		try {
			LR.DoubleClickOnOTSAssignmentBlock();
			Logger.info("Double Click On OTS Assignment Block is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Double Click On OTS Assignment Block is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.ClickOnDetailsButton();
			Logger.info("Click On Details Button is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Details Button is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LPWR.EnterDescriptionActionBlock();
			Logger.info("Enter Description of OTS Assignment block is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Description of OTS Assignment block is Failed !!", e);
			sa.assertAll();
		}

		Logger.info("=========================== Assignment Options Page Operation  ===========================");	
		Thread.sleep(3500);
		try {
			OTS.ClickOnAssignmentOptionsButton();
			Logger.info("Click On Assignment Options button is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Assignment Options button is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
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
			Logger.error("Select LiveClaim Option is Failed !!", e);
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
			OTS.SelectAssignBasedOnLookupFieldInTheParentAccountOption();
			Logger.info("Select AssignBasedOnLookupFieldInTheParentAccount Option is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select AssignBasedOnLookupFieldInTheParentAccount Option is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.ClickAssignBasedFirstDropDown();
			Logger.info("Click Assign Based Firstbox DropDown is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Assign Based Firstbox DropDown is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LPWR.SelectSendNotificationEmailOption();
			Logger.info("Select Assign Based Firstbox Option is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Assign Based Firstbox Option is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.ClickAssignBasedSecondDropDown();
			Logger.info("Click Assign Based Secondbox DropDown is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Assign Based Secondbox DropDown is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LPWR.SelectSendNotificationEmailOption();
			Logger.info("Select Assign Based Secondbox Option is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Assign Based Secondbox Option is Failed !!", e);
			sa.assertAll();
		}	
		Thread.sleep(2500);
		try {
			LPWR.ClickPreferHistoricalSalesPersonCheckBox();
			Logger.info("Click Prefer Historical Sales Person CheckBox is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Prefer Historical Sales Person CheckBox is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.ClickOnEmailNotificationCheckBox();
			Logger.info("Click On Email Notification CheckBox is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Email Notification CheckBox is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.ClickOnEmailNotificationDropDown();
			Logger.info("Click On Email Notification DropDown is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Email Notification DropDown is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LPWR.SelectSendNotificationEmailOption();
			Logger.info("Select Email Notification Option is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Email Notification Option is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.ClickOnTextNotificationCheckBox();
			Logger.info("Click On Text Notification CheckBox is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Text Notification CheckBox is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.ClickOnTextNotificationDropDown();
			Logger.info("Click On Text Notification DropDown is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Text Notification DropDown is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LPWR.SelectSendNotificationEmailOption();
			Logger.info("Select Text Notification Option is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Text Notification Option is Failed !!", e);
			sa.assertAll();
		}
		Logger.info("********************************************* Assignment Setup Operation ****************************************************");	
		Thread.sleep(3500);
		try {
			OTS.ClickOnReassignmentSetupButton();
			Logger.info("Click On Reassignment Setup Button is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Reassignment Setup Button is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.ClickOnAddReassignmentSetupButton();
			Logger.info("Click On Add-Reassignment Setup Button is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Add-Reassignment Setup Button is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.EnterReassignmentWaitTime();
			Logger.info("Enter ReassignmentWaitTime is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter ReassignmentWaitTime is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.ClickReassignmentWaitTimeDropDown();
			Logger.info("Click ReassignmentWaitTime DropDown is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click ReassignmentWaitTime DropDown is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.SelectMinutes();
			Logger.info("Select Minutes is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Minutes is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
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
			Logger.error("Select LiveClaim Option is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.ClickOnAssignmentOptionForSetUpDropDown();
			Logger.info("Click On Assignment Option DropDown is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Assignment Option DropDown is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.SelectAssignToSalesRepOption();
			Logger.info("Click on AssignToSalesRep option is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on AssignToSalesRep option is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.ClickSetupAssignBasedFirstDropDown();
			Logger.info("Click on main second Select DropDown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on main second Select DropDown is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			LPWR.SlectSetUpAssignToSalesRepOption();
			Logger.info("Select Option is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Option is Failed !!",e);
			sa.assertAll();
		}	
		Thread.sleep(2500);
		try {
			OTS.ClickOnSlackNotificationCheckBox();
			Logger.info("Click On Salck Notification CheckBox AssignmentSetup is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Slack Notification CheckBox AssignmentSetup is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.ClickSelectSlackTemplateDropDownAssignmentSetupOTSLR();
			Logger.info("Click SelectSlackTemplate DropDown AssignmentSetup is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click SelectSlackTemplate DropDown AssignmentSetup is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LPWR.SelectSendNotificationEmailOption();
			Logger.info("Select Slack Notification Option AssignmentSetup is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Slack Notification Option AssignmentSetup is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.ClickOnCRMinAppNotificationCheckBox();
			Logger.info("Click On CRMinApp Notification CheckBox AssignmentSetup is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CRMinApp Notification Checkbox AssignmentSetup is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.ClickSelectCRMInAppTemplateDropDownAssignmentSetup();
			Logger.info("Click Select CRMInAppTemplate DropDown AssignmentSetup is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Select CRMInAppTemplate DropDown AssignmentSetup is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LPWR.SelectSendNotificationEmailOption();
			Logger.info("Select CRMinApp Notification Option AssignmentSetup is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select CRMinApp Notification Option AssignmentSetup is Failed !!", e);
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
			if (LR.VerifiedOTSAssignmentBlockBorderColor()==true) {
				Logger.info(LR.VerifiedOTSAssignmentBlockBorderColor());
				Logger.info("OTS AssignmentBlock Border Colour is Verified and Passed!!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("OTS AssignmentBlock Border Colour is Verified and Failed!!",e);
			sa.assertAll();
		}



		Logger.info("//========================================ENTERING DETAILS PAGE======================================");	
		Thread.sleep(3500);
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
			Logger.info("Default LeadOwner DropDown is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Default Lead Owner DropDown is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			detrrt.SelectDefaultLeadOwnerLPWROption();
			Logger.info("Select Default LeadOwner Option is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Default LeadOwner Option is Failed!!", e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		try {
			OTS.ClickOnSaveButtonFordetailsPageOTSCR();
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
		Thread.sleep(2500);
		detrrt.ClickOnEditbtn();
		Logger.info("Click On Description Edit button is Passed");
		Thread.sleep(2000);
		detrrt.InputDesc();
		Logger.info("Enter Text in TextArea is Passed");
		Thread.sleep(2000);
		detrrt.ClickOnbtnSaveDescForAccList();
		Logger.info("Click On Description Save button is Passed");


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


		Logger.info("//=======================================EDIT SCENARIO START=========================================//");
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
			rrp.ClickOnObjectEdit();
			Logger.info("Click on Edit Button is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Edit Button is FAILED!", e);
			sa.assertAll();
		}
		Logger.info("***************************************Edit Decision block Operation***************************************");
		Thread.sleep(5000);
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
			LR.SelectEditDecisionBlockListElem();
			Logger.info("Select Decision Block List element is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Decision Block List element is Failed !!", e);
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
			OTS.EnterEditCustomFilter();
			Logger.info("Enter EditCustomFilter is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter EditCustomFilter is Failed !!", e);
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


		Logger.info("***************************************Edit OTS router Operation***************************************");
		Thread.sleep(3500);
		try {
			LR.DoubleClickOnOTSAssignmentBlock();
			Logger.info("Double Click On OTS Assignment Block is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Double Click On OTS Assignment Block is Failed !!",e);
			sa.assertAll();
		}	
		Thread.sleep(2500);
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
			OTS.SelectBroadcastOption();
			Logger.info("Select Broadcast Option is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Broadcast Option is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.ClickOnBroadcastViaEmailCheckBox();
			Logger.info("Click On Broadcast ViaEmail CheckBox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Broadcast ViaEmail CheckBox is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.ClickOnEmailNotificationDropDown();
			Logger.info("Click On Broadcast ViaEmail DropDown is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Broadcast ViaEmail DropDown is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LPWR.SelectSendNotificationEmailOption();
			Logger.info("Select Broadcast ViaEmail  Option is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Broadcast ViaEmail  Option is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.ClickOnBroadcastViaTextCheckBox();
			Logger.info("Click On Broadcast ViaText CheckBox is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Broadcast ViaText CheckBox is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.ClickOnTextNotificationDropDown();
			Logger.info("Click On Broadcast ViaText  DropDown is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Broadcast ViaText  DropDown is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LPWR.SelectSendNotificationEmailOption();
			Logger.info("Select Broadcast ViaText  Option is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Broadcast ViaText Option is Failed !!", e);
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
			if (LR.VerifiedOTSAssignmentBlockBorderColor()==true) {
				Logger.info(LR.VerifiedOTSAssignmentBlockBorderColor());
				Logger.info("OTS AssignmentBlock Border Colour is Verified and Passed!!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("OTS AssignmentBlock Border Colour is Verified and Failed!!",e);
			sa.assertAll();
		}

		Logger.info("//===============================================APPROVE Ater Edit========================================//");
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
			LR.ClickApproveButtonAgainAfterEdit();
			Logger.info("Click again Approve Button is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click again Approve Button is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			rrp.DisplayApproved();
			Logger.info("Display Approved button is PASSED!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Approved button is FAILED!!", e);
			sa.assertAll();
		}


		Logger.info("//======================================RENAME SCENARIO START=============================================//");
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
			rrp.ClickOnObjectRename();
			Logger.info("Click on Rename is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Rename is FAILED!!!", e);
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
		Thread.sleep(500);
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
				Thread.sleep(500);
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
				Thread.sleep(3000);
				LR.ClickOnCrudFolderDropdown();
				Logger.info("Click On CrudFolder Dropdown is PASSED!!!");
				Thread.sleep(3500);
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
			try {
				LMP.ContextClickOnAutoTestObject();
				Logger.info("Right Click On AutoTestObject is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Right Click On AutoTestObject is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(3500);
			try {
				LMP.ClickOnRenameAutoTestObject();
				Logger.info("Click On Rename AutoTestObject is Passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Rename AutoTestObject is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(3000);
			try {
				LMP.InputOnRenameAutoTestObject();
				Logger.info("Input on Rename AutoTestObject is passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Input on Rename AutoTestObject is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(2000);
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
		Thread.sleep(3500);
		while (LR.DisplayedAutoTestObjectRenameCopy()==true) {
			Logger.info("Displayed AutoTestObjectRenameCopy Object,So Delete that Object");
			Thread.sleep(4000);
			try {
				LR.ContextClickOnAutoTestObjectRenameCopyObject();
				Logger.info("Right Click On AutoTestObjectRenameCopy Object is PASSED!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Right Click On AutoTestObjectRenameCopy Object is FAILED!", e);
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
		Thread.sleep(3000);
		try {
			LMP.ClickOnCloneAutoTestObject();
			Logger.info("Click On Clone in RenamedAutoTestObject is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Clone in RenamedAutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			LMP.ClickOnCloneBtn();
			Logger.info("Click On Clone Button in RenamedAutoTestObject is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Clone Button in RenamedAutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(6000);
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
		Thread.sleep(5500);
		try {
			LMP.ContextClickOnCloneAutoTestObject();
			Logger.info("Right Click On Cloned AutoTestObject is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On Cloned AutoTestObject is FAILED!", e);
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

		Logger.info("//===============================DELETE CLONED OBJECT SCENARIO START========================================!");
		Thread.sleep(4500);
		try {
			LMP.ContextClickOnCloneAutoTestObject();
			Logger.info("Right Click On ClonedAutoTestObject is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On ClonedAutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			LMP.ClickOnDeleteOnClonedAutoTestObject();
			Logger.info("Click On Delete Button in Cloned AutoTestObject is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Button in Cloned AutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			LMP.ClickOnDeletebtn();
			Logger.info("Click On Delete Button in Cloned AutoTestObject is Passed!!!");
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
		Thread.sleep(7500);
		try {
			LMP.ContextClickOnRenameAutoTestObject();
			Logger.info("Right Click On RenamedAutoTestObject is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On RenamedAutoTestObject is FAILED!", e);
			sa.assertAll();
		}

		Thread.sleep(3500); 
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
			LR.SelectFolderToAutotestObject();
			Logger.info("Select Folder to move the Autotest object is Passed !!!");
		} catch (Exception e) {
			Logger.info("Folder Not Found!! Craeting New Folder.");
			Thread.sleep(2500);
			rrp.ClickOnCancel();
			Logger.info("Click On Cancel button is Passed");
			Thread.sleep(4500);
			OTS.RightClickOnOTSrouter();
			Logger.info("Right Click On OTSRouter is Passed");
			Thread.sleep(3500);
			LMP.ClickOnNewFolder();
			Logger.info("Click on New OTSRouter is Passed");
			Thread.sleep(3500);
			LR.NameInObject();
			Logger.info("Enter Folder Name is Passed");
			Thread.sleep(2500);
			LMP.clickOnSaveNewObject();
			Logger.info("Click On Save is Passed");
			Thread.sleep(4000);
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
			} catch (Exception f) {
				sa.assertTrue(false);
				Logger.error("Click On Move Renamed AutoTestObject is FAILED!", f);
				sa.assertAll();
			}
			Thread.sleep(3500);
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
			Logger.error("Right Click On RenamedAutoTestObject is  FAILED!", g);
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
		Thread.sleep(2500);
	}	
}
