package com.leadAngel.testCases;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.leadAngel.pageObjects.AEtoSDR_Page;
import com.leadAngel.pageObjects.AccountListPage;
import com.leadAngel.pageObjects.AccountMaanagement_PageObjectModel;
import com.leadAngel.pageObjects.AdministrationPageObjectModel;
import com.leadAngel.pageObjects.CRM_Account_FilterPage;
import com.leadAngel.pageObjects.DetailsPage_SalesTeam;
import com.leadAngel.pageObjects.EmailAlertsTemplatesPageObjectModel;
import com.leadAngel.pageObjects.HomePage;
import com.leadAngel.pageObjects.LeadManagementPage;
import com.leadAngel.pageObjects.LeadRouterPageObjectModel;
import com.leadAngel.pageObjects.RoundRobinPage;
import com.leadAngel.pageObjects.WeightedSalesTeamPage;

@Listeners({ com.leadAngel.utilities.TestAllureListener.class })

@Test
public class TC_CrudOperation_AEtoSDR extends BaseClass{
	
	private final static Logger Logger = org.apache.logging.log4j.LogManager.getLogger(TC_CrudOperation_AEtoSDR.class);
	
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
		LeadRouterPageObjectModel LR=new LeadRouterPageObjectModel(driver);
		AdministrationPageObjectModel APOM=new AdministrationPageObjectModel(driver);
		EmailAlertsTemplatesPageObjectModel EATP=new EmailAlertsTemplatesPageObjectModel(driver);

