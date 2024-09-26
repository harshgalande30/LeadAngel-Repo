package com.leadAngel.testCases;
import java.io.IOException;
import java.util.List;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.leadAngel.pageObjects.AEtoSDR_Page;
import com.leadAngel.pageObjects.AccountListPage;
import com.leadAngel.pageObjects.AccountMaanagement_PageObjectModel;
import com.leadAngel.pageObjects.AssignmentLimitPage;
import com.leadAngel.pageObjects.CRM_Account_FilterPage;
import com.leadAngel.pageObjects.DetailsPage_SalesTeam;
import com.leadAngel.pageObjects.HomePage;
import com.leadAngel.pageObjects.LeadManagementPage;
import com.leadAngel.pageObjects.LeadRouterPageObjectModel;
import com.leadAngel.pageObjects.LoginPage;
import com.leadAngel.pageObjects.QueueManagementPage;
import com.leadAngel.pageObjects.RoundRobinPage;
import com.leadAngel.pageObjects.WeightedSalesTeamPage;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
@Listeners({ com.leadAngel.utilities.TestAllureListener.class })
public class TC_Sanity_WST_LeadManagement extends BaseClass {
	private final static Logger Logger = org.apache.logging.log4j.LogManager.getLogger(TC_Sanity_WST_LeadManagement.class);
	@Test(description = "LeadManagement_WeightedSalesTeam _Section")
	@Step("LeadManagement_WST_Sanity")
	@Description("LeadManagement_WST_Sanity_Test")
	public void LeadManagementTest() throws InterruptedException, IOException {
		SoftAssert sa = new SoftAssert();
		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		LeadManagementPage LMP = new LeadManagementPage(driver);
		CRM_Account_FilterPage crm = new CRM_Account_FilterPage(driver);
		AEtoSDR_Page ae = new AEtoSDR_Page(driver);
		AccountListPage ALP = new AccountListPage(driver);
		WeightedSalesTeamPage wst = new WeightedSalesTeamPage(driver);
		RoundRobinPage rrp = new RoundRobinPage(driver); 
		DetailsPage_SalesTeam detrrt = new DetailsPage_SalesTeam(driver);
		LeadRouterPageObjectModel LR=new LeadRouterPageObjectModel(driver);
		QueueManagementPage QMP = new QueueManagementPage(driver);
		AssignmentLimitPage AL = new AssignmentLimitPage(driver);
		AccountMaanagement_PageObjectModel AM=new AccountMaanagement_PageObjectModel(driver);

		Thread.sleep(3500);
		try {
			hp.ClickOnLeadManagement();
			Logger.info("Click on Lead Management is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Lead Management is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickonSalesTeam();
			Logger.info("Click on Sales Team is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Sales Team is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.RightClickonWST();
			Logger.info("Right Click on Weighted Sales Team is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click on Weighted Sales Team is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		LMP.ClickOnNewObject();
		Logger.info("Clicked on New object is Passed ");

		Logger.info("//===============================CREATE OBJECT SCENARIO START========================================!");
		Thread.sleep(3000);
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
		LMP.clickOnSaveNewObject();
		Logger.info("Click on Save is Passed");


		Thread.sleep(800);
		if(ae.DisplaySameAEerror() == true) {
			Logger.info("Duplicate Object Found, Try to delete the Object NOW!!! then Creating New Object!!");
			Thread.sleep(4000);
			try {
				wst.getWSTDropDown();
				Logger.info("Click On WeightedSalesTeam DropDown is PASSED!!");
			} catch (Exception e) {
				Logger.error("Click On WeightedSalesTeam DropDown is Failed!!",e);
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
				LMP.RightClickonWST();
				Logger.info("Right Click on Weighted Sales Team is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Right Click on Weighted Sales Team is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(4100);
			try {
				LMP.ClickOnNewObject();
				Logger.info("Click on New button is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on New button is FAILED!!", e);
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
		Thread.sleep(5000);
		try {
			Thread.sleep(2500);
			if( wst.isDisplayWSTOverview()==true) {
				Logger.info("Display WeightedSalesTeam Overview ");
				{
					Thread.sleep(3000);
					try {
						wst.getWSTDropDown();
						Logger.info("Click On WeightedSalesTeam DropDown is PASSED!!");
					} catch (Exception e) {
						Logger.error("Click On WeightedSalesTeam DropDown is Failed!!",e);
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
			}
		} catch (Exception e) {
			sa.assertTrue(true);
		}


		Logger.info("//-----------------------------First Time Drag And Drop SalesRep-------------------------------//");
		Thread.sleep(3500);
		try {
			wst.SalesRepWST_DND();              	
			Logger.info("Drag And Drop SalesRep is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag And Drop SalesRep is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try { 
			wst.ClickInputSalesRep();
			Logger.info("Click on SalesRep Inputbox is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on SalesRep Inputbox is FAILED!! ");
			sa.assertAll();
		}
		if (wst.DisplayErrorMessage3()) {	
			sa.assertTrue(false);
			Logger.info("No Name Found Message Displayed TestCase: FAILED!!!!!!");	
			sa.assertAll();
		}
		else {
			sa.assertTrue(true);
		}
		Thread.sleep(2000);
		try {
			wst.ClickOnSalesRepOption_1();
			Logger.info("Select SalesRep option is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select SalesRep option is FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			wst.InputWeight();
			Logger.info("Enter value for Weight is PASSED");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter value for Weight is FAILED!!! ",e);
			sa.assertAll();
		}

		Logger.info("//-----------------------------Second Time Drag And Drop SalesRep-------------------------------//");
		Thread.sleep(3500);
		try {
			wst.SalesRepWST_DND();              	
			Logger.info("Drag And Drop SalesRep is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag And Drop SalesRep is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try { 
			LR.ClickInputSalesRep2();
			Logger.info("Click on SalesRep Inputbox is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on SalesRep Inputbox is FAILED!! ");
			sa.assertAll();
		}
		if (wst.DisplayErrorMessage3()) {	
			sa.assertTrue(false);
			Logger.info("No Name Found Message Displayed TestCase: FAILED!!!!!!");	
			sa.assertAll();
		}
		else {
			sa.assertTrue(true);
		}
		Thread.sleep(3500);

		try {
			wst.ClickOnSalesRepOption_2();
			Logger.info("Select SalesRep option is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select SalesRep option is FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.InputWeight1();
			Logger.info("Enter value for Weight is PASSED");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter value for Weight is FAILED!!! ",e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		try {
			rrp.CollapseAll();
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

		Logger.info("==================================== Approve ==================================");	
		Thread.sleep(3000);
		ae.ClickOnApprove();
		Logger.info("Click on Approve Button After EDIT is passed");
		Thread.sleep(2000);
		ae.ClickOnApproveSubmit();
		Logger.info("Click Again Approve button is passed");
		Thread.sleep(4000);
		try {
			ae.DisplayApproved();
			Logger.info("Display Approved button is PASSED!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Approved button is FAILED!!", e);
			sa.assertAll();
		}


		Logger.info("//=====================================ENTERING DETAILS PAGE============================================");
		Thread.sleep(3000);
		try {
			rrp.ClickOnDetail();
			Logger.info("Enter Details Page is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Details Page is FAILED", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			detrrt.ClickOnQueOwnerInDetailsPageDropDown();
			Logger.info("Click On QueOwner DropDown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On QueOwner DropDown is FAILED", e);
			sa.assertAll();
		}	
		Thread.sleep(2500);
		try {
			detrrt.SelectOnQueOwnerInDetailsPageOption();
			Logger.info("Select On QueOwner Option is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select On QueOwner Option is FAILED", e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if(LR.DisplayedAssignToQueueOwnerIrrespectiveOfCalendarAvailabilityCheckBoxIsChecked() == true) {
				Logger.info("Displayed AssignToQueueOwnerIrrespectiveOfCalendarAvailability CheckBox Is Checked is Passed!!");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed AssignToQueueOwnerIrrespectiveOfCalendarAvailability CheckBox Is Checked is FAILED!", e);
			sa.assertAll();
		}
		//**
		Thread.sleep(2500);
		try {
			LR.ClickOnDoNotAssignToDefaultOwnerCheckBox();
			Logger.info("Click On DoNotAssignToDefaultOwner CheckBox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DoNotAssignToDefaultOwner CheckBox is FAILED", e);
			sa.assertAll();
		}
		Thread.sleep(600);
		try {
			if(LR.DisplayedDoNotAssignToDefaultOwnerCheckBoxIsChecked() == true) {
				Logger.info("Displayed DoNotAssignToDefaultOwner CheckBox Is Checked is Passed!!");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed DoNotAssignToDefaultOwner CheckBox Is Checked is FAILED!", e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		try {
			LR.ClickOnAssignToTheSalesTeamOwnerIfNoOneAcceptsWithinCheckBox();
			Logger.info("Click On AssignToTheSalesTeamOwnerIfNoOneAcceptsWithin CheckBox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On AssignToTheSalesTeamOwnerIfNoOneAcceptsWithin CheckBox is FAILED", e);
			sa.assertAll();
		}
		Thread.sleep(600);
		try {
			if(LR.DisplayedAssignToTheSalesTeamOwnerIfNoOneAcceptsWithinCheckBoxIsChecked() == true) {
				Logger.info("Displayed AssignToTheSalesTeamOwnerIfNoOneAcceptsWithin CheckBox Is Checked is Passed!!");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed AssignToTheSalesTeamOwnerIfNoOneAcceptsWithin CheckBox Is Checked is FAILED!", e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		try {
			LR.EnterDurationInNumbersForAssignToTheSalesTeamOwnerIfNoOneAcceptsWithinCheckBoxFeature();
			Logger.info("Enter Duration In Numbers For AssignToTheSalesTeamOwnerIfNoOneAcceptsWithinCheckBox Feature is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Duration In Numbers For AssignToTheSalesTeamOwnerIfNoOneAcceptsWithinCheckBox Feature is FAILED", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickOnDropdownForUnits();
			Logger.info("Click On Dropdown For Units is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Dropdown For Units is FAILED", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		List<WebElement> AllLinksOfUnitList1 = driver.findElements(By.xpath("(//span[text()=' Assign to the sales team owner if no one accepts within ']//..//..//..)[1]//ng-dropdown-panel//div[@role='option']"));
		int countUnitList=AllLinksOfUnitList1.size();
		for (int N = 0; N <countUnitList;N++) {
			if(N!=0) {
				Thread.sleep(1500);
				try {
					LR.ClickOnDropdownForUnits();
					Logger.info("Click On Dropdown For Units is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Dropdown For Units is FAILED", e);
					sa.assertAll();
				}
			}
			List<WebElement> AllLinksOfUnitList = driver.findElements(By.xpath("(//span[text()=' Assign to the sales team owner if no one accepts within ']//..//..//..)[1]//ng-dropdown-panel//div[@role='option']"));
			WebElement getLinkUnitList= AllLinksOfUnitList.get(N);
			String getLinkTextUnitList= getLinkUnitList.getText();
			Thread.sleep(1500);
			try {
				getLinkUnitList.click();
				Logger.info("Select "+getLinkTextUnitList+" is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select "+getLinkTextUnitList+" is Failed",e);
				sa.assertAll();
			}
		}

		Thread.sleep(2500);
		try {
			LR.ClickOnRefreshButtonFor_Recipient_TO_SlackChannels();
			Logger.info("Click On Refresh Button For_Recipient_TO_SlackChannels is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Refresh Button For_Recipient_TO_SlackChannels is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(1200);
		try {
			if (LR.DisplaySuccesMessageFor_Recipient_TO_SlackChannels() == true) {
				Logger.info("Displayed Success message is  PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Success message is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickSelectDropDownFor_Recipient_TO_SlackChannels();
			Logger.info("Click Select DropDown For_Recipient_TO_SlackChannels is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Select DropDown For_Recipient_TO_SlackChannels is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.SelectFirstOptionFor_RecipientTO_OR_RecipientCC();
			Logger.info("Select FirstOption For_RecipientTO is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select First Option For_RecipientTO is FAILED!!!",e);
			sa.assertAll();
		}
		//***
		Thread.sleep(2500);
		try {
			LR.ClickOnWhenQueueOwnerIsBusyOnCalendarCheckBox();
			Logger.info("Click On WhenQueueOwnerIsBusyOnCalendar CheckBox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On WhenQueueOwnerIsBusyOnCalendar CheckBox is FAILED", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			if(LR.DisplayedWhenQueueOwnerIsBusyOnCalendarCheckBoxIsChecked() == true) {
				Logger.info("Displayed WhenQueueOwnerIsBusyOnCalendar CheckBox Is Checked is Passed!!");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed WhenQueueOwnerIsBusyOnCalendar CheckBox Is Checked is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickOnWhenQueueOwnerIsBusyIsAwayOnVacationCheckBox();
			Logger.info("Click On WhenQueueOwnerIsBusyIsAwayOnVacation CheckBox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On WhenQueueOwnerIsBusyIsAwayOnVacation CheckBox is FAILED", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			if(LR.DisplayedWhenQueueOwnerIsBusyIsAwayOnVacationCheckBoxIsChecked() == true) {
				Logger.info("Displayed WhenQueueOwnerIsBusyIsAwayOnVacation CheckBox Is Checked is Passed!!");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed WhenQueueOwnerIsBusyIsAwayOnVacation CheckBox Is Checked is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickOnAlwaysCheckBox();
			Logger.info("Click On Always CheckBox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Always CheckBox is FAILED", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			if(LR.DisplayedAlwaysCheckBoxIsChecked() == true) {
				Logger.info("Displayed Always CheckBox Is Checked is Passed!!");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Always CheckBox Is Checked is FAILED!", e);
			sa.assertAll();
		}	
		Thread.sleep(2500);
		try {
			detrrt.ClockOnSaveButtonForQueOwnerInDetailsPage();
			Logger.info("Click On Save Button For QueOwner In DetailsPage is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button For QueOwner In DetailsPage is FAILED", e);
			sa.assertAll();
		}
		Thread.sleep(400);
		try {
			detrrt.DislaySuccessMessage();
			Logger.info("Dislay Success Message is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Dislay Success Message is FAILED", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			detrrt.ClickOnEditbtn();
			Logger.info("Click On Description Edit button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Description Edit button is FAILED", e);
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
			Logger.info("Click On Description Save buttonis passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Description Save button is failed",e);
			sa.assertAll();
		}
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

		Logger.info("//=========================================== QUEUE MANAGEMENT PAGE=============================//");
		Thread.sleep(3500);
		rrp.ClickOnQueueManagement();
		Logger.info("Click On Queue Management Button is Passed");
		Thread.sleep(4000);
		try {
			QMP.ClickOnRadio();
			Logger.info("Click on Prefer assignment to sales people with most Accrued Lead Radio Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Prefer assignment to sales people with most Accrued Lead Radio Button is FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if( LR.DisplayedPreferAssignmentToSalesPeopleWithMostAccruedRadioButtonIsChecked()==true) {
				Logger.info("Displayed Prefer assignment to sales people with most Accrued Lead RadioButton Is Checked");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Prefer assignment to sales people with most Accrued Lead RadioButton Is not Checked", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.EnterMaximumLeadAccrual();
			Logger.info("Enter Maximum LeadAccrual is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Maximum LeadAccrual is FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		QMP.ClickOnCheckbox();
		Logger.info("Click on Assign Leads only to currently available sales rep CheckBox is Passed");
		Thread.sleep(2500);
		try {
			if( LR.DisplayedAssignLeadsOnlyToCurrentlyAvailableSalesRepCheckBoxIsChecked()==true) {
				Logger.info("Displayed Assign Leads only to currently available sales rep RadioButton Is Checked");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Assign Leads only to currently available sales rep RadioButton Is not Checked", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		QMP.CalendarBased();
		Logger.info("Click on Calendar Based Availabilty Radio Button is Passed");
		Thread.sleep(2500);
		QMP.ClickOnCheckboxck();
		Logger.info("Click on Makes Sales People Unavailable check box is Passed");
		Thread.sleep(2500);
		QMP.ClickOnBeforeMeeting();
		Logger.info("Select Minutes Before Meeting is Passed");
		Thread.sleep(2500);
		QMP.ClickOnAfterMeeting();
		Logger.info("Select Minutes after Meeting is Passed");
		Thread.sleep(2500);
		LR.ClickOnIfNoOneIsAvailableHoldTheLeadTillSomeoneIsAvailable();
		Logger.info("Select If no one is available, hold the Lead till someone is available is Passed");
		Thread.sleep(2500);
		QMP.ClickOnSAVE();
		Logger.info("Click On Save Button is Passed");
		Thread.sleep(900);
		try {
			if (QMP.DisplaySuccessMessage()) {
				sa.assertTrue(true);
				Logger.info("Display Success Message is PASSED");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Success Message is FAILED", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		if (LR.DisplaySalesRepDataInQueueManagementWST()==true) {
			sa.assertTrue(true);
			Logger.info("Displayed SalesRep Data In QueueManagement");
		} else {
			sa.assertTrue(false);
			Logger.error("Not Displayed SalesRep Data In QueueManagement");
			sa.assertAll();
		}

		Logger.info("************************* Arrow Button Operation *************************");
		String GetFirstSalesRepName="";
		String GetSecondSalesRepName="";
		Thread.sleep(2500);
		try {
			GetSecondSalesRepName = driver.findElement(By.xpath("(//tr//td[text()])[2]")).getText();
			Logger.info("Get Second SalesRepName is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Get Second SalesRepName is FAILED", e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		try {
			LR.ClickOnTopArrowButton();
			Logger.info("Click On UpwordArrow Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On UpwordArrow Button is FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			GetFirstSalesRepName = driver.findElement(By.xpath("(//tr//td[text()])[1]")).getText();
			Logger.info("Get First SalesRepName is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Get First SalesRepName is FAILED", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (GetFirstSalesRepName.contentEquals(GetSecondSalesRepName)) {
				Logger.info("When the Upword Arrow button is clicked, the SalesRep row should move properly from the Second place to the First place is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("When the Upword Arrow button is clicked, the SalesRep row should move properly from the Second place to the First place is FAILED", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickOnSaveButtonQUEUE();
			Logger.info("Click On Save Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button is FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(600);
		try {
			if (LR.DisplaySuccessMessageQueue()==true) {
				Logger.info("Display Success Message is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Success Message is FAILED", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			if (LR.DisplaySaveButtonIsDisabled()==true) {
				Logger.info("Display Save Button Is Disabled is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Save Button Is Disabled is FAILED", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			if (LR.DisplayResetButtonIsDisabled()==true) {
				Logger.info("Display Reset Button Is Disabled is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Reset Button Is Disabled is FAILED", e);
			sa.assertAll();
		}
		Logger.info("************************* Radio Button Operation *************************");	
		Thread.sleep(3000);
		try {
			LR.ClickOnStatusRadioButton();
			Logger.info("Click On Status Radio Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Status Radio Button is FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (LR.DisplayedStatusRadioButtonInActive()==true) {
				Logger.info("Displayed Status is InActive is Passed");
			}

		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Status is InActive is FAILED", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickOnSaveButtonQUEUE();
			Logger.info("Click On Save Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button is FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(600);
		try {
			if (LR.DisplaySuccessMessageQueue()==true) {
				Logger.info("Display Success Message is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Success Message is FAILED", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			if (LR.DisplaySaveButtonIsDisabled()==true) {
				Logger.info("Display Save Button Is Disabled is Passed");
			}

		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Save Button Is Disabled is FAILED", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			if (LR.DisplayResetButtonIsDisabled()==true) {
				Logger.info("Display Reset Button Is Disabled is Passed");
			}

		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Reset Button Is Disabled is FAILED", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickOnStatusRadioButton();
			Logger.info("Click On Status Radio Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Status Radio Button is FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (LR.DisplayedStatusRadioButtonActive()==true) {
				Logger.info("Displayed Status is Active is Passed");
			}

		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Status is Active is is FAILED", e);
			sa.assertAll();
		}	
		Thread.sleep(2500);
		try {
			LR.ClickOnSaveButtonQUEUE();
			Logger.info("Click On Save Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button is FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(600);
		try {
			if (LR.DisplaySuccessMessageQueue()==true) {
				Logger.info("Display Success Message is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Success Message is FAILED", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			if (LR.DisplaySaveButtonIsDisabled()==true) {
				Logger.info("Display Save Button Is Disabled is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Save Button Is Disabled is FAILED", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			if (LR.DisplayResetButtonIsDisabled()==true) {
				Logger.info("Display Reset Button Is Disabled is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Reset Button Is Disabled is FAILED", e);
			sa.assertAll();
		}
		Logger.info("************************* Lead Accured Operation *************************");	
		Thread.sleep(3000);
		try {
			LR.EnterLeadAccrued();
			Logger.info("Enter Lead Accrued is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Lead Accrued is FAILED!!!", e);
			sa.assertAll();
		}	
		Thread.sleep(2500);
		try {
			LR.ClickOnSaveButtonQUEUE();
			Logger.info("Click On Save Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button is FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(600);
		try {
			if (LR.DisplaySuccessMessageQueue()==true) {
				Logger.info("Display Success Message is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Success Message is FAILED", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			if (LR.DisplaySaveButtonIsDisabled()==true) {
				Logger.info("Display Save Button Is Disabled is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Save Button Is Disabled is FAILED", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			if (LR.DisplayResetButtonIsDisabled()==true) {
				Logger.info("Display Reset Button Is Disabled is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Reset Button Is Disabled is FAILED", e);
			sa.assertAll();
		}	

		Thread.sleep(2500);
		try {
			LR.EnterValueMoreThanTheMaximumLeadAccrualMaximumLeadAccrual();
			Logger.info("Enter Value more than the Maximum Lead Accrual is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Value more than the Maximum Lead Accrual is FAILED!!!", e);
			sa.assertAll();
		}
		LR.ClickOnCloseButtonQUEUE();
		Thread.sleep(1500);
		try {
			if (LR.DisplayedLeadAccuredInputboxBorderIsRed()==true) {
				Logger.info("Displayed LeadAccured Inputbox Border Is Red is Passed");
			}

		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed LeadAccured Inputbox Border Is Red is FAILED", e);
			sa.assertAll();
		}	
		Thread.sleep(1500);
		try {
			if (LR.DisplaySaveButtonIsDisabled()==true) {
				Logger.info("Display Save Button Is Disabled is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Save Button Is Disabled is FAILED", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			if (LR.DisplayResetButtonIsDisabled()==true) {
				Logger.info("Display Reset Button Is Disabled is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Reset Button Is Disabled is FAILED", e);
			sa.assertAll();
		}	
		Logger.info("************************* Refresh Operation *************************");	
		Thread.sleep(3500);
		try {
			LR.ClickOnStatusRadioButton();
			Logger.info("Click On Status Radio Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Status Radio Button is FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (LR.DisplayedStatusRadioButtonInActive()==true) {
				Logger.info("Displayed Status is InActive is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Status is InActive is FAILED", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickOnRefreshButtonQUEUE();
			Logger.info("Click On Refresh Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Refresh Button is FAILED!!!", e);
			sa.assertAll();
		}	
		Thread.sleep(2500);
		try {
			if (LR.DisplayedStatusRadioButtonActive()==true) {
				Logger.info("Displayed Status is Active is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Status is Active is is FAILED", e);
			sa.assertAll();
		}	
		Thread.sleep(1500);
		try {
			if (LR.DisplaySaveButtonIsDisabled()==true) {
				Logger.info("Display Save Button Is Disabled is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Save Button Is Disabled is FAILED", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			if (LR.DisplayResetButtonIsDisabled()==true) {
				Logger.info("Display Reset Button Is Disabled is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Reset Button Is Disabled is FAILED", e);
			sa.assertAll();
		}
		Logger.info("************************* Reset Operation *************************");	
		Thread.sleep(3000);
		try {
			LR.ClickOnStatusRadioButton();
			Logger.info("Click On Status Radio Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Status Radio Button is FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (LR.DisplayedStatusRadioButtonInActive()==true) {
				Logger.info("Displayed Status is InActive is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Status is InActive is FAILED", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickOnResetButtonQUEUE();
			Logger.info("Click On Reset Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Reset Button is FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (LR.DisplayedStatusRadioButtonActive()==true) {
				Logger.info("Displayed Status is Active is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Status is Active is is FAILED", e);
			sa.assertAll();
		}	
		Thread.sleep(1500);
		try {
			if (LR.DisplaySaveButtonIsDisabled()==true) {
				Logger.info("Display Save Button Is Disabled is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Save Button Is Disabled is FAILED", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			if (LR.DisplayResetButtonIsDisabled()==true) {
				Logger.info("Display Reset Button Is Disabled is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Reset Button Is Disabled is FAILED", e);
			sa.assertAll();
		}
		Logger.info("************************* Assignment History Operation *************************");	
		Thread.sleep(2500);
		try {
			LR.ClickOnAssignmentHistoryButton();
			Logger.info("Click On AssignmentHistory Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On AssignmentHistory Button is FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickOnCalendarButton1();
			Logger.info("Click On First CalendarButton is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On First CalendarButton is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ChooseActiveDate();
			Logger.info("Choose an Active Date is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Choose an Active Date is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickOnCalendarButton2();
			Logger.info("Click On Second Calendar Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Second Calendar Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ChooseEndDate();
			Logger.info("Choose an End Date is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Choose an End Date is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickOnSearchButton();
			Logger.info("Click On Search Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Search Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			if (LR.DisplayedHistoryDetails()==true) {
				Logger.info("Displayed History Details is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed History Details is Failed",e);
			sa.assertAll();
		}
		Logger.info("---------- Filter Operation ----------");	
		Thread.sleep(1500);
		String GetTextbefore = driver.findElement(By.xpath("(//td[contains(@class,'mat-column-Salesrepname')])[1][text()]")).getText();
		Logger.info("'"+GetTextbefore+"'");
		Thread.sleep(1500);
		try {
			driver.findElement(By.xpath("//input[@placeholder='Filter']")).sendKeys(GetTextbefore);
			Logger.info("Enter Text in Filterbox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Text in Filterbox is Passed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		String GetTextAfter = driver.findElement(By.xpath("(//td[contains(@class,'mat-column-Salesrepname')])[1][text()]")).getText();

		Thread.sleep(1500);
		try {
			if (GetTextbefore.contentEquals(GetTextAfter)) {
				Logger.info("Displayed Details which is Entered in Filterbox is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Details which is Entered in Filterbox is Failled",e);
			sa.assertAll();
		}
		Thread.sleep(2000);
		try {
			LR.ClickOnClearButton();
			Logger.info("Click On clear Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On clear Button is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2000);
		try {
			LR.CloseAssignmentHistoryPopup();
			Logger.info("Close AssignmentHistory Popup is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Close AssignmentHistory Popup is FAILED!!", e);
			sa.assertAll();
		}


		Logger.info("//======================================== ASSIGNMENT LIMIT PAGE================================// ");
		Thread.sleep(4500);
		try {
			rrp.ClickOnAssignmentLimit();
			Logger.info("Enter Assignment Limit Page is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Assignment Limit Page is FAILED", e);
			sa.assertAll();
		}
		Thread.sleep(600);
		try {
			if(LR.DisplayedCheckBoxIsDisabled() == true) {
				Logger.info("Displayed CheckBox IsDisabled is Passed!!");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed CheckBox IsDisabled is FAILED!", e);
			sa.assertAll();
		}
		for (int i = 1; i < 5; i++) {
			Thread.sleep(2000);
			try {
				AL.ClickOnAddBtn();
				Logger.info("Click on Add Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on Add Button is FAILED", e);
				sa.assertAll();
			}

			if (i==1) {
				Thread.sleep(1500);
				try {
					AL.InputOnBox1();
					Logger.info("Enter Input '20' on TextArea is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Enter Input '20' on TextArea is FAILED", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					AL.InputLeads1();
					Logger.info("Enter '3' on Leads Every Inputbox is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Enter '3' on Leads Every Inputbox is FAILED", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					AL.ClickOnSelectOption1();
					Logger.info("Click On dropdown for select box is PASSED!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On dropdown for select box is FAILED", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					AL.ClickOnLeadsEveryInHours();
					Logger.info("Select 'Hour' option from the Selectbox dropdown is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select 'Hour' option from the Selectbox dropdown is FAILED", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					AL.ClickOnSaveBtn();
					Logger.info("Click on Save Button is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click on Save Button is FAILED!", e);
					sa.assertAll();
				}
				Thread.sleep(600);
				try {
					if (AL.DisplaySuccessMessage() == true) {
						Logger.info("Displayed Success message is Passed!!");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed Success message is FAILED!", e);
					sa.assertAll();
				}
				Thread.sleep(2000);
				try {
					if (LR.DisplayedSaveButtonIsDisabled() == true) {
						Logger.info("Displayed Save Button Is Disabled is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed Save Button Is Disabled is Failled", e);
					sa.assertAll();
				} 
			}
			if (i==4) {
				Thread.sleep(2000);
				try {
					if (LR.DisplayedAddButtonIsDisabled()==true) {
						Logger.info("Displayed Add Button Is Disabled is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed Add Button Is Disabled is Failled",e);
					sa.assertAll();
				}
				while (LR.DisplayedDeleteButton()==true) {
					Thread.sleep(1500);
					try {
						LR.ClickOnDeleteButtonAssignmentLimit();
						Logger.info("Click On Delete Button is Passed");
					}catch(Exception e) {
						sa.assertTrue(false);
						Logger.error("Click On Delete Button is FAILED!", e);
						sa.assertAll();
					}
					Thread.sleep(500);
				}
				Thread.sleep(1500);
				try {
					AL.ClickOnSaveBtn();
					Logger.info("Click on Save Button is Passed");
				}catch(Exception e) {
					sa.assertTrue(false);
					Logger.error("Click on Save Button is FAILED!", e);
					sa.assertAll();
				}
				Thread.sleep(600);
				try {
					if(AL.DisplaySuccessMessage() == true) {
						Logger.info("Displayed Success message is Passed!!");
					}
				}catch(Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed Success message is FAILED!", e);
					sa.assertAll();
				}
			}
		}

		for (int j = 1; j < 3; j++) {

			if (j==1) {
				Thread.sleep(1500);
				try {
					AL.InputLeadsMorethantheLimit();
					Logger.info("Enter '24' on Leads Every Inputbox is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Enter '24' on Leads Every Inputbox is FAILED", e);
					sa.assertAll();
				} 
			}
			if (j==2) {
				Thread.sleep(1500);
				try {
					AL.InputLeadsMorethantheLimit1();
					Logger.info("Enter '31' on Leads Every Inputbox is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Enter '31' on Leads Every Inputbox is FAILED", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					AL.ClickOnSelectOption1();
					Logger.info("Click On dropdown for select box is PASSED!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On dropdown for select box is FAILED", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					AL.ClickOnLeadsEveryInDays();
					Logger.info("Select 'Day' option from the Selectbox dropdown is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select 'Day' option from the Selectbox dropdown is FAILED", e);
					sa.assertAll();
				}
			}
			Thread.sleep(1000);
			AL.ClickOnSaveBtn();
			Thread.sleep(1000);
			try {
				if(LR.DisplayedLeadEveryInputboxBorderColorRed() == true) {
					Logger.info("Displayed LeadEvery Inputbox Border Color Red is Passed!!");
				}
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed LeadEvery Inputbox Border Color Red is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(2000);
			try {
				if (LR.DisplayedSaveButtonIsDisabled() == true) {
					Logger.info("Displayed Save Button Is Disabled is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Save Button Is Disabled is Failled", e);
				sa.assertAll();
			} 
		}

		Thread.sleep(1500);
		try {
			AL.InputLeads1();
			Logger.info("Enter '3' on Leads Every Inputbox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter '3' on Leads Every Inputbox is FAILED", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			AL.ClickOnSaveBtn();
			Logger.info("Click on Save Button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Save Button is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(600);
		try {
			if(AL.DisplaySuccessMessage() == true) {
				Logger.info("Displayed Success message is Passed!!");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Success message is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			LR.ClickOnCheckBoxAssignmentLimitpage();
			Logger.info("Click On CheckBox is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On CheckBox is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(600);
		try {
			if(LR.DisplayedCheckBoxIsUnchecked() == true) {
				Logger.info("Displayed CheckBox Is Unchecked is Passed!!");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed CheckBox Is Unchecked is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			AL.ClickOnSaveBtn();
			Logger.info("Click on Save Button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Save Button is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(600);
		try {
			if(AL.DisplaySuccessMessage() == true) {
				Logger.info("Displayed Success message is Passed!!");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Success message is FAILED!", e);
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
			ALP.ClickOnDeleteCraft();
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

		Logger.info("//==================================== OverView Page Opeartion  ==================================");
		Thread.sleep(3500);
		try {
			LR.ClickOnWeightedSalesTeamFeature();
			Logger.info("Click On WeightedSalesTeam Feature is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on WeightedSalesTeam Feature is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(5000);
		try {
			if( wst.isDisplayWSTOverview()==true) {
				Logger.info("Display WeightedSalesTeam OverView Page is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display WeightedSalesTeam OverView Page is Failed", e);
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
			if (LR.DisplayedAutTestObjectCheckBox()==true) {
				Logger.info("********************** Delete AutoTestObject Operation *************************");
				Thread.sleep(3500);
				try {
					LR.ClickOnAutTestObjectCheckBox();
					Logger.info("Click On AutTestObject CheckBox is Passed");
				}catch(Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On AutTestObject CheckBox is FAILED!!", e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					if( LR.DisplayedAutTestObjectCheckBoxIsChecked()==true) {
						Logger.info("Displayed AutTestObject CheckBox Is Checked is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed AutTestObject CheckBox Is Checked is Failled", e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					LR.ClickOnDeleteButtonOverViewPage();
					Logger.info("Click On Delete Button is Passed");
				}catch(Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Delete Button is FAILED!!", e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					LR.ClickAgainDeleteButtonOverViewPage();
					Logger.info("Click Again Delete Button is Passed");
				}catch(Exception e) {
					sa.assertTrue(false);
					Logger.error("Click Again Delete Button is FAILED!!", e);
					sa.assertAll();
				}
				Thread.sleep(3600);
				try {
					if( LR.DisplayedSuccessMessage()==true) {
						Logger.info("Display Deleted success message is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Display Deleted success message is Failled", e);
					sa.assertAll();
				}

			} else {
				sa.assertTrue(true);
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
				Logger.error("Displayed Column Header Checkbox Is Disabled is Failed", e);
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
						Logger.info("Displayed AutoTestObject Is Not Used is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed AutoTestObject Is Not Used is Failled", e);
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

	}
}
