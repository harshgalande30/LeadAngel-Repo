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
import io.qameta.allure.Step;
@Listeners({ com.leadAngel.utilities.TestAllureListener.class })
public class TC_CrudOperation_WaitFilter_AccountManagement extends BaseClass{
	//private final static Logger Logger = org.apache.logging.log4j.LogManager
			//.getLogger(TC_CrudOperation_WaitFilter_AccountManagement.class);
	private static final Logger Logger = LogManager.getLogger(TC_CrudOperation_WaitFilter_AccountManagement.class);

	@Test(description = "AccountManagement_WaitFilter _Section")
	@Step("AccountManagement_LeadRouting_WaitFilter")

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
		LMP.RightClickonWaitFilter();
		Logger.info("Right Click on Escalation Condition");
		Thread.sleep(900);

		LMP.ClickOnNewObject();
		Logger.info("Clicked on New CRM Lead Filter");

		try {
			LMP.NameInCrudObject();
			Logger.info("Entered AutoTestName  PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.info("Entered AutoTestName  FAILED!!!",e);
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

		LMP.clickOnSaveNewObject();
		Logger.info("Clicked on Save Button NewCRM Lead Filter");

		if(ae.DisplaySameAEerror() == true) {
			Logger.info("Duplicate Object Found, Deleting Object NOW!!! then Creating New Object!!");
			Thread.sleep(3800);

			try {
				LMP.ClickOnWaitFilterDropDown();           
				Logger.info("ClickOnWaitFilterDropDown PASSED!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("ClickOnWaitFilterDropDown FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				LMP.ContextClickOnAutoTestObject();           
				Logger.info("RightClick On AutoTestObject PASSED!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("RightClick On AutoTestObject FAILED!", e);
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
			Thread.sleep(4500);
			try {
				LMP.ClickAgainWaitFilter();
				Thread.sleep(4500);
				LMP.RightClickonWaitFilter();
				Logger.info("Right Click on WaitFilter PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("RightClicking on WaitFilter FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(1000);
			try {
				LMP.ClickOnNewObject();
				Logger.info("Clicked on New Opportunity Filter PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Clicking on New Opportunity Filter FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(1000);
			try {
				LMP.NameInCrudObject();
				Logger.info("Entered Random Name PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.info("Entered Random Name FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(500);
			try {
				LMP.DescInRRT();
				Logger.info("Entered in Description");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("input in Description FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(500);
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
		driver.navigate().refresh();
		Logger.info("Refreshing The Page!!");
		Thread.sleep(5000);
		try {
			if( LMP.DisplayWaitFilterOverview()==true) {
				Thread.sleep(2100);
				Logger.info("DisplayWaitFilterOverview passed");
				Thread.sleep(2100);
				try {
					LMP.WaitFilterDropDown();
					Logger.info("WaitFilterDropDown is PASSED!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("WaitFilterDropDown is FAILED!", e);
					sa.assertAll();
				}
				Thread.sleep(3200);
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
		Logger.info("//================================== AccounttId_DND====================================//");
		Thread.sleep(2100);
		try {
			AM.ClickOnAccountAttribute();
			Logger.info("Clicked on ClickOnAccountAttribute is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking on ClickOnAccountAttribute FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(2100);
		try {
			AM.AccounttId_DND();
			Logger.info("AccounttId_DND is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("AccounttId_DND is  FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			AM.AccounttId_Option();
			Thread.sleep(1800);
			AM.AccounttId_Option();
			Logger.info("click on AccounttId_Option is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("click on AccounttId_Option is  FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			AM.EnterAccountID();
			Logger.info("EnterAccountID is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("EnterAccountID is  FAILED!!",e);
			sa.assertAll();
		}
		
		Logger.info("//================================== Deleted_DND====================================//");
		Thread.sleep(2100);
		try {
			AM.Deleted_DND();
			Logger.info("Deleted_DND is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Deleted_DND is  FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			AM.Deleted_Option1();
			Thread.sleep(1600);
			AM.Deleted_Option1();
			Logger.info("select Deleted_Option1 is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("select Deleted_Option1 is  FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			AM.Deleted_Option2();
			Thread.sleep(1000);
			AM.Deleted_Option2();
			Logger.info("select Deleted_Option2 is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("select Deleted_Option2 is  FAILED!!",e);
			sa.assertAll();
		}
		
		Logger.info("//================================== BillingLatitude_DND====================================//");
		Thread.sleep(2100);
		try {
			AM.BillingLatitude_DND();
			Logger.info("BillingLatitude_DND is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("BillingLatitude_DND is  FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			AM.BillingLatitude_Option();
			Thread.sleep(1800);
			AM.BillingLatitude_Option();
			Logger.info("select BillingLatitude_Option is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("select BillingLatitude_Option is  FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			AM.EnterBillingLatitude();
			Logger.info("select EnterBillingLatitude is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("select EnterBillingLatitude is  FAILED!!",e);
			sa.assertAll();
		}
		
		Logger.info("//================================== CreadtedDate_DND====================================//");
		Thread.sleep(2100);
		try {
			AM.CreadtedDate_DND();
			Logger.info("CreadtedDate_DND is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("CreadtedDate_DND is  FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(1800);
		try {
			AM.CreadtedDate_Option();
			Thread.sleep(1900);
			AM.CreadtedDate_Option();
			Logger.info("select CreadtedDate_Option is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("select CreadtedDate_Option is  FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			AM.ClickOnCalenderIcon();
			Logger.info("Click on ClickOnCalenderIcon is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on ClickOnCalenderIcon is  FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			AM.SelectDate();
			Logger.info("SelectDate is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("SelectDate is  FAILED!!",e);
			sa.assertAll();
		}
		
		Logger.info("//=======================================ENTERING DETAILS PAGE=========================================");
		Thread.sleep(2000);
		rrp.ClickOnDetail();
		Thread.sleep(2000);
		rrp.ClickOnDetail();
		Logger.info("Entering Details Page!!!");

		Thread.sleep(1500);	
		detrrt.ClickOnEditbtn();
		Logger.info("Clicked On Description Edit button");

		detrrt.InputDesc();
		Logger.info("Input on Details TextArea");
		detrrt.ClickOnbtnSaveDescForAccList();
		Logger.info("Clicked On Description Save button");

		driver.navigate().refresh();
		Logger.info("Page Refresh Successfully");
		try {
			crm.ProgressSpinnerLeft();
			Logger.info("Progressbar loading for Left Side successfully PASSED!!");
		} catch(Exception e) {
			Logger.error("Progressbar loading Left Side FAILED!", e);
			sa.assertTrue(false);
			sa.assertAll();
		}

		try {
			crm.ProgressSpinnerCenter();
			Logger.info("Progressbar loading for center successfully PASSED!!");
		} catch(Exception e) {
			Logger.error("Progressbar loading for center FAILED!", e);
			sa.assertTrue(false);
			sa.assertAll();
		}

		try {
			crm.ProgressSpinnerRight();
			Logger.info("Progressbar loading for Right Side successfully PASSED!!");
		} catch(Exception e) {
			Logger.error("Progressbar for Right Side loading FAILED!", e);
			sa.assertTrue(false);
			sa.assertAll();
		}
		Thread.sleep(5300);		
		try {			
			rrp.ClickOnDetail();
			Thread.sleep(3600);
			rrp.ClickOnDetail();
			Logger.info("Entering Details Page!!!");
		} catch(Exception e) {
			Logger.error("Entering Details Page FAILED!!!",e);
			sa.assertTrue(false);
			sa.assertAll();
		}
		try {
			detrrt.DisplayDescMsg();
			Logger.info("Description Message Updated successfully!");
		} catch(Exception e) {
			Logger.error("Description Message Updated FAILED!", e);
			sa.assertTrue(false);
			sa.assertAll();
		}
		Thread.sleep(2500);
		Logger.info("//==================================APPROVE SCENARIO START====================================//");
		try {
			LMP.ContextClickOnAutoTestObject();           
			Logger.info("RightClick On AutoTestObject PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On AutoTestObject FAILED!!", e);
			sa.assertAll();
		} 
		Thread.sleep(2000);
		try {
			rrp.ClickOnApproveObject();
			Logger.info("Clicked on Approve Button PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked on Approve Button FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(1000);
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
		Thread.sleep(3600);    
		Logger.info("//=======================================EDIT SCENARIO START=========================================//");
		try {
			LMP.ContextClickOnAutoTestObject();      
			Logger.info("RightClick On AutoTestObject PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On AutoTestObject FAILED!!", e);
			sa.assertAll();
		}	
		Thread.sleep(1200);
		try {
			rrp.ClickOnObjectEdit();
			Logger.info("clicked on Edit Button PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("clicked on Edit Button FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			AM.EditAccounttId_Option();
			Logger.info("EditAccounttId_Option is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("EditAccounttId_Option is  FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			AM.EditEnterAccountID();
			Logger.info("EditEnterAccountID is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("EditEnterAccountID is  FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			AM.EditDeleted_Option2();
			Logger.info("EditDeleted_Option2 is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("EditDeleted_Option2 is  FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(4200);
		Logger.info("//==========================================RENAME SCENARIO START=====================================//");
		try {
			LMP.ClickagainAutoTestObject();
			Thread.sleep(4200);
			LMP.ContextClickOnAutoTestObject();
			Logger.info("RightClick On AutoTestObject PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On AutoTestObject FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			rrp.ClickOnObjectRename();
			Logger.info("Clicked on Rename Object PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked on Rename Object FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			LMP.InputOnRenameAutoTestObject();
			Logger.info("Input on Rename AutoTestObject!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Input on Rename AutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
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

			} 		
				else {
					LMP.ClickOnWaitConditionFolder();
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
					Thread.sleep(2800);			    	
				}		
			
			Logger.info("==============================================RENAME SCENARIO START==================================");
			Thread.sleep(3500);	
			try {
				LMP.ContextClickOnAutoTestObject();
				Logger.info("RightClick On AutoTestObject PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("RightClick On AutoTestObject FAILED!!", e);
				sa.assertAll();
			}
			try {
				LMP.ClickOnRenameAutoTestObject();
				Logger.info("Click On Rename AutoTestObject!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Rename AutoTestObject FAILED!", e);
				sa.assertAll();
			}

			try {
				LMP.InputOnRenameAutoTestObject();
				Logger.info("Input on Rename AutoTestObject!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Input on Rename AutoTestObject FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(500);
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
		//==================================================================================================================	
		Thread.sleep(5000);
		try {
			if (LMP.DisplayRenameAutoTestObject() == true) {
				Logger.info("Renaming AutoTestObject PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Renaming AutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		Logger.info("//========================================CLONE SCENARIO START==========================================//");
		try {
			LMP.ContextClickOnRenameAutoTestObject();
			Logger.info("RightClick On RenamedAutoTestObject PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On RenamedAutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(600);
		try {
			LMP.ClickOnCloneAutoTestObject();
			Logger.info("Click On Clone in Renamed AutoTestObject PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking On Clone in Renamed AutoTestObject FAILED!", e);
			sa.assertAll();

		}
		Thread.sleep(1000);
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
		Thread.sleep(2100);
		try {
			LMP.ClickOnDeleteOnClonedAutoTestObject();
			Logger.info("Click On Delete in Clone AutoTestObject object PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete in Clone AutoTestObject object FAILED!", e);
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
		try {
			if (LMP.DisplayDeleteAutoTestObject() == true) {
				Logger.info(" Display Cloned AutoTestObject Deleted successfully PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Cloned AutoTestObject Deleted  FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3900);

		try {
			LMP.ClickOnAgainRenameAutoTestObject();
			Thread.sleep(3500);
			LMP.ContextClickOnRenameAutoTestObject();
			Logger.info("RightClick On RenamedAutoTestObject!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On RenamedAutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);    

		Logger.info("//===============================MOVE OBJECT SCENARIO START========================================");
		try {
			LMP.MoveButtonForWaitFilter();
			Logger.info("Click On Move Renamed AutoTestObject!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Move Renamed AutoTestObject FAILED!", e);
			sa.assertAll();
		}

		try {
			rrp.ClickOnMoveFolder();
			Logger.info("Select Folder in Move WaitCondition!!!");
		} catch (Exception e) {
			Logger.info("Folder Not Found!! Craeting New Folder.");
			rrp.ClickOnCancel();
			Thread.sleep(900);
			LMP.RightClickonWaitFilter();
			Logger.info("Right Click on WaitCondition");
			Thread.sleep(900);
			LMP.ClickOnNewFolder();
			Logger.info("Click on New Folder");
			LMP.NameInObject();
			Logger.info("Entered Random Name");
			LMP.clickOnSaveNewObject();
			Thread.sleep(1500);
			try {
				LMP.ContextClickOnRenameAutoTestObject();
				Logger.info("RightClick On RenamedAutoTestObject!!!");
			} catch (Exception g) {
				sa.assertTrue(false);
				Logger.error("RightClick On RenamedAutoTestObject FAILED!", g);
				sa.assertAll();
			}
			try {
				LMP.MoveButtonForWaitFilter();
				Logger.info("Click On Move Renamed AutoTestObject!!!");
			} catch (Exception f) {
				sa.assertTrue(false);
				Logger.error("Click On Move Renamed AutoTestObject FAILED!", f);
				sa.assertAll();
			}

			rrp.ClickOnMoveFolder();
			Logger.info("Select Folder in MoveWST!!!");
			Thread.sleep(1000);
		}

		try {
			rrp.ClickOnMoveFolder();
			Logger.info("Select Folder in MoveWST!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Folder in MoveWST FAILED!", e);
			sa.assertAll();
		}
		try {
			rrp.ClickOnMoveBtn();
			Logger.info("Click On MoveBtn!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On MoveBtn FAILED!", e);
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
		Thread.sleep(5000);
		Logger.info("Waited 5 Seconds to Reload!!!");
		Thread.sleep(3500);

		try {
			LMP.ClickOnAgainRenameAutoTestObject();
			Thread.sleep(3500);
			LMP.ContextClickOnRenameAutoTestObject();
			Logger.info("RightClick On RenamedAutoTestObject PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On RenamedAutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Logger.info("//===============================DELETE OBJECT SCENARIO START========================================");
		Thread.sleep(3100);
		try {
			LMP.ClickOnDeleteOnClonedAutoTestObject();
			Logger.info("Click On Delete in Rename AutoTestObject Object PASEED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete  in Rename AutoTestObject Object FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			LMP.ClickOnDeletebtn();
			Logger.info("Click On Delete Btn in Rename AutoTestObject PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Btn in Rename  AutoTestObject FAILED!", e);
			sa.assertAll();
		}
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
