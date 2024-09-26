package com.leadAngel.pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OTS_Router_PageObjectModel {
	
	WebDriver ldriver;

	public OTS_Router_PageObjectModel(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath = "//button[@aria-label='toggle OTS Router']")
	WebElement OTSrouterDropDownsymbol;
	@FindBy(xpath = "//span[text()='OTS Router ']")
	WebElement OTSrouter;
	@FindBy(xpath = "//h4[text()='OTS Router Overview']")
	WebElement DisplayOTSrouterOverView;
	@FindBy(xpath="//div[contains(text(),' OTS Filter ')]")
	WebElement OTSFilter;
	@FindBy(xpath="(//div[@class='drag-start connect ng-star-inserted'])[2]")
	WebElement ActionBlockY;
	@FindBy(xpath = "(//div[@class='drag-start connect AConnection ng-star-inserted'])[1]")
	WebElement RandomSplitA;
	@FindBy(xpath="//div[contains(text(),'Assignment')]")
	WebElement AssignmentBlock;
	@FindBy(xpath="(//span[contains(text(),'OTS Assignment')]/ancestor::div)[14]")
	WebElement OTSassignmentBlockInCanvas;
	@FindBy(xpath = "(//div[@class='drag-start connect CConnection ng-star-inserted'])[1]")
	WebElement RandomSplitC;
	@FindBy(xpath="(//span[contains(text(),'Decision Block')]/ancestor::div)[14]")
	WebElement DecisionBlock;
	@FindBy(xpath = "(//*[name()='rect'][@stroke='green'])")
	WebElement RandomSplitOTSBorderColour;
	@FindBy(xpath = "//div[text()=' Details ']")
	WebElement ClickOnDetailsButton;
	@FindBy(xpath = "//input[@formcontrolname='BlockName']")
	WebElement EnterOTSassignmentName;
	@FindBy(xpath = "//div[text()=' Assignment Options ']")
	WebElement ClickOnAssignmentOptionsButton;
	@FindBy(xpath = "//mat-select[@placeholder='Select Assignment Type']")
	WebElement ClickOnSelectAssignmentTypeDropDown;
	@FindBy(xpath = "//span[text()=' Assign Based on Last Activity Owner ']//..//span[@class='mat-checkbox-inner-container']")
	WebElement ClickOnAssignBasedOnLastActivityOwnerCheckBox;
	@FindBy(xpath = "(//div[@class='radio-item']//input[@type='radio'])[1]")
	WebElement ClickOnAssignToLastActivityOwnerOnTheleadCheckBox;
	@FindBy(xpath = "//input[@formcontrolname='IgnoreOlderActivitiesInDays_LastActivity']")
	WebElement EnterInputforAssignToLastActivityOwnerOnTheleadCheckBox;
	
	@FindBy(xpath = "//label[@class='mat-checkbox-layout']//span[contains(text(),'Email')]")
	WebElement ClickOnEmailNotificationCheckBox;
	@FindBy(xpath = "//span[text()='Select Email Template']")
	WebElement ClickOnEmailNotificationDropDown;
	@FindBy(xpath = "(//div[text()='Select Email Template']//..//..//span[@class='ng-arrow-wrapper'])[3]")
	WebElement ClickOnSetupBroadcastViaEmailNotificationDropDown;
	@FindBy(xpath = "(//div[text()='Select Email Template']//..//..//span[@class='ng-arrow-wrapper'])[2]")
	WebElement ClickOnSetupEmailNotificationDropDown;
	@FindBy(xpath = "//label[@class='mat-checkbox-layout']//span[contains(text(),'Slack Notification')]")
	WebElement ClickOnSlackNotificationCheckBox;
	@FindBy(xpath = "//span[text()='Select Slack Template']")
	WebElement ClickOnSlackNotificationDropDown;
	@FindBy(xpath = "(//div[text()='Select Slack Template']//..//..//span[@class='ng-arrow-wrapper'])[3]")
	WebElement ClickOnBroadcastViaSlackNotificationDropDown;
	@FindBy(xpath = "(//div[text()='Select Slack Template']//..//..//span[@class='ng-arrow-wrapper'])[2]")
	WebElement ClickSetupOnSlackNotificationDropDown;
	@FindBy(xpath = "//label[@class='mat-checkbox-layout']//span[contains(text(),'Text Notification')]")
	WebElement ClickOnTextNotificationCheckBox;
	@FindBy(xpath = "//span[text()='Select Text Template']")
	WebElement ClickOnTextNotificationDropDown;
	@FindBy(xpath = "(//div[text()='Select Text Template']//..//..//span[@class='ng-arrow-wrapper'])[3]")
	WebElement ClickOnBroadcastViaTextNotificationDropDown;
	@FindBy(xpath = "(//div[text()='Select Text Template']//..//..//span[@class='ng-arrow-wrapper'])[2]")
	WebElement ClickOnSetupTextNotificationDropDown;
	@FindBy(xpath = "//label[@class='mat-checkbox-layout']//span[contains(text(),'CRM In-App Notification ')]")
	WebElement ClickOnCRMinAppNotificationCheckBox;
	@FindBy(xpath = "//span[text()='Select CRM In-App Template']")
	WebElement ClickOnCRMinAppNotificationDropDown;
	@FindBy(xpath = "//div[text()='Select CRM In-App Template']//..//..//span[@class='ng-arrow-wrapper']")
	WebElement ClickOnSetupCRMinAppNotificationDropDown;
	@FindBy(xpath = "//label[text()='Assignment Preferences']//..//div//mat-select[@formcontrolname='ActionType']")
	WebElement ClickOnAssignmentOptionDropDown;
	@FindBy(xpath = "//label[text()='Assignment Preferences']//..//div//mat-select[@formcontrolname='ReassignTo']")
	WebElement ClickOnAssignmentOptionForSetUpDropDown;
	@FindBy(xpath = "//label[@class='mat-checkbox-layout']//span[contains(text(),' Assign to AE mapped SDR instead ')]")
	WebElement ClickOnAssignToAEmappedSDRCheckBox;
	@FindBy(xpath = "//span[text()='Select Mapped SDR']")
	WebElement ClickOnSelectMappedSDRDropDown;
	@FindBy(xpath = "(//mat-select[@panelclass='matsearchdropdown'])[1]")
	WebElement ClickAssignBasedFirstDropDown;
	@FindBy(xpath = "(//mat-select[@panelclass='matsearchdropdown'])[2]")
	WebElement ClickAssignBasedSecondDropDown;
	@FindBy(xpath = "(//ng-select[@placeholder='--Select--'])[1]")
	WebElement ClickSetupAssignBasedFirstDropDown;
	@FindBy(xpath = "(//ng-select[@placeholder='--Select--'])[2]")
	WebElement ClickSetupAssignBasedSecondDropDown;
	@FindBy(xpath = "(//*[name()='svg']//*[name()='rect' and contains(@stroke,'green')])[1]")
	WebElement OTSAssignmentBlock;
	@FindBy(xpath = "//mat-select[@placeholder='Select Accept Criteria']")
	WebElement ClickOnAcceptLeadDropDown;
	@FindBy(xpath = "//span[text()='Anyone with the Link can Accept']")
	WebElement ClickOnAcceptLeadInAnyoneWithTheLinkCanAcceptOption;
	@FindBy(xpath = "//mat-select[@placeholder='Select Reject Criteria']")
	WebElement ClickOnRejectLeadDropDown;
	@FindBy(xpath = "//span[text()='Member of a Sales Team']")
	WebElement SelectMemberOfSalesTeamOption;
	@FindBy(xpath = "//mat-select[@placeholder='Select Sales Team Type']")
	WebElement ClickOnSelectSalesTeamTypeDropDown; 
	@FindBy(xpath = "//span[text()='Select Sales Team']")
	WebElement ClickOnSelectSalesTeamDropDown; 
	@FindBy(xpath = "//ng-select[@placeholder='Select Sales Team']")
	WebElement ClickOnSetupSelectSalesTeamDropDown; 
	@FindBy(xpath = "//span[text()='Broadcast to Sales Team ']")
	WebElement ClickOnBroadcastToSalesTeamCheckBox;
	@FindBy(xpath = "//div[text()='Select Sales Team']//..//..//span[@class='ng-arrow-wrapper']")
	WebElement ClickOnSelectSalesTeamBroadCastDropDown;
	@FindBy(xpath = "//span[text()='Email ']")
	WebElement ClickOnEmailCheckBox;
	@FindBy(xpath = "//span[text()='Slack ']")
	WebElement ClickOnSlackCheckBox;
	@FindBy(xpath = "//span[text()='Text ']")
	WebElement ClickOnTextCheckBox;
	@FindBy(xpath = "//span[text()='In App ']")
	WebElement ClickOnInAppCheckBox;
	@FindBy(xpath = "//span[text()='Broadcast via Email']")
	WebElement ClickOnBroadcastViaEmailCheckBox;
	@FindBy(xpath = "//span[text()='Broadcast via Slack']")
	WebElement ClickOnBroadcastViaSlackCheckBox;
	@FindBy(xpath = "//span[text()='Broadcast via Text']")
	WebElement ClickOnBroadcastViaTextCheckBox;
	
	@FindBy(xpath = "//div[text()=' Reassignment Setup ']")
	WebElement ClickOnReassignmentSetupButton;
	@FindBy(xpath = "//span[text()='Add Reassignment Setup']")
	WebElement ClickOnAddReassignmentSetupButton;
	@FindBy(xpath = "//input[@formcontrolname='ReassignmentWaitTime']")
	WebElement EnterReassignmentWaitTime;
	@FindBy(xpath = "//mat-select[@placeholder='Select Min/Sec']")
	WebElement ClickReassignmentWaitTimeDropDown;
	@FindBy(xpath = "//span[text()='Minute(s)']")
	WebElement SelectMinutes;
	@FindBy(xpath = "//span[text()='Second(s)']")
	WebElement SelectSeconds;
	@FindBy(xpath = "//mat-icon[text()='unfold_more']")
	WebElement CollapseAll;	
	
	@FindBy(xpath = "(//ng-select[@placeholder='Select Email Template'])[2]")
	WebElement ClickSelectEmailTemplateDropDownAssignmentSetup;
	@FindBy(xpath = "(//ng-select[@placeholder='Select Slack Template'])[2]")
	WebElement ClickSelectSlackTemplateDropDownAssignmentSetup;
	@FindBy(xpath = "(//ng-select[@placeholder='Select Slack Template'])[2]")
	WebElement ClickSelectSlackTemplateDropDownAssignmentSetupOTSLR;
	@FindBy(xpath = "(//ng-select[@placeholder='Select Text Template'])[2]")
	WebElement ClickSelectTextTemplateDropDownAssignmentSetup;
	@FindBy(xpath = "//ng-select[@placeholder='Select CRM In-App Template']")
	WebElement ClickSelectCRMInAppTemplateDropDownAssignmentSetup;
	
	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])")
	WebElement DefaultLeadOwnerDropDownforLPWRDropDown;
	@FindBy(xpath = "(//mat-icon[text()='check_box'])")
	WebElement CheckBoxForDefaultLeadOwnerLPWR;
	@FindBy(xpath = "//span[text()='Save']")
	WebElement ClickOnSaveButtonFordetailsPageOTS;
	@FindBy(xpath="(//div[contains(text(),'Success')])[1]")
	WebElement DisplaySuccessForDefaultLeadOwnerLPWR;
	
	@FindBy(xpath = "//span[text()=' Delete Draft ']")
	WebElement ClickOnOTSDeleteCraft;
	@FindBy(xpath = "//mat-option//span[text()='Assign Based on a Lookup Field in the Parent Account']")
	WebElement SelectAssignBasedOnLookupFieldInTheParentAccountOption;
	@FindBy(xpath = "//mat-option//span[text()='Live Claim']")
	WebElement SelectLiveClaimOption;
	@FindBy(xpath = "//mat-option//span[text()='Assign to Sales Rep']")
	WebElement SelectAssignToSalesRepOption;
	@FindBy(xpath = "//mat-option//span[text()='Broadcast']")
	WebElement SelectBroadcastOption;
	@FindBy(xpath="//button[@aria-label='toggle Crud']")
	WebElement OTSFolder;
	@FindBy(xpath="//option[text()=' Crud ']")
	WebElement SelectMoveFolder;
	@FindBy(xpath = "//input[@id='menuname']")
	WebElement txtNameObject;
	@FindBy(xpath = "//input[@formcontrolname='filterValue']")
	WebElement EnterEditCustomFilter;
	
	@FindBy(xpath = "//span[text()=' Save']")
	WebElement ClickOnSaveButtonFordetailsPageOTSCR;
	
	
	
	
	public void ClickOnSaveButtonFordetailsPageOTSCR() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnSaveButtonFordetailsPageOTSCR));
		ClickOnSaveButtonFordetailsPageOTSCR.click();
	}
	public void EnterEditCustomFilter() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(EnterEditCustomFilter));
		EnterEditCustomFilter.clear();
		EnterEditCustomFilter.sendKeys("1 and 2");
	}
	public void NameInObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(txtNameObject));
		txtNameObject.sendKeys(" Crud ");

	}
	public void SelectMoveFolder() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectMoveFolder));
		SelectMoveFolder.click();
	}
	public void OTSFolder() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(OTSFolder));
		OTSFolder.click();
	}
	public void SelectBroadcastOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(SelectBroadcastOption));
		SelectBroadcastOption.click();
	}
	public void SelectAssignToSalesRepOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(SelectAssignToSalesRepOption));
		SelectAssignToSalesRepOption.click();
	}
	public void SelectLiveClaimOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(SelectLiveClaimOption));
		SelectLiveClaimOption.click();
	}
	public void SelectAssignBasedOnLookupFieldInTheParentAccountOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(SelectAssignBasedOnLookupFieldInTheParentAccountOption));
		SelectAssignBasedOnLookupFieldInTheParentAccountOption.click();
	}
	public void ClickOnOTSDeleteCraft() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnOTSDeleteCraft));
		ClickOnOTSDeleteCraft.click();
	}
	
	public void DefaultLeadOwnerDropDownforLPWRDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(DefaultLeadOwnerDropDownforLPWRDropDown));
		DefaultLeadOwnerDropDownforLPWRDropDown.click();
	}
	public void CheckBoxForDefaultLeadOwnerLPWR() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(CheckBoxForDefaultLeadOwnerLPWR));
		CheckBoxForDefaultLeadOwnerLPWR.click();
	}
	
	public void ClickOnSaveButtonFordetailsPageOTS() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnSaveButtonFordetailsPageOTS));
		ClickOnSaveButtonFordetailsPageOTS.click();
	}
	public boolean DisplaySuccessForDefaultLeadOwnerLPWR() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplaySuccessForDefaultLeadOwnerLPWR));
		return DisplaySuccessForDefaultLeadOwnerLPWR.isDisplayed();
	}
	

	
	public void ClickSelectEmailTemplateDropDownAssignmentSetup() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickSelectEmailTemplateDropDownAssignmentSetup));
		ClickSelectEmailTemplateDropDownAssignmentSetup.click();
	}
	public void ClickSelectSlackTemplateDropDownAssignmentSetup() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickSelectSlackTemplateDropDownAssignmentSetup));
		ClickSelectSlackTemplateDropDownAssignmentSetup.click();
	}
	public void ClickSelectSlackTemplateDropDownAssignmentSetupOTSLR() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickSelectSlackTemplateDropDownAssignmentSetupOTSLR));
		ClickSelectSlackTemplateDropDownAssignmentSetupOTSLR.click();
	}
	public void ClickSelectTextTemplateDropDownAssignmentSetup() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickSelectTextTemplateDropDownAssignmentSetup));
		ClickSelectTextTemplateDropDownAssignmentSetup.click();
	}
	public void ClickSelectCRMInAppTemplateDropDownAssignmentSetup() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickSelectCRMInAppTemplateDropDownAssignmentSetup));
		ClickSelectCRMInAppTemplateDropDownAssignmentSetup.click();
	}
	
	public void CollapseAllForOTSassignment() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(CollapseAll));
		CollapseAll.click();
	}
	public void ClickOnReassignmentSetupButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnReassignmentSetupButton));
		ClickOnReassignmentSetupButton.click();
	}
	public void ClickOnAddReassignmentSetupButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnAddReassignmentSetupButton));
		ClickOnAddReassignmentSetupButton.click();
	}
	public void EnterReassignmentWaitTime() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(EnterReassignmentWaitTime));
		EnterReassignmentWaitTime.clear();
		EnterReassignmentWaitTime.sendKeys("11");
	}
	public void ClickReassignmentWaitTimeDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickReassignmentWaitTimeDropDown));
		ClickReassignmentWaitTimeDropDown.click();
	}
	public void SelectMinutes() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(SelectMinutes));
		SelectMinutes.click();
	}
	public void SelectSeconds() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(SelectSeconds));
		SelectSeconds.click();
	}
	
	

	public void ClickOnBroadcastViaEmailCheckBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnBroadcastViaEmailCheckBox));
		ClickOnBroadcastViaEmailCheckBox.click();
	}
	public void ClickOnBroadcastViaSlackCheckBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnBroadcastViaSlackCheckBox));
		ClickOnBroadcastViaSlackCheckBox.click();
	}
	public void ClickOnBroadcastViaTextCheckBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnBroadcastViaTextCheckBox));
		ClickOnBroadcastViaTextCheckBox.click();
	}

	public void ClickOnInAppCheckBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnInAppCheckBox));
		ClickOnInAppCheckBox.click();
	}
	public void ClickOnTextCheckBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnTextCheckBox));
		ClickOnTextCheckBox.click();
	}
	public void ClickOnSlackCheckBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnSlackCheckBox));
		ClickOnSlackCheckBox.click();
	}
	public void ClickOnEmailCheckBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnEmailCheckBox));
		ClickOnEmailCheckBox.click();
	}
	public void ClickOnSelectSalesTeamBroadCastDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnSelectSalesTeamBroadCastDropDown));
		ClickOnSelectSalesTeamBroadCastDropDown.click();
	}
	public void ClickOnBroadcastToSalesTeamCheckBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnBroadcastToSalesTeamCheckBox));
		ClickOnBroadcastToSalesTeamCheckBox.click();
	}
	public void ClickOnSelectSalesTeamDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnSelectSalesTeamDropDown));
		ClickOnSelectSalesTeamDropDown.click();
	}
	public void ClickOnSetupSelectSalesTeamDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnSetupSelectSalesTeamDropDown));
		ClickOnSetupSelectSalesTeamDropDown.click();
	}
	public void SelectMemberOfSalesTeamOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectMemberOfSalesTeamOption));
		SelectMemberOfSalesTeamOption.click();
	}
	public void ClickOnSelectSalesTeamTypeDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnSelectSalesTeamTypeDropDown));
		ClickOnSelectSalesTeamTypeDropDown.click();
	}
	public void ClickOnRejectLeadDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnRejectLeadDropDown));
		ClickOnRejectLeadDropDown.click();
	}
	public void SelectOnAcceptLeadInAnyoneWithTheLinkCanAcceptOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnAcceptLeadInAnyoneWithTheLinkCanAcceptOption));
		ClickOnAcceptLeadInAnyoneWithTheLinkCanAcceptOption.click();
	}
	public void ClickOnAcceptLeadDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnAcceptLeadDropDown));
		ClickOnAcceptLeadDropDown.click();
	}
	public boolean DisplayOTSAssignmentBlockBorderColour() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(OTSAssignmentBlock));
        return OTSAssignmentBlock.isDisplayed();
	}
	public void ClickAssignBasedSecondDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickAssignBasedSecondDropDown));
		ClickAssignBasedSecondDropDown.click();
	}
	public void ClickAssignBasedFirstDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickAssignBasedFirstDropDown));
		ClickAssignBasedFirstDropDown.click();
	}
	public void ClickSetupAssignBasedSecondDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickSetupAssignBasedSecondDropDown));
		ClickSetupAssignBasedSecondDropDown.click();
	}
	public void ClickSetupAssignBasedFirstDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickSetupAssignBasedFirstDropDown));
		ClickSetupAssignBasedFirstDropDown.click();
	}
	public void ClickOnSelectMappedSDRDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnSelectMappedSDRDropDown));
		ClickOnSelectMappedSDRDropDown.click();
	}
	public void ClickOnAssignToAEmappedSDRCheckBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnAssignToAEmappedSDRCheckBox));
		ClickOnAssignToAEmappedSDRCheckBox.click();
	}
	public void ClickOnAssignmentOptionDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnAssignmentOptionDropDown));
		ClickOnAssignmentOptionDropDown.click();
	}
	public void ClickOnAssignmentOptionForSetUpDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnAssignmentOptionForSetUpDropDown));
		ClickOnAssignmentOptionForSetUpDropDown.click();
	}
	public void ClickOnCRMinAppNotificationDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnCRMinAppNotificationDropDown));
		ClickOnCRMinAppNotificationDropDown.click();
	}
	public void ClickOnCRMinAppNotificationCheckBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnCRMinAppNotificationCheckBox));
		ClickOnCRMinAppNotificationCheckBox.click();
	}
	public void ClickOnSetupCRMinAppNotificationDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnSetupCRMinAppNotificationDropDown));
		ClickOnSetupCRMinAppNotificationDropDown.click();
	}
	public void ClickOnTextNotificationDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnTextNotificationDropDown));
		ClickOnTextNotificationDropDown.click();
	}
	public void ClickOnBroadcastViaTextNotificationDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnBroadcastViaTextNotificationDropDown));
		ClickOnBroadcastViaTextNotificationDropDown.click();
	}
	public void ClickOnSetupTextNotificationDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnSetupTextNotificationDropDown));
		ClickOnSetupTextNotificationDropDown.click();
	}
	public void ClickOnTextNotificationCheckBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnTextNotificationCheckBox));
		ClickOnTextNotificationCheckBox.click();
	}
	public void ClickOnSlackNotificationDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnSlackNotificationDropDown));
		ClickOnSlackNotificationDropDown.click();
	}
	public void ClickOnBroadcastViaSlackNotificationDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnBroadcastViaSlackNotificationDropDown));
		ClickOnBroadcastViaSlackNotificationDropDown.click();
	}
	public void ClickSetupOnSlackNotificationDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickSetupOnSlackNotificationDropDown));
		ClickSetupOnSlackNotificationDropDown.click();
	}
	public void ClickOnSlackNotificationCheckBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnSlackNotificationCheckBox));
		ClickOnSlackNotificationCheckBox.click();
	}
	public void ClickOnEmailNotificationDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnEmailNotificationDropDown));
		ClickOnEmailNotificationDropDown.click();
	}
	public void ClickOnSetupBroadcastViaEmailNotificationDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnSetupBroadcastViaEmailNotificationDropDown));
		ClickOnSetupBroadcastViaEmailNotificationDropDown.click();
	}
	public void ClickOnSetupEmailNotificationDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnSetupEmailNotificationDropDown));
		ClickOnSetupEmailNotificationDropDown.click();
	}
	public void ClickOnEmailNotificationCheckBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnEmailNotificationCheckBox));
		ClickOnEmailNotificationCheckBox.click();
	}
	public void EnterInputforAssignToLastActivityOwnerOnTheleadCheckBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(EnterInputforAssignToLastActivityOwnerOnTheleadCheckBox));
		EnterInputforAssignToLastActivityOwnerOnTheleadCheckBox.clear();
		EnterInputforAssignToLastActivityOwnerOnTheleadCheckBox.sendKeys("10");
	}
	
	public void ClickOnAssignToLastActivityOwnerOnTheleadCheckBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickOnAssignToLastActivityOwnerOnTheleadCheckBox));
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", ClickOnAssignToLastActivityOwnerOnTheleadCheckBox);
	}
	
