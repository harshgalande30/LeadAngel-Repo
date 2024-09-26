package com.leadAngel.pageObjects;

import java.time.Duration;
import java.util.Random;



import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.testng.Reporter;

public class LeadManagementPage {

	WebDriver ldriver;

	public LeadManagementPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	
//---------------- SALES TEAM-------------------//
	@FindBy (xpath = "(//mat-icon[@class='mat-icon notranslate mat-icon-rtl-mirror material-icons mat-ligature-font mat-icon-no-color'])[2]")
	WebElement AeToSDRDropdown;
	@FindBy(xpath = "(//mat-icon[@class='mat-icon notranslate mat-icon-rtl-mirror material-icons mat-ligature-font mat-icon-no-color'])[3]")
	WebElement RoundRobinTeamDropdown;
	
	
	
	
	
	@FindBy(xpath = "//button[@aria-label='toggle Sales Team']")
	WebElement SalesTeam;
	@FindBy(xpath = "//button[@aria-label='toggle Round Robin Team']")
	WebElement RoundRobinTeam;
	@FindBy(xpath = "//span[text()='Round Robin Team ']")
	WebElement ClickAgainRoundRobinTeam;
	@FindBy(xpath = "//span[contains(text(),'Weighted Sales Team ')]")
	WebElement WeightedSalesTeam;
	
	@FindBy(xpath = "//span[contains(text(),'AE to SDR Mapping')]")
	WebElement SalesRepTeam;
	@FindBy(xpath = "//button[@aria-label='toggle AE to SDR Mapping']")
	WebElement RightClickSalesRepTeam;
		
//-----------------------AE to SDR----------------------------//
   	  	
   	@FindBy(xpath="(//mat-option[@role='option'])[3]") //"(//input[@formcontrolname='SalesRepName'])[1]")     //(//mat-option[@role='option'])[1]
   	WebElement SelectAE1;
   	
   	@FindBy(xpath="(//input[contains(@id,'mat-input')])[1]")     //(//mat-option[@role='option'])[1]
   	WebElement IndexValueCheck;
   	
   	@FindBy(xpath = "(//input[@formcontrolname='SalesRepName'])[1]")
    WebElement AEInput1;	
   	@FindBy(xpath="(//input[@formcontrolname='ISRMappedName'])[1]")   ///Regression
	WebElement SDR_MappingInput1;
   	@FindBy(xpath="(//mat-option[@role='option'])[2]")
   	WebElement SelectSDR1;
   	@FindBy(xpath="(//input[@formcontrolname='SalesRepName'])[2]")
    WebElement AEInput2;  	
   	@FindBy(xpath="(//input[@formcontrolname='ISRMappedName'])[2]")
   	WebElement SDR_MappingInput2;
   	@FindBy(xpath="(//mat-option[@role='option'])[5]")
   	WebElement SelectSDR2;
   	
   	
   	@FindBy(xpath="(//input[@formcontrolname='SalesRepName'])[3]")
   	WebElement AEInput3;
   	@FindBy(xpath="(//input[@formcontrolname='ISRMappedName'])[3]")
   	WebElement SDR_MappingInput3;
   	@FindBy(xpath="(//mat-option[@role='option'])[4]")
   	WebElement SelectSDR3;
   	@FindBy(xpath="(//button[@role='menuitem'])[2]")
	WebElement NewFolder;
	
	
//----------------- DATA DICTIONARY----------------//	
	
 
     
	@FindBy(xpath = "//button[@aria-label='toggle Data Dictionary']")
	WebElement DataDictionary;
	@FindBy(xpath = "//span[text()='Account List ']")
	WebElement AccList;
	@FindBy(xpath = "//span[text()='CRM Account Filter ']")
	WebElement CRM_Acc_Filter;
	@FindBy(xpath = "//button[@aria-label='toggle CRM Lead Filter']")
	WebElement NewCRM_Lead_Filter;
	@FindBy(xpath = "//span[text()='CRM Lead Filter ']")
	WebElement ClickaganiCRM_Lead_Filter;
	@FindBy(xpath = "//span[contains(text(),' SR and Account Mapping ')]")
	WebElement btnSRandAMT;
	
	
	//------------------- INACTIVE ACCOUNT OWNER---------------//
	
	@FindBy(xpath="//button[@aria-label='toggle Inactive Lead Management']")
	WebElement InActiveLeadManagement;
	@FindBy(xpath="//span[contains(text(),'Inactive Owner to Sales Rep Mapping ')]/ancestor::button")
	WebElement InActiveOwnertoSalesRep;
	
	
		
	//--------------------- CRUD OPERATION---------------//
	
	@FindBy(xpath = "(//button[@role='menuitem'])[1]")
	WebElement NewObject;
	@FindBy(xpath = "//input[@id='menuname']")
	WebElement txtNameObject;
	@FindBy(xpath = "//textarea[@id='menudesc']")
	WebElement txtDesc;
	@FindBy(xpath = "//button//span[contains(text(),'Save')]")
	WebElement btnNewObjectSave;
	@FindBy(xpath = "(//span[text()='AutoTestObject '])[1]")
	 WebElement AutoTestObject;
	@FindBy(xpath = "//span[@class='custom-option-content'][text()='AutoTestObject_Rename']")
	 WebElement selectAutoTestObject_Rename;
	@FindBy(xpath = "//button//span[text()='AutoTestObject_Rename ']")
	WebElement AutoTestObjectRename;
	@FindBy(xpath = "(//button[@class='mat-focus-indicator mat-menu-item ng-star-inserted'])[2]")
	WebElement Edit_AutoTestObject;
	@FindBy(xpath = "//button//span[text()='Edit ']")
	WebElement ClickOnEditButton;
	@FindBy(xpath ="(//button[@class='mat-focus-indicator mat-menu-item'])[1]" ) //This Xpath is also applicaple for Administration crud operation                                 //"//mat-icon[contains(text(),'flip_to_back')]")
	WebElement Rename_AutoTestObject;
	@FindBy(xpath = "(//button[@class='mat-focus-indicator mat-menu-item'])[2]")//This Xpath is also applicaple for Administration crud operation 
	WebElement Delete_AutoTestObject;
	@FindBy(xpath = "//input[@id='menuname']")//This Xpath is also applicaple for Administration crud operation 
	WebElement InputRename_AutoTestObject;
	@FindBy(xpath = "//mat-dialog-actions//button//span[contains(text(),'Rename')]")
	WebElement renameBtn;//This Xpath is also applicaple for Administration crud operation 
	@FindBy(xpath = "//span[text()='AutoTestObject_Rename ']")
	WebElement AutoTestObjectAfterRename;
	@FindBy(xpath = "//button//span[text()='AutoTestObject_Rename_Copy(1) ']")
	WebElement AutoTestObjectAfterClone;
	@FindBy(xpath ="//mat-icon[contains(text(),'file_copy')]")   //This Xpath is also applicaple for Administration crud operation 
	WebElement clone_AutoTestObject;
	@FindBy(xpath = "//span[text()=' Clone ']")//This Xpath is also applicaple for Administration crud operation 
	WebElement btnClone;
	@FindBy(xpath = "//button//span[contains(text(),'DELETE')]")//This Xpath is also applicaple for Administration crud operation 
	WebElement btnDelete;
	@FindBy(xpath = "(//div[contains(text(),'Deleted Successfully')])[2]")//This Xpath is also applicaple for Administration crud operation 
	WebElement DisplayDelete;
	@FindBy(xpath = "//button[text()='Move ']")
	WebElement Move_AutoTestObject;
	@FindBy(xpath = "//mat-icon[contains(text(),'done_all')]")
	WebElement Approve_AEtoSDR;
	
	
//	@FindBy(xpath = "//select[@id='ddlcausetype']")
//	WebElement Move_SelectFolder;
	
