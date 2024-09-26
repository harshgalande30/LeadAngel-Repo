package com.leadAngel.testCases;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.leadAngel.pageObjects.CRM_Lead_FilterPage;
import com.leadAngel.pageObjects.DetailsPage_SalesTeam;
import com.leadAngel.pageObjects.HomePage;
import com.leadAngel.pageObjects.LeadManagementPage;
import com.leadAngel.pageObjects.LeadProcessingWithoutRouting_FlowChartPage;
import com.leadAngel.pageObjects.LeadRouterPageObjectModel;
import com.leadAngel.pageObjects.LoginPage;
import com.leadAngel.pageObjects.RoundRobinPage;
import com.leadAngel.pageObjects.AEtoSDR_Page;
import com.leadAngel.pageObjects.CRM_Account_FilterPage;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
@Listeners({ com.leadAngel.utilities.TestAllureListener.class })
public class TC_CrudOperation_CappingLevelingCondtion extends BaseClass {
	private final static Logger Logger = org.apache.logging.log4j.LogManager
			.getLogger(TC_CrudOperation_CappingLevelingCondtion.class);

	@Test(description = "LeadManagement_LeadRouting_Section")
	@Step("LeadManagement__LeadRouting_Section")
	@Description("LeadManagement__LeadRouting_CappingLevelingCondtion")

	public void LeadManagementTest() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		CRM_Lead_FilterPage LF = new CRM_Lead_FilterPage(driver);
		LeadManagementPage LMP = new LeadManagementPage(driver);
		RoundRobinPage rrp = new RoundRobinPage(driver); 
		DetailsPage_SalesTeam detrrt = new DetailsPage_SalesTeam(driver); 
		CRM_Account_FilterPage crm = new CRM_Account_FilterPage(driver);
		AEtoSDR_Page ae = new AEtoSDR_Page(driver);
		LeadRouterPageObjectModel LR=new LeadRouterPageObjectModel(driver);
		DetailsPage_SalesTeam dp=new DetailsPage_SalesTeam(driver);
		LeadProcessingWithoutRouting_FlowChartPage LPWR=new LeadProcessingWithoutRouting_FlowChartPage(driver);

		Thread.sleep(3500);
		
		try {
			hp.ClickOnLeadManagement();
			Logger.info("Click on Lead Management is passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Lead Management is FAILED!", e);
			sa.assertAll();
		}
		
		Thread.sleep(4800);
		
		try {
			LMP.ClickOnLeadRouting();
			Logger.info("Click on Lead Routing is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Lead Routing is FAILED!", e);
			sa.assertAll();
		}
		
		Thread.sleep(3500);
		try {
			LMP.RightClickOnCappingLeveling();
			Logger.info("Right Click On CappingLevelingCondition is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On CappingLevelingCondition is FAILED!", e);
			sa.assertAll();
		}
		
		Thread.sleep(2500);
		try {
			LMP.ClickOnNewObject();
			Logger.info("Click on New CappingLevelingCondition is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on New CappingLevelingCondition is FAILED", e);
			sa.assertAll();
		}
		
