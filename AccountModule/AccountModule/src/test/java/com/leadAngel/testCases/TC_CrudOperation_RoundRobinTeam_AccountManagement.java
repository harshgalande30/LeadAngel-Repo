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
import com.leadAngel.pageObjects.CRM_Lead_FilterPage;
import com.leadAngel.pageObjects.DetailsPage_SalesTeam;
import com.leadAngel.pageObjects.HomePage;
import com.leadAngel.pageObjects.LeadManagementPage;
import com.leadAngel.pageObjects.QueueManagementPage;
import com.leadAngel.pageObjects.RoundRobinPage;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
@Listeners({ com.leadAngel.utilities.TestAllureListener.class })
public class TC_CrudOperation_RoundRobinTeam_AccountManagement extends BaseClass {

	private static final Logger Logger = LogManager.getLogger(TC_CrudOperation_RoundRobinTeam_AccountManagement.class);
	@Test(description = "AccouuntManagement_RRT Section")
	@Step("AccouuntManagement_RRT_Sanity")
	@Description("AccouuntManagement_RRT Sanity Test")
	public void LeadManagementTest() throws InterruptedException, IOException {
		SoftAssert sa = new SoftAssert();
		HomePage hp = new HomePage(driver);
		LeadManagementPage LMP = new LeadManagementPage(driver);
		CRM_Lead_FilterPage LF = new CRM_Lead_FilterPage(driver);
		AEtoSDR_Page ae = new AEtoSDR_Page(driver);
		RoundRobinPage rrp = new RoundRobinPage(driver);
		DetailsPage_SalesTeam detrrt = new DetailsPage_SalesTeam(driver);
		CRM_Account_FilterPage crm = new CRM_Account_FilterPage(driver);
		AccountMaanagement_PageObjectModel AM=new AccountMaanagement_PageObjectModel(driver);
		AssignmentLimitPage AL = new AssignmentLimitPage(driver);

		Thread.sleep(2500);
		Logger.info("Now In Home Page!");
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
			LMP.RightClickonRRT();
			Logger.info("Right Click on RoundRobinTeam");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Clicking on RoundRobinTeam FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickOnNewObject();
			Logger.info("Clicked on New RRT");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked on New RRT FAILED", e);
			sa.assertAll();
		}

		Logger.info("//===============================CREATE OBJECT SCENARIO START========================================!");
		Thread.sleep(2500);
		try {
			LMP.NameInCrudObject();
			Logger.info("Entered AutoTestName PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Entered AutoTestName FAILED!!!");
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
			Logger.info("Clicked on Save Btn NewRRT passed");
		} catch (Exception e) {
			Logger.error("Clicked on Save Btn NewRRT failed",e);
			sa.assertAll();
		}

