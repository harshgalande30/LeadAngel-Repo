package com.leadAngel.testCases;
import java.io.IOException;
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
import com.leadAngel.pageObjects.LeadRouterPageObjectModel;
import com.leadAngel.pageObjects.LeadRoutingTerritoryPage;
import com.leadAngel.pageObjects.LoginPage;
import com.leadAngel.pageObjects.RoundRobinPage;
import io.qameta.allure.Description;
import io.qameta.allure.Step;

@Listeners({ com.leadAngel.utilities.TestAllureListener.class })
public class TC_Sanity_LeadRoutingTerritory_Leadamanagement extends BaseClass {
	private final static Logger Logger = org.apache.logging.log4j.LogManager.getLogger(TC_Sanity_LeadRoutingTerritory_Leadamanagement.class);
	@Test(description = "LeadManagement_LeadRoutingTerritory_Section")
	@Step("LeadManagement_LeadRoutingTerritory_Sanity")
	@Description("LeadManagement_LeadRoutingTerritory Sanity Test")
	public void LeadManagementTest() throws InterruptedException, IOException {
		SoftAssert sa = new SoftAssert();
		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		LeadManagementPage LMP = new LeadManagementPage(driver);
		CRM_Account_FilterPage crmAcc = new CRM_Account_FilterPage(driver);
		LeadRoutingTerritoryPage LRT = new LeadRoutingTerritoryPage(driver);
		AEtoSDR_Page ae = new AEtoSDR_Page(driver);
		CRM_Account_FilterPage crm = new CRM_Account_FilterPage(driver);
		RoundRobinPage rrp = new RoundRobinPage(driver);
		DetailsPage_SalesTeam detrrt = new DetailsPage_SalesTeam(driver);
		LeadRouterPageObjectModel LR=new LeadRouterPageObjectModel(driver);
		AccountListPage ALP = new AccountListPage(driver);

		Thread.sleep(3500);
		try {
			hp.ClickOnLeadManagement();
			Logger.info("Click on Lead Management is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);  		
			Logger.error("Click on Lead Management is FAILED!!",e);    		
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			LRT.RightClickonLRT();
			Logger.info("Right Click on Lead routing territory is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);  		
			Logger.error("Right Click on Lead routing territory is FAILED!!",e);    		
			sa.assertAll();
		}
		Thread.sleep(2500);
		LMP.ClickOnNewObject();
		Logger.info("Click on New object is Passed");
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
		LMP.clickOnSaveNewObject();
		Logger.info("Click on Save Button is Passed");


		Thread.sleep(800);
		if(ae.DisplaySameAEerror() == true) {
			Logger.info("Duplicate Object Found, Try to delete the Object NOW!!! then Creating New Object!!");
			Thread.sleep(3500);
			try {
				LRT.LRTDropdown();
				Logger.info("Lead routing territory Dropdown is passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Lead routing territory Dropdown is FAILED!!", e);
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
			Thread.sleep(2500);
			try {
				LMP.ClickOnDeletebtn();
				Logger.info("Click Again Delete button is Passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click Again Delete button is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(500);
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
			Thread.sleep(4500);
			try {
				LRT.RightClickonLRT();
				Logger.info("Right Click on Lead routing territory is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);  		
				Logger.error("Right Click on Lead routing territory is FAILED!!",e);    		
				sa.assertAll();
			}
			Thread.sleep(3000);
			try {
				LMP.ClickOnNewObject();
				Logger.info("Click on New Lead routing territory is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on New Lead routing territory is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				LMP.NameInCrudObject();
				Logger.info("Enter Object Name is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter Object Name is FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				LMP.DescInRRT();
				Logger.info("Enter Description is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter Description is FAILED!!", e);         
				sa.assertAll();
			}
			Thread.sleep(1500);
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
		Thread.sleep(5500);
		try {
			Thread.sleep(2500);
			if(LRT.LRTOverview()==true) {
				Logger.info("Display Lead routing territory Overview is passed");
				{
					Thread.sleep(2500);
					try {
						LRT.LRTDropdown();
						Logger.info("Lead routing territory Dropdown is passed");
					}catch(Exception e) {
						sa.assertTrue(false);
						Logger.error("Lead routing territory Dropdown is FAILED!!", e);
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
		Thread.sleep(4500);
		try {
			LRT.ClickonDataDictionary();
			Logger.info("Click on Data Dictionary is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Data Dictionary is FAILED!!", e);
			sa.assertAll();
		}

		Logger.info("*************************************************AccountList_DND**************************************");	
		String ParentWindow = driver.getWindowHandle();
		Thread.sleep(3500);
		try {
			LRT.AccountList_DND();
			Logger.info("Drag and Drop AccountList is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag and Drop AccountList is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LRT.ClickAccountListSelectBox();
			Thread.sleep(2500);
			LRT.ClickAccountListSelectBox();
			Logger.info("Click on AccountList SelectBox dropdown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on AccountList SelectBox dropdown is Failed", e);
			sa.assertAll();
		}

		List<WebElement> AllLinksOfAccountList = driver.findElements(By.xpath("//label[text()='Account List']/..//select[@name='seldropDown']//option[text()]"));
		int countAccountList=AllLinksOfAccountList.size();

		for (int i = 1; i <countAccountList; i++) {

			WebElement getLinkAccountList= AllLinksOfAccountList.get(i);
			String getLinkTextAccountList= getLinkAccountList.getText();
			Thread.sleep(1500);
			try {
				getLinkAccountList.click();
				Logger.info("Select "+getLinkTextAccountList+" is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select "+getLinkTextAccountList+" is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(500);
			try {
				if( LR.DisplayedAccountListSelectBoxNgValid()==true) {
					Logger.info("Displayed Select Box is not red");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Select Box is red",e);
				sa.assertAll();
			}

			Thread.sleep(1500);
			try {
				LRT.ClickOnAccountIsSelect();
				Logger.info("Click On AccountList NgSelect box dropdown is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On AccountList NgSelect box dropdown is FAILED!!", e);
				sa.assertAll();
			}

			//****************	
			if (i==1) {
				Thread.sleep(3000);
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
						String ObjectNameAfterClickNewTabLink = driver
								.findElement(By.xpath("(//i[text()='description']//..//span[text()])[2]")).getText();
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
				//****************
			}

			if (i!=1) {
				Thread.sleep(2500);
				try {
					LR.SelectOptionFromtheDropdownLRT();
					Logger.info("Select Option from the dropdown is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select Option from the dropdown is Failed !!",e);
					sa.assertAll();
				}
			}
			Thread.sleep(1500);
			try {
				if( LR.DisplayedAccountListNgSelectBoxBoxNgValid()==true) {
					Logger.info("Displayed NgSelect Box is not red");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed NgSelect Box is red",e);
				sa.assertAll();
			}

		}

		Logger.info("*******************************************CRMAccountFilter_DND*********************************");	
		Thread.sleep(3500);
		try {
			LRT.CRMAccFilter_DND();
			Logger.info("Drag and Drop CRMAccFilter is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag and Drop CRMAccFilter is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LRT.ClickOnCRMaccountFilterListBoxx();
			Thread.sleep(2500);
			LRT.ClickOnCRMaccountFilterListBoxx();
			Logger.info("Click on CRMaccountFilter ListBox dropdown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on CRMaccountFilter ListBox dropdown is Failed", e);
			sa.assertAll();
		}

		List<WebElement> AllLinksOfCRMaccountFilter = driver.findElements(By.xpath("//label[text()='CRM Account Filter']/..//select[@name='seldropDown']//option[text()]"));
		int countCRMaccountFilter=AllLinksOfCRMaccountFilter.size();

		for (int j = 1; j <countCRMaccountFilter; j++) {

			WebElement getLinkCRMaccountFilter = AllLinksOfCRMaccountFilter.get(j);
			String getLinkTextAccountList = getLinkCRMaccountFilter.getText();
			Thread.sleep(1500);
			try {
				getLinkCRMaccountFilter.click();
				Logger.info("Select "+getLinkTextAccountList+" is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select "+getLinkTextAccountList+" is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(500);
			try {
				if( LR.DisplayedCRMAccountFilterSelectBoxNgValid()==true) {
					Logger.info("Displayed Select Box is not red");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Select Box is red",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				LRT.CRMAccFilterSelectOptionDropdown();
				Logger.info("CRMAccFilterSelectOptionDropdown is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("CRMAccFilterSelectOptionDropdown is  FAILED!!", e);
				sa.assertAll();
			}
			if (j==1) {
				//****************
				Thread.sleep(3000);
				String ObjectNameBeforeClickNewTabLink1 = driver
						.findElement(By.xpath("(//a[text()=' open_in_new '])[1]//..//span[text()]")).getText();
				Logger.info("Object Name Before Click NewTab Link: " + ObjectNameBeforeClickNewTabLink1);
				Thread.sleep(3500);
				try {
					LR.ClickOnOpenInNewTabLink();
					Logger.info("Click On Open In New Tab Link is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Open In New Tab Link is Failed !!", e);
					sa.assertAll();
				}
				Thread.sleep(5000);
				Set<String> Allwindow1 = driver.getWindowHandles();
				Thread.sleep(4000);
				for (String wh : Allwindow1) {
					driver.switchTo().window(wh);
					if (wh.equals(ParentWindow)) {
						continue;
					} else {
						Thread.sleep(4000);
						String ObjectNameAfterClickNewTabLink = driver
								.findElement(By.xpath("(//i[text()='description']//..//span[text()])[2]")).getText();
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
				//****************
			}
			if (j!=1) {
				Thread.sleep(2500);
				try {
					LR.SelectOptionFromtheDropdownLRT();
					Logger.info("Select Option from the dropdown is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select Option from the dropdown is Failed !!",e);
					sa.assertAll();
				}
			}
			Thread.sleep(1000);
			try {
				if( LR.DisplayedCRMAccountFilterNgSelectBoxBoxNgValid()==true) {
					Logger.info("Displayed NgSelect Box is not red");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed NgSelect Box is red",e);
				sa.assertAll();
			}
		}

		Logger.info("*******************************************CRM_LeadFilter_DND*********************************");	
		Thread.sleep(3500);
		try {
			LRT.CRMLeadFilter_DND();
			Logger.info("Drag and Drop CRMLeadFilter is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag and Drop CRMLeadFilter is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LRT.ClickOnCRMleadFilter();
			Thread.sleep(2500);
			LRT.ClickOnCRMleadFilter();
			Logger.info("Click on CRMleadFilter ListBox Dropddown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on CRMleadFilter ListBox Dropdown is Failed", e);
			sa.assertAll();
		}

		List<WebElement> AllLinksOfCRMleadFilter = driver.findElements(By.xpath("//label[text()='CRM Lead Filter']/..//select[@name='seldropDown']//option[text()]"));
		int countCRMleadFilter=AllLinksOfCRMleadFilter.size();

		for (int k = 1; k <countCRMleadFilter; k++) {

			WebElement getLinkCRMleadFilter = AllLinksOfCRMleadFilter.get(k);
			String getLinkTextleadList = getLinkCRMleadFilter.getText();
			Thread.sleep(1500);
			try {
				getLinkCRMleadFilter.click();
				Logger.info("Select "+getLinkTextleadList+" is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select "+getLinkTextleadList+" is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(500);
			try {
				if( LR.DisplayedCRMLeadFilterSelectBoxNgValid()==true) {
					Logger.info("Displayed Select Box is not red");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Select Box is red",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				LRT.CRMLeadFilterSelectOptionDropdown();
				Logger.info("Click on CRMLeadFilter Selectbox2 Dropdown is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on CRMLeadFilter Selectbox2 Dropdown is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(1500);

			if (k==1) {
				//****************
				Thread.sleep(3500);
				String ObjectNameBeforeClickNewTabLink1 = driver
						.findElement(By.xpath("(//a[text()=' open_in_new '])[1]//..//span[text()]")).getText();
				Logger.info("Object Name Before Click NewTab Link: " + ObjectNameBeforeClickNewTabLink1);
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
						String ObjectNameAfterClickNewTabLink = driver
								.findElement(By.xpath("(//i[text()='description']//..//span[text()])[2]")).getText();
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
				//****************
			}
			if (k!=1) {
				Thread.sleep(2500);
				try {
					LR.SelectOptionFromtheDropdownLRT();
					Logger.info("Select Option from the dropdown is Passed !!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Select Option from the dropdown is Failed !!",e);
					sa.assertAll();
				}
			}
			Thread.sleep(1000);
			try {
				if( LR.DisplayedCRMLeadFilterNgSelectBoxBoxNgValid()==true) {
					Logger.info("Displayed Select Box is not red");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Select Box is red",e);
				sa.assertAll();
			}
		}

		Logger.info("*******************************************SystemDataDictionary_DND*********************************");	
		Thread.sleep(3500);
		try {
			LRT.SystemDataDictionary_DND();
			Logger.info("Drag and Drop SystemDataDictionary is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag and Drop SystemDataDictionary is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LRT.ClickOnSystemDataDictionary();
			Thread.sleep(2500);
			LRT.ClickOnSystemDataDictionary();
			Logger.info("Click on SystemDataDictionary ListBox dropdown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on SystemDataDictionary ListBox dropdown is Failed", e);
			sa.assertAll();
		}

		List<WebElement> AllLinksOfSystemDataDictionary = driver.findElements(By.xpath("//label[text()='System Data Dictionary']/..//select[@name='seldropDown']//option[text()]"));
		int countSystemDataDictionary=AllLinksOfSystemDataDictionary.size();

		for (int L = 1; L <countSystemDataDictionary; L++) {

			WebElement getLinkSystemDataDictionary= AllLinksOfSystemDataDictionary.get(L);
			String getLinkTextSystemDataDictionary= getLinkSystemDataDictionary.getText();
			Thread.sleep(1500);
			try {
				getLinkSystemDataDictionary.click();
				Logger.info("Select "+getLinkTextSystemDataDictionary+" is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select "+getLinkTextSystemDataDictionary+" is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(500);
			try {
				if( LR.DisplayedSystemDataDictionarySelectBoxNgValid()==true) {
					Logger.info("Displayed Select Box is not red");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Select Box is red",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				LRT.SystemDataDictionarySelectOptionDropdown();
				Logger.info("SystemDataDictionarySelectOptionDropdown is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("SystemDataDictionarySelectOptionDropdown is  FAILED!!", e);
				sa.assertAll();
			}

			List<WebElement> AllLinksOfSystemDataDictionarySelectOptions = driver.findElements(By.xpath("//ng-dropdown-panel[@role='listbox']//span[text()]"));
			int countSystemDataDictionarySelectOptions=AllLinksOfSystemDataDictionarySelectOptions.size();

			for (int M = 0; M <countSystemDataDictionarySelectOptions;) {
				Thread.sleep(2000);
				try {
					LRT.SystemDataDictionarySelectOptionDropdown();
					Logger.info("SystemDataDictionary Select Box Dropdown is Passed");
				}catch(Exception e) {
					sa.assertTrue(false);
					Logger.error("SystemDataDictionary Select Box Dropdown is FAILED!!", e);
					sa.assertAll();
				}
				if (L==1&&M==0) {
					//****************
					Thread.sleep(4000);
					String ObjectNameBeforeClickNewTabLink1 = driver
							.findElement(By.xpath("(//a[text()=' open_in_new '])[1]//..//span[text()]")).getText();
					Logger.info("Object Name Before Click NewTab Link: " + ObjectNameBeforeClickNewTabLink1);
					Thread.sleep(4000);
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
							String ObjectNameAfterClickNewTabLink = driver
									.findElement(By.xpath("(//i[text()='description']//..//span[text()])[2]"))
									.getText();
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
				if (L==2&&M==0||M!=0) {
					List<WebElement> AllLinksOfSystemDataDictionarySelectOptions1 = driver
							.findElements(By.xpath("//ng-dropdown-panel[@role='listbox']//span[text()]"));
					WebElement getLinkSystemDataDictionarySelectOptions = AllLinksOfSystemDataDictionarySelectOptions1
							.get(M);
					String getLinkTextSystemDataDictionarySelectOptions = getLinkSystemDataDictionary.getText();
					Thread.sleep(1500);
					try {
						getLinkSystemDataDictionarySelectOptions.click();
						Logger.info("Select " + getLinkTextSystemDataDictionarySelectOptions + " is Passed");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Select " + getLinkTextSystemDataDictionarySelectOptions + " is Failed", e);
						sa.assertAll();
					} 
				}
				Thread.sleep(500);
				try {
					if( LR.DisplayedSystemDataDictionaryNgSelectBoxBoxNgValid()==true) {
						Logger.info("Displayed NgSelect Box is not red");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed NgSelect Box is red",e);
					sa.assertAll();
				}
				M++;
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
		Thread.sleep(2500);
		try {
			LRT.ClickonDataDictionary();
			Logger.info("Click on Data Dictionary is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Data Dictionary is FAILED!!", e);
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
			Logger.error("Select Custom FilterOption is Failed", e);
			sa.assertAll();
		}

		Thread.sleep(2500);
		try {
			rrp.InputForCutomFilter();
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
		Thread.sleep(3000);
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
			Logger.info("Display Approved  button is PASSED!");
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
			LR.ClickOnLeadRoutingTerritoryFeature();
			Logger.info("Click On LeadRoutingTerritory Feature is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on LeadRoutingTerritory Feature is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(5000);
		try {
			if(LRT.LRTOverview()==true) {
				Logger.info("Display LeadRoutingTerritory OverView Page is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display LeadRoutingTerritory OverView Page is Failed", e);
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
