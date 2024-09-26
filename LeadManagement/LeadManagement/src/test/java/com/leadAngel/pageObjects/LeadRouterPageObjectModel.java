package com.leadAngel.pageObjects;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeadRouterPageObjectModel {


	WebDriver ldriver;

	public LeadRouterPageObjectModel(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}
	
	//*****************************************************Lead Router Flow Chart*****************************************
	@FindBy(xpath="//mat-icon[text()='expand_more']")
	WebElement DNDdiagramDropDown;
	
	
	
	
	@FindBy(xpath="//div[contains(text(),'Lead Filter')]")
	WebElement LeadFilter;

	
	
	
	
	
	
	@FindBy(xpath="(//div[@class='drag-start connect ng-star-inserted'])[2]")
	WebElement SelectActionDropDown;
	@FindBy(xpath="//select[@formcontrolname='DecisionActionType']")
	WebElement ClickActionDropDown;
	@FindBy(xpath="//option[@value='webhook']")
	WebElement WeighBookOptioActionBlock;
	@FindBy(xpath="//option[@value='WaitStep']")
	WebElement SelectWaitOptionInActionBlock;
	@FindBy(xpath="//select[@formcontrolname='webhookvalue']")
	WebElement ClickWeighBookDropDown;
	@FindBy(xpath="(//span[@class='custom-option-content ng-star-inserted'])[1]")
	WebElement WeighBookOptionActionBlock;
	@FindBy(xpath="//ng-select[@bindlabel='SubMenuName']")
	WebElement SelectListBoxActionBlock;
	@FindBy(xpath="(//ng-select[@bindlabel='SubMenuName'])[4]")
	WebElement SelectListBoxActionBlockOTS;
	@FindBy(xpath="(//span[@class='mat-radio-container'])[1]")
	WebElement ClickOnContinueProcessingCheckBox;
	@FindBy(xpath="(//span[@class='mat-radio-container'])[5]")
	WebElement ClickOnContinueProcessingCheckBoxActionBlockOTS;
	@FindBy(xpath="(//span[@class='mat-radio-container'])[2]")
	WebElement ClickOnStopProcessingCheckBox;
	@FindBy(xpath="//span[normalize-space()='Save']")
	WebElement SaveButtonForActionBlock;
	@FindBy(xpath="(//span[normalize-space()='Save'])[2]")
	WebElement SaveButtonForActionBlockOTS;
	@FindBy(xpath="(//*[name()='polygon'][@stroke='green'])[1]")
	WebElement ActionBlockBorderColor;
	
	
	
	
	@FindBy(xpath="//textarea[@formcontrolname=\"decisionDescription\"]")
	WebElement DescriptionActionBlock;
	@FindBy(xpath="//select//option[contains(text(),'Call Webhook')]")
	WebElement ActionBlockOptions;
	@FindBy(xpath="(//select[@formcontrolname=\"webhookvalue\"]//option)[2]")
	WebElement ActionBlockOptions2;
	@FindBy(xpath="//div[@data-jtk-source-port-type='source']")
	WebElement DecisionBlockY;
	@FindBy(xpath="(//div[@data-jtk-source-port-type='source'])[2]")
	WebElement Decision2BlockY;
	
	@FindBy(xpath="//div[@data-jtk-source-port-type='source1']")
	WebElement DecisionBlockN;
	
	@FindBy(xpath="(//div[@data-jtk-source-port-type='source1'])[2]")
	WebElement Decision2BlockN;
	            
	@FindBy(xpath="(//span[contains(text(),'Assignment Block')]/ancestor::div)[14]")   
	WebElement AssignmentBlock1InCanvas;
	@FindBy(xpath="(//span[contains(text(),'Assignment Block')]/ancestor::div)[15]")
	WebElement AssignmentBlock2InCanvas;
	
	@FindBy(xpath="(//span[contains(text(),'Assignment Block')]/ancestor::div)[16]")
	WebElement AssignmentBlock3InCanvas;
	
	
	

	
	@FindBy(xpath="//i[contains(@class,'system-data-dictionary')]//..//span[text()='All Leads']")
	WebElement EditDecisionBlockList;
	
	@FindBy(xpath="(//i[@class='list-icon-size account-list-icon ng-star-inserted'])[2]")
	WebElement DecisionBlock2List;
	
	@FindBy(xpath="//mat-select[@role='combobox']")
	WebElement DecisionBlock3List;
	
	
	
	@FindBy(xpath="(//i[@class='list-icon-size account-list-icon ng-star-inserted'])[2]")
	WebElement DecisionBlockList2;
	
	
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
	@FindBy(xpath="(//mat-option/span[contains(text(),'Assign to Account Owner')])[1]")
	WebElement SelectValueDropDownCucucmber;
	@FindBy(xpath="(//mat-option/span[contains(text(),'Assign to Sales Rep')])[3]")
	WebElement Edit2SelectValueDropDown;
	
	
	
	
	@FindBy(xpath="//mat-option/span[contains(text(),'Assign to Sales Team')]")
	WebElement EditAssignmentBlock2SelectValueDropDown;
	
	@FindBy(xpath="(//mat-select[@role='combobox'])[2]")                            //mat-select[@formcontrolname='ActionVal']")
	WebElement DropDown2InAssignmentBlock;
	
	@FindBy(xpath="(//mat-select[@role='combobox'])[3]")                            //mat-select[@formcontrolname='ActionVal']")
	WebElement DropDown2InAssignmentBlockForEscalationRouter;
	
	@FindBy(xpath="(//mat-select[@role='combobox'])[3]")
	WebElement DropDown2InAssignmentBlockWithoutRoutingSalesRepValue;
	
	@FindBy(xpath="(//mat-option[@role='option'])[2]")
	WebElement SelectOptionInAssignmentBlockWithoutRoutingSalesRepValue;
	
	
	@FindBy(xpath="(//mat-option[@role='option'])[1]")
	WebElement SelectValueDropDown2;
	
	@FindBy(xpath="(//span[@class='custom-option-content ng-star-inserted'])[2]")
	WebElement EditSelectValueDropDown2;
	
	
	@FindBy(xpath="(//mat-option[@role='option'])[3]")
	WebElement SelectValueDropDown3;
	
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
	
	@FindBy(xpath = "//span[text()='New partner list']")
	WebElement NewPartnerListOption;
	
	@FindBy(xpath = "//button[@name='addBtn']")
	WebElement AddButton;
	
	@FindBy(xpath = "//button[@class='mat-focus-indicator save-btn mat-raised-button mat-button-base ng-star-inserted']")
	WebElement SaveButtonForDecisionBlock;
	
	@FindBy(xpath = "//*[name()='path' and contains(@stroke,'green')]")
	WebElement DecisionBlockBorderColour;
	

	@FindBy(xpath = "(//*[name()='path' and contains(@stroke,'green')])[2]")
	WebElement DecisionBlock2BorderColour;
	
	
	@FindBy(xpath = "(//span[@class='mat-checkbox-inner-container'])[2]")
	WebElement CheckBoxForAssignmentBlockAEtoSDR;
	
	@FindBy(xpath = "(//mat-select[@role='combobox'])[4]")
	WebElement ClickOnSelectMappedSDR;
	
	@FindBy(xpath = "(//span[@class='custom-option-content ng-star-inserted'])[1]")
	WebElement ClickOnSelectMappedSDROption;
	
	@FindBy(xpath = "(//span[@class='custom-option-content'])[1]")
	WebElement ClickOnAutoConvertLeadsIntoContactAndOrAccountsOption;
	
	@FindBy(xpath = "(//mat-option[@role='option'])[4]")
	WebElement Edit2ClickOnSelectMappedSDROption;
	
	
	
	@FindBy(xpath = "(//mat-option[@role='option'])[5]")
	WebElement EditClickOnSelectMappedSDROption;
	
	
	@FindBy(xpath = "//span[text()='Save']")
	WebElement SaveButtonForAssignmentBlock;
	
	@FindBy(xpath = "//span[text()='Save']")
	WebElement SaveButtonForOTSAssignmentBlock;
	
	@FindBy(xpath = "//div[3]//div[1]//*[name()='svg']//*[name()='rect' and contains(@stroke,'green')]")
	WebElement AssignmentBlock1;
	@FindBy(xpath = "(//*[name()='svg']//*[name()='rect' and contains(@stroke,'green')])[1]")
	WebElement AssignmentBlockBorderColor;

	@FindBy(xpath = "//div[1]//div[1]//*[name()='svg']//*[name()='rect' and contains(@stroke,'green')]")
	WebElement FlowChartAssignmentBlock2;
	
	
	
	@FindBy(xpath = "(//*[name()='rect'])[4]")
	WebElement FlowChartAssignmentBlock3;
	
	
	
	
	@FindBy(xpath = "//li[text()=' Draft ']")
	WebElement draftbox;
	
	@FindBy(xpath = "(//mat-select[@role='combobox'])[2]")
	WebElement DropDown2AssignmentBlock2;
	
	@FindBy(xpath = "//div[contains(text(),'Update to CRM')]")
	WebElement UpdateToCRM;
	@FindBy(xpath = "//div[@data-jtk-source-port-type='SyncToSDFC']")
	WebElement UpdateToCRMY;
	
	@FindBy(xpath = "//textarea[@placeholder='Description']")
	WebElement DescriptionOfUpdateToCRMBlock;
	@FindBy(xpath = "//span[text()='Save ']")
	WebElement SaveBttonUpdateToCRMBlock;
	@FindBy(xpath = "//*[name()='polygon'][@stroke='green']")
	WebElement UpdateToCRMBlockBorderColor;
	@FindBy(xpath = "(//*[name()='polygon'][@class='inner'][@stroke='green'])[3]")
	WebElement UpdateToCRMBlockLPWRBorderColor;
	
	
	
	
	@FindBy(xpath = "//div[text()=' Random Split ']")
	WebElement RandomSplit;
	@FindBy(xpath = "//input[@name='SplitA']")
	WebElement PercentageAllocationA;
	@FindBy(xpath = "//input[@name='SplitB']")
	WebElement PercentageAllocationB;
	@FindBy(xpath = "//input[@name='SplitC']")
	WebElement PercentageAllocationC;
	
	

	@FindBy(xpath = "//span[text()='Save ']")
	WebElement SaveButtonForRandomSplit;
	@FindBy(xpath = "(//*[name()='rect'][@stroke='green'])[3]")
	WebElement RandomSplitBorderColour;
	@FindBy(xpath = "(//*[name()='rect'][@class='inner'][@stroke='green'])")
	WebElement RandomSplitLPWRBorderColour;
	
	
	@FindBy(xpath = "//h4[text()='Lead Router Overview']")
	WebElement DisplayLeadRouterOverview;
	
	
	@FindBy(xpath = "(//div[@title='Drag to add new'])[6]")
	WebElement UpdateDataValue;
	@FindBy(xpath = "(//div[contains(@data-jtk-source-port-type,'action')])[2]")
	WebElement UpdateDataValueY;
	@FindBy(xpath = "(//button[@color='primary'])[1]")
	WebElement AddFieldButtonUpdateDataValue;
	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[2]")
	WebElement SelectUpdateDataValueDropDown1;
	@FindBy(xpath = "(//div[@role='option'])[1]")
	WebElement SelectUpdateDataValueDropDown1Option;
	@FindBy(xpath = "//mat-select[@role='combobox']")
	WebElement SelectUpdateDataValueDropDown2;
	@FindBy(xpath = "//button[@class='curly-breaket ng-star-inserted']")
	WebElement ClickOnInsertValueButtonUpdateDataValue;
	
	
	
	@FindBy(xpath = "//option[@value='Lead']")    //This Xpath is also applicaple for Emain Alert Templates in administration Module
	WebElement SelectInsertValueObjectOptionUpdateDataValue;
	
	
	@FindBy(xpath = "//div[@class='ng-select-container']")    //This Xpath is also applicaple for Emain Alert Templates in administration Module
	WebElement InsertValueSelectFieldDropDownUpdateDataValue;
	
	
	@FindBy(xpath = "(//div[@role='option'])[1]")
	WebElement InsertValueSelectFieldOptionUpdateDataValue;     //This Xpath is also applicaple for Emain Alert Templates in administration Module
	
	@FindBy(xpath = "(//div[@role='option'])[2]")
	WebElement InsertValueSelectFieldOption2UpdateDataValue; 
	
	@FindBy(xpath = "//span[text()='Save']")                  //This Xpath is also applicaple for Emain Alert Templates in administration Module
	WebElement SaveButtonForInsertValue;
	
	
	@FindBy(xpath = "//span[text()='Save ']")
	WebElement SaveButtonForUpdateDataValue;
	@FindBy(xpath = "(//*[name()='polygon'][@stroke='green'])[3]")
	WebElement UpdateDataValueForBorderColor;
	
	@FindBy(xpath = "//button//span[text()=' Delete Draft ']")
	WebElement ClickOnDeleteCraftForLPWR;
	
	
	
	
	
	
	public void ClickOnAutoConvertLeadsIntoContactAndOrAccountsOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAutoConvertLeadsIntoContactAndOrAccountsOption));
		ClickOnAutoConvertLeadsIntoContactAndOrAccountsOption.click();
	}
	public void ClickOnDeleteCraftForLPWR() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDeleteCraftForLPWR));
		ClickOnDeleteCraftForLPWR.click();
	}
	
	
	public void ClickOnAddFieldButtonUpdateDataValue() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(AddFieldButtonUpdateDataValue));
		AddFieldButtonUpdateDataValue.click();
	}
	public void ClickOnSelectUpdateDataValueDropDown1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectUpdateDataValueDropDown1));
		SelectUpdateDataValueDropDown1.click();
	}
	public void ClickOnSelectUpdateDataValueDropDown1Option() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectUpdateDataValueDropDown1Option));
		SelectUpdateDataValueDropDown1Option.click();
	}
	public void ClickOnSelectUpdateDataValueDropDown2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectUpdateDataValueDropDown2));
		SelectUpdateDataValueDropDown2.click();
	}
	public void ClickOnInsertValueButtonUpdateDataValue() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnInsertValueButtonUpdateDataValue));
		ClickOnInsertValueButtonUpdateDataValue.click();
	}
	
	
	//This Xpath is also applicaple for Emain Alert Templates in administration Module
	public void ClickOnSelectInsertValueObjectOptionUpdateDataValue() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectInsertValueObjectOptionUpdateDataValue));
		SelectInsertValueObjectOptionUpdateDataValue.click();
	}
	
	//This Xpath is also applicaple for Emain Alert Templates in administration Module
	public void ClickOnInsertValueSelectFieldDropDownUpdateDataValue() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(InsertValueSelectFieldDropDownUpdateDataValue));
		InsertValueSelectFieldDropDownUpdateDataValue.click();
	}
	
	//This Xpath is also applicaple for Emain Alert Templates in administration Module
	public void ClickOnInsertValueSelectFieldOptionUpdateDataValue() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(InsertValueSelectFieldOptionUpdateDataValue));
		InsertValueSelectFieldOptionUpdateDataValue.click();
	}
	public void ClickOnInsertValueSelectFieldOption2UpdateDataValue() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(InsertValueSelectFieldOption2UpdateDataValue));
		InsertValueSelectFieldOption2UpdateDataValue.click();
	}
	//This Xpath is also applicaple for Emain Alert Templates in administration Module
	public void ClickOnSaveButtonForInsertValue() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SaveButtonForInsertValue));
		SaveButtonForInsertValue.click();
	}
	public void ClickOnSaveButtonForUpdateDataValue() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SaveButtonForUpdateDataValue));
		SaveButtonForUpdateDataValue.click();
	}
	
	public boolean DisplayUpdateDataValueForBorderColor() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(UpdateDataValueForBorderColor));
        return UpdateDataValueForBorderColor.isDisplayed();
	}
	
	public void UpdateDataValue_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(UpdateDataValue));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(UpdateDataValue)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(UpdateDataValue)
        .pause(Duration.ofSeconds(1))
        .moveByOffset(-100,-100) //change the x, y values to be applicable for your cases
        .moveByOffset(-100,-100)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	public void ConnectionUpdateDataValue_To_AssignmentBlock3() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(UpdateDataValueY));
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(AssignmentBlock3InCanvas));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(UpdateDataValueY)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(UpdateDataValueY)
        .pause(Duration.ofSeconds(1))
        .moveToElement(AssignmentBlock3InCanvas)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	
	
	
	
	
	public void WriteValueInsidePercentageAllocationForA() {
		new WebDriverWait(ldriver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(PercentageAllocationA));
		PercentageAllocationA.clear();
		PercentageAllocationA.sendKeys("35");
	}
	
	public void WriteValueInsidePercentageAllocationForB() {
		new WebDriverWait(ldriver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(PercentageAllocationB));
		PercentageAllocationB.clear();
		PercentageAllocationB.sendKeys("33");
	}
	public void WriteValueInsidePercentageAllocationForC() {
		new WebDriverWait(ldriver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(PercentageAllocationC));
		PercentageAllocationC.clear();
		PercentageAllocationC.sendKeys("32");
	}
	
	public void ClickOnSaveButtonForRandomSplit() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SaveButtonForRandomSplit));
		SaveButtonForRandomSplit.click();
	}
	
	
	public boolean isDisplayLeadRouterOverview() {
		  new WebDriverWait(ldriver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(DisplayLeadRouterOverview));
		  return DisplayLeadRouterOverview.isDisplayed();
	}
	
	

	
	public void ConnectionRandomSplitA_To_UpdateToCRM() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(RandomSplitA));
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(UpdateToCRMY));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(RandomSplitA)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(RandomSplitA)
        .pause(Duration.ofSeconds(1))
        .moveToElement(UpdateToCRMY)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	public void ConnectionRandomSplitB_To_AssignmentBlock1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(RandomSplitA));
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(UpdateToCRMY));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(RandomSplitB)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(RandomSplitB)
        .pause(Duration.ofSeconds(1))
        .moveToElement(AssignmentBlock1InCanvas)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	
	
	
	
	public void UpdateToCRM_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(UpdateToCRM));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(UpdateToCRM)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(UpdateToCRM)
        .pause(Duration.ofSeconds(1))
        .moveByOffset(-380,-100) //change the x, y values to be applicable for your cases
        .moveByOffset(-380,-100)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	

	public void ConnectionUpdateToCRM_To_FlowChartTCAssignmentBlock2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(UpdateToCRMY));
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(AssignmentBlock2InCanvas));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(UpdateToCRMY)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(UpdateToCRMY)
        .pause(Duration.ofSeconds(1))
        .moveToElement(AssignmentBlock2InCanvas)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	
	
	
	
	
	public void LeadFilter_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(LeadFilter));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(LeadFilter)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(LeadFilter)
        .pause(Duration.ofSeconds(1))
        .moveByOffset(-400,165) //change the x, y values to be applicable for your cases
        .moveByOffset(-400,165)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	


	
	

	
	
	
	public void FlowChartTCAssignmentBlock2_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(AssignmentBlock));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(AssignmentBlock)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(AssignmentBlock)
        .pause(Duration.ofSeconds(1))
        .moveByOffset(-270,-45) //change the x, y values to be applicable for your cases
        .moveByOffset(-270,-45)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	
	public void FlowChartTCAssignmentBlock3_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(AssignmentBlock));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(AssignmentBlock)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(AssignmentBlock)
        .pause(Duration.ofSeconds(1))
        .moveByOffset(-100,160) //change the x, y values to be applicable for your cases
        .moveByOffset(-100,160)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	

	
	public void ActionBlock_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DNDActionBlock));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(DNDActionBlock)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(DNDActionBlock)
        .pause(Duration.ofSeconds(1))
        .moveByOffset(-300,50) //change the x, y values to be applicable for your cases
        .moveByOffset(-300,50)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	
	public void ConnectActionBlock_To_assignmentBlock1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ActionBlockArrow));
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(AssignmentBlock1InCanvas));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(ActionBlockArrow)
        .pause(Duration.ofSeconds(0))
        .clickAndHold(ActionBlockArrow)
        .pause(Duration.ofSeconds(0))
        .moveToElement(AssignmentBlock1InCanvas)
        .pause(Duration.ofSeconds(0))
        .release().build().perform();
	}
	
	
	
	

	
	public void ClickOnDescriptionOfUpdateToCRMBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(DescriptionOfUpdateToCRMBlock));
		DescriptionOfUpdateToCRMBlock.clear();
		DescriptionOfUpdateToCRMBlock.sendKeys("Automation Testing is On going");
	}
	
	
	

	public void DoubleClickOnActionBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ActionBlockArrow));
		Actions actions = new Actions(ldriver);
		//DecisionBlock.sendKeys("");
		actions.doubleClick(ActionBlockArrow).build().perform();
		actions.doubleClick(ActionBlockArrow).build().perform();
		
	}
	public void InputOnActionBlockDescription() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DescriptionActionBlock));
		DescriptionActionBlock.sendKeys("Automation Testing GoingOn!!");
	}
	public void ClickOnOptionInActionBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ActionBlockOptions));
		ActionBlockOptions.click();
	}
	
	public void ClickOnSelectActionDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickActionDropDown));
		ClickActionDropDown.click();
	}
	
