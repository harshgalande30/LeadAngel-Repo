package com.leadAngel.pageObjects;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
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
		
	
		@FindBy (xpath = "//span[text()=' Generate Code ']")
		WebElement ClickOnGenerateButton;
		@FindBy (xpath = "//span[text()='Copy']")
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
			actions.moveToElement(Forms).contextClick(Forms).build().perform();
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
		
		//********************************************************************************************************************************************
		
		// Generate a random string----->
		public int length = 10;
		String randomString = generateRandomString(length);
		public static String generateRandomString(int length) {
			String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
			StringBuilder sb = new StringBuilder();

			Random random = new Random();
			for (int i = 0; i < length; i++) {
				int index = random.nextInt(characters.length());
				sb.append(characters.charAt(index));
			}

			return sb.toString();
		}
		
		@FindBy (xpath = "//li[text()=' Detail ']")
		WebElement ClickOnDetailButton;
		
		@FindBy (xpath = "(//i-tabler[@name='pencil'])[1]")
		WebElement ClickOnEditButtonForID;
		
		@FindBy (xpath = "//input[@id='menuname']")
		WebElement EditRenameID;
		
		@FindBy (xpath = "//span[text()=' Rename ']")
		WebElement ClickOnRenameButton;
		
		@FindBy (xpath = "//span[@class='ng-star-inserted']")
		WebElement ClickOnEditButtonForDescription;
		
		@FindBy (xpath = "//textarea[@id='menudesc']")
		WebElement EditDescription;
		
		@FindBy (xpath = "//span[text()=' Save ']")
		WebElement ClickkOnSaveButtonForDescription;
		
		@FindBy (xpath = "//li[text()=' Setup ']")
		WebElement ClickOnSetUpButton;
		
		@FindBy (xpath = "//ng-select[@bindlabel='SubMenuName']")
		WebElement ClickOnLeadRouterDropDown;
		
		@FindBy (xpath = "//input[@formcontrolname='DefaultCalendarLink']")
		WebElement EnterDefaultCalenderURL;
		
		@FindBy (xpath = "//input[@formcontrolname='callbackUrl']")
		WebElement EnterThankYouPageURL;
		
		@FindBy (xpath = "(//span[text()='Upload to CRM ']//..)[1]//input[@aria-checked='true']")
		WebElement DisplayedUploadToCRMCheckboxIsChecked;
		@FindBy (xpath = "//span[text()='Upload to CRM ']//..//input[@type='checkbox']")
		WebElement ClickOnCheckBoxForUploadToCRM;
		
		@FindBy (xpath = "(//span[text()='Accept all domains ']//..)[1]")
		WebElement ClickOnCheckBoxForAcceptAllDomains;
		@FindBy (xpath = "(//span[text()='Accept all domains ']//..)[1]//input[@aria-checked='true']")
		WebElement DisplayedAlwaysAcceptAllDomainsCheckboxIsChecked;
		
		
		@FindBy (xpath = "(//span[text()='Always redirect to Thank You Page.']//..)[1]")
		WebElement ClickOnCheckBoxForAlwaysRedirectToThankYouPage;
		@FindBy (xpath = "//span[text()='Always redirect to Thank You Page.']//..//input[@tabindex='0']")
		WebElement DisplayedAlwaysRedirectToThankYouPageRadioButtonIsClicked;
		
		
		@FindBy (xpath = "(//span[text()='Use the Calendar Link on CRM Users Profile if available.']//..)[1]")
		WebElement ClickOnCheckBoxForUseTheCalendarLinkOnCRMUsersProfileIfAvailable;
		
		@FindBy (xpath = "//ng-select[@placeholder=' Select CRM Field ']")
		WebElement ClickOnDropDownForSelectCRmField;
		
		@FindBy (xpath = "(//div[@class='ng-option ng-star-inserted'])[2]")
		WebElement ClickOnOptionForSelectCRmField;
		
		@FindBy (xpath = "//span[text()='Save']")
		WebElement ClickOnSaveButtonForSetUpPage;
		
		@FindBy (xpath = "//div[text()='Updated Successfully']")
		WebElement VerifyDisplayScuccessMessage;
		
		@FindBy (xpath = "//li[text()=' Web To Lead Form ']")
		WebElement ClickOnWebToLeadFormButton;
		
		@FindBy (xpath = "(//li[@class='ng-star-inserted'])[2]")
		WebElement SelectFieldnameOption1;
		@FindBy (xpath = "(//li[@class='ng-star-inserted'])[5]")
		WebElement SelectFieldnameOption2;
		@FindBy (xpath = "(//li[@class='ng-star-inserted'])[29]")
		WebElement SelectFieldnameOption3;
		
		@FindBy (xpath = "//button[@mattooltip='Add Fields']")
		WebElement ClickOnArrowButton;
		
		@FindBy (xpath = "(//span[text()='Include Available Date/Time ']//..)[1]")
		WebElement ClickOnCheckBoxIncludeAvailableDate;
		@FindBy (xpath = "(//span[text()='Include Available Date/Time ']//..)[1]//input[@aria-checked='true']")
		WebElement DisplayedIncludeAvailableDateTimeCheckboxIsChecked;
		
		@FindBy (xpath = "(//span[text()='Assignment Rollback ']//..)[1]")
		WebElement ClickOnCheckBoxAssignmentRollback;
		@FindBy (xpath = "(//option[@class='ng-star-inserted'])[4]")
		WebElement SelectRollbackTime;
		
		@FindBy (xpath = "(//span[text()=' Include re-Captcha ']//..)[1]")
		WebElement ClickOnCheckBoxIncludeReCaptcha;
		
		@FindBy (xpath = "//ng-select[@bindlabel='RecaptchaKeyName']")
		WebElement ClickOnDropDownReCaptcha;
		
		@FindBy (xpath = "(//div[@role='option'])[2]")
		WebElement SelectReacaptchaOption;
		
		@FindBy(xpath="(//div[(text()='Code Copied Successfully')])[2]")
		WebElement DislayCodeCopiedSuccessfullyMessage;
		@FindBy(xpath="//span[(text()='Close')]")
		WebElement ClickOnCloseButton; 	
		
		@FindBy(xpath = "//h4[text()='Forms Overview']")
		WebElement DisplayFormsOverViewPage;
		@FindBy(xpath = "Auto Conversion Overview")
		WebElement DisplayAutoConversionOverviewPage;
		
		@FindBy(xpath = "//button[@aria-label='toggle Forms']")
		WebElement FormsDropDown;
		
		@FindBy(xpath = "//div[text()='Last Updated']//..//div[@class='mat-line'][text()]")
		WebElement GettextLastUpdated;
		
		@FindBy(xpath = "//div[text()='Last Updated By']//..//div[@class='mat-line'][text()]")
		WebElement GettextLastUpdatedBy;
		
		@FindBy (xpath = "//a[text()='Add More re-Captcha Key Name']")
		WebElement ClickOnAddMoreReccaptchaKeyNameLink;
		@FindBy (xpath = "//input[@name='RecaptchaKeyName']")
		public WebElement EnterRecaptchaKeyName;
		@FindBy (xpath = "//input[@name='SiteKey']")
		WebElement EnterSiteKey;
		@FindBy (xpath = "//input[@name='SecurityKey']")
		WebElement EnterSecurityKey;
		@FindBy (xpath = "//button//span[text()='ADD']")
		WebElement ClickOnAddbutton;
		@FindBy (xpath = "//div[text()='Inserted Successfully']")
		WebElement DisplayedNewRecaptchaIncertedSuccessfullyMessage;
		
		
		
		public boolean DisplayedNewRecaptchaIncertedSuccessfullyMessage() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedNewRecaptchaIncertedSuccessfullyMessage));
			return DisplayedNewRecaptchaIncertedSuccessfullyMessage.isDisplayed();
		}
		public void ClickOnAddbutton() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnAddbutton));
			ClickOnAddbutton.click();
		}
		
		public void EnterSecurityKey() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(EnterSecurityKey));
			EnterSecurityKey.sendKeys("Tech1002");
		}
		public void EnterSiteKey() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(EnterSiteKey));
			EnterSiteKey.sendKeys("Tech4Lead");
		}
	
		
		public void ClickOnAddMoreReccaptchaKeyNameLink() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnAddMoreReccaptchaKeyNameLink));
			ClickOnAddMoreReccaptchaKeyNameLink.click();
		}
		
		public String GettextLastUpdatedBy(){
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(GettextLastUpdatedBy));
			return GettextLastUpdatedBy.getText();
		}
		public String GettextLastUpdated(){
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(GettextLastUpdated));
			return GettextLastUpdated.getText();
		}
		public void ClickOnFormsDropDown() {
			new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(FormsDropDown));
			FormsDropDown.click();
		}
		public boolean DisplayFormsOverViewPage() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayFormsOverViewPage));
			return DisplayFormsOverViewPage.isDisplayed();
		}
		public boolean DisplayAutoConversionOverviewPage() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayAutoConversionOverviewPage));
			return DisplayAutoConversionOverviewPage.isDisplayed();
		}
		
		public void ClickOnCloseButton() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnCloseButton));
			ClickOnCloseButton.click();
		}
		public void DislayCodeCopiedSuccessfullyMessage() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(DislayCodeCopiedSuccessfullyMessage));
			DislayCodeCopiedSuccessfullyMessage.click();
		}
		public void SelectReacaptchaOption() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(SelectReacaptchaOption));
			SelectReacaptchaOption.click();
		}
		public void ClickOnDropDownReCaptcha() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnDropDownReCaptcha));
			ClickOnDropDownReCaptcha.click();
		}
		public void ClickOnCheckBoxIncludeReCaptcha() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnCheckBoxIncludeReCaptcha));
			ClickOnCheckBoxIncludeReCaptcha.click();
		}
		
		
		
		
		public void SelectRollbackTime() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(SelectRollbackTime));
			SelectRollbackTime.click();
		}
		public void ClickOnCheckBoxAssignmentRollback() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnCheckBoxAssignmentRollback));
			ClickOnCheckBoxAssignmentRollback.click();
		}
		public void ClickOnCheckBoxIncludeAvailableDate() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnCheckBoxIncludeAvailableDate));
			ClickOnCheckBoxIncludeAvailableDate.click();
		}
		public boolean DisplayedIncludeAvailableDateTimeCheckboxIsChecked() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedIncludeAvailableDateTimeCheckboxIsChecked));
		    return	DisplayedIncludeAvailableDateTimeCheckboxIsChecked.isDisplayed();
		}
		public void ClickOnArrowButton() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnArrowButton));
			ClickOnArrowButton.click();
		}
		public void SelectFieldnameOption3() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(SelectFieldnameOption3));
			SelectFieldnameOption3.click();
		}
		public void SelectFieldnameOption2() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(SelectFieldnameOption2));
			SelectFieldnameOption2.click();
		}
		public void SelectFieldnameOption1() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(SelectFieldnameOption1));
			SelectFieldnameOption1.click();
		}
		public void ClickOnDetailButton() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnDetailButton));
			ClickOnDetailButton.click();
		}
		public void ClickOnEditButtonForID() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnEditButtonForID));
			ClickOnEditButtonForID.click();
		}
		public void EditRenameID() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(EditRenameID));
			EditRenameID.clear();
			EditRenameID.sendKeys("AutomationTest");
		}
		public void ClickOnRenameButton() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnRenameButton));
			ClickOnRenameButton.click();
		}
		public void ClickOnEditButtonForDescription() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnEditButtonForDescription));
			ClickOnEditButtonForDescription.click();
		}
		public void EditDescription() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(EditDescription));
			EditDescription.clear();
			EditDescription.sendKeys("AutomationTesting is going on...");
		}
		public void ClickkOnSaveButtonForDescription() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickkOnSaveButtonForDescription));
			ClickkOnSaveButtonForDescription.click();
		}
		public void ClickOnSetUpButton() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnSetUpButton));
			ClickOnSetUpButton.click();
		}
		public void EnterDefaultCalenderURL() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(EnterDefaultCalenderURL));
			EnterDefaultCalenderURL.clear();
			EnterDefaultCalenderURL.sendKeys("https://example.com");
		}
		public void EnterThankYouPageURL() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(EnterThankYouPageURL));
			EnterThankYouPageURL.clear();
			EnterThankYouPageURL.sendKeys("https://example.com");
		}
		
		
		
		public boolean DisplayedAlwaysAcceptAllDomainsCheckboxIsChecked() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedAlwaysAcceptAllDomainsCheckboxIsChecked));
		    return	DisplayedAlwaysAcceptAllDomainsCheckboxIsChecked.isDisplayed();
		}
