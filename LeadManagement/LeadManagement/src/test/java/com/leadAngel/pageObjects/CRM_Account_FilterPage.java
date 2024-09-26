
package com.leadAngel.pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class CRM_Account_FilterPage {
	
	WebDriver ldriver;

	public CRM_Account_FilterPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	
}   
	
//	@FindBy(xpath = "//select[@id='drpString_0']")
//     WebElement AccountNameBox;
	
	@FindBy(xpath = "//button[@aria-label='toggle CRM Account Filter']")
	WebElement CRMaccountFilterDropDown;
	
	@FindBy(xpath = "//h4[text()='CRM Account Filter Overview']")
	WebElement CRMaccountFilterView;
	
	@FindBy(xpath="//button[(text()=' Account Attributes ')]")
	WebElement AccountAttr;
	@FindBy(xpath = "//div[@id='cdk-drop-list-0']")
	WebElement AddField;
		
	@FindBy(xpath="//mat-panel-title[contains(@class,'mat-expansion-panel-header-title') and ./span/text()='Account Name' and ./span/text()='1']")
	WebElement AccountNameScroll;
	@FindBy(xpath="//mat-list-item[@id=\"Account Name$#!@#$%^2\"]")
	WebElement AccountName;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Account Name']//parent::div//option[text()=' starts with ']")
	WebElement AccountNameStartWith;	
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Account Name']//parent::div//option[text()='in']")
	WebElement AccountNameIn;	
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Account Name']//parent::div//option[text()='not in']")
	WebElement AccountNameNotIn;	
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Account Name']//parent::div//mat-icon[text()='add_box']")
    WebElement AccountNameInAddbtn;		
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Account Name']//parent::div//input[@type='text']")
	WebElement AccountNameContainsInput;
	
	
	@FindBy(xpath="//mat-list-item[@id=\"Annual Revenue$#!@#$%^2\"]")
	WebElement AnnualRevenue;	
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Annual Revenue ']//parent::div//option[text()=' is not empty ']") 
	WebElement AnnualRevenueIsNotEmpty;	
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Annual Revenue ']//parent::div//mat-icon[text()='add_box']")
	WebElement AnnualRevenueInAddbtn;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Annual Revenue ']//parent::div//input[@type='number']")
	WebElement AnnualRevenueInput;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Annual Revenue ']//parent::div//input[@formcontrolname='TextBox1']")
	WebElement AnnualRevenueBetweentxtBox1;	
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Annual Revenue ']//parent::div//input[@formcontrolname='TextBox2']")
	WebElement AnnualRevenueBetweentxtBox2;		

	
	@FindBy(xpath="//mat-list-item[@id='Created Date$#!@#$%^2']")
	WebElement CreatedDate;	
	@FindBy(xpath="//button[(text()=' Opportunity Attributes ')]")
	WebElement OpportunityAttr;	
	@FindBy(xpath="//mat-list-item[@id='Account ID$#!@#$%^3']")
	WebElement AccountId;	
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Account ID']//parent::div//input[@type='text']")
	WebElement AccountIdContainsInput;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Account ID']//parent::div//mat-icon[text()='add_box']")
	WebElement AccountIdInAddbtn;

	@FindBy(xpath="//mat-list-item[@id='Amount$#!@#$%^3']")
	WebElement Amount;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Amount ']//parent::div//option[text()='is empty']")
	WebElement AmountIsEmpty;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Amount ']//parent::div//option[text()='is not empty']")
	WebElement AmountIsNotEmpty;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Amount ']//parent::div//mat-icon[text()='add_box']")
	WebElement AmountInAddbtn;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Amount ']//parent::div//input[@type='number']")
	WebElement AmountInput;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Amount ']//parent::div//input[@formcontrolname='TextBox1']")
	WebElement AmountBetweentxtBox1;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Amount ']//parent::div//input[@formcontrolname='TextBox2']")
	WebElement AmountBetweentxtBox2;
	
	@FindBy(xpath="//mat-list-item[@id='Last Activity$#!@#$%^3']")
	WebElement LastActivity;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Last Activity']//parent::div//input[@formcontrolname='TextBox1']")
	WebElement txtBoxLastActivity;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Last Activity']//parent::div//select//option[text()='Hours']")
	WebElement HoursInLastActivity;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Last Activity']//parent::div//select//option[text()='Days']")
	WebElement DaysInLastActivity;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Last Activity']//parent::div//select//option[text()='Weeks']")
    WebElement WeeksInLastActivity;

	
	@FindBy(xpath="//mat-list-item[@id='Opportunity Routing$#!@#$%^3']")
	WebElement OpportunityRouting;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Opportunity Routing']//parent::div//option[text()='True']")
	WebElement OpportunityRoutingISTrue;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Opportunity Routing']//parent::div//option[text()='False']")
    WebElement OpportunityRoutingISFalse;	
	
	
	@FindBy(xpath="//button[(text()=' Smart Account Attributes ')]")
	WebElement SmartAccountAttr;
	@FindBy(xpath="//mat-list-item[@id='Billing City$#!@#$%^10']")
	WebElement BillingCity;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Billing City']//parent::div//mat-icon[text()='add_box']")
	WebElement BillingCityInAddbtn;
	
	@FindBy(xpath="//mat-list-item[@id='Shipping City$#!@#$%^10']")
	WebElement ShippingCity;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Shipping City']//parent::div//mat-icon[text()='add_box']")
	WebElement ShippingCityInAddbtn;
	
	@FindBy(xpath="//mat-list-item[@id='About Me$#!@#$%^16']")
	WebElement AboutMe;
	
	
	@FindBy(xpath="//mat-list-item[@id='Active$#!@#$%^16']")
	WebElement Active;

	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Active']//parent::div//option[text()='True']")
	WebElement ActiveTrue;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Active']//parent::div//option[text()='False']")
	WebElement ActiveFalse;
	
	@FindBy(xpath="//mat-list-item[@id='Last Login$#!@#$%^16']")
	WebElement LastLogin;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Last Login']//parent::div//input[@formcontrolname='TextBox1']")
	WebElement txtBoxLastLogin;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Last Login']//parent::div//select//option[text()='Hours']")
    WebElement HoursInLastLogin;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Last Login']//parent::div//select//option[text()='Days']")
	WebElement DaysInLastLogin;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Last Login']//parent::div//select//option[text()='Weeks']")
	WebElement WeeksInLastLogin;
    @FindBy(xpath="//mat-list-item[@id='Longitude$#!@#$%^16']")
    WebElement Longitude;
  
    
    @FindBy(xpath="//button[(text()=' Account Activity Attributes ')]")
    WebElement AccountActivityAttr;
    @FindBy(xpath="//mat-list-item[@id='Call Result$#!@#$%^26']")
    WebElement CallResult;
    @FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Call Result']//parent::div//input[@type='text']")
    WebElement CallResultInput;

    @FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Call Result']//parent::div//mat-icon[text()='add_box']")
    WebElement CallResultInAddbtn;   
    
    
    
    @FindBy(xpath="//mat-list-item[@id='Completed Date/Time$#!@#$%^26']")
    WebElement CompletedDate;
    @FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Completed Date/Time']//parent::div//input[@formcontrolname='TextBox1']")
    WebElement txtBoxCompletedDate;
    @FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Completed Date/Time']//parent::div//select//option[text()='Hours']")
    WebElement HoursInCompletedDate;
    @FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Completed Date/Time']//parent::div//select//option[text()='Days']")
    WebElement DaysInCompletedDate;
    @FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Completed Date/Time']//parent::div//select//option[text()='Weeks']")
    WebElement WeeksInCompletedDate;
    
    
    
    
    @FindBy(xpath="//mat-list-item[@id='Duration$#!@#$%^26']")
    WebElement ActivityDuration;
    @FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Duration ']//parent::div//mat-icon[text()='add_box']")
    WebElement DurationInAddbtn;
    @FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Duration ']//parent::div//input[@type='number']")
    WebElement DurationInput;
    @FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Duration ']//parent::div//input[@formcontrolname='TextBox1']")
    WebElement DurationBetweenBox1;
    @FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Duration ']//parent::div//input[@formcontrolname='TextBox2']")
    WebElement DurationBetweenBox2;  
    @FindBy(xpath="//mat-list-item[@id='Task$#!@#$%^26']")
    WebElement Task;
    @FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Task']//parent::div//option[text()='True']")
    WebElement TaskTrue;
    @FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Task']//parent::div//option[text()='False']")
    WebElement TaskFalse;    
    
    
    @FindBy(xpath="//button[(text()=' System Account Attribute ')]")
    WebElement SystemAccountAttr;
    @FindBy(xpath="//mat-list-item[@id='Last Routed Date$#!@#$%^33']")
    WebElement LastRoutedDate;
    @FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Last Routed Date']//parent::div//input[@formcontrolname='TextBox1']")
    WebElement txtBoxLastRouted;
    @FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Last Routed Date']//parent::div//select//option[text()='Hours']")
    WebElement HoursInLastRouted;
    @FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Last Routed Date']//parent::div//select//option[text()='Days']")
    WebElement DaysInLastRouted;
    @FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Last Routed Date']//parent::div//select//option[text()='Weeks']")
    WebElement WeeksInLastRouted;
    @FindBy(xpath="//mat-panel-title[contains(@class,'mat-expansion-panel-header-title') and ./span/text()='Inactive_account' and ./span/text()='3']")
    WebElement InactiveAccountMoved;
    @FindBy(xpath="//mat-panel-title[contains(@class,'mat-expansion-panel-header-title') and ./span/text()='Inactive_account' and ./span/text()='1']")
    WebElement InactiveAccountAfterMoved;
    @FindBy(xpath="//mat-panel-title[contains(@class,'mat-expansion-panel-header-title') and ./span/text()='Created Date' and ./span/text()='3']")
    WebElement CreatedDateMoved;
    @FindBy(xpath="//mat-panel-title[contains(@class,'mat-expansion-panel-header-title') and ./span/text()='Created Date' and ./span/text()='1']")
    WebElement CreatedDateAfterMoved;
    @FindBy(xpath="//mat-panel-title[contains(@class,'mat-expansion-panel-header-title') and ./span/text()='Annual Revenue' and ./span/text()='3']")
    WebElement AnnualRevenueMoved;
    @FindBy(xpath="//mat-panel-title[contains(@class,'mat-expansion-panel-header-title') and ./span/text()='Annual Revenue' and ./span/text()='1']")
    WebElement AnnualRevenueAfterMoved;
    @FindBy(xpath="//mat-panel-title[contains(@class,'mat-expansion-panel-header-title') and ./span/text()='Account Name' and ./span/text()='3']")
    WebElement AccountNameMoved;
    @FindBy(xpath="//mat-panel-title[contains(@class,'mat-expansion-panel-header-title') and ./span/text()='Account Name' and ./span/text()='1']")
    WebElement AccountNameAfterMoved;
    @FindBy(xpath = "(//mat-toolbar)[3]")
	WebElement ElemOnMove;
    @FindBy(xpath = "//span[contains(text(),' Approve ')]")
   	WebElement btnApprove;
   	@FindBy(xpath = "//button[@type='submit']")
   	WebElement ApproveSubmitbtn;
    
   	
