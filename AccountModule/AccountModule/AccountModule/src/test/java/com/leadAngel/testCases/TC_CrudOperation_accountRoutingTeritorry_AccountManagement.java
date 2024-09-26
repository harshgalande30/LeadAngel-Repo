package com.leadAngel.testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.leadAngel.pageObjects.AEtoSDR_Page;
import com.leadAngel.pageObjects.AccountListPage;
import com.leadAngel.pageObjects.AccountMaanagement_PageObjectModel;
import com.leadAngel.pageObjects.DetailsPage_SalesTeam;
import com.leadAngel.pageObjects.HomePage;
import com.leadAngel.pageObjects.LeadManagementPage;
import com.leadAngel.pageObjects.LoginPage;
import com.leadAngel.pageObjects.RoundRobinPage;
@Listeners({ com.leadAngel.utilities.TestAllureListener.class })
@Test
public class TC_CrudOperation_accountRoutingTeritorry_AccountManagement extends BaseClass {

	//private final static Logger Logger = org.apache.logging.log4j.LogManager.getLogger(TC_CrudOperation_AccountRoutingTerritory.class);
	private static final Logger Logger = LogManager.getLogger(TC_CrudOperation_accountRoutingTeritorry_AccountManagement.class);

	public void crud_AccountList() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		LoginPage lp = new LoginPage(driver);
		DetailsPage_SalesTeam detrrt = new DetailsPage_SalesTeam(driver);	
		HomePage hp = new HomePage(driver);
		RoundRobinPage rrp = new RoundRobinPage(driver);
		AccountListPage ALP = new AccountListPage(driver);
		LeadManagementPage LMP = new LeadManagementPage(driver);
		AEtoSDR_Page ae = new AEtoSDR_Page(driver);
		AccountMaanagement_PageObjectModel AM=new AccountMaanagement_PageObjectModel(driver);
		Thread.sleep(1000);
		try {
			AM.AccountManagement();
			Logger.info("Clicked on AccountManagement is Passed12");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking on AccountManagement FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(900);
		try {
			AM.RightClickOnAccountRoutingTerritory();
			Logger.info("RightClickOnAccountRoutingTerritory is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClickOnAccountRoutingTerritory FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(500);
		try {
			LMP.ClickOnNewObject();
			Logger.info("Clicked on New Account list PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking on AccountList FAILED!!", e);
			sa.assertAll();
		}

		Thread.sleep(500);
		Logger.info("//===============================CREATE OBJECT SCENARIO START========================================!");
		try {
			LMP.NameInCrudObject();
			Logger.info("Entered AutoTestName PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.info("Entered AutoTestName FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			LMP.DescInRRT();
			Logger.info("Entered in Description");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("input in Description FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			LMP.clickOnSaveNewObject();
			Logger.info("Clicked on Save Button NewWST");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking on SaveBtn Account List FAILED!!", e);
			sa.assertAll();
		}

		//IF condition agar Error isDisplayed to AutoTestObject ko jaa ke delete krna hai and fir se AutoTestObject naam ka Obj banana hai ELSE : Continue programme.
		if(ae.DisplaySameAEerror() == true) {
			Logger.info("Duplicate Object Found, Deleting Object NOW!!! then Creating New Object!!");

			try {
				AM.AccountRoutingTerritoryDropDown();
				Logger.info("Clicked on AccountRoutingTerritoryDropDown passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Clicked on AccountRoutingTerritoryDropDown  FAILED!!", e);
				sa.assertAll();
			}

			Thread.sleep(3800);
			LMP.ContextClickOnAutoTestObject();           
			Logger.info("RightClick On AutoTestObject PASSED!!");
			try {
				LMP.ClickOnDeleteOnClonedAutoTestObject();
				Logger.info("Click On Delete Btn in AutoTestObject!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Delete Btn in AutoTestObject FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(300);
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

			Thread.sleep(4200);
			try {
				AM.AgainClickAccountRoutingTerritory();
				Thread.sleep(4200);
				AM.RightClickOnAccountRoutingTerritory();
				Logger.info("RightClickOnAccountRoutingTerritory is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("RightClickOnAccountRoutingTerritory FAILED!!",e);
				sa.assertAll();
			}
			Thread.sleep(2000);

			try {
				LMP.ClickOnNewObject();
				Logger.info("Clicked on New Account list PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Clicking on AccountList FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(1000);
			try {
				LMP.NameInCrudObject();
				Logger.info("Entered Random Name PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Entered Random Name FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(300);
			try {
				LMP.DescInRRT();
				Logger.info("Entered in Description");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("input in Description FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(300);
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
		Thread.sleep(3500);
		driver.navigate().refresh();
		Logger.info("Refreshing The Page!!");
		Thread.sleep(5000);


		//=======================================================================================================================		

		try {

			if( AM.DisplayAccountRoutingTerritoryOverviewPage()==true) {
				Logger.info("Display_AccountRoutingTerritory_MapingOverview passed");
				{
					Thread.sleep(3000);
					try {
						AM.AccountRoutingTerritoryDropDown();
						Logger.info("Clicked on AccountRoutingTerritoryDropDown passed");
					}catch(Exception e) {
						sa.assertTrue(false);
						Logger.error("Clicked on AccountRoutingTerritoryDropDown  FAILED!!", e);
						sa.assertAll();
					}
					Thread.sleep(3000);
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
		
		Logger.info("//================================================AccoutList_DND Operation===============================================");
		Thread.sleep(2500);
		try {
			AM.DataDictionary();
			Logger.info("ClickOn DataDictionary is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("ClickOn DataDictionary FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			AM.AccoutList_DND();
			Logger.info("AccoutList_DND is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("AccoutList_DND is FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(2100);
		try {
			AM.SelectAccountListOption();
			Thread.sleep(2100);
			AM.SelectAccountListOption();
			Logger.info("SelectAccountListOption is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("SelectAccountListOption is FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			AM.SelectAccountListValueDropDown();
			Logger.info("SelectAccountListValueDropDown is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("SelectAccountListValueDropDown is FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(2000);
		try {
			AM.SelectAccountListValueOption();
			Logger.info("SelectAccountListValueOption is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("SelectAccountListValueOption is FAILED!!",e);
			sa.assertAll();
		}
		Logger.info("//================================================CRMaccountFilter_DND Operation===============================================");

		Thread.sleep(3500);
		try {
			AM.CRMaccountFilter_DND();
			Logger.info("CRMaccountFilter_DND is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("CRMaccountFilter_DND is FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(2800);
		try {
			AM.SelectCRMaccountFilterOption();
			Thread.sleep(2800);
			AM.SelectCRMaccountFilterOption();
			Logger.info("SelectCRMaccountFilterOption is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("SelectCRMaccountFilterOption is FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(2100);
		try {
			AM.SelectCRMaccountFilterValueDropDown();
			Logger.info("SelectCRMaccountFilterValueDropDown is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("SelectCRMaccountFilterValueDropDown is FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(2800);
		try {
			AM.SelectCRMaccountFilterValueOption();
			Logger.info("SelectCRMaccountFilterValueOption is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("SelectCRMaccountFilterValueOption is FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		Logger.info("//================================================ENTERING DETAILS PAGE===============================================");
		try {
			rrp.ClickOnDetail();
			Thread.sleep(2500);
			rrp.ClickOnDetail();
			Logger.info("Entering Details Page!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Entering Details Page FAILED!!!",e);
			sa.assertAll();
		}
		detrrt.ClickOnEditbtn();
		Logger.info("Clicked On Description Edit button");

		detrrt.InputDesc();
		Logger.info("Input on Details TextArea");
		detrrt.ClickOnbtnSaveDescForAccList();
		Logger.info("Clicked On Description Save button");


		driver.navigate().refresh();
		Thread.sleep(7000);
		try {
			rrp.ClickOnDetail();
			Thread.sleep(4200);
			rrp.ClickOnDetail();
			Logger.info("Entering Details Page!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Entering Details Page FAILED!!!",e);
			sa.assertAll();
		}
		try {
			detrrt.DisplayDescMsg();
			Logger.info("Description Message Updated successfully!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Description Message Updated FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		Logger.info("//=======================================APPROVE SCENARIO START======================================//");

		try {
			LMP.ContextClickOnAutoTestObject();      
			Logger.info("RightClick On AutoTestObject PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On AutoTestObject FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(1500);

		try {
			LMP.ClickOnApproveBtn();
			Logger.info("Click On ApproveBtn AutoTestObject PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On ApproveBtn on AutoTestObject FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		ae.ClickOnApproveSubmit();
		Logger.info("Clicked on Approve  Submit button on Approve Dialog");
		hp.ProgressSpinner();
		Logger.info("Progress Spinner...Center");
		try {
			ae.DisplayApproved();
			Logger.info("Approved Successfully PASSED!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Approved FAILED!!", e);
			sa.assertAll();
		}
		Logger.info("//========================================EDIT SCENARIO START=======================================");
		Thread.sleep(3800);
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
		Thread.sleep(3000);
		try {
			LMP.ClickOnEditAutoTestObject();
			Logger.info("Click On Edit AutoTestObject PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Edit AutoTestObject FAILED!", e);
			sa.assertAll();

		}
		Thread.sleep(1000);
		try {
			AM.EditSelectAccountListOption();
			Logger.info("EditSelectAccountListOption is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("EditSelectAccountListOption is FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			AM.EditSelectAccountListValueDropDown();
			Logger.info("EditSelectAccountListValueDropDown is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("EditSelectAccountListValueDropDown is FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			AM.EditSelectAccountListValueOption();
			Logger.info("EditSelectAccountListValueOption is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("EditSelectAccountListValueOption is FAILED!!",e);
			sa.assertAll();
		}
		Logger.info("//=======================================APPROVE SCENARIO START======================================//");
		Thread.sleep(4500);
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
		Thread.sleep(1500);

		try {
			LMP.ClickOnApproveBtn();
			Logger.info("Click On ApproveBtn AutoTestObject PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On ApproveBtn on AutoTestObject FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		ae.ClickOnApproveSubmit();
		Logger.info("Clicked on Approve  Submit button on Approve Dialog");
		hp.ProgressSpinner();
		Logger.info("Progress Spinner...Center");
		Thread.sleep(1500);
		try {
			ae.DisplayApproved();
			Logger.info("Approved Successfully PASSED!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Approved FAILED!!", e);
			sa.assertAll();
		}
		
		Logger.info("=============================================RENAME SCENARIO START====================================");
//		Thread.sleep(4500);
//		try {
//			LMP.ClickagainAutoTestObject();
//			Thread.sleep(4500);
//			LMP.ContextClickOnAutoTestObject();
//			Logger.info("RightClick On AutoTestObject PASSED!!");
//		}catch(Exception e) {
//			sa.assertTrue(false);
//			Logger.error("RightClick On AutoTestObject FAILED!!", e);
//			sa.assertAll();
//		}
		Thread.sleep(1000);
		try {
			LMP.ClickOnRenameAutoTestObject();
			Logger.info("Click On Rename AutoTestObject PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Rename AutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			LMP.InputOnRenameAutoTestObject();
			Logger.info("Input on Rename AutoTestObject!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Input on Rename AutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			LMP.ClickOnRenameBtn();
			Logger.info("Click on RenameBtn AutoTestObject PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking on RenameBtn AutoTestObject FAILED!", e);
			sa.assertAll();
		}
		//IF condition agar Error isDisplayed to AutoTestObject ko jaa ke delete krna hai and fir se AutoTestObject naam ka Obj banana hai ELSE : Continue programme.
		if(ae.DisplaySameAEerror() == true) {
			Logger.info("Duplicate Object Found, Deleting Object NOW!!! then Creating New Object!!");
			Thread.sleep(1500);
			Thread.sleep(1000);

			if (LMP.DisplayRenameAutoTestObject() == true) {
				Logger.info("Renaming AutoTestObject PASSED!!!");			
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
				LMP.AccRoutingTeritoryFolder();
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
			Logger.info("===============================================RENAME SCENARIO START========================================");
			Thread.sleep(4200);
			try {
				LMP.ContextClickOnAutoTestObject();
				Logger.info("RightClick On AutoTestObject PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("RightClick On AutoTestObject FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(8000);	
			try {
				LMP.ClickOnRenameAutoTestObject();
				Logger.info("Click On Rename AutoTestObject!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Rename AutoTestObject FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(3500);
			try {
				LMP.InputOnRenameAutoTestObject();
				Logger.info("Input on Rename AutoTestObject!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Input on Rename AutoTestObject FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(1000);
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
		//===============================================================================================================   		
		Thread.sleep(3000); 		
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
		try {
			LMP.ClickOnAgainRenameAutoTestObject();
			Thread.sleep(4500);
			LMP.ContextClickOnRenameAutoTestObject();
			Logger.info("RightClick On RenamedAutoTestObject PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On RenamedAutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Logger.info("//======================================CLONE SCENARIO START============================================");
		try {
			LMP.ClickOnCloneAutoTestObject();
			Logger.info("Click On Clone in Renamed AutoTestObject PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking On Clone in Renamed AutoTestObject FAILED!", e);
			sa.assertAll();

		}
		try {
			LMP.ClickOnCloneBtn();
			Logger.info("Click On Clone Btn in Renamed AutoTestObject PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking On Clone Btn in Renamed AutoTestObject FAILED!", e);
			sa.assertAll();
		}
		try {
			if (LMP.DisplayCloneAutoTestObject() == true) {
				Logger.info("Cloning RenamedAutoTestObject PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Cloning  in RenamedAutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			LMP.ContextClickOnCloneAutoTestObject();
			Logger.info("RightClick On ClonedAutoTestObject PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On ClonedAutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Logger.info("//===============================DELETE CLONED OBJECT SCENARIO START========================================!");
		try {
			LMP.ClickOnDeleteOnClonedAutoTestObject();
			Logger.info("Click On Delete Btn in Cloned AutoTestObject PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Btn in Cloned AutoTestObject FAILED!", e);
			sa.assertAll();
		}
		try {
			LMP.ClickOnDeletebtn();
			Logger.info("Click On Delete Btn in Cloned AutoTestObject PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Btn in ClonedA AutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2000);
		try {
			if (LMP.DisplayDeleteAutoTestObject() == true) {
				Logger.info(" Display ClonedAutoTestObject Deleted successfully PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display ClonedAutoTestObject Deleted  FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(12000);

		try {
			LMP.ContextClickOnRenameAutoTestObject();
			Logger.info("RightClick On RenamedAutoTestObject!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On RenamedAutoTestObject FAILED!", e);
			sa.assertAll();
		}

		Logger.info("//===============================MOVE OBJECT SCENARIO START========================================");

		Thread.sleep(10000);
		try {
			rrp.ClickOnObjectMove();
			Logger.info("Click On Move Renamed AutoTestObject PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Move Renamed AutoTestObject FAILED!", e);
			sa.assertAll();
		}

		Thread.sleep(4500);
		try {
			LMP.SelectFolder();
			Logger.info("Select Folder in MoveAEtoSDR!!!");
		} catch (Exception e) {
			Logger.info("Folder Not Found!! Craeting New Folder.");
			rrp.ClickOnCancel();
			Thread.sleep(1500);
			AM.RightClickOnAccountRoutingTerritory();
			Logger.info("Right Click On AccountRoutingTerritory is passed");
			Thread.sleep(1000);
			LMP.ClickOnNewFolder();
			Logger.info("Click on New Folder");
			LMP.NameInObject();
			Logger.info("Entered Random Name");
			LMP.clickOnSaveNewObject();
			Thread.sleep(3000);
			try {
				LMP.ContextClickOnRenameAutoTestObject();
				Logger.info("RightClick On RenamedAutoTestObject!!!");
			} catch (Exception g) {
				sa.assertTrue(false);
				Logger.error("RightClick On RenamedAutoTestObject FAILED!", g);
				sa.assertAll();
			}
			Thread.sleep(4000);
			try {
				LMP.ClickOnMoveAutoTestObject();
				Logger.info("Click On Move Renamed AutoTestObject!!!");
			} catch (Exception f) {
				sa.assertTrue(false);
				Logger.error("Click On Move Renamed AutoTestObject FAILED!", f);
				sa.assertAll();
			}
			Thread.sleep(10000);
			rrp.ClickOnMoveFolder();
			Logger.info("Select Folder in MoveWST!!!");
			Thread.sleep(1500);
		}
		Thread.sleep(15000);
		try {
			LMP.ClickOnMoveBtn();
			Logger.info("Click On MoveBtn!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On MoveBtn FAILED!", e);
			sa.assertAll();

		}
		Thread.sleep(5000);
		Logger.info("Waited 5 Seconds to Reload!!!");
		Thread.sleep(4500);
		try {
			LMP.ClickOnAgainRenameAutoTestObject();
			Thread.sleep(4500);
			LMP.ContextClickOnRenameAutoTestObject();
			Logger.info("RightClick On RenamedAutoTestObject PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On RenamedAutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Logger.info("//===============================DELETE OBJECT SCENARIO START========================================");
		Thread.sleep(4800);    		
		try {
			LMP.ClickOnDeleteOnClonedAutoTestObject();
			Logger.info("Click On Delete Btn in Renamed AutoTestObject PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Btn in Renamed AutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(4100);
		try {
			LMP.ClickOnDeletebtn();
			Logger.info("Click On Delete Btn in Renamed AutoTestObject PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Btn in Renamed AutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(160);
		try {
			if (LMP.DisplayDeleteAutoTestObject() == true) {
				Logger.info("Display Renamed AutoTestObject Deleted  PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Renamed AutoTestObject Deleted FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2000);
	}
}
