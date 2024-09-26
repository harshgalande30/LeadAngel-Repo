package com.leadAngel.testCases;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.leadAngel.pageObjects.AdministrationPageObjectModel;
import com.leadAngel.pageObjects.AnalyticsPageObjectModel;
import com.leadAngel.pageObjects.HomePage;
import com.leadAngel.pageObjects.LeadRouterPageObjectModel;
import com.leadAngel.pageObjects.ObjectExplorer_PageObjectModel;
import io.qameta.allure.Description;
import io.qameta.allure.Step;

public class TC_Sanity_ObjectExplorer_Administration extends BaseClass {
	private static final Logger Logger = LogManager.getLogger(TC_Sanity_ObjectExplorer_Administration.class);

	@Test(description = "Administration_ObjectExplorer_Section")
	@Step("Administration_ObjectExplorer_Section")
	@Description("Administration_ObjectExplorer_Section")

	public void AdministrationTest() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		HomePage hp = new HomePage(driver);	
		ObjectExplorer_PageObjectModel OEP=new ObjectExplorer_PageObjectModel(driver);
		AnalyticsPageObjectModel Anltc=new AnalyticsPageObjectModel(driver);
		LeadRouterPageObjectModel LR=new LeadRouterPageObjectModel(driver);
		AdministrationPageObjectModel APOM=new AdministrationPageObjectModel(driver);


