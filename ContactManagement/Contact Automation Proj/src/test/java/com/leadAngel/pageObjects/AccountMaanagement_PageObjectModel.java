package com.leadAngel.pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountMaanagement_PageObjectModel {
	WebDriver ldriver;

	public AccountMaanagement_PageObjectModel(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	//************************************************** AE to SDR  ********************************************
	@FindBy(xpath = "//h4[text()='AE to SDR Mapping Overview']")
	WebElement AEtoSDROverView;
	@FindBy(xpath = "//button[@aria-label='toggle AE to SDR Mapping']")
	WebElement AEtoSDRdropDown;
	
	public boolean AEtoSDROverView() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(AEtoSDROverView));
		return AEtoSDROverView.isDisplayed();
	}
	public void AEtoSDRdropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(AEtoSDRdropDown));
	 AEtoSDRdropDown.click();
	}
	//************************************************** AccountManagement Module ********************************************

		@FindBy(xpath = "//div[text()=' Account Management']")
		WebElement AccountManagement;
		
		@FindBy(xpath="//span[text()='Assign Accounts only to currently available sales rep.']")
		WebElement CheckboxQueManagementRRT;
	//************************************************** Account Routing Territory ********************************************
		@FindBy(xpath="//button[@aria-label='toggle Account Routing Territory']")
		WebElement AccountRoutingTerritoryDropDown;
		@FindBy(xpath="//span[text()='Account Routing Territory ']")
		WebElement AccountRoutingTerritory;
		@FindBy(xpath="//h4[text()='Account Routing Territory Overview']")
		WebElement AccountRoutingTerritoryOverviewPage;
		
		
		@FindBy(xpath="//button[text()=' Data Dictionary ']")
		WebElement DataDictionary;
		@FindBy(xpath="(//mat-list-item[@mattooltipclass='custom-tooltip-style'])[1]")
		WebElement AccoutList_DND;
		@FindBy(xpath="(//mat-list-item[@mattooltipclass='custom-tooltip-style'])[2]")
		WebElement CRMaccountFilter_DND;
		@FindBy(xpath = "//div[@cdkdragboundary='.example-boundary']")
		WebElement AddField;
		
		
		@FindBy(xpath = "(//option[text()='is'])[1]")
		WebElement SelectAccountListOption;
		@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[1]")
		WebElement SelectAccountListValueDropDown;
		@FindBy(xpath = "(//span[@class='custom-option-content ng-star-inserted'])[1]")
		WebElement SelectAccountListValueOption;
		
		
		@FindBy(xpath = "(//option[text()='is not'])[2]")
		WebElement SelectCRMaccountFilterOption;
		@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[2]")
		WebElement SelectCRMaccountFilterValueDropDown;
		@FindBy(xpath = "(//span[@class='custom-option-content ng-star-inserted'])[1]")
		WebElement SelectCRMaccountFilterValueOption;
		
		
		@FindBy(xpath = "(//option[text()='is not'])[1]")
		WebElement EditSelectAccountListOption;
		@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[1]")
		WebElement EditSelectAccountListValueDropDown;
		@FindBy(xpath = "(//span[@class='custom-option-content ng-star-inserted'])[3]")
		WebElement EditSelectAccountListValueOption;
		//************************************************** Wait Filter AccountManagement ********************************************
		@FindBy(xpath = "//mat-icon[text()='folder']")
		WebElement ClickOnAccountAttribute;
		
		@FindBy(xpath = "//i[@class='righticon-STRING']//..//span[text()='Account Id']")
		WebElement AccounttId_DND;
		@FindBy(xpath = "//i[@class='righticon-STRING']//..//span[text()='Contact Id']")
		WebElement ContactId_DND;
		@FindBy(xpath = "//option[text()='contains']")
		WebElement AccounttId_Option;
		@FindBy(xpath = "//input[@id='txtString_0']")
		WebElement EnterAccountID;//698441,3555,99466
		
		@FindBy(xpath = "//i[@class='righticon-BOOLEAN']//..//span[text()='Deleted']")
		WebElement Deleted_DND;
		@FindBy(xpath = "(//option[text()='is'])[1]")
		WebElement Deleted_Option1;
		@FindBy(xpath = "//option[text()='True']")
		WebElement Deleted_Option2;
		
		@FindBy(xpath = "(//mat-list-item[@mattooltipclass='custom-tooltip-style'])[11]")
		WebElement BillingLatitude_DND;
		@FindBy(xpath = "//option[text()=' is greater than ']")
		WebElement BillingLatitude_Option;
		@FindBy(xpath = "//input[@id='txtNumber_2']")
		WebElement EnterBillingLatitude;//6456
		
		@FindBy(xpath = "//i[@class='righticon-DATETIME']//..//span[text()='Created Date']")
		WebElement CreadtedDate_DND;
		@FindBy(xpath = "//option[text()='after']")
		WebElement CreadtedDate_Option;
		@FindBy(xpath = "//button[@aria-label='Open calendar']")
		WebElement ClickOnCalenderIcon;
		@FindBy(xpath = "//div[text()=' 3 ']")
		WebElement SelectDate;
		
		@FindBy(xpath = "//option[text()=' starts with ']")
		WebElement EditAccounttId_Option;
		@FindBy(xpath = "//input[@id='txtString_0']")
		WebElement EditEnterAccountID;//323,684,53
		
		@FindBy(xpath = "//option[text()='False']")
		WebElement EditDeleted_Option2;
		//************************************************** Wait condition AccountManagement ********************************************
		@FindBy(xpath="//ng-select[@name='seldropDown']")
	    WebElement clickOnWaitTillvalueDropDown;	
		@FindBy(xpath="(//span[@class='custom-option-content ng-star-inserted'])[1]")
		WebElement clickOnWaitTillvalueOption;
		
		
		public void clickOnWaitTillvalueDropDown() {
				new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(clickOnWaitTillvalueDropDown));
				clickOnWaitTillvalueDropDown.click();
	    }
		public void clickOnWaitTillvalueOption() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(clickOnWaitTillvalueOption));
			clickOnWaitTillvalueOption.click();
    }
		//************************************************** Account Router AccountManagement ********************************************
		@FindBy(xpath = "//span[text()='Account Router ']")
		WebElement AccountRouter;
		
		@FindBy(xpath = "//button[@aria-label='toggle Account Router']")
		WebElement AccountRouterDropDown;
		@FindBy(xpath = "//h4[text()='Account Router Overview']")
		WebElement AccountRouterOverview;
		
		@FindBy(xpath = "//div[contains(text(),' Account Filter ')]")
		WebElement AccountFilter_DND;
		
		@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[3]")// deatils page
		WebElement DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown1ForAccMangmnt;
		@FindBy(xpath = "(//mat-icon[text()='check_box'])[3]")// deatils page
		WebElement CheckBoxForDataValueUpdateWhenRoutedToDefaultLeadOwnerForAccMangmnt;
		
		
		@FindBy(xpath = "(//span[@class='mat-checkbox-inner-container'])[1]")
		WebElement CheckBoxForAssignmentBlockAEtoSDRForAccMngmt;
		
		//************************************************** Account Router AccountManagement ********************************************
		public void AccountFilter_DND() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(AccountFilter_DND));
			Actions actions = new Actions(ldriver);
			actions.moveToElement(AccountFilter_DND)
	        .pause(Duration.ofSeconds(1))
	        .clickAndHold(AccountFilter_DND)
	        .pause(Duration.ofSeconds(1))
	        .moveByOffset(-400,165) //change the x, y values to be applicable for your cases
	        .moveByOffset(-400,165)
	        .pause(Duration.ofSeconds(1))
	        .release().build().perform();
		}
		public void AccountFilter2_DND() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(AccountFilter_DND));
			Actions actions = new Actions(ldriver);
			actions.moveToElement(AccountFilter_DND)
	        .pause(Duration.ofSeconds(1))
	        .clickAndHold(AccountFilter_DND)
	        .pause(Duration.ofSeconds(1))
	        .moveByOffset(-300,50) //change the x, y values to be applicable for your cases
	        .moveByOffset(-300,50)
	        .pause(Duration.ofSeconds(1))
	        .release().build().perform();
		}
		
		public void RightClickOnAccountRouter() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25))
			.until(ExpectedConditions.elementToBeClickable(AccountRouter));
			Actions actions = new Actions(ldriver);
			actions.moveToElement(AccountRouter).click(AccountRouter).contextClick(AccountRouter).build()
			.perform();
		}
		public void AccountRouterDropDown() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AccountRouterDropDown));
			AccountRouterDropDown.click();
		}
		public void AgainClickAccountRouter() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AccountRouter));
			AccountRouter.click();
		}
		public boolean AccountRouterOverview() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AccountRouterOverview));
			return AccountRouterOverview.isDisplayed();
		}
		public void DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown1ForAccMangmnt() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown1ForAccMangmnt));
			DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown1ForAccMangmnt.click();
		}
		public void CheckBoxForDataValueUpdateWhenRoutedToDefaultLeadOwnerForAccMangmnt() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CheckBoxForDataValueUpdateWhenRoutedToDefaultLeadOwnerForAccMangmnt));
			 CheckBoxForDataValueUpdateWhenRoutedToDefaultLeadOwnerForAccMangmnt.click();	
		}
		public void CheckBoxForAssignmentBlockAEtoSDRForAccMngmt() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CheckBoxForAssignmentBlockAEtoSDRForAccMngmt));
			CheckBoxForAssignmentBlockAEtoSDRForAccMngmt.click();
		}
		//=====================================================================================================================
	
		public void AccountManagement() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AccountManagement));
			 AccountManagement.click();
		}
		public void CheckboxQueManagementRRT() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CheckboxQueManagementRRT));
			CheckboxQueManagementRRT.click();
		}
		//************************************************** Account Routing Territory ********************************************

		public void AccountRoutingTerritoryDropDown() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AccountRoutingTerritoryDropDown));
			AccountRoutingTerritoryDropDown.click();
		}
		public void RightClickOnAccountRoutingTerritory() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25))
			.until(ExpectedConditions.elementToBeClickable(AccountRoutingTerritory));
			Actions actions = new Actions(ldriver);
			actions.moveToElement(AccountRoutingTerritory).click(AccountRoutingTerritory).contextClick(AccountRoutingTerritory).build()
			.perform();
		}
		public void AgainClickAccountRoutingTerritory() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AccountRoutingTerritory));
			AccountRoutingTerritory.click();
		}
		public boolean DisplayAccountRoutingTerritoryOverviewPage() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(AccountRoutingTerritoryOverviewPage));
			return AccountRoutingTerritoryOverviewPage.isDisplayed();
		}
		
		
		public void DataDictionary() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DataDictionary));
			DataDictionary.click();
		}
		public void AccoutList_DND() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AccoutList_DND));
			Actions actions = new Actions(ldriver);
			int x = AddField.getLocation().x;
			int y = AddField.getLocation().y;
			actions.moveToElement(AccoutList_DND).pause(Duration.ofSeconds(0)).clickAndHold(AccoutList_DND)
			.pause(Duration.ofSeconds(0))
			.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
		}
		public void CRMaccountFilter_DND() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CRMaccountFilter_DND));
			Actions actions = new Actions(ldriver);
			int x = AddField.getLocation().x;
			int y = AddField.getLocation().y;
			actions.moveToElement(CRMaccountFilter_DND).pause(Duration.ofSeconds(0)).clickAndHold(CRMaccountFilter_DND)
			.pause(Duration.ofSeconds(0))
			.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
		}
		
		
		public void SelectAccountListOption() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectAccountListOption));
			SelectAccountListOption.click();
		}
		public void SelectAccountListValueDropDown() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectAccountListValueDropDown));
			SelectAccountListValueDropDown.click();
		}
		public void SelectAccountListValueOption() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectAccountListValueOption));
			SelectAccountListValueOption.click();
		}
		
		
		public void SelectCRMaccountFilterOption() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectCRMaccountFilterOption));
			SelectCRMaccountFilterOption.click();
		}
		public void SelectCRMaccountFilterValueDropDown() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectCRMaccountFilterValueDropDown));
			SelectCRMaccountFilterValueDropDown.click();
		}
		public void SelectCRMaccountFilterValueOption() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectCRMaccountFilterValueOption));
			SelectCRMaccountFilterValueOption.click();
		}
		
		
		public void EditSelectAccountListOption() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EditSelectAccountListOption));
			EditSelectAccountListOption.click();
		}
		public void EditSelectAccountListValueDropDown() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EditSelectAccountListValueDropDown));
			EditSelectAccountListValueDropDown.click();
		}
		public void EditSelectAccountListValueOption() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EditSelectAccountListValueOption));
			EditSelectAccountListValueOption.click();
		}
		//************************************************** Wait Filter AccountManagement ********************************************
		public void ClickOnAccountAttribute() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAccountAttribute));
			ClickOnAccountAttribute.click();
		}
		
		
		public void AccounttId_DND() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AccounttId_DND));
			Actions actions = new Actions(ldriver);
			int x = AddField.getLocation().x;
			int y = AddField.getLocation().y;
			actions.moveToElement(AccounttId_DND).pause(Duration.ofSeconds(0)).clickAndHold(AccounttId_DND)
			.pause(Duration.ofSeconds(0))
			.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
		}
		public void ContactId_DND() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ContactId_DND));
			Actions actions = new Actions(ldriver);
			int x = AddField.getLocation().x;
			int y = AddField.getLocation().y;
			actions.moveToElement(ContactId_DND).pause(Duration.ofSeconds(0)).clickAndHold(ContactId_DND)
			.pause(Duration.ofSeconds(0))
			.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
		}
		public void AccounttId_Option() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AccounttId_Option));
			AccounttId_Option.click();
		}
		public void EnterAccountID() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterAccountID));
			EnterAccountID.sendKeys("698441,3555,99466");
		}
		
		
		public void Deleted_DND() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(Deleted_DND));
			Actions actions = new Actions(ldriver);
			int x = AddField.getLocation().x;
			int y = AddField.getLocation().y;
			actions.moveToElement(Deleted_DND).pause(Duration.ofSeconds(0)).clickAndHold(Deleted_DND)
			.pause(Duration.ofSeconds(0))
			.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
		}
		public void Deleted_Option1() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(Deleted_Option1));
			Deleted_Option1.click();
		}
		public void Deleted_Option2() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(Deleted_Option2));
			Deleted_Option2.click();
		}
		
		
		public void BillingLatitude_DND() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(BillingLatitude_DND));
			Actions actions = new Actions(ldriver);
			int x = AddField.getLocation().x;
			int y = AddField.getLocation().y;
			actions.moveToElement(BillingLatitude_DND).pause(Duration.ofSeconds(0)).clickAndHold(BillingLatitude_DND)
			.pause(Duration.ofSeconds(0))
			.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
		}
		public void BillingLatitude_Option() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(BillingLatitude_Option));
			BillingLatitude_Option.click();
		}
		public void EnterBillingLatitude() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterBillingLatitude));
			EnterBillingLatitude.sendKeys("681");
		}
		
		
		public void CreadtedDate_DND() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CreadtedDate_DND));
			Actions actions = new Actions(ldriver);
			int x = AddField.getLocation().x;
			int y = AddField.getLocation().y;
			actions.moveToElement(CreadtedDate_DND).pause(Duration.ofSeconds(0)).clickAndHold(CreadtedDate_DND)
			.pause(Duration.ofSeconds(0))
			.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
		}
		public void CreadtedDate_Option() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterBillingLatitude));
			CreadtedDate_Option.click();
		}
		public void ClickOnCalenderIcon() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCalenderIcon));
			ClickOnCalenderIcon.click();
		}
		public void SelectDate() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectDate));
			SelectDate.click();
		}
		
		
		
		public void EditAccounttId_Option() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EditAccounttId_Option));
			EditAccounttId_Option.click();
		}
		public void EditEnterAccountID() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EditEnterAccountID));
			EditEnterAccountID.sendKeys("323,684,53");
		}
		
		
		public void EditDeleted_Option2() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EditDeleted_Option2));
			EditDeleted_Option2.click();
		}
		
}