//	public void ClickOnDNDdiagramDropDown() {
//		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DNDdiagramDropDown));
//		DNDdiagramDropDown.click();
//	}
	
	public void ClickOnDNDdiagramDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DNDdiagramDropDown));
		//ApproveSubmitbtn.click();
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", DNDdiagramDropDown);
	}
	
	
	
	public void SelectOnWeighBookOptionActionBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(WeighBookOptioActionBlock));
		WeighBookOptioActionBlock.click();
	}
	public void SelectWaitOptionInActionBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectWaitOptionInActionBlock));
		SelectWaitOptionInActionBlock.click();
	}
	public void ClickWeighBookDropDownActionBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickWeighBookDropDown));
		ClickWeighBookDropDown.click();
	}
	
	public void SelectWeighBookOptionActionBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(WeighBookOptionActionBlock));
		WeighBookOptionActionBlock.click();
	}
	public void SelectListBoxActionBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectListBoxActionBlock));
		SelectListBoxActionBlock.click();
	}
	public void SelectListBoxActionBlockOTS() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectListBoxActionBlockOTS));
		SelectListBoxActionBlockOTS.click();
	}
//	public void ClickOnWeighbookFailureCheckBoxActionBlock() {
//		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnWeighbookFailureCheckBox));
//		ClickOnWeighbookFailureCheckBox.click();
//	}
	public void ClickOnWeighbookFailureCheckBoxActionBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnContinueProcessingCheckBox));
		//ApproveSubmitbtn.click();
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", ClickOnContinueProcessingCheckBox);
	}
	
	public void ClickOnContinueProcessingCheckBoxActionBlockOTS() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnContinueProcessingCheckBoxActionBlockOTS));
		//ApproveSubmitbtn.click();
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", ClickOnContinueProcessingCheckBoxActionBlockOTS);
	}
	public void ClickOnWeighbookStopProcessingCheckBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnStopProcessingCheckBox));
		//ApproveSubmitbtn.click();
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", ClickOnStopProcessingCheckBox);
	}
	public void ClickOnSaveButtonForActionBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SaveButtonForActionBlock));
		SaveButtonForActionBlock.click();
	}
	
	public void SaveButtonForActionBlockOTS() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SaveButtonForActionBlockOTS));
		SaveButtonForActionBlockOTS.click();
	}
	public void ClickOnOption2InActionBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ActionBlockOptions2));
		ActionBlockOptions2.click();
	}
	public void ClickOnContinueProcessingActionBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ContinueProcessingActionBlock));
		ContinueProcessingActionBlock.click();
	}
	
	public void SelectEditDecisionBlockListElem() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(EditDecisionBlockList));
		EditDecisionBlockList.click();
	}
	
	public void SelectDecisionBlock2ListElem() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DecisionBlock2List));
		DecisionBlock2List.click();
	}
	public void SelectDecisionBlock3ListElem() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DecisionBlock3List));
		DecisionBlock3List.click();
	}
	
	public void SelectDecisionBlockListElem1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DecisionBlockList2));
		DecisionBlockList2.click();
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
	
	public void ClickOnSaveBttonUpdateToCRMBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SaveBttonUpdateToCRMBlock));
		SaveBttonUpdateToCRMBlock.click();
	}
	
	
	

	
	public void ConnectionRandomSplitC_To_FlowChartTCAssignmentBlock3() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(RandomSplitC));
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(AssignmentBlock3InCanvas));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(RandomSplitC)
        .pause(Duration.ofSeconds(0))
        .clickAndHold(RandomSplitC)
        .pause(Duration.ofSeconds(0))
        .moveToElement(AssignmentBlock3InCanvas)
        .pause(Duration.ofSeconds(0))
        .release().build().perform();
	}
	
	

	
	public void ConnectDecisionBlock_To_assignmentBlock3() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DecisionBlockN));
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(AssignmentBlock3InCanvas));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(DecisionBlockN)
        .pause(Duration.ofSeconds(0))
        .clickAndHold(DecisionBlockN)
        .pause(Duration.ofSeconds(0))
        .moveToElement(AssignmentBlock3InCanvas)
        .pause(Duration.ofSeconds(0))
        .release().build().perform();
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
	
	public void SelectValueDropDownCucucmber() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectValueDropDownCucucmber));
		SelectValueDropDownCucucmber.click();
	}
	
	public void Edit2SelectSalesRepInAssignmentBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(Edit2SelectValueDropDown));
		Edit2SelectValueDropDown.click();
	}
	
	public void EditSelectSalesRepInAssignmentBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(EditAssignmentBlock2SelectValueDropDown));
		EditAssignmentBlock2SelectValueDropDown.click();
	}

	public void ClickOnDropDown2AssignmentBlock2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DropDown2AssignmentBlock2));
		DropDown2AssignmentBlock2.click();
	}
	
	public void ClickOnDropDown2AssignmentBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DropDown2InAssignmentBlock));
		DropDown2InAssignmentBlock.click();
	}
	public void DropDown2InAssignmentBlockForEscalationRouter() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DropDown2InAssignmentBlockForEscalationRouter));
		DropDown2InAssignmentBlockForEscalationRouter.click();
	}
	public void DropDown2InAssignmentBlockWithoutRoutingSalesRepValue() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DropDown2InAssignmentBlockWithoutRoutingSalesRepValue));
		DropDown2InAssignmentBlockWithoutRoutingSalesRepValue.click();
	}
	
	public void SelectOptionInAssignmentBlockWithoutRoutingSalesRepValue() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DropDown2InAssignmentBlockWithoutRoutingSalesRepValue));
		SelectOptionInAssignmentBlockWithoutRoutingSalesRepValue.click();
	}
	
	
	
	public void SelectSalesRepValueInAssignmentBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectValueDropDown2));
		SelectValueDropDown2.click();
	}
	
	public void EditSelectSalesRepValueInAssignmentBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(EditSelectValueDropDown2));
		EditSelectValueDropDown2.click();
	}
	
	public void SelectSalesRepValueInAssignmentBlock2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectValueDropDown3));
		SelectValueDropDown3.click();
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


	
	
	public void ClickOnApproveButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ApproveBtn));
		ApproveBtn.click();
	}
	public void ClickOnSaveButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SaveBtn));
		SaveBtn.click();
	}
	
	public void ClickOnNewPartnerListOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(NewPartnerListOption));
		NewPartnerListOption.click();
	}

	public void ClickOnAddButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(AddButton));
		AddButton.click();
	}

	public void ClickOnSaveButtonForDecisionBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SaveButtonForDecisionBlock));
		SaveButtonForDecisionBlock.click();
	}
	
	public boolean DisplayDecisionBlockBorderColour() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DecisionBlockBorderColour));
        return DecisionBlockBorderColour.isDisplayed();
	}
	
	public boolean DisplayDecisionBlock2BorderColour() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DecisionBlockBorderColour));
        return DecisionBlock2BorderColour.isDisplayed();
	}
	

	public String getDecisionBlockBorderColour() {					

		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DecisionBlockBorderColour));

		String colour=DecisionBlockBorderColour.getCssValue("stroke");
		String clr = Color.fromString(colour).asHex();

		return clr;

	}
	
	public void ClickOnCheckBoxForAssignmentBlockAEtoSDR() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(CheckBoxForAssignmentBlockAEtoSDR));
		CheckBoxForAssignmentBlockAEtoSDR.click();
	}
	
	public void ClickedOnSelectMappedSDR() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnSelectMappedSDR));
		ClickOnSelectMappedSDR.click();
	}
	
	public void ClickedOnSelectMappedSDROption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnSelectMappedSDROption));
		ClickOnSelectMappedSDROption.click();
	}
	
	public void Edit2ClickedOnSelectMappedSDROption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(Edit2ClickOnSelectMappedSDROption));
		Edit2ClickOnSelectMappedSDROption.click();
	}
	
	public void EditClickedOnSelectMappedSDROption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(EditClickOnSelectMappedSDROption));
		EditClickOnSelectMappedSDROption.click();
	}
	
	public void ClickedOnSaveButtonForAssignmentBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SaveButtonForAssignmentBlock));
		SaveButtonForAssignmentBlock.click();
	}
	
	
	public void SaveButtonForOTSAssignmentBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SaveButtonForOTSAssignmentBlock));
		SaveButtonForOTSAssignmentBlock.click();
	}
	
	
	
//	public String getAssignmentBlock1BorderColour() {					
//
//		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(AssignmentBlock1));
//
//		String colour=AssignmentBlock1.getCssValue("stroke");
//		String clr = Color.fromString(colour).asHex();
//
//		return clr;
//
//	}
//	
	
	
	public boolean DisplayAssignmentBlockBorderColour() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(AssignmentBlockBorderColor));
        return AssignmentBlockBorderColor.isDisplayed();
	}
	public boolean DisplayAssignmentBlock1BorderColour() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(AssignmentBlock1));
        return AssignmentBlock1.isDisplayed();
	}
	public boolean DisplayActionBlockBorderColor() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(ActionBlockBorderColor));
        return ActionBlockBorderColor.isDisplayed();
	}
	
	public boolean RandomSplitLPWRBorderColour() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(RandomSplitLPWRBorderColour));
        return RandomSplitLPWRBorderColour.isDisplayed();
	}
	public boolean UpdateToCRMBlockLPWRBorderColor() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(UpdateToCRMBlockLPWRBorderColor));
        return UpdateToCRMBlockLPWRBorderColor.isDisplayed();
	}
	public boolean DisplayUpdateToCRM_BlockBorderColor() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(UpdateToCRMBlockBorderColor));
        return UpdateToCRMBlockBorderColor.isDisplayed();
	}
//	public String getAssignmentBlock2BorderColour() {					
//
//		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(AssignmentBlock2));
//
//		String colour=AssignmentBlock2.getCssValue("stroke");
//		String clr = Color.fromString(colour).asHex();
//
//		
//		return clr;
//
//	}
	
	public boolean DisplayAssignmentBlock2BorderColour() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(AssignmentBlock2));
        return AssignmentBlock2.isDisplayed();
	}
	
	public boolean DisplayFlowChartAssignmentBlock2BorderColour() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(FlowChartAssignmentBlock2));
        return FlowChartAssignmentBlock2.isDisplayed();
	}
	
	public boolean DisplayAssignmentBlock3BorderColour() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(AssignmentBlock3));
        return AssignmentBlock3.isDisplayed();
	}
	
	
	public boolean DisplayFlowChartAssignmentBlock3BorderColour() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(FlowChartAssignmentBlock3));
        return FlowChartAssignmentBlock3.isDisplayed();
	}

	public boolean DisplayRandomSplitBorderColour() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(RandomSplitBorderColour));
        return RandomSplitBorderColour.isDisplayed();
	}
	public void ClickOndraftbox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(draftbox));
		draftbox.click();
	}
	//********************************************************************************************************************************************
                                    //************** Lead Router Sanity *****************
	@FindBy(xpath = "(//label[@class='mat-radio-label'])[2]//span[text()='Route based on selected feeder.']")
	WebElement LeadRouterFeederRadioButton2;
	@FindBy(xpath="(//span[@class='mat-radio-outer-circle'])[3]")
	WebElement ClickOnLRContinueProcessingCheckBox;
	@FindBy(xpath="(//span[@class='mat-radio-container'])[4]")
	WebElement ClickOnLRStopProcessingCheckBox;
	@FindBy(xpath="(//div[@aria-haspopup='listbox'])[3]")
	WebElement SelectThirdListBoxdropdownForUpdateDataValue;
	
	@FindBy(xpath="//span[text()='Escalate leads ']//..//span[@class='mat-checkbox-inner-container']")
	WebElement SelectEscalateLeadsCheckBox;
	@FindBy(xpath="//div[text()=' Evaluate After ']//..//mat-select[@formcontrolname='reassignDay']")
	WebElement ClickOnDaysDropDown;
	@FindBy(xpath="(//mat-option[@role='option'])[4]")
	WebElement ClickAnOption;
	@FindBy(xpath="//div[text()=' Evaluate After ']//..//mat-select[@formcontrolname='reassignHour']")
	WebElement ClickOnHoursDropDown;
	@FindBy(xpath="//div[text()=' Evaluate After ']//..//mat-select[@formcontrolname='reassignMinute']")
	WebElement ClickOnMinutesDropDown;
	@FindBy(xpath="//span[text()=' Exclude off hours, holidays and weekends from elapsed time calculation ']//..//span[@class='mat-checkbox-inner-container']")
	WebElement SelectExcludeOffHoursCalculationCheckBox;

	@FindBy(xpath = "//span[text()=' Create Task for the New Owner ']//..//span[@class='mat-checkbox-inner-container']")
	WebElement ClickCreateTaskForTheNewOwnerCheckBox;
	
	@FindBy(xpath = "//span[text()='If no one is available, hold the  till someone is available ']//..//span[@class='mat-checkbox-inner-container']")
	WebElement ClickIfNoOneIsAvailableHoldTheLeadCheckBox;
	
	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[2]")
	WebElement DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown1;
	
	@FindBy(xpath = "(//mat-icon[text()='check_box'])[2]")
	WebElement CheckBoxForDataValueUpdateWhenRoutedToDefaultLeadOwner;
	
	

	public void CheckBoxForDataValueUpdateWhenRoutedToDefaultLeadOwner() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(CheckBoxForDataValueUpdateWhenRoutedToDefaultLeadOwner));
		CheckBoxForDataValueUpdateWhenRoutedToDefaultLeadOwner.click();
	}
	public void DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown1));
		DataValueUpdateWhenRoutedToDefaultLeadOwnerDropDown1.click();
	}
	public void ClickIfNoOneIsAvailableHoldTheLeadCheckBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickIfNoOneIsAvailableHoldTheLeadCheckBox));
		ClickIfNoOneIsAvailableHoldTheLeadCheckBox.click();
	}
	public void LeadRouterFeederRadioButton2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(LeadRouterFeederRadioButton2));
		LeadRouterFeederRadioButton2.click();
	}
	public void ClickCreateTaskForTheNewOwnerCheckBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickCreateTaskForTheNewOwnerCheckBox));
		ClickCreateTaskForTheNewOwnerCheckBox.click();
	}
	public void SelectEscalateLeadsCheckBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectEscalateLeadsCheckBox));
		SelectEscalateLeadsCheckBox.click();
	}
	public void ClickOnDaysDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnDaysDropDown));
		ClickOnDaysDropDown.click();
	}
	public void ClickAnOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickAnOption));
		ClickAnOption.click();
	}
	public void ClickOnHoursDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnHoursDropDown));
		ClickOnHoursDropDown.click();
	}
	public void ClickOnMinutesDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnHoursDropDown));
		ClickOnMinutesDropDown.click();
	}
	public void SelectExcludeOffHoursCalculationCheckBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectExcludeOffHoursCalculationCheckBox));
		SelectExcludeOffHoursCalculationCheckBox.click();
	}
	
	
	
	
	
	
	public void SelectThirdListBoxdropdownForUpdateDataValue() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectThirdListBoxdropdownForUpdateDataValue));
		SelectThirdListBoxdropdownForUpdateDataValue.click();
	}
	

	public void ClickOnLRStopProcessingCheckBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnLRStopProcessingCheckBox));
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", ClickOnLRStopProcessingCheckBox);
	}
	
	
	
