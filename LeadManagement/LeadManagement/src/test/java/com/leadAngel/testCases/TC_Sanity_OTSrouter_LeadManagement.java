package com.leadAngel.testCases;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.leadAngel.pageObjects.AEtoSDR_Page;
import com.leadAngel.pageObjects.AccountListPage;
import com.leadAngel.pageObjects.CRM_Account_FilterPage;
import com.leadAngel.pageObjects.CRM_Lead_FilterPage;
import com.leadAngel.pageObjects.DetailsPage_SalesTeam;
import com.leadAngel.pageObjects.HomePage;
import com.leadAngel.pageObjects.LeadManagementPage;
import com.leadAngel.pageObjects.LeadProcessingWithoutRouting_FlowChartPage;
import com.leadAngel.pageObjects.LeadRouterPageObjectModel;
import com.leadAngel.pageObjects.LoginPage;
import com.leadAngel.pageObjects.OTS_Router_PageObjectModel;
import com.leadAngel.pageObjects.RoundRobinPage;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
@Listeners({ com.leadAngel.utilities.TestAllureListener.class })
public class TC_Sanity_OTSrouter_LeadManagement extends BaseClass{
	private final static Logger Logger = org.apache.logging.log4j.LogManager
			.getLogger(TC_Sanity_OTSrouter_LeadManagement.class);
	@Test(description = "LeadManagement_LeadRouting_Section")
	@Step("LeadManagement_LeadRouting_OTSrouter")
	@Description("LeadManagement_LeadRouting_OTSrouter")
	public void LeadManagementTest() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		LoginPage lp = new LoginPage(driver);
		LeadManagementPage LMP = new LeadManagementPage(driver);
		CRM_Account_FilterPage crm = new CRM_Account_FilterPage(driver);
		RoundRobinPage rrp = new RoundRobinPage(driver); // Used For Saving... Display
		DetailsPage_SalesTeam detrrt = new DetailsPage_SalesTeam(driver); //Used For Details Page
		AEtoSDR_Page ae = new AEtoSDR_Page(driver);
		HomePage hp = new HomePage(driver);
		CRM_Lead_FilterPage LF = new CRM_Lead_FilterPage(driver);
		AccountListPage ALP = new AccountListPage(driver);
		OTS_Router_PageObjectModel OTS=new OTS_Router_PageObjectModel(driver);
		LeadRouterPageObjectModel LR=new LeadRouterPageObjectModel(driver);
		LeadProcessingWithoutRouting_FlowChartPage LPWR=new LeadProcessingWithoutRouting_FlowChartPage(driver);

