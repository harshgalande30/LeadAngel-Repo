package com.leadAngel.pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmailAlertsTemplatesPageObjectModel {
	
	  WebDriver ldriver;

	public EmailAlertsTemplatesPageObjectModel(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
}

	//***************************************************** Recipient_TO Clicking Operation *************************************************************
	
	
	@FindBy(xpath = "(//span[@class='custom-option-content ng-star-inserted'])[1]")
	WebElement SelectFirstOptionFor_RecipientTO_OR_RecipientCC;
	
	
	@FindBy(xpath = "//div[@role='option'][1]")
	WebElement SelectFirstOptionForAccTeamAndNotifyBasedLookUpField;
	
	//************************************************************************************************

	@FindBy(xpath = "((//span[text()='Lead Owner'])[1]//..//..)[1]")
	WebElement CheckBoxFor_Recipient_TO_LeadOwner;
	
	@FindBy(xpath = "((//span[text()='Lead Owner'])[1]//..//..)[1]//input[@aria-checked='true']")
	WebElement VeryfyCheckBoxFor_Recipient_TO_LeadOwner;
	//************************************************************************************************

	@FindBy(xpath = "((//span[text()='Account Owner'])[1]//..//..)[1]")
	WebElement CheckBoxFor_Recipient_TO_AccountOwner;
	
	@FindBy(xpath = "((//span[text()='Account Owner'])[1]//..//..)[1]//input[@aria-checked='true']")
	WebElement VerifyCheckBoxFor_Recipient_TO_AccountOwner;
	//************************************************************************************************
	
	@FindBy(xpath = "((//span[text()='Lead Owner Mapped SDR'])[1]//..//..)[1]")
	WebElement CheckBoxFor_Recipient_TO_LeadOwnerMappedSDR;
	
	@FindBy(xpath = "((//span[text()='Lead Owner Mapped SDR'])[1]//..//..)[1]//input[@aria-checked='true']")
	WebElement VerifyCheckBoxFor_Recipient_TO_LeadOwnerMappedSDR;
	
	@FindBy(xpath = "//ng-select[@formcontrolname='leadownermapped']")
	WebElement ClickSelectDropDownFor_Recipient_TO_LeadOwnerMappedSDR;
	@FindBy(xpath = "(//mat-select[@panelclass='matsearchdropdown'])[1]")
	WebElement ClickSelectDropDownFor_Recipient_TO_LeadOwnerMappedSDRSlack;
	
	@FindBy(xpath = "((//span[text()='Lead Owner Mapped SDR'])[1]//..//..//..//..)[1]//ng-select[contains(@class,'ng-valid')]")
	WebElement VerificatinOfSelectTextBoxBorderFor_Recipient_TO_LeadOwnerMappedSDR;
	@FindBy(xpath = "((//span[text()='Lead Owner Mapped SDR'])[1]//..//..//..//..)[1]//mat-select[contains(@class,'ng-valid')]")
	WebElement VerificatinOfSelectTextBoxBorderFor_Recipient_TO_LeadOwnerMappedSDRSlack;
	
	@FindBy(xpath = "(//mat-select[@panelclass='matsearchdropdown'])[1]")
	WebElement ClickSelectDropDownFor_Recipient_TO_LeadOwnerMappedSDRforSlack;
	
	
	public void ClickSelectDropDownFor_Recipient_TO_LeadOwnerMappedSDRforSlack() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickSelectDropDownFor_Recipient_TO_LeadOwnerMappedSDRforSlack));
		ClickSelectDropDownFor_Recipient_TO_LeadOwnerMappedSDRforSlack.click();
	}
	//************************************************************************************************

	@FindBy(xpath = "((//span[text()='Account Owner Mapped SDR'])[1]//..//..)[1]")
	WebElement CheckBoxFor_Recipient_TO_AccountOwnerMappedSDR;
	
	@FindBy(xpath = "((//span[text()='Account Owner Mapped SDR'])[1]//..//..)[1]//input[@aria-checked='true']")
	WebElement VerifyCheckBoxFor_Recipient_TO_AccountOwnerMappedSDR;
	
	@FindBy(xpath = "//ng-select[@formcontrolname='accountownermapped']")
	WebElement ClickSelectDropDownFor_Recipient_TO_AccountOwnerMappedSDR;
	@FindBy(xpath = "(//mat-select[@panelclass='matsearchdropdown'])[2]")
	WebElement ClickSelectDropDownFor_Recipient_TO_AccountOwnerMappedSDRSlack;
	
	@FindBy(xpath = "((//span[text()='Account Owner Mapped SDR'])[1]//..//..//..//..)[1]//ng-select[contains(@class,'ng-valid')]")
	WebElement VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AccountOwnerMappedSDR;
	@FindBy(xpath = "((//span[text()='Account Owner Mapped SDR'])[1]//..//..//..//..)[1]//mat-select[contains(@class,'ng-valid')]")
	WebElement VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AccountOwnerMappedSDRSlack;
	
	@FindBy(xpath = "(//mat-select[@panelclass='matsearchdropdown'])[2]")
	WebElement ClickSelectDropDownFor_Recipient_TO_AccountOwnerMappedSDRforSlack;
	
	public void ClickSelectDropDownFor_Recipient_TO_AccountOwnerMappedSDRforSlack() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickSelectDropDownFor_Recipient_TO_AccountOwnerMappedSDRforSlack));
		ClickSelectDropDownFor_Recipient_TO_AccountOwnerMappedSDRforSlack.click();
	}
	
	//************************************************************************************************

	@FindBy(xpath = "((//span[text()='Account Team'])[1]//..//..)[1]")
	WebElement CheckBoxFor_Recipient_TO_AccountTeam;
	
	@FindBy(xpath = "((//span[text()='Account Team'])[1]//..//..)[1]//input[@aria-checked='true']")
	WebElement VerifyCheckBoxFor_Recipient_TO_AccountTeam;
	
	@FindBy(xpath = "//ng-select[@formcontrolname='accountteamdata']")
	WebElement ClickSelectDropDownFor_Recipient_TO_AccountTeam;
	
	@FindBy(xpath = "((//span[text()='Account Team'])[1]//..//..//..//..)[1]//ng-select[contains(@class,'ng-valid')]")
	WebElement VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AccountTeam;
	
	//************************************************************************************************
	
	@FindBy(xpath = "((//span[text()=' Notify based on the lookup field on Account '])[1]//..//..)[1]")
	WebElement CheckBoxFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccount;
	@FindBy(xpath = "((//span[text()='Notify based on the lookup field on Account '])[1]//..//..)[1]")
	WebElement CheckBoxFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccountSlack;
	
	@FindBy(xpath = "((//span[text()=' Notify based on the lookup field on Account '])[1]//..//..)[1]//input[@aria-checked='true']")
	WebElement VerifyCheckBoxFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccount;
	@FindBy(xpath = "((//span[text()='Notify based on the lookup field on Account '])[1]//..//..)[1]//input[@aria-checked='true']")
	WebElement VerifyCheckBoxFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccountSlack;
	
	@FindBy(xpath = "//ng-select[@formcontrolname='notifylookupfielddatato']")
	WebElement ClickSelectDropDownFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccount;
	
	@FindBy(xpath = "((//span[text()=' Notify based on the lookup field on Account '])[1]//..//..//..//..//..)[1]//ng-select[contains(@class,'ng-valid')]")
	WebElement VerificatinOfSelectTextBoxBorderFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccount;
	@FindBy(xpath = "((//span[text()='Notify based on the lookup field on Account '])[1]//..//..//..//..//..)[1]//ng-select[contains(@class,'ng-valid')]")
	WebElement VerificatinOfSelectTextBoxBorderFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccountSlack;
	
	//************************************************************************************************
	
	@FindBy(xpath = "((//span[text()='Additional Recipients '])[1]//..//..)[1]")
	WebElement CheckBoxFor_Recipient_TO_AdditionalRecipients ;
	@FindBy(xpath = "((//span[text()='Additional Recipients'])[1]//..//..)[1]")
	WebElement CheckBoxFor_Recipient_TO_AdditionalRecipientsSlack ;

	@FindBy(xpath = "((//span[text()='Additional Recipients '])[1]//..//..)[1]//input[@aria-checked='true']")
	WebElement VerifyCheckBoxFor_Recipient_TO_AdditionalRecipients ;
	@FindBy(xpath = "((//span[text()='Additional Recipients'])[1]//..//..)[1]//input[@aria-checked='true']")
	WebElement VerifyCheckBoxFor_Recipient_TO_AdditionalRecipientsSlack ;
	
	@FindBy(xpath = "((//span[text()='Additional Recipients '])[1]//..//..//..//..//..)[1]//input[@placeholder='example@leadangel.com']")  //(//div[@class='mat-chip-list-wrapper'])[1]
	WebElement EnterMailIDFor_Recipient_TO_AdditionalRecipients ;
	@FindBy(xpath = "((//span[text()='Additional Recipients'])[1]//..//..//..//..//..)[1]//input[@placeholder='example@leadangel.com']")  //(//div[@class='mat-chip-list-wrapper'])[1]
	WebElement EnterMailIDFor_Recipient_TO_AdditionalRecipientsSlack ;

	@FindBy(xpath = "(((//span[text()='Additional Recipients '])[1]//..//..//..//..//..)[1]//mat-chip-list[@tabindex='0'])[1]")
	WebElement VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AdditionalRecipients ;
	@FindBy(xpath = "(((//span[text()='Additional Recipients'])[1]//..//..//..//..//..)[1]//mat-chip-list[@tabindex='0'])[1]")
	WebElement VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AdditionalRecipientsSlack ;
	
	//***************************************************** Recipient_CC Clicking Operation*************************************************************
	@FindBy(xpath = "//mat-panel-title[text()=' Recipient CC ']")
	WebElement RecipientCC_DropDown;
	
	@FindBy(xpath = "((//span[text()='Lead Owner'])[2]//..//..)[1]")
	WebElement CheckBoxFor_Recipient_CC_LeadOwner;
	
	@FindBy(xpath = "((//span[text()='Lead Owner'])[2]//..//..)[1]//input[@aria-checked='true']")
	WebElement VerifyCheckBoxFor_Recipient_CC_LeadOwner;
	//************************************************************************************************

	@FindBy(xpath = "((//span[text()='Account Owner'])[2]//..//..)[1]")
	WebElement CheckBoxFor_Recipient_CC_AccountOwner;
	
	@FindBy(xpath = "((//span[text()='Account Owner'])[2]//..//..)[1]//input[@aria-checked='true']")
	WebElement VerifyCheckBoxFor_Recipient_CC_AccountOwner;
	//************************************************************************************************

	@FindBy(xpath = "((//span[text()='Lead Owner Mapped SDR'])[2]//..//..)[1]")
	WebElement CheckBoxFor_Recipient_CC_LeadOwnerMappedSDR;
	
	@FindBy(xpath = "((//span[text()='Lead Owner Mapped SDR'])[2]//..//..)[1]//input[@aria-checked='true']")
	WebElement VerifyCheckBoxFor_Recipient_CC_LeadOwnerMappedSDR;
	
	@FindBy(xpath = "//ng-select[@formcontrolname='leadownermappedcc']")
	WebElement ClickSelectDropDownFor_Recipient_CC_LeadOwnerMappedSDR;
	
	@FindBy(xpath = "((//span[text()='Lead Owner Mapped SDR'])[2]//..//..//..//..)[1]//ng-select[contains(@class,'ng-valid')]")
	WebElement VerificatinOfSelectTextBoxBorderFor_Recipient_CC_LeadOwnerMappedSDR;
	
	//************************************************************************************************
	
	@FindBy(xpath = "((//span[text()='Account Owner Mapped SDR '])[1]//..//..)[1]")
	WebElement CheckBoxFor_RecipientC_CC_AccountOwnerMappedSDR;
	
	@FindBy(xpath = "((//span[text()='Account Owner Mapped SDR '])[1]//..//..)[1]//input[@aria-checked='true']")
	WebElement VerifyCheckBoxFor_Recipient_CC_AccountOwnerMappedSDR;
	
	@FindBy(xpath = "//ng-select[@formcontrolname='accountownermappedcc']")
	WebElement ClickSelectDropDownFor_Recipient_CC_AccountOwnerMappedSDR;
	
	@FindBy(xpath = "((//span[text()='Account Owner Mapped SDR '])[1]//..//..//..//..)[1]//ng-select[contains(@class,'ng-valid')]")
	WebElement VerificatinOfSelectTextBoxBorderFor_Recipient_CC_AccountOwnerMappedSDR;
	
	//************************************************************************************************
	
	@FindBy(xpath = "((//span[text()='Account Team'])[2]//..//..)[1]")
	WebElement CheckBoxFor_Recipient_CC_AccountTeam;
	
	@FindBy(xpath = "((//span[text()='Account Team'])[2]//..//..)[1]//input[@aria-checked='true']")
	WebElement VerifyCheckBoxFor_Recipient_CC_AccountTeam;
	
	@FindBy(xpath = "//ng-select[@formcontrolname='accountteamdatacc']")
	WebElement ClickSelectDropDownFor_Recipient_CC_AccountTeam;
	
	@FindBy(xpath = "((//span[text()='Account Team'])[2]//..//..//..//..)[1]//ng-select[contains(@class,'ng-valid')]")
	WebElement VerificatinOfSelectTextBoxBorderFor_Recipient_CC_AccountTeam;
	
	//************************************************************************************************
	
	@FindBy(xpath = "((//span[text()='Notify based on the lookup field on Account'])[1]//..//..)[1]")
	WebElement CheckBoxFor_Recipient_CC_NotifyBasedOnTheLookupFieldOnAccount;
	
	@FindBy(xpath = "((//span[text()='Notify based on the lookup field on Account'])[1]//..//..)[1]//input[@aria-checked='true']")
	WebElement VerifyCheckBoxFor_Recipient_CC_NotifyBasedOnTheLookupFieldOnAccount;
	
	@FindBy(xpath = "//ng-select[@formcontrolname='notifylookupfielddatacc']")
	WebElement ClickSelectDropDownFor_Recipient_CC_NotifyBasedOnTheLookupFieldOnAccount;	
			
	@FindBy(xpath = "((//span[text()='Notify based on the lookup field on Account'])[1]//..//..//..//..//..)//ng-select[contains(@class,'ng-valid')]")
	WebElement VerificatinOfSelectTextBoxBorderFor_Recipient_CC_NotifyBasedOnTheLookupFieldOnAccount;
	//************************************************************************************************
	
	@FindBy(xpath = "((//span[text()='Additional Recipients'])[1]//..//..)[1]")
	WebElement CheckBoxFor_Recipient_CC_AdditionalRecipients ;
	
	@FindBy(xpath = "((//span[text()='Additional Recipients '])[1]//..//..)[1]//input[@aria-checked='true']")
	WebElement VerifyCheckBoxFor_Recipient_CC_AdditionalRecipients ;
	
	@FindBy(xpath = "((//span[text()='Additional Recipients'])[1]//..//..//..//..//..)[1]//input[@placeholder='example@leadangel.com']")
	WebElement EnterMailIDFor_Recipient_CC_AdditionalRecipients ;
	
	@FindBy(xpath = "//mat-chip[text()=' example1@leadangel.com ']")
	WebElement VerifyEnteredMailIDFor_Recipient_CC_AdditionalRecipients ;
	
	@FindBy(xpath = "((//span[text()='Additional Recipients'])[1]//..//..//..//..//..)[1]//mat-chip-list[@tabindex='0']")
	WebElement VerificatinOfSelectTextBoxBorderFor_Recipient_CC_AdditionalRecipients ;
	
	//*************************************************Subject*********************************
	     //Some of InsertSnippet operation xpath has been taken from leadManagementpage
	
	@FindBy(xpath = "//input[@formcontrolname='emailsubject']")
	WebElement EnterSubject ;
	@FindBy(xpath = "//div[@id='editableDiv']")
	WebElement EnterHeader ;

	@FindBy(xpath = "//button[text()='Owner']")
	WebElement SelectOwnerOption ;
	@FindBy(xpath = "//button[text()=' Channel ']")
	WebElement SelectChannelOption ;
	
	@FindBy(xpath = "(//mat-icon[text()='data_object'])[1]")
	WebElement ClickOnInsertSnippetButtonForSubject ;
	
	@FindBy(xpath = "(//i-tabler[@name='braces'])[1]")
	WebElement ClickOnBracesButtonForHeader ;
	@FindBy(xpath = "(//i-tabler[@name='braces'])[2]")
	WebElement ClickOnBracesButtonForBody ;
	
	@FindBy(xpath = "//input[@formcontrolname='emailsubject'][contains(@class,'ng-valid')]")
	WebElement VerificatinOfSubjectTextBoxBorderForSubject ;
	
	@FindBy(xpath = "//label[text()='Select Object']//..//ng-select[@placeholder='Select']")
	WebElement ClickOnSelectObjectDropDownForInsertValueInSubject ;
	
	@FindBy(xpath = "//label[text()='Select Object']//..//select[@class='form-select form-control ng-pristine ng-valid ng-touched']")
	WebElement ClickOnSelectObjectDropDownForURL ;
	
	//*************************************************Email Body*********************************
    //Some of InsertSnippet operation xpath has been taken from leadManagementpage

	@FindBy(xpath = "//textarea[@formcontrolname='emailbody']")
	WebElement EnterEmailBody ;
	@FindBy(xpath = "//div[@id='editor']")
	WebElement EnterBodyForSlack ;
	
	@FindBy(xpath = "//div[@data-placeholder='Type something...']")
	WebElement EnterMessageBody ;
	
	@FindBy(xpath = "(//mat-icon[text()='data_object'])[2]")
	WebElement ClickOnInsertSnippetButtonForEmailBody ;
	
	
	
	@FindBy(xpath = "//textarea[@formcontrolname='emailbody'][contains(@class,'ng-valid')]")
	WebElement VerificatinOfEmailBodyTextBoxBorderForEmailBody ;
	
	//*************************************************Save button For Email Alert Templates*********************************
	
	@FindBy(xpath = "//span[text()=' Save ']")
	WebElement SaveButtonForEmailAlertTemplate ;
	
	@FindBy(xpath = "//div[text()='saved successfully']")
	WebElement SavingVerificationMessage ;
	@FindBy(xpath = "//div[text()='Saved successfully']")
	WebElement SavingVerificationMessageSlack ;
	
	//*************************************************OTS Broadcast Notification Recipients*********************************

	@FindBy(xpath = "((//span[text()='OTS Broadcast Notification Recipients'])[1]//..//..)[1]")
	WebElement CheckBoxFor_Recipient_TO_OTSBroadcastNotificationRecipients;
	
	@FindBy(xpath = "(//input[@placeholder='example@leadangel.com'])[1]")
	WebElement EnterEmailIdFor_Recipient_TO_OTSBroadcastNotificationRecipients;
	
	@FindBy(xpath = "//ng-select[@formcontrolname='otsnotify']")
	WebElement ClickOnDropDownFor_Recipient_TO_OTSBroadcastNotificationRecipientsSlack;
	
	@FindBy(xpath = "((//span[text()='OTS Broadcast Notification Recipients'])[1]//..//..)[1]//input[@aria-checked='true']")
	WebElement VerifyCheckBoxFor_Recipient_TO_OTSBroadcastNotificationRecipients ;
	
	
	@FindBy(xpath = "((//span[text()='OTS Broadcast Notification Recipients'])[1]//..//..//..//..//..)[1]//mat-chip-list[contains(@class,'ng-valid')]")
	WebElement VerificatinOfSelectTextBoxBorderFor_Recipient_TO_OTSBroadcastNotificationRecipients ;
	@FindBy(xpath = "((//span[text()='OTS Broadcast Notification Recipients'])[1]//..//..//..//..//..)[1]//ng-select[contains(@class,'ng-valid')]")
	WebElement VerificatinOfSelectTextBoxBorderFor_Recipient_TO_OTSBroadcastNotificationRecipientsSlack ;
	

	//***********************************************************************************************************************************************
	
	public boolean VerificatinOfSelectTextBoxBorderFor_Recipient_TO_OTSBroadcastNotificationRecipients() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerificatinOfSelectTextBoxBorderFor_Recipient_TO_OTSBroadcastNotificationRecipients));
        return VerificatinOfSelectTextBoxBorderFor_Recipient_TO_OTSBroadcastNotificationRecipients.isDisplayed();
	}
	public boolean VerificatinOfSelectTextBoxBorderFor_Recipient_TO_OTSBroadcastNotificationRecipientsSlack() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerificatinOfSelectTextBoxBorderFor_Recipient_TO_OTSBroadcastNotificationRecipientsSlack));
        return VerificatinOfSelectTextBoxBorderFor_Recipient_TO_OTSBroadcastNotificationRecipientsSlack.isDisplayed();
	}
	public boolean VerifyCheckBoxFor_Recipient_TO_OTSBroadcastNotificationRecipients() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerifyCheckBoxFor_Recipient_TO_OTSBroadcastNotificationRecipients));
        return VerifyCheckBoxFor_Recipient_TO_OTSBroadcastNotificationRecipients.isDisplayed();
	}
	public void CheckBoxFor_Recipient_TO_OTSBroadcastNotificationRecipients() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CheckBoxFor_Recipient_TO_OTSBroadcastNotificationRecipients));
		CheckBoxFor_Recipient_TO_OTSBroadcastNotificationRecipients.click();
	}
	public void EnterEmailIdFor_Recipient_TO_OTSBroadcastNotificationRecipients(){
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(EnterEmailIdFor_Recipient_TO_OTSBroadcastNotificationRecipients));
		EnterEmailIdFor_Recipient_TO_OTSBroadcastNotificationRecipients.clear();
		EnterEmailIdFor_Recipient_TO_OTSBroadcastNotificationRecipients.sendKeys("example@leadangel.com,");
	}
	public void ClickOnDropDownFor_Recipient_TO_OTSBroadcastNotificationRecipientsSlack() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDropDownFor_Recipient_TO_OTSBroadcastNotificationRecipientsSlack));
		ClickOnDropDownFor_Recipient_TO_OTSBroadcastNotificationRecipientsSlack.click();
	}
	//***********************************************************************************************************************************************
	
	
	
	
	public void SelectFirstOptionFor_RecipientTO_OR_RecipientCC() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectFirstOptionFor_RecipientTO_OR_RecipientCC));
		SelectFirstOptionFor_RecipientTO_OR_RecipientCC.click();
	}
	
	public void SelectFirstOptionForAccTeamAndNotifyBasedLookUpField() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectFirstOptionForAccTeamAndNotifyBasedLookUpField));
		SelectFirstOptionForAccTeamAndNotifyBasedLookUpField.click();
	}
	

	//***************************************************** Recipient_TO_ Clicking Operation*************************************************************

	

	public void ClickOnCheckBoxFor_Recipient_TO_LeadOwner() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CheckBoxFor_Recipient_TO_LeadOwner));
		CheckBoxFor_Recipient_TO_LeadOwner.click();
	}
	public boolean VeryfyCheckBoxFor_Recipient_TO_LeadOwner() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VeryfyCheckBoxFor_Recipient_TO_LeadOwner));
        return VeryfyCheckBoxFor_Recipient_TO_LeadOwner.isDisplayed();
	}
	
	
	
	
	//************************************************************************************************

	public void ClickOnCheckBoxFor_Recipient_TO_AccountOwner() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CheckBoxFor_Recipient_TO_AccountOwner));
		CheckBoxFor_Recipient_TO_AccountOwner.click();
	}
	public boolean VerifyCheckBoxFor_Recipient_TO_AccountOwner() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerifyCheckBoxFor_Recipient_TO_AccountOwner));
        return VerifyCheckBoxFor_Recipient_TO_AccountOwner.isDisplayed();
	}
	
	
	
	
	//************************************************************************************************

	public void ClickOnCheckBoxFor_Recipient_TO_LeadOwnerMappedSDR() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CheckBoxFor_Recipient_TO_LeadOwnerMappedSDR));
		CheckBoxFor_Recipient_TO_LeadOwnerMappedSDR.click();
	}
	public boolean VerifyCheckBoxFor_Recipient_TO_LeadOwnerMappedSDR() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerifyCheckBoxFor_Recipient_TO_LeadOwnerMappedSDR));
        return VerifyCheckBoxFor_Recipient_TO_LeadOwnerMappedSDR.isDisplayed();
	}
	public void ClickSelectDropDownFor_Recipient_TO_LeadOwnerMappedSDRSlack() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickSelectDropDownFor_Recipient_TO_LeadOwnerMappedSDRSlack));
		ClickSelectDropDownFor_Recipient_TO_LeadOwnerMappedSDRSlack.click();
	}
	public void ClickSelectDropDownFor_Recipient_TO_LeadOwnerMappedSDR() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickSelectDropDownFor_Recipient_TO_LeadOwnerMappedSDR));
		ClickSelectDropDownFor_Recipient_TO_LeadOwnerMappedSDR.click();
	}
	public boolean VerificatinOfSelectTextBoxBorderFor_Recipient_TO_LeadOwnerMappedSDR() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerificatinOfSelectTextBoxBorderFor_Recipient_TO_LeadOwnerMappedSDR));
        return VerificatinOfSelectTextBoxBorderFor_Recipient_TO_LeadOwnerMappedSDR.isDisplayed();
	}
	public boolean VerificatinOfSelectTextBoxBorderFor_Recipient_TO_LeadOwnerMappedSDRSlack() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerificatinOfSelectTextBoxBorderFor_Recipient_TO_LeadOwnerMappedSDRSlack));
        return VerificatinOfSelectTextBoxBorderFor_Recipient_TO_LeadOwnerMappedSDRSlack.isDisplayed();
	}
	
	
	//************************************************************************************************

	public void ClickOnCheckBoxFor_Recipient_TO_AccountOwnerMappedSDR() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CheckBoxFor_Recipient_TO_AccountOwnerMappedSDR));
		CheckBoxFor_Recipient_TO_AccountOwnerMappedSDR.click();
	}
	public boolean VerifyCheckBoxFor_Recipient_TO_AccountOwnerMappedSDR() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerifyCheckBoxFor_Recipient_TO_AccountOwnerMappedSDR));
        return VerifyCheckBoxFor_Recipient_TO_AccountOwnerMappedSDR.isDisplayed();
	}
	
	public void ClickSelectDropDownFor_Recipient_TO_AccountOwnerMappedSDR() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickSelectDropDownFor_Recipient_TO_AccountOwnerMappedSDR));
		ClickSelectDropDownFor_Recipient_TO_AccountOwnerMappedSDR.click();
	}
	public void ClickSelectDropDownFor_Recipient_TO_AccountOwnerMappedSDRSlack() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickSelectDropDownFor_Recipient_TO_AccountOwnerMappedSDRSlack));
		ClickSelectDropDownFor_Recipient_TO_AccountOwnerMappedSDRSlack.click();
	}
	public boolean VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AccountOwnerMappedSDR() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AccountOwnerMappedSDR));
        return VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AccountOwnerMappedSDR.isDisplayed();
	}
	public boolean VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AccountOwnerMappedSDRSlack() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AccountOwnerMappedSDRSlack));
        return VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AccountOwnerMappedSDRSlack.isDisplayed();
	}
	//************************************************************************************************

	public void ClickOnCheckBoxFor_Recipient_TO_AccountTeam() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CheckBoxFor_Recipient_TO_AccountTeam));
		CheckBoxFor_Recipient_TO_AccountTeam.click();
	}
	public boolean VerifyCheckBoxFor_Recipient_TO_AccountTeam() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerifyCheckBoxFor_Recipient_TO_AccountTeam));
        return VerifyCheckBoxFor_Recipient_TO_AccountTeam.isDisplayed();
	}
	
	public void ClickSelectDropDownFor_Recipient_TO_AccountTeam() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickSelectDropDownFor_Recipient_TO_AccountTeam));
		ClickSelectDropDownFor_Recipient_TO_AccountTeam.click();
	}
	public boolean VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AccountTeam() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AccountTeam));
        return VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AccountTeam.isDisplayed();
	}
	
	//************************************************************************************************

	public void ClickOnCheckBoxFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccount() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CheckBoxFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccount));
		CheckBoxFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccount.click();
	}
	public void CheckBoxFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccountSlack() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CheckBoxFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccountSlack));
		CheckBoxFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccountSlack.click();
	}
	public boolean VerifyCheckBoxFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccount() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerifyCheckBoxFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccount));
        return VerifyCheckBoxFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccount.isDisplayed();
	}
	public boolean VerifyCheckBoxFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccountSlack() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerifyCheckBoxFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccountSlack));
        return VerifyCheckBoxFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccountSlack.isDisplayed();
	}
	public void ClickSelectDropDownFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccount() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickSelectDropDownFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccount));
		ClickSelectDropDownFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccount.click();
	}
	public boolean VerificatinOfSelectTextBoxBorderFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccount() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerificatinOfSelectTextBoxBorderFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccount));
        return VerificatinOfSelectTextBoxBorderFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccount.isDisplayed();
	}
	public boolean VerificatinOfSelectTextBoxBorderFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccountSlack() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerificatinOfSelectTextBoxBorderFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccountSlack));
        return VerificatinOfSelectTextBoxBorderFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccountSlack.isDisplayed();
	}
	
	
	//************************************************************************************************

	public void ClickOnCheckBoxFor_Recipient_TO_AdditionalRecipients() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CheckBoxFor_Recipient_TO_AdditionalRecipients));
		CheckBoxFor_Recipient_TO_AdditionalRecipients.click();
	}
	public void CheckBoxFor_Recipient_TO_AdditionalRecipientsSlack() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CheckBoxFor_Recipient_TO_AdditionalRecipientsSlack));
		CheckBoxFor_Recipient_TO_AdditionalRecipientsSlack.click();
	}
	
	public boolean VerifyCheckBoxFor_Recipient_TO_AdditionalRecipients() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerifyCheckBoxFor_Recipient_TO_AdditionalRecipients));
        return VerifyCheckBoxFor_Recipient_TO_AdditionalRecipients.isDisplayed();
	}
	public boolean VerifyCheckBoxFor_Recipient_TO_AdditionalRecipientsSlack() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerifyCheckBoxFor_Recipient_TO_AdditionalRecipientsSlack));
        return VerifyCheckBoxFor_Recipient_TO_AdditionalRecipientsSlack.isDisplayed();
	}
	
	public void EnterMailIDFor_Recipient_TO_AdditionalRecipients(){
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(EnterMailIDFor_Recipient_TO_AdditionalRecipients));
		EnterMailIDFor_Recipient_TO_AdditionalRecipients.clear();
		EnterMailIDFor_Recipient_TO_AdditionalRecipients.sendKeys("example@leadangel.com,");
	}
	public void EnterMailIDFor_Recipient_TO_AdditionalRecipientsSlack(){
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(EnterMailIDFor_Recipient_TO_AdditionalRecipientsSlack));
		EnterMailIDFor_Recipient_TO_AdditionalRecipientsSlack.clear();
		EnterMailIDFor_Recipient_TO_AdditionalRecipientsSlack.sendKeys("example@leadangel.com,");
	}
	public boolean VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AdditionalRecipients() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AdditionalRecipients));
        return VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AdditionalRecipients.isDisplayed();
	}
	public boolean VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AdditionalRecipientsSlack() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AdditionalRecipientsSlack));
        return VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AdditionalRecipientsSlack.isDisplayed();
	}
	
	
	//***************************************************** Recipient_CC_ Clicking Operation*************************************************************
	
	public void ClickOnRecipientCC_DropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(RecipientCC_DropDown));
		RecipientCC_DropDown.click();
	}
	public void ClickOnCheckBoxFor_Recipient_CC_LeadOwner() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CheckBoxFor_Recipient_CC_LeadOwner));
		CheckBoxFor_Recipient_CC_LeadOwner.click();
	}
	public boolean VerifyCheckBoxFor_Recipient_CC_LeadOwner() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerifyCheckBoxFor_Recipient_CC_LeadOwner));
        return VerifyCheckBoxFor_Recipient_CC_LeadOwner.isDisplayed();
	}
	
	
	
	
	
	//************************************************************************************************

	public void ClickOnCheckBoxFor_Recipient_CC_AccountOwner() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CheckBoxFor_Recipient_CC_AccountOwner));
		CheckBoxFor_Recipient_CC_AccountOwner.click();
	}
	public boolean VerifyCheckBoxFor_Recipient_CC_AccountOwner() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerifyCheckBoxFor_Recipient_CC_AccountOwner));
        return VerifyCheckBoxFor_Recipient_CC_AccountOwner.isDisplayed();
	}
	
	
	
	
	//************************************************************************************************

	public void ClickOnCheckBoxFor_Recipient_CC_LeadOwnerMappedSDR() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CheckBoxFor_Recipient_CC_LeadOwnerMappedSDR));
		CheckBoxFor_Recipient_CC_LeadOwnerMappedSDR.click();
	}
	public boolean VerifyCheckBoxFor_Recipient_CC_LeadOwnerMappedSDR() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerifyCheckBoxFor_Recipient_CC_LeadOwnerMappedSDR));
        return VerifyCheckBoxFor_Recipient_CC_LeadOwnerMappedSDR.isDisplayed();
	}
	
	public void ClickSelectDropDownFor_Recipient_CC_LeadOwnerMappedSDR() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickSelectDropDownFor_Recipient_CC_LeadOwnerMappedSDR));
		ClickSelectDropDownFor_Recipient_CC_LeadOwnerMappedSDR.click();
	}
	public boolean VerificatinOfSelectTextBoxBorderFor_Recipient_CC_LeadOwnerMappedSDR() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerificatinOfSelectTextBoxBorderFor_Recipient_CC_LeadOwnerMappedSDR));
        return VerificatinOfSelectTextBoxBorderFor_Recipient_CC_LeadOwnerMappedSDR.isDisplayed();
	}
	
	
	//************************************************************************************************
	
	public void ClickOnCheckBoxFor_Recipient_CC_AccountOwnerMappedSDR() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CheckBoxFor_RecipientC_CC_AccountOwnerMappedSDR));
		CheckBoxFor_RecipientC_CC_AccountOwnerMappedSDR.click();
	}
	public boolean VerifyCheckBoxFor_Recipient_CC_AccountOwnerMappedSDR() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerifyCheckBoxFor_Recipient_CC_AccountOwnerMappedSDR));
        return VerifyCheckBoxFor_Recipient_CC_AccountOwnerMappedSDR.isDisplayed();
	}
	
	public void ClickSelectDropDownFor_Recipient_CC_AccountOwnerMappedSDR() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickSelectDropDownFor_Recipient_CC_AccountOwnerMappedSDR));
		ClickSelectDropDownFor_Recipient_CC_AccountOwnerMappedSDR.click();
	}
	public boolean VerificatinOfSelectTextBoxBorderFor_Recipient_CC_AccountOwnerMappedSDR() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerificatinOfSelectTextBoxBorderFor_Recipient_CC_AccountOwnerMappedSDR));
        return VerificatinOfSelectTextBoxBorderFor_Recipient_CC_AccountOwnerMappedSDR.isDisplayed();
	}
	
	//************************************************************************************************

	public void ClickOnCheckBoxFor_Recipient_CC_AccountTeam() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CheckBoxFor_Recipient_CC_AccountTeam));
		CheckBoxFor_Recipient_CC_AccountTeam.click();
	}
	public boolean VerifyCheckBoxFor_Recipient_CC_AccountTeam() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerifyCheckBoxFor_Recipient_CC_AccountTeam));
        return VerifyCheckBoxFor_Recipient_CC_AccountTeam.isDisplayed();
	}
	
	public void ClickSelectDropDownFor_Recipient_CC_AccountTeam() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickSelectDropDownFor_Recipient_CC_AccountTeam));
		ClickSelectDropDownFor_Recipient_CC_AccountTeam.click();
	}
	public boolean VerificatinOfSelectTextBoxBorderFor_Recipient_CC_AccountTeam() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerificatinOfSelectTextBoxBorderFor_Recipient_CC_AccountTeam));
        return VerificatinOfSelectTextBoxBorderFor_Recipient_CC_AccountTeam.isDisplayed();
	}
	
	//************************************************************************************************

	public void ClickOnCheckBoxFor_Recipient_CC_NotifyBasedOnTheLookupFieldOnAccount() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CheckBoxFor_Recipient_CC_NotifyBasedOnTheLookupFieldOnAccount));
		CheckBoxFor_Recipient_CC_NotifyBasedOnTheLookupFieldOnAccount.click();
	}
	public boolean VerifyCheckBoxFor_Recipient_CC_NotifyBasedOnTheLookupFieldOnAccount() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerifyCheckBoxFor_Recipient_CC_NotifyBasedOnTheLookupFieldOnAccount));
        return VerifyCheckBoxFor_Recipient_CC_NotifyBasedOnTheLookupFieldOnAccount.isDisplayed();
	}
	
	public void ClickSelectDropDownFor_Recipient_CC_NotifyBasedOnTheLookupFieldOnAccount() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickSelectDropDownFor_Recipient_CC_NotifyBasedOnTheLookupFieldOnAccount));
		ClickSelectDropDownFor_Recipient_CC_NotifyBasedOnTheLookupFieldOnAccount.click();
	}
	public boolean VerificatinOfSelectTextBoxBorderFor_Recipient_CC_NotifyBasedOnTheLookupFieldOnAccount() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerificatinOfSelectTextBoxBorderFor_Recipient_CC_NotifyBasedOnTheLookupFieldOnAccount));
        return VerificatinOfSelectTextBoxBorderFor_Recipient_CC_NotifyBasedOnTheLookupFieldOnAccount.isDisplayed();
	}
	
	//************************************************************************************************

	public void ClickOnCheckBoxFor_Recipient_CC_AdditionalRecipients() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CheckBoxFor_Recipient_CC_AdditionalRecipients));
		CheckBoxFor_Recipient_CC_AdditionalRecipients.click();
	}
	public boolean VerifyCheckBoxFor_Recipient_CC_AdditionalRecipients() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerifyCheckBoxFor_Recipient_CC_AdditionalRecipients));
        return VerifyCheckBoxFor_Recipient_CC_AdditionalRecipients.isDisplayed();
	}
	
	public void EnterMailIDFor_Recipient_CC_AdditionalRecipients() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(EnterMailIDFor_Recipient_CC_AdditionalRecipients));
		EnterMailIDFor_Recipient_CC_AdditionalRecipients.clear();
		EnterMailIDFor_Recipient_CC_AdditionalRecipients.sendKeys("example@leadangel.com,");

	}
	public boolean VerificatinOfSelectTextBoxBorderFor_Recipient_CC_AdditionalRecipients() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerificatinOfSelectTextBoxBorderFor_Recipient_CC_AdditionalRecipients));
        return VerificatinOfSelectTextBoxBorderFor_Recipient_CC_AdditionalRecipients.isDisplayed();
	}
	
	//*************************************************Subject*********************************
	 //Some of InsertSnippet operation xpath has been taken from LeadRouterPage
	
	
	
	
	
	public void EnterHeader() throws InterruptedException {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(EnterHeader));
		EnterHeader.clear();
		EnterHeader.sendKeys("@");
		Thread.sleep(1500);
		SelectOwnerOption.click();
		EnterHeader.sendKeys(",a lead has been assigned to you");
	}
	
	public void EnterSubject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(EnterSubject));
		EnterSubject.clear();
		EnterSubject.sendKeys("Hello lead, This is your");

	}
	public void ClickOnInsertSnippetButtonForSubject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnInsertSnippetButtonForSubject));
		ClickOnInsertSnippetButtonForSubject.click();
	}
	
	public void ClickOnBracesButtonForHeader() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnBracesButtonForHeader));
		ClickOnBracesButtonForHeader.click();
	}
	public void ClickOnBracesButtonForBody() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnBracesButtonForBody));
		ClickOnBracesButtonForBody.click();
	}
	
	public boolean VerificatinOfSubjectTextBoxBorderForSubject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerificatinOfSubjectTextBoxBorderForSubject));
        return VerificatinOfSubjectTextBoxBorderForSubject.isDisplayed();
	}
	
	public void ClickOnSelectObjectDropDownForInsertValueInSubject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSelectObjectDropDownForInsertValueInSubject));
		ClickOnSelectObjectDropDownForInsertValueInSubject.click();
	}
	public void ClickOnSelectObjectDropDownForURL() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSelectObjectDropDownForURL));
		ClickOnSelectObjectDropDownForURL.click();
	}
	
	//*************************************************Email Body*********************************
	    
	 //Some of InsertSnippet operation xpath has been taken from LeadRouterPage
	
	public void EnterEmailBody() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(EnterEmailBody));
		EnterEmailBody.clear();
		EnterEmailBody.sendKeys("Hello lead, This is your");
	}
	
	public void EnterBodyForSlack() throws InterruptedException {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(EnterBodyForSlack));
		EnterBodyForSlack.clear();
		EnterBodyForSlack.sendKeys("@");
		Thread.sleep(1500);
		SelectChannelOption.click();
		EnterBodyForSlack.sendKeys(",This is your lead information");
	}
	public void EnterMessageBody() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(EnterMessageBody));
		EnterMessageBody.clear();
		EnterMessageBody.sendKeys("Hello lead, This is your");

	}
	public void ClickOnInsertSnippetButtonForEmailBody() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnInsertSnippetButtonForEmailBody));
		ClickOnInsertSnippetButtonForEmailBody.click();
	}
	
	public boolean VerificatinOfEmailBodyTextBoxBorderForEmailBody() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerificatinOfEmailBodyTextBoxBorderForEmailBody));
        return VerificatinOfEmailBodyTextBoxBorderForEmailBody.isDisplayed();
	}
	
	//*************************************************Save button For Email Alert Templates*********************************

	
	public void SaveButtonForEmailAlertTemplate() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SaveButtonForEmailAlertTemplate));
		SaveButtonForEmailAlertTemplate.click();
	}
	public boolean SavingVerificationMessage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(SavingVerificationMessage));
        return SavingVerificationMessage.isDisplayed();
	}
	public boolean SavingVerificationMessageSlack() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(SavingVerificationMessageSlack));
        return SavingVerificationMessageSlack.isDisplayed();
	}
	
	
	//************************************************* OTS Broadcast Notification Recipients *********************************

	@FindBy(xpath = "//ng-select[@formcontrolname='otsnotify']")
	WebElement ClickSelectDropDownFor_Recipient_TO_OTSBroadcastNotificationRecipients;
	
	public void ClickSelectDropDownFor_Recipient_TO_OTSBroadcastNotificationRecipients() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickSelectDropDownFor_Recipient_TO_OTSBroadcastNotificationRecipients));
		ClickSelectDropDownFor_Recipient_TO_OTSBroadcastNotificationRecipients.click();
	}
	
	//************************************************* Slack Channnels ********************************************************

	@FindBy(xpath = "((//span[text()='Slack Channels'])[1]//..//..)[1]")
	WebElement CheckBoxFor_Recipient_TO_SlackChannels;
	
	@FindBy(xpath = "((//span[text()='Slack Channels'])[1]//..//..//..//..//..)[1]//button[@mattooltip='Refresh']")
	WebElement ClickOnRefreshButtonFor_Recipient_TO_SlackChannels;
	
	@FindBy(xpath = "//div[text()='Success']")
	WebElement DisplaySuccesMessageFor_Recipient_TO_SlackChannels;
	@FindBy(xpath = "//div[text()='Data refreshed successfully']")
	WebElement DisplaySuccesMessageFor_Recipient_TO_OTSBroadcastNotificationRecipient;
	
	@FindBy(xpath = "((//span[text()='Slack Channels'])[1]//..//..//..//..//..)[1]//span[@class='ng-arrow-wrapper']")
	WebElement ClickSelectDropDownFor_Recipient_TO_SlackChannels;
	
	@FindBy(xpath = "((//span[text()='Slack Channels'])[1]//..//..//..//..//..)[1]//div[contains(@class,'ng-has-value')]")
	WebElement VerifyBorderFor_Recipient_TO_SlackChannels;
	@FindBy(xpath = "((//span[text()='Slack Channels'])[1]//..//..)[1]//input[@aria-checked='true']")
	WebElement VeryfyCheckBoxFor_Recipient_TO_SlackChannels;
	
	@FindBy(xpath = "//div[@id='editor']//a[text()]")
	WebElement DoubleClickOnLink;

	public void DoubleClickOnLink() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DoubleClickOnLink));
		Actions actions = new Actions(ldriver);
		actions.doubleClick(DoubleClickOnLink).build().perform();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public boolean VeryfyCheckBoxFor_Recipient_TO_SlackChannels() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VeryfyCheckBoxFor_Recipient_TO_SlackChannels));
        return VeryfyCheckBoxFor_Recipient_TO_SlackChannels.isDisplayed();
	}


	
	public boolean DisplaySuccesMessageFor_Recipient_TO_SlackChannels() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplaySuccesMessageFor_Recipient_TO_SlackChannels));
        return DisplaySuccesMessageFor_Recipient_TO_SlackChannels.isDisplayed();
	}
	
	public boolean VerifyBorderFor_Recipient_TO_SlackChannels() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerifyBorderFor_Recipient_TO_SlackChannels));
        return VerifyBorderFor_Recipient_TO_SlackChannels.isDisplayed();
	}
	public void ClickSelectDropDownFor_Recipient_TO_SlackChannels() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickSelectDropDownFor_Recipient_TO_SlackChannels));
		ClickSelectDropDownFor_Recipient_TO_SlackChannels.click();
	}
	public void ClickOnRefreshButtonFor_Recipient_TO_SlackChannels() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnRefreshButtonFor_Recipient_TO_SlackChannels));
		ClickOnRefreshButtonFor_Recipient_TO_SlackChannels.click();
	}
	public void CheckBoxFor_Recipient_TO_SlackChannels() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CheckBoxFor_Recipient_TO_SlackChannels));
		CheckBoxFor_Recipient_TO_SlackChannels.click();
	}

	//************************************************* Slack Users *****************************************************

	@FindBy(xpath = "((//span[text()='Slack Users'])[1]//..//..)[1]")
	WebElement CheckBoxFor_Recipient_TO_SlackUsers;
	
	@FindBy(xpath = "((//span[text()='Slack Users'])[1]//..//..//..//..//..)[1]//button[@mattooltip='Refresh']")
	WebElement ClickOnRefreshButtonFor_Recipient_TO_SlackUsers;
	
	@FindBy(xpath = "((//span[text()='Slack Users'])[1]//..//..//..//..//..)[1]//app-search-dropdwon[@formcontrolname='userlist']")
	WebElement ClickSelectDropDownFor_Recipient_TO_SlackUsers;
	
	@FindBy(xpath = "((//span[text()='Slack Users'])[1]//..//..//..//..//..)[1]//mat-select[contains(@class,'ng-valid')]")
	WebElement VerifyBorderFor_Recipient_TO_SlackUsers;
	
	@FindBy(xpath = "((//span[text()='Slack Users'])[1]//..//..)[1]//input[@aria-checked='true']")
	WebElement VeryfyCheckBoxFor_Recipient_TO_SlackUsers;
	

	
	
	public boolean VeryfyCheckBoxFor_Recipient_TO_SlackUsers() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VeryfyCheckBoxFor_Recipient_TO_SlackUsers));
        return VeryfyCheckBoxFor_Recipient_TO_SlackUsers.isDisplayed();
	}
	
	public void CheckBoxFor_Recipient_TO_SlackUsers() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CheckBoxFor_Recipient_TO_SlackUsers));
		CheckBoxFor_Recipient_TO_SlackUsers.click();
	}
	public void ClickOnRefreshButtonFor_Recipient_TO_SlackUsers() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnRefreshButtonFor_Recipient_TO_SlackUsers));
		ClickOnRefreshButtonFor_Recipient_TO_SlackUsers.click();
	}
	public void ClickSelectDropDownFor_Recipient_TO_SlackUsers() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickSelectDropDownFor_Recipient_TO_SlackUsers));
		ClickSelectDropDownFor_Recipient_TO_SlackUsers.click();
	}
	public boolean VerifyBorderFor_Recipient_TO_SlackUsers() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerifyBorderFor_Recipient_TO_SlackUsers));
        return VerifyBorderFor_Recipient_TO_SlackUsers.isDisplayed();
	}
	
	
	//************************************************* Additional Recipients for Slack *****************************************************

	@FindBy(xpath = "(//label[contains(@for,'mat-checkbox')])[10]")
	WebElement CheckBoxFor_Recipient_TO_AdditionalRecipientsForSlack ;
	@FindBy(xpath = "(//label[contains(@for,'mat-checkbox')])[10]//input[@aria-checked='true']")
	WebElement VeryfyCheckBoxFor_Recipient_TO_AdditionalRecipientsForSlack;
	
	@FindBy(xpath = "//mat-chip[contains(@class,'ng-star-inserted')]")
	WebElement VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AdditionalRecipientsForSlack ;
	
	
	public boolean VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AdditionalRecipientsForSlack() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AdditionalRecipientsForSlack));
        return VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AdditionalRecipientsForSlack.isDisplayed();
	}
	
	public boolean VeryfyCheckBoxFor_Recipient_TO_AdditionalRecipientsForSlack() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VeryfyCheckBoxFor_Recipient_TO_AdditionalRecipientsForSlack));
        return VeryfyCheckBoxFor_Recipient_TO_AdditionalRecipientsForSlack.isDisplayed();
	}
	public void CheckBoxFor_Recipient_TO_AdditionalRecipientsForSlack() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CheckBoxFor_Recipient_TO_AdditionalRecipientsForSlack));
		CheckBoxFor_Recipient_TO_AdditionalRecipientsForSlack.click();
	}
	
	//************************************************* Email Body for Slack *****************************************************

	@FindBy(xpath = "//input[@placeholder='example@leadangel.com']")  //(//div[@class='mat-chip-list-wrapper'])[1]
	WebElement EnterMailIDFor_Recipient_TO_AdditionalRecipientsForSlack ;
	
	@FindBy(xpath = "//mat-icon[text()='data_object']")
	WebElement ClickOnInsertSnippetButtonForEmailBodyForSlack ;
	@FindBy(xpath = "//textarea[@class='form-control ng-pristine ng-touched ng-valid']")
	WebElement VerificatinOfEmailBodyTextBoxBorderForEmailBodyForSlack ;
	
	
	
	public boolean VerificatinOfEmailBodyTextBoxBorderForEmailBodyForSlack() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerificatinOfEmailBodyTextBoxBorderForEmailBodyForSlack));
        return VerificatinOfEmailBodyTextBoxBorderForEmailBodyForSlack.isDisplayed();
	}
	
	public void ClickOnInsertSnippetButtonForEmailBodyForSlack() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnInsertSnippetButtonForEmailBodyForSlack));
		ClickOnInsertSnippetButtonForEmailBodyForSlack.click();
	}
	
	public void EnterMailIDFor_Recipient_TO_AdditionalRecipientsForSlack(){
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(EnterMailIDFor_Recipient_TO_AdditionalRecipientsForSlack));
		EnterMailIDFor_Recipient_TO_AdditionalRecipientsForSlack.clear();
		EnterMailIDFor_Recipient_TO_AdditionalRecipientsForSlack.sendKeys("example@leadangel.com,");
	}
	
	
	//************************************************* Email Body for Slack *****************************************************

	
	@FindBy(xpath = "//div[text()='Saved successfully']")
	WebElement SavingVerificationMessageForSlack ;
	
	public boolean SavingVerificationMessageForSlack() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(SavingVerificationMessageForSlack));
        return SavingVerificationMessageForSlack.isDisplayed();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
