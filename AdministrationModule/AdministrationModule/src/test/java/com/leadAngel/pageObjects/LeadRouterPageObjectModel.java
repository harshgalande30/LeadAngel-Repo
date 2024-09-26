package com.leadAngel.pageObjects;
import java.time.Duration;
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
	
	
	
	@FindBy(xpath = "//span[text()='Save']")
	WebElement SaveButtonForOTSAssignmentBlock;
	
	public void SaveButtonForOTSAssignmentBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SaveButtonForOTSAssignmentBlock));
		SaveButtonForOTSAssignmentBlock.click();
	}
	//*****************************************************Lead Router Flow Chart*****************************************
	@FindBy(xpath="//mat-icon[text()='expand_more']")
	WebElement DNDdiagramDropDown;
	
	
	
	
	@FindBy(xpath="//div[contains(text(),'Lead Filter')]")
	WebElement LeadFilter;
	@FindBy(xpath="(//span[text()='Assignment Block']//..)[1]")
	WebElement AssignmentBlock;
	@FindBy(xpath="//div[@data-jtk-source-port-type='source']")
	WebElement DecisionBlockYES;
	@FindBy(xpath="(//span[contains(text(),'Decision Block')]/ancestor::div)[14]")
	WebElement DecisionBlock;
	
	@FindBy(xpath="(//span[contains(text(),'Decision Block')]/ancestor::div)[15]")
	WebElement DecisionBlock2;
	
	@FindBy(xpath="//div[contains(text(),'Action')]")
	WebElement ActionBlock;
	@FindBy(xpath="(//div[@class='drag-start connect ng-star-inserted'])[2]")
	WebElement ActionBlockY;
	@FindBy(xpath="(//div[@class='drag-start connect ng-star-inserted'])[2]")
	WebElement SelectActionDropDown;
	@FindBy(xpath="//select[@formcontrolname='DecisionActionType']")
	WebElement ClickActionDropDown;
	@FindBy(xpath="//option[@value='webhook']")
	WebElement WeighBookOptioActionBlock;
	@FindBy(xpath="//select[@formcontrolname='webhookvalue']")
	WebElement ClickWeighBookDropDown;
	@FindBy(xpath="(//option[@class='ng-star-inserted'])[2]")
	WebElement WeighBookOptionActionBlock;
	@FindBy(xpath="(//span[@class='mat-radio-container'])[1]")
	WebElement ClickOnWeighbookFailureCheckBox;
	@FindBy(xpath="//span[normalize-space()='Save']")
	WebElement SaveButtonForActionBlock;
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
	
	
	
	@FindBy(xpath="(//i[@class='list-icon-size account-list-icon ng-star-inserted'])[1]")
	WebElement DecisionBlockList;
	
	@FindBy(xpath="(//i[@class='list-icon-size account-list-icon ng-star-inserted'])[5]")
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
	@FindBy(xpath="(//mat-option[@role='option']//span[@class='custom-option-content ng-star-inserted'])[1]")
	WebElement SelectOptionsFromtheDropdown;
	
	@FindBy(xpath="(//mat-option[@role='option'])[6]")
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
	@FindBy(xpath="//div[@data-jtk-source-port-type='source1']")
	WebElement DecisionBlockNo;
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
	
	@FindBy(xpath = "(//mat-option[@role='option'])[2]")
	WebElement ClickOnSelectMappedSDROption;
	
	@FindBy(xpath = "(//mat-option[@role='option'])[4]")
	WebElement Edit2ClickOnSelectMappedSDROption;
	
	
	
	@FindBy(xpath = "(//mat-option[@role='option'])[5]")
	WebElement EditClickOnSelectMappedSDROption;
	
	
	@FindBy(xpath = "//span[text()='Save']")
	WebElement SaveButtonForAssignmentBlock;
	
	@FindBy(xpath = "//div[3]//div[1]//*[name()='svg']//*[name()='rect' and contains(@stroke,'green')]")
	WebElement AssignmentBlock1;
	
	@FindBy(xpath = "(//div[1]//div[1]//*[name()='svg']//*[name()='rect' and contains(@stroke,'green')])[2]")
	WebElement AssignmentBlock2;
	@FindBy(xpath = "//div[1]//div[1]//*[name()='svg']//*[name()='rect' and contains(@stroke,'green')]")
	WebElement FlowChartAssignmentBlock2;
	
	
	@FindBy(xpath = "(//*[name()='rect'])[3]")
	WebElement AssignmentBlock3;
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
	
	
	
	
	
	@FindBy(xpath = "(//div[@title='Drag to add new'])[5]")
	WebElement RandomSplit;
	@FindBy(xpath = "//input[@name='SplitA']")
	WebElement PercentageAllocationA;
	@FindBy(xpath = "//input[@name='SplitB']")
	WebElement PercentageAllocationB;
	@FindBy(xpath = "//input[@name='SplitC']")
	WebElement PercentageAllocationC;
	@FindBy(xpath = "(//div[@class='drag-start connect AConnection ng-star-inserted'])[1]")
	WebElement RandomSplitA;
	@FindBy(xpath = "(//div[@class='drag-start connect BConnection ng-star-inserted'])[1]")
	WebElement RandomSplitB;
	@FindBy(xpath = "(//div[@class='drag-start connect CConnection ng-star-inserted'])[1]")
	WebElement RandomSplitC;
	@FindBy(xpath = "//span[text()='Save ']")
	WebElement SaveButtonForRandomSplit;
	@FindBy(xpath = "(//*[name()='rect'][@stroke='green'])[3]")
	WebElement RandomSplitBorderColour;
	
	
	
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
	
	
	
	@FindBy(xpath = "(//div[@role='option'])[2]")    //This Xpath is also applicaple for Emain Alert Templates in administration Module
	WebElement SelectInsertValueObjectOptionUpdateDataValue;
	@FindBy(xpath = "//option[text()='Lead']")    //This Xpath is also applicaple for Emain Alert Templates in administration Module
	WebElement SelectInsertValueObjectOptionWebhookUpdateDataValue;
	@FindBy(xpath = "(//div[@role='option'])[2]")    //This Xpath is also applicaple for Emain Alert Templates in administration Module
	WebElement SelectInsertValueObjectOption1UpdateDataValue;
	
	@FindBy(xpath = "//label[text()='Select Field']//..//ng-select[@placeholder='Select']")    //This Xpath is also applicaple for Emain Alert Templates in administration Module
	WebElement InsertValueSelectFieldDropDownUpdateDataValue;
	@FindBy(xpath = "//label[text()='Select Field']//..//span[@class='ng-arrow-wrapper']")   
	WebElement InsertValueSelectFieldDropDownForURL;
	
	@FindBy(xpath = "(//div[@role='option'])[1]")
	WebElement InsertValueSelectFieldOptionUpdateDataValue;     //This Xpath is also applicaple for Emain Alert Templates in administration Module
	
	@FindBy(xpath = "(//div[@role='option'])[2]")
	WebElement InsertValueSelectFieldOption2UpdateDataValue; 
	
	@FindBy(xpath = "//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']//span[text()='Insert']")                  //This Xpath is also applicaple for Emain Alert Templates in administration Module
	WebElement ClickOnIncertButton;
	
	
	@FindBy(xpath = "//span[text()='Save ']")
	WebElement SaveButtonForUpdateDataValue;
	@FindBy(xpath = "(//*[name()='polygon'][@stroke='green'])[3]")
	WebElement UpdateDataValueForBorderColor;
	

	
	
	
	
	
	
	
	
	public void DoubleClickOnUpdateDataValueBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(UpdateDataValueY));
		Actions actions = new Actions(ldriver);
		//DecisionBlock.sendKeys("");
		actions.doubleClick(UpdateDataValueY).build().perform();
		actions.doubleClick(UpdateDataValueY).build().perform();
		
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
	public void SelectInsertValueObjectOption1UpdateDataValue() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectInsertValueObjectOption1UpdateDataValue));
		SelectInsertValueObjectOption1UpdateDataValue.click();
	}
	
	//This Xpath is also applicaple for Emain Alert Templates in administration Module
	public void ClickOnSelectInsertValueObjectOptionUpdateDataValue() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectInsertValueObjectOptionUpdateDataValue));
		SelectInsertValueObjectOptionUpdateDataValue.click();
	}
	
	public void SelectInsertValueObjectOptionWebhookUpdateDataValue() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectInsertValueObjectOptionWebhookUpdateDataValue));
		SelectInsertValueObjectOptionWebhookUpdateDataValue.click();
	}
	//This Xpath is also applicaple for Emain Alert Templates in administration Module
	public void ClickOnInsertValueSelectFieldDropDownUpdateDataValue() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(InsertValueSelectFieldDropDownUpdateDataValue));
		InsertValueSelectFieldDropDownUpdateDataValue.click();
	}
	public void InsertValueSelectFieldDropDownForURL() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(InsertValueSelectFieldDropDownForURL));
		InsertValueSelectFieldDropDownForURL.click();
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
	public void ClickOnIncertButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnIncertButton));
		ClickOnIncertButton.click();
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
		new WebDriverWait(ldriver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(PercentageAllocationB));
		PercentageAllocationB.clear();
		PercentageAllocationB.sendKeys("32");
	}
	
	public void ClickOnSaveButtonForRandomSplit() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SaveButtonForRandomSplit));
		SaveButtonForRandomSplit.click();
	}
	
	
	public boolean isDisplayLeadRouterOverview() {
		  new WebDriverWait(ldriver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(DisplayLeadRouterOverview));
		  return DisplayLeadRouterOverview.isDisplayed();
	}
	
	
	public void RandomSplit_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(RandomSplit));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(RandomSplit)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(RandomSplit)
        .pause(Duration.ofSeconds(1))
        .moveByOffset(-200,-50) //change the x, y values to be applicable for your cases
        .moveByOffset(-200,-50)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
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
	
	public void LeadFilter2_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(LeadFilter));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(LeadFilter)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(LeadFilter)
        .pause(Duration.ofSeconds(1))
        .moveByOffset(-300,50) //change the x, y values to be applicable for your cases
        .moveByOffset(-300,50)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}

	
	
	public void AssignmentBlock1_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(AssignmentBlock));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(AssignmentBlock)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(AssignmentBlock)
        .pause(Duration.ofSeconds(1))
        .moveByOffset(-250,170) //change the x, y values to be applicable for your cases
        .moveByOffset(-250,170)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	
	public void AssignmentBlock2_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(AssignmentBlock));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(AssignmentBlock)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(AssignmentBlock)
        .pause(Duration.ofSeconds(1))
        .moveByOffset(-150,60) //change the x, y values to be applicable for your cases
        .moveByOffset(-150,60)
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
	
	public void AssignmentBlock3_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(AssignmentBlock));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(AssignmentBlock)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(AssignmentBlock)
        .pause(Duration.ofSeconds(1))
        .moveByOffset(-150,-50) //change the x, y values to be applicable for your cases
        .moveByOffset(-150,-50)
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
        .moveByOffset(-300,50) //change the x, y values to be applicable for your cases
        .moveByOffset(-300,50)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	
	public void ConnectActionBlock_To_assignmentBlock1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ActionBlockY));
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(AssignmentBlock1InCanvas));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(ActionBlockY)
        .pause(Duration.ofSeconds(0))
        .clickAndHold(ActionBlockY)
        .pause(Duration.ofSeconds(0))
        .moveToElement(AssignmentBlock1InCanvas)
        .pause(Duration.ofSeconds(0))
        .release().build().perform();
	}
	
	
	public void DoubleClickOnDecisionBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DecisionBlockNo));
		Actions actions = new Actions(ldriver);
		actions.doubleClick(DecisionBlockNo).build().perform();
		actions.doubleClick(DecisionBlockNo).build().perform();
		
	}
	
	public void DoubleClickOnUpdateToCRM_Block() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(UpdateToCRMY));
		Actions actions = new Actions(ldriver);
		//DecisionBlock.sendKeys("");
		actions.doubleClick(UpdateToCRMY).build().perform();
		actions.doubleClick(UpdateToCRMY).build().perform();
		
	}
	
	public void ClickOnDescriptionOfUpdateToCRMBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(DescriptionOfUpdateToCRMBlock));
		DescriptionOfUpdateToCRMBlock.clear();
		DescriptionOfUpdateToCRMBlock.sendKeys("AutoTestObject_UpdateToCRM");
	}
	
	
	
	public void DoubleClickOnDecisionBlock2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DecisionBlock));
		Actions actions = new Actions(ldriver);
		//DecisionBlock.sendKeys("");
		actions.doubleClick(DecisionBlock2).build().perform();
		actions.doubleClick(DecisionBlock2).build().perform();
		
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
	
	public void ClickWeighBookDropDownActionBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickWeighBookDropDown));
		ClickWeighBookDropDown.click();
	}
	
	public void SelectWeighBookOptionActionBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(WeighBookOptionActionBlock));
		WeighBookOptionActionBlock.click();
	}
