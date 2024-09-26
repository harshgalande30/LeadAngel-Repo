package com.leadAngel.pageObjects;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DetailsPage_SalesTeam {
	
	WebDriver ldriver;
	
	public DetailsPage_SalesTeam(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//span[@class='mat-tooltip-trigger tabtooltip']")                   //(//i[text()='description'])
	WebElement detailsbutton;
	
	@FindBy(xpath="//i[text()='drafts']")
	WebElement Draftbutton;
	
	@FindBy(xpath="//button//span//mat-icon[text()='edit']")
	WebElement btnDescEdit;
	
	@FindBy(xpath="//textarea[@id='menudesc']")
	WebElement InputDesc;
	
	@FindBy(xpath="//span[text()=' Save ']")
	WebElement btnSaveDesc;
	@FindBy(xpath="(//span[text()=' Save '])[2]")
	WebElement btnSaveDescRRT;
	@FindBy(xpath="//span[text()=' Save ']")
	WebElement btnSaveDescForAccList;
	
	
	@FindBy(xpath="//mat-card-content[text()='Object created  via Docker Containers By Robin!!!']")
	WebElement DescVerifyMsg;
	
	@FindBy(xpath="//ng-select[@id='DefaultOwnerSelectBox']")
	WebElement ClickQueueOwner;
	
	@FindBy(xpath="(//div[@role='option'])[1]")
	WebElement SelectQueueOwner;
	
	@FindBy(xpath="//mat-icon[text()='check_box']")
	WebElement ClickOnCheckBox;
	
	@FindBy(xpath="//div[contains(text(),'Success')]")
	WebElement DisplaySuccess;
	@FindBy(xpath="(//div[text()='Successful'])[1]")
	WebElement DisplaySuccessForLeadRouter;
	
	@FindBy(xpath="//span[@class='ng-arrow-wrapper']")
	WebElement DefaultLeadOwnerDropDown;
	
	@FindBy(xpath = "(//div[@role='option'])[2]")
	WebElement DefaultLeadOwnerSelectAllaLebedevaOption;
	//************************************details page for lead processing without routing*********************
	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[1]")
	WebElement SuggestedNewOwnerDropDown;
	
	@FindBy(xpath = "(//div[@role='option'])[1]")
	WebElement SelectSuggestedNewOwnerOption;
	
	@FindBy(xpath = "(//mat-icon[text()='check_box'])[1]")
	WebElement CheckBoxForSuggestedNewOwner;
	
	@FindBy(xpath="(//div[contains(text(),'Success')])[1]")
	WebElement DisplaySuccessForSuggestedNewOwner;
	
	@FindBy(xpath="(//div[contains(text(),'Saved successfully')])[1]")
	WebElement DisplaySuccessForCRMinApp;
	//***************************************************************
	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[2]")
	WebElement LeadProcessingFeederFilterDropDown;
	
	@FindBy(xpath = "(//div[@role='option'])[1]")
	WebElement SelectLeadProcessingFeederFilterOption;
	
	@FindBy(xpath = "(//mat-icon[text()='check_box'])[2]")
	WebElement CheckBoxForLeadProcessingFeederFilter;
	
	@FindBy(xpath="(//div[contains(text(),'Success')])[2]")
	WebElement DisplaySuccessForLeadProcessingFeederFilter;
	//***************************************************************

	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[3]")
	WebElement DefaultLeadOwnerDropDownforLPWRDropDown;
	
	@FindBy(xpath = "(//div[@role='option'])[1]")
	WebElement SelectDefaultLeadOwnerLPWROption;
	
	@FindBy(xpath = "(//mat-icon[text()='check_box'])[3]")
	WebElement CheckBoxForDefaultLeadOwnerLPWR;
	
	@FindBy(xpath="(//div[contains(text(),'Success')])[3]")
	WebElement DisplaySuccessForDefaultLeadOwnerLPWR;
	//***************************************************************

	@FindBy(xpath = "//mat-icon[text()='add_circle']")
	WebElement DataValueUpdateWhenRoutedToDefaultLeadOwnerAddButton;
	
	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[4]")
	WebElement DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown1;
	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[2]")
	WebElement DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown1ForLeadRouter;
	
	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[3]")
	WebElement DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown1ForEscalationCondition;
	
	
	
	
	@FindBy(xpath = "(//div[@role='option'])[1]")
	WebElement SelectDataValueUpdateWhenRoutedToDefaultLeadOwnerOption1;
	
	
	
	@FindBy(xpath = "//mat-select[@name='valueSelect']")
	WebElement DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown2;
	
	@FindBy(xpath = "(//mat-option[@role='option'])[3]")
	WebElement SelectDataValueUpdateWhenRoutedToDefaultLeadOwnerOption2;
	
	@FindBy(xpath = "(//mat-icon[text()='check_box'])[4]")
	WebElement CheckBoxForDataValueUpdateWhenRoutedToDefaultLeadOwner;
	@FindBy(xpath = "(//mat-icon[text()='check_box'])[2]")
	WebElement CheckBoxForDataValueUpdateWhenRoutedToDefaultLeadOwnerForLeadRouter;
	
	@FindBy(xpath = "(//mat-icon[text()='check_box'])[3]")
	WebElement CheckBoxForDataValueUpdateWhenRoutedToDefaultLeadOwnerForEscalationRouter;
	
	@FindBy(xpath="(//div[contains(text(),'Success')])[4]")
	WebElement DisplaySuccessForDataValueUpdateWhenRoutedToDefaultLeadOwner;
	
	//************************************details page for Forms****************************************

	@FindBy(xpath="//ng-select[@bindlabel='SubMenuName']")
	WebElement LeadRouterDropDown;

	@FindBy(xpath="(//span[@class='custom-option-content ng-star-inserted'])[1]")
	WebElement SelectLeadRouterOption;
	@FindBy(xpath="(//mat-icon[text()='check_box'])[1]")
	WebElement LeadRouterCheckBoxForForms;
	
	@FindBy(xpath="//div[(text()='Success')]")
	WebElement DislaySuccessMessage;
	
	@FindBy(xpath="//input[@formcontrolname='DefaultCalendarLink']")
	WebElement InputForDefaulCalender;
	@FindBy(xpath="(//mat-icon[text()='check_box'])[2]")
	WebElement DefaulCalenderCheckBox;
	
	@FindBy(xpath="//input[@formcontrolname='callbackUrl']")
	WebElement InputForThankYouPage;
	@FindBy(xpath="(//mat-icon[text()='check_box'])[3]")
	WebElement ThankYouPageCheckBox;
	
	@FindBy(xpath="(//input[@class='mat-radio-input'])[1]")
	WebElement ClickOnReDirectOption1CheckBox;
	
	@FindBy(xpath="(//input[@class='mat-radio-input'])[3]")
	WebElement PersonalMeetingLinkDetails1CheckBox;
	@FindBy(xpath="//mat-radio-button[@value='CRMCalendarLink']")
	WebElement PersonalMeetingLinkDetails2CheckBox;
	@FindBy(xpath="(//span[@class='ng-arrow-wrapper'])[2]")
	WebElement ClickOnPersonalMeetingLinkDetails2DropDown;
	@FindBy(xpath="//span[text()='Calendar URL']")
	WebElement SelectPersonalMeetingLinkDetails2Option;
	
	
	@FindBy(xpath="//li[text()=' Web To Lead Form ']")
	WebElement ClickOnWebToLead;
	//************************************details page for RRT****************************************

	@FindBy(xpath="//span[@class='ng-arrow-wrapper']")
	WebElement ClickOnQueOwnerInDetailsPageDropDown;
	@FindBy(xpath="(//div[@role='option'])[1]")
	WebElement SelectOnQueOwnerInDetailsPageOption;
	@FindBy(xpath="(//span[@class='mat-checkbox-inner-container'])[1]")
	WebElement ClickOnQueOwnerInDetailsPageCheckBox1;
	@FindBy(xpath="(//span[@class='mat-checkbox-inner-container'])[2]")
	WebElement ClickOnQueOwnerInDetailsPageCheckBox2;
	@FindBy(xpath="//span[text()=' Save ']")
	WebElement ClockOnSaveButtonForQueOwnerInDetailsPage;
	
	
	//****************************************************************************************************
	public void ClickOnQueOwnerInDetailsPageDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnQueOwnerInDetailsPageDropDown));
		ClickOnQueOwnerInDetailsPageDropDown.click();
	}
	public void SelectOnQueOwnerInDetailsPageOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(SelectOnQueOwnerInDetailsPageOption));
		SelectOnQueOwnerInDetailsPageOption.click();
	}
	public void ClickOnQueOwnerInDetailsPageCheckBox1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnQueOwnerInDetailsPageCheckBox1));
		ClickOnQueOwnerInDetailsPageCheckBox1.click();
	}
	public void ClickOnQueOwnerInDetailsPageCheckBox2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnQueOwnerInDetailsPageCheckBox2));
		ClickOnQueOwnerInDetailsPageCheckBox2.click();
	}
	public void ClockOnSaveButtonForQueOwnerInDetailsPage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClockOnSaveButtonForQueOwnerInDetailsPage));
		ClockOnSaveButtonForQueOwnerInDetailsPage.click();
	}
	
	
	//****************************************************************************************************
	public void ClickOnWebToLead() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnWebToLead));
		ClickOnWebToLead.click();
	}
	
	
	public void ClickOnLeadRouterDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(LeadRouterDropDown));
		LeadRouterDropDown.click();
	}
	public void SelectLeadRouterOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(SelectLeadRouterOption));
		SelectLeadRouterOption.click();
	}
	public void ClickOnLeadRouterCheckBoxForForms() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(LeadRouterCheckBoxForForms));
		LeadRouterCheckBoxForForms.click();
	}
	
	

	public boolean DislaySuccessMessage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DislaySuccessMessage));
		return DislaySuccessMessage.isDisplayed();
	}
	
	
	public void InputForDefaulCalender() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(InputForDefaulCalender));
		InputForDefaulCalender.sendKeys("https://example.com");
	}
	public void DefaulCalenderCheckBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(DefaulCalenderCheckBox));
		DefaulCalenderCheckBox.click();
	}
	
	
	public void InputForThankYouPage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(InputForThankYouPage));
		InputForThankYouPage.sendKeys("https://example1.com");
	}
	public void ThankYouPageCheckBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ThankYouPageCheckBox));
		ThankYouPageCheckBox.click();
	}
	
	
	public void ClickOnReDirectOption1CheckBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnReDirectOption1CheckBox));
		ClickOnReDirectOption1CheckBox.click();
	}
	
	
	public void PersonalMeetingLinkDetails1CheckBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(PersonalMeetingLinkDetails1CheckBox));
		PersonalMeetingLinkDetails1CheckBox.click();
	}
	public void PersonalMeetingLinkDetails2CheckBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(PersonalMeetingLinkDetails2CheckBox));
		PersonalMeetingLinkDetails2CheckBox.click();
	}
