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
public class TC_CrudOperation_AccountList_AccountManagement extends BaseClass{
	private static final Logger Logger = LogManager.getLogger(TC_CrudOperation_AccountList_AccountManagement.class);

	public void crud_AccountList() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		LoginPage lp = new LoginPage(driver);
		DetailsPage_SalesTeam detrrt = new DetailsPage_SalesTeam(driver);	
		HomePage hp = new HomePage(driver);
		RoundRobinPage rrp = new RoundRobinPage(driver); // Used For Saving... Display
		AccountListPage ALP = new AccountListPage(driver);
		LeadManagementPage LMP = new LeadManagementPage(driver);
		AEtoSDR_Page ae = new AEtoSDR_Page(driver);
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
		Thread.sleep(2500);
		try {
			LMP.ClickOnDataDictionary();
			Logger.info("Clicked on Data Dictionary");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking Data Dictionary Lead Management FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.RightClickOnAccList();
			Logger.info("Right Click on AccountList");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click on AccountList FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickOnNewObject();
			Logger.info("Clicked on New Account list PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking on AccountList FAILED!!", e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		Logger.info("//===============================CREATE OBJECT SCENARIO START========================================!");
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
			Logger.info("Clicked on Save Button NewWST");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking on SaveBtn Account List FAILED!!", e);
			sa.assertAll();
		}

		//IF condition agar Error isDisplayed to AutoTestObject ko jaa ke delete krna hai and fir se AutoTestObject naam ka Obj banana hai ELSE : Continue programme.
		if(ae.DisplaySameAEerror() == true) {
			Logger.info("Duplicate Object Found, Deleting Object NOW!!! then Creating New Object!!");
			Thread.sleep(2500);
			try {
				ALP.ClickOnAccountListDropDown();
				Logger.info("ClickOnAccountListDropDown passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("ClickOnAccountListDropDown  FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(4500);
			try {
				LMP.ClickagainAutoTestObject();
				Thread.sleep(4500);
				LMP.ContextClickOnAutoTestObject();           
				Logger.info("RightClick On AutoTestObject PASSED!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Delete Btn in AutoTestObject FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				LMP.ClickOnDeleteOnClonedAutoTestObject();
				Logger.info("Click On Delete Btn in AutoTestObject!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Delete Btn in AutoTestObject FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				LMP.ClickOnDeletebtn();
				Logger.info("Click On Delete Btn in AutoTestObject!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Delete Btn in AutoTestObject FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(400);
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
			//			driver.navigate().refresh();
			//			Logger.info("Refreshing The Page!!");
			Thread.sleep(5800);
			try {
				LMP.RightClickOnAccList();
				Logger.info("Right Click on AccountList");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Right Click on AccountList FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				LMP.ClickOnNewObject();
				Logger.info("Clicked on New Account list PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Clicking on AccountList FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				LMP.NameInCrudObject();
				Logger.info("Entered Random Name PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Entered Random Name FAILED!!!",e);
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
		try {
			Thread.sleep(2500);
			if( ALP.DisplayAccountListOverView()==true) {
				Logger.info("DisplayAccountListOverView passed");
				{
					Thread.sleep(2500);
					try {
						ALP.ClickOnAccountListDropDown();
						Logger.info("ClickOnAccountListDropDown passed");
					}catch(Exception e) {
						sa.assertTrue(false);
						Logger.error("ClickOnAccountListDropDown  FAILED!!", e);
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
		Logger.info("//================================================DND Operation===============================================");
		Thread.sleep(2500);
		try {
			ALP.ClickOnAccListAttr();
			Logger.info("Clicked On AccountList Attr");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking on AccountList Attr FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			ALP.AccountList_DND();
			Logger.info("AccountList_DND ");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("AccountList_DND FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			ALP.SelectIninAccName();
			Thread.sleep(2500);
			ALP.SelectIninAccName();
			Logger.info("Select In in Account Name PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select In in Account Name FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			ALP.ClickOnAddbtn();
			Logger.info("Clicked on Add Button PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked on Add Button PASSED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			ALP.SelectOneAcc();
			Logger.info("Selected One Account PASSED!!");
		} catch (Exception e) {
			rrp.TextAreaLongitudeAlphabet();
			Logger.info("Type Into in TextAreaa Failed!!",e);
		}	
		Thread.sleep(2500);
		try {
			ALP.ClickOnSavebtn();
			Logger.info("Clicked on Save button PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked on Save button FAILED!!", e);
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

		Logger.info("//=======================================APPROVE SCENARIO START======================================//");
		Thread.sleep(3500);
		try {
			LMP.ContextClickOnAutoTestObject();    
			Logger.info("RightClick On AutoTestObject PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On AutoTestObject FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickOnApproveBtn();
			Logger.info("Click On ApproveBtn AutoTestObject PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On ApproveBtn on AutoTestObject FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		ae.ClickOnApproveSubmit();
		Logger.info("Clicked on Approve  Submit button on Approve Dialog");
		Thread.sleep(3500);
		try {
			ae.DisplayApproved();
			Logger.info("Approved Successfully PASSED!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Approved FAILED!!", e);
			sa.assertAll();
		}
		Logger.info("//========================================EDIT SCENARIO START=======================================");
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
		Thread.sleep(3000);
		try {
			LMP.ClickOnEditAutoTestObject();
			Logger.info("Click On Edit AutoTestObject PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Edit AutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			ALP.ClickOnAddbtn();
			Logger.info("Clicked on Add Button is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked on Add Button is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {	
			ALP.SelectOneAcc();
			Logger.info("Selected One Account is PASSED!!");
		} catch (Exception e) {
			rrp.TextAreaLongitudeAlphabet();
			Logger.error("Type Into in TextAreaa Failed!!",e);
		}	
		Thread.sleep(2500);
		try {
			rrp.ClickOnAboutMesaveButton();
			Logger.info("Clicked on Save btn in FirstName In PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking on Save btn in FirstName In FAILED!!!", e);
			sa.assertAll();
		}	
		Thread.sleep(3500);
		Logger.info("=============================================RENAME SCENARIO START====================================");
		Thread.sleep(3500);
		try {
			LMP.ContextClickOnAutoTestObject();
			Logger.info("RightClick On AutoTestObject PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On AutoTestObject FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickOnRenameAutoTestObject();
			Logger.info("Click On Rename AutoTestObject PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Rename AutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.InputOnRenameAutoTestObject();
			Logger.info("Input on Rename AutoTestObject!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Input on Rename AutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
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
			Thread.sleep(2500);
			if (LMP.DisplayRenameAutoTestObject() == true) {
				Logger.info("Renaming AutoTestObject PASSED!!!");			
				Thread.sleep(2500);
				try {
					LMP.ContextClickOnRenameAutoTestObject();
					Logger.info("RightClick On RenamedAutoTestObject PASSED!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("RightClick On RenamedAutoTestObject FAILED!", e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					LMP.ClickOnDeleteOnClonedAutoTestObject();
					Logger.info("Click On Delete Btn in AutoTestObject!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Delete Btn in AutoTestObject FAILED!", e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					LMP.ClickOnDeletebtn();
					Logger.info("Click On Delete Btn in AutoTestObject!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Delete Btn in AutoTestObject FAILED!", e);
					sa.assertAll();
				}
				Thread.sleep(400);
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
				Thread.sleep(2500);
				LMP.AccountListAccountManagementFolder();
				Logger.info("Clicking On Folder is PASSED!!!");
				Thread.sleep(2500);
				try {
					LMP.ContextClickOnRenameAutoTestObject();
					Logger.info("RightClick On RenamedAutoTestObject PASSED!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("RightClick On RenamedAutoTestObject FAILED!", e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					LMP.ClickOnDeleteOnClonedAutoTestObject();
					Logger.info("Click On Delete Btn in AutoTestObject!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Delete Btn in AutoTestObject FAILED!", e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					LMP.ClickOnDeletebtn();
					Logger.info("Click On Delete Btn in AutoTestObject!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Delete Btn in AutoTestObject FAILED!", e);
					sa.assertAll();
				}
				Thread.sleep(400);
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
			Thread.sleep(8000);
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
			Thread.sleep(2500);
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
		Thread.sleep(3500); 		
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
			LMP.ContextClickOnRenameAutoTestObject();
			Logger.info("RightClick On RenamedAutoTestObject PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On RenamedAutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Logger.info("//===============================CLONE SCENARIO START========================================");
		Thread.sleep(2500);
		try {
			LMP.ClickOnCloneAutoTestObject();
			Logger.info("Click On Clone in Renamed AutoTestObject PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking On Clone in Renamed AutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickOnCloneBtn();
			Logger.info("Click On Clone Btn in Renamed AutoTestObject PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking On Clone Btn in Renamed AutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(400);
		try {
			if (LMP.DisplayCloneAutoTestObject() == true) {
				Logger.info("Cloning RenamedAutoTestObject PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Cloning  in RenamedAutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(5500);
		try {
			LMP.ContextClickOnCloneAutoTestObject();
			Logger.info("RightClick On ClonedAutoTestObject PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On ClonedAutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Logger.info("//===============================DELETE CLONED OBJECT SCENARIO START========================================!");
		Thread.sleep(2600);
		try {
			LMP.ClickOnDeleteOnClonedAutoTestObject();
			Logger.info("Click On Delete Btn in Cloned AutoTestObject PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Btn in Cloned AutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2600);
		try {
			LMP.ClickOnDeletebtn();
			Logger.info("Click On Delete Btn in Cloned AutoTestObject PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Btn in ClonedA AutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(300);
		try {
			if (LMP.DisplayDeleteAutoTestObject() == true) {
				Logger.info(" Display ClonedAutoTestObject Deleted successfully PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display ClonedAutoTestObject Deleted  FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(5600);
		try {
			LMP.ClickOnAgainRenameAutoTestObject();
			Thread.sleep(5600);
			LMP.ContextClickOnRenameAutoTestObject();
			Logger.info("RightClick On RenamedAutoTestObject!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On RenamedAutoTestObject FAILED!", e);
			sa.assertAll();
		}

		Logger.info("//===============================MOVE OBJECT SCENARIO START========================================");
		Thread.sleep(5200);
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
			Thread.sleep(2500);
			rrp.ClickOnCancel();
			Logger.info("Click On Cancel");
			Thread.sleep(2500);
			LMP.RightClickOnAccList();
			Logger.info("Right Click on Account list");
			Thread.sleep(2500);
			LMP.ClickOnNewFolder();
			Logger.info("Click on New Folder");
			Thread.sleep(2500);
			LMP.NameInObject();
			Logger.info("Entered Random Name");
			Thread.sleep(2500);
			LMP.clickOnSaveNewObject();
			Logger.info("click On Save NewObject");
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
			Thread.sleep(2500);
			rrp.ClickOnMoveFolder();
			Logger.info("Select Folder in MoveWST!!!");
			Thread.sleep(1500);
		}
		Thread.sleep(4500);
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
		Thread.sleep(300);
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