		Thread.sleep(2500);
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
			Logger.info("Enter Description is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Description is FAILED!!", e);
			sa.assertAll();
		}
		
		Thread.sleep(2500);
		LMP.clickOnSaveNewObject();
		Logger.info("Click on Save Button is passed");


		Thread.sleep(800);
		if(ae.DisplaySameAEerror() == true) {
			Logger.info("Duplicate Object Found, Try to delete the Object NOW!!! then Creating New Object!!");
			Thread.sleep(4000);
		
			try {
				LMP.ClickOnCapping_levellingDropDown();
				Logger.info("Click On CappingLevelingCondition DropDown is PASSED!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On CappingLevelingCondition DropDown is FAILED!", e);
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
				LMP.RightClickOnCappingLeveling();
				Logger.info("Right Click On CappingLevelingCondition is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Right Click On CappingLevelingCondition is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(3000);
			try {
				LMP.ClickOnNewObject();
				Logger.info("Click on New CappingLevelingCondition is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on New CappingLevelingCondition is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(3000);
			try {
				LMP.NameInCrudObject();
				Logger.info("Enter Object Name is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter Object Name is FAILED!!!",e);
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
			if( LMP.DisplayCappingLevelingConditionOverview()==true) {
				Logger.info("Display CappingLevelingCondition Overview Page");
				Thread.sleep(2500);
				try {
					LMP.ClickOnCapping_levellingDropDown();
					Logger.info("Click On CappinglevellingCondition DropDown is PASSED!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On CappinglevellingCondition DropDown is FAILED!", e);
					sa.assertAll();
				}
				Thread.sleep(3500);
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
		Thread.sleep(2500);
		try {
			LF.ClickonLeadAttr();
			Logger.info("Click on Lead attribute is passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Lead attribute is FAILED!!", e);
			sa.assertAll();
		}

		Logger.info("//===================================== DRAG&DROP FIRST NAME ATTRIBUTE===============================//");
		Thread.sleep(3500);
		try {
			LF.FirstName_DND();
			Logger.info("Drag And Drop Fisrt Name is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);					
			Logger.error("Drag And Drop Fisrt Name is FAILED!!", e);	
			sa.assertAll();
		}
		Thread.sleep(2500);	
		try {
			LMP.ClickonFirstName_DoesNotContain();
			Thread.sleep(2500);
			LMP.ClickonFirstName_DoesNotContain();
			Logger.info("Click on First Name DoesNotContains is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on First Name DoesNotContains is FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LF.InputFirstNameContains();
			Logger.info("Input on First Name DoesNotContains is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Input on First Name DoesNotContains is FAILED!!", e);
			sa.assertAll();
		}

		Logger.info("//===================================== DRAG&DROP ANNUAL REVENUE  ATTRIBUTE============================//");
		Thread.sleep(3500);
		try {
			LF.LeadAnnualRevenue_DND();
			Logger.info("Drag and Drop AnnualRevenue is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag and Drop AnnualRevenue is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickonAnnualRevenue_IsGreaterThan();
			Thread.sleep(2500);
			LMP.ClickonAnnualRevenue_IsGreaterThan();
			Logger.info("Click on AnnualRevenue IsGreaterThan is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on AnnualRevenue IsGreaterThan is FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			crm.InputAnnualRevenue();
			Logger.info("Input on AnnualRevenue IsGreaterThan is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Input on AnnualRevenue IsGreaterThan is FAILED!!", e);
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

		Logger.info("//=======================================ENTERING DETAILS PAGE========================================");
		Thread.sleep(3500);
		try {
			rrp.ClickOnDetail();
			Logger.info("Click on Details Page is passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Details Page is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		detrrt.ClickOnEditbtn();
		Logger.info("Click On Description Edit button is Passed");
		Thread.sleep(2500);
		detrrt.InputDesc();
		Logger.info("Enter Description is Passed");
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

		Logger.info("//*********************************************** Make Use of this Object In LeadRouter(LeadManagement) *******************************************");
		Thread.sleep(4900);
		try {
			LMP.RightClickOnLeadRouter();
			Logger.info("Right click on leadRouter is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right click on leadRouter is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickOnNewObject();
			Logger.info("Click on New Lead Router is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on New Lead Router is Failed",e);
			sa.assertAll();
		}

		Logger.info("//===============================CREATE OBJECT SCENARIO START========================================!");
		Thread.sleep(2500);
		try {
			LMP.NameInCrudObject();
			Logger.info("Enter Object name is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Object name is FAILED!!!",e);
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
			Logger.info("Duplicate Object Found, Try to delete the Object NOW!!! then Creating New Object!!");
			Thread.sleep(3000);
			try {
				LMP.getLeadRouterDropDown();
				Logger.info("Click on Lead Router Dropdown is passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on Lead Router Dropdown is FAILED!!", e);
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
			Thread.sleep(800);
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
			Thread.sleep(3500);
			Thread.sleep(5500);
			try {
				LMP.RightClickOnLeadRouter();
				Logger.info("Right Click on LeadRouter is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Right Click on LeadRouter is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(4100);
			try {
				LMP.ClickOnNewObject();
				Logger.info("Click on New Lead Router is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on New Lead Router is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(4900);
			try {
				LMP.NameInCrudObject();
				Logger.info("Enter Object Name is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter Object Name is FAILED!!!",e);
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
		Thread.sleep(5600);
		try {
			Thread.sleep(2500);
			if(LR.isDisplayLeadRouterOverview()==true) {
				Logger.info("Displayed LeadRouter Overview page");
				{
					Thread.sleep(2600);
					try {
						LMP.getLeadRouterDropDown();
						Logger.info("Click on Lead Router Dropdown is passed");
					}catch(Exception e) {
						sa.assertTrue(false);
						Logger.error("Click on Lead Router Dropdown is FAILED!!", e);
						sa.assertAll();
					}
					Thread.sleep(2600);
					try {
						LMP.ClickOnAutoTestObject();           
						Logger.info("Click On AutoTestObject is PASSED!!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Click On AutoTestObject is FAILED!", e);
						sa.assertAll();
					}
				}
			}
		} catch (Exception e) {
			sa.assertTrue(true);
		}
		Thread.sleep(4200);
		try {
			LR.ClickOnDNDdiagramDropDown();
			Logger.info("Click On DNDdiagram DropDown is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DNDdiagram DropDown is Failed!!", e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		try {
			LR.ClickOnPannerButton();
			Logger.info("Minimize the Panner is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Minimize the Panner is Failed!!", e);
			sa.assertAll();
		}

		Logger.info("*************************************** Decision Block DND ****************************************");
		Thread.sleep(4500);
		try {
			LR.DND_decisionBlock();
			Logger.info("Drag And Drop Decision block is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);	
			Logger.error("Drag And Drop Decision block is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(4800);
		try {
			LR.ConnectStartBlock_To_DecisionBlock();
			Logger.info("Connect StartBlock To DecisionBlock is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Connect StartBlock To DecisionBlock is Failed!!", e);
			sa.assertAll();
		}
		Logger.info("***************************************Assignment Block DND****************************************");
		Thread.sleep(4200);
		try {
			LR.AssignmentBlock1_DND();
			Logger.info("Drag And Drop AssignmentBlock1 is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag And Drop AssignmentBlock1 is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			LR.ConnectDecisionBlock_To_assignmentBlock1();
			Logger.info("Connect Decision Block To assignmentBlock1 is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Connect Decision Block To assignmentBlock1 is Failed!!!!", e);
			sa.assertAll();
		}
		Logger.info("***************************************Decision block Operation***************************************");
		Thread.sleep(3500);
		try {
			LR.DoubleClickOnDecisionBlock();
			Logger.info("Double Click On DecisionBlock is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Double Click On DecisionBlock is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.SelectDecisionBlockListElem();
			Logger.info("Click On Data dictionary option is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Data dictionary option is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickOnAddButton();
			Logger.info("Click On AddButton is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On AddButton is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickOnSaveButtonForDecisionBlock();
			Logger.info("Click On Save Button For DecisionBlock is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button For DecisionBlock is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (LR.VerifiedDecisionBlockBorderColor()==true) {
				Logger.info(LR.VerifiedDecisionBlockBorderColor());
				Logger.info("Decision Block Border Color is Verified and Passed");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Decision Block Border Color is Verified and Failed !!",e);
			sa.assertAll();
		}
		Logger.info("*********************************************Assignment block1 Operation********************************************");	
		Thread.sleep(3000);
		try {
			LR.DoubleClickOnAssignmentBlock();
			Logger.info("Double Click On Assignment Block is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Double Click On Assignment Block is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			LR.ClickOnDropDownAssignmentBlock();
			Logger.info("Click On DropDown AssignmentBlock is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DropDown AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			LR.SelectWeightedSalesTeam();
			Logger.info("Select WeightedSalesTeam In AssignmentBlock is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select WeightedSalesTeam In AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			LR.ClickOnDropDown2AssignmentBlock();
			Logger.info("Click On DropDown2 AssignmentBlock is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DropDown2 AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			LPWR.SelectCreateTaskForTheNewSuggestedOwnerOption();
			Logger.info("Select Option from the dropdown is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Option from the dropdown is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickCappingConditionCheckBox();
			Logger.info("Click CappingCondition CheckBox is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click CappingCondition CheckBox is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickCappingConditionDropDown();
			Logger.info("Click CappingCondition DropDown is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click CappingCondition DropDown is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickOnAutoTestObject();
			Logger.info("Select AutoTestObject is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select AutoTestObject is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.InputforCappingConditionBox();
			Logger.info("Input for CappingCondition Box is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Input for CappingCondition Box is Failed !!",e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		try {
			LR.ClickedOnSaveButtonForAssignmentBlock();
			Logger.info("Click On Save Button For AssignmentBlock is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button For AssignmentBlock is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (LR.VerifiedAssignmentBlockBorderColor()==true) {
				Logger.info(LR.VerifiedAssignmentBlockBorderColor());
				Logger.info("AssignmentBlock Border Colour is Verified and Passed!!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("AssignmentBlock Border Colour is Verified and Failed !!",e);
			sa.assertAll();
		}

		Logger.info("//==============================  ENTERING DETAILS PAGE ==============================");			
		Thread.sleep(3600);
		try {
			rrp.ClickOnDetail();
			Logger.info("Enter Details Page is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Details Page is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			detrrt.ClickOnDefaultLeadOwnerDropDown();
			Logger.info("Click On DefaultLeadOwner DropDown is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DefaultLeadOwner DropDown is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			detrrt.ClickOnDefaultLeadOwnerSelectAllaLebedevaOption();
			Logger.info("Select Option is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Option is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			detrrt.ClickOnCheckBox();
			Logger.info("Click On ClickOnCheckBox is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On ClickOnCheckBox is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(1300);
		try {
			detrrt.DisplaySuccessForLeadRouter();
			Logger.info("Display Success is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Success is Failed!!", e);
			sa.assertAll();
		}

		Logger.info("//===============================================APPROVE SCENARIO START========================================//");
		Thread.sleep(6200);
		try {
			LMP.ContextClickOnAutoTestObject();           
			Logger.info("Right Click On AutoTestObject is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On AutoTestObject is FAILED!!", e);
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
			rrp.ClickOnApproveSubmit();
			Logger.info("Click again Approve Button is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click again Approve Button is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(4000);
		try {
			rrp.DisplayApproved();
			Logger.info("Displayed Success Message is PASSED!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Success Message is FAILED!!",e);
			sa.assertAll();
		}

		Logger.info("======================================= Go back To Main Object ==================================");
		Thread.sleep(3000);
		try {
			LMP.ClickOnCapping_levellingDropDown();
			Logger.info("Click On Capping_levelling DropDown is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Capping_levelling DropDown is FAILED!", e);
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
				Logger.info("Left menu title is same before and after clicking UsedBy object name is Passed");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.info(TextFromLeftMenuTitleBefore);
			Logger.info(TextFromLeftMenuTitleAfter);
			Logger.error("Left menu tittle is not same before and after clicking UsedBy object name is Failed",e);
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

		Logger.info("//========================================EDIT SCENARIO START======================================//");
		Thread.sleep(4500);  
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
			rrp.ClickOnObjectEdit();
			Logger.info("Click On Edit AutoTestObject is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Edit AutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickonFirstName_IN();
			Thread.sleep(2500);
			LMP.ClickonFirstName_IN();		
			Logger.info("Click on First Name IN is PASSED!!");

		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on First Name IN is FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		LF.ClickOnFirstNameInAddbtn();
		Logger.info("Click on FirstName In Add button is PASSED!!");
		Thread.sleep(2500);
		try {
			rrp.ClickOnAboutMeIntro();
			Logger.info("Click on FirstName Intro is PASSED!!");
		} catch (Exception e) {
			rrp.TextAreaLongitudeAlphabet();
			Logger.info("Enter text in TextArea is PASSED!!");
		}	
		Thread.sleep(2500);
		try {
			rrp.ClickOnAboutMesaveButton();
			Logger.info("Click on Save button in FirstName In PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Save button in FirstName In FAILED!!!", e);
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
			Logger.error("Display Approved  button is FAILED!!", e);
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
			Logger.error("Click on Rename Object is FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.InputOnRenameAutoTestObject();
			Logger.info("Input on Rename AutoTestObject is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Input on Rename AutoTestObject is FAILED!", e);
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
				Thread.sleep(3000);
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
					Thread.sleep(4000);
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
				Logger.info("Display cloned RenamedAutoTestObject is PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display cloned RenamedAutoTestObject is FAILED!", e);
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
		Thread.sleep(4500);
		Thread.sleep(6500);
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
			LMP.RightClickOnCappingLeveling();
			Logger.info("Right Click On CappingLevelingCondition is PASSED!!");
			Thread.sleep(2500);
			LMP.ClickOnNewFolder();
			Logger.info("Click on New CappingLevelingCondition is Passed");
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
				Logger.error("Right Click On RenamedAutoTestObject is  FAILED!", g);
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
			Logger.error("Right Click On RenamedAutoTestObject is  FAILED!", g);
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
