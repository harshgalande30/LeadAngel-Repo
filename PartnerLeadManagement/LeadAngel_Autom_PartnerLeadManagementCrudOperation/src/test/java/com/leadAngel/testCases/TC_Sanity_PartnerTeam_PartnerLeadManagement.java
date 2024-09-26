package com.leadAngel.testCases;
import java.util.List;
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
import com.leadAngel.pageObjects.PartnerLeadManagement_PageObjectModel;
import com.leadAngel.pageObjects.RoundRobinPage;
@Listeners({ com.leadAngel.utilities.TestAllureListener.class })
@Test
public class TC_Sanity_PartnerTeam_PartnerLeadManagement extends BaseClass {
	private static final Logger Logger = LogManager.getLogger(TC_Sanity_PartnerTeam_PartnerLeadManagement.class);

	public void PrtnerLeadManagementTest() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		CRM_Lead_FilterPage LF = new CRM_Lead_FilterPage(driver);
		CRM_Account_FilterPage crm = new CRM_Account_FilterPage(driver);
		RoundRobinPage rrp = new RoundRobinPage(driver); 
		DetailsPage_SalesTeam detrrt = new DetailsPage_SalesTeam(driver); 
		AEtoSDR_Page ae = new AEtoSDR_Page(driver);
		LeadManagementPage LMP = new LeadManagementPage(driver);
		LeadRouterPageObjectModel LR=new LeadRouterPageObjectModel(driver);
		AccountMaanagement_PageObjectModel AM=new AccountMaanagement_PageObjectModel(driver);
		PartnerLeadManagement_PageObjectModel PLM=new PartnerLeadManagement_PageObjectModel(driver);
		AccountListPage ALP = new AccountListPage(driver);