//   	public void clickAccountNameBox() {
//		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(AccountNameBox));
//		AccountNameBox.click();
//	}
//	

	public void clickCRMaccountFilterDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(CRMaccountFilterDropDown));
		CRMaccountFilterDropDown.click();
	}
	
	public boolean DisplayAccountListOverView() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(CRMaccountFilterView));
		return CRMaccountFilterView.isDisplayed();
	}
   	
   	
    ///================== Moved attribute ===================//
    
    
    public void InactiveAccount_Move() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(InactiveAccountMoved));
		Actions actions = new Actions(ldriver);
		int x = ElemOnMove.getLocation().x;
		int y = ElemOnMove.getLocation().y;
		actions.moveToElement(InactiveAccountMoved).pause(Duration.ofSeconds(0)).clickAndHold(InactiveAccountMoved)
				.pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(ElemOnMove).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}

	public boolean InactiveAccountAfterMoved() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(InactiveAccountAfterMoved));
		return InactiveAccountAfterMoved.isDisplayed();
	}

	public void CreatedDate_Move() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(CreatedDateMoved));
		Actions actions = new Actions(ldriver);
		int x = ElemOnMove.getLocation().x;
		int y = ElemOnMove.getLocation().y;
		actions.moveToElement(CreatedDateMoved).pause(Duration.ofSeconds(0)).clickAndHold(CreatedDateMoved)
				.pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(ElemOnMove).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}

	public boolean CreatedDateAfterMoved() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(CreatedDateAfterMoved));
		return CreatedDateAfterMoved.isDisplayed();
	}

	public void AnnualRevenue_Move() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(AnnualRevenueMoved));
		Actions actions = new Actions(ldriver);
		int x = ElemOnMove.getLocation().x;
		int y = ElemOnMove.getLocation().y;
		actions.moveToElement(AnnualRevenueMoved).pause(Duration.ofSeconds(0)).clickAndHold(AnnualRevenueMoved)
				.pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(ElemOnMove).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}

	public boolean AnnualRevenueAfterMoved() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(AnnualRevenueAfterMoved));
		return AnnualRevenueAfterMoved.isDisplayed();
	}

	public void AccountName_Move() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(AccountNameMoved));
		Actions actions = new Actions(ldriver);
		int x = ElemOnMove.getLocation().x;
		int y = ElemOnMove.getLocation().y;
		actions.moveToElement(AccountNameMoved).pause(Duration.ofSeconds(0)).clickAndHold(AccountNameMoved)
				.pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(ElemOnMove).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}

	public boolean AccountNameAfterMoved() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(AccountNameAfterMoved));
		return AccountNameAfterMoved.isDisplayed();
	}
    
    
	public void ScrollIntoViewInactiveAccount_Moved() {
		((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", InactiveAccountMoved);
	}    
    
	//==========Account attribute [Account Name]==========///
	
	
	public void ScrollIntoViewAccountNameScroll() {
		((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", AccountNameScroll);
	}
	
	
	
	public void ClickonAccountAttr() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AccountAttr));
		AccountAttr.click();
	}
	
	public void AccountName_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(AccountName));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(AccountName).pause(Duration.ofSeconds(0)).clickAndHold(AccountName).pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}
	
	public void ClickOnAccountName_StartsWith() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AccountNameStartWith));
		AccountNameStartWith.click();
	}

	public void ClickOnAccountName_In() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(AccountNameIn));
		AccountNameIn.click();
	}
	
	public void ClickOnAccountName_NotIn() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AccountNameNotIn));
		AccountNameNotIn.click();
	}

	public void ClickOnAccountNameInAddbtn() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AccountNameInAddbtn));
		AccountNameInAddbtn.click();
	}

	public void InputAccountNameContains() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(AccountNameContainsInput));
		AccountNameContainsInput.sendKeys("testing With Automation!!");
	}

	public void InputAccountNameContainsComma() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(AccountNameContainsInput));
		AccountNameContainsInput.sendKeys("1,2,3,4,5,6,7,8,9,10,");
	}

	///==========Annual Revenue==========///
	
	public void ScrollIntoViewAnnualRevenue() {
		((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", AnnualRevenue);
	}
	public void AnnualRevenue_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(AnnualRevenue));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(AnnualRevenue).pause(Duration.ofSeconds(0)).clickAndHold(AnnualRevenue)
				.pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}

	public void ClickOnAnnualRevenueAddbtn() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AnnualRevenueInAddbtn));
		AnnualRevenueInAddbtn.click();
	}
	public void InputAnnualRevenue() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(AnnualRevenueInput));
		AnnualRevenueInput.sendKeys("5");
	}

	public void ClickOnAnnualRevenue_IsNotEmpty() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AnnualRevenueIsNotEmpty));
		AnnualRevenueIsNotEmpty.click();
	}


	public void InputOnAnnualRevenueBetweenTxtBox1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOf(AnnualRevenueBetweentxtBox1));
		AnnualRevenueBetweentxtBox1.sendKeys("43");
	}

	public void InputOnAnnualRevenueBetweenTxtBox2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOf(AnnualRevenueBetweentxtBox2));
		AnnualRevenueBetweentxtBox2.sendKeys("45");
	}


	public void ClickOnAnnualRevenueaddbtn() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AnnualRevenueInAddbtn));
		AnnualRevenueInAddbtn.click();
	}

	public void CreatedDate_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(CreatedDate));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(CreatedDate).pause(Duration.ofSeconds(0)).clickAndHold(CreatedDate)
				.pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}

	
	//===========Opportunity attribute[AccountId]=============//

	
	
	public void ScrollIntoViewOpportunityAttr() {
		((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", OpportunityAttr);
	}
	
	public void ClickonOpportunityAttr() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(OpportunityAttr));
		OpportunityAttr.click();
	}
	
	public void AccountId_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(AccountId));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(AccountId).pause(Duration.ofSeconds(0)).clickAndHold(AccountId).pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}
	
	

	public void ClickOnAccountIdInAddbtn() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AccountIdInAddbtn));
		AccountIdInAddbtn.click();
	}

	public void InputAccountIdContains() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(AccountIdContainsInput));
		AccountIdContainsInput.sendKeys("New Testing Start With Automation!!");
	}
	
	///=========== Amount ==============////
	
	public void ScrollIntoViewAmount() {
		((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", Amount);
	}
	

	public void Amount_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(Amount));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(Amount).pause(Duration.ofSeconds(0)).clickAndHold(Amount)
				.pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}


	public void ClickOnAmountAddbtn() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AmountInAddbtn));
		AmountInAddbtn.click();
	}
	public void InputAmount() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(AmountInput));
		AmountInput.sendKeys("5");
	}

	public void ClickOnAmount_IsEmpty() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AmountIsEmpty));
		AmountIsEmpty.click();
	}

	public void ClickOnAmount_IsNotEmpty() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AmountIsNotEmpty));
		AmountIsNotEmpty.click();
	}


	public void InputOnAmountBetweenTxtBox1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOf(AmountBetweentxtBox1));
		AmountBetweentxtBox1.sendKeys("43");
	}

	public void InputOnAmountBetweenTxtBox2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOf(AmountBetweentxtBox2));
		AmountBetweentxtBox2.sendKeys("45");
	}



	public void ClickOnAmountaddbtn() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AmountInAddbtn));
		AmountInAddbtn.click();
	}
	
	
	////============= Last Activity ==============///
	
	public void ScrollIntoViewLastActivity() {
		((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", LastActivity);
	}
	

	public void LastActivity_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(LastActivity));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(LastActivity).pause(Duration.ofSeconds(0)).clickAndHold(LastActivity)
				.pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}
	

	public void InputOnLastActivityInPast() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(txtBoxLastActivity));
		txtBoxLastActivity.sendKeys("43");
	}

	public void ClickOnHoursInLastActivity() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(HoursInLastActivity));
		HoursInLastActivity.click();
	}

	public void ClickOnDaysInLastActivity() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DaysInLastActivity));
		DaysInLastActivity.click();
	}

	public void ClickOnWeeksInLastActivity() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(WeeksInLastActivity));
		WeeksInLastActivity.click();
	}

	
