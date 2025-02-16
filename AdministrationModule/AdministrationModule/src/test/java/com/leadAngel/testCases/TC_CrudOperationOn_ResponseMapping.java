package com.leadAngel.testCases;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.leadAngel.pageObjects.AEtoSDR_Page;
import com.leadAngel.pageObjects.AccountListPage;
import com.leadAngel.pageObjects.AdministrationPageObjectModel;
import com.leadAngel.pageObjects.CRM_Account_FilterPage;
import com.leadAngel.pageObjects.DetailsPage_SalesTeam;
import com.leadAngel.pageObjects.EmailAlertsTemplatesPageObjectModel;
import com.leadAngel.pageObjects.HomePage;
import com.leadAngel.pageObjects.LeadManagementPage;
import com.leadAngel.pageObjects.LeadRouterPageObjectModel;
import com.leadAngel.pageObjects.LoginPage;
import com.leadAngel.pageObjects.ResponseMappingPageObjectModel;
import com.leadAngel.pageObjects.RoundRobinPage;
import com.leadAngel.pageObjects.WebhookPageObjectModel;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
@Listeners({ com.leadAngel.utilities.TestAllureListener.class })
public class TC_CrudOperationOn_ResponseMapping extends BaseClass{	
	private static final Logger Logger = LogManager.getLogger(TC_CrudOperationOn_ResponseMapping.class);

	@Test(description = "Administration_ResponseMapping_Section")
	@Step("Administration_ResponseMapping_Section")
	@Description("Administration_ResponseMapping_Section")
	public void AdministrationTest() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		LeadManagementPage LMP = new LeadManagementPage(driver);
		AdministrationPageObjectModel APOM=new AdministrationPageObjectModel(driver);
		EmailAlertsTemplatesPageObjectModel EATP=new EmailAlertsTemplatesPageObjectModel(driver);
		CRM_Account_FilterPage crm = new CRM_Account_FilterPage(driver);
		AEtoSDR_Page ae = new AEtoSDR_Page(driver);
		LeadRouterPageObjectModel LR=new LeadRouterPageObjectModel(driver);
		RoundRobinPage rrp = new RoundRobinPage(driver);
		DetailsPage_SalesTeam dp=new DetailsPage_SalesTeam(driver);
		ResponseMappingPageObjectModel RM=new ResponseMappingPageObjectModel(driver);
		AccountListPage ALP = new AccountListPage(driver);
		WebhookPageObjectModel WPOM=new WebhookPageObjectModel(driver);