	@FindBy(xpath="(//select[@id='ddlcausetype']//option)[2]")
	WebElement Move_SelectFolder;
	
	@FindBy(xpath = "//span[text()=' Move ']")
	WebElement btnMove;
	@FindBy(xpath = "//button[text()='Move ']")
	WebElement MoveButtonForWaitFilter;
	
//----------------FOR CRUD OPERATION FOLDER'S---------------------//	
	
	@FindBy(xpath="//button[@aria-label='toggle f3']")
	WebElement ClickFolderForLPWR;
	@FindBy(xpath="//button[@aria-label='toggle Folder']")
	WebElement PartnerLeadRouterFolder;
	@FindBy(xpath="//button[@aria-label='toggle abcdfgdfgb']")
	WebElement ContactRouterContactMgmntFolder;
	@FindBy(xpath="(//mat-icon[text()=' chevron_right ']//ancestor::button)[2]")
	WebElement ClickFolder;
	@FindBy(xpath="//button[@aria-label='toggle ..fldr']")
	WebElement ContactRoutingTerritoryContactMgmntFolder;
	
	@FindBy(xpath="//button[@aria-label='toggle f2'] ")
	WebElement AccRoutingTeritoryFolder;
	@FindBy(xpath="//button[@aria-label='toggle 123']")
	WebElement AnalyticsAccountListFolder;
	@FindBy(xpath="(//mat-icon[text()=' chevron_right ']//ancestor::button)[1]")
	WebElement ClickSalesTeamFolder;
	@FindBy(xpath="(//mat-icon[text()=' chevron_right ']//ancestor::button)[5]")
	WebElement ClickCappingFolder;
	@FindBy(xpath="//button[@aria-label='toggle .....Folder']")
	WebElement ClickContactFolder;
	@FindBy(xpath="//button[@aria-label='toggle f']")
	WebElement CustomHeaderFolderr;
	@FindBy(xpath="//button[@aria-label='toggle f1']")
	WebElement CustomHeaderFolder;
	@FindBy(xpath="//button[@aria-label='toggle f1']")
	WebElement ResponseMapingFolder;
	@FindBy(xpath="//button[@aria-label='toggle asdfgh']")
	WebElement ResponseMapingFolderName;
	@FindBy(xpath="//button[@aria-label='toggle ..15fldr']")
	WebElement LeadRoutingTerritoryFolder;
	@FindBy(xpath="(//mat-icon[text()=' chevron_right ']//ancestor::button)[3]")
	WebElement CRMAccFolder;
	@FindBy(xpath="//button[@aria-label='toggle 1nov']")
	WebElement CRMAccFilterAccMgmtFolder;
	@FindBy(xpath="(//mat-icon[text()=' chevron_right ']//ancestor::button)[6]")
	WebElement EscalConditionFolder;

	@FindBy(xpath="(//mat-icon[text()=' chevron_right ']//ancestor::button)[7]")
	WebElement TaskListFolder;
	@FindBy(xpath="//button[@aria-label='toggle f1']")
	WebElement WaitConditionFolder;
	@FindBy(xpath="//button[@aria-label='toggle AQ']")
	WebElement WaitFilterFolder;
	@FindBy(xpath="//button[@aria-label='toggle testFolder']")
	WebElement WaitConditionPartnerLeadMgnmtFolder;
	@FindBy(xpath="(//mat-icon[text()=' chevron_right ']//ancestor::button)[8]")
	WebElement WFFolder;
	@FindBy(xpath="//button[@aria-label='toggle newww']")
	WebElement WaitFilterPartnerLeadMgmntFolder;
	
	@FindBy(xpath = "//button[@aria-label='toggle Lead Processing without Routing']")
	WebElement LeadProWithoutRouting;	
	@FindBy(xpath = "//mat-icon[contains(text(),'add')]/ancestor::button")
	WebElement NewLeadProWithoutRouting;		
	
	
	
	
//-----------------  WAIT FILTER ------------------------------//
	
	@FindBy(xpath="//button[@aria-label='toggle Wait Filter']")
	WebElement WaitFilter;
	@FindBy(xpath="//span[text()='Wait Filter ']")
	WebElement ClickAgainWaitFilter;
	
	@FindBy(xpath="(//mat-option[@role='option'])[2]")
	WebElement WaitFilterOptionSelect;
	@FindBy(xpath="(//mat-option[@role='option'])[3]")
	WebElement WaitFilterOptionSelect_1;
	@FindBy(xpath="(//mat-option[@role='option'])[4]")
	WebElement WaitFilterOptionSelect_2;
	@FindBy(xpath="//mat-select[@role='combobox']")
    WebElement clickOnSelectWaitFilter;	
	@FindBy(xpath="//option[text()=' Wait filter returns false ']")
	WebElement WaitTillOptionSelect1;
	@FindBy(xpath="(//mat-option[@role='option'])[2]")
	WebElement WaitFilterOptionSelect1;

	
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='First Name']//parent::div//option[text()=' does not contain ']")
    WebElement FirstNameDoesNotContains;	
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Annual Revenue ']//parent::div//option[text()=' is greater than ']")
	WebElement AnnualRevenueIsGreaterThan;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Created Date']//parent::div//option[text()='between']")
	WebElement CreatedDateInBetween;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Converted']//parent::div//option[text()='is']")
    WebElement ConvertedIs;	
    @FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='First Name']//parent::div//option[text()='in']")
    WebElement FirstNameIn;	
	@FindBy(xpath="//button[@aria-label='toggle Lead Routing']")
	WebElement LeadRouting;
	@FindBy(xpath="//span[text()='Capping/Leveling Condition ']")
	WebElement CappingLeveling;
	@FindBy(xpath="//span[text()='Escalation Condition ']")
	WebElement EscalationCondition;
	