//================= Opportunity Routing ==========================///
	
	
	public void ScrollIntoViewOpportunityRouting() {
		((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", OpportunityRouting);
	}
	
	public void OpportunityRouting_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(OpportunityRouting));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(OpportunityRouting).pause(Duration.ofSeconds(0)).clickAndHold(OpportunityRouting).pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}

	
	public void InputOpportunityRoutingTrue() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(OpportunityRoutingISTrue));
		OpportunityRoutingISTrue.click();
	}

	public void InputOpportunityRoutingFalse() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(OpportunityRoutingISFalse));
		OpportunityRoutingISFalse.click();
	}
	
///============== Smart Account attribute (Billing City) ====================//
	
	
	public void ScrollIntoViewSmartAccountAttribute() {
		((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", SmartAccountAttr);
	}
	
	public void ScrollIntoViewBillingCity() {
		((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", BillingCity);
	}
	
	public void ClickonSmartAccountAttribute() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SmartAccountAttr));
		SmartAccountAttr.click();
	}
	
	public void BillingCity_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(BillingCity));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(BillingCity).pause(Duration.ofSeconds(0)).clickAndHold(BillingCity).pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}
	
	public void ClickOnBillingCityaddbtn() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(BillingCityInAddbtn));
		BillingCityInAddbtn.click();
	}
	
