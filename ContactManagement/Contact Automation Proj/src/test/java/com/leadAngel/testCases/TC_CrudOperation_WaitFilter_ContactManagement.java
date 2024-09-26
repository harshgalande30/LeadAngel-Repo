package com.leadAngel.testCases;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.leadAngel.pageObjects.AEtoSDR_Page;
import com.leadAngel.pageObjects.AccountListPage;
import com.leadAngel.pageObjects.AccountMaanagement_PageObjectModel;
import com.leadAngel.pageObjects.CRM_Account_FilterPage;
import com.leadAngel.pageObjects.ContactManagement_PageObjectModel;
import com.leadAngel.pageObjects.DetailsPage_SalesTeam;
import com.leadAngel.pageObjects.HomePage;
import com.leadAngel.pageObjects.LeadManagementPage;
import com.leadAngel.pageObjects.LeadProcessingWithoutRouting_FlowChartPage;
import com.leadAngel.pageObjects.LeadRouterPageObjectModel;
import com.leadAngel.pageObjects.LoginPage;
import com.leadAngel.pageObjects.RoundRobinPage;
@Listeners({ com.leadAngel.utilities.TestAllureListener.class })
@Test

public class TC_CrudOperation_WaitFilter_ContactManagement extends BaseClass{
	private static final Logger Logger = LogManager.getLogger(TC_CrudOperation_WaitFilter_ContactManagement.class);
	public void crud_AccountList() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		LoginPage lp = new LoginPage(driver);
		DetailsPage_SalesTeam detrrt = new DetailsPage_SalesTeam(driver);	
		CRM_Account_FilterPage crm = new CRM_Account_FilterPage(driver);
		HomePage hp = new HomePage(driver);
		RoundRobinPage rrp = new RoundRobinPage(driver);
		AccountListPage ALP = new AccountListPage(driver);
		LeadManagementPage LMP = new LeadManagementPage(driver);
		AEtoSDR_Page ae = new AEtoSDR_Page(driver);
		AccountMaanagement_PageObjectModel AM=new AccountMaanagement_PageObjectModel(driver);
		ContactManagement_PageObjectModel CM=new ContactManagement_PageObjectModel(driver);
		LeadRouterPageObjectModel LR=new LeadRouterPageObjectModel(driver);
		DetailsPage_SalesTeam dp=new DetailsPage_SalesTeam(driver);
		LeadProcessingWithoutRouting_FlowChartPage LPWR=new LeadProcessingWithoutRouting_FlowChartPage(driver);