//---------------------WAIT CONDITION-----------------------//
	
	@FindBy(xpath="//button[@aria-label='toggle Wait Condition']")
	WebElement WaitCondition;
	@FindBy(xpath="//span[text()='Wait Condition ']")
	WebElement ClickAgainWaitCondition;
	@FindBy(xpath="//button[(text()=' Wait ')]")
    WebElement WaitAttr;
	@FindBy(xpath="(//mat-list-item[@mattooltipclass='custom-tooltip-style'])[1]")
	WebElement WaitFor;
	@FindBy(xpath="(//mat-list-item[@mattooltipclass='custom-tooltip-style'])[2]")
	WebElement WaitTill;
	@FindBy(xpath="(//mat-list-item[@mattooltipclass='custom-tooltip-style'])[3]")
	WebElement WaitFil;
	@FindBy(xpath = "//div[@id='cdk-drop-list-0']")
	WebElement AddField; 
    @FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Wait For']//parent::div//input[@type='text']")
    WebElement WaitForInput;
	@FindBy(xpath="//option[text()='Minutes']")
	WebElement WaitForMinutes;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Wait For']//parent::div//option[text()='Hours']")
	WebElement WaitForHours;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Wait For']//parent::div//option[text()='Days']")
	WebElement WaitForDays;
	@FindBy(xpath="//button[@class='mat-calendar-body-cell mat-calendar-body-active']")
	WebElement SelectDate;
	@FindBy(xpath="//input[@placeholder='Select Time...']")
	WebElement ClickOnSelectTime;
	@FindBy(xpath="//div[@class='clock-face__number clock-face__number--outer ng-star-inserted']//span[text()=' 3 ']")
    WebElement SelectTime;
	@FindBy(xpath="//button[@type='button']//span[text()='Ok']")
	WebElement ClickOkbtn;
	@FindBy(xpath="//option[text()=' Wait filter returns true ']")
	WebElement WaitTillOptionSelect;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Wait till']//parent::div//option[text()='Wait filter returns false ']")
	WebElement WaitTillOptionSelect_1;
	

	
	
//-----------------------------TASK LIST-------------------------//
	
	@FindBy(xpath="//span[text()='Task Lists ']")
	WebElement TaskList;
	
	@FindBy(xpath="//button[@aria-label='toggle Task Lists']")
	WebElement TaskListDropDown;
	
	@FindBy(xpath="//h4[text()='Task Lists Overview']")
	WebElement DisplayTaskListsOverview;
	
	@FindBy(xpath="//input[@formcontrolname='TaskSubject']")
	WebElement TaskSubjectInput;
	@FindBy(xpath="//option[text()='Normal']")
	WebElement ClickPriorityNormal;
	@FindBy(xpath="//label[text()='Priority']//parent::div//option[text()='High']")
	WebElement ClickPriorityHigh;
	@FindBy(xpath="//label[text()='Priority']//parent::div//option[text()='Low']")
	WebElement ClickPriorityLow;
	@FindBy(xpath="//option[text()='In Progress']")
	WebElement ClickStatusInProgress;
	@FindBy(xpath="//label[text()='Status']//parent::div//option[text()='Not Started']")
	WebElement ClickStatusNotStarted;
	@FindBy(xpath="//label[text()='Status']//parent::div//option[text()='Waiting for someone else ']")
	WebElement ClickStatusWaiting;
	@FindBy(xpath="//label[text()='Status']//parent::div//option[text()='Deferred']")
	WebElement ClickStatusDeferred;
	@FindBy(xpath="//label[text()='Status']//parent::div//option[text()='Completed']")
	WebElement ClickStatusCompleted;
	@FindBy(xpath="//textarea[@formcontrolname='TaskComments']")
	WebElement InputOnCommentBox;
	@FindBy(xpath="//span[text()='Due with-in days ']")
	WebElement RadioBtn;
	@FindBy(xpath="//input[@formcontrolname='TaskDueDays']")
	WebElement InputOnRadioBtn;

	//--------------------CRM Contact Filter--------------------//
	
	@FindBy(xpath="//span[(text()='CRM Contact Filter ')]")
	WebElement ContactFilter;
	@FindBy(xpath="//button[(text()=' Contact Attributes ')]")
    WebElement ContactAttr;
	@FindBy(xpath="//mat-list-item[@id='Full Name$#!@#$%^11']")
	WebElement ContactFullName;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Full Name']//parent::div//option[text()='starts with']")
	WebElement FullNameStartWith;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Full Name']//parent::div//input[@type='text']")
	WebElement FullnameStartWithInput;
	@FindBy(xpath="//mat-list-item[@id='Mailing Longitude$#!@#$%^11']")
	WebElement MailingLongitude;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Mailing Longitude ']//parent::div//input[@type='number']")
	WebElement MailingLongitudeInput;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Mailing Longitude ']//parent::div//option[text()='is smaller than ']")
    WebElement MailingLongitudeIsSmallerThan;
	@FindBy(xpath="//mat-list-item[@id='Created Date$#!@#$%^11']")
	WebElement ContactCreatedDate;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Created Date']//parent::div//option[text()='after']")
	WebElement CreatedDateAfter;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Full Name']//parent::div//option[text()='in']")
    WebElement FullNameIN;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Full Name']//parent::div//mat-icon[text()='add_box']")
	WebElement FullNameInAddBtn;

