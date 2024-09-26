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
import com.leadAngel.pageObjects.LoginPage;
import com.leadAngel.pageObjects.RoundRobinPage;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
@Listeners({ com.leadAngel.utilities.TestAllureListener.class })
public class TC_CrudOperation_CRMaccountFilter_AccountManagement extends BaseClass{

	//private final static Logger Logger = org.apache.logging.log4j.LogManager
			//.getLogger(TC_CrudOperation_CRMaccountFilter_AccountManagement.class);
	private static final Logger Logger = LogManager.getLogger(TC_CrudOperation_CRMaccountFilter_AccountManagement.class);

	@Test(description = "AccountManagement_DataDictionary _Section")
	@Step("AccountManagement_DataDictionary_CRM_AccFilter")
	@Description("AccountManagement_DataDictionary_CRM_AccFilter")

	public void LeadManagementTest() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		CRM_Account_FilterPage crm = new CRM_Account_FilterPage(driver);
		AEtoSDR_Page ae = new AEtoSDR_Page(driver);
		LeadManagementPage LMP = new LeadManagementPage(driver);
		RoundRobinPage rrp = new RoundRobinPage(driver); // Used For Saving... Display
		DetailsPage_SalesTeam detrrt = new DetailsPage_SalesTeam(driver); // Used For Details Page
		CRM_Lead_FilterPage LF = new CRM_Lead_FilterPage(driver);
		AccountMaanagement_PageObjectModel AM=new AccountMaanagement_PageObjectModel(driver);
		Thread.sleep(1000);
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
			Logger.error("Progressbar loading FAILED!", e);
			sa.assertTrue(false);
			sa.assertAll();

		}
		Thread.sleep(2100);
		try {
			LMP.ClickOnDataDictionary();
			Logger.info("Clicked on Data Dictionary is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Clicked on Data Dictionary is Failed",e);
			sa.assertAll();
		}

		try {
			LMP.RightClickonCRM_AccFilter();
			Logger.info("Right Click on CRM Account Filter is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Right Click on CRM Account Filter is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			LMP.ClickOnNewObject();
			Logger.info("Clicked on New CRM Account Filter is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Clicked on New CRM Account Filter is Failed",e);
			sa.assertAll();
		}
		Logger.info(
				"//===============================CREATE OBJECT SCENARIO START========================================!");

		try {
			LMP.NameInCrudObject();
			Logger.info("Entered AutoTestName PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.info("Entered AutoTestName FAILED!!!",e);
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
		Thread.sleep(2000);

		try {
			LMP.clickOnSaveNewObject();
			Logger.info("Clicked on Save Button NewCRM Account Filter is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked on Save Button NewCRM Account Filter is Failed", e);
			sa.assertAll();
		} 

		Thread.sleep(2000);
		//IF condition agar Error isDisplayed to AutoTestObject ko jaa ke delete krna hai and fir se AutoTestObject naam ka Obj banana hai ELSE : Continue programme.
		Thread.sleep(3000);
		if(ae.DisplaySameAEerror() == true) {
			Logger.info("Duplicate Object Found, Deleting Object NOW!!! then Creating New Object!!");

			Thread.sleep(2000);

			try {
				crm.clickCRMaccountFilterDropDown();
				Logger.info("Clicked on CRMaccountFilterDropDown passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Clicked on CRMaccountFilterDropDown  FAILED!!", e);
				sa.assertAll();
			}

			//Thread.sleep(15000);
			Thread.sleep(1000);
			try {
				LMP.ContextClickOnAutoTestObject();           
				Logger.info("RightClick On AutoTestObject PASSED!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("RightClick On AutoTestObject Failed!!", e);
				sa.assertAll();
			}
			Thread.sleep(4000);
			try {
				LMP.ClickOnDeleteOnClonedAutoTestObject();
				Logger.info("Click On Delete Btn in AutoTestObject!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Delete Btn in AutoTestObject FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(3000);
			try {
				LMP.ClickOnDeletebtn();
				Logger.info("Click On Delete Btn in AutoTestObject!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Delete Btn in AutoTestObject FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(4000);
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
			Thread.sleep(5800);

			try {
				LMP.RightClickonCRM_AccFilter();
				Logger.info("Right Click on CRM_AccFilter");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Right Click on CRM_AccFilter FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(5200);
			try {
				LMP.ClickOnNewObject();
				Logger.info("Clicked on New CRM_AccFilter PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Clicking on CRM_AccFilter FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(4600);
			try {
				LMP.NameInCrudObject();
				Logger.info("Entered Random Name PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.info("Entered Random Name FAILED!!!",e);
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

		Thread.sleep(3500);
		driver.navigate().refresh();
		Logger.info("Refreshing The Page!!");
		Thread.sleep(5000);
		try {
			if( crm.DisplayAccountListOverView()==true) {
				Thread.sleep(4000);
				Logger.info("Display_AEtoSDR_MapingOverview passed");
				Thread.sleep(3500);
				try {
					crm.clickCRMaccountFilterDropDown();
					Logger.info("Clicked on CRMaccountFilterDropDown passed");
				}catch(Exception e) {
					sa.assertTrue(false);
					Logger.error("Clicked on CRMaccountFilterDropDown  FAILED!!", e);
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

		Thread.sleep(1000);
		//=================================================================================================================			
		Thread.sleep(5500);
		try {
			crm.ClickonAccountAttr();
			Logger.info("Clicked on AccountAttr PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking on Account Attr FAILED!!", e);
			sa.assertAll();
		}

		Logger.info("============================================ DRAG&DROP ACOUNT_NAME ATTRIBUTE================================//");
		Thread.sleep(3200);
		try {
			crm.AccountName_DND();
			Logger.info("AccountName_DND PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("AccountName_DND FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			crm.ClickOnAccountName_StartsWith();
			Thread.sleep(2000);
			crm.ClickOnAccountName_StartsWith();
			Logger.info("Click on AccountName Starts With PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking on AccountName Starts With FAILED!!!", e);
			sa.assertAll();
		}				
		Thread.sleep(1500);
		try {
			crm.InputAccountNameContains();
			Logger.info("Input on AccountName Starts With PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Input on AccountName Starts With FAILED!!!", e);
			sa.assertAll();

		}
		Thread.sleep(2000);
		Logger.info("//======================================= DRAG&DROP ANNUAL_REVENUE ATTRIBUTE===============================//");
		try {
			crm.AnnualRevenue_DND();
			Logger.info("AnnualRevenue_ DND PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("AnnualRevenue_ DND FAILED!!", e);
			sa.assertAll();
		}

		Thread.sleep(1500);
		try {
			crm.ClickOnAnnualRevenue_IsNotEmpty();
			Thread.sleep(500);
			crm.ClickOnAnnualRevenue_IsNotEmpty();

			Logger.info("Clicked On AnnualRevenue IsNotEmpty PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked On AnnualRevenue IsNotEmpty FAILED!!", e);
			sa.assertAll();
		}			

		try {
			if (rrp.isInputReadOnly()) {
				Logger.info("Input in IsNotEmpty is ReadOnly PASSED!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Input in IsNotEmpty is ReadOnly FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		Logger.info("//====================================== DRAG&DROP CREATED_DATE ATTRIBUTE=================================//");

		rrp.ScrollIntoViewCreatedDate();
		Logger.info("Scrolling to CreatedDate");
		Thread.sleep(1500);

		try {
			crm.CreatedDate_DND();
			Logger.info("DragAndDrop CreatedDate is PASSED!!");
		} catch (Exception e) {
			Logger.error("DND Created Date FAILED!!!", e);
			sa.assertAll();

		}
		Thread.sleep(2100);
		try {
			rrp.ClickOnCreatedDateBefore();
			Thread.sleep(1900);
			rrp.ClickOnCreatedDateBefore();
			Logger.info("Clicked On Created Date Before PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked On Created Date Before FAILED!!", e);
		}

		Thread.sleep(1000);
		rrp.ClickOnCalendarButton();
		Logger.info("Clicked On Calendar Button PASSED!!");

		Thread.sleep(500);
		rrp.ClickOnDate();
		Logger.info("Clicked On Date");
		Logger.info("//===========================================ENTERING DETAILS PAGE======================================");

		Thread.sleep(2000);
		rrp.ClickOnDetail();
		Thread.sleep(600);
		rrp.ClickOnDetail();
		Logger.info("Entering Details Page!!!");

		Thread.sleep(1500);
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
		//            Thread.sleep(150);
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
		Thread.sleep(7600);
		try {
			rrp.ClickOnDetail();

			// rrp.ClickOnDetail();
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
		Thread.sleep(6100);
		Logger.info("//======================================APPROVE SCENARIO START===================================//");
		try {
			LMP.ClickagainAutoTestObject();
			Thread.sleep(4500);
			LMP.ContextClickOnAutoTestObject();           
			Logger.info("RightClick On AutoTestObject PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On AutoTestObject FAILED!!", e);
			sa.assertAll();
		}Thread.sleep(3200);

		try {
			rrp.ClickOnApproveObject();
			Logger.info("Clicked on Approve Button PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked on Approve Button FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3200);
		try {
			rrp.ClickOnApproveSubmit();
			Logger.info("Clicked on Approve  Submit button on Approve Dialog PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked on Approve  Submit button on Approve Dialog FAILED!", e);
			sa.assertAll();
		}
		try {
			rrp.DisplayApproved();
			Logger.info("Approved Successfully PASSED!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Approved FAILED!!", e);
			sa.assertAll();
		}
		Logger.info("//============================================EDIT SCENARIO START======================================");
		Thread.sleep(6100);
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
		Thread.sleep(4000);

		try {
			LMP.ClickOnEditAutoTestObject();
			Logger.info("Click On Edit AutoTestObject!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Edit AutoTestObject FAILED!", e);
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
		Thread.sleep(8000);
		try {
			crm.ClickOnAccountName_NotIn();
			Logger.info("Click on AccountName NotIn PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking on AccountName NotIn FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(8000);
		try {
			crm.ClickOnAccountNameInAddbtn();
			Logger.info("Click on AccountName NotIn Add btn PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking on AccountName NotIn Add btn is FAILED!!!", e);
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

		Thread.sleep(500);
		try {
			rrp.ClickOnAboutMeIntro();
			Logger.info("Clicked on AccountName Intro PASSED!!");
		} catch (Exception e) {
			rrp.TextAreaLongitudeAlphabet();
			Logger.info("Type Into in TextAreaa PASSED!!");
		}
		Thread.sleep(500);
		try {
			rrp.ClickOnAboutMesaveButton();
			Logger.info("Clicked on Save btn in AccountNameNotIn PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking on Save btn in AccountNameNotIn FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		Logger.info("//=======================================RENAME SCENARIO START================================//");
		try {
			LMP.ContextClickOnAutoTestObject();
			Logger.info("RightClick On AutoTestObject PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On AutoTestObject FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(600);
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
		Thread.sleep(2000);

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
			//Thread.sleep(1500);
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
				LMP.CRMAccFilterAccMgmtFolderToMove();
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
				Thread.sleep(2800);		
			}
			Thread.sleep(6200);		
			Logger.info("==========================================RENAME SCENARIO START========================================");
			try {
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
		//====================================================================================================================   		
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
		Logger.info("//=============================================CLONE SCENARIO START==================================//");
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
		try {
			LMP.ClickOnDeleteOnClonedAutoTestObject();
			Logger.info("Click On Delete Btn in Clone AutoTestObject!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Btn in Cloned AutoTestObject FAILED!", e);
			sa.assertAll();
		}
		try {
			LMP.ClickOnDeletebtn();
			Logger.info("Click On Delete Btn in Clone AutoTestObject!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Btn in Cloned AutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(850);
		try {
			if (LMP.DisplayDeleteAutoTestObject() == true) {
				Logger.info(" Display Cloned AutoTestObject Deleted successfully PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Cloned AutoTestObject Deleted  FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(6300);

		try {
			LMP.ClickOnAgainRenameAutoTestObject();
			Thread.sleep(3600);
			LMP.ContextClickOnRenameAutoTestObject();
			Logger.info("RightClick On RenamedAutoTestObject!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On RenamedAutoTestObject FAILED!", e);
			sa.assertAll();
		}

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
		Thread.sleep(4000);
		try {
			LMP.SelectFolder();
			Logger.info("Select Folder in CRMaccountFilter!!!");
		} catch (Exception e) {
			Logger.info("Folder Not Found!! Craeting New Folder.");
			Thread.sleep(1000);
			rrp.ClickOnCancel();
			Thread.sleep(1000);
			LMP.RightClickonCRM_AccFilter();
			Logger.info("Right Click on Account list");
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
			} catch (Exception e1) {
				sa.assertTrue(false);
				Logger.error("RightClick On RenamedAutoTestObject FAILED!", e1);
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
				Logger.info("Select Folder in Move CRM AccFilter is Passed!!!");
			} catch (Exception e1) {
				sa.assertTrue(false);
				Logger.error("Select Folder in Move CRM AccFilter is Failed!!!", e1);
				sa.assertAll();
			}	 		
		}		
		Thread.sleep(900);
		try {
			LMP.ClickOnMoveBtn();
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
		Thread.sleep(7100);
		Logger.info("Waited 5 Seconds to Reload!!!");
		try {
			LMP.ClickOnAgainRenameAutoTestObject();
			Thread.sleep(3900);
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
			Logger.info("Click On Delete Btn in Clone AutoTestObjectAutoTestWST!!!");
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
		Thread.sleep(800);
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
