package com.leadAngel.pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserSettings {
	 private final WebDriverWait wait;
	WebDriver ldriver;
	public UserSettings(WebDriver driver) {
        this.ldriver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        PageFactory.initElements(driver, this);
    }
	
	
	@FindBy(xpath = "//div[text()=' User Settings']")
	WebElement ClickOnUserSettingsModule;
	
	@FindBy(xpath = "//button[@aria-label='toggle Preference']")
	WebElement ClickOnPreferenceDropdown;
	
	//************************************************ Availability ***************************************************
	
	@FindBy(xpath = "//span[text()='Availability ']")
	WebElement ClickOnAvailabilityFeature;
	
	@FindBy(xpath = "(//mat-icon[text()='schedule'])[1]")
	WebElement ClickOnAvailableHoursFirstClockIcon;
	@FindBy(xpath = "//span[text()=' 3 ']")
	WebElement ClickOnTimehours1;
	@FindBy(xpath = "//div[@class='clock-face__number clock-face__number--outer ng-star-inserted'][@style='transform: rotateZ(120deg) translateX(-50%);']")
	WebElement ClickOnTimeMinutes1;
	
	
	@FindBy(xpath = "(//mat-icon[text()='schedule'])[2]")
	WebElement ClickOnAvailableHoursSecondClockIcon;
	@FindBy(xpath = "//span[text()=' 5 ']")
	WebElement ClickOnTimehours2;
	@FindBy(xpath = "//span[text()=' 20']")
	WebElement ClickOnTimeMinutes2;
	
	
	@FindBy(xpath = "//span[text()='Ok']")
	WebElement ClickOnOkButton;
	
	@FindBy(xpath = "(//button[@aria-label='Open calendar'])[1]")
	WebElement ClickOnVacationFirstCalendarButton;
	@FindBy(xpath = "//div[contains(@class,'mat-calendar-body-today')]")
	WebElement ClickOnStartDate;
	
	@FindBy(xpath = "(//button[@aria-label='Open calendar'])[2]")
	WebElement ClickOnVacationSecondCalendarButton;
	@FindBy(xpath = "//div[text()=' 23 ']")
	WebElement ClickOnEndDate;
	
	@FindBy(xpath = "(//span[text()=' Save '])[2]")
	WebElement ClickOnSaveButton;
	@FindBy(xpath = "(//div[text()='Success'])[1]")
	WebElement DisplayedSuccesMessage;
	@FindBy(xpath = "(//div[text()='Ending time should be greater'])[1]")
	WebElement DisplayedErrorMessage;
	
	@FindBy(xpath = "//mat-icon[text()='cancel']")
	WebElement ClearStartDateAndEndDate;
	
	@FindBy(xpath = "//div[text()=' 30 ']")
	WebElement DisplayedEndDate30th;
	@FindBy(xpath = "//div[text()=' 31 ']")
	WebElement DisplayedEndDate31st;
	
	
	@FindBy(xpath = "//button[text()='AM']")
	WebElement SelectedAMmode;
	
	@FindBy(xpath = "//textarea[@formcontrolname='description']")
	WebElement EnterDescription;
	
	
	
	
	
	
	
	
	
	
	public void EnterDescription() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterDescription));
		EnterDescription.sendKeys("Automation testing is going on");
	}
	
	
	public void SelectedAMmode() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectedAMmode));
		SelectedAMmode.click();
	}
	
	public boolean DisplayedEndDate30th() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedEndDate30th));
			return DisplayedEndDate30th.isDisplayed();
		} catch (Exception e) {
		return false;
		}
	}
	public void ClickOnEndDate30th() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedEndDate30th));
		DisplayedEndDate30th.click();
	}
	public boolean DisplayedEndDate31st() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedEndDate31st));
			return DisplayedEndDate31st.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	public void ClickOnEndDate31st() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedEndDate31st));
		DisplayedEndDate31st.click();
	}
	
	
	
	
	
	
	public void ClickOnUserSettingsModule() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnUserSettingsModule));
		ClickOnUserSettingsModule.click();
	}
	
	public void ClickOnPreferenceDropdown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnPreferenceDropdown));
		ClickOnPreferenceDropdown.click();
	}
	
	
	public void ClickOnAvailabilityFeature() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAvailabilityFeature));
		ClickOnAvailabilityFeature.click();
	}
	
	
	public void ClickOnAvailableHoursFirstClockIcon() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAvailableHoursFirstClockIcon));
		ClickOnAvailableHoursFirstClockIcon.click();
	}
	public void ClickOnTimehours1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnTimehours1));
		ClickOnTimehours1.click();
	}
	public void ClickOnTimeMinutes1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnTimeMinutes1));
		ClickOnTimeMinutes1.click();
	}
	
	
	public void ClickOnAvailableHoursSecondClockIcon() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAvailableHoursSecondClockIcon));
		ClickOnAvailableHoursSecondClockIcon.click();
	}
	public void ClickOnTimehours2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnTimehours2));
		ClickOnTimehours2.click();
	}
	public void ClickOnTimeMinutes2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnTimeMinutes2));
		ClickOnTimeMinutes2.click();
	}
	
	
	public void ClickOnOkButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnOkButton));
		ClickOnOkButton.click();
	}
	
	
	public void ClickOnVacationFirstCalendarButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnVacationFirstCalendarButton));
		ClickOnVacationFirstCalendarButton.click();
	}
	public void ClickOnStartDate() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnStartDate));
		ClickOnStartDate.click();
	}
	
	
	public void ClickOnVacationSecondCalendarButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnVacationSecondCalendarButton));
		ClickOnVacationSecondCalendarButton.click();
	}
	public void ClickOnEndDate() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnEndDate));
		ClickOnEndDate.click();
	}
	
	
	public void ClickOnSaveButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSaveButton));
		ClickOnSaveButton.click();
	}
	public boolean DisplayedSuccesMessage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedSuccesMessage));
		return DisplayedSuccesMessage.isDisplayed();
	}
	public boolean DisplayedErrorMessage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedErrorMessage));
		return DisplayedErrorMessage.isDisplayed();
	}
	
	
	public void ClearStartDateAndEndDate() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClearStartDateAndEndDate));
		ClearStartDateAndEndDate.click();
	}
	
	public boolean DisplayedCrossButtonForVacasion() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ClearStartDateAndEndDate));
			return ClearStartDateAndEndDate.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	
	
	//************************************************ Fallback Assignee ***************************************************
	
	@FindBy(xpath = "//span[text()='Fallback Assignee ']")
	WebElement ClickOnFallbackAssignee;
	@FindBy(xpath = "//ng-select[@formcontrolname='FallbackAssignee']")
	WebElement ClickOnFallbackAssigneeDropdown;
	@FindBy(xpath = "//div[@role='option']")
	WebElement ClickOnOption;

	
	@FindBy(xpath = "//span[text()=' Cancel ']")
	WebElement ClickOnCancelButton;
	@FindBy(xpath = "//div[text()='Select Fallback Assignee']")
	WebElement DisplayedFallbackAssigneeTextBoxIsEmpty;
	
	
	public void ClickOnFallbackAssignee() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnFallbackAssignee));
		ClickOnFallbackAssignee.click();
	}
	public void ClickOnFallbackAssigneeDropdown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnFallbackAssigneeDropdown));
		ClickOnFallbackAssigneeDropdown.click();
	}
	public void SelectedAnOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnOption));
		ClickOnOption.click();
	}
	
	
	
	public void ClickOnCancelButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCancelButton));
		ClickOnCancelButton.click();
	}
	public boolean DisplayedFallbackAssigneeTextBoxIsEmpty() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedFallbackAssigneeTextBoxIsEmpty));
		return DisplayedFallbackAssigneeTextBoxIsEmpty.isDisplayed();
	}
	
	
	//************************************************ Profile ***************************************************

	@FindBy(xpath = "//span[text()='Profile ']")
	WebElement ClickOnProfileFeature;
	
	@FindBy(xpath = "//span[text()=' Change ']")
	WebElement ClickOnChangeButton;
	@FindBy(xpath = "//span[text()=' Upload ']")
	WebElement ClickOnUploadButton;
	
	@FindBy(xpath = "//span[text()=' Remove ']")
	WebElement ClickOnRemoveButton;
	
	
	@FindBy(xpath = "//span[text()='Delete']")
	WebElement ClickOnDeleteButton;
	
	@FindBy(xpath = "//div[text()='File Deleted Successfully']")
	WebElement DisplayedRemoveSuccessMessage;
	
	@FindBy(xpath = "//input[@formcontrolname='password']")
	WebElement EnterNewPassword;
	
	
	@FindBy(xpath = "//input[@formcontrolname='confirmPassword']")
	WebElement EnterConfirmedPassword;
	
	@FindBy(xpath = "//li[text()=' Change Password ']")
	WebElement ClickOnChangePassword;
	
	@FindBy(xpath = "//img[@class='rounded-circle']")
	WebElement ClickOnProfilePicture;
	
	@FindBy(xpath = "//div[text()='User Profile']")
	WebElement ClikconUserProfileLink;
	
	@FindBy(xpath = "//div[text()='Logout']")
	WebElement ClickOnLogOutLink;
	
	@FindBy(xpath = "//div[text()='Send Reset Password Link']")
	WebElement ClickOnSendResetPasswordLink;
	@FindBy(xpath = "//span[text()='Send Link']")
	WebElement ClickOnSendLinkButton;
	@FindBy(xpath = "(//div[text()='Reset password link has been sent successfully'])[2]")
	WebElement DisplayedResetPasswordLinkSuccessMessage;
	
	
	@FindBy(xpath = "//span[text()=' Upload ']")
	WebElement ClickOnAgainUploadButtonForChange;
	
	@FindBy(xpath = "(//span[text()=' Upload '])[2]")
	WebElement ClickOnAgainUploadButtonForChangeforUpload;
	
	@FindBy(xpath = "//div[text()='File Uploaded Successfully']")
	WebElement DisplayedFileUploadSuccessMessage;
	
	@FindBy(xpath = "//div[text()='New password must be different from the current password']")
	WebElement DisplayedChangePasswordErrorMessage;
	@FindBy(xpath = "//div[text()='Your password has been changed successfully']")
	WebElement DisplayedChangePasswordSuccessMessage;
	
	
	@FindBy(xpath = "//h1[text()='Login']//..//button[@type='submit']")
	WebElement ClickOnLoginButton;
	
	
	@FindBy(xpath = "//li[text()=' User Profile ']")
	WebElement DisplayedUserProfilePage;
	@FindBy(xpath = "//div[text()='ACTIVE']")
	WebElement DisplayedActiveStatus;

	
	
	
	
	

	
	
	
	
	
	
	public boolean DisplayedActiveStatus() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedActiveStatus));
		return DisplayedActiveStatus.isDisplayed();
	}
	
	public boolean DisplayedUserProfilePage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedUserProfilePage));
		return DisplayedUserProfilePage.isDisplayed();
	}
	
	public void ClickOnLoginButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnLoginButton));
		ClickOnLoginButton.click();
	}
	public boolean DisplayedChangePasswordSuccessMessage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedChangePasswordSuccessMessage));
		return DisplayedChangePasswordSuccessMessage.isDisplayed();
	}
	public boolean DisplayedChangePasswordErrorMessage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedChangePasswordErrorMessage));
		return DisplayedChangePasswordErrorMessage.isDisplayed();
	}
	public boolean DisplayedFileUploadSuccessMessage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedFileUploadSuccessMessage));
		return DisplayedFileUploadSuccessMessage.isDisplayed();
	}
	public void ClickOnAgainUploadButtonForChange() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAgainUploadButtonForChange));
		ClickOnAgainUploadButtonForChange.click();
	}
	public void ClickOnAgainUploadButtonForChangeforUpload() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAgainUploadButtonForChangeforUpload));
		ClickOnAgainUploadButtonForChangeforUpload.click();
	}
	public void ClickOnProfileFeature() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnProfileFeature));
		ClickOnProfileFeature.click();
	}

	public boolean DisplayedChangeButton() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ClickOnChangeButton));
			return ClickOnChangeButton.isDisplayed();
		} catch (Exception e) {
	      return false;
		}
	}
	
	public boolean DisplayedUploadButton() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ClickOnUploadButton));
			return ClickOnUploadButton.isDisplayed();
		} catch (Exception e) {
          	return false;
		}	
	}
	
