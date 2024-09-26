package com.leadAngel.testCases;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.leadAngel.pageObjects.AEtoSDR_Page;
import com.leadAngel.pageObjects.CRM_Account_FilterPage;
import com.leadAngel.pageObjects.DetailsPage_SalesTeam;
import com.leadAngel.pageObjects.HomePage;
import com.leadAngel.pageObjects.LeadManagementPage;
import com.leadAngel.pageObjects.LeadRouterPageObjectModel;
import com.leadAngel.pageObjects.LoginPage;
import com.leadAngel.pageObjects.RoundRobinPage;
import io.qameta.allure.Step;
@Listeners({ com.leadAngel.utilities.TestAllureListener.class })
public class TC_CrudOperation_SubRouter extends BaseClass{
	private final static Logger Logger = org.apache.logging.log4j.LogManager
			.getLogger(TC_CrudOperation_SubRouter.class);	
	@Test(description = "LeadManagement_SubRouter _Section")
	@Step("LeadManagement_LeadRouting_SubRouter")
	public void LeadManagementTest() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		LoginPage lp = new LoginPage(driver);
		AEtoSDR_Page ae = new AEtoSDR_Page(driver);
		LeadManagementPage LMP = new LeadManagementPage(driver);
		CRM_Account_FilterPage crm = new CRM_Account_FilterPage(driver);
		RoundRobinPage rrp = new RoundRobinPage(driver); 
		DetailsPage_SalesTeam detrrt = new DetailsPage_SalesTeam(driver);
		HomePage hp = new HomePage(driver);
		LeadRouterPageObjectModel LR=new LeadRouterPageObjectModel(driver);

