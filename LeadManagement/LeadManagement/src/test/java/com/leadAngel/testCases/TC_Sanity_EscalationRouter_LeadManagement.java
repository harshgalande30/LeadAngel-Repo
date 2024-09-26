package com.leadAngel.testCases;
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
import com.leadAngel.pageObjects.DetailsPage_SalesTeam;
import com.leadAngel.pageObjects.HomePage;
import com.leadAngel.pageObjects.LeadManagementPage;
import com.leadAngel.pageObjects.LeadProcessingWithoutRouting_FlowChartPage;
import com.leadAngel.pageObjects.LeadRouterPageObjectModel;
import com.leadAngel.pageObjects.LoginPage;
import com.leadAngel.pageObjects.RoundRobinPage;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
@Listeners({ com.leadAngel.utilities.TestAllureListener.class })
public class TC_Sanity_EscalationRouter_LeadManagement extends BaseClass {
	private final static Logger Logger = org.apache.logging.log4j.LogManager
			.getLogger(TC_Sanity_EscalationRouter_LeadManagement.class);	
	@Test(description = "LeadManagement_EscalationRouter _Section")
	@Step("LeadManagement_LeadRouting_EscalationRouter")
	@Description("LeadManagement_LeadRouting_EscalationRouter")
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
		LeadProcessingWithoutRouting_FlowChartPage LPWR=new LeadProcessingWithoutRouting_FlowChartPage(driver);
		AccountListPage ALP = new AccountListPage(driver);

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
			LMP.RightClickOnClickEscalationRouter();
			Logger.info("Right Click On EscalationRouter is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On EscalationRouter is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickOnNewObject();
			Logger.info("Click on New Escalation Router is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on New Escalation Router is Failed",e);
			sa.assertAll();
		}
		Logger.info("//===============================CREATE OBJECT SCENARIO START========================================!");
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
			Logger.info("Duplicate Object Found, Deleting Object NOW!!! then Creating New Object!!");
			Thread.sleep(4500);
			try {
				LMP.EscalationRouterDropDown();
				Logger.info("Click on Escalation Router DropDown is passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on Escalation Router DropDown is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(4000);		
			try {
				LMP.ContextClickOnAutoTestObject();           
				Logger.info("RightClick On AutoTestObject is PASSED!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("RightClick On AutoTestObject is Failed!!", e);
				sa.assertAll();
			}
			Thread.sleep(3000);
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
			Thread.sleep(4600);
			try {
				LMP.RightClickOnClickEscalationRouter();
				Logger.info("RightClick On EscalationRouter is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("RightClick On EscalationRouter is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(4100);
			try {
				LMP.ClickOnNewObject();
				Logger.info("Click on New Escalation Router is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on New Escalation Router is FAILED!!", e);
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
		Thread.sleep(5600);
		try {
			Thread.sleep(2500);
			if(LMP.DisplayEscalationRouterOverview()==true) {
				Logger.info("Display Escalation Router Overview ");
				{
					Thread.sleep(4500);
					try {
						LMP.EscalationRouterDropDown();
						Logger.info("Click on Escalation Router DropDown is passed");
					}catch(Exception e) {
						sa.assertTrue(false);
						Logger.error("Click on Escalation Router DropDown is FAILED!!", e);
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


		Logger.info("*************************************** Lead Filter DND ****************************************");
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
		Thread.sleep(4600);
		try {
			LR.ConnectDecisionBlock_To_ActionBlock();
			Logger.info("Connect DecisionBlock(No) To Action Block is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Connect DecisionBlock(No) To Action Block is Failed!!", e);
			sa.assertAll();
		}

		Logger.info("********************************************* Update Data Value DND ****************************************************");	
		Thread.sleep(4500);
		try {
			LR.DND_UpdateDataValue();
			Logger.info("Drag And Drop Update Data Value is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag And Drop Update Data Value is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			LR.ConnectActionBlock_To_UpdateDataValueBlock();
			Logger.info("Connect ActionBlock To UpdateDataValue Block is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Connect ActionBlock To UpdateDataValue Block is Failed!!", e);
			sa.assertAll();
		}

		Logger.info("*************************************** UpdateToCRM DND ****************************************");
		Thread.sleep(4000);
		try {
			LR.DND_UpdateToCRM();
			Logger.info("Drag And Drop UpdateToCRM is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag And Drop UpdateToCRM is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			LR.ConnectUpdateDataValueBlock_To_UpdateToCRMBlock();
			Logger.info("Connect Update Data Value Block To Update To CRM Block is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Connect Update Data Value Block To Update To CRM Block is Failed!!", e);
			sa.assertAll();
		}

		Logger.info("*************************************** Assignment Block DND And Random Split DND ****************************************");
		Thread.sleep(4000);
		try {
			LR.DND_Assignment();
			Logger.info("Drag And Drop AssignmentBlock is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag And Drop AssignmentBlock is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(4000);
		try {
			LR.DND_RandomSplit();
			Logger.info("Drag And Drop RandomSplit is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag And Drop RandomSplit is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			LR.ConnectionUpdateToCRM_To_RandomSplit();
			Logger.info("Connect UpdateToCRM To RandomSplit is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Connect UpdateToCRM To RandomSplit is Failed!!!!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			LR.ConnectionRandomSlitA_To_AssignmentBlock();
			Logger.info("Connect RandomSlitA To AssignmentBlock is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Connect RandomSlitA To AssignmentBlock is Failed!!!!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			LR.ConnectionRandomSlitB_To_ActionBlock();
			Logger.info("Connect RandomSlitB To ActionBlock is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Connect RandomSlitB To ActionBlock is Failed!!!!", e);
			sa.assertAll();
		}
		Thread.sleep(4000);
		try {
			LR.ConnectionRandomSlitC_To_UpdateDataValue();
			Logger.info("ConnectionRandomSlitC_To_UpdateDataValue is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("ConnectionRandomSlitC_To_UpdateDataValue is Failed!!!!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			LR.ConnectionDecisionBlockYES_To_AssignmentBlock();
			Logger.info("Connect DecisionBlock(YES) To AssignmentBlock is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Connect DecisionBlock(YES) To AssignmentBlock is Failed!!!!", e);
			sa.assertAll();
		}


		Logger.info("***************************************Decision block Operation***************************************");
		Thread.sleep(4500);
		try {
			LR.DoubleClickOnDecisionBlock();
			Logger.info("Double Click On DecisionBlock is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Double Click On DecisionBlock is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(4000);
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
			Logger.error("ClickOn Data dictionary option is Failed !!", e);
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
		Thread.sleep(3000);
		String ObjectNameBeforeClickNewTabLink = driver.findElement(By.xpath("(//a[text()=' open_in_new '])[1]//..//span[text()]")).getText();
		Logger.info("Object Name Before Click NewTab Link: "+ObjectNameBeforeClickNewTabLink);
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
		Thread.sleep(4500);
		try {
			LPWR.EnterDescriptionActionBlock();
			Logger.info("Enter Description is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Description is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			LR.SelectOnWeighBookOptionActionBlock();
			Logger.info("Select On Call Webhook Option is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select On Call Webhook Option is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.SelectListBoxActionBlockForEscalationRouter();
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
			LR.ClickOnLRContinueProcessingCheckBoxForSubRouter();
			Logger.info("Click On Continue Processing radio button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Continue Processing radio button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickOnSaveButtonForActionBlock();
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
		Thread.sleep(3500);
		try {
			LR.DoubleClickOnActionBlock();
			Logger.info("Double Click On Action Block is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Double Click On Action Block is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickOnLRStopProcessingCheckBoxForSubRouter();
			Logger.info("Click On StopProcessing radio button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On StopProcessing radio button is Failed",e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		try {
			LR.ClickOnSaveButtonForActionBlock();
			Logger.info("Click On Save Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
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
		Thread.sleep(2500);
		try {
			LR.DoubleClickOnActionBlock();
			Logger.info("Double Click On Action Block is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Double Click On Action Block is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.SelectWaitOptionInActionBlock();
			Logger.info("Select On Wait Option is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select On Wait Option is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.SelectListBoxActionBlockForEscalationRouter();
			Logger.info("Select the Second ListBox dropdown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select the Second ListBox dropdown is Failed",e);
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
				String ObjectNameAfterClickNewTabLink = driver.findElement(By.xpath("(//i[text()='description']//..//span[text()])[2]")).getText();
				Logger.info("Object Name After Click NewTab Link: "+ObjectNameAfterClickNewTabLink);
				Thread.sleep(2500);
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
		Thread.sleep(2500);
		try {
			LR.ClickOnSaveButtonForActionBlock();
			Logger.info("Click On Save Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
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


		Logger.info("*********************************************Update Data Value  Operation****************************************************");	
		Thread.sleep(3500);
		try {
			LR.DoubleClickOnUpdateDataValueBlock();
			Logger.info("Double Click On UpdateDataValue Block is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.info("Double Click On UpdateDataValue Block is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			LPWR.EnterDescriptionActionBlock();
			Logger.info("Enter Description of ActionBlock is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Description of ActionBlock is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickOnAddFieldButtonUpdateDataValue();
			Logger.info("Click On AddField Button UpdateDataValue is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On AddField Button UpdateDataValue is Failed !!",e);
			sa.assertAll();
		}

		int count=4;
		for (int i = 1; i <=count; i++) {
			Thread.sleep(2000);
			try {
				LPWR.FirstListBoxDropdownForUpdateDataValue();
				Logger.info("First ListBox Dropdown For UpdateDataValue is Passed !!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("First ListBox Dropdown For UpdateDataValue is Failed !!",e);
				sa.assertAll();
			}
			if(i==1||i==2||i==3)
			{
				if (i==1) {
					Thread.sleep(2000);
					try {
						LPWR.SelectLatitudeForUpdateDataValue();
						Logger.info("Select Latitude For UpdateDataValue is Passed !!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Select Latitude For UpdateDataValue is Failed !!",e);
						sa.assertAll();
					}	
				}	
				else if (i==2) {
					Thread.sleep(2000);
					try {
						LPWR.SelectFirstNameForUpdateDataValue();
						Logger.info("Select FirstName For UpdateDataValue is Passed !!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Select FirstName For UpdateDataValue is Failed !!",e);
						sa.assertAll();
					}	
				}	
				else if (i==3) {
					Thread.sleep(2000);
					try {
						LPWR.SelectConvertedDateForUpdateDataValue();
						Logger.info("Select ConvertedDate For UpdateDataValue is Passed !!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Select ConvertedDate For UpdateDataValue is Failed !!",e);
						sa.assertAll();
					}	
				}

				for (int j = 0; j <5; j++) {
					Thread.sleep(2000);
					try {
						LPWR.SelectSecondListBoxForUpdateDataValue();
						Logger.info("Select Second ListBox For UpdateDataValue is Passed !!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Select Second ListBox For UpdateDataValue is Failed !!",e);
						sa.assertAll();
					}
					List<WebElement> AllLinksOfSecondListBox = driver.findElements(By.xpath("//div[@role='listbox']//mat-option//span[text()]"));
					WebElement getLinkSecondListBox = AllLinksOfSecondListBox.get(j);
					String getLinkTextSecondListBox = getLinkSecondListBox.getText();
					Thread.sleep(2000);
					try {
						getLinkSecondListBox.click();
						Logger.info("Select "+getLinkTextSecondListBox+" is Passed");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Select "+getLinkTextSecondListBox+" is Failed",e);
						sa.assertAll();
					}
					if (getLinkTextSecondListBox.contains("Set to (Text/Number/Date)")==true) {

						if (i==1) {
							try {
								Thread.sleep(2000);
								LPWR.EnterNumberForLatitudeUpdateDataValue();
								Logger.info("Enter Number For Latitude UpdateDataValue is Passed !!");
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.error("Enter Number For Latitude UpdateDataValue is Failed !!",e);
								sa.assertAll();
							}
							Thread.sleep(2500);
							try {
								LR.ClickOnSaveButtonForUpdateDataValue();
								Logger.info("Click On Save Button is Passed !!");
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.error("Click On Save Button is Failed !!",e);
								sa.assertAll();
							}
							Thread.sleep(2500);
							try {
								if (LR.VerifiedUpdateDataValueBlockBorderColor()==true) {
									Logger.info(LR.VerifiedUpdateDataValueBlockBorderColor());
									Logger.info("UpdateDataValue BorderColor is Verified and  Passed !!");	
								}
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.error("UpdateDataValue BorderColor is Verified and  Failed !!",e);
								sa.assertAll();
							}
							Thread.sleep(3000);
							try {
								LR.DoubleClickOnUpdateDataValueBlock();
								Logger.info("Double Click On UpdateDataValue Block is Passed !!");	
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.info("Double Click On UpdateDataValue Block is Failed !!",e);
								sa.assertAll();
							}
						}
						else if (i==2) {
							try {
								Thread.sleep(2500);
								LPWR.EnterTextForFirstNameUpdateDataValue();
								Logger.info("Enter Number For FirstName UpdateDataValue is Passed !!");
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.error("Enter Number For FirstName UpdateDataValue is Failed !!",e);
								sa.assertAll();
							}
							Thread.sleep(2500);
							try {
								LR.ClickOnSaveButtonForUpdateDataValue();
								Logger.info("Click On Save Button is Passed !!");
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.error("Click On Save Button is Failed !!",e);
								sa.assertAll();
							}
							Thread.sleep(2500);
							try {
								if (LR.VerifiedUpdateDataValueBlockBorderColor()==true) {
									Logger.info(LR.VerifiedUpdateDataValueBlockBorderColor());
									Logger.info("UpdateDataValue BorderColor is Verified and Passed !!");	
								}
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.error("UpdateDataValue BorderColor is Verified and Failed !!",e);
								sa.assertAll();
							}
							Thread.sleep(2500);
							try {
								LR.DoubleClickOnUpdateDataValueBlock();
								Logger.info("Double Click On UpdateDataValue Block is Passed !!");	
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.info("Double Click On UpdateDataValue Block is Failed !!",e);
								sa.assertAll();
							}
						}
						else if (i==3) {
							Thread.sleep(2000);
							try {
								rrp.CreatedDateCalendarButtonBox1();
								Logger.info("Click On CreatedDate Calendar Button Box1 is PASSED!!");
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.error("Click On CreatedDate Calendar Button Box1 is FAILED!!!", e);
								sa.assertAll();
							}
							Thread.sleep(2000);
							try {
								rrp.ClickOnDate();
								Logger.info("Click On Date is Passed");
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.error("Click On Date is Failed", e);
								sa.assertAll();
							}
							Thread.sleep(2500);
							try {
								LR.ClickOnSaveButtonForUpdateDataValue();
								Logger.info("Click On Save Button is Passed !!");
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.error("Click On Save Button is Failed !!",e);
								sa.assertAll();
							}
							Thread.sleep(2500);
							try {
								if (LR.VerifiedUpdateDataValueBlockBorderColor()==true) {
									Logger.info(LR.VerifiedUpdateDataValueBlockBorderColor());
									Logger.info("UpdateDataValue BorderColor is Verified and  Passed !!");	
								}
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.error("UpdateDataValue BorderColor is Verified and  Failed !!",e);
								sa.assertAll();
							}
							Thread.sleep(2500);
							try {
								LR.DoubleClickOnUpdateDataValueBlock();
								Logger.info("Double Click On UpdateDataValue Block is Passed !!");	
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.info("Double Click On UpdateDataValue Block is Failed !!",e);
								sa.assertAll();
							}
						}
					}
					else if (getLinkTextSecondListBox.contains("Lookup with Lead")==true || getLinkTextSecondListBox.contains("Lookup with Account")==true ||
							getLinkTextSecondListBox.contains("Lookup with Lead Owner")==true) {
						for (int k = 0; k <2; k++) {
							Thread.sleep(3000);
							try {
								LMP.SelectThirdListBoxdropdownForUpdateDataValue();
								Logger.info("Select Third ListBox dropdown For UpdateDataValue is Passed");
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.error("Select Third ListBox dropdown For UpdateDataValue is Failed", e);
								sa.assertAll();
							}
							List<WebElement> AllLinksOfThirdListBox = driver.findElements(By.xpath("//ng-dropdown-panel//div[@role='option']//span[text()]"));
							WebElement getLinkThirdListBox = AllLinksOfThirdListBox.get(k);
							String getLinkTextThirdListBox = getLinkThirdListBox.getText();
							Thread.sleep(3000);
							try {
								getLinkThirdListBox.click();
								Logger.info("Select "+getLinkTextThirdListBox+" is Passed");
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.error("Select "+getLinkTextThirdListBox+" is Failed",e);
								sa.assertAll();
							}	
							Thread.sleep(2500);
							try {
								LR.ClickOnSaveButtonForUpdateDataValue();
								Logger.info("Click On Save Button is Passed !!");
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.error("Click On Save Button is Failed !!",e);
								sa.assertAll();
							}
							Thread.sleep(2500);
							try {
								if (LR.VerifiedUpdateDataValueBlockBorderColor()==true) {
									Logger.info(LR.VerifiedUpdateDataValueBlockBorderColor());
									Logger.info("UpdateDataValue BorderColor is Verified and  Passed !!");	
								}
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.error("UpdateDataValue BorderColor is Verified and  Failed !!",e);
								sa.assertAll();
							}
							Thread.sleep(2500);
							try {
								LR.DoubleClickOnUpdateDataValueBlock();
								Logger.info("Double Click On UpdateDataValue Block is Passed !!");	
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.info("Double Click On UpdateDataValue Block is Failed !!",e);
								sa.assertAll();
							}
						}	
					}

					else if (getLinkTextSecondListBox.contains("Use Formula to Update")==true) {

						for (int M = 1; M <= 3; M++) {
							Thread.sleep(3500);
							try {
								LPWR.ClickOnInsertButtonThirdListBoxForUpdateDataValue();
								Logger.info("Click On Insert Button Third ListBox For UpdateDataValue is Passed");
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.error("Click On Insert Button Third ListBox For UpdateDataValue is Failed", e);
								sa.assertAll();
							}
							Thread.sleep(2000);
							try {
								LPWR.ClickOnSelectObjectDropDownForUpdateDataValue();
								Logger.info("Click On Select Object DropDown For UpdateDataValue is Passed");
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.error("Click On Select Object DropDown For UpdateDataValue is Failed", e);
								sa.assertAll();
							}

							if (M==1) {
								Thread.sleep(2000);
								try {
									LPWR.SelectAccountInObjectDropDownUpdateDataValue();
									Logger.info("Select Account In Object DropDown UpdateDataValue is Passed");
								} catch (Exception e) {
									sa.assertTrue(false);
									Logger.error("Select Account In Object DropDown UpdateDataValue is Failed", e);
									sa.assertAll();
								}

							}
							if (M==2) {
								Thread.sleep(2000);
								try {
									LPWR.SelectLeadInObjectDropDownUpdateDataValue();
									Logger.info("Select Lead In Object DropDown UpdateDataValue is Passed");
								} catch (Exception e) {
									sa.assertTrue(false);
									Logger.error("Select Lead In Object DropDown UpdateDataValue is Failed", e);
									sa.assertAll();
								}
							}
							if (M==3) {
								Thread.sleep(2000);
								try {
									LPWR.SelectLeadOwnerInObjectDropDownUpdateDataValue();
									Logger.info("Select Lead Owner In Object DropDown UpdateDataValue is Passed");
								} catch (Exception e) {
									sa.assertTrue(false);
									Logger.error("Select Lead Owner In Object DropDown UpdateDataValue is Failed", e);
									sa.assertAll();
								}
							}
							Thread.sleep(2000);
							try {
								LPWR.ClickOnSelectFieldDropDownForUpdateDataValue();
								Logger.info("Click On SelectField DropDown For UpdateDataValue is Passed");
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.error("Click On SelectField DropDown For UpdateDataValue is Failed", e);
								sa.assertAll();
							}
							Thread.sleep(2000);
							try {
								LPWR.ClickUserNameInSelectFieldUpdateDataValue();
								Logger.info("Click User Name In SelectField UpdateDataValue is Passed");
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.error("Click User Name In SelectField UpdateDataValue is Failed", e);
								sa.assertAll();
							}
							Thread.sleep(1500);
							try {
								LPWR.ClickOnSaveButtonForUpdateDataValue();
								Logger.info("Click On Save Button For UpdateDataValue is Passed !!");
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.error("Click On Save Button For UpdateDataValue is Failed !!",e);
								sa.assertAll();
							}	
							Thread.sleep(2500);
							try {
								LR.ClickOnSaveButtonForUpdateDataValue();
								Logger.info("Click On Save Button is Passed !!");
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.error("Click On Save Button is Failed !!",e);
								sa.assertAll();
							}
							Thread.sleep(2500);
							try {
								if (LR.VerifiedUpdateDataValueBlockBorderColor()==true) {
									Logger.info(LR.VerifiedUpdateDataValueBlockBorderColor());
									Logger.info("UpdateDataValue BorderColor is Verified and  Passed !!");	
								}
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.error("UpdateDataValue BorderColor is Verified and  Failed !!",e);
								sa.assertAll();
							}
							Thread.sleep(2500);
							try {
								LR.DoubleClickOnUpdateDataValueBlock();
								Logger.info("Double Click On UpdateDataValue Block is Passed !!");	
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.info("Double Click On UpdateDataValue Block is Failed !!",e);
								sa.assertAll();
							}
						}
					}	
				}
			}
			else if (i==4) {

				Thread.sleep(2000);
				try {
					LPWR.SelectDeletedForUpdateDataValue();
					Logger.info("Select Deleted For UpdateDataValue is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select Deleted For UpdateDataValue is Failed !!",e);
					sa.assertAll();
				}
				Thread.sleep(2000);
				try {
					LPWR.SelectSecondListBoxForUpdateDataValue();
					Logger.info("Select Second ListBox For UpdateDataValue is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select Second ListBox For UpdateDataValue is Failed !!",e);
					sa.assertAll();
				}
				Thread.sleep(2000);
				try {
					LPWR.SelectTrueForDeletedOptionUpdateDataValue();
					Logger.info("Select True For Deleted Option UpdateDataValue is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select True For Deleted Option UpdateDataValue is Failed !!",e);
					sa.assertAll();
				}
				Thread.sleep(2000);
				try {
					LPWR.SelectSecondListBoxForUpdateDataValue();
					Logger.info("Select Second ListBox For UpdateDataValue is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select Second ListBox For UpdateDataValue is Failed !!",e);
					sa.assertAll();
				}
				Thread.sleep(2000);
				try {
					LPWR.SelectFalseForDeletedOptionUpdateDataValue();
					Logger.info("Select False For Deleted Option UpdateDataValue is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select False For Deleted Option UpdateDataValue is Failed !!",e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					LR.ClickOnSaveButtonForUpdateDataValue();
					Logger.info("Click On Save Button is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Save Button is Failed !!",e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					if (LR.VerifiedUpdateDataValueBlockBorderColor()==true) {
						Logger.info(LR.VerifiedUpdateDataValueBlockBorderColor());
						Logger.info("UpdateDataValue BorderColor is Verified and  Passed !!");	
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("UpdateDataValue BorderColor is Verified and  Failed !!",e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					LR.DoubleClickOnUpdateDataValueBlock();
					Logger.info("Double Click On UpdateDataValue Block is Passed !!");	
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.info("Double Click On UpdateDataValue Block is Failed !!",e);
					sa.assertAll();
				}
			}
		}
		Thread.sleep(2500);
		try {
			LPWR.CollapseAll();
			Logger.info("Click on CollapseAll is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on CollapseAll is Failed", e);
			sa.assertAll();
		}	
		Thread.sleep(2500);
		try {
			rrp.ExpandAll();
			Logger.info("Click on ExpandAll is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on ExpandAll is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickOnSaveButtonForUpdateDataValue();
			Logger.info("Click On Save Button For UpdateDataValue is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button For UpdateDataValue is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (LR.VerifiedUpdateDataValueBlockBorderColor()==true) {
				Logger.info(LR.VerifiedUpdateDataValueBlockBorderColor());
				Logger.info("UpdateDataValue BorderColor is Verified and  Passed !!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("UpdateDataValue BorderColor is Verified and  Failed !!",e);
			sa.assertAll();
		}


		Logger.info("********************************************* Assignment block Operation ****************************************************");	
		Thread.sleep(4500);
		try {
			LR.DoubleClickOnAssignmentBlock();
			Logger.info("Double Click On Assignment Block is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Double Click On Assignment Block is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			LPWR.EnterDescriptionActionBlock();
			Logger.info("Enter Description of Assignment block is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Description of Assignment block is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LPWR.ClickRouteToLatestOwnerInTheCustomGroupCheckBox();
			Logger.info("Click Route To Latest Owner In The Custom Group CheckBox is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Route To Latest Owner In The Custom Group CheckBox is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (LR.DisplayedRouteToLatestOwnerInTheCustomGroupCheckBoxIsChecked()==true) {
				Logger.info("Displayed Route To Latest Owner In The Custom Group CheckBox Is Checked!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Route To Latest Owner In The Custom Group CheckBox Is Not Checked!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LPWR.ClickAutoConvertLeadsIntoContactCheckBox();
			Logger.info("Click AutoConvertLeadsIntoContact CheckBox is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click AutoConvertLeadsIntoContact CheckBox is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (LR.DisplayedAutoConvertLeadsIntoContactAndorAccountsCheckBoxIsChecked()==true) {
				Logger.info("Displayed Auto Convert Leads Into Contact And or Accounts CheckBox Is Checked!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Auto Convert Leads Into Contact And or Accounts CheckBox Is Not Checked!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LPWR.ClickAutoConvertLeadsIntoContactDropdown();
			Logger.info("Click AutoConvertLeadsIntoContact DropDown is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click AutoConvertLeadsIntoContact DropDown is Failed !!", e);
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
				String ObjectNameAfterClickNewTabLink = driver.findElement(By.xpath("(//i[text()='description']//..//span[text()])[2]")).getText();
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
		Thread.sleep(2500);
		try {
			LPWR.ClickTriggerProcessOrFlowBuilderCheckBox();
			Logger.info("Click TriggerProcessOrFlowBuilder CheckBox is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click TriggerProcessOrFlowBuilder CheckBox is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (LR.DisplayedTriggerProcessOrFlowBuilderCheckBoxIsChecked()==true) {
				Logger.info("Displayed Trigger Process Or Flow Builder CheckBox Is Checked!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Trigger Process Or Flow Builder CheckBox Is Not Checked!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LPWR.EnterTextTriggerProcessOrFlowBuilder();
			Logger.info("Enter TextTriggerProcessOrFlowBuilder is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter TextTriggerProcessOrFlowBuilder is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickCreateTaskForTheNewOwnerCheckBox();
			Logger.info("Click Create Task For The New Owner CheckBox is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Create Task For The New Owner CheckBox is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2600);
		try {
			if (LR.DisplayedCreateTaskForTheNewOwnerCheckBoxIsChecked()==true) {
				Logger.info("Displayed Create Task For The New Owner CheckBox Is Checked!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Create Task For The New Owner CheckBox Is Not Checked!!", e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			LPWR.ClickCreateTaskForTheNewSuggestedOwnerDropDown();
			Logger.info("Click CreateTaskForTheNewOwner DropDown is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click CreateTaskForTheNewOwner DropDown is Failed !!", e);
			sa.assertAll();
		}
		//****************
		Thread.sleep(3000);
		String ObjectNameBeforeClickNewTabLink5 = driver.findElement(By.xpath("(//mat-icon[@fonticon='open_in_new'])[1]//..//..//span[text()]")).getText();
		Logger.info("Object Name Before Click NewTab Link: "+ObjectNameBeforeClickNewTabLink5);
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
		Set<String> Allwindow5 = driver.getWindowHandles();
		Thread.sleep(4000);
		for (String wh : Allwindow5) {
			driver.switchTo().window(wh);
			if (wh.equals(ParentWindow)) {
				continue;
			} else {
				Thread.sleep(4000);
				String ObjectNameAfterClickNewTabLink = driver.findElement(By.xpath("(//i[text()='description']//..//span[text()])[2]")).getText();
				Logger.info("Object Name After Click NewTab Link: "+ObjectNameAfterClickNewTabLink);
				Thread.sleep(4000);
				try {
					if (ObjectNameBeforeClickNewTabLink5.contentEquals(ObjectNameAfterClickNewTabLink)) {
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
			LR.ClickOnDropDownAssignmentBlock();
			Logger.info("Click On DropDown AssignmentBlock is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DropDown AssignmentBlock is Failed !!",e);
			sa.assertAll();
		}

		List<WebElement> AllLinksOfAssignmentFirstListBox1 = driver.findElements(By.xpath("//div[@role='listbox']//mat-option//span[text()]"));
		int CountAllLinks =AllLinksOfAssignmentFirstListBox1.size();
		for (int i = 1; i < CountAllLinks; i++) {//CountAllLinks

			if(i!=1) {
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
			}
			List<WebElement> AllLinksOfAssignmentFirstListBox = driver.findElements(By.xpath("//div[@role='listbox']//mat-option//span[text()]"));
			WebElement getLinkAssignmentFirstListBox = AllLinksOfAssignmentFirstListBox.get(i);
			String getLinkTextAssignmentFirstListBox = getLinkAssignmentFirstListBox.getText();
			Thread.sleep(2500);
			try {
				getLinkAssignmentFirstListBox.click();
				Logger.info("Select "+getLinkTextAssignmentFirstListBox+" is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select "+getLinkTextAssignmentFirstListBox+" is Failed",e);
				sa.assertAll();
			}
			if (getLinkTextAssignmentFirstListBox.contentEquals("Assign Based on a Lookup Field in the Parent Account")==true ||
					getLinkTextAssignmentFirstListBox.contentEquals("Assign Based on Account ID Lookup Field in Lead Record")==true) {

				Thread.sleep(2000);
				try {
					LPWR.ClickAssignBasedFirstDropDown();
					Logger.info("Click Assign Based First DropDown is Passed !!");	
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click Assign Based First DropDown is Failed !!",e);
					sa.assertAll();
				}
				Thread.sleep(2000);
				try {
					LPWR.SelectSendNotificationEmailOption();
					Logger.info("Select SendNotificationEmail Option is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select SendNotificationEmail Option is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(2000);
				try {
					LPWR.ClickAssignBasedSecondDropDown();
					Logger.info("Click Assign Based Second DropDown is Passed !!");	
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click Assign Based Second DropDown is Failed !!",e);
					sa.assertAll();
				}
				Thread.sleep(2000);
				try {
					LPWR.SelectSendNotificationEmailOption();
					Logger.info("Select SendNotificationEmail Option is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select SendNotificationEmail Option is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					LPWR.ClickAssignOnlyToUsersIfAvailableOnIntegratedCalendarCheckBox();
					Logger.info("Click AssignOnlyToUsersIfAvailableOnIntegratedCalendar CheckBox is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click AssignOnlyToUsersIfAvailableOnIntegratedCalendar CheckBox is Failed !!", e);
					sa.assertAll();
				}


				//*******************************           *********(Add Data Update)**********        *********         **********
				if (getLinkTextAssignmentFirstListBox.contains("Assign Based on a Lookup Field in the Parent Account")==true) {//Add Data Update

					for (int j = 0; j <3; j++) {//j3
						Thread.sleep(2000);
						try {
							LPWR.ClickAddDataUpdateButton();
							Logger.info("Click Add Data Update Button is Passed !!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Click Add Data Update Button is Failed !!", e);
							sa.assertAll();
						}

						if (j==0) {//j0
							Thread.sleep(2000);
							try {
								LPWR.EmailDropDownForAddDataUpdateButton();
								Logger.info("Email DropDown For AddDataUpdateButton is Passed !!");
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.error("Email DropDown For AddDataUpdateButton is Failed !!", e);
								sa.assertAll();
							}
							Thread.sleep(2000);
							try {
								LPWR.ClickOnEmailOptionForAddDataUpdate();
								Logger.info("Click On Email Option For AddDataUpdate is Passed !!");
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.error("Click On Email Option For AddDataUpdate is Failed !!", e);
								sa.assertAll();
							}

							for (int k = 0; k <4; k++) {//k4
								Thread.sleep(1500);
								try {
									LPWR.ClickOnSelect1BoxForAddDataUpdateButton();
									Logger.info("Click On Select Box For AddDataUpdateButton is Passed !!");
								} catch (Exception e) {
									sa.assertTrue(false);
									Logger.error("Click On Select Box For AddDataUpdateButton is Failed !!", e);
									sa.assertAll();
								}
								if (k==0) {
									Thread.sleep(1500);
									try {
										LPWR.SelectSetToTextForAddDataUpdateButton();
										Logger.info("Select SetToText For AddDataUpdateButton is Passed !!");
									} catch (Exception e) {
										sa.assertTrue(false);
										Logger.error("Select SetToText For AddDataUpdateButton is Failed !!", e);
										sa.assertAll();
									}
									Thread.sleep(1500);
									try {
										LPWR.EnterTextForSetToTextOptionForAddDataUpdateButton();
										Logger.info("Enter Text For SetToText Option ForAddDataUpdateButton is Passed !!");
									} catch (Exception e) {
										sa.assertTrue(false);
										Logger.error("Enter Text For SetToText Option ForAddDataUpdateButton is Failed !!", e);
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
									Thread.sleep(2500);
									try {
										LR.DoubleClickOnAssignmentBlock();
										Logger.info("Double Click On Assignment Block is Passed !!");	
									} catch (Exception e) {
										sa.assertTrue(false);
										Logger.error("Double Click On Assignment Block is Failed !!",e);
										sa.assertAll();
									}
								}
								else if (k==1) {
									Thread.sleep(1500);
									try {
										LPWR.SelectSetToAccountOwnerForAddDataUpdateButton();
										Logger.info("Select SetToAccountOwner For AddDataUpdateButton is Passed !!");
									} catch (Exception e) {
										sa.assertTrue(false);
										Logger.error("Select SetToAccountOwner For AddDataUpdateButton is Failed !!", e);
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
									Thread.sleep(2500);
									try {
										LR.DoubleClickOnAssignmentBlock();
										Logger.info("Double Click On Assignment Block is Passed !!");	
									} catch (Exception e) {
										sa.assertTrue(false);
										Logger.error("Double Click On Assignment Block is Failed !!",e);
										sa.assertAll();
									}
								}
								else if (k==2) {
									Thread.sleep(1500);
									try {
										LPWR.SelectSetToOpportunityOwnerForAddDataUpdateButton();
										Logger.info("Select SetToOpportunityOwner For AddDataUpdateButton is Passed !!");
									} catch (Exception e) {
										sa.assertTrue(false);
										Logger.error("Select SetToOpportunityOwner For AddDataUpdateButton is Failed !!", e);
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
									Thread.sleep(2500);
									try {
										LR.DoubleClickOnAssignmentBlock();
										Logger.info("Double Click On Assignment Block is Passed !!");	
									} catch (Exception e) {
										sa.assertTrue(false);
										Logger.error("Double Click On Assignment Block is Failed !!",e);
										sa.assertAll();
									}
								} 
								else if (k==3) {
									Thread.sleep(1500);
									try {
										LPWR.SelectSetToOwnerMappedSDRForAddDataUpdateButton();
										Logger.info("Select Set ToOwner Mapped SDR's ID For AddDataUpdateButton is Passed !!");
									} catch (Exception e) {
										sa.assertTrue(false);
										Logger.error("Select Set ToOwner Mapped SDR's ID For AddDataUpdateButton is Failed !!", e);
										sa.assertAll();
									}
									Thread.sleep(1500);
									try {
										LPWR.ClickOnSelectBox2ForAddDataUpdateButton();
										Logger.info("Click On Select Box2 For AddDataUpdateButton is Passed !!");
									} catch (Exception e) {
										sa.assertTrue(false);
										Logger.error("Click On Select Box2 For AddDataUpdateButton is Failed !!", e);
										sa.assertAll();
									} 
									Thread.sleep(1500);
									try {
										LPWR.SelectOptionForAddDataUpdate();
										Logger.info("Select Option For AddDataUpdate is Passed !!");
									} catch (Exception e) {
										sa.assertTrue(false);
										Logger.error("Select Option For AddDataUpdate is Failed !!", e);
										sa.assertAll();
									}
									Thread.sleep(2500);
									try {
										LR.ClickedOnSaveButtonForAssignmentBlock();
										Logger.info("Clicked On Save Button For AssignmentBlock is Passed");
									} catch (Exception e) {
										sa.assertTrue(false);
										Logger.error("Clicked On Save Button For AssignmentBlock is Failed",e);
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
									Thread.sleep(2500);
									try {
										LR.DoubleClickOnAssignmentBlock();
										Logger.info("Double Click On Assignment Block is Passed !!");	
									} catch (Exception e) {
										sa.assertTrue(false);
										Logger.error("Double Click On Assignment Block is Failed !!",e);
										sa.assertAll();
									}
								}	 
							}//k4	
						} //j0

						else if (j==1) {//Deleted

							Thread.sleep(2000);
							try {
								LPWR.DeletedDropDownForAddDataUpdateButton();
								Logger.info("Deleted DropDown For AddDataUpdateButton is Passed !!");
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.error("Deleted DropDown For AddDataUpdateButton is Failed !!", e);
								sa.assertAll();
							}
							Thread.sleep(1500);
							try {
								LPWR.ClickOnDeletedOptionForAddDataUpdate();
								Logger.info("Click On Deleted Option For AddDataUpdate is Passed !!");
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.error("Click On Deleted Option For AddDataUpdate is Failed !!", e);
								sa.assertAll();
							}
							Thread.sleep(1500);
							try {
								LPWR.ClickOnSelectBoxDeletedForAddDataUpdateButton();
								Logger.info("Click On Select Box for Deleted In AddDataUpdateButton is Passed !!");
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.error("Click On Select Box for Deleted In AddDataUpdateButton is Failed !!", e);
								sa.assertAll();
							}
							Thread.sleep(1500);
							try {
								LPWR.SelectTrueForDeletedOptionUpdateDataValue();
								Logger.info("Select True For Deleted Option UpdateDataValue is Passed !!");
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.error("Select True For Deleted Option UpdateDataValue is Failed !!",e);
								sa.assertAll();
							}
							Thread.sleep(1500);
							try {
								LPWR.ClickOnSelectBoxDeletedForAddDataUpdateButton();
								Logger.info("Click On Select Box for Deleted In AddDataUpdateButton is Passed !!");
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.error("Click On Select Box for Deleted In AddDataUpdateButton is Failed !!", e);
								sa.assertAll();
							}
							Thread.sleep(1500);
							try {
								LPWR.SelectFalseForDeletedOptionUpdateDataValue();
								Logger.info("Select False For Deleted Option UpdateDataValue is Passed !!");
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.error("Select False For Deleted Option UpdateDataValue is Failed !!",e);
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
							Thread.sleep(2500);
							try {
								LR.DoubleClickOnAssignmentBlock();
								Logger.info("Double Click On Assignment Block is Passed !!");	
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.error("Double Click On Assignment Block is Failed !!",e);
								sa.assertAll();
							}
						}//Deleted

						else if (j==2) {//lattitude
							Thread.sleep(1500);
							try {
								LPWR.LatitudeOrCreatedDateDropDownForAddDataUpdateButton();
								Logger.info("Latitude DropDown For AddDataUpdateButton is Passed !!");
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.error("Latitude DropDown For AddDataUpdateButton is Failed !!", e);
								sa.assertAll();
							}
							Thread.sleep(1500);
							try {
								LPWR.ClickOnLatitudeOptionForAddDataUpdate();
								Logger.info("Click On Latitude Option For AddDataUpdate is Passed !!");
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.error("Click On Latitude Option For AddDataUpdate is Failed !!", e);
								sa.assertAll();
							}
							Thread.sleep(1500);
							try {
								LPWR.EnterNumberForLatitudeUpdateDataValue();
								Logger.info("Enter Number For Latitude UpdateDataValue is Passed !!");
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.error("Enter Number For Latitude UpdateDataValue is Failed !!",e);
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
							Thread.sleep(2500);
							try {
								LR.DoubleClickOnAssignmentBlock();
								Logger.info("Double Click On Assignment Block is Passed !!");	
							} catch (Exception e) {
								sa.assertTrue(false);
								Logger.error("Double Click On Assignment Block is Failed !!",e);
								sa.assertAll();
							}
						}//lattitude
					}//j3
				}//Add Data Update
				//**************     *********      ***********         **************           **********       ********

			}//Assign Based on a Lookup Field in the Parent Account

			else if (getLinkTextAssignmentFirstListBox.contentEquals("Assign to Account Owner")==true
					||getLinkTextAssignmentFirstListBox.contentEquals("Assign to Opportunity Owner")==true
					||getLinkTextAssignmentFirstListBox.contentEquals("Route to the Owner on Master Record")==true) {//Assign to Account Owner
				Thread.sleep(2000);
				try {
					LPWR.ClickAssignOnlyToUsersIfAvailableOnIntegratedCalendarCheckBox();
					Logger.info("Click AssignOnlyToUsersIfAvailableOnIntegratedCalendar CheckBox is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click AssignOnlyToUsersIfAvailableOnIntegratedCalendar CheckBox is Failed !!", e);
					sa.assertAll();
				}

			}//Assign to Account Owner

			else if (getLinkTextAssignmentFirstListBox.contains("Assign to Account Owners Manager")==true) {//Assign to Account Owner manager
				Thread.sleep(1500);
				try {
					LPWR.ClickAssignOnlyToUsersIfAvailableOnIntegratedCalendarCheckBox();
					Logger.info("Click AssignOnlyToUsersIfAvailableOnIntegratedCalendar CheckBox is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click AssignOnlyToUsersIfAvailableOnIntegratedCalendar CheckBox is Failed !!", e);
					sa.assertAll();
				}

				//********************************(Add Data Update)*******************************
				//Created date need to be edit in Add Data Update
				Thread.sleep(2000);
				try {
					LPWR.ClickOnCrossMarkButton();
					Logger.info("Click On Cross Mark Button is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Cross Mark Button is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(3500);
				try {
					LPWR.ClickAddDataUpdateButton();
					Logger.info("Click Add Data Update Button is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click Add Data Update Button is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					LPWR.LatitudeOrCreatedDateDropDownForAddDataUpdateButton();
					Logger.info("CreatedDate DropDown For AddDataUpdateButton is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("CreatedDate DropDown For AddDataUpdateButton is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					LPWR.ClickOnCreatedDateOptionForAddDataUpdate();
					Logger.info("Click On Created date Option For AddDataUpdate is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Created Date Option For AddDataUpdate is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					rrp.CreatedDateCalendarButtonBox1();
					Logger.info("Click On CreatedDate Calendar Button Box1 is PASSED!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On CreatedDate Calendar Button Box1 FAILED!!!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					rrp.ClickOnDate();
					Logger.info("Click On Date is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Date is Failed", e);
					sa.assertAll();
				}
				//***********************************************************

			}	//Assign to Account Owner manager

			else if (getLinkTextAssignmentFirstListBox.contentEquals("Assign to Parent Accounts Owner")==true||
					getLinkTextAssignmentFirstListBox.contentEquals("Assign to Sales Team")==true||
					getLinkTextAssignmentFirstListBox.contentEquals("Assign to Queue")==true||
					getLinkTextAssignmentFirstListBox.contentEquals("Assign to Weighted Sales Team")==true) {//Assign to Queue

				Thread.sleep(2000);
				try {
					LPWR.SelectDropDownForAssignToQueue();
					Logger.info("Click on main second Select DropDown is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click on main second Select DropDown is Failed", e);
					sa.assertAll();
				}
				if (getLinkTextAssignmentFirstListBox.contentEquals("Assign to Sales Team")==true||
						getLinkTextAssignmentFirstListBox.contentEquals("Assign to Weighted Sales Team")==true) {
					//****************
					Thread.sleep(3000);
					String ObjectNameBeforeClickNewTabLink8 = driver.findElement(By.xpath("(//mat-icon[@fonticon='open_in_new'])[1]//..//..//span[text()]")).getText();
					Logger.info("Object Name Before Click NewTab Link: "+ObjectNameBeforeClickNewTabLink8);
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
					Set<String> Allwindow8 = driver.getWindowHandles();
					Thread.sleep(4000);
					for (String wh : Allwindow8) {
						driver.switchTo().window(wh);
						if (wh.equals(ParentWindow)) {
							continue;
						} else {
							Thread.sleep(4000);
							String ObjectNameAfterClickNewTabLink = driver.findElement(By.xpath("(//i[text()='description']//..//span[text()])[2]")).getText();
							Logger.info("Object Name After Click NewTab Link: "+ObjectNameAfterClickNewTabLink);
							Thread.sleep(4000);
							try {
								if (ObjectNameBeforeClickNewTabLink8.contentEquals(ObjectNameAfterClickNewTabLink)) {
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
				}
				Thread.sleep(2500);
				if (getLinkTextAssignmentFirstListBox.contentEquals("Assign to Parent Accounts Owner")==true||
						getLinkTextAssignmentFirstListBox.contentEquals("Assign to Queue")==true) {
					Thread.sleep(2500);
					try {
						LPWR.SelectCreateTaskForTheNewSuggestedOwnerOption();
						Logger.info("Select Option from the dropdown is Passed !!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Select Option from the dropdown is Failed !!",e);
						sa.assertAll();
					}
				}
				if (getLinkTextAssignmentFirstListBox.contains("Assign to Parent Accounts Owner")==true) {
					Thread.sleep(2000);
					try {
						LPWR.ClickAssignOnlyToUsersIfAvailableOnIntegratedCalendarCheckBox();
						Logger.info("Click AssignOnlyToUsersIfAvailableOnIntegratedCalendar CheckBox is Passed !!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Click AssignOnlyToUsersIfAvailableOnIntegratedCalendar CheckBox is Failed !!", e);
						sa.assertAll();
					}
				}
				else if (getLinkTextAssignmentFirstListBox.contains("Assign to Sales Team")==true) {
					Thread.sleep(2000);
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
						if (LR.DisplayedCappingConditionCheckBoxIsChecked()==true) {
							Logger.info("Displayed Capping Condition CheckBox Is Checked!!");
						}
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Displayed Capping Condition CheckBox Is Not Checked!!", e);
						sa.assertAll();
					}
					Thread.sleep(2000);
					try {
						LMP.ClickCappingConditionDropDown();
						Logger.info("Click CappingCondition DropDown is Passed !!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Click CappingCondition DropDown is Failed !!", e);
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
							String ObjectNameAfterClickNewTabLink = driver.findElement(By.xpath("(//i[text()='description']//..//span[text()])[2]")).getText();
							Logger.info("Object Name After Click NewTab Link: "+ObjectNameAfterClickNewTabLink);
							Thread.sleep(4000);
							try {
								if (ObjectNameBeforeClickNewTabLink5.contentEquals(ObjectNameAfterClickNewTabLink)) {
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
					Thread.sleep(2000);
					try {
						LMP.InputforCappingConditionBox();
						Logger.info("Input for CappingCondition Box is Passed !!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Input for CappingCondition Box is Failed !!",e);
						sa.assertAll();
					}

					Thread.sleep(2000);
					try {
						LPWR.ClickAssignToPeopleWithCurrentlyActiveWorkingHoursCheckBox();
						Logger.info("Click AssignToPeopleWithCurrentlyActiveWorkingHours CheckBox is Passed !!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Click AssignToPeopleWithCurrentlyActiveWorkingHours CheckBox is Failed !!", e);
						sa.assertAll();
					}
					Thread.sleep(2000);
					try {
						LPWR.ClickIfNoOneIsAvailableHoldTheLeadCheckBox();
						Logger.info("Click IfNoOneIsAvailableHoldTheLead CheckBox is Passed !!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Click IfNoOneIsAvailableHoldTheLead CheckBox is Failed !!", e);
						sa.assertAll();
					}
				}
			}////Assign to Queue

			else if (getLinkTextAssignmentFirstListBox.contentEquals("Assign to Sales Rep")==true||
					getLinkTextAssignmentFirstListBox.contentEquals("Assign to Sales Rep Email Lookup on Lead")==true||
					getLinkTextAssignmentFirstListBox.contentEquals("Assign to Sales Rep ID Lookup on Lead")==true||
					getLinkTextAssignmentFirstListBox.contentEquals("Assign to Sales Rep ID Lookup on Matching Account")==true||
					getLinkTextAssignmentFirstListBox.contentEquals("Route Based on the Lookup on Master Record")==true) {//Assign to sales Rep
				Thread.sleep(2000);
				try {
					LPWR.SelectDropDownForAssignToQueue();
					Logger.info("Click on main second Select DropDown is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click on main second Select DropDown is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(2000);
				try {
					LPWR.SlectAssignToSalesRepOption();
					Logger.info("Slect Option is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Slect Option is Failed !!",e);
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
			}//Assign to sales Rep
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
		}//CountAllLinks

		Logger.info("*********************************************UpdateToCRM Operation********************************************");	
		Thread.sleep(3500);
		try {
			LR.DoubleClickOnUpdateToCRM_Block();
			Logger.info("Double Click On UpdateToCRM Block is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Double Click On UpdateToCRM Block is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			LR.ClickOnDescriptionOfUpdateToCRMBlock();
			Logger.info("Click On Description Of UpdateToCRM Block is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Description Of UpdateToCRM Block is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickOnSaveBttonUpdateToCRMBlock();
			Logger.info("Click On SaveBtton Of UpdateToCRM Block is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On SaveBtton Of UpdateToCRM Block is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (LR.VerifiedUpdateToCRMBlockBorderColor()==true) {
				Logger.info(LR.VerifiedUpdateToCRMBlockBorderColor());
				Logger.info("UpdateToCRM Block Border Colour is Verified and Passed!!");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("UpdateToCRM Block Border Colour is Verified and Failed!!",e);
			sa.assertAll();
		}


		Logger.info("*********************************************RandomSplit Operation****************************************************");	
		Thread.sleep(3500);
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
			Logger.info("Minimize the Panner is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Minimize the Panner is Failed!!", e);
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
		Thread.sleep(4000);
		rrp.ClickOnDetail();
		Logger.info("Enter Details Page!!!");
		Thread.sleep(3500);
		try {
			detrrt.ClickOnSuggestedNewOwnerDropDown();
			Logger.info("Click On Escalation Condition DropDown is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Escalation Condition DropDown is Failed!!", e);
			sa.assertAll();
		}
		//****************
		Thread.sleep(3000);
		String ObjectNameBeforeClickNewTabLinkK = driver.findElement(By.xpath("(//a[text()=' open_in_new '])[1]//..//span[text()]")).getText();
		Logger.info("Object Name Before Click NewTab Link: "+ObjectNameBeforeClickNewTabLinkK);
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
		Set<String> AllwindowW = driver.getWindowHandles();
		Thread.sleep(4500);
		for (String wh : AllwindowW) {
			driver.switchTo().window(wh);
			if (wh.equals(ParentWindow)) {
				continue;
			} else {
				Thread.sleep(4500);
				String ObjectNameAfterClickNewTabLink = driver.findElement(By.xpath("(//i[text()='description']//..//span[text()])[2]")).getText();
				Logger.info("Object Name After Click NewTab Link: "+ObjectNameAfterClickNewTabLink);
				Thread.sleep(4500);
				try {
					if (ObjectNameBeforeClickNewTabLink5.contentEquals(ObjectNameAfterClickNewTabLink)) {
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
			detrrt.CheckBoxForSuggestedNewOwner();
			Logger.info("Click on CheckBox For Escalation condition is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on CheckBox For Escalation condition is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(900);
		try {
			detrrt.DisplaySuccessForSuggestedNewOwner();
			Logger.info("Display Success For Escalation condition is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Success For Escalation condition is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(3100);
		try {
			detrrt.LeadProcessingFeederFilterDropDown();
			Logger.info("Click on Default Lead Owner DropDown is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Default Lead Owner DropDown is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			detrrt.SelectLeadProcessingFeederFilterOption();
			Logger.info("Select DefaultLeadOwner Option is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select DefaultLeadOwner Option is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			detrrt.CheckBoxForLeadProcessingFeederFilter();
			Logger.info("Click on CheckBox For DefaultLeadOwner is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on CheckBox For DefaultLeadOwner is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(900);
		try {
			detrrt.DisplaySuccessForLeadProcessingFeederFilter();
			Logger.info("Display Success For DefaultLeadOwner is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Success For DefaultLeadOwner is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(3100);
		try {
			detrrt.DataValueUpdateWhenRoutedToDefaultLeadOwnerAddButton();
			Logger.info("Click 0n DataValueUpdateWhenRoutedToDefaultLeadOwner AddButton is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click 0n DataValueUpdateWhenRoutedToDefaultLeadOwner AddButton is Failed!!", e);
			sa.assertAll();
		}

		for (int D = 0; D < 4; D++) {//D
			Thread.sleep(3000);
			try {
				LMP.DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown1();
				Logger.info("DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown1 is Passed!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown1 is Failed!!", e);
				sa.assertAll();
			}

			if (D==0) {//j0
				try {
					Thread.sleep(1500);
					LPWR.ClickOnLeadIDoptionDetailsPage();
					Logger.info("Click On LeadID option Details page is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On LeadID option Details page is Failed !!",e);
					sa.assertAll();
				}

				for (int k = 0; k <4; k++) {//k4
					Thread.sleep(1500);
					try {
						LPWR.ClickOnLeadIDSecondListBoxDropDownDetailsPage();
						Logger.info("Click On LeadID Second List Box DropDown Details page is Passed !!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Click On LeadID Second List Box DropDown Details page is Failed !!", e);
						sa.assertAll();
					}
					if (k==0) {
						Thread.sleep(1500);
						try {
							LPWR.SelectSetToTextForAddDataUpdateButton();
							Logger.info("Select SetToText For Data value update in Details page is Passed !!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Select SetToText For AddDataUpdateButton is Failed !!", e);
							sa.assertAll();
						}
						Thread.sleep(1500);
						try {
							LPWR.EnterTextForSetToTextOptionForAddDataUpdateButton();
							Logger.info("Enter Text For SetToText Option For Data value update in Details page is Passed !!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Enter Text For SetToText Option For Data value update in Details page is Failed !!", e);
							sa.assertAll();
						}
						Thread.sleep(2500);
						try {
							LMP.CheckBoxForDataValueUpdateWhenRoutedToDefaultLeadOwner();
							Logger.info("CheckBox For DataValueUpdateWhenRoutedToDefaultLeadOwner is Passed!!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("CheckBox For DataValueUpdateWhenRoutedToDefaultLeadOwner is Failed!!", e);
							sa.assertAll();
						}
						Thread.sleep(3000);
						try {
							detrrt.DisplaySuccessForDataValueUpdateWhenRoutedToDefaultLeadOwner();
							Logger.info("Display Success ForDataValueUpdateWhenRoutedToDefaultLeadOwner is Passed!!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Display Success ForDataValueUpdateWhenRoutedToDefaultLeadOwner is Failed!!", e);
							sa.assertAll();
						}
					}
					else if (k==1) {
						Thread.sleep(1500);
						try {
							LPWR.SelectSetToAccountOwnerForAddDataUpdateButton();
							Logger.info("Select SetToAccountOwner For Data value update in Details page is Passed !!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Select SetToAccountOwner For Data value update in Details page is Failed !!", e);
							sa.assertAll();
						}
						Thread.sleep(2500);
						try {
							LMP.CheckBoxForDataValueUpdateWhenRoutedToDefaultLeadOwner();
							Logger.info("CheckBox For DataValueUpdateWhenRoutedToDefaultLeadOwner is Passed!!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("CheckBox For DataValueUpdateWhenRoutedToDefaultLeadOwner is Failed!!", e);
							sa.assertAll();
						}
						Thread.sleep(2500);
						try {
							detrrt.DisplaySuccessForDataValueUpdateWhenRoutedToDefaultLeadOwner();
							Logger.info("Display Success ForDataValueUpdateWhenRoutedToDefaultLeadOwner is Passed!!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Display Success ForDataValueUpdateWhenRoutedToDefaultLeadOwner is Failed!!", e);
							sa.assertAll();
						}
					}
					else if (k==2) {
						Thread.sleep(1500);
						try {
							LPWR.SelectSetToOpportunityOwnerForDetailsPage();
							Logger.info("Select SetToOpportunityOwner For Data value update in Details page is Passed !!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Select SetToOpportunityOwner For Data value update in Details page is Failed !!", e);
							sa.assertAll();
						}
						Thread.sleep(2500);
						try {
							LMP.CheckBoxForDataValueUpdateWhenRoutedToDefaultLeadOwner();
							Logger.info("CheckBox For DataValueUpdateWhenRoutedToDefaultLeadOwner is Passed!!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("CheckBox For DataValueUpdateWhenRoutedToDefaultLeadOwner is Failed!!", e);
							sa.assertAll();
						}
						Thread.sleep(2500);
						try {
							detrrt.DisplaySuccessForDataValueUpdateWhenRoutedToDefaultLeadOwner();
							Logger.info("Display Success ForDataValueUpdateWhenRoutedToDefaultLeadOwner is Passed!!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Display Success ForDataValueUpdateWhenRoutedToDefaultLeadOwner is Failed!!", e);
							sa.assertAll();
						}
					} 
					else if (k==3) {
						Thread.sleep(1500);
						try {
							LPWR.SelectSetToSetToOwnerMappedISRIDForDetailsPage();
							Logger.info("Select Set ToOwner Mapped SDR's ID For Data value update in Details page is Passed !!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Select Set ToOwner Mapped SDR's ID For Data value update in Details page is Failed !!", e);
							sa.assertAll();
						}
						Thread.sleep(1500);
						try {
							LPWR.ClickOnLeadIDThirdListBoxDropDownDetailsPage();
							Logger.info("Click On Select Box3 For Data value update in Details page is Passed !!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Click On Select Box3 For Data value update in Details page is Failed !!", e);
							sa.assertAll();
						} 
						Thread.sleep(1500);
						try {
							LPWR.SelectSendNotificationEmailOption();
							Logger.info("Select SendNotificationEmail Option is Passed !!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Select SendNotificationEmail Option is Failed !!", e);
							sa.assertAll();
						}
						Thread.sleep(2500);
						try {
							LMP.CheckBoxForDataValueUpdateWhenRoutedToDefaultLeadOwner();
							Logger.info("CheckBox For DataValueUpdateWhenRoutedToDefaultLeadOwner is Passed!!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("CheckBox For DataValueUpdateWhenRoutedToDefaultLeadOwner is Failed!!", e);
							sa.assertAll();
						}
						Thread.sleep(2500);
						try {
							detrrt.DisplaySuccessForDataValueUpdateWhenRoutedToDefaultLeadOwner();
							Logger.info("Display Success ForDataValueUpdateWhenRoutedToDefaultLeadOwner is Passed!!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Display Success ForDataValueUpdateWhenRoutedToDefaultLeadOwner is Failed!!", e);
							sa.assertAll();
						}
					}	 
				}//k4	
			} //j0

			else if (D==1) {//Deleted
				try {
					Thread.sleep(1500);
					LPWR.ClickOnDeletedOptionDetailsPage();
					Logger.info("Click On Deleted option Details page is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Deleted option Details page is Failed !!",e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					LPWR.ClickOnSecondListBoxDropDownDeletedOptionDetailsPage();
					Logger.info("Click On SecondListBox DropDown Deleted Option DetailsPage is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On SecondListBox DropDown Deleted Option DetailsPage is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					LPWR.SelectTrueForDeletedOptionUpdateDataValue();
					Logger.info("Select True For Deleted Option Details page is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select True For Deleted Option Details page is Failed !!",e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					LMP.CheckBoxForDataValueUpdateWhenRoutedToDefaultLeadOwner();
					Logger.info("CheckBox For DataValueUpdateWhenRoutedToDefaultLeadOwner is Passed!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("CheckBox For DataValueUpdateWhenRoutedToDefaultLeadOwner is Failed!!", e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					detrrt.DisplaySuccessForDataValueUpdateWhenRoutedToDefaultLeadOwner();
					Logger.info("Display Success ForDataValueUpdateWhenRoutedToDefaultLeadOwner is Passed!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Display Success ForDataValueUpdateWhenRoutedToDefaultLeadOwner is Failed!!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					LPWR.ClickOnSecondListBoxDropDownDeletedOptionDetailsPage();
					Logger.info("Click On SecondListBox DropDown Deleted Option DetailsPage is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On SecondListBox DropDown Deleted Option DetailsPage is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					LPWR.SelectFalseForDeletedOptionUpdateDataValue();
					Logger.info("Select False For Deleted Option Details page is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select False For Deleted Option Details page is Failed !!",e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					LMP.CheckBoxForDataValueUpdateWhenRoutedToDefaultLeadOwner();
					Logger.info("CheckBox For DataValueUpdateWhenRoutedToDefaultLeadOwner is Passed!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("CheckBox For DataValueUpdateWhenRoutedToDefaultLeadOwner is Failed!!", e);
					sa.assertAll();
				}
				Thread.sleep(3000);
				try {
					detrrt.DisplaySuccessForDataValueUpdateWhenRoutedToDefaultLeadOwner();
					Logger.info("Display Success ForDataValueUpdateWhenRoutedToDefaultLeadOwner is Passed!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Display Success ForDataValueUpdateWhenRoutedToDefaultLeadOwner is Failed!!", e);
					sa.assertAll();
				}
			}//Deleted

			else if (D==2) {//lattitude
				try {
					Thread.sleep(1500);
					LPWR.ClickOnLatitudeOptionDetailsPage();
					Logger.info("Click On Latitude Option Details Page is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Latitude option Details page is Failed !!",e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					LPWR.EnterNumberForLatitudeUpdateDataValue();
					Logger.info("Enter Number For Latitude Details Page is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Enter Number For Latitude Details Page is Failed !!",e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					LMP.CheckBoxForDataValueUpdateWhenRoutedToDefaultLeadOwner();
					Logger.info("CheckBox For DataValueUpdateWhenRoutedToDefaultLeadOwner is Passed!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("CheckBox For DataValueUpdateWhenRoutedToDefaultLeadOwner is Failed!!", e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					detrrt.DisplaySuccessForDataValueUpdateWhenRoutedToDefaultLeadOwner();
					Logger.info("Display Success ForDataValueUpdateWhenRoutedToDefaultLeadOwner is Passed!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Display Success ForDataValueUpdateWhenRoutedToDefaultLeadOwner is Failed!!", e);
					sa.assertAll();
				}
			}//lattitude
			else if (D==3) {//converted date

				try {
					Thread.sleep(1500);
					LPWR.ClickOnConvertedDateOptionDetailsPage();
					Logger.info("Click On ConvertedDate Option Details Page is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On ConvertedDate option Details page is Failed !!",e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					rrp.CreatedDateCalendarButtonBox1();
					Logger.info("Click On CreatedDate Calendar Button Box1 is PASSED!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On CreatedDate Calendar Button Box1 FAILED!!!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					rrp.ClickOnDate();
					Logger.info("Click On Date is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Date is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					LR.ClickOnRefreshButton();
					Logger.info("Click On Refresh Button is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Refresh Button is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					if (LR.DisplayedPreviuosSelectedOption()==true) {
						Logger.info("Displayed Previuos Selected Option is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed Previuos Selected Option is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(2000);
				try {
					LMP.DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown1();
					Logger.info("DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown1 is Passed!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown1 is Failed!!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					LPWR.ClickOnConvertedDateOptionDetailsPage();
					Logger.info("Click On ConvertedDate Option Details Page is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On ConvertedDate option Details page is Failed !!",e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					rrp.CreatedDateCalendarButtonBox1();
					Logger.info("Click On CreatedDate Calendar Button Box1 is PASSED!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On CreatedDate Calendar Button Box1 FAILED!!!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					rrp.ClickOnDate();
					Logger.info("Click On Date is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Date is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					LMP.CheckBoxForDataValueUpdateWhenRoutedToDefaultLeadOwner();
					Logger.info("CheckBox For DataValueUpdateWhenRoutedToDefaultLeadOwner is Passed!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("CheckBox For DataValueUpdateWhenRoutedToDefaultLeadOwner is Failed!!", e);
					sa.assertAll();
				}
				Thread.sleep(3000);
				try {
					detrrt.DisplaySuccessForDataValueUpdateWhenRoutedToDefaultLeadOwner();
					Logger.info("Display Success ForDataValueUpdateWhenRoutedToDefaultLeadOwner is Passed!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Display Success ForDataValueUpdateWhenRoutedToDefaultLeadOwner is Failed!!", e);
					sa.assertAll();
				}
			}//converted date	
		}//D

		Thread.sleep(3100);
		detrrt.ClickOnEditbtn();
		Logger.info("Click On Description Edit button is Passed");
		Thread.sleep(2500);
		detrrt.InputDesc();
		Logger.info("Enter Text TextArea is Passed");
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
			LR.ClickOnEscalationRouterFeature();
			Logger.info("Click On Escalation Router Feature is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Escalation Router Feature is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if(LMP.DisplayEscalationRouterOverview()==true) {
				Logger.info("Display EscalationRouter OverView Page is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display EscalationRouter OverView Page is Failed", e);
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
			LMP.EscalationRouterDropDown();
			Logger.info("Click on Escalation Router DropDown is passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Escalation Router DropDown is FAILED!!", e);
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
			LR.ClickOnEscalationRouterFeature();
			Logger.info("Click On Escalation Router Feature is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Escalation Router Feature is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if(LMP.DisplayEscalationRouterOverview()==true) {
				Logger.info("Display EscalationRouter OverView Page is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display EscalationRouter OverView Page is Failed", e);
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