//-------------------CRM Opportunity Filter--------------------//
    
	@FindBy(xpath="//button[(text()=' Opportunity Activity Attributes ')]")
    WebElement OpportunityActivityAttr;
    @FindBy(xpath="//button[@aria-label='toggle CRM Opportunity Filter']")
    WebElement OpportunityFilter;
    @FindBy(xpath="//button[(text()=' Opportunity Attributes ')]")
    WebElement OpportunityAttr;
    @FindBy(xpath="//mat-list-item[@id='ID$#!@#$%^29']")
    WebElement OpportunityId;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='ID']//parent::div//option[text()='contains']")
	WebElement IdContains;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='ID']//parent::div//input[@type='text']")
	WebElement InputIdContains;
	@FindBy(xpath="//mat-list-item[@id='Private$#!@#$%^3']")
	WebElement Private;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Private']//parent::div//option[text()='is not']")
	WebElement PrivateIsNot;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Private']//parent::div//option[text()='True']")
	WebElement PrivateTrue;
   	@FindBy(xpath="//mat-list-item[@id='Amount$#!@#$%^3']")
   	WebElement Amount;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Amount ']//parent::div//option[text()='is smaller than ']")
	WebElement AmountIsSmallerThan;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Amount ']//parent::div//input[@type='number']")
	WebElement AmountInput;
	@FindBy(xpath="//mat-list-item[@id='Close Date$#!@#$%^3']")
	WebElement CloseDate;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Close Date']//parent::div//option[text()='before']")
	WebElement CloseDateBefore;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='ID']//parent::div//option[text()='not in']")
	WebElement IdNotIn;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='ID']//parent::div//mat-icon[text()='add_box']")
	WebElement IdInAddbtn;
  	   
   @FindBy(xpath="//span[text()='Lead Routing Territory ']")
   WebElement LeadRoutingTerritory;
   	

	
	//***************************************Lead Router Object Creation************************************************
	@FindBy(xpath="//button[@class='mat-focus-indicator mat-menu-item']")
	WebElement NewLeadRouter;
	
	@FindBy(xpath="//button[@aria-label='toggle Lead Router']")
	WebElement LeadRouterDropDown;
	
	@FindBy(xpath = "//span[text()='Lead Router ']")
	WebElement LeadRouter;
	
	@FindBy(xpath="//button[@aria-label='toggle Capping/Leveling Condition']")
	WebElement Capping_levellingDropDown;
	
	@FindBy(xpath="//h4[text()='Capping/Leveling Condition Overview']")
	WebElement DisplayCappingLevelingConditionOverview;
	
	@FindBy(xpath="//button[@aria-label='toggle Escalation Condition']")
	WebElement EscalationConditionDropDown;
	
	
	@FindBy(xpath="//h4[text()='Escalation Condition Overview']")
	WebElement DisplayEscalationConditionOverview;
	
	@FindBy(xpath="//h4[text()='Wait Filter Overview']")
	WebElement DisplayWaitFilterOverview;
	
	@FindBy(xpath="//h4[text()='Wait Condition Overview']")
	WebElement DisplayWaitConditionOverview;
	
	//***************************************Lead Router Object Creation************************************************

	@FindBy(xpath="//button[@aria-label='toggle Lead Processing without Routing']")
	WebElement LeadProcessingWithoutRouting;
	
	@FindBy(xpath="//span[text()='Lead Processing without Routing ']")
	WebElement ClickAgainLeadProcessingWithoutRouting;
	
	@FindBy(xpath="//h4[text()='Lead Processing without Routing Overview']")
	WebElement LeadProcessingWithoutRoutingOverView;
	
	//***************************************Escalation Router************************************************
	
	@FindBy(xpath="//button[@aria-label='toggle Escalation Router']")
	WebElement EscalationRouterDropDown;
	
	@FindBy(xpath="//span[text()='Escalation Router ']")
	WebElement ClickEscalationRouter;
	
	@FindBy(xpath = "(//span[@class='mat-checkbox-inner-container'])[1]")
	WebElement CheckBoxForAssignmentBlockAutoConvert;
	
	@FindBy(xpath = "(//mat-select[@role='combobox'])[4]")
	WebElement ClickOnSelectAutoConvertionForAssignmentBlock;
	
	@FindBy(xpath = "//h4[text()='Escalation Router Overview']")
	WebElement DisplayEscalationRouterOverview;
	
	//***************************************************************************************************************************** 	
	public void EscalationRouterDropDown()
	{
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(EscalationRouterDropDown));
		EscalationRouterDropDown.click();
	}
	public void ClickAgainEscalationRouter()
	{
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickEscalationRouter));
		ClickEscalationRouter.click();
	}
	public void RightClickOnClickEscalationRouter() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25))
				.until(ExpectedConditions.elementToBeClickable(EscalationRouterDropDown));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(EscalationRouterDropDown).click(EscalationRouterDropDown).contextClick(EscalationRouterDropDown).build()
				.perform();
	}
	public void CheckBoxForAssignmentBlockAutoConvert()
	{
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(CheckBoxForAssignmentBlockAutoConvert));
		CheckBoxForAssignmentBlockAutoConvert.click();
	}
	public void ClickOnSelectAutoConvertionForAssignmentBlock()
	{
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickOnSelectAutoConvertionForAssignmentBlock));
		ClickOnSelectAutoConvertionForAssignmentBlock.click();
	}
	
	public boolean DisplayEscalationRouterOverview() {
		  new WebDriverWait(ldriver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(DisplayEscalationRouterOverview));
		  return DisplayEscalationRouterOverview.isDisplayed();
	}
	
	
	
	
	
	
	
	public boolean DisplayLeadProcessingWithoutRoutingOverView() {
		  new WebDriverWait(ldriver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(LeadProcessingWithoutRoutingOverView));
		  return LeadProcessingWithoutRoutingOverView.isDisplayed();
	}
	public boolean DisplayWaitFilterOverview() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.visibilityOf(DisplayWaitFilterOverview));
		 return    DisplayWaitFilterOverview.isDisplayed();
	}
	public boolean DisplayWaitConditionOverview() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.visibilityOf(DisplayWaitConditionOverview));
		 return    DisplayWaitConditionOverview.isDisplayed();
	}
	
	public boolean DisplayCappingLevelingConditionOverview() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.visibilityOf(DisplayCappingLevelingConditionOverview));
		 return    DisplayCappingLevelingConditionOverview.isDisplayed();
	}
	public boolean DisplayEscalationConditionOverview() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.visibilityOf(DisplayEscalationConditionOverview));
		 return    DisplayEscalationConditionOverview.isDisplayed();
	}
	public void EscalationConditionDropDown()
	{
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(EscalationConditionDropDown));
		EscalationConditionDropDown.click();
	}
	
	public void getAeToSDRDropdown()
	{
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(AeToSDRDropdown));
		AeToSDRDropdown.click();
	}
   
   public void getRRTDropDown()
	{
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(RoundRobinTeamDropdown));
		RoundRobinTeamDropdown.click();
	}
   
  
   
public void ClickOnNewFolder() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(NewFolder));
		NewFolder.click();
	}
   	  	
	public void ClickOnLeadRouting() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(LeadRouting));
		LeadRouting.click();
	}
	
	public void RightClickonEscalationCondition() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25))
				.until(ExpectedConditions.elementToBeClickable(EscalationCondition));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(EscalationCondition).click(EscalationCondition).contextClick(EscalationCondition).build()
				.perform();
	}

	public void ClickAgainOnEscalationCondition() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(EscalationCondition));
		EscalationCondition.click();
	}
public void ClickonFirstNameDoesNotContain() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(FirstNameDoesNotContains));
		FirstNameDoesNotContains.click();
	}