		Thread.sleep(3500);
		try {
			hp.ClickOnLeadManagement();
			Logger.info("Click on Lead Management is Passed");

		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Lead Management is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(6000);
		try {
			LMP.ClickOnLeadRouting();
			Logger.info("Click on leadRouting is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on leadRouting is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(4900);
		try {
			LMP.RightClickSubRouter();
			Logger.info("Right click on SubRouter is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right click on SubRouter is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickOnNewObject();
			Logger.info("Click on New SubRouter is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on New SubRouter is Failed",e);
			sa.assertAll();
		}
		Logger.info("//===============================CREATE OBJECT SCENARIO START========================================!");
		Thread.sleep(2500);
		try {
			LMP.NameInCrudObject();
			Logger.info("Enter AutoTestName is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.info("Enter AutoTestName is FAILED!!!",e);
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

		Thread.sleep(900);
		if(ae.DisplaySameAEerror() == true) {
			Logger.info("Duplicate Object Found, Try to delete the Object NOW!!! then Creating New Object!!");
			Thread.sleep(3500);
			try {
				LMP.DropDownSubRouter();
				Logger.info("Click on DropDown SubRouter is passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on DropDown SubRouter is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(3000);
			try {
				LMP.ContextClickOnAutoTestObject();           
				Logger.info("RightClick On AutoTestObject PASSED!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("RightClick On AutoTestObject Failed!!", e);
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
			Thread.sleep(400);
			try {
				if (LR.DisplayedCannotDeleteErrorSuccessMessage() == true) 
				{
					Logger.info("Displayed 'Cannot Delete' Error Message");
					Thread.sleep(4000);
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
			Thread.sleep(6500);
			try {
				LMP.RightClickSubRouter();
				Logger.info("Right click on SubRouter is PASSED!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Right click on SubRouter is Failed!!", e);
				sa.assertAll();
			}
			Thread.sleep(4100);
			try {
				LMP.ClickOnNewObject();
				Logger.info("Click on New SubRouter is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on New SubRouter is FAILED!!", e);
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
			if(LMP.DisplaySubRouterOverview()==true) {
				Logger.info("Display SubRouter Overview");
				{
					Thread.sleep(2600);
					try {
						LMP.DropDownSubRouter();
						Logger.info("Click on DropDown SubRouter is passed");
					}catch(Exception e) {
						sa.assertTrue(false);
						Logger.error("Click on DropDown SubRouter is FAILED!!", e);
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


		Logger.info("***************************************Assignment Block 1 DND****************************************");
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

		Logger.info("***************************************DecisionBlock2 DND****************************************");
		Thread.sleep(4500);
		try {
			LR.DND_decisionBlock2();
			Logger.info("Drag And Drop DecisionBlock2 is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag And Drop DecisionBlock2 is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			LR.ConnectDecisionBlock1_To_DecisionBlock2();
			Logger.info("Connect DecisionBlock1 To DecisionBlock2 is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Connect DecisionBlock1 To DecisionBlock2 is Failed!!", e);
			sa.assertAll();
		}
		Logger.info("***************************************Assignment Block 2 DND****************************************");
		Thread.sleep(4500);
		try {
			LR.AssignmentBlock2_DND();
			Logger.info("Drag And Drop AssignmentBlock2 is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag And Drop AssignmentBlock2 is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			LR.ConnectDecisionBlock2_To_assignmentBlock2();
			Logger.info("Connect Decision Block2NO To AssignmentBlock2 is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Connect Decision Block2NO To AssignmentBlock2 is Failed!!", e);
			sa.assertAll();
		}

		Logger.info("***************************************Assignment Block 3 DND****************************************");
		Thread.sleep(4300);
		try {
			LR.AssignmentBlock3_DND();
			Logger.info("Drag And Drop AssignmentBlock3 is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag And Drop AssignmentBlock3 is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(4100);
		try {
			LR.ConnectDecisionBlock2_To_assignmentBlock3();
			Logger.info("Connect Decision Block2YES To AssignmentBlock3 is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Connect Decision Block2YES To AssignmentBlock3 is Failed!!", e);
			sa.assertAll();
		}


		Logger.info("//========================================ENTERING DETAILS PAGE======================================");			
		Thread.sleep(3600);
		rrp.ClickOnDetail();
		Logger.info("Enter Details Page!!!");
		Thread.sleep(3000);
		try {
			detrrt.ClickOnDefaultLeadOwnerDropDown();
			Logger.info("Click On DefaultLeadOwner DropDown is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DefaultLeadOwner DropDown is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(3100);
		try {
			detrrt.ClickOnDefaultLeadOwnerSelectAllaLebedevaOption();
			Logger.info("Click On Default LeadOwner Select AllaLebedeva Option is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Default LeadOwner Select AllaLebedeva Option is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2900);
		try {
			detrrt.ClickOnCheckBox();
			Logger.info("Click On CheckBox is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CheckBox is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(900);
		try {
			detrrt.DisplaySuccessForLeadRouter();
			Logger.info("Display Success is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Success is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(3100);
		try {
			detrrt.DataValueUpdateWhenRoutedToDefaultLeadOwnerAddButton();
			Logger.info("DataValueUpdate WhenRoutedToDefaultLeadOwner AddButton is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("DataValueUpdate WhenRoutedToDefaultLeadOwner AddButton is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			detrrt.DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown1ForLeadRouter();
			Logger.info("DataValueUpdate WhenRoutedToDefaultLeadOwner DropDown1 For LeadRouter is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("DataValueUpdate WhenRoutedToDefaultLeadOwner DropDown1 For LeadRouter is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			detrrt.SelectDataValueUpdateWhenRoutedToDefaultLeadOwnerOption1();
			Logger.info("Select DataValueUpdate WhenRoutedToDefaultLeadOwner Option1 is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select DataValueUpdate WhenRoutedToDefaultLeadOwner Option1 is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			detrrt.DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown2();
			Logger.info("DataValueUpdate WhenRoutedToDefaultLeadOwner DropDown2 is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("DataValueUpdate WhenRoutedToDefaultLeadOwner DropDown2 is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			detrrt.SelectDataValueUpdateWhenRoutedToDefaultLeadOwnerOption2();
			Logger.info("Select DataValueUpdate WhenRoutedToDefaultLeadOwner Option2 is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select DataValueUpdate WhenRoutedToDefaultLeadOwner Option2 is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			detrrt.CheckBoxForDataValueUpdateWhenRoutedToDefaultLeadOwnerForLeadRouter();
			Logger.info("CheckBox For DataValueUpdate WhenRoutedToDefaultLeadOwner For LeadRouter is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("CheckBox For DataValueUpdate WhenRoutedToDefaultLeadOwner For LeadRouter is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(500);
		try {
			detrrt.DisplaySuccessForDataValueUpdateWhenRoutedToDefaultLeadOwner();
			Logger.info("Display Success For DataValueUpdate WhenRoutedToDefault LeadOwner is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Success For DataValueUpdate WhenRoutedToDefault LeadOwner is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);;
		detrrt.ClickOnEditbtn();
		Logger.info("Click On Description Edit button is Passed");
		Thread.sleep(2500);
		detrrt.InputDesc();
		Logger.info("Enter text in TextArea is Passed");
		Thread.sleep(2500);
		detrrt.ClickOnbtnSaveDescForAccList();
		Logger.info("Click On Description Save button is Passed");
		Thread.sleep(3000);
		try {
			LR.ClickOndraftbox();
			Logger.info("Click On draftbox is Passed!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On draftbox is Failed!", e);
			sa.assertAll();
		}



		Logger.info("***************************************Decision block Operation***************************************");
		Thread.sleep(3000);
		try {
			LR.ClickOndraftbox();
			Logger.info("Click On draftbox is Passed!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On draftbox is Failed!", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		Thread.sleep(2000);
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
		Thread.sleep(3950);
		Logger.info("***************************************Decision block2 Operation***************************************");
		Thread.sleep(4100);
		try {
			LR.DoubleClickOnDecisionBlock2();
			Logger.info("Double Click On DecisionBlock is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Double Click On DecisionBlock is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(4600);
		try {
			LR.SelectDecisionBlockListElem();
			Logger.info("Select Decision Block List Element is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Decision Block List Element is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(4300);
		try {
			LR.ClickOnAddButton();
			Logger.info("Click On AddButton is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On AddButton is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(3800);
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
			if (LR.VerifiedDecisionBlock2BorderColor()==true) {
				Logger.info(LR.VerifiedDecisionBlock2BorderColor());
				Logger.info("Decision Block2 Border Color is Verified and Passed");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Decision Block2 Border Color is Verified and Failed !!",e);
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
		Thread.sleep(4200);
		try {
			LR.ClickOnDropDownAssignmentBlock();
			Logger.info("Click On DropDown AssignmentBlock is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DropDown AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(4200);
		try {
			LR.SelectSalesRepInAssignmentBlock();
			Logger.info("Select SalesRep In AssignmentBlock is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select SalesRep In AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(5200);
		try {
			LR.DropDown2InAssignmentBlockForEscalationRouter();
			Logger.info("Click On DropDown2 AssignmentBlock is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DropDown2 AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(4200);
		try {
			LR.SelectSalesRepValueInAssignmentBlock();
			Logger.info("Select SalesRep Value In AssignmentBlock is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select SalesRep Value In AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickOnCheckBoxForAssignmentBlockAEtoSDR();
			Logger.info("Click On CheckBox For AssignmentBlock is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CheckBox For AssignmentBlock is is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickedOnSelectMappedSDR();
			Logger.info("Click On MappedSDR is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On MappedSDR is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);

		try {
			LR.ClickedOnSelectMappedSDROption();
			Logger.info("Click On MappedSDR Option is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On MappedSDR Option is Failed !!",e);
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
		Thread.sleep(3000);
		Logger.info("*********************************************Assignment block2 Operation****************************************************");	
		Thread.sleep(4100);
		try {
			LR.DoubleClickOnAssignmentBlock2();
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
		Thread.sleep(3100);
		try {
			LR.SelectSalesRepInAssignmentBlock();
			Logger.info("Select SalesRep In AssignmentBlock is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select SalesRep In AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(5200);
		try {
			LR.DropDown2InAssignmentBlockForEscalationRouter();
			Logger.info("Click On DropDown2 AssignmentBlock is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DropDown2 AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			LR.SelectSalesRepValueInAssignmentBlock2();
			Logger.info("Select SalesRep Value In AssignmentBlock is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select SalesRep Value In AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickOnCheckBoxForAssignmentBlockAEtoSDR();
			Logger.info("Click On CheckBox For AssignmentBlock is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CheckBox For AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickedOnSelectMappedSDR();
			Logger.info("Click On MappedSDR is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On MappedSDR is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickedOnSelectMappedSDROption();
			Logger.info("Click On MappedSDR Option is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On MappedSDR Option is Failed !!",e);
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
			if (LR.VerifiedAssignmentBlock2BorderColor()==true) {
				Logger.info(LR.VerifiedAssignmentBlock2BorderColor());
				Logger.info("AssignmentBlock2 Border Colour is Verified and Passed!!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("AssignmentBlock2 Border Colour is Verified and Failed !!",e);
			sa.assertAll();
		}

		Thread.sleep(3500);
		Logger.info("*********************************************Assignment block3 Operation****************************************************");	
		Thread.sleep(4100);
		try {
			LR.DoubleClickOnAssignmentBlock3();
			Logger.info("Double Click On Assignment3 Block is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Double Click On Assignment3 Block is Failed !!",e);
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
		Thread.sleep(3200);
		try {
			LR.SelectSalesRepInAssignmentBlock();
			Logger.info("Select SalesRep In AssignmentBlock is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select SalesRep In AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3200);
		try {
			LR.DropDown2InAssignmentBlockForEscalationRouter();
			Logger.info("Click On DropDown2 AssignmentBlock is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DropDown2 AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3200);
		try {
			LR.SelectSalesRepValueInAssignmentBlock2();
			Logger.info("Select SalesRep Value In AssignmentBlock is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select SalesRep Value In AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3100);
		try {
			LR.ClickOnCheckBoxForAssignmentBlockAEtoSDR();
			Logger.info("Click On CheckBox For AssignmentBlock is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CheckBox For AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3100);
		try {
			LR.ClickedOnSelectMappedSDR();
			Logger.info("Click On MappedSDR is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On MappedSDR is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3100);
		try {
			LR.ClickedOnSelectMappedSDROption();
			Logger.info("Click On MappedSDR Option is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On MappedSDR Option is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3100);
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
			if (LR.VerifiedAssignmentBlock3BorderColor()==true) {
				Logger.info(LR.VerifiedAssignmentBlock3BorderColor());
				Logger.info("AssignmentBlock3 Border Color is Verified and Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("AssignmentBlock3 Border Color is Verified and Failed !!",e);
			sa.assertAll();
		}


		Logger.info("//===============================================APPROVE SCENARIO START========================================//");
		Thread.sleep(4500);
		Thread.sleep(3000);
		try {
			LMP.ContextClickOnAutoTestObject();           
			Logger.info("Right Click On AutoTestObject PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On AutoTestObject FAILED!!", e);
			sa.assertAll();
		} 
		Thread.sleep(3100);
		try {
			rrp.ClickOnApproveObject();
			Logger.info("Click on Approve Button PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Approve Button FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			rrp.ApproveSubmitbtnForLeadRouter();
			Logger.info("Click again Approve button is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click again Approve button is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			rrp.DisplayApproved();
			Logger.info("Displayed Approved button is PASSED!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Approved button is FAILED!!", e);
			sa.assertAll();
		}

		Logger.info("//=================================================EDIT SCENARIO START=======================================//");
		Thread.sleep(4500);
		Thread.sleep(4500);
		try {
			LMP.ContextClickOnAutoTestObject();      
			Logger.info("Right Click On AutoTestObject is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On AutoTestObject is FAILED!!", e);
			sa.assertAll();
		}	
		Thread.sleep(5500);
		try {
			rrp.ClickOnObjectEdit();
			Logger.info("Click on Edit Button is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Edit Button is FAILED!", e);
			sa.assertAll();
		}

		Logger.info("***************************************Edit Decision block2 Operation***************************************");
		Thread.sleep(5000);
		try {
			LR.DoubleClickOnDecisionBlock2();
			Logger.info("Double Click On DecisionBlock2 is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Double Click On DecisionBlock2 is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			LR.SelectEditDecisionBlockListElem();
			Logger.info("Select Edit DecisionBlock List Element is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Edit DecisionBlock List Element is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(3600);
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
			if (LR.VerifiedDecisionBlock2BorderColor()==true) {
				Logger.info(LR.VerifiedDecisionBlock2BorderColor());
				Logger.info("Decision Block2 Border Color is Verified and Passed");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Decision Block2 Border Color is Verified and Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		Logger.info("*********************************************EditAssignment block1 Operation********************************************");	
		Thread.sleep(4300);
		try {
			LR.DoubleClickOnAssignmentBlock2();
			Logger.info("Double Click On Assignment Block is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Double Click On Assignment Block is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3900);
		try {
			LR.ClickOnDropDownAssignmentBlock();
			Logger.info("Click On DropDown AssignmentBlock is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DropDown AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3100);
		try {
			LR.EditSelectSalesRepInAssignmentBlock();
			Logger.info("Select SalesRep In AssignmentBlock is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select SalesRep In AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3900);
		try {
			LR.DropDown2InAssignmentBlockForEscalationRouter();
			Logger.info("Click On DropDown2 AssignmentBlock is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DropDown2 AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			LR.EditSelectSalesRepValueInAssignmentBlock();
			Logger.info("Select SalesRep Value In AssignmentBlock is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select SalesRep Value In AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3600);
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
				Logger.info("AssignmentBlock1 Border Colour is Verified and Passed!!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("AssignmentBlock1 Border Colour is Verified and Failed !!",e);
			sa.assertAll();
		}

		Logger.info("//===============================================APPROVE SCENARIO START========================================//");
		Thread.sleep(4500);
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
			rrp.ApproveSubmitbtnForLeadRouter();
			Logger.info("Click again Approve button is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click again Approve button is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			rrp.DisplayApproved();
			Logger.info("Displayed Approved button is PASSED!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Approved button is FAILED!!", e);
			sa.assertAll();
		}


		Logger.info("//======================================RENAME SCENARIO START=============================================//");
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
			Logger.info("Click Rename Button is  PASSED!!!");
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
			Thread.sleep(4500);
			try {
				LMP.ClickOnRenameAutoTestObject();
				Logger.info("Click On Rename AutoTestObject is Passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Rename AutoTestObject is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(5000);
			try {
				LMP.InputOnRenameAutoTestObject();
				Logger.info("Input on Rename AutoTestObject is passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Input on Rename AutoTestObject is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(4200);
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
		Thread.sleep(5500);
		while (LR.DisplayedAutoTestObjectRenameCopy()==true) {
			Logger.info("Displayed AutoTestObjectRenameCopy Object,So Delete that Object");
			Thread.sleep(4500);
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
			rrp.ApproveSubmitbtnForLeadRouter();
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
			Logger.info("Right Click On ClonedAutoTestObject is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On ClonedAutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			LMP.ClickOnDeleteOnClonedAutoTestObject();
			Logger.info("Click On Delete Button in Clone AutoTestObject is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Button in Cloned AutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(4000);
		try {
			LMP.ClickOnDeletebtn();
			Logger.info("Click On Delete Button in Clone AutoTestObject is Passed!!!");
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
		Thread.sleep(4000);
		Thread.sleep(4000);
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
			LMP.RightClickSubRouter();
			Logger.info("Right click on SubRouter is PASSED!!");
			Thread.sleep(2500);
			LMP.ClickOnNewFolder();
			Logger.info("Click on New SubRouter is Passed");
			Thread.sleep(2500);
			LR.NameInObject();
			Logger.info("Enter Folder Name is Passed");
			Thread.sleep(2500);
			LMP.clickOnSaveNewObject();
			Logger.info("Click On Save is Passed");
			Thread.sleep(5500);
			try {
				LMP.ContextClickOnRenameAutoTestObject();
				Logger.info("Right Click On RenamedAutoTestObject is Passed!!!");
			} catch (Exception g) {
				sa.assertTrue(false);
				Logger.error("Right Click On RenamedAutoTestObject is  FAILED!", g);
				sa.assertAll();
			}
			Thread.sleep(5000);
			try {
				LMP.ClickOnMoveAutoTestObject();
				Logger.info("Click On Move Renamed AutoTestObject is Passed!!!");
			} catch (Exception f) {
				sa.assertTrue(false);
				Logger.error("Click On Move Renamed AutoTestObject is FAILED!", f);
				sa.assertAll();
			}
			Thread.sleep(5000);
			try {
				LR.SelectFolderToAutotestObjectSubRouter();
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
		Thread.sleep(2000);
	}
}
