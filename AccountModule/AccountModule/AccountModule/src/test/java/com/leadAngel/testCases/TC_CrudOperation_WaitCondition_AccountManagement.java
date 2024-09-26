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
public class TC_CrudOperation_WaitCondition_AccountManagement extends BaseClass {
	//private final static Logger Logger = org.apache.logging.log4j.LogManager
			//.getLogger(TC_CrudOperation_WaitCondition_AccountManagement.class);
	private static final Logger Logger = LogManager.getLogger(TC_CrudOperation_WaitCondition_AccountManagement.class);

	@Test(description = "AccountManagement_WaitCondition _Section")
	@Step("AccountManagement_LeadRouting_WaitCondition")

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
		LMP.RightClickonWaitCondition();
		Logger.info("Right Click on Wait Condition");
		Thread.sleep(900);

		LMP.ClickOnNewObject();
		Logger.info("Clicked on New CRM Lead Filter");

		try {
			LMP.NameInCrudObject();
			Logger.info("Entered AutoTestName  PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.info("Entered AutoTestName  FAILED!!!");
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
		Logger.info("Clicked on Save Button WaitCondition");
		if(ae.DisplaySameAEerror() == true) {
			Logger.info("Duplicate Object Found, Deleting Object NOW!!! then Creating New Object!!");
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
			Thread.sleep(6800);
			try {
				LMP.ClickAgainWaitCondition();
				Thread.sleep(5200);
				LMP.RightClickonWaitCondition();
				Logger.info("Right Click on WaitCondition PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("RightClicking on WaitCondition FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				LMP.ClickOnNewObject();
				Logger.info("Clicked on New WaitCondition PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Clicking on New WaitCondition FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				LMP.NameInObject();
				Logger.info("Entered AutoTestName Name PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.info("Entered AutoTestName Name FAILED!!!");
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
			if( LMP.DisplayWaitConditionOverview()==true) {
				Thread.sleep(2800);
				Logger.info("DisplayWaitConditionOverview passed");
				Thread.sleep(2100);
				try {
					LMP.WaitConditionDropDown();
					Logger.info("WaitFilterDropDown is PASSED!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("WaitFilterDropDown is FAILED!", e);
					sa.assertAll();
				}
				Thread.sleep(4800);
				try {
					LMP.ClickOnAutoTestObject(); 
					Thread.sleep(3600);
					LMP.ClickagainAutoTestObject();
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
		//=================================================================================================================	
		Thread.sleep(3800);
		try {
			LMP.ClickOnWaitAttr();
			Logger.info("Clicked on WaitAttr");
			Thread.sleep(1400);
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked on WaitAttr FAILED!!", e);
			sa.assertAll();
		}
		Logger.info("//====================================== DRAG&DROP WAIT_FOR ATTRIBUTE===================================//");
		try {
			LMP.WaitFor_DND();
			Logger.info("Drag And Drop Wait For is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag And Drop Wait For is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(3000);	

		try {
			LMP.InputWaitFor();
			Logger.info("Input on WaitFor  PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Input on WaitFor   FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(5500);
		try {
			LMP.ClickOnWaitForMinutes();
			Thread.sleep(5200);
			LMP.ClickOnWaitForMinutes();
			Logger.info("Click  on  WaitForMinutes  PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Click  on  WaitForMinutes  FAILED!!",e);
			sa.assertAll();
		}
		Logger.info("//========================================= DRAG&DROP WAIT TILL  ATTRIBUTE================================//");
		Thread.sleep(1500);
		try {
			LMP.WaitTill_DND();
			Logger.info("WaitTill DND PASSED!!");

		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("DND WaitTill FAILED!!", e);
			sa.assertAll();
		}	  		 
		Thread.sleep(2500);
		try {
			rrp.ClickOnCalendarButton();
			Logger.info("Clicked on CalendarButton PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking on CalendarButton FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(1200);
		try {
			LMP.ClickOnDate();
			Logger.info("Click On Date is  PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Date is FAILED!!", e);
			sa.assertAll();
		}

		Thread.sleep(1000);

		try {
			LMP.ClickOnSelectTime();
			Logger.info("Clicked on Select Time is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking on Select Time is FAILED!!!", e);
			sa.assertAll();
		}
		try {
			LMP.ClickOnTime();
			Logger.info("Click On Time is  PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Time is FAILED!!", e);
			sa.assertAll();
		}

		try {
			LMP.ClickOnOkBtn();
			Logger.info("Click On Ok Btn is  PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Ok Btn is FAILED!!", e);
			sa.assertAll();
		}
		Logger.info("//====================================== DRAG&DROP WAIT FILTER ATTRIBUTE===============================//");
		Thread.sleep(2500);
		try {
			LMP.WaitFil_DND();
			Logger.info("Drag And Drop WAIT FILTER");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("DND WAIT FILTER FAILED!!", e);
			sa.assertAll();
		}		
		Thread.sleep(2100);
		try {
			LMP.ClickOnWaitTllOption();
			Logger.info("Clicked On WaitTllOption Is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking On WaitTllOption Is  FAILED!!!", e);
			sa.assertAll();
		}		
		Thread.sleep(2500);

		try {
			AM.clickOnWaitTillvalueDropDown();
			Logger.info("clickOnWaitTillvalueDropDown is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("clickOnWaitTillvalueDropDown is  FAILED!!!", e);
			sa.assertAll();
		}		
		Thread.sleep(1500);
		try {
			AM.clickOnWaitTillvalueOption();
			Logger.info("clickOnWaitTillvalueOption is  PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("clickOnWaitTillvalueOption is  FAILED!!!", e);
			sa.assertAll();
		}		  		  		  			  		  
		Thread.sleep(3500);
		Logger.info("//=========================================APPROVE SCENARIO START=======================================//");
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
		Thread.sleep(1000);

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
			Thread.sleep(1000);
			Logger.info("Approved Successfully PASSED!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Approved FAILED!!", e);
			sa.assertAll();
		}
		Logger.info("//===============================ENTERING DETAILS PAGE===========================================");

		Thread.sleep(3600);
		rrp.ClickOnDetail();
		Thread.sleep(2100);
		rrp.ClickOnDetail();
		Logger.info("Entering Details Page!!!");

		Thread.sleep(1500);	
		detrrt.ClickOnEditbtn();
		Logger.info("Clicked On Description Edit button");

		detrrt.InputDesc();
		Logger.info("Input on Details TextArea");
		detrrt.ClickOnbtnSaveDescForAccList();
		Logger.info("Clicked On Description Save button");
		Thread.sleep(700);	
		driver.navigate().refresh();
		Logger.info("Page Refresh Successfully");
		Thread.sleep(6800);		
		try {			
			rrp.ClickOnDetail();
			Thread.sleep(4300);
			rrp.ClickOnDetail();
			Logger.info("Entering Details Page!!!");
		} catch(Exception e) {
			Logger.error("Entering Details Page FAILED!!!");
			sa.assertTrue(false);
			sa.assertAll();
		}
		Thread.sleep(1000);

		try {
			detrrt.DisplayDescMsg();
			Logger.info("Description Message Updated successfully!");
		} catch(Exception e) {
			Logger.error("Description Message Updated FAILED!", e);
			sa.assertTrue(false);
			sa.assertAll();
		}
		Thread.sleep(2500);   
		Logger.info("//===========================================EDIT SCENARIO START==================================//");	
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
		try {
			LF.ProgressSpinner();
			Logger.info("Progressbar loading successfully PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Progressbar loading FAILED!", e);
			sa.assertAll();

		}
		Thread.sleep(3500);

		try {
			LMP.ClickOnWaitTllOption1();
			Logger.info("Clicked On WaitTllOption Is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking On WaitTllOption Is  FAILED!!!", e);
			sa.assertAll();
		}	
		Thread.sleep(3100);     
		try {
			AM.clickOnWaitTillvalueDropDown();
			Logger.info("clickOnWaitTillvalueDropDown is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("clickOnWaitTillvalueDropDown is  FAILED!!!", e);
			sa.assertAll();
		}		
		Thread.sleep(3100);
		try {
			AM.clickOnWaitTillvalueOption();
			Logger.info("clickOnWaitTillvalueOption is  PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("clickOnWaitTillvalueOption is  FAILED!!!", e);
			sa.assertAll();
		}		 	  		  		  			  		  
		Thread.sleep(4200);
		Logger.info("//===========================================RENAME SCENARIO START==================================//");

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
		Thread.sleep(3200);
		try {
			rrp.ClickOnObjectRename();
			Logger.info("Clicked on Rename Object PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked on Rename Object FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(3200);
		try {
			LMP.InputOnRenameAutoTestObject();
			Logger.info("Input on Rename AutoTestObject!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Input on Rename AutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2600);
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
				Thread.sleep(4200);	

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
				try {
					LMP.ClickOnWaitConditionFolder();
					Logger.info("Clicking On Folder is PASSED!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Clicking On Folder is FAILED!", e);
					sa.assertAll();
				}
				
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
			Thread.sleep(3500);		
			Logger.info("=========================================RENAME SCENARIO START===================================");
			try {
				LMP.ContextClickOnAutoTestObject();
				Logger.info("RightClick On AutoTestObject PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("RightClick On AutoTestObject FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(900);
			try {
				LMP.ClickOnRenameAutoTestObject();
				Logger.info("Click On Rename AutoTestObject!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Rename AutoTestObject FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(900);
			try {
				LMP.InputOnRenameAutoTestObject();
				Logger.info("Input on Rename AutoTestObject!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Input on Rename AutoTestObject FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(900);
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
		Thread.sleep(2000);
		Logger.info("//============================================CLONE SCENARIO START==============================================//");
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
		Thread.sleep(3000);
		try {
			if (LMP.DisplayCloneAutoTestObject() == true) {
				Logger.info("Cloning RenamedAutoTestObject PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Cloning  in RenamedAutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(1000);
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
		try {
			if (LMP.DisplayDeleteAutoTestObject() == true) {
				Logger.info(" Display Cloned AutoTestObject Deleted successfully PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Cloned AutoTestObject Deleted  FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(4700);

		try {
			LMP.ClickOnAgainRenameAutoTestObject();
			Thread.sleep(3700);
			LMP.ContextClickOnRenameAutoTestObject();
			Logger.info("RightClick On RenamedAutoTestObject!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On RenamedAutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(1000);    
		Logger.info("//===============================MOVE OBJECT SCENARIO START========================================");
		try {
			LMP.ClickOnMoveAutoTestObject();
			Logger.info("Click On Move Renamed AutoTestObject!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Move Renamed AutoTestObject FAILED!", e);
			sa.assertAll();
		}

		try {
			LMP.SelectFolder();
			Logger.info("Select Folder in Move WaitCondition!!!");
		} catch (Exception e) {
			Logger.info("Folder Not Found!! Craeting New Folder.");
			rrp.ClickOnCancel();
			Thread.sleep(900);
			LMP.RightClickonWaitCondition();
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
				LMP.ClickOnMoveAutoTestObject();
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
		Thread.sleep(4500);
		
//		if(LMP.WaitConditionFolderDisplayExpand()==true) {
//		try {
//			LMP.ClickOnWaitConditionFolder();
//			Logger.info("Clicking On Folder is PASSED!!!");
//		} catch (Exception e) {
//			sa.assertTrue(false);
//			Logger.error("Clicking On Folder is FAILED!", e);
//			sa.assertAll();
//		}
//		}
//		else {
//			sa.assertTrue(true);
//		}
//		try {
//			LMP.ClickOnWaitConditionFolder();
//			Logger.info("Clicking On Folder is PASSED!!!");
//		} catch (Exception e) {
//			sa.assertTrue(false);
//			Logger.error("Clicking On Folder is FAILED!", e);
//			sa.assertAll();
//		}
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
		Thread.sleep(6200);
		try {
			LMP.ClickOnDeleteOnClonedAutoTestObject();
			Logger.info("Click On Delete Btn in Clone AutoTestObject!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Btn in Cloned AutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(4200);
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
