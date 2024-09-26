package com.leadAngel.testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.StaleElementReferenceException;
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
	private void handleException(SoftAssert sa, String errorMessage, Exception e) {
		sa.assertTrue(false);
		Logger.error(errorMessage, e);
		sa.assertAll();
	}
	//private final static Logger Logger = org.apache.logging.log4j.LogManager.getLogger(TC_CrudOperation_AEtoSDRMaping_AccountManagement.class);
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
			handleException(sa,"Clicking on AccountManagement FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickonSalesTeam();
			Logger.info("Clicked on Sales Team");
		}catch(Exception e) {
			sa.assertTrue(false);
			handleException(sa,"Clicking on SalesTeam FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.RightClickonAE();
			Logger.info("Right Click on AE to SDR");
		}catch(Exception e) {
			sa.assertTrue(false);
			handleException(sa,"RightClicking on AEToSDR FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickOnNewObject();
			Logger.info("Clicked on New AE to SDR");
		}catch(Exception e) {
			sa.assertTrue(false);
			handleException(sa,"Clicking on New AEtoSDR FAILED!!", e);
			sa.assertAll();
		}

		
		Logger.info("//===============================CREATE OBJECT SCENARIO START========================================!");
		Thread.sleep(2500);
		try {
			LMP.NameInCrudObject();
			Logger.info("Entered Random Name PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			handleException(sa,"Entered Random Name FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.DescInRRT();
			Logger.info("Entered in Description");
		}catch(Exception e) {
			sa.assertTrue(false);
			handleException(sa,"input in Description FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.clickOnSaveNewObject();
			Logger.info("Clicked on Save Btn AEtoSDR");
		}catch(Exception e) {
			sa.assertTrue(false);
			handleException(sa,"Clicking on SaveBtn AEtoSDR FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(500);
		//IF condition agar Error isDisplayed to AutoTestObject ko jaa ke delete krna hai and fir se AutoTestObject naam ka Obj banana hai ELSE : Continue programme.

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
				handleException(sa,"RightClick On AutoTestObject FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				LMP.ClickOnDeleteOnClonedAutoTestObject();
				Logger.info("Click On Delete Btn in AutoTestObject!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				handleException(sa,"Click On Delete Btn in AutoTestObject FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				LMP.ClickOnDeletebtn();
				Logger.info("Click On Delete Btn in AutoTestObject!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				handleException(sa,"Click On Delete Btn in AutoTestObject FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(900);
			try {
				if (LMP.DisplayDeleteAutoTestObject() == true) {
					Logger.info("Display AutoTestObject Copy Deleted  PASSED!!!");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				handleException(sa,"Display AutoTestObject Copy Deleted FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(500);
			try {
				crm.ProgressSpinnerCenter();
				Logger.info("Progressbar loading for center successfully PASSED!!");
			} catch (Exception e) {
				Logger.error("Progressbar loading for center FAILED!", e);
				sa.assertTrue(false);
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
				handleException(sa,"RightClicking on AEToSDR FAILED!!", e);
				sa.assertAll();
			}
			//Thread.sleep(6000);

			try {
				Thread.sleep(5000);
				LMP.ClickOnNewObject();
				Logger.info("Clicked on New AE to SDR");
			}catch(Exception e) {
				sa.assertTrue(false);
				handleException(sa,"Clicking on New AEtoSDR FAILED!!", e);
				sa.assertAll();
			}
			//Thread.sleep(6000);
			Thread.sleep(5000);
			try {
				LMP.NameInCrudObject();
				Logger.info("Entered Random Name PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				handleException(sa,"Entered Random Name FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(3000);
			try {
				LMP.DescInRRT();
				Logger.info("Entered in Description");
			}catch(Exception e) {
				sa.assertTrue(false);
				handleException(sa,"input in Description FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(3500);
			try {
				LMP.clickOnSaveNewObject();
				Logger.info("Clicked on Save Btn AEtoSDR");
			}catch(Exception e) {
				sa.assertTrue(false);
				handleException(sa,"Clicking on SaveBtn AEtoSDR FAILED!!", e);
				sa.assertAll();
			}	
		}

		else {
			sa.assertTrue(true);
		}
		//Thread.sleep(3500);
		driver.navigate().refresh();
		Logger.info("Refreshing The Page!!");
		Thread.sleep(6500);
		try {
			if( AM.AEtoSDROverView()==true) {
				Thread.sleep(4000);
				Logger.info("Display_AEtoSDROverView passed");
				Thread.sleep(3500);
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
		try {
			Thread.sleep(5100);
			ae.AccountExecutive_DND();
			Logger.info("DND Account Executive_1 PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			handleException(sa,"DND Account Executive_1 FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickonInputAE1();
			Thread.sleep(1000);
			LMP.ClickonInputAE1();
			Logger.info("Click Inputbox1 on Account Executive PASSED! ");
			// Thread.sleep(1000);
		}catch(Exception e) {
			sa.assertTrue(false);
			handleException(sa,"Click Inputbox1 on Account Executive  FAILED!!", e);
			sa.assertAll();
		}
		//Thread.sleep(1000);
		Thread.sleep(1500);
		try {
			LMP.SelectonAEoption1();
			Logger.info("Select option Account Executive PASSED!!");
		}catch(Exception e) {

			//NO Name Found show hoga to if condition run hoga or object ko delete kar dega 

			if (wst.DisplayErrorMessage3()== true) {		
				Logger.info("No Name Found Message Displayed TestCase: FAILED!!!!!!");	
				//Thread.sleep(2500);
				sa.assertTrue(false);
				sa.assertAll();

			}
			else {
				sa.assertTrue(true);
			}			
		}

		try {

			if (rrp.DisplaySavingInfo()) {
				Logger.info("Saving on Active IsTrue successfully!!");
			}
		} catch (StaleElementReferenceException e1) {
			sa.assertTrue(false);
			Logger.error("Saving on Active IsTrue FAILED!!", e1);
			sa.assertAll();
		}

		Thread.sleep(1000);

		try {
			LMP.ClickonSDR_Mapping1();
			Thread.sleep(500);
			LMP.ClickonSDR_Mapping1();
			Logger.info("Click Inputbox1 on SDR_Mapping PASSED!! ");
		}catch(Exception e) {
			sa.assertTrue(false);
			handleException(sa,"Click Inputbox1 on SDR_Mapping FAILED!!! ",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			LMP.SelectonSDRoption1();
			Logger.info("Select option on SDR Mapping PASSED!");
		}catch(Exception e) {
			sa.assertTrue(false);
			handleException(sa,"Select option on SDR Mapping FAILED!!",e);
			sa.assertAll();
		}

		try {

			if (rrp.DisplaySavingInfo()) {
				Logger.info("Saving on Active IsTrue successfully!!");
			}
		} catch (StaleElementReferenceException e1) {
			sa.assertTrue(false);
			Logger.error("Saving on Active IsTrue FAILED!!", e1);
			sa.assertAll();
		}
		//Thread.sleep(2000);
		Thread.sleep(2500);
		try {
			ae.AccountExecutive_DND();
			Logger.info("DND Account Executive_2 PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			handleException(sa,"DND Account Executive_2 FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			LMP.ClickonInputAE2();
			Thread.sleep(500);
			LMP.ClickonInputAE2();
			Logger.info("Click Inputbox2 on Account Executive PASSED");
		}catch(Exception e) {
			sa.assertTrue(false);
			handleException(sa,"Click Inputbox2 on Account Executive FAILED!!", e);
			sa.assertAll();
		}		
		//Thread.sleep(700);
		Thread.sleep(1000);
		try {
			LMP.SelectonSDRoption1();
			Logger.info("Select option on Account Executive PASSED!");
		}catch(Exception e) {
			sa.assertTrue(false);
			handleException(sa,"Select option on Account Executive FAILED!!", e);
			sa.assertAll();
		}
		try {

			if (rrp.DisplaySavingInfo()) {
				Logger.info("Saving on Active IsTrue successfully!!");
			}
		} catch (StaleElementReferenceException e1) {
			sa.assertTrue(false);
			Logger.error("Saving on Active IsTrue FAILED!!", e1);
			sa.assertAll();
		}
		//Thread.sleep(2000);

		try {
			LMP.ClickonSDR_Mapping2();
			Thread.sleep(500);
			LMP.ClickonSDR_Mapping2();

			Logger.info("Click Input on SDR_Mapping PASSED! ");
		}catch(Exception e) {
			sa.assertTrue(false);
			handleException(sa,"Click Input on SDR_Mapping FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(1000);

		try {
			LMP.SelectonSDRoption2();
			Logger.info("Select option on SDR_Mapping PASSED!");
		}catch(Exception e) {
			sa.assertTrue(false);
			handleException(sa,"Select option on SDR_Mapping FAILED!", e);
			sa.assertAll();
		}

		try {

			if (rrp.DisplaySavingInfo()) {
				Logger.info("Saving on Active IsTrue successfully!!");
			}
		} catch (StaleElementReferenceException e1) {
			sa.assertTrue(false);
			Logger.error("Saving on Active IsTrue FAILED!!", e1);
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
			handleException(sa,"RightClick On AutoTestObject FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(100);
		try {
			LMP.ClickOnApproveBtn();
			Logger.info("Click On Approve AutoTestObject!!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			handleException(sa,"Clicking On AutoTestObject FAILED!", e);
			sa.assertAll();
		}

		//Thread.sleep(1000);
		Thread.sleep(2100);
		try {
			ae.ClickOnApproveSubmit();
			Logger.info("Clicked on Approve  Submit button on Approve Dialog PASSED!!");
		} catch (Exception e) {
			handleException(sa,"Clicked on Approve  Submit button on Approve Dialog FAILED!!", e);
			sa.assertTrue(false);
			sa.assertAll();
		}
		Thread.sleep(2100);
		try {
			ae.DisplayApproved();
			Logger.info("Approved Successfully PASSED!");
		} catch (Exception e) {
			handleException(sa,"Approved FAILED!!", e);
			sa.assertTrue(false);
			sa.assertAll();
		}
		Thread.sleep(2200);
		try {
			dp.ClickOndetailsbutton();
			Logger.info("ClickOn Detail PASSED!");
		}catch(Exception e) {
			sa.assertTrue(false);
			handleException(sa,"ClickOn Detail FAILED!!", e);
			sa.assertAll();
		}
		Logger.info("//=========================ENTERING DETAILS PAGE===========================");
		try {
			ae.ClickOnEditbtn();
			Logger.info("ClickOn EditBtn On DetailsPage PASSED!");
		}catch(Exception e) {
			sa.assertTrue(false);
			handleException(sa,"ClickOn EditBtn On DetailsPage FAILED!!", e);
			sa.assertAll();
		}
		//Thread.sleep(1000);
		Logger.info("Clicked On Description Edit button");
		ae.ClickOnInputDesc();
		//Thread.sleep(1000);
		Logger.info("Input on Details TextArea");

		Thread.sleep(500);
		ae.ClickOnSaveBtn();
		Logger.info("Clicked On Description Save button");
		Thread.sleep(4100);
		try {
			dp.ClickOndetailsbutton();
			Logger.info("ClickOn Detail PASSED!");
			Thread.sleep(4100);
			dp.ClickOndetailsbutton();
			Logger.info("ClickOn Detail PASSED!");
		}catch(Exception e) {
			sa.assertTrue(false);
			handleException(sa,"ClickOn Detail FAILED!!", e);
			sa.assertAll();
		}

		Thread.sleep(1800);
		try {
			ae.DisplayUpdatedDescMesg();
			Logger.info("Description Message Updated successfully!");
		} catch (Exception e) {
			handleException(sa,"Description Message Updated FAILED!", e);
			sa.assertTrue(false);
			sa.assertAll();
		}

//		Thread.sleep(5200);
//		try {
//			LMP.ClickagainAutoTestObject();
//			Thread.sleep(5200);
//			LMP.ContextClickOnAutoTestObject(); 
//			Logger.info("RightClick On AutoTestObject PASSED!!");
//		}catch(Exception e) {
//			sa.assertTrue(false);
//			handleException(sa,"RightClick On AutoTestObject FAILED!!", e);
//			sa.assertAll();
//		}
		Logger.info("//===========================================EDIT SCENARIO START===================================");
		Thread.sleep(3600);
		try {
			LMP.ClickOnEditAutoTestObject();
			Logger.info("Click On Edit AutoTestObject!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			handleException(sa,"Click On Edit AutoTestObject FAILED!", e);
			sa.assertAll();

		}

		try {
			crm.ProgressSpinnerCenter();
			Logger.info("Progressbar loading for center successfully PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			handleException(sa,"Progressbar loading for center FAILED!", e);
			sa.assertAll();

		}
		// =========================================AFTER EDIT=================================================
		Thread.sleep(4200);
		driver.navigate().refresh();
		Logger.info("Refreshing The Page!!");
		try {
			crm.ProgressSpinnerLeft();
			Logger.info("Progressbar loading successfully PASSED!!");
		} catch (Exception e) {
			handleException(sa,"Progressbar loading FAILED!", e);
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
			Logger.info("Progressbar loading for Right successfully PASSED!!");
		} catch (Exception e) {
			Logger.error("Progressbar loading for Right FAILED!", e);
			sa.assertTrue(false);
			sa.assertAll();
		}

		Thread.sleep(5100);
		try {
			ae.AccountExecutive_DND();
			Logger.info("AE DND PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			handleException(sa,"AE DND FAILED!", e);
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
			handleException(sa,"Click Inputbox3 on Account Executive FAILED!!", e);
			sa.assertAll();
		}
		//Thread.sleep(2900);
		Thread.sleep(2100);
		try {
			LMP.SelectonSDRoption2();

			Logger.info("select option Account Executive PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("select option Account Executive FAILED!!", e);
			sa.assertAll();
		}
		try {

			if (rrp.DisplaySavingInfo()) {
				Logger.info("Saving on Active IsTrue successfully!!");
			}
		} catch (StaleElementReferenceException e1) {
			sa.assertTrue(false);
			Logger.error("Saving on Active IsTrue FAILED!!", e1);
			sa.assertAll();
		}

		//	Thread.sleep(2900);
		Thread.sleep(1500);
		try {
			LMP.ClickonSDR_Mapping3();
			Thread.sleep(500);
			LMP.ClickonSDR_Mapping3();
			Logger.info("Click Input on SDR_Mapping PASSED! ");
		} catch (Exception e) {
			sa.assertTrue(false);
			handleException(sa,"Click Input on SDR_Mapping FAILED!! ", e);
			sa.assertAll();
		}
		//	Thread.sleep(2800);
		Thread.sleep(1500);
		try {
			LMP.SelectonSDRoption3();
			Logger.info("Select option on SDR_Mapping PASSED!");
		}     catch (Exception e) {
			sa.assertTrue(false);
			handleException(sa,"Select option on SDR_Mapping FAILED!!!", e);
			sa.assertAll();
		}

		try {

			if (rrp.DisplaySavingInfo()) {
				Logger.info("Saving on Active IsTrue successfully!!");
			}
		} catch (StaleElementReferenceException e1) {
			sa.assertTrue(false);
			Logger.error("Saving on Active IsTrue FAILED!!", e1);
			sa.assertAll();
		}
		Thread.sleep(1500);

		ae.ClickOnApprove();
		Logger.info("Clicked on Approve Button After EDIT");
		Thread.sleep(1700);
		ae.ClickOnApproveSubmit();
		Logger.info("Clicked on Approve  Submit button on Approve Dialog");

		try {
			crm.ProgressSpinnerCenter();
			Logger.info("Progressbar loading for center successfully PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			handleException(sa,"Progressbar loading for center FAILED!", e);
			sa.assertAll();

		}
		Thread.sleep(400);
		try {
			ae.DisplayApproved();
			Logger.info("Approved Successfully PASSED!");
		} catch (Exception e) {
			sa.assertTrue(false);
			handleException(sa,"Approved FAILED!!", e);
			sa.assertAll();
		}

		Thread.sleep(4500);
		Logger.info("===========================================RENAME SCENARIO START===================================");	
		try {
			LMP.ContextClickOnAutoTestObject();
			Logger.info("RightClick On AutoTestObject PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			handleException(sa,"RightClick On AutoTestObject FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			LMP.ClickOnRenameAutoTestObject();
			Logger.info("Click On Rename AutoTestObject!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			handleException(sa,"Click On Rename AutoTestObject FAILED!", e);
			sa.assertAll();
		}

		try {
			LMP.InputOnRenameAutoTestObject();
			Logger.info("Input on Rename AutoTestObject!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			handleException(sa,"Input on Rename AutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(300);
		try {
			LMP.ClickOnRenameBtn();
			Logger.info("Click on RenameBtn AutoTestObject!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			handleException(sa,"Clicking on RenameBtn AutoTestObject FAILED!", e);
			sa.assertAll();
		}
		//IF condition agar Error isDisplayed to AutoTestObject ko jaa ke delete krna hai and fir se AutoTestObject naam ka Obj banana hai ELSE : Continue programme.

		if(ae.DisplaySameAEerror() == true) {
			Logger.info("Duplicate Object Found, Deleting Object NOW!!! then Creating New Object!!");
			//Thread.sleep(1500);
			Thread.sleep(1000);

			if (LMP.DisplayRenameAutoTestObject() == true) {
				Logger.info("Renaming AutoTestObject PASSED!!!");			
				//Thread.sleep(2000);	
				Thread.sleep(500);
				try {
					LMP.ContextClickOnRenameAutoTestObject();
					Logger.info("RightClick On RenamedAutoTestObject PASSED!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					handleException(sa,"RightClick On RenamedAutoTestObject FAILED!", e);
					sa.assertAll();
				}
				try {
					LMP.ClickOnDeleteOnClonedAutoTestObject();
					Logger.info("Click On Delete Btn in AutoTestObject!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					handleException(sa,"Click On Delete Btn in AutoTestObject FAILED!", e);
					sa.assertAll();
				}
				Thread.sleep(500);
				try {
					LMP.ClickOnDeletebtn();
					Logger.info("Click On Delete Btn in AutoTestObject!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					handleException(sa,"Click On Delete Btn in AutoTestObject FAILED!", e);
					sa.assertAll();
				}
				try {
					if (LMP.DisplayDeleteAutoTestObject() == true) {
						Logger.info("Display AutoTestObject Copy Deleted  PASSED!!!");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					handleException(sa,"Display AutoTestObject Copy Deleted FAILED!", e);
					sa.assertAll();
				}
				Logger.info("Creating New Object After Deleting Old One!!!");
				//Thread.sleep(3000);

			} else
			{
				LMP.ClickOnFolderSalesTeam();
				Logger.info("Clicking On Folder is PASSED!!!");
				//Thread.sleep(2000);
				try {
					LMP.ContextClickOnRenameAutoTestObject();
					Logger.info("RightClick On RenamedAutoTestObject PASSED!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					handleException(sa,"RightClick On RenamedAutoTestObject FAILED!", e);
					sa.assertAll();
				}
				try {
					LMP.ClickOnDeleteOnClonedAutoTestObject();
					Logger.info("Click On Delete Btn in AutoTestObject!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					handleException(sa,"Click On Delete Btn in AutoTestObject FAILED!", e);
					sa.assertAll();
				}
				try {
					LMP.ClickOnDeletebtn();
					Logger.info("Click On Delete Btn in AutoTestObject!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					handleException(sa,"Click On Delete Btn in AutoTestObject FAILED!", e);
					sa.assertAll();
				}
				try {
					if (LMP.DisplayDeleteAutoTestObject() == true) {
						Logger.info("Display AutoTestObject Copy Deleted  PASSED!!!");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					handleException(sa,"Display AutoTestObject Copy Deleted FAILED!", e);
					sa.assertAll();
				}
				Logger.info("Creating New Object After Deleting Old One!!!");		
			}
			Thread.sleep(1500);
			Thread.sleep(800);
			Logger.info("============================================RENAME SCENARIO START====================================");
			try {
				LMP.ContextClickOnAutoTestObject();
				Logger.info("RightClick On AutoTestObject PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				handleException(sa,"RightClick On AutoTestObject FAILED!!", e);
				sa.assertAll();
			}
			//Thread.sleep(2000);
			Thread.sleep(1000);
			try {
				LMP.ClickOnRenameAutoTestObject();
				Logger.info("Click On Rename AutoTestObject!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				handleException(sa,"Click On Rename AutoTestObject FAILED!", e);
				sa.assertAll();
			}

			try {
				LMP.InputOnRenameAutoTestObject();
				Logger.info("Input on Rename AutoTestObject!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				handleException(sa,"Input on Rename AutoTestObject FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(800);
			try {
				LMP.ClickOnRenameBtn();
				Logger.info("Click on RenameBtn AutoTestObject!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				handleException(sa,"Clicking on RenameBtn AutoTestObject FAILED!", e);
				sa.assertAll();
			}

			try {
				crm.ProgressSpinnerCenter();
				Logger.info("Progressbar loading for center successfully PASSED!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				handleException(sa,"Progressbar loading for center FAILED!", e);
				sa.assertAll();

			}

		}
		else{
			sa.assertTrue(true);
		}
		//=====================================================================================================================================
		Thread.sleep(3000);
		Thread.sleep(800);
		try {
			if (LMP.DisplayRenameAutoTestObject() == true) {
				Logger.info("Renaming AutoTestObject PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			handleException(sa,"Renaming AutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			LMP.ClickOnAgainRenameAutoTestObject();
			Thread.sleep(2100);
			LMP.ContextClickOnRenameAutoTestObject();
			Logger.info("RightClick On RenamedAutoTestObject PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			handleException(sa,"RightClick On RenamedAutoTestObject FAILED!", e);
			sa.assertAll();
		}

		Logger.info("//===============================CLONE SCENARIO START========================================");
		Thread.sleep(2100);
		try {
			LMP.ClickOnCloneAutoTestObject();
			Logger.info("Click On Clone in RenamedAutoTestObject!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			handleException(sa,"Clicking On Clone in RenamedAutoTestObject FAILED!", e);
			sa.assertAll();

		}
		Thread.sleep(1500);
		Thread.sleep(500);
		try {
			LMP.ClickOnCloneBtn();
			Logger.info("Click On Clone Btn in RenamedAutoTestObject!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			handleException(sa,"Clicking On Clone Btn in RenamedAutoTestObject FAILED!", e);
			sa.assertAll();
		}
		try {
			crm.ProgressSpinnerCenter();
			Logger.info("Progressbar loading for center successfully PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			handleException(sa,"Progressbar loading for center FAILED!", e);
			sa.assertAll();

		}
		Thread.sleep(500);
		try {
			if (LMP.DisplayCloneAutoTestObject() == true) {
				Logger.info("Cloning RenamedAutoTestObject PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			handleException(sa,"Cloning  in RenamedAutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		Thread.sleep(500);
		try {
			LMP.ContextClickOnCloneAutoTestObject();
			Logger.info("RightClick On ClonedAutoTestObject PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			handleException(sa,"RightClick On ClonedAutoTestObject FAILED!", e);
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
			handleException(sa,"Click On Delete Btn in ClonedAutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3200);
		try {
			LMP.ClickOnDeletebtn();
			Logger.info("Click On Delete Btn in CloneAutoTestObject is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			handleException(sa,"Click On Delete Btn in ClonedAutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3300);
		try {

			if (LMP.DisplayDeleteAutoTestObject() == true) 
			{
				Logger.info(" Display ClonedAutoTestObject Deleted successfully PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			handleException(sa,"Display ClonedAutoTestObject Deleted  FAILED!", e);
			sa.assertAll();
		}
		//Thread.sleep(6000);
		Thread.sleep(5200);
		try {
			LMP.ClickOnAgainRenameAutoTestObject();
			Thread.sleep(3100);
			LMP.ContextClickOnRenameAutoTestObject();
			Logger.info("RightClick On RenamedAutoTestObject!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			handleException(sa,"RightClick On RenamedAutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2800);
		Logger.info("//===============================MOVE OBJECT SCENARIO START========================================");
		try {
			LMP.ClickOnMoveAutoTestObject();
			Logger.info("Click On Move RenamedAutoTestObject!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			handleException(sa,"Click On Move RenamedAutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			LMP.SelectFolder();
			Logger.info("Select Folder in MoveAEtoSDR!!!");
		} catch (Exception e) {
			Logger.info("Folder Not Found!! Craeting New Folder.");
			rrp.ClickOnCancel();
			//Thread.sleep(500);
			LMP.RightClickonAE();
			Logger.info("Right Click on AE to SDR");
			//Thread.sleep(900);
			LMP.ClickOnNewFolder();
			Logger.info("Click on New Folder");
			LMP.NameInObject();
			Logger.info("Entered Random Name");
			LMP.clickOnSaveNewObject();
			Thread.sleep(1000);
			try {
				LMP.ContextClickOnRenameAutoTestObject();
				Logger.info("RightClick On RenamedAutoTestObject!!!");
			} catch (Exception g) {
				sa.assertTrue(false);
				handleException(sa,"RightClick On RenamedAutoTestObject FAILED!", g);
				sa.assertAll();
			}
			try {
				LMP.ClickOnMoveAutoTestObject();
				Logger.info("Click On Move Renamed AutoTestObject!!!");
			} catch (Exception f) {
				sa.assertTrue(false);
				handleException(sa,"Click On Move Renamed AutoTestObject FAILED!", f);
				sa.assertAll();
			}
			rrp.ClickOnMoveFolder();
			Logger.info("Select Folder in MoveWST!!!");
		}
		try {
			LMP.ClickOnMoveBtn();
			Logger.info("Click On MoveBtn!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			handleException(sa,"Click On MoveBtn FAILED!", e);
			sa.assertAll();

		}
		try {
			crm.ProgressSpinnerCenter();
			Logger.info("Progressbar loading for center successfully PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			handleException(sa,"Progressbar loading for center FAILED!", e);
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
				Logger.info("ClickOnMovedFolderDropDown FAILED!", e);
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
			handleException(sa,"RightClick On RenamedAutoTestObject FAILED!", e);
			sa.assertAll();
		}

		Logger.info("//===============================DELETE OBJECT SCENARIO START========================================");
		Thread.sleep(3800);
		try {
			LMP.ClickOnDeleteOnClonedAutoTestObject();
			Logger.info("Click On Delete Btn in CloneAutoTestObject!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			handleException(sa,"Click On Delete Btn in ClonedAutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			LMP.ClickOnDeletebtn();
			Logger.info("Click On Delete Btn in CloneAutoTestObject!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			handleException(sa,"Click On Delete Btn in Cloned AutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			if (LMP.DisplayDeleteAutoTestObject() == true) {
				Logger.info("Display AutoTestObject Copy Deleted  PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			handleException(sa,"Display AutoTestObject Copy Deleted FAILED!", e);
			sa.assertAll();
		}
	}
}