//	public void ClickOnAssignToLastActivityOwnerOnTheleadCheckBox() {
//		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnAssignToLastActivityOwnerOnTheleadCheckBox));
//		ClickOnAssignToLastActivityOwnerOnTheleadCheckBox.click();
//	}
	public void ClickOnAssignBasedOnLastActivityOwnerCheckBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnAssignBasedOnLastActivityOwnerCheckBox));
		ClickOnAssignBasedOnLastActivityOwnerCheckBox.click();
	}
	public void ClickOnSelectAssignmentTypeDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnSelectAssignmentTypeDropDown));
		ClickOnSelectAssignmentTypeDropDown.click();
	}
	public void ClickOnAssignmentOptionsButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnAssignmentOptionsButton));
		ClickOnAssignmentOptionsButton.click();
	}
	public void EnterOTSassignmentName() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(EnterOTSassignmentName));
		EnterOTSassignmentName.clear();
		EnterOTSassignmentName.sendKeys("AutoTest_OTS_AssignmentBlock");
	}
	public void ClickOnDetailsButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnDetailsButton));
		ClickOnDetailsButton.click();
	}
	public void DoubleClickOnOTSAssignmentBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(OTSassignmentBlockInCanvas));
		Actions actions = new Actions(ldriver);
		//DecisionBlock.sendKeys("");
		actions.doubleClick(OTSassignmentBlockInCanvas).build().perform();
		actions.doubleClick(OTSassignmentBlockInCanvas).build().perform();
		
	}
	public boolean RandomSplitOTSBorderColour() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(RandomSplitOTSBorderColour));
        return RandomSplitOTSBorderColour.isDisplayed();
	}
	public void ConnectionRandomSlitC_To_DecisionBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(RandomSplitC));
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DecisionBlock));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(RandomSplitC)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(RandomSplitC)
        .pause(Duration.ofSeconds(1))
        .moveToElement(DecisionBlock)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	public void ConnectionRandomSlitA_To_OTSAssignmentBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(RandomSplitA));
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(OTSassignmentBlockInCanvas));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(RandomSplitA)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(RandomSplitA)
        .pause(Duration.ofSeconds(1))
        .moveToElement(OTSassignmentBlockInCanvas)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	public void OTSAssignmentBlock_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(AssignmentBlock));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(AssignmentBlock)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(AssignmentBlock)
        .pause(Duration.ofSeconds(1))
        .moveByOffset(-350,-50) 
        .moveByOffset(-350,-50)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}

	public void OTSFilter_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(OTSFilter));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(OTSFilter)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(OTSFilter)
        .pause(Duration.ofSeconds(1))
        .moveByOffset(-480,95) 
        .moveByOffset(-480,95)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	public boolean DisplayOTSrouterOverView() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.visibilityOf(DisplayOTSrouterOverView));
		 return    DisplayOTSrouterOverView.isDisplayed();
	}
	
	public void RightClickOnOTSrouter() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25))
		.until(ExpectedConditions.elementToBeClickable(OTSrouter));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(OTSrouter).contextClick(OTSrouter).build()
		.perform();
	}
	
	public void ClickOnOTSrouterDropDownsymbol() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(OTSrouterDropDownsymbol));
		OTSrouterDropDownsymbol.click();
	}
	
	public void ClickAgainOTSrouter() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(OTSrouter));
		OTSrouter.click();
	}
	
	
	//***********************OTS Details page****************
	
	
	@FindBy(xpath = "(//span[text()='Wait Time']//..)[1]")
	WebElement ClickOnWaitTimeRadioButtonOTSDetailsPage;
	
	
	@FindBy(xpath = "//input[@placeholder='Enter Time']")
	WebElement EnterWaitTimeOTSDetailsPage;
	
	@FindBy(xpath = "//mat-select[@placeholder='Select Unit']")
	WebElement ClickOnDropDownForWaitTimeOTSDetailsPage;
	
	@FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
	WebElement ClickOnOptionForWaitTimeOTSDetailsPage;
	
	@FindBy(xpath = "(//span[text()='Start OTS when member of this is a filter']//..)[1]")
	WebElement ClickOnStartRadioButtonOTSwhenmemberofthisisafilterOTSDetailsPage;
	
	@FindBy(xpath = "(//div[text()='Select CRM Lead Filter']//..//..)[1]")
	WebElement ClickOnDropDownforOTSwhenmemberofthisisafilterOTSDetailsPage;
	

	public void ClickOnWaitTimeRadioButtonOTSDetailsPage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnWaitTimeRadioButtonOTSDetailsPage));
		ClickOnWaitTimeRadioButtonOTSDetailsPage.click();
	}
	
	public void EnterWaitTimeOTSDetailsPage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(EnterWaitTimeOTSDetailsPage));
		EnterWaitTimeOTSDetailsPage.clear();
		EnterWaitTimeOTSDetailsPage.sendKeys("33");;
	}
	
	public void ClickOnDropDownForWaitTimeOTSDetailsPage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnDropDownForWaitTimeOTSDetailsPage));
		ClickOnDropDownForWaitTimeOTSDetailsPage.click();
	}
	
	public void ClickOnOptionForWaitTimeOTSDetailsPage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnOptionForWaitTimeOTSDetailsPage));
		ClickOnOptionForWaitTimeOTSDetailsPage.click();
	}
	
	public void ClickOnStartRadioButtonOTSwhenmemberofthisisafilterOTSDetailsPage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnStartRadioButtonOTSwhenmemberofthisisafilterOTSDetailsPage));
		ClickOnStartRadioButtonOTSwhenmemberofthisisafilterOTSDetailsPage.click();
	}
	
	public void ClickOnDropDownforOTSwhenmemberofthisisafilterOTSDetailsPage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnDropDownforOTSwhenmemberofthisisafilterOTSDetailsPage));
		ClickOnDropDownforOTSwhenmemberofthisisafilterOTSDetailsPage.click();
	}
	
	
	
	
	
	
	
	
	
}
