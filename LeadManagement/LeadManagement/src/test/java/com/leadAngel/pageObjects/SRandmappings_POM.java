package com.leadAngel.pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SRandmappings_POM {
	WebDriver ldriver;

	public SRandmappings_POM(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	//************************************* SR and Account Mapping *******************************************
	@FindBy(xpath = "//button[@aria-label='toggle Sales Team']")
	WebElement ClickedOnSalesTeamDropdown;
	
	@FindBy(xpath = "//mat-icon[text()='cloud_download']")
	WebElement ClickedOnDownloadButton;
	@FindBy(xpath = "//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary cdk-focused cdk-mouse-focused']")
	WebElement DisplayedFileIsDownloaded;
	
	
	@FindBy(xpath = "//button[text()='Bulk Transfer ']")
	WebElement ClickedOnBulkTransferButton;
	@FindBy(xpath = "//select[@id='currentSalesRep']")
	WebElement ClickedOnFromCurrentSalesRepDropdown;

	@FindBy(xpath = "(//select[@id='currentSalesRep']//option)[2]")
	WebElement SelectedTheFromCurrentSalesRepFirstOption;
	@FindBy(xpath = "//select[@id='currentSalesRep']//option[text()='All']")
	WebElement SelectedTheFromCurrentSalesRepAllOption;
	@FindBy(xpath = "//div[text()='All Sales Rep Updated']")
	WebElement DisplayedBulkTransferSuccessMessage;
	
	@FindBy(xpath = "//select[@id='newSalesRep']")
	WebElement ClickedOnToSalesRepDropdown;
	@FindBy(xpath = "(//select[@id='newSalesRep']//option)[2]")
	WebElement SelectedTheToSalesRepFirstOption;
	@FindBy(xpath = "//span[text()='Transfer']")
	WebElement ClickedOnTransferButton;
	@FindBy(xpath = "//span[text()='CONFIRM']")
	WebElement ClickedOnConfirmButton;


	@FindBy(xpath = "//button[text()='Bulk Delete ']")
	WebElement ClickedOnBulkDelete;
	@FindBy(xpath = "//select[@id='AccounttypeSales']//option[text()='Net New']")
	WebElement ClickedOnAccountTypeNetNewOption;
	@FindBy(xpath = "//select[@id='AccounttypeSales']//option[text()='CRM']")
	WebElement ClickedOnAccountTypeCRMOption;
	@FindBy(xpath = "//select[@id='AccounttypeSales']//option[text()='All']")
	WebElement ClickedOnAccountTypeAllOption;


	@FindBy(xpath = "(//div[@class='table-container']//mat-icon[text()='edit'])[1]")
	WebElement ClickedOnEditButton;
	@FindBy(xpath = "//mat-select[@name='name']")
	WebElement ClickedOnDropdownForSalesRepName;
	@FindBy(xpath = "(//mat-option[@role='option'])[1]")
	WebElement ClickedOnOptionFromSalesRepNameDropDown;
	@FindBy(xpath = "//span[text()=' Ignore this account from affinity based assignment ']//..//span[@class='mat-checkbox-inner-container']")
	WebElement ClickedOnCheckBoxForIgnoreThisAccountFromAffinityBasedAssignment;
	@FindBy(xpath = "(//span[text()=' Ignore this account from affinity based assignment ']//..)[1]//input[@aria-checked='true']")
	WebElement DisplayedIgnoreThisAccountFromAffinityBasedAssignmentCheckBoxIsChecked;
	@FindBy(xpath = "(//span[text()=' Ignore this account from affinity based assignment ']//..)[1]//input[@aria-checked='false']")
	WebElement DisplayedIgnoreThisAccountFromAffinityBasedAssignmentCheckBoxIsUnChecked;
	@FindBy(xpath = "//span[text()='Save']")
	WebElement ClickedOnSaveButton;
	
	@FindBy(xpath = "//div[text()='Sales Rep Updated']")
	WebElement DisplayedUpdateSuccessMessage;



	@FindBy(xpath = "(//div[@class='table-container']//mat-icon[text()='delete'])[1]")
	WebElement ClickedOnDeleteIcon;
	@FindBy(xpath = "//span[text()='Delete']")
	WebElement ClickedOnDeleteButton;
	@FindBy(xpath = "//div[text()='Account Salesrep mapping Deleted']")
	WebElement DisplayedDeleteSuccessMessage;
	@FindBy(xpath = "//div[text()='All Sales Rep Mapping Deleted']")
	WebElement DisplayedBulkDeleteSuccessMessage;
	
	@FindBy(xpath = "(//td[contains(@class,'mat-column-AccountName')])[1]//span[text()]")
	WebElement FetchedTextFromAccountName;
	@FindBy(xpath = "//mat-icon[text()='clear']")
	WebElement ClearedFilterBox;
	
	
	
	@FindBy(xpath = "//mat-icon[text()='warning']")
	WebElement DisplayedNoRecordFound;
	
	@FindBy(xpath = "//div[text()='Record Not Found']")
	WebElement DisplayedRecordNotFound;
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void ClearedFilterBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClearedFilterBox));
		ClearedFilterBox.click();
	}
	
	public boolean DisplayedRecordNotFound() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.visibilityOf(DisplayedRecordNotFound));
		return DisplayedRecordNotFound.isDisplayed();
	}
	
	public void ClickedOnSalesTeamDropdown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickedOnSalesTeamDropdown));
		ClickedOnSalesTeamDropdown.click();
	}
	
	public void ClickedOnDownloadButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickedOnDownloadButton));
		ClickedOnDownloadButton.click();
	}
	public boolean DisplayedFileIsDownloaded() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.visibilityOf(DisplayedFileIsDownloaded));
		return DisplayedFileIsDownloaded.isDisplayed();
	}
	
	
	public void ClickedOnBulkTransferButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickedOnBulkTransferButton));
		ClickedOnBulkTransferButton.click();
	}
	public void ClickedOnFromCurrentSalesRepDropdown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickedOnFromCurrentSalesRepDropdown));
		ClickedOnFromCurrentSalesRepDropdown.click();
	}
	
	public void SelectedTheFromCurrentSalesRepFirstOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(SelectedTheFromCurrentSalesRepFirstOption));
		SelectedTheFromCurrentSalesRepFirstOption.click();
	}
	public void SelectedTheFromCurrentSalesRepAllOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(SelectedTheFromCurrentSalesRepAllOption));
		SelectedTheFromCurrentSalesRepAllOption.click();
	}
	public boolean DisplayedBulkTransferSuccessMessage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.visibilityOf(DisplayedBulkTransferSuccessMessage));
		return DisplayedBulkTransferSuccessMessage.isDisplayed();
	}
	
	
	public void ClickedOnToSalesRepDropdown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickedOnToSalesRepDropdown));
		ClickedOnToSalesRepDropdown.click();
	}
	public void SelectedTheToSalesRepFirstOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(SelectedTheToSalesRepFirstOption));
		SelectedTheToSalesRepFirstOption.click();
	}
	public void ClickedOnTransferButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickedOnTransferButton));
		ClickedOnTransferButton.click();
	}
	public void ClickedOnConfirmButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickedOnConfirmButton));
		ClickedOnConfirmButton.click();
	}
	
	
	public void ClickedOnBulkDelete() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickedOnBulkDelete));
		ClickedOnBulkDelete.click();
	}
	public void ClickedOnAccountTypeNetNewOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickedOnAccountTypeNetNewOption));
		ClickedOnAccountTypeNetNewOption.click();
	}
	public void ClickedOnAccountTypeCRMOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickedOnAccountTypeCRMOption));
		ClickedOnAccountTypeCRMOption.click();
	}
	public void ClickedOnAccountTypeAllOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickedOnAccountTypeAllOption));
		ClickedOnAccountTypeAllOption.click();
	}
	
	
	public void ClickedOnEditButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickedOnEditButton));
		ClickedOnEditButton.click();
	}
	public void ClickedOnDropdownForSalesRepName() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickedOnDropdownForSalesRepName));
		ClickedOnDropdownForSalesRepName.click();
	}
	public void ClickedOnOptionFromSalesRepNameDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickedOnOptionFromSalesRepNameDropDown));
		ClickedOnOptionFromSalesRepNameDropDown.click();
	}
	public void ClickedOnCheckBoxForIgnoreThisAccountFromAffinityBasedAssignment() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickedOnCheckBoxForIgnoreThisAccountFromAffinityBasedAssignment));
		ClickedOnCheckBoxForIgnoreThisAccountFromAffinityBasedAssignment.click();
	}
	public boolean DisplayedIgnoreThisAccountFromAffinityBasedAssignmentCheckBoxIsChecked() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(DisplayedIgnoreThisAccountFromAffinityBasedAssignmentCheckBoxIsChecked));
			return DisplayedIgnoreThisAccountFromAffinityBasedAssignmentCheckBoxIsChecked.isDisplayed();
		} catch (Exception e) {
		return false;
		}
	}
	public boolean DisplayedIgnoreThisAccountFromAffinityBasedAssignmentCheckBoxIsUnChecked() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(DisplayedIgnoreThisAccountFromAffinityBasedAssignmentCheckBoxIsUnChecked));
			return DisplayedIgnoreThisAccountFromAffinityBasedAssignmentCheckBoxIsUnChecked.isDisplayed();
		} catch (Exception e) {
		return false;
		}
	}