//	public void ClickOnWeighbookFailureCheckBoxActionBlock() {
//		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnWeighbookFailureCheckBox));
//		ClickOnWeighbookFailureCheckBox.click();
//	}
	public void ClickOnWeighbookFailureCheckBoxActionBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnWeighbookFailureCheckBox));
		//ApproveSubmitbtn.click();
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", ClickOnWeighbookFailureCheckBox);
	}
	
	
	public void ClickOnSaveButtonForActionBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SaveButtonForActionBlock));
		SaveButtonForActionBlock.click();
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
	
	
	public void ConnectDecisionBlock2_To_assignmentBlock2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(Decision2BlockN));
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(AssignmentBlock2InCanvas));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(Decision2BlockN)
        .pause(Duration.ofSeconds(0))
        .clickAndHold(Decision2BlockN)
        .pause(Duration.ofSeconds(0))
        .moveToElement(AssignmentBlock2InCanvas)
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
	
	public void ConnectDecisionBlock2_To_assignmentBlock3() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(Decision2BlockY));
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(AssignmentBlock3InCanvas));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(Decision2BlockY)
        .pause(Duration.ofSeconds(0))
        .clickAndHold(Decision2BlockY)
        .pause(Duration.ofSeconds(0))
        .moveToElement(AssignmentBlock3InCanvas)
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
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(AssignmentBlock));
		Actions actions = new Actions(ldriver);
		actions.doubleClick(AssignmentBlock).build().perform();		
	}
	
	public void DoubleClickOnAssignmentBlock2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(AssignmentBlock2InCanvas));
		Actions actions = new Actions(ldriver);
		//DecisionBlock.sendKeys("");
		actions.doubleClick(AssignmentBlock2InCanvas).build().perform();
		//actions.doubleClick(AssignmentBlock2InCanvas).build().perform();
		
	}

	public void DoubleClickOnAssignmentBlock3() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(AssignmentBlock2InCanvas));
		Actions actions = new Actions(ldriver);
		//DecisionBlock.sendKeys("");
		actions.doubleClick(AssignmentBlock3InCanvas).build().perform();
		actions.doubleClick(AssignmentBlock3InCanvas).build().perform();
		
	}
	
	public void DoubleClickOnRandomSplit() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(RandomSplitA));
		Actions actions = new Actions(ldriver);
		//DecisionBlock.sendKeys("");
		actions.doubleClick(RandomSplitA).build().perform();
		actions.doubleClick(RandomSplitA).build().perform();
		
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
	public void SelectOptionsFromtheDropdown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectOptionsFromtheDropdown));
		SelectOptionsFromtheDropdown.click();
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
	public void ConnectDecisionBlock1_To_DecisionBlock2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DecisionBlock));
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DecisionBlock2));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(DecisionBlockN)
        .pause(Duration.ofSeconds(0))
        .clickAndHold(DecisionBlockN)
        .pause(Duration.ofSeconds(0))
        .moveToElement(DecisionBlock2)
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
	public boolean DisplayAssignmentBlock1BorderColour() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(AssignmentBlock1));
        return AssignmentBlock1.isDisplayed();
	}
	public boolean DisplayActionBlockBorderColor() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(ActionBlockBorderColor));
        return ActionBlockBorderColor.isDisplayed();
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
	
	
}