//******************************************************* Restart to Edit *********************************************	
	//******************************** Random String Genartator *****************************
	public int length = 10;

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
	//*************************************************************

	// Generate a random string
	String RandomStr = generateRandomStr(length);

	public static String generateRandomStr(int length) {
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		StringBuilder sb = new StringBuilder();

		Random random = new Random();
		for (int i = 0; i < length; i++) {
			int index = random.nextInt(characters.length());
			sb.append(characters.charAt(index));
		}

		return sb.toString();
	}
	//*************************************************************

	// Generate a random string
	String RandomStrForClone = generateRandomStrForClone(length);

	public static String generateRandomStrForClone(int length) {
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		StringBuilder sb = new StringBuilder();

		Random random = new Random();
		for (int i = 0; i < length; i++) {
			int index = random.nextInt(characters.length());
			sb.append(characters.charAt(index));
		}

		return sb.toString();
	}
		//**************** Lead Router feature ************
	 
	@FindBy(xpath = "//input[@id='menuname']")
	public WebElement InputRename_AutoTestObject;
	
	@FindBy(xpath="//div[@data-type='decision']")
	WebElement DNDdecisionBlock;
	@FindBy(xpath="//div[@data-jtk-source-port-type='source1']")
	WebElement DecisionBlockNo;
	@FindBy(xpath="//div[@data-jtk-source-port-type='source']")
	WebElement DecisionBlockYES;
	@FindBy(xpath="(//div[@data-jtk-source-port-type='source1'])[2]")
	WebElement DecisionBlock2NO;
	@FindBy(xpath="(//div[@data-jtk-source-port-type='source'])[2]")
	WebElement DecisionBlock2YES;
	
	
	
	@FindBy(xpath="//div[@data-type='action']")
	WebElement DNDActionBlock;
	@FindBy(xpath="(//span[text()='Action Blockfalse']//..)[1]//div[@class='drag-start arrow-connect connect ng-star-inserted']")
	WebElement ActionBlockArrow;
	
	@FindBy(xpath="//div[@data-type='FVUAction']")
	WebElement DNDUpdateDataValue;	
	@FindBy(xpath="(//span[text()='Update Data Value']//..)[1]//div[@class='drag-start arrow-connect connect ng-star-inserted']")
	WebElement UpdateDataValueArrow;
	
	@FindBy(xpath="//div[@data-type='SyncToSDFC']")
	WebElement DNDUpdateToCRM;
	@FindBy(xpath="(//span[text()='Update to CRM']//..)[1]//div[@class='drag-start arrow-connect connect ng-star-inserted']")
	WebElement UpdateToCRMArrow;
	
	@FindBy(xpath="//div[@data-type='assignment']")
	WebElement DNDAssignment;
	@FindBy(xpath="(//span[text()='Assignment Block']//..)[1]")
	WebElement AssignmentBlock;
	@FindBy(xpath="(//span[text()='Assignment Block']//..)[3]")
	WebElement AssignmentBlock2;
	@FindBy(xpath="(//span[text()='Assignment Block']//..)[5]")
	WebElement AssignmentBlock3;
	
	@FindBy(xpath="//div[@data-type='randomSplit']")
	WebElement DNDRandomSplit;
	@FindBy(xpath="(//span[text()='Random Split']//..)[1]//div[@data-jtk-source-port-type='source2']")
	WebElement RandomSplitA;
	@FindBy(xpath="(//span[text()='Random Split']//..)[1]//div[@data-jtk-source-port-type='source3']")
	WebElement RandomSplitB;
	@FindBy(xpath="(//span[text()='Random Split']//..)[1]//div[@data-jtk-source-port-type='source4']")
	WebElement RandomSplitC;
	
	@FindBy(xpath="(//i[contains(@class,'list-icon')])[1]")
	WebElement DecisionBlockList;
	
	@FindBy(xpath="(//a[text()=' open_in_new '])[1]")
	WebElement ClickOnOpenInNewTabLink;
	
	@FindBy(xpath="(//mat-icon[@fonticon='open_in_new'])[1]")
	WebElement ClickOnOpenInNewTabLinkForAssignmentBlock;
	
	
	@FindBy(xpath="//div[@class='jtk-miniview-collapse']")
	WebElement ClickOnPannerButton;
	
	@FindBy(xpath = "(//*[name()='path' and contains(@stroke,'#F9A52C')])[1]")
	WebElement DisplayedDecisionBlockBorderColor;
	@FindBy(xpath = "(//*[name()='path' and contains(@stroke,'#F9A52C')])[2]")
	WebElement DisplayedDecisionBlock2BorderColor;
	@FindBy(xpath = "(//*[name()='polygon' and contains(@stroke,'#9B5FE0')])[1]")
	WebElement DisplayedActionBlockBorderColor;
	@FindBy(xpath = "(//*[name()='polygon' and contains(@stroke,'#16A4D8')])[1]")
	WebElement DisplayedUpdateDataValueBlockBorderColor;
	@FindBy(xpath = "(//*[name()='polygon' and contains(@stroke,'#F2609E')])[1]")
	WebElement DisplayedUpdateToCRMBlockBorderColor;
	@FindBy(xpath = "(//*[name()='rect' and contains(@stroke,'#000BFF')])[1]")
	WebElement DisplayedRandomSplitBlockBorderColor;
	@FindBy(xpath = "(//*[name()='rect' and contains(@stroke,'#EFDF48')])[1]")
	WebElement DisplayedAssignmentBlockBorderColor;
	@FindBy(xpath = "(//*[name()='rect' and contains(@stroke,'#EFDF48')])[2]")
	WebElement DisplayedAssignmentBlock2BorderColor;
	@FindBy(xpath = "(//*[name()='rect' and contains(@stroke,'#EFDF48')])[3]")
	WebElement DisplayedAssignmentBlock3BorderColor;
	
	@FindBy(xpath = "(//span[text()=' Route to latest owner in the Custom Group ']//..)[1]//input[@aria-checked='true']")
	WebElement DisplayedRouteToLatestOwnerInTheCustomGroupCheckBoxIsChecked;
	
	@FindBy(xpath = "(//span[text()=' Auto Convert Leads into Contact and/or Accounts ']//..)[1]//input[@aria-checked='true']")
	WebElement DisplayedAutoConvertLeadsIntoContactAndorAccountsCheckBoxIsChecked;
	
	@FindBy(xpath = "//span[text()='Slack Notification ']//..//span[@class='mat-checkbox-inner-container']")
	WebElement ClickSlackNotificationCheckBox;
	@FindBy(xpath = "(//span[text()='Slack Notification ']//..)[1]//input[@aria-checked='true']")
	WebElement DisplayedSlackNotificationCheckBoxIsChecked;
	@FindBy(xpath = "//div[text()=' Select Slack Template ']//..//mat-select[@role='combobox']")
	WebElement ClickAutoSlackNotificationDropdown;
	
	@FindBy(xpath = "(//span[text()='Send Notification Email ']//..)[1]//input[@aria-checked='true']")
	WebElement DisplayedSendNotificationEmailCheckBoxIsChecked;
	
	@FindBy(xpath = "(//span[text()='Trigger Process/Flow Builder (to send email and more) ']//..)[1]//input[@aria-checked='true']")
	WebElement DisplayedTriggerProcessOrFlowBuilderCheckBoxIsChecked;
	
	@FindBy(xpath = "(//span[text()=' Create Task for the New Owner ']//..)[1]//input[@aria-checked='true']")
	WebElement DisplayedCreateTaskForTheNewOwnerCheckBoxIsChecked;
	@FindBy(xpath = "(//span[text()=' Create Task for the New Suggested owner ']//..)[1]//input[@aria-checked='true']")
	WebElement DisplayedCreateTaskForTheNewSuggestedOwnerCheckBoxIsChecked;
	
	@FindBy(xpath = "(//span[text()='Assign only to users if available on integrated calendar ']//..)[1]//input[@aria-checked='true']")
	WebElement DisplayedAssignOnlyToUsersIfAvailableOnIntegratedCalendarCheckBoxIsChecked;
	
	
	@FindBy(xpath="//span[text()=' Exclude off hours, holidays and weekends from elapsed time calculation ']//..//span[@class='mat-checkbox-inner-container']")
	WebElement SelectExcludeOffHoursCheckBox;
	@FindBy(xpath = "(//span[text()=' Exclude off hours, holidays and weekends from elapsed time calculation ']//..)[1]//input[@aria-checked='true']")
	WebElement DisplayedExcludeOffHoursCheckBoxIsChecked;
	
	@FindBy(xpath = "(//span[text()='Skip Calendar Availability Check ']//..)[1]//input[@aria-checked='true']")
	WebElement DisplayedSkipCalendarAvailabilityCheckBoxIsChecked;
	
	@FindBy(xpath = "//li[text()=' Detail ']")
	WebElement ClickOnDetailPage;
	
	@FindBy(xpath = "//div[@class='jtk-miniview-panner']")
	WebElement MoveBlockInConsole;
	
	@FindBy(xpath = "//input[@formcontrolname='UpdateValue']")
	WebElement DisplayedPreviuosSelectedOption;
	
	@FindBy(xpath = "//mat-icon[text()='refresh']")
	WebElement ClickOnRefreshButton;
	
	@FindBy(xpath = "//mat-icon[text()='content_copy']")
	WebElement ClickOnCopyButton;
	
	@FindBy(xpath = "(//div[text()='Copied'])[1]")
	WebElement DisplayedCopiedSuccessMessage;
	
	@FindBy(xpath = "(//div[contains(text(),'Can not delete')])[1]")
	WebElement DisplayedCannotDeleteErrorSuccessMessage;
	
	@FindBy(xpath="//button[@aria-label='toggle CRUD']")
	WebElement ClickOnCrudFolderDropdown;
	
	@FindBy(xpath="//option[text()=' CRUD ']")
	WebElement SelectFolderToAutotestObject;
	@FindBy(xpath="//option[text()=' Sub Router/CRUD ']")
	WebElement SelectFolderToAutotestObjectSubRouter;
	@FindBy(xpath = "//input[@id='menuname']")
	WebElement txtNameObject;
	
	@FindBy(xpath = "//select[@id='ddlcausetype']//option[2]")
	WebElement SelectMainFolder;
	
	@FindBy(xpath = "//button[text()='Activate ']")
	WebElement ClickOnActiveButton;
	@FindBy(xpath = "(//div[contains(text(),'Only one Lead router can be activated at a time')])[1]")
	WebElement DisplayedActivateErrorMessage;
	@FindBy(xpath = "(//div[text()='Activated Successfully'])[1]")
	WebElement DisplayedActivateSuccessMessage;
	
	@FindBy(xpath = "//button[text()='DeActivate ']")
	WebElement ClickOnDeActiveButton;
	@FindBy(xpath = "//span[text()=' Deactivate ']")
	WebElement ClickAgainDeActiveButton;
	@FindBy(xpath = "(//div[contains(text(),'Deactivated Successfully')])[1]")
	WebElement DisplayedDeActiveSuccessMessage;
	@FindBy(xpath = "//i[contains(@class,'LeadRouterStatus-1')]")
	WebElement DisplayedActiveRouterObject;
	
	@FindBy(xpath="//span[text()='Lead Processing without Routing ']")
	WebElement ClickOnLeadProcessingWithoutRoutingFeature;
	
	@FindBy(xpath="//span[text()='Sub Router ']")
	WebElement ClickOnSubRouterFeature;
	
	@FindBy(xpath="//span[text()='Lead Router ']")
	WebElement ClickOnLeadRouterFeature;
	
	@FindBy(xpath="//span[text()='Escalation Router ']")
	WebElement ClickOnEscalationRouterFeature;
	
	
	
	
	public void ClickOnEscalationRouterFeature() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnEscalationRouterFeature));
		ClickOnEscalationRouterFeature.click();
	}
	public void ClickOnLeadProcessingWithoutRoutingFeature() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnLeadProcessingWithoutRoutingFeature));
		ClickOnLeadProcessingWithoutRoutingFeature.click();
	}
	public void ClickOnSubRouterFeature() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnSubRouterFeature));
		ClickOnSubRouterFeature.click();
	}
	public void ClickOnLeadRouterFeature() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnLeadRouterFeature));
		ClickOnLeadRouterFeature.click();
	}
	
	public void ContextClickOnActivatedObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(DisplayedActiveRouterObject));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(DisplayedActiveRouterObject).click(DisplayedActiveRouterObject).contextClick(DisplayedActiveRouterObject).build()
				.perform();
	}		
	public void ClickOnActiveButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnActiveButton));
		ClickOnActiveButton.click();
	}
	public boolean DisplayedActivateErrorMessage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedActivateErrorMessage));
		return DisplayedActivateErrorMessage.isDisplayed();
	}
	public boolean DisplayedActivateSuccessMessage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedActivateSuccessMessage));
		return DisplayedActivateSuccessMessage.isDisplayed();
	}
	
	public void ClickOnDeActiveButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnDeActiveButton));
		ClickOnDeActiveButton.click();
	}
	public void ClickAgainDeActiveButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickAgainDeActiveButton));
		ClickAgainDeActiveButton.click();
	}
	public boolean DisplayedDeActiveSuccessMessage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedDeActiveSuccessMessage));
		return DisplayedDeActiveSuccessMessage.isDisplayed();
	}
	public boolean DisplayedActiveRouterObject() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedActiveRouterObject));
			return DisplayedActiveRouterObject.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	
	
	
	
	
	public void AssignmentBlock2_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DNDAssignment));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(DNDAssignment)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(DNDAssignment)
        .pause(Duration.ofSeconds(1))
        .moveByOffset(-160,75) //change the x, y values to be applicable for your cases
        .moveByOffset(-160,75)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	
	public void SelectMainFolder() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectMainFolder));
		SelectMainFolder.click();
	}
	public void NameInObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(txtNameObject));
		txtNameObject.sendKeys("CRUD");
	}
	
	public void SelectFolderToAutotestObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectFolderToAutotestObject));
		SelectFolderToAutotestObject.click();
	}
	public void SelectFolderToAutotestObjectSubRouter() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectFolderToAutotestObjectSubRouter));
		SelectFolderToAutotestObjectSubRouter.click();
	}
	public void ClickOnCrudFolderDropdown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnCrudFolderDropdown));
		ClickOnCrudFolderDropdown.click();
	}
	
	public void DoubleClickOnAssignmentBlock3() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(AssignmentBlock3));
		Actions actions = new Actions(ldriver);
		actions.doubleClick(AssignmentBlock3).build().perform();	
	}
	public void DoubleClickOnAssignmentBlock2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(AssignmentBlock2));
		Actions actions = new Actions(ldriver);
		actions.doubleClick(AssignmentBlock2).build().perform();	
	}
	
	public void ConnectDecisionBlock2_To_assignmentBlock3() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DecisionBlock2YES));
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(AssignmentBlock3));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(DecisionBlock2YES)
        .pause(Duration.ofSeconds(0))
        .clickAndHold(DecisionBlock2YES)
        .pause(Duration.ofSeconds(0))
        .moveToElement(AssignmentBlock3)
        .pause(Duration.ofSeconds(0))
        .release().build().perform();
	}
	
	
	
	
	public void AssignmentBlock3_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DNDAssignment));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(DNDAssignment)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(DNDAssignment)
        .pause(Duration.ofSeconds(1))
        .moveByOffset(-160,-5) //change the x, y values to be applicable for your cases
        .moveByOffset(-160,-5)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	
	public void ConnectDecisionBlock2_To_assignmentBlock2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DecisionBlock2NO));
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(AssignmentBlock2));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(DecisionBlock2NO)
        .pause(Duration.ofSeconds(0))
        .clickAndHold(DecisionBlock2NO)
        .pause(Duration.ofSeconds(0))
        .moveToElement(AssignmentBlock2)
        .pause(Duration.ofSeconds(0))
        .release().build().perform();
	}
	public void DoubleClickOnDecisionBlock2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DecisionBlock2YES));
		Actions actions = new Actions(ldriver);
		actions.doubleClick(DecisionBlock2YES).build().perform();	
	}
	
	
	public void ConnectDecisionBlock1_To_DecisionBlock2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DecisionBlockNo));
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DecisionBlock2NO));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(DecisionBlockNo)
        .pause(Duration.ofSeconds(0))
        .clickAndHold(DecisionBlockNo)
        .pause(Duration.ofSeconds(0))
        .moveToElement(DecisionBlock2NO)
        .pause(Duration.ofSeconds(0))
        .release().build().perform();
	}
	
	public void ConnectDecisionBlock_To_assignmentBlock1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DecisionBlockYES));
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(AssignmentBlock));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(DecisionBlockYES)
        .pause(Duration.ofSeconds(0))
        .clickAndHold(DecisionBlockYES)
        .pause(Duration.ofSeconds(0))
        .moveToElement(AssignmentBlock)
        .pause(Duration.ofSeconds(0))
        .release().build().perform();
	}
	public void AssignmentBlock1_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DNDAssignment));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(DNDAssignment)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(DNDAssignment)
        .pause(Duration.ofSeconds(1))
        .moveByOffset(-300,170) //change the x, y values to be applicable for your cases
        .moveByOffset(-300,170)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	
	public void DND_decisionBlock2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DNDdecisionBlock));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(DNDdecisionBlock)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(DNDdecisionBlock)
        .pause(Duration.ofSeconds(1))
        .moveByOffset(-350,25) //change the x, y values to be applicable for your cases
        .moveByOffset(-350,25)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	
	public boolean DisplayedCopiedSuccessMessage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedCopiedSuccessMessage));
		return DisplayedCopiedSuccessMessage.isDisplayed();
	}
	
	public void ClickOnCopyButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnCopyButton));
		ClickOnCopyButton.click();
	}
	public void ClickOnRefreshButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnRefreshButton));
		ClickOnRefreshButton.click();
	}
	public boolean DisplayedPreviuosSelectedOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedPreviuosSelectedOption));
		return DisplayedPreviuosSelectedOption.isDisplayed();
	}
	
	public void ClickOnDetailPage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnDetailPage));
		ClickOnDetailPage.click();
	}
	
	public boolean DisplayedSkipCalendarAvailabilityCheckBoxIsChecked() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedSkipCalendarAvailabilityCheckBoxIsChecked));
		return DisplayedSkipCalendarAvailabilityCheckBoxIsChecked.isDisplayed();
       }
	
	public boolean DisplayedExcludeOffHoursCheckBoxIsChecked() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedExcludeOffHoursCheckBoxIsChecked));
		return DisplayedExcludeOffHoursCheckBoxIsChecked.isDisplayed();
       }
	
	public void SelectExcludeOffHoursCheckBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectExcludeOffHoursCheckBox));
		SelectExcludeOffHoursCheckBox.click();
	}

	public boolean DisplayedCreateTaskForTheNewOwnerCheckBoxIsChecked() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedCreateTaskForTheNewOwnerCheckBoxIsChecked));
		return DisplayedCreateTaskForTheNewOwnerCheckBoxIsChecked.isDisplayed();
       }
	public boolean DisplayedCreateTaskForTheNewSuggestedOwnerCheckBoxIsChecked() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedCreateTaskForTheNewSuggestedOwnerCheckBoxIsChecked));
		return DisplayedCreateTaskForTheNewSuggestedOwnerCheckBoxIsChecked.isDisplayed();
       }
	public boolean DisplayedAssignOnlyToUsersIfAvailableOnIntegratedCalendarCheckBoxIsChecked() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedAssignOnlyToUsersIfAvailableOnIntegratedCalendarCheckBoxIsChecked));
		return DisplayedAssignOnlyToUsersIfAvailableOnIntegratedCalendarCheckBoxIsChecked.isDisplayed();
       }
	public boolean DisplayedTriggerProcessOrFlowBuilderCheckBoxIsChecked() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedTriggerProcessOrFlowBuilderCheckBoxIsChecked));
		return DisplayedTriggerProcessOrFlowBuilderCheckBoxIsChecked.isDisplayed();
       }
	public boolean DisplayedSendNotificationEmailCheckBoxIsChecked() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedSendNotificationEmailCheckBoxIsChecked));
		return DisplayedSendNotificationEmailCheckBoxIsChecked.isDisplayed();
       }
	public void ClickAutoSlackNotificationDropdown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickAutoSlackNotificationDropdown));
		ClickAutoSlackNotificationDropdown.click();
	}
	public boolean DisplayedSlackNotificationCheckBoxIsChecked() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedSlackNotificationCheckBoxIsChecked));
		return DisplayedSlackNotificationCheckBoxIsChecked.isDisplayed();
       }
	public void ClickSlackNotificationCheckBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickSlackNotificationCheckBox));
		ClickSlackNotificationCheckBox.click();
	}
	
	public boolean DisplayedAutoConvertLeadsIntoContactAndorAccountsCheckBoxIsChecked() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedAutoConvertLeadsIntoContactAndorAccountsCheckBoxIsChecked));
		return DisplayedAutoConvertLeadsIntoContactAndorAccountsCheckBoxIsChecked.isDisplayed();
       }
	
	public boolean DisplayedRouteToLatestOwnerInTheCustomGroupCheckBoxIsChecked() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedRouteToLatestOwnerInTheCustomGroupCheckBoxIsChecked));
			return DisplayedRouteToLatestOwnerInTheCustomGroupCheckBoxIsChecked.isDisplayed();
	}
	
	
	public void ClickOnLRContinueProcessingCheckBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnLRContinueProcessingCheckBox));
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", ClickOnLRContinueProcessingCheckBox);
	}
	
	public void DoubleClickOnUpdateDataValueBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(UpdateDataValueArrow));
		Actions actions = new Actions(ldriver);
		actions.doubleClick(UpdateDataValueArrow).build().perform();
		actions.doubleClick(UpdateDataValueArrow).build().perform();	
	}
	
	
	
	public boolean VerifiedAssignmentBlockBorderColor() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedAssignmentBlockBorderColor));
			return DisplayedAssignmentBlockBorderColor.isDisplayed();
		} catch (Exception e) {
		return false;
		}
	}
	public boolean VerifiedAssignmentBlock2BorderColor() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedAssignmentBlock2BorderColor));
			return DisplayedAssignmentBlock2BorderColor.isDisplayed();
		} catch (Exception e) {
		return false;
		}
	}
	public boolean VerifiedAssignmentBlock3BorderColor() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedAssignmentBlock3BorderColor));
			return DisplayedAssignmentBlock3BorderColor.isDisplayed();
		} catch (Exception e) {
		return false;
		}
	}
	public boolean VerifiedRandomSplitBlockBorderColor() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedRandomSplitBlockBorderColor));
			return DisplayedRandomSplitBlockBorderColor.isDisplayed();
		} catch (Exception e) {
		return false;
		}
	}
	public boolean VerifiedUpdateToCRMBlockBorderColor() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedUpdateToCRMBlockBorderColor));
			return DisplayedUpdateToCRMBlockBorderColor.isDisplayed();
		} catch (Exception e) {
		return false;
		}
	}
	public boolean VerifiedUpdateDataValueBlockBorderColor() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedUpdateDataValueBlockBorderColor));
			return DisplayedUpdateDataValueBlockBorderColor.isDisplayed();
		} catch (Exception e) {
		return false;
		}
	}
	public boolean VerifiedActionBlockBorderColor() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedActionBlockBorderColor));
			return DisplayedActionBlockBorderColor.isDisplayed();
		} catch (Exception e) {
		return false;
		}
	}
	public boolean VerifiedDecisionBlockBorderColor() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedDecisionBlockBorderColor));
			return DisplayedDecisionBlockBorderColor.isDisplayed();
		} catch (Exception e) {
		return false;
		}
	}
	public boolean VerifiedDecisionBlock2BorderColor() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedDecisionBlock2BorderColor));
			return DisplayedDecisionBlock2BorderColor.isDisplayed();
		} catch (Exception e) {
		return false;
		}
	}
	public void ClickOnPannerButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnPannerButton));
		ClickOnPannerButton.click();
	}
	
	public void ClickOnOpenInNewTabLink() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnOpenInNewTabLink));
		ClickOnOpenInNewTabLink.click();
	}
	public void ClickOnOpenInNewTabLinkForAssignmentBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnOpenInNewTabLinkForAssignmentBlock));
		ClickOnOpenInNewTabLinkForAssignmentBlock.click();
	}
	public void SelectDecisionBlockListElem() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DecisionBlockList));
		DecisionBlockList.click();
	}
	
	public void GiveAnInputForRenameAutoTestObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(InputRename_AutoTestObject));
		InputRename_AutoTestObject.clear();
		InputRename_AutoTestObject.sendKeys(randomString);
	}
	public void EnterRandomName() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(InputRename_AutoTestObject));
		InputRename_AutoTestObject.clear();
		InputRename_AutoTestObject.sendKeys(RandomStr);
	}
	public void EnterRandomNameForClone() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(InputRename_AutoTestObject));
		InputRename_AutoTestObject.clear();
		InputRename_AutoTestObject.sendKeys(RandomStrForClone);
	}
	public void DND_decisionBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DNDdecisionBlock));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(DNDdecisionBlock)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(DNDdecisionBlock)
        .pause(Duration.ofSeconds(1))
        .moveByOffset(-480,95) 
        .moveByOffset(-480,95)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	public void ConnectStartBlock_To_DecisionBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(StartArrow));
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DecisionBlockNo));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(StartArrow)
        .pause(Duration.ofSeconds(0))
        .clickAndHold(StartArrow)
        .pause(Duration.ofSeconds(0))
        .moveToElement(DecisionBlockNo)
        .pause(Duration.ofSeconds(0))
        .release().build().perform();
	}
	
	public void DND_ActionBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DNDActionBlock));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(DNDActionBlock)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(DNDActionBlock)
        .pause(Duration.ofSeconds(1))
        .moveByOffset(-350,115) 
        .moveByOffset(-350,115)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	public void ConnectDecisionBlock_To_ActionBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DecisionBlockNo));
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ActionBlockArrow));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(DecisionBlockNo)
        .pause(Duration.ofSeconds(0))
        .clickAndHold(DecisionBlockNo)
        .pause(Duration.ofSeconds(0))
        .moveToElement(ActionBlockArrow)
        .pause(Duration.ofSeconds(0))
        .release().build().perform();
	}
	public void DND_UpdateDataValue() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DNDUpdateDataValue));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(DNDUpdateDataValue)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(DNDUpdateDataValue)
        .pause(Duration.ofSeconds(1))
        .moveByOffset(-85,80) 
        .moveByOffset(-85,80)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	public void ConnectActionBlock_To_UpdateDataValueBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ActionBlockArrow));
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(UpdateDataValueArrow));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(ActionBlockArrow)
        .pause(Duration.ofSeconds(0))
        .clickAndHold(ActionBlockArrow)
        .pause(Duration.ofSeconds(0))
        .moveToElement(UpdateDataValueArrow)
        .pause(Duration.ofSeconds(0))
        .release().build().perform();
	}
	
	public void DND_UpdateToCRM() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DNDUpdateToCRM));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(DNDUpdateToCRM)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(DNDUpdateToCRM)
        .pause(Duration.ofSeconds(1))
        .moveByOffset(-85,-120) 
        .moveByOffset(-85,-120)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	public void ConnectUpdateDataValueBlock_To_UpdateToCRMBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(UpdateDataValueArrow));
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(UpdateToCRMArrow));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(UpdateDataValueArrow)
        .pause(Duration.ofSeconds(0))
        .clickAndHold(UpdateDataValueArrow)
        .pause(Duration.ofSeconds(0))
        .moveToElement(UpdateToCRMArrow)
        .pause(Duration.ofSeconds(0))
        .release().build().perform();
	}
	
	public void DND_Assignment() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DNDAssignment));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(DNDAssignment)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(DNDAssignment)
        .pause(Duration.ofSeconds(1))
        .moveByOffset(-350,5) 
        .moveByOffset(-350,5)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	public void DND_RandomSplit() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DNDRandomSplit));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(DNDRandomSplit)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(DNDRandomSplit)
        .pause(Duration.ofSeconds(1))
        .moveByOffset(-200,-50) 
        .moveByOffset(-200,-50)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	public void ConnectionUpdateToCRM_To_RandomSplit() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(UpdateToCRMArrow));
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(RandomSplitA));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(UpdateToCRMArrow)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(UpdateToCRMArrow)
        .pause(Duration.ofSeconds(1))
        .moveToElement(RandomSplitA)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	public void ConnectionRandomSlitA_To_AssignmentBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(RandomSplitA));
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(AssignmentBlock));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(RandomSplitA)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(RandomSplitA)
        .pause(Duration.ofSeconds(1))
        .moveToElement(AssignmentBlock)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	public void ConnectionRandomSlitB_To_ActionBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(RandomSplitB));
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ActionBlockArrow));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(RandomSplitB)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(RandomSplitB)
        .pause(Duration.ofSeconds(1))
        .moveToElement(ActionBlockArrow)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	public void ConnectionRandomSlitC_To_UpdateDataValue() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(RandomSplitC));
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(UpdateDataValueArrow));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(RandomSplitC)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(RandomSplitC)
        .pause(Duration.ofSeconds(1))
        .moveToElement(UpdateDataValueArrow)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	
	public void ConnectionDecisionBlockYES_To_AssignmentBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DecisionBlockYES));
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(AssignmentBlock));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(DecisionBlockYES)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(DecisionBlockYES)
        .pause(Duration.ofSeconds(1))
        .moveToElement(AssignmentBlock)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	public void DoubleClickOnDecisionBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DecisionBlockNo));
		Actions actions = new Actions(ldriver);
		actions.doubleClick(DecisionBlockNo).build().perform();
		actions.doubleClick(DecisionBlockNo).build().perform();
		
	}
	
	public void DoubleClickOnAssignmentBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(AssignmentBlock));
		Actions actions = new Actions(ldriver);
		actions.doubleClick(AssignmentBlock).build().perform();		
	}
	
	public void DoubleClickOnUpdateToCRM_Block() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(UpdateToCRMArrow));
		Actions actions = new Actions(ldriver);
		actions.doubleClick(UpdateToCRMArrow).build().perform();
		actions.doubleClick(UpdateToCRMArrow).build().perform();
		
	}
	public void DoubleClickOnRandomSplit() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(RandomSplitA));
		Actions actions = new Actions(ldriver);
		actions.doubleClick(RandomSplitA).build().perform();
		actions.doubleClick(RandomSplitA).build().perform();
		
	}
	
	public void MoveBlockInConsole() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(MoveBlockInConsole));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(MoveBlockInConsole)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(MoveBlockInConsole)
        .pause(Duration.ofSeconds(1))
        .moveByOffset(25,20) 
        .moveByOffset(25,20)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(MoveBlockInConsole)
        .pause(Duration.ofSeconds(1))
        .moveByOffset(-25,-20) 
        .moveByOffset(-25,-20)
        .release().build().perform();
	}
	
	
	public boolean DisplayedCannotDeleteErrorSuccessMessage() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(DisplayedCannotDeleteErrorSuccessMessage));
			return DisplayedCannotDeleteErrorSuccessMessage.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	
	//**************** Sub Router feature ************
	
	@FindBy(xpath="(//span[@class='mat-radio-outer-circle'])[1]")
	WebElement ClickOnLRContinueProcessingCheckBoxForSubRouter;
	@FindBy(xpath="(//span[@class='mat-radio-container'])[2]")
	WebElement ClickOnLRStopProcessingCheckBoxForSubRouter;
	

	
	
	public void ClickOnLRContinueProcessingCheckBoxForSubRouter() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnLRContinueProcessingCheckBoxForSubRouter));
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", ClickOnLRContinueProcessingCheckBoxForSubRouter);
	}
	public void ClickOnLRStopProcessingCheckBoxForSubRouter() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnLRStopProcessingCheckBoxForSubRouter));
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", ClickOnLRStopProcessingCheckBoxForSubRouter);
	}
	

	//**************** Escalation Router feature ************
	
	@FindBy(xpath="(//ng-select[@bindlabel='SubMenuName'])[2]//span[@class='ng-arrow-wrapper']")
	WebElement SelectListBoxActionBlockForEscalationRouter;
	@FindBy(xpath = "(//span[text()=' Capping Condition ']//..)[1]//input[@aria-checked='true']")
	WebElement DisplayedCappingConditionCheckBoxIsChecked;
	@FindBy(xpath="(//a[text()=' open_in_new '])[1]")
	WebElement ClickOnOpenInNewTabLinkForDetailsPage;
	
	@FindBy(xpath="(//span[contains(text(),'AutoTestObject_Rename_Copy')])[1]")
	WebElement DisplayedAutoTestObjectRenameCopy;
	
	
	
	
	
	public void ContextClickOnAutoTestObjectRenameCopyObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(DisplayedAutoTestObjectRenameCopy));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(DisplayedAutoTestObjectRenameCopy).contextClick(DisplayedAutoTestObjectRenameCopy).build()
		.perform();
	}	
	public boolean DisplayedAutoTestObjectRenameCopy() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedAutoTestObjectRenameCopy));
			return DisplayedAutoTestObjectRenameCopy.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	
	public void ClickOnOpenInNewTabLinkForDetailsPage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnOpenInNewTabLinkForDetailsPage));
		ClickOnOpenInNewTabLinkForDetailsPage.click();
	}
	public void SelectListBoxActionBlockForEscalationRouter() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectListBoxActionBlockForEscalationRouter));
		SelectListBoxActionBlockForEscalationRouter.click();
	}
	
	public boolean DisplayedCappingConditionCheckBoxIsChecked() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedCappingConditionCheckBoxIsChecked));
		return DisplayedCappingConditionCheckBoxIsChecked.isDisplayed();
    }
	
	
	//**************** OTS Router feature ************
	
	@FindBy(xpath="(//span[text()='Reassignment Notification ']//..)[1]")
	WebElement ClickOnCheckboxForReassignmentNotificationInOTSRouter;
	
	@FindBy(xpath = "(//span[text()='Reassignment Notification ']//..)[1]//input[@aria-checked='true']")
	WebElement DisplayedReassignmentNotificationCheckBoxIsChecked;
	
	@FindBy(xpath = "//div[contains(text(),'To change the notification message')]//a[text()='click here.']")
	WebElement ClickedNotificationLink;
	
	@FindBy(xpath = "//span[text()='OTS Notifications ']")
	WebElement DisplayedOTSnotificationsFeature;
	
	@FindBy(xpath="//div[@data-type='otsassignment']")
	WebElement DND_OTSAssignment;
	
	@FindBy(xpath="(//span[text()='OTS Assignment']//..)[1]")
	WebElement OTSAssignmentBlock;
	
	@FindBy(xpath = "(//label[@class='mat-checkbox-layout']//span[contains(text(),'Create Task for the New Owner ')]//..)[1]")
	WebElement ClickOnCreateTaskForTheNewOwnerCheckBox;
	
	@FindBy(xpath = "//app-search-dropdwon[@formcontrolname='CreateTaskObjectId']")
	WebElement SelectCreateTaskForTheNewOwnerDropDownAssignmentSetup;
	
	@FindBy(xpath = "//ng-select[@formcontrolname='CreateTaskObjectId']")
	WebElement SelectCreateTaskForTheNewOwnerDropDownReAssignmentSetup;
	
	@FindBy(xpath = "//ng-select[@placeholder='Select Sales Team']")
	WebElement ClickOnSetupSelectSalesTeamDropDown; 
	
	
	@FindBy(xpath = "(//*[name()='rect' and contains(@stroke,'#00BFA0')])[1]")
	WebElement VerifiedOTSAssignmentBlockBorderColor;
	
	@FindBy(xpath = "(//span[text()=' Approve '])[2]")
	WebElement ClickApproveButtonAgainAfterEdit;
	
	//**************
			@FindBy(xpath = "//li[contains(text(),'To configure the notification templates, please')]//a[text()='click here.']")
			WebElement ClickedNotificationTemplateLink;
			
			@FindBy(xpath = "//button[@aria-label='toggle Notifications']")
			WebElement DisplayedNotificationToggle;
			
			
			@FindBy(xpath = "//ng-select[@placeholder='Select Email Template']")
			WebElement ClickOnEmailNotificationDropdown;
			@FindBy(xpath = "//ng-select[@placeholder='Select Slack Template']")
			WebElement ClickOnSlackNotificationDropdown;
			@FindBy(xpath = "//ng-select[@placeholder='Select Text Template']")
			WebElement ClickOnTextNotificationDropdown;
			
			@FindBy(xpath="//span[text()='OTS Router ']")
			WebElement ClickOnOTSRouterFeature;
			
			
			
			public void ClickOnOTSRouterFeature() {
				new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnOTSRouterFeature));
				ClickOnOTSRouterFeature.click();
			}
			public void ClickOnEmailNotificationDropdown() {
				new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnEmailNotificationDropdown));
				ClickOnEmailNotificationDropdown.click();
			}
			public void ClickOnSlackNotificationDropdown() {
				new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSlackNotificationDropdown));
				ClickOnSlackNotificationDropdown.click();
			}
			public void ClickOnTextNotificationDropdown() {
				new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnTextNotificationDropdown));
				ClickOnTextNotificationDropdown.click();
			}
			
			
			
			public void ClickedNotificationTemplateLink() {
				new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickedNotificationTemplateLink));
				ClickedNotificationTemplateLink.click();
			}
			
			public boolean DisplayedNotificationToggle() {
				new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedNotificationToggle));
				return DisplayedNotificationToggle.isDisplayed();
		       }
			//*******************
	public void ClickApproveButtonAgainAfterEdit() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickApproveButtonAgainAfterEdit));
		ClickApproveButtonAgainAfterEdit.click();
	}
	public boolean VerifiedOTSAssignmentBlockBorderColor() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerifiedOTSAssignmentBlockBorderColor));
			return VerifiedOTSAssignmentBlockBorderColor.isDisplayed();
		} catch (Exception e) {
		return false;
		}
	}
	public void ClickOnSetupSelectSalesTeamDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnSetupSelectSalesTeamDropDown));
		ClickOnSetupSelectSalesTeamDropDown.click();
	}
	
	public void SelectCreateTaskForTheNewOwnerDropDownReAssignmentSetup() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(SelectCreateTaskForTheNewOwnerDropDownReAssignmentSetup));
		SelectCreateTaskForTheNewOwnerDropDownReAssignmentSetup.click();
	}
	public void SelectCreateTaskForTheNewOwnerDropDownAssignmentSetup() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(SelectCreateTaskForTheNewOwnerDropDownAssignmentSetup));
		SelectCreateTaskForTheNewOwnerDropDownAssignmentSetup.click();
	}
	
	public void ClickOnCreateTaskForTheNewOwnerCheckBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnCreateTaskForTheNewOwnerCheckBox));
		ClickOnCreateTaskForTheNewOwnerCheckBox.click();
	}
	
	
	
	
	
	
	public void DoubleClickOnOTSAssignmentBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(OTSAssignmentBlock));
		Actions actions = new Actions(ldriver);
		actions.doubleClick(OTSAssignmentBlock).build().perform();		
	}
	
	public void DND_OTSAssignment() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DND_OTSAssignment));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(DND_OTSAssignment)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(DND_OTSAssignment)
        .pause(Duration.ofSeconds(1))
        .moveByOffset(-350,5) 
        .moveByOffset(-350,5)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	public boolean DisplayedOTSnotificationsFeature() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedOTSnotificationsFeature));
		return DisplayedOTSnotificationsFeature.isDisplayed();
       }
	
	public void ClickedNotificationLink() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickedNotificationLink));
		ClickedNotificationLink.click();
	}
	
	public boolean DisplayedReassignmentNotificationCheckBoxIsChecked() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedReassignmentNotificationCheckBoxIsChecked));
		return DisplayedReassignmentNotificationCheckBoxIsChecked.isDisplayed();
       }
	public void ClickOnCheckboxForReassignmentNotificationInOTSRouter() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnCheckboxForReassignmentNotificationInOTSRouter));
		ClickOnCheckboxForReassignmentNotificationInOTSRouter.click();
	}
	
	
	public void ConnectActionBlock_To_RandomSplitBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ActionBlockArrow));
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(RandomSplitA));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(ActionBlockArrow)
        .pause(Duration.ofSeconds(0))
        .clickAndHold(ActionBlockArrow)
        .pause(Duration.ofSeconds(0))
        .moveToElement(RandomSplitA)
        .pause(Duration.ofSeconds(0))
        .release().build().perform();
	}
	
	public void ConnectionRandomSlitA_To_OTSAssignmentBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(RandomSplitA));
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(OTSAssignmentBlock));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(RandomSplitA)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(RandomSplitA)
        .pause(Duration.ofSeconds(1))
        .moveToElement(OTSAssignmentBlock)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}

	public void ConnectionDecisionBlockYES_To_OTSAssignmentBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DecisionBlockYES));
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(OTSAssignmentBlock));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(DecisionBlockYES)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(DecisionBlockYES)
        .pause(Duration.ofSeconds(1))
        .moveToElement(OTSAssignmentBlock)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	
	//**************** Lead Processing Without Routing feature ************
	
	@FindBy(xpath = "(//div[text()='Success'])[1]")
	WebElement DisplayedSuccessMessage;
	
	
	public boolean DisplayedSuccessMessage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedSuccessMessage));
		return DisplayedSuccessMessage.isDisplayed();
	}
	
	//**************** AE to SDR Mapping feature ************
	@FindBy(xpath = "//div[text()='Used By']//..//mat-icon[text()='warning']")
	WebElement DisplayedNoRecordFound;
	
	@FindBy(xpath = "//span[text()='expand_more']")
	WebElement ClikOnLeftTreeMenuDropDown;
	
	@FindBy(xpath = "//button[@aria-label='toggle Notifications']")
	WebElement NotificationsDropDown;
	
	@FindBy(xpath = "//button[@aria-label='toggle Slack']")
	WebElement SlackDropDown;
	
	@FindBy(xpath = "//span[text()='Lead:AutoTestObject ']")
	WebElement RightClickOnAutoTestObjectSlack;
	
	@FindBy(xpath = "//button[text()='New Slack ']")
	WebElement NewSlack;

	@FindBy(xpath = "(//label[contains(@for,'mat-checkbox')])[3]")
	WebElement CheckBoxFor_Recipient_TO_LeadOwnerMappedSDR;
	
	@FindBy(xpath = "(//mat-select[@panelclass='matsearchdropdown'])[1]")
	WebElement ClickSelectDropDownFor_Recipient_TO_LeadOwnerMappedSDRforSlack;

	@FindBy(xpath = "//span[text()='AutoTestObject']")
	WebElement SelectAutoTestObjectFor_Recipient_TO_LeadOwnerMappedSDRforSlack;
	
	@FindBy(xpath = "//div[text()='Saved successfully']")
	WebElement SavingVerificationMessageForSlack ;
	
	@FindBy(xpath = "((//div[text()='Used By']//..)[1]//mat-icon[text()=' chevron_right '])[1]")
    WebElement ClickOnUsedByDropDown;
	
	@FindBy(xpath = "((//div[text()='Used By']//..)[1]//span[@class='custom-option-content'][text()])[1]")
	public WebElement GetTextFromUsedByRouterName;
	@FindBy(xpath = "(//div[text()='Used By']//..)[1]//mat-tree-node[text()]")
	public WebElement GetTextFromUsedByRouterModuleName;
	
	@FindBy(xpath="(//a[text()=' open_in_new '])[1]")
	WebElement ClickOnOpenNewTabLinkInUsedBySection;
	
	@FindBy(xpath="//li[text()=' Approved ']")
	WebElement ClickOnApprovedButton;

	@FindBy(xpath="//span[text()='Delete ']")
	WebElement ClickOnDeleteButton;
	
	@FindBy(xpath = "//span[text()=' DELETE ']")
	WebElement ClickOnDelete;
	
	@FindBy(xpath = "(//div[contains(@class,'simple-notification ng-trigger ng-trigger-enterLeave error has-icon')])[1]//..//div[contains(@class,'sn-content ng')]")
	public WebElement GetTextFromErrorMessage;
	
	@FindBy(xpath = "//button[text()=' Administration']")
	WebElement ClikOnAdministration;
	@FindBy(xpath = "//button[text()=' Lead Management']")
	WebElement ClikOnLeadManagement;
	
	@FindBy(xpath = "((//mat-icon[text()=' expand_more '])[1]//..//..//..//span[@class='mat-button-wrapper'])[2][text()]")
	public WebElement GetTextOfRoutername;
	@FindBy(xpath = "//span[@class='featureTitle']")
	public WebElement GetTextOfLeftMenuTitle;
	@FindBy(xpath = "((//div[text()='Used By']//..)[1]//span[@class='custom-option-content'])[1]")
	WebElement ClickUsedByRouterName;
	
	@FindBy(xpath="//i[text()='description']//..//span[@class='detailstyle']")
	public WebElement GetTextFromDetails;
	
	@FindBy(xpath = "//div[@class='editor']")
	WebElement EnterEmailBody ;
	
    //***Sanity AEtoSDR
	
	
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
	
	
	
	public void EnterEmailBody() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(EnterEmailBody));
		EnterEmailBody.clear();
		EnterEmailBody.sendKeys("Hello lead, This is your");

	}
	public boolean DisplayedColumnHeaderCheckIsDisabled() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedColumnHeaderCheckIsDisabled));
			return DisplayedColumnHeaderCheckIsDisabled.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	public void RightClickOnAutoTestObjectSlack() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25))
		.until(ExpectedConditions.elementToBeClickable(RightClickOnAutoTestObjectSlack));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(RightClickOnAutoTestObjectSlack).contextClick(RightClickOnAutoTestObjectSlack).build().perform();
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
	
	
	
	
	
	
	//*********
	
	public void ClickUsedByRouterName() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickUsedByRouterName));
		ClickUsedByRouterName.click();
	}
	public void ClikOnLeadManagement(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClikOnLeadManagement));
		ClikOnLeadManagement.click();
	}
	public void ClikOnAdministration(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClikOnAdministration));
		ClikOnAdministration.click();
	}
	public void ClickOnDelete(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDelete));
		ClickOnDelete.click();
	}
	public void ClickOnDeleteButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnDeleteButton));
		ClickOnDeleteButton.click();
	}
	
	public void ClickOnApprovedButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnApprovedButton));
		ClickOnApprovedButton.click();
	}
	public void ClickOnOpenNewTabLinkInUsedBySection() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(ClickOnOpenNewTabLinkInUsedBySection));
		ClickOnOpenNewTabLinkInUsedBySection.click();
	}
	public void ClickOnUsedByDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnUsedByDropDown));
		ClickOnUsedByDropDown.click();
	}
	
	public boolean SavingVerificationMessageForSlack() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(SavingVerificationMessageForSlack));
        return SavingVerificationMessageForSlack.isDisplayed();
	}

	public void SelectAutoTestObjectFor_Recipient_TO_LeadOwnerMappedSDRforSlack() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectAutoTestObjectFor_Recipient_TO_LeadOwnerMappedSDRforSlack));
		SelectAutoTestObjectFor_Recipient_TO_LeadOwnerMappedSDRforSlack.click();
	}
	public void ClickSelectDropDownFor_Recipient_TO_LeadOwnerMappedSDRforSlack() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickSelectDropDownFor_Recipient_TO_LeadOwnerMappedSDRforSlack));
		ClickSelectDropDownFor_Recipient_TO_LeadOwnerMappedSDRforSlack.click();
	}
	public void ClickOnCheckBoxFor_Recipient_TO_LeadOwnerMappedSDR() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CheckBoxFor_Recipient_TO_LeadOwnerMappedSDR));
		CheckBoxFor_Recipient_TO_LeadOwnerMappedSDR.click();
	}
	

	public void ClickOnNewSlack(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(NewSlack));
		NewSlack.click();
	}
	
	public void RightClickonSlack() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25))
		.until(ExpectedConditions.elementToBeClickable(SlackDropDown));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(SlackDropDown).click(SlackDropDown).contextClick(SlackDropDown).build().perform();
	}
	public void ClickNotificationsDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(NotificationsDropDown));
		NotificationsDropDown.click();
	}
	public void ClikOnLeftTreeMenuDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClikOnLeftTreeMenuDropDown));
		ClikOnLeftTreeMenuDropDown.click();
	}
	
	public boolean DisplayedNoRecordFound(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedNoRecordFound));
		return DisplayedNoRecordFound.isDisplayed();
	}
	
	//**************** RRT feature ************
	@FindBy(xpath="(//mat-option/span[contains(text(),'Assign to Sales Team')])[1]")
	WebElement SelectSalesTeam;
	
	@FindBy(xpath="//span[text()='AutoTestObject']//..//i[contains(@class,'account-list-icon')]")
	WebElement SelectAutoTestObject;
	
	@FindBy(xpath = "(//span[text()='AutoTestObject '])[2]")
	 WebElement AutoTestObject2;
	
	@FindBy(xpath = "//span[text()='AutoTestObject']")
	 WebElement ClickOnAutoTestObject;
	
	@FindBy(xpath = "(//span[text()='AutoTestObject '])[2]")
	 WebElement ClickOnAutoTestObject2;
	
	//*********RRT Sanity

	@FindBy(xpath = "//label[text()='About Me']//..//select[contains(@class,'ng-valid')]")
	 WebElement DisplayedAbouteMeSelectBoxNgValid;
	@FindBy(xpath = "//label[text()='About Me']//..//input[contains(@class,'ng-valid')]")
	 WebElement DisplayedAbouteMeInputBoxNgValid;
	
	@FindBy(xpath = "//label[text()='Longitude ']//..//select[contains(@class,'ng-valid')]")
	 WebElement DisplayedLongitudeSelectBoxNgValid;
	@FindBy(xpath = "(//label[text()='Longitude ']//..//input[contains(@class,'ng-valid')])[1]")
	 WebElement DisplayedLongitudeInputBoxNgValid1;
	@FindBy(xpath = "(//label[text()='Longitude ']//..//input[contains(@class,'ng-valid')])[2]")
	 WebElement DisplayedLongitudeInputBoxNgValid2;
	
	@FindBy(xpath = "(//label[text()='Active']//..//select[contains(@class,'ng-valid')])[1]")
	 WebElement DisplayedActiveSelectBoxNgValid1; 
	@FindBy(xpath = "(//label[text()='Active']//..//select[contains(@class,'ng-valid')])[2]")
	 WebElement DisplayedActiveSelectBoxNgValid2; 
	
	
	@FindBy(xpath = "(//label[text()='Created Date']//..//select[contains(@class,'ng-valid')])[1]")
	 WebElement DisplayedCreatedDateSelectBoxNgValid1; 
	@FindBy(xpath = "(//label[text()='Created Date']//..//select[contains(@class,'ng-valid')])[2]")
	 WebElement DisplayedCreatedDateSelectBoxNgValid2; 
	@FindBy(xpath = "(//label[text()='Created Date']//..//input[contains(@class,'ng-valid')])[1]")
	 WebElement DisplayedCreatedDateInputBoxNgValid1;
	@FindBy(xpath = "(//label[text()='Created Date']//..//input[contains(@class,'ng-valid')])[2]")
	 WebElement DisplayedCreatedDateInputBoxNgValid2;
	
	
	@FindBy(xpath = "(//span[text()='Prefer assignment to sales people with most Accrued Lead']//..//..//..)[1][contains(@class,'mat-radio-checked')]")
	 WebElement DisplayedPreferAssignmentToSalesPeopleWithMostAccruedRadioButtonIsChecked;
	@FindBy(xpath = "//input[@formcontrolname='MaximumLeadAccrued']")
	 WebElement EnterMaximumLeadAccrual;
	@FindBy(xpath = "(//td//input[@type='text'])[1]")
	 WebElement EnterLeadAccrued;
	@FindBy(xpath = "(//mat-icon[text()='close'])[1]")
	 WebElement ClickOnCloseButtonQUEUE;
	@FindBy(xpath = "//input[contains(@class,'error')]")
	WebElement DisplayedLeadAccuredInputboxBorderIsRed;
	
	@FindBy(xpath = "(//span[text()='Assign Leads only to currently available sales rep.']//..//..//..)[1][contains(@class,'mat-checkbox-checked')]")
	 WebElement DisplayedAssignLeadsOnlyToCurrentlyAvailableSalesRepCheckBoxIsChecked;
	
	@FindBy(xpath = "(//span[text()='If no one is available, hold the Lead till someone is available.']//..//..)[1]")
	 WebElement ClickOnIfNoOneIsAvailableHoldTheLeadTillSomeoneIsAvailable;
	
	@FindBy(xpath = "//span[text()=' Assignment History']")
	 WebElement ClickOnAssignmentHistoryButton;
	@FindBy(xpath = "//span[text()=' Refresh']")
	 WebElement ClickOnRefreshButtonQUEUE;
	@FindBy(xpath = "//span[text()='Reset ']")
	 WebElement ClickOnResetButtonQUEUE;
	@FindBy(xpath = "(//span[text()='Save'])[2]")
	 WebElement ClickOnSaveButtonQUEUE;
	@FindBy(xpath = "((//span[text()='Save'])[2]//..//..)[1][@disabled='true']")
	 WebElement DisplaySaveButtonIsDisabled;
	@FindBy(xpath = "(//span[text()='Reset ']//..)[1][@disabled='true']")
	 WebElement DisplayResetButtonIsDisabled;
	
	
	@FindBy(xpath = "(//mat-icon[text()='arrow_downward'])[1]")
	 WebElement ClickOnDownArrowButton;
	
	@FindBy(xpath = "(//mat-icon[text()='arrow_upward'])[1]")
	 WebElement ClickOnUpArrowButton;
	
	@FindBy(xpath = "(//span[@class='mat-slide-toggle-thumb-container'])[1]")
	 WebElement ClickOnStatusRadioButton;
	@FindBy(xpath = "(//span[@class='mat-slide-toggle-thumb-container'])[1]//..//input[@aria-checked='true']")
	 WebElement DisplayedStatusRadioButtonActive;
	@FindBy(xpath = "(//span[@class='mat-slide-toggle-thumb-container'])[1]//..//input[@aria-checked='false']")
	 WebElement DisplayedStatusRadioButtonInActive;
	
	
	@FindBy(xpath = "(//mat-icon[text()='clear'])[1]")
	WebElement ClickOnClearIcon;
	@FindBy(xpath = "(//mat-icon[text()='clear'])[1]//..//..//..//span[text()='First Name']")
	WebElement DisplayFirstNameDND;
	
	
	@FindBy(xpath="//span[text()='Edit ']")
	WebElement ClickOnEditButton;
	
	@FindBy(xpath = "//div[@id='cdk-drop-list-0']")
	WebElement AddField;
	@FindBy(xpath = "//mat-list-item[contains(@id,'First Name')]")
	WebElement FirstName;
	@FindBy(xpath = "//label[text()='First Name']/..//option[text()=' is not empty ']")
	WebElement FirstNameIsNotEmpty;
	
	@FindBy(xpath = "(//button[@aria-label='Open calendar'])[1]")
	WebElement ClickOnCalendarButton1;

	@FindBy(xpath = "(//button[@aria-label='Open calendar'])[2]")
	WebElement ClickOnCalendarButton2;


	@FindBy(xpath = "//div[contains(@class,'mat-calendar-body-today')]")
	WebElement ChooseEndDate;
	@FindBy(xpath = "//button[contains(@class,'body-active')]")
	WebElement ChooseActiveDate;

	@FindBy(xpath = "//span[text()=' Search ']")
	WebElement ClickOnSearchButton;
	
	@FindBy(xpath = "//th[text()='History Details ']")
	WebElement DisplayedHistoryDetails;
	
	@FindBy(xpath = "(//mat-icon[text()='clear'])[2]")
	WebElement ClickOnClearButton;
	@FindBy(xpath = "//mat-icon[text()='clear']")
	WebElement CloseAssignmentHistoryPopup;
	
	
	@FindBy(xpath = "(//span[text()='Save']//..)[1][@disabled='true']")
	WebElement DisplayedSaveButtonIsDisabled;
	@FindBy(xpath = "(//span[text()=' Add ']//..)[1][@disabled='true']")
	WebElement DisplayedAddButtonIsDisabled;
	@FindBy(xpath = "(//mat-icon[text()='delete'])[2]")
	WebElement ClickOnDeleteButtonAssignmentLimit;
	@FindBy(xpath = "//mat-checkbox[contains(@class,'mat-checkbox-disabled')]")
	WebElement DisplayedCheckBoxIsDisabled;
	
	@FindBy(xpath = "(//input[@maxlength='2'])[1][contains(@class,'error')]")
	WebElement DisplayedLeadEveryInputboxBorderColorRed;
	@FindBy(xpath = "//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']")
	WebElement ClickOnCheckBoxAssignmentLimitpage;
	@FindBy(xpath = "//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']//input[@aria-checked='false']")
	WebElement DisplayedCheckBoxIsUnchecked;
	
	
	@FindBy(xpath = "(//span[text()='Assign to Queue Owner irrespective of calendar availability']//..//..)[1][contains(@class,'mat-checkbox-checked')]")
	WebElement DisplayedAssignToQueueOwnerIrrespectiveOfCalendarAvailabilityCheckBoxIsChecked;
	
	@FindBy(xpath = "(//span[text()='Do not assign to default owner ']//..)[1]")
	WebElement ClickOnDoNotAssignToDefaultOwnerCheckBox;
	@FindBy(xpath = "(//span[text()='Do not assign to default owner ']//..)[1]//input[@aria-checked='true']")
	WebElement DisplayedDoNotAssignToDefaultOwnerCheckBoxIsChecked;
	
	@FindBy(xpath = "(//span[text()=' Assign to the sales team owner if no one accepts within ']//..)[1]")
	WebElement ClickOnAssignToTheSalesTeamOwnerIfNoOneAcceptsWithinCheckBox;
	@FindBy(xpath = "(//span[text()=' Assign to the sales team owner if no one accepts within ']//..//..)[1][contains(@class,'mat-checkbox-checked')]")
	WebElement DisplayedAssignToTheSalesTeamOwnerIfNoOneAcceptsWithinCheckBoxIsChecked;
	@FindBy(xpath = "((//span[text()=' Assign to the sales team owner if no one accepts within ']//..//..//..)[1]//input[@type='text'])[1]")
	WebElement EnterDurationInNumbersForAssignToTheSalesTeamOwnerIfNoOneAcceptsWithinCheckBoxFeature;
	@FindBy(xpath = "((//span[text()=' Assign to the sales team owner if no one accepts within ']//..//..//..)[1]//input[@class='form-control form-control-sm inline-select ng-touched ng-dirty ng-valid'])[1]")
	 WebElement DisplayedDurationInputBoxNgValid1;
	@FindBy(xpath = "(//span[text()=' Assign to the sales team owner if no one accepts within ']//..//..//..)[1]//span[@class='ng-arrow-wrapper']")
	WebElement ClickOnDropdownForUnits;
	
	@FindBy(xpath = "(//button[@mattooltip='Refresh'])[1]")
	WebElement ClickOnRefreshButtonFor_Recipient_TO_SlackChannels;
	@FindBy(xpath = "//div[text()='Success']")
	WebElement DisplaySuccesMessageFor_Recipient_TO_SlackChannels;
	@FindBy(xpath = "//ng-select[@placeholder='Select Slack Channel']")
	WebElement ClickSelectDropDownFor_Recipient_TO_SlackChannels;
	@FindBy(xpath = "(//mat-select[@aria-invalid='false'])[1]")
	WebElement VerifyBorderFor_Recipient_TO_SlackChannels;
	@FindBy(xpath = "(//label[contains(@for,'mat-checkbox')])[8]//input[@aria-checked='true']")
	WebElement VeryfyCheckBoxFor_Recipient_TO_SlackChannels;
	@FindBy(xpath = "(//div[@class='ng-option ng-option-child ng-star-inserted'])[1]")
	WebElement SelectFirstOptionFor_RecipientTO_OR_RecipientCC;
	
	
	
	@FindBy(xpath = "(//span[text()='When Queue Owner is busy on Calendar']//..)[1]")
	WebElement ClickOnWhenQueueOwnerIsBusyOnCalendarCheckBox;
	@FindBy(xpath = "(//span[text()='When Queue Owner is busy on Calendar']//..//..)[1][contains(@class,'mat-checkbox-checked')]")
	WebElement DisplayedWhenQueueOwnerIsBusyOnCalendarCheckBoxIsChecked;
	
	@FindBy(xpath = "(//span[text()='When Queue Owner is away on vacation']//..)[1]")
	WebElement ClickOnWhenQueueOwnerIsBusyIsAwayOnVacationCheckBox;
	@FindBy(xpath = "(//span[text()='When Queue Owner is away on vacation']//..//..)[1][contains(@class,'mat-checkbox-checked')]")
	WebElement DisplayedWhenQueueOwnerIsBusyIsAwayOnVacationCheckBoxIsChecked;
	
	@FindBy(xpath = "(//span[text()='Always']//..)[1]")
	WebElement ClickOnAlwaysCheckBox;
	@FindBy(xpath = "(//span[text()='Always']//..//..)[1][contains(@class,'mat-checkbox-checked')]")
	WebElement DisplayedAlwaysCheckBoxIsChecked;
	
	@FindBy(xpath = "//span[text()='Default Filter ']")
	WebElement ClickOnDefaultFilter;
	@FindBy(xpath = "//span[text()='Custom Filter ']")
	WebElement ClickOnCustomFilter;
	@FindBy(xpath = "//button[text()='Custom Filter']")
	WebElement SelectCustomFilter;
	@FindBy(xpath = "//button[text()='Default (1 AND 2 AND 3...)']")
	WebElement SelectDefaultFilter;
	@FindBy(xpath = "//input[@name='canvassearch']")
	WebElement EnterCustomFilter;

	@FindBy(xpath = "(//div[text()='updated successfully'])[2]")
	WebElement DisplaySuccessMessageQueue;
	@FindBy(xpath="//span[text()='Round Robin Team ']")
	WebElement ClickOnRoundRobinTeamFeature;
	
	
	
	
	public void ClickOnRoundRobinTeamFeature() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnAEtoSDRFeature));
		ClickOnRoundRobinTeamFeature.click();
	}
	
	public boolean DisplaySuccessMessageQueue() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplaySuccessMessageQueue));
		return DisplaySuccessMessageQueue.isDisplayed();
	}

	public void SelectDefaultFilter(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectDefaultFilter));
		SelectDefaultFilter.click();
	}
	public void ClickOnCustomFilter(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCustomFilter));
		ClickOnCustomFilter.click();
	}
	public void ClickOnDefaultFilter(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDefaultFilter));
		ClickOnDefaultFilter.click();
	}
	public void SelectCustomFilter(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectCustomFilter));
		SelectCustomFilter.click();
	}
	public void EnterCustomFilter() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(EnterCustomFilter));
		EnterCustomFilter.click();
		EnterCustomFilter.sendKeys("1 AND !2 AND !3 AND !4 AND 5");
	}
	
	
	
	public void ClickOnWhenQueueOwnerIsBusyOnCalendarCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnWhenQueueOwnerIsBusyOnCalendarCheckBox));
		ClickOnWhenQueueOwnerIsBusyOnCalendarCheckBox.click();
	}
	public boolean DisplayedWhenQueueOwnerIsBusyOnCalendarCheckBoxIsChecked() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedWhenQueueOwnerIsBusyOnCalendarCheckBoxIsChecked));
		return DisplayedWhenQueueOwnerIsBusyOnCalendarCheckBoxIsChecked.isDisplayed();
	}
	
	public void ClickOnWhenQueueOwnerIsBusyIsAwayOnVacationCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnWhenQueueOwnerIsBusyIsAwayOnVacationCheckBox));
		ClickOnWhenQueueOwnerIsBusyIsAwayOnVacationCheckBox.click();
	}
	public boolean DisplayedWhenQueueOwnerIsBusyIsAwayOnVacationCheckBoxIsChecked() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedWhenQueueOwnerIsBusyIsAwayOnVacationCheckBoxIsChecked));
		return DisplayedWhenQueueOwnerIsBusyIsAwayOnVacationCheckBoxIsChecked.isDisplayed();
	}
	
	public void ClickOnAlwaysCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAlwaysCheckBox));
		ClickOnAlwaysCheckBox.click();
	}
	public boolean DisplayedAlwaysCheckBoxIsChecked() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedAlwaysCheckBoxIsChecked));
		return DisplayedAlwaysCheckBoxIsChecked.isDisplayed();
	}
	
	
	
	
	public void ClickOnDoNotAssignToDefaultOwnerCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDoNotAssignToDefaultOwnerCheckBox));
		ClickOnDoNotAssignToDefaultOwnerCheckBox.click();
	}
	public boolean DisplayedDoNotAssignToDefaultOwnerCheckBoxIsChecked() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedDoNotAssignToDefaultOwnerCheckBoxIsChecked));
		return DisplayedDoNotAssignToDefaultOwnerCheckBoxIsChecked.isDisplayed();
	}
	public void ClickOnAssignToTheSalesTeamOwnerIfNoOneAcceptsWithinCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAssignToTheSalesTeamOwnerIfNoOneAcceptsWithinCheckBox));
		ClickOnAssignToTheSalesTeamOwnerIfNoOneAcceptsWithinCheckBox.click();
	}
	public boolean DisplayedAssignToTheSalesTeamOwnerIfNoOneAcceptsWithinCheckBoxIsChecked() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedAssignToTheSalesTeamOwnerIfNoOneAcceptsWithinCheckBoxIsChecked));
		return DisplayedAssignToTheSalesTeamOwnerIfNoOneAcceptsWithinCheckBoxIsChecked.isDisplayed();
	}
	public void EnterDurationInNumbersForAssignToTheSalesTeamOwnerIfNoOneAcceptsWithinCheckBoxFeature() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterDurationInNumbersForAssignToTheSalesTeamOwnerIfNoOneAcceptsWithinCheckBoxFeature));
		EnterDurationInNumbersForAssignToTheSalesTeamOwnerIfNoOneAcceptsWithinCheckBoxFeature.clear();
		EnterDurationInNumbersForAssignToTheSalesTeamOwnerIfNoOneAcceptsWithinCheckBoxFeature.sendKeys("3");
	}
	public boolean DisplayedDurationInputBoxNgValid1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedDurationInputBoxNgValid1));
		return DisplayedDurationInputBoxNgValid1.isDisplayed();
	}
	public void ClickOnDropdownForUnits(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDropdownForUnits));
		ClickOnDropdownForUnits.click();
	}
	public boolean DisplaySuccesMessageFor_Recipient_TO_SlackChannels() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplaySuccesMessageFor_Recipient_TO_SlackChannels));
        return DisplaySuccesMessageFor_Recipient_TO_SlackChannels.isDisplayed();
	}
	public boolean VerifyBorderFor_Recipient_TO_SlackChannels() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerifyBorderFor_Recipient_TO_SlackChannels));
        return VerifyBorderFor_Recipient_TO_SlackChannels.isDisplayed();
	}
	public void ClickSelectDropDownFor_Recipient_TO_SlackChannels() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickSelectDropDownFor_Recipient_TO_SlackChannels));
		ClickSelectDropDownFor_Recipient_TO_SlackChannels.click();
	}
	public void ClickOnRefreshButtonFor_Recipient_TO_SlackChannels() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnRefreshButtonFor_Recipient_TO_SlackChannels));
		ClickOnRefreshButtonFor_Recipient_TO_SlackChannels.click();
	}
	public void SelectFirstOptionFor_RecipientTO_OR_RecipientCC() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectFirstOptionFor_RecipientTO_OR_RecipientCC));
		SelectFirstOptionFor_RecipientTO_OR_RecipientCC.click();
	}
	
	
	
	
	
	
	public boolean DisplayedAssignToQueueOwnerIrrespectiveOfCalendarAvailabilityCheckBoxIsChecked() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedAssignToQueueOwnerIrrespectiveOfCalendarAvailabilityCheckBoxIsChecked));
		return DisplayedAssignToQueueOwnerIrrespectiveOfCalendarAvailabilityCheckBoxIsChecked.isDisplayed();
	}
	public boolean DisplayedCheckBoxIsUnchecked() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedCheckBoxIsUnchecked));
		return DisplayedCheckBoxIsUnchecked.isDisplayed();
	}
	public void ClickOnCheckBoxAssignmentLimitpage(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCheckBoxAssignmentLimitpage));
		ClickOnCheckBoxAssignmentLimitpage.click();
	}
	
	public boolean DisplayedLeadEveryInputboxBorderColorRed() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedLeadEveryInputboxBorderColorRed));
		return DisplayedLeadEveryInputboxBorderColorRed.isDisplayed();
	}
	public boolean DisplayedCheckBoxIsDisabled() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedCheckBoxIsDisabled));
		return DisplayedCheckBoxIsDisabled.isDisplayed();
	}
	public boolean DisplayedDeleteButton() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(ClickOnDeleteButtonAssignmentLimit));
			return ClickOnDeleteButtonAssignmentLimit.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	public boolean DisplayFirstNameDND() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayFirstNameDND));
			return DisplayFirstNameDND.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	public void ClickOnDeleteButtonAssignmentLimit(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDeleteButtonAssignmentLimit));
		ClickOnDeleteButtonAssignmentLimit.click();
	}
	public boolean DisplayedAddButtonIsDisabled() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedAddButtonIsDisabled));
		return DisplayedAddButtonIsDisabled.isDisplayed();
	}
	public boolean DisplayedSaveButtonIsDisabled() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedSaveButtonIsDisabled));
		return DisplayedSaveButtonIsDisabled.isDisplayed();
	}
	
	public void CloseAssignmentHistoryPopup() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CloseAssignmentHistoryPopup));
		CloseAssignmentHistoryPopup.click();
	}
	public void ClickOnClearButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnClearButton));
		ClickOnClearButton.click();
	}
	public boolean DisplayedHistoryDetails() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedHistoryDetails));
		return DisplayedHistoryDetails.isDisplayed();
	}
	
	public void ClickOnCalendarButton1(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCalendarButton1));
		ClickOnCalendarButton1.click();
	}

	public void ClickOnCalendarButton2(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCalendarButton2));
		ClickOnCalendarButton2.click();
	}

	
	public void ChooseActiveDate(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ChooseActiveDate));
		ChooseActiveDate.click();
	}
	public void ChooseEndDate(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ChooseEndDate));
		ChooseEndDate.click();
	}
	public void ClickOnSearchButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSearchButton));
		ClickOnSearchButton.click();
	}
	
	
	public boolean DisplaySaveButtonIsDisabled() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplaySaveButtonIsDisabled));
		return DisplaySaveButtonIsDisabled.isDisplayed();
	}
	public boolean DisplayResetButtonIsDisabled() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayResetButtonIsDisabled));
		return DisplayResetButtonIsDisabled.isDisplayed();
	}
	
	
	public void ClickOnFirstNameIsNotEmpty() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(FirstNameIsNotEmpty));
		FirstNameIsNotEmpty.click();
	}
	public void FirstName_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(AddField));
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(FirstName));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(FirstName).pause(Duration.ofSeconds(0)).clickAndHold(FirstName)
		.pause(Duration.ofSeconds(0))
		.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}
	
	public void ClickOnEditButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnEditButton));
		ClickOnEditButton.click();
	}
	public void ClickOnClearIcon(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnClearIcon));
		ClickOnClearIcon.click();
	}

	public boolean DisplayClearIcon() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ClickOnClearIcon));
			return ClickOnClearIcon.isDisplayed();
		}catch(Exception e) {
			return false;
		}		
	}
	public boolean DisplayedStatusRadioButtonActive() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedStatusRadioButtonActive));
		return DisplayedStatusRadioButtonActive.isDisplayed();
	}
	
	public boolean DisplayedStatusRadioButtonInActive() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedStatusRadioButtonInActive));
		return DisplayedStatusRadioButtonInActive.isDisplayed();
	}
	
	public void ClickOnStatusRadioButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnStatusRadioButton));
		ClickOnStatusRadioButton.click();
	}
	
	public void ClickOnUpArrowButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnUpArrowButton));
		ClickOnUpArrowButton.click();
	}
	public void ClickOnDownArrowButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnDownArrowButton));
		ClickOnDownArrowButton.click();
	}
	public boolean DisplaySalesRepDataInQueueManagement() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ClickOnDownArrowButton));
			return ClickOnDownArrowButton.isDisplayed();
		}catch(Exception e) {
			return false;
		}		
	}
	public boolean DisplaySalesRepDataInQueueManagementWST() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ClickOnTopArrowButton));
			return ClickOnTopArrowButton.isDisplayed();
		}catch(Exception e) {
			return false;
		}		
	}
	public void ClickOnSaveButtonQUEUE() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnSaveButtonQUEUE));
		ClickOnSaveButtonQUEUE.click();
	}
	
	public void ClickOnResetButtonQUEUE() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnResetButtonQUEUE));
		ClickOnResetButtonQUEUE.click();
	}
	public void ClickOnRefreshButtonQUEUE() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnRefreshButtonQUEUE));
		ClickOnRefreshButtonQUEUE.click();
	}
	public void ClickOnAssignmentHistoryButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnAssignmentHistoryButton));
		ClickOnAssignmentHistoryButton.click();
	}
	
	public void ClickOnIfNoOneIsAvailableHoldTheLeadTillSomeoneIsAvailable() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnIfNoOneIsAvailableHoldTheLeadTillSomeoneIsAvailable));
		ClickOnIfNoOneIsAvailableHoldTheLeadTillSomeoneIsAvailable.click();
	}
	public boolean DisplayedAssignLeadsOnlyToCurrentlyAvailableSalesRepCheckBoxIsChecked() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedAssignLeadsOnlyToCurrentlyAvailableSalesRepCheckBoxIsChecked));
		return DisplayedAssignLeadsOnlyToCurrentlyAvailableSalesRepCheckBoxIsChecked.isDisplayed();
	}
	
	public void EnterMaximumLeadAccrual() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterMaximumLeadAccrual));
		EnterMaximumLeadAccrual.clear();
		EnterMaximumLeadAccrual.sendKeys("10");
	}
	public void EnterLeadAccrued() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterLeadAccrued));
		EnterLeadAccrued.clear();
		EnterLeadAccrued.sendKeys("10");
	}
	public void EnterValueMoreThanTheMaximumLeadAccrualMaximumLeadAccrual() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterLeadAccrued));
		EnterLeadAccrued.clear();
		EnterLeadAccrued.sendKeys("11");
	}
	public void ClickOnCloseButtonQUEUE() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnCloseButtonQUEUE));
		ClickOnCloseButtonQUEUE.click();
	}
	
	public boolean DisplayedPreferAssignmentToSalesPeopleWithMostAccruedRadioButtonIsChecked() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedPreferAssignmentToSalesPeopleWithMostAccruedRadioButtonIsChecked));
		return DisplayedPreferAssignmentToSalesPeopleWithMostAccruedRadioButtonIsChecked.isDisplayed();
	}
	public boolean DisplayedLeadAccuredInputboxBorderIsRed() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedLeadAccuredInputboxBorderIsRed));
		return DisplayedLeadAccuredInputboxBorderIsRed.isDisplayed();
	}
	public boolean DisplayedAbouteMeSelectBoxNgValid() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedAbouteMeSelectBoxNgValid));
		return DisplayedAbouteMeSelectBoxNgValid.isDisplayed();
	}
	public boolean DisplayedAbouteMeInputBoxNgValid() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedAbouteMeInputBoxNgValid));
		return DisplayedAbouteMeInputBoxNgValid.isDisplayed();
	}
	
	
	public boolean DisplayedLongitudeSelectBoxNgValid() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedLongitudeSelectBoxNgValid));
		return DisplayedLongitudeSelectBoxNgValid.isDisplayed();
	}
	public boolean DisplayedLongitudeInputBoxNgValid1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedLongitudeInputBoxNgValid1));
		return DisplayedLongitudeInputBoxNgValid1.isDisplayed();
	}
	public boolean DisplayedLongitudeInputBoxNgValid2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedLongitudeInputBoxNgValid2));
		return DisplayedLongitudeInputBoxNgValid2.isDisplayed();
	}
	
	
	public boolean DisplayedActiveSelectBoxNgValid1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedActiveSelectBoxNgValid1));
		return DisplayedActiveSelectBoxNgValid1.isDisplayed();
	}
	public boolean DisplayedActiveSelectBoxNgValid2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedActiveSelectBoxNgValid2));
		return DisplayedActiveSelectBoxNgValid2.isDisplayed();
	}
	
	
	public boolean DisplayedCreatedDateSelectBoxNgValid1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedCreatedDateSelectBoxNgValid1));
		return DisplayedCreatedDateSelectBoxNgValid1.isDisplayed();
	}
	public boolean DisplayedCreatedDateSelectBoxNgValid2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedCreatedDateSelectBoxNgValid2));
		return DisplayedCreatedDateSelectBoxNgValid2.isDisplayed();
	}
	public boolean DisplayedCreatedDateInputBoxNgValid1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedCreatedDateInputBoxNgValid1));
		return DisplayedCreatedDateInputBoxNgValid1.isDisplayed();
	}
	public boolean DisplayedCreatedDateInputBoxNgValid2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedCreatedDateInputBoxNgValid2));
		return DisplayedCreatedDateInputBoxNgValid2.isDisplayed();
	}
	
	
	
	
	
	
	
	
	