public void ClickonConverted_Is() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ConvertedIs));
		ConvertedIs.click();
	}


	public void RightClickonWST() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25))
				.until(ExpectedConditions.elementToBeClickable(WeightedSalesTeam));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(WeightedSalesTeam).click(WeightedSalesTeam).contextClick(WeightedSalesTeam).build()
				.perform();
		
	}
	public void ClickAgainOnWST() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(WeightedSalesTeam));
		WeightedSalesTeam.click();
	}
	// ============Classes of SR and Account Management Team===========//

	public void ClickOnSRandAccountMappingTeam() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(btnSRandAMT));
		btnSRandAMT.click();
	}

	
	public void RightClickonRRT() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickAgainRoundRobinTeam));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(ClickAgainRoundRobinTeam).contextClick(ClickAgainRoundRobinTeam).build().perform();
	}

	public void ClickAgainRoundRobinTeam() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickAgainRoundRobinTeam));
		ClickAgainRoundRobinTeam.click();
	}
	
	
	
	Random objGenerator = new Random();
	public int randomnumber() {
		int GeneratedN = objGenerator.nextInt(51);
		return GeneratedN;
	}

	// ===============Saving Random Generated Number==================//
	int randomNum = randomnumber();

	public String randomstring() {
		String GeneratedS = RandomStringUtils.randomAlphanumeric(randomNum);
		return GeneratedS;
	}

	public void NameInObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(txtNameObject));
		txtNameObject.sendKeys("AutoTestObject");

	}

	public void ClickOnDataDictionary() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(DataDictionary));
		DataDictionary.click();
	}

	public void RightClickOnAccList() {
		Actions actions = new Actions(ldriver);
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(AccList));
		actions.moveToElement(AccList).click(AccList).contextClick(AccList).build().perform();
	}
	public void ClickAgainOnAccList() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(AccList));
		AccList.click();
	}

	public void RightClickonLeadProcessingWithoutRouting() {
		Actions actions = new Actions(ldriver);
		new WebDriverWait(ldriver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(LeadProcessingWithoutRouting));
		actions.moveToElement(LeadProcessingWithoutRouting).click(LeadProcessingWithoutRouting).contextClick(LeadProcessingWithoutRouting).build().perform();
	}
	
	public void ClickOnLeadProcessingWithoutRoutingDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(LeadProcessingWithoutRouting));
		LeadProcessingWithoutRouting.click();
	}

	public void ClickAgainLeadProcessingWithoutRouting() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickAgainLeadProcessingWithoutRouting));
		ClickAgainLeadProcessingWithoutRouting.click();
	}
	
	public void ClickOnNewLeadProWithoutRouting() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(NewLeadProWithoutRouting));
		NewLeadProWithoutRouting.click();
	}

	public void RightClickonCRM_AccFilter() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25))
				.until(ExpectedConditions.elementToBeClickable(CRM_Acc_Filter));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(CRM_Acc_Filter).click(CRM_Acc_Filter).contextClick(CRM_Acc_Filter).build().perform();
	}
	public void ClickAgainCRM_Acc_Filter() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(CRM_Acc_Filter));
		CRM_Acc_Filter.click();
	}

	public void RightClickonCRM_LeadFilter() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25))
				.until(ExpectedConditions.elementToBeClickable(NewCRM_Lead_Filter));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(NewCRM_Lead_Filter).click(NewCRM_Lead_Filter).contextClick(NewCRM_Lead_Filter).build()
				.perform();

	}
	public void ClickaganiCRM_Lead_Filter() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickaganiCRM_Lead_Filter));
		ClickaganiCRM_Lead_Filter.click();
	}
	
	public void InputOnRenameAutoTestObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(InputRename_AutoTestObject));
		InputRename_AutoTestObject.clear();
		InputRename_AutoTestObject.sendKeys("AutoTestObject_Rename");
	}
	public void GiveAnInputOnRenameAutoTestObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(InputRename_AutoTestObject));
		InputRename_AutoTestObject.clear();
		InputRename_AutoTestObject.sendKeys(randomString);
	}
	
	
	//******************************** Random String Genartator *****************************
	   int length = 10;

       // Generate a random string
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
	 
	//************************************************************************************************ 
	 
	public void ClickOnRenameBtn() {
		new WebDriverWait(ldriver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(renameBtn));
		renameBtn.click();
//		JavascriptExecutor js = (JavascriptExecutor) ldriver;
//		js.executeScript("arguments[0].click()", renameBtn);
	}

	public void ClickOnCloneBtn() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(btnClone));
		btnClone.click();
	}
	


	public void ClickOnInActiveLeadManagement() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(InActiveLeadManagement));
		InActiveLeadManagement.click();
	}
	
	public void RightClickonInActiveOwnertoSalesRep() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25))
				.until(ExpectedConditions.elementToBeClickable(InActiveOwnertoSalesRep));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(InActiveOwnertoSalesRep).click(InActiveOwnertoSalesRep).contextClick(InActiveOwnertoSalesRep).build().perform();

	}
	
	public void RightClickOnCappingLeveling() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25))
				.until(ExpectedConditions.elementToBeClickable(CappingLeveling));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(CappingLeveling).click(CappingLeveling)
				.contextClick(CappingLeveling).build().perform();
	}
	public void ClickAgainOnCappingLeveling() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(CappingLeveling));
		CappingLeveling.click();
	}


//----------------------------WAIT FILTER-----------------------------//
	
	public void RightClickonWaitFilter() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25))
				.until(ExpectedConditions.elementToBeClickable(ClickAgainWaitFilter));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(ClickAgainWaitFilter).click(ClickAgainWaitFilter).contextClick(ClickAgainWaitFilter).build()
				.perform();

	}	
	 public void WaitFilterDropDown() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(WaitFilter));
			WaitFilter.click();
	}
	 public void ClickAgainWaitFilter() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickAgainWaitFilter));
			ClickAgainWaitFilter.click();
	}
	