		//IF condition agar Error isDisplayed to AutoTestObject ko jaa ke delete krna hai and fir se AutoTestObject naam ka Obj banana hai ELSE : Continue programme.
		Thread.sleep(2500);
		if(ae.DisplaySameAEerror() == true) {
			Logger.info("Duplicate Object Found, Deleting Object NOW!!! then Creating New Object!!");
			Thread.sleep(2500);
			try {
				LMP.getRRTDropDown();
				Logger.info("Click On RRTDropDown PASSED!!");
			} catch (Exception e) {
				Logger.error("Click On RRTDropDown Failed!!",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				LMP.ContextClickOnAutoTestObject();           
				Logger.info("RightClick On AutoTestObject PASSED!!");

			} catch (Exception e) {
				Logger.error("RightClick On AutoTestObject Failed!!",e);
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
			Thread.sleep(600);
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
				LMP.ClickAgainRoundRobinTeam();
				Thread.sleep(3200);
				LMP.RightClickonRRT();
				Logger.info("Right Click on RoundRobinTeam");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Right Click on RoundRobinTeam FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(3100);
			try {
				LMP.ClickOnNewObject();
				Logger.info("Clicked on New RoundRobinTeam");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Clicking on New RoundRobinTeam FAILED!!", e);
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
			}
		}

		else {
			sa.assertTrue(true);
		}
		driver.navigate().refresh();
		Logger.info("Refreshing The Page!!");
		Thread.sleep(5800);
		try {
			rrp.ClickonSalesRepAttr();
			Logger.info("Clicked on Sales RepAttr");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking on Sales RepAttr FAILED!!", e);
			sa.assertAll();
		}
		Logger.info("//===================================== DRAG&DROP ABOUTME ATTRIBUTE=====================================//");
		Thread.sleep(4200);
		try {
			rrp.AboutMe_DND();
			Logger.info("DragAndDrop AboutMe");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("DragAndDrop About tMe FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			rrp.ClickOnAboutMe_Contains();
			Thread.sleep(3100);
			rrp.ClickOnAboutMe_Contains();
			Logger.info("Clicked on About Me Contains PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking on About Me FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(5600);
		try {
			rrp.InputAboutMeContains();
			sa.assertTrue(true);
			Logger.info("Input on AboutMe Contains PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Input on AboutMe Contains FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2300);
		Logger.info("//========================================= DRAG&DROP ACTIVE ATTRIBUTE===================================//");
		try {
			rrp.Active_DND();
			Logger.info("Drag And Drop Active");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag and Drop Active FAILED", e);
			sa.assertAll();
		}
		Thread.sleep(5600);
		try {
			rrp.ClickOnActiveIs();
			Thread.sleep(5600);
			rrp.ClickOnActiveIs();
			Logger.info("Clicked On Active Is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking On ActiveIs is  FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(5600);
		try {
			rrp.InputActiveTrue();
			Logger.info("Clicked On Active Is True PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking On ActiveIsTrue is FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(5600);
		Logger.info("//======================================== DRAG&DROP CRETEDDATE ATTRIBUTE==================================//");
		rrp.ScrollIntoViewCreatedDate();
		Logger.info("Scrolling into CreatedDate");
		Thread.sleep(5600);
		try {
			rrp.CreatedDate_DND();
			Logger.info("DND Created Date PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("DND Created Date FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(5600);
		try {
			rrp.ClickOnCreatedDateBefore();
			Logger.info("Clicked On Created Date Before PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked On Created Date Before FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(5600);
		try {
			rrp.ClickOnCalendarButton();
			Logger.info("Clicked On Calendar CreatedDate Button PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked On Calendar CreatedDate Button FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(5600);
		rrp.ClickOnDate();
		Logger.info("Clicked On Date");

		Logger.info("//======================================= DRAG&DROP LONGITUDE ATTRIBUTE==================================//");
		Thread.sleep(1500);
		rrp.ScrollIntoViewLongitude();
		Logger.info("Scrolling to Longitude");
		Thread.sleep(1500);
		try {
			rrp.Longitude_DND();
			Logger.info("Longitude DND PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Longitude DND FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			rrp.ClickOnLongitude_IsEmpty();
			Thread.sleep(1500);
			rrp.ClickOnLongitude_IsEmpty();
			Logger.info("Clicked On Longitude IsEmpty PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked On Longitude IsEmpty FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);

		Logger.info("//===========================================ENTERING QUEUE MANAGEMENT PAGE=============================//");
		rrp.ClickOnQueueManagement();
		Thread.sleep(3500);
		rrp.ClickOnQueueManagement();
		QueueManagementPage QMP = new QueueManagementPage(driver);
		Logger.info("Entering Queue management Page");
		Thread.sleep(3500);
		try {
			QMP.ClickOnRadio();
			Logger.info("Clicked on Radio");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked on Radio FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		QMP.ClickOnAssignLeadsRadio();
		Logger.info("Clicked on Assign Leads Radio Button");
		Thread.sleep(2500);
		AM.CheckboxQueManagementRRT();
		Logger.info("Clicked on CheckBox3");
		Thread.sleep(2500);
		QMP.CalendarBased();
		Logger.info("Clicked on Calendar Based Availabilty");
		Thread.sleep(2500);
		QMP.ClickOnCheckboxck();
		Logger.info("Clicked on Makes Sales People Unavailable");
		Thread.sleep(2500);
		QMP.ClickOnBeforeMeeting();
		Logger.info("Entered '10' on Before Meeting");
		Thread.sleep(2500);
		QMP.ClickOnAfterMeeting();
		Logger.info("Entered '10' on After Meeting");
		Thread.sleep(2500);
		QMP.ClickOnSAVE();
		Logger.info("Clicked On Save");
		Thread.sleep(300);
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
		Thread.sleep(3500);
		Logger.info("//========================================ENTERING ASSIGNMENT PAGE================================// ");
		rrp.ClickOnAssignmentLimit();
		Thread.sleep(3500);
		rrp.ClickOnAssignmentLimit();
		Logger.info("Click On Assignment Limit");
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
			sa.assertAll();
		}
		Thread.sleep(300);
		try {
			if(AL.DisplaySuccessMessage() == true) {
				Logger.info("Saved in Assignment Limit Page Successfully!!");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Saving in AssignmentLimit FAILED!", e);
			sa.assertAll();
		}

		Logger.info("//=====================================ENTERING DETAILS PAGE============================================");
		Thread.sleep(3200);
		try {
			rrp.ClickOnDetail();
			Thread.sleep(3200);
			rrp.ClickOnDetail();
			Logger.info("Entering Details Page is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Entering Details Page is FAILED", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			detrrt.ClickOnQueOwnerInDetailsPageDropDown();
			Logger.info("ClickOnQueOwnerInDetailsPageDropDown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("ClickOnQueOwnerInDetailsPageDropDown FAILED", e);
			sa.assertAll();
		}	
		Thread.sleep(2500);
		try {
			detrrt.SelectOnQueOwnerInDetailsPageOption();
			Logger.info("SelectOnQueOwnerInDetailsPageOption is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("SelectOnQueOwnerInDetailsPageOption FAILED", e);
			sa.assertAll();
		}
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
		Thread.sleep(400);
		try {
			detrrt.DislaySuccessMessage();
			Logger.info("DislaySuccessMessage is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("DislaySuccessMessage FAILED", e);
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

		Logger.info("//===================================APPROVE SCENARIO START=================================//");
		Thread.sleep(2500);
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
		Thread.sleep(2500);
		try {
			rrp.ClickOnApproveObject();
			Logger.info("Clicked on Approve Button PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked on Approve Button FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			rrp.ClickOnApproveSubmit();
			Logger.info("Clicked on Approve  Submit button on Approve Dialog PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked on Approve  Submit button on Approve Dialog FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			rrp.DisplayApproved();
			Logger.info("Approved Successfully PASSED!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Approved FAILED!!", e);
			sa.assertAll();
		}


		Logger.info("//=======================================EDIT SCENARIO START================================//");
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
		Thread.sleep(2500);
		try {
			rrp.ClickOnObjectEdit();
			Logger.info("clicked on Edit Button PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("clicked on Edit Button FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2700);
		try {
			rrp.ClickOnAboutMe_StartsWith();
			Thread.sleep(2700);
			rrp.ClickOnAboutMe_StartsWith();
			Logger.info("Click on AboutMe Starts With PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking on AboutMe Starts With FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			rrp.InputAboutMeContains();
			Logger.info("Input on AboutMe Starts With PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Input on AboutMe Starts With FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			rrp.ClickOnActiveIsNot();
			Logger.info("Clicked On Active Is Not PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking On Active Is Not is FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			rrp.InputActiveTrue();
			Logger.info("Clicked On Active IsNot True PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicking On Active IsNot True is FAILED!!!", e);
			sa.assertAll();
		}
		Logger.info("//==================================RENAME SCENARIO START====================================//");
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
		Thread.sleep(2500);
		try {
			rrp.ClickOnObjectRename();
			Logger.info("Clicked on Rename Object PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked on Rename Object FAILED!!!", e);
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
				Thread.sleep(1000);

			} else 
			{
				Thread.sleep(2500);
				LMP.ClickOnFolder();
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
				Thread.sleep(700);
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
			Thread.sleep(6800);
			Logger.info("=====================================RENAME SCENARIO START=======================================");
			try {
				LMP.ClickagainAutoTestObject();
				Thread.sleep(5200);
				LMP.ContextClickOnAutoTestObject();
				Logger.info("RightClick On AutoTestObject PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("RightClick On AutoTestObject FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(4600);
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
		Thread.sleep(3500);
		//===============================================================================================================================
		try {
			if (LMP.DisplayRenameAutoTestObject() == true) {
				Logger.info("Renaming AutoTestObject PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Renaming AutoTestObject FAILED!", e);
			sa.assertAll();
		}

		Logger.info("//===================================CLONE SCENARIO START================================//");
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
			rrp.ClickOnObjectClone();
			Logger.info("Clicked on Object CLONE is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked on Object CLONE is FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			rrp.ClickOnCloneBtn();
			Logger.info("Clicked on CLONE btn is successfully PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked on CLONE btn is successfully  FAILED!!!", e);
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
		Thread.sleep(3100);
		Logger.info("//==================================DELETE CLONED OBJECT SCENARIO=================================//");
		try {
			LMP.ContextClickOnCloneAutoTestObject();
			Logger.info("RightClick On ClonedAutoTestObject PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On ClonedAutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			rrp.ClickOnObjectDelete();
			Logger.info("Clicked on Delete button, Delete  Dialog box is  Opened PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked on Delete button, Delete  Dialog box is  Opened FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			ae.ClickOnDelete();
			Logger.info("Object is Successfully Deleted PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Object is Successfully Deleted FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(800);
		try {
			if (LMP.DisplayDeleteAutoTestObject() == true) {
				Logger.info(" Display Cloned AutoTestObject Deleted successfully PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Cloned AutoTestObject Deleted  FAILED!", e);
			sa.assertAll();
		}
		Logger.info("//========================================MOVE OBJECT SCENARIO START===================================//");
		Thread.sleep(6100);
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
		Thread.sleep(2500);
		try {
			rrp.ClickOnObjectMove();
			Logger.info("Clicked on Move button, Move Dialog box is Opened PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked on Move button, Move Dialog box is Opened FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			rrp.ClickOnMoveFolder();
			Logger.info("Clicked on  MOVE Folder Object PASSED!!");
		} catch (Exception e) {
			Logger.info("Folder Not Found!! Craeting New Folder.");
			Thread.sleep(2500);
			rrp.ClickOnCancel();
			Logger.info("Click On Cancel");
			Thread.sleep(3500);
			LMP.RightClickonRRT();
			Logger.info("Right Click on RoundRobinTeam");
			Thread.sleep(2500);
			LMP.ClickOnNewFolder();
			Logger.info("Click on New Folder");
			Thread.sleep(2500);
			LMP.NameInObject();
			Logger.info("Entered Random Name");
			Thread.sleep(2500);
			LMP.clickOnSaveNewObject();
			Logger.info("click On Save NewObject");
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
		}
		Thread.sleep(2500);
		try {
			rrp.ClickOnMoveBtn();
			Logger.info("Clicked on MOVE button PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked on MOVE button FAILED!!!", e);
			sa.assertAll();
		}

		Logger.info("Waited 10 Seconds to Reload!!!");
		Logger.info("//====================================DELETE OBJECT SCENARIO START================================//");
		Thread.sleep(6000);
		if(LMP.VisibleOfRenameAutoTestObject()==false) {
			Thread.sleep(2500);
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
		Thread.sleep(4200);
		try {
			LMP.ContextClickOnRenameAutoTestObject();
			Logger.info("RightClick On RenamedAutoTestObject PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On RenamedAutoTestObject FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(4300);
		try {
			rrp.ClickOnObjectDelete();
			Logger.info("Clicked on Delete button, Delete  Dialog box is  Opened PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked on Delete button, Delete  Dialog box is  Opened FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(2400);
		try {
			ae.ClickOnDelete();
			Logger.info("Object is Successfully Deleted PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Object is Successfully Deleted FAILED!!!", e);
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
