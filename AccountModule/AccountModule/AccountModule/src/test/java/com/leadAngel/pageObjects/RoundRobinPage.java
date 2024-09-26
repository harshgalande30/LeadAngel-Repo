package com.leadAngel.pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class RoundRobinPage {

	WebDriver ldriver;

	public RoundRobinPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}
	@FindBy(xpath="//select[@id='drpString_0']")
	WebElement AboutMeDropDown;
	
	
	
	@FindBy(xpath = "//button[(text()=' Sales Rep Attributes ')]")
	WebElement SalesRepAttr;
	@FindBy(xpath = "(//i[@class='righticon-STRING'])[46]")//("//mat-list-item[contains(@id,'About Me')]")
	WebElement AboutMe;
	@FindBy(xpath = "//mat-panel-title[contains(@class,'mat-expansion-panel-header-title') and ./span/text()='About Me' and ./span/text()='4']")
	WebElement AboutMeMoved;
	@FindBy(xpath = "//mat-panel-title[contains(@class,'mat-expansion-panel-header-title') and ./span/text()='About Me' and ./span/text()='1']")
	WebElement AboutMtAfterMoved;
	@FindBy(xpath = "//mat-list-item[contains(@id,'Active')]")
	WebElement Active;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Active']//parent::div//option[text()='is']")
	WebElement ActiveIs;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Active']//parent::div//option[text()='is not']")
	WebElement ActiveIsNot;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Active']//parent::div//option[text()='True']")
	WebElement ActiveIsTrue;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Active']//parent::div//option[text()='False']")
	WebElement ActiveIsFalse;
	@FindBy(xpath = "//mat-panel-title[contains(@class,'mat-expansion-panel-header-title') and ./span/text()='Active' and ./span/text()='4']")
	WebElement ActiveMoved;
	@FindBy(xpath = "//mat-panel-title[contains(@class,'mat-expansion-panel-header-title') and ./span/text()='Active' and ./span/text()='1']")
	WebElement ActiveAfterMoved;
	@FindBy(xpath = "//div[@id='cdk-drop-list-0']")
	WebElement AddField;
	@FindBy(xpath = "//label[text()='Last Name']//parent::div")
	WebElement userLastName;

	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='About Me']//parent::div//option[text()='contains']")
	WebElement AboutMeContains;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='About Me']//parent::div//option[text()='does not contain ']")
	WebElement AboutMeDoesNotContain;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='About Me']//parent::div//option[text()=' starts with ']")
	WebElement AboutMeStartsWith;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='About Me']//parent::div//option[text()='does not start with ']")
	WebElement AboutMeDoesNotStartWith;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='About Me']//parent::div//option[text()='is empty']")
	WebElement AboutMeIsEmpty;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='About Me']//parent::div//option[text()='is not empty']")
	WebElement AboutMeIsNotEmpty;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='About Me']//parent::div//option[text()='in']")
	WebElement AboutMeIn;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='About Me']//parent::div//option[text()='not in']")
	WebElement AboutMeNotIn;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='About Me']//parent::div//mat-icon[text()='add_box']")
	WebElement AboutMeInAddbtn;
	@FindBy(xpath = "//input[@readonly]")
	WebElement InputReadOnly;
	@FindBy(xpath = "(//mat-list-option//div[@class='mat-list-text'])[1]")
	WebElement AboutMeIntro;
	@FindBy(xpath = "//button//span[text()='Save']")
	WebElement AboutMeSavebtn;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='About Me']//parent::div//input[@type='text']")
	WebElement AboutMeContainsInput;
	@FindBy(xpath = "//mat-list-item[contains(@id,'Created Date')]")
	WebElement CreatedDate;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Created Date']//parent::div//option[text()='before']")
	WebElement CreatedDateBefore;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Created Date']//parent::div//option[text()='after']")
	WebElement CreatedDateAfter;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Created Date']//parent::div//option[text()='on or before']")
	WebElement CreatedDateOnOrBefore;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Created Date']//parent::div//option[text()='on or after']")
	WebElement CreatedDateOnOrAfter;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Created Date']//parent::div//option[text()='in past']")
	WebElement CreatedDateInPast;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Created Date']//parent::div//input[@formcontrolname='TextBox1']")
	WebElement txtBoxCreatedDate;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Created Date']//parent::div//select//option[text()='Hours']")
	WebElement HoursInCreatedDate;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Created Date']//parent::div//select//option[text()='Days']")
	WebElement DaysInCreatedDate;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Created Date']//parent::div//select//option[text()='Weeks']")
	WebElement WeeksInCreatedDate;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Created Date']//parent::div//option[text()='in past before ']")
	WebElement CreatedDateInPastBefore;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Created Date']//parent::div//option[text()='in future']")
	WebElement CreatedDateInFuture;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Created Date']//parent::div//option[text()='in future after ']")
	WebElement CreatedDateInFutureAfter;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Created Date']//parent::div//option[text()='between']")
	WebElement CreatedDateBetween;
	@FindBy(xpath = "(//button[@aria-label='Open calendar'])[1]")
	WebElement CreatedDateCalendarBtn;
	@FindBy(xpath = "(//button[@aria-label='Open calendar'])[2]")
	WebElement CreatedDateCalendarBtn2;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Created Date']//parent::div//option[text()='in time frame']")
	WebElement CreatedDateInTimeFrame;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Created Date']//parent::div//option[text()='is']")
	WebElement CreatedDateIs;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Created Date']//parent::div//option[text()='is not']")
	WebElement CreatedIsNot;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Created Date']//parent::div//option[text()='is empty']")
	WebElement CreatedIsEmpty;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Created Date']//parent::div//option[text()='is not empty']")
	WebElement CreatedIsNotEmpty;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Created Date']//parent::div//option[text()='Today']")
	WebElement InTimeFrameToday;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Created Date']//parent::div//option[text()='Yesterday']")
	WebElement InTimeFrameYesterday;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Created Date']//parent::div//option[text()='This Week S S']")
	WebElement InTimeFrameThisWeekSS;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Created Date']//parent::div//option[text()='This Week M F']")
	WebElement InTimeFrameThisWeekMF;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Created Date']//parent::div//option[text()='This Month']")
	WebElement InTimeFrameThisMonth;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Created Date']//parent::div//option[text()='Last Month']")
	WebElement InTimeFrameLastMonth;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Created Date']//parent::div//option[text()='This Calendar Quarter']")
	WebElement InTimeFrameThisCalQuarter;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Created Date']//parent::div//option[text()='Last Calendar Quarter']")
	WebElement InTimeFrameLastCalQuarter;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Created Date']//parent::div//option[text()='This Calendar Year']")
	WebElement InTimeFrameThisCalYear;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Created Date']//parent::div//option[text()='Last Calendar Year']")
	WebElement InTimeFrameLasCalYear;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Created Date']//parent::div//option[text()='Last Week S S']")
	WebElement InTimeFrameThisWeekSS2;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Created Date']//parent::div//option[text()='Last Week M F']")
	WebElement InTimeFrameLastWeekMG;

	@FindBy(xpath = "//mat-panel-title[contains(@class,'mat-expansion-panel-header-title') and ./span/text()='Created Date' and ./span/text()='4']")
	WebElement CreatedDateMove;
	@FindBy(xpath = "//mat-panel-title[contains(@class,'mat-expansion-panel-header-title') and ./span/text()='Created Date' and ./span/text()='1']")
	WebElement CreatedDateAfterMoved;
	@FindBy(xpath = "//button[@aria-label='Open calendar']")
	WebElement CreatedDateCalendarButton;
	@FindBy(xpath = "//button[@type='button']//div[contains(text(),'12')]")
	WebElement SelectDate;
	@FindBy(xpath = "//button[@type='button']//div[contains(text(),'18')]")
	WebElement SelectDate2;

	
	@FindBy(xpath = "(//button[@aria-label='Open calendar'])[2]")
	WebElement Calendar1;
	@FindBy(xpath = "(//button[@aria-label='Open calendar'])[3]")
	WebElement Calendar2;
	@FindBy(xpath = "//mat-list-item[contains(@id,'Longitude')]")
	WebElement Longitude;
	@FindBy(xpath = "//mat-panel-title[contains(@class,'mat-expansion-panel-header-title') and ./span/text()='Longitude' and ./span/text()='4']")
	WebElement LongitudeMove;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Longitude ']//parent::div//mat-icon[text()='add_box']")
	WebElement LongitudeAddbtn;
	@FindBy(xpath = "//textarea")
	WebElement LongitudeTextArea;
	@FindBy(xpath = "//mat-panel-title[contains(@class,'mat-expansion-panel-header-title') and ./span/text()='Longitude' and ./span/text()='1']")
	WebElement LongitudeAfterMoved;

	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Longitude ']//parent::div//option[text()='is greater than ']")
	WebElement LongitudeSelect;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Longitude ']//parent::div//option[text()='in']")
	WebElement LongitudeIN;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Longitude ']//parent::div//input[@type='number']")
	WebElement LongitudeInput;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Longitude ']//parent::div//option[text()='is empty']")
	WebElement LongitudeIsEmpty;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Longitude ']//parent::div//option[text()='is not empty']")
	WebElement LongitueIsNotEmpty;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Longitude ']//parent::div//option[text()='in']")
	WebElement LongitudeIn;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Longitude ']//parent::div//option[text()='not in']")
	WebElement LongitudeNotIn;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Longitude ']//parent::div//option[text()='is greater than ']")
	WebElement LongitudeIsGreaterThan;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Longitude ']//parent::div//option[text()='is smaller than ']")
	WebElement LongitudeIsSmallerThan;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Longitude ']//parent::div//option[text()='between']")
	WebElement LongitudeBetween;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Longitude ']//parent::div//input[@formcontrolname='TextBox1']")
	WebElement LongitudeBetweentxtBox1;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Longitude ']//parent::div//input[@formcontrolname='TextBox2']")
	WebElement LongitudeBetweentxtBox2;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Longitude ']//parent::div//option[text()='is at least']")
	WebElement LongitudeIsAtleast;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Longitude ']//parent::div//option[text()='is at most']")
	WebElement LongitudeIsAtMost;

	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Longitude ']//parent::div//mat-icon[text()='add_box']")
	WebElement LongitudeAddbtn2;

	@FindBy(xpath = "//*[@id=\"Address$#!@#$%^1\"]")
	WebElement Address;

	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Address']//parent::div//option[text()='starts with']")
	WebElement AddressStartsWith;

	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Address']//parent::div//input[@type='text']")
	WebElement AddressStartsWithInput;
	@FindBy(xpath = "//mat-panel-title[contains(@class,'mat-expansion-panel-header-title') and ./span/text()='Address' and ./span/text()='7']")
	WebElement AddressMove;
	@FindBy(xpath = "//mat-panel-title[contains(@class,'mat-expansion-panel-header-title') and ./span/text()='Address' and ./span/text()='2']")
	WebElement AddressAfterMoved;

	@FindBy(xpath="//li[text()= ' Queue Management ']")
	WebElement QueueManagement;
	@FindBy(xpath="//li[text()=' Assignment Limit ']")
	WebElement AssignmentLimit;
	@FindBy(xpath = "//li/i[text()='drafts']")
	WebElement Draft;
	@FindBy(xpath = "(//mat-expansion-panel-header[@role='button'])[2]")
	WebElement Elem2Move;
	@FindBy(xpath = "(//mat-toolbar)[3]")
	WebElement ElemOnMove;
	@FindBy(xpath = "//mat-panel-title//span[text()='About Me']")
	WebElement user1;
	@FindBy(xpath = "//mat-panel-title//span[text()='4']")
	WebElement user4;
	@FindBy(xpath = "//mat-panel-title//span[text()='4']")
	WebElement user2;
	@FindBy(xpath = "//mat-list-item[contains(@id,'Last Name')]")
	WebElement LastName;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Last Name']//parent::div//option[text()='starts with']")
	WebElement LastNameStartsWith;
	@FindBy(xpath = "//div[@class='form-group pt-3 row']//label[text()='Last Name']//parent::div//input[@type='text']")
	WebElement LastNameStartsWithInput;

	@FindBy(xpath = "//mat-panel-title[contains(@class,'mat-expansion-panel-header-title') and ./span/text()='Last Name' and ./span/text()='7']")
	WebElement LastNameMove;
	@FindBy(xpath = "//mat-panel-title[contains(@class,'mat-expansion-panel-header-title') and ./span/text()='Last Name' and ./span/text()='2']")
	WebElement LastNameMoved;
	@FindBy(xpath = "(//input[@placeholder='Search'])[2]")
	WebElement SearchBox;

	@FindBy(xpath = "//button//span[text()='Collapse All ']")
	WebElement btnCollapseAll;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement ApproveSubmitbtn;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement ApproveSubmitbtnForTaskList;
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	WebElement ApproveSubmitbtnForLeadRouter;
	@FindBy(xpath = "//button//span[text()='Expand All ']")
	WebElement btnExpandAll;
	@FindBy(xpath = "//button//mat-icon[text()='done_all']")
	WebElement btnApprove;
	@FindBy(xpath = "//li[text()=' Approved ']")
	WebElement Approved;
	@FindBy(xpath = "//button//span[text()='Cancel']")
	WebElement btnCancel;
	@FindBy(xpath = "//button//span[text()='Approve']")
	WebElement btnApprove2;

	@FindBy(xpath = "//div[text()='There are errors on the canvas. Please correct the items highlighted in red below in order to proceed.']")
	WebElement ErrorMessage;
	@FindBy(xpath = "//div[text()='Error']")
	WebElement ErrorMessage2;	
	@FindBy(xpath = "//button//span[text()='Default Filter ']")
	WebElement DefaultFilter;
	@FindBy(xpath = "//button[text()='Custom Filter']")
	WebElement CustomFilter;
	@FindBy(xpath = "//input[@name='canvassearch']")
	WebElement InputCustomFilter;
	@FindBy(xpath = "//i[text()='description']")
	WebElement Detail;
	@FindBy(xpath = "(//div[text()=\" Maximum of 10 values per filter.\"])[2]")
	WebElement DisplayErrorComma;
	@FindBy(xpath = "(//div[text()='Please Check the decimal'])[2]")
	WebElement ErrorDecimal;
	@FindBy(xpath = "(//div[text()='Please paste numerical values only'])[2]")
	WebElement ErrorAlphabet;
	@FindBy(xpath = "(//div[text()='can not leave blank lines'])[2]")
	WebElement ErrorBlank;


	@FindBy(xpath = "//input[@type=\"number\"]")
	WebElement isReadonly;
	@FindBy(xpath = "//span[@id='autoSave' and ./text()='Saving...']")
	WebElement SavingInfo;

	
	@FindBy(xpath="//span[contains(text(),' AutoTestObject ')]")
	WebElement AutoTestObject;
	@FindBy(xpath="//button[text()='Approve ']")
	WebElement ObjectApprove;
	@FindBy(xpath="//button[text()='Edit ']")
	WebElement ObjectEdit;
	@FindBy(xpath="//button[text()='Rename ']")
	WebElement ObjectRename;
	@FindBy(xpath="//button[text()='Clone ']")
	WebElement ObjectClone;
	@FindBy(xpath="//button[text()='Move ']")
    WebElement ObjectMove;
	@FindBy(xpath="//button[text()='Delete ']")
	WebElement ObjectDelete;
	@FindBy(xpath="//input[@id='menuname']")
	WebElement RenameInputDecs;
	@FindBy(xpath="//span[text()=' Rename ']")
    WebElement Renamebtn;
	@FindBy(xpath="//span[text()=' Clone ']")
	WebElement Clonebtn;
	@FindBy(xpath="//select[@id='ddlcausetype']")
	WebElement MoveFolderSelect; 
	@FindBy(xpath="(//select[@id='ddlcausetype']//option)[2]")
	WebElement MoveFolder;
	@FindBy(xpath="//button[@aria-label='toggle ..folder']")
	WebElement AccRouterAccMgmtFolder;
	@FindBy(xpath="//button[@aria-label='toggle .hk']")
	WebElement MoveFolderForEscallationRuter;
	@FindBy(xpath="//button[@aria-label='toggle ....Folder-18sep']")
	WebElement MovedFolderDropDown;
	@FindBy(xpath="//span[text()=' NewObjectName ']")
	WebElement NewRenameObject;
	@FindBy(xpath="//button//span[text()=' Move ']")
	WebElement MoveBtn;
	@FindBy(xpath="//span[text()=' NewObjectName_Copy(1) ']")
	WebElement CloneObjDelete;
	
	@FindBy(xpath = "//h4[text()='Round Robin Team Overview']")
	WebElement DisplayRoundRobinTeamOverview;
	
	public boolean isDisplayRoundRobinTeamOverview() {
		  new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayRoundRobinTeamOverview));
		  return DisplayRoundRobinTeamOverview.isDisplayed();
	}
	
	public void getAboutMeDropDown()
	{
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AboutMeDropDown));
		AboutMeDropDown.click();
		
	}
	public boolean DisplaySavingInfo() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(SavingInfo));
		return SavingInfo.isDisplayed();
	}

	public void isInputreadOnly() {
		Assert.assertTrue(isReadonly.getAttribute("readOnly").equals("true"), "Element ReadOnly");
	}

	public boolean DisplayErrorComma() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayErrorComma));
		return DisplayErrorComma.isDisplayed();
	}

	public boolean DisplayDecimalError() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ErrorDecimal));
		return ErrorDecimal.isDisplayed();
	}

	public boolean DisplayAlphabetError() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ErrorAlphabet));
		return ErrorAlphabet.isDisplayed();
	}

	public boolean DisplayBlankLineError() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ErrorBlank));
		return ErrorBlank.isDisplayed();
	}

	public void clickOnCustomFilter() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CustomFilter));
		CustomFilter.click();
	}

	public void InputCustomFilter1_and_2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(InputCustomFilter));
		// InputCustomFilter.clear();
		InputCustomFilter.sendKeys("1 and 2");
	}

	public void InputCustomFilterBLANK() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(InputCustomFilter));
		InputCustomFilter.sendKeys(" ");
	}

	public void clickOnDefaultFilter() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DefaultFilter));
		DefaultFilter.click();
	}

	public void ClickonSalesRepAttr() {
		new WebDriverWait(ldriver, Duration.ofSeconds(7)).until(ExpectedConditions.elementToBeClickable(SalesRepAttr));
		SalesRepAttr.click();
	}

	public void AboutMe_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(AddField));
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(AboutMe));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(AboutMe).pause(Duration.ofSeconds(1)).clickAndHold(AboutMe).pause(Duration.ofSeconds(1))
				// .moveByOffset(x, y)
				.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();

	}

	public void ClickOnAboutMe_Contains() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AboutMeContains));
		AboutMeContains.click();
	}

	public void ClickOnAboutMe_DoesNotContain() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AboutMeDoesNotContain));
		AboutMeDoesNotContain.click();
	}

	public void ClickOnAboutMe_StartsWith() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AboutMeStartsWith));
		AboutMeStartsWith.click();
	}

	public void ClickOnAboutMe_DoesNotStartWith() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AboutMeDoesNotStartWith));
		AboutMeDoesNotStartWith.click();
	}

	public void ClickOnAboutMe_IsEmpty() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AboutMeIsEmpty));
		AboutMeIsEmpty.click();
	}

	public void ClickOnAboutMe_IsNotEmpty() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AboutMeIsNotEmpty));
		AboutMeIsNotEmpty.click();
	}

	public void ClickOnAboutMe_In() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AboutMeIn));
		AboutMeIn.click();
	}

	public void ClickOnAboutMeNotIn() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AboutMeNotIn));
		AboutMeNotIn.click();
	}

	public void ClickOnAboutMeInAddbtn() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AboutMeInAddbtn));
		AboutMeInAddbtn.click();
	}

	public void ClickOnAboutMeIntro() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AboutMeIntro));
		AboutMeIntro.click();
	}

	public void ClickOnAboutMesaveButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AboutMeSavebtn));
		AboutMeSavebtn.click();
	}

	public boolean isInputReadOnly() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(InputReadOnly));
		return InputReadOnly.isDisplayed();
	}

	public void InputAboutMeContains() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AboutMeContainsInput));
		AboutMeContainsInput.sendKeys("testing With Automation!!");
	}

	public void InputAboutMeContainsComma() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AboutMeContainsInput));
		AboutMeContainsInput.sendKeys("1,2,3,4,5,6,7,8,9,10,");
	}

	public void Active_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(AddField));
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(Active));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(Active).pause(Duration.ofSeconds(0)).clickAndHold(Active).pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}

	public void ClickOnActiveIs() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ActiveIs));
		ActiveIs.click();
	}

	public void ClickOnActiveIsNot() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ActiveIsNot));
		ActiveIsNot.click();
	}

	public void InputActiveTrue() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ActiveIsTrue));
		ActiveIsTrue.click();
	}

	public void InputActiveFalse() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ActiveIsFalse));
		ActiveIsFalse.click();
	}

	public void ScrollIntoViewCreatedDate() {
		((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", CreatedDate);
	}
	

	public void CreatedDate_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(AddField));
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CreatedDate));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(CreatedDate).pause(Duration.ofSeconds(0)).clickAndHold(CreatedDate)
				.pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}

	public void CreatedDate_Move() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(AddField));
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CreatedDateMove));
		Actions actions = new Actions(ldriver);
		int x = ElemOnMove.getLocation().x;
		int y = ElemOnMove.getLocation().y;
		actions.moveToElement(CreatedDateMove).pause(Duration.ofSeconds(0)).clickAndHold(CreatedDateMove)
				.pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(ElemOnMove).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}

	public boolean CreatedDateAfterMoved() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(CreatedDateAfterMoved));
		return CreatedDateAfterMoved.isDisplayed();
	}

	public void Active_Move() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(AddField));
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ActiveMoved));
		Actions actions = new Actions(ldriver);
		int x = ElemOnMove.getLocation().x;
		int y = ElemOnMove.getLocation().y;
		actions.moveToElement(ActiveMoved).pause(Duration.ofSeconds(0)).clickAndHold(ActiveMoved)
				.pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(ElemOnMove).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}

	public boolean ActiveAfterMoved() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ActiveAfterMoved));
		return ActiveAfterMoved.isDisplayed();
	}

	public void AboutMe_Move() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(AddField));
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AboutMeMoved));
		Actions actions = new Actions(ldriver);
		int x = ElemOnMove.getLocation().x;
		int y = ElemOnMove.getLocation().y;
		actions.moveToElement(AboutMeMoved).pause(Duration.ofSeconds(0)).clickAndHold(AboutMeMoved)
				.pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(ElemOnMove).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}

	public boolean AboutMeAfterMoved() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(AboutMtAfterMoved));
		return AboutMtAfterMoved.isDisplayed();
	}

	public void ClickOnCreatedDateBefore() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CreatedDateBefore));
		CreatedDateBefore.click();
	}

	public void ClickOnCreatedDateAfter() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CreatedDateAfter));
		CreatedDateAfter.click();
	}

	public void ClickOnCreatedDateOnOrBefore() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(CreatedDateOnOrBefore));
		CreatedDateOnOrBefore.click();
	}

	public void ClickOnCreatedDateOnOrAfter() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CreatedDateOnOrAfter));
		CreatedDateOnOrAfter.click();
	}

	public void ClickOnCreatedDateInPast() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CreatedDateInPast));
		CreatedDateInPast.click();
	}

	public void InputOnCreatedDateInPast() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(txtBoxCreatedDate));
		txtBoxCreatedDate.sendKeys("43");
	}

	public void ClickOnHoursInCreatedDate() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(HoursInCreatedDate));
		HoursInCreatedDate.click();
	}

	public void ClickOnDaysInCreatedDate() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DaysInCreatedDate));
		DaysInCreatedDate.click();
	}

	public void ClickOnWeeksInCreatedDate() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(WeeksInCreatedDate));
		WeeksInCreatedDate.click();
	}

	public void ClickOnInPastBefore() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(CreatedDateInPastBefore));
		CreatedDateInPastBefore.click();
	}

	public void ClickOnInFuture() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CreatedDateInFuture));
		CreatedDateInFuture.click();
	}

	public void ClickOnInFutureAfter() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(CreatedDateInFutureAfter));
		CreatedDateInFutureAfter.click();
	}

	public void ClickOnBetween() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CreatedDateBetween));
		CreatedDateBetween.click();
	}

	public void ClickOnInTimeFrame() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(CreatedDateInTimeFrame));
		CreatedDateInTimeFrame.click();
	}

	public void ClickOnIntimeFrameToday() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(InTimeFrameToday));
		InTimeFrameToday.click();
	}

	public void ClickOnInTimeFrameYesterday() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(InTimeFrameYesterday));
		InTimeFrameYesterday.click();
	}

	public void ClickOnInTimeFrameSS1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(InTimeFrameThisWeekSS));
		InTimeFrameThisWeekSS.click();
	}

	public void ClickInTimeFrameMF1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(InTimeFrameThisWeekMF));
		InTimeFrameThisWeekMF.click();
	}

	public void ClickOnInTimeFrameSS2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(InTimeFrameThisWeekSS2));
		InTimeFrameThisWeekSS2.click();
	}

	public void ClickOnTimeFrameMF2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(InTimeFrameLastWeekMG));
		InTimeFrameLastWeekMG.click();
	}

	public void ClickOnThisMonth() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(InTimeFrameThisMonth));
		InTimeFrameThisMonth.click();
	}

	public void ClickOnLastMonth() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(InTimeFrameLastMonth));
		InTimeFrameLastMonth.click();
	}

	public void ClickOnThisCalQuarter() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(InTimeFrameThisCalQuarter));
		InTimeFrameThisCalQuarter.click();
	}

	public void ClickOnLastCalQuarter() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(InTimeFrameLastCalQuarter));
		InTimeFrameLastCalQuarter.click();
	}

	public void ClickOnThisCalYear() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(InTimeFrameThisCalYear));
		InTimeFrameThisCalYear.click();
	}

	public void ClickOnLasCalYear() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(InTimeFrameLasCalYear));
		InTimeFrameLasCalYear.click();
	}

	public void ClickOnCreatedDateIs() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CreatedDateIs));
		CreatedDateIs.click();
	}

	public void ClickOnCreatedDateIsNot() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CreatedIsNot));
		CreatedIsNot.click();
	}

	public void ClickOnIsEmpty() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CreatedIsEmpty));
		CreatedIsEmpty.click();
	}

	public void ClickOnIsNotEmpty() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CreatedIsNotEmpty));
		CreatedIsNotEmpty.click();
	}

	public void ClickOnCalendar1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(CreatedDateCalendarBtn));
		CreatedDateCalendarBtn.click();
	}

	public void ClickOnCalendar2btn() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(CreatedDateCalendarBtn2));
		CreatedDateCalendarBtn2.click();
	}

	public void ClickOnCalendarButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(CreatedDateCalendarButton));
		CreatedDateCalendarButton.click();
	}

	public void ClickOnDate() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectDate));
		SelectDate.click();
	}

	

	public void ClickOnCalendar() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(Calendar1));
		Calendar1.click();
	}

	public void ClickOnCalendar2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(Calendar2));
		Calendar2.click();
	}

	public void ClickOnDate2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectDate2));
		SelectDate2.click();
	}

	public void ScrollIntoViewLongitude() {
		((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", Longitude);
	}

	public void Longitude_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(AddField));
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(Longitude));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(Longitude).pause(Duration.ofSeconds(0)).clickAndHold(Longitude)
				.pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}

	public void Longitude_Move() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(AddField));
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(LongitudeMove));
		Actions actions = new Actions(ldriver);
		int x = ElemOnMove.getLocation().x;
		int y = ElemOnMove.getLocation().y;
		actions.moveToElement(LongitudeMove).pause(Duration.ofSeconds(0)).clickAndHold(LongitudeMove)
				.pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(ElemOnMove).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}

	public boolean LongitudeAfterMoved() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(LongitudeAfterMoved));
		return LongitudeAfterMoved.isDisplayed();
	}

	public void ClickOnLongitudeInput() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(LongitudeSelect));
		LongitudeSelect.click();
	}

	public void ClickOnLongitudeIN() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(LongitudeIN));
		LongitudeIN.click();
	}

	public void ClickOnLongitudeAddbtn() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(LongitudeAddbtn));
		LongitudeAddbtn.click();
	}
	public void TextAreaLongitudeClick() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(LongitudeTextArea));
		LongitudeTextArea.click();
	}
	public void TextAreaLongitudeDotDot() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(LongitudeTextArea));
		LongitudeTextArea.sendKeys("..");
	}

	public void TextAreaLongitudeAlphabet() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(LongitudeTextArea));
		LongitudeTextArea.clear();
		LongitudeTextArea.sendKeys("test");
	}

	public void TextAreaLongitudeNumbers() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(LongitudeTextArea));
		LongitudeTextArea.sendKeys("345");
	}

	public void TextAreaLongitudeBlankLine() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(LongitudeTextArea));
		LongitudeTextArea.clear();
		LongitudeTextArea.sendKeys("123");
		LongitudeTextArea.sendKeys(Keys.ENTER);
		LongitudeTextArea.sendKeys(Keys.ENTER);
		LongitudeTextArea.sendKeys("456");
	}

	public void InputLongitude() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(LongitudeInput));
		LongitudeInput.sendKeys("5");
	}

	public void ClickOnLongitude_IsEmpty() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(LongitudeIsEmpty));
		LongitudeIsEmpty.click();
	}

	public void ClickOnLongitude_IsNotEmpty() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(LongitueIsNotEmpty));
		LongitueIsNotEmpty.click();
	}

	public void ClickOnLongitude_In() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(LongitudeIn));
		LongitudeIn.click();
	}

	public void ClickOnLongitude_NotIn() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(LongitudeNotIn));
		LongitudeNotIn.click();
	}

	public void ClickOnLongitude_IsGreaterThan() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(LongitudeIsGreaterThan));
		LongitudeIsGreaterThan.click();
	}

	public void ClickOnLongitude_IsSmallerThan() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(LongitudeIsSmallerThan));
		LongitudeIsSmallerThan.click();
	}

	public void ClickOnLongitude_Between() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(LongitudeBetween));
		LongitudeBetween.click();
	}

	public void InputOnLongitudeBetweenTxtBox1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(LongitudeBetweentxtBox1));
		LongitudeBetweentxtBox1.sendKeys("43");
	}

	public void InputOnLongitudeBetweenTxtBox2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(LongitudeBetweentxtBox2));
		LongitudeBetweentxtBox2.sendKeys("45");
	}

	public void ClickOnLongitudeIsAtleast() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(LongitudeIsAtleast));
		LongitudeIsAtleast.click();
	}

	public void ClickOnLongitudeIsAtMost() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(LongitudeIsAtMost));
		LongitudeIsAtMost.click();
	}

	public void ClickOnLongitudeaddbtn() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(LongitudeAddbtn2));
		LongitudeAddbtn2.click();
	}

	public void ClickOnSearch() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SearchBox));
		SearchBox.click();
	}

	public void InputOnSearch() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SearchBox));
		SearchBox.clear();
		SearchBox.sendKeys("Add");
	}

	public void InputSearch2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SearchBox));
		SearchBox.clear();
		SearchBox.sendKeys("Las");
	}

	public void Address_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(AddField));
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(Address));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(Address).pause(Duration.ofSeconds(0)).clickAndHold(Address).pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}

	public void Address_Move() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(AddField));
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AddressMove));
		Actions actions = new Actions(ldriver);
		int x = ElemOnMove.getLocation().x;
		int y = ElemOnMove.getLocation().y;
		actions.moveToElement(AddressMove).pause(Duration.ofSeconds(0)).clickAndHold(AddressMove)
				.pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(ElemOnMove).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}



	public void LastName_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(AddField));
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(LastName));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(LastName).pause(Duration.ofSeconds(0)).clickAndHold(LastName).pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}

	public void LastName_Move() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(AddField));
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(LastNameMove));
		Actions actions = new Actions(ldriver);
		int x = ElemOnMove.getLocation().x;
		int y = ElemOnMove.getLocation().y;
		actions.moveToElement(LastNameMove).pause(Duration.ofSeconds(0)).clickAndHold(LastNameMove)
				.pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(ElemOnMove).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}

	public boolean LastNameAfterMove() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(LastNameMoved));
		return LastNameMoved.isDisplayed();
	}

	

	public void ClickOnLastNameStartsWith() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(LastNameStartsWith));
		LastNameStartsWith.click();
	}

	public void InputLastNameStartsWith() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(LastNameStartsWithInput));
		LastNameStartsWithInput.sendKeys("Some Last Name!!!");
	}

	public void ClickOnAddressStratsWith() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AddressStartsWith));
		AddressStartsWith.click();
	}

	public void InputAddressStartsWith() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(AddressStartsWithInput));
		AddressStartsWithInput.sendKeys("Input Address With Automation!!");
	}

	public void ClickOnQueueManagement() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(QueueManagement));
		QueueManagement.click();
	}
	
	public void ClickOnAssignmentLimit() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(AssignmentLimit));
		AssignmentLimit.click();
	}

	public void ClickOnDetail() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(Detail));
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", Detail);
	}
