package com.leadAngel.pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactManagement_PageObjectModel {
	
	  WebDriver ldriver;

	public ContactManagement_PageObjectModel(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
}
	
	//********************************************************Contact Management************************************************
	
	@FindBy(xpath = "//div[text()=' Contact Management']")
	WebElement ContactManagement;

	//********************************************************Contact Routing Teritory************************************************

	@FindBy(xpath = "//button[@aria-label='toggle Contact Routing Territory']")
	WebElement ContactRoutingTeritoryDropDown;
	@FindBy(xpath = "//span[text()='Contact Routing Territory ']")
	WebElement ContactRoutingTeritory;
	@FindBy(xpath = "//h4[text()='Contact Routing Territory Overview']")
	WebElement DisplayContactRoutingTeritoryOverview;
	
	
	@FindBy(xpath = "//div[@cdkdragboundary='.example-boundary']")
	WebElement AddField;
	@FindBy(xpath = "//mat-list-item[contains(@id,'CRM Contact Filter')]")
	WebElement CRMcontactFilter_DND;
	@FindBy(xpath = "(//option[text()='is'])[3]")
	WebElement CRMcontactFilterOption;
	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[3]")
	WebElement CRMcontactFilterValueDropDown;
	@FindBy(xpath = "(//span[@class='custom-option-content ng-star-inserted'])[1]")
	WebElement CRMcontactFilterValueOption;
	
	
	@FindBy(xpath = "//mat-list-item[contains(@id,'System Data Dictionary')]")
	WebElement SystemDataDictionary_DND;
	@FindBy(xpath = "(//option[text()='is not'])[4]")
	WebElement DataDictionaryOption;
	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[4]")
	WebElement DataDictionaryValueDropDown;
	@FindBy(xpath = "(//span[@class='custom-option-content ng-star-inserted'])[1]")
	WebElement DataDictionaryValueOption;
	
	//********************************************************WaitFilter************************************************
	@FindBy(xpath = "//i[@class='righticon-NUMBER']//..//span[text()='Other Latitude']")
	WebElement OtherLatitude_DND;
	@FindBy(xpath = "//option[text()=' is greater than ']")
	WebElement OtherLatitude_Option;
	@FindBy(xpath = "//input[@id='txtNumber_2']")
	WebElement EnterOtherLatitude_Option;//6456
	//*******************************************************Contact Router************************************************
	@FindBy(xpath = "//span[text()='Contact Router ']")
	WebElement ContactRouter;
	
	@FindBy(xpath = "//button[@aria-label='toggle Contact Router']")
	WebElement ContactRouterDropDown;
	@FindBy(xpath = "//h4[text()='Contact Router Overview']")
	WebElement ContactRouterOverview;
	@FindBy(xpath = "//div[contains(text(),' Contact Filter ')]")
	WebElement ContactFilter_DND;
	@FindBy(xpath = "(//span[@class='mat-checkbox-inner-container'])[2]")
	WebElement CheckBoxForAssignmentBlockAEtoSDRForContactMngmt;
	//*******************************************************CRM contact Filter************************************************
	@FindBy(xpath = "//span[text()='CRM Contact Filter ']")
	WebElement CRMContactFilter ;
	
	@FindBy(xpath = "//button[@aria-label='toggle CRM Contact Filter']")
	WebElement CRMcontactFilterDropDown;
	@FindBy(xpath = "//h4[text()='CRM Contact Filter Overview']")
	WebElement CRMContactFilterOverview;

	@FindBy(xpath="//button[(text()=' Contact Attributes ')]")
	WebElement ContactAttr;
	
	@FindBy(xpath="//span[text()='Contact Id']")
	WebElement ContactId_DND;
	@FindBy(xpath="//span[text()='Deleted']")
	WebElement Deleted_DND;
	@FindBy(xpath="//span[text()='Other Longitude']")
	WebElement OtherLongitude_DND;
	@FindBy(xpath="//span[text()='Birthdate']")
	WebElement BithDate_DND;
	
	@FindBy(xpath="//button[@aria-label='toggle CRM1']")
	WebElement ContactMgntFolder;
	
	@FindBy(xpath="(//option[text()='not in'])[1]")
	WebElement ContactID_NotIn;	
	@FindBy(xpath="//mat-icon[text()='add_box']")
	WebElement ClickOnAddButton;
	
	//*******************************************************CRM contact Filter************************************************
	public void ClickOnAddButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAddButton));
		ClickOnAddButton.click();
	}
	public void ClickOnContactID_NotIn() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ContactID_NotIn));
		ContactID_NotIn.click();
	}
	public void ContactMgntFolder() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ContactMgntFolder));
		ContactMgntFolder.click();
	}
	
	public void ContactId_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ContactId_DND));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(ContactId_DND).pause(Duration.ofSeconds(0)).clickAndHold(ContactId_DND)
		.pause(Duration.ofSeconds(0))
		.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}
	public void Deleted_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(Deleted_DND));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(Deleted_DND).pause(Duration.ofSeconds(0)).clickAndHold(Deleted_DND)
		.pause(Duration.ofSeconds(0))
		.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}
	public void OtherLongitude_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(OtherLongitude_DND));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(OtherLongitude_DND).pause(Duration.ofSeconds(0)).clickAndHold(OtherLongitude_DND)
		.pause(Duration.ofSeconds(0))
		.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}
	public void BithDate_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(BithDate_DND));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(BithDate_DND).pause(Duration.ofSeconds(0)).clickAndHold(BithDate_DND)
		.pause(Duration.ofSeconds(0))
		.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}
	
	public void ClickoAgainCRMContactFilter() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CRMContactFilter));
		CRMContactFilter.click();
	}
	public void RightClickOnCRMContactFilter() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25))
		.until(ExpectedConditions.elementToBeClickable(CRMContactFilter));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(CRMContactFilter).contextClick(CRMContactFilter).build()
		.perform();
	}
	public void CRMcontactFilterDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CRMcontactFilterDropDown));
		CRMcontactFilterDropDown.click();
	}
	public boolean CRMContactFilterOverview() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CRMContactFilterOverview));
		return CRMContactFilterOverview.isDisplayed();
	}
	public void ContactAttr() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ContactAttr));
		ContactAttr.click();
	}
	//*******************************************************Contact Router************************************************
	public void CheckBoxForAssignmentBlockAEtoSDRForContactMngmt() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CheckBoxForAssignmentBlockAEtoSDRForContactMngmt));
		CheckBoxForAssignmentBlockAEtoSDRForContactMngmt.click();
	}
	public void ContactFilter_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ContactFilter_DND));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(ContactFilter_DND)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(ContactFilter_DND)
        .pause(Duration.ofSeconds(1))
        .moveByOffset(-400,165) //change the x, y values to be applicable for your cases
        .moveByOffset(-400,165)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	public void ContactFilter2_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ContactFilter_DND));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(ContactFilter_DND)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(ContactFilter_DND)
        .pause(Duration.ofSeconds(1))
        .moveByOffset(-300,50) //change the x, y values to be applicable for your cases
        .moveByOffset(-300,50)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	
	
	public void RightClickOnContactRouter() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25))
		.until(ExpectedConditions.elementToBeClickable(ContactRouter));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(ContactRouter).contextClick(ContactRouter).build()
		.perform();
	}
	public void ContactRouterDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ContactRouterDropDown));
		ContactRouterDropDown.click();
	}
	public void AgainClickContactRouter() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ContactRouter));
		ContactRouter.click();
	}
	public boolean ContactRouterOverview() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ContactRouterOverview));
		return ContactRouterOverview.isDisplayed();
	}
	
	//********************************************************WaitFilter************************************************

	public void OtherLatitude_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(OtherLatitude_DND));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(OtherLatitude_DND).pause(Duration.ofSeconds(0)).clickAndHold(OtherLatitude_DND)
		.pause(Duration.ofSeconds(0))
		.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}
	public void OtherLatitude_Option() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(OtherLatitude_Option));
		OtherLatitude_Option.click();
	}
	public void EnterOtherLatitude_Option() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterOtherLatitude_Option));
		EnterOtherLatitude_Option.sendKeys("681");
	}
	//********************************************************Contact Management************************************************
	public void ContactManagement() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ContactManagement));
		ContactManagement.click();
	}
	//********************************************************Contact Routing Teritory************************************************
	public void ContactRoutingTeritoryDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ContactRoutingTeritoryDropDown));
		ContactRoutingTeritoryDropDown.click();
	}
	public void ContextClickOnContactRoutingTeritory() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25))
		.until(ExpectedConditions.elementToBeClickable(ContactRoutingTeritory));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(ContactRoutingTeritory).contextClick(ContactRoutingTeritory).build()
		.perform();
	}
	public void AgainClickContactRoutingTeritory() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ContactRoutingTeritory));
		ContactRoutingTeritory.click();
	}
	public boolean DisplayContactRoutingTeritoryOverview() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayContactRoutingTeritoryOverview));
		 return DisplayContactRoutingTeritoryOverview.isDisplayed();
	}
	
	
	
	public void CRMcontactFilter_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CRMcontactFilter_DND));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(CRMcontactFilter_DND).pause(Duration.ofSeconds(0)).clickAndHold(CRMcontactFilter_DND)
		.pause(Duration.ofSeconds(0))
		.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}
	public void CRMcontactFilterOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CRMcontactFilterOption));
		CRMcontactFilterOption.click();
	}
	public void CRMcontactFilterValueDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CRMcontactFilterValueDropDown));
		CRMcontactFilterValueDropDown.click();
	}
	public void CRMcontactFilterValueOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CRMcontactFilterValueOption));
		CRMcontactFilterValueOption.click();
	}
	
	
	
	public void SstemDataDictionary_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SystemDataDictionary_DND));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(SystemDataDictionary_DND).pause(Duration.ofSeconds(0)).clickAndHold(SystemDataDictionary_DND)
		.pause(Duration.ofSeconds(0))
		.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}
	public void DataDictionaryOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DataDictionaryOption));
		DataDictionaryOption.click();
	}
	public void DataDictionaryValueDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DataDictionaryValueDropDown));
		DataDictionaryValueDropDown.click();
	}
	public void DataDictionaryValueOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DataDictionaryValueOption));
		DataDictionaryValueOption.click();
	}
	
	//************************************** Contact Processing without Routing *****************************************
	
	@FindBy(xpath = "//span[text()='Contact Processing without Routing ']")
	WebElement ContactProcessingWithoutRouting;
	
	@FindBy(xpath = "//button[@aria-label='toggle Contact Processing without Routing']")
	WebElement ContactProcessingWithoutRoutingDropDown;
	
	@FindBy(xpath = "//h4[text()='Contact Processing without Routing Overview']")
	WebElement ContactProcessingWithoutRoutingOverview;
	
	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[2]")
	WebElement ContactProcessingFeederFilterDropDown;
	
	@FindBy(xpath = "(//mat-icon[text()='check_box'])[3]")
	WebElement CheckBoxForDefaultContactOwner;
	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[3]")
	WebElement DefaultContactOwnerDropDown;
	
	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[4]")
	WebElement DataValueUpdateWhenRoutedToDefaultContactOwnerDropDown1;
	@FindBy(xpath = "(//mat-icon[text()='check_box'])[4]")
	WebElement CheckBoxForDataValueUpdateWhenRoutedToDefaultContactOwner;
	
	@FindBy(xpath = "(//mat-icon[text()='check_box'])[2]")
	WebElement DisplayCheckBoxForLeadProcessingFeederFilter;
	
	@FindBy(xpath = "(//div[text()='Maximum Active Contact Processing count is exceeded'])[1]")
	WebElement DisplayMaximumActiveContactProcessingCountIsExceeded;
	
	public boolean DisplayMaximumActiveContactProcessingCountIsExceeded() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayMaximumActiveContactProcessingCountIsExceeded));
			return DisplayMaximumActiveContactProcessingCountIsExceeded.isDisplayed();
		} catch (Exception e) {
		return false;
		}
	}
	
	
	
	public boolean DisplayCheckBoxForLeadProcessingFeederFilter() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayCheckBoxForLeadProcessingFeederFilter));
			return DisplayCheckBoxForLeadProcessingFeederFilter.isDisplayed();
		} catch (Exception e) {
		return false;
		}
	}
	
	
	public void CheckBoxForDataValueUpdateWhenRoutedToDefaultContactOwner() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(CheckBoxForDataValueUpdateWhenRoutedToDefaultContactOwner));
		CheckBoxForDataValueUpdateWhenRoutedToDefaultContactOwner.click();
	}
	public void DataValueUpdateWhenRoutedToDefaultContactOwnerDropDown1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(DataValueUpdateWhenRoutedToDefaultContactOwnerDropDown1));
		DataValueUpdateWhenRoutedToDefaultContactOwnerDropDown1.click();
	}
	public void ClickDefaultContactOwnerDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(DefaultContactOwnerDropDown));
		DefaultContactOwnerDropDown.click();
	}
	public void CheckBoxForDefaultContactOwner() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(CheckBoxForDefaultContactOwner));
		CheckBoxForDefaultContactOwner.click();
	}
	public void ContactProcessingFeederFilterDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ContactProcessingFeederFilterDropDown));
		ContactProcessingFeederFilterDropDown.click();
	}
	public boolean ContactProcessingWithoutRoutingOverview() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ContactProcessingWithoutRoutingOverview));
		return ContactProcessingWithoutRoutingOverview.isDisplayed();
	}
	
	public void RightClickOnContactProcessingWithoutRouting() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25))
		.until(ExpectedConditions.elementToBeClickable(ContactProcessingWithoutRouting));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(ContactProcessingWithoutRouting).contextClick(ContactProcessingWithoutRouting).build()
		.perform();
	}
	
	public void ClickOnContactProcessingWithoutRouting() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ContactProcessingWithoutRouting));
		ContactProcessingWithoutRouting.click();
	}
	public void ContactProcessingWithoutRoutingDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ContactProcessingWithoutRoutingDropDown));
		ContactProcessingWithoutRoutingDropDown.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
