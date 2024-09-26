package com.leadAngel.testCases;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.leadAngel.pageObjects.AdministrationPageObjectModel;
import com.leadAngel.pageObjects.DataDictionaryIndex_PageObjectModel;
import com.leadAngel.pageObjects.HomePage;
import io.qameta.allure.Description;
import io.qameta.allure.Step;

public class TC_Sanity_Opportunity_DataDictionaryIndex_Administration extends BaseClass{
	private static final Logger Logger = LogManager.getLogger(TC_Sanity_Opportunity_DataDictionaryIndex_Administration.class);

	@Test(description = "Administration_DataDictionaryIndex_Section")
	@Step("DataDictionaryIndex_Opportunity_Section")
	@Description("DataDictionaryIndex_Opportunity_Section")

	public void AdministrationTest() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		HomePage hp = new HomePage(driver);
		AdministrationPageObjectModel APOM=new AdministrationPageObjectModel(driver);
		DataDictionaryIndex_PageObjectModel DDTP=new DataDictionaryIndex_PageObjectModel(driver);

		Thread.sleep(3500);
		try {
			hp.ClickOnAdministration();
			Logger.info("Click on Administration is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Administration is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			DDTP.ClickOnDataDictionaryIndex();
			Logger.info("Click on DataDictionaryIndex is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on DataDictionaryIndex is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3000);
		try {
			DDTP.ClickOnOpportunityBox();
			Logger.info("Click on OpportunityBox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on OpportunityBox is Failed",e);
			sa.assertAll();
		}


		Logger.info("**************************************** OpportunityAttributes Operation *******************************************");
		Thread.sleep(2000);
		if (DDTP.DisplayedAlertMessageForOpportunityAttributes()==false) {
			Logger.info("Alert Message is Not Displayed,So continue the OpportunityAttributes Opeartion");

			if (DDTP.DisplayedNoRecordFoundInSelectedAttributeFieldListOpportunityAttributes()==false) {
				Logger.info("Clear all the options which is already presented from the SelectedAttributeFieldList");
				List<WebElement> AllOptionsLink = driver.findElements(By.xpath("(//mat-panel-title[text()=' Opportunity Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//li[@mattooltipclass='custom-tooltip-style']"));
				int Count = AllOptionsLink.size();

				for (int i = 0; i < Count; i++) {

					WebElement GetOptionLink = AllOptionsLink.get(i);
					GetOptionLink.click();
					Thread.sleep(300);
				}
				Thread.sleep(1500);
				try {
					DDTP.ClickOnRemoveButtonForOpportunityAttributes();
					Logger.info("Click On Remove Button is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Remove Button is Failed",e);
					sa.assertAll();
				}
				try {
					if (DDTP.DisplayedNoRecordFoundInSelectedAttributeFieldListOpportunityAttributes()==true) {
						Logger.info("Displayed NoRecordFound In SelectedAttributeFieldList,So continue the Operation");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Not Displayed NoRecordFound In SelectedAttributeFieldList,So continue the Operation",e);
					sa.assertAll();
				}
			}

			Logger.info("----------- Selecting the options From Attribute field list -----------");
			Thread.sleep(1500);
			try {
				DDTP.SelectBooleanOptionForOpportunityAttributes();
				Logger.info("Select Boolean Option From Attribute field list is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select Boolean Option From Attribute field list is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				DDTP.SelectStringOptionForOpportunityAttributes();
				Logger.info("Select String Option From Attribute field list is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select String Option From Attribute field list is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				DDTP.SelectNumberOptionForOpportunityAttributes();
				Logger.info("Select Number Option From Attribute field list is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select Number Option From Attribute field list is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				DDTP.SelectDateOptionForOpportunityAttributes();
				Logger.info("Select Date Option From Attribute field list is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select Date Option From Attribute field list is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				DDTP.ClickOnAddButtonForOpportunityAttributes();
				Logger.info("Click On AddButton is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On AddButton is Failed",e);
				sa.assertAll();
			}

			Logger.info("----------- Verifying the selected options are displayed or not in SelectedAttributeFieldList -----------");
			Thread.sleep(1500);
			try {
				if (DDTP.DisplayedBooleanOptionForOpportunityAttributeInSelectedAttributeFieldList()==true) {
					Logger.info("Displayed selected Boolean Option in SelectedAttributeFieldList is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed selected Boolean Option in SelectedAttributeFieldList is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1000);
			try {
				if (DDTP.DisplayedStringOptionForOpportunityAttributeInSelectedAttributeFieldList()==true) {
					Logger.info("Displayed selected String Option in SelectedAttributeFieldList is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed selected Boolean Option in SelectedAttributeFieldList is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1000);
			try {
				if (DDTP.DisplayedNumberOptionForOpportunityAttributeInSelectedAttributeFieldList()==true) {
					Logger.info("Displayed selected Number Option in SelectedAttributeFieldList is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed selected Number Option in SelectedAttributeFieldList is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1000);
			try {
				if (DDTP.DisplayedDateOptionForOpportunityAttributeInSelectedAttributeFieldList()==true) {
					Logger.info("Displayed selected Date Option in SelectedAttributeFieldList is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed selected Date Option in SelectedAttributeFieldList is Failed",e);
				sa.assertAll();
			}

			Logger.info("----------- Move back the Selected Boolean option from SelectedAttributeFieldList to AttributeFieldList -----------");

			Thread.sleep(1500);
			try {
				DDTP.ClickBooleanOptionForOpportunityAttributeFromTheSelectedAttributeFieldList();
				Logger.info("Deselect Boolean Option from SelectedAttributeFieldList is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Deselect Boolean Option from SelectedAttributeFieldList is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				DDTP.ClickOnRemoveButtonForOpportunityAttributes();
				Logger.info("Click On Remove Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Remove Button is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				if (DDTP.DisplayedBooleanOptionForOpportunityAttributeInSelectedAttributeFieldList()==false) {
					Logger.info("Deselected Boolean Option from SelectedAttributeFieldList is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Deselected Boolean Option from SelectedAttributeFieldList is Failed",e);
				sa.assertAll();
			}

			Logger.info("----------- Search Operation for Attribute field list in OpportunityAttributes  -----------");
			Thread.sleep(1500);
			String GetOptionTextBeforeSearch="";
			try {
				GetOptionTextBeforeSearch = driver.findElement(By.xpath("((//mat-panel-title[text()=' Opportunity Attributes ']//..//..//..)[1]//label[text()='Attribute Field List']//..//li[@class='ng-star-inserted']//span[text()])[1]")).getText();
				Logger.info("Get Text from the option Before search is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Get Text from the option Before search is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				driver.findElement(By.xpath("(//mat-panel-title[text()=' Opportunity Attributes ']//..//..//..)[1]//label[text()='Attribute Field List']//..//input[@name='filterSource']")).sendKeys(GetOptionTextBeforeSearch);
				Logger.info("Enter Text in Attribute field list search box is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter Text in Attribute field list search box is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			String GetOptionTextAfterSearch="";
			try {
				GetOptionTextAfterSearch = driver.findElement(By.xpath("(//mat-panel-title[text()=' Opportunity Attributes ']//..//..//..)[1]//label[text()='Attribute Field List']//..//li[@class='ng-star-inserted']//span[text()]")).getText();
				Logger.info("Get Text from the option After Search is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Get Text from the option After Search is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			if (GetOptionTextBeforeSearch.contentEquals(GetOptionTextAfterSearch)) {
				sa.assertTrue(true);
				Logger.info("Search field functionality is working is Passed");
			}else {
				sa.assertTrue(false);
				Logger.error("Search field functionality is working is Failed");
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				DDTP.ClickOnCloseIconFromAttributeFieldListSearchBoxOpportunityAttributes();
				Logger.info("Click On Close Icon From AttributeFieldList SearchBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Close Icon From AttributeFieldList SearchBox is Failed",e);
				sa.assertAll();
			}

			Logger.info("----------- Save the OpportunityAttributes Operation -----------");
			Thread.sleep(1500);
			try {
				DDTP.ClickOnSaveButtonForOpportunityAttributes();
				Logger.info("Click On Save Button For OpportunityAttributes is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Save Button For OpportunityAttributes is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				DDTP.ClickOnConfirmButton();
				Logger.info("Click On Confirm Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Confirm Button is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				if (DDTP.DisplayedSuccessMessage()==true) {
					Logger.info("Displayed Success Message is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Success Message is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				if (DDTP.DisplayedAlertMessageForOpportunityAttributes()==true) {
					Logger.info("Displayed Alert Message after save the OpportunityAttributes operation is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Alert Message after save the OpportunityAttributes operation is Failed",e);
				sa.assertAll();
			}

		}else {
			Logger.info("Displayed Alert Message,So skipped OpportunityAttributes Opeartion");
			sa.assertTrue(true);
		}


		Logger.info("**************************************** Opportunity Activity Attributes Operation*******************************************");
		Thread.sleep(3000);
		try {
			DDTP.ClickOnDropdownToExpansionThePannel();
			Logger.info("Click On Dropdown for Opportunity Activity Attributes is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Dropdown for Opportunity Activity Attributes is Failed",e);
			sa.assertAll();
		}


		Thread.sleep(2000);
		if (DDTP.DisplayedAlertMessageForOpportunityActivityAttributes()==false) {
			Logger.info("Alert Message is Not Displayed,So continue the OpportunityActivityAttributes Opeartion");

			if (DDTP.DisplayedNoRecordFoundInSelectedAttributeFieldListForOpportunityActivityAttributes()==false) {
				Logger.info("Clear all the options which is already presented from the SelectedAttributeFieldList");
				List<WebElement> AllOptionsLink = driver.findElements(By.xpath("(//mat-panel-title[text()=' Opportunity Activity Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//li[@mattooltipclass='custom-tooltip-style']"));
				int Count = AllOptionsLink.size();

				for (int i = 0; i < Count; i++) {

					WebElement GetOptionLink = AllOptionsLink.get(i);
					GetOptionLink.click();
					Thread.sleep(300);
				}
				Thread.sleep(1500);
				try {
					DDTP.ClickOnRemoveButtonForOpportunityActivityAttributes();
					Logger.info("Click On Remove Button is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Remove Button is Failed",e);
					sa.assertAll();
				}
				try {
					if (DDTP.DisplayedNoRecordFoundInSelectedAttributeFieldListForOpportunityActivityAttributes()==true) {
						Logger.info("Displayed NoRecordFound In SelectedAttributeFieldList,So continue the Operation");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Not Displayed NoRecordFound In SelectedAttributeFieldList,So continue the Operation",e);
					sa.assertAll();
				}
			}



			Logger.info("----------- Selecting the options From Attribute field list -----------");
			Thread.sleep(1500);
			try {
				DDTP.SelectBooleanOptionForOpportunityActivityAttributes();
				Logger.info("Select Boolean Option From Attribute field list is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select Boolean Option From Attribute field list is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				DDTP.SelectStringOptionForOpportunityActivityAttributes();
				Logger.info("Select String Option From Attribute field list is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select String Option From Attribute field list is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				DDTP.SelectNumberOptionForOpportunityActivityAttributes();
				Logger.info("Select Number Option From Attribute field list is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select Number Option From Attribute field list is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				DDTP.SelectDateOptionForOpportunityActivityAttributes();
				Logger.info("Select Date Option From Attribute field list is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select Date Option From Attribute field list is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				DDTP.ClickOnAddButtonForOpportunityActivityAttributes();
				Logger.info("Click On AddButton is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On AddButton is Failed",e);
				sa.assertAll();
			}
			Logger.info("----------- Verifying the selected options are displayed or not in SelectedAttributeFieldList -----------");
			Thread.sleep(1500);
			try {
				if (DDTP.DisplayedBooleanOptionForOpportunityActivityAttributesInSelectedAttributeFieldList()==true) {
					Logger.info("Displayed selected Boolean Option in SelectedAttributeFieldList is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed selected Boolean Option in SelectedAttributeFieldList is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1000);
			try {
				if (DDTP.DisplayedStringOptionForOpportunityActivityAttributesInSelectedAttributeFieldList()==true) {
					Logger.info("Displayed selected String Option in SelectedAttributeFieldList is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed selected Boolean Option in SelectedAttributeFieldList is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1000);
			try {
				if (DDTP.DisplayedNumberOptionForOpportunityActivityAttributesInSelectedAttributeFieldList()==true) {
					Logger.info("Displayed selected Number Option in SelectedAttributeFieldList is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed selected Number Option in SelectedAttributeFieldList is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1000);
			try {
				if (DDTP.DisplayedDateOptionForOpportunityActivityAttributesInSelectedAttributeFieldList()==true) {
					Logger.info("Displayed selected Date Option in SelectedAttributeFieldList is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed selected Date Option in SelectedAttributeFieldList is Failed",e);
				sa.assertAll();
			}

			Logger.info("----------- Move backthe Selected Boolean option from SelectedAttributeFieldList to AttributeFieldList -----------");

			Thread.sleep(1500);
			try {
				DDTP.ClickBooleanOptionForOpportunityActivityAttributesFromTheSelectedAttributeFieldList();
				Logger.info("Deselect Boolean Option from SelectedAttributeFieldList is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Deselect Boolean Option from SelectedAttributeFieldList is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				DDTP.ClickOnRemoveButtonForOpportunityActivityAttributes();
				Logger.info("Click On Remove Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Remove Button is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				if (DDTP.DisplayedBooleanOptionForOpportunityActivityAttributesInSelectedAttributeFieldList()==false) {
					Logger.info("Deselected Boolean Option from SelectedAttributeFieldList is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Deselected Boolean Option from SelectedAttributeFieldList is Failed",e);
				sa.assertAll();
			}

			Logger.info("----------- Search Operation for Selected Attribute field list in OpportunityAttributes  -----------");
			Thread.sleep(1500);
			String GetOptionTextBeforeSearch="";
			try {
				GetOptionTextBeforeSearch = driver.findElement(By.xpath("((//mat-panel-title[text()=' Opportunity Activity Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//li[@mattooltipclass='custom-tooltip-style']//span[text()])[1]")).getText();
				Logger.info("Get Text from the option Before search is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Get Text from the option Before search is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				driver.findElement(By.xpath("(//mat-panel-title[text()=' Opportunity Activity Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//input[@name='filterSource']")).sendKeys(GetOptionTextBeforeSearch);
				Logger.info("Enter Text in Attribute field list search box is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter Text in Attribute field list search box is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			String GetOptionTextAfterSearch="";
			try {
				GetOptionTextAfterSearch = driver.findElement(By.xpath("(//mat-panel-title[text()=' Opportunity Activity Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//li[@mattooltipclass='custom-tooltip-style']//span[text()]")).getText();
				Logger.info("Get Text from the option After Search is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Get Text from the option After Search is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			if (GetOptionTextBeforeSearch.contentEquals(GetOptionTextAfterSearch)) {
				sa.assertTrue(true);
				Logger.info("Search field functionality is working is Passed");
			}else {
				sa.assertTrue(false);
				Logger.error("Search field functionality is working is Failed");
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				DDTP.ClickOnCloseIconFromSelectedAttributeFieldListSearchBoxOpportunityActivityAttributes();
				Logger.info("Click On Close Icon From SelectedAttributeFieldList SearchBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Close Icon From SelectedAttributeFieldList SearchBox is Failed",e);
				sa.assertAll();
			}

			Logger.info("----------- Save the Opportunity Activity Attributes Operation -----------");
			Thread.sleep(1500);
			try {
				DDTP.ClickOnSaveButtonForOpportunityActivityAttributes();
				Logger.info("Click On Save Button For Opportunity Activity Attributes is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Save Button For Opportunity Activity Attributes is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				DDTP.ClickOnConfirmButton();
				Logger.info("Click On Confirm Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Confirm Button is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				if (DDTP.DisplayedSuccessMessage()==true) {
					Logger.info("Displayed Success Message is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Success Message is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				if (DDTP.DisplayedAlertMessageForOpportunityActivityAttributes()==true) {
					Logger.info("Displayed Alert Message after save the OpportunityActivityAttributes operation is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Alert Message after save the OpportunityActivityAttributes operation is Failed",e);
				sa.assertAll();
			}

		}else {
			Logger.info("Displayed Alert Message,So skipped Opportunity Activity Attributes Opeartion");
			sa.assertTrue(true);
		}

		Logger.info("//*********************************************** Detail Tab *******************************************");
		Thread.sleep(2500);
		try {
			APOM.ClickOnDetailTab();
			Logger.info("Click On Detail Tab is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Detail Tab is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(4000);
		if (APOM.GettextLastUpdatedOnForCopyAccountDatatoLead().contains("Undefined")) {
			sa.assertTrue(false);
			Logger.error("'"+APOM.GettextLastUpdatedOnForCopyAccountDatatoLead()+"' is Showing for Last Updated On");
			sa.assertAll();
		}
		else {
			sa.assertTrue(true);
			Logger.info("Not showing 'Undefined' for Last Updated On");
			sa.assertAll();	
		}
		Thread.sleep(2500);
		if (APOM.GettextLastUpdatedBy().contains("Undefined")) {
			sa.assertTrue(false);
			Logger.error("'"+APOM.GettextLastUpdatedBy()+"' is Showing for Last Updated By");
			sa.assertAll();
		}
		else {
			sa.assertTrue(true);
			Logger.info("Not showing 'Undefined' for Last Updated By");
			sa.assertAll();	
		}
	}
}