//	public void ClickOnChangeButton() {
//		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnChangeButton));
//		JavascriptExecutor js = (JavascriptExecutor) ldriver;
//		js.executeScript("arguments[0].click()", ClickOnChangeButton);
//	}
//	public void ClickOnUploadButton() {
//		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnUploadButton));
//		JavascriptExecutor js = (JavascriptExecutor) ldriver;
//		js.executeScript("arguments[0].click()", ClickOnUploadButton);
//	}
	
	public void ClickOnChangeButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnChangeButton));
		ClickOnChangeButton.click();
	}
	public void ClickOnUploadButton() {
	new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnUploadButton));
	ClickOnUploadButton.click();
}
	
	public void ClickOnRemoveButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnRemoveButton));
		ClickOnRemoveButton.click();
	}
	
	public void ClickOnDeleteButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDeleteButton));
		ClickOnDeleteButton.click();
	}
	
	public boolean DisplayedRemoveSuccessMessage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedRemoveSuccessMessage));
		return DisplayedRemoveSuccessMessage.isDisplayed();
	}
	
	public void EnterNewPassword() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterNewPassword));
		EnterNewPassword.clear();
		EnterNewPassword.sendKeys("@Tech4Vyakar");
	}
	public void EnterNewPassword1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterNewPassword));
		EnterNewPassword.clear();
		EnterNewPassword.sendKeys("@Tech4Lead");
	}
	public void EnterConfirmedPassword() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterConfirmedPassword));
		EnterConfirmedPassword.clear();
		EnterConfirmedPassword.sendKeys("@Tech4Vyakar");
	}
	public void EnterConfirmedPassword1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterConfirmedPassword));
		EnterConfirmedPassword.clear();
		EnterConfirmedPassword.sendKeys("@Tech4Lead");
	}
	public void ClickOnChangePasswordTab() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnChangePassword));
		ClickOnChangePassword.click();
	}
	public void ClickOnProfilePicture() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnProfilePicture));
		ClickOnProfilePicture.click();
	}
	
	public void ClikconUserProfileLink() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClikconUserProfileLink));
		ClikconUserProfileLink.click();
	}
	
	public void ClickOnLogOutLink() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnLogOutLink));
		ClickOnLogOutLink.click();
	}
	
	
	public void ClickOnSendResetPasswordLink() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSendResetPasswordLink));
		ClickOnSendResetPasswordLink.click();
	}
	public void ClickOnSendLinkButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSendLinkButton));
		ClickOnSendLinkButton.click();
	}
	
	public boolean DisplayedResetPasswordLinkSuccessMessage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedResetPasswordLinkSuccessMessage));
		return DisplayedResetPasswordLinkSuccessMessage.isDisplayed();
	}
	
	
	
	
}
