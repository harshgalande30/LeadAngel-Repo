package com.leadAngel.pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpportunityManagement_PageObjectModel {
	WebDriver ldriver;

	public OpportunityManagement_PageObjectModel(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//************************************************** CRMOpportunityFilter  ********************************************

		@FindBy(xpath = "//div[text()=' Opportunity Management']")
		WebElement OpportunityManagement;

		@FindBy(xpath = "//button[@aria-label='toggle CRM Opportunity Filter']")
		WebElement CRMOpportunityFilterDropDown;
		@FindBy(xpath = "//span[text()='CRM Opportunity Filter ']")
		WebElement CRMOpportunityFilter;
		
		@FindBy(xpath = "//h4[text()='CRM Opportunity Filter Overview']")
		WebElement CRMOpportunityFilterOverview;
		
		@FindBy(xpath = "//button[text()=' Opportunity Attributes ']")
		WebElement ClickOnOpportunityAttributes;
		
		@FindBy(xpath = "//div[@cdkdragboundary='.example-boundary']")
		WebElement AddField;
		
		@FindBy(xpath = "//mat-list-item[contains(@id,'Opportunity ID')]")
		WebElement OpportunityID_DND;
		@FindBy(xpath = "(//i[@class='righticon-BOOLEAN'])[1]")
		WebElement Deleted_DND;
		@FindBy(xpath = "(//mat-list-item[@mattooltipclass='custom-tooltip-style'])[8]")
		WebElement Amount_DND;
		@FindBy(xpath = "(//mat-list-item[@mattooltipclass='custom-tooltip-style'])[23]")
		WebElement CreadtedDate_DND;

		//************************************************** Opportunity Routing Territory  ********************************************
	
		@FindBy(xpath = "//button[@aria-label='toggle Opportunity Routing Territory']")
		WebElement OpportunityRoutingTerritoryDropDown;
		@FindBy(xpath = "//span[text()='Opportunity Routing Territory ']")
		WebElement OpportunityRoutingTerritory;
		
		@FindBy(xpath = "//h4[text()='Opportunity Routing Territory Overview']")
		WebElement OpportunityRoutingTerritoryOverview;
		
		@FindBy(xpath="(//mat-list-item[@mattooltipclass='custom-tooltip-style'])[3]")
		WebElement CRMopportunityFilter_DND;
		
		@FindBy(xpath="//button[@aria-label='toggle ..folder']")
		WebElement ClickOnFolder;
	
		//************************************************** WaitFilter ********************************************
		@FindBy(xpath = "(//mat-list-item[@mattooltipclass='custom-tooltip-style'])[8]")
		WebElement Amount__DND;
		
		@FindBy(xpath = "(//mat-list-item[@mattooltipclass='custom-tooltip-style'])[12]")
		WebElement CloseDate_DND;
		
		@FindBy(xpath="//button[@aria-label='toggle f1']")
		WebElement WFFolder;
		
		//************************************************** Wait Condition ********************************************
		@FindBy(xpath="//button[@aria-label='toggle f2']")
		WebElement WaitConditionFolder;
		
		//************************************************** Opportunity Router ********************************************
		@FindBy(xpath = "//span[text()='Opportunity Router ']")
		WebElement OpportunityRouter;
		
		@FindBy(xpath = "//button[@aria-label='toggle Opportunity Router']")
		WebElement OpportunityRouterDropDown;
		@FindBy(xpath = "//h4[text()='Opportunity Router Overview']")
		WebElement OpportunityRouterOverview;
		@FindBy(xpath = "//div[contains(text(),' Opportunity Filter ')]")
		WebElement OpportunityFilter_DND;
		@FindBy(xpath = "(//span[@class='mat-checkbox-inner-container'])[1]")
		WebElement CheckBoxForAssignmentBlockAEtoSDRForContactMngmt;
	
		@FindBy(xpath="//button[@aria-label='toggle f-9-11']")
		WebElement ClickFolder;
		//************************************************** Opportunity Router ********************************************
		public void CheckBoxForAssignmentBlockAEtoSDRForContactMngmt() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CheckBoxForAssignmentBlockAEtoSDRForContactMngmt));
			CheckBoxForAssignmentBlockAEtoSDRForContactMngmt.click();
		}
		public void OpportunityFilter_DND() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(OpportunityFilter_DND));
			Actions actions = new Actions(ldriver);
			actions.moveToElement(OpportunityFilter_DND)
	        .pause(Duration.ofSeconds(1))
	        .clickAndHold(OpportunityFilter_DND)
	        .pause(Duration.ofSeconds(1))
	        .moveByOffset(-400,165) //change the x, y values to be applicable for your cases
	        .moveByOffset(-400,165)
	        .pause(Duration.ofSeconds(1))
	        .release().build().perform();
		}
		public void OpportunityFilter2_DND() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(OpportunityFilter_DND));
			Actions actions = new Actions(ldriver);
			actions.moveToElement(OpportunityFilter_DND)
	        .pause(Duration.ofSeconds(1))
	        .clickAndHold(OpportunityFilter_DND)
	        .pause(Duration.ofSeconds(1))
	        .moveByOffset(-300,50) //change the x, y values to be applicable for your cases
	        .moveByOffset(-300,50)
	        .pause(Duration.ofSeconds(1))
	        .release().build().perform();
		}
		
		
		public void RightClickOnOpportunityRouter() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25))
			.until(ExpectedConditions.elementToBeClickable(OpportunityRouter));
			Actions actions = new Actions(ldriver);
			actions.moveToElement(OpportunityRouter).click(OpportunityRouter).contextClick(OpportunityRouter).build()
			.perform();
		}
		public void OpportunityRouterDropDown() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(OpportunityRouterDropDown));
			OpportunityRouterDropDown.click();
		}
		public void AgainClickOpportunityRouter() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(OpportunityRouter));
			OpportunityRouter.click();
		}
		public boolean OpportunityRouterOverview() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(OpportunityRouterOverview));
			return OpportunityRouterOverview.isDisplayed();
		}
		public void ClickFolder() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickFolder));
			ClickFolder.click();
		}

		//************************************************** Wait Condition ********************************************
	
		public void WaitConditionFolder() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(WaitConditionFolder));
			WaitConditionFolder.click();

		}
		//************************************************** WaitFilter ********************************************
		
		public void Amount__DND() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(Amount__DND));
			Actions actions = new Actions(ldriver);
			int x = AddField.getLocation().x;
			int y = AddField.getLocation().y;
			actions.moveToElement(Amount__DND).pause(Duration.ofSeconds(0)).clickAndHold(Amount__DND)
			.pause(Duration.ofSeconds(0))
			.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
		}
		
		public void CloseDate_DND() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CloseDate_DND));
			Actions actions = new Actions(ldriver);
			int x = AddField.getLocation().x;
			int y = AddField.getLocation().y;
			actions.moveToElement(CloseDate_DND).pause(Duration.ofSeconds(0)).clickAndHold(CloseDate_DND)
			.pause(Duration.ofSeconds(0))
			.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
		}
		
		
		public void ClickOnWaitFilterFolder1() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(WFFolder));
			WFFolder.click();

		}
		//************************************************** CRMOpportunityFilter Module ********************************************
		public void OpportunityManagement() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(OpportunityManagement));
			OpportunityManagement.click();
		}
		
		
		
		public void CRMOpportunityFilterDropDown() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CRMOpportunityFilterDropDown));
			CRMOpportunityFilterDropDown.click();
		}
		public void RightClickOnCRMOpportunityFilter() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25))
			.until(ExpectedConditions.elementToBeClickable(CRMOpportunityFilter));
			Actions actions = new Actions(ldriver);
			actions.moveToElement(CRMOpportunityFilter).click(CRMOpportunityFilter).contextClick(CRMOpportunityFilter).build()
			.perform();
		}
		public void ClickAgainCRMOpportunityFilter() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CRMOpportunityFilter));
			CRMOpportunityFilter.click();
		}
		public void ClickOnOpportunityAttributes() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnOpportunityAttributes));
			ClickOnOpportunityAttributes.click();
		}
		
		
		public boolean DisplayCRMOpportunityFilterOverview() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CRMOpportunityFilterOverview));
			return CRMOpportunityFilterOverview.isDisplayed();
		}
		
		
		
		public void OpportunityID_DND() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(OpportunityID_DND));
			Actions actions = new Actions(ldriver);
			int x = AddField.getLocation().x;
			int y = AddField.getLocation().y;
			actions.moveToElement(OpportunityID_DND).pause(Duration.ofSeconds(0)).clickAndHold(OpportunityID_DND)
			.pause(Duration.ofSeconds(0))
			.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
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
		public void Amount_DND() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(Amount_DND));
			Actions actions = new Actions(ldriver);
			int x = AddField.getLocation().x;
			int y = AddField.getLocation().y;
			actions.moveToElement(Amount_DND).pause(Duration.ofSeconds(0)).clickAndHold(Amount_DND)
			.pause(Duration.ofSeconds(0))
			.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
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
		
		//************************************************** Opportunity Routing Territory  Module ********************************************
		
		public void OpportunityRoutingTerritoryDropDown() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(OpportunityRoutingTerritoryDropDown));
			OpportunityRoutingTerritoryDropDown.click();
		}
		public void RightClickOnOpportunityRoutingTerritory() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25))
			.until(ExpectedConditions.elementToBeClickable(OpportunityRoutingTerritory));
			Actions actions = new Actions(ldriver);
			actions.moveToElement(OpportunityRoutingTerritory).click(OpportunityRoutingTerritory).contextClick(OpportunityRoutingTerritory).build()
			.perform();
		}
		
		public void ClickAgainOpportunityRoutingTerritory() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(OpportunityRoutingTerritory));
			OpportunityRoutingTerritory.click();
		}
		
		
		public boolean DisplayOpportunityRoutingTerritoryOverview() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(OpportunityRoutingTerritoryOverview));
			return OpportunityRoutingTerritoryOverview.isDisplayed();
		}
		
		
		public void CRMopportunityFilter_DND() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CRMopportunityFilter_DND));
			Actions actions = new Actions(ldriver);
			int x = AddField.getLocation().x;
			int y = AddField.getLocation().y;
			actions.moveToElement(CRMopportunityFilter_DND).pause(Duration.ofSeconds(0)).clickAndHold(CRMopportunityFilter_DND)
			.pause(Duration.ofSeconds(0))
			.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
		}
		public void ClickOnFolder() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnFolder));
			ClickOnFolder.click();
		}
		
		
}
