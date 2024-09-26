package com.leadAngel.pageObjects;

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
	

}
