package com.leadAngel.testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.leadAngel.pageObjects.AEtoSDR_Page;
import com.leadAngel.pageObjects.AccountListPage;
import com.leadAngel.pageObjects.AccountMaanagement_PageObjectModel;
import com.leadAngel.pageObjects.CRM_Account_FilterPage;
import com.leadAngel.pageObjects.DetailsPage_SalesTeam;
import com.leadAngel.pageObjects.HomePage;
import com.leadAngel.pageObjects.LeadManagementPage;
import com.leadAngel.pageObjects.RoundRobinPage;
import com.leadAngel.pageObjects.WeightedSalesTeamPage;
@Listeners({ com.leadAngel.utilities.TestAllureListener.class })
@Test
public class TC_CrudOperation_AEtoSDRMaping_AccountManagement extends BaseClass{
	private static final Logger Logger = LogManager.getLogger(TC_CrudOperation_AEtoSDRMaping_AccountManagement.class);

	public void crud_AE_to_SDR() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		HomePage hp = new HomePage(driver);
		LeadManagementPage LMP = new LeadManagementPage(driver);
		CRM_Account_FilterPage crm = new CRM_Account_FilterPage(driver);
		RoundRobinPage rrp = new RoundRobinPage(driver); 
		AEtoSDR_Page ae = new AEtoSDR_Page(driver);
		WeightedSalesTeamPage wst = new WeightedSalesTeamPage(driver); //Used for SalesRep DND
		AccountListPage ALP = new AccountListPage(driver);
		DetailsPage_SalesTeam dp=new DetailsPage_SalesTeam(driver);
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
			LMP.ClickonSalesTeam();
			Logger.info("Clicked on Sales Team");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking on SalesTeam FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.RightClickonAE();
			Logger.info("Right Click on AE to SDR");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClicking on AEToSDR FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickOnNewObject();
			Logger.info("Clicked on New AE to SDR");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking on New AEtoSDR FAILED!!", e);
			sa.assertAll();
		}

		Logger.info("//===============================CREATE OBJECT SCENARIO START========================================!");
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
		}
		//IF condition agar Error isDisplayed to AutoTestObject ko jaa ke delete krna hai and fir se AutoTestObject naam ka Obj banana hai ELSE : Continue programme.
		Thread.sleep(1500);
		if(ae.DisplaySameAEerror() == true) {
			Logger.info("Duplicate Object Found, Deleting Object NOW!!! then Creating New Object!!");
			Thread.sleep(2500);
			try {
				LMP.getAeToSDRDropdown();
				Logger.info("Clicked on AeToSDRDropdown passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Clicked on AeToSDRDropdown  FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				LMP.ContextClickOnAutoTestObject();           
				Logger.info("RightClick On AutoTestObject PASSED!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("RightClick On AutoTestObject FAILED!", e);
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
			Thread.sleep(900);
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
			Thread.sleep(6100);
			try {
				LMP.ClickAgainonAE();
				Thread.sleep(6100);
				LMP.RightClickonAE();
				Logger.info("Right Click on AE to SDR");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("RightClicking on AEToSDR FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(5000);
			try {
				LMP.ClickOnNewObject();
				Logger.info("Clicked on New AE to SDR");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Clicking on New AEtoSDR FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(5000);
			try {
				LMP.NameInCrudObject();
				Logger.info("Entered Random Name PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Entered Random Name FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(3000);
			try {
				LMP.DescInRRT();
				Logger.info("Entered in Description");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("input in Description FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(3500);
			try {
				LMP.clickOnSaveNewObject();
				Logger.info("Clicked on Save Btn AEtoSDR");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Clicking on SaveBtn AEtoSDR FAILED!!", e);
				sa.assertAll();
			}	
		}
		else {
			sa.assertTrue(true);
		}
		driver.navigate().refresh();
		Logger.info("Refreshing The Page!!");
		Thread.sleep(6500);
		try {
			Thread.sleep(2500);
			if( AM.AEtoSDROverView()==true) {
				Thread.sleep(4000);
				Logger.info("Display_AEtoSDROverView passed");
				Thread.sleep(4500);
				try {
					AM.AEtoSDRdropDown();
					Logger.info("Clicked on AEtoSDRdropDown passed");
				}catch(Exception e) {
					sa.assertTrue(false);
					Logger.error("Clicked on AEtoSDRdropDown  FAILED!!", e);
					sa.assertAll();
				}
				Thread.sleep(4500);
				try {
					LMP.ClickOnAutoTestObject();           
					Logger.info("Click On AutoTestObject PASSED!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On AutoTestObject FAILED!", e);
					sa.assertAll();
				}
			}
		} catch (Exception e) {
			sa.assertTrue(true);
		}
		//********************************************************************************************************
		Thread.sleep(5100);
		try {
			ae.AccountExecutive_DND();
			Logger.info("DND Account Executive_1 PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("DND Account Executive_1 FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickonInputAE1();
			Thread.sleep(2500);
			LMP.ClickonInputAE1();
			Logger.info("Click Inputbox1 on Account Executive PASSED! ");
			// Thread.sleep(1000);
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Inputbox1 on Account Executive  FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			LMP.SelectonAEoption1();
			Logger.info("Select option Account Executive PASSED!!");
		}catch(Exception e) {
			//NO Name Found show hoga to if condition run hoga or object ko delete kar dega 
			if (wst.DisplayErrorMessage3()== true) {		
				Logger.info("No Name Found Message Displayed TestCase: FAILED!!!!!!");	
				sa.assertTrue(false);
				sa.assertAll();
			}
			else {
				sa.assertTrue(true);
			}			
		}
		Thread.sleep(2500);
		try {
			LMP.ClickonSDR_Mapping1();
			Thread.sleep(2500);
			LMP.ClickonSDR_Mapping1();
			Logger.info("Click Inputbox1 on SDR_Mapping PASSED!! ");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Inputbox1 on SDR_Mapping FAILED!!! ",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.SelectonSDRoption1();
			Logger.info("Select option on SDR Mapping PASSED!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select option on SDR Mapping FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			ae.AccountExecutive_DND();
			Logger.info("DND Account Executive_2 PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("DND Account Executive_2 FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickonInputAE2();
			Thread.sleep(2500);
			LMP.ClickonInputAE2();
			Logger.info("Click Inputbox2 on Account Executive PASSED");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Inputbox2 on Account Executive FAILED!!", e);
			sa.assertAll();
		}		
		Thread.sleep(2500);
		try {
			LMP.SelectonSDRoption1();
			Logger.info("Select option on Account Executive PASSED!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select option on Account Executive FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickonSDR_Mapping2();
			Thread.sleep(2500);
			LMP.ClickonSDR_Mapping2();
			Logger.info("Click Input on SDR_Mapping PASSED! ");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Input on SDR_Mapping FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.SelectonSDRoption2();
			Logger.info("Select option on SDR_Mapping PASSED!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select option on SDR_Mapping FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			LMP.ClickagainAutoTestObject();
			Thread.sleep(3500);
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
			Logger.info("Click On Approve AutoTestObject!!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking On AutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			ae.ClickOnApproveSubmit();
			Logger.info("Clicked on Approve  Submit button on Approve Dialog PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked on Approve  Submit button on Approve Dialog FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			ae.DisplayApproved();
			Logger.info("Approved Successfully PASSED!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Approved FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			dp.ClickOndetailsbutton();
			Logger.info("ClickOn Detail PASSED!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("ClickOn Detail FAILED!!", e);
			sa.assertAll();
		}
		Logger.info("//=====================================ENTERING DETAILS PAGE===================================");
		Thread.sleep(2500);
		try {
			ae.ClickOnEditbtn();
			Logger.info("ClickOn EditBtn On DetailsPage PASSED!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("ClickOn EditBtn On DetailsPage FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		Logger.info("Clicked On Description Edit button");
		ae.ClickOnInputDesc();
		Thread.sleep(2500);
		Logger.info("Input on Details TextArea");
		Thread.sleep(2500);
		ae.ClickOnSaveBtn();
		Logger.info("Clicked On Description Save button");

		Logger.info("//===========================================EDIT SCENARIO START===================================");
		Thread.sleep(3500);
		try {
			LMP.ContextClickOnAutoTestObject();           
			Logger.info("RightClick On AutoTestObject PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On AutoTestObject FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(3600);
		try {
			LMP.ClickOnEditAutoTestObject();
			Logger.info("Click On Edit AutoTestObject!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Edit AutoTestObject FAILED!", e);
			sa.assertAll();
		}

		driver.navigate().refresh();
		Logger.info("Refreshing The Page!!");
		Thread.sleep(6500);
		
		Thread.sleep(2500);
		try {
			ae.AccountExecutive_DND();
			Logger.info("AE DND PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("AE DND FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2600);
		try {
			LMP.ClickonInputAE3();
			Thread.sleep(1900);
			LMP.ClickonInputAE3();
			Logger.info("Click Inputbox3 on Account Executive PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Inputbox3 on Account Executive FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.SelectonSDRoption2();
			Logger.info("select option Account Executive PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("select option Account Executive FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickonSDR_Mapping3();
			Thread.sleep(2500);
			LMP.ClickonSDR_Mapping3();
			Logger.info("Click Input on SDR_Mapping PASSED! ");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Input on SDR_Mapping FAILED!! ", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.SelectonSDRoption3();
			Logger.info("Select option on SDR_Mapping PASSED!");
		}     catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select option on SDR_Mapping FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		ae.ClickOnApprove();
		Logger.info("Clicked on Approve Button After EDIT");
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

		Thread.sleep(4500);
		Logger.info("===========================================RENAME SCENARIO START===================================");	
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
			Logger.info("Click On Rename AutoTestObject!!!");
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
			Logger.info("Click on RenameBtn AutoTestObject!!!");
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

			} else
			{
				Thread.sleep(2500);
				LMP.ClickOnFolderSalesTeam();
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
			Logger.info("============================================RENAME SCENARIO START====================================");
			Thread.sleep(3500);
			try {
				LMP.ClickagainAutoTestObject();
				Thread.sleep(3500);
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
				Logger.info("Click On Rename AutoTestObject!!!");
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
		//=====================================================================================================================================
		Thread.sleep(4500);
		try {
			if (LMP.DisplayRenameAutoTestObject() == true) {
				Logger.info("Renaming AutoTestObject PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Renaming AutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			LMP.ClickOnAgainRenameAutoTestObject();
			Thread.sleep(2500);
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
			Logger.info("Click On Clone in RenamedAutoTestObject!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking On Clone in RenamedAutoTestObject FAILED!", e);
			sa.assertAll();

		}
		Thread.sleep(2500);
		try {
			LMP.ClickOnCloneBtn();
			Logger.info("Click On Clone Btn in RenamedAutoTestObject!!!");
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
		Thread.sleep(2500);
		Thread.sleep(500);
		try {
			LMP.ContextClickOnCloneAutoTestObject();
			Logger.info("RightClick On ClonedAutoTestObject PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On ClonedAutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Logger.info("//===============================DELETE CLONED OBJECT SCENARIO START========================================!");
		Thread.sleep(3200);
		Thread.sleep(500);
		try {
			LMP.ClickOnDeleteOnClonedAutoTestObject();
			Logger.info("Click On Delete Btn in CloneAutoTestObject Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Btn in ClonedAutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3200);
		try {
			LMP.ClickOnDeletebtn();
			Logger.info("Click On Delete Btn in CloneAutoTestObject is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Btn in ClonedAutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(800);
		try {
			if (LMP.DisplayDeleteAutoTestObject() == true) {
				Logger.info(" Display ClonedAutoTestObject Deleted successfully PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display ClonedAutoTestObject Deleted  FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(5200);
		try {
			LMP.ClickOnAgainRenameAutoTestObject();
			Thread.sleep(3100);
			LMP.ContextClickOnRenameAutoTestObject();
			Logger.info("RightClick On RenamedAutoTestObject!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On RenamedAutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		Logger.info("//===============================MOVE OBJECT SCENARIO START========================================");
		try {
			LMP.ClickOnMoveAutoTestObject();
			Logger.info("Click On Move RenamedAutoTestObject!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Move RenamedAutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.SelectFolder();
			Logger.info("Select Folder in MoveAEtoSDR!!!");
		} catch (Exception e) {
			Logger.info("Folder Not Found!! Craeting New Folder.");
			Thread.sleep(2500);
			rrp.ClickOnCancel();
			Logger.info("Click On Cancel");
			Thread.sleep(3500);
			LMP.RightClickonAE();
			Logger.info("Right Click on AE to SDR");
			Thread.sleep(2500);
			LMP.ClickOnNewFolder();
			Logger.info("Click on New Folder");
			Thread.sleep(2500);
			LMP.NameInObject();
			Logger.info("Entered Random Name");
			Thread.sleep(2500);
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
			Thread.sleep(2500);
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
		}
		Thread.sleep(2500);
		try {
			LMP.ClickOnMoveBtn();
			Logger.info("Click On MoveBtn!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On MoveBtn FAILED!", e);
			sa.assertAll();

		}

		Thread.sleep(7500);
		Logger.info("Waited 5 Seconds to Reload!!!");
		Thread.sleep(5000);
		if(LMP.VisibleOfRenameAutoTestObject()==false) {
			try {
				rrp.ClickOnMovedFolderDropDown();
				Logger.info("ClickOnMovedFolderDropDown PASSED!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("ClickOnMovedFolderDropDown FAILED!", e);
				sa.assertAll();
			}
		}
		else {
			sa.assertTrue(true);
		}
		Thread.sleep(3700);
		try {
			LMP.ContextClickOnRenameAutoTestObject();
			Logger.info("RightClick On RenamedAutoTestObject PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On RenamedAutoTestObject FAILED!", e);
			sa.assertAll();
		}

		Logger.info("//===============================DELETE OBJECT SCENARIO START========================================");
		Thread.sleep(3800);
		try {
			LMP.ClickOnDeleteOnClonedAutoTestObject();
			Logger.info("Click On Delete Btn in CloneAutoTestObject!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Btn in ClonedAutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			LMP.ClickOnDeletebtn();
			Logger.info("Click On Delete Btn in CloneAutoTestObject!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Btn in Cloned AutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(800);
		try {
			if (LMP.DisplayDeleteAutoTestObject() == true) {
				Logger.info("Display AutoTestObject Copy Deleted  PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display AutoTestObject Copy Deleted FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2000);
	}
}