///=======================Shipping City=====================///
	
	public void ScrollIntoViewShippingCity() {
		((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", ShippingCity);
	}
	
	public void ShippingCity_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ShippingCity));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(ShippingCity).pause(Duration.ofSeconds(0)).clickAndHold(ShippingCity).pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}
	

	public void ClickOnShippingCityaddbtn() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ShippingCityInAddbtn));
		ShippingCityInAddbtn.click();
	}
	
	
///==================AccountOwner(About Me)==========================///
	
	
	public void ScrollIntoViewAccountOwner() {
		((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", AccountOwner);
	}
	
	public void ScrollIntoViewAboutMe() {
		((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", AboutMe);
	}
	
	
	public void AboutMe_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(AboutMe));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(AboutMe).pause(Duration.ofSeconds(0)).clickAndHold(AboutMe).pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}
	
	
	//=================Account Owner(ACTIVE)=======================//
	public void ScrollIntoViewActive() {
		((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", Active);
	}
	
	public void Active_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(Active));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(Active).pause(Duration.ofSeconds(0)).clickAndHold(Active).pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}


	
	public void InputActiveTrue() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ActiveTrue));
		ActiveTrue.click();
	}

	public void InputActiveFalse() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ActiveFalse));
		ActiveFalse.click();
	}
	
