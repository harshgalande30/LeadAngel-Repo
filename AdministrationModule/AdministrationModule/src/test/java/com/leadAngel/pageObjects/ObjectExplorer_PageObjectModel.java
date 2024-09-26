package com.leadAngel.pageObjects;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ObjectExplorer_PageObjectModel {
	WebDriver ldriver;

	public ObjectExplorer_PageObjectModel(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath = "//span[text()='Object Explorer ']")
	WebElement ClickOnObjectExplorer;
	
	

	@FindBy(xpath = "//input[@placeholder='CRM ID...']")
	WebElement EnterCRMID;
	@FindBy(xpath = "//input[@placeholder='Owner ID...']")
	WebElement EnterOwnerID;
	@FindBy(xpath = "//input[@placeholder='User ID...']")
	WebElement EnterUserID;
	
	@FindBy(xpath = "//button[@mattooltip='Search']")
	WebElement ClickOnSearchButton;
	
	@FindBy(xpath = "//i-tabler[@name='adjustments-horizontal']")
	WebElement ClickOnAdjustmentsButton;
	
	@FindBy(xpath = "//i-tabler[@name='plus']")
	WebElement ClickOnPlusIcon;
	
	@FindBy(xpath = "//input[@name='viewfiltername']")
	WebElement EnterName;
	@FindBy(xpath = "(//label[text()='Hidden Rows']//..//li)[1]")
	WebElement ClickOnHiddenRowOption;
	@FindBy(xpath = "(//label[text()='Hidden Columns']//..//li)[1]")
	WebElement ClickOnHiddenColumnOption;
	@FindBy(xpath = "(//label[text()='Hidden Rows']//..//li[text()])[1]")
	WebElement GetTextHiddenRowOption;
	@FindBy(xpath = "(//label[text()='Hidden Columns']//..//li[text()])[1]")
	WebElement GetTextHiddenColumnOption;
	@FindBy(xpath = "//input[@name='search']//..//i-tabler[@name='x']")
	WebElement ClickOnCloseIconFromHiddenRowSearchBox;
	
	@FindBy(xpath = "//span[text()=' Save ']")
	WebElement ClickOnSaveButton;
	@FindBy(xpath = "//span[text()=' Update ']")
	WebElement ClickOnUpdateButton;
	
	
	@FindBy(xpath = "//div[text()='Please select object and enter ID.']")
	WebElement DisplayedPleaseSelectObjectAndEnterIDErrorMessage;
	@FindBy(xpath = "//h6[contains(text(),'//h6[contains(text(),'No records found')]')]")
	WebElement DisplayedNoRecordsFound;
	
	@FindBy(xpath = "//h4//..//..//div[text()='Automation']")
	WebElement DisplayedAutomationObject;
	@FindBy(xpath = "//h4//..//..//div[text()='Automation']//..//i-tabler[@name='trash']")
	WebElement ClickOnDeleteButton;
	
	
	
	
	
	@FindBy(xpath = "//span[text()='Delete']")
	WebElement ClickAgainDeleteButton;
	
	@FindBy(xpath = "//button[@aria-label='toggle Maintenance']")
	WebElement ClickOnMaintenanceDropdown;
	
	@FindBy(xpath = "//i-tabler[@name='chevron-down']")
	WebElement ClickOnChevronDropdown;
	@FindBy(xpath = "//button[@role='menuitem'][text()=' Lead ']")
	WebElement ClickOnLeadOption;

	@FindBy(xpath = "//button[@aria-label='toggle Analytics']")
	WebElement ClickOnAnalyticsDropdown;
	
	@FindBy(xpath = "//span[text()='Lead Summary Report ']")
	WebElement ClickOnLeadSummaryReport;
	
	
	@FindBy(xpath = "(//button[text()=' VIEW DETAIL REPORT '])[1]")
	WebElement ClickOnViewDetailReportButton;
	
	@FindBy(xpath = "(//mat-icon[text()='visibility'])[1]")
	WebElement ClickOnvisibilityIcon;
	
	@FindBy(xpath = "//span[text()='Close']")
	WebElement ClickOnCloseButton;
	
	@FindBy(xpath = "//div[@class='popupTitle']//..//mat-icon[text()='clear']")
	WebElement ClickOnClearIcon;
	
	@FindBy(xpath = "//span[@class='featureTitle']")
	WebElement ClickOnLeftTreeMenueTitle;
	
	@FindBy(xpath = "//button[text()=' Administration']")
	WebElement ClickOnAdministration;
	
	@FindBy(xpath = "(//div[text()='LeadAngel Data']//..//..//th[text()])[1]")
	WebElement DisplyedLeadangelData;

	
	@FindBy(xpath = "//i-tabler[@name='cloud-download']")
	WebElement ClickDownloadButton;
	
	@FindBy(xpath = "//button[contains(@class,'cdk-focused cdk-mouse-focused')]")
	WebElement DisplayedDownloaded;
	
	@FindBy(xpath = "//div[@class='d-flex align-items-center select-obj-cont']//button[@mattooltip='Search']")
	WebElement ClickOnSearchButtonCRMID;
	@FindBy(xpath = "//div[@class='d-flex align-items-center select-obj-cont']//i-tabler[@name='x']")
	WebElement ClickOnCloseButtonCRMID;
	@FindBy(xpath = "//div[@class='d-flex align-items-center']//i-tabler[@name='x']")
	WebElement ClickOnClearIconFromOpjectExplorerSearchBox;
	
	@FindBy(xpath = "//i-tabler[@name='maximize']")
	WebElement ClickOnMaximize;
	
	@FindBy(xpath = "//i-tabler[@name='minimize']")
	WebElement ClickOnminimize;
	
	@FindBy(xpath = "//span[text()='Contact Routing Report ']")
	WebElement ClickOnContactRoutingReport;
	
	@FindBy(xpath = "//input[@placeholder='Enter Name Here']")
	public WebElement EnterViewName;
	
	@FindBy(xpath = "//mat-select[@panelclass='column-option']")
	WebElement ClickOnDefaultViewDropdown;
	
	
	@FindBy(xpath = "//button[@mattooltip='Add']")
	WebElement ClickOnAddNewView;
	
	@FindBy(xpath = "//label[text()='Hidden Columns']//..//div[text()=' Owner ID ']")
	WebElement SelectHiddenColumnOwnerIdOption;
	
	@FindBy(xpath = "//span[text()='Save']")
	WebElement ClickOnSaveButtonForDefaultView;
	
	@FindBy(xpath = "(//div[text()='View Added Successfully.'])[2]")
	WebElement DisplayedViewAddedSuccessuflly;
	
	@FindBy(xpath = "(//button[text()=' Contact '])[2]")
	WebElement ClickOnActivityContactOption;
	
	@FindBy(xpath = "//h4//..//..//div[text()='Automation']//..//i-tabler[@name='edit']")
	WebElement ClickOnEditButton;
	
	
	
	
	
	public void ClickOnEditButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnEditButton));
		ClickOnEditButton.click();
	}
	
	public void ClickOnActivityContactOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnActivityContactOption));
		ClickOnActivityContactOption.click();
	}

	public boolean DisplayedViewAddedSuccessuflly() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedViewAddedSuccessuflly));
		return DisplayedViewAddedSuccessuflly.isDisplayed();
	}
	
	
	public void ClickOnSaveButtonForDefaultView() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSaveButtonForDefaultView));
		ClickOnSaveButtonForDefaultView.click();
	}
	
	public void SelectHiddenColumnOwnerIdOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(SelectHiddenColumnOwnerIdOption));
		SelectHiddenColumnOwnerIdOption.click();
	}
	
	
	public void ClickOnAddNewView() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAddNewView));
		ClickOnAddNewView.click();
	}
	
	public void ClickOnDefaultViewDropdown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDefaultViewDropdown));
		ClickOnDefaultViewDropdown.click();
	}
	
	public void ClickOnContactRoutingReport() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ClickOnContactRoutingReport));
		ClickOnContactRoutingReport.click();
	}
	
	
	public void ClickOnMaximize() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnMaximize));
		ClickOnMaximize.click();
	}
	
	public void ClickOnminimize() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnminimize));
		ClickOnminimize.click();
	}
	public void ClickOnCloseButtonCRMID() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCloseButtonCRMID));
		ClickOnCloseButtonCRMID.click();
	}
	public void ClickOnSearchButtonCRMID() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSearchButtonCRMID));
		ClickOnSearchButtonCRMID.click();
	}
	
	public void ClickDownloadButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickDownloadButton));
		ClickDownloadButton.click();
	}

	public boolean DisplayedDownloaded() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.visibilityOf(DisplayedDownloaded));
		return DisplayedDownloaded.isDisplayed();
	}
	
	
	public boolean DisplyedLeadangelData() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.visibilityOf(DisplyedLeadangelData));
			return DisplyedLeadangelData.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	
	public void ClickOnAdministration() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAdministration));
		ClickOnAdministration.click();
	}
	
	public void ClickOnLeftTreeMenueTitle() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnLeftTreeMenueTitle));
		ClickOnLeftTreeMenueTitle.click();
	}
	
	public void ClickOnClearIcon() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnClearIcon));
		ClickOnClearIcon.click();
	}
	public void ClickOnCloseButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCloseButton));
		ClickOnCloseButton.click();
	}
	
	
	public void ClickOnvisibilityIcon() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnvisibilityIcon));
		ClickOnvisibilityIcon.click();
	}
	
	public void ClickOnViewDetailReportButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ClickOnViewDetailReportButton));
		ClickOnViewDetailReportButton.click();
	}
	
	public void ClickOnLeadSummaryReport() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnLeadSummaryReport));
		ClickOnLeadSummaryReport.click();
	}
	
	public void ClickOnAnalyticsDropdown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ClickOnAnalyticsDropdown));
		ClickOnAnalyticsDropdown.click();
	}
	
	public void ClickOnLeadOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickOnLeadOption));
		ClickOnLeadOption.click();
	}
	
	
	public void ClickOnChevronDropdown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickOnChevronDropdown));
		ClickOnChevronDropdown.click();
	}
	
	public void ClickAgainDeleteButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickAgainDeleteButton));
		ClickAgainDeleteButton.click();
	}
	
	public void ClickOnDeleteButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickOnDeleteButton));
		ClickOnDeleteButton.click();
	}
	
	public void ClickOnMaintenanceDropdown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickOnMaintenanceDropdown));
		ClickOnMaintenanceDropdown.click();
	}
	
	public void ClickOnObjectExplorer() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickOnObjectExplorer));
		ClickOnObjectExplorer.click();
	}
	
	public void ClickOnSearchButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickOnSearchButton));
		ClickOnSearchButton.click();
	}
	
	public void ClickOnAdjustmentsButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickOnAdjustmentsButton));
		ClickOnAdjustmentsButton.click();
	}
	
	
	public void ClickOnPlusIcon() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickOnPlusIcon));
		ClickOnPlusIcon.click();
	}
	
	public void ClickOnHiddenRowOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickOnHiddenRowOption));
		ClickOnHiddenRowOption.click();
	}
	public void ClickOnHiddenColumnOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickOnHiddenColumnOption));
		ClickOnHiddenColumnOption.click();
	}
	public void EnterName() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(EnterName));
		EnterName.sendKeys("Automation");
	}
	
	public String GetTextHiddenRowOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.visibilityOf(GetTextHiddenRowOption));
		return GetTextHiddenRowOption.getText();
	}
	
	public String GetTextHiddenColumnOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.visibilityOf(GetTextHiddenColumnOption));
		return GetTextHiddenColumnOption.getText();
	}
	public void ClickOnSaveButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickOnSaveButton));
		ClickOnSaveButton.click();
	}
	
	
	
	public void ClickOnClearIconFromOpjectExplorerSearchBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickOnClearIconFromOpjectExplorerSearchBox));
		ClickOnClearIconFromOpjectExplorerSearchBox.click();
	}
	public void ClickOnCloseIconFromHiddenRowSearchBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickOnCloseIconFromHiddenRowSearchBox));
		ClickOnCloseIconFromHiddenRowSearchBox.click();
	}
	
	public void ClickOnUpdateButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickOnUpdateButton));
		ClickOnUpdateButton.click();
	}
	
	public boolean DisplayedPleaseSelectObjectAndEnterIDErrorMessage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.visibilityOf(DisplayedPleaseSelectObjectAndEnterIDErrorMessage));
		return DisplayedPleaseSelectObjectAndEnterIDErrorMessage.isDisplayed();
	}
	
	public boolean DisplayedNoRecordsFound() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.visibilityOf(DisplayedNoRecordsFound));
		return DisplayedNoRecordsFound.isDisplayed();
	}
	
	public boolean DisplayedAutomationObject() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.visibilityOf(DisplayedAutomationObject));
			return DisplayedAutomationObject.isDisplayed();
		} catch (Exception e) {
		return false;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
