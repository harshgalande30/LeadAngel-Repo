package com.leadAngel.pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PartnerLeadManagement_PageObjectModel {
	WebDriver ldriver;

	public PartnerLeadManagement_PageObjectModel(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	//************************************************** PartnerLeadManagemnt Module ********************************************

		@FindBy(xpath = "//div[text()=' Partner Lead Management']")
		WebElement PartnerLeadManagement;
	
	//************************************************** Partner Team ********************************************

		@FindBy(xpath = "//button[@aria-label='toggle Partner Team']")
		WebElement PartnerTeamDropDown;
		@FindBy(xpath = "//span[text()='Partner Team ']")
		WebElement PartnerTeam;
		@FindBy(xpath = "//h4[text()='Partner Team Overview']")
		WebElement DisplayPartnerTeamOverView;
		
		
		@FindBy(xpath = "//button[text()=' Partner Group ']")
		WebElement ClickOnPartnerGroup;
		@FindBy(xpath = "//div[@cdkdragboundary='.example-boundary']")
		WebElement AddField;
		
		
		@FindBy(xpath = "//mat-list-item[contains(@id,'Partner ID')]")
		WebElement PartnerID_DND;
		@FindBy(xpath = "//option[text()=' is greater than ']")
		WebElement SelectPartnerIDoption;
		@FindBy(xpath = "(//input[@mattooltipclass='custom-tooltip-style'])[1]")
		WebElement EnterPartnerID;//65848
		
		@FindBy(xpath = "//mat-list-item[contains(@id,'Partner Name')]")
		WebElement PartnerName_DND;
		@FindBy(xpath = "//option[text()='contains']")
		WebElement SelectPartnerNameOption;
		@FindBy(xpath = "(//input[@mattooltipclass='custom-tooltip-style'])[2]")
		WebElement EnterPartnerNameContainsValue;//4885,558,5885
		
		@FindBy(xpath = "//mat-list-item[contains(@id,'Custom Field 1')]")
		WebElement EditCutomField1_DND;
		@FindBy(xpath = "(//option[text()='not in'])[3]")
		WebElement EditSelectCutomFiled1Option;
		@FindBy(xpath = "//mat-icon[text()='add_box']")
		WebElement EditClickCutomFiled1AddButton;
		@FindBy(xpath = "(//div[@class='mat-list-text'])[1]")
		WebElement EditSelectOptionFromList;
		@FindBy(xpath = "//span[text()='Save']")
		WebElement EditClickSaveButton;
		//************************************************** Wait Filter ********************************************
		@FindBy(xpath = "//button[@aria-label='toggle Partner Lead Routing']")
		WebElement PartnerLeadRoutingDropDown;
		//************************************************** PartnerLead Router ********************************************
		@FindBy(xpath = "//span[text()='Partner Lead Router ']")
		WebElement PartnerLeadRouter;
		
		@FindBy(xpath = "//button[@aria-label='toggle Partner Lead Router']")
		WebElement PartnerLeadRouterDropDown;
		@FindBy(xpath = "//h4[text()='Partner Lead Router Overview']")
		WebElement PartnerLeadRouterOverview;
		@FindBy(xpath = "//div[contains(text(),' Decision ')]")
		WebElement Decision_DND;
		
		@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[2]")// deatils page
		WebElement DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown1ForAccMangmnt;
		@FindBy(xpath = "(//mat-icon[text()='check_box'])[2]")// deatils page
		WebElement CheckBoxForDataValueUpdateWhenRoutedToDefaultLeadOwnerForAccMangmnt;
		
		//************************************************** PartnerLead Router ********************************************

		public void Decision1_DND() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(Decision_DND));
			Actions actions = new Actions(ldriver);
			actions.moveToElement(Decision_DND)
	        .pause(Duration.ofSeconds(1))
	        .clickAndHold(Decision_DND)
	        .pause(Duration.ofSeconds(1))
	        .moveByOffset(-400,165) //change the x, y values to be applicable for your cases
	        .moveByOffset(-400,165)
	        .pause(Duration.ofSeconds(1))
	        .release().build().perform();
		}
		public void Decision2_DND() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(Decision_DND));
			Actions actions = new Actions(ldriver);
			actions.moveToElement(Decision_DND)
	        .pause(Duration.ofSeconds(1))
	        .clickAndHold(Decision_DND)
	        .pause(Duration.ofSeconds(1))
	        .moveByOffset(-300,50) //change the x, y values to be applicable for your cases
	        .moveByOffset(-300,50)
	        .pause(Duration.ofSeconds(1))
	        .release().build().perform();
		}
		
		
		public void RightClickOnPartnerLeadRouter() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25))
			.until(ExpectedConditions.elementToBeClickable(PartnerLeadRouter));
			Actions actions = new Actions(ldriver);
			actions.moveToElement(PartnerLeadRouter).contextClick(PartnerLeadRouter).build()
			.perform();
		}
		public void PartnerLeadRouterDropDown() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(PartnerLeadRouterDropDown));
			PartnerLeadRouterDropDown.click();
		}
		public void AgainClickPartnerLeadRouter() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(PartnerLeadRouter));
			PartnerLeadRouter.click();
		}
		public boolean PartnerLeadRouterOverview() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(PartnerLeadRouterOverview));
			return PartnerLeadRouterOverview.isDisplayed();
		}
		
		
		public void DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown1ForAccMangmnt() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown1ForAccMangmnt));
			DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown1ForAccMangmnt.click();
		}
		public void CheckBoxForDataValueUpdateWhenRoutedToDefaultLeadOwnerForAccMangmnt() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CheckBoxForDataValueUpdateWhenRoutedToDefaultLeadOwnerForAccMangmnt));
			 CheckBoxForDataValueUpdateWhenRoutedToDefaultLeadOwnerForAccMangmnt.click();	
		}
		//************************************************** Wait Filter ********************************************

		public void PartnerLeadRoutingDropDown() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(PartnerLeadRoutingDropDown));
			PartnerLeadRoutingDropDown.click();
		}
		//************************************************** Partner Team ********************************************
	
		public void PartnerLeadManagement() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(PartnerLeadManagement));
			PartnerLeadManagement.click();
		}
		
		
		
		public void PartnerTeamDropDown() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(PartnerTeamDropDown));
			PartnerTeamDropDown.click();
		}
		public void ClickAgainPartnerTeam() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(PartnerTeam));
			PartnerTeam.click();
		}
		public void RightClickOnPartnerTeam() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25))
			.until(ExpectedConditions.elementToBeClickable(PartnerTeam));
			Actions actions = new Actions(ldriver);
			actions.moveToElement(PartnerTeam).contextClick(PartnerTeam).build().perform();
		}
		public boolean DisplayPartnerTeamOverView() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayPartnerTeamOverView));
		return 	DisplayPartnerTeamOverView.isDisplayed();
		}
		
		
		
		
		public void ClickOnPartnerGroup() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnPartnerGroup));
			ClickOnPartnerGroup.click();
		}
		
		
		
		public void PartnerID_DND() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(PartnerID_DND));
			Actions actions = new Actions(ldriver);
			int x = AddField.getLocation().x;
			int y = AddField.getLocation().y;
			actions.moveToElement(PartnerID_DND).pause(Duration.ofSeconds(0)).clickAndHold(PartnerID_DND)
			.pause(Duration.ofSeconds(0))
			.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
		}
		public void SelectPartnerIDoption() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectPartnerIDoption));
			SelectPartnerIDoption.click();
		}
		public void EnterPartnerID() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterPartnerID));
			EnterPartnerID.sendKeys("65848");
		}
		
		
		
		public void PartnerName_DND() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(PartnerName_DND));
			Actions actions = new Actions(ldriver);
			int x = AddField.getLocation().x;
			int y = AddField.getLocation().y;
			actions.moveToElement(PartnerName_DND).pause(Duration.ofSeconds(0)).clickAndHold(PartnerName_DND)
			.pause(Duration.ofSeconds(0))
			.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
		}
		public void SelectPartnerNameOption() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectPartnerNameOption));
			SelectPartnerNameOption.click();
		}
		public void EnterPartnerNameContainsValue() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterPartnerNameContainsValue));
			EnterPartnerNameContainsValue.sendKeys("4885,558,5885");
		}
		
		
		
		public void EditCutomField1_DND() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EditCutomField1_DND));
			Actions actions = new Actions(ldriver);
			int x = AddField.getLocation().x;
			int y = AddField.getLocation().y;
			actions.moveToElement(EditCutomField1_DND).pause(Duration.ofSeconds(0)).clickAndHold(EditCutomField1_DND)
			.pause(Duration.ofSeconds(0))
			.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
		}
		public void EditSelectCutomFiled1Option() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EditSelectCutomFiled1Option));
			EditSelectCutomFiled1Option.click();
		}
		public void EditClickCutomFiled1AddButton() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EditClickCutomFiled1AddButton));
			EditClickCutomFiled1AddButton.click();
		}
		public void EditSelectOptionFromList() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EditSelectOptionFromList));
			EditSelectOptionFromList.click();
		}
		public void EditClickSaveButton() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EditClickSaveButton));
			EditClickSaveButton.click();
		}
		
	//*********************************************************Sanity X Path ***********************************************************************	
		@FindBy(xpath = "//div[contains(text(),' Decision ')]")
		WebElement DecisionBlockPartnerLead_DND;
		
		public void DecisionBlockPartnerLead_DND() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DecisionBlockPartnerLead_DND));
			Actions actions = new Actions(ldriver);
			actions.moveToElement(DecisionBlockPartnerLead_DND)
	        .pause(Duration.ofSeconds(1))
	        .clickAndHold(DecisionBlockPartnerLead_DND)
	        .pause(Duration.ofSeconds(1))
	        .moveByOffset(-480,95) 
	        .moveByOffset(-480,95)
	        .pause(Duration.ofSeconds(1))
	        .release().build().perform();
		}
		
		
		
		
		
		
		
		
}