//	public void PersonalMeetingLinkDetails2CheckBox() {
//		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(PersonalMeetingLinkDetails2CheckBox));
//		//ApproveSubmitbtn.click();
//		JavascriptExecutor js = (JavascriptExecutor) ldriver;
//		js.executeScript("arguments[0].click()", PersonalMeetingLinkDetails2CheckBox);
//	}
	public void ClickOnPersonalMeetingLinkDetails2DropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnPersonalMeetingLinkDetails2DropDown));
		ClickOnPersonalMeetingLinkDetails2DropDown.click();
	}
	public void SelectPersonalMeetingLinkDetails2Option() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(SelectPersonalMeetingLinkDetails2Option));
		SelectPersonalMeetingLinkDetails2Option.click();
	}
	//****************************************************************************************************
	
	public void ClickOnSuggestedNewOwnerDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(SuggestedNewOwnerDropDown));
		SuggestedNewOwnerDropDown.click();
	}
	
	public void SelectSuggestedNewOwnerOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(SelectSuggestedNewOwnerOption));
		SelectSuggestedNewOwnerOption.click();
	}
	
	public void CheckBoxForSuggestedNewOwner() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(CheckBoxForSuggestedNewOwner));
		CheckBoxForSuggestedNewOwner.click();
	}
	public boolean DisplaySuccessForSuggestedNewOwner() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplaySuccessForSuggestedNewOwner));
		return DisplaySuccessForSuggestedNewOwner.isDisplayed();
	}
	public boolean DisplaySuccessForCRMinApp() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplaySuccessForCRMinApp));
		return DisplaySuccessForCRMinApp.isDisplayed();
	}
	
	
	//***************************************************************
	public void LeadProcessingFeederFilterDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(LeadProcessingFeederFilterDropDown));
		LeadProcessingFeederFilterDropDown.click();
	}
	public void SelectLeadProcessingFeederFilterOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(SelectLeadProcessingFeederFilterOption));
		SelectLeadProcessingFeederFilterOption.click();
	}
	public void CheckBoxForLeadProcessingFeederFilter() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(CheckBoxForLeadProcessingFeederFilter));
		CheckBoxForLeadProcessingFeederFilter.click();
	}
	public boolean DisplaySuccessForLeadProcessingFeederFilter() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplaySuccessForLeadProcessingFeederFilter));
		return DisplaySuccessForLeadProcessingFeederFilter.isDisplayed();
	}
	//***************************************************************
	
	public void DefaultLeadOwnerDropDownforLPWRDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(DefaultLeadOwnerDropDownforLPWRDropDown));
		DefaultLeadOwnerDropDownforLPWRDropDown.click();
	}
	
	public void SelectDefaultLeadOwnerLPWROption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(SelectDefaultLeadOwnerLPWROption));
		SelectDefaultLeadOwnerLPWROption.click();
	}
	public void CheckBoxForDefaultLeadOwnerLPWR() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(CheckBoxForDefaultLeadOwnerLPWR));
		CheckBoxForDefaultLeadOwnerLPWR.click();
	}
	public boolean DisplaySuccessForDefaultLeadOwnerLPWR() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplaySuccessForDefaultLeadOwnerLPWR));
		return DisplaySuccessForDefaultLeadOwnerLPWR.isDisplayed();
	}
	//***************************************************************
	
	public void DataValueUpdateWhenRoutedToDefaultLeadOwnerAddButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(DataValueUpdateWhenRoutedToDefaultLeadOwnerAddButton));
		DataValueUpdateWhenRoutedToDefaultLeadOwnerAddButton.click();
	}
	public void DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown1));
		DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown1.click();
	}
	public void DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown1ForLeadRouter() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown1ForLeadRouter));
		DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown1ForLeadRouter.click();
	}
	
	public void DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown1ForEscalationCondition() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown1ForEscalationCondition));
		DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown1ForEscalationCondition.click();
	}
	
	public void SelectDataValueUpdateWhenRoutedToDefaultLeadOwnerOption1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(SelectDataValueUpdateWhenRoutedToDefaultLeadOwnerOption1));
		SelectDataValueUpdateWhenRoutedToDefaultLeadOwnerOption1.click();
	}
	public void DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown2));
		DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown2.click();
	}
	
	public void SelectDataValueUpdateWhenRoutedToDefaultLeadOwnerOption2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(SelectDataValueUpdateWhenRoutedToDefaultLeadOwnerOption2));
		SelectDataValueUpdateWhenRoutedToDefaultLeadOwnerOption2.click();
	}
	public void CheckBoxForDataValueUpdateWhenRoutedToDefaultLeadOwner() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(CheckBoxForDataValueUpdateWhenRoutedToDefaultLeadOwner));
		CheckBoxForDataValueUpdateWhenRoutedToDefaultLeadOwner.click();
	}
	public void CheckBoxForDataValueUpdateWhenRoutedToDefaultLeadOwnerForLeadRouter() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(CheckBoxForDataValueUpdateWhenRoutedToDefaultLeadOwnerForLeadRouter));
		CheckBoxForDataValueUpdateWhenRoutedToDefaultLeadOwnerForLeadRouter.click();
	}
	public void CheckBoxForDataValueUpdateWhenRoutedToDefaultLeadOwnerForEscalationRouter() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(CheckBoxForDataValueUpdateWhenRoutedToDefaultLeadOwnerForEscalationRouter));
		CheckBoxForDataValueUpdateWhenRoutedToDefaultLeadOwnerForEscalationRouter.click();
	}
	
	public boolean DisplaySuccessForDataValueUpdateWhenRoutedToDefaultLeadOwner() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplaySuccessForDataValueUpdateWhenRoutedToDefaultLeadOwner));
		return DisplaySuccessForDataValueUpdateWhenRoutedToDefaultLeadOwner.isDisplayed();
	}
	
	//*********************************************************************************************************************************
	
	@FindBy(xpath="//div[@data-type='action']")
	WebElement ActionBlock;
	
	@FindBy(xpath="//div[@data-jtk-source-port-type='action']")
	WebElement ActionBlockY;
	@FindBy(xpath="//div[@data-jtk-source-port-type='source']")
	WebElement DecisionBlock;
	
	@FindBy(xpath="//ng-select[@placeholder='Select Webhook']")
	WebElement SelectListBoxActionBlock;
	
	@FindBy(xpath="(//span[@class='mat-radio-container'])[5]")
	WebElement ClickOnContinueProcessingCheckBoxActionBlockOTS;
	
	@FindBy(xpath="(//span[normalize-space()='Save'])[2]")
	WebElement SaveButtonForActionBlockOTS;
	
	@FindBy(xpath = "//button[@aria-label='toggle Webhook']")
	WebElement ClickOnDropDownForWebhook;
	
	@FindBy(xpath = "((//div[text()='Used By']//..)[1]//mat-icon[text()=' chevron_right '])[1]")
    WebElement ClickOnUsedByDropDown;
	
	@FindBy(xpath = "((//div[text()='Used By']//..)[1]//span[@class='custom-option-content'][text()])[1]")
	public WebElement GetTextFromUsedByRouterName;
	@FindBy(xpath = "(//div[text()='Used By']//..)[1]//mat-tree-node[text()]")
	public WebElement GetTextFromUsedByRouterModuleName;
	
	@FindBy(xpath = "//li[text()=' Approved ']")
	WebElement ClickOnApproveButton;
	@FindBy(xpath = "//span[text()='Delete ']")
	WebElement ClickOnDeletebutton;
	
	@FindBy(xpath = "(//div[contains(@class,'simple-notification ng-trigger ng-trigger-enterLeave error has-icon')])[1]//..//div[contains(@class,'sn-content ng')]")
	public WebElement GetTextFromErrorMessage;
	
	@FindBy(xpath = "((//mat-icon[text()=' expand_more '])[1]//..//..//..//span[@class='mat-button-wrapper'])[2][text()]")
	public WebElement GetTextOfRoutername;
	@FindBy(xpath = "//span[@class='featureTitle']")
	public WebElement GetTextOfLeftMenuTitle;
	
	@FindBy(xpath = "((//div[text()='Used By']//..)[1]//span[@class='custom-option-content'])[1]")
	WebElement ClickUsedByRouterName;
	
	@FindBy(xpath="//div[@data-type='otsassignment']")
	WebElement OTSAssignmentBlockDND;
	@FindBy(xpath="//div[@data-jtk-source-port-type='source1']")
	WebElement DecisionBlockN;
	
	@FindBy(xpath="(//div[@data-jtk-target-port-type='target'])[3]")
	WebElement OTSAssignmentBlock;
	
	@FindBy(xpath="(//a[@href='#/dashboard/canvasinfo'])[1]")
	WebElement ClickOnUsedByObjectLink;
	
	@FindBy(xpath="//i[text()='description']//..//span[@class='detailstyle']")
	public WebElement GetTextFromDetails;
	
	@FindBy(xpath="//button[@aria-label='toggle Response Mapping']")
	WebElement ClickOnDropdownForResponseMaping;
	
	@FindBy(xpath="//button[@aria-label='toggle Custom Header']")
	WebElement ClickOnDropdownForCustomHeader;
	
	@FindBy(xpath = "//button//span[contains(text(),'AutoTestObject ')]")
	WebElement ClickOnAutoTestObject;
	
	
	
	
	
	
	
	
	
	
	public void ClickOnAutoTestObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnAutoTestObject));
		ClickOnAutoTestObject.click();
	}
	
	public void ClickOnDropdownForCustomHeader() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnDropdownForCustomHeader));
		ClickOnDropdownForCustomHeader.click();
	}
	
	public void ClickOnDropdownForResponseMaping() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnDropdownForResponseMaping));
		ClickOnDropdownForResponseMaping.click();
	}
	
	public void ClickOnUsedByObjectLink() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ClickOnUsedByObjectLink));
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", ClickOnUsedByObjectLink);
	}
	
	
	public void DoubleClickOnOTSAssignmentBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(OTSAssignmentBlock));
		Actions actions = new Actions(ldriver);
		actions.doubleClick(OTSAssignmentBlock).build().perform();
		actions.doubleClick(OTSAssignmentBlock).build().perform();
		
	}
	public void ConnectionDecisionBlockN_To_OTSAssignmentBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DecisionBlockN));
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(OTSAssignmentBlock));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(DecisionBlockN)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(DecisionBlockN)
        .pause(Duration.ofSeconds(1))
        .moveToElement(OTSAssignmentBlock)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	
	public void OTSAssignmentBlockDND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(OTSAssignmentBlockDND));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(OTSAssignmentBlockDND)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(OTSAssignmentBlockDND)
        .pause(Duration.ofSeconds(1))
        .moveByOffset(-350,15) 
        .moveByOffset(-350,15)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	public void ClickUsedByRouterName() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickUsedByRouterName));
		ClickUsedByRouterName.click();
	}
	
	
	public void ClickOnDeletebutton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnDeletebutton));
		ClickOnDeletebutton.click();
	}
	
	public void ClickOnApproveButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnApproveButton));
		ClickOnApproveButton.click();
	}

	public void ClickOnUsedByDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnUsedByDropDown));
		ClickOnUsedByDropDown.click();
	}
	
	public void ClickOnDropDownForWebhook() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnDropDownForWebhook));
		ClickOnDropDownForWebhook.click();
	}
	
	public void SaveButtonForActionBlockOTS() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SaveButtonForActionBlockOTS));
		SaveButtonForActionBlockOTS.click();
	}
	public void ClickOnContinueProcessingCheckBoxActionBlockOTS() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnContinueProcessingCheckBoxActionBlockOTS));
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", ClickOnContinueProcessingCheckBoxActionBlockOTS);
	}
	public void SelectListBoxActionBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectListBoxActionBlock));
		SelectListBoxActionBlock.click();
	}
	
	public void DoubleClickOnActionBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ActionBlockY));
		Actions actions = new Actions(ldriver);
		actions.doubleClick(ActionBlockY).build().perform();
		actions.doubleClick(ActionBlockY).build().perform();
		
	}
	public void ConnectDecisionBlock_To_ActionBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DecisionBlock));
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ActionBlockY));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(DecisionBlock)
        .pause(Duration.ofSeconds(0))
        .clickAndHold(DecisionBlock)
        .pause(Duration.ofSeconds(0))
        .moveToElement(ActionBlockY)
        .pause(Duration.ofSeconds(0))
        .release().build().perform();
	}
	
	public void ActionBlockLPWR_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ActionBlock));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(ActionBlock)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(ActionBlock)
        .pause(Duration.ofSeconds(1))
        .moveByOffset(-350,50) 
        .moveByOffset(-350,50)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	
	public void ClickOnbtnSaveDescForAccList() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(btnSaveDescForAccList));
		btnSaveDescForAccList.click();
	}

	public void ClickOndetailsbutton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(detailsbutton));
		//btnDescEdit.click();
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", detailsbutton);
	}
	public void ClickOnDraftbutton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(detailsbutton));
		detailsbutton.click();
	}
	
	public void ClickOnDefaultLeadOwnerSelectAllaLebedevaOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(DefaultLeadOwnerSelectAllaLebedevaOption));
		DefaultLeadOwnerSelectAllaLebedevaOption.click();
	}
	
	public void ClickOnDefaultLeadOwnerDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(DefaultLeadOwnerDropDown));
		DefaultLeadOwnerDropDown.click();
	}
	
	public void ClickOnEditbtn() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(btnDescEdit));
		//btnDescEdit.click();
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", btnDescEdit);
	}
	
	public void InputDesc() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(InputDesc));
		InputDesc.clear();
		InputDesc.sendKeys("Object created  via Docker Containers By Robin!!!");
	}
	public void ClickOnSaveBtn() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(btnSaveDesc));
		btnSaveDesc.click();
	}
	public void btnSaveDescRRT() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(btnSaveDescRRT));
		btnSaveDescRRT.click();
	}
	public boolean DisplayDescMsg() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DescVerifyMsg));
		return DescVerifyMsg.isDisplayed();
	}
	
	public void ClickOnQueueOwner() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickQueueOwner));
		ClickQueueOwner.click();
	}
	
	public void SelectQueueOwner() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(SelectQueueOwner));
		SelectQueueOwner.click();
	}
	public void ClickOnCheckBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnCheckBox));
		ClickOnCheckBox.click();
	}
	
	public boolean DisplaySuccess() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplaySuccess));
		return DisplaySuccess.isDisplayed();
	}
	
	public boolean DisplaySuccessForLeadRouter() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplaySuccessForLeadRouter));
		return DisplaySuccessForLeadRouter.isDisplayed();
	}
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"/Screenshots/" + tname +".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot Taken");
		
	}

}