//===========================Account Owner(Last Login)================================///
	
	
	
	public void ScrollIntoViewLastLogin() {
		((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", LastLogin);
	}
	

	public void LastLogin_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(LastLogin));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(LastLogin).pause(Duration.ofSeconds(0)).clickAndHold(LastLogin)
				.pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}
	

	public void InputOnLastLoginInPast() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(txtBoxLastLogin));
		txtBoxLastLogin.sendKeys("43");
	}

	public void ClickOnHoursInLastLogin() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(HoursInLastLogin));
		HoursInLastLogin.click();
	}

	public void ClickOnDaysInLastLogin() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DaysInLastLogin));
		DaysInLastLogin.click();
	}

	public void ClickOnWeeksInLastLogin() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(WeeksInLastLogin));
		WeeksInLastLogin.click();
	}


///=====================AccountOwner(ActivityDuration)========================//
	
	

	public void ScrollIntoViewLongitude() {
		((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", Longitude);
	}
	
	
	public void Longitude_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(Longitude));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(Longitude).pause(Duration.ofSeconds(0)).clickAndHold(Longitude)
				.pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}
	
//================Account Activity Attribute(AccountId)========================//
	
	
	
	public void ScrollIntoViewAccountActivityAttr() {
		((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", AccountActivityAttr);
	}
	
	public void ClickOnAccountActivityAttribute() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AccountActivityAttr));
		AccountActivityAttr.click();
	}
	
	public void ScrollIntoViewCallResult() {
		((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", CallResult);
	}
	
	public void CallResult_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(CallResult));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(CallResult).pause(Duration.ofSeconds(0)).clickAndHold(CallResult).pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}
	

	public void ClickOnCallResultInAddbtn() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CallResultInAddbtn));
		CallResultInAddbtn.click();
	}

	public void InputCallResultContains() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(CallResultInput));
		CallResultInput.sendKeys("New Testing Start With Automation!!");
	}

	
	
	////===================Account activity Attribute(Created Date)========================//
	

	public void ScrollIntoViewCompletedDate() {
		((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", CompletedDate);
	}
	

	public void CompletedDate_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(CompletedDate));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(CompletedDate).pause(Duration.ofSeconds(0)).clickAndHold(CompletedDate)
				.pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}

	public void InputOnCompletedDateInPast() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(txtBoxCompletedDate));
		txtBoxCompletedDate.sendKeys("43");
	}

	public void ClickOnHoursInCompletedDate() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(HoursInCompletedDate));
		HoursInCompletedDate.click();
	}

	public void ClickOnDaysInCompletedDate() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DaysInCompletedDate));
		DaysInCompletedDate.click();
	}

	public void ClickOnWeeksInCompletedDate() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(WeeksInCompletedDate));
		WeeksInCompletedDate.click();
	}


	