//---------------------------WAIT CONDITION----------------------//
	
	public void RightClickonWaitCondition() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25))
				.until(ExpectedConditions.elementToBeClickable(WaitCondition));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(WaitCondition).click(WaitCondition).contextClick(WaitCondition).build()
				.perform();

	}	
	public void WaitConditionDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(WaitCondition));
		WaitCondition.click();
}
	public void ClickAgainWaitCondition() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickAgainWaitCondition));
		ClickAgainWaitCondition.click();
}
	public void ClickOnWaitAttr() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(WaitAttr));
		WaitAttr.click();
	}
	
	public void WaitFor_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(AddField));
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(WaitFor));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(WaitFor).pause(Duration.ofSeconds(0)).clickAndHold(WaitFor).pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}
	public void WaitTill_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(AddField));
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(WaitTill));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(WaitTill).pause(Duration.ofSeconds(0)).clickAndHold(WaitTill).pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}
	public void WaitFil_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(AddField));
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(WaitFil));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(WaitFil).pause(Duration.ofSeconds(0)).clickAndHold(WaitFil).pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}
	 public void InputWaitFor() {
		   new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(WaitForInput));
		   WaitForInput.sendKeys("356");		
	}
	 public void ClickOnWaitForMinutes() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(WaitForMinutes));
			WaitForMinutes.click();
	}
	 public void ClickOnWaitForHours() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(WaitForHours));
			WaitForHours.click();
	}
	 public void ClickOnWaitForDays() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(WaitForDays));
			WaitForDays.click();
	}
	 
	 public void ClickOnSelectTime() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickOnSelectTime));
			ClickOnSelectTime.click();
		}

	 public void ClickOnDate() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(SelectDate));
			SelectDate.click();
		}
	 
	 public void ClickOnTime() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(SelectTime));
			SelectTime.click();
		}
	 public void ClickOnOkBtn() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickOkbtn));
			ClickOkbtn.click();
		}
	 public void ClickOnWaitTllOption() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(WaitTillOptionSelect));
			WaitTillOptionSelect.click();
	}
	 public void ClickOnWaitTllOption_1() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(WaitTillOptionSelect_1));
			WaitTillOptionSelect_1.click();
	}
	 public void ClickOnWaitFilterOption() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(WaitFilterOptionSelect));
			WaitFilterOptionSelect.click();
	}
	 public void ClickOnWaitFilterOption_1() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(WaitFilterOptionSelect_1));
			WaitFilterOptionSelect_1.click();
	}
	 public void ClickOnWaitFilterOption_2() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(WaitFilterOptionSelect_2));
			WaitFilterOptionSelect_2.click();
	}
	 public void ClickOnSelectwaitFilter() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(clickOnSelectWaitFilter));
			clickOnSelectWaitFilter.click();
    }

	 public void ClickOnWaitTllOption1() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(WaitTillOptionSelect));
			WaitTillOptionSelect1.click();
	}
	 public void ClickOnWaitFilterOption1() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(WaitFilterOptionSelect));
			WaitFilterOptionSelect1.click();
	}

	
		//-------------------------TaskList------------------------------//
		
		public void RightClickonTaskList() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25))
					.until(ExpectedConditions.elementToBeClickable(TaskList));
			Actions actions = new Actions(ldriver);
			actions.moveToElement(TaskList).click(TaskList).contextClick(TaskList).build()
					.perform();
		}
		
		public void ClickAgainOnTaskList() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(TaskList));
			TaskList.click();
		}
		
		public void InputOnTaskSubject() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(TaskSubjectInput));
			TaskSubjectInput.sendKeys("AutomationTesting");
		}
		
		
		public void TaskListDropDown() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(TaskListDropDown));
			TaskListDropDown.click();
		}	

		
		public boolean DisplayTaskListsOverview() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(DisplayTaskListsOverview));
			return DisplayTaskListsOverview.isDisplayed();
		}	
		
		public void ClickOnPriorityNormal() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickPriorityNormal));
			ClickPriorityNormal.click();
	}
		public void ClickOnPriorityHigh() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickPriorityHigh));
			ClickPriorityHigh.click();
	}
		public void ClickOnPriorityLow() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickPriorityLow));
			ClickPriorityLow.click();
	}
		public void ClickOnStatusInProgress() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickStatusInProgress));
			ClickStatusInProgress.click();
	}
		public void ClickOnStatusNotStarted() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickStatusNotStarted));
			ClickStatusNotStarted.click();
	}
		public void ClickOnStatusWaiting() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickStatusWaiting));
			ClickStatusWaiting.click();
	}
		public void ClickOnStatusDeferred() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickStatusDeferred));
			ClickStatusDeferred.click();
	}
		public void ClickOnStatusCompleted() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickStatusCompleted));
			ClickStatusCompleted.click();
	}
		public void InputOnCommentBox() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(InputOnCommentBox));
			InputOnCommentBox.sendKeys("This is Comment of Task Information.");
		}	
		

		public void ClickOnRadioBtn() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(RadioBtn));
			RadioBtn.click();
		}
		public void InputOnRadioBtn() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(InputOnRadioBtn));
			InputOnRadioBtn.sendKeys("5");
		}

//		
	
			
	//----------------------  Opportunity Filter--------------------//
			
			public void RightClickOnOpportunityFilter() {
				new WebDriverWait(ldriver, Duration.ofSeconds(25))
						.until(ExpectedConditions.elementToBeClickable(OpportunityFilter));
				Actions actions = new Actions(ldriver);
				actions.moveToElement(OpportunityFilter).click(OpportunityFilter).contextClick(OpportunityFilter).build()
						.perform();
			}	
			

			public void ClickOnOpportunityAttr() {
				new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(OpportunityAttr));
				OpportunityAttr.click();
			}
			
			public void Id_DND() {
				new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(AddField));
				new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(OpportunityId));
				Actions actions = new Actions(ldriver);
				int x = AddField.getLocation().x;
				int y = AddField.getLocation().y;
				actions.moveToElement(OpportunityId).pause(Duration.ofSeconds(0)).clickAndHold(OpportunityId).pause(Duration.ofSeconds(0))
						// .moveByOffset(x, y)
						.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
			}
			public void ClickOnIdContains() {
				new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(IdContains));
				IdContains.click();
			}		
			 public void InputIdContains() {
				   new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(InputIdContains));
				  InputIdContains.sendKeys("Testing With Automation!!");					
			}
			 public void Private_DND() {
				 new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(AddField));
					new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(Private));
					Actions actions = new Actions(ldriver);
					int x = AddField.getLocation().x;
					int y = AddField.getLocation().y;
					actions.moveToElement(Private).pause(Duration.ofSeconds(0)).clickAndHold(Private).pause(Duration.ofSeconds(0))
							// .moveByOffset(x, y)
							.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
			}
			 public void ClickOnPrivateIsNot() {
					new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(PrivateIsNot));
					PrivateIsNot.click();
				}
			 public void ClickOnPrivateTrue() {
					new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(PrivateTrue));
					PrivateTrue.click();
				}
						 
			 public void Amount_DND() {
				 new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(AddField));
					new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(Amount));
					Actions actions = new Actions(ldriver);
					int x = AddField.getLocation().x;
					int y = AddField.getLocation().y;
					actions.moveToElement(Amount).pause(Duration.ofSeconds(0)).clickAndHold(Amount).pause(Duration.ofSeconds(0))
							// .moveByOffset(x, y)
							.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
			}
			 
			 public void ClickOnAmountIsSmallerThan() {
					new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(AmountIsSmallerThan));
					AmountIsSmallerThan.click();
				}
			 public void InputAmountIsSmallerThan() {
				   new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(AmountInput));
				   AmountInput.sendKeys("6");					
			}
			 public void CloseDate_DND() {
				 new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(AddField));
					new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(CloseDate));
					Actions actions = new Actions(ldriver);
					int x = AddField.getLocation().x;
					int y = AddField.getLocation().y;
					actions.moveToElement(CloseDate).pause(Duration.ofSeconds(0)).clickAndHold(CloseDate).pause(Duration.ofSeconds(0))
							// .moveByOffset(x, y)
							.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
			}
			 public void ClickOnCloseDateBefore() {
					new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(CloseDateBefore));
					CloseDateBefore.click();
				}

			 public void ClickonID_NotIn() {
					new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(IdNotIn));
					IdNotIn.click();
				}
			 public void ClickOnIdInAddbtn() {
					new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(IdInAddbtn));
					IdInAddbtn.click();
				}
							
				public void ClickOnOpportunityActivityAttr() {
					new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(OpportunityActivityAttr));
					OpportunityActivityAttr.click();
				}
					
				public void ClickOnFolder() {
					new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickFolder));
					ClickFolder.click();
				}
				public void ContactRoutingTerritoryContactMgmntFolder() {
					new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ContactRoutingTerritoryContactMgmntFolder));
					ContactRoutingTerritoryContactMgmntFolder.click();
				}
				
				public void AccRoutingTeritoryFolder() {
					new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(AccRoutingTeritoryFolder));
					AccRoutingTeritoryFolder.click();
				}
				public void AnalyticsAccountListFolder() {
					new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(AnalyticsAccountListFolder));
					AnalyticsAccountListFolder.click();
				}
				
				public void ClickFolderForLPWR() {
					new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickFolderForLPWR));
					ClickFolderForLPWR.click();
				}
				public void PartnerLeadRouterFolder() {
					new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(PartnerLeadRouterFolder));
					PartnerLeadRouterFolder.click();
				}
				
				public void ContactRouterContactMgmntFolder() {
					new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ContactRouterContactMgmntFolder));
					ContactRouterContactMgmntFolder.click();
				}
				
				public void ClickOnFolderSalesTeam() {
					new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickSalesTeamFolder));
					ClickSalesTeamFolder.click();
				}
				public void ClickOnCappingFolder() {
					new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickCappingFolder));
					ClickCappingFolder.click();
				}
				public void ClickOnContactFolder() {
					new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickContactFolder));
					ClickContactFolder.click();
				}
				public void CustomHeaderFolder() {
					new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(CustomHeaderFolder));
					CustomHeaderFolder.click();
				}
				public void CustomHeaderFolderr() {
					new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(CustomHeaderFolderr));
					CustomHeaderFolderr.click();
				}
				public void ResponseMapingFolder() {
					new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ResponseMapingFolder));
					ResponseMapingFolder.click();
				}
				public void ResponseMapingFolderName() {
					new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ResponseMapingFolderName));
					ResponseMapingFolderName.click();
				}
				public void LeadRoutingTerritoryFolder() {
					new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(LeadRoutingTerritoryFolder));
					LeadRoutingTerritoryFolder.click();
				}
				public void ClickOnCRMAccFolder() {
					new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(CRMAccFolder));
					CRMAccFolder.click();
				}
				public void CRMAccFilterAccMgmtFolder() {
					new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(CRMAccFilterAccMgmtFolder));
					CRMAccFilterAccMgmtFolder.click();
				}
				
				public void ClickOnEscalConditionFolder() {
					new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(EscalConditionFolder));
					EscalConditionFolder.click();
				}
				public void ClickOnTaskListFolder() {
					new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(TaskListFolder));
					TaskListFolder.click();
				}
				public void ClickOnWaitConditionFolder() {
					new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(WaitConditionFolder));
					WaitConditionFolder.click();
				}
				public void ClickOnWaitFilterFolder() {
					new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(WaitFilterFolder));
					WaitFilterFolder.click();

				}
				public void WaitConditionPartnerLeadMgnmtFolder() {
					new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(WaitConditionPartnerLeadMgnmtFolder));
					WaitConditionPartnerLeadMgnmtFolder.click();

				}
				
				public void WaitFilterPartnerLeadMgmntFolder() {
					new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(WaitFilterPartnerLeadMgmntFolder));
					WaitFilterPartnerLeadMgmntFolder.click();
				}
				
				public void ClickOnWaitFilterFolder1() {
					new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(WFFolder));
					WFFolder.click();
				}
				
				
				public boolean DisplayLRT() {					
				try {
						new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(LeadRoutingTerritory));
						return LeadRoutingTerritory.isDisplayed();
						}catch(Exception e) {
							return false;
						}						
					
				}
				
				
				
				
				
