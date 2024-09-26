package com.leadAngel.testCases;
import java.util.List;
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
import com.leadAngel.pageObjects.LeadRouterPageObjectModel;
import com.leadAngel.pageObjects.LoginPage;
import com.leadAngel.pageObjects.RoundRobinPage;
import io.qameta.allure.Description;
import io.qameta.allure.Step;

@Listeners({ com.leadAngel.utilities.TestAllureListener.class })
public class TC_Sanity_CRMaccountFilter_Leadamanagement extends BaseClass{
	private final static Logger Logger = org.apache.logging.log4j.LogManager
			.getLogger(TC_Sanity_CRMaccountFilter_Leadamanagement.class);
	@Test(description = "LeadManagement_DataDictionary _Section")
	@Step("LeadManagement_DataDictionary_CRM_AccFilter")
	@Description("LeadManagement_DataDictionary_CRM_AccFilter")

	public void LeadManagementTest() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		CRM_Account_FilterPage crm = new CRM_Account_FilterPage(driver);
		AEtoSDR_Page ae = new AEtoSDR_Page(driver);
		LeadManagementPage LMP = new LeadManagementPage(driver);
		RoundRobinPage rrp = new RoundRobinPage(driver); // Used For Saving... Display
		DetailsPage_SalesTeam detrrt = new DetailsPage_SalesTeam(driver); // Used For Details Page
		CRM_Lead_FilterPage LF = new CRM_Lead_FilterPage(driver);
		AccountListPage ALP = new AccountListPage(driver);
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
		Thread.sleep(4500);
		try {
			LMP.ClickOnDataDictionary();
			Logger.info("Click on Data Dictionary is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Data Dictionary is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.RightClickonCRM_AccFilter();
			Logger.info("Right Click on CRM Account Filter is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click on CRM Account Filter is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickOnNewObject();
			Logger.info("Click on New CRM Account Filter is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on New CRM Account Filter is Failed",e);
			sa.assertAll();
		}
		Logger.info("//===============================CREATE OBJECT SCENARIO START========================================!");
		Thread.sleep(2500);
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
			Logger.info("Click on Save Button CRM Account Filter is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Save Button CRM Account Filter is Failed", e);
			sa.assertAll();
		} 

		Thread.sleep(800);
		if(ae.DisplaySameAEerror() == true) {
			Logger.info("Duplicate Object Found, Try to delete the Object NOW!!! then Creating New Object!!");
			Thread.sleep(4000);
			try {
				crm.clickCRMaccountFilterDropDown();
				Logger.info("Click on CRMaccountFilter DropDown is passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on CRMaccountFilter DropDown  is FAILED!!", e);
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
				LMP.RightClickonCRM_AccFilter();
				Logger.info("Right Click on CRM Account Filter is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Right Click on CRM Account Filter is Failed",e);
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
			if( LR.DisplayCRMaccountFilterView()==true) {
				Thread.sleep(4000);
				Logger.info("Display CRM account Filter Overview");
				Thread.sleep(3500);
				try {
					crm.clickCRMaccountFilterDropDown();
					Logger.info("Click on CRMaccountFilter DropDown is passed");
				}catch(Exception e) {
					sa.assertTrue(false);
					Logger.error("Click on CRMaccountFilter DropDown  is FAILED!!", e);
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

		Thread.sleep(3500);
		try {
			crm.ClickonAccountOwner();
			Logger.info("Click on AccountOwner is passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on AccountOwner is FAILED!!", e);
			sa.assertAll();
		}

		Logger.info("//===================================== DRAG&DROP ABOUTME ATTRIBUTE =====================================//");
		Thread.sleep(3500);
		try {
			crm.AboutMeDNDinCRM();
			Logger.info("DragAndDrop AboutMe is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("DragAndDrop About Me is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			rrp.ClickDropDownAboutMe();
			Logger.info("Click on DropDown AboutMe is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on DropDown AboutMe is Failed", e);
			sa.assertAll();
		}
		List<WebElement> AllLinksOfAboutMe = driver.findElements(By.xpath("//label[text()='About Me']/..//select//option[text()]"));
		int countAboutMe=AllLinksOfAboutMe.size();
		for (int i = 1; i < countAboutMe; i++) {

			WebElement getLinkAboutMe = AllLinksOfAboutMe.get(i);
			String getLinkTextAboutMe = getLinkAboutMe.getText();
			Thread.sleep(1500);

			try {
				getLinkAboutMe.click();
				Logger.info("Select "+getLinkTextAboutMe+" is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select "+getLinkTextAboutMe+" is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(500);
			try {
				if( LR.DisplayedAbouteMeSelectBoxNgValid()==true) {
					Logger.info("Displayed Select Box is not red");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Select Box is red", e);
				sa.assertAll();
			}
			if (getLinkTextAboutMe.contains("contains") || getLinkTextAboutMe.contains("does not contain")
					||getLinkTextAboutMe.contains("starts with")||getLinkTextAboutMe.contains("does not start with")) {
				Thread.sleep(1500);
				try {
					rrp.InputAboutMeContains();
					Logger.info("Input on AboutMe is PASSED!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Input on AboutMe is FAILED!!", e);
					sa.assertAll();
				}	
				Thread.sleep(500);
				try {
					if( LR.DisplayedAbouteMeSelectBoxNgValid()==true) {
						Logger.info("Displayed Select Box is not red");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed Select Box is red", e);
					sa.assertAll();
				}
				continue;
			}
			else if (getLinkTextAboutMe.contains("is empty")||getLinkTextAboutMe.contains("is not empty")) {
				continue;
			}
			else if (getLinkTextAboutMe.contains("in")||getLinkTextAboutMe.contains("not in")) {
				Thread.sleep(1500);
				try {
					ALP.ClickOnAddbtn();
					Logger.info("Click on Add Button is PASSED!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click on Add Button is PASSED!!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					ALP.SelectOneAcc();
					Logger.info("Selected One Account is PASSED!!");
				} catch (Exception e) {
					rrp.TextAreaLongitudeAlphabet();
					Logger.error("Enter text in TextArea is Passed!!",e);
				}	
				Thread.sleep(1500);
				try {
					ALP.ClickOnSavebtn();
					Logger.info("Click on Save button PASSED!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click on Save button FAILED!!", e);
					sa.assertAll();
				}
				Thread.sleep(500);
				try {
					if( LR.DisplayedAbouteMeInputBoxNgValid()==true) {
						Logger.info("Displayed Input Box is not red");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed Input Box is red", e);
					sa.assertAll();
				}
				continue;
			}	
		}

		Logger.info("//======================================= DRAG&DROP LONGITUDE ATTRIBUTE ==================================//");
		Thread.sleep(3500);
		try {
			rrp.Longitude_DND();
			Logger.info("DragAndDrop Longitude is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("DragAndDrop Longitude is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			rrp.ClickDropDownLongitude();
			Thread.sleep(2500);
			rrp.ClickDropDownLongitude();
			Logger.info("Click on DropDown Longitude is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on DropDown Longitude is Failed", e);
			sa.assertAll();
		}
		List<WebElement> AllLinksOfLongitude = driver.findElements(By.xpath("//label[text()='Longitude ']/..//select//option[text()]"));
		int countLongitude=AllLinksOfLongitude.size();
		for (int j =1; j < countLongitude; j++) {
			WebElement getLinkLongitude = AllLinksOfLongitude.get(j);
			String getLinkTextLongitude = getLinkLongitude.getText();
			Thread.sleep(1500);
			try {
				getLinkLongitude.click();
				Logger.info("Select "+getLinkTextLongitude+" is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select "+getLinkTextLongitude+" is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(500);
			try {
				if( LR.DisplayedLongitudeSelectBoxNgValid()==true) {
					Logger.info("Displayed Select Box is not red");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Select Box is red", e);
				sa.assertAll();
			}
			if (getLinkTextLongitude.contains("is empty")||getLinkTextLongitude.contains("is not empty")) {
				continue;
			}
			else if (getLinkTextLongitude.contains("in")||getLinkTextLongitude.contains("not in")) {
				Thread.sleep(1500);
				try {
					rrp.AddbtnForLongitude();
					Logger.info("Click on Add Button is PASSED!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click on Add Button is PASSED!!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					rrp.EnterFreeTestForIN();
					Logger.info("Enter free text is PASSED!!");
				} catch (Exception e) {
					rrp.TextAreaLongitudeAlphabet();
					Logger.error("Enter free text is Failed!!",e);
				}	
				Thread.sleep(1500);
				try {
					ALP.ClickOnSavebtn();
					Logger.info("Click on Save button is PASSED!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click on Save button is FAILED!!", e);
					sa.assertAll();
				}
				Thread.sleep(500);
				try {
					if( LR.DisplayedLongitudeInputBoxNgValid1()==true) {
						Logger.info("Dispalyed Input Box is not red");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed Input Box is red", e);
					sa.assertAll();
				}
				continue;
			}
			else if (getLinkTextLongitude.contains("is greater than")||getLinkTextLongitude.contains("is smaller than") ||
					getLinkTextLongitude.contains("is at least")||getLinkTextLongitude.contains("is at most")) {
				Thread.sleep(1500);
				try {
					rrp.LongitudeInputBoxForIsGreaterThan();
					sa.assertTrue(true);
					Logger.info("Input on Longitude is PASSED!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Input on Longitude is FAILED!!", e);
					sa.assertAll();
				}
				Thread.sleep(500);
				try {
					if( LR.DisplayedLongitudeInputBoxNgValid1()==true) {
						Logger.info("Dispalyed Input Box is not red");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed Input Box is red", e);
					sa.assertAll();
				}
				continue;
			}
			else if (getLinkTextLongitude.contains("between")) {
				Thread.sleep(1500);
				try {
					rrp.LongitudeInputBoxForBetweenBox1();
					sa.assertTrue(true);
					Logger.info("Longitude Input Box For Between Box1 is PASSED!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Longitude Input Box For Between Box1 is FAILED!!", e);
					sa.assertAll();
				}
				Thread.sleep(500);
				try {
					if( LR.DisplayedLongitudeInputBoxNgValid1()==true) {
						Logger.info("Dispalyed Input Box1 is not red");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed Input Box1 is red", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					rrp.LongitudeInputBoxForBetweenBox2();
					sa.assertTrue(true);
					Logger.info("Longitude Input Box For Between Box2 is PASSED!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Longitude Input Box For Between Box2 is FAILED!!", e);
					sa.assertAll();
				}
				Thread.sleep(500);
				try {
					if( LR.DisplayedLongitudeInputBoxNgValid2()==true) {
						Logger.info("Dispalyed Input Box2 is not red");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed Input Box2 is red", e);
					sa.assertAll();
				}
				continue;
			}
		}

		Logger.info("//========================================= DRAG&DROP ACTIVE ATTRIBUTE===================================//");
		Thread.sleep(3500);
		try {
			rrp.Active_DND();
			Logger.info("Drag And Drop Active is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag and Drop Active is FAILED", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			rrp.ClickDropDownActivebox1();
			Thread.sleep(2500);
			rrp.ClickDropDownActivebox1();
			Logger.info("Click on DropDown ActiveBox1 is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on DropDown ActiveBox1 is Failed", e);
			sa.assertAll();
		}
		List<WebElement> AllLinksOfActive = driver.findElements(By.xpath("(//label[text()='Active']/..//select[@name='seldropDown'])[1]//option[text()]"));
		int countActive=AllLinksOfActive.size();

		for (int k = 1; k <countActive; k++) {
			WebElement getLinkActive= AllLinksOfActive.get(k);
			String getLinkTextActive= getLinkActive.getText();
			Thread.sleep(1500);
			try {
				getLinkActive.click();
				Logger.info("Select "+getLinkTextActive+" is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select "+getLinkTextActive+" is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(500);
			try {
				if( LR.DisplayedActiveSelectBoxNgValid1()==true) {
					Logger.info("Dispalyed Select Box is not red");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Select Box is red", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				rrp.ClickDropDownActivebox2();
				Thread.sleep(1500);
				rrp.ClickDropDownActivebox2();
				Logger.info("Click on DropDown ActiveBox2 is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on DropDown ActiveBox2 is Failed", e);
				sa.assertAll();
			}
			List<WebElement> AllLinksOfActiveBox2 = driver.findElements(By.xpath("(//label[text()='Active']/..//select[@name='seldropDown'])[2]//option[text()]"));
			int countActiveBox2=AllLinksOfActiveBox2.size();

			for (int L = 1; L <countActiveBox2; L++) {

				WebElement getLinkActiveBox2= AllLinksOfActiveBox2.get(L);
				String getLinkTextActiveBox2= getLinkActiveBox2.getText();
				Thread.sleep(1500);
				try {
					getLinkActiveBox2.click();
					Logger.info("Select "+getLinkTextActiveBox2+" is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select "+getLinkTextActiveBox2+" is Failed",e);
					sa.assertAll();
				}
				Thread.sleep(500);
				try {
					if( LR.DisplayedActiveSelectBoxNgValid2()==true) {
						Logger.info("Dispalyed Select Box2 is not red");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed Select Box2 is red", e);
					sa.assertAll();
				}
			}
		}

		Logger.info("//======================================== DRAG&DROP CRETED DATE ATTRIBUTE ==================================//");
		Thread.sleep(3500);
		try {
			rrp.CreatedDate_DND();
			Logger.info("DragAndDrop Created Date is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("DragAndDrop Created Date is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			rrp.ClickDropDownCreateDateFirstBox();
			Thread.sleep(2500);
			rrp.ClickDropDownCreateDateFirstBox();
			Logger.info("Click on DropDown CreateDateFirstBox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on DropDown CreateDateFirstBox is Failed", e);
			sa.assertAll();
		}
		List<WebElement> AllLinksOfCreatedDate = driver.findElements(By.xpath("(//label[text()='Created Date']/..//select[@name='seldropDown'])[1]//option[text()]"));
		int countCreatedDate=AllLinksOfCreatedDate.size();
		for (int M = 1; M <countCreatedDate; M++) {

			WebElement getLinkCreatedDate= AllLinksOfCreatedDate.get(M);
			String getLinkTextCreatedDate= getLinkCreatedDate.getText();
			Thread.sleep(1500);
			try {
				getLinkCreatedDate.click();
				Logger.info("Select "+getLinkTextCreatedDate+" is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select "+getLinkTextCreatedDate+" is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(500);
			try {
				if( LR.DisplayedCreatedDateSelectBoxNgValid1()==true) {
					Logger.info("Dispalyed Select Box is not red");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Select Box is red", e);
				sa.assertAll();
			}
			if (getLinkTextCreatedDate.contentEquals("before")==true||getLinkTextCreatedDate.contentEquals("after")==true||getLinkTextCreatedDate.contentEquals("on or before")==true
					||getLinkTextCreatedDate.contentEquals("on or after")==true||getLinkTextCreatedDate.contentEquals("is")==true||getLinkTextCreatedDate.contentEquals("is not")==true) {

				Thread.sleep(1500);
				try {
					rrp.ClickOnCalendarButton();
					Logger.info("Click On Calendar CreatedDate Button is PASSED!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Calendar CreatedDate Button is FAILED!!!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					rrp.ClickOnDate();
					Logger.info("Click On Date is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Date is FAILED", e);
					sa.assertAll();
				}
				Thread.sleep(500);
				try {
					if( LR.DisplayedCreatedDateInputBoxNgValid1()==true) {
						Logger.info("Dispalyed Input Box is not red");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed Input Box is red", e);
					sa.assertAll();
				}
				continue;
			}
			else if (getLinkTextCreatedDate.contentEquals("in past")==true||getLinkTextCreatedDate.contentEquals("in past before")==true
					||getLinkTextCreatedDate.contentEquals("in future")==true||getLinkTextCreatedDate.contentEquals("in future after")==true) {
				Thread.sleep(1800);
				try {
					rrp.CreatedDateInputBoxForInPastBox2();
					Logger.info("CreatedDate Input Box For Box2 is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("CreatedDate Input Box For Box2 is FAILED", e);
					sa.assertAll();
				}
				Thread.sleep(500);
				try {
					if( LR.DisplayedCreatedDateInputBoxNgValid1()==true) {
						Logger.info("Dispalyed Input Box is not red");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed Input Box is red", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					rrp.ClickDropDownCreateDate2forInPast();
					Logger.info("Click on DropDown CreateDate2forInPast is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click on DropDown CreateDate2forInPast is Failed", e);
					sa.assertAll();
				}


				List<WebElement> AllLinksOfCreatedDateList = driver.findElements(By.xpath("(//label[text()='Created Date']//..//select)[2]//option[text()]"));
				int countCreatedDateList=AllLinksOfCreatedDateList.size();
				for (int N = 1; N <countCreatedDateList; N++) {

					WebElement getLinkCreatedDateList= AllLinksOfCreatedDateList.get(N);
					String getLinkTextCreatedDateList= getLinkCreatedDateList.getText();
					Thread.sleep(1500);
					try {
						getLinkCreatedDateList.click();
						Logger.info("Select "+getLinkTextCreatedDateList+" is Passed");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Select "+getLinkTextCreatedDateList+" is Failed",e);
						sa.assertAll();
					}
					Thread.sleep(500);
					try {
						if( LR.DisplayedCreatedDateSelectBoxNgValid2()==true) {
							Logger.info("Dispalyed Select Box is not red");
						}
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Displayed Select Box is red", e);
						sa.assertAll();
					}
				}
				continue;
			}	
			else if (getLinkTextCreatedDate.contains("between")==true) {
				Thread.sleep(1500);
				try {
					rrp.CreatedDateCalendarButtonBox1();
					Logger.info("Click On CreatedDate Calendar Button Box1 is PASSED!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On CreatedDate Calendar Button Box1 is FAILED!!!", e);
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
				Thread.sleep(500);
				try {
					if( LR.DisplayedCreatedDateInputBoxNgValid1()==true) {
						Logger.info("Dispalyed Input Box1 is not red");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed Input Box1 is red", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					rrp.CreatedDateCalendarButtonBox2();
					Logger.info("Click On CreatedDate Calendar Button Box2 is PASSED!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On CreatedDate Calendar Button Box2 is FAILED!!!", e);
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
				Thread.sleep(500);
				try {
					if( LR.DisplayedCreatedDateInputBoxNgValid2()==true) {
						Logger.info("Dispalyed Input Box2 is not red");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed Input Box2 is red", e);
					sa.assertAll();
				}
				continue;
			}
			else if (getLinkTextCreatedDate.contains("in time frame")==true) {
				Thread.sleep(1500);
				try {
					rrp.ClickDropDownCreateDate2forInPast();
					Thread.sleep(1500);
					rrp.ClickDropDownCreateDate2forInPast();
					Logger.info("Click on DropDown CreateDate for InTimeFrame is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click on DropDown CreateDate for InTimeFrame is Failed", e);
					sa.assertAll();
				}

				List<WebElement> AllLinksOfCreatedDateFrameList = driver.findElements(By.xpath("(//label[text()='Created Date']/..//select)[2]//option[text()]"));
				int countCreatedDateFrameList=AllLinksOfCreatedDateFrameList.size();

				for (int G = 1; G <countCreatedDateFrameList; G++) {

					WebElement getLinkCreatedDateFrameList= AllLinksOfCreatedDateFrameList.get(G);
					String getLinkTextCreatedDateFrameList= getLinkCreatedDateFrameList.getText();
					Thread.sleep(1500);
					try {
						getLinkCreatedDateFrameList.click();
						Logger.info("Select "+getLinkTextCreatedDateFrameList+" is Passed");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Select "+getLinkTextCreatedDateFrameList+" is Failed",e);
						sa.assertAll();
					}
					Thread.sleep(500);
					try {
						if( LR.DisplayedCreatedDateSelectBoxNgValid1()==true) {
							Logger.info("Dispalyed Select Box is not red");
						}
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Displayed Select Box is red", e);
						sa.assertAll();
					}
				}	
				continue;
			}
			else if (getLinkTextCreatedDate.contains("is today")==true||getLinkTextCreatedDate.contains("is empty")==true||
					getLinkTextCreatedDate.contains("is not empty")==true) {

				continue;
			}
		}

		Logger.info("//===================================== DRAG&DROP Billing City ATTRIBUTE =====================================//");
		Thread.sleep(3500);
		try {
			crm.SmartAccountAttributes();
			Logger.info("Click on Smart Account Attributes is passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Smart Account Attributes is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			crm.BillingCityDND();
			Logger.info("DragAndDrop BillingCity is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("DragAndDrop BillingCity is FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			ALP.SelectIninAccName();
			Thread.sleep(2500);
			ALP.SelectIninAccName();
			Logger.info("Select In Option is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select In Option is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(500);
		try {
			if( LR.DisplayedBillingCitySelectBoxNgValid()==true) {
				Logger.info("Dispalyed Select Box is not red");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Select Box is red", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			ALP.AddbtnForBillingCity();
			Logger.info("Click on Add button For BillingCity is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Add button For BillingCity is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			ALP.SelectOneAcc();
			Logger.info("Selected One Account is PASSED!!");
		} catch (Exception e) {
			rrp.TextAreaLongitudeAlphabet();
			Logger.error("Enter text in TextArea is Failed!!",e);
		}	
		Thread.sleep(2500);
		try {
			ALP.ClickOnSavebtn();
			Logger.info("Click on Save button is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Save button is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(500);
		try {
			if( LR.DisplayedBillingCityInputBoxNgValid()==true) {
				Logger.info("Dispalyed Input Box is not red");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Input Box is red", e);
			sa.assertAll();
		}
		Logger.info("*********************** Search Box and refresh Button Operation **************************");
		Thread.sleep(2500);
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
		Thread.sleep(2500);
		try {
			crm.ClickonAccountOwner();
			Logger.info("Click on AccountOwner is passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on AccountOwner is FAILED!!", e);
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
			Logger.info("Select Custom Filter Option is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Custom Filter Option is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			crm.InputForCutomFilterAccList();
			Logger.info("Input For CutomFilter is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Input For CutomFilter is Failed", e);
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

		Logger.info("//================================================ENTERING DETAILS PAGE===============================================");
		Thread.sleep(3500);
		try {
			rrp.ClickOnDetail();
			Logger.info("Click on Details Page is Passed!!!");
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
		Logger.info("Enter description is Passed");
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
		Thread.sleep(2500);
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
		Thread.sleep(4000);
		try {
			ae.DisplayApproved();
			Logger.info("Display Approved button is PASSED!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Approved button is FAILED!!", e);
			sa.assertAll();
		}
		Logger.info("//========================================Delete Craft scenario=======================================");
		Thread.sleep(5500);	
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
			LR.ClickOnCRMAccountFilterFeature();
			Logger.info("Click On CRMAccountFilter Feature is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on CRMAccountFilter Feature is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(5000);
		try {
			if( LR.DisplayCRMaccountFilterView()==true) {
				Logger.info("Display CRMAccountFilter OverView Page is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display CRMAccountFilter OverView Page is Failed", e);
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