		Logger.info("*************** Fetching the CRMId from lead summary report *******************");
		Thread.sleep(3500);
		try {
			Anltc.Analytics();
			Logger.info("Click on Analytics module is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Analytics module is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			OEP.ClickOnAnalyticsDropdown();
			Logger.info("Clicked on Analytics Dropdown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked on Analytics Dropdown is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OEP.ClickOnLeadSummaryReport();
			Logger.info("Click On Lead Summary Report is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Lead Summary Report is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(4000);
		try {
			OEP.ClickOnViewDetailReportButton();
			Logger.info("Clicked on View Detail Report Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked on View Detail Report Button is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(4000);
		List<WebElement> AllList = driver.findElements(By.xpath("//mat-icon[text()='visibility']"));
		int count = AllList.size();

		for (int i = count-1; i < count; i++) {

			Thread.sleep(4000);
			try {
				AllList.get(i).click();
				Logger.info("Click On Visibility Icon is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Visibility Icon is FAILED!!", e);
				sa.assertAll();
			}
		}

		Thread.sleep(4000);
		String CRMId="";
		try {
			CRMId = driver.findElement(By.xpath("(//label[text()='CRM ID']//..//label[text()])[2]")).getText();
			Logger.info("Fetch CRMId is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Fetch CRMId is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2000);
		try {
			OEP.ClickOnCloseButton();
			Logger.info("Click On Close Button for visibility popUp is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Close Button for visibility popUp is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2000);
		try {
			OEP.ClickOnClearIcon();
			Logger.info("Click On ClearIcon for view details report popUp is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On ClearIcon for view details report popUp is Failed",e);
			sa.assertAll();
		}

		Logger.info("*************** Fetching the OwnerId from Contact Routing report *******************");

		Thread.sleep(2500);
		try {
			OEP.ClickOnContactRoutingReport();
			Logger.info("Click On Contact Routing Report is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Contact Routing Report is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(4000);
		try {
			OEP.ClickOnViewDetailReportButton();
			Logger.info("Clicked on View Detail Report Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked on View Detail Report Button is FAILED!!", e);
			sa.assertAll();
		}

		Logger.info("********************* Default view operation ******************");
		Thread.sleep(4500);
		try {
			OEP.ClickOnDefaultViewDropdown();
			Logger.info("Click on Default View Dropdown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Default View Dropdown is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OEP.ClickOnAddNewView();
			Logger.info("Click on Add New View is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Add New View is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			String randomString = APOM.generateRandomString(APOM.length);
			OEP.EnterViewName.clear();
			OEP.EnterViewName.sendKeys(randomString);
			Logger.info("Enter view name is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter view name is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OEP.SelectHiddenColumnOwnerIdOption();
			Logger.info("Select Hidden Column OwnerId Option is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Hidden Column OwnerId Option is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			OEP.ClickOnSaveButtonForDefaultView();
			Logger.info("Click On Save Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			OEP.DisplayedViewAddedSuccessuflly();
			Logger.info("Displayed View Added Successuflly message is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed View Added Successuflly messageis FAILED!!", e);
			sa.assertAll();
		}

		Thread.sleep(4000);
		String OwnerId ="";
		try {
			OwnerId = driver.findElement(By.xpath("(//td[contains(@class,'mat-column-OwnerId')])[1]")).getText();
			Logger.info("Get OwnerId is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Get OwnerId is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2000);
		try {
			OEP.ClickOnClearIcon();
			Logger.info("Click On ClearIcon for view details report popUp is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On ClearIcon for view details report popUp is Failed",e);
			sa.assertAll();
		}


		Logger.info("*********************Go to Administration ******************");
		Thread.sleep(2000);
		try {
			OEP.ClickOnLeftTreeMenueTitle();
			Logger.info("Click On LeftTree MenueTitle is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Administration is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2000);
		try {
			OEP.ClickOnAdministration();
			Logger.info("Click On Administration is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Administration is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			OEP.ClickOnMaintenanceDropdown();
			Logger.info("Click On Maintenance Dropdown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Maintenance Dropdown is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2000);
		try {
			OEP.ClickOnObjectExplorer();
			Logger.info("Click on ObjectExplorer is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on ObjectExplorer is Failed",e);
			sa.assertAll();
		}
		Logger.info("*************Click On Search Button without selecting the 'Object' & enter 'ID' And Verifying Display Error message or not ****************");
		Thread.sleep(3500);
		try {
			OEP.ClickOnSearchButtonCRMID();
			Logger.info("Click On Search Button without selecting the Object & enter ID is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Search Button without selecting the Object & enter ID is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(300);
		try {
			if(OEP.DisplayedPleaseSelectObjectAndEnterIDErrorMessage()==true) {
				Logger.info("Displayed 'Please Select Object And Enter ID' Error Message is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed 'Please Select Object And Enter ID' Error Message is Failed",e);
			sa.assertAll();
		}

		Logger.info("*************Click On Search Button without selecting the 'Object' And Verifying Display Error message or not ****************");
		Thread.sleep(4000);
		try {
			driver.findElement(By.xpath("//input[@placeholder='CRM ID...']")).sendKeys(CRMId);
			Logger.info("Enter CRMId is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter CRMId is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			OEP.ClickOnSearchButtonCRMID();
			Logger.info("Click On Search Button without selecting the Object & enter ID is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Search Button without selecting the Object & enter ID is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(300);
		try {
			if(OEP.DisplayedPleaseSelectObjectAndEnterIDErrorMessage()==true) {
				Logger.info("Displayed 'Please Select Object And Enter ID' Error Message is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed 'Please Select Object And Enter ID' Error Message is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2000);
		try {
			OEP.ClickOnCloseButtonCRMID();
			Logger.info("Click On Close Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Close Button is Failed",e);
			sa.assertAll();
		}



		for (int i = 1; i < 3; i++) {

			if (i==1) {
				Logger.info("============================================== CRM Id Operation ==========================================");
				Thread.sleep(3500);
				try {
					OEP.ClickOnChevronDropdown();
					Logger.info("Click on ChevronDropdown is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click on ChevronDropdown is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(3500);
				try {
					OEP.ClickOnLeadOption();
					Logger.info("Click On Lead Option is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Lead Option is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(2000);
				try {
					driver.findElement(By.xpath("//input[@placeholder='CRM ID...']")).sendKeys(CRMId);
					Logger.info("Enter CRMId is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Enter CRMId is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(2000);
				try {
					OEP.ClickOnSearchButton();
					Logger.info("Click On Search Icon is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Search Icon is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(4500);
				Thread.sleep(4500);
				try {
					if (OEP.DisplyedLeadangelData() == true)
						Logger.info("Displyed Lead angel Data is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displyed Lead angel Data is Failed", e);
					sa.assertAll();
				} 
			}

			if (i==2) {
				Logger.info("========================================== Owner Id Operation ============================================");
				Thread.sleep(3500);
				try {
					OEP.ClickOnChevronDropdown();
					Logger.info("Click on ChevronDropdown is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click on ChevronDropdown is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					Actions action=new Actions(driver);
					WebElement Activity = driver.findElement(By.xpath("//button[text()=' Activity ']"));
					action.moveToElement(Activity).build().perform();
					Logger.info("Mouse hover on activity button is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Mouse hover on activity button is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					OEP.ClickOnActivityContactOption();
					Logger.info("Click On ActivityContact Option is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On ActivityContact Option is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(2000);
				try {
					driver.findElement(By.xpath("//input[@placeholder='Owner ID...']")).sendKeys(OwnerId);
					Logger.info("Enter CRMId is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Enter CRMId is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(2000);
				try {
					OEP.ClickOnSearchButton();
					Logger.info("Click On Search Icon is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Search Icon is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(4500);
				Thread.sleep(4500);
				try {
					if (OEP.DisplyedLeadangelData() == true)
						Logger.info("Displyed Lead angel Data is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displyed Lead angel Data is Failed", e);
					sa.assertAll();
				} 

			}

			Logger.info("******************************* Filter Operation ********************************");
			Thread.sleep(2000);
			try {
				OEP.ClickOnAdjustmentsButton();
				Logger.info("Click On Filter Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Filter Button is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);

			if(OEP.DisplayedAutomationObject()==true) {	
				Logger.info("Displayed 'Automation' Filter group,So delete the automation group is Passed");
				Thread.sleep(2000);
				try {
					OEP.ClickOnDeleteButton();
					Logger.info("Click On Delete Button is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Delete Button is Failed",e);
					sa.assertAll();
				}
				Thread.sleep(2000);
				try {
					OEP.ClickAgainDeleteButton();
					Logger.info("Click Again Delete Button is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click Again Delete Button is Failed",e);
					sa.assertAll();
				}
				Thread.sleep(2000);
				try {
					OEP.ClickOnAdjustmentsButton();
					Logger.info("Click On Filter Button is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Filter Button is Failed",e);
					sa.assertAll();
				}
				Thread.sleep(2000);
				try {
					if(OEP.DisplayedAutomationObject()==false)
						Logger.info("Not Displayed 'Automation' Filter group is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed 'Automation' Filter group is Failed",e);
					sa.assertAll();
				}
			}else {
				sa.assertTrue(true);
			}

			Thread.sleep(2000);
			try {
				OEP.ClickOnPlusIcon();
				Logger.info("Click On PlusIcon is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On PlusIcon is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2000);
			try {
				OEP.EnterName();
				Logger.info("Enter filter Name is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter filter Name is Failed",e);
				sa.assertAll();
			}

			String GetTextHiddenRowOption1="";
			String GetTextHiddenRowOption2="";
			if (i==1) {
				Logger.info("----------- Selecting the options From Hidden rows -----------");

				Thread.sleep(2000);
				try {
					GetTextHiddenRowOption1 = OEP.GetTextHiddenRowOption();
					Logger.info("GetTextHiddenRowOption1 : " + GetTextHiddenRowOption1);
					Logger.info("GetText from HiddenRow Option1 is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("GetText from HiddenRow Option1 is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(1000);
				try {
					OEP.ClickOnHiddenRowOption();
					Logger.info("Click On Option1 is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Option1 is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(2000);

				try {
					GetTextHiddenRowOption2 = OEP.GetTextHiddenRowOption();
					Logger.info("GetTextHiddenRowOption2 : " + GetTextHiddenRowOption2);
					Logger.info("GetText from HiddenRow Option1 is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("GetText from HiddenRow Option1 is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(1000);
				try {
					OEP.ClickOnHiddenRowOption();
					Logger.info("Click On Option2 is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Option2 is Failed", e);
					sa.assertAll();
				}
				Logger.info("----------- Verifying Selected the options are displayed in Saved rows -----------");
				Thread.sleep(1000);
				try {
					driver.findElement(By
							.xpath("//label[text()='Saved Rows']//..//li[text()=' " + GetTextHiddenRowOption1 + " ']"))
					.isDisplayed();
					Logger.info("Selected option1 is displayed in saved rows is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Selected option1 is displayed in saved rows is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(1000);
				try {
					driver.findElement(By
							.xpath("//label[text()='Saved Rows']//..//li[text()=' " + GetTextHiddenRowOption2 + " ']"))
					.isDisplayed();
					Logger.info("Selected option2 is displayed in saved rows is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Selected option2 is displayed in saved rows is Failed", e);
					sa.assertAll();
				}
				Logger.info("----------- Search operation for Hidden rows -----------");
				String GetTextFromHiddenRowOptionBeforeSearch = "";
				Thread.sleep(2000);
				try {
					GetTextFromHiddenRowOptionBeforeSearch = OEP.GetTextHiddenRowOption();
					Logger.info("Get First Text From HiddenRow Option is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Get First Text From HiddenRow Option is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					driver.findElement(By.xpath("//label[text()='Hidden Rows']//..//input[@name='search']"))
					.sendKeys(GetTextFromHiddenRowOptionBeforeSearch);
					Logger.info("Enter text in HiddenRow search box is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Enter text in HiddenRow search box is Failed", e);
					sa.assertAll();
				}
				String GetTextFromHiddenRowOptionAfterSearch = "";
				Thread.sleep(1500);
				try {
					GetTextFromHiddenRowOptionAfterSearch = OEP.GetTextHiddenRowOption();
					Logger.info("Get First Text From HiddenRow Option is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Get First Text From HiddenRow Option is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					if (GetTextFromHiddenRowOptionBeforeSearch.contentEquals(GetTextFromHiddenRowOptionAfterSearch)) {
						Logger.info(
								"GetTextFromHiddenRowOptionBeforeSearch : " + GetTextFromHiddenRowOptionBeforeSearch);
						Logger.info("GetTextFromHiddenRowOptionAfterSearch : " + GetTextFromHiddenRowOptionAfterSearch);
						Logger.info("Search text gets matched is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.info("GetTextFromHiddenRowOptionBeforeSearch : " + GetTextFromHiddenRowOptionBeforeSearch);
					Logger.info("GetTextFromHiddenRowOptionAfterSearch : " + GetTextFromHiddenRowOptionAfterSearch);
					Logger.info("Search text gets matched is failed", e);
					sa.assertAll();
				}
				Thread.sleep(1000);
				try {
					OEP.ClickOnCloseIconFromHiddenRowSearchBox();
					Logger.info("Click On Close Icon From HiddenRow SearchBox is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Close Icon From HiddenRow SearchBox is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(1000);
				try {
					OEP.ClickOnSaveButton();
					Logger.info("Click On Save Button is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Save Button is Failed", e);
					sa.assertAll();
				} 
			}

			String GetTextHiddenColumnOption1="";
			String GetTextHiddenColumnOption2="";
			if (i==2) {
				Logger.info("----------- Selecting the options From Hidden Columns -----------");

				Thread.sleep(2000);
				try {
					GetTextHiddenColumnOption1 = OEP.GetTextHiddenColumnOption();
					Logger.info("GetTextHiddenColumnOption1 : " + GetTextHiddenColumnOption1);
					Logger.info("GetText from HiddenColumn Option1 is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("GetText from HiddenColumn Option1 is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(1000);
				try {
					OEP.ClickOnHiddenColumnOption();
					Logger.info("Click On Option1 is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Option1 is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(2000);

				try {
					GetTextHiddenColumnOption2 = OEP.GetTextHiddenColumnOption();
					Logger.info("GetTextHiddenColumnOption2 : " + GetTextHiddenColumnOption2);
					Logger.info("GetText from HiddenColumn Option1 is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("GetText from HiddenColumn Option1 is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(1000);
				try {
					OEP.ClickOnHiddenColumnOption();
					Logger.info("Click On Option2 is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Option2 is Failed", e);
					sa.assertAll();
				}
				Logger.info("----------- Verifying Selected the options are displayed in Saved Columns -----------");
				Thread.sleep(1000);
				try {
					driver.findElement(By.xpath("//label[text()='Saved Columns']//..//li[text()=' " + GetTextHiddenColumnOption1 + " ']"))
					.isDisplayed();
					Logger.info("Selected option1 is displayed in saved Columns is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Selected option1 is displayed in saved Columns is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(1000);
				try {
					driver.findElement(By.xpath("//label[text()='Saved Columns']//..//li[text()=' " + GetTextHiddenColumnOption2 + " ']"))
					.isDisplayed();
					Logger.info("Selected option2 is displayed in saved Columns is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Selected option2 is displayed in saved Columns is Failed", e);
					sa.assertAll();
				}
				Logger.info("----------- Search operation for Hidden Column -----------");
				String GetTextFromHiddenColumnOptionBeforeSearch = "";
				Thread.sleep(2000);
				try {
					GetTextFromHiddenColumnOptionBeforeSearch = OEP.GetTextHiddenColumnOption();
					Logger.info("Get First Text From HiddenColumn Option is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Get First Text From HiddenColumn Option is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					driver.findElement(By.xpath("//label[text()='Hidden Columns']//..//input[@name='search']"))
					.sendKeys(GetTextFromHiddenColumnOptionBeforeSearch);
					Logger.info("Enter text in HiddenColumn search box is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Enter text in HiddenColumn search box is Failed", e);
					sa.assertAll();
				}
				String GetTextFromHiddenColumnOptionAfterSearch = "";
				Thread.sleep(1500);
				try {
					GetTextFromHiddenColumnOptionAfterSearch = OEP.GetTextHiddenColumnOption();
					Logger.info("Get First Text From HiddenColumn Option is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Get First Text From HiddenColumn Option is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					if (GetTextFromHiddenColumnOptionBeforeSearch.contentEquals(GetTextFromHiddenColumnOptionAfterSearch)) {
						Logger.info(
								"GetTextFromHiddenColumnOptionBeforeSearch : " + GetTextFromHiddenColumnOptionBeforeSearch);
						Logger.info("GetTextFromHiddenColumnOptionAfterSearch : " + GetTextFromHiddenColumnOptionAfterSearch);
						Logger.info("Search text gets matched is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.info("GetTextFromHiddenColumnOptionBeforeSearch : " + GetTextFromHiddenColumnOptionBeforeSearch);
					Logger.info("GetTextFromHiddenColumnOptionAfterSearch : " + GetTextFromHiddenColumnOptionAfterSearch);
					Logger.info("Search text gets matched is failed", e);
					sa.assertAll();
				}
				Thread.sleep(1000);
				try {
					OEP.ClickOnCloseIconFromHiddenRowSearchBox();
					Logger.info("Click On Close Icon From HiddenColumn SearchBox is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Close Icon From HiddenColumn SearchBox is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(1000);
				try {
					OEP.ClickOnSaveButton();
					Logger.info("Click On Save Button is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Save Button is Failed", e);
					sa.assertAll();
				} 
			}


			if (i==1) {
				Logger.info("----------- Verifying whether filtered objects are displayed in the 'Object Explorer console'  -----------");
				Thread.sleep(4500);
				try {
					driver.findElement(By.xpath("//div[@class='table-title d-flex justify-content-center align-items-center']//div[text()='LeadAngel Data']//..//..//td[contains(@class,'cdk-column-field')][text()=' "
							+ GetTextHiddenRowOption1 + " ']")).isDisplayed();
					Logger.info("Filtered option1 displayed in the 'Object Explorer console' is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Filtered option1 are displayed in the 'Object Explorer console' is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(1000);
				try {
					driver.findElement(By.xpath("//div[@class='table-title d-flex justify-content-center align-items-center']//div[text()='LeadAngel Data']//..//..//td[contains(@class,'cdk-column-field')][text()=' "
							+ GetTextHiddenRowOption2 + " ']")).isDisplayed();
					Logger.info("Filtered option2 are displayed in the 'Object Explorer console' is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Filtered option2 are displayed in the 'Object Explorer console' is Failed", e);
					sa.assertAll();
				} 
			}

			if (i==2) {
				Logger.info("----------- Verifying whether filtered objects are displayed in the 'Object Explorer console'  -----------");
				Thread.sleep(4500);
				try {
					driver.findElement(By.xpath("//div[text()='LeadAngel Data']//..//..//th[text()='"+GetTextHiddenColumnOption1+"']")).isDisplayed();
					Logger.info("Filtered option1 displayed in the 'Object Explorer console' is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Filtered option1 are displayed in the 'Object Explorer console' is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(1000);
				try {
				driver.findElement(By.xpath("//div[text()='LeadAngel Data']//..//..//th[text()='"+GetTextHiddenColumnOption2+"']")).isDisplayed();
					Logger.info("Filtered option2 are displayed in the 'Object Explorer console' is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Filtered option2 are displayed in the 'Object Explorer console' is Failed", e);
					sa.assertAll();
				} 
			}


			if (i==1) {
				Logger.info("----------- Search operation in 'Object Explorer console' -----------");
				Thread.sleep(1500);
				String GetTextBeforeSearch = "";
				try {
					GetTextBeforeSearch = driver.findElement(By.xpath(
							"(//div[@class='table-title d-flex justify-content-center align-items-center']//div[text()='LeadAngel Data']//..//..//td[contains(@class,'cdk-column-field')][text()])[1]"))
							.getText();
					Logger.info("Get text before search is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Get text before search is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(1000);
				try {
					driver.findElement(By.xpath("//div[@class='d-flex align-items-center']//input[@placeholder='Search']"))
					.sendKeys(GetTextBeforeSearch);
					Logger.info("Click On Close Icon From HiddenRow SearchBox is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Close Icon From HiddenRow SearchBox is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(1000);
				try {
					driver.findElement(By.xpath(
							"(//div[@class='table-title d-flex justify-content-center align-items-center']//div[text()='LeadAngel Data']//..//..//td[contains(@class,'cdk-column-field')][text()=' "
									+ GetTextBeforeSearch + " '])[1]"))
					.isDisplayed();
					Logger.info("Displayed searched text in 'Object Explorer console' is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed searched text in 'Object Explorer console' is Failed", e);
					sa.assertAll();
				} 

				Thread.sleep(1000);
				try {
					OEP.ClickOnClearIconFromOpjectExplorerSearchBox();
					Logger.info("Click On clear icon from the search box is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On On clear icon from the search box is Failed",e);
					sa.assertAll();
				}
			}
			if (i==2) {
				Logger.info("----------- Search operation in 'Object Explorer console' -----------");
				Thread.sleep(1500);
				String GetTextBeforeSearch = "";
				try {
					GetTextBeforeSearch = driver.findElement(By.xpath("(//div[text()='LeadAngel Data']//..//..//td[text()])[2]")).getText();
					Logger.info("Get text before search is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Get text before search is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(1000);
				try {
					driver.findElement(By.xpath("//div[@class='d-flex align-items-center']//input[@placeholder='Search']")).sendKeys(GetTextBeforeSearch);
					Logger.info("Click On Close Icon From HiddenRow SearchBox is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Close Icon From HiddenRow SearchBox is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(1000);
				try {
					driver.findElement(By.xpath("(//div[text()='LeadAngel Data']//..//..//td[text()='"+GetTextBeforeSearch+"'])[1]")).isDisplayed();
					Logger.info("Displayed searched text in 'Object Explorer console' is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed searched text in 'Object Explorer console' is Failed", e);
					sa.assertAll();
				} 
				Thread.sleep(1000);
				try {
					OEP.ClickOnClearIconFromOpjectExplorerSearchBox();
					Logger.info("Click On clear icon from the search box is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On On clear icon from the search box is Failed",e);
					sa.assertAll();
				}
			}


			Logger.info("----------- Edit filter operation -----------"); 
			Thread.sleep(2000);
			try {
				OEP.ClickOnAdjustmentsButton();
				Logger.info("Click On Filter Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Filter Button is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2000);
			try {
				OEP.ClickOnEditButton();
				Logger.info("Click On Edit Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Edit Button is Failed",e);
				sa.assertAll();
			}
			String GetTextHiddenRowEditOption="";
			if (i==1) {
				Thread.sleep(2000);
				try {
					GetTextHiddenRowEditOption = OEP.GetTextHiddenRowOption();
					Logger.info("GetTextHiddenRowOption1 : " + GetTextHiddenRowEditOption);
					Logger.info("GetText from HiddenRow EditOption is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("GetText from HiddenRow Option is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(1000);
				try {
					OEP.ClickOnHiddenRowOption();
					Logger.info("Click On HiddenRow Option is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On HiddenRow Option is Failed", e);
					sa.assertAll();
				} 
			}
			String GetTextHiddenColumnEditOption="";
			if (i==2) {
				Thread.sleep(2000);
				try {
					GetTextHiddenColumnEditOption = OEP.GetTextHiddenColumnOption();
					Logger.info("GetTextHiddenColumnOption1 : " + GetTextHiddenColumnEditOption);
					Logger.info("GetText from HiddenColumn EditOption is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("GetText from HiddenColumn Option is Failed", e);
					sa.assertAll();
				}
				Thread.sleep(1000);
				try {
					OEP.ClickOnHiddenColumnOption();
					Logger.info("Click On HiddenColumn Option is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On HiddenColumn Option is Failed", e);
					sa.assertAll();
				} 
			}

			Thread.sleep(1000);
			try {
				OEP.ClickOnUpdateButton();
				Logger.info("Click On Update Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Update Button is Failed",e);
				sa.assertAll();
			}


			if (i==1) {
				Logger.info("----------- Verifying whether Edited filtered object is displayed in the 'Object Explorer console'  -----------");
				Thread.sleep(4500);
				try {
					driver.findElement(By.xpath("//div[@class='table-title d-flex justify-content-center align-items-center']//div[text()='LeadAngel Data']//..//..//td[contains(@class,'cdk-column-field')][text()=' "
							+ GetTextHiddenRowEditOption + " ']")).isDisplayed();
					Logger.info("Filtered EditOption is displayed in the 'Object Explorer console' is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Filtered EditOption is displayed in the 'Object Explorer console' is Failed", e);
					sa.assertAll();
				}
			}
			if (i==2) {
				Logger.info("----------- Verifying whether Edited filtered object is displayed in the 'Object Explorer console' -----------");
				Thread.sleep(4500);
				try {
					driver.findElement(By.xpath("//div[text()='LeadAngel Data']//..//..//th[text()='"+GetTextHiddenColumnEditOption+"']")).isDisplayed();
					Logger.info("Filtered EditOption displayed in the 'Object Explorer console' is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Filtered EditOption are displayed in the 'Object Explorer console' is Failed", e);
					sa.assertAll();
				}
			}


			Logger.info("----------- Download operation -----------");  
			Thread.sleep(1500);
			try {
				OEP.ClickDownloadButton();
				Logger.info("Click Download Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click Download Button is Failed",e);
				sa.assertAll();
			}
			try {
				if(OEP.DisplayedDownloaded()==true) {
					Logger.info("Displayed file is downloaded is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed file is downloaded is Failed",e);
				sa.assertAll();
			}

			Logger.info("----------- Maximize & minimize operation -----------");  
			Thread.sleep(1500);
			try {
				OEP.ClickOnMaximize();
				Logger.info("Click On Maximize is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Maximize is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				OEP.ClickOnminimize();
				Logger.info("Click On Maximize is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Maximize is Failed",e);
				sa.assertAll();
			}
		}//for	
	}	
}