//-----------------------------CRUD OPERATION----------------------------//		
		
	// ===============Saving Random Generated String==================//

	String generatedRandomStr = randomstring();

	public void ClickOnNewObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(NewObject));
		NewObject.click();
	}
	public void EnterNameForOTSObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(txtNameObject));
		txtNameObject.sendKeys(generatedRandomStr);

	}	
	public void NameInCrudObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(txtNameObject));
		txtNameObject.sendKeys("AutoTestObject");

	}		
	public void DescInRRT() {
		new WebDriverWait(ldriver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(txtDesc));
		txtDesc.sendKeys("Automation Testing Going on...!!!");
	}

	public void clickOnSaveNewObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(btnNewObjectSave));
		btnNewObjectSave.click();
	}	
				
	public void ClickonSalesTeam() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SalesTeam));
		SalesTeam.click();
	}		
	public void RightClickonAE() {
		Actions actions = new Actions(ldriver);
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(RightClickSalesRepTeam));
		actions.contextClick(RightClickSalesRepTeam).perform();
	}
	public void ClickAgainonAE() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(SalesRepTeam));
		SalesRepTeam.click();
	}
	public void SelectonAEoption1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(SelectAE1));
		SelectAE1.click();
	}
	
	public String getIndexedValue() {
	    String text = IndexValueCheck.getText();
	    	    // Perform any necessary parsing or manipulation to extract the indexing value
	    // Return the indexing value
	    return text;
	}
	
	
	public void ClickonInputAE1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(AEInput1));
		AEInput1.click();
	}
	public void ClickonSDR_Mapping1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(SDR_MappingInput1));
		SDR_MappingInput1.click();
	}
	public void SelectonSDRoption1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(SelectSDR1));
		SelectSDR1.click();
	}
	public void ClickonInputAE2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(AEInput2));
		AEInput2.click();
	}
	public void SelectonSDRoption2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(SelectSDR2));
		SelectSDR2.click();
	}
	
	public void ClickonSDR_Mapping2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(SDR_MappingInput2));
		SDR_MappingInput2.click();
	}
	public void ClickonInputAE3() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(AEInput2));
		AEInput3.click();
	}
	public void ClickonSDR_Mapping3() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(SDR_MappingInput3));
		SDR_MappingInput3.click();
	}
	public void SelectonSDRoption3() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(SelectSDR2));
		SelectSDR3.click(); 
	}
	public void ContextClickOnAutoTestObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AutoTestObject));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(AutoTestObject).click(AutoTestObject).contextClick(AutoTestObject).build().perform();
	}
	public void ClickOnWaitFilterDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(WaitFilter));
		WaitFilter.click(); 
	}
	public void ClickagainAutoTestObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(35)).until(ExpectedConditions.elementToBeClickable(AutoTestObject));
		AutoTestObject.click(); 
	}
	public void selectAutoTestObject_Rename() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(WaitFilter));
		selectAutoTestObject_Rename.click(); 
	}
	
	
	public void ClickOnApproveBtn() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(Approve_AEtoSDR));
		// Approve_AEtoSDR.click();
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", Approve_AEtoSDR);
	}			
	public void ClickOnEditAutoTestObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(Edit_AutoTestObject));
		Edit_AutoTestObject.click();
	}
	public void ClickOnEditButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickOnEditButton));
		ClickOnEditButton.click();
	}	
	public void ClickOnRenameAutoTestObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(Rename_AutoTestObject));
		Rename_AutoTestObject.click();
	}		
				
	public boolean DisplayRenameAutoTestObject() {

		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(AutoTestObjectAfterRename));
			return AutoTestObjectAfterRename.isDisplayed();
		}catch(Exception e) {
			return false;
		}								
	}	
public void ClickOnDeleteOnClonedAutoTestObject() {
	new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(Delete_AutoTestObject));
	// Delete_AEtoSDR.click();
	JavascriptExecutor js = (JavascriptExecutor) ldriver;
	js.executeScript("arguments[0].click()", Delete_AutoTestObject);
}

