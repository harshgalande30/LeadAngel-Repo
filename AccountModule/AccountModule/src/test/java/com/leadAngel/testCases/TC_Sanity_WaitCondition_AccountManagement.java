package com.leadAngel.testCases;
import java.util.List;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.leadAngel.pageObjects.AEtoSDR_Page;
import com.leadAngel.pageObjects.AccountListPage;
import com.leadAngel.pageObjects.AccountMaanagement_PageObjectModel;
import com.leadAngel.pageObjects.CRM_Account_FilterPage;
import com.leadAngel.pageObjects.CRM_Lead_FilterPage;
import com.leadAngel.pageObjects.DetailsPage_SalesTeam;
import com.leadAngel.pageObjects.HomePage;
import com.leadAngel.pageObjects.LeadManagementPage;
import com.leadAngel.pageObjects.LeadRouterPageObjectModel;
import com.leadAngel.pageObjects.LoginPage;
import com.leadAngel.pageObjects.RoundRobinPage;
import io.qameta.allure.Step;
@Listeners({ com.leadAngel.utilities.TestAllureListener.class })
public class TC_Sanity_WaitCondition_AccountManagement extends BaseClass {
	private static final Logger Logger = LogManager.getLogger(TC_Sanity_WaitCondition_AccountManagement.class);

	@Test(description = "AccountManagement_WaitCondition _Section")
	@Step("AccountManagement_LeadRouting_WaitCondition")