		Thread.sleep(3500);
		try {
			CM.ContactManagement();
			Logger.info("Click on ContactManagement is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on ContactManagement is FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		LMP.RightClickonWaitFilter();
		Logger.info("Right Click on Wait Filter is Passed");
		Thread.sleep(2500);
		LMP.ClickOnNewObject();
		Logger.info("Click on New Wait Filter is Passed");
		Thread.sleep(2500);
		try {
			LMP.NameInCrudObject();
			Logger.info("Enter AutoTestObject name is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter AutoTestObject name is FAILED!!",e);
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
		LMP.clickOnSaveNewObject();
		Logger.info("Click on Save Button is Passed");

		Thread.sleep(800);
		if(ae.DisplaySameAEerror() == true) {
			Logger.info("Duplicate Object Found, Try to delete the Object NOW!!! then Creating New Object!!");
			Thread.sleep(4000);
			try {
				LMP.WaitFilterDropDown();
				Logger.info("Wait Filter DropDown is PASSED!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Wait Filter DropDown is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(2500);
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
			Thread.sleep(3200);
			try {
				LMP.ClickOnDeletebtn();
				Logger.info("Click Again Delete button is Passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click Again Delete button is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(400);
			try {
				if (LR.DisplayedCannotDeleteErrorSuccessMessage() == true) 
				{
					Logger.info("Displayed 'Cannot Delete' Error Message");
					Thread.sleep(4500);
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
			Thread.sleep(5500);
			try {
				LMP.RightClickonWaitFilter();
				Logger.info("Right Click on Wait filter is Passed ");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Right Click on Wait filter is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(3000);
			try {
				LMP.ClickOnNewObject();
				Logger.info("Click on New Wait filter is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on New Wait filter is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(3000);
			try {
				LMP.NameInCrudObject();
				Logger.info("Enter AutoTestObject Name is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter AutoTestObject Name is FAILED!!!",e);
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
			if( LMP.DisplayWaitFilterOverview()==true) {
				Logger.info("Display WaitFilter Overview passed");
				Thread.sleep(2500);
				try {
					LMP.WaitFilterDropDown();
					Logger.info("Wait Filter DropDown is PASSED!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Wait Filter DropDown is FAILED!", e);
					sa.assertAll();
				}
				Thread.sleep(3200);
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
			AM.ClickOnAccountAttribute();
			Logger.info("Click on ContactAttribute is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on ContactAttribute is FAILED!!",e);
			sa.assertAll();
		}


		Logger.info("//================================== ContactId_DND ====================================");
		Thread.sleep(3500);
		try {
			AM.ContactId_DND();
			Logger.info("Drag and Drop ContactId is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag and Drop ContactId is FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(3200);
		try {
			AM.AccounttId_Option();
			Thread.sleep(2500);
			AM.AccounttId_Option();
			Logger.info("Click on ContactId Option is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on ContactId Option is FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			AM.EnterAccountID();
			Logger.info("Enter value for ContactId is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter value for ContactId is FAILED!!",e);
			sa.assertAll();
		}

		Logger.info("//================================== Deleted_DND====================================//");
		Thread.sleep(3500);
		try {
			AM.Deleted_DND();
			Logger.info("Drag and Drop Deleted is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag and Drop Deleted is FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			AM.Deleted_Option1();
			Thread.sleep(2500);
			AM.Deleted_Option1();
			Logger.info("Select Deleted Option1 is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Deleted Option1 is FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			AM.Deleted_Option2();
			Thread.sleep(2500);
			AM.Deleted_Option2();
			Logger.info("Select Deleted Option2 is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Deleted Option2 is FAILED!!",e);
			sa.assertAll();
		}

		Logger.info("//================================== OtherLattitude_DND====================================//");
		Thread.sleep(3500);
		try {
			CM.OtherLatitude_DND();
			Logger.info("Drag and Drop OtherLatitude is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag and Drop OtherLatitude is FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			CM.OtherLatitude_Option();
			Thread.sleep(2500);
			CM.OtherLatitude_Option();
			Logger.info("Select OtherLatitude Option is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select OtherLatitude Option is FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			CM.EnterOtherLatitude_Option();
			Logger.info("Enter OtherLatitude Option is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter OtherLatitude Option is FAILED!!",e);
			sa.assertAll();
		}

		Logger.info("//================================== CreadtedDate_DND====================================//");
		Thread.sleep(4000);
		try {
			AM.CreadtedDate_DND();
			Logger.info("Drag and Drop CreadtedDate is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag and Drop CreadtedDate is FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(4000);
		try {
			AM.CreadtedDate_Option();
			Thread.sleep(3000);
			AM.CreadtedDate_Option();
			Logger.info("select CreadtedDate Option is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("select CreadtedDate Option is FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			AM.ClickOnCalenderIcon();
			Logger.info("Click on CalenderIcon is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on CalenderIcon is FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			AM.SelectDate();
			Logger.info("Select Date is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Date is FAILED!!",e);
			sa.assertAll();
		}

		Logger.info("//=========================================APPROVE SCENARIO START======================================//");
		Thread.sleep(3500);
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
			rrp.ClickOnApproveSubmit();
			Logger.info("Click again Approve button is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click again Approve button is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			rrp.DisplayApproved();
			Logger.info("Displayed Approved button is PASSED!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Approved button is FAILED!!", e);
			sa.assertAll();
		}


		Logger.info("//=======================================ENTERING DETAILS PAGE=========================================");
		Thread.sleep(3500);
		rrp.ClickOnDetail();
		Logger.info("Enter Details Page is Passed!!!");
		Thread.sleep(2500);
		detrrt.ClickOnEditbtn();
		Logger.info("Click On Description Edit button is Passed");
		Thread.sleep(2500);
		detrrt.InputDesc();
		Logger.info("Enter text in TextArea is Passed");
		Thread.sleep(2500);
		detrrt.ClickOnbtnSaveDescForAccList();
		Logger.info("Click On Description Save button is Passed");
		Thread.sleep(2500);
		try {
			if (LR.DisplayedNoRecordFound() == true) {
				Logger.info("Display 'No Record Found' is PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display 'No Record Found' is FAILED!", e);
			sa.assertAll();
		}

		Logger.info("//*********************************************** Make Use of this Object in Wait Condition *******************************************");
		Thread.sleep(3500);
		try {
			LMP.RightClickonWaitCondition();
			Logger.info("Right Click on Wait Condition is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click on Wait Condition is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickOnNewObject();
			Logger.info("Click on New Object is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on New Object is Failed",e);
			sa.assertAll();
		}

		Logger.info("//===============================CREATE OBJECT SCENARIO START========================================!");
		Thread.sleep(3500);
		try {
			LMP.NameInCrudObject();
			Logger.info("Enter AutoTestName is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter AutoTestName is FAILED!!!",e);
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
			Logger.info("Duplicate Object Found, Deleting Object NOW!!! then Creating New Object!!");
			Thread.sleep(3500);
			try {
				LMP.WaitConditionDropDown();
				Logger.info("WaitCondition DropDown is PASSED!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("WaitCondition DropDown is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(3500);		
			try {
				LR.ContextClickOnAutoTestObject2();           
				Logger.info("RightClick On AutoTestObject is PASSED!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("RightClick On AutoTestObject is Failed!!", e);
				sa.assertAll();
			}
			Thread.sleep(4000);
			try {
				LMP.ClickOnDeleteOnClonedAutoTestObject();
				Logger.info("Click On Delete button is Passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Delete button is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(3200);
			try {
				LMP.ClickOnDeletebtn();
				Logger.info("Click again Delete button is Passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click again Delete button is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(700);
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
			Thread.sleep(4600);
			try {
				LMP.RightClickonWaitCondition();
				Logger.info("Right Click on Wait Condition is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Right Click on Wait Condition is Failed!!", e);
				sa.assertAll();
			}
			Thread.sleep(4100);
			try {
				LMP.ClickOnNewObject();
				Logger.info("Click on New Wait Condition is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on New Wait Condition is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(4900);
			try {
				LMP.NameInCrudObject();
				Logger.info("Enter AutoTestObject Name is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter AutoTestObject Name is FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(3500);
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
				Logger.info("Click on Save button is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on Save button is FAILED!!", e);
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
			if( LMP.DisplayWaitConditionOverview()==true) {
				Logger.info("Display WaitCondition Overview passed");
				Thread.sleep(3500);
				try {
					LMP.WaitConditionDropDown();
					Logger.info("Click on WaitCondition DropDown is PASSED!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click on WaitCondition DropDown is FAILED!", e);
					sa.assertAll();
				}
				Thread.sleep(3000);
				try {
					LMP.ClickagainAutoTestObject();
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
		Thread.sleep(3800);
		try {
			LMP.ClickOnWaitAttr();
			Logger.info("Click on WaitAttribute is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on WaitAttribute is FAILED!!", e);
			sa.assertAll();
		}
		Logger.info("//====================================== DRAG&DROP WAIT FILTER ATTRIBUTE===============================//");
		Thread.sleep(3500);
		try {
			LMP.WaitFil_DND();
			Logger.info("Drag And Drop WAIT FILTER is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag And Drop WAIT FILTER is FAILED!!", e);
			sa.assertAll();
		}		
		Thread.sleep(4500);
		try {
			LMP.ClickOnWaitTllOption();
			Logger.info("Click On WaitTllOption Is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On WaitTllOption Is FAILED!!!", e);
			sa.assertAll();
		}		
		Thread.sleep(3500);
		try {
			AM.clickOnWaitTillvalueDropDown();
			Logger.info("Click On WaitFilter dropdown is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On WaitFilter dropdown is FAILED!!!", e);
			sa.assertAll();
		}		
		Thread.sleep(3500);
		try {
			LR.ClickOnAutoTestObject();
			Logger.info("Select AutoTestObject is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select AutoTestObject is Failed !!",e);
			sa.assertAll();
		}	


		Logger.info("//===============================================APPROVE SCENARIO START========================================//");
		Thread.sleep(3500);
		ae.ClickOnApprove();
		Logger.info("Click on Approve Button After EDIT is passed");
		Thread.sleep(2500);
		ae.ClickOnApproveSubmit();
		Logger.info("Click Again Approve button is passed");
		Thread.sleep(3700);
		try {
			ae.DisplayApproved();
			Logger.info("Display Approved button is PASSED!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Approved button is FAILED!!", e);
			sa.assertAll();
		}

		Logger.info("======================================= Go back To Main Object ==================================");
		Thread.sleep(3000);
		try {
			LMP.WaitFilterDropDown();
			Logger.info("Wait Filter DropDown is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Wait Filter DropDown is FAILED!", e);
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
		Logger.info("===================== Used By Operation in Details Page =====================");
		Thread.sleep(3500);
		try {
			dp.ClickOndetailsbutton();
			Logger.info("Click On Detail button is PASSED!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Detail button is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			LR.ClickOnUsedByDropDown();
			Logger.info("Click On UsedBy Dropdown is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On UsedBy Dropdown is Failed",e);
			sa.assertAll();
		}
		String TextFromUsedByRouterName="";
		String TextFromErrorMessage   ="";
		Thread.sleep(2500);
		try {
			TextFromUsedByRouterName = LR.GetTextFromUsedByRouterName.getText();
			Logger.info("Fetch used by router name is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Fetch used by router name is Failed",e);
			sa.assertAll();
		}
		Logger.info("********************** Verifying whether Used object can delete or not *********************");
		Thread.sleep(2500);
		try {
			LR.ClickOnApprovedButton();
			Logger.info("Click On Approved Button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Approved Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickOnDeleteButton();
			Logger.info("Click On Delete button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickOnDelete();
			Logger.info("Click Again Delete Button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Again Delete Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			TextFromErrorMessage=LR.GetTextFromErrorMessage.getText();
			Logger.info("Get Text From Error Message is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Get Text From Error Message is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (TextFromErrorMessage.contains(TextFromUsedByRouterName)) {
				Logger.info("Displayed 'Cannot delete,It is Used' Error message is Passed");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed 'Cannot delete,It is Used' Error message is Failed",e);
			sa.assertAll();
		}

		Logger.info("********* Verify that the 'Used By' object module name and the left menu title are Same Or Not, Once clicking the 'Used By' Router name ************");
		Thread.sleep(4500);
		try {
			dp.ClickOndetailsbutton();
			Logger.info("Click On details button is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On details button is FAILED!!!",e);
			sa.assertAll();
		}
		String TextFromLeftMenuTitleAfter="";
		String TextFromLeftMenuTitleBefore ="";
		String TextFromDetails="";
		Thread.sleep(4500);
		try {
			TextFromLeftMenuTitleBefore =LR.GetTextOfLeftMenuTitle.getText();
			Logger.info("Get Menu Title From Left tree Menu is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Get Menu Title From Left tree Menu is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickUsedByRouterName();
			Logger.info("Click Used By Router Name is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Used By Router Name is FAILED!!!",e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		try {
			TextFromLeftMenuTitleAfter=LR.GetTextOfLeftMenuTitle.getText();
			Logger.info("Get Menu Title From Left tree Menu is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Get Menu Title From Left tree Menu is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (TextFromLeftMenuTitleBefore.contentEquals(TextFromLeftMenuTitleAfter)) {
				Logger.info(TextFromLeftMenuTitleBefore);
				Logger.info(TextFromLeftMenuTitleAfter);
				Logger.info("Left menu titlt is same before and after clicking UsedBy object name is Passed");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.info(TextFromLeftMenuTitleBefore);
			Logger.info(TextFromLeftMenuTitleAfter);
			Logger.error("Left menu titlt is not same before and after clicking UsedBy object name is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(6500);
		try {
			TextFromDetails = driver.findElement(By.xpath("(//i[text()='description']//..//span[text()])[2]")).getText();
			Logger.info("Get Object Name From Details tab : "+TextFromDetails);
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Get Object Name From Details tab is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (TextFromDetails.contains("AutoTestObject")) {
				Logger.info("AutoTest Object Name matched with the name from Details tab is Passed");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("AutoTest Object Name matched with the name from Details tab is Failed",e);
			sa.assertAll();
		}


		Logger.info("======================================= Go back To Main Object ==================================");


		Logger.info("//=======================================EDIT SCENARIO START=========================================//");
		Thread.sleep(4200);  
		try {
			LMP.ContextClickOnAutoTestObject();      
			Logger.info("RightClick On AutoTestObject is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On AutoTestObject is FAILED!!", e);
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
		Thread.sleep(2500);
		try {
			AM.EditAccounttId_Option();
			Logger.info("Select AccounttId Option is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select AccounttId Option is FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			AM.EditEnterAccountID();
			Logger.info("Enter AccountID is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter AccountID is FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			AM.EditDeleted_Option2();
			Logger.info("Select Deleted Option2 is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Deleted Option2 is FAILED!!",e);
			sa.assertAll();
		}

		Logger.info("===========================================Approve After Edit===================================");	
		Thread.sleep(3500);
		ae.ClickOnApprove();
		Logger.info("Click on Approve Button After EDIT is passed");
		Thread.sleep(2500);
		ae.ClickOnApproveSubmit();
		Logger.info("Click Again Approve button is passed");
		Thread.sleep(3700);
		try {
			ae.DisplayApproved();
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
			Logger.info("Click on Rename Object is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Rename Object is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.InputOnRenameAutoTestObject();
			Logger.info("Input on Rename AutoTestObject is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Input on Rename AutoTestObject is FAILED!",e);
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
		Thread.sleep(400);
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

			} else 
			{
				Thread.sleep(3500);
				LR.ClickOnCrudFolderDropdown();
				Logger.info("Click On CrudFolder Dropdown is PASSED!!!");
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
			Thread.sleep(6200);	
			Thread.sleep(4500);
			try {
				LMP.ContextClickOnAutoTestObject();
				Logger.info("Right Click On AutoTestObject is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Right Click On AutoTestObject is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(4000);
			try {
				LMP.ClickOnRenameAutoTestObject();
				Logger.info("Click On Rename AutoTestObject is Passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Rename AutoTestObject is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(4000);
			try {
				LMP.InputOnRenameAutoTestObject();
				Logger.info("Input on Rename AutoTestObject is passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Input on Rename AutoTestObject is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(2500);
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
		Thread.sleep(4500);
		while (LR.DisplayedAutoTestObjectRenameCopy()==true) {
			Logger.info("Displayed AutoTestObjectRenameCopy Object,So Delete that Object");
			Thread.sleep(5000);
			try {
				LR.ContextClickOnAutoTestObjectRenameCopyObject();
				Logger.info("Right Click On AutoTestObjectRenameCopy Object is PASSED!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Right Click On AutoTestObjectRenameCopy Object is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(3500);
			try {
				LMP.ClickOnDeleteOnClonedAutoTestObject();
				Logger.info("Click On Delete Button is Passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Delete Button is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(4000);
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
					Thread.sleep(3500);
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
		Thread.sleep(3800);
		try {
			LMP.ClickOnCloneAutoTestObject();
			Logger.info("Click On Clone in RenamedAutoTestObject is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Clone in RenamedAutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			LMP.ClickOnCloneBtn();
			Logger.info("Click On Clone Button in RenamedAutoTestObject is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Clone Button in RenamedAutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			if (LMP.DisplayCloneAutoTestObject() == true) {
				Logger.info("Display clocned RenamedAutoTestObject is PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display clocned RenamedAutoTestObject is FAILED!", e);
			sa.assertAll();
		}

		Logger.info("//===============================Approve Cloned Object========================================!");
		Thread.sleep(5000);
		try {
			LMP.ContextClickOnCloneAutoTestObject();
			Logger.info("Right Click On ClonedAutoTestObject is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On ClonedAutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3100);
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
		Thread.sleep(3800);
		try {
			rrp.DisplayApproved();
			Logger.info("Displayed Success Message is PASSED!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Success Message is FAILED!!",e);
			sa.assertAll();
		}

		Logger.info("//===============================DELETE CLONED OBJECT SCENARIO START========================================!");
		Thread.sleep(5000);
		try {
			LMP.ContextClickOnCloneAutoTestObject();
			Logger.info("Right Click On ClonedAutoTestObject is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On ClonedAutoTestObject is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			LMP.ClickOnDeleteOnClonedAutoTestObject();
			Logger.info("Click On Delete Button in Cloned AutoTestObject is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Button in Cloned AutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(4000);
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
		Thread.sleep(6500);
		Thread.sleep(3500);
		try {
			LMP.ContextClickOnRenameAutoTestObject();
			Logger.info("Right Click On RenamedAutoTestObject is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On RenamedAutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(4500); 
		try {
			LMP.ClickOnMoveAutoTestObject();
			Logger.info("Click On Move Renamed AutoTestObject is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Move Renamed AutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(5100);
		try {
			LR.SelectFolderToAutotestObject();
			Logger.info("Select Folder to move the Autotest object is Passed !!!");
		} catch (Exception e) {
			Logger.info("Folder Not Found!! Craeting New Folder.");
			Thread.sleep(2500);
			rrp.ClickOnCancel();
			Logger.info("Click On Cancel button is Passed");
			Thread.sleep(4000);
			LMP.RightClickonWaitFilter();
			Logger.info("Right Click on Wait filter is Passed ");
			Thread.sleep(2500);
			LMP.ClickOnNewFolder();
			Logger.info("Click on New Wait filter is Passed");
			Thread.sleep(2500);
			LR.NameInObject();
			Logger.info("Enter Folder Name is Passed");
			Thread.sleep(2500);
			LMP.clickOnSaveNewObject();
			Logger.info("Click On Save is Passed");
			Thread.sleep(4800);
			try {
				LMP.ContextClickOnRenameAutoTestObject();
				Logger.info("Right Click On RenamedAutoTestObject is Passed!!!");
			} catch (Exception g) {
				sa.assertTrue(false);
				Logger.error("Right Click On RenamedAutoTestObject is FAILED!", g);
				sa.assertAll();
			}
			Thread.sleep(4500);
			try {
				LMP.ClickOnMoveAutoTestObject();
				Logger.info("Click On Move Renamed AutoTestObject is Passed!!!");
			} catch (Exception f) {
				sa.assertTrue(false);
				Logger.error("Click On Move Renamed AutoTestObject is FAILED!", f);
				sa.assertAll();
			}
			Thread.sleep(4800);
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
		Thread.sleep(2500);
		Thread.sleep(5000);
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
		Thread.sleep(1500);

	}
}
