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

public class TC_Sanity_Contact_DataDictionaryIndex_Administration extends BaseClass {
	private static final Logger Logger = LogManager.getLogger(TC_Sanity_Contact_DataDictionaryIndex_Administration.class);

	@Test(description = "Administration_DataDictionaryIndex_Section")
	@Step("DataDictionaryIndex_Contact_Section")
	@Description("DataDictionaryIndex_Contact_Section")

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
			DDTP.ClickOnContactBox();
			Logger.info("Click on ContactBox is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on ContactBox is Failed",e);
			sa.assertAll();
		}

		Logger.info("**************************************** ContactAttributes Operation *******************************************");
		Thread.sleep(2000);
		if (DDTP.DisplayedAlertMessageForContactAttributes()==false) {
			Logger.info("Alert Message is Not Displayed,So continue the ContactAttributes Opeartion");

			if (DDTP.DisplayedNoRecordFoundInSelectedAttributeFieldListContactAttributes()==false) {
				Logger.info("Clear all the options which is already presented from the SelectedAttributeFieldList");
				List<WebElement> AllOptionsLink = driver.findElements(By.xpath("(//mat-panel-title[text()=' Contact Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//li[@mattooltipclass='custom-tooltip-style']"));
				int Count = AllOptionsLink.size();

				for (int i = 0; i < Count; i++) {

					WebElement GetOptionLink = AllOptionsLink.get(i);
					GetOptionLink.click();
					Thread.sleep(300);
				}
				Thread.sleep(1500);
				try {
					DDTP.ClickOnRemoveButtonForContactAttributes();
					Logger.info("Click On Remove Button is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Remove Button is Failed",e);
					sa.assertAll();
				}
				Thread.sleep(300);
				try {
					if (DDTP.DisplayedNoRecordFoundInSelectedAttributeFieldListContactAttributes()==true) {
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
				DDTP.SelectBooleanOptionForContactAttributes();
				Logger.info("Select Boolean Option From Attribute field list is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select Boolean Option From Attribute field list is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				DDTP.SelectStringOptionForContactAttributes();
				Logger.info("Select String Option From Attribute field list is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select String Option From Attribute field list is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				DDTP.SelectNumberOptionForContactAttributes();
				Logger.info("Select Number Option From Attribute field list is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select Number Option From Attribute field list is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				DDTP.SelectDateOptionForContactAttributes();
				Logger.info("Select Date Option From Attribute field list is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select Date Option From Attribute field list is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				DDTP.ClickOnAddButtonForContactAttributes();
				Logger.info("Click On AddButton is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On AddButton is Failed",e);
				sa.assertAll();
			}

			Logger.info("----------- Verifying the selected options are displayed or not in SelectedAttributeFieldList -----------");
			Thread.sleep(1500);
			try {
				if (DDTP.DisplayedBooleanOptionForContactAttributeInSelectedAttributeFieldList()==true) {
					Logger.info("Displayed selected Boolean Option in SelectedAttributeFieldList is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed selected Boolean Option in SelectedAttributeFieldList is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1000);
			try {
				if (DDTP.DisplayedStringOptionForContactAttributeInSelectedAttributeFieldList()==true) {
					Logger.info("Displayed selected String Option in SelectedAttributeFieldList is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed selected Boolean Option in SelectedAttributeFieldList is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1000);
			try {
				if (DDTP.DisplayedNumberOptionForContactAttributeInSelectedAttributeFieldList()==true) {
					Logger.info("Displayed selected Number Option in SelectedAttributeFieldList is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed selected Number Option in SelectedAttributeFieldList is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1000);
			try {
				if (DDTP.DisplayedDateOptionForContactAttributeInSelectedAttributeFieldList()==true) {
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
				DDTP.ClickBooleanOptionForContactAttributeFromTheSelectedAttributeFieldList();
				Logger.info("Deselect Boolean Option from SelectedAttributeFieldList is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Deselect Boolean Option from SelectedAttributeFieldList is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				DDTP.ClickOnRemoveButtonForContactAttributes();
				Logger.info("Click On Remove Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Remove Button is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				if (DDTP.DisplayedBooleanOptionForContactAttributeInSelectedAttributeFieldList()==false) {
					Logger.info("Deselected Boolean Option from SelectedAttributeFieldList is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Deselected Boolean Option from SelectedAttributeFieldList is Failed",e);
				sa.assertAll();
			}

			Logger.info("----------- Search Operation for Attribute field list in ContactAttributes  -----------");
			Thread.sleep(1500);
			String GetOptionTextBeforeSearch="";
			try {
				GetOptionTextBeforeSearch = driver.findElement(By.xpath("((//mat-panel-title[text()=' Contact Attributes ']//..//..//..)[1]//label[text()='Attribute Field List']//..//li[@class='ng-star-inserted']//span[text()])[1]")).getText();
				Logger.info("Get Text from the option Before search is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Get Text from the option Before search is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				driver.findElement(By.xpath("(//mat-panel-title[text()=' Contact Attributes ']//..//..//..)[1]//label[text()='Attribute Field List']//..//input[@name='filterSource']")).sendKeys(GetOptionTextBeforeSearch);
				Logger.info("Enter Text in Attribute field list search box is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter Text in Attribute field list search box is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			String GetOptionTextAfterSearch="";
			try {
				GetOptionTextAfterSearch = driver.findElement(By.xpath("(//mat-panel-title[text()=' Contact Attributes ']//..//..//..)[1]//label[text()='Attribute Field List']//..//li[@class='ng-star-inserted']//span[text()]")).getText();
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
				DDTP.ClickOnCloseIconFromAttributeFieldListSearchBoxForContactAttributes();
				Logger.info("Click On Close Icon From AttributeFieldList SearchBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Close Icon From AttributeFieldList SearchBox is Failed",e);
				sa.assertAll();
			}


			Logger.info("----------- Save the ContactAttributes Operation -----------");
			Thread.sleep(1500);
			try {
				DDTP.ClickOnSaveButtonForContactAttributes();
				Logger.info("Click On Save Button For ContactAttributes is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Save Button For ContactAttributes is Failed",e);
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
				if (DDTP.DisplayedAlertMessageForContactAttributes()==true) {
					Logger.info("Displayed Alert Message after save the ContactAttributes operation is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Alert Message after save the ContactAttributes operation is Failed",e);
				sa.assertAll();
			}

		}else {
			Logger.info("Displayed Alert Message,So skipped ContactAttributes Opeartion");
			sa.assertTrue(true);
		}

		Logger.info("**************************************** Contact Activity Attributes Operation*******************************************");
		Thread.sleep(3000);
		try {
			DDTP.ClickOnDropdownToExpansionThePannel();
			Logger.info("Click On Dropdown for Contact Activity Attributes is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Dropdown for Contact Activity Attributes is Failed",e);
			sa.assertAll();
		}


		Thread.sleep(2000);
		if (DDTP.DisplayedAlertMessageForContactActivityAttributes()==false) {
			Logger.info("Alert Message is Not Displayed,So continue the ContactActivityAttributes Opeartion");

			if (DDTP.DisplayedNoRecordFoundInSelectedAttributeFieldListForContactActivityAttributes()==false) {
				Logger.info("Clear all the options which is already presented from the SelectedAttributeFieldList");
				List<WebElement> AllOptionsLink = driver.findElements(By.xpath("(//mat-panel-title[text()=' Contact Activity Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//li[@mattooltipclass='custom-tooltip-style']"));
				int Count = AllOptionsLink.size();

				for (int i = 0; i < Count; i++) {

					WebElement GetOptionLink = AllOptionsLink.get(i);
					GetOptionLink.click();
					Thread.sleep(300);
				}
				Thread.sleep(1500);
				try {
					DDTP.ClickOnRemoveButtonForContactActivityAttributes();
					Logger.info("Click On Remove Button is Passed");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Remove Button is Failed",e);
					sa.assertAll();
				}
				try {
					if (DDTP.DisplayedNoRecordFoundInSelectedAttributeFieldListForContactActivityAttributes()==true) {
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
				DDTP.SelectBooleanOptionForContactActivityAttributes();
				Logger.info("Select Boolean Option From Attribute field list is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select Boolean Option From Attribute field list is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				DDTP.SelectStringOptionForContactActivityAttributes();
				Logger.info("Select String Option From Attribute field list is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select String Option From Attribute field list is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				DDTP.SelectNumberOptionForContactActivityAttributes();
				Logger.info("Select Number Option From Attribute field list is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select Number Option From Attribute field list is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				DDTP.SelectDateOptionForContactActivityAttributes();
				Logger.info("Select Date Option From Attribute field list is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select Date Option From Attribute field list is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				DDTP.ClickOnAddButtonForContactActivityAttributes();
				Logger.info("Click On AddButton is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On AddButton is Failed",e);
				sa.assertAll();
			}
			Logger.info("----------- Verifying the selected options are displayed or not in SelectedAttributeFieldList -----------");
			Thread.sleep(1500);
			try {
				if (DDTP.DisplayedBooleanOptionForContactActivityAttributesInSelectedAttributeFieldList()==true) {
					Logger.info("Displayed selected Boolean Option in SelectedAttributeFieldList is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed selected Boolean Option in SelectedAttributeFieldList is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1000);
			try {
				if (DDTP.DisplayedStringOptionForContactActivityAttributesInSelectedAttributeFieldList()==true) {
					Logger.info("Displayed selected String Option in SelectedAttributeFieldList is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed selected Boolean Option in SelectedAttributeFieldList is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1000);
			try {
				if (DDTP.DisplayedNumberOptionForContactActivityAttributesInSelectedAttributeFieldList()==true) {
					Logger.info("Displayed selected Number Option in SelectedAttributeFieldList is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed selected Number Option in SelectedAttributeFieldList is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1000);
			try {
				if (DDTP.DisplayedDateOptionForContactActivityAttributesInSelectedAttributeFieldList()==true) {
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
				DDTP.ClickBooleanOptionForContactActivityAttributesFromTheSelectedAttributeFieldList();
				Logger.info("Deselect Boolean Option from SelectedAttributeFieldList is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Deselect Boolean Option from SelectedAttributeFieldList is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				DDTP.ClickOnRemoveButtonForContactActivityAttributes();
				Logger.info("Click On Remove Button is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Remove Button is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				if (DDTP.DisplayedBooleanOptionForContactActivityAttributesInSelectedAttributeFieldList()==false) {
					Logger.info("Deselected Boolean Option from SelectedAttributeFieldList is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Deselected Boolean Option from SelectedAttributeFieldList is Failed",e);
				sa.assertAll();
			}

			Logger.info("----------- Search Operation for Selected Attribute field list in ContactAttributes  -----------");
			Thread.sleep(1500);
			String GetOptionTextBeforeSearch="";
			try {
				GetOptionTextBeforeSearch = driver.findElement(By.xpath("((//mat-panel-title[text()=' Contact Activity Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//li[@mattooltipclass='custom-tooltip-style']//span[text()])[1]")).getText();
				Logger.info("Get Text from the option Before search is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Get Text from the option Before search is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				driver.findElement(By.xpath("(//mat-panel-title[text()=' Contact Activity Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//input[@name='filterSource']")).sendKeys(GetOptionTextBeforeSearch);
				Logger.info("Enter Text in Attribute field list search box is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter Text in Attribute field list search box is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			String GetOptionTextAfterSearch="";
			try {
				GetOptionTextAfterSearch = driver.findElement(By.xpath("(//mat-panel-title[text()=' Contact Activity Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//li[@mattooltipclass='custom-tooltip-style']//span[text()]")).getText();
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
				DDTP.ClickOnCloseIconFromSelectedAttributeFieldListSearchBoxForContactActivityAttributes();
				Logger.info("Click On Close Icon From SelectedAttributeFieldList SearchBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Close Icon From SelectedAttributeFieldList SearchBox is Failed",e);
				sa.assertAll();
			}


			Logger.info("----------- Save the Contact Activity Attributes Operation -----------");
			Thread.sleep(1500);
			try {
				DDTP.ClickOnSaveButtonForContactActivityAttributes();
				Logger.info("Click On Save Button For Contact Activity Attributes is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Save Button For Contact Activity Attributes is Failed",e);
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
				if (DDTP.DisplayedAlertMessageForContactActivityAttributes()==true) {
					Logger.info("Displayed Alert Message after save the ContactActivityAttributes operation is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Alert Message after save the ContactActivityAttributes operation is Failed",e);
				sa.assertAll();
			}

		}else {
			Logger.info("Displayed Alert Message,So skipped Contact Activity Attributes Opeartion");
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