public void ClickOnDeletebtn() {
	new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(btnDelete));
	btnDelete.click();
}				

				
public void ContextClickOnRenameAutoTestObject() {
	new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(AutoTestObjectRename));
	Actions actions = new Actions(ldriver);
	actions.moveToElement(AutoTestObjectRename).click(AutoTestObjectRename).contextClick(AutoTestObjectRename).build()
			.perform();
}				
public boolean VisibleOfRenameAutoTestObject() {
	new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.visibilityOf(AutoTestObjectRename));
	 return    AutoTestObjectRename.isDisplayed();
}

public void ClickOnAgainRenameAutoTestObject() {
	new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(AutoTestObjectRename));
	AutoTestObjectRename.click();
}
public void ClickOnCloneAutoTestObject() {
	new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(clone_AutoTestObject));
	clone_AutoTestObject.click();
}			
public boolean DisplayCloneAutoTestObject() {
	new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.visibilityOf(AutoTestObjectAfterClone));
	return AutoTestObjectAfterClone.isDisplayed();
}				
public void ContextClickOnCloneAutoTestObject() {
	new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(AutoTestObjectAfterClone));
	Actions actions = new Actions(ldriver);
	actions.moveToElement(AutoTestObjectAfterClone).click(AutoTestObjectAfterClone).contextClick(AutoTestObjectAfterClone).build().perform();
}				
public boolean DisplayDeleteAutoTestObject() {
	new WebDriverWait(ldriver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(DisplayDelete));
	return DisplayDelete.isDisplayed();
}	

public void ClickOnMoveAutoTestObject() {
	new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(Move_AutoTestObject));
	Move_AutoTestObject.click();
}				
public void SelectFolder() {
	new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(Move_SelectFolder));
	Move_SelectFolder.click();
}

public void ClickOnMoveBtn() {
	new WebDriverWait(ldriver, Duration.ofSeconds(35)).until(ExpectedConditions.elementToBeClickable(btnMove));
	btnMove.click();
}
public void MoveButtonForWaitFilter() {
	new WebDriverWait(ldriver, Duration.ofSeconds(35)).until(ExpectedConditions.elementToBeClickable(MoveButtonForWaitFilter));
	MoveButtonForWaitFilter.click();
}

//--------------------Capping Leveling---------------------------//				

public void ClickonFirstName_DoesNotContain() {
	new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(FirstNameDoesNotContains));
	FirstNameDoesNotContains.click();
}

public void ClickonAnnualRevenue_IsGreaterThan() {
	new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(AnnualRevenueIsGreaterThan));
	AnnualRevenueIsGreaterThan.click();
}				
public void ClickonCreatedDate_Between() {
	new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(CreatedDateInBetween));
	CreatedDateInBetween.click();
}			
public void ClickonFirstName_IN() {
	new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(FirstNameIn));
	FirstNameIn.click();
}			
public void ClickOnCapping_levellingDropDown() {
	new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(Capping_levellingDropDown));
	Capping_levellingDropDown.click(); 
}
//-------------------------------Contact Filter --------------------//

public void FullName_DND() {
	new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(AddField));
	new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ContactFullName));
	Actions actions = new Actions(ldriver);
	int x = AddField.getLocation().x;
	int y = AddField.getLocation().y;
	actions.moveToElement(ContactFullName).pause(Duration.ofSeconds(0)).clickAndHold(ContactFullName).pause(Duration.ofSeconds(0))
			// .moveByOffset(x, y)
			.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
}

		public void RightClickOnContactFilter() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25))
					.until(ExpectedConditions.elementToBeClickable(ContactFilter));
			Actions actions = new Actions(ldriver);
			actions.moveToElement(ContactFilter).click(ContactFilter).contextClick(ContactFilter).build()
					.perform();
		}
		public void ClickOnContactAttr() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ContactAttr));
			ContactAttr.click();
		}
		
		public void ClickOnFullNameStartWith() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(FullNameStartWith));
			FullNameStartWith.click();
		}
		 public void InputFullNameStartWith() {
			   new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(FullnameStartWithInput));
			   FullnameStartWithInput.sendKeys("Testing With Automation!!");					
		}
		 
		 public void MailingLongitude_DND() {
			 new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(AddField));
				new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(MailingLongitude));
				Actions actions = new Actions(ldriver);
				int x = AddField.getLocation().x;
				int y = AddField.getLocation().y;
				actions.moveToElement(MailingLongitude).pause(Duration.ofSeconds(0)).clickAndHold(MailingLongitude).pause(Duration.ofSeconds(0))
						// .moveByOffset(x, y)
						.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
		}
		 
		 public void InputMailingLongitudeIsSmallerThan() {
			   new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(MailingLongitudeInput));
			   MailingLongitudeInput.sendKeys("6");					
		}
		 public void ClickOnMalingLongitudeIsSmallerThan() {
				new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(MailingLongitudeIsSmallerThan));
				MailingLongitudeIsSmallerThan.click();
			}
		 public void ContactCreatedDate_DND() {
			 new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(AddField));
				new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ContactCreatedDate));
				Actions actions = new Actions(ldriver);
				int x = AddField.getLocation().x;
				int y = AddField.getLocation().y;
				actions.moveToElement(ContactCreatedDate).pause(Duration.ofSeconds(0)).clickAndHold(ContactCreatedDate)
						.pause(Duration.ofSeconds(0))
						// .moveByOffset(x, y)
						.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
			}
				
		 public void ClickOnCreatedDateAfter() {
				new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(CreatedDateAfter));
				CreatedDateAfter.click();
			}

		 public void ClickonFullName_IN() {
				new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(FullNameIN));
				FullNameIN.click();
			}
		 public void ClickOnFullNameInAddbtn() {
				new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(FullNameInAddBtn));
				FullNameInAddBtn.click();
			}
		 

			public void ScrollIntoViewMailingLongitude() {
				((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", MailingLongitude);
			}
			public void ScrollIntoViewCreatedDate() {
				((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", ContactCreatedDate);
			}

			public void ClickOnAutoTestObject() {
				new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(AutoTestObject));
				AutoTestObject.click();
				
			}
		
			
			
 //*****************************************************Lead Routing Page DropDown********************************************
			public void getLeadRoutingDropDown()
			{
				new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(LeadRouting));
				LeadRouting.click();
			}
		 
		 public void getCappingOrLeevellingConditionDropDown()
			{
				new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(ClickCappingFolder));
				ClickCappingFolder.click();
			}
		 
		
		 
		 public void getWaitFilterDropDown()
			{
				new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(WaitFilter));
				WaitFilter.click();
			}
		 
		 public void getWaitConditionDropDown()
			{
				new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(WaitCondition));
				WaitCondition.click();
			}
		 
		 public void getLeadRouterDropDown()
			{
				new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(LeadRouterDropDown));
				LeadRouterDropDown.click();
			}
		 public void RightClickOnLeadRouter() {
			 new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(LeadRouter));
				Actions actions = new Actions(ldriver);
				actions.moveToElement(LeadRouter).contextClick(LeadRouter).build().perform();
			
			}
		 
		 public void ClickAgainOnLeadRouter()
			{
				new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(LeadRouter));
				LeadRouter.click();
			}	
		 
		 
		 
		 
}
