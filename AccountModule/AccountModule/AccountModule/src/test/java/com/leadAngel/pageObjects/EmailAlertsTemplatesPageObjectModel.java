package com.leadAngel.pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	
	
	@FindBy(xpath = "(//div[@role='option'])[1]")
	WebElement SelectFirstOptionFor_RecipientTO_OR_RecipientCC;
	
	
	//************************************************************************************************

	@FindBy(xpath = "(//label[contains(@for,'mat-checkbox')])[1]")
	WebElement CheckBoxFor_Recipient_TO_LeadOwner;
	
	@FindBy(xpath = "(//label[contains(@for,'mat-checkbox')])[1]//input[@aria-checked='true']")
	WebElement VeryfyCheckBoxFor_Recipient_TO_LeadOwner;
	//************************************************************************************************

	@FindBy(xpath = "(//label[contains(@for,'mat-checkbox')])[2]")
	WebElement CheckBoxFor_Recipient_TO_AccountOwner;
	
	@FindBy(xpath = "(//label[contains(@for,'mat-checkbox')])[2]//input[@aria-checked='true']")
	WebElement VerifyCheckBoxFor_Recipient_TO_AccountOwner;
	//************************************************************************************************
	
	@FindBy(xpath = "(//label[contains(@for,'mat-checkbox')])[3]")
	WebElement CheckBoxFor_Recipient_TO_LeadOwnerMappedSDR;
	
	@FindBy(xpath = "(//label[contains(@for,'mat-checkbox')])[3]//input[@aria-checked='true']")
	WebElement VerifyCheckBoxFor_Recipient_TO_LeadOwnerMappedSDR;
	
	@FindBy(xpath = "//ng-select[@formcontrolname='leadownermapped']")
	WebElement ClickSelectDropDownFor_Recipient_TO_LeadOwnerMappedSDR;
	
	@FindBy(xpath = "(//div[@class='ng-select-container ng-has-value'])[1]")
	WebElement VerificatinOfSelectTextBoxBorderFor_Recipient_TO_LeadOwnerMappedSDR;
	
	
	
	//************************************************************************************************

	@FindBy(xpath = "(//label[contains(@for,'mat-checkbox')])[4]")
	WebElement CheckBoxFor_Recipient_TO_AccountOwnerMappedSDR;
	
	@FindBy(xpath = "(//label[contains(@for,'mat-checkbox')])[4]//input[@aria-checked='true']")
	WebElement VerifyCheckBoxFor_Recipient_TO_AccountOwnerMappedSDR;
	
	@FindBy(xpath = "//ng-select[@formcontrolname='accountownermapped']")
	WebElement ClickSelectDropDownFor_Recipient_TO_AccountOwnerMappedSDR;
	
	@FindBy(xpath = "(//div[@class='ng-select-container ng-has-value'])[2]")
	WebElement VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AccountOwnerMappedSDR;
	
	//************************************************************************************************

	@FindBy(xpath = "(//label[contains(@for,'mat-checkbox')])[5]")
	WebElement CheckBoxFor_Recipient_TO_AccountTeam;
	
	@FindBy(xpath = "(//label[contains(@for,'mat-checkbox')])[5]//input[@aria-checked='true']")
	WebElement VerifyCheckBoxFor_Recipient_TO_AccountTeam;
	
	@FindBy(xpath = "//ng-select[@formcontrolname='accountteamdata']")
	WebElement ClickSelectDropDownFor_Recipient_TO_AccountTeam;
	
	@FindBy(xpath = "(//div[@class='ng-select-container ng-has-value'])[3]")
	WebElement VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AccountTeam;
	
	//************************************************************************************************
	
	@FindBy(xpath = "(//label[contains(@for,'mat-checkbox')])[6]")
	WebElement CheckBoxFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccount;
	
	@FindBy(xpath = "(//label[contains(@for,'mat-checkbox')])[6]//input[@aria-checked='true']")
	WebElement VerifyCheckBoxFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccount;
	
	@FindBy(xpath = "//ng-select[@formcontrolname='notifylookupfielddatato']")
	WebElement ClickSelectDropDownFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccount;
	
	@FindBy(xpath = "(//div[@class='ng-select-container ng-has-value'])[4]")
	WebElement VerificatinOfSelectTextBoxBorderFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccount;
	
	//************************************************************************************************
	
	@FindBy(xpath = "(//label[contains(@for,'mat-checkbox')])[7]")
	WebElement CheckBoxFor_Recipient_TO_AdditionalRecipients ;

	@FindBy(xpath = "(//label[contains(@for,'mat-checkbox')])[7]//input[@aria-checked='true']")
	WebElement VerifyCheckBoxFor_Recipient_TO_AdditionalRecipients ;
	
	@FindBy(xpath = "(//input[@placeholder='example@gmail.com'])[1]")  //(//div[@class='mat-chip-list-wrapper'])[1]
	WebElement EnterMailIDFor_Recipient_TO_AdditionalRecipients ;

	@FindBy(xpath = "(//mat-chip-list[contains(@class,'ng-star-inserted')])[1]")
	WebElement VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AdditionalRecipients ;
	
	
	//***************************************************** Recipient_CC Clicking Operation*************************************************************

	
	@FindBy(xpath = "(//label[contains(@for,'mat-checkbox')])[8]")
	WebElement CheckBoxFor_Recipient_CC_LeadOwner;
	
	@FindBy(xpath = "(//label[contains(@for,'mat-checkbox')])[8]//input[@aria-checked='true']")
	WebElement VerifyCheckBoxFor_Recipient_CC_LeadOwner;
	//************************************************************************************************

	@FindBy(xpath = "(//label[contains(@for,'mat-checkbox')])[9]")
	WebElement CheckBoxFor_Recipient_CC_AccountOwner;
	
	@FindBy(xpath = "(//label[contains(@for,'mat-checkbox')])[9]//input[@aria-checked='true']")
	WebElement VerifyCheckBoxFor_Recipient_CC_AccountOwner;
	//************************************************************************************************

	@FindBy(xpath = "(//label[contains(@for,'mat-checkbox')])[10]")
	WebElement CheckBoxFor_Recipient_CC_LeadOwnerMappedSDR;
	
	@FindBy(xpath = "(//label[contains(@for,'mat-checkbox')])[10]//input[@aria-checked='true']")
	WebElement VerifyCheckBoxFor_Recipient_CC_LeadOwnerMappedSDR;
	
	@FindBy(xpath = "//ng-select[@formcontrolname='leadownermappedcc']")
	WebElement ClickSelectDropDownFor_Recipient_CC_LeadOwnerMappedSDR;
	
	@FindBy(xpath = "(//div[@class='ng-select-container ng-has-value'])[5]")
	WebElement VerificatinOfSelectTextBoxBorderFor_Recipient_CC_LeadOwnerMappedSDR;
	
	//************************************************************************************************
	
	@FindBy(xpath = "(//label[contains(@for,'mat-checkbox')])[11]")
	WebElement CheckBoxFor_RecipientC_CC_AccountOwnerMappedSDR;
	
	@FindBy(xpath = "(//label[contains(@for,'mat-checkbox')])[11]//input[@aria-checked='true']")
	WebElement VerifyCheckBoxFor_Recipient_CC_AccountOwnerMappedSDR;
	
	@FindBy(xpath = "//ng-select[@formcontrolname='accountownermappedcc']")
	WebElement ClickSelectDropDownFor_Recipient_CC_AccountOwnerMappedSDR;
	
	@FindBy(xpath = "(//div[@class='ng-select-container ng-has-value'])[6]")
	WebElement VerificatinOfSelectTextBoxBorderFor_Recipient_CC_AccountOwnerMappedSDR;
	
	//************************************************************************************************
	
	@FindBy(xpath = "(//label[contains(@for,'mat-checkbox')])[12]")
	WebElement CheckBoxFor_Recipient_CC_AccountTeam;
	
	@FindBy(xpath = "(//label[contains(@for,'mat-checkbox')])[12]//input[@aria-checked='true']")
	WebElement VerifyCheckBoxFor_Recipient_CC_AccountTeam;
	
	@FindBy(xpath = "//ng-select[@formcontrolname='accountteamdatacc']")
	WebElement ClickSelectDropDownFor_Recipient_CC_AccountTeam;
	
	@FindBy(xpath = "(//div[@class='ng-select-container ng-has-value'])[7]")
	WebElement VerificatinOfSelectTextBoxBorderFor_Recipient_CC_AccountTeam;
	
	//************************************************************************************************
	
	@FindBy(xpath = "(//label[contains(@for,'mat-checkbox')])[13]")
	WebElement CheckBoxFor_Recipient_CC_NotifyBasedOnTheLookupFieldOnAccount;
	
	@FindBy(xpath = "(//label[contains(@for,'mat-checkbox')])[13]//input[@aria-checked='true']")
	WebElement VerifyCheckBoxFor_Recipient_CC_NotifyBasedOnTheLookupFieldOnAccount;
	
	@FindBy(xpath = "//ng-select[@formcontrolname='notifylookupfielddatacc']")
	WebElement ClickSelectDropDownFor_Recipient_CC_NotifyBasedOnTheLookupFieldOnAccount;	
			
	@FindBy(xpath = "(//div[@class='ng-select-container ng-has-value'])[8]")
	WebElement VerificatinOfSelectTextBoxBorderFor_Recipient_CC_NotifyBasedOnTheLookupFieldOnAccount;
	//************************************************************************************************
	
	@FindBy(xpath = "(//label[contains(@for,'mat-checkbox')])[14]")
	WebElement CheckBoxFor_Recipient_CC_AdditionalRecipients ;
	
	@FindBy(xpath = "(//label[contains(@for,'mat-checkbox')])[14]//input[@aria-checked='true']")
	WebElement VerifyCheckBoxFor_Recipient_CC_AdditionalRecipients ;
	
	@FindBy(xpath = "(//input[@placeholder='example@gmail.com'])[2]")
	WebElement EnterMailIDFor_Recipient_CC_AdditionalRecipients ;
	
	@FindBy(xpath = "//mat-chip[text()=' example1@leadangel.com ']")
	WebElement VerifyEnteredMailIDFor_Recipient_CC_AdditionalRecipients ;
	
	@FindBy(xpath = "(//mat-chip-list[contains(@class,'ng-star-inserted')])[2]")
	WebElement VerificatinOfSelectTextBoxBorderFor_Recipient_CC_AdditionalRecipients ;
	
	//*************************************************Subject*********************************
	     //Some of InsertSnippet operation xpath has been taken from leadManagementpage
	
	@FindBy(xpath = "//input[@formcontrolname='emailsubject']")
	WebElement EnterSubject ;
	
	@FindBy(xpath = "(//img[@src='assets/icons/curlybracket.png'])[1]")
	WebElement ClickOnInsertSnippetButtonForSubject ;
	
	@FindBy(xpath = "(//input[contains(@class,'ng-untouched ng-pristine ng-valid')])[2]")
	WebElement VerificatinOfSubjectTextBoxBorderForSubject ;
	
	//*************************************************Email Body*********************************
    //Some of InsertSnippet operation xpath has been taken from leadManagementpage

	@FindBy(xpath = "//textarea[@formcontrolname='emailbody']")
	WebElement EnterEmailBody ;
	
	@FindBy(xpath = "(//img[@src='assets/icons/curlybracket.png'])[2]")
	WebElement ClickOnInsertSnippetButtonForEmailBody ;
	
	@FindBy(xpath = "(//div[contains(@class,'col-lg-')])[4]//textarea[contains(@class,'ng-valid')]")
	WebElement VerificatinOfEmailBodyTextBoxBorderForEmailBody ;
	
	//*************************************************Save button For Email Alert Templates*********************************
	
	@FindBy(xpath = "//span[text()=' Save ']")
	WebElement SaveButtonForEmailAlertTemplate ;
	
	@FindBy(xpath = "//div[text()='saved successfully']")
	WebElement SavingVerificationMessage ;
	

	
	
	//***********************************************************************************************************************************************
	
	
	
	
	public void SelectFirstOptionFor_RecipientTO_OR_RecipientCC() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectFirstOptionFor_RecipientTO_OR_RecipientCC));
		SelectFirstOptionFor_RecipientTO_OR_RecipientCC.click();
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
	public void ClickSelectDropDownFor_Recipient_TO_LeadOwnerMappedSDR() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickSelectDropDownFor_Recipient_TO_LeadOwnerMappedSDR));
		ClickSelectDropDownFor_Recipient_TO_LeadOwnerMappedSDR.click();
	}
	public boolean VerificatinOfSelectTextBoxBorderFor_Recipient_TO_LeadOwnerMappedSDR() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerificatinOfSelectTextBoxBorderFor_Recipient_TO_LeadOwnerMappedSDR));
        return VerificatinOfSelectTextBoxBorderFor_Recipient_TO_LeadOwnerMappedSDR.isDisplayed();
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
	public boolean VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AccountOwnerMappedSDR() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AccountOwnerMappedSDR));
        return VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AccountOwnerMappedSDR.isDisplayed();
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
	public boolean VerifyCheckBoxFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccount() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerifyCheckBoxFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccount));
        return VerifyCheckBoxFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccount.isDisplayed();
	}
	public void ClickSelectDropDownFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccount() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickSelectDropDownFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccount));
		ClickSelectDropDownFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccount.click();
	}
	public boolean VerificatinOfSelectTextBoxBorderFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccount() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerificatinOfSelectTextBoxBorderFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccount));
        return VerificatinOfSelectTextBoxBorderFor_Recipient_TO_NotifyBasedOnTheLookupFieldOnAccount.isDisplayed();
	}
	
	
	//************************************************************************************************

	public void ClickOnCheckBoxFor_Recipient_TO_AdditionalRecipients() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CheckBoxFor_Recipient_TO_AdditionalRecipients));
		CheckBoxFor_Recipient_TO_AdditionalRecipients.click();
	}
	public boolean VerifyCheckBoxFor_Recipient_TO_AdditionalRecipients() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerifyCheckBoxFor_Recipient_TO_AdditionalRecipients));
        return VerifyCheckBoxFor_Recipient_TO_AdditionalRecipients.isDisplayed();
	}
	public void EnterMailIDFor_Recipient_TO_AdditionalRecipients(){
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(EnterMailIDFor_Recipient_TO_AdditionalRecipients));
		EnterMailIDFor_Recipient_TO_AdditionalRecipients.clear();
		EnterMailIDFor_Recipient_TO_AdditionalRecipients.sendKeys("example@gmail.com,");
		
		

	}
	public boolean VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AdditionalRecipients() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AdditionalRecipients));
        return VerificatinOfSelectTextBoxBorderFor_Recipient_TO_AdditionalRecipients.isDisplayed();
	}
	
	
	
	//***************************************************** Recipient_CC_ Clicking Operation*************************************************************


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
		EnterMailIDFor_Recipient_CC_AdditionalRecipients.sendKeys("example1@gmail.com,");

	}
	public boolean VerificatinOfSelectTextBoxBorderFor_Recipient_CC_AdditionalRecipients() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerificatinOfSelectTextBoxBorderFor_Recipient_CC_AdditionalRecipients));
        return VerificatinOfSelectTextBoxBorderFor_Recipient_CC_AdditionalRecipients.isDisplayed();
	}
	
	//*************************************************Subject*********************************
	 //Some of InsertSnippet operation xpath has been taken from LeadRouterPage
	
	public void EnterSubject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(EnterSubject));
		EnterSubject.clear();
		EnterSubject.sendKeys("Hello lead, This is your");

	}
	public void ClickOnInsertSnippetButtonForSubject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnInsertSnippetButtonForSubject));
		ClickOnInsertSnippetButtonForSubject.click();
	}
	public boolean VerificatinOfSubjectTextBoxBorderForSubject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerificatinOfSubjectTextBoxBorderForSubject));
        return VerificatinOfSubjectTextBoxBorderForSubject.isDisplayed();
	}
	
	//*************************************************Email Body*********************************
	    
	 //Some of InsertSnippet operation xpath has been taken from LeadRouterPage
	
	public void EnterEmailBody() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(EnterEmailBody));
		EnterEmailBody.clear();
		EnterEmailBody.sendKeys("Hello lead, This is your");

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
	
}