		Thread.sleep(3500);
		try {
			hp.ClickOnLeadManagement();
			Logger.info("Click on Lead Management is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Lead Management is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			LMP.ClickOnLeadRouting();
			Logger.info("Click on Lead Routing is passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Lead Routing is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.RightClickOnOTSrouter();
			Logger.info("Right Click on OTSrouter is passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click on OTSrouter is failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickOnNewObject();
			Logger.info("Click on New OTS Router is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on New OTS Router is Failed",e);
			sa.assertAll();
		}
		Logger.info("//===============================CREATE OBJECT SCENARIO START========================================!");
		Thread.sleep(2500);
		try {
			LMP.NameInCrudObject();
			Logger.info("Enter Object name is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Object name is FAILED!!!");
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
			Thread.sleep(3500);
			try {
				OTS.ClickOnOTSrouterDropDownsymbol();
				Logger.info("Click on OTSrouter DropDown is passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on OTSrouter DropDown is FAILED!!", e);
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
			Thread.sleep(4000);
			try {
				LMP.ClickOnDeleteOnClonedAutoTestObject();
				Logger.info("Click On Delete Button is Passed!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Delete Button is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(3200);
			try {
				LMP.ClickOnDeletebtn();
				Logger.info("Click again Delete Button is Passed!!");
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
				OTS.RightClickOnOTSrouter();
				Logger.info("Right Click on OTSrouter is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Right Click on OTSrouter is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(3500);
			try {
				LMP.ClickOnNewObject();
				Logger.info("Click on New OTSrouter is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on New OTSrouter is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(4900);
			try {
				LMP.NameInCrudObject();
				Logger.info("Enter Object name is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter Object name is FAILED!!!",e);
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
		Thread.sleep(5500);
		try {
			Thread.sleep(2500);
			if( OTS.DisplayOTSrouterOverView()==true) {
				Logger.info("Display OTSrouter Overview is passed");
				Thread.sleep(3000);
				try {
					OTS.ClickOnOTSrouterDropDownsymbol();
					Logger.info("Click on OTSrouter DropDown is passed");
				}catch(Exception e) {
					sa.assertTrue(false);
					Logger.error("Click on OTSrouter DropDown is FAILED!!", e);
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
			}
		} catch (Exception e) {
			sa.assertTrue(true);
		}
		Thread.sleep(3000);
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


		Logger.info("*************************************** Decision block DND ****************************************");
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


		Logger.info("*************************************** Action Block DND ****************************************");
		Thread.sleep(4500);
		try {
			LR.DND_ActionBlock();
			Logger.info("Drag And Drop ActionBlock is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag And Drop ActionBlock is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			LR.ConnectDecisionBlock_To_ActionBlock();
			Logger.info("Connect DecisionBlock(No) To Action Block is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Connect DecisionBlock(No) To Action Block is Failed!!", e);
			sa.assertAll();
		}


		Logger.info("*************************************** OTS Assignment Block DND And Random Split DND ****************************************");
		Thread.sleep(4500);
		try {
			LR.DND_OTSAssignment();
			Logger.info("Drag And Drop OTS AssignmentBlock is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag And Drop OTS AssignmentBlock is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			LR.DND_RandomSplit();
			Logger.info("Drag And Drop RandomSplit is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag And Drop RandomSplit is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(4000);
		try {
			LR.ConnectActionBlock_To_RandomSplitBlock();
			Logger.info("Connect ActionBlock To RandomSplitBlock is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Connect ActionBlock To RandomSplitBlock is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(4000);
		try {
			LR.ConnectionRandomSlitB_To_ActionBlock();
			Logger.info("Connect RandomSlitB To ActionBlock is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Connect RandomSlitB To ActionBlock is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(4000);
		try {
			LR.ConnectionRandomSlitA_To_OTSAssignmentBlock();
			Logger.info("Connect RandomSlitA To OTSassignmentBlock is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Connect RandomSlitA To OTSassignmentBlock is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(4000);
		try {
			LR.ConnectionDecisionBlockYES_To_OTSAssignmentBlock();
			Logger.info("Connect DecisionBlock(YES) To OTSAssignmentBlock is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Connect DecisionBlock(YES) To OTSAssignmentBlock is Failed!!!!", e);
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
		Thread.sleep(3500);
		try {
			LPWR.EnterDescriptionActionBlock();
			Logger.info("Enter Description is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Description is Failed !!", e);
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
			LPWR.ClickOnCustomFilter();
			Logger.info("Click On CustomFilter is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CustomFilter is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LPWR.EnterCustomFilter();
			Logger.info("Enter CustomFilter is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter CustomFilter is Failed !!", e);
			sa.assertAll();
		}
		//****************
		String ParentWindow = driver.getWindowHandle();
		Thread.sleep(3500);
		String ObjectNameBeforeClickNewTabLink = driver.findElement(By.xpath("(//a[text()=' open_in_new '])[1]//..//span[text()]")).getText();
		Logger.info("Object Name Before Click NewTab Link: "+ObjectNameBeforeClickNewTabLink);
		Thread.sleep(3500);
		try {
			LR.ClickOnOpenInNewTabLink();
			Logger.info("Click On Open In New Tab Link is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Open In New Tab Link is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(5800);
		Set<String> Allwindow = driver.getWindowHandles();
		Thread.sleep(4000);
		for (String wh : Allwindow) {
			driver.switchTo().window(wh);
			if (wh.equals(ParentWindow)) {
				continue;
			} else {
				Thread.sleep(4000);
				String ObjectNameAfterClickNewTabLink = driver.findElement(By.xpath("(//i[text()='description']//..//span[text()])[2]")).getText();
				Logger.info("Object Name After Click NewTab Link: "+ObjectNameAfterClickNewTabLink);
				Thread.sleep(4000);
				try {
					if (ObjectNameBeforeClickNewTabLink.contentEquals(ObjectNameAfterClickNewTabLink)) {
						Logger.info("Open in New tab link is properly redirected is Passed !!");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Open in New tab link is properly redirected is Failed !!", e);
					sa.assertAll();
				}
				driver.close();	
				break;
			}
		}
		Thread.sleep(2500);
		try {
			driver.switchTo().window(ParentWindow);
			Logger.info("Swicth back to parent window is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Swicth back to parent window is Failed !!", e);
			sa.assertAll();
		}
		//****************
		Thread.sleep(2500);
		try {
			LR.ClickOnSaveButtonForDecisionBlock();
			Logger.info("Click On Save Button is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button is Failed !!", e);
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


		Logger.info("*********************************************ActionBlock Operation********************************************");	
		Thread.sleep(3500);
		try {
			LR.DoubleClickOnActionBlock();
			Logger.info("Double Click On Action Block is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Double Click On Action Block is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			LPWR.EnterDescriptionActionBlock();
			Logger.info("Enter Description is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Description is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.SelectOnWeighBookOptionActionBlock();
			Logger.info("Select Call Webhook Option is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Call Webhook Option is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.SelectListBoxActionBlockOTS();
			Logger.info("Select On Second ListBox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select On Second ListBox is Failed",e);
			sa.assertAll();
		}
		//****************
		Thread.sleep(3500);
		String ObjectNameBeforeClickNewTabLink1 = driver.findElement(By.xpath("(//a[text()=' open_in_new '])[1]//..//span[text()]")).getText();
		Logger.info("Object Name Before Click NewTab Link: "+ObjectNameBeforeClickNewTabLink1);
		Thread.sleep(3500);
		try {
			LR.ClickOnOpenInNewTabLink();
			Logger.info("Click On Open In New Tab Link is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Open In New Tab Link is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(5500);
		Set<String> Allwindow1 = driver.getWindowHandles();
		Thread.sleep(4000);
		for (String wh : Allwindow1) {
			driver.switchTo().window(wh);
			if (wh.equals(ParentWindow)) {
				continue;
			} else {
				Thread.sleep(4000);
				String ObjectNameAfterClickNewTabLink = driver.findElement(By.xpath("(//i[text()='description']//..//span[text()])[2]")).getText();
				Logger.info("Object Name After Click NewTab Link: "+ObjectNameAfterClickNewTabLink);
				Thread.sleep(4000);
				try {
					if (ObjectNameBeforeClickNewTabLink1.contentEquals(ObjectNameAfterClickNewTabLink)) {
						Logger.info("Open in New tab link is properly redirected is Passed !!");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Open in New tab link is properly redirected is Failed !!", e);
					sa.assertAll();
				}
				driver.close();	
				break;
			}
		}
		Thread.sleep(2500);
		try {
			driver.switchTo().window(ParentWindow);
			Logger.info("Swicth back to parent window is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Swicth back to parent window is Failed !!", e);
			sa.assertAll();
		}
		//****************
		Thread.sleep(2500);
		try {
			LR.ClickOnContinueProcessingCheckBoxActionBlockOTS();
			Logger.info("Click On Continue processing Radio button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Continue processing Radio button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.SaveButtonForActionBlockOTS();
			Logger.info("Click On Save Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			if (LR.VerifiedActionBlockBorderColor()==true) {
				Logger.info(LR.VerifiedActionBlockBorderColor());
				Logger.info("Action Block Border Color is Verified and Passed");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Action Block Border Color is Verified and Failed !!",e);
			sa.assertAll();
		}


		Logger.info("*********************************************RandomSplit Operation****************************************************");	
		Thread.sleep(4500);
		try {
			LR.DoubleClickOnRandomSplit();
			Logger.info("Double Click On RandomSplit Block is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Double Click On RandomSplit Block is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			LR.ClickOnDescriptionOfUpdateToCRMBlock();
			Logger.info("Click On Description Of Random Split Block is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Description Of Random Split Block is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.WriteValueInsidePercentageAllocationForA();
			Logger.info("Write Value Inside PercentageAllocation For A is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Write Value Inside PercentageAllocation For A is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.WriteValueInsidePercentageAllocationForB();
			Logger.info("Write Value Inside PercentageAllocation For B is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Write Value Inside PercentageAllocation For B is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.WriteValueInsidePercentageAllocationForC();
			Logger.info("Write Value Inside PercentageAllocation For C is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Write Value Inside PercentageAllocation For C is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickOnSaveButtonForRandomSplit();
			Logger.info("Click On Save Button For RandomSplit is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button For RandomSplit is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (LR.VerifiedRandomSplitBlockBorderColor()==true) {
				Logger.info(LR.VerifiedRandomSplitBlockBorderColor());
				Logger.info("Display Random Split Border Colour is Verified and Passed!!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Random Split Border Colour is Verified and Failed!!",e);
			sa.assertAll();
		}


		Logger.info("********************************************* Assignment block Operation ****************************************************");	

		Logger.info("=========================== Details Page Operation in OTS assignment block ===========================");	
		Thread.sleep(4000);
		try {
			LR.DoubleClickOnOTSAssignmentBlock();
			Logger.info("Double Click On OTS Assignment Block is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Double Click On OTS Assignment Block is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			OTS.ClickOnDetailsButton();
			Logger.info("Click On Details Button is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Details Button is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LPWR.EnterDescriptionActionBlock();
			Logger.info("Enter Description of OTS Assignment block is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Description of OTS Assignment block is Failed !!", e);
			sa.assertAll();
		}

		Logger.info("===========================  Assignment Options Page Operation  ===========================");	
		Thread.sleep(2500);
		try {
			OTS.ClickOnAssignmentOptionsButton();
			Logger.info("Click On Assignment Options button is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Assignment Options button is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.ClickOnSelectAssignmentTypeDropDown();
			Logger.info("Click On Assignment Type DropDown is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Assignment Type DropDown is Failed !!",e);
			sa.assertAll();
		}
		List<WebElement> AllLinksOfAssignmentTypeListBox1 = driver.findElements(By.xpath("//div[@role='listbox']//mat-option//span[text()]"));
		int CountAllLinks =AllLinksOfAssignmentTypeListBox1.size();
		for (int i = 0; i < CountAllLinks; i++) {//countAllLinksof Assignment type

			if(i!=0) {
				Thread.sleep(3000);
				try {
					LR.DoubleClickOnOTSAssignmentBlock();
					Logger.info("Double Click On OTS Assignment Block is Passed !!");	
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Double Click On OTS Assignment Block is Failed !!",e);
					sa.assertAll();
				}
				Thread.sleep(3500);
				try {
					OTS.ClickOnSelectAssignmentTypeDropDown();
					Logger.info("Click On Assignment Type DropDown is Passed !!");	
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Assignment Type DropDown is Failed !!",e);
					sa.assertAll();
				}
			}
			List<WebElement> AllLinksOfAssignmentTypeListBox = driver.findElements(By.xpath("//div[@role='listbox']//mat-option//span[text()]"));
			WebElement getLinkAssignmentTypeListBox = AllLinksOfAssignmentTypeListBox.get(i);
			String getLinkTextAssignmentTypeListBox = getLinkAssignmentTypeListBox.getText();
			Thread.sleep(2000);
			try {
				getLinkAssignmentTypeListBox.click();
				Logger.info("Select "+getLinkTextAssignmentTypeListBox+" is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select "+getLinkTextAssignmentTypeListBox+" is Failed",e);
				sa.assertAll();
			}

			if (getLinkTextAssignmentTypeListBox.contains("Live Claim")==true ||
					getLinkTextAssignmentTypeListBox.contains("Direct Assignment")==true) {//Live claim || Direct assignment
				Thread.sleep(2000);
				try {
					LPWR.ClickPreferHistoricalSalesPersonCheckBox();
					Logger.info("Click Prefer Historical Sales Person CheckBox is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click Prefer Historical Sales Person CheckBox is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(2000);
				try {
					LPWR.ClickAssignOnlyToUsersIfAvailableOnIntegratedCalendarCheckBox();
					Logger.info("Click AssignOnlyToUsersIfAvailableOnIntegratedCalendar CheckBox is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click AssignOnlyToUsersIfAvailableOnIntegratedCalendar CheckBox is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(2600);
				try {
					if (LR.DisplayedAssignOnlyToUsersIfAvailableOnIntegratedCalendarCheckBoxIsChecked()==true) {
						Logger.info("Displayed AssignOnlyToUsersIfAvailableOnIntegratedCalendar CheckBox Is Checked!!");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed AssignOnlyToUsersIfAvailableOnIntegratedCalendar CheckBox Is Not Checked!!", e);
					sa.assertAll();
				}


				Thread.sleep(1500);
				try {
					OTS.ClickOnEmailNotificationCheckBox();
					Logger.info("Click On Email Notification CheckBox is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Email Notification CheckBox is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					OTS.ClickOnEmailNotificationDropDown();
					Logger.info("Click On Email Notification DropDown is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Email Notification DropDown is Failed !!", e);
					sa.assertAll();
				}
				//****************
				Thread.sleep(3000);
				String ObjectNameBeforeClickNewTabLink0 = driver.findElement(By.xpath("(//mat-icon[@fonticon='open_in_new'])[1]//..//..//span[text()]")).getText();
				Logger.info("Object Name Before Click NewTab Link: "+ObjectNameBeforeClickNewTabLink0);
				Thread.sleep(3000);
				try {
					LR.ClickOnOpenInNewTabLinkForAssignmentBlock();
					Logger.info("Click On Open In New Tab Link is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Open In New Tab Link is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(5500);
				Set<String> Allwindow0 = driver.getWindowHandles();
				Thread.sleep(4000);
				for (String wh : Allwindow0) {
					driver.switchTo().window(wh);
					if (wh.equals(ParentWindow)) {
						continue;
					} else {
						Thread.sleep(4000);
						try {
							LR.ClickOnDetailPage();
							Logger.info("Click On Detail Page is Passed !!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Click On Detail Page is Failed !!", e);
							sa.assertAll();
						}
						Thread.sleep(4000);
						String ObjectNameAfterClickNewTabLink = driver.findElement(By.xpath("//div[contains(text(),'ID')]//..//span[text()]")).getText();
						Logger.info("Object Name After Click NewTab Link: "+ObjectNameAfterClickNewTabLink);
						Thread.sleep(4000);
						try {
							if (ObjectNameBeforeClickNewTabLink0.contentEquals(ObjectNameAfterClickNewTabLink)) {
								Logger.info("Open in New tab link is properly redirected is Passed !!");
							}
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Open in New tab link is properly redirected is Failed !!", e);
							sa.assertAll();
						}
						driver.close();	
						break;
					}
				}
				Thread.sleep(2500);
				try {
					driver.switchTo().window(ParentWindow);
					Logger.info("Swicth back to parent window is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Swicth back to parent window is Failed !!", e);
					sa.assertAll();
				}
				//****************
				Thread.sleep(1500);
				try {
					OTS.ClickOnSlackNotificationCheckBox();
					Logger.info("Click On Salck Notification CheckBox is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Slack Notification CheckBox is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					OTS.ClickOnSlackNotificationDropDown();
					Logger.info("Click On Slack Notification DropDown is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Slack Notification DropDown is Failed !!", e);
					sa.assertAll();
				}
				//****************
				Thread.sleep(3000);
				String ObjectNameBeforeClickNewTabLink2 = driver.findElement(By.xpath("(//mat-icon[@fonticon='open_in_new'])[1]//..//..//span[text()]")).getText();
				Logger.info("Object Name Before Click NewTab Link: "+ObjectNameBeforeClickNewTabLink2);
				Thread.sleep(3000);
				try {
					LR.ClickOnOpenInNewTabLinkForAssignmentBlock();
					Logger.info("Click On Open In New Tab Link is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Open In New Tab Link is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(5500);
				Set<String> Allwindow2 = driver.getWindowHandles();
				Thread.sleep(4500);
				for (String wh : Allwindow2) {
					driver.switchTo().window(wh);
					if (wh.equals(ParentWindow)) {
						continue;
					} else {
						Thread.sleep(4500);
						try {
							LR.ClickOnDetailPage();
							Logger.info("Click On Detail Page is Passed !!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Click On Detail Page is Failed !!", e);
							sa.assertAll();
						}
						Thread.sleep(4500);
						String ObjectNameAfterClickNewTabLink = driver.findElement(By.xpath("//div[contains(text(),'ID')]//..//span[text()]")).getText();
						Logger.info("Object Name After Click NewTab Link: "+ObjectNameAfterClickNewTabLink);
						Thread.sleep(4500);
						try {
							if (ObjectNameBeforeClickNewTabLink2.contentEquals(ObjectNameAfterClickNewTabLink)) {
								Logger.info("Open in New tab link is properly redirected is Passed !!");
							}
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Open in New tab link is properly redirected is Failed !!", e);
							sa.assertAll();
						}
						driver.close();	
						break;
					}
				}
				Thread.sleep(2500);
				try {
					driver.switchTo().window(ParentWindow);
					Logger.info("Swicth back to parent window is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Swicth back to parent window is Failed !!", e);
					sa.assertAll();
				}
				//****************
				Thread.sleep(1500);
				try {
					OTS.ClickOnTextNotificationCheckBox();
					Logger.info("Click On Text Notification CheckBox is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Text Notification CheckBox is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					OTS.ClickOnTextNotificationDropDown();
					Logger.info("Click On Text Notification DropDown is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Text Notification DropDown is Failed !!", e);
					sa.assertAll();
				}
				//****************
				Thread.sleep(3000);
				String ObjectNameBeforeClickNewTabLink3 = driver.findElement(By.xpath("(//mat-icon[@fonticon='open_in_new'])[1]//..//..//span[text()]")).getText();
				Logger.info("Object Name Before Click NewTab Link: "+ObjectNameBeforeClickNewTabLink3);
				Thread.sleep(3000);
				try {
					LR.ClickOnOpenInNewTabLinkForAssignmentBlock();
					Logger.info("Click On Open In New Tab Link is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Open In New Tab Link is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(5500);
				Set<String> Allwindow3 = driver.getWindowHandles();
				Thread.sleep(4000);
				for (String wh : Allwindow3) {
					driver.switchTo().window(wh);
					if (wh.equals(ParentWindow)) {
						continue;
					} else {
						Thread.sleep(4000);
						try {
							LR.ClickOnDetailPage();
							Logger.info("Click On Detail Page is Passed !!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Click On Detail Page is Failed !!", e);
							sa.assertAll();
						}
						Thread.sleep(4000);
						String ObjectNameAfterClickNewTabLink = driver.findElement(By.xpath("//div[contains(text(),'ID')]//..//span[text()]")).getText();
						Logger.info("Object Name After Click NewTab Link: "+ObjectNameAfterClickNewTabLink);
						Thread.sleep(2500);
						try {
							if (ObjectNameBeforeClickNewTabLink3.contentEquals(ObjectNameAfterClickNewTabLink)) {
								Logger.info("Open in New tab link is properly redirected is Passed !!");
							}
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Open in New tab link is properly redirected is Failed !!", e);
							sa.assertAll();
						}
						driver.close();	
						break;
					}
				}
				Thread.sleep(2500);
				try {
					driver.switchTo().window(ParentWindow);
					Logger.info("Swicth back to parent window is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Swicth back to parent window is Failed !!", e);
					sa.assertAll();
				}
				//****************
				Thread.sleep(1500);
				try {
					OTS.ClickOnCRMinAppNotificationCheckBox();
					Logger.info("Click On CRMinApp Notification CheckBox is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On CRMinApp Notification CheckBox is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					OTS.ClickOnCRMinAppNotificationDropDown();
					Logger.info("Click On CRMinApp Notification DropDown is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On CRMinApp Notification DropDown is Failed !!", e);
					sa.assertAll();
				}
				//****************
				Thread.sleep(3000);
				String ObjectNameBeforeClickNewTabLink4 = driver.findElement(By.xpath("(//mat-icon[@fonticon='open_in_new'])[1]//..//..//span[text()]")).getText();
				Logger.info("Object Name Before Click NewTab Link: "+ObjectNameBeforeClickNewTabLink4);
				Thread.sleep(3000);
				try {
					LR.ClickOnOpenInNewTabLinkForAssignmentBlock();
					Logger.info("Click On Open In New Tab Link is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Open In New Tab Link is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(5500);
				Set<String> Allwindow4 = driver.getWindowHandles();
				Thread.sleep(4000);
				for (String wh : Allwindow4) {
					driver.switchTo().window(wh);
					if (wh.equals(ParentWindow)) {
						continue;
					} else {

						Thread.sleep(4000);
						String ObjectNameAfterClickNewTabLink = driver.findElement(By.xpath("//li[@class='tab active'][text()]")).getText();
						Logger.info("Object Name After Click NewTab Link: "+ObjectNameAfterClickNewTabLink);
						Thread.sleep(4000);
						try {
							if (ObjectNameAfterClickNewTabLink.contains(ObjectNameBeforeClickNewTabLink4)) {
								Logger.info("Open in New tab link is properly redirected is Passed !!");
							}
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Open in New tab link is properly redirected is Failed !!", e);
							sa.assertAll();
						}
						driver.close();	
						break;
					}
				}
				Thread.sleep(2500);
				try {
					driver.switchTo().window(ParentWindow);
					Logger.info("Swicth back to parent window is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Swicth back to parent window is Failed !!", e);
					sa.assertAll();
				}
				//****************
				if (getLinkTextAssignmentTypeListBox.contains("Direct Assignment")==true) {
					Thread.sleep(2500);
					try {
						LR.ClickOnCreateTaskForTheNewOwnerCheckBox();
						Logger.info("Click On Create Task For The NewOwner CheckBox is Passed !!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Click On Create Task For The NewOwner CheckBox is Failed !!", e);
						sa.assertAll();
					}
					Thread.sleep(1500);
					try {
						LR.SelectCreateTaskForTheNewOwnerDropDownAssignmentSetup();
						Logger.info("Click Create Task For The NewOwner DropDown is Passed !!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Click Create Task For The NewOwner DropDown is Failed !!", e);
						sa.assertAll();
					}
					Thread.sleep(1500);
					try {
						LPWR.SelectSendNotificationEmailOption();
						Logger.info("Select Create Task For The NewOwner Option is Passed !!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Select Create Task For The NewOwner Option is Failed !!", e);
						sa.assertAll();
					}
				}
				Thread.sleep(1500);
				try {
					OTS.ClickOnAssignmentOptionDropDown();
					Logger.info("Click On Assignment Option DropDown is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Assignment Option DropDown is Failed !!", e);
					sa.assertAll();
				}
				List<WebElement> AllLinksOfAssignmentOptionListBox1 = driver.findElements(By.xpath("//div[@role='listbox']//mat-option//span[text()]"));
				int CountAllLinksAssignmentOption =AllLinksOfAssignmentOptionListBox1.size();
				for (int j = 0; j < CountAllLinksAssignmentOption; j++) {//AssignmentOption
					if(j!=0) {
						Thread.sleep(3500);
						try {
							LR.DoubleClickOnOTSAssignmentBlock();
							Logger.info("Double Click On OTS Assignment Block is Passed !!");	
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Double Click On OTS Assignment Block is Failed !!",e);
							sa.assertAll();
						}
						Thread.sleep(4500);
						try {
							OTS.ClickOnAssignmentOptionDropDown();
							Logger.info("Click On Assignment Option DropDown is Passed !!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Click On Assignment Option DropDown is Failed !!", e);
							sa.assertAll();
						}
					}
					List<WebElement> AllLinksOfAssignmentOptionListBox = driver.findElements(By.xpath("//div[@role='listbox']//mat-option//span[text()]"));
					WebElement getLinkAssignmentOptionListBox = AllLinksOfAssignmentOptionListBox.get(j);
					String getLinkTextAssignmentOptionListBox = getLinkAssignmentOptionListBox.getText();
					Thread.sleep(3000);
					try {
						getLinkAssignmentOptionListBox.click();
						Logger.info("Select "+getLinkTextAssignmentOptionListBox+" is Passed");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Select "+getLinkTextAssignmentOptionListBox+" is Failed",e);
						sa.assertAll();
					}

					if (getLinkTextAssignmentOptionListBox.contentEquals("Assign to Account Owner")==true ||
							getLinkTextAssignmentOptionListBox.contentEquals("Assign to Sales Rep")==true ||
							getLinkTextAssignmentOptionListBox.contentEquals("Route to the Owner on Master Record")==true) {

						Thread.sleep(2000);
						try {
							OTS.ClickOnAssignToAEmappedSDRCheckBox();
							Logger.info("Click On AssignToAEmappedSDR CheckBox is Passed !!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Click On AssignToAEmappedSDR CheckBox is Failed !!", e);
							sa.assertAll();
						}
						Thread.sleep(1500);
						try {
							OTS.ClickOnSelectMappedSDRDropDown();
							Logger.info("Click On SelectMappedSDR DropDown is Passed !!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Click On SelectMappedSDR DropDown is Failed !!", e);
							sa.assertAll();
						}
						if (getLinkTextAssignmentOptionListBox.contentEquals("Assign to Account Owner")==true) {
							//****************
							Thread.sleep(3000);
							String ObjectNameBeforeClickNewTabLink7 = driver.findElement(By.xpath("(//mat-icon[@fonticon='open_in_new'])[1]//..//..//span[text()]")).getText();
							Logger.info("Object Name Before Click NewTab Link: " + ObjectNameBeforeClickNewTabLink7);
							Thread.sleep(3000);
							try {
								LR.ClickOnOpenInNewTabLinkForAssignmentBlock();
								Logger.info("Click On Open In New Tab Link is Passed !!");
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.error("Click On Open In New Tab Link is Failed !!", e);
								sa.assertAll();
							}
							Thread.sleep(5500);
							Set<String> Allwindow7 = driver.getWindowHandles();
							Thread.sleep(4000);
							for (String wh : Allwindow7) {
								driver.switchTo().window(wh);
								if (wh.equals(ParentWindow)) {
									continue;
								} else {
									Thread.sleep(4000);
									String ObjectNameAfterClickNewTabLink = driver.findElement(By.xpath("(//i[text()='description']//..//span[text()])[2]")).getText();
									Logger.info("Object Name After Click NewTab Link: " + ObjectNameAfterClickNewTabLink);
									Thread.sleep(4000);
									try {
										if (ObjectNameBeforeClickNewTabLink7.contentEquals(ObjectNameAfterClickNewTabLink)) {
											Logger.info("Open in New tab link is properly redirected is Passed !!");
										}
									} catch (Exception e) {
										sa.assertTrue(false);
										Logger.error("Open in New tab link is properly redirected is Failed !!", e);
										sa.assertAll();
									}
									driver.close();
									break;
								}
							}
							Thread.sleep(2500);
							try {
								driver.switchTo().window(ParentWindow);
								Logger.info("Swicth back to parent window is Passed !!");
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.error("Swicth back to parent window is Failed !!", e);
								sa.assertAll();
							} 
						}
						//****************		
						if (getLinkTextAssignmentOptionListBox.contentEquals("Assign to Sales Rep")==true ||
								getLinkTextAssignmentOptionListBox.contentEquals("Route to the Owner on Master Record")==true) {
							Thread.sleep(1500);
							try {
								LPWR.SelectSendNotificationEmailOption();
								Logger.info("Select Mapped SDR Option is Passed !!");
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.error("Select Mapped SDR Option is Failed !!", e);
								sa.assertAll();
							} 
						}
					}

					if (getLinkTextAssignmentOptionListBox.contains("Assign Based on a Lookup Field in the Parent Account")==true ||
							getLinkTextAssignmentOptionListBox.contains("Assign Based on Account ID Lookup Field in Lead Record")==true) {

						Thread.sleep(1500);
						try {
							OTS.ClickAssignBasedFirstDropDown();
							Logger.info("Click Assign Based Firstbox DropDown is Passed !!");	
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Click Assign Based Firstbox DropDown is Failed !!",e);
							sa.assertAll();
						}
						Thread.sleep(1500);
						try {
							LPWR.SelectSendNotificationEmailOption();
							Logger.info("Select Assign Based Firstbox Option is Passed !!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Select Assign Based Firstbox Option is Failed !!", e);
							sa.assertAll();
						}
						Thread.sleep(1500);
						try {
							OTS.ClickAssignBasedSecondDropDown();
							Logger.info("Click Assign Based Secondbox DropDown is Passed !!");	
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Click Assign Based Secondbox DropDown is Failed !!",e);
							sa.assertAll();
						}
						Thread.sleep(1500);
						try {
							LPWR.SelectSendNotificationEmailOption();
							Logger.info("Select Assign Based Secondbox Option is Passed !!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Select Assign Based Secondbox Option is Failed !!", e);
							sa.assertAll();
						}	
					}
					else if (getLinkTextAssignmentOptionListBox.contains("Assign to Parent Accounts Owner")==true ||
							getLinkTextAssignmentOptionListBox.contains("Assign to Queue")==true ||
							getLinkTextAssignmentOptionListBox.contains("Assign to Sales Rep")==true ||
							getLinkTextAssignmentOptionListBox.contains("Assign to Sales Rep Email Lookup on Lead")==true ||
							getLinkTextAssignmentOptionListBox.contains("Assign to Sales Rep ID Lookup on Lead")==true ||
							getLinkTextAssignmentOptionListBox.contains("Assign to Sales Rep ID Lookup on Matching Account")==true ||
							getLinkTextAssignmentOptionListBox.contains("Assign to Sales Team")==true ||
							getLinkTextAssignmentOptionListBox.contains("Assign to Weighted Sales Team")==true) {


						Thread.sleep(3000);
						try {
							LPWR.SelectDropDownForAssignToQueue();
							Logger.info("Click on main second Select DropDown is Passed");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Click on main second Select DropDown is Failed", e);
							sa.assertAll();
						}
						if (getLinkTextAssignmentOptionListBox.contains("Assign to Sales Team")==true ||
								getLinkTextAssignmentOptionListBox.contains("Assign to Weighted Sales Team")==true) {
							//*****************
							Thread.sleep(3000);
							String ObjectNameBeforeClickNewTabLink7 = driver.findElement(By.xpath("(//mat-icon[@fonticon='open_in_new'])[1]//..//..//span[text()]")).getText();
							Logger.info("Object Name Before Click NewTab Link: " + ObjectNameBeforeClickNewTabLink7);
							Thread.sleep(3000);
							try {
								LR.ClickOnOpenInNewTabLinkForAssignmentBlock();
								Logger.info("Click On Open In New Tab Link is Passed !!");
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.error("Click On Open In New Tab Link is Failed !!", e);
								sa.assertAll();
							}
							Thread.sleep(5800);
							Set<String> Allwindow7 = driver.getWindowHandles();
							Thread.sleep(4000);
							for (String wh : Allwindow7) {
								driver.switchTo().window(wh);
								if (wh.equals(ParentWindow)) {
									continue;
								} else {
									Thread.sleep(4000);
									String ObjectNameAfterClickNewTabLink = driver.findElement(By.xpath("(//i[text()='description']//..//span[text()])[2]")).getText();
									Logger.info("Object Name After Click NewTab Link: " + ObjectNameAfterClickNewTabLink);
									Thread.sleep(4000);
									try {
										if (ObjectNameBeforeClickNewTabLink7.contentEquals(ObjectNameAfterClickNewTabLink)) {
											Logger.info("Open in New tab link is properly redirected is Passed !!");
										}
									} catch (Exception e) {
										sa.assertTrue(false);
										Logger.error("Open in New tab link is properly redirected is Failed !!", e);
										sa.assertAll();
									}
									driver.close();
									break;
								}
							}
							Thread.sleep(2500);
							try {
								driver.switchTo().window(ParentWindow);
								Logger.info("Swicth back to parent window is Passed !!");
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.error("Swicth back to parent window is Failed !!", e);
								sa.assertAll();
							} 
							//*************************
						}

						if (getLinkTextAssignmentOptionListBox.contains("Assign to Parent Accounts Owner")==true ||
								getLinkTextAssignmentOptionListBox.contains("Assign to Queue")==true ||
								getLinkTextAssignmentOptionListBox.contains("Assign to Sales Rep")==true ||
								getLinkTextAssignmentOptionListBox.contains("Assign to Sales Rep Email Lookup on Lead")==true ||
								getLinkTextAssignmentOptionListBox.contains("Assign to Sales Rep ID Lookup on Lead")==true ||
								getLinkTextAssignmentOptionListBox.contains("Assign to Sales Rep ID Lookup on Matching Account")==true) {
							Thread.sleep(2000);
							try {
								LPWR.SlectAssignToSalesRepOption();
								Logger.info("Select Option is Passed !!");
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.error("Select Option is Failed !!", e);
								sa.assertAll();
							} 
						}

						if (getLinkTextAssignmentTypeListBox.contains("Live Claim")==true) {
							if (getLinkTextAssignmentOptionListBox.contains("Assign to Queue") == true) {

								Thread.sleep(2000);
								try {
									OTS.ClickOnSelectSalesTeamTypeDropDown();
									Logger.info("Click On SelectSalesTeamType DropDown is Passed");
								} catch (Exception e) {
									sa.assertTrue(false);
									Logger.error("Click On SelectSalesTeamType DropDown is Failed", e);
									sa.assertAll();
								}
								List<WebElement> AllLinksOfSalesTeamTypeListBox1 = driver
										.findElements(By.xpath("//div[@role='listbox']//mat-option//span[text()]"));
								int CountAllLinksSalesTeamType = AllLinksOfSalesTeamTypeListBox1.size();

								for (int k = 0; k < CountAllLinksSalesTeamType; k++) {
									if (k != 0) {
										Thread.sleep(3500);
										try {
											LR.DoubleClickOnOTSAssignmentBlock();
											Logger.info("Double Click On OTS Assignment Block is Passed !!");
										} catch (Exception e) {
											sa.assertTrue(false);
											Logger.error("Double Click On OTS Assignment Block is Failed !!", e);
											sa.assertAll();
										}
										Thread.sleep(4000);
										try {
											OTS.ClickOnSelectSalesTeamTypeDropDown();
											Logger.info("Click On SelectSalesTeamType DropDown is Passed");
										} catch (Exception e) {
											sa.assertTrue(false);
											Logger.error("Click On SelectSalesTeamType DropDown is Failed", e);
											sa.assertAll();
										}
									}
									List<WebElement> AllLinksOfSalesTeamTypeListBox = driver
											.findElements(By.xpath("//div[@role='listbox']//mat-option//span[text()]"));

									WebElement getLinkSalesTeamTypeListBox = AllLinksOfSalesTeamTypeListBox.get(k);
									String getLinkTextSalesTeamTypeListBox = getLinkSalesTeamTypeListBox.getText();
									Thread.sleep(2500);
									try {
										getLinkSalesTeamTypeListBox.click();
										Logger.info("Select " + getLinkTextSalesTeamTypeListBox + " is Passed");
									} catch (Exception e) {
										sa.assertTrue(false);
										Logger.error("Select " + getLinkTextSalesTeamTypeListBox + " is Failed", e);
										sa.assertAll();
									}

									if (getLinkTextSalesTeamTypeListBox.contains("Round Robin Team") == true
											|| getLinkTextSalesTeamTypeListBox
											.contains("Weighted Sales Team") == true) {

										Thread.sleep(2500);
										try {
											OTS.ClickOnSelectSalesTeamDropDown();
											Logger.info("Click On SelectSalesTeam DropDown is Passed");
										} catch (Exception e) {
											sa.assertTrue(false);
											Logger.error("Click On SelectSalesTeam DropDown is Failed", e);
											sa.assertAll();
										}
										//*****************
										Thread.sleep(3000);
										String ObjectNameBeforeClickNewTabLink7 = driver.findElement(By.xpath("(//mat-icon[@fonticon='open_in_new'])[1]//..//..//span[text()]")).getText();
										Logger.info("Object Name Before Click NewTab Link: "+ObjectNameBeforeClickNewTabLink7);
										Thread.sleep(3000);
										try {
											LR.ClickOnOpenInNewTabLinkForAssignmentBlock();
											Logger.info("Click On Open In New Tab Link is Passed !!");
										} catch (Exception e) {
											sa.assertTrue(false);
											Logger.error("Click On Open In New Tab Link is Failed !!", e);
											sa.assertAll();
										}
										Thread.sleep(6200);
										Set<String> Allwindow7 = driver.getWindowHandles();
										Thread.sleep(4000);
										for (String wh : Allwindow7) {
											driver.switchTo().window(wh);
											if (wh.equals(ParentWindow)) {
												continue;
											} else {
												Thread.sleep(4000);
												String ObjectNameAfterClickNewTabLink = driver.findElement(By.xpath("(//i[text()='description']//..//span[text()])[2]")).getText();
												Logger.info("Object Name After Click NewTab Link: "+ ObjectNameAfterClickNewTabLink);
												Thread.sleep(4000);
												try {
													if (ObjectNameBeforeClickNewTabLink7.contentEquals(ObjectNameAfterClickNewTabLink)) {
														Logger.info("Open in New tab link is properly redirected is Passed !!");
													}
												} catch (Exception e) {
													sa.assertTrue(false);
													Logger.error("Open in New tab link is properly redirected is Failed !!",e);
													sa.assertAll();
												}
												driver.close();
												break;
											}
										}
										Thread.sleep(2500);
										try {
											driver.switchTo().window(ParentWindow);
											Logger.info("Swicth back to parent window is Passed !!");
										} catch (Exception e) {
											sa.assertTrue(false);
											Logger.error("Swicth back to parent window is Failed !!", e);
											sa.assertAll();
										}
										//*************************
									}
									if (getLinkTextSalesTeamTypeListBox.contains("Round Robin Team") == true) {
										Thread.sleep(2000);
										try {
											LR.SaveButtonForOTSAssignmentBlock();
											Logger.info("Click On Save Button For AssignmentBlock is Passed");
										} catch (Exception e) {
											sa.assertTrue(false);
											Logger.error("Click On Save Button For AssignmentBlock is Failed", e);
											sa.assertAll();
										}
										Thread.sleep(1500);
										try {
											if (LR.VerifiedOTSAssignmentBlockBorderColor() == true) {
												Logger.info(LR.VerifiedOTSAssignmentBlockBorderColor());
												Logger.info("AssignmentBlock Border Colour is Verified and Passed!!");
											}
										} catch (Exception e) {
											sa.assertTrue(false);
											Logger.error("AssignmentBlock Border Colour is Verified and Failed!!", e);
											sa.assertAll();
										}
									}
								}
							} 
						}	
					}
					else {
						sa.assertTrue(true);
					}

					Thread.sleep(2000);
					try {
						LR.SaveButtonForOTSAssignmentBlock();
						Logger.info("Click On Save Button For AssignmentBlock is Passed");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Click On Save Button For AssignmentBlock is Failed",e);
						sa.assertAll();
					}
					Thread.sleep(2500);
					try {
						if (LR.VerifiedOTSAssignmentBlockBorderColor()==true) {
							Logger.info(LR.VerifiedOTSAssignmentBlockBorderColor());
							Logger.info("OTS AssignmentBlock Border Colour is Verified and Passed!!");	
						}
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("OTS AssignmentBlock Border Colour is Verified and Failed!!",e);
						sa.assertAll();
					}
				}//AssignmentOption
			}//Live claim || Direct assignment

			if (getLinkTextAssignmentTypeListBox.contains("Broadcast")==true) {//BroadCast

				Thread.sleep(2500);
				try {
					OTS.ClickOnBroadcastToSalesTeamCheckBox();
					Logger.info("Click On BroadcastToSalesTeam CheckBox is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On BroadcastToSalesTeam CheckBox is Failed",e);
					sa.assertAll();
				}
				Thread.sleep(2000);
				try {
					OTS.ClickOnSelectSalesTeamBroadCastDropDown();
					Logger.info("Click On SelectSalesTeam DropDown is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On SelectSalesTeam DropDown is Failed",e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					LPWR.SelectCreateTaskForTheNewSuggestedOwnerOption();
					Logger.info("Select SelectSalesTeam Option is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select SelectSalesTeam Option is Failed",e);
					sa.assertAll();
				}	
				Thread.sleep(1500);
				try {
					OTS.ClickOnEmailCheckBox();
					Logger.info("Click On Email CheckBox is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Email CheckBox is Failed",e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					OTS.ClickOnEmailNotificationDropDown();
					Logger.info("Click On Email DropDown is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Email DropDown is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					LPWR.SelectSendNotificationEmailOption();
					Logger.info("Select Email Option is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select Email Option is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					OTS.ClickOnSlackCheckBox();
					Logger.info("Click On Salck CheckBox is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Slack CheckBox is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					OTS.ClickOnSlackNotificationDropDown();
					Logger.info("Click On Slack DropDown is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Slack DropDown is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					LPWR.SelectSendNotificationEmailOption();
					Logger.info("Select Slack Option is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select Slack Option is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					OTS.ClickOnTextCheckBox();
					Logger.info("Click On Text CheckBox is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Text CheckBox is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					OTS.ClickOnTextNotificationDropDown();
					Logger.info("Click On Text DropDown is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Text DropDown is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					LPWR.SelectSendNotificationEmailOption();
					Logger.info("Select Text Option is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select Text Option is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					OTS.ClickOnInAppCheckBox();
					Logger.info("Click On InApp CheckBox is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On InApp CheckBox is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					OTS.ClickOnCRMinAppNotificationDropDown();
					Logger.info("Click On CRMinApp DropDown is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On CRMinApp DropDown is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					LPWR.SelectSendNotificationEmailOption();
					Logger.info("Select CRMinApp Option is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select CRMinApp Option is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					OTS.ClickOnBroadcastViaEmailCheckBox();
					Logger.info("Click On BroadcastViaEmail CheckBox is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On BroadcastViaEmail CheckBox is Failed",e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					OTS.ClickOnEmailNotificationDropDown();
					Logger.info("Click On BroadcastViaEmail DropDown is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On BroadcastViaEmail DropDown is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					LPWR.SelectSendNotificationEmailOption();
					Logger.info("Select BroadcastViaEmail Option is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select BroadcastViaEmail Option is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					OTS.ClickOnBroadcastViaSlackCheckBox();
					Logger.info("Click On BroadcastViaSlack CheckBox is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On BroadcastViaSlack CheckBox is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					OTS.ClickOnSlackNotificationDropDown();
					Logger.info("Click On BroadcastViaSlack DropDown is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On BroadcastViaSlack DropDown is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					LPWR.SelectSendNotificationEmailOption();
					Logger.info("Select BroadcastViaSlack Option is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select BroadcastViaSlack Option is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					OTS.ClickOnBroadcastViaTextCheckBox();
					Logger.info("Click On BroadcastViaText CheckBox is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On BroadcastViaText CheckBox is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					OTS.ClickOnTextNotificationDropDown();
					Logger.info("Click On BroadcastViaText DropDown is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On BroadcastViaText DropDown is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					LPWR.SelectSendNotificationEmailOption();
					Logger.info("Select BroadcastViaText Option is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select BroadcastViaText Option is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(2000);
				try {
					LR.SaveButtonForOTSAssignmentBlock();
					Logger.info("Click On Save Button For AssignmentBlock is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Save Button For AssignmentBlock is Failed",e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					if (LR.VerifiedOTSAssignmentBlockBorderColor()==true) {
						Logger.info(LR.VerifiedOTSAssignmentBlockBorderColor());
						Logger.info("OTS AssignmentBlock Border Colour is Verified and Passed!!");	
					}

				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("OTS AssignmentBlock Border Colour is Verified and Failed!!",e);
					sa.assertAll();
				}
			}//BroadCast
		}//countAllLinksof Assignment type

		Logger.info("********************************************* ReAssignment Setup Operation ****************************************************");	
		Thread.sleep(4200);
		try {
			LR.DoubleClickOnOTSAssignmentBlock();
			Logger.info("Double Click On OTS Assignment Block is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Double Click On OTS Assignment Block is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			OTS.ClickOnReassignmentSetupButton();
			Logger.info("Click On Reassignment Setup Button is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Reassignment Setup Button is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.ClickOnAddReassignmentSetupButton();
			Logger.info("Click On Add-Reassignment Setup Button is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Add-Reassignment Setup Button is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.EnterReassignmentWaitTime();
			Logger.info("Enter ReassignmentWaitTime is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter ReassignmentWaitTime is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.ClickReassignmentWaitTimeDropDown();
			Logger.info("Click ReassignmentWaitTime DropDown is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click ReassignmentWaitTime DropDown is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.SelectMinutes();
			Logger.info("Select Minutes is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Minutes is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.ClickReassignmentWaitTimeDropDown();
			Logger.info("Click ReassignmentWaitTime DropDown is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click ReassignmentWaitTime DropDown is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.SelectSeconds();
			Logger.info("Select Seconds is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Seconds is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.ClickOnSelectAssignmentTypeDropDown();
			Logger.info("Click On Assignment Type DropDown is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Assignment Type DropDown is Failed !!",e);
			sa.assertAll();
		}
		List<WebElement> AllLinksOfAssignmentType2ListBox1 = driver.findElements(By.xpath("//div[@role='listbox']//mat-option//span[text()]"));
		int CountAllLinks2 =AllLinksOfAssignmentType2ListBox1.size();
		for (int i = 0; i < CountAllLinks2; i++) {//countAllLinksof Assignment type

			if(i!=0) {
				Thread.sleep(3500);
				try {
					LR.DoubleClickOnOTSAssignmentBlock();
					Logger.info("Double Click On OTS Assignment Block is Passed !!");	
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Double Click On OTS Assignment Block is Failed !!",e);
					sa.assertAll();
				}
				Thread.sleep(3500);
				try {
					OTS.ClickOnReassignmentSetupButton();
					Logger.info("Click On Reassignment Setup Button is Passed !!");	
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Reassignment Setup Button is Failed !!",e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					OTS.ClickOnSelectAssignmentTypeDropDown();
					Logger.info("Click On Assignment Type DropDown is Passed !!");	
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Assignment Type DropDown is Failed !!",e);
					sa.assertAll();
				}
			}
			List<WebElement> AllLinksOfAssignmentType2ListBox = driver.findElements(By.xpath("//div[@role='listbox']//mat-option//span[text()]"));
			WebElement getLinkAssignmentTypeListBox = AllLinksOfAssignmentType2ListBox.get(i);
			String getLinkTextAssignmentTypeListBox = getLinkAssignmentTypeListBox.getText();
			Thread.sleep(2500);
			try {
				getLinkAssignmentTypeListBox.click();
				Logger.info("Select "+getLinkTextAssignmentTypeListBox+" is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select "+getLinkTextAssignmentTypeListBox+" is Failed",e);
				sa.assertAll();
			}

			if (getLinkTextAssignmentTypeListBox.contains("Live Claim")==true ||
					getLinkTextAssignmentTypeListBox.contains("Direct Assignment")==true) {//Live claim || Direct assignment

				Thread.sleep(2500);
				try {
					OTS.ClickOnEmailNotificationCheckBox();
					Logger.info("Click On Email Notification CheckBox is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Email Notification CheckBox is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					OTS.ClickSelectEmailTemplateDropDownAssignmentSetup();
					Logger.info("Click SelectEmailTemplate DropDown AssignmentSetup is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click SelectEmailTemplate DropDown AssignmentSetup is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					LPWR.SelectSendNotificationEmailOption();
					Logger.info("Select Email Notification Option AssignmentSetup is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select Email Notification Option AssignmentSetup is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					OTS.ClickOnSlackNotificationCheckBox();
					Logger.info("Click On Salck Notification CheckBox AssignmentSetup is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Slack Notification CheckBox  AssignmentSetup is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					OTS.ClickSelectSlackTemplateDropDownAssignmentSetup();
					Logger.info("Click SelectSlackTemplate DropDown AssignmentSetup is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click SelectSlackTemplate DropDown AssignmentSetup is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					LPWR.SelectSendNotificationEmailOption();
					Logger.info("Select Slack Notification Option AssignmentSetup is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select Slack Notification Option AssignmentSetup is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					OTS.ClickOnTextNotificationCheckBox();
					Logger.info("Click On Text Notification CheckBox AssignmentSetup is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Text Notification CheckBox AssignmentSetup is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					OTS.ClickSelectTextTemplateDropDownAssignmentSetup();
					Logger.info("Click SelectTextTemplate DropDown AssignmentSetup is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click SelectTextTemplate DropDown AssignmentSetup is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					LPWR.SelectSendNotificationEmailOption();
					Logger.info("Select Text Notification Option AssignmentSetup is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select Text Notification Option AssignmentSetup is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					OTS.ClickOnCRMinAppNotificationCheckBox();
					Logger.info("Click On CRMinApp Notification checkbox AssignmentSetup is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On CRMinApp Notification checkbox AssignmentSetup is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					OTS.ClickSelectCRMInAppTemplateDropDownAssignmentSetup();
					Logger.info("Click SelectCRMInAppTemplate DropDown AssignmentSetup is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click SelectCRMInAppTemplate DropDown AssignmentSetup is Failed !!", e);
					sa.assertAll();
				}

				Thread.sleep(1500);
				try {
					LPWR.SelectSendNotificationEmailOption();
					Logger.info("Select CRMinApp Notification Option AssignmentSetup is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select CRMinApp Notification Option AssignmentSetup is Failed !!", e);
					sa.assertAll();
				}

				if(getLinkTextAssignmentTypeListBox.contains("Direct Assignment")==true) {
					Thread.sleep(2000);
					try {
						LR.ClickOnCreateTaskForTheNewOwnerCheckBox();
						Logger.info("Click On Create Task For The NewOwner CheckBox ReAssignmentSetup is Passed !!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Click On Create Task For The NewOwner CheckBox ReAssignmentSetup is Failed !!", e);
						sa.assertAll();
					}
					Thread.sleep(2000);
					try {
						LR.SelectCreateTaskForTheNewOwnerDropDownReAssignmentSetup();
						Logger.info("Click Create Task For The NewOwner DropDown ReAssignmentSetup is Passed !!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Click Create Task For The NewOwner DropDown ReAssignmentSetup is Failed !!", e);
						sa.assertAll();
					}
					//*****************
					Thread.sleep(3000);
					String ObjectNameBeforeClickNewTabLink10 = driver.findElement(By.xpath("(//a[text()=' open_in_new '])[1]//..//span[text()]")).getText();
					Logger.info("Object Name Before Click NewTab Link: " + ObjectNameBeforeClickNewTabLink10);
					Thread.sleep(3000);
					try {
						LR.ClickOnOpenInNewTabLinkForDetailsPage();
						Logger.info("Click On Open In New Tab Link is Passed !!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Click On Open In New Tab Link is Failed !!", e);
						sa.assertAll();
					}
					Thread.sleep(5500);
					Set<String> Allwindow10 = driver.getWindowHandles();
					Thread.sleep(4000);
					for (String wh : Allwindow10) {
						driver.switchTo().window(wh);
						if (wh.equals(ParentWindow)) {
							continue;
						} else {
							Thread.sleep(4000);
							String ObjectNameAfterClickNewTabLink = driver.findElement(By.xpath("(//i[text()='description']//..//span[text()])[2]")).getText();
							Logger.info("Object Name After Click NewTab Link: " + ObjectNameAfterClickNewTabLink);
							Thread.sleep(4000);
							try {
								if (ObjectNameBeforeClickNewTabLink10.contentEquals(ObjectNameAfterClickNewTabLink)) {
									Logger.info("Open in New tab link is properly redirected is Passed !!");
								}
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.error("Open in New tab link is properly redirected is Failed !!", e);
								sa.assertAll();
							}
							driver.close();
							break;
						}
					}
					Thread.sleep(2500);
					try {
						driver.switchTo().window(ParentWindow);
						Logger.info("Swicth back to parent window is Passed !!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Swicth back to parent window is Failed !!", e);
						sa.assertAll();
					} 
					//*************************	
				}
				Thread.sleep(2500);
				try {
					OTS.ClickOnAssignmentOptionForSetUpDropDown();
					Logger.info("Click On Assignment Option DropDown is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Assignment Option DropDown is Failed !!", e);
					sa.assertAll();
				}
				List<WebElement> AllLinksOfAssignmentOptionListBox1 = driver.findElements(By.xpath("//div[@role='listbox']//mat-option//span[text()]"));
				int CountAllLinksAssignmentOption =AllLinksOfAssignmentOptionListBox1.size();
				for (int j = 0; j < CountAllLinksAssignmentOption; j++) {//AssignmentOption
					if(j!=0) {
						Thread.sleep(4000);
						try {
							LR.DoubleClickOnOTSAssignmentBlock();
							Logger.info("Double Click On OTS Assignment Block is Passed !!");	
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Double Click On OTS Assignment Block is Failed !!",e);
							sa.assertAll();
						}
						Thread.sleep(4000);
						try {
							OTS.ClickOnReassignmentSetupButton();
							Logger.info("Click On Reassignment Setup Button is Passed !!");	
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Click On Reassignment Setup Button is Failed !!",e);
							sa.assertAll();
						}
						Thread.sleep(4000);
						try {
							OTS.ClickOnAssignmentOptionForSetUpDropDown();
							Logger.info("Click On Assignment Option DropDown is Passed !!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Click On Assignment Option DropDown is Failed !!", e);
							sa.assertAll();
						}
					}
					List<WebElement> AllLinksOfAssignmentOptionListBox= driver.findElements(By.xpath("//div[@role='listbox']//mat-option//span[text()]"));
					WebElement getLinkAssignmentOptionListBox = AllLinksOfAssignmentOptionListBox.get(j);
					String getLinkTextAssignmentOptionListBox = getLinkAssignmentOptionListBox.getText();
					Thread.sleep(3000);
					try {
						getLinkAssignmentOptionListBox.click();
						Logger.info("Select "+getLinkTextAssignmentOptionListBox+" is Passed");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Select "+getLinkTextAssignmentOptionListBox+" is Failed",e);
						sa.assertAll();
					}

					if (getLinkTextAssignmentOptionListBox.contains("Assign Based on a Lookup Field in the Parent Account")==true ||
							getLinkTextAssignmentOptionListBox.contains("Assign Based on Account ID Lookup Field in Lead Record")==true) {

						Thread.sleep(3000);
						try {
							OTS.ClickSetupAssignBasedFirstDropDown();
							Logger.info("Click Assign Based Firstbox DropDown is Passed !!");	
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Click Assign Based Firstbox DropDown is Failed !!",e);
							sa.assertAll();
						}
						Thread.sleep(2500);
						try {
							LPWR.SelectSendNotificationEmailOption();
							Logger.info("Select Assign Based Firstbox Option is Passed !!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Select Assign Based Firstbox Option is Failed !!", e);
							sa.assertAll();
						}
						Thread.sleep(1500);
						try {
							OTS.ClickSetupAssignBasedSecondDropDown();
							Logger.info("Click Assign Based Secondbox DropDown is Passed !!");	
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Click Assign Based Secondbox DropDown is Failed !!",e);
							sa.assertAll();
						}
						Thread.sleep(1500);
						try {
							LPWR.SelectSendNotificationEmailOption();
							Logger.info("Select Assign Based Secondbox Option is Passed !!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Select Assign Based Secondbox Option is Failed !!", e);
							sa.assertAll();
						}	
					}
					else if (getLinkTextAssignmentOptionListBox.contains("Assign to Parent Accounts Owner")==true ||
							getLinkTextAssignmentOptionListBox.contains("Assign to Queue")==true ||
							getLinkTextAssignmentOptionListBox.contains("Assign to Sales Rep")==true ||
							getLinkTextAssignmentOptionListBox.contains("Assign to Sales Rep Email Lookup on Lead")==true ||
							getLinkTextAssignmentOptionListBox.contains("Assign to Sales Rep ID Lookup on Lead")==true ||
							getLinkTextAssignmentOptionListBox.contains("Assign to Sales Rep ID Lookup on Matching Account")==true ||
							getLinkTextAssignmentOptionListBox.contains("Assign to Sales Team")==true ||
							getLinkTextAssignmentOptionListBox.contains("Assign to Weighted Sales Team")==true) {

						Thread.sleep(2500);
						try {
							OTS.ClickSetupAssignBasedFirstDropDown();
							Logger.info("Click on main second Select DropDown is Passed");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Click on main second Select DropDown is Failed", e);
							sa.assertAll();
						}

						Thread.sleep(2000);
						try {
							LPWR.SlectSetUpAssignToSalesRepOption();
							Logger.info("Select Option is Passed !!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Select Option is Failed !!",e);
							sa.assertAll();
						}
						if (getLinkTextAssignmentTypeListBox.contains("Live Claim")==true) {

							if (getLinkTextAssignmentOptionListBox.contains("Assign to Queue") == true) {

								Thread.sleep(2500);
								try {
									OTS.ClickOnSelectSalesTeamTypeDropDown();
									Logger.info("Click On SelectSalesTeamType DropDown is Passed");
								} catch (Exception e) {
									sa.assertTrue(false);
									Logger.error("Click On SelectSalesTeamType DropDown is Failed", e);
									sa.assertAll();
								}
								List<WebElement> AllLinksOfSalesTeamTypeListBox1 = driver
										.findElements(By.xpath("//div[@role='listbox']//mat-option//span[text()]"));
								int CountAllLinksSalesTeamType = AllLinksOfSalesTeamTypeListBox1.size();

								for (int k = 0; k < CountAllLinksSalesTeamType; k++) {
									if (k != 0) {
										Thread.sleep(4000);
										try {
											LR.DoubleClickOnOTSAssignmentBlock();
											Logger.info("Double Click On OTS Assignment Block is Passed !!");
										} catch (Exception e) {
											sa.assertTrue(false);
											Logger.error("Double Click On OTS Assignment Block is Failed !!", e);
											sa.assertAll();
										}
										Thread.sleep(4000);
										try {
											OTS.ClickOnReassignmentSetupButton();
											Logger.info("Click On Reassignment Setup Button is Passed !!");	
										} catch (Exception e) {
											sa.assertTrue(false);
											Logger.error("Click On Reassignment Setup Button is Failed !!",e);
											sa.assertAll();
										}
										Thread.sleep(3500);
										try {
											OTS.ClickOnSelectSalesTeamTypeDropDown();
											Logger.info("Click On SelectSalesTeamType DropDown is Passed");
										} catch (Exception e) {
											sa.assertTrue(false);
											Logger.error("Click On SelectSalesTeamType DropDown is Failed", e);
											sa.assertAll();
										}
									}
									List<WebElement> AllLinksOfSalesTeamTypeListBox = driver.findElements(By.xpath("//div[@role='listbox']//mat-option//span[text()]"));

									WebElement getLinkSalesTeamTypeListBox = AllLinksOfSalesTeamTypeListBox.get(k);
									String getLinkTextSalesTeamTypeListBox = getLinkSalesTeamTypeListBox.getText();
									Thread.sleep(2500);
									try {
										getLinkSalesTeamTypeListBox.click();
										Logger.info("Select " + getLinkTextSalesTeamTypeListBox + " is Passed");
									} catch (Exception e) {
										sa.assertTrue(false);
										Logger.error("Select " + getLinkTextSalesTeamTypeListBox + " is Failed", e);
										sa.assertAll();
									}

									if (getLinkTextSalesTeamTypeListBox.contains("Round Robin Team") == true|| getLinkTextSalesTeamTypeListBox.contains("Weighted Sales Team") == true) {
										Thread.sleep(2000);
										try {
											OTS.ClickOnSetupSelectSalesTeamDropDown();
											Logger.info("Click On SelectSalesTeam DropDown is Passed");
										} catch (Exception e) {
											sa.assertTrue(false);
											Logger.error("Click On SelectSalesTeam DropDown is Failed", e);
											sa.assertAll();
										}
										//*****************
										Thread.sleep(3000);
										String ObjectNameBeforeClickNewTabLink7 = driver.findElement(By.xpath("(//a[@class='material-icons open-in-new-tab ng-star-inserted'][text()])[1]"))	.getText();
										Logger.info("Object Name Before Click NewTab Link: "+ ObjectNameBeforeClickNewTabLink7);
										Thread.sleep(3000);
										try {
											LR.ClickOnOpenInNewTabLink();
											Logger.info("Click On Open In New Tab Link is Passed !!");
										} catch (Exception e) {
											sa.assertTrue(false);
											Logger.error("Click On Open In New Tab Link is Failed !!", e);
											sa.assertAll();
										}
										Thread.sleep(5800);
										Set<String> Allwindow7 = driver.getWindowHandles();
										Thread.sleep(4000);
										for (String wh : Allwindow7) {
											driver.switchTo().window(wh);
											if (wh.equals(ParentWindow)) {
												continue;
											} else {
												Thread.sleep(4000);
												String ObjectNameAfterClickNewTabLink = driver.findElement(By.xpath("(//i[text()='description']//..//span[text()])[2]")).getText();
												Logger.info("Object Name After Click NewTab Link: "+ ObjectNameAfterClickNewTabLink);
												Thread.sleep(4000);
												try {
													if (ObjectNameBeforeClickNewTabLink7.contentEquals(ObjectNameAfterClickNewTabLink)) {
														Logger.info("Open in New tab link is properly redirected is Passed !!");
													}
												} catch (Exception e) {
													sa.assertTrue(false);
													Logger.error("Open in New tab link is properly redirected is Failed !!",e);
													sa.assertAll();
												}
												driver.close();
												break;
											}
										}
										Thread.sleep(2500);
										try {
											driver.switchTo().window(ParentWindow);
											Logger.info("Swicth back to parent window is Passed !!");
										} catch (Exception e) {
											sa.assertTrue(false);
											Logger.error("Swicth back to parent window is Failed !!", e);
											sa.assertAll();
										}
										//*************************
									}
									if (getLinkTextSalesTeamTypeListBox.contains("Round Robin Team") == true) {
										Thread.sleep(2000);
										try {
											LR.SaveButtonForOTSAssignmentBlock();
											Logger.info("Clicked On Save Button For AssignmentBlock is Passed");
										} catch (Exception e) {
											sa.assertTrue(false);
											Logger.error("Clicked On Save Button For AssignmentBlock is Failed", e);
											sa.assertAll();
										}
										Thread.sleep(2500);
										try {
											if (LR.VerifiedOTSAssignmentBlockBorderColor() == true) {
												Logger.info(LR.VerifiedOTSAssignmentBlockBorderColor());
												Logger.info("OTS AssignmentBlock Border Colour is Verified and Passed!!");
											}
										} catch (Exception e) {
											sa.assertTrue(false);
											Logger.error("OTS AssignmentBlock Border Colour is Verified and Failed!!", e);
											sa.assertAll();
										}
									}
								}
							} 

						}
					}
					Thread.sleep(2000);
					try {
						LR.SaveButtonForOTSAssignmentBlock();
						Logger.info("Click On Save Button For AssignmentBlock is Passed");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Click On Save Button For AssignmentBlock is Failed",e);
						sa.assertAll();
					}
					Thread.sleep(2500);
					try {
						if (LR.VerifiedOTSAssignmentBlockBorderColor()==true) {
							Logger.info(LR.VerifiedOTSAssignmentBlockBorderColor());
							Logger.info("AssignmentBlock Border Colour is Verified and Passed!!");	
						}
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("AssignmentBlock Border Colour is Verified and Failed!!",e);
						sa.assertAll();
					}	
				}//AssignmentOption


			}//Live claim || Direct assignment

			if (getLinkTextAssignmentTypeListBox.contains("Broadcast")==true) {//BroadCast
				Thread.sleep(3000);
				try {
					OTS.ClickOnBroadcastToSalesTeamCheckBox();
					Logger.info("Click On BroadcastToSalesTeam CheckBox is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On BroadcastToSalesTeam CheckBox is Failed",e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					OTS.ClickOnSelectSalesTeamBroadCastDropDown();
					Logger.info("Click On SelectSalesTeam DropDown is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On SelectSalesTeam DropDown is Failed",e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					LPWR.SelectCreateTaskForTheNewSuggestedOwnerOption();
					Logger.info("Select SelectSalesTeam Option is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select SelectSalesTeam Option is Failed",e);
					sa.assertAll();
				}	
				Thread.sleep(1500);
				try {
					OTS.ClickOnEmailCheckBox();
					Logger.info("Click On Email CheckBox is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Email CheckBox is Failed",e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					OTS.ClickOnSetupEmailNotificationDropDown();
					Logger.info("Click On Email DropDown is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Email DropDown is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					LPWR.SelectSendNotificationEmailOption();
					Logger.info("Select Email Option is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select Email Option is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					OTS.ClickOnSlackCheckBox();
					Logger.info("Click On Salck CheckBox is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Slack CheckBox is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					OTS.ClickSetupOnSlackNotificationDropDown();
					Logger.info("Click On Slack DropDown is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Slack DropDown is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					LPWR.SelectSendNotificationEmailOption();
					Logger.info("Select Slack Option is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select Slack Option is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					OTS.ClickOnTextCheckBox();
					Logger.info("Click On Text CheckBox is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Text CheckBox is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					OTS.ClickOnSetupTextNotificationDropDown();
					Logger.info("Click On Text DropDown is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Text DropDown is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					LPWR.SelectSendNotificationEmailOption();
					Logger.info("Select Text Option is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select Text Option is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					OTS.ClickOnInAppCheckBox();
					Logger.info("Click On InApp CheckBox is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On InApp CheckBox is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					OTS.ClickOnSetupCRMinAppNotificationDropDown();
					Logger.info("Click On CRMinApp DropDown is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On CRMinApp DropDown is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					LPWR.SelectSendNotificationEmailOption();
					Logger.info("Select CRMinApp Option is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select CRMinApp Option is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					OTS.ClickOnBroadcastViaEmailCheckBox();
					Logger.info("Click On BroadcastViaEmail CheckBox is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On BroadcastViaEmail CheckBox is Failed",e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					OTS.ClickOnSetupBroadcastViaEmailNotificationDropDown();
					Logger.info("Click On BroadcastViaEmail DropDown is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On BroadcastViaEmail DropDown is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					LPWR.SelectSendNotificationEmailOption();
					Logger.info("Select BroadcastViaEmail Option is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select BroadcastViaEmail Option is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					OTS.ClickOnBroadcastViaSlackCheckBox();
					Logger.info("Click On BroadcastViaSlack CheckBox is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On BroadcastViaSlack CheckBox is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					OTS.ClickOnBroadcastViaSlackNotificationDropDown();
					Logger.info("Click On BroadcastViaSlack DropDown is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On BroadcastViaSlack DropDown is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					LPWR.SelectSendNotificationEmailOption();
					Logger.info("Select BroadcastViaSlack Option is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select BroadcastViaSlack Option is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					OTS.ClickOnBroadcastViaTextCheckBox();
					Logger.info("Click On BroadcastViaText CheckBox is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On BroadcastViaText CheckBox is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					OTS.ClickOnBroadcastViaTextNotificationDropDown();
					Logger.info("Click On BroadcastViaText DropDown is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On BroadcastViaText DropDown is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					LPWR.SelectSendNotificationEmailOption();
					Logger.info("Select BroadcastViaText Option is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select BroadcastViaText Option is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					OTS.CollapseAllForOTSassignment();
					Logger.info("Click on CollapseAllFor OTS assignment is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click on CollapseAllFor OTS assignment is Failed", e);
					sa.assertAll();
				}	
				Thread.sleep(1500);
				try {
					rrp.ExpandAll();
					Logger.info("Click on ExpandAll is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click on ExpandAll is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(2000);
				try {
					LR.SaveButtonForOTSAssignmentBlock();
					Logger.info("Click On Save Button For AssignmentBlock is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Save Button For AssignmentBlock is Failed",e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					if (LR.VerifiedOTSAssignmentBlockBorderColor()==true) {
						Logger.info(LR.VerifiedOTSAssignmentBlockBorderColor());
						Logger.info("OTS AssignmentBlock Border Colour is Verified and Passed!!");	
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("OTS AssignmentBlock Border Colour is Verified and Failed!!",e);
					sa.assertAll();
				}
			}//BroadCast
		}//countAllLinksof Assignment type


		//*********************************************************************************************************************
		Thread.sleep(2500);
		try {
			LPWR.ClickOnMaximizeButton();
			Logger.info("Click On Maximize Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Maximize Button is Failed", e);
			sa.assertAll();
		}	
		Thread.sleep(2500);
		try {
			LR.ClickOnPannerButton();
			Logger.info("Maximize the Panner is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Maximize the Panner is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.MoveBlockInConsole();
			Logger.info("Move Blocks In Console is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Move Blocks In Console is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LPWR.ClickOnManimizeButton();
			Logger.info("Click On Manimize Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Manimize Button is Failed", e);
			sa.assertAll();
		}


		Logger.info("//========================================ENTERING DETAILS PAGE======================================");	
		Thread.sleep(3500);
		try {
			rrp.ClickOnDetail();
			Logger.info("Enter Details Page is passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Details Page is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.DefaultLeadOwnerDropDownforLPWRDropDown();
			Logger.info("Default Lead Owner DropDown is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Default Lead Owner DropDown is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			detrrt.SelectDefaultLeadOwnerLPWROption();
			Logger.info("Select Default Lead Owner Option is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Default Lead Owner Option is Failed!!", e);
			sa.assertAll();
		}
		Logger.info("******************************* Wait Time *****************************");
		Thread.sleep(2500);
		try {
			OTS.ClickOnWaitTimeRadioButtonOTSDetailsPage();
			Logger.info("Click On Wait Time Radio Button OTSDetailsPage is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Wait Time Radio Button OTSDetailsPage is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.EnterWaitTimeOTSDetailsPage();
			Logger.info("Enter Wait Time OTSDetailsPage is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Wait Time OTSDetailsPage is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.ClickOnDropDownForWaitTimeOTSDetailsPage();
			Logger.info("Click On DropDown For WaitTime OTSDetailsPage is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DropDown For WaitTime OTSDetailsPage is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.ClickOnOptionForWaitTimeOTSDetailsPage();
			Logger.info("Click On Option For WaitTime OTSDetailsPage is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Option For WaitTime OTSDetailsPage is Failed!!", e);
			sa.assertAll();
		}
		Logger.info("*********************** Default owner notification setup ************************");
		Thread.sleep(2500);
		try {
			LR.ClickedNotificationTemplateLink();
			Logger.info("Click on NotificationTemplate Link is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on NotificationTemplate Link is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(5500);
		Set<String> Allwindow9 = driver.getWindowHandles();
		Thread.sleep(4000);
		for (String wh : Allwindow9) {
			driver.switchTo().window(wh);
			if (wh.equals(ParentWindow)) {
				continue;
			} else {
				Thread.sleep(4000);
				try {
					if (LR.DisplayedNotificationToggle()==true) {
						Logger.info("Displayed 'NotificationToggle' after redirect to new tab is Passed!!");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed 'NotificationToggle' after redirect to new tab is Failed!!", e);
					sa.assertAll();
				}
				driver.close();	
				break;
			}
		}
		Thread.sleep(2500);
		try {
			driver.switchTo().window(ParentWindow);
			Logger.info("Swicth back to parent window is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Swicth back to parent window is Failed !!", e);
			sa.assertAll();
		}

		Logger.info("*********************** Email notification ************************");
		Thread.sleep(2500);
		try {
			LR.ClickOnEmailNotificationDropdown();
			Logger.info("Click On EmailNotification Dropdown is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On EmailNotification Dropdown is Failed !!", e);
			sa.assertAll();
		}	
		//****************
		Thread.sleep(3000);
		String ObjectNameBeforeClickNewTabLink2 = driver.findElement(By.xpath("(//a[text()=' open_in_new '])[1]//..//span[text()]")).getText();
		Logger.info("Object Name Before Click NewTab Link: "+ObjectNameBeforeClickNewTabLink2);
		Thread.sleep(3000);
		try {
			LR.ClickOnOpenInNewTabLink();
			Logger.info("Click On Open In New Tab Link is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Open In New Tab Link is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(5500);
		Set<String> Allwindow2 = driver.getWindowHandles();
		Thread.sleep(4000);
		for (String wh : Allwindow2) {
			driver.switchTo().window(wh);
			if (wh.equals(ParentWindow)) {
				continue;
			} else {
				Thread.sleep(4000);
				try {
					LR.ClickOnDetailPage();
					Logger.info("Click On Detail Page is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Detail Page is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(4000);
				String ObjectNameAfterClickNewTabLink = driver.findElement(By.xpath("//div[contains(text(),'ID')]//..//span[text()]")).getText();
				Logger.info("Object Name After Click NewTab Link: "+ObjectNameAfterClickNewTabLink);
				Thread.sleep(4000);
				try {
					if (ObjectNameBeforeClickNewTabLink2.contentEquals(ObjectNameAfterClickNewTabLink)) {
						Logger.info("Open in New tab link is properly redirected is Passed !!");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Open in New tab link is properly redirected is Failed !!", e);
					sa.assertAll();
				}
				driver.close();	
				break;
			}
		}
		Thread.sleep(2500);
		try {
			driver.switchTo().window(ParentWindow);
			Logger.info("Swicth back to parent window is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Swicth back to parent window is Failed !!", e);
			sa.assertAll();
		}
		//****************

		Logger.info("*********************** Slack notification ************************");
		Thread.sleep(2500);
		try {
			LR.ClickOnSlackNotificationDropdown();
			Logger.info("Click On SlackNotification Dropdown is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On SlackNotification Dropdown is Failed !!", e);
			sa.assertAll();
		}	
		//****************
		Thread.sleep(3000);
		String ObjectNameBeforeClickNewTabLink3 = driver.findElement(By.xpath("(//a[text()=' open_in_new '])[1]//..//span[text()]")).getText();
		Logger.info("Object Name Before Click NewTab Link: "+ObjectNameBeforeClickNewTabLink3);
		Thread.sleep(3000);
		try {
			LR.ClickOnOpenInNewTabLink();
			Logger.info("Click On Open In New Tab Link is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Open In New Tab Link is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(5500);
		Set<String> Allwindow3 = driver.getWindowHandles();
		Thread.sleep(4000);
		for (String wh : Allwindow3) {
			driver.switchTo().window(wh);
			if (wh.equals(ParentWindow)) {
				continue;
			} else {
				Thread.sleep(4000);
				try {
					LR.ClickOnDetailPage();
					Logger.info("Click On Detail Page is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Detail Page is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(4000);
				String ObjectNameAfterClickNewTabLink = driver.findElement(By.xpath("//div[contains(text(),'ID')]//..//span[text()]")).getText();
				Logger.info("Object Name After Click NewTab Link: "+ObjectNameAfterClickNewTabLink);
				Thread.sleep(4000);
				try {
					if (ObjectNameBeforeClickNewTabLink3.contentEquals(ObjectNameAfterClickNewTabLink)) {
						Logger.info("Open in New tab link is properly redirected is Passed !!");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Open in New tab link is properly redirected is Failed !!", e);
					sa.assertAll();
				}
				driver.close();	
				break;
			}
		}
		Thread.sleep(2500);
		try {
			driver.switchTo().window(ParentWindow);
			Logger.info("Swicth back to parent window is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Swicth back to parent window is Failed !!", e);
			sa.assertAll();
		}
		//****************

		Logger.info("*********************** Text notification ************************");
		Thread.sleep(2500);
		try {
			LR.ClickOnTextNotificationDropdown();
			Logger.info("Click On TextNotification Dropdown is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On TextNotification Dropdown is Failed !!", e);
			sa.assertAll();
		}	
		//****************
		Thread.sleep(3000);
		String ObjectNameBeforeClickNewTabLink4 = driver.findElement(By.xpath("(//a[text()=' open_in_new '])[1]//..//span[text()]")).getText();
		Logger.info("Object Name Before Click NewTab Link: "+ObjectNameBeforeClickNewTabLink4);
		Thread.sleep(3000);
		try {
			LR.ClickOnOpenInNewTabLink();
			Logger.info("Click On Open In New Tab Link is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Open In New Tab Link is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(5000);
		Set<String> Allwindow4 = driver.getWindowHandles();
		Thread.sleep(4000);
		for (String wh : Allwindow4) {
			driver.switchTo().window(wh);
			if (wh.equals(ParentWindow)) {
				continue;
			} else {
				Thread.sleep(4000);
				try {
					LR.ClickOnDetailPage();
					Logger.info("Click On Detail Page is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Detail Page is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(4000);
				String ObjectNameAfterClickNewTabLink = driver.findElement(By.xpath("//div[contains(text(),'ID')]//..//span[text()]")).getText();
				Logger.info("Object Name After Click NewTab Link: "+ObjectNameAfterClickNewTabLink);
				Thread.sleep(4000);
				try {
					if (ObjectNameBeforeClickNewTabLink4.contentEquals(ObjectNameAfterClickNewTabLink)) {
						Logger.info("Open in New tab link is properly redirected is Passed !!");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Open in New tab link is properly redirected is Failed !!", e);
					sa.assertAll();
				}
				driver.close();	
				break;
			}
		}
		Thread.sleep(2500);
		try {
			driver.switchTo().window(ParentWindow);
			Logger.info("Swicth back to parent window is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Swicth back to parent window is Failed !!", e);
			sa.assertAll();
		}
		//****************

		Logger.info("*********************** OTS Initiation Validation ************************");
		Thread.sleep(2500);
		try {
			OTS.ClickOnStartRadioButtonOTSwhenmemberofthisisafilterOTSDetailsPage();
			Logger.info("Click On Radio Button Start OTS when member of this is a filter OTSDetailsPage is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Radio Button Start OTS when member of this is a filter OTSDetailsPage is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.ClickOnDropDownforOTSwhenmemberofthisisafilterOTSDetailsPage();
			Logger.info("Click On DropDown for OTS when member of this is a filter OTSDetailsPage is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DropDown for OTS when member of this is a filter OTSDetailsPage is Failed!!", e);
			sa.assertAll();
		}
		//*****************
		Thread.sleep(3000);
		String ObjectNameBeforeClickNewTabLink7 = driver.findElement(By.xpath("(//a[text()=' open_in_new '])[1]//..//span[text()]")).getText();
		Logger.info("Object Name Before Click NewTab Link: " + ObjectNameBeforeClickNewTabLink7);
		Thread.sleep(3000);
		try {
			LR.ClickOnOpenInNewTabLinkForDetailsPage();
			Logger.info("Click On Open In New Tab Link is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Open In New Tab Link is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(5500);
		Set<String> Allwindow7 = driver.getWindowHandles();
		Thread.sleep(4000);
		for (String wh : Allwindow7) {
			driver.switchTo().window(wh);
			if (wh.equals(ParentWindow)) {
				continue;
			} else {
				Thread.sleep(4000);
				String ObjectNameAfterClickNewTabLink = driver.findElement(By.xpath("(//i[text()='description']//..//span[text()])[2]")).getText();
				Logger.info("Object Name After Click NewTab Link: " + ObjectNameAfterClickNewTabLink);
				Thread.sleep(4000);
				try {
					if (ObjectNameBeforeClickNewTabLink7.contentEquals(ObjectNameAfterClickNewTabLink)) {
						Logger.info("Open in New tab link is properly redirected is Passed !!");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Open in New tab link is properly redirected is Failed !!", e);
					sa.assertAll();
				}
				driver.close();
				break;
			}
		}
		Thread.sleep(2500);
		try {
			driver.switchTo().window(ParentWindow);
			Logger.info("Swicth back to parent window is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Swicth back to parent window is Failed !!", e);
			sa.assertAll();
		} 
		//*************************	

		Thread.sleep(2500);
		try {
			LR.ClickOnCheckboxForReassignmentNotificationInOTSRouter();
			Logger.info("Click On Checkbox For Reassignment Notification is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Checkbox For Reassignment Notification is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (LR.DisplayedReassignmentNotificationCheckBoxIsChecked()==true) {
				Logger.info("Displayed Reassignment Notification CheckBox Is Checked!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Reassignment Notification CheckBox Is Not Checked!!", e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		try {
			LR.ClickedNotificationLink();
			Logger.info("Click Notification Link is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Notification Link is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(5500);
		Set<String> Allwindow10 = driver.getWindowHandles();
		Thread.sleep(4000);
		for (String wh : Allwindow10) {
			driver.switchTo().window(wh);
			if (wh.equals(ParentWindow)) {
				continue;
			} else {
				Thread.sleep(4000);
				try {
					if (LR.DisplayedOTSnotificationsFeature()==true) {
						Logger.info("Displayed 'OTSnotifications' Feature after redirect to new tab is Passed!!");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed 'OTSnotifications' Feature after redirect to new tab is Failed!!", e);
					sa.assertAll();
				}
				driver.close();	
				break;
			}
		}
		Thread.sleep(2500);
		try {
			driver.switchTo().window(ParentWindow);
			Logger.info("Swicth back to parent window is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Swicth back to parent window is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.ClickOnSaveButtonFordetailsPageOTSCR();
			Logger.info("Click On Save Button For details Page OTS is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button For details Page OTS is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(800);
		try {
			OTS.DisplaySuccessForDefaultLeadOwnerLPWR();
			Logger.info("Display Success For DefaultLeadOwner is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Success For DefaultLeadOwner is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		detrrt.ClickOnEditbtn();
		Logger.info("Click On Description Edit button is Passed");
		Thread.sleep(2500);
		detrrt.InputDesc();
		Logger.info("Enter data in Discription is Passed");
		Thread.sleep(2500);
		detrrt.ClickOnbtnSaveDescForAccList();
		Logger.info("Click On Description Save button is Passed");
		Thread.sleep(2500);
		try {
			LR.ClickOnCopyButton();           
			Logger.info("Click On Copy Button is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Copy Button is FAILED!!",e);
			sa.assertAll();
		} 
		Thread.sleep(2500);
		try {
			if (LR.DisplayedCopiedSuccessMessage()==true) {
				Logger.info("Displayed Copied Success Message is PASSED!!");
			}          
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Copied Success Message is FAILED!!",e);
			sa.assertAll();
		}
		//*****
		Logger.info("//==================================== OverView Page Opeartion Before approve  ==================================");
		Thread.sleep(3500);
		try {
			LR.ClickOnOTSRouterFeature();
			Logger.info("Click On OTS Router Feature is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on OTS Router Feature is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if( OTS.DisplayOTSrouterOverView()==true) {
				Logger.info("Display OTSRouter OverView Page is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display OTSRouter OverView Page is Failed", e);
			sa.assertAll();
		}


		if (LR.DisplayedColumnHeaderCheckIsDisabled()==false) {
			Logger.info("***************** Column Header Check Box Operation ******************");
			Logger.info("Displayed Column Header Checkbox Is Not Disabled ");

			Thread.sleep(1500);
			try {
				LR.ClickOnColumnHeaderCheckBox();
				Logger.info("Click On ColumnHeader CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On ColumnHeader CheckBox is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				if (LR.DisplayedColumnHeaderCheckBoxIsChecked() == true) {
					Logger.info("Displayed ColumnHeader CheckBox Is Checked is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed ColumnHeader CheckBox Is Checked is Failed", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			if (LR.DisplayedAutTestObjectCheckBox() == true) {
				try {
					if (LR.DisplayedAutTestObjectCheckBoxIsChecked() == true) {
						Logger.info("Displayed AutTestObject CheckBox Is Checked is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed AutTestObject CheckBox Is Checked is Failled", e);
					sa.assertAll();
				}
			} else {
				sa.assertTrue(true);
			}
			Thread.sleep(1500);
			try {
				if (LR.DisplayedDeleteButtonIsDisabled() == false) {
					Logger.info("Displayed Delete Button is Enabled is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Delete Button is Enabled is Failled", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				LR.ClickOnColumnHeaderCheckBox();
				Logger.info("Uncheck the ColumnHeader CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Uncheck the ColumnHeader CheckBox is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			if (LR.DisplayedAutTestObjectCheckBox() == true) {
				try {
					if (LR.DisplayedAutTestObjectCheckBoxIsNotChecked() == true) {
						Logger.info("Displayed AutTestObject CheckBox Is Not Checked is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed AutTestObject CheckBox Is Not Checked is Failled", e);
					sa.assertAll();
				}
			} else {
				sa.assertTrue(true);
			}
			Thread.sleep(1500);
			try {
				if (LR.DisplayedDeleteButtonIsDisabled() == true) {
					Logger.info("Displayed Delete Button is Disable is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Delete Button is Disable is Failled", e);
				sa.assertAll();
			}
			Logger.info("********************** Filter Operation *************************");
			Thread.sleep(1500);
			try {
				LR.EnterTextInFilterBox();
				Logger.info("Enter Text In FilterBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter Text In FilterBox is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				if (LR.DisplayedAutoTestObject() == true) {
					Logger.info("Displayed AutoTestObject is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed AutoTestObject is Failled", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			if (LR.DisplayedAutTestObjectCheckBox() == true) {
				Logger.info("Displayed AutoTestObject CheckBox");
				try {
					if (LR.DisplayedAutoTestObjectIsNotUsed() == true) {
						Logger.info("Displayed AutoTestObject Is Not Used is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed AutoTestObject Is Not Used is Failled", e);
					sa.assertAll();
				}
			} else {

				try {
					if (LR.DisplayedAutoTestObjectIsUsed() == true) {
						Logger.info("Displayed AutoTestObject Is Used is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed AutoTestObject Is Used is Failled", e);
					sa.assertAll();
				}
			}
			Thread.sleep(1500);
			try {
				LR.ClearTestFromTheFilterBox();
				Logger.info("Clear Test From The FilterBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Clear Test From The FilterBox is FAILED!!", e);
				sa.assertAll();
			} 
		}else {
			Logger.info("***************** Column Header Check Box Operation ******************");
			Thread.sleep(2500);
			try {
				if(LR.DisplayedColumnHeaderCheckIsDisabled()==true) {
					Logger.info("Displayed Column Header Checkbox Is Disabled is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Column Header Checkbox Is Disabled is is Failed", e);
				sa.assertAll();
			}

			Logger.info("********************** Filter Operation *************************");

			Thread.sleep(1500);
			try {
				LR.EnterTextInFilterBox();
				Logger.info("Enter Text In FilterBox is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter Text In FilterBox is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				if( LR.DisplayedAutoTestObject()==true) {
					Logger.info("Displayed AutoTestObject is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed AutoTestObject is Failled", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			if (LR.DisplayedAutTestObjectCheckBox()==true) {
				try {
					if (LR.DisplayedAutoTestObjectIsNotUsed() == true) {
						Logger.info("Displayed AutoTestObject is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed AutoTestObject is Failled", e);
					sa.assertAll();
				} 
			}else {
				try {
					if( LR.DisplayedAutoTestObjectIsUsed()==true) {
						Logger.info("Displayed AutoTestObject Is Used is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed AutoTestObject Is Used is Failled", e);
					sa.assertAll();
				}
			}
			Thread.sleep(1500);
			try {
				LR.ClearTestFromTheFilterBox();
				Logger.info("Clear Test From The FilterBox is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Clear Test From The FilterBox is FAILED!!", e);
				sa.assertAll();
			}

		}
		Logger.info("==================================== Approve ==================================");	
		Thread.sleep(3000);
		try {
			OTS.ClickOnOTSrouterDropDownsymbol();
			Logger.info("Click on OTSrouter DropDown is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on OTSrouter DropDown is FAILED!!", e);
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

		Thread.sleep(2500);
		ae.ClickOnApprove();
		Logger.info("Click on Approve Button After EDIT is passed");
		Thread.sleep(2000);
		LR.ClickApproveButtonAgainAfterEdit();
		Logger.info("Click Again Approve button is passed");
		Thread.sleep(3800);
		try {
			ae.DisplayApproved();
			Logger.info("Display Approved button is PASSED!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Approved button is FAILED!!", e);
			sa.assertAll();
		}

		Logger.info("//========================================Delete Craft scenario=======================================");
		Thread.sleep(5000);	
		try {
			LMP.ContextClickOnAutoTestObject();      
			Logger.info("RightClick On AutoTestObject is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On AutoTestObject is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			LMP.ClickOnEditAutoTestObject();
			Logger.info("Click On Edit AutoTestObject is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Edit AutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			LR.ClickOnDeleteCraftForLPWR();
			Logger.info("Click On DeleteCraft buton is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DeleteCraft buton is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(5500);
		Thread.sleep(7000);
		try {
			if (ALP.VerifyApprovedSign()==true) {
				Logger.info("Dispalying Verified Sign is PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Dispalying Verified Sign is FAILED!", e);
			sa.assertAll();
		}


		Logger.info("//==================================== OverView Page Opeartion After approved  ==================================");
		Thread.sleep(3500);
		try {
			LR.ClickOnOTSRouterFeature();
			Logger.info("Click On OTS Router Feature is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on OTS Router Feature is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if( OTS.DisplayOTSrouterOverView()==true) {
				Logger.info("Display OTSRouter OverView Page is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display OTSRouter OverView Page is Failed", e);
			sa.assertAll();
		}


		Logger.info("*****************Verifying Column Header Check Is Disabled******************");
		Thread.sleep(2500);
		try {
			if(LR.DisplayedColumnHeaderCheckIsDisabled()==true) {
				Logger.info("Displayed Column Header Checkbox Is Disabled is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Column Header Checkbox Is Disabled is is Failed", e);
			sa.assertAll();
		}

		Logger.info("********************** Filter Operation *************************");

		Thread.sleep(1500);
		try {
			LR.EnterTextInFilterBox();
			Logger.info("Enter Text In FilterBox is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Text In FilterBox is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			if( LR.DisplayedAutoTestObject()==true) {
				Logger.info("Displayed AutoTestObject is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed AutoTestObject is Failled", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		if (LR.DisplayedAutTestObjectCheckBox()==true) {
			try {
				if (LR.DisplayedAutoTestObjectIsNotUsed() == true) {
					Logger.info("Displayed AutoTestObject is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed AutoTestObject is Failled", e);
				sa.assertAll();
			} 
		}else {
			try {
				if( LR.DisplayedAutoTestObjectIsUsed()==true) {
					Logger.info("Displayed AutoTestObject Is Used is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed AutoTestObject Is Used is Failled", e);
				sa.assertAll();
			}
		}
		Thread.sleep(1500);
		try {
			LR.ClearTestFromTheFilterBox();
			Logger.info("Clear Test From The FilterBox is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Clear Test From The FilterBox is FAILED!!", e);
			sa.assertAll();
		}

		//****
	}
}