//*****************	
	public void ClickOnAutoTestObject2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnAutoTestObject2));
		ClickOnAutoTestObject2.click();
	}
	public void ClickOnAutoTestObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnAutoTestObject));
		ClickOnAutoTestObject.click();
	}
	
	public void ContextClickOnAutoTestObject2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AutoTestObject2));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(AutoTestObject2).contextClick(AutoTestObject2).build().perform();
	}
	
	public void SelectAutoTestObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectAutoTestObject));
		SelectAutoTestObject.click();
	}
	
	public void SelectSalesTeam() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectSalesTeam));
		SelectSalesTeam.click();
	}
	
	
	//**************** WST  feature ************
	@FindBy(xpath = "(//mat-option/span[contains(text(),'Assign to Weighted Sales Team')])[1]")
	WebElement SelectWeightedSalesTeam;

	@FindBy(xpath = "(//input[@formcontrolname='SalesRepName'])[2]")
	WebElement SalesRep_2;
	
	@FindBy(xpath = "(//input[@formcontrolname='SalesWeight'])[2]")
	WebElement Weight1;
	
	@FindBy(xpath = "(//input[@formcontrolname='SalesWeight'])[1]")
	WebElement WeightEdit;
	
	@FindBy(xpath = "(//mat-icon[@mattooltip='Move to top'])[1]")
	 WebElement ClickOnTopArrowButton;
	
	@FindBy(xpath="//span[text()='Weighted Sales Team ']")
	WebElement ClickOnWeightedSalesTeamFeature;
	
	
	
	
	
	
	
	
	
	public void ClickOnWeightedSalesTeamFeature() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnWeightedSalesTeamFeature));
		ClickOnWeightedSalesTeamFeature.click();
	}
	
	
	public void ClickOnTopArrowButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnTopArrowButton));
		ClickOnTopArrowButton.click();
	}
	
	
	public void InputWeight1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(Weight1));
		Weight1.sendKeys("62");
	}
	
	public void ClickInputSalesRep2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SalesRep_2));
		SalesRep_2.click();
		
	}
	public void WeightEdit() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(WeightEdit));
		WeightEdit.sendKeys("314");
	}
	public void EditInputWeight1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(Weight1));
		Weight1.sendKeys("314");
	}
	public void SelectWeightedSalesTeam() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectWeightedSalesTeam));
		SelectWeightedSalesTeam.click();
	}
	
	//**************** CRM Account Filter feature ************
	@FindBy(xpath="//span[text()='Account List ']")
	WebElement ClickOnAccountListFeature;
	@FindBy(xpath = "(//label[text()='Billing City']//..//select[contains(@class,'ng-valid')])[1]")
	 WebElement DisplayedBillingCitySelectBoxNgValid; 
	@FindBy(xpath = "//label[text()='Billing City']//..//input[contains(@class,'ng-valid')]")
	 WebElement DisplayedBillingCityInputBoxNgValid; 
	
	public boolean DisplayedBillingCityInputBoxNgValid() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedBillingCityInputBoxNgValid));
		return DisplayedBillingCityInputBoxNgValid.isDisplayed();
	}
	public boolean DisplayedBillingCitySelectBoxNgValid() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedBillingCitySelectBoxNgValid));
		return DisplayedBillingCitySelectBoxNgValid.isDisplayed();
	}
	public void ClickOnAccountListFeature() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnAccountListFeature));
		ClickOnAccountListFeature.click();
	}
	
	//**************** CRM Account Filter feature ************
	
	@FindBy(xpath = "//h4[text()='CRM Account Filter Overview']")
	WebElement CRMaccountFilterView;
	
	@FindBy(xpath="//span[text()='AutoTestObject']//..//i[contains(@class,'crm-account-filter')]")
	WebElement SelectAutoTestObjectCRMAccountFilter;
	
	@FindBy(xpath="//span[text()='CRM Account Filter ']")
	WebElement ClickOnCRMAccountFilterFeature;
	
	public void ClickOnCRMAccountFilterFeature() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnCRMAccountFilterFeature));
		ClickOnCRMAccountFilterFeature.click();
	}
	public void SelectAutoTestObjectCRMAccountFilter() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectAutoTestObjectCRMAccountFilter));
		SelectAutoTestObjectCRMAccountFilter.click();
	}
	public boolean DisplayCRMaccountFilterView() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(CRMaccountFilterView));
		return CRMaccountFilterView.isDisplayed();
	}
	
	//**************** CRM Lead Filter feature ************

	@FindBy(xpath="//span[text()='AutoTestObject']//..//i[contains(@class,'crm-lead-filter')]")
	WebElement SelectAutoTestObjectCRMLeadFilter;
	
	@FindBy(xpath = "//label[text()='First Name']//..//select[contains(@class,'ng-valid')]")
	 WebElement DisplayedFirstNameSelectBoxNgValid;
	@FindBy(xpath = "//label[text()='First Name']//..//input[contains(@class,'ng-valid')]")
	 WebElement DisplayedFirstNameInputBoxNgValid;
	
	@FindBy(xpath = "(//label[text()='Converted']//..//select[contains(@class,'ng-valid')])[1]")
	 WebElement DisplayedConvertedSelectBoxNgValid;
	@FindBy(xpath = "(//label[text()='Converted']//..//select[contains(@class,'ng-valid')])[2]")
	 WebElement DisplayedConvertedInputBoxNgValid2;
	
	@FindBy(xpath = "(//label[text()='State/Province']//..//select[contains(@class,'ng-valid')])[1]")
	 WebElement DisplayedStateOrProvinceSelectBoxNgValid; 
	@FindBy(xpath = "//label[text()='State/Province']//..//input[contains(@class,'ng-valid')]")
	 WebElement DisplayedStateOrProvinceInputBoxNgValid; 
	
	@FindBy(xpath="//span[text()='CRM Lead Filter ']")
	WebElement ClickOnCRMLeadFilterFeature;
	
	
	public void ClickOnCRMLeadFilterFeature() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnCRMLeadFilterFeature));
		ClickOnCRMLeadFilterFeature.click();
	}
	public boolean DisplayedStateOrProvinceSelectBoxNgValid() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedStateOrProvinceSelectBoxNgValid));
		return DisplayedStateOrProvinceSelectBoxNgValid.isDisplayed();
	}
	public boolean DisplayedStateOrProvinceInputBoxNgValid() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedStateOrProvinceInputBoxNgValid));
		return DisplayedStateOrProvinceInputBoxNgValid.isDisplayed();
	}
	
	public boolean DisplayedConvertedSelectBoxNgValid() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedConvertedSelectBoxNgValid));
		return DisplayedConvertedSelectBoxNgValid.isDisplayed();
	}
	public boolean DisplayedConvertedInputBoxNgValid2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedConvertedInputBoxNgValid2));
		return DisplayedConvertedInputBoxNgValid2.isDisplayed();
	}
	
	public boolean DisplayedFirstNameInputBoxNgValid() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedFirstNameInputBoxNgValid));
		return DisplayedFirstNameInputBoxNgValid.isDisplayed();
	}
	public boolean DisplayedFirstNameSelectBoxNgValid() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedFirstNameSelectBoxNgValid));
		return DisplayedFirstNameSelectBoxNgValid.isDisplayed();
	}
	public void SelectAutoTestObjectCRMLeadFilter() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectAutoTestObjectCRMLeadFilter));
		SelectAutoTestObjectCRMLeadFilter.click();
	}
	
	
	//**************** Re-assignment Schedule  feature ************
	
	@FindBy(xpath="//span[text()='Re-assignment Schedule ']")
	WebElement ClickOnReassignmentSchedule;
	
	@FindBy(xpath="//span[text()='Re-route leads with active router ']")
	WebElement ClickOnRerouteLeadsWithActiveRouter;
	@FindBy(xpath="//mat-radio-button[@value='ReRouteWithActiveRouter'][contains(@class,'mat-radio-checked')]")
	WebElement DisplayedRerouteLeadsWithActiveRouterRadioButtonIsChecked;
	@FindBy(xpath="(//span[text()='Re-route leads with active router ']//..)[1]//input[@tabindex='0']")
	WebElement DisplayedRerouteLeadsWithActiveRouterRadioButtonIsNotChecked;
	
	@FindBy(xpath="//span[text()='Re-route leads to sales person ']")
	WebElement ClickOnRerouteLeadsToSalesPerson;	
	@FindBy(xpath="//mat-radio-button[@value='ReRouteToSalesRep'][contains(@class,'mat-radio-checked')]")
	WebElement DisplayedRerouteLeadsToSalesPersonRadioButtonIsChecked;
	@FindBy(xpath="//ng-select[@formcontrolname='ScheduledRunAssignSalesPersonOrQueueID']")
	WebElement ClickOnRerouteLeadsToSalesPersonDropdown;
	@FindBy(xpath="(//div[@role='option'])[1]")
	WebElement SelectRerouteLeadsToSalesPersonOption;
	
	@FindBy(xpath="//mat-radio-button[@value='ReRouteToOwnersManager']")
	WebElement ClickOnRouteLeadsToInactiveOwnersManager;
	@FindBy(xpath="//mat-radio-button[@value='ReRouteToOwnersManager'][contains(@class,'mat-radio-checked')]")
	WebElement DisplayedRouteLeadsToInactiveOwnersManagerRadioButtonIsChecked;
	
	@FindBy(xpath="//mat-radio-button[@value='ReRouteToMappedOwner']")
	WebElement ClickOnRerouteToNewOwnerBasedOnMapping;
	@FindBy(xpath="//mat-radio-button[@value='ReRouteToMappedOwner'][contains(@class,'mat-radio-checked')]")
	WebElement DisplayedRerouteToNewOwnerBasedOnMappingRadioButtonIsChecked;
	@FindBy(xpath="//ng-select[@formcontrolname='scheduledMappedValue']")
	WebElement ClickOnRerouteToNewOwnerBasedOnMappingDropdown;
	@FindBy(xpath="//span[text()='AutoTestObject']")
	WebElement SelectAutoTestObjectOption;
	
	
	@FindBy(xpath="//select[@formcontrolname='IntervalType']")
	WebElement ClickOnIntervalTypeDropDown;
	@FindBy(xpath="//input[@formcontrolname='IntervalTime']")
	WebElement ClickOnIntervalTimeInputbox;
	@FindBy(xpath="//span[@style='transform: rotateZ(-300deg);']")
	WebElement SelectTimeInHour;
	@FindBy(xpath="//span[@style='transform: rotateZ(-90deg);']")
	WebElement SelectTimeInMinutes;
	@FindBy(xpath="//span[text()='Ok']")
	WebElement ClickOnOkButton;
	@FindBy(xpath="//option[text()='Mon']")
	WebElement SelectIntervalDayAsMonday;
	@FindBy(xpath="//option[text()='3 ']")
	WebElement SelectIntervalDate;
	
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement ClickOnStartButton;
	@FindBy(xpath="//span[text()='Reset']")
	WebElement ClickOnResetButton;

	@FindBy(xpath="//div[text()='Re-assignment Condition Scheduled']")
	WebElement DisplayedSuccessMessageOnceClickStartButton;
	
	@FindBy(xpath="(//div[text()='Reset Successfully'])[1]")
	WebElement DisplayedSuccessMessageOnceClickResetButton;
	
	@FindBy(xpath="//label[text()='Interval Type']//..//option[text()='Daily']")
	WebElement ClickOnIntervalType;
	
	
	
	
	public void ClickOnIntervalType() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnIntervalType));
		ClickOnIntervalType.click();
	}
	
	public void ClickOnReassignmentSchedule() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnReassignmentSchedule));
		ClickOnReassignmentSchedule.click();
	}
	
	
	public void ClickOnRerouteLeadsWithActiveRouter() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnRerouteLeadsWithActiveRouter));
		ClickOnRerouteLeadsWithActiveRouter.click();
	}
	public boolean DisplayedRerouteLeadsWithActiveRouterRadioButtonIsChecked() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedRerouteLeadsWithActiveRouterRadioButtonIsChecked));
			return DisplayedRerouteLeadsWithActiveRouterRadioButtonIsChecked.isDisplayed();
		} catch (Exception e) {
		return false;
		}
	}
	public boolean DisplayedRerouteLeadsWithActiveRouterRadioButtonIsNotChecked() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedRerouteLeadsWithActiveRouterRadioButtonIsNotChecked));
		return DisplayedRerouteLeadsWithActiveRouterRadioButtonIsNotChecked.isDisplayed();
	}
	
	
	public void ClickOnRerouteLeadsToSalesPerson() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnRerouteLeadsToSalesPerson));
		ClickOnRerouteLeadsToSalesPerson.click();
	}
	public boolean DisplayedRerouteLeadsToSalesPersonRadioButtonIsChecked() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedRerouteLeadsToSalesPersonRadioButtonIsChecked));
		return DisplayedRerouteLeadsToSalesPersonRadioButtonIsChecked.isDisplayed();
	}
	public void ClickOnRerouteLeadsToSalesPersonDropdown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnRerouteLeadsToSalesPersonDropdown));
		ClickOnRerouteLeadsToSalesPersonDropdown.click();
	}
	public void SelectRerouteLeadsToSalesPersonOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectRerouteLeadsToSalesPersonOption));
		SelectRerouteLeadsToSalesPersonOption.click();
	}
	
	public void ClickOnRouteLeadsToInactiveOwnersManager() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnRouteLeadsToInactiveOwnersManager));
		ClickOnRouteLeadsToInactiveOwnersManager.click();
	}
	public boolean DisplayedRouteLeadsToInactiveOwnersManagerRadioButtonIsChecked() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedRouteLeadsToInactiveOwnersManagerRadioButtonIsChecked));
		return DisplayedRouteLeadsToInactiveOwnersManagerRadioButtonIsChecked.isDisplayed();
	}
	
	
	public void ClickOnRerouteToNewOwnerBasedOnMapping() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnRerouteToNewOwnerBasedOnMapping));
		ClickOnRerouteToNewOwnerBasedOnMapping.click();
	}
	public boolean DisplayedRerouteToNewOwnerBasedOnMappingRadioButtonIsChecked() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedRerouteToNewOwnerBasedOnMappingRadioButtonIsChecked));
		return DisplayedRerouteToNewOwnerBasedOnMappingRadioButtonIsChecked.isDisplayed();
	}
	public void ClickOnRerouteToNewOwnerBasedOnMappingDropdown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnRerouteToNewOwnerBasedOnMappingDropdown));
		ClickOnRerouteToNewOwnerBasedOnMappingDropdown.click();
	}
	public void SelectAutoTestObjectOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectAutoTestObjectOption));
		SelectAutoTestObjectOption.click();
	}
	
	
	public void ClickOnIntervalTypeDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnIntervalTypeDropDown));
		ClickOnIntervalTypeDropDown.click();
	}
	public void ClickOnIntervalTimeInputbox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnIntervalTimeInputbox));
		ClickOnIntervalTimeInputbox.click();
	}
	public void SelectTimeInHour() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectTimeInHour));
		SelectTimeInHour.click();
	}
	public void SelectTimeInMinutes() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectTimeInMinutes));
		SelectTimeInMinutes.click();
	}
	public void ClickOnOkButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnOkButton));
		ClickOnOkButton.click();
	}
	public void SelectIntervalDayAsMonday() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectIntervalDayAsMonday));
		SelectIntervalDayAsMonday.click();
	}
	public void SelectIntervalDate() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectIntervalDate));
		SelectIntervalDate.click();
	}
	
	
	public void ClickOnStartButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnStartButton));
		ClickOnStartButton.click();
	}
	public void ClickOnResetButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnResetButton));
		ClickOnResetButton.click();
	}
	
	
	public boolean DisplayedSuccessMessageOnceClickStartButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedSuccessMessageOnceClickStartButton));
		return DisplayedSuccessMessageOnceClickStartButton.isDisplayed();
	}
	public boolean DisplayedSuccessMessageOnceClickResetButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedSuccessMessageOnceClickResetButton));
		return DisplayedSuccessMessageOnceClickResetButton.isDisplayed();
	}
	
	

	//**************** Re-assignment Schedule  feature ************
	
	@FindBy(xpath="(//div[@role='option'])[2]")
	WebElement SelectRerouteLeadsToSalesPersonOption2;
	
	
	public void SelectRerouteLeadsToSalesPersonOption2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectRerouteLeadsToSalesPersonOption2));
		SelectRerouteLeadsToSalesPersonOption2.click();
	}
	
	//**************** Inactive Owner to Sales Rep Mapping feature ************

	@FindBy(xpath="(//label[text()='Inactive User']//..//div[contains(@class,'ng-has-value')])[1]")
	WebElement DisplayedInactiveBoxBorderColorIsNotRed;
	
	@FindBy(xpath="(//label[text()='Active User']//..//div[contains(@class,'ng-has-value')])[1]")
	WebElement DisplayedActiveBoxBorderColorIsNotRed;
	
	@FindBy(xpath="//span[text()='Inactive Owner to Sales Rep Mapping ']")
	WebElement ClickOnInactiveOwnerToSalesRepMappingFeature;
	
	
	
	public void ClickOnInactiveOwnerToSalesRepMappingFeature() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnInactiveOwnerToSalesRepMappingFeature));
		ClickOnInactiveOwnerToSalesRepMappingFeature.click();
	}

	public boolean DisplayedActiveBoxBorderColorIsNotRed() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedActiveBoxBorderColorIsNotRed));
		return DisplayedActiveBoxBorderColorIsNotRed.isDisplayed();
	}
	public boolean DisplayedInactiveBoxBorderColorIsNotRed() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedInactiveBoxBorderColorIsNotRed));
		return DisplayedInactiveBoxBorderColorIsNotRed.isDisplayed();
	}
	
	//**************** Inactive Owner to Sales Rep Mapping feature ************
	
	@FindBy(xpath = "//label[text()='Account List']//..//select[contains(@class,'ng-valid')]")
	 WebElement DisplayedAccountListSelectBoxNgValid;
	@FindBy(xpath = "//label[text()='Account List']//..//ng-select[contains(@class,'ng-valid')]")
	 WebElement DisplayedAccountListNgSelectBoxBoxNgValid;
	
	@FindBy(xpath = "//label[text()='CRM Account Filter']//..//select[contains(@class,'ng-valid')]")
	 WebElement DisplayedCRMAccountFilterSelectBoxNgValid;
	@FindBy(xpath = "//label[text()='CRM Account Filter']//..//ng-select[contains(@class,'ng-valid')]")
	 WebElement DisplayedCRMAccountFilterNgSelectBoxBoxNgValid;
	
	@FindBy(xpath = "//label[text()='CRM Lead Filter']//..//select[contains(@class,'ng-valid')]")
	 WebElement DisplayedCRMLeadFilterSelectBoxNgValid;
	@FindBy(xpath = "//label[text()='CRM Lead Filter']//..//ng-select[contains(@class,'ng-valid')]")
	 WebElement DisplayedCRMLeadFilterNgSelectBoxBoxNgValid;
	
	@FindBy(xpath = "//label[text()='System Data Dictionary']//..//select[contains(@class,'ng-valid')]")
	 WebElement DisplayedSystemDataDictionarySelectBoxNgValid;
	@FindBy(xpath = "//label[text()='System Data Dictionary']//..//ng-select[contains(@class,'ng-valid')]")
	 WebElement DisplayedSystemDataDictionaryNgSelectBoxBoxNgValid;
	
	
	
	
	
	
	public boolean DisplayedSystemDataDictionarySelectBoxNgValid() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedSystemDataDictionarySelectBoxNgValid));
		return DisplayedSystemDataDictionarySelectBoxNgValid.isDisplayed();
	}
	public boolean DisplayedSystemDataDictionaryNgSelectBoxBoxNgValid() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedSystemDataDictionaryNgSelectBoxBoxNgValid));
		return DisplayedSystemDataDictionaryNgSelectBoxBoxNgValid.isDisplayed();
	}
	
	
	public boolean DisplayedCRMLeadFilterSelectBoxNgValid() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedCRMLeadFilterSelectBoxNgValid));
		return DisplayedCRMLeadFilterSelectBoxNgValid.isDisplayed();
	}
	public boolean DisplayedCRMLeadFilterNgSelectBoxBoxNgValid() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedCRMLeadFilterNgSelectBoxBoxNgValid));
		return DisplayedCRMLeadFilterNgSelectBoxBoxNgValid.isDisplayed();
	}
	
	
	public boolean DisplayedCRMAccountFilterSelectBoxNgValid() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedCRMAccountFilterSelectBoxNgValid));
		return DisplayedCRMAccountFilterSelectBoxNgValid.isDisplayed();
	}
	public boolean DisplayedCRMAccountFilterNgSelectBoxBoxNgValid() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedCRMAccountFilterNgSelectBoxBoxNgValid));
		return DisplayedCRMAccountFilterNgSelectBoxBoxNgValid.isDisplayed();
	}
	
	public boolean DisplayedAccountListSelectBoxNgValid() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedAccountListSelectBoxNgValid));
		return DisplayedAccountListSelectBoxNgValid.isDisplayed();
	}
	public boolean DisplayedAccountListNgSelectBoxBoxNgValid() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedAccountListNgSelectBoxBoxNgValid));
		return DisplayedAccountListNgSelectBoxBoxNgValid.isDisplayed();
	}
	//**************** Lead Routing Territory feature ************

	
	@FindBy(xpath = "(//span[@class='custom-option-content ng-star-inserted'])[1]")
	WebElement SelectOptionFromtheDropdownLRT;
	
	@FindBy(xpath="//span[text()='Lead Routing Territory ']")
	WebElement ClickOnLeadRoutingTerritoryFeature;
	
	public void ClickOnLeadRoutingTerritoryFeature() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnLeadRoutingTerritoryFeature));
		ClickOnLeadRoutingTerritoryFeature.click();
	}
	public void SelectOptionFromtheDropdownLRT() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectOptionFromtheDropdownLRT));
		SelectOptionFromtheDropdownLRT.click();
	}
	
	
	//**************** Capping Leveling condition feature ************

	@FindBy(xpath="//span[text()='Capping/Leveling Condition ']")
	WebElement ClickOnCappingLevelingConditionFeature;
	
	

	public void ClickOnCappingLevelingConditionFeature() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnCappingLevelingConditionFeature));
		ClickOnCappingLevelingConditionFeature.click();
	}
	
	//**************** Escallation condition feature ************
	
	@FindBy(xpath="//span[text()='Escalation Condition ']")
	WebElement ClickOnEscalationConditionFeature;
	
	
	public void ClickOnEscalationConditionFeature() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnEscalationConditionFeature));
		ClickOnEscalationConditionFeature.click();
	}
	
	//**************** Escallation condition feature ************
	
	@FindBy(xpath="//span[text()='Wait Filter ']")
	WebElement ClickOnWaitFilterFeature;
	
	
	public void ClickOnWaitFilterFeature() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnWaitFilterFeature));
		ClickOnWaitFilterFeature.click();
	}
	
	
	//**************** Wait condition feature ************
	
	@FindBy(xpath = "//label[text()='Wait For']//..//input[contains(@class,'ng-valid')]")
	 WebElement DisplayedWaitForInputBoxNgValid;
	@FindBy(xpath = "//label[text()='Wait For']//..//select[contains(@class,'ng-valid')]")
	 WebElement DisplayedWaitForSelectBoxNgValid;
	
	@FindBy(xpath = "(//label[text()='End On']//..//input[contains(@class,'ng-valid')])[1]")
	 WebElement DisplayedWaitTillInputBox1NgValid;
	@FindBy(xpath = "(//label[text()='End On']//..//input[contains(@class,'ng-valid')])[2]")
	 WebElement DisplayedWaitTillInputBox2NgValid;
	
	@FindBy(xpath = "(//label[text()='Wait till']//..//Select[contains(@class,'ng-valid')])[1]")
	 WebElement DisplayedWaitFilterSelectBoxNgValid;
	@FindBy(xpath = "(//label[text()='Wait till']//..//ng-Select[contains(@class,'ng-valid')])[1]")
	 WebElement DisplayedWaitFilterNgSelectBoxNgValid;
	
	@FindBy(xpath="//span[text()='Wait Condition ']")
	WebElement ClickOnWaitConditionFeature;
	
	
	public void ClickOnWaitConditionFeature() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnWaitConditionFeature));
		ClickOnWaitConditionFeature.click();
	}
	
	public boolean DisplayedWaitFilterSelectBoxNgValid() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedWaitFilterSelectBoxNgValid));
		return DisplayedWaitFilterSelectBoxNgValid.isDisplayed();
	}
	public boolean DisplayedWaitFilterNgSelectBoxNgValid() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedWaitFilterNgSelectBoxNgValid));
		return DisplayedWaitFilterNgSelectBoxNgValid.isDisplayed();
	}
	
	
	public boolean DisplayedWaitTillInputBox1NgValid() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedWaitTillInputBox1NgValid));
		return DisplayedWaitTillInputBox1NgValid.isDisplayed();
	}
	public boolean DisplayedWaitTillInputBox2NgValid() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedWaitTillInputBox2NgValid));
		return DisplayedWaitTillInputBox2NgValid.isDisplayed();
	}
	
	public boolean DisplayedWaitForInputBoxNgValid() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedWaitForInputBoxNgValid));
		return DisplayedWaitForInputBoxNgValid.isDisplayed();
	}
	public boolean DisplayedWaitForSelectBoxNgValid() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedWaitForSelectBoxNgValid));
		return DisplayedWaitForSelectBoxNgValid.isDisplayed();
	}
	
	
	//**************** Task List feature ************
	
	@FindBy(xpath="//span[text()='Task Lists ']")
	WebElement ClickOnTaskListsFeature;
	
	@FindBy(xpath = "//mat-error[text()=' Subject required ']")
	WebElement DisplayedSubjectRequiredErrorNote;
	
	@FindBy(xpath = "//mat-error[text()=' Due by date required ']")
	WebElement DisplayedDuebydaterequiredErrorNote;
	@FindBy(xpath = "//mat-error[text()=' Due with-in days required ']")
	WebElement DisplayedDueWithInDaysRequiredErrorNote;
	
	@FindBy(xpath = "//label[text()='Priority']//..//select[contains(@class,'ng-valid')]")
	WebElement DisplayedPrioritySelectBoxNgValid;
	
	@FindBy(xpath = "//label[text()='Status']//..//select[contains(@class,'ng-valid')]")
	WebElement DisplayedStatusSelectBoxNgValid;
	
	
	public void ClickOnTaskListsFeature() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnTaskListsFeature));
		ClickOnTaskListsFeature.click();
	}
	
	
	public boolean DisplayedStatusSelectBoxNgValid() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedStatusSelectBoxNgValid));
		return DisplayedStatusSelectBoxNgValid.isDisplayed();
	}
	
	public boolean DisplayedPrioritySelectBoxNgValid() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedPrioritySelectBoxNgValid));
		return DisplayedPrioritySelectBoxNgValid.isDisplayed();
	}
	
	public boolean DisplayedDueWithInDaysRequiredErrorNote() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedDueWithInDaysRequiredErrorNote));
			return DisplayedDueWithInDaysRequiredErrorNote.isDisplayed();
		} catch (Exception e) {
	return false;
		}
	}
	public boolean DisplayedDuebydaterequiredErrorNote() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedDuebydaterequiredErrorNote));
			return DisplayedDuebydaterequiredErrorNote.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public boolean DisplayedSubjectRequiredErrorNote() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedSubjectRequiredErrorNote));
			return DisplayedSubjectRequiredErrorNote.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	
	
	
	
	
	
	
}