//	public void ClickOnDetail() {
//		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(Detail));
//		Detail.click();
//	}
	
	public void ClickOnDraft() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(Draft));
		Draft.click();
	}

	public void ClickOnCollapseAll() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(btnCollapseAll));
		btnCollapseAll.click();
	}

	public void ClickOnExpandAll() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(btnExpandAll));
		btnExpandAll.click();
	}

	public void ClickOnApprove() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(btnApprove));
		btnApprove.click();
	}

	public void ClickOnCancel() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(btnCancel));
		btnCancel.click();
	}

	public void ClickOnApprove2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(btnApprove2));
		btnApprove2.click();
	}

	public boolean DisplayApproved() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(Approved));
		return Approved.isDisplayed();
	}
	
	
	public void ClickOnApproveSubmit() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ApproveSubmitbtn));
		//ApproveSubmitbtn.click();
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", ApproveSubmitbtn);
	}
	public void ApproveSubmitbtnForTaskList() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ApproveSubmitbtnForTaskList));
		//ApproveSubmitbtn.click();
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", ApproveSubmitbtnForTaskList);
	}
	
	public void ApproveSubmitbtnForLeadRouter() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ApproveSubmitbtnForLeadRouter));
		//ApproveSubmitbtn.click();
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", ApproveSubmitbtnForLeadRouter);
	}
	public boolean DisplayErrorMessage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ErrorMessage));
		return ErrorMessage.isDisplayed();
	}

	public boolean DisplayErrorMessage2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ErrorMessage2));
		return ErrorMessage2.isDisplayed();
	}