		Thread.sleep(3500);
		try {
			PLM.PartnerLeadManagement();
			Logger.info("Click on PartnerLeadManagement is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on PartnerLeadManagement is FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickonSalesTeam();
			Logger.info("Click on Sales Team Dropdown is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Sales Team Dropdown is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			PLM.RightClickOnPartnerTeam();
			Logger.info("RightClick On PartnerTeam is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("RightClick On PartnerTeam is FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickOnNewObject();
			Logger.info("Click on New PartnerTeam is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on New PartnerTeam is FAILED!!", e);
			sa.assertAll();
		}


		Logger.info("//===============================CREATE OBJECT SCENARIO START========================================!");
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
				PLM.PartnerTeamDropDown();
				Logger.info("Click on PartnerTeam DropDown is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on PartnerTeam DropDown is FAILED!!", e);
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
				PLM.RightClickOnPartnerTeam();
				Logger.info("Right Click On PartnerTeam is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Right Click On PartnerTeam is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(3800);
			try {
				LMP.ClickOnNewObject();
				Logger.info("Click on New PartnerTeam is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on New PartnerTeam is FAILED!!", e);
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
		Thread.sleep(5500);
		try {
			Thread.sleep(2500);
			if( PLM.DisplayPartnerTeamOverView()==true) {
				Logger.info("Displayed PartnerTeam OverView Page");
				{
					Thread.sleep(3500);
					try {
						PLM.PartnerTeamDropDown();
						Logger.info("Click on PartnerTeam DropDown is Passed");
					}catch(Exception e) {
						sa.assertTrue(false);
						Logger.error("Click on PartnerTeam DropDown is FAILED!!", e);
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
				}
			}
		} catch (Exception e) {
			sa.assertTrue(true);
		}
		Thread.sleep(3500);
		try {
			PLM.ClickOnPartnerGroup();
			Logger.info("Click On PartnerGroup is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On PartnerGroup is FAILED!!",e);
			sa.assertAll();
		}




		Logger.info("//===================================== DRAG&DROP PartnerName ATTRIBUTE =====================================//");
		Thread.sleep(3500);
		try {
			PLM.PartnerName_DND();
			Logger.info("Drag and Drop PartnerName is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag and Drop PartnerName is FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			LF.ClickDropDownPartnerName();
			Logger.info("Click on DropDown PartnerName is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on DropDown PartnerName is Failed", e);
			sa.assertAll();
		}
		List<WebElement> AllLinksOfFirstName = driver.findElements(By.xpath("//label[text()='Partner Name']/..//select//option[text()]"));
		int countAboutMe=AllLinksOfFirstName.size();
		for (int i=1;i<countAboutMe;i++) {

			WebElement getLinkFirstName = AllLinksOfFirstName.get(i);
			String getLinkTextFirstName = getLinkFirstName.getText();
			Thread.sleep(2000);

			try {
				getLinkFirstName.click();
				Logger.info("Select "+getLinkTextFirstName+" is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select "+getLinkTextFirstName+" is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(500);
			try {
				if( LR.DisplayedPartnerNameSelectBoxNgValid()==true) {
					Logger.info("Displayed Select Box is not red");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Select Box is red",e);
				sa.assertAll();
			}

			if (getLinkTextFirstName.contentEquals("contains") || getLinkTextFirstName.contentEquals("does not contain")
					||getLinkTextFirstName.contentEquals("starts with")||getLinkTextFirstName.contentEquals("does not start with")) {
				Thread.sleep(2000);
				try {
					LF.PartnertNameContainsInput();
					Logger.info("Input on PartnerName is PASSED!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Input on PartnerName is FAILED!!", e);
					sa.assertAll();
				}	
				Thread.sleep(500);
				try {
					if( LR.DisplayedPartnerNameInputBoxNgValid()==true) {
						Logger.info("Displayed Input Box is not red");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed Input Box is red",e);
					sa.assertAll();
				}
				continue;

			}
			else if (getLinkTextFirstName.contentEquals("is empty")||getLinkTextFirstName.contentEquals("is not empty")) {
				continue;
			}
			else if (getLinkTextFirstName.contentEquals("in")||getLinkTextFirstName.contentEquals("not in")) {
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
					Logger.error("Enter text in TextArea is Failed!!");
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
					if( LR.DisplayedPartnerNameInputBoxNgValid()==true) {
						Logger.info("Displayed Input Box is not red");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed Input Box is red",e);
					sa.assertAll();
				}
				continue;
			}	
		}

		Logger.info("//======================================= DRAG&DROP PartnerId ATTRIBUTE ==================================//");
		Thread.sleep(3500);
		try {
			PLM.PartnerID_DND();
			Logger.info("Drag and Drop PartnerID is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag and Drop PartnerID is FAILED!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			rrp.ClickDropDownPartnerID();
			Thread.sleep(2500);
			rrp.ClickDropDownPartnerID();
			Logger.info("Click on DropDown Partner Id is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on DropDown Partner Id is Failed", e);
			sa.assertAll();
		}
		List<WebElement> AllLinksOfLongitude = driver.findElements(By.xpath("//label[text()='Partner ID ']/..//select//option[text()]"));
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
				if( LR.DisplayedPartnerIDSelectBoxBoxNgValid()==true) {
					Logger.info("Displayed Select Box is not red");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Select Box is red",e);
				sa.assertAll();
			}
			if (getLinkTextLongitude.contains("is empty")||getLinkTextLongitude.contains("is not empty")) {
				continue;
			}
			else if (getLinkTextLongitude.contains("in")||getLinkTextLongitude.contains("not in")) {
				Thread.sleep(1500);
				try {
					rrp.AddbtnForPartnerID();
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
					rrp.EnterFreeTestForIN();
					Logger.error("Enter numbers in TextArea is Failed!!");
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
					if( LR.DisplayedPartnerIDInputBoxNgValid()==true) {
						Logger.info("Displayed Input Box is not red");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed Input Box is red",e);
					sa.assertAll();
				}
				continue;
			}
			else if (getLinkTextLongitude.contains("is greater than")||getLinkTextLongitude.contains("is smaller than") ||
					getLinkTextLongitude.contains("is at least")||getLinkTextLongitude.contains("is at most")) {
				Thread.sleep(1500);
				try {
					rrp.PartnerIDInputBoxForIsGreaterThan();
					sa.assertTrue(true);
					Logger.info("Input on Partner ID is PASSED!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Input on Partner ID is FAILED!!", e);
					sa.assertAll();
				}
				Thread.sleep(500);
				try {
					if( LR.DisplayedPartnerIDInputBoxNgValid()==true) {
						Logger.info("Displayed Input Box is not red");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed Input Box is red",e);
					sa.assertAll();
				}
				continue;
			}
			else if (getLinkTextLongitude.contains("between")) {
				Thread.sleep(1500);
				try {
					rrp.PartnerIDInputBoxForBetweenBox1();
					sa.assertTrue(true);
					Logger.info("Partner ID Input Box For Between Box1 is PASSED!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Partner ID Input Box For Between Box1 is FAILED!!", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					rrp.PartnerIDInputBoxForBetweenBox2();
					sa.assertTrue(true);
					Logger.info("Partner ID Input Box For Between Box2 is PASSED!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Partner ID Input Box For Between Box2 is FAILED!!", e);
					sa.assertAll();
				}
				Thread.sleep(500);
				try {
					if( LR.DisplayedPartnerIDInputBoxNgValid()==true) {
						Logger.info("Displayed Input Box is not red");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed Input Box is red",e);
					sa.assertAll();
				}
				continue;
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
		Thread.sleep(3000);
		try {
			PLM.ClickOnPartnerGroup();
			Logger.info("Click On PartnerGroup is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On PartnerGroup is FAILED!!",e);
			sa.assertAll();
		}
		//*************************************************************************************************************
		Thread.sleep(1500);
		try {
			rrp.ClickDefaultFilterButton();
			Logger.info("Click on DefaultFilter Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on DefaultFilter Button is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			rrp.SelectCustomFilterOption();
			Logger.info("Select Custom Filter Option is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select CustomFilter Option is Failed", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			rrp.InputForCutomFilterForPartnerTeam();
			Logger.info("Input For CutomFilter  is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Input For CutomFilter is Failed", e);
			sa.assertAll();
		}
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
			rrp.ExpandAll();
			Logger.info("Click on ExpandAll is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on ExpandAll is Failed", e);
			sa.assertAll();
		}

		Logger.info("//================================================ENTERING DETAILS PAGE===============================================");
		Thread.sleep(3000);
		try {
			rrp.ClickOnDetail();
			Logger.info("Click on Details Button is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Details Button is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		detrrt.ClickOnEditbtn();
		Logger.info("Click On Description Edit button is Passed");
		Thread.sleep(2500);
		detrrt.InputDesc();
		Logger.info("Enter Decription is Passed");
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
			LR.ClickOnPartnerTeamFeature();
			Logger.info("Click On PartnerTeam Feature is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on PartnerTeam Feature is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(5000);
		try {
			if( PLM.DisplayPartnerTeamOverView()==true) {
				Logger.info("Display PartnerTeam OverView Page is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display PartnerTeam OverView Page is Failed", e);
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
