package com.leadAngel.pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Forms_PageObjectModel {
	WebDriver ldriver;

	public Forms_PageObjectModel(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}
	
		@FindBy (xpath = "//button[@aria-label='toggle Web to Lead']")
		WebElement WebToLeadDropdown;
		@FindBy (xpath = "//button[@aria-label='toggle Forms']")
		WebElement FormsDropdown;
		@FindBy (xpath = "//span[text()='Forms ']")
		WebElement Forms;
		
		@FindBy (xpath = "(//li[@class='ng-star-inserted'])[1]")
		WebElement SelectLeadIDOption;
		@FindBy (xpath = "(//li[@class='ng-star-inserted'])[5]")
		WebElement SelectFullNameOption;
		@FindBy (xpath = "//button[@mattooltip='Add Fields']")
		WebElement ClickOnAddFields;
		
		@FindBy (xpath = "(//span[@class='mat-checkbox-inner-container'])[1]")
		WebElement ClickOnCheckBoxOfIncludeAvailableDate;
		@FindBy (xpath = "(//span[@class='mat-checkbox-inner-container'])[2]")
		WebElement ClickOnCheckBoxOfAssignmentRollBack;
		@FindBy (xpath = "(//option[@class='ng-star-inserted'])[4]")
		WebElement SelectSetRollBackTime;
		
		@FindBy (xpath = "(//span[@class='mat-checkbox-inner-container'])[3]")
		WebElement ClickOnCheckBoxOfAcceptAllDomains;
		@FindBy (xpath = "(//span[@class='mat-checkbox-inner-container'])[4]")
		WebElement ClickOnCheckBoxOfUploadToCRM;
		@FindBy (xpath = "(//span[@class='mat-checkbox-inner-container'])[5]")
		WebElement ClickOnCheckBoxOfIncludeReCaptcha;
		@FindBy (xpath = "(//span[@class='ng-arrow-wrapper'])[2]")
		WebElement ClickOnIncludeReCaptchaDropDown;
		@FindBy (xpath = "(//div[@role='option'])[1]")
		WebElement SelectOptionIncludeReCaptcha;
		
	
		@FindBy (xpath = "//span[text()='Generate ']")
		WebElement ClickOnGenerateButton;
		@FindBy (xpath = "//button[@mattooltip='Click to Copy Form']")
		WebElement ClickOnCopyButton;
		
		
		//****************************************************************************************************
	
		public void ClickOnWebToLeadDropdown() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(WebToLeadDropdown));
			WebToLeadDropdown.click();
		}
		public void ClickOnFormsDropdown() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(FormsDropdown));
			FormsDropdown.click();
		}
		public void ClickAgainOnForms() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(Forms));
			Forms.click();
		}
		public void ContextClickOnForms() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(Forms));
	        Actions actions = new Actions(ldriver);
			actions.moveToElement(Forms).click(Forms).contextClick(Forms).build().perform();
		}
		
		
		public void ClickOnSelectLeadIDOption() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(SelectLeadIDOption));
			SelectLeadIDOption.click();
		}
		public void ClickOnSelectFullNameOption() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(SelectFullNameOption));
			SelectFullNameOption.click();
		}
		public void ClickOnClickOnAddFields() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnAddFields));
			ClickOnAddFields.click();
		}
		
		
		public void ClickOnCheckBoxOfIncludeAvailableDate() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnCheckBoxOfIncludeAvailableDate));
			ClickOnCheckBoxOfIncludeAvailableDate.click();
		}
		public void ClickOnCheckBoxOfAssignmentRollBack() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnCheckBoxOfAssignmentRollBack));
			ClickOnCheckBoxOfAssignmentRollBack.click();
		}
		public void SelectSetRollBackTime() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(SelectSetRollBackTime));
			SelectSetRollBackTime.click();
		}
		
		
		public void ClickOnCheckBoxOfAcceptAllDomains() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnCheckBoxOfAcceptAllDomains));
			ClickOnCheckBoxOfAcceptAllDomains.click();
		}
		public void ClickOnCheckBoxOfUploadToCRM() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnCheckBoxOfUploadToCRM));
			ClickOnCheckBoxOfUploadToCRM.click();
		}
		public void ClickOnCheckBoxOfIncludeReCaptcha() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnCheckBoxOfIncludeReCaptcha));
			ClickOnCheckBoxOfIncludeReCaptcha.click();
		}
		public void ClickOnIncludeReCaptchaDropDown() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnIncludeReCaptchaDropDown));
			ClickOnIncludeReCaptchaDropDown.click();
		}
		public void SelectOptionIncludeReCaptcha() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(SelectOptionIncludeReCaptcha));
			SelectOptionIncludeReCaptcha.click();
		}
		
		
		
		public void ClickOnGenerateButton() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnGenerateButton));
			ClickOnGenerateButton.click();
		}
		public void ClickOnCopyButton() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnCopyButton));
			ClickOnCopyButton.click();
		}
		
}