	public void AccountManagementTest() throws InterruptedException {
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
		AccountListPage ALP = new AccountListPage(driver);
		LeadRouterPageObjectModel LR=new LeadRouterPageObjectModel(driver);

		Thread.sleep(3500);
		try {
			AM.AccountManagement();
			Logger.info("Click on AccountManagement is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on AccountManagement is FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		LMP.RightClickonWaitCondition();
		Logger.info("Right Click on Wait Condition is Passed");
		Thread.sleep(2500);
		LMP.ClickOnNewObject();
		Logger.info("Click on New Wait Condition is Passed");
		Thread.sleep(2500);
		try {
			LMP.NameInCrudObject();
			Logger.info("Enter AutoTestName is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter AutoTestName is FAILED!!!");
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
		Logger.info("Click on Save Button WaitCondition is Passed");

		Thread.sleep(800);
		if(ae.DisplaySameAEerror() == true) {
			Logger.info("Duplicate Object Found, Try to delete the Object NOW!!! then Creating New Object!!");
			Thread.sleep(4000);
			try {
				LMP.WaitConditionDropDown();
				Logger.info("Click on WaitCondition DropDown is PASSED!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on WaitCondition DropDown is FAILED!", e);
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
				LMP.RightClickonWaitCondition();
				Logger.info("Right Click on Wait Condition is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Right Click on Wait Condition is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(3800);
			try {
				LMP.ClickOnNewObject();
				Logger.info("Click on New Wait condition is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on New Wait condition is FAILED!!", e);
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
			Logger.info("Click on Wait Button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Wait Button is FAILED!!", e);
			sa.assertAll();
		}


		Logger.info("//====================================== DRAG&DROP WAIT_FOR ATTRIBUTE===================================//");
		Thread.sleep(3500);
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
			Logger.info("Input on WaitFor is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Input on WaitFor is FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(500);
		try {
			if( LR.DisplayedWaitForInputBoxNgValid()==true) {
				Logger.info("Displayed Input Box is not red");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Input Box is red",e);
			sa.assertAll();
		}
		List<WebElement> AllLinksOfWaitForBox2 = driver.findElements(By.xpath("(//label[text()='Wait For']/..//select[@name='seldropDown'])[1]//option[text()]"));
		int countWaitForBox2=AllLinksOfWaitForBox2.size();

		for (int L = 1; L <countWaitForBox2; L++) {

			WebElement getLinkWaitForBox2= AllLinksOfWaitForBox2.get(L);
			String getLinkTextWaitForBox2= getLinkWaitForBox2.getText();
			Thread.sleep(1500);
			try {
				getLinkWaitForBox2.click();
				Logger.info("Select "+getLinkTextWaitForBox2+" is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select "+getLinkTextWaitForBox2+" is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(500);
			try {
				if( LR.DisplayedWaitForSelectBoxNgValid()==true) {
					Logger.info("Displayed Select Box is not red");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Select Box is red",e);
				sa.assertAll();
			}
		}

		Logger.info("//========================================= DRAG&DROP WAIT TILL  ATTRIBUTE================================//");
		Thread.sleep(3500);
		try {
			LMP.WaitTill_DND();
			Logger.info("Drag and Drop WaitTill is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag and Drop WaitTill is FAILED!!", e);
			sa.assertAll();
		}	  		 
		Thread.sleep(3000);
		try {
			rrp.ClickOnCalendarButton();
			Logger.info("Click on CalendarButton is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on CalendarButton is FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			LMP.ClickOnDate();
			Logger.info("Click On Date is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Date is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(500);
		try {
			if( LR.DisplayedWaitTillInputBox1NgValid()==true) {
				Logger.info("Displayed Input Box1 is not red");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Input Box1 is red",e);
			sa.assertAll();
		}
		Thread.sleep(3100);
		try {
			LMP.ClickOnSelectTime();
			Logger.info("Click on Select Time is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Select Time is FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickOnTime();
			Logger.info("Click On Time is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Time is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickOnOkBtn();
			Logger.info("Click On Ok button is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Ok button is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(500);
		try {
			if( LR.DisplayedWaitTillInputBox2NgValid()==true) {
				Logger.info("Displayed Input Box2 is not red");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Input Box2 is red",e);
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
		Thread.sleep(2500);
		List<WebElement> AllLinksOfWaitTill = driver.findElements(By.xpath("(//label[text()='Wait till']/..//select[@name='seldropDown'])[1]//option[text()]"));
		int countWaitTill=AllLinksOfWaitTill.size();

		for (int J = 1; J <countWaitTill; J++) {
			Thread.sleep(2500);
			try {
				LMP.ClickOnWaitFilterOptionInWaitCondition();
				Logger.info("Click On WaitFilter DropDown is PASSED!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On WaitFilter DropDown is FAILED!!!", e);
				sa.assertAll();
			}

			WebElement getLinkWaitTill= AllLinksOfWaitTill.get(J);
			String getLinkTextWaitTill= getLinkWaitTill.getText();
			Thread.sleep(2500);
			try {
				getLinkWaitTill.click();
				Logger.info("Select "+getLinkTextWaitTill+" is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select "+getLinkTextWaitTill+" is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(500);
			try {
				if( LR.DisplayedWaitFilterSelectBoxNgValid()==true) {
					Logger.info("Displayed Select Box is not red");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Select Box is red",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				LMP.clickOnSelectWaitFilterDropDown();
				Logger.info("Click On WaitFilterSelect dropdown is PASSED!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On WaitFilterSelect dropdown is FAILED!!!", e);
				sa.assertAll();
			}
			if (J==1) {
				//****************
				String ParentWindow = driver.getWindowHandle();
				Thread.sleep(3500);
				String ObjectNameBeforeClickNewTabLink1 = driver
						.findElement(By.xpath("(//a[text()=' open_in_new '])[1]//..//span[text()]")).getText();
				Logger.info("Object Name Before Click NewTab Link: " + ObjectNameBeforeClickNewTabLink1);
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
						Logger.info("Object Name After Click NewTab Link: " + ObjectNameAfterClickNewTabLink);
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
			}
			//****************
			if (J==2) {

				Thread.sleep(2500);
				try {
					LMP.SelectWaitFilterOption();
					Logger.info("Click On WaitFilterOption is PASSED!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On WaitFilterOption is FAILED!!!", e);
					sa.assertAll();
				}
			}
			Thread.sleep(500);
			try {
				if( LR.DisplayedWaitFilterNgSelectBoxNgValid()==true) {
					Logger.info("Displayed NgSelect Box is not red");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed NgSelect Box is red",e);
				sa.assertAll();
			}
		}
		Logger.info("*********************** Search Box and refresh Button Operation **************************");
		Thread.sleep(2000);
		String GetText="";
		try {
			GetText = driver.findElement(By.xpath("(//mat-expansion-panel-header//span[@class='text-attr-title'])[1][text()]")).getText();
			Logger.info("Get Text from first drag and drop box is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Get Text from first drag and drop box is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(500);
		try {
			driver.findElement(By.xpath("//div[@class='list-filter d-flex']//input[@placeholder='Search']")).sendKeys(GetText);
			Logger.info("Enter Text in search box is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Text in search box is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			driver.findElement(By.xpath("(//mat-list-item[@mattooltipclass='custom-tooltip-style']//span[text()='"+GetText+"'])[1]")).isDisplayed();
			Logger.info("Displayed text in toolist, which is entered in search box is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed text in toolist, which is entered in search box is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			LR.ClickOnCloseButtonQUEUE();
			Logger.info("Click On Close Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Close Button is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			LR.ClickOnRefreshButton();
			Logger.info("Click On Refresh Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Refresh Button is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(3800);
		try {
			LMP.ClickOnWaitAttr();
			Logger.info("Click on Wait Button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Wait Button is FAILED!!", e);
			sa.assertAll();
		}
		//*************************************************************************************************************
		Thread.sleep(2500);
		try {
			rrp.ClickDefaultFilterButton();
			Logger.info("Click on DefaultFilter Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on DefaultFilter Button is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			rrp.SelectCustomFilterOption();
			Logger.info("Select Custom FilterOption is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select CustomFilterOption is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			rrp.InputForWaitCondition();
			Logger.info("Input For CutomFilter Wait Condition is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Input For CutomFilter Wait Condition is Failed", e);
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

		Logger.info("//========================================ENTERING DETAILS PAGE======================================");
		Thread.sleep(3600);
		rrp.ClickOnDetail();
		Logger.info("Click on Details Button is Passed!!!");  		  		  		  		
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

		Logger.info("==================================== Approve ==================================");	
		Thread.sleep(3500);
		try {
			LR.ClickOndraftbox();
			Logger.info("Click On draftbox is PASSED!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On draftbox is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		ae.ClickOnApprove();
		Logger.info("Click on Approve Button After EDIT is passed");
		Thread.sleep(2000);
		ae.ClickOnApproveSubmit();
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
			LR.ClickOnWaitConditionFeature();
			Logger.info("Click On WaitCondition Feature is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on WaitCondition Feature is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(5000);
		try {
			if( LMP.DisplayWaitConditionOverview()==true) {
				Logger.info("Display WaitCondition OverView Page is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display WaitCondition OverView Page is Failed", e);
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