//====================Account Activity Attribute (Duration)============================//
	
	
	
	public void ScrollIntoViewDuration() {
		((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", ActivityDuration);
	}

	public void ActivityDuration_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ActivityDuration));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(ActivityDuration).pause(Duration.ofSeconds(0)).clickAndHold(ActivityDuration)
				.pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}


	
	public void ClickOnActivityDurationAddbtn() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DurationInAddbtn));
		DurationInAddbtn.click();
	}
	
	
	public void InputActivityDuration() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DurationInput));
		DurationInput.sendKeys("5");
	}



	public void InputOnActivityDurationBetweenTxtBox1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOf(DurationBetweenBox1));
		DurationBetweenBox1.sendKeys("43");
	}

	public void InputOnActivityDurationBetweenTxtBox2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOf(DurationBetweenBox2));
		DurationBetweenBox2.sendKeys("45");
	}


	
///========================AccountActive Attribute(Task)===================================///
	
	public void ScrollIntoViewTask() {
		((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", Task);
	}
	
	public void Task_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(Task));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(Task).pause(Duration.ofSeconds(0)).clickAndHold(Task).pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}


	
	public void InputTaskTrue() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(TaskTrue));
		TaskTrue.click();
	}

	public void InputTaskFalse() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(TaskFalse));
		TaskFalse.click();
	}
	
	