//	public void ElemMove1_DND() {
//		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(Elem2Move));
//		Actions actions = new Actions(ldriver);
//		int x = ElemOnMove.getLocation().x;
//		int y = ElemOnMove.getLocation().y;
//		actions.moveToElement(user4).pause(Duration.ofSeconds(0)).clickAndHold(user4).pause(Duration.ofSeconds(0))
//				// .moveByOffset(x, y)
//				.moveToElement(ElemOnMove).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
//	}

	public Boolean AboutMeMoved(Boolean A) {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(AboutMeMoved));
		return A = AboutMeMoved.isDisplayed();

	}

//	public void ElemMove2_DND() {
//		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(Elem2Move));
//		Actions actions = new Actions(ldriver);
//		int x = ElemOnMove.getLocation().x;
//		int y = ElemOnMove.getLocation().y;
//		actions.moveToElement(user2).pause(Duration.ofSeconds(0)).clickAndHold(user2).pause(Duration.ofSeconds(0))
//				// .moveByOffset(x, y)
//				.moveToElement(ElemOnMove).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
//	}

	
	
	
	///-----------Approve, Edit, Clone, Move, Delete-------------------///
	
	
	public void RightClickonAutoTestObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AutoTestObject));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(AutoTestObject).click(AutoTestObject).contextClick(AutoTestObject).build().perform();
		//new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(WeightedSalesTeam));
		//actions.contextClick(WeightedSalesTeam).perform();
		
	}
		public void ClickOnApproveObject() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ObjectApprove));
		//	btnApprove.click();
			JavascriptExecutor js = (JavascriptExecutor) ldriver;
			js.executeScript("arguments[0].click()", ObjectApprove);
		}

		public void ClickOnObjectEdit() {
			   new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ObjectEdit));
			   ObjectEdit.click();
			}
		
		public void ScrollIntoViewRenameObject() {
			((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", NewRenameObject);
		}
		public void ClickOnObjectRename() {
			   new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ObjectRename));
			   ObjectRename.click();
			}
		
		public void ClickOnObjectClone() {
			   new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ObjectClone));
			   ObjectClone.click();
			}
		public void ClickOnObjectMove() {
			   new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ObjectMove));
			   ObjectMove.click();
			}
		public void ClickOnObjectDelete() {
			   new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ObjectDelete));
			   ObjectDelete.click();
			}
		
		public void ClickOnRenameInput() {
			   new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(RenameInputDecs));
			   RenameInputDecs.click();
			   RenameInputDecs.clear();
			   RenameInputDecs.sendKeys("NewObjectName");
			}
		
		
		public void ClickOnRenameBtn() {
			   new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(Renamebtn));
			   Renamebtn.click();
			}
		public void ClickOnCloneBtn() {
			   new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(Clonebtn));
			   Clonebtn.click();
			}
	
		
		public void RightClickOnCloneObjectDelete() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CloneObjDelete));
			Actions actions = new Actions(ldriver);
			actions.moveToElement(CloneObjDelete).click(CloneObjDelete).contextClick(CloneObjDelete).build().perform();
			//new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(WeightedSalesTeam));
			//actions.contextClick(WeightedSalesTeam).perform();
			
		}
	
		public void ClickOnMoveFolder() {
			   new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(MoveFolder));
			   MoveFolder.click();
			}
		public void AccRouterAccMgmtFolder() {
			   new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AccRouterAccMgmtFolder));
			   AccRouterAccMgmtFolder.click();
			}
		
		public void MoveFolderForEscallationRuter() {
			   new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(MoveFolderForEscallationRuter));
			   MoveFolderForEscallationRuter.click();
			}
		public void ClickOnMovedFolderDropDown() {
			   new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(MovedFolderDropDown));
			   MovedFolderDropDown.click();
			}
		public void RightClickonNewRenameObject() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(NewRenameObject));
			Actions actions = new Actions(ldriver);
			actions.moveToElement(NewRenameObject).click(NewRenameObject).contextClick(NewRenameObject).build().perform();
		}
		public void ClickOnMoveFolderSelect() {
			   new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(MoveFolderSelect));
			   MoveFolderSelect.click();
			}
		public void ClickOnMoveBtn() {
			   new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(MoveBtn));
			   MoveBtn.click();
			}
		
	}
	
	
	
	
	
	
	
	
	