//		public void ClickOnCheckBoxForUploadToCRM() {
//			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnCheckBoxForUploadToCRM));
//			ClickOnCheckBoxForUploadToCRM.click();
//		}
		public void ClickOnCheckBoxForUploadToCRM() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCheckBoxForUploadToCRM));
			JavascriptExecutor js = (JavascriptExecutor) ldriver;
			js.executeScript("arguments[0].click()", ClickOnCheckBoxForUploadToCRM);
		}
		
		public boolean DisplayedAlwaysRedirectToThankYouPageRadioButtonIsClicked() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedAlwaysRedirectToThankYouPageRadioButtonIsClicked));
		    return	DisplayedAlwaysRedirectToThankYouPageRadioButtonIsClicked.isDisplayed();
		}
		public void ClickOnCheckBoxForAcceptAllDomains() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnCheckBoxForAcceptAllDomains));
			ClickOnCheckBoxForAcceptAllDomains.click();
		}
		public void ClickOnCheckBoxForAlwaysRedirectToThankYouPage() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnCheckBoxForAlwaysRedirectToThankYouPage));
			ClickOnCheckBoxForAlwaysRedirectToThankYouPage.click();
		}
		public boolean DisplayedUploadToCRMCheckboxIsChecked() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedUploadToCRMCheckboxIsChecked));
		    return	DisplayedUploadToCRMCheckboxIsChecked.isDisplayed();
		}
		
		public void ClickOnCheckBoxForUseTheCalendarLinkOnCRMUsersProfileIfAvailable() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnCheckBoxForUseTheCalendarLinkOnCRMUsersProfileIfAvailable));
			ClickOnCheckBoxForUseTheCalendarLinkOnCRMUsersProfileIfAvailable.click();
		}
		public void ClickOnDropDownForSelectCRmField() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnDropDownForSelectCRmField));
			ClickOnDropDownForSelectCRmField.click();
		}
		public void ClickOnOptionForSelectCRmField() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnOptionForSelectCRmField));
			ClickOnOptionForSelectCRmField.click();
		}
		public void ClickOnSaveButtonForSetUpPage() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnSaveButtonForSetUpPage));
			ClickOnSaveButtonForSetUpPage.click();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

