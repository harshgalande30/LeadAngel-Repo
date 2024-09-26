package com.leadAngel.testCases;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.leadAngel.pageObjects.AEtoSDR_Page;
import com.leadAngel.pageObjects.AccountMaanagement_PageObjectModel;
import com.leadAngel.pageObjects.AssignmentLimitPage;
import com.leadAngel.pageObjects.CRM_Account_FilterPage;
import com.leadAngel.pageObjects.DetailsPage_SalesTeam;
import com.leadAngel.pageObjects.HomePage;
import com.leadAngel.pageObjects.LeadManagementPage;
import com.leadAngel.pageObjects.LoginPage;
import com.leadAngel.pageObjects.QueueManagementPage;
import com.leadAngel.pageObjects.RoundRobinPage;
import com.leadAngel.pageObjects.WeightedSalesTeamPage;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
@Listeners({ com.leadAngel.utilities.TestAllureListener.class })
public class TC_CrudOperation_WST_AccountManagement extends BaseClass {
	private static final Logger Logger = LogManager.getLogger(TC_CrudOperation_WST_AccountManagement.class);

	@Test(description = "AccountManagement_WeightedSalesTeam _Section")
	@Step("AccountManagement_WST_Sanity")
	@Description("AccountManagement_WST_Sanity_Test")
	public void LeadManagementTest() throws InterruptedException, IOException {
		SoftAssert sa = new SoftAssert();
		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		LeadManagementPage LMP = new LeadManagementPage(driver);
		CRM_Account_FilterPage crm = new CRM_Account_FilterPage(driver);
		AEtoSDR_Page ae = new AEtoSDR_Page(driver);
		WeightedSalesTeamPage wst = new WeightedSalesTeamPage(driver);
		RoundRobinPage rrp = new RoundRobinPage(driver);
		DetailsPage_SalesTeam detrrt = new DetailsPage_SalesTeam(driver);
		AccountMaanagement_PageObjectModel AM=new AccountMaanagement_PageObjectModel(driver);
		AssignmentLimitPage AL = new AssignmentLimitPage(driver);

		Logger.info("Now In Home Page!");
		Thread.sleep(2500);
		try {
			AM.AccountManagement();
			Logger.info("Clicked on AccountManagement is passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking on AccountManagement FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickonSalesTeam();
			Logger.info("Clicked on Sales Team");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking on SalesTeam FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.RightClickonWST();
			Logger.info("Right Click on Weighted_Sales_Team");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click on Weighted_Sales_Team FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		LMP.ClickOnNewObject();
		Logger.info("Clicked on New WST Button");
		Thread.sleep(2500);
		Logger.info("//===============================CREATE OBJECT SCENARIO START========================================!");
		try {
			LMP.NameInCrudObject();
			Logger.info("Entered AutoTestName  PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Entered AutoTestName  FAILED!!!",e);
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
		LMP.clickOnSaveNewObject();
		Logger.info("Clicked on Save Button NewWST");

		//IF condition agar Error isDisplayed to AutoTestObject ko jaa ke delete krna hai and fir se AutoTestObject naam ka Obj banana hai ELSE : Continue programme.
		if(ae.DisplaySameAEerror() == true) {
			Logger.info("Duplicate Object Found, Deleting Object NOW!!! then Creating New Object!!");
			Thread.sleep(4500);
			try {
				wst.getWSTDropDown();
				Logger.info("Click On RRTDropDown PASSED!!");
			} catch (Exception e) {
				Logger.error("Click On RRTDropDown Failed!!",e);
				sa.assertAll();
			}
			Thread.sleep(4500);
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
			Thread.sleep(4500);
			try {
				LMP.ClickAgainOnWST();
				Thread.sleep(5200);
				LMP.RightClickonWST();
				Logger.info("Right Click on WST PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("RightClicking on WST FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(4000);
			try {
				LMP.ClickOnNewObject();
				Logger.info("Clicked on New WST PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Clicking on New WST FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(3000);
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
		}
		else {
			sa.assertTrue(true);
		}	
		driver.navigate().refresh();
		Logger.info("Refreshing The Page!!");
		Thread.sleep(5000);
		try {
			Thread.sleep(2500);
			if( wst.isDisplayWSTOverview()==true) {
				Logger.info("Display_WST_Overview passed");
				{
					Thread.sleep(5000);
					try {
						wst.getWSTDropDown();
						Logger.info("Click On WSTDropDown PASSED!!");
					} catch (Exception e) {
						Logger.error("Click On WSTDropDown Failed!!",e);
						sa.assertAll();
					}
					Thread.sleep(5000);
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
		Logger.info("//-----------------------------First Time Drag And Drop SalesRep-------------------------------//");
		Thread.sleep(2500);
		try {
			wst.SalesRepWST_DND();              	
			Logger.info("DND SalesRep_1");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("DND SalesRep_1 FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try { 
			wst.ClickInputSalesRep();
			Logger.info("Click Inputbox1 on SalesRep PASSED! ");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Inputbox1 on SalesRep FAILED!! ",e);
			sa.assertAll();
		}
		// NO Name Found show hoga to if condition run hoga or object ko delete kar dega 
		if (wst.DisplayErrorMessage3()) {		
			Logger.info("No Name Found Message Displayed TestCase: FAILED!!!!!!");	
			sa.assertTrue(false);
			sa.assertAll();
		}
		else {
			sa.assertTrue(true);
		}
		Thread.sleep(2500);
		try {
			wst.ClickOnSalesRepOption_1();
			Logger.info("Select option SalesRep PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select option SalesRep FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			wst.InputWeight();
			Logger.info("Input On Weight PASSED");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Input on Weight FAILED!!! ",e);
			sa.assertAll();
		}

		Logger.info("//---------------------------------------Seconed Time Drag And Drop SalesRep------------------------------------//");
		Thread.sleep(3200);
		try {
			wst.SalesRepWST_DND();             
			Logger.info("DND SalesRep_2 PASSED!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("DND SalesRep_2 FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(3200);
		try { 
			wst.ClickInputSalesRep1();
			Thread.sleep(3200);
			wst.ClickInputSalesRep1();
			Logger.info("Click Inputbox_2 on SalesRep_2  PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Inputbox_2 on SalesRep_2  FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(3200);
		try {
			wst.ClickOnSalesRepOption_2();
			Logger.info("Select option on Account Executive PASSED!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select option on Account Executive FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3200);
		try {
			wst.InputWeight1();
			Logger.info("Input On Weight2 PASSED!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Input On Weight2 FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3200);

		Logger.info("//=======================================ENTERING QUEUE MANAGEMENT PAGE============================//");			
		Thread.sleep(3800);
		rrp.ClickOnQueueManagement();
		Thread.sleep(3200);
		rrp.ClickOnQueueManagement();
		QueueManagementPage QMP = new QueueManagementPage(driver);
		Logger.info("Entering Queue management Page");
		Thread.sleep(5200);
		try {
			QMP.ClickOnRadio();
			Logger.info("Clicked on Radio");
			Logger.info("Clicked on Radio PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked on Radio FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		QMP.ClickOnAssignLeadsRadio();
		Logger.info("Clicked on Assign Leads Radio Button");
		Thread.sleep(2500);
		try {
			AM.CheckboxQueManagementRRT();
			Logger.info("Clicked on CheckBox Passed");
		}
		catch(Exception e){
			Logger.info("Clicked on CheckBox Failed",e);
		}
		Thread.sleep(2500);
		QMP.CalendarBased();
		Logger.info("Clicked on Calendar Based Availabilty");
		Thread.sleep(2500);
		QMP.ClickOnCheckboxck();
		Logger.info("Clicked on Makes Sales People Unavailable");
		Thread.sleep(2500);
		QMP.ClickOnBeforeMeeting();
		Logger.info("Entered '10' on Before Metting");
		Thread.sleep(2500);
		QMP.ClickOnAfterMeeting();
		Logger.info("Entered '10' on After Metting");
		Thread.sleep(2500);
		QMP.ClickOnSAVE();
		Logger.info("Clicked On Save");
		Thread.sleep(800);
		try {
			if (QMP.DisplaySuccessMessage()) {
				sa.assertTrue(true);
				Logger.info("Success Message Display PASSED");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Success Message Display FAILED", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		Logger.info("//=====================================ENTERING ASSIGNMENT PAGE================================//");
		rrp.ClickOnAssignmentLimit();
		Thread.sleep(2500);
		rrp.ClickOnAssignmentLimit();		
		Logger.info("Entering Assignment Limit  Page");
		Thread.sleep(2500);
		try {
			AL.ClickOnAddBtn();
			Logger.info("Clicked on Add Button");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking on Add Button FAILED", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		AL.InputOnBox1();
		Logger.info(" Entered Input '20' on  TextArea");
		Thread.sleep(2500);
		AL.InputLeads1();
		Logger.info("Entered '19' on Leads Every Input");
		Thread.sleep(2500);
		AL.ClickOnSelectOption1();
		Logger.info("Clicked on Select PASSED!!");
		Thread.sleep(2500);
		AL.ClickOnLeadsEveryInHours();
		Logger.info("Clicked on LeadsEvery Hours");
		Thread.sleep(2500);
		AL.ClickOnSelectOption1();
		Logger.info("Clicked on Select PASSED!!");
		Thread.sleep(2500);
		AL.ClickOnLeadsEveryInDays();
		Logger.info("Clicked on LeadsEvery Days");
		Thread.sleep(2500);
		AL.ClickOnAddBtn();
		Logger.info("Clicked on Add Button_2");
		Thread.sleep(2500);
		AL.InputOnBox2();
		Logger.info(" Entered Input '20' on  TextArea");
		Thread.sleep(2500);
		AL.InputLeads2();
		Logger.info("Entered '19' on Leads Every Input");
		Thread.sleep(2500);
		AL.ClickOnSelectOption2();
		Logger.info("Clicked on Select PASSED!!");
		Thread.sleep(2500);
		AL.ClickOnLeadsEveryInHours();
		Logger.info("Clicked on LeadsEvery Hours");
		Thread.sleep(2500);
		AL.ClickOnSelectOption2();
		Logger.info("Clicked on Select PASSED!!");
		Thread.sleep(2500);
		AL.ClickOnLeadsEveryInDays();
		Logger.info("Clicked on LeadsEvery Days");
		Thread.sleep(2500);
		try {
			AL.ClickOnSaveBtn();
			Logger.info(" Clicked on SaveBtn in Assignment Limit Page");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking on SaveBtn in AssignmentLimit FAILED!", e);
		}
		Thread.sleep(400);
		try {
			if(AL.DisplaySuccessMessage() == true) {
				Logger.info("Saved in Assignment Limit Page Successfully!!");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Saving in AssignmentLimit FAILED!", e);
		}

		Logger.info("//===================================ENTERING DETAILS PAGE==============================");
		Thread.sleep(2500);
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
		Thread.sleep(2500);
		try {
			detrrt.ClickOnEditbtn();
			Logger.info("Clicked On Description Edit button");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking On Description Edit button FAILED", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			detrrt.InputDesc();
			Logger.info("Input on Details TextArea passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Input on Details TextArea Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			detrrt.btnSaveDescRRT();
			Logger.info("Clicked On Description Save buttonis passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked On Description Save button is failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		detrrt.ClickOnQueueOwner();
		Logger.info("Click On QueueOwner");
		Thread.sleep(2500);
		Logger.info("Clicked On Queue Owner");
		Thread.sleep(2500);
		detrrt.SelectQueueOwner();              
		Logger.info("Select Queue Owner");
		Thread.sleep(2500);
		try {
			detrrt.ClickOnQueOwnerInDetailsPageCheckBox2();
			Logger.info("ClickOnQueOwnerInDetailsPageCheckBox2 is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("ClickOnQueOwnerInDetailsPageCheckBox2 FAILED", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			detrrt.ClockOnSaveButtonForQueOwnerInDetailsPage();
			Logger.info("ClockOnSaveButtonForQueOwnerInDetailsPage is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("ClockOnSaveButtonForQueOwnerInDetailsPage FAILED", e);
			sa.assertAll();
		}
		Thread.sleep(300);
		try {
			detrrt.DislaySuccessMessage();
			Logger.info("DislaySuccessMessage is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("DislaySuccessMessage FAILED", e);
			sa.assertAll();
		}


		Thread.sleep(4500);
		Logger.info("//===============================APPROVE SCENARIO START===========================//");
		try {
			LMP.ContextClickOnAutoTestObject();           
			Logger.info("RightClick On AutoTestObject PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On AutoTestObject FAILED!!", e);
			sa.assertAll();
		} 
		Thread.sleep(3200);
		try {
			LMP.ClickOnApproveBtn();
			Logger.info("Click On Approve AutoTestObject PASSED!!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking On AutoTestObject FAILED!", e);
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
		Thread.sleep(4200);
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
		Thread.sleep(3500);
		Logger.info("//==================================EDIT SCENARIO START==================================//");
		try {
			rrp.ClickOnObjectEdit(); 
			Logger.info("Click On Edit AutoTestAEtoSDR!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Edit AutoTestObject FAILED!", e);
			sa.assertAll();

		}
		Thread.sleep(5500);
		wst.InputWeight3();
		Logger.info("Input On Weight3");
		Thread.sleep(2500);
		rrp.ClickOnExpandAll();
		Logger.info("Click on Expand All");

		Thread.sleep(3900);
		Logger.info("==========================================RENAME SCENARIO START=================================");
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
				LMP.ClickOnCRMAccFolder();
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
				Thread.sleep(300);
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

			Thread.sleep(3900);		
			Logger.info("=====================================RENAME SCENARIO START================================");
			try {
				LMP.ClickagainAutoTestObject();
				Thread.sleep(3900);	
				LMP.ContextClickOnAutoTestObject();
				Logger.info("RightClick On AutoTestObject PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("RightClick On AutoTestObject FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(4000);
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
		//====================================================================================================	
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

		Thread.sleep(3500);
		Logger.info("//=====================================CLONE SCENARIO START============================//");
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
			LMP.ClickOnCloneAutoTestObject();
			Logger.info("Click On Clone in RenamedAutoTestObject PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking On Clone in RenamedAutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickOnCloneBtn();
			Logger.info("Click On Clone Btn in RenamedAutoTestObject PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking On Clone Btn in RenamedAutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			if (LMP.DisplayCloneAutoTestObject() == true) {
				Logger.info("Cloning RenamedAutoTestObject PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Cloning  in RenamedAutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3900);
		try {
			LMP.ContextClickOnCloneAutoTestObject();
			Logger.info("RightClick On ClonedAutoTestObject PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On ClonedAutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Logger.info("//===============================DELETE CLONED OBJECT SCENARIO START========================================!");
		Thread.sleep(2500);
		try {
			LMP.ClickOnDeleteOnClonedAutoTestObject();
			Logger.info("Click On Delete Btn in CloneAutoTestAEtoSDR!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Btn in ClonedAutoTestAEtoSDR FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickOnDeletebtn();
			Logger.info("Click On Delete Btn in CloneAutoTestObject!!!");
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
			Thread.sleep(5200);
			LMP.ContextClickOnRenameAutoTestObject();
			Logger.info("RightClick On RenamedAutoTestObject!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On RenamedAutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Logger.info("//===============================MOVE OBJECT SCENARIO START========================================");
		Thread.sleep(6000);
		try {
			LMP.ClickOnMoveAutoTestObject();
			Logger.info("Click On Move RenamedAutoTestObject!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Move RenamedAutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(6000);
		try {
			LMP.SelectFolder();
			Logger.info("Select Folder in MoveWST!!!");
		} catch (Exception e) {
			Logger.info("Folder Not Found!! Craeting New Folder.");
			Thread.sleep(2500);
			rrp.ClickOnCancel();
			Logger.info("Click On Cancel");
			Thread.sleep(3500);
			LMP.RightClickonWST();
			Logger.info("Right Click on WaitCondition");
			Thread.sleep(2500);
			LMP.ClickOnNewFolder();
			Logger.info("Click on New Folder");
			Thread.sleep(2500);
			LMP.NameInObject();
			Logger.info("Entered Random Name");
			Thread.sleep(2500);
			LMP.clickOnSaveNewObject();
			Logger.info("clickOnSaveNewObject");
			Thread.sleep(2500);
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
			Thread.sleep(1500);
		}
		Thread.sleep(2500);
		try {
			rrp.ClickOnMoveFolder();
			Logger.info("Select Folder in MoveWST!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Folder in MoveWST FAILED!", e);
			sa.assertAll();
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

		Thread.sleep(5000);
		Logger.info("Waited 7 Seconds to Reload!!!");
		Thread.sleep(7500);
		try {
			LMP.ContextClickOnRenameAutoTestObject();
			Logger.info("RightClick On RenamedAutoTestObject PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On RenamedAutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Logger.info("//===============================DELETE OBJECT SCENARIO START========================================");
		Thread.sleep(7000);
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
			Logger.error("Click On Delete Btn in ClonedAutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(500);
		try {
			if (LMP.DisplayDeleteAutoTestObject() == true) {
				Logger.info("Display AutoTestObject Deleted  PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display AutoTestObject Deleted FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
	}

}
