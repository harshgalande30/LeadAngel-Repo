package com.leadAngel.pageObjects;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeadProcessingWithoutRouting_FlowChartPage {
	WebDriver ldriver;

	public LeadProcessingWithoutRouting_FlowChartPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}
	@FindBy(xpath="//div[contains(text(),'Lead Filter')]")
	WebElement LeadFilter;
	@FindBy(xpath="//div[contains(text(),'Assignment')]")
	WebElement AssignmentBlock;
	@FindBy(xpath="(//span[contains(text(),'Decision Block')]/ancestor::div)[14]")
	WebElement DecisionBlock;
	@FindBy(xpath="//div[contains(text(),'Action')]")
	WebElement ActionBlock;
	@FindBy(xpath="(//span[contains(text(),'Action Block')]/ancestor::div)[14]")
	WebElement ActionBlockY;
	@FindBy(xpath="//textarea[@formcontrolname=\"decisionDescription\"]")
	WebElement DescriptionActionBlock;
	@FindBy(xpath="//select//option[contains(text(),'Call Webhook')]")
	WebElement ActionBlockOptions;
	@FindBy(xpath="(//select[@formcontrolname=\"webhookvalue\"]//option)[2]")
	WebElement ActionBlockOptions2;
	@FindBy(xpath="//div[@data-jtk-source-port-type='source']")
	WebElement DecisionBlockY;
	@FindBy(xpath="//div[@data-jtk-source-port-type='source1']")
	WebElement DecisionBlockN;
	@FindBy(xpath="(//span[contains(text(),'Assignment Block')]/ancestor::div)[14]")
	WebElement AssignmentBlockInCanvas;
	@FindBy(xpath="(//ul/li)[4]")
	WebElement DecisionBlockList;
	@FindBy(xpath="//span[contains(text(),'chevron_right')]/ancestor::button")
	WebElement AddBtnDecisionBlock;
	@FindBy(xpath="//span[contains(text(),'Save')]/ancestor::button")
	WebElement SaveBtnDecisionBlock;
	@FindBy(xpath="//input[@formcontrolname='BlockAPIName']")
	WebElement InputApiNameInAssignmentBlock;
	@FindBy(xpath="//textarea[@formcontrolname='BlockDescription']")
	WebElement DescInAssignmentBlock;
	@FindBy(xpath="//mat-select[@formcontrolname='ActionType']")
	WebElement DropDownInAssignmentBlock;
	@FindBy(xpath="(//mat-option/span[contains(text(),'Assign to Sales Rep')])[1]")
	WebElement SelectValueDropDown;
	@FindBy(xpath="//mat-select[@formcontrolname='ActionVal']")
	WebElement DropDown2InAssignmentBlock;
	@FindBy(xpath="(//mat-option[@role='option'])[2]")
	WebElement SelectValueDropDown2;
	@FindBy(xpath="//mat-checkbox[@formcontrolname='preferHistoricState']")
	WebElement PreferHistoricStateCheckBox;
	@FindBy(xpath="//mat-checkbox[@formcontrolname='autoConvertsLeadInto']")
	WebElement ConverLeadtoContactAccount;
	@FindBy(xpath="//mat-select[@formcontrolname='AutoConvertLeadsID']")
	WebElement SelectAutoConversion;
	@FindBy(xpath="(//div[@data-jtk-source='true'])[1]")
	WebElement StartArrow;
	@FindBy(xpath="//span[contains(text(),' Approve ')]/ancestor::button")
	WebElement ApproveBtn;
	@FindBy(xpath="//button[@type='submit']")
	WebElement SaveBtn;
	@FindBy(xpath="//mat-radio-button[@value=\"ContinueProcessing\"]")
	WebElement ContinueProcessingActionBlock;
	@FindBy(xpath="//button[@type='button']//span[contains(text(),'Save')]")
	WebElement SaveBtnActionBlock;
	
	
	
	public void LeadFilter_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(LeadFilter));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(LeadFilter)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(LeadFilter)
        .pause(Duration.ofSeconds(1))
        .moveByOffset(-100,120) //change the x, y values to be applicable for your cases
        .moveByOffset(-100,120)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	public void AssignmentBlock_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(AssignmentBlock));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(AssignmentBlock)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(AssignmentBlock)
        .pause(Duration.ofSeconds(1))
        .moveByOffset(0,140) //change the x, y values to be applicable for your cases
        .moveByOffset(0,140)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	public void ActionBlock_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ActionBlock));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(ActionBlock)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(ActionBlock)
        .pause(Duration.ofSeconds(1))
        .moveByOffset(0,190) //change the x, y values to be applicable for your cases
        .moveByOffset(0,190)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	public void DoubleClickOnDecisionBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DecisionBlock));
		Actions actions = new Actions(ldriver);
		//DecisionBlock.sendKeys("");
		actions.doubleClick(DecisionBlock).build().perform();
		actions.doubleClick(DecisionBlock).build().perform();
		
	}
	public void DoubleClickOnActionBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ActionBlockY));
		Actions actions = new Actions(ldriver);
		//DecisionBlock.sendKeys("");
		actions.doubleClick(ActionBlockY).build().perform();
		actions.doubleClick(ActionBlockY).build().perform();
		
	}
	public void InputOnActionBlockDescription() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DescriptionActionBlock));
		DescriptionActionBlock.sendKeys("Automation Testing GoingOn!!");
	}
	public void ClickOnOptionInActionBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ActionBlockOptions));
		ActionBlockOptions.click();
	}
	public void ClickOnOption2InActionBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ActionBlockOptions2));
		ActionBlockOptions2.click();
	}
	public void ClickOnContinueProcessingActionBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ContinueProcessingActionBlock));
		ContinueProcessingActionBlock.click();
	}
	public void SelectDecisionBlockListElem() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DecisionBlockList));
		DecisionBlockList.click();
	}
	public void ClickOnAddBtnDecisionBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(AddBtnDecisionBlock));
		AddBtnDecisionBlock.click();
	}
	public void ClickOnSaveBtnDecisionBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SaveBtnDecisionBlock));
		SaveBtnDecisionBlock.click();
	}
	public void ClickOnSaveBtnActionBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SaveBtnActionBlock));
		SaveBtnActionBlock.click();
	}
	public void ConnectDecisionBlock_To_assignmentBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DecisionBlockY));
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(AssignmentBlockInCanvas));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(DecisionBlockY)
        .pause(Duration.ofSeconds(0))
        .clickAndHold(DecisionBlockY)
        .pause(Duration.ofSeconds(0))
        .moveToElement(AssignmentBlockInCanvas)
        .pause(Duration.ofSeconds(0))
        .release().build().perform();
	}
	public void ConnectDecisionBlock_To_ActionBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DecisionBlockN));
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ActionBlockY));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(DecisionBlockN)
        .pause(Duration.ofSeconds(0))
        .clickAndHold(DecisionBlockN)
        .pause(Duration.ofSeconds(0))
        .moveToElement(ActionBlockY)
        .pause(Duration.ofSeconds(0))
        .release().build().perform();
	}
	public void DoubleClickOnAssignmentBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(AssignmentBlockInCanvas));
		Actions actions = new Actions(ldriver);
		//DecisionBlock.sendKeys("");
		actions.doubleClick(AssignmentBlockInCanvas).build().perform();
		actions.doubleClick(AssignmentBlockInCanvas).build().perform();
		
	}
	public void InputOnApiInAssignmentBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(InputApiNameInAssignmentBlock));
		InputApiNameInAssignmentBlock.click();
		InputApiNameInAssignmentBlock.sendKeys("_AutoTest");
	}
	public void InputOnDescInAssignmentBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DescInAssignmentBlock));
		DescInAssignmentBlock.click();
		DescInAssignmentBlock.sendKeys("Some Description through Automation Testing!!");
	}
	public void ClickOnDropDownAssignmentBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DropDownInAssignmentBlock));
		DropDownInAssignmentBlock.click();
	}
	public void SelectSalesRepInAssignmentBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectValueDropDown));
		SelectValueDropDown.click();
	}
	public void ClickOnDropDown2AssignmentBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DropDown2InAssignmentBlock));
		DropDown2InAssignmentBlock.click();
	}
	public void SelectSalesRepValueInAssignmentBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectValueDropDown2));
		SelectValueDropDown2.click();
	}
	public void CheckOnPreferHistoricState() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(PreferHistoricStateCheckBox));
		PreferHistoricStateCheckBox.click();
	}
	public void ClickOnLeadToContactAccount() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ConverLeadtoContactAccount));
		ConverLeadtoContactAccount.click();
	}
	public void ClickOnSelectAutoConversion() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectAutoConversion));
		SelectAutoConversion.click();
	}
	public void ConnectStartBlock_To_DecisionBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(StartArrow));
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DecisionBlock));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(StartArrow)
        .pause(Duration.ofSeconds(0))
        .clickAndHold(StartArrow)
        .pause(Duration.ofSeconds(0))
        .moveToElement(DecisionBlock)
        .pause(Duration.ofSeconds(0))
        .release().build().perform();
	}
	public void ClickOnApproveButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ApproveBtn));
		ApproveBtn.click();
	}
	public void ClickOnSaveButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SaveBtn));
		SaveBtn.click();
	}
	//************************************************************* Sanity Test Cases *****************************************************************
	
	
		
		
		
		//**************Update Data Value**************
	
		@FindBy(xpath = "//span[text()='Latitude']")
		WebElement SelectLatitudeForUpdateDataValue;

		@FindBy(xpath = "//span[text()='First Name']")
		WebElement SelectFirstNameForUpdateDataValue;
		@FindBy(xpath = "//span[text()='Converted Date']")
		WebElement SelectConvertedDateForUpdateDataValue;
	
		@FindBy(xpath = "//input[@placeholder='Enter Text']")
		WebElement EnterTextForFirstNameUpdateDataValue;
	

		
	
		
		@FindBy(xpath = "//span[text()='Lead ID']")
		WebElement ClickOnLeadIDoptionDetailsPage;
		@FindBy(xpath = "//mat-select[@name='valueSelect']")
		WebElement ClickOnLeadIDSecondListBoxDropDownDetailsPage;

		@FindBy(xpath = "//span[text()='Latitude']")
		WebElement ClickOnLatitudeOptionDetailsPage;
		@FindBy(xpath = "//span[text()='Converted Date']")
		WebElement ClickOnConvertedDateOptionDetailsPage;
	

		
		
		
		
		
		
		
		
		
		public void ClickOnConvertedDateOptionDetailsPage() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnConvertedDateOptionDetailsPage));
			ClickOnConvertedDateOptionDetailsPage.click();
		}
		public void ClickOnLatitudeOptionDetailsPage() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnLatitudeOptionDetailsPage));
			ClickOnLatitudeOptionDetailsPage.click();
		}
		
		public void ClickOnLeadIDSecondListBoxDropDownDetailsPage() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnLeadIDSecondListBoxDropDownDetailsPage));
			ClickOnLeadIDSecondListBoxDropDownDetailsPage.click();
		}
		public void ClickOnLeadIDoptionDetailsPage() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnLeadIDoptionDetailsPage));
			ClickOnLeadIDoptionDetailsPage.click();
		}
		
		public void EnterTextForFirstNameUpdateDataValue() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(EnterTextForFirstNameUpdateDataValue));
			EnterTextForFirstNameUpdateDataValue.clear();
			EnterTextForFirstNameUpdateDataValue.sendKeys("Automation");
		}
		
		public void SelectLatitudeForUpdateDataValue() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectLatitudeForUpdateDataValue));
			SelectLatitudeForUpdateDataValue.click();
		}
		
		public void SelectFirstNameForUpdateDataValue() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectFirstNameForUpdateDataValue));
			SelectFirstNameForUpdateDataValue.click();
		}
		public void SelectConvertedDateForUpdateDataValue() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectConvertedDateForUpdateDataValue));
			SelectConvertedDateForUpdateDataValue.click();
		}
		
		
		
		
		
		
		
		
		
		
		
		public void LeadFilterForLPWR_DND() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(LeadFilter));
			Actions actions = new Actions(ldriver);
			actions.moveToElement(LeadFilter)
	        .pause(Duration.ofSeconds(1))
	        .clickAndHold(LeadFilter)
	        .pause(Duration.ofSeconds(1))
	        .moveByOffset(-480,95) 
	        .moveByOffset(-480,95)
	        .pause(Duration.ofSeconds(1))
	        .release().build().perform();
		}
		
		
		//************************************************************* Sanity Test Cases *****************************************************************
		
	    @FindBy(xpath = "//div[contains(text(),' Account Filter ')]")
	    WebElement AccountFilter_DND;
		@FindBy(xpath = "(//div[@title='Drag to add new'])[6]")
		WebElement UpdateDataValue;
		@FindBy(xpath = "(//div[contains(@data-jtk-source-port-type,'action')])[2]")
		WebElement UpdateDataValueY;
		@FindBy(xpath = "(//div[contains(@data-jtk-source-port-type,'action')])[1]")
		WebElement ActionBlockConnectionDrag;
		@FindBy(xpath = "//div[@data-jtk-source-port-type='SyncToSDFC']")
		WebElement UpdateToCRMY;
		@FindBy(xpath = "//div[contains(text(),'Update to CRM')]")
		WebElement UpdateToCRM;
		@FindBy(xpath = "(//div[@title='Drag to add new'])[5]")
		WebElement RandomSplit;
		@FindBy(xpath = "(//div[@class='drag-start connect AConnection ng-star-inserted'])[1]")
		WebElement RandomSplitA;
		@FindBy(xpath = "(//div[@class='drag-start connect BConnection ng-star-inserted'])[1]")
		WebElement RandomSplitB;
		@FindBy(xpath = "(//div[@class='drag-start connect CConnection ng-star-inserted'])[1]")
		WebElement RandomSplitC;
		@FindBy(xpath = "//option[text()=' Custom Filter']")
		WebElement ClickOnCustomFilter;
		@FindBy(xpath = "//input[@formcontrolname='filterValue']")
		WebElement EnterCustomFilter;
		@FindBy(xpath = "//textarea[@placeholder='Description']")
		WebElement EnterDescriptionActionBlock;
		
		
		//**************Update Data Value**************
		@FindBy(xpath = "(//mat-expansion-panel//span[@class='ng-arrow-wrapper'])[1]")
		WebElement FirstListBoxDropdownForUpdateDataValue;
		@FindBy(xpath = "//span[text()='Billing Latitude']")
		WebElement SelectBillingLatitudeForUpdateDataValue;
		@FindBy(xpath = "//span[text()='Deleted']")
		WebElement SelectDeletedForUpdateDataValue;
		@FindBy(xpath = "//span[text()='Account Name']")
		WebElement SelectAccountNameForUpdateDataValue;
		@FindBy(xpath = "//span[text()='Created Date']")
		WebElement SelectCreatedDateForUpdateDataValue;
		@FindBy(xpath = "//div[contains(@id,'mat-select-value')]")
		WebElement SelectSecondListBoxForUpdateDataValue;
		@FindBy(xpath = "//input[@placeholder='Enter Number']")
		WebElement EnterNumberForLatitudeUpdateDataValue;
		@FindBy(xpath = "//input[@placeholder='Enter Text']")
		WebElement EnterTextForAccountNameUpdateDataValue;
		@FindBy(xpath = "(//div[@aria-haspopup='listbox'])[5]")
		WebElement SelectThirdListBoxdropdownForUpdateDataValue;
		@FindBy(xpath = "//button[@class='curly-breaket ng-star-inserted']")
		WebElement ClickOnInsertButtonThirdListBoxForUpdateDataValue;
		@FindBy(xpath = "//label[text()='Select Object']//..//span[@class='ng-arrow-wrapper']")
		WebElement ClickOnSelectObjectDropDownForUpdateDataValue;
		@FindBy(xpath = "//span[text()='Account']")
		WebElement SelectAccountInObjectDropDownUpdateDataValue;
		@FindBy(xpath = "//span[text()='Lead']")
		WebElement SelectLeadInObjectDropDownUpdateDataValue;
		@FindBy(xpath = "//span[text()='Account Owner']")
		WebElement SelectLeadOwnerInObjectDropDownUpdateDataValue;
		@FindBy(xpath = "//label[text()='Select Field']//..//span[@class='ng-arrow-wrapper']")
		WebElement ClickOnSelectFieldDropDownForUpdateDataValue;
		@FindBy(xpath = "(//div[@role='option'])[1]")
		WebElement ClickUserNameInSelectFieldUpdateDataValue;
		@FindBy(xpath = "//span[text()='True']")
		WebElement SelectTrueForDeletedOptionUpdateDataValue;
		@FindBy(xpath = "//span[text()='False']")
		WebElement SelectFalseForDeletedOptionUpdateDataValue;
		@FindBy(xpath = "//mat-icon[text()='unfold_more']")
		WebElement CollapseAll;
		@FindBy(xpath = "//input[@formcontrolname='decisionTitle']")
		WebElement ClickRondomPlace;
		@FindBy(xpath = "//span[text()='Save']")
		WebElement SaveButtonForUpdateDataValue;
		@FindBy(xpath = "//button//span[text()='Insert']")
		WebElement IncertButtonForUpdateDataValue;
		@FindBy(xpath = "(//*[name()='polygon'][@stroke='green'])[2]")
		WebElement UpdateDataValueForBorderColor;
		
		//**************Assignment Block**************
		@FindBy(xpath = "//span[text()=' Auto Convert Leads into Contact and/or Accounts ']//..//span[@class='mat-checkbox-inner-container']")
		WebElement ClickAutoConvertLeadsIntoContactCheckBox;
		@FindBy(xpath = "//div[text()=' Select Auto Conversion ']//..//mat-select[@role='combobox']")
		WebElement ClockAutoConvertLeadsIntoContactDropdown;
		@FindBy(xpath = "(//span[@class='custom-option-content'])[1]")
		WebElement SelectAutoConvertLeadsIntoContactOption;
		@FindBy(xpath = "//span[text()='Trigger Process/Flow Builder (to send email and more) ']//..//span[@class='mat-checkbox-inner-container']")
		WebElement ClickTriggerProcessOrFlowBuilderCheckBox;
		@FindBy(xpath = "//input[@formcontrolname='EmailAlertProcessBuilder']")
		WebElement EnterTextTriggerProcessOrFlowBuilder;
		@FindBy(xpath = "//span[text()='Send Notification Email ']//..//span[@class='mat-checkbox-inner-container']")
		WebElement ClickSendNotificationEmailCheckBox;
		@FindBy(xpath = "//div[text()=' Select Email Template ']//..//mat-select[@role='combobox']")
		WebElement ClickSendNotificationEmailDropDown;
		@FindBy(xpath = "(//span[@class='custom-option-content ng-star-inserted'])[1]")
		WebElement SlectSendNotificationEmailOption;
		@FindBy(xpath = "//span[text()='Assign to people with currently active working hours ']//..//span[@class='mat-checkbox-inner-container']")
		WebElement ClickAssignToPeopleWithCurrentlyActiveWorkingHoursCheckBox;
		@FindBy(xpath = "//span[text()='If no one is available, hold the account till someone is available ']//..//span[@class='mat-checkbox-inner-container']")
		WebElement ClickIfNoOneIsAvailableHoldTheLeadCheckBox;
		@FindBy(xpath = "//span[text()=' Create Task for the New Suggested owner ']//..//span[@class='mat-checkbox-inner-container']")
		WebElement ClickCreateTaskForTheNewSuggestedOwnerCheckBox;
		@FindBy(xpath = "//div[text()=' Task List is shown ']//..//mat-select[@role='combobox']")
		WebElement ClickCreateTaskForTheNewSuggestedOwnerDropDown;
		@FindBy(xpath = "(//span[@class='custom-option-content ng-star-inserted'])[1]")
		WebElement SlectCreateTaskForTheNewSuggestedOwnerOption;

		@FindBy(xpath = "(//mat-select[@role='combobox'])[2]")
		WebElement ClickAssignBasedFirstDropDown;
		@FindBy(xpath = "(//mat-select[@role='combobox'])[3]")
		WebElement ClickAssignBasedSecondDropDown;
		@FindBy(xpath = "//mat-select[@panelclass='matsearchdropdown']//span[text()='Select Mapped SDR']")
		WebElement ClickAEtoSDRDropDown;
		@FindBy(xpath = "//span[text()=' Prefer Historical Sales Person to Account Affinity while Assigning ']//..//span[@class='mat-checkbox-inner-container']")
		WebElement ClickPreferHistoricalSalesPersonCheckBox;
		@FindBy(xpath = "//span[text()='Skip Calendar Availability Check ']//..//span[@class='mat-checkbox-inner-container']")
		WebElement ClickSkipCalendarAvailabilityCheckBox;
		@FindBy(xpath = "//span[text()='Assign only to users if available on integrated calendar ']//..//span[@class='mat-checkbox-inner-container']")
		WebElement ClickAssignOnlyToUsersIfAvailableOnIntegratedCalendarCheckBox;
		@FindBy(xpath = "(//span[text()='Assign only to users if available on integrated calendar ']//..)[1]//input[@aria-checked='true']")
		WebElement DisplayedAssignOnlyToUsersIfAvailableOnIntegratedCalendarCheckBoxIsChecked;
		
		
		@FindBy(xpath = "//span[text()='Add Data Update']")
		WebElement ClickAddDataUpdateButton;
		@FindBy(xpath = "//input[@placeholder='Select Lead Attribute']")
		WebElement FirstInputBoxForAddDataUpdateButton;
		@FindBy(xpath = "((//div[@class='container-fluid'])[2]//mat-select[@role='combobox'])[1]")
		WebElement ClickOnSelect1BoxForAddDataUpdateButton;
		@FindBy(xpath = "((//div[@class='row multiplebarder'])[2]//mat-select[@role='combobox'])[1]")
		WebElement ClickOnSelectBoxDeletedForAddDataUpdateButton;
		@FindBy(xpath = "//mat-option//span[text()='Set to Text']")
		WebElement SelectSetToTextForAddDataUpdateButton;
		@FindBy(xpath = "//input[@formcontrolname='UpdateValue']")
		WebElement EnterTextForSetToTextOptionForAddDataUpdateButton;
		@FindBy(xpath = "//mat-option//span[text()='Set to Account Owner']")
		WebElement SelectSetToAccountOwnerForAddDataUpdateButton;
		@FindBy(xpath = "//mat-option//span[text()='Set to Opportunity Owner ']")
		WebElement SelectSetToOpportunityOwnerForAddDataUpdateButton;
		@FindBy(xpath = "//mat-option//span[text()='Set to Owner Mapped SDR’s ID']")
		WebElement SelectSetToOwnerMappedSDRForAddDataUpdateButton;
		@FindBy(xpath = "((//div[@class='container-fluid'])[2]//mat-select[@role='combobox'])[2]")
		WebElement ClickOnSelectBox2ForAddDataUpdateButton;
		
		@FindBy(xpath = "//span[text()=' Prefer Historical Sales Person to Account Affinity while Assigning ']//..//span[@class='mat-checkbox-inner-container']")
		WebElement ClickPreferHistoricalSalesPersonToAccountAffinityWhileAssigningCheckBox;
		@FindBy(xpath = "//span[text()=' Assign to AE mapped SDR instead ']//..//span[@class='mat-checkbox-inner-container']")
		WebElement ClickAssignToAEmappedSDRinsteadCheckBox;
		@FindBy(xpath = "(//mat-icon[text()='cancel'])[3]")
		WebElement ClickOnCrossMarkButton;
		
		@FindBy(xpath = "//app-search-dropdwon[@formcontrolname='ActionVal']//mat-select[@role='combobox']")
		WebElement SelectDropDownForAssignToQueue;
		@FindBy(xpath = "(//mat-option[@role='option'])[1]")
		WebElement SlectAssignToSalesRepOption;
		@FindBy(xpath = "(//span[@class='custom-option-content ng-star-inserted'])[1]")
		WebElement SlectSetUpAssignToSalesRepOption;
		@FindBy(xpath = "//mat-select[@formcontrolname='DefaultActionType']")
		WebElement SelectSubSelectBoxDropDownForLookUpOption;
		@FindBy(xpath = "//span[text()='Assign to Account Owner']")
		WebElement SelectAssignToAccountOwnerOption;
		@FindBy(xpath = "//app-search-dropdwon[@formcontrolname='DefaultActionValue']//mat-select[@role='combobox']")
		WebElement SelectSubAssignToSalesRepOptiondropdown;
		@FindBy(xpath = "//span[text()='Assign to Sales Rep']")
		WebElement SelectAssignToSalesRepOption;
		@FindBy(xpath = "//span[text()='Assign to Sales Team']")
		WebElement SelectAssignToSalesTeamOption;
		@FindBy(xpath = "//span[text()='Assign to Weighted Sales Team']")
		WebElement SelectAssignToWeightedSalesTeamOption;
		
		@FindBy(xpath = "//mat-icon[text()='fullscreen']")
		WebElement ClickOnMaximizeButton;
		@FindBy(xpath = "(//mat-icon[text()='fullscreen_exit'])[2]")
		WebElement ClickOnManimizeButton;
		
		@FindBy(xpath = "//span[text()='Account ID']")
		WebElement ClickOnAccountIDoptionDetailsPage;
		@FindBy(xpath = "//mat-select[@name='valueSelect']")
		WebElement ClickOnAccountIDSecondListBoxDropDownDetailsPage;
		@FindBy(xpath = "//mat-option//span[text()='Set to Opportunity Owner']")
		WebElement SelectSetToOpportunityOwnerForDetailsPage;
		@FindBy(xpath = "//mat-option//span[text()='Set to Owner Mapped ISR’s ID']")
		WebElement SelectSetToSetToOwnerMappedISRIDForDetailsPage;
		@FindBy(xpath = "//ng-select[@formcontrolname='UpdateValue']")
		WebElement ClickOnLeadIDThirdListBoxDropDownDetailsPage;
		@FindBy(xpath = "//span[text()='Deleted']")
		WebElement ClickOnDeletedOptionDetailsPage;
		@FindBy(xpath = "//mat-select[@formcontrolname='UpdateValue']")
		WebElement ClickOnSecondListBoxDropDownDeletedOptionDetailsPage;
		@FindBy(xpath = "//span[text()='Billing Latitude']")
		WebElement ClickOnBillingLatitudeOptionDetailsPage;
		@FindBy(xpath = "//span[text()='Created Date']")
		WebElement ClickOnCreatedDateOptionDetailsPage;
		@FindBy(xpath = "(//*[name()='polygon'][@class='inner'])[3]")
		WebElement DoubleClickUpdateToCRM;
		@FindBy(xpath = "(//*[name()='rect'][@class='inner'])[1]")
		WebElement DoubleClickRandomSplit;
		@FindBy(xpath = "//span[text()='Other Latitude']")
		WebElement ClickOnOtherLatitudeOptionDetailsPage;
		
		@FindBy(xpath = "//span[text()='Other Latitude']")
		WebElement SelectOtherLatitudeForUpdateDataValue;
		
		@FindBy(xpath = "//span[text()='Account ID']")
		WebElement SelectAccountIDForUpdateDataValue;
		
		@FindBy(xpath = "//div[contains(text(),' Contact Filter ')]")
		WebElement ContactFilter_DND;
		
		@FindBy(xpath = "//span[text()='Contact']")
		WebElement SelectContactInObjectDropDownUpdateDataValue;
		@FindBy(xpath = "//span[text()='Contact Owner']")
		WebElement SelectContactOwnerInObjectDropDownUpdateDataValue;
		
		@FindBy(xpath = "//span[text()='If no one is available, hold the contact till someone is available ']//..//span[@class='mat-checkbox-inner-container']")
		WebElement ClickIfNoOneIsAvailableHoldTheContactCheckBox;
		
		
		
		
		
		
		
		
		
		
		public void ClickIfNoOneIsAvailableHoldTheContactCheckBox() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickIfNoOneIsAvailableHoldTheContactCheckBox));
			ClickIfNoOneIsAvailableHoldTheContactCheckBox.click();
		}
		
		public void SelectContactOwnerInObjectDropDownUpdateDataValue() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectContactOwnerInObjectDropDownUpdateDataValue));
			SelectContactOwnerInObjectDropDownUpdateDataValue.click();
		}
		public void SelectContactInObjectDropDownUpdateDataValue() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectContactInObjectDropDownUpdateDataValue));
			SelectContactInObjectDropDownUpdateDataValue.click();
		}
		
		public void SelectAccountIDForUpdateDataValue() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectAccountIDForUpdateDataValue));
			SelectAccountIDForUpdateDataValue.click();
		}
		public void SelectOtherLatitudeForUpdateDataValue() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectOtherLatitudeForUpdateDataValue));
			SelectOtherLatitudeForUpdateDataValue.click();
		}
		
		public void ClickOnOtherLatitudeOptionDetailsPage() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnOtherLatitudeOptionDetailsPage));
			ClickOnOtherLatitudeOptionDetailsPage.click();
		}
		public void DoubleClickOnRandomSplit() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DoubleClickRandomSplit));
			Actions actions = new Actions(ldriver);
			//DecisionBlock.sendKeys("");
			actions.doubleClick(DoubleClickRandomSplit).build().perform();
			actions.doubleClick(DoubleClickRandomSplit).build().perform();
			
		}
		public void DoubleClickOnUpdateToCRM_Block() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DoubleClickUpdateToCRM));
			Actions actions = new Actions(ldriver);
			actions.doubleClick(DoubleClickUpdateToCRM).build().perform();
			actions.doubleClick(DoubleClickUpdateToCRM).build().perform();
			
		}
		
		
		public void ClickOnCreatedDateOptionDetailsPage() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnCreatedDateOptionDetailsPage));
			ClickOnCreatedDateOptionDetailsPage.click();
		}
		public void ClickOnBillingLatitudeOptionDetailsPage() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnBillingLatitudeOptionDetailsPage));
			ClickOnBillingLatitudeOptionDetailsPage.click();
		}
		public void ClickOnSecondListBoxDropDownDeletedOptionDetailsPage() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnSecondListBoxDropDownDeletedOptionDetailsPage));
			ClickOnSecondListBoxDropDownDeletedOptionDetailsPage.click();
		}
		public void ClickOnDeletedOptionDetailsPage() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnDeletedOptionDetailsPage));
			ClickOnDeletedOptionDetailsPage.click();
		}
		public void ClickOnLeadIDThirdListBoxDropDownDetailsPage() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnLeadIDThirdListBoxDropDownDetailsPage));
			ClickOnLeadIDThirdListBoxDropDownDetailsPage.click();
		}
		public void SelectSetToSetToOwnerMappedISRIDForDetailsPage() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectSetToSetToOwnerMappedISRIDForDetailsPage));
			SelectSetToSetToOwnerMappedISRIDForDetailsPage.click();
		}
		public void SelectSetToOpportunityOwnerForDetailsPage() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectSetToOpportunityOwnerForDetailsPage));
			SelectSetToOpportunityOwnerForDetailsPage.click();
		}
		public void ClickOnAccountIDSecondListBoxDropDownDetailsPage() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnAccountIDSecondListBoxDropDownDetailsPage));
			ClickOnAccountIDSecondListBoxDropDownDetailsPage.click();
		}
		public void ClickOnAccountIDoptionDetailsPage() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnAccountIDoptionDetailsPage));
			ClickOnAccountIDoptionDetailsPage.click();
		}
		public void ClickOnManimizeButton() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnManimizeButton));
			ClickOnManimizeButton.click();
		}
		public void ClickOnMaximizeButton() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnMaximizeButton));
			ClickOnMaximizeButton.click();
		}
		public void SelectAssignToWeightedSalesTeamOption() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectAssignToWeightedSalesTeamOption));
			SelectAssignToWeightedSalesTeamOption.click();
		}
		public void SelectAssignToSalesTeamOption() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectAssignToSalesTeamOption));
			SelectAssignToSalesTeamOption.click();
		}
		public void SelectAssignToSalesRepOption() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectAssignToSalesRepOption));
			SelectAssignToSalesRepOption.click();
		}
		public void SelectSubAssignToSalesRepOptiondropdown() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectSubAssignToSalesRepOptiondropdown));
			SelectSubAssignToSalesRepOptiondropdown.click();
		}
		public void SelectAssignToAccountOwnerOption() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectAssignToAccountOwnerOption));
			SelectAssignToAccountOwnerOption.click();
		}
		public void SelectSubSelectBoxDropDownForLookUpOption() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectSubSelectBoxDropDownForLookUpOption));
			SelectSubSelectBoxDropDownForLookUpOption.click();
		}
		public void SlectAssignToSalesRepOption() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SlectAssignToSalesRepOption));
			SlectAssignToSalesRepOption.click();
		}
		public void SlectSetUpAssignToSalesRepOption() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SlectSetUpAssignToSalesRepOption));
			SlectSetUpAssignToSalesRepOption.click();
		}
		public void SelectDropDownForAssignToQueue() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectDropDownForAssignToQueue));
			SelectDropDownForAssignToQueue.click();
		}
		public void ClickOnCrossMarkButton() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnCrossMarkButton));
			ClickOnCrossMarkButton.click();
		}
		public void ClickAssignToAEmappedSDRinsteadCheckBox() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickAssignToAEmappedSDRinsteadCheckBox));
			ClickAssignToAEmappedSDRinsteadCheckBox.click();
		}
		public void ClickPreferHistoricalSalesPersonToAccountAffinityWhileAssigningCheckBox() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickPreferHistoricalSalesPersonToAccountAffinityWhileAssigningCheckBox));
			ClickPreferHistoricalSalesPersonToAccountAffinityWhileAssigningCheckBox.click();
		}
		public void ClickOnSelectBox2ForAddDataUpdateButton() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnSelectBox2ForAddDataUpdateButton));
			ClickOnSelectBox2ForAddDataUpdateButton.click();
		}
		public void SelectSetToOwnerMappedSDRForAddDataUpdateButton() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectSetToOwnerMappedSDRForAddDataUpdateButton));
			SelectSetToOwnerMappedSDRForAddDataUpdateButton.click();
		}
		public void SelectSetToOpportunityOwnerForAddDataUpdateButton() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectSetToOpportunityOwnerForAddDataUpdateButton));
			SelectSetToOpportunityOwnerForAddDataUpdateButton.click();
		}
		public void SelectSetToAccountOwnerForAddDataUpdateButton() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectSetToAccountOwnerForAddDataUpdateButton));
			SelectSetToAccountOwnerForAddDataUpdateButton.click();
		}
		public void EnterTextForSetToTextOptionForAddDataUpdateButton() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(EnterTextForSetToTextOptionForAddDataUpdateButton));
			EnterTextForSetToTextOptionForAddDataUpdateButton.clear();
			EnterTextForSetToTextOptionForAddDataUpdateButton.sendKeys("Automation121");
		}
		public void SelectSetToTextForAddDataUpdateButton() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectSetToTextForAddDataUpdateButton));
			SelectSetToTextForAddDataUpdateButton.click();
		}
		public void ClickOnSelect1BoxForAddDataUpdateButton() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnSelect1BoxForAddDataUpdateButton));
			ClickOnSelect1BoxForAddDataUpdateButton.click();
		}
		public void ClickOnSelectBoxDeletedForAddDataUpdateButton() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnSelectBoxDeletedForAddDataUpdateButton));
			ClickOnSelectBoxDeletedForAddDataUpdateButton.click();
		}
		public void FirstInputBoxForAddDataUpdateButton() throws AWTException, InterruptedException {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(FirstInputBoxForAddDataUpdateButton));
			FirstInputBoxForAddDataUpdateButton.clear();  
		}


		public void ClickAddDataUpdateButton() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickAddDataUpdateButton));
			ClickAddDataUpdateButton.click();
		}
		public void ClickAssignBasedFirstDropDown() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickAssignBasedFirstDropDown));
			ClickAssignBasedFirstDropDown.click();
		}
		public void ClickAEtoSDRDropDown() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickAEtoSDRDropDown));
			ClickAEtoSDRDropDown.click();
		}
		public void ClickAssignBasedSecondDropDown() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickAssignBasedSecondDropDown));
			ClickAssignBasedSecondDropDown.click();
		}
		public void ClickPreferHistoricalSalesPersonCheckBox() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickPreferHistoricalSalesPersonCheckBox));
			ClickPreferHistoricalSalesPersonCheckBox.click();
		}
		public void ClickSkipCalendarAvailabilityCheckBox() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickSkipCalendarAvailabilityCheckBox));
			ClickSkipCalendarAvailabilityCheckBox.click();
		}
		public void ClickAssignOnlyToUsersIfAvailableOnIntegratedCalendarCheckBox() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickAssignOnlyToUsersIfAvailableOnIntegratedCalendarCheckBox));
			ClickAssignOnlyToUsersIfAvailableOnIntegratedCalendarCheckBox.click();
		}
		public boolean DisplayedAssignOnlyToUsersIfAvailableOnIntegratedCalendarCheckBoxIsChecked() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedAssignOnlyToUsersIfAvailableOnIntegratedCalendarCheckBoxIsChecked));
			return DisplayedAssignOnlyToUsersIfAvailableOnIntegratedCalendarCheckBoxIsChecked.isDisplayed();
	       }
		
		public void ClickAutoConvertLeadsIntoContactCheckBox() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickAutoConvertLeadsIntoContactCheckBox));
			ClickAutoConvertLeadsIntoContactCheckBox.click();
		}
		public void ClickAutoConvertLeadsIntoContactDropdown() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClockAutoConvertLeadsIntoContactDropdown));
			ClockAutoConvertLeadsIntoContactDropdown.click();
		}
		public void SelectAutoConvertLeadsIntoContactOption() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectAutoConvertLeadsIntoContactOption));
			SelectAutoConvertLeadsIntoContactOption.click();
		}
		public void ClickTriggerProcessOrFlowBuilderCheckBox() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickTriggerProcessOrFlowBuilderCheckBox));
			ClickTriggerProcessOrFlowBuilderCheckBox.click();
		}
		public void EnterTextTriggerProcessOrFlowBuilder() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(EnterTextTriggerProcessOrFlowBuilder));
			EnterTextTriggerProcessOrFlowBuilder.clear();
			EnterTextTriggerProcessOrFlowBuilder.sendKeys("Automation1210");
		}
		public void ClickSendNotificationEmailCheckBox() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickSendNotificationEmailCheckBox));
			ClickSendNotificationEmailCheckBox.click();
		}
		public void ClickSendNotificationEmailDropDown() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickSendNotificationEmailDropDown));
			ClickSendNotificationEmailDropDown.click();
		}
		public void SelectSendNotificationEmailOption() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SlectSendNotificationEmailOption));
			SlectSendNotificationEmailOption.click();
		}
		public void ClickAssignToPeopleWithCurrentlyActiveWorkingHoursCheckBox() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickAssignToPeopleWithCurrentlyActiveWorkingHoursCheckBox));
			ClickAssignToPeopleWithCurrentlyActiveWorkingHoursCheckBox.click();
		}
		public void ClickIfNoOneIsAvailableHoldTheLeadCheckBox() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickIfNoOneIsAvailableHoldTheLeadCheckBox));
			ClickIfNoOneIsAvailableHoldTheLeadCheckBox.click();
		}
		public void ClickCreateTaskForTheNewSuggestedOwnerCheckBox() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickCreateTaskForTheNewSuggestedOwnerCheckBox));
			ClickCreateTaskForTheNewSuggestedOwnerCheckBox.click();
		}
		public void ClickCreateTaskForTheNewSuggestedOwnerDropDown() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickCreateTaskForTheNewSuggestedOwnerDropDown));
			ClickCreateTaskForTheNewSuggestedOwnerDropDown.click();
		}
		public void SelectCreateTaskForTheNewSuggestedOwnerOption() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SlectCreateTaskForTheNewSuggestedOwnerOption));
			SlectCreateTaskForTheNewSuggestedOwnerOption.click();
		}
		
		
		
		
		//**********************Add data Update ********************
		
				@FindBy(xpath = "//span[text()='Created Date']")
				WebElement ClickOnCreatedDateOptionForAddDataUpdate;
				@FindBy(xpath = "//span[text()='Other Latitude']")
				WebElement ClickOnOtherLatitudeOptionForAddDataUpdate;
				@FindBy(xpath = "//span[text()='Deleted']")
				WebElement ClickOnDeletedOptionForAddDataUpdate;
				@FindBy(xpath = "//span[text()='Email']")
				WebElement ClickOnEmailOptionForAddDataUpdate;
				@FindBy(xpath = "//span[text()=' Route to latest owner in the Custom Group ']//..//span[@class='mat-checkbox-inner-container']")
				WebElement ClickRouteToLatestOwnerInTheCustomGroupCheckBox;
				@FindBy(xpath = "(//ng-select[@formcontrolname='UpdateAttributeVkrName'])[1]")
				WebElement EmailDropDownForAddDataUpdateButton;
				@FindBy(xpath = "(//ng-select[@formcontrolname='UpdateAttributeVkrName'])[2]")
				WebElement DeletedDropDownForAddDataUpdateButton;
				@FindBy(xpath = "(//ng-select[@formcontrolname='UpdateAttributeVkrName'])[3]")
				WebElement LatitudeDropDownForAddDataUpdateButton;
				@FindBy(xpath = "(//span[@class='custom-option-content'])[1]")
				WebElement SelectOptionForAddDataUpdate;
			
				
				
				public void ClickOnEmailOptionForAddDataUpdate() {
					new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnEmailOptionForAddDataUpdate));
					ClickOnEmailOptionForAddDataUpdate.click();
				}
				public void EmailDropDownForAddDataUpdateButton(){
					new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(EmailDropDownForAddDataUpdateButton));
					EmailDropDownForAddDataUpdateButton.click(); 
				}
				public void SelectOptionForAddDataUpdate() {
					new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectOptionForAddDataUpdate));
					SelectOptionForAddDataUpdate.click();
				}
				public void DeletedDropDownForAddDataUpdateButton(){
					new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DeletedDropDownForAddDataUpdateButton));
					DeletedDropDownForAddDataUpdateButton.click(); 
				}
				

				public void ClickOnCreatedDateOptionForAddDataUpdate() {
					new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnCreatedDateOptionForAddDataUpdate));
					ClickOnCreatedDateOptionForAddDataUpdate.click();
				}
				public void ClickOnOtherLatitudeOptionForAddDataUpdate() {
					new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnOtherLatitudeOptionForAddDataUpdate));
					ClickOnOtherLatitudeOptionForAddDataUpdate.click();
				}
				public void ClickOnDeletedOptionForAddDataUpdate() {
					new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnDeletedOptionForAddDataUpdate));
					ClickOnDeletedOptionForAddDataUpdate.click();
				}
				
				public void ClickRouteToLatestOwnerInTheCustomGroupCheckBox() {
					new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickRouteToLatestOwnerInTheCustomGroupCheckBox));
					ClickRouteToLatestOwnerInTheCustomGroupCheckBox.click();
				}
				public void LatitudeOrCreatedDateDropDownForAddDataUpdateButton(){
					new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(LatitudeDropDownForAddDataUpdateButton));
					LatitudeDropDownForAddDataUpdateButton.click(); 
				}
				
				//**************************************************
				
		
		
		
		
		
		
		
		
		
		
		public boolean DisplayUpdateDataValueForBorderColor() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(UpdateDataValueForBorderColor));
	        return UpdateDataValueForBorderColor.isDisplayed();
		}
		public void ClickOnSaveButtonForUpdateDataValue() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SaveButtonForUpdateDataValue));
			SaveButtonForUpdateDataValue.click();
		}
		public void IncertButtonForUpdateDataValue() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(IncertButtonForUpdateDataValue));
			IncertButtonForUpdateDataValue.click();
		}
		public void ClickRondomPlace() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickRondomPlace));
			ClickRondomPlace.click();
		}
		public void CollapseAll() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CollapseAll));
			CollapseAll.click();
		}
		public void SelectFalseForDeletedOptionUpdateDataValue() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectFalseForDeletedOptionUpdateDataValue));
			SelectFalseForDeletedOptionUpdateDataValue.click();
		}
		public void SelectTrueForDeletedOptionUpdateDataValue() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectTrueForDeletedOptionUpdateDataValue));
			SelectTrueForDeletedOptionUpdateDataValue.click();
		}
		public void ClickUserNameInSelectFieldUpdateDataValue() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickUserNameInSelectFieldUpdateDataValue));
			ClickUserNameInSelectFieldUpdateDataValue.click();
		}
		public void SelectLeadOwnerInObjectDropDownUpdateDataValue() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectLeadOwnerInObjectDropDownUpdateDataValue));
			SelectLeadOwnerInObjectDropDownUpdateDataValue.click();
		}
		public void SelectLeadInObjectDropDownUpdateDataValue() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectLeadInObjectDropDownUpdateDataValue));
			SelectLeadInObjectDropDownUpdateDataValue.click();
		}
		public void SelectAccountInObjectDropDownUpdateDataValue() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectAccountInObjectDropDownUpdateDataValue));
			SelectAccountInObjectDropDownUpdateDataValue.click();
		}
		public void ClickOnSelectFieldDropDownForUpdateDataValue() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnSelectFieldDropDownForUpdateDataValue));
			ClickOnSelectFieldDropDownForUpdateDataValue.click();
		}
		public void ClickOnSelectObjectDropDownForUpdateDataValue() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnSelectObjectDropDownForUpdateDataValue));
			ClickOnSelectObjectDropDownForUpdateDataValue.click();
		}
		public void ClickOnInsertButtonThirdListBoxForUpdateDataValue() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnInsertButtonThirdListBoxForUpdateDataValue));
			ClickOnInsertButtonThirdListBoxForUpdateDataValue.click();
		}
		public void SelectThirdListBoxdropdownForUpdateDataValue() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectThirdListBoxdropdownForUpdateDataValue));
			SelectThirdListBoxdropdownForUpdateDataValue.click();
		}
		public void EnterTextForAccountNameUpdateDataValue() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(EnterTextForAccountNameUpdateDataValue));
			EnterTextForAccountNameUpdateDataValue.clear();
			EnterTextForAccountNameUpdateDataValue.sendKeys("Automation");
		}
		public void EnterNumberForLatitudeUpdateDataValue() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(EnterNumberForLatitudeUpdateDataValue));
			EnterNumberForLatitudeUpdateDataValue.clear();
			EnterNumberForLatitudeUpdateDataValue.sendKeys("1210");
		}
		public void SelectSecondListBoxForUpdateDataValue() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectSecondListBoxForUpdateDataValue));
			SelectSecondListBoxForUpdateDataValue.click();
		}
		public void FirstListBoxDropdownForUpdateDataValue() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(FirstListBoxDropdownForUpdateDataValue));
			FirstListBoxDropdownForUpdateDataValue.click();
		}
		public void SelectBillingLatitudeForUpdateDataValue() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectBillingLatitudeForUpdateDataValue));
			SelectBillingLatitudeForUpdateDataValue.click();
		}
		public void SelectDeletedForUpdateDataValue() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectDeletedForUpdateDataValue));
			SelectDeletedForUpdateDataValue.click();
		}
		public void SelectAccountNameForUpdateDataValue() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectAccountNameForUpdateDataValue));
			SelectAccountNameForUpdateDataValue.click();
		}
		public void SelectCreatedDateForUpdateDataValue() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectCreatedDateForUpdateDataValue));
			SelectCreatedDateForUpdateDataValue.click();
		}
		
		
		
		
		
		
		
		
		
		
		public void ClickOnCustomFilter() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnCustomFilter));
			ClickOnCustomFilter.click();
		}
		public void EnterCustomFilter() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(EnterCustomFilter));
			EnterCustomFilter.click();
			EnterCustomFilter.sendKeys("(1)");
		}
		public void EnterDescriptionActionBlock() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(EnterDescriptionActionBlock));
			EnterDescriptionActionBlock.clear();
			EnterDescriptionActionBlock.sendKeys("Automation Testing is Going on");
		}
		public void AccountFilter_DND() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ContactFilter_DND));
			Actions actions = new Actions(ldriver);
			actions.moveToElement(ContactFilter_DND)
	        .pause(Duration.ofSeconds(1))
	        .clickAndHold(ContactFilter_DND)
	        .pause(Duration.ofSeconds(1))
	        .moveByOffset(-480,95) 
	        .moveByOffset(-480,95)
	        .pause(Duration.ofSeconds(1))
	        .release().build().perform();
		}
	
		public void ActionBlockLPWR_DND() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ActionBlock));
			Actions actions = new Actions(ldriver);
			actions.moveToElement(ActionBlock)
	        .pause(Duration.ofSeconds(1))
	        .clickAndHold(ActionBlock)
	        .pause(Duration.ofSeconds(1))
	        .moveByOffset(-350,115) //change the x, y values to be applicable for your cases
	        .moveByOffset(-350,115)
	        .pause(Duration.ofSeconds(1))
	        .release().build().perform();
		}
		public void UpdateDataValueLPWR_DND() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(UpdateDataValue));
			Actions actions = new Actions(ldriver);
			actions.moveToElement(UpdateDataValue)
	        .pause(Duration.ofSeconds(1))
	        .clickAndHold(UpdateDataValue)
	        .pause(Duration.ofSeconds(1))
	        .moveByOffset(-85,40) 
	        .moveByOffset(-85,40)
	        .pause(Duration.ofSeconds(1))
	        .release().build().perform();
		}
		public void UpdateToCRM_LPWR_DND() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(UpdateToCRM));
			Actions actions = new Actions(ldriver);
			actions.moveToElement(UpdateToCRM)
	        .pause(Duration.ofSeconds(1))
	        .clickAndHold(UpdateToCRM)
	        .pause(Duration.ofSeconds(1))
	        .moveByOffset(-85,-100) //change the x, y values to be applicable for your cases
	        .moveByOffset(-85,-100)
	        .pause(Duration.ofSeconds(1))
	        .release().build().perform();
		}
		public void AssignmentBlockLPWR_DND() {
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
		public void RandomSplit_DND() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(RandomSplit));
			Actions actions = new Actions(ldriver);
			actions.moveToElement(RandomSplit)
	        .pause(Duration.ofSeconds(1))
	        .clickAndHold(RandomSplit)
	        .pause(Duration.ofSeconds(1))
	        .moveByOffset(-130,10) 
	        .moveByOffset(-130,10)
	        .pause(Duration.ofSeconds(1))
	        .release().build().perform();
		}
		public void ConnectActionBlock_To_UpdateDataValueBlock() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ActionBlockConnectionDrag));
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(UpdateDataValueY));
			Actions actions = new Actions(ldriver);
			actions.moveToElement(ActionBlockConnectionDrag)
	        .pause(Duration.ofSeconds(0))
	        .clickAndHold(ActionBlockConnectionDrag)
	        .pause(Duration.ofSeconds(0))
	        .moveToElement(UpdateDataValueY)
	        .pause(Duration.ofSeconds(0))
	        .release().build().perform();
		}
		public void ConnectUpdateDataValuelock_To_UpdateToCrmBlock() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(UpdateDataValueY));
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(UpdateToCRMY));
			Actions actions = new Actions(ldriver);
			actions.moveToElement(UpdateDataValueY)
	        .pause(Duration.ofSeconds(0))
	        .clickAndHold(UpdateDataValueY)
	        .pause(Duration.ofSeconds(0))
	        .moveToElement(UpdateToCRMY)
	        .pause(Duration.ofSeconds(0))
	        .release().build().perform();
		}
		public void ConnectionUpdateToCRM_To_RandomSplit() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(UpdateToCRMY));
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(RandomSplitA));
			Actions actions = new Actions(ldriver);
			actions.moveToElement(UpdateToCRMY)
	        .pause(Duration.ofSeconds(1))
	        .clickAndHold(UpdateToCRMY)
	        .pause(Duration.ofSeconds(1))
	        .moveToElement(RandomSplitA)
	        .pause(Duration.ofSeconds(1))
	        .release().build().perform();
		}
		public void ConnectionRandomSlitA_To_AssignmentBlock() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(RandomSplitA));
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(AssignmentBlockInCanvas));
			Actions actions = new Actions(ldriver);
			actions.moveToElement(RandomSplitA)
	        .pause(Duration.ofSeconds(1))
	        .clickAndHold(RandomSplitA)
	        .pause(Duration.ofSeconds(1))
	        .moveToElement(AssignmentBlockInCanvas)
	        .pause(Duration.ofSeconds(1))
	        .release().build().perform();
		}
		public void ConnectionRandomSlitB_To_ActionBlock() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(RandomSplitB));
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ActionBlockConnectionDrag));
			Actions actions = new Actions(ldriver);
			actions.moveToElement(RandomSplitB)
	        .pause(Duration.ofSeconds(1))
	        .clickAndHold(RandomSplitB)
	        .pause(Duration.ofSeconds(1))
	        .moveToElement(ActionBlockConnectionDrag)
	        .pause(Duration.ofSeconds(1))
	        .release().build().perform();
		}
		public void ConnectionRandomSlitC_To_UpdateDataValue() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(RandomSplitC));
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(UpdateDataValueY));
			Actions actions = new Actions(ldriver);
			actions.moveToElement(RandomSplitC)
	        .pause(Duration.ofSeconds(1))
	        .clickAndHold(RandomSplitC)
	        .pause(Duration.ofSeconds(1))
	        .moveToElement(UpdateDataValueY)
	        .pause(Duration.ofSeconds(1))
	        .release().build().perform();
		}
		
		
		
		


}
