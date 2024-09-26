package com.leadAngel.pageObjects;

import java.awt.AWTError;
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

public class CalendarIntegrationPageObjectModel {

	WebDriver ldriver;
    
	public CalendarIntegrationPageObjectModel(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);	
	}

	@FindBy(xpath = "//div[text()=' Calendar Integration']")
	WebElement CalendarIntegration;

	@FindBy(xpath = "//span[text()='Event Templates ']")
	WebElement RightClickOnEventTemplate;

	@FindBy(xpath = "//button[@aria-label='toggle Event Templates']")
	WebElement DropDownEventTemplate;

	@FindBy(xpath = "//h4[text()='Event Templates Overview']")
	WebElement EventTemplateOverView;
	
	@FindBy(xpath = "//input[@formcontrolname='event']")
	WebElement EnterEventName;

	@FindBy(xpath = "//option[@value='In Person Meeting']")
	WebElement SelectLocation;
	
	@FindBy(xpath = "//option[@value='Google Meet']")
	WebElement EditSelectLocation;

	@FindBy(xpath = "//input[@id='displayHidden']")
	WebElement AddLocation;

	@FindBy(xpath = "//option[@value='CustomUrl']")
	WebElement SelectCustomInThankYouPageURL;

	@FindBy(xpath = "//input[@formcontrolname='thankyoupageUrl']")
	WebElement EnterCustomURL;

	@FindBy(xpath = "(//span[@class='mat-checkbox-inner-container'])[2]")
	WebElement ClickOnCheckBoxForAllowGuestsToCancelOrRescheduleMeeting;

	@FindBy(xpath = "(//span[@class='mat-radio-container'])[2]")
	WebElement ClickOnRadioButtonForShowThisEventOnlyForSelectedWebToLeadForms;

	@FindBy(xpath = "//span[@class='ng-arrow-wrapper']")
	WebElement SelectedWebToLeadFormsDropdown;

	@FindBy(xpath = "(//span[@class='custom-option-content ng-star-inserted'])[1]")
	WebElement SelectedWebToLeadFormsOption;
	
	@FindBy(xpath = "(//span[@class='custom-option-content ng-star-inserted'])[3]")
	WebElement EditSelectedWebToLeadFormsOption;

	@FindBy(xpath = "//div[@class='angular-editor-textarea']")
	WebElement EnterDiscription;

	@FindBy(xpath = "(//span[text()='Next '])[1]")
	WebElement ClickOnEnterNextButton;

	@FindBy(xpath = "//input[@formcontrolname='particiepentsEmailArray']")
	WebElement EnterEmailIDforHOST;

	@FindBy(xpath = "(//span[text()='Next '])[2]")
	WebElement ClickOnNextButtonForHOST;

	@FindBy(xpath = "//input[@id='dateRange']")
	WebElement EnterDateRange;

	@FindBy(xpath = "//option[@value='30 mins']")
	WebElement SelectMeetingDuration;

	@FindBy(xpath = "(//option[@value='10 min'])[1]")
	WebElement SelectBufferBeforeEvent;

	@FindBy(xpath = "(//option[@value='10 min'])[2]")
	WebElement SelectBufferAfterEvent;

	@FindBy(xpath = "(//option[@value='30 min'])[3]")
	WebElement SelectStartTimeIncrements;

	@FindBy(xpath = "//input[@id='schedulingCondtion']")
	WebElement Enter2digitNumbersInviteesCantScheduleWithin;

	@FindBy(xpath = "(//option[@value='15 min'])[3]")
	WebElement SelectOptionInviteesCantScheduleWithin;

	@FindBy(xpath = "(//span[text()=' Close '])[1]")
	WebElement ClickOnCloseButtonForWhenCanPeopleBookThisEvent;

	@FindBy(xpath = "(//mat-expansion-panel-header[contains(@id,'mat-expansion-panel-header')])[4]")
	WebElement ClickOnDropDownInviteeQuetions;

	
	@FindBy(xpath = "(//span[@class='mat-checkbox-inner-container'])[4]")
	WebElement ClickOnCheckBoxForAcceptOnlyNonISPEmailAddress;

	@FindBy(xpath = "//span[text()=' Next ']")
	WebElement ClickOnNextButtonInAdditionalOptions;

	
	@FindBy(xpath = "(//mat-expansion-panel-header[contains(@id,'mat-expansion-panel-header')])[1]")
	WebElement ClickOnDropDownWhatEventIsThis;
	
	@FindBy(xpath = "(//label[@class='mat-slide-toggle-label'])[1]")
	WebElement ClickOnRadioButtonForEmailReminders;

	@FindBy(xpath = "(//label[@class='mat-slide-toggle-label'])[2]")
	WebElement ClickOnRadioButtonForCreateAnEvenetInCRM;

	@FindBy(xpath = "(//span[text()=' Close '])[2]")
	WebElement ClickOnCloseButtonForNotificationsPolicy;
	
	@FindBy(xpath = "//button[@aria-label='toggle Automation']")
	WebElement ClickOnFolder;
	

	//***********************************************************************************************************

	
	
	
	public void ClickOnCalendarIntegration() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(CalendarIntegration));
		CalendarIntegration.click();
	}

	public void RightClickOnEventTemplate() {
		new WebDriverWait(ldriver,Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(RightClickOnEventTemplate));
		Actions Action=new Actions(ldriver);
		Action.moveToElement(RightClickOnEventTemplate).contextClick(RightClickOnEventTemplate).build().perform();
	}

	public void ClickAgainEventTemplate() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(RightClickOnEventTemplate));
		RightClickOnEventTemplate.click();
	}

	public void DropDownEventTemplate() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(DropDownEventTemplate));
		DropDownEventTemplate.click();
	}

	public boolean DisplayEventTemplateOverView() {
		  new WebDriverWait(ldriver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(EventTemplateOverView));
		  return EventTemplateOverView.isDisplayed();
	}
	
	public void EnterEventName() {
		new WebDriverWait(ldriver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(EnterEventName));
		EnterEventName.clear();
		EnterEventName.sendKeys("Automation Testing");
	}

	public void SelectLocation() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(SelectLocation));
		SelectLocation.click();
	}

	public void EditSelectLocation() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(EditSelectLocation));
		EditSelectLocation.click();
	}
	
	public void EnterAddLocation() {
		new WebDriverWait(ldriver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(AddLocation));
		AddLocation.clear();
		AddLocation.sendKeys("California");
	}

	public void SelectCustomInThankYouPageURL() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(SelectCustomInThankYouPageURL));
		SelectCustomInThankYouPageURL.click();
	}

	public void EnterCustomURL() {
		new WebDriverWait(ldriver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(EnterCustomURL));
		EnterCustomURL.clear();
		EnterCustomURL.sendKeys("https://leadangel.com");
	}

	public void ClickOnCheckBoxForAllowGuestsToCancelOrRescheduleMeeting() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(ClickOnCheckBoxForAllowGuestsToCancelOrRescheduleMeeting));
		ClickOnCheckBoxForAllowGuestsToCancelOrRescheduleMeeting.click();
	}

	public void ClickOnRadioButtonForShowThisEventOnlyForSelectedWebToLeadForms() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(ClickOnRadioButtonForShowThisEventOnlyForSelectedWebToLeadForms));
		ClickOnRadioButtonForShowThisEventOnlyForSelectedWebToLeadForms.click();
	}

	public void SelectedWebToLeadFormsDropdown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(SelectedWebToLeadFormsDropdown));
		SelectedWebToLeadFormsDropdown.click();
	}

	public void SelectedWebToLeadFormsOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(SelectedWebToLeadFormsOption));
		SelectedWebToLeadFormsOption.click();
	}

	public void EditSelectedWebToLeadFormsOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(EditSelectedWebToLeadFormsOption));
		EditSelectedWebToLeadFormsOption.click();
	}
	
	public void EnterDiscription() {
		new WebDriverWait(ldriver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(EnterDiscription));
		EnterDiscription.clear();
		EnterDiscription.sendKeys("Performing CrudOperation through Automation");
	}

	public void ClickOnEnterNextButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(ClickOnEnterNextButton));
		ClickOnEnterNextButton.click();
	}

	public void EnterEmailIDforHOST() {
		new WebDriverWait(ldriver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(EnterEmailIDforHOST));
		EnterEmailIDforHOST.clear();
		EnterEmailIDforHOST.sendKeys("mayank@leadangel.com,");
		EnterEmailIDforHOST.sendKeys("nisha@leadangel.com,");
	}

	public void ClickOnNextButtonForHOST() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(ClickOnNextButtonForHOST));
		ClickOnNextButtonForHOST.click();
	}

	public void EnterDateRange() {
		new WebDriverWait(ldriver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(EnterDateRange));
		EnterDateRange.clear();
		EnterDateRange.sendKeys("33");
	}

	public void SelectMeetingDuration() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(SelectMeetingDuration));
		SelectMeetingDuration.click();
	}

	public void SelectBufferBeforeEvent() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(SelectBufferBeforeEvent));
		SelectBufferBeforeEvent.click();
	}

	public void SelectBufferAfterEvent() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(SelectBufferAfterEvent));
		SelectBufferAfterEvent.click();
	}

	public void SelectStartTimeIncrements() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(SelectStartTimeIncrements));
		SelectStartTimeIncrements.click();
	}

	public void Enter2digitNumbersInviteesCantScheduleWithin() {
		new WebDriverWait(ldriver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(Enter2digitNumbersInviteesCantScheduleWithin));
		Enter2digitNumbersInviteesCantScheduleWithin.clear();
		Enter2digitNumbersInviteesCantScheduleWithin.sendKeys("30");
	}

	public void SelectOptionInviteesCantScheduleWithin() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(SelectOptionInviteesCantScheduleWithin));
		SelectOptionInviteesCantScheduleWithin.click();
	}

	public void ClickOnCloseButtonForWhenCanPeopleBookThisEvent() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(ClickOnCloseButtonForWhenCanPeopleBookThisEvent));
		ClickOnCloseButtonForWhenCanPeopleBookThisEvent.click();
	}

	public void ClickOnCheckBoxForAcceptOnlyNonISPEmailAddress() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(ClickOnCheckBoxForAcceptOnlyNonISPEmailAddress));
		ClickOnCheckBoxForAcceptOnlyNonISPEmailAddress.click();
	}

	public void ClickOnNextButtonInAdditionalOptions() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(ClickOnNextButtonInAdditionalOptions));
		ClickOnNextButtonInAdditionalOptions.click();
	}

	public void ClickOnDropDownInviteeQuetions() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(ClickOnDropDownInviteeQuetions));
		ClickOnDropDownInviteeQuetions.click();
	}
	
	public void ClickOnDropDownWhatEventIsThis() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(ClickOnDropDownWhatEventIsThis));
		ClickOnDropDownWhatEventIsThis.click();
	}
	
	public void ClickOnRadioButtonForEmailReminders() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(ClickOnRadioButtonForEmailReminders));
		ClickOnRadioButtonForEmailReminders.click();
	}


	public void ClickOnRadioButtonForCreateAnEvenetInCRM() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(ClickOnRadioButtonForCreateAnEvenetInCRM));
		ClickOnRadioButtonForCreateAnEvenetInCRM.click();
	}

	public void ClickOnCloseButtonForNotificationsPolicy() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(ClickOnCloseButtonForNotificationsPolicy));
		ClickOnCloseButtonForNotificationsPolicy.click();
	}

	public void ClickOnFolder() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(ClickOnFolder));
		ClickOnFolder.click();
	}
	
     //**************************************************************************************************************************

	@FindBy(xpath = "//span[text()='Edit ']")
	WebElement ClickOnEditButton;
	
	@FindBy(xpath = "//span[text()=' Approve ']")
	WebElement ClickOnApproveButton;
	@FindBy(xpath = "(//mat-icon[contains(text(),'done_all')])[2]")
	WebElement ClickOnApproveButtonEventTemplate;
	public void ClickOnApproveButtonEventTemplate() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(ClickOnApproveButtonEventTemplate));
		ClickOnApproveButtonEventTemplate.click();
	}
	public void ClickOnEditButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(ClickOnEditButton));
		ClickOnEditButton.click();
	}
	public void ClickOnApproveButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(ClickOnApproveButton));
		ClickOnApproveButton.click();
	}
	
	
	//*********************************************************** Events X path *********************************************************
	
	
	@FindBy(xpath = "//span[text()='Events ']")
	WebElement ClickOnEventsFeature;
	
	@FindBy(xpath = "//span[text()='+ New Event']")
	WebElement ClickOnNewEventButton;
	
	@FindBy(xpath = "//span[text()='Create']")
	WebElement ClickOnCreateButton;
	@FindBy(xpath = "//mat-icon[text()='chevron_left']")
	WebElement ClickOnBackButton;
	@FindBy(xpath = "//div[text()='Success']")
	WebElement VerifySuccessmessage;
	@FindBy(xpath = "//span[text()=' Save & Close ']")
	WebElement ClickOnSaveAndCloseButton;
	
	
	
	@FindBy(xpath = "//div[text()='Edit']")
	WebElement ClickOnEditButtonForAutoTestObject;
	
	@FindBy(xpath = "//div[text()='Clone']")
	WebElement ClickOnCloneButtonForAutoTestObject;
	
	@FindBy(xpath = "//div[text()='Delete']")
	WebElement ClickOnDeleteButtonForAutoTestObject;
	
	@FindBy(xpath = "//h3[text()='AutoTestObject_Copy(1)']//..//..//..//..//mat-icon[text()='arrow_drop_down']")
	WebElement ClickOnDropDownButtonForAutoTestObjectCopy1;
	
	@FindBy(xpath = "//button//span[contains(text(),'Delete')]")
	WebElement ClickOnDelete;
	
	@FindBy(xpath = "(//h3[contains(text(),'AutoTestObject')])[1]")
	 WebElement VerifyDisplayAutoTestObject;
	

	
	@FindBy(xpath = "(//span[text()='Allow guests to cancel or reschedule meeting']//..)[1]")
	WebElement ClickOnCheckBoxForAllowGuestsToCancelOrRescheduleMeetingEvents;
	@FindBy(xpath = "//span[text()='Allow guests to cancel or reschedule meeting']//..//input[@aria-checked='true']")
	WebElement DisplayedAllowGuestsToCancelOrRescheduleMeetingEventsCheckboxIsChecked;
	
	@FindBy(xpath = "(//span[text()='Accept only non ISP email address. ']//..)[1]")
	WebElement ClickOnCheckBoxForAcceptOnlyNonISPEmailAddressEvents;
	@FindBy(xpath = "(//span[text()=' Save & Close '])[2]")
	WebElement ClickOnSaveAndCloseButtonForInvitee;
	@FindBy(xpath = "(//span[text()=' Save & Close '])[3]")
	WebElement ClickOnSaveAndCloseButtonForNotificationPolicy;
	
	@FindBy(xpath="(//a[text()=' open_in_new '])[1]")
	WebElement ClickOnOpenInNewTabLink;
	
	@FindBy(xpath = "//li[text()=' Detail ']")
	WebElement ClickOnDetailPage;
	
	//**
	@FindBy(xpath = "//a[@class='link']")
	WebElement ClickOnBookingHomePageLink;
	
	@FindBy(xpath = "//h6[text()='Booking Home Page']//..//span[contains(text(),'content_copy')]")
	WebElement ClickOnCopyIcon;
	
	@FindBy(xpath = "//div[@role='alert']")
	WebElement DisplayedWeCouldntAccessYourCalendarMessage;
	
	@FindBy(xpath = "//p[text()='This event has been removed, you cannot access this link.']")
	WebElement DisplayedThisEventHasBeenRemovedYouCannotAccessThisLinkAlertMessage;
	
	@FindBy(xpath = "//mat-card-subtitle[text()='Welcome to my scheduling page please follow the instructions to add an event to my calendar. ']")
	WebElement DisplayedWelcomeToMySchedulingPage;
	
	@FindBy(xpath = "(//div[text()='Success'])[1]")
	WebElement DisplayedCopiedSuccessMessage;
	
	@FindBy(xpath = "(//h3[contains(text(),'AutoTestObject')]//..//..//..//..//span[text()=' content_copy '])[1]")
	WebElement ClickOnCopyLinkIconFromTheAutoTestObject;
	
	@FindBy(xpath = "(//h3[contains(text(),'AutoTestObject')]//..//..//..//..//span[@class='mat-slide-toggle-thumb'])[1]")
	WebElement ClickOnRadioButton;
	
	@FindBy(xpath = "(//h3[contains(text(),'AutoTestObject')]//..//..//..//..//input[@aria-checked='false'])[1]")
	WebElement DisplayedRadioButtonIsUnchecked;
	
	@FindBy(xpath = "(//h3[contains(text(),'AutoTestObject')]//..//..//..//..//input[@aria-checked='true'])[1]")
	WebElement DisplayedRadioButtonIsChecked;
	
	@FindBy(xpath = "(//h3[contains(text(),'AutoTestObject')]//..//..//..//..//mat-icon[text()='arrow_drop_down'])[1]")
	WebElement ClickOnDropDownButtonForAutoTestObject;
	
	
	@FindBy(xpath = "(//div[text()='We could not access your Calendar'])[1]")
	WebElement DisplayedWeCouldNotAccessYourCalendarErrorMessage;
	
	
	@FindBy(xpath = "(//span[text()='Automatically publish this event for all the new calendar integrations.']//..)[1]")
	WebElement ClickOnAutomaticallyPublishThisEventCkeckBox;
	@FindBy(xpath = "//span[text()='Automatically publish this event for all the new calendar integrations.']//..//input[@aria-checked='true']")
	WebElement DisplayedAutomaticallyPublishThisEventCkeckBoxIsChecked;
	@FindBy(xpath = "(//div[text()='Saved Successfully'])[1]")
	WebElement DisplayedSuccessMessage;
	
	@FindBy(xpath="//button[@aria-label='toggle CRUD']")
	WebElement ClickOnCrudFolderDropdown;
	
	@FindBy(xpath = "//select[@id='ddlcausetype']//option[2]")
	WebElement SelectMainFolder;
	@FindBy(xpath="//option[text()=' CRUD ']")
	WebElement SelectFolderToAutotestObject;
	@FindBy(xpath = "//input[@id='menuname']")
	WebElement txtNameObject;
	
	@FindBy(xpath = "//span[text()='Delete ']")
	WebElement ClickOnDeleteButtonFromTheConsole;
	
	
	@FindBy(xpath = "(//span[text()=' Approve '])[2]")
	WebElement ClickApproveButtonAgainAfterEdit;
	
	@FindBy(xpath="(//span[contains(text(),'AutoTestObject_Rename_Copy')])[1]")
	WebElement DisplayedAutoTestObjectRenameCopy;
	
	
	@FindBy(xpath="//span[text()='Event Templates ']")
	WebElement ClickOnEventTemplatesFeature;
	
	@FindBy(xpath = "//h4[text()='Event Templates Overview']")
	WebElement DisplayedEventTemplatesOverviewPage;
	
	@FindBy(xpath = "//button[@aria-label='toggle Event Templates']")
	WebElement ClickOnEventTemplatesDropDown;
	
	@FindBy(xpath="//th[@role='columnheader']//label[@class='mat-checkbox-layout']")
	WebElement ClickOnColumnHeaderCheckBox;
	@FindBy(xpath="//th[@role='columnheader']//label[@class='mat-checkbox-layout']//input[@aria-checked='true']")
	WebElement DisplayedColumnHeaderCheckBoxIsChecked;
	@FindBy(xpath="//th[@role='columnheader']//label[@class='mat-checkbox-layout']//input[@aria-checked='false']")
	WebElement DisplayedColumnHeaderCheckBoxIsNotChecked;
	@FindBy(xpath="(//span[text()=' Delete']//..)[1][@disabled='true']")
	WebElement DisplayedDeleteButtonIsDisabled;
	
	
	
	@FindBy(xpath="//span[text()='AutoTestObject']//..//..//..//label[@class='mat-checkbox-layout']")
	WebElement DisplayedAutTestObjectCheckBox;
	
	@FindBy(xpath="//span[text()='AutoTestObject']//..//..//..//label[@class='mat-checkbox-layout']")
	WebElement ClickOnAutTestObjectCheckBox;
	@FindBy(xpath="//span[text()='AutoTestObject']//..//..//..//input[@type='checkbox'][@aria-checked='true']")
	WebElement DisplayedAutTestObjectCheckBoxIsChecked;
	@FindBy(xpath="//span[text()='AutoTestObject']//..//..//..//input[@type='checkbox'][@aria-checked='false']")
	WebElement DisplayedAutTestObjectCheckBoxIsNotChecked;
	
	@FindBy(xpath="//input[@placeholder='Filter']")
	WebElement EnterTextInFilterBox;
	@FindBy(xpath="//td[contains(@class,'cdk-column-SubMenuName')]//span[text()='AutoTestObject']")
	WebElement DisplayedAutoTestObject;
	@FindBy(xpath="//span[text()='AutoTestObject']//..//..//..//mat-icon[contains(@class,'text-danger')]")
	WebElement DisplayedAutoTestObjectIsNotUsed;
	@FindBy(xpath="//span[text()='AutoTestObject']//..//..//..//mat-icon[contains(@class,'text-success ')]")
	WebElement DisplayedAutoTestObjectIsUsed;
	@FindBy(xpath="//mat-icon[text()='clear']")
	WebElement ClearTestFromTheFilterBox;
	
	@FindBy(xpath="//span[text()='AE to SDR Mapping ']")
	WebElement ClickOnAEtoSDRFeature;
	
	@FindBy(xpath="//span[text()=' Delete']")
	WebElement ClickOnDeleteButtonOverViewPage;
	@FindBy(xpath="//span[text()=' Delete ']")
	WebElement ClickAgainDeleteButtonOverViewPage;
	
	@FindBy(xpath="//input[@tabindex='-1'][contains(@class,'cdk-visually-hidden')]")
	WebElement DisplayedColumnHeaderCheckIsDisabled;
	
	
	

	public boolean DisplayedColumnHeaderCheckIsDisabled() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedColumnHeaderCheckIsDisabled));
			return DisplayedColumnHeaderCheckIsDisabled.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public void ClickOnDeleteButtonOverViewPage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnDeleteButtonOverViewPage));
		ClickOnDeleteButtonOverViewPage.click();
	}
	public void ClickAgainDeleteButtonOverViewPage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickAgainDeleteButtonOverViewPage));
		ClickAgainDeleteButtonOverViewPage.click();
	}
	
	
	public void ClickOnAEtoSDRFeature() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnAEtoSDRFeature));
		ClickOnAEtoSDRFeature.click();
	}
	
	public void ClickOnColumnHeaderCheckBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnColumnHeaderCheckBox));
		ClickOnColumnHeaderCheckBox.click();
	}
	public boolean DisplayedColumnHeaderCheckBoxIsChecked() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedColumnHeaderCheckBoxIsChecked));
        return DisplayedColumnHeaderCheckBoxIsChecked.isDisplayed();
	}
	public boolean DisplayedColumnHeaderCheckBoxIsNotChecked() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedColumnHeaderCheckBoxIsNotChecked));
        return DisplayedColumnHeaderCheckBoxIsNotChecked.isDisplayed();
	}
	public boolean DisplayedDeleteButtonIsDisabled() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedDeleteButtonIsDisabled));
			return DisplayedDeleteButtonIsDisabled.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	
	
	
	public boolean DisplayedAutTestObjectCheckBox() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedAutTestObjectCheckBox));
			return DisplayedAutTestObjectCheckBox.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	public void ClickOnAutTestObjectCheckBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnAutTestObjectCheckBox));
		ClickOnAutTestObjectCheckBox.click();
	}
	public boolean DisplayedAutTestObjectCheckBoxIsChecked() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedAutTestObjectCheckBoxIsChecked));
        return DisplayedAutTestObjectCheckBoxIsChecked.isDisplayed();
	}
	public boolean DisplayedAutTestObjectCheckBoxIsNotChecked() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedAutTestObjectCheckBoxIsNotChecked));
        return DisplayedAutTestObjectCheckBoxIsNotChecked.isDisplayed();
	}
	
	
	public void EnterTextInFilterBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(EnterTextInFilterBox));
		EnterTextInFilterBox.sendKeys("AutoTestObject");
	}
	public boolean DisplayedAutoTestObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedAutoTestObject));
        return DisplayedAutoTestObject.isDisplayed();
	}
	public boolean DisplayedAutoTestObjectIsNotUsed() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedAutoTestObjectIsNotUsed));
        return DisplayedAutoTestObjectIsNotUsed.isDisplayed();
	}
	public boolean DisplayedAutoTestObjectIsUsed() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedAutoTestObjectIsUsed));
        return DisplayedAutoTestObjectIsUsed.isDisplayed();
	}
	public void ClearTestFromTheFilterBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClearTestFromTheFilterBox));
		ClearTestFromTheFilterBox.click();
	}
	
	
	
	
	
	
	
	
	public void ClickOnEventTemplatesDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(ClickOnEventTemplatesDropDown));
		ClickOnEventTemplatesDropDown.click();
	}
	
	public boolean DisplayedEventTemplatesOverviewPage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedEventTemplatesOverviewPage));
		return DisplayedEventTemplatesOverviewPage.isDisplayed();
	}
	
	
	public void ClickOnEventTemplatesFeature() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnEventTemplatesFeature));
		ClickOnEventTemplatesFeature.click();
	}
	
	
	public boolean DisplayedAutoTestObjectRenameCopy() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedAutoTestObjectRenameCopy));
			return DisplayedAutoTestObjectRenameCopy.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	
	
	public void ContextClickOnAutoTestObjectRenameCopyObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(DisplayedAutoTestObjectRenameCopy));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(DisplayedAutoTestObjectRenameCopy).contextClick(DisplayedAutoTestObjectRenameCopy).build()
		.perform();
	}	
	public void ClickApproveButtonAgainAfterEdit() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickApproveButtonAgainAfterEdit));
		ClickApproveButtonAgainAfterEdit.click();
	}
	
	
	public void ClickOnDeleteButtonFromTheConsole() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnDeleteButtonFromTheConsole));
		ClickOnDeleteButtonFromTheConsole.click();
	}
	
	
	public void NameInObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(txtNameObject));
		txtNameObject.sendKeys("CRUD");
	}
	public void SelectFolderToAutotestObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectFolderToAutotestObject));
		SelectFolderToAutotestObject.click();
	}
	public void SelectMainFolder() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectMainFolder));
		SelectMainFolder.click();
	}
	public void ClickOnCrudFolderDropdown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnCrudFolderDropdown));
		ClickOnCrudFolderDropdown.click();
	}
	public boolean DisplayedSuccessMessage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedSuccessMessage));
		return DisplayedSuccessMessage.isDisplayed();
	}
	public boolean DisplayedAutomaticallyPublishThisEventCkeckBoxIsChecked() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedAutomaticallyPublishThisEventCkeckBoxIsChecked));
		return DisplayedAutomaticallyPublishThisEventCkeckBoxIsChecked.isDisplayed();
	}
	public void ClickOnAutomaticallyPublishThisEventCkeckBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnAutomaticallyPublishThisEventCkeckBox));
		ClickOnAutomaticallyPublishThisEventCkeckBox.click();
	}
	
	
	
	public boolean DisplayedWeCouldNotAccessYourCalendarErrorMessage() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedWeCouldNotAccessYourCalendarErrorMessage));
			return DisplayedWeCouldNotAccessYourCalendarErrorMessage.isDisplayed();
		} catch (Exception e) {
             return false;
		}
	}
	public boolean DisplayedRadioButtonIsChecked() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedRadioButtonIsChecked));
		return DisplayedRadioButtonIsChecked.isDisplayed();
	}
	public boolean DisplayedRadioButtonIsUnchecked() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedRadioButtonIsUnchecked));
			return DisplayedRadioButtonIsUnchecked.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	
	public void ClickOnRadioButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnRadioButton));
		ClickOnRadioButton.click();
	}
	
	
	
	public void ClickOnCopyLinkIconFromTheAutoTestObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnCopyLinkIconFromTheAutoTestObject));
		ClickOnCopyLinkIconFromTheAutoTestObject.click();
	}
	
	
	public boolean DisplayedCopiedSuccessMessage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedCopiedSuccessMessage));
		return DisplayedCopiedSuccessMessage.isDisplayed();
	}
	
	public boolean DisplayedWelcomeToMySchedulingPage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedWelcomeToMySchedulingPage));
		return DisplayedWelcomeToMySchedulingPage.isDisplayed();
	}
	public boolean DisplayedThisEventHasBeenRemovedYouCannotAccessThisLinkAlertMessage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedThisEventHasBeenRemovedYouCannotAccessThisLinkAlertMessage));
		return DisplayedThisEventHasBeenRemovedYouCannotAccessThisLinkAlertMessage.isDisplayed();
	}
	public boolean DisplayedWeCouldntAccessYourCalendarMessage() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedWeCouldntAccessYourCalendarMessage));
			return DisplayedWeCouldntAccessYourCalendarMessage.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	
	public void ClickOnCopyIcon() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnCopyIcon));
		ClickOnCopyIcon.click();
	}
	
	
	
	public void ClickOnBookingHomePageLink() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnBookingHomePageLink));
		ClickOnBookingHomePageLink.click();
	}
	
	
	public void ClickOnDetailPage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnDetailPage));
		ClickOnDetailPage.click();
	}
	
	public void ClickOnOpenInNewTabLink() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnOpenInNewTabLink));
		ClickOnOpenInNewTabLink.click();
	}
	
	public void ClickOnSaveAndCloseButtonForNotificationPolicy() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(ClickOnSaveAndCloseButtonForNotificationPolicy));
		ClickOnSaveAndCloseButtonForNotificationPolicy.click();
	}
	public void ClickOnSaveAndCloseButtonForInvitee() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(ClickOnSaveAndCloseButtonForInvitee));
		ClickOnSaveAndCloseButtonForInvitee.click();
	}
	public void ClickOnCheckBoxForAcceptOnlyNonISPEmailAddressEvents() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(ClickOnCheckBoxForAcceptOnlyNonISPEmailAddressEvents));
		ClickOnCheckBoxForAcceptOnlyNonISPEmailAddressEvents.click();
	}

	public void ClickOnCheckBoxForAllowGuestsToCancelOrRescheduleMeetingEvents() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCheckBoxForAllowGuestsToCancelOrRescheduleMeetingEvents));
		 ClickOnCheckBoxForAllowGuestsToCancelOrRescheduleMeetingEvents.click();
	}
	
	public boolean DisplayedAllowGuestsToCancelOrRescheduleMeetingEventsCheckboxIsChecked() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedAllowGuestsToCancelOrRescheduleMeetingEventsCheckboxIsChecked));
		return DisplayedAllowGuestsToCancelOrRescheduleMeetingEventsCheckboxIsChecked.isDisplayed();
	}
	public boolean VerifyDisplayAutoTestObject() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(VerifyDisplayAutoTestObject));
			return VerifyDisplayAutoTestObject.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public void ClickOnDelete() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDelete));
		ClickOnDelete.click();
	}		
	public void ClickOnDropDownButtonForAutoTestObjectCopy1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(ClickOnDropDownButtonForAutoTestObjectCopy1));
		ClickOnDropDownButtonForAutoTestObjectCopy1.click();
	}
	public void ClickOnDeleteButtonForAutoTestObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(ClickOnDeleteButtonForAutoTestObject));
		ClickOnDeleteButtonForAutoTestObject.click();
	}
	public void ClickOnCloneButtonForAutoTestObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(ClickOnCloneButtonForAutoTestObject));
		ClickOnCloneButtonForAutoTestObject.click();
	}
	public void ClickOnEditButtonForAutoTestObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(ClickOnEditButtonForAutoTestObject));
		ClickOnEditButtonForAutoTestObject.click();
	}
	public void ClickOnDropDownButtonForAutoTestObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(ClickOnDropDownButtonForAutoTestObject));
		ClickOnDropDownButtonForAutoTestObject.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void ClickOnSaveAndCloseButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(ClickOnSaveAndCloseButton));
		ClickOnSaveAndCloseButton.click();
	}
	
	public void ClickOnEventsFeature() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(ClickOnEventsFeature));
		ClickOnEventsFeature.click();
	}
	public void ClickOnNewEventButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(ClickOnNewEventButton));
		ClickOnNewEventButton.click();
	}
	public void ClickOnCreateButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(ClickOnCreateButton));
		ClickOnCreateButton.click();
	}
	public void ClickOnBackButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(ClickOnBackButton));
		ClickOnBackButton.click();
	}
	public boolean VerifySuccessmessage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(VerifySuccessmessage));
		return VerifySuccessmessage.isDisplayed();
	}
	
	
	
	public void EnterEventNameEvents() {
		new WebDriverWait(ldriver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(EnterEventName));
		EnterEventName.clear();
		EnterEventName.sendKeys("AutoTestObject");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