///======================System Account Attribute (LastRoutedDate)========================///
	

	public void ScrollIntoViewSystemAccountAttr() {
		((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", SystemAccountAttr);
	}
	
	public void ClickOnAccountSystemAccountAttr() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SystemAccountAttr));
		SystemAccountAttr.click();
	}
	
	
	public void LastRoutedDate_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(LastRoutedDate));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(LastRoutedDate).pause(Duration.ofSeconds(0)).clickAndHold(LastRoutedDate)
				.pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}

	public void InputOnLastRoutedInPast() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30))
		.until(ExpectedConditions.visibilityOf(txtBoxLastRouted));
		txtBoxLastRouted.sendKeys("43");
	}

	public void ClickOnHoursInLastRouted() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30))
		.until(ExpectedConditions.elementToBeClickable(HoursInLastRouted));
		HoursInLastRouted.click();
	}

	public void ClickOnDaysInLastRouted() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30))
		.until(ExpectedConditions.elementToBeClickable(DaysInLastRouted));
		DaysInLastRouted.click();
	}

	public void ClickOnWeeksInLastRouted() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30))
		.until(ExpectedConditions.elementToBeClickable(WeeksInLastRouted));
		WeeksInLastRouted.click();
	}


	public void ClickOnApprove() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(btnApprove));
	//	btnApprove.click();
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", btnApprove);
	}
	
	public void ClickOnApproveSubmit() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ApproveSubmitbtn));
		//ApproveSubmitbtn.click();
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", ApproveSubmitbtn);
	}	
	
	public void ProgressSpinnerLeft() {
		  new WebDriverWait(ldriver, Duration.ofSeconds(70)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//mat-progress-spinner[@role='progressbar']//*[name()='svg']")));
		}
	
	public void ProgressSpinnerCenter() {
		  new WebDriverWait(ldriver, Duration.ofSeconds(70)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//mat-progress-spinner[@role='progressbar']//*[name()='svg']")));
		}
	public void ProgressSpinnerRight() {
		  new WebDriverWait(ldriver, Duration.ofSeconds(70)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[name()='circle'][@class='ng-star-inserted'])[1]")));
		}	
	
	//*************************************************** Sanity test X path *********************************************************
	
	@FindBy(xpath = "//button[(text()=' Account Attributes ')]")
	WebElement AccountAttributes;
	
	@FindBy(xpath="//button[(text()=' Account Owner Attributes ')]")
	WebElement AccountOwner;
	
	@FindBy(xpath="//button[(text()=' Smart Account Attributes ')]")
	WebElement SmartAccountAttributes;
	
	@FindBy(xpath = "//button[(text()=' Account Owner Attributes ')]//..//div//span[text()='About Me']")
	WebElement AboutMeDNDinCRM;
	
	@FindBy(xpath = "//mat-list-item[contains(@id,'Billing City')]")
	WebElement BillingCityDND;
	
	@FindBy(xpath = "//input[@name='canvassearch']")
	WebElement InputForCutomFilter;
	
	public void AccountAttributes() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30))
		.until(ExpectedConditions.elementToBeClickable(AccountAttributes));
		AccountAttributes.click();
	}
	public void ClickonAccountOwner() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AccountOwner));
		AccountOwner.click();
	}
	public void SmartAccountAttributes() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SmartAccountAttributes));
		SmartAccountAttributes.click();
	}
	public void AboutMeDNDinCRM() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(AboutMeDNDinCRM));
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(AboutMe));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(AboutMeDNDinCRM).pause(Duration.ofSeconds(1)).clickAndHold(AboutMeDNDinCRM).pause(Duration.ofSeconds(1))
		.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();

	}
	public void BillingCityDND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(AddField));
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(BillingCityDND));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(BillingCityDND).pause(Duration.ofSeconds(0)).clickAndHold(BillingCityDND)
		.pause(Duration.ofSeconds(0))
		// .moveByOffset(x, y)
		.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}
	
	public void InputForCutomFilterAccList() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30))
		.until(ExpectedConditions.elementToBeClickable(InputForCutomFilter));
		InputForCutomFilter.sendKeys("1 and 2 and 3 and 4 and 5");
	}
	
	
	
	
	
}