		Thread.sleep(3500);
		try {
			hp.ClickOnAdministration();
			Logger.info("Click on Administration is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Administration is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnIntegrationsDropDown();
			Logger.info("Click On Integrations DropDown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Integrations DropDown is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnWebhookIntegrationDropDown();
			Logger.info("Click On Webhook Integration DropDown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Webhook Integration DropDown is Failed",e);
			sa.assertAll();
		}

		Logger.info("//=========================================CREATE OBJECT SCENARIO START========================================!");
		Thread.sleep(3100);
		try {
			APOM.ContextClickOnResponseMapping();
			Logger.info("Right Click On Response Mapping is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On Response Mapping is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnNewObject();
			Logger.info("Click On Response Mapping is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Response Mapping is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.EnterNameInCrudObject();
			Logger.info("Enter AutoTestObject is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter AutoTestObject is FAILED!!!",e);
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

		Thread.sleep(800);
		if(ae.DisplaySameAEerror() == true) {
			Logger.info("Duplicate Object Found, Try to delete the Object NOW!!! then Creating New Object!!");
			Thread.sleep(4000);
			try {
				APOM.ClickOnResponseMappingDropdown();
				Logger.info("Click on ResponseMapping Dropdown is passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on ResponseMapping Dropdown is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(3500);
			try {
				APOM.RightClickOnAutoTestObject();           
				Logger.info("RightClick On LeadAutoTestObject is PASSED!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("RightClick On LeadAutoTestObject is Failed!!", e);
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
				if (APOM.DisplayedCannotDeleteErrorSuccessMessage() == true) 
				{
					Logger.info("Displayed 'Cannot Delete' Error Message");
					Thread.sleep(4500);
					try {
						APOM.RightClickOnAutoTestObject();           
						Logger.info("RightClick On LeadAutoTestObject is PASSED!!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("RightClick On LeadAutoTestObject is Failed!!", e);
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
						String randomString = APOM.generateRandomString(APOM.length);
						APOM.InputRename_AutoTestObject.clear();
						APOM.InputRename_AutoTestObject.sendKeys(randomString);
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
				APOM.ContextClickOnResponseMapping();
				Logger.info("Right Click On Response Mapping is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Right Click On Response Mapping is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				APOM.ClickOnNewObject();
				Logger.info("Click On Response Mapping is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Response Mapping is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(3500);
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
				APOM.SelectRouterTypeOption();
				Logger.info("Select Router Type is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Select Router Type is FAILED!!!",e);
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
		}
		else {
			sa.assertTrue(true);
		}	

		driver.navigate().refresh();
		Logger.info("Refreshing The Page!!");
		Thread.sleep(5000);
		try {
			Thread.sleep(2500);
			if( APOM.DisplayResponseMappingOverview()==true) {
				Logger.info("Display ResponseMapping Overview is passed");
				Thread.sleep(3000);
				try {
					APOM.ClickOnResponseMappingDropdown();
					Logger.info("Click on ResponseMapping Dropdown is passed");
				}catch(Exception e) {
					sa.assertTrue(false);
					Logger.error("Click on ResponseMapping Dropdown is FAILED!!", e);
					sa.assertAll();
				}
				Thread.sleep(3000);
				try {
					APOM.ClickOnAutoTestObject();           
					Logger.info("Click On LeadAutoTestObject is PASSED!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On LeadAutoTestObject is FAILED!", e);
					sa.assertAll();
				}
			}
		} catch (Exception e) {
			sa.assertTrue(true);
		}

		Logger.info("============================================LeadID_DND Operation==================================================!");
		Thread.sleep(3100);
		try {
			RM.ClickOnLeadAttributes();
			Logger.info("Click On Lead Attributes is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Lead  Attributes is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		String LeadIdText = driver.findElement(By.xpath("//i[@class='righticon-STRING']//..//span[text()='Lead Id']")).getText();
		Thread.sleep(2500);
		try {
			RM.LeadID_DND();
			Logger.info("Drag and Drop LeadID is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag and Drop LeadID is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			RM.WriteLeadID();
			Thread.sleep(2500);
			RM.WriteLeadID();
			Logger.info("Enter LeadID is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter LeadID is FAILED!!!",e);
			sa.assertAll();
		}

		Logger.info("============================================Deleted_DND Operation==============================================!");
		Thread.sleep(3100);
		try {
			RM.Deleted_DND();
			Logger.info("Drag and Drop Deleted is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag and Drop Deleted is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			RM.WriteDeletedBooleanValue();
			Thread.sleep(2500);
			RM.WriteDeletedBooleanValue();
			Logger.info("Enter Deleted Boolean Value is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Deleted Boolean Value is FAILED!!!",e);
			sa.assertAll();
		}
		Logger.info("=========================================Latitude_DND Operation==============================================!");
		Thread.sleep(3100);
		try {
			RM.Latitude_DND();
			Logger.info("Drag and Drop Latitude is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag and Drop Latitude is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			RM.WriteLatitudeValue();
			Thread.sleep(2500);
			RM.WriteLatitudeValue();
			Logger.info("Enter Latitude Value is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Latitude Value is FAILED!!!",e);
			sa.assertAll();
		}

		Logger.info("==========================================ConvertedDate_DND Operation========================================!");
		Thread.sleep(3100);
		try {
			RM.ConvertedDate_DND();
			Logger.info("Drag and Drop ConvertedDate is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag and Drop ConvertedDate is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			RM.WriteConvertedDate();
			Thread.sleep(2500);
			RM.WriteConvertedDate();
			Logger.info("Enter ConvertedDate is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter ConvertedDate is FAILED!!!",e);
			sa.assertAll();
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
			driver.findElement(By.xpath("(//mat-list-item[@mattooltipclass='custom-tooltip-style']//span[text()='"+LeadIdText+"'])[1]")).isDisplayed();
			Logger.info("Displayed text in toolist, which is entered in search box is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed text in toolist, which is entered in search box is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			APOM.ClickOnCloseButtonQUEUE();
			Logger.info("Click On Close Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Close Button is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			APOM.ClickOnRefreshButton();
			Logger.info("Click On Refresh Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Refresh Button is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			RM.ClickOnLeadAttributes();
			Logger.info("Click On Lead Attributes is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Lead Attributes is FAILED!!!",e);
			sa.assertAll();
		}

		Logger.info("//===============================================APPROVE SCENARIO START========================================//");
		Thread.sleep(3500);
		try {
			APOM.RightClickOnAutoTestObject();           
			Logger.info("Right Click On LeadAutoTestObject is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On LeadAutoTestObject is Failed!!", e);
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
			rrp.ApproveSubmitbtnForTaskList();
			Logger.info("Click again Approve button is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click again Approve button is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(5000);
		try {
			rrp.DisplayApproved();
			Logger.info("Display Approved button is PASSED!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Approved button is FAILED!!", e);
			sa.assertAll();
		}

		Logger.info("//===============================================Details ========================================//");
		Thread.sleep(6500);
		try {
			dp.ClickOndetailsbutton();
			Logger.info("Click On details button is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On details button is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			dp.ClickOnEditbtn();
			Logger.info("Click On Editbtn is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Editbtn is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			dp.InputDesc();
			Logger.info("Enter Description is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Description is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			dp.ClickOnSaveBtn();
			Logger.info("Click On Save Button is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (APOM.DisplayedNoRecordFound() == true) {
				Logger.info("Display 'No Record Found' is PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display 'No Record Found' is FAILED!", e);
			sa.assertAll();
		}

		//*****
		Logger.info("//==================================== OverView Page Opeartion Before Used  ==================================");
		Thread.sleep(3500);
		try {
			APOM.ClickOnResponseMappingFeature();
			Logger.info("Click On ResponseMapping Feature is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on ResponseMapping Feature is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if(APOM.DisplayResponseMappingOverview()==true) {
				Logger.info("Display ResponseMapping OverView Page is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display ResponseMapping OverView Page is Failed", e);
			sa.assertAll();
		}


		if (APOM.DisplayedColumnHeaderCheckIsDisabled()==false) {
			Logger.info("***************** Column Header Check Box Operation ******************");
			Logger.info("Displayed Column Header Checkbox Is Not Disabled ");

			Thread.sleep(1500);
			try {
				APOM.ClickOnColumnHeaderCheckBox();
				Logger.info("Click On ColumnHeader CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On ColumnHeader CheckBox is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				if (APOM.DisplayedColumnHeaderCheckBoxIsChecked() == true) {
					Logger.info("Displayed ColumnHeader CheckBox Is Checked is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed ColumnHeader CheckBox Is Checked is Failed", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			if (APOM.DisplayedAutTestObjectCheckBox() == true) {
				Logger.info("Displayed LeadAutTestObject CheckBox is Passed");
				try {
					if (APOM.DisplayedAutTestObjectCheckBoxIsChecked() == true) {
						Logger.info("Displayed LeadAutTestObject CheckBox Is Checked is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed LeadAutTestObject CheckBox Is Checked is Failled", e);
					sa.assertAll();
				}
			} else {
				sa.assertTrue(true);
			}
			Thread.sleep(1500);
			try {
				if (APOM.DisplayedDeleteButtonIsDisabled() == false) {
					Logger.info("Displayed Delete Button is Enabled is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Delete Button is Enabled is Failled", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				APOM.ClickOnColumnHeaderCheckBox();
				Logger.info("Uncheck the ColumnHeader CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Uncheck the ColumnHeader CheckBox is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			if (APOM.DisplayedAutTestObjectCheckBox() == true) {
				Logger.info("Displayed LeadAutTestObject CheckBox is Passed");
				try {
					if (APOM.DisplayedAutTestObjectCheckBoxIsNotChecked() == true) {
						Logger.info("Displayed LeadAutTestObject CheckBox Is Not Checked is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed LeadAutTestObject CheckBox Is Not Checked is Failled", e);
					sa.assertAll();
				}
			} else {
				sa.assertTrue(true);
			}
			Thread.sleep(1500);
			try {
				if (APOM.DisplayedDeleteButtonIsDisabled() == true) {
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
				APOM.EnterTextInFilterBox();
				Logger.info("Enter Text In FilterBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter Text In FilterBox is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				if (APOM.DisplayedLeadAutoTestObject() == true) {
					Logger.info("Displayed LeadAutoTestObject is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed LeadAutoTestObject is Failled", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			if (APOM.DisplayedAutTestObjectCheckBox() == true) {
				Logger.info("Displayed LeadAutoTestObject CheckBox is Passed");
				try {
					if (APOM.DisplayedLeadAutoTestObjectIsNotUsed() == true) {
						Logger.info("Displayed LeadAutoTestObject Is Not Used is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed LeadAutoTestObject Is Not Used is Failled", e);
					sa.assertAll();
				}
			} else {

				try {
					if (APOM.DisplayedLeadAutoTestObjectIsUsed() == true) {
						Logger.info("Displayed LeadAutoTestObject Is Used is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed LeadAutoTestObject Is Used is Failled", e);
					sa.assertAll();
				}
			}
			Thread.sleep(2000);
			try {
				APOM.ClearTestFromTheFilterBox();
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
				if(APOM.DisplayedColumnHeaderCheckIsDisabled()==true) {
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
				APOM.EnterTextInFilterBox();
				Logger.info("Enter Text In FilterBox is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter Text In FilterBox is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				if( APOM.DisplayedLeadAutoTestObject()==true) {
					Logger.info("Displayed LeadAutoTestObject is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed LeadAutoTestObject is Failled", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			if (APOM.DisplayedAutTestObjectCheckBox()==true) {
				Logger.info("Displayed LeadAutoTestObject CheckBox is Passed");
				try {
					if (APOM.DisplayedLeadAutoTestObjectIsNotUsed() == true) {
						Logger.info("Displayed LeadAutoTestObject is not Uesed is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed LeadAutoTestObject is not Used is Failled", e);
					sa.assertAll();
				} 
			}else {
				try {
					if( APOM.DisplayedLeadAutoTestObjectIsUsed()==true) {
						Logger.info("Displayed LeadAutoTestObject Is Used is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed LeadAutoTestObject Is Used is Failled", e);
					sa.assertAll();
				}
			}
			Thread.sleep(1500);
			try {
				APOM.ClearTestFromTheFilterBox();
				Logger.info("Clear Test From The FilterBox is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Clear Test From The FilterBox is FAILED!!", e);
				sa.assertAll();
			}
		}

		//******


		Logger.info("//*********************************************** Make Use of this Object In Webhook(Administration) *******************************************");
		Thread.sleep(4500);
		try {
			APOM.RightClickonWebhookDropDown();
			Logger.info("Right Click on Webhook is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click on Webhook is is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnNewObject();
			Logger.info("Click On NewObject is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On NewObject is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.EnterNameInCrudObject();
			Logger.info("Enter AutoTestObject name is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter AutoTestObject name is FAILED!!!",e);
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


		Thread.sleep(800);
		if(ae.DisplaySameAEerror() == true) {
			Logger.info("Duplicate Object Found, Try to delete the Object NOW!!! then Creating New Object!!");
			Thread.sleep(4000);
			try {
				APOM.ClickOnWebhookDropdown();
				Logger.info("Click on Webhook Dropdown is passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on Webhook Dropdown is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(3500);
			try {
				APOM.RightClickOnAutoTestObject();           
				Logger.info("RightClick On LeadAutoTestObject is PASSED!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("RightClick On LeadAutoTestObject is Failed!!", e);
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
				if (APOM.DisplayedCannotDeleteErrorSuccessMessage() == true) 
				{
					Logger.info("Displayed 'Cannot Delete' Error Message");
					Thread.sleep(4500);
					try {
						APOM.RightClickOnAutoTestObject();           
						Logger.info("RightClick On LeadAutoTestObject is PASSED!!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("RightClick On LeadAutoTestObject is Failed!!", e);
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
						String randomString = APOM.generateRandomString(APOM.length);
						APOM.InputRename_AutoTestObject.clear();
						APOM.InputRename_AutoTestObject.sendKeys(randomString);
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
				APOM.RightClickonWebhookDropDown();
				Logger.info("Right Click on Webhook DropDown is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Right Click on Webhook DropDown is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(3500);
			try {
				LMP.ClickOnNewObject();
				Logger.info("Click on New Webhook is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on New Webhook is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(3500);
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
				APOM.SelectRouterTypeOption();
				Logger.info("Select Router Type is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Select Router Type is FAILED!!!",e);
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
		}
		else {
			sa.assertTrue(true);
		}	

		Thread.sleep(3500);
		try {
			APOM.ClickOnAutoTestObject();           
			Logger.info("Click On LeadAutoTestObject is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On LeadAutoTestObject is FAILED!", e);
			sa.assertAll();
		}

		Logger.info("=============================================URL Operation=============================================!");
		Thread.sleep(5600);
		try {
			WPOM.EnterURLinsideURLtextarea();
			Logger.info("Enter text in URL textarea is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter text in URL textarea is FAILED!!!",e);
			sa.assertAll();
		}

		Logger.info("======================================Request Type  Operation==============================================!");
		Thread.sleep(2500);
		try {
			WPOM.selectOptionInRequestType();
			Logger.info("select Option In RequestType is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("select Option In RequestType is FAILED!!!",e);
			sa.assertAll();
		}
		Logger.info("=============================== Response Mapping  Operation========================================!");
		Thread.sleep(2500);
		try {
			WPOM.selectDropDownOfResponseMapping();
			Logger.info("select DropDown Of Response Mapping is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("select DropDown Of Response Mapping is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			APOM.SelectAutotestEmailObject();
			Logger.info("Select AutotestObject is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select AutotestObject is Failed !!", e);
			sa.assertAll();
		}
		Logger.info("********************* Save Operation ********************");
		Thread.sleep(2500);
		try {
			APOM.ClickOnApproveButton();
			Logger.info("Click On Approve Button is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Approve Button is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2900);
		try {
			rrp.ApproveSubmitbtnForTaskList();
			Logger.info("Click again Approve button is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click again Approve button is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(5000);
		try {
			rrp.DisplayApproved();
			Logger.info("Display Approved button is PASSED!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Approved button is FAILED!!", e);
			sa.assertAll();
		}

		Logger.info("********************* Go back to Response Mapping Object In Administartion ********************");
		Thread.sleep(4000);
		try {
			dp.ClickOnDropDownForWebhook();
			Logger.info("Click on Webhook DropDown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Webhook DropDown is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			dp.ClickOnDropdownForResponseMaping();
			Logger.info("Click on ResponseMaping DropDown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on ResponseMaping DropDown is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnAutoTestObject();
			Logger.info("Click On LeadAutoTestObject is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On LeadAutoTestObject is Failed",e);
			sa.assertAll();
		}
		driver.navigate().refresh();
		Logger.info("Refreshing The Page!!");
		Thread.sleep(6500);
		Logger.info("//===============================================Details page operation after Used this object in Webhook========================================//");
		Thread.sleep(3500);
		try {
			dp.ClickOndetailsbutton();
			Logger.info("Click On details button is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On details button is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			dp.ClickOnUsedByDropDown();
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
			TextFromUsedByRouterName = dp.GetTextFromUsedByRouterName.getText();
			Logger.info("Fetch used by router name is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Fetch used by router name is Failed",e);
			sa.assertAll();
		}
		Logger.info("********************** Verifying whether Used object can delete or not *********************");
		Thread.sleep(2500);
		try {
			dp.ClickOnApproveButton();
			Logger.info("Click On Approved Button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Approved Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			dp.ClickOnDeletebutton();
			Logger.info("Click On Delete button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnDelete();
			Logger.info("Click On Delete Button	is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			TextFromErrorMessage=dp.GetTextFromErrorMessage.getText();
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

		Logger.info("********* Verify that the 'Used By' object name and the left menu title is Same Or Not, Once clicking the 'Used By' Router name ************");
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
			TextFromLeftMenuTitleBefore =dp.GetTextOfLeftMenuTitle.getText();
			Logger.info("Get Menu Title From Left tree Menu is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Get Menu Title From Left tree Menu is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			dp.ClickUsedByRouterName();
			Logger.info("Click Used By Router Name is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Used By Router Name is FAILED!!!",e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		try {
			TextFromLeftMenuTitleAfter=dp.GetTextOfLeftMenuTitle.getText();
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
			Logger.error("Left menu titlt is same before and after clicking UsedBy object name is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(6500);
		try {
			TextFromDetails=dp.GetTextFromDetails.getText();
			Logger.info("Get Text From Details tab is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Get Text From Details tab is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (TextFromDetails.contentEquals("AutoTestObject")) {
				Logger.info("AutoTest Object Name matched with the name from Details tab is Passed");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("AutoTest Object Name matched with the name from Details tab is Failed",e);
			sa.assertAll();
		}

		Logger.info("********************* Go back to Response Maping Object In Administartion ********************");
		Thread.sleep(3500);
		try {
			dp.ClickOnDropDownForWebhook();
			Logger.info("Click on Webhook DropDown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Webhook DropDown is Failed",e);
			sa.assertAll();
		}

		Logger.info("//===============================================Crud Operation========================================//");
		Logger.info("***************************************Edit Scenario Start**********************************");
		Thread.sleep(3500);
		try {
			APOM.RightClickOnAutoTestObject();           
			Logger.info("Right Click On LeadAutoTestObject is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On LeadAutoTestObject is Failed!!", e);
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

		Logger.info("***************************************Edit LatitudeValue******************************************");
		Thread.sleep(3500);
		try {
			RM.EditWriteLatitudeValue();
			Logger.info("Edit LatitudeValue is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Edit LatitudeValue is FAILED!!!",e);
			sa.assertAll();
		}

		Logger.info("*************************************** ConvertedDateDate******************************************");
		Thread.sleep(2500);
		try {
			RM.WriteConvertedDate();
			Logger.info("Enter ConvertedDate is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter ConvertedDate is FAILED!!!",e);
			sa.assertAll();
		}

		Logger.info("***************************************Edit ConvertedDateDate******************************************");
		Thread.sleep(2500);
		try {
			RM.EditWriteConvertedDate();
			Logger.info("Edit ConvertedDate is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Edit ConvertedDate is FAILED!!!",e);
			sa.assertAll();
		}

		Logger.info("*********************************************Approve***************************************");
		try {
			rrp.ClickOnApprove();
			Logger.info("Click on Approve Button is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Approve Button is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			rrp.ApproveSubmitbtnForTaskList();
			Logger.info("Click again Approve button is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click again Approve button is FAILED!", e);
			sa.assertAll();
		}
		//*************************************************************************************************************
		Thread.sleep(1500);
		try {
			rrp.CollapseAll();
			Logger.info("Click on CollapseAll is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on CollapseAll is Failed", e);
			sa.assertAll();
		}	
		Thread.sleep(1500);
		try {
			RM.ExpandAllForResponseMapping();
			Logger.info("Click on ExpandAll is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on ExpandAll is Failed", e);
			sa.assertAll();
		}

		Logger.info("//========================================Delete Craft scenario=======================================");
		Thread.sleep(3000);	
		try {
			WPOM.ClickOnEditButton();
			Logger.info("Click On Edit Button is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On EditButton is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			ALP.ClickOnDeleteCraft();
			Logger.info("Click On DeleteCraft buton is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DeleteCraft buton is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(6000);
		try {
			if (RM.VerifyApprovedSign()==true) {
				Logger.info("Dispalying Verified Sign is PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Dispalying Verified Sign is FAILED!", e);
			sa.assertAll();

		}

		Logger.info("//======================================RENAME SCENARIO START=============================================//");
		Thread.sleep(4000);
		try {
			APOM.RightClickOnAutoTestObject();           
			Logger.info("Right Click On LeadAutoTestObject is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On LeadAutoTestObject is Failed!!", e);
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
			if (APOM.DisplayLeadAutoTestObjectRename() == true) {
				Logger.info("Display LeadAutoTestObjectRename Object");			
				Thread.sleep(4000);	
				try {
					APOM.ContextClickOnRenameAutoTestObject();
					Logger.info("Right Click On LeadRenamedAutoTestObject is PASSED!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Right Click On LeadRenamedAutoTestObject is FAILED!", e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					LMP.ClickOnDeleteOnClonedAutoTestObject();
					Logger.info("Click On Delete Button is Passed!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Delete Button is FAILED!", e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					LMP.ClickOnDeletebtn();
					Logger.info("Click again Delete Button is Passed!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Delete Button is FAILED!", e);
					sa.assertAll();
				}
				Thread.sleep(400);
				try {
					if (APOM.DisplayedCannotDeleteErrorSuccessMessage() == true) 
					{
						Logger.info("Displayed 'Cannot Delete' Error Message");
						Thread.sleep(4000);
						try {
							APOM.ContextClickOnRenameAutoTestObject();
							Logger.info("Right Click On LeadRenamedAutoTestObject is PASSED!!!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Right Click On LeadRenamedAutoTestObject is FAILED!", e);
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
							String randomString = APOM.generateRandomString(APOM.length);
							APOM.InputRename_AutoTestObject.clear();
							APOM.InputRename_AutoTestObject.sendKeys(randomString);
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
				Thread.sleep(2500);
				APOM.ClickOnCrudFolderDropdown();
				Logger.info("Click On CrudFolder Dropdown is PASSED!!!");
				Thread.sleep(4000);
				try {
					APOM.ContextClickOnRenameAutoTestObject();
					Logger.info("Right Click On LeadRenamedAutoTestObject is PASSED!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Right Click On LeadRenamedAutoTestObject is FAILED!", e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					LMP.ClickOnDeleteOnClonedAutoTestObject();
					Logger.info("Click On Delete Button is Passed!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Delete Button is FAILED!", e);
					sa.assertAll();
				}
				Thread.sleep(2500);
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
					if (APOM.DisplayedCannotDeleteErrorSuccessMessage() == true) 
					{
						Logger.info("Displayed 'Cannot Delete' Error Message");
						Thread.sleep(3500);
						try {
							APOM.ContextClickOnRenameAutoTestObject();
							Logger.info("Right Click On LeadRenamedAutoTestObject is PASSED!!!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Right Click On LeadRenamedAutoTestObject is FAILED!", e);
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
							String randomString = APOM.generateRandomString(APOM.length);
							APOM.InputRename_AutoTestObject.clear();
							APOM.InputRename_AutoTestObject.sendKeys(randomString);
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
			Thread.sleep(3500);
			try {
				APOM.RightClickOnAutoTestObject();           
				Logger.info("Right Click On LeadAutoTestObject is PASSED!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Right Click On LeadAutoTestObject is Failed!!", e);
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
			if (APOM.DisplayLeadAutoTestObjectRename() == true) {
				Logger.info("Display LeadAutoTestObjectRename is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display LeadAutoTestObjectRename is Failed", e);
			sa.assertAll();
		}


		Logger.info("====================================================Clone Scenario==================================================================");
		Thread.sleep(4500);
		while (APOM.DisplayedLeadAutoTestObjectRenameCopy()==true) {
			Logger.info("Displayed LeadAutoTestObjectRenameCopy Object,So Delete that Object");
			Thread.sleep(5000);
			try {
				APOM.RightClickLeadAutoTestObjectAfterClone();
				Logger.info("Right Click On LeadAutoTestObjectRenameCopy Object is PASSED!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Right Click On LeadAutoTestObjectRenameCopy Object is FAILED!", e);
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
				if (APOM.DisplayedCannotDeleteErrorSuccessMessage() == true) 
				{
					Logger.info("Displayed 'Cannot Delete' Error Message");
					Thread.sleep(3500);
					try {
						APOM.RightClickLeadAutoTestObjectAfterClone();           
						Logger.info("RightClick On LeadAutoTestObjectRenameCopy Object is PASSED!!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("RightClick On LeadAutoTestObjectRenameCopy Object is Failed!!", e);
						sa.assertAll();
					}
					Thread.sleep(2500);
					try {
						rrp.ClickOnObjectRename();
						Logger.info("Click on Rename option is PASSED!!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Click on Rename option is FAILED!!!", e);
						sa.assertAll();
					}
					Thread.sleep(2500);
					try {
						String randomString = APOM.generateRandomString(APOM.length);
						APOM.InputRename_AutoTestObject.clear();
						APOM.InputRename_AutoTestObject.sendKeys(randomString);
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

		Thread.sleep(4000);
		try {
			APOM.ContextClickOnRenameAutoTestObject();
			Logger.info("Right Click On LeadRenamedAutoTestObject is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On LeadRenamedAutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickOnCloneAutoTestObject();
			Logger.info("Click On Clone option is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Clone option is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickOnCloneBtn();
			Logger.info("Click On Clone button is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Clone button is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			if (APOM.DisplayCloneAutoTestObject() == true) {
				Logger.info("Displayed Cloned LeadRenameAutoTestObject is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Cloned LeadRenameAutoTestObject is FAILED!", e);
			sa.assertAll();
		}

		Logger.info("//===============================Approve Cloned Object========================================!");
		Thread.sleep(5000);
		try {
			APOM.RightClickLeadAutoTestObjectAfterClone();
			Logger.info("Right Click On LeadAutoTestObjectRenameCopy Object is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On LeadAutoTestObjectRenameCopy Object is FAILED!", e);
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
			rrp.ApproveSubmitbtnForTaskList();
			Logger.info("Click again Approve button is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click again Approve button is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(4200);
		try {
			rrp.DisplayApproved();
			Logger.info("Displayed Approved Button is PASSED!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Approved Button is FAILED!!",e);
			sa.assertAll();
		}

		Logger.info("********************************DELETE CLONED OBJECT SCENARIO*********************************");
		Thread.sleep(3000);
		try {
			APOM.ClickOnDeleteButtonForWebhook();
			Logger.info("Click On Delete Button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnDelete();
			Logger.info("Click On Delete Button	is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(400);
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
		try {
			APOM.ContextClickOnRenameAutoTestObject();
			Logger.info("Right Click On LeadRenamedAutoTestObject is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On LeadRenamedAutoTestObject is FAILED!", e);
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
			APOM.SelectFolderToAutotestObject();
			Logger.info("Select Folder to move the Autotest object is Passed !!!");
		} catch (Exception e) {
			Logger.info("Folder Not Found!! Craeting New Folder.");
			Thread.sleep(2500);
			rrp.ClickOnCancel();
			Logger.info("Click On Cancel button is Passed");
			Thread.sleep(4000);
			APOM.ContextClickOnResponseMapping();
			Logger.info("Right Click On Response Mapping is Passed");
			Thread.sleep(2500);
			LMP.ClickOnNewFolder();
			Logger.info("Click on New Response Mapping is Passed");
			Thread.sleep(2500);
			APOM.NameInObject();
			Logger.info("Enter Folder Name is Passed");
			Thread.sleep(2500);
			LMP.clickOnSaveNewObject();
			Logger.info("Click On Save is Passed");
			Thread.sleep(4800);
			try {
				APOM.ContextClickOnRenameAutoTestObject();
				Logger.info("Right Click On LeadRenamedAutoTestObject is Passed!!!");
			} catch (Exception g) {
				sa.assertTrue(false);
				Logger.error("Right Click On LeadRenamedAutoTestObject is FAILED!", g);
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
				APOM.SelectFolderToAutotestObject();
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
			APOM.ContextClickOnRenameAutoTestObject();
			Logger.info("Right Click On LeadRenamedAutoTestObject is Passed!!!");
		} catch (Exception g) {
			sa.assertTrue(false);
			Logger.error("Right Click On LeadRenamedAutoTestObject is FAILED!", g);
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
			APOM.SelectMainFolder();
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

		//***
		Logger.info("//==================================== OverView Page Opeartion After approved  ==================================");
		Thread.sleep(4000);
		try {
			APOM.ClickOnResponseMappingFeature();
			Logger.info("Click On ResponseMapping Feature is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on ResponseMapping Feature is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if(APOM.DisplayResponseMappingOverview()==true) {
				Logger.info("Display ResponseMapping OverView Page is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display ResponseMapping OverView Page is Failed", e);
			sa.assertAll();
		}


		Logger.info("*****************Verifying Column Header Check Is Disabled******************");
		Thread.sleep(2500);
		try {
			if(APOM.DisplayedColumnHeaderCheckIsDisabled()==true) {
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
			APOM.EnterTextInFilterBox();
			Logger.info("Enter Text In FilterBox is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Text In FilterBox is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			if( APOM.DisplayedLeadAutoTestObjectRename()==true) {
				Logger.info("Displayed LeadAutoTestObjectRename is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed LeadAutoTestObjectRename is Failled", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		if (APOM.DisplayedLeadAutTestObjectRenameCheckBox()==true) {
			Logger.info("Displayed LeadAutTestObjectRename CheckBox is Passed");
			try {
				if (APOM.DisplayedLeadAutoTestObjectRenameIsNotUsed() == true) {
					Logger.info("Displayed LeadAutoTestObjectRename is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed LeadAutoTestObjectRename is Failled", e);
				sa.assertAll();
			} 
		}else {
			try {
				if( APOM.DisplayedLeadAutoTestObjectRenameIsUsed()==true) {
					Logger.info("Displayed LeadAutoTestObjectRename Is Used is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed LeadAutoTestObjectRename Is Used is Failled", e);
				sa.assertAll();
			}
		}
		Thread.sleep(1500);
		try {
			APOM.ClearTestFromTheFilterBox();
			Logger.info("Clear Test From The FilterBox is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Clear Test From The FilterBox is FAILED!!", e);
			sa.assertAll();
		}

		//****
	}
}
