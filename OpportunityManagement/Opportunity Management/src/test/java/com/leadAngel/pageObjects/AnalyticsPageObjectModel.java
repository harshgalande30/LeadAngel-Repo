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

public class AnalyticsPageObjectModel {

	WebDriver ldriver;

	public AnalyticsPageObjectModel(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}


	//*******************************Analytics Module***************************************************************

	@FindBy(xpath = "//div[text()=' Analytics']")
	WebElement Analytics;

	@FindBy(xpath = "//button[@aria-label='toggle Data Dictionary']")
	WebElement AnalyticsDataDictionary;

	@FindBy(xpath = "//button[@aria-label='toggle Account List']")
	WebElement AnalyticsAccountListDropDown;

	@FindBy(xpath = "//span[text()='Account List ']")
	WebElement AnalyticsAccountList;
	
	//*******************************Custom Reports***************************************************************
	@FindBy(xpath = "//h4[text()='Custom Report Overview']")
	WebElement CustomReportOverview;
	
	@FindBy(xpath = "//button[@aria-label='toggle Custom Report']")
	WebElement CustomReportDropDown;
	@FindBy(xpath = "//span[text()='Custom Report ']")
	WebElement CustomReport;
	
	@FindBy(xpath = "//li[text()=' Filter Report ']")
	WebElement FilterReportButton;
	
	@FindBy(xpath = "//button[text()=' Account Attributes ']")
	WebElement AccountAttributes;
	@FindBy(xpath = "//div[@id='cdk-drop-list-0']")
	WebElement AddField;
	@FindBy(xpath = "(//mat-list-item[contains(@id,'Account ID')])[1]")
	WebElement AccountID_DND;
	@FindBy(xpath = "//option[text()=' is not empty ']")
	WebElement SelectAccountID;
	
	
	@FindBy(xpath = "//span[text()='Next Step']")
	WebElement NextStepButton;
	
	@FindBy(xpath = "(//div[text()=' Account ID '])[1]")
	WebElement AccountFields_AccountID_Option;
	@FindBy(xpath = "//div[text()=' Account Name ']")
	WebElement AccountFields_AccountNameOption;
	@FindBy(xpath = "(//div[text()=' Annual Revenue '])[1]")
	WebElement AccountFields_AnnualRevenueOption;
	
	@FindBy(xpath = "//div[text()=' Lead ID ']")
	WebElement CRM_LeadFields_LeadID_Option;
	@FindBy(xpath = "(//div[text()=' Full Name '])[1]")
	WebElement CRM_LeadFields_FullName_Option;
	@FindBy(xpath = "(//div[text()=' Mobile Phone '])[1]")
	WebElement CRM_LeadFields_MobilePhone_Option;
	
	@FindBy(xpath = "//div[text()=' Contact ID ']")
	WebElement CRM_ContactFields_ContactID_Option;
	@FindBy(xpath = "(//div[text()=' Full Name '])[2]")
	WebElement CRM_ContactFields_FullName_Option;
	@FindBy(xpath = "//div[text()=' Mailing City ']")
	WebElement CRM_ContactFields_MailingCity_Option;
	
	@FindBy(xpath = "//span[text()=' Run Report ']")
	WebElement RunReportButton;
	
	@FindBy(xpath = "//span[text()=' Generate Complete Report ']")
	WebElement GenerateCompleteReportButton;
	
	@FindBy(xpath = "(//div[text()='Success'])[2]")
	WebElement DisplaySuccess;
	
	//*******************************Custom Reports***************************************************************
	public void FilterReportButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(FilterReportButton));
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", FilterReportButton);
	}
//	public boolean FilterReportButton() {
//		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(FilterReportButton));
//		return FilterReportButton.isDisplayed();
//	}
	public boolean CustomReportOverview() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(CustomReportOverview));
		return CustomReportOverview.isDisplayed();
	}
	
	public void CustomReportDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(CustomReportDropDown));
		CustomReportDropDown.click();
	}
	public void RightClickCustomReport() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25))
		.until(ExpectedConditions.elementToBeClickable(CustomReport));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(CustomReport).click(CustomReport).contextClick(CustomReport).build()
		.perform();
	}
	
	
	public void AccountAttributes() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(AccountAttributes));
		AccountAttributes.click();
	}
	public void AccountID_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(AccountID_DND));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(AccountID_DND).pause(Duration.ofSeconds(0)).clickAndHold(AccountID_DND)
		.pause(Duration.ofSeconds(0))
		.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}
	public void SelectAccountIDOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(SelectAccountID));
		SelectAccountID.click();
	}
	
	
	public void NextStepButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(NextStepButton));
		NextStepButton.click();
	}
	
	public void AccountFields_AccountID_Option() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(AccountFields_AccountID_Option));
		AccountFields_AccountID_Option.click();
	}
	public void AccountFields_AccountNameOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(AccountFields_AccountNameOption));
		AccountFields_AccountNameOption.click();
	}
	public void AccountFields_AnnualRevenueOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(AccountFields_AnnualRevenueOption));
		AccountFields_AnnualRevenueOption.click();
	}
	
	
	public void CRM_LeadFields_LeadID_Option() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(CRM_LeadFields_LeadID_Option));
		CRM_LeadFields_LeadID_Option.click();
	}
	public void CRM_LeadFields_FullName_Option() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(CRM_LeadFields_FullName_Option));
		CRM_LeadFields_FullName_Option.click();
	}
	public void CRM_LeadFields_MobilePhone_Option() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(CRM_LeadFields_MobilePhone_Option));
		CRM_LeadFields_MobilePhone_Option.click();
	}
	
	
	public void CRM_ContactFields_ContactID_Option() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(CRM_ContactFields_ContactID_Option));
		CRM_ContactFields_ContactID_Option.click();
	}
	public void CRM_ContactFields_FullName_Option() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(CRM_ContactFields_FullName_Option));
		CRM_ContactFields_FullName_Option.click();
	}
	public void CRM_ContactFields_MailingCity_Option() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(CRM_ContactFields_MailingCity_Option));
		CRM_ContactFields_MailingCity_Option.click();
	}
	
	
	public void RunReportButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(RunReportButton));
		RunReportButton.click();
	}
	
	public void GenerateCompleteReportButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(GenerateCompleteReportButton));
		GenerateCompleteReportButton.click();
	}
	
	public boolean DisplaySuccess() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplaySuccess));
		return DisplaySuccess.isDisplayed();
	}
	//*******************************Analytics Module***************************************************************
	public void Analytics() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(Analytics));
		Analytics.click();
	}

	public void AnalyticsDataDictionary() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(AnalyticsDataDictionary));
		AnalyticsDataDictionary.click();
	}
	public void AnalyticsAccountListDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(AnalyticsAccountListDropDown));
		AnalyticsAccountListDropDown.click();
	}
	public void RightClickonAnalyticsAccountList() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25))
		.until(ExpectedConditions.elementToBeClickable(AnalyticsAccountList));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(AnalyticsAccountList).click(AnalyticsAccountList).contextClick(AnalyticsAccountList).build()
		.perform();
	}
	public void ClickAgainOnAnalyticsAccountList() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(AnalyticsAccountList));
		AnalyticsAccountList.click();
	}
	
}