		Thread.sleep(3500);
		try {
			hp.ClickOnLeadManagement();
			Logger.info("Click on Lead Management is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Lead Management is FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickonSalesTeam();
			Logger.info("Click on Sales Team is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Sales Team is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			LMP.RightClickonAE();
			Logger.info("Right Click on AE to SDR is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click on AE To SDR is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickOnNewObject();
			Logger.info("Click on New AE to SDR is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on New AE to SDR is FAILED!!", e);
			sa.assertAll();
		}
		Logger.info("//===============================CREATE OBJECT SCENARIO START========================================!");
		Thread.sleep(2500);
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
		}

		Thread.sleep(800);
		if(ae.DisplaySameAEerror() == true) {
			Logger.info("Duplicate Object Found, Try to delete the Object NOW!!! then Creating New Object!!");
			Thread.sleep(4000);
			try {
				LMP.getAeToSDRDropdown();
				Logger.info("Click on AeToSDR Dropdown is passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on AeToSDR Dropdown is FAILED!!", e);
				sa.assertAll();
			}
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
				LMP.RightClickonAE();
				Logger.info("Right Click on AE to SDR is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Right Click on AE to SDR is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(3500);
			try {
				LMP.ClickOnNewObject();
				Logger.info("Click on New AE to SDR is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on New AE to SDR is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(3500);
			try {
				LMP.NameInCrudObject();
				Logger.info("Enter AutoTesObject Name is PASSED!!");
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
		Thread.sleep(6500);
		try {
			Thread.sleep(2500);
			if( AM.AEtoSDROverView()==true) {
				Logger.info("Display AEtoSDR OverView Page");
				Thread.sleep(3500);
				try {
					AM.AEtoSDRdropDown();
					Logger.info("Click on AEtoSDR dropDown is passed");
				}catch(Exception e) {
					sa.assertTrue(false);
					Logger.error("Click on AEtoSDR dropDown is FAILED!!", e);
					sa.assertAll();
				}
				Thread.sleep(4500);
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
		Thread.sleep(6200);
		try {
			ae.AccountExecutive_DND();
			Logger.info("DND Account Executive_1 is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("DND Account Executive_1 is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			LMP.ClickonInputAE1();
			Thread.sleep(3500);
			LMP.ClickonInputAE1();
			Logger.info("Click Inputbox1 on Account Executive is PASSED! ");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Inputbox1 on Account Executive is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.SelectonAEoption1();
			Logger.info("Select option Account Executive PASSED!!");
		}catch(Exception e) { 
			if (wst.DisplayErrorMessage3()== true) {
				sa.assertTrue(false);
				Logger.info("No Name Found Message Displayed TestCase: FAILED!!!!!!");	
				sa.assertAll();
			}
			else {
				sa.assertTrue(true);
			}			
		}
		Thread.sleep(3000);
		try {
			LMP.ClickonSDR_Mapping1();
			Thread.sleep(3000);
			LMP.ClickonSDR_Mapping1();
			Logger.info("Click Inputbox1 on SDR_Mapping is PASSED!! ");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Inputbox1 on SDR_Mapping is FAILED!!! ",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.SelectonSDRoption1();
			Logger.info("Select option on SDR Mapping is PASSED!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select option on SDR Mapping is FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			ae.AccountExecutive_DND();
			Logger.info("DND Account Executive_2 is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("DND Account Executive_2 is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickonInputAE2();
			Thread.sleep(2500);
			LMP.ClickonInputAE2();
			Logger.info("Click Inputbox2 on Account Executive is PASSED");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Inputbox2 on Account Executive is FAILED!!", e);
			sa.assertAll();
		}		
		Thread.sleep(2500);
		try {
			LMP.SelectonSDRoption1();
			Logger.info("Select option on Account Executive is PASSED!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select option on Account Executive is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickonSDR_Mapping2();
			Thread.sleep(2500);
			LMP.ClickonSDR_Mapping2();
			Logger.info("Click Input on SDR_Mapping is PASSED! ");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Input on SDR_Mapping is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.SelectonSDRoption2();
			Logger.info("Select option on SDR_Mapping is PASSED!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select option on SDR_Mapping is FAILED!", e);
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
		Thread.sleep(2500);
		try {
			LMP.ClickOnApproveBtn();
			Logger.info("Click On Approve AutoTestObject is Passed!!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Approve AutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			ae.ClickOnApproveSubmit();
			Logger.info("Click again Approve button is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click again Approve button is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			ae.DisplayApproved();
			Logger.info("Display Approved Button is PASSED!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Approved Button is FAILED!!", e);
			sa.assertAll();
		}


		Logger.info("//=========================ENTERING DETAILS PAGE===========================");
		Thread.sleep(3500);
		try {
			dp.ClickOndetailsbutton();
			Logger.info("Click On Detail button is PASSED!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Detail button is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			ae.ClickOnEditbtn();
			Logger.info("Click On Edit Button On DetailsPage is PASSED!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Edit Button On DetailsPage is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		ae.ClickOnInputDesc();
		Logger.info("Enter Description is passed");
		Thread.sleep(2500);
		ae.ClickOnSaveBtn();
		Logger.info("Click On Save Button is passed");

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

		Logger.info("//*********************************************** Make Use of this Object In Slack(Administration) *******************************************");
		Thread.sleep(3000);
		try {
			LR.ClikOnLeftTreeMenuDropDown();
			Logger.info("Clik On Left Tree Menu DropDown is PASSED!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Clik On Left Tree Menu DropDown is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClikOnAdministration();
			Logger.info("Click on Administration is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Administration is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickNotificationsDropDown();
			Logger.info("Click on Notifications DropDown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Notifications DropDown is Failed",e);
			sa.assertAll();
		}
		Logger.info("//===================CREATE OBJECT SCENARIO START=================!");
		Thread.sleep(3500);
		try {
			LR.RightClickonSlack();
			Logger.info("Right click on Slack is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right click on Slack is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickOnNewSlack();
			Logger.info("Click on NewSlack is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on NewSlack is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.EnterNameInCrudObject();
			Logger.info("Enter Object Name is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Object Name is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.SelectRouterTypeOption();
			Logger.info("Select Router Type Option is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Router Type Option is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnSaveButtonCrudObject();
			Logger.info("Click On Save Button is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button is FAILED!!!",e);
			sa.assertAll();
		}

		Thread.sleep(400);
		if(ae.DisplaySameAEerror() == true) {
			Logger.info("Duplicate Object Found");
			Thread.sleep(3000);
			try {
				LR.RightClickOnAutoTestObjectSlack();           
				Logger.info("Right Click On AutoTestObject is PASSED!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Right Click On AutoTestObject is Failed!!", e);
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
			Thread.sleep(2500);
			try {
				LMP.ClickOnDeletebtn();
				Logger.info("Click On Delete button is Passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Delete button is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(400);
			try {
				if (LR.DisplayedCannotDeleteErrorSuccessMessage() == true) 
				{
					Logger.info("Displayed 'Cannot Delete' Error Message");
					Thread.sleep(4000);
					try {
						LR.RightClickOnAutoTestObjectSlack();           
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
						Logger.info("Clicked Rename Button is PASSED!!!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Clicked Rename Button is FAILED!!!", e);
						sa.assertAll();
					}	
				}
			} catch (Exception e) {
				sa.assertTrue(true);
			}
			Thread.sleep(4500);
			try {
				LR.RightClickonSlack();
				Logger.info("Right click on Slack is PASSED!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Right click on Slack is Failed!!", e);
				sa.assertAll();
			}
			Thread.sleep(3100);
			try {
				LR.ClickOnNewSlack();
				Logger.info("Click on NewSlack is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on NewSlack is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(3100);
			try {
				APOM.EnterNameInCrudObject();
				Logger.info("Enter Name In Crud Object is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter Name In Crud Object is FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(2800);
			try {
				APOM.SelectRouterTypeOption();
				Logger.info("Select Router Type Option is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Select Router Type Option is FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnSaveButtonCrudObject();
				Logger.info("Click On Save Button Crud Object is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Save Button Crud Object is FAILED!!!",e);
				sa.assertAll();
			}
		}
		else {
			sa.assertTrue(true);
		}
		Thread.sleep(6500);
		try {
			LR.ClickOnCheckBoxFor_Recipient_TO_LeadOwnerMappedSDR();
			Logger.info("Click On CheckBox For_Recipient_TO_LeadOwnerMappedSDR is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CheckBox For_Recipient_TO_LeadOwnerMappedSDR is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickSelectDropDownFor_Recipient_TO_LeadOwnerMappedSDRforSlack();
			Logger.info("Click on DropDown For_Recipient_TO_LeadOwnerMappedSDRforSlack is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on DropDown For_Recipient_TO_LeadOwnerMappedSDRforSlack is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.SelectAutoTestObjectFor_Recipient_TO_LeadOwnerMappedSDRforSlack();
			Logger.info("Select AutoTestObject For_Recipient_TO_LeadOwnerMappedSDR is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select AutoTestObject For_Recipient_TO_LeadOwnerMappedSDR is FAILED!!!",e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		try {
			LR.EnterEmailBody();
			Logger.info("Enter Message Body is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Message Body is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			EATP.SaveButtonForEmailAlertTemplate();
			Logger.info("Click on Save Button For slack is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Save Button For slack is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(300);
		try {
			if (LR.SavingVerificationMessageForSlack()==true) {
				Logger.info("Displayed Save Verification Message is PASSED!!");
			}	
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Save Verification Message is FAILED!!!",e);
			sa.assertAll();
		}

		Logger.info("======================================= Go back To AEtoSDR Object ==================================");
		Thread.sleep(3500);
		try {
			LR.ClikOnLeftTreeMenuDropDown();
			Logger.info("Clik On Left Tree Menu DropDown is PASSED!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Clik On Left Tree Menu DropDown is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(4000);
		try {
			LR.ClikOnLeadManagement();
			Logger.info("Clik On LeadManagement is PASSED!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Clik On LeadManagement is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			LMP.ClickonSalesTeam();
			Logger.info("Click on Sales Team is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on SalesTeam is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			AM.AEtoSDRdropDown();
			Logger.info("Click on AEtoSDR dropDown is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on AEtoSDR dropDown is FAILED!!", e);
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
			Logger.info("Click Again Delete Button	is Passed");
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
			if (TextFromLeftMenuTitleBefore!=TextFromLeftMenuTitleAfter) {
				Logger.info(TextFromLeftMenuTitleBefore);
				Logger.info(TextFromLeftMenuTitleAfter);
				Logger.info("Left menu titlt is not same before and after clicking UsedBy object name is Passed");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.info(TextFromLeftMenuTitleBefore);
			Logger.info(TextFromLeftMenuTitleAfter);
			Logger.error("Left menu titlt is same before and after clicking UsedBy object name is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(6500);
		try {
			LR.ClickOnDetailPage();
			Logger.info("Click On Detail Page is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Detail Page is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			TextFromDetails = driver.findElement(By.xpath("//div[contains(text(),'ID')]//..//span[text()]")).getText();
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

		Logger.info("//=========================================== Go Back to Main Object ===================================");
		Thread.sleep(4000);
		try {
			LR.ClikOnLeftTreeMenuDropDown();
			Logger.info("Clik On Left Tree Menu DropDown is PASSED!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Clik On Left Tree Menu DropDown is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClikOnLeadManagement();
			Logger.info("Clik On LeadManagement is PASSED!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Clik On LeadManagement is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			LMP.ClickonSalesTeam();
			Logger.info("Click on Sales Team is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on SalesTeam is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			AM.AEtoSDRdropDown();
			Logger.info("Click on AEtoSDR dropDown is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on AEtoSDR dropDown is FAILED!!", e);
			sa.assertAll();
		}

		Thread.sleep(3000);
		try {
			LMP.ClickOnAutoTestObject();           
			Logger.info("Click On AutoTestObject is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On AutoTestObject is FAILED!", e);
			sa.assertAll();
		}

		Logger.info("//===========================================EDIT SCENARIO START===================================");
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
			LMP.ClickOnEditAutoTestObject();
			Logger.info("Click On Edit AutoTestObject is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Edit AutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		driver.navigate().refresh();
		Logger.info("Refreshing The Page!!");
		Thread.sleep(5500);
		Thread.sleep(2500);
		try {
			ae.AccountExecutive_DND();
			Logger.info("Drag and Drop Account Executive is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag and Drop Account Executive is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2600);
		try {
			LMP.ClickonInputAE3();
			Thread.sleep(2500);
			LMP.ClickonInputAE3();
			Logger.info("Click Inputbox3 on Account Executive is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Inputbox3 on Account Executive is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.SelectonSDRoption2();
			Logger.info("select Account Executive option is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("select Account Executive option is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickonSDR_Mapping3();
			Thread.sleep(2500);
			LMP.ClickonSDR_Mapping3();
			Logger.info("Click Input on SDR_Mapping is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Input on SDR_Mapping is FAILED!! ", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.SelectonSDRoption3();
			Logger.info("Select option on SDR_Mapping is PASSED!");
		}  catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select option on SDR_Mapping is FAILED!!!", e);
			sa.assertAll();
		}

		Logger.info("===========================================Approve After Edit===================================");	
		Thread.sleep(2500);
		ae.ClickOnApprove();
		Logger.info("Click on Approve Button After EDIT is passed");
		Thread.sleep(2500);
		ae.ClickOnApproveSubmit();
		Logger.info("Click Again Approve button is passed");
		Thread.sleep(3700);
		try {
			ae.DisplayApproved();
			Logger.info("Display Approved is PASSED!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Approved is FAILED!!", e);
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
							Logger.info("RightClick On RenameAutoTestObject is PASSED!!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("RightClick On RenameAutoTestObject is Failed!!", e);
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
							Logger.info("Clicked Rename Button is PASSED!!!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Clicked Rename Button is FAILED!!!", e);
							sa.assertAll();
						}	
					}
				} catch (Exception e) {
					sa.assertTrue(true);
				}

			} else 
			{
				Thread.sleep(2500);
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
							Logger.info("Clicked on Rename Object is PASSED!!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Clicked on Rename Object is FAILED!!!", e);
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
							Logger.error("Enter Rename is is FAILED!", e);
							sa.assertAll();
						}
						Thread.sleep(2500);
						try {
							rrp.ClickOnRenameBtn();
							Logger.info("Clicked Rename Button is PASSED!!!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Clicked Rename Button is FAILED!!!", e);
							sa.assertAll();
						}	
					}
				} catch (Exception e) {
					sa.assertTrue(true);
				}
			}
			Thread.sleep(6200);		
			Thread.sleep(4000);
			try {
				LMP.ContextClickOnAutoTestObject();
				Logger.info("Right Click On AutoTestObject is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Right Click On AutoTestObject is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(6100);
			try {
				LMP.ClickOnRenameAutoTestObject();
				Logger.info("Click On Rename is Passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Rename is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(6000);
			try {
				LMP.InputOnRenameAutoTestObject();
				Logger.info("Input on Rename is passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Input on Rename is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(4200);
			try {
				LMP.ClickOnRenameBtn();
				Logger.info("Click on Rename Button is Passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on Rename Button is FAILED!", e);
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
		Thread.sleep(6500);
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
			LMP.RightClickonAE();
			Logger.info("Right Click on AE to SDR is Passed");
			Thread.sleep(2500);
			LMP.ClickOnNewFolder();
			Logger.info("Click on New AE to SDR is Passed");
			Thread.sleep(2500);
			LR.NameInObject();
			Logger.info("Enter Folder Name is Passed");
			Thread.sleep(2500);
			LMP.clickOnSaveNewObject();
			Logger.info("Click On Save button is Passed");
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
			Logger.error("Select Main Folder is FAILED!", e);
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
