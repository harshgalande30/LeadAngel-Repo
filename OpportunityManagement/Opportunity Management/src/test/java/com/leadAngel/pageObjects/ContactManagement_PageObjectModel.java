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
	WebElement DataDictionary_DND;
	@FindBy(xpath = "(//option[text()='is not'])[4]")
	WebElement DataDictionaryOption;
	@FindBy(xpath = "(//mat-select[@name='seldropDown'])[4]")
	WebElement DataDictionaryValueDropDown;
	@FindBy(xpath = "(//mat-option[@role='option'])[2]")
	WebElement DataDictionaryValueOption;
	
	//********************************************************WaitFilter************************************************
	@FindBy(xpath = "(//i[@class='righticon-NUMBER'])[1]")
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
	
	@FindBy(xpath="(//mat-list-item[@mattooltipclass='custom-tooltip-style'])[1]")
	WebElement ContactId_DND;
	@FindBy(xpath="(//mat-list-item[@mattooltipclass='custom-tooltip-style'])[4]")
	WebElement Deleted_DND;
	@FindBy(xpath="(//mat-list-item[@mattooltipclass='custom-tooltip-style'])[16]")
	WebElement OtherLongitude_DND;
	@FindBy(xpath="(//mat-list-item[@mattooltipclass='custom-tooltip-style'])[37]")
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
		actions.moveToElement(CRMContactFilter).click(CRMContactFilter).contextClick(CRMContactFilter).build()
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
		actions.moveToElement(ContactRouter).click(ContactRouter).contextClick(ContactRouter).build()
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
		actions.moveToElement(ContactRoutingTeritory).click(ContactRoutingTeritory).contextClick(ContactRoutingTeritory).build()
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
	
	
	
	public void DataDictionary_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DataDictionary_DND));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(DataDictionary_DND).pause(Duration.ofSeconds(0)).clickAndHold(DataDictionary_DND)
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
}