public void ClickedOnSaveButton() {
	new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickedOnSaveButton));
	ClickedOnSaveButton.click();
}
	
	
	public boolean DisplayedUpdateSuccessMessage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(DisplayedUpdateSuccessMessage));
		return DisplayedUpdateSuccessMessage.isDisplayed();
	}
	
	
	
	public void ClickedOnDeleteIcon() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickedOnDeleteIcon));
		ClickedOnDeleteIcon.click();
	}
	public void ClickedOnDeleteButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickedOnDeleteButton));
		ClickedOnDeleteButton.click();
	}
	public boolean DisplayedDeleteSuccessMessage() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(DisplayedDeleteSuccessMessage));
			return DisplayedDeleteSuccessMessage.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	public boolean DisplayedBulkDeleteSuccessMessage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(DisplayedBulkDeleteSuccessMessage));
		return DisplayedBulkDeleteSuccessMessage.isDisplayed();
	}
	
	
	public String FetchedtheAccountNameTextFromConsole() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.visibilityOf(FetchedTextFromAccountName));
		return FetchedTextFromAccountName.getText();
	}
	
	
	public boolean DisplayedNoRecordFound() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(DisplayedNoRecordFound));
			return DisplayedNoRecordFound.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	
	//************************************* SR and Group Mapping *******************************************

	
	@FindBy(xpath = "//span[text()='SR and Group Mapping ']")
	WebElement ClickedOnSRandGroupMapping;
	
	@FindBy(xpath = "(//td[contains(@class,'mat-column-SalesRepName')])[1]//span[text()]")
	WebElement FetchedTextFromSalesRepName;
	
	
	
	
	
	
	
	
	
	
	
	
	public void ClickedOnSRandGroupMapping() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickedOnSRandGroupMapping));
		ClickedOnSRandGroupMapping.click();
	}
	
	public String FetchedTextFromSalesRepName() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.visibilityOf(FetchedTextFromSalesRepName));
		return FetchedTextFromSalesRepName.getText();
	}
	

}
