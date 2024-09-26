package com.leadAngel.pageObjects;
import java.util.Random;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.leadAngel.testCases.TC_CrudOperation_AutoConversion_Administration;

import net.sf.saxon.expr.TryCatch;

public class AdministrationPageObjectModel {

	WebDriver ldriver;

	public AdministrationPageObjectModel(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}




	@FindBy(xpath = "//button[@aria-label='toggle Notifications']")
	WebElement NotificationsDropDown;


	//********************************************************Email************************************************

	@FindBy(xpath = "//button[@aria-label='toggle Email']")
	WebElement EmailDropDown;

	@FindBy(xpath = "//button[text()='New Email ']")
	WebElement NewEmail;

	@FindBy(xpath = "//input[@id='menuname']")
	WebElement EnterNameInCrudObject; 

	@FindBy(xpath = "//option[@value='Lead']")
	WebElement SelectRouterType; 

	@FindBy(xpath = "//button[@type='submit']")                      
	WebElement SaveButtonCrudObject;
	
	@FindBy(xpath = "//input[@id='menuname']")
	public WebElement InputRename_AutoTestObject;
	
	@FindBy (xpath = "//button[@aria-label='toggle Email']")
	WebElement ClickOnEmailDropdown;
	@FindBy (xpath = "//button[@aria-label='toggle Webhook']")
	WebElement ClickOnWebhookDropdown;
	@FindBy (xpath = "//button[@aria-label='toggle Response Mapping']")
	WebElement ClickOnResponseMappingDropdown;
	
	//******************************************Slack****************************************************
	
	@FindBy (xpath = "//button[@aria-label='toggle Slack']")
	WebElement ClickOnSlackDropdown;
	@FindBy (xpath = "//button[@aria-label='toggle CRM In-App']")
	WebElement ClickOnCRMinAppDropdown;
	@FindBy (xpath = "//button[@aria-label='toggle Twilio']")
	WebElement ClickOnTwilioDropdown;
	
	@FindBy(xpath = "(//div[contains(text(),'Can not delete')])[1]")
	WebElement DisplayedCannotDeleteErrorSuccessMessage;
	
	@FindBy(xpath = "//h4[text()='Email Overview']")
	WebElement DisplayedEmailOverview;
	@FindBy(xpath="(//a[text()=' open_in_new '])[1]")
	WebElement ClickOnOpenInNewTabLink;
	@FindBy(xpath="(//mat-icon[@fonticon='open_in_new'])[1]")
	WebElement ClickOnOpenInNewTabLinkSlack;
	
	@FindBy(xpath = "//li[text()=' Detail ']")
	WebElement ClickOnDetailPage;
	@FindBy(xpath = "//h4[text()='CRM In-App Overview']")
	WebElement DisplayedCRMinAppOverview;
	
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
	
	@FindBy(xpath="//div[@data-type='assignment']")
	WebElement DNDAssignment;
	
	@FindBy(xpath = "(//*[name()='rect' and contains(@stroke,'#EFDF48')])[1]")
	WebElement DisplayedAssignmentBlockBorderColor;
	@FindBy(xpath = "(//*[name()='path' and contains(@stroke,'#F9A52C')])[1]")
	WebElement DisplayedDecisionBlockBorderColor;
	
	@FindBy(xpath="(//mat-option/span[contains(text(),'Assign to Sales Team')])[1]")
	WebElement SelectSalesTeam;
	
	@FindBy(xpath = "//span[text()=' Auto Convert Leads into Contact and/or Accounts ']//..//span[@class='mat-checkbox-inner-container']")
	WebElement ClickAutoConvertLeadsIntoContactCheckBox;
	
	@FindBy(xpath = "(//span[text()=' Auto Convert Leads into Contact and/or Accounts ']//..)[1]//input[@aria-checked='true']")
	WebElement DisplayedAutoConvertLeadsIntoContactAndorAccountsCheckBoxIsChecked;
	
	
	@FindBy(xpath = "//div[text()=' Select Auto Conversion ']//..//mat-select[@role='combobox']")
	WebElement ClockAutoConvertLeadsIntoContactDropdown;
	
	
	
	
	public void ClickAutoConvertLeadsIntoContactDropdown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClockAutoConvertLeadsIntoContactDropdown));
		ClockAutoConvertLeadsIntoContactDropdown.click();
	}
	
	public boolean DisplayedAutoConvertLeadsIntoContactAndorAccountsCheckBoxIsChecked() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedAutoConvertLeadsIntoContactAndorAccountsCheckBoxIsChecked));
		return DisplayedAutoConvertLeadsIntoContactAndorAccountsCheckBoxIsChecked.isDisplayed();
       }
	
	
	public void ClickAutoConvertLeadsIntoContactCheckBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickAutoConvertLeadsIntoContactCheckBox));
		ClickAutoConvertLeadsIntoContactCheckBox.click();
	}
	public void SelectSalesTeam() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectSalesTeam));
		SelectSalesTeam.click();
	}
	
	public boolean VerifiedDecisionBlockBorderColor() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedDecisionBlockBorderColor));
			return DisplayedDecisionBlockBorderColor.isDisplayed();
		} catch (Exception e) {
		return false;
		}
	}
	
	public boolean VerifiedAssignmentBlockBorderColor() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedAssignmentBlockBorderColor));
			return DisplayedAssignmentBlockBorderColor.isDisplayed();
		} catch (Exception e) {
		return false;
		}
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
	public void ClickOnCRMinAppDropdown()
	    {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickOnCRMinAppDropdown));
		ClickOnCRMinAppDropdown.click();
	     }
	
	public void ClickOnTwilioDropdown()  {
	new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickOnTwilioDropdown));
	ClickOnTwilioDropdown.click();
     }
	
	public void ClickOnEmailDropdown()  {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickOnEmailDropdown));
		ClickOnEmailDropdown.click();
	}
	public void ClickOnWebhookDropdown()  {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickOnWebhookDropdown));
		ClickOnWebhookDropdown.click();
	}
	public void ClickOnResponseMappingDropdown()  {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickOnResponseMappingDropdown));
		ClickOnResponseMappingDropdown.click();
	}
	
	
	public void ClickSlackDropdown() {
	new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickOnSlackDropdown));
	ClickOnSlackDropdown.click();
    }
	public boolean DisplayedCannotDeleteErrorSuccessMessage() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(DisplayedCannotDeleteErrorSuccessMessage));
			return DisplayedCannotDeleteErrorSuccessMessage.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	public boolean DisplayedCRMinAppOverview() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(DisplayedCRMinAppOverview));
		return DisplayedCRMinAppOverview.isDisplayed();
	}
	public boolean DisplayedEmailOverview() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(DisplayedEmailOverview));
		return DisplayedEmailOverview.isDisplayed();
	}
	
	public void ClickOnOpenInNewTabLink() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnOpenInNewTabLink));
		ClickOnOpenInNewTabLink.click();
	}
	public void ClickOnOpenInNewTabLinkSlack() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnOpenInNewTabLinkSlack));
		ClickOnOpenInNewTabLinkSlack.click();
	}
	
	public void ClickOnDetailPage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnDetailPage));
		ClickOnDetailPage.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	//********************************************************WebHook Integrations************************************************

	@FindBy(xpath ="//button[@aria-label='toggle Integrations']")
	WebElement IntegrationsDropDown;
	@FindBy(xpath ="//button[@aria-label='toggle Webhook Integration']")
	WebElement WebhookIntegrationDropDown;
	@FindBy(xpath ="//button[@aria-label='toggle Webhook']")
	WebElement WebhookDropDown;
	@FindBy(xpath ="//mat-icon[text()='add']")
	WebElement NewObject;
	//********************************************************WebHook Integrations************************************************
	@FindBy(xpath ="//button[@aria-label='toggle Response Mapping']")
	WebElement ResponseMappingDropDown;

	@FindBy(xpath ="//span[text()='Response Mapping ']")
	WebElement ClickAgainResponseMapping;



	//********************************************************Crud Operation************************************************

	//Some of crud operation xpath has been taken from leadManagementpage

	@FindBy(xpath = "//span[text()='Lead:AutoTestObject ']")
	WebElement RightClickOnLeadAutoTestObject;
	@FindBy(xpath = "//span[text()='Lead:AutoTestObject_Rename ']")
	WebElement LeadAutoTestObjectAfterRename;
	@FindBy(xpath = "//span[text()='Lead:AutoTestObject_Rename_Copy(1) ']")
	WebElement LeadAutoTestObjectAfterClone;


	
	public boolean DisplayLeadAutoTestObjectRename() {

		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(LeadAutoTestObjectAfterRename));
			return LeadAutoTestObjectAfterRename.isDisplayed();
		}catch(Exception e) {
			return false;
		}								
	}
	public boolean DisplayedLeadAutoTestObjectRenameCopy() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(LeadAutoTestObjectAfterClone));
			return LeadAutoTestObjectAfterClone.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	//********************************************************Crud Operation************************************************

	@FindBy(xpath = "//mat-icon[text()='refresh']")
	WebElement ClickOnRefreshButton;
	@FindBy(xpath = "(//mat-icon[text()='close'])[1]")
	 WebElement ClickOnCloseButtonQUEUE;
	
	
	
	public void ClickOnCloseButtonQUEUE() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnCloseButtonQUEUE));
		ClickOnCloseButtonQUEUE.click();
	}
	
	public void ClickOnRefreshButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnRefreshButton));
		ClickOnRefreshButton.click();
	}

	public void ClickNotificationsDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(NotificationsDropDown));
		NotificationsDropDown.click();
	}
	//********************************************************************************************************

	public void ContextClickOnResponseMapping() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickAgainResponseMapping));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(ClickAgainResponseMapping).contextClick(ClickAgainResponseMapping).build().perform();
	}
	public void ClickOnResponseMappingDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ResponseMappingDropDown));
		ResponseMappingDropDown.click();
	}
	public void ClickAgainResponseMapping() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickAgainResponseMapping));
		ClickAgainResponseMapping.click();
	}






	public void RightClickLeadAutoTestObjectAfterClone() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(LeadAutoTestObjectAfterClone));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(LeadAutoTestObjectAfterClone).contextClick(LeadAutoTestObjectAfterClone).build().perform();
	}

	public void ContextClickOnRenameAutoTestObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(LeadAutoTestObjectAfterRename));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(LeadAutoTestObjectAfterRename).contextClick(LeadAutoTestObjectAfterRename).build().perform();
	}
	public void ClickOnAgainRenameAutoTestObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(LeadAutoTestObjectAfterRename));
		LeadAutoTestObjectAfterRename.click();
	}
	public boolean VisibleOfRenameAutoTestObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.visibilityOf(LeadAutoTestObjectAfterRename));
		return    LeadAutoTestObjectAfterRename.isDisplayed();
	}

	public boolean DisplayCloneAutoTestObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.visibilityOf(LeadAutoTestObjectAfterClone));
		return LeadAutoTestObjectAfterClone.isDisplayed();
	}

	public boolean DisplayAutoTestObjectAfterRename(){

		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(LeadAutoTestObjectAfterRename));
			return LeadAutoTestObjectAfterRename.isDisplayed();
		}catch(Exception e) {
			return false;
		}								
	}

	public void ClickEmailDropDown(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EmailDropDown));
		EmailDropDown.click();
	}

	public void ClickNewEmail(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(NewEmail));
		NewEmail.click();
	}

	public void RightClickonEmailDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25))
		.until(ExpectedConditions.elementToBeClickable(EmailDropDown));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(EmailDropDown).contextClick(EmailDropDown).build().perform();
	}

	public void EnterNameInCrudObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(EnterNameInCrudObject));
		EnterNameInCrudObject.clear();
		EnterNameInCrudObject.sendKeys("AutoTestObject");

	}
	public void RightClickOnAutoTestObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25))
		.until(ExpectedConditions.elementToBeClickable(RightClickOnLeadAutoTestObject));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(RightClickOnLeadAutoTestObject).contextClick(RightClickOnLeadAutoTestObject).build()
		.perform();
	}
	public void ClickaLeadAutoTestObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(RightClickOnLeadAutoTestObject));
		RightClickOnLeadAutoTestObject.click(); 
	}

	public void SelectRouterTypeOption(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectRouterType));
		SelectRouterType.click();
	}

	//	public void ClickOnSaveButtonCrudObject(){
	//		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SaveButtonCrudObject));
	//		SaveButtonCrudObject.click();
	//	}
	public void ClickOnSaveButtonCrudObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SaveButtonCrudObject));
		//ApproveSubmitbtn.click();
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", SaveButtonCrudObject);
	}


	public void ClickOnIntegrationsDropDown(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(IntegrationsDropDown));
		IntegrationsDropDown.click();
	}

	public void ClickOnWebhookIntegrationDropDown(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(WebhookIntegrationDropDown));
		WebhookIntegrationDropDown.click();
	}

	public void ClickOnWebhookDropDown(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(WebhookDropDown));
		WebhookDropDown.click();
	}
	public void RightClickonWebhookDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25))
		.until(ExpectedConditions.elementToBeClickable(WebhookDropDown));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(WebhookDropDown).contextClick(WebhookDropDown).build().perform();
	}

	public void ClickOnNewObject(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(NewObject));
		NewObject.click();
	}
	//****************************************Crud Operation CRM In-App****************************************


	@FindBy(xpath = "//button[@aria-label='toggle CRM In-App']")
	WebElement CRMinAppDropDown;
	@FindBy(xpath = "//button[text()='New CRM In-App ']")
	WebElement NewCRMInApp;

	@FindBy(xpath = "//textarea[@formcontrolname='EmailBody']")
	WebElement EnterEmailBodyTwilio ;

	@FindBy(xpath = "(//div[@class='st-area'])[2]")
	WebElement EnterEmailBody ;

	@FindBy(xpath = "//div[@class='st-area']")
	WebElement EnterMessageBody ;
	
	@FindBy(xpath = "//mat-icon[text()='data_object']")
	WebElement ClickOnInsertSnippetButtonForEmailBody ;

	@FindBy(xpath = "(//mat-icon[text()='data_object'])[2]")
	WebElement ClickOnInsertSnippetButtonForCRMinApp ;

	@FindBy(xpath = "(//mat-icon[text()='data_object'])[1]")
	WebElement ClickOnInsertSnippetButtonForCRMinAppp ;
	
	@FindBy(xpath = "//textarea[contains(@class,'form-control ng-dirty ng-touched ng-valid')]")
	WebElement VerificatinOfEmailBodyTextBoxBorderForEmailBody ;
	@FindBy(xpath = "//div[text()='Saved successfully']")
	WebElement SavingVerificationMessage ;

//Create New Slack 

	@FindBy(xpath = "//button[@aria-label='toggle Slack']")
	WebElement SlackDropDown;
	@FindBy(xpath = "//button[text()='New Slack ']")
	WebElement NewSlack;

	@FindBy(xpath = "//i-tabler[@name='bold']")
	WebElement ClickOnBoldButton;
	@FindBy(xpath = "//div[@class='editor']//b")
	WebElement DisplayedSelectedTextIsBold;
	
	@FindBy(xpath = "//i-tabler[@name='Italic']")
	WebElement ClickOnItalicButton;
	@FindBy(xpath = "//div[@class='editor']//b//i")
	WebElement DisplayedSelectedTextIsItalic;

	@FindBy(xpath = "//i-tabler[@name='strikethrough']")
	WebElement ClickOnStrikethroughButton;
	@FindBy(xpath = "//div[@class='editor']//b//i//strike")
	WebElement DisplayedSelectedTextIsStrikethrough;
	
	@FindBy(xpath = "//i-tabler[@name='blockquote']")
	WebElement ClickOnBlockquoteButton;
	@FindBy(xpath = "//div[@class='editor']//blockquote")
	WebElement DisplayedSelectedTextIsBlockquote;
	
	@FindBy(xpath = "//i-tabler[@name='list-numbers']")
	WebElement ClickOnListNumbersButton;
	@FindBy(xpath = "//div[@class='editor']//blockquote//ol")
	WebElement DisplayedSelectedTextIsListNumbers;
	
	@FindBy(xpath = "//i-tabler[@name='insertUnorderedList']")
	WebElement ClickOnIncertUnorderListButton;
	
	@FindBy(xpath = "//i-tabler[@name='list']")
	WebElement ClickOnListButton;
	
	@FindBy(xpath = "//div[@class='editor']//blockquote//ul")
	WebElement DisplayedSelectedTextIsIncertUnorderList;
	
	@FindBy(xpath = "//i-tabler[@name='link']")
	WebElement ClickOnLinkButton;
	
	@FindBy(xpath = "//input[@placeholder='Enter URL']")
	WebElement EnterURL;
	@FindBy(xpath = "//input[@placeholder='Enter URL']//..//i-tabler[@name='braces']")
	WebElement ClickOnBracesForURL;
	@FindBy(xpath = "//span[text()='Merge']")
	WebElement ClickOnMergeButton;
	@FindBy(xpath = "//span[text()='Add URL']")
	WebElement ClickOnAddURLButton;

	
	@FindBy(xpath = "//div[@id='editor']//a[text()]")
	WebElement DoubleClickOnLink;
	
	@FindBy(xpath = "//input[@formcontrolname='FooterBody']")
	WebElement EnterFooter;
	
	
	
	
	public void ClickOnBoldButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnBoldButton));
		ClickOnBoldButton.click();
	}
	public boolean DisplayedSelectedTextIsBold() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedSelectedTextIsBold));
			return DisplayedSelectedTextIsBold.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	
	
	public void ClickOnItalicButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnItalicButton));
		ClickOnItalicButton.click();
	}
	public boolean DisplayedSelectedTextIsItalic() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedSelectedTextIsItalic));
			return DisplayedSelectedTextIsItalic.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	
	public void ClickOnStrikethroughButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnStrikethroughButton));
		ClickOnStrikethroughButton.click();
	}
	public boolean DisplayedSelectedTextIsStrikethrough() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedSelectedTextIsStrikethrough));
			return DisplayedSelectedTextIsStrikethrough.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	
	
	public void ClickOnBlockquoteButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnBlockquoteButton));
		ClickOnBlockquoteButton.click();
	}
	public boolean DisplayedSelectedTextIsBlockquote() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedSelectedTextIsBlockquote));
			return DisplayedSelectedTextIsBlockquote.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	
	
	public void ClickOnListNumbersButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnListNumbersButton));
		ClickOnListNumbersButton.click();
	}
	public boolean DisplayedSelectedTextIsListNumbers() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedSelectedTextIsListNumbers));
			return DisplayedSelectedTextIsListNumbers.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	
	
	public void ClickOnIncertUnorderListButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnIncertUnorderListButton));
		ClickOnIncertUnorderListButton.click();
	}
	public void ClickOnListButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnListButton));
		ClickOnListButton.click();
	}
	
	public boolean DisplayedSelectedTextIsIncertUnorderList() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedSelectedTextIsIncertUnorderList));
			return DisplayedSelectedTextIsIncertUnorderList.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	
	
	public void ClickOnLinkButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnLinkButton));
		ClickOnLinkButton.click();
	}

	public void EnterURL() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(EnterURL));
		EnterURL.clear();
		EnterURL.sendKeys("https://google.com");
	}
	
	public void ClickOnBracesForURL(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnBracesForURL));
		ClickOnBracesForURL.click();
	}
	
	public void ClickOnMergeButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnMergeButton));
		ClickOnMergeButton.click();
	}
	
	public void ClickOnAddURLButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAddURLButton));
		ClickOnAddURLButton.click();
	}
	
	public void EnterFooter() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(EnterFooter));
		EnterFooter.clear();
		EnterFooter.sendKeys("For More details, access the contact in salesforce");
	}
	
	public boolean DisplayedAddURLButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(ClickOnAddURLButton));
		return ClickOnAddURLButton.isDisplayed();
	}
	
	public void DoubleClickOnLink() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DoubleClickOnLink));
		Actions actions = new Actions(ldriver);
		actions.doubleClick(DoubleClickOnLink).build().perform();
	}
	
//***	
	
	
	


	public void ClickOnNewSlack(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(NewSlack));
		NewSlack.click();
	}

	public void RightClickonSlack() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25))
		.until(ExpectedConditions.elementToBeClickable(SlackDropDown));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(SlackDropDown).contextClick(SlackDropDown).build().perform();
	}
	public boolean SavingVerificationMessage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(SavingVerificationMessage));
		return SavingVerificationMessage.isDisplayed();
	}
	public boolean VerificatinOfEmailBodyTextBoxBorderForEmailBody() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerificatinOfEmailBodyTextBoxBorderForEmailBody));
		return VerificatinOfEmailBodyTextBoxBorderForEmailBody.isDisplayed();
	}
	public void ClickOnInsertSnippetButtonForEmailBody() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnInsertSnippetButtonForEmailBody));
		ClickOnInsertSnippetButtonForEmailBody.click();
	}

	public void ClickOnInsertSnippetButtonForCRMinApp() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnInsertSnippetButtonForCRMinApp));
		ClickOnInsertSnippetButtonForCRMinApp.click();
	}
	public void ClickOnInsertSnippetButtonForCRMinAppp() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnInsertSnippetButtonForCRMinAppp));
		ClickOnInsertSnippetButtonForCRMinAppp.click();
	}
	public void EnterEmailBody() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(EnterEmailBody));
		EnterEmailBody.clear();
		EnterEmailBody.sendKeys("Automation testing is going on...");

	}
	public void EnterEmailBodyTwilio() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(EnterEmailBodyTwilio));
		EnterEmailBodyTwilio.sendKeys("Automation testing is going on...");

	}
	public void EnterMessagebody() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(EnterEmailBody));
		EnterEmailBody.sendKeys("Automation testing is going on...");

	}
	
	public void EnterMessagebodyCRMInApp() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(EnterMessageBody));
		EnterMessageBody.sendKeys("Automation testing is going on...");

	}
	
	public void ClickOnNewCRMInApp(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(NewCRMInApp));
		NewCRMInApp.click();
	}
	public void RightClickonCRMinApp() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25))
		.until(ExpectedConditions.elementToBeClickable(CRMinAppDropDown));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(CRMinAppDropDown).contextClick(CRMinAppDropDown).build().perform();
	}

	//************************************************* Twilio *************************************************************

	@FindBy(xpath = "//button[@aria-label='toggle Twilio']")
	WebElement TwilioDropDown;

	@FindBy(xpath = "//button[text()='New Twilio ']")
	WebElement NewTwilio;

	@FindBy(xpath = "//mat-checkbox[@formcontrolname='checkotsnotify']")
	WebElement ClickOnCheckBoxOTSBroadcastNotificationRecipientsTwilio;

	@FindBy(xpath = "//mat-chip-list[@formcontrolname='otsnotify']")
	WebElement EnterInputForNotificationRecipientsTwilio;

	@FindBy(xpath = "//input[@aria-checked='true']")
	WebElement VerifyCheckboxOTSBroadcastNotificationRecipientsTwilio;

	@FindBy(xpath = "//span[text()='OTS Broadcast Notification Recipients ']//..//..//..//..//..//mat-chip-list[contains(@class,'ng-valid')]")
	WebElement VerifyBorderOTSBroadcastNotificationRecipientsTwilio;

	@FindBy(xpath = "//textarea[contains(@class,'ng-valid')]")
	WebElement VerifyBorderEmailBodyTwilio;


	public boolean VerifyBorderEmailBodyTwilio() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerifyBorderEmailBodyTwilio));
		return VerifyBorderEmailBodyTwilio.isDisplayed();
	}
	public boolean VerifyBorderOTSBroadcastNotificationRecipientsTwilio() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerifyBorderOTSBroadcastNotificationRecipientsTwilio));
		return VerifyBorderOTSBroadcastNotificationRecipientsTwilio.isDisplayed();
	}
	public boolean VerifyCheckboxOTSBroadcastNotificationRecipientsTwilio() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(VerifyCheckboxOTSBroadcastNotificationRecipientsTwilio));
		return VerifyCheckboxOTSBroadcastNotificationRecipientsTwilio.isDisplayed();
	}

	public void EnterInputForNotificationRecipientsTwilio(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterInputForNotificationRecipientsTwilio));
		EnterInputForNotificationRecipientsTwilio.sendKeys("+91963852141,");
	}

	public void ClickOnCheckBoxOTSBroadcastNotificationRecipientsTwilio(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCheckBoxOTSBroadcastNotificationRecipientsTwilio));
		ClickOnCheckBoxOTSBroadcastNotificationRecipientsTwilio.click();
	}
	public void ClickNewTwilio(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(NewTwilio));
		NewTwilio.click();
	}
	public void RightClickonTwilioDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25))
		.until(ExpectedConditions.elementToBeClickable(TwilioDropDown));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(TwilioDropDown).contextClick(TwilioDropDown).build().perform();
	}

	//******************************************* Audit Log **********************************************************

	@FindBy(xpath = "(//button[@aria-label='Open calendar'])[1]")
	WebElement ClickOnCalendarButton1;

	@FindBy(xpath = "(//button[@aria-label='Open calendar'])[2]")
	WebElement ClickOnCalendarButton2;

	@FindBy(xpath = "//button[@aria-label='Choose month and year']")
	WebElement ClickOnYearButton1;

	@FindBy(xpath = "//button[@aria-label='2015']")
	WebElement ChooseAnYear1;

	@FindBy(xpath = "//button[@aria-label='2030']")
	WebElement ChooseAnYear;

	@FindBy(xpath = "//button[@aria-label='April 2015']")
	WebElement ChooseAmonth1;

	@FindBy(xpath = "//button[@aria-label='April 2030']")
	WebElement ChooseAmonth;

	@FindBy(xpath = "//button[@aria-label='April 22, 2015']")
	WebElement ChooseADate1;

	@FindBy(xpath = "//button[@aria-label='April 22, 2030']")
	WebElement ChooseADate;

	@FindBy(xpath = "//div[@class='mat-calendar-body-cell-content mat-focus-indicator mat-calendar-body-selected mat-calendar-body-today']")
	WebElement ChooseEndDate2;

	@FindBy(xpath = "//span[text()=' Search ']")
	WebElement ClickOnSearchButton;

	@FindBy(xpath = "(//button[@mattooltip='View Details'])[1]")
	WebElement ClickOnVisibilityButton;

	@FindBy(xpath = "//span[text()='Close']")
	WebElement ClickOnCloseButton;

	@FindBy(xpath = "(//div[text()=' Items per page: ']//..)[1]//mat-select[@aria-label='Items per page:']")
	WebElement ClickOnItemsPerPageDropDown;

	@FindBy(xpath = "//div[contains(text(),' 1 – 10 ')]")
	WebElement Display1to10;

	@FindBy(xpath = "//div[contains(text(),' 1 – 20 ')]")
	WebElement Display1to20;

	@FindBy(xpath = "//div[contains(text(),' 1 – 50 ')]")
	WebElement Display1to50;

	@FindBy(xpath = "//div[contains(text(),' 1 – 100 ')]")
	WebElement Display1to100;

	@FindBy(xpath = "//input[@formcontrolname='filtersearchData']")
	WebElement EnterDataInsideFilter;

	@FindBy(xpath = "//span[text()='Audit Log ']")
	WebElement ClickOnAuditLogFearure;

	@FindBy(xpath = "//mat-icon[text()='clear']")
	WebElement ClickOnClear;
	@FindBy(xpath = "//i-tabler[@name='x']")
	WebElement ClickOnCloseIconInSearchField;




	public void ClickOnCloseIconInSearchField(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCloseIconInSearchField));
		ClickOnCloseIconInSearchField.click();
	}

	public void ClickOnClear(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnClear));
		ClickOnClear.click();
	}
	public void ClickOnAuditLogFearure(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAuditLogFearure));
		ClickOnAuditLogFearure.click();
	}

	public void ClickOnCalendarButton1(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCalendarButton1));
		ClickOnCalendarButton1.click();
	}

	public void ClickOnCalendarButton2(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCalendarButton2));
		ClickOnCalendarButton2.click();
	}

	public void ClickOnYearButton1(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnYearButton1));
		ClickOnYearButton1.click();
	}

	public void ChooseAnYear1(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ChooseAnYear1));
		ChooseAnYear1.click();
	}

	public void ChooseYearButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ChooseYearButton));
		ChooseYearButton.click();
	}
	public void ChooseMonthButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ChooseMonthButton));
		ChooseMonthButton.click();
	}
	public void ChooseAnYear(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ChooseAnYear));
		ChooseAnYear.click();
	}
	public void ChooseAmonth1(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ChooseAmonth1));
		ChooseAmonth1.click();
	}

	public void ChooseAmonth(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ChooseAmonth));
		ChooseAmonth.click();
	}
	public void ChooseADate1(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ChooseADate1));
		ChooseADate1.click();
	}

	public void ChooseADate(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ChooseADate));
		ChooseADate.click();
	}
	public void ChooseEndDate2(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ChooseEndDate2));
		ChooseEndDate2.click();
	}
	public void ClickOnSearchButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSearchButton));
		ClickOnSearchButton.click();
	}

	public void ClickOnVisibilityButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnVisibilityButton));
		ClickOnVisibilityButton.click();
	}

	public void ClickOnCloseButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCloseButton));
		ClickOnCloseButton.click();
	}
	public void ClickOnItemsPerPageDropDown(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnItemsPerPageDropDown));
		ClickOnItemsPerPageDropDown.click();
	}
	public boolean Display1to10(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(Display1to10));
		return Display1to10.isDisplayed();
	}
	public boolean Display1to20(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(Display1to20));
		return Display1to20.isDisplayed();
	}
	public boolean Display1to50(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(Display1to50));
		return Display1to50.isDisplayed();
	}
	public boolean Display1to100(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(Display1to100));
		return Display1to100.isDisplayed();
	}

	public void EnterDataInsideFilter(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterDataInsideFilter));
		EnterDataInsideFilter.clear();
		EnterDataInsideFilter.sendKeys("true");
	}


	//*********************************************** Copy Account Data to Lead *****************************************

	@FindBy(xpath = "//span[text()='Add']")
	WebElement ClickOnAddButtonForCopyAccountDataToLead;

	@FindBy(xpath = "//ng-select[@formcontrolname='LeadLabel']")
	WebElement ClickOnCRMleadDropDown;
	@FindBy(xpath = "(//ng-select[@placeholder='Select CRM Lead'])[2]")
	WebElement ClickOnCRMleadDropDown2;
	@FindBy(xpath = "//ng-select[@formcontrolname='AccountLabel']")
	WebElement ClickOnCRMAccountDropDown;
	@FindBy(xpath = "(//ng-select[@placeholder='Select CRM Account'])[2]")
	WebElement ClickOnCRMAccountDropDown2;
	@FindBy(xpath = "(//div[@role='option'])[1]")
	WebElement SelectAnOption;
	@FindBy(xpath = "(//div[@role='option'])[2]")
	WebElement SelectAnOption2;
	@FindBy(xpath = "(//div[@role='option'])[4]")
	WebElement SelectAnOption4;

	@FindBy(xpath = "//div[@role='option']//span[text()='Deleted']")
	WebElement SelectCRMAccountLabelOption;
	@FindBy(xpath = "//div[@role='option']//span[text()='Converted']")
	WebElement SelectCRMLeadLabelOption;
	
	
	@FindBy(xpath = "//div[@role='option']//span[text()='Lead ID']")
	WebElement SelectLeadOption;
	@FindBy(xpath = "//div[@role='option']//span[text()='Deleted']")
	WebElement SelectDeletedOption;
	
	@FindBy(xpath = "//button//span[text()=' Save ']")
	WebElement ClickOnSaveButtonAddRowPopup;

	@FindBy(xpath = "//i-tabler[@name='trash']")
	WebElement ClickOnDeleteIcon;

	@FindBy(xpath = "//span[text()='Copy Account Data to Lead ']")
	WebElement ClickOnCopyAccountDataToLead;

	@FindBy(xpath = "//button[text()=' Delete ']")
	WebElement ClickOnDeleteButton;
	@FindBy(xpath = "//button//span[text()='Delete']")
	WebElement ClickAgainDeleteButton;
	
	@FindBy(xpath = "//button[text()=' Save ']")
	WebElement ClickOnSaveButton;
	@FindBy(xpath = "//i-tabler[@name='trash']")
	WebElement DisplayedDeleteButton;
	@FindBy(xpath = "//i-tabler[@name='edit']")
	WebElement DisplayedEditButton;
	@FindBy(xpath = "//h5[text()='No record found']")
	WebElement DisplayedNoRecordsFound;
	@FindBy(xpath = "//div[contains(text(),'Deleted Successfully')]")
	WebElement DisplayDeletedSuccessfuly;
	@FindBy(xpath = "//div[text()='Mapped Successfully']")
	WebElement DisplayedSuccessMessage;
	@FindBy(xpath = "//div[text()='Mapping Already Present']")
	WebElement DisplayedMappingAlreadyPresentMessage;

	@FindBy(xpath = "//div[text()='Data type must be match']")
	WebElement DispalyDataTypeMissMatchWarningMessage;

	@FindBy(xpath = "//div[text()='Updated Successfully']")
	WebElement DisplayedUpdateSuccessMessage;

	@FindBy(xpath = "(//i-tabler[@name='edit'])[1]")
	WebElement ClickOnEditIcon;

	@FindBy(xpath = "(//label[text()='Active'])[1]")
	WebElement DisplayedActiveStatus;

	@FindBy(xpath = "(//span[text()=' Update only blank fields ']//..)[1]")
	WebElement ClickOnUpdateOnlyBlankFieldsCheckBox;
	@FindBy(xpath = "//button//span[text()='Confirm']")
	WebElement ClickOnConfirm;
	@FindBy(xpath = "//div[text()='Native Enable Updated']")
	WebElement DisplayedConfirmSuccessMessage;
	
	@FindBy(xpath = "//mat-icon[text()='warning']")
	WebElement DisplayWarningIcon;

	@FindBy(xpath = "(//div[contains(text(),'Deleted Successfully')])[2]")
	WebElement DisplayDelete;

	@FindBy(xpath = "//span[text()=' Update only blank fields ']//..//..//..//mat-checkbox[contains(@class,'checkbox-checked')]")
	WebElement DisplayUpdateOnlyBlankFieldsCheckBoxChecked;

	
	
	
	
	public boolean DisplayUpdateOnlyBlankFieldsCheckBoxChecked(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(DisplayUpdateOnlyBlankFieldsCheckBoxChecked));
			return DisplayUpdateOnlyBlankFieldsCheckBoxChecked.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}

	public boolean DisplayDeleteAutoTestObjectt(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(DisplayDelete));
			return DisplayDelete.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}

	public boolean DisplayWarningIcon(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayWarningIcon));
		return DisplayWarningIcon.isDisplayed();
	}
	public void ClickOnUpdateOnlyBlankFieldsCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnUpdateOnlyBlankFieldsCheckBox));
		ClickOnUpdateOnlyBlankFieldsCheckBox.click();
	}
	public void ClickOnConfirm(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnConfirm));
		ClickOnConfirm.click();
	}
	public boolean DisplayedConfirmSuccessMessage(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedConfirmSuccessMessage));
		return DisplayedConfirmSuccessMessage.isDisplayed();
	}
	
	public boolean DisplayedActiveStatus(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedActiveStatus));
		return DisplayedActiveStatus.isDisplayed();
	}

	public void SelectLeadOption(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectLeadOption));
		SelectLeadOption.click();
	}
	public void SelectDeletedOption(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectDeletedOption));
		SelectDeletedOption.click();
	}

	public void ClickOnEditIcon(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnEditIcon));
		ClickOnEditIcon.click();
	}

	public boolean DisplayedMappingAlreadyPresentMessage(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedMappingAlreadyPresentMessage));
		return DisplayedMappingAlreadyPresentMessage.isDisplayed();
	}
	public boolean DisplayedSuccessMessage(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedSuccessMessage));
		return DisplayedSuccessMessage.isDisplayed();
	}
	public boolean DispalyDataTypeMissMatchWarningMessage(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DispalyDataTypeMissMatchWarningMessage));
		return DispalyDataTypeMissMatchWarningMessage.isDisplayed();
	}
	public boolean DisplayedUpdateSuccessMessage(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedUpdateSuccessMessage));
		return DisplayedUpdateSuccessMessage.isDisplayed();
	}

	public void ClickOnSaveButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSaveButton));
		ClickOnSaveButton.click();
	}

	public boolean DisplayedDeleteButton() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedDeleteButton));
			return DisplayedDeleteButton.isDisplayed();
		}catch(Exception e) {
			return false;
		}		
	}
	public boolean DisplayedNoRecordsFound() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedNoRecordsFound));
			return DisplayedNoRecordsFound.isDisplayed();
	}
	public boolean DisplayDeletedSuccessfuly() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayDeletedSuccessfuly));
		return DisplayDeletedSuccessfuly.isDisplayed();
}

	
	public void ClickOnDeleteButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDeleteButton));
		ClickOnDeleteButton.click();
	}
	public void ClickAgainDeleteButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickAgainDeleteButton));
		ClickAgainDeleteButton.click();
	}
	public void ClickOnAddButtonForCopyAccountDataToLead(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAddButtonForCopyAccountDataToLead));
		ClickOnAddButtonForCopyAccountDataToLead.click();
	}
	public void ClickOnCRMleadDropDown(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCRMleadDropDown));
		ClickOnCRMleadDropDown.click();
	}
	public void ClickOnCRMleadDropDown2(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCRMleadDropDown2));
		ClickOnCRMleadDropDown2.click();
	}
	public void ClickOnCRMAccountDropDown(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCRMAccountDropDown));
		ClickOnCRMAccountDropDown.click();
	}
	public void ClickOnCRMAccountDropDown2(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCRMAccountDropDown2));
		ClickOnCRMAccountDropDown2.click();
	}
	public void SelectAnOption(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectAnOption));
		SelectAnOption.click();
	}
	public void SelectAnOption2(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectAnOption2));
		SelectAnOption2.click();
	}
	public void SelectAnOption4(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectAnOption4));
		SelectAnOption4.click();
	}
	
	public void SelectCRMAccountLabelOption(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectCRMAccountLabelOption));
		SelectCRMAccountLabelOption.click();
	}
	public void SelectCRMLeadLabelOption(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectCRMLeadLabelOption));
		SelectCRMLeadLabelOption.click();
	}
	
	
	public void ClickOnSaveButtonAddRowPopup(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSaveButtonAddRowPopup));
		ClickOnSaveButtonAddRowPopup.click();
	}
	public void ClickOnDeleteIcon(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDeleteIcon));
		ClickOnDeleteIcon.click();
	}
	public void ClickOnCopyAccountDataToLead(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCopyAccountDataToLead));
		ClickOnCopyAccountDataToLead.click();
	}


	//*********************************************** Auto Conversion *****************************************

	@FindBy(xpath = "//button[@type='submit']//span[text()=' Rename ']")
	WebElement ClickOnRenameButton;
	
	@FindBy(xpath = "//span[text()='Auto Conversion ']")
	WebElement RightClickOnAutoConversion;
	@FindBy(xpath = "//button[@aria-label='toggle Auto Conversion']")
	WebElement ClickOnAutoConversionDropDown;
	@FindBy(xpath = "(//div[text()='Only upto 3 auto conversion rules can be created'])[1]")
	WebElement DisplayErrorMessage;

	@FindBy(xpath = "(//i[contains(@class,'IsApproved-1')])[1]")
	WebElement VerifyApprovedSign;
	@FindBy(xpath = "//span[text()='AutoTestObject ']//i[contains(@class,'IsApproved-1')]")
	WebElement VerifyApprovedSignForAutoTestObject;
	@FindBy(xpath = "(//i[contains(@class,'IsObjectEdited-1')])[1]")
	WebElement VerifyEditSign;

	@FindBy(xpath = "//span[text()='AutoTestObject ']//i[contains(@class,'IsObjectEdited-1')]")
	WebElement VerifyEditSignForAutoTestObject;
	@FindBy(xpath = "(//i[contains(@class,'IsApproved-1')])[1]")
	WebElement ClickApprovedObject;
	@FindBy(xpath = "(//i[contains(@class,'IsObjectEdited-1')])[1]")
	WebElement ClickEditObject;
	@FindBy(xpath = "(//mat-icon[text()='clear'])[1]")
	WebElement ClickOnClearIcon;

	@FindBy(xpath = "//span[text()=' Approve ']")
	WebElement ApproveTheObjectAfterEdit;
	@FindBy(xpath = "//span[text()='Edit ']")
	WebElement ClickOnEditButton;

	@FindBy(xpath = "//mat-icon[text()='folder']")
	WebElement ClickOnAutoPreferenceFolder;


	@FindBy(xpath = "//div[@cdkdragboundary='.example-boundary']")
	WebElement AddField;
	@FindBy(xpath = "//span[text()='Merge Leads With Contact']")
	WebElement DNDMergeLeadsWithContact;
	@FindBy(xpath = "//span[text()='Convert Lead To Contact']")
	WebElement DNDConvertLeadToContact;
	@FindBy(xpath = "//span[text()='Convert Lead To Contact And Account']")
	WebElement DNDConvertLeadToContactAndAccount;
	@FindBy(xpath = "//span[text()='Create Opp While Merging']")
	WebElement DNDCreateOppWhileMerging;

	@FindBy(xpath = "((//label[text()='Merge existing leads to matching contact']//..)[1]//select[@name='seldropDown']//option)[2]")
	WebElement SelectMergeLeadswithContactOption;
	@FindBy(xpath = "((//label[text()=' Convert leads into contact if a matching account is found']//..)[1]//select[@name='seldropDown']//option)[2]")
	WebElement SelectConvertLeadtoContactOption;

	@FindBy(xpath = "((//label[text()='Convert leads into contact and account if no matching account is found']//..)[1]//select[@name='seldropDown']//option)[2]")
	WebElement SelectConvertLeadtoContactandAccountOption;

	@FindBy(xpath = "((//label[text()='Create Opp While Merging']//..)[1]//select[@name='seldropDown']//option)[2]")
	WebElement SelectCreateOppWhileMergingOption;

	@FindBy(xpath = "//span[text()='AutoTestObject_Rename ']")
	WebElement DisplayedRennameAutoTestObject;

	@FindBy(xpath = "//span[text()='AutoTestObject ']")
	WebElement DisplayedAutoTestObject;

	@FindBy(xpath = "//button[@aria-label='toggle Auto Conversion']")
	WebElement ClickOnAutoConversion;
	@FindBy(xpath = "//span[text()='Auto Conversion ']")
	WebElement ClickOnAutoConversionFeature;

	@FindBy(xpath = "//span[text()='Edit ']")
	WebElement ClickOnEditButtton;

	@FindBy(xpath = "(//span[text()='AutoTestObject '])[1]")
	WebElement DisplayAutoTestObject;

	@FindBy(xpath = "//li[text()=' Draft ']")
	WebElement ClickOnDraftButton;


	
	public void ClickOnRenameButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnRenameButton));
		//ClickOnRenameButton.click();
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", ClickOnRenameButton);
	}

	public void ClickOnDraftButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDraftButton));
		ClickOnDraftButton.click();
	}

	public boolean DisplayAutoTestObject() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(DisplayAutoTestObject));
			return DisplayAutoTestObject.isDisplayed();
		}catch(Exception e) {
			return false;
		}		
	}
	public void ClickOnEditButtton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnEditButtton));
		ClickOnEditButtton.click();
	}

	public void ApproveTheObjectAfterEdit(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ApproveTheObjectAfterEdit));
		ApproveTheObjectAfterEdit.click();
	}


	public void ClickOnAutoConversion(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAutoConversion));
		ClickOnAutoConversion.click();
	}
	public void ClickOnAutoConversionFeature(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAutoConversionFeature));
		ClickOnAutoConversionFeature.click();
	}
	public void ContextVerifyEditSignObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(VerifyEditSign));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(VerifyEditSign).click(VerifyEditSign).contextClick(VerifyEditSign).build().perform();
	}

	public void ContextApprovedSignObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(VerifyApprovedSign));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(VerifyApprovedSign).click(VerifyApprovedSign).contextClick(VerifyApprovedSign).build().perform();
	}


	public boolean DisplayedRennameAutoTestObject() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedRennameAutoTestObject));
			return DisplayedRennameAutoTestObject.isDisplayed();
		}catch(Exception e) {
			return false;
		}		
	}
	public boolean DisplayedAutoTestObject() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedAutoTestObject));
			return DisplayedAutoTestObject.isDisplayed();
		}catch(Exception e) {
			return false;
		}		
	}
	public void SelectCreateOppWhileMergingOption(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectCreateOppWhileMergingOption));
		SelectCreateOppWhileMergingOption.click();
	}
	public void SelectConvertLeadtoContactandAccountOption(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectConvertLeadtoContactandAccountOption));
		SelectConvertLeadtoContactandAccountOption.click();
	}
	public void SelectConvertLeadtoContactOption(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectConvertLeadtoContactOption));
		SelectConvertLeadtoContactOption.click();
	}
	public void SelectMergeLeadswithContactOption(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectMergeLeadswithContactOption));
		SelectMergeLeadswithContactOption.click();
	}
	public void DNDCreateOppWhileMerging() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DNDCreateOppWhileMerging));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(DNDCreateOppWhileMerging).pause(Duration.ofSeconds(0)).clickAndHold(DNDCreateOppWhileMerging)
		.pause(Duration.ofSeconds(0))
		.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}
	public void DNDConvertLeadToContactAndAccount() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DNDConvertLeadToContactAndAccount));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(DNDConvertLeadToContactAndAccount).pause(Duration.ofSeconds(0)).clickAndHold(DNDConvertLeadToContactAndAccount)
		.pause(Duration.ofSeconds(0))
		.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}
	public void DNDConvertLeadToContact() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DNDConvertLeadToContact));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(DNDConvertLeadToContact).pause(Duration.ofSeconds(0)).clickAndHold(DNDConvertLeadToContact)
		.pause(Duration.ofSeconds(0))
		.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}
	public void DNDMergeLeadsWithContact() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DNDMergeLeadsWithContact));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(DNDMergeLeadsWithContact).pause(Duration.ofSeconds(0)).clickAndHold(DNDMergeLeadsWithContact)
		.pause(Duration.ofSeconds(0))
		.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}
	public void ClickOnAutoPreferenceFolder(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAutoPreferenceFolder));
		ClickOnAutoPreferenceFolder.click();
	}
	public void ClickOnEditButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnEditButton));
		ClickOnEditButton.click();
	}
	public void ClickOnClearIcon(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnClearIcon));
		ClickOnClearIcon.click();
	}

	public void ClickApprovedObject(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickApprovedObject));
		ClickApprovedObject.click();
	}
	public void ClickApprovedAutoTestObject(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(VerifyApprovedSignForAutoTestObject));
		ClickApprovedObject.click();
	}
	public void ClickEditObject(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickEditObject));
		ClickEditObject.click();
	}
	public void RightClickOnAutoConversion() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(RightClickOnAutoConversion));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(RightClickOnAutoConversion).contextClick(RightClickOnAutoConversion).build().perform();
	}
	public void ClickOnAutoConversionDropDown(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAutoConversionDropDown));
		ClickOnAutoConversionDropDown.click();
	}

	public boolean DisplayClearIcon() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ClickOnClearIcon));
			return ClickOnClearIcon.isDisplayed();
		}catch(Exception e) {
			return false;
		}		
	}
	public boolean DisplayErrorMessage() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayErrorMessage));
			return DisplayErrorMessage.isDisplayed();
		}catch(Exception e) {
			return false;
		}		
	}
	public boolean VerifyApprovedSign(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(VerifyApprovedSign));
			return VerifyApprovedSign.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}

	public boolean VerifyApprovedSignForAutoTestObject(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(VerifyApprovedSignForAutoTestObject));
			return VerifyApprovedSignForAutoTestObject.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}

	public boolean VerifyEditSign(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(VerifyEditSign));
			return VerifyEditSign.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}

	public boolean VerifyEditSignForAutoTestObject(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(VerifyEditSignForAutoTestObject));
			return VerifyEditSignForAutoTestObject.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}


	//******************************************************Holiday*********************************************************


	@FindBy(xpath = "//span[text()='Holiday ']")
	WebElement ClickOnHoliday;

	@FindBy(xpath = "//span[text()='Add Holiday']")
	WebElement ClickOnAddHolidayButton;
	@FindBy(xpath = "//input[@formcontrolname='title']")
	WebElement EnterHolidayTitle;
	@FindBy(xpath = "//textarea[@formcontrolname='description']")
	WebElement EnterHolidayDescription;

	@FindBy(xpath = "(//mat-icon[text()='expand_more'])[1]")
	WebElement ClickOnDrodownToChangeYearORmonth;

	@FindBy(xpath = "//button[text()='year']")
	WebElement ChooseYearButton;

	@FindBy(xpath = "//button[text()='month']")
	WebElement ChooseMonthButton;

	@FindBy(xpath = "(//mat-icon[text()='expand_more'])[2]")
	WebElement ClickOnDrodownToChangeYear;

	@FindBy(xpath = "//button[text()='2030']")
	WebElement SelectTheYear;

	@FindBy(xpath = "//span[text()='Save']")
	WebElement ClickOnSaveButtonForHoliday;

	@FindBy(xpath = "(//div[text()='Added Successfully'])[1]")
	WebElement DisplayedSuccesMessage;

	@FindBy(xpath = "(//h3[text()='Automation']//..//..)[1]//span[text()='Edit']")
	WebElement ClickOnEditButtonForHoliday;

	@FindBy(xpath = "//span[text()='Cancel']")
	WebElement ClickOnCancelButtonForHoliday;

	@FindBy(xpath = "(//h3[text()='Automation']//..//..)[1]//span[text()='Delete']")
	WebElement ClickOnDeleteButtonForHoliday;

	@FindBy(xpath = "//span[text()='Update']")
	WebElement ClickOnUpdateButton;

	@FindBy(xpath = "(//div[text()='Update Successfully'])[1]")
	WebElement DisplayedUpdatedSuccesMessage;

	@FindBy(xpath = "//h3[text()='Automation']")
	WebElement DisplayedAutomationHolidayObject;



	@FindBy(xpath = "//p[text()='Are you sure, you want to delete ?']//..//..//span[text()='Delete']")
	WebElement ClickOnDeletebutton;

	@FindBy(xpath = "(//div[contains(text(),'Delete Successfully')])[2]")
	WebElement DisplayedDeleteMessage;




	public boolean DisplayedDeleteMessage(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedDeleteMessage));
		return DisplayedDeleteMessage.isDisplayed();
	}


	public void ClickOnDeletebutton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDeletebutton));
		ClickOnDeletebutton.click();
	}			

	public void ClickOnDeleteButtonForHoliday(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDeleteButtonForHoliday));
		ClickOnDeleteButtonForHoliday.click();
	}
	public boolean DisplayedAutomationHolidayObject(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedAutomationHolidayObject));
			return DisplayedAutomationHolidayObject.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}

	public boolean DisplayedUpdatedSuccesMessage(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedUpdatedSuccesMessage));
		return DisplayedUpdatedSuccesMessage.isDisplayed();
	}
	public void ClickOnUpdateButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnUpdateButton));
		ClickOnUpdateButton.click();
	}
	public void ClickOnEditButtonForHoliday(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnEditButtonForHoliday));
		ClickOnEditButtonForHoliday.click();
	}

	public boolean DisplayedSuccesMessage(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedSuccesMessage));
		return DisplayedSuccesMessage.isDisplayed();
	}
	public void ClickOnSaveButtonForHoliday(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSaveButtonForHoliday));
		ClickOnSaveButtonForHoliday.click();
	}
	public void SelectTheYear(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectTheYear));
		SelectTheYear.click();
	}
	public void ClickOnDrodownToChangeYear(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDrodownToChangeYearORmonth));
		ClickOnDrodownToChangeYear.click();
	}
	public void ClickOnDrodownToChangeYearORmonth(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDrodownToChangeYearORmonth));
		ClickOnDrodownToChangeYearORmonth.click();
	}
	public void ClickOnHoliday(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnHoliday));
		ClickOnHoliday.click();
	}
	public void ClickOnAddHolidayButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAddHolidayButton));
		ClickOnAddHolidayButton.click();
	}
	public void EnterHolidayTitle(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterHolidayTitle));
		EnterHolidayTitle.clear();
		EnterHolidayTitle.sendKeys("Automation");
	}
	public void EnterHolidayDescription(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterHolidayDescription));
		EnterHolidayDescription.clear();
		EnterHolidayDescription.sendKeys("Automation testing is Going On...");
	}
	public void EditHolidayDescription(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterHolidayDescription));
		EnterHolidayDescription.clear();
		EnterHolidayDescription.sendKeys("Automation Testing");
	}
	public void EditHolidayTitle(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterHolidayTitle));
		EnterHolidayTitle.clear();
		EnterHolidayTitle.sendKeys(randomString);
	}
	
	public void ClickOnCancelButtonForHoliday(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCancelButtonForHoliday));
		ClickOnCancelButtonForHoliday.click();
	}


	//******************************************************Company Preferences*********************************************************

	@FindBy(xpath = "//button[@aria-label='toggle Preference']")
	WebElement ClickOnDropdownForPreference;



	@FindBy(xpath = "//input[@id='file']")
	WebElement ClickOnLogoInput;
	@FindBy(xpath = "//span[text()=' Upload ']")
	WebElement ClickOnUploadButton;
	@FindBy(xpath = "(//div[text()='File Uploaded Successfully'])[2]")
	WebElement DisplyedFileUploadSuccessMessage;

	@FindBy(xpath = "//label[text()='Company Logo']//..//i-tabler[@name='info-circle']")
	public WebElement CompanyLogoToolTipIcon;
	@FindBy(xpath = "//img[@src='../../../../assets/img/LACalendarLogo.png']")
	WebElement DisplayedCompanyLogoToolTip;


	@FindBy(xpath = "//input[@formcontrolname='name']")
	WebElement EnterCompanyOrClientName;

	
	@FindBy(xpath = "//label[text()='Company/Client Name ']//..//i-tabler[@name='info-circle']")
	public WebElement CompanyOrClientNameToolTipIcon;
	
	@FindBy(xpath = "//ng-select[@formcontrolname='timezone']")
	WebElement ClickOnTimeZoneDrodown;

	@FindBy(xpath = "//span[text()='Chennai, Kolkata, Mumbai, New Delhi (Asia/Calcutta)']")
	WebElement SelectTimeZoneOption;

	@FindBy(xpath = "//span[@title='Clear all']")
	WebElement ClearSelectedTimeZoneOption;
	@FindBy(xpath = "//span[@title='Clear all']")
	WebElement DisplayedCrossMarkInTimeZone;
	@FindBy(xpath = "//span[text()=' Save ']")
	WebElement ClickOnSaveButtonForCompanyPreference;

	@FindBy(xpath = "//label[text()='Company Logo']")
	public WebElement Click;

	@FindBy(xpath = "(//div[text()='Updated Successfully'])[2]")
	WebElement DisplayedUpdatedSuccessfullyMessage;


	@FindBy(xpath = "//i-tabler[@name='pencil']")
	WebElement ClickOnEditButtonForEitLogo;

	@FindBy(xpath = "//i-tabler[@name='trash']")
	WebElement ClickOnDeleteButtonForCompanyPreference;

	@FindBy(xpath = "//span[text()='Delete']")
	WebElement ClickOnDeleteAgainForCompanyPreference;

	@FindBy(xpath = "(//div[text()='File Deleted Successfully'])[2]")
	WebElement DisplyedFileDeletedSuccessMessage;

	@FindBy(xpath = "//span[text()='Company Preference ']")
	WebElement ClickOnCompanyPreference;
	
	@FindBy(xpath = "//span[text()='Preference ']")
	WebElement ClickOnPreference;
	
	@FindBy(xpath = "//div[@class='custom-card']//h6[text()='Company Preference']")
	WebElement CompanyPreference;
	
	@FindBy(xpath = "//span[@class='user-text mr-3']")
	WebElement FetchDateAndTime;
	
	@FindBy(xpath = "//ul[@class='tabs-row']//li[text()=' Company Preference ']")
	WebElement DisplayedCompanyPrefernceInTabsRow;
	
	@FindBy(xpath = "//span[text()='Company Preference ']")
	WebElement DisplayedCompanyPrefernceInLeftSideMenu;
	
	@FindBy(xpath = "//img[@src='../../../../assets/img/brand-path.jpg']")
	WebElement DisplayedCompanyNameToolTip;
	
	@FindBy(xpath = "//img[@class='rounded-circle']")
	WebElement ClickOnProfile;
	
	@FindBy(xpath = "//div[@class='client-type-text text-center company-name-text']")
	WebElement FetchComapnyNameFromProfile;
	//******************************** Details Tab  *****************************
	@FindBy(xpath = "//li[text()=' Detail ']")
	WebElement ClickOnDetailTab;
	
	@FindBy(xpath = "//div[text()='Last Updated On']//..//div[@class='mat-line list-value'][text()]")
	WebElement GettextLastUpdateOn;
	
	@FindBy(xpath = "//div[text()='Last Updated By']//..//div[@class='mat-line list-value'][text()]")
	WebElement GettextLastUpdatedBy;
	@FindBy(xpath = "//div[text()='Last Updated']//..//div[@class='mat-line list-value'][text()]")
	WebElement GettextLastUpdate;
	
//	@FindBy(xpath = "//div[text()='Last Updated By']//..//div[@class='mat-line'][text()]")
//	WebElement GetTextLastUpdateBy;
	
	@FindBy(xpath = "//div[text()='Used By']//..//mat-icon[text()='warning']")
	WebElement DisplayedNoRecordFound;
	
	@FindBy(xpath = "//div[text()='Used By']//..//mat-icon[@role='img'][text()=' expand_more ']")
	WebElement ClickOnUsedByDropdown;
	
	@FindBy(xpath = "((//div[text()='Used By']//..)[1]//span[@class='custom-option-content cursor-pointer'])[1]")
	public WebElement GetTextFromUsedBeRouterName;
	
	@FindBy(xpath = "(//div[contains(@class,'simple-notification ng-trigger ng-trigger-enterLeave error has-icon')])[1]//..//div[contains(@class,'sn-content ng')]")
	public WebElement GetTextFromErrorMessage;
	@FindBy(xpath = "(//div[contains(@class,'simple-notification ng-trigger ng-trigger-enterLeave error has-icon')])[1]//div[contains(text(),'Can not delete')]")
	public WebElement DisplayedCannotDeleteFromErrorMessage;
	
	@FindBy(xpath = "//span[text()=' DELETE ']")
	WebElement ClickOnDelete;

	@FindBy(xpath = "//div[contains(text(),'ID')]//i-tabler[@name='copy']")
	WebElement ClickOnCopyButton;

	@FindBy(xpath = "(//div[text()='Id copied to clipboard'])[1]")
	WebElement DisplayedCopyMessage;
	

	@FindBy(xpath = "//span[text()='Administration']//..//span[text()='expand_more']")
	WebElement ClickOnDropDownForMenutab;
	@FindBy(xpath = "//button[text()=' Lead Management']")
	WebElement ClickOnLeadManagementOption;
	@FindBy(xpath = "//button[@aria-label='toggle Lead Routing']")
	WebElement ClickOnDropDownForLeadRouting;
	@FindBy(xpath = "//button[@aria-label='toggle OTS Router']")
	WebElement ClickOnDropdownForOTSrouter;
	@FindBy(xpath="//div[@data-type='decision']")
	WebElement Decisionblock_DND;
	
	@FindBy(xpath="//div[@data-jtk-source-port-type='source']")
	WebElement DecisionBlock;
	@FindBy(xpath="//div[@data-jtk-source-port-type='source1']")
	WebElement DecisionBlockN;
	@FindBy(xpath="(//div[@data-jtk-source='true'])[1]")
	WebElement StartArrow;
	@FindBy(xpath="//div[@data-type='otsassignment']")
	WebElement OTSAssignmentBlockDND;
	
	@FindBy(xpath="(//div[@data-jtk-target-port-type='target'])[2]")
	WebElement OTSAssignmentBlock;
	@FindBy(xpath="//span[text()='Live Claim']")
	WebElement SelectLiveClaimOption;
	@FindBy(xpath="//span[text()='Route to the Owner on Master Record']")
	WebElement SelectOptionFromAssignmentOption;
	@FindBy(xpath="//span[text()='AutoTestObject']")
	WebElement SelectAutotestEmailObject;
	
	@FindBy(xpath = "(//div[@role='option'])[1]")
	WebElement SelectDefaultLeadOwnerLPWROption;
	
	@FindBy(xpath = "//i[text()='drafts']")
	WebElement ClickOnDraft;
	@FindBy(xpath = "//span[text()=' Approve ']")
	WebElement ClickOnApproveButton;
	
	@FindBy(xpath = "//button[text()=' Administration']")
	WebElement ClickOnAdministrationOption;
	
	@FindBy(xpath = "//span[text()='Lead Management']//..//span[text()='expand_more']")
	WebElement ClickOnDropDownForMenutab1;
	
	@FindBy(xpath = "//button[@aria-label='toggle Email']")
	WebElement ClickOnDropDownForEmail;
	@FindBy(xpath = "//button//span[text()='Lead:AutoTestObject ']")
	WebElement ClickOnAutoTestObject;
	
	@FindBy(xpath = "(//div[contains(@class,'simple-notification ng-trigger ng-trigger-enterLeave error has-icon')])[1]//..//div[contains(@class,'sn-content ng')]")
	WebElement DisplayedErrorMessage;
	
	@FindBy(xpath = "//button[@aria-label='toggle Slack']")
	WebElement ClickOnDropDownForSlack;
	@FindBy(xpath = "//span[text()='Slack Notification']")
	WebElement ClickOnSlackCheckBox;
	
	@FindBy(xpath = "//button[@aria-label='toggle Twilio']")
	WebElement ClickOnDropDownForTwilio;
	
	@FindBy(xpath = "//span[text()='Text Notification']")
	WebElement ClickOnTextNotificationCheckBox;
	
	@FindBy(xpath = "//ng-select[@placeholder='Select Email Template']")
	WebElement ClickOnEmailNotificationDropdown;
	
	@FindBy(xpath = "(//span[@class='custom-option-content ng-star-inserted'])[1]")
	WebElement SelectOptionFromtheDropdownLRT;
	
	@FindBy(xpath = "//span[text()=' Save']")
	WebElement ClickOnSaveButtonFordetailsPageOTSCR;
	
	
	
	
	
	
	public void ClickOnSaveButtonFordetailsPageOTSCR() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnSaveButtonFordetailsPageOTSCR));
		ClickOnSaveButtonFordetailsPageOTSCR.click();
	}
	
	public void SelectOptionFromtheDropdownLRT() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectOptionFromtheDropdownLRT));
		SelectOptionFromtheDropdownLRT.click();
	}
	public void ClickOnEmailNotificationDropdown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnEmailNotificationDropdown));
		ClickOnEmailNotificationDropdown.click();
	}
	
	
	public void ClickOnTextNotificationCheckBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnTextNotificationCheckBox));
		ClickOnTextNotificationCheckBox.click();
	}
	public void ClickOnDropDownForTwilio() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnDropDownForTwilio));
		ClickOnDropDownForTwilio.click();
	}
	public void ClickOnSlackCheckBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnSlackCheckBox));
		ClickOnSlackCheckBox.click();
	}
	public void ClickOnDropDownForSlack() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnDropDownForSlack));
		ClickOnDropDownForSlack.click();
	}
	
	public boolean DisplayedErrorMessage(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedErrorMessage));
		return DisplayedErrorMessage.isDisplayed();
	}
	
	
	public void DoubleClickOnOTSAssignmentBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(OTSAssignmentBlock));
		Actions actions = new Actions(ldriver);
		actions.doubleClick(OTSAssignmentBlock).build().perform();
		actions.doubleClick(OTSAssignmentBlock).build().perform();
		
	}
	public void ClickOnAutoTestObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnAutoTestObject));
		ClickOnAutoTestObject.click();
	}
	public void ClickOnLeadAutoTestObjectAfterRename() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(LeadAutoTestObjectAfterRename));
		LeadAutoTestObjectAfterRename.click();
	}
	public void ClickOnDropDownForEmail() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnDropDownForEmail));
		ClickOnDropDownForEmail.click();
	}
	public void ClickOnAdministrationOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnAdministrationOption));
		ClickOnAdministrationOption.click();
	}
	public void ClickOnDropDownForMenutab1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnDropDownForMenutab1));
		ClickOnDropDownForMenutab1.click();
	}
	
	public void ClickOnApproveButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnApproveButton));
		ClickOnApproveButton.click();
	}
	public void ClickOnDraft() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnDraft));
		ClickOnDraft.click();
	}
	public void SelectDefaultLeadOwnerLPWROption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(SelectDefaultLeadOwnerLPWROption));
		SelectDefaultLeadOwnerLPWROption.click();
	}
	public void SelectAutotestEmailObject(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectAutotestEmailObject));
		SelectAutotestEmailObject.click();
	}
	public void SelectOptionFromAssignmentOption(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectOptionFromAssignmentOption));
		SelectOptionFromAssignmentOption.click();
	}
	
	public void SelectLiveClaimOption(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectLiveClaimOption));
		SelectLiveClaimOption.click();
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
	public void ConnectionDecisionBlockY_To_OTSAssignmentBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DecisionBlock));
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(OTSAssignmentBlock));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(DecisionBlock)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(DecisionBlock)
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
        .moveByOffset(-350,50) 
        .moveByOffset(-350,50)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	public void DoubleClickOnDecisionBlock() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(DecisionBlock));
		Actions actions = new Actions(ldriver);
		actions.doubleClick(DecisionBlock).build().perform();
		actions.doubleClick(DecisionBlock).build().perform();
		
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
	public void Decisionblock_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(Decisionblock_DND));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(Decisionblock_DND)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(Decisionblock_DND)
        .pause(Duration.ofSeconds(1))
        .moveByOffset(-480,95) 
        .moveByOffset(-480,95)
        .pause(Duration.ofSeconds(1))
        .release().build().perform();
	}
	public void ClickOnDropdownForOTSrouter(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDropdownForOTSrouter));
		ClickOnDropdownForOTSrouter.click();
	}
	public void ClickOnLeadManagementOption(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnLeadManagementOption));
		ClickOnLeadManagementOption.click();
	}
	public void ClickOnDropDownForLeadRouting(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDropDownForLeadRouting));
		ClickOnDropDownForLeadRouting.click();
	}
	public void ClickOnDropDownForMenutab(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDropDownForMenutab));
		ClickOnDropDownForMenutab.click();
	}
	
//	public String GetTextLastUpdateBy(){
//		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(GetTextLastUpdateBy));
//		return GetTextLastUpdateBy.getText();
//	}
	public String GettextLastUpdatedOnForCopyAccountDatatoLead(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(GettextLastUpdateOn));
		return GettextLastUpdateOn.getText();
	}
	public String GettextLastUpdatedBy(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(GettextLastUpdatedBy));
		return GettextLastUpdatedBy.getText();
	}
	public String GettextLastUpdated(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(GettextLastUpdate));
		return GettextLastUpdate.getText();
	}
	public boolean DisplayedNoRecordFound(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedNoRecordFound));
		return DisplayedNoRecordFound.isDisplayed();
	}
	public void ClickOnUsedByDropdown(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnUsedByDropdown));
		 ClickOnUsedByDropdown.click();
	}
	public void ClickOnDelete(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDelete));
		ClickOnDelete.click();
	}
	public void ClickOnCopyButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCopyButton));
		ClickOnCopyButton.click();
	}
	public boolean DisplayedCopyMessage(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedCopyMessage));
		return DisplayedCopyMessage.isDisplayed();
	}
	public void ClickOnDetailTab(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDetailTab));
		ClickOnDetailTab.click();
	}
	
	public boolean DisplayedCannotDeleteFromErrorMessage(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedCannotDeleteFromErrorMessage));
		return DisplayedCannotDeleteFromErrorMessage.isDisplayed();
	}
	
	
	
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

	//****************************************  Random int generator ************************
    public static int generateRandomInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

   public int randomInt;
    public void EnterCompanyOrClientName(){
    	new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterCompanyOrClientName));
    	 randomInt = generateRandomInt(1, 10);
    	EnterCompanyOrClientName.clear();
    	EnterCompanyOrClientName.sendKeys("Vyakar Technologies Private Limited India"+randomInt);
    }
   //*********************************************

	@FindBy(xpath = "//mat-icon[text()='domain']")
	WebElement ClickOnDomainIcon;
	

	public void ClcikOnCompanyPrefernceInTabsRow(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedCompanyPrefernceInTabsRow));
		 DisplayedCompanyPrefernceInTabsRow.click();
	}
	public void ClickOnDomainIcon(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDomainIcon));
		ClickOnDomainIcon.click();
	}
	

	public String FetchComapnyNameFromProfile(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(FetchComapnyNameFromProfile));
		return FetchComapnyNameFromProfile.getText();
	}
	
	public void ClickOnProfile(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnProfile));
		ClickOnProfile.click();
	}
	
	public boolean DisplayedCompanyNameToolTip(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedCompanyNameToolTip));
		return DisplayedCompanyNameToolTip.isDisplayed();
	}
	public boolean DisplayedCompanyPrefernceInLeftSideMenu(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedCompanyPrefernceInLeftSideMenu));
		return DisplayedCompanyPrefernceInLeftSideMenu.isDisplayed();
	}
	
	public boolean DisplayedCompanyPrefernceInTabsRow(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedCompanyPrefernceInTabsRow));
		return DisplayedCompanyPrefernceInTabsRow.isDisplayed();
	}
	
	public String FetchDateAndTime(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(FetchDateAndTime));
		return FetchDateAndTime.getText();
	}
	
	public boolean DisplyedCompanyPreference(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CompanyPreference));
		return CompanyPreference.isDisplayed();
	}

	public void ClickOnTheCompanyPreference(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CompanyPreference));
		CompanyPreference.click();
	}
	public void ClickOnPreference(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnPreference));
		ClickOnPreference.click();
	}
	public void ClickOnEditButtonForEitLogo(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnEditButtonForEitLogo));
		ClickOnEditButtonForEitLogo.click();
	}

	public void ClearSelectedTimeZoneOption(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClearSelectedTimeZoneOption));
		ClearSelectedTimeZoneOption.click();
	}
	public boolean DisplayedCrossMarkInTimeZone(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedCrossMarkInTimeZone));
			return DisplayedCrossMarkInTimeZone.isDisplayed();
		} catch (Exception e) {
		return false;
		}
	}

	public boolean DisplyedFileDeletedSuccessMessage(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplyedFileDeletedSuccessMessage));
		return DisplyedFileDeletedSuccessMessage.isDisplayed();
	}

	public void ClickOnDeleteAgainForCompanyPreference(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDeleteAgainForCompanyPreference));
		ClickOnDeleteAgainForCompanyPreference.click();
	}

	public void ClickOnDeleteButtonForCompanyPreference(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDeleteButtonForCompanyPreference));
		ClickOnDeleteButtonForCompanyPreference.click();
	}


	public boolean DisplayedUpdatedSuccessfullyMessage(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedUpdatedSuccessfullyMessage));
		return DisplayedUpdatedSuccessfullyMessage.isDisplayed();
	}

	public boolean DisplyedFileUploadSuccessMessage(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplyedFileUploadSuccessMessage));
		return DisplyedFileUploadSuccessMessage.isDisplayed();
	}

	public void ClickOnUploadButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnUploadButton));
		ClickOnUploadButton.click();
	}
	public void ClickOnDropdownForPreference(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDropdownForPreference));
		ClickOnDropdownForPreference.click();
	}
	public void ClickOnCompanyPreference(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCompanyPreference));
		ClickOnCompanyPreference.click();
	}
	public void ClickOnLogoUpload(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnLogoInput));
		ClickOnLogoInput.sendKeys("C:\\LeadAngelLogo\\LeadAngel.png");
	}

	public boolean DisplayedCompanyLogoToolTip(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedCompanyLogoToolTip));
		return DisplayedCompanyLogoToolTip.isDisplayed();
	}
	

	

	public void ClickOnTimeZoneDrodown(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnTimeZoneDrodown));
		
		ClickOnTimeZoneDrodown.click();
	}
	public void SelectTimeZoneOption(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectTimeZoneOption));
		SelectTimeZoneOption.click();
	}
	public void ClickOnSaveButtonForCompanyPreference(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSaveButtonForCompanyPreference));
		ClickOnSaveButtonForCompanyPreference.click();
	}

	//******************************************************Data Cleanup Preference *********************************************************


	@FindBy(xpath = "//span[text()='Data Cleanup Preference ']")
	WebElement ClickOnDataCleanupPreference;

	@FindBy(xpath = "(//span[text()=' Merge Duplicate Leads ']//..)[1]")
	WebElement ClickOnMergeDuplicateLeadsCheckBox;
	@FindBy(xpath = "//mat-checkbox[contains(@class,'checkbox-checked')]//span[text()=' Merge Duplicate Leads ']")
	WebElement DisplayedMergeDuplicateLeadsCheckBoxIsChecked;

	@FindBy(xpath = "//span[text()=' Merge Duplicate Leads ']//..//..//..//..//..//span[@style='transform: rotate(180deg);']")
	WebElement DisplayedDropdownRotate180deg;
	@FindBy(xpath = "//span[text()=' Merge Duplicate Leads ']//..//..//..//..//..//span[@style='transform: rotate(0deg);']")
	WebElement ClickOnMergeDublicateLeadsDropdown;
	
	@FindBy(xpath = "(//span[text()=' Email Only ']//..)[1]")
	WebElement ClickOnEmailOnlyCheckBox;
	@FindBy(xpath = "//mat-checkbox[contains(@class,'checkbox-checked')]//span[text()=' Email Only ']")
	WebElement DisplayedEmailOnlyCheckBoxIsChecked;

	@FindBy(xpath = "(//span[text()=' Company Name Only (including fuzzy matching) ']//..)[1]")
	WebElement ClickOnCompanyNameOnlyCheckBox;
	@FindBy(xpath = "//mat-checkbox[contains(@class,'checkbox-checked')]//span[text()=' Company Name Only (including fuzzy matching) ']")
	WebElement DisplayedCompanyNameOnlyCheckBoxIsChecked;

	@FindBy(xpath = "(//span[text()=' Email and Company Name (including fuzzy matching) ']//..)[1]")
	WebElement ClickOnEmailAndCompanyNameCheckBox;
	@FindBy(xpath = "//mat-checkbox[contains(@class,'checkbox-checked')]//span[text()=' Email and Company Name (including fuzzy matching) ']")
	WebElement DisplayedEmailAndCompanyNameCheckBoxIsChecked;

	@FindBy(xpath = "(//span[text()=' First Name, Last Name and Company Name (including fuzzy matching) ']//..)[1]")
	WebElement ClickOnFirstNameLastNameAndCompanyNameCheckBox;
	@FindBy(xpath = "//mat-checkbox[contains(@class,'checkbox-checked')]//span[text()=' First Name, Last Name and Company Name (including fuzzy matching) ']")
	WebElement DisplayedFirstNameLastNameAndCompanyNameCheckBoxIsChecked;

	@FindBy(xpath = "(//span[text()=' First Name, Last Name and Phone Number ']//..)[1]")
	WebElement ClickOnFirstNameLastNameAndPhoneNumberCheckBox;
	@FindBy(xpath = "//mat-checkbox[contains(@class,'checkbox-checked')]//span[text()=' First Name, Last Name and Phone Number ']")
	WebElement DisplayedFirstNameLastNameAndPhoneNumberCheckBoxIsChecked;

	@FindBy(xpath = "(//span[text()=' First Name, Last Name and Email ']//..)[1]")
	WebElement ClickOnFirstNameLastNameEmailCheckBox;
	@FindBy(xpath = "//mat-checkbox[contains(@class,'checkbox-checked')]//span[text()=' First Name, Last Name and Email ']")
	WebElement DisplayedFirstNameLastNameEmailCheckBoxIsChecked;

	@FindBy(xpath = "//ng-select[@id='leadlabel']")
	WebElement ClickOnCreateDedupeGroupByDropdown;
	@FindBy(xpath = "(//div[@role='option'])[1]")
	WebElement SelectCreateDedupeGroupByOption;
	@FindBy(xpath = "(//div[@role='option'])[2]")
	WebElement SelectCreateDedupeGroupByOption2;
	
	
	@FindBy(xpath = "(//span[text()=' All these conditions must satisfy to identify duplicate. ']//..)[1]")
	WebElement ClickOnAllTheseConditionsMustSatisfyToIdentifyDuplicateRadioButton;
	@FindBy(xpath = "//mat-radio-button[contains(@class,'radio-checked')]//span[text()=' All these conditions must satisfy to identify duplicate. ']")
	WebElement DisplayedAllTheseConditionsMustSatisfyToIdentifyDuplicateRadioButtonIsClicked;

	@FindBy(xpath = "(//span[text()='New record is master lead record']//..)[1]")
	WebElement ClickOnNewRecordIsMasterLeadRecordRadioButton;
	@FindBy(xpath = "//mat-radio-button[contains(@class,'radio-checked')]//span[text()='New record is master lead record']")
	WebElement DisplayedNewRecordIsMasterLeadRecordRadioButtonIsClicked;

	@FindBy(xpath = "(//span[text()='Old record is master lead record']//..)[1]")
	WebElement ClickOnOldRecordIsMasterLeadRecordRadioButton;
	@FindBy(xpath = "//mat-radio-button[contains(@class,'radio-checked')]//span[text()='Old record is master lead record']")
	WebElement DisplayedOldRecordIsMasterLeadRecordRadioButtonIsClicked;

	@FindBy(xpath = "(//span[text()=' Lead with most recent activity is the master lead record']//..)[1]")
	WebElement ClickOnLeadWithMostRecentActivityIsTheMasterLeadRecordRadioButton;
	@FindBy(xpath = "//mat-radio-button[contains(@class,'radio-checked')]//span[text()=' Lead with most recent activity is the master lead record']")
	WebElement DisplayedLeadWithMostRecentActivityIsTheMasterLeadRecordRadioButtonIsClicked;

	@FindBy(xpath = "(//span[text()='New record is the master lead record ']//..)[1]")
	WebElement ClickOnNewRecordIsTheMasterLeadRecordRecordRadioButton;
	@FindBy(xpath = "//mat-radio-button[contains(@class,'radio-checked')]//span[text()='New record is the master lead record ']")
	WebElement DisplayedNewRecordIsTheMasterLeadRecordRecordRadioButtonIsClicked;

	@FindBy(xpath = "(//span[text()='Old record is the master lead record ']//..)[1]")
	WebElement ClickOnOldRecordIsTheMasterLeadRecordRecordRadioButton;
	@FindBy(xpath = "//mat-radio-button[contains(@class,'radio-checked')]//span[text()='Old record is the master lead record ']")
	WebElement DisplayedOldRecordIsTheMasterLeadRecordRecordRadioButtonIsClicked;

	@FindBy(xpath = "(//span[text()=' Send merged leads for routing']//..)[1]")
	WebElement ClickOnSendMergedLeadsForRoutingCheckBox;
	@FindBy(xpath = "//mat-checkbox[contains(@class,'checkbox-checked')]//span[text()=' Send merged leads for routing']")
	WebElement DisplayedSendMergedLeadsForRoutingCheckBoxIsChecked;

	//*****************Merge Duplicate Contacts 

	@FindBy(xpath = "(//span[text()=' Merge Duplicate Contacts ']//..)[1]")
	WebElement ClickOnMergeDuplicateContactsCheckBox;
	@FindBy(xpath = "//mat-checkbox[contains(@class,'checkbox-checked')]//span[text()=' Merge Duplicate Contacts ']")
	WebElement DisplayedMergeDuplicateContactsCheckBoxIsChecked;

	@FindBy(xpath = "//span[text()=' Merge Duplicate Contacts ']//..//..//..//..//..//span[@style='transform: rotate(180deg);']")
	WebElement DisplayedDropdownRotate180degDuplicateContacts;
	@FindBy(xpath = "//span[text()=' Merge Duplicate Contacts ']//..//..//..//..//..//span[@style='transform: rotate(0deg);']")
	WebElement ClickOnMergeDublicateContactsDropdown;
	
	@FindBy(xpath = "(//span[text()=' Email Only ']//..)[4]")
	WebElement ClickOnEmailOnlyCheckBoxForContact;
	@FindBy(xpath = "(//mat-checkbox[contains(@class,'checkbox-checked')]//span[text()=' Email Only '])[2]")
	WebElement DisplayedEmailOnlyCheckBoxIsCheckedForContact;

	@FindBy(xpath = "(//span[text()=' Email and Account Name (including fuzzy matching) ']//..)[1]")
	WebElement ClickOnEmailAndAccountNameCheckBox;
	@FindBy(xpath = "//mat-checkbox[contains(@class,'checkbox-checked')]//span[text()=' Email and Account Name (including fuzzy matching) ']")
	WebElement DisplayedEmailAndAccountNameCheckBoxIsChecked;

	@FindBy(xpath = "(//span[text()=' First Name, Last Name and Account Name (including fuzzy matching) ']//..)[1]")
	WebElement ClickOnFirstNameLastNameAndAccountNameCheckBox;
	@FindBy(xpath = "//mat-checkbox[contains(@class,'checkbox-checked')]//span[text()=' First Name, Last Name and Account Name (including fuzzy matching) ']")
	WebElement DisplayedFirstNameLastNameAndAccountNameCheckBoxIsChecked;

	@FindBy(xpath = "(//span[text()=' Account Name Only ']//..)[1]")
	WebElement ClickOnAccountNameOnlyCheckBox;
	@FindBy(xpath = "//mat-checkbox[contains(@class,'checkbox-checked')]//span[text()=' Account Name Only ']")
	WebElement DisplayedAccountNameOnlyCheckBoxIsChecked;

	@FindBy(xpath = "(//span[text()=' First Name, Last Name and Phone Number ']//..)[4]")
	WebElement ClickOnFirstNameLastNameAndPhoneNumberCheckBoxForContact;
	@FindBy(xpath = "(//mat-checkbox[contains(@class,'checkbox-checked')]//span[text()=' First Name, Last Name and Phone Number '])[2]")
	WebElement DisplayedFirstNameLastNameAndPhoneNumberCheckBoxIsCheckedForContact;

	@FindBy(xpath = "(//span[text()=' First Name, Last Name and Email ']//..)[4]")
	WebElement ClickOnFirstNameLastNameAndEmailCheckBoxForContact;
	@FindBy(xpath = "(//mat-checkbox[contains(@class,'checkbox-checked')]//span[text()=' First Name, Last Name and Email '])[2]")
	WebElement DisplayedFirstNameLastNameAndEmailCheckBoxIsCheckedForContact;

	@FindBy(xpath = "(//ng-select[@placeholder='Select'])[2]")
	WebElement ClickOnCreateDedupeGroupByDropdownForContact;

	@FindBy(xpath = "(//span[text()=' All these conditions must satisfy to identify duplicate. ']//..)[4]")
	WebElement ClickOnAllTheseConditionsMustSatisfyToIdentifyDuplicateCheckBoxForContact;
	@FindBy(xpath = "(//mat-radio-button[contains(@class,'radio-checked')]//span[text()=' All these conditions must satisfy to identify duplicate. '])[2]")
	WebElement DisplayedAllTheseConditionsMustSatisfyToIdentifyDuplicateRadioButtonIsClickedForContact;


	@FindBy(xpath = "(//span[text()='New record is master contact record ']//..)[1]")
	WebElement ClickOnNewRecordIsMasterContactRecordCheckBox;
	@FindBy(xpath = "//mat-radio-button[contains(@class,'radio-checked')]//span[text()='New record is master contact record ']")
	WebElement DisplayedNewRecordIsMasterContactRecordRadioButtonIsClicked;

	@FindBy(xpath = "(//span[text()='Old record is master contact record ']//..)[1]")
	WebElement ClickOnOldRecordIsMasterContactRecordCheckBox;
	@FindBy(xpath = "//mat-radio-button[contains(@class,'radio-checked')]//span[text()='Old record is master contact record ']")
	WebElement DisplayedOldRecordIsMasterContactRecordRadioButtonIsClicked;

	@FindBy(xpath = "(//span[text()=' Contact with most recent activity is the master contact record ']//..)[1]")
	WebElement ClickOnContactWithMostRecentActivityIsTheMasterContactRecordCheckBox;
	@FindBy(xpath = "//mat-radio-button[contains(@class,'radio-checked')]//span[text()=' Contact with most recent activity is the master contact record ']")
	WebElement DisplayedContactWithMostRecentActivityIsTheMasterContactRecordRadioButtonIsClicked;

	@FindBy(xpath = "(//span[text()=' New record is the master contact record ']//..)[1]")
	WebElement ClickOnNewRecordIsTheMasterContactRecordCheckBox;
	@FindBy(xpath = "//mat-radio-button[contains(@class,'radio-checked')]//span[text()=' New record is the master contact record ']")
	WebElement DisplayedNewRecordIsTheMasterContactRecordRadioButtonIsClicked;

	@FindBy(xpath = "(//span[text()=' Old record is the master contact record ']//..)[1]")
	WebElement ClickOnOldRecordIsTheMasterContactRecordCheckBox;
	@FindBy(xpath = "//mat-radio-button[contains(@class,'radio-checked')]//span[text()=' Old record is the master contact record ']")
	WebElement DisplayedOldRecordIsTheMasterContactRecordRadioButtonIsClicked; 

	@FindBy(xpath = "(//span[text()=' Send merged contact for routing ']//..)[1]")
	WebElement ClickOnSendMergedContactForRoutingCheckBox;
	@FindBy(xpath = "//mat-checkbox[contains(@class,'checkbox-checked')]//span[text()=' Send merged contact for routing ']")
	WebElement DisplayedSendMergedContactForRoutingCheckBoxIsChecked;
	@FindBy(xpath = "(//span[text()=' Save '])[2]")
	WebElement ClickOnSaveButtonForMergedublicateContact;
	
	@FindBy(xpath = "//span[text()=' Flag Duplicate Leads ']//..//..//..//..//..//..//label[text()='Upload dedupe master group ID to CRM ']//..//span[@class='ng-arrow-wrapper']")
	WebElement ClickOnUploadDedupeMasterGroupIDToCRMForFlagDupicateLeads;
	@FindBy(xpath = "//span[text()=' Flag Duplicate Contacts ']//..//..//..//..//..//..//label[text()='Upload dedupe master group ID to CRM ']//..//span[@class='ng-arrow-wrapper']")
	WebElement ClickOnUploadDedupeMasterGroupIDToCRMForFlagDupicateContacts;
	@FindBy(xpath = "//span[text()=' Flag duplicate leads against matching contact records ']//..//..//..//..//..//..//label[text()='Upload dedupe master group ID to CRM ']//..//span[@class='ng-arrow-wrapper']")
	WebElement ClickOnUploadDedupeMasterGroupIDToCRMForDuplicateLeadsAgainstMatchingContact;
	
	public void ClickOnUploadDedupeMasterGroupIDToCRMForFlagDupicateLeads(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnUploadDedupeMasterGroupIDToCRMForFlagDupicateLeads));
		ClickOnUploadDedupeMasterGroupIDToCRMForFlagDupicateLeads.click();
	}
	public void ClickOnUploadDedupeMasterGroupIDToCRMForFlagDupicateContacts(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnUploadDedupeMasterGroupIDToCRMForFlagDupicateContacts));
		ClickOnUploadDedupeMasterGroupIDToCRMForFlagDupicateContacts.click();
	}
	public void ClickOnUploadDedupeMasterGroupIDToCRMForDuplicateLeadsAgainstMatchingContact(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnUploadDedupeMasterGroupIDToCRMForDuplicateLeadsAgainstMatchingContact));
		ClickOnUploadDedupeMasterGroupIDToCRMForDuplicateLeadsAgainstMatchingContact.click();
	}
	//***************** Merge Leads against matching Contacts  

	@FindBy(xpath = "(//span[text()=' Merge Leads against matching Contacts ']//..)[1]")
	WebElement ClickOnMergeLeadsAgainstMatchingContactsCheckBox;
	@FindBy(xpath = "//mat-checkbox[contains(@class,'checkbox-checked')]//span[text()=' Merge Leads against matching Contacts ']")
	WebElement DisplayedMergeLeadsAgainstMatchingContactsCheckBoxIsChecked;
	@FindBy(xpath = "(//span[text()=' Save '])[3]")
	WebElement ClickOnSaveButtonForMergeLeadsAgainstMatchingContacts;
	
	@FindBy(xpath = "//span[text()=' Merge Leads against matching Contacts ']//..//..//..//..//..//span[@style='transform: rotate(180deg);']")
	WebElement DisplayedDropdownRotate180degLeadsAgainstMatchingContacts;
	@FindBy(xpath = "//span[text()=' Merge Leads against matching Contacts ']//..//..//..//..//..//span[@style='transform: rotate(0deg);']")
	WebElement ClickOnMergeLeadsAgainstMatchingContactsDropdown;
	
	@FindBy(xpath = "(//span[text()=' Email Only ']//..)[7]")
	WebElement ClickOnEmailOnlyCheckBoxForMatchingContact;
	@FindBy(xpath = "(//mat-checkbox[contains(@class,'checkbox-checked')]//span[text()=' Email Only '])[3]")
	WebElement DisplayedEmailOnlyCheckBoxIsCheckedForMatchingContact;

	@FindBy(xpath = "(//span[text()=' Email and Company/Account Name (including fuzzy matching) ']//..)[1]")
	WebElement ClickOnEmailAndCompanyOrAccountNameCheckBox;
	@FindBy(xpath = "//mat-checkbox[contains(@class,'checkbox-checked')]//span[text()=' Email and Company/Account Name (including fuzzy matching) ']")
	WebElement DisplayedEmailAndCompanyOrAccountNameCheckBoxIsChecked;

	@FindBy(xpath = "(//span[text()=' First Name, Last Name and Company/Account Name (including fuzzy matching) ']//..)[1]")
	WebElement ClickOnFirstNameLastNameAndCompanyOrAccountNameCheckBox;
	@FindBy(xpath = "//mat-checkbox[contains(@class,'checkbox-checked')]//span[text()=' First Name, Last Name and Company/Account Name (including fuzzy matching) ']")
	WebElement DisplayedFirstNameLastNameAndCompanyOrAccountNameCheckBoxIsChecked;

	@FindBy(xpath = "(//span[text()=' Account Name Only ']//..)[4]")
	WebElement ClickOnAccountNameOnlyCheckBoxForMatchingContact;
	@FindBy(xpath = "(//mat-checkbox[contains(@class,'checkbox-checked')]//span[text()=' Account Name Only '])[2]")
	WebElement DisplayedAccountNameOnlyCheckBoxIsCheckedForMatchingContact;

	@FindBy(xpath = "(//span[text()=' First Name, Last Name and Phone Number ']//..)[7]")
	WebElement ClickOnFirstNameLastNameAndPhoneNumberCheckBoxForMatchingContact;
	@FindBy(xpath = "(//mat-checkbox[contains(@class,'checkbox-checked')]//span[text()=' First Name, Last Name and Phone Number '])[3]")
	WebElement DisplayedFirstNameLastNameAndPhoneNumberCheckBoxIsCheckedForMatchingContact; 

	@FindBy(xpath = "(//span[text()=' First Name, Last Name and Email ']//..)[7]")
	WebElement ClickOnFirstNameLastNameAndEmailCheckBoxForMatchingContact;
	@FindBy(xpath = "(//mat-checkbox[contains(@class,'checkbox-checked')]//span[text()=' First Name, Last Name and Email '])[3]")
	WebElement DisplayedFirstNameLastNameAndEmailCheckBoxIsCheckedForMatchingContact;

	@FindBy(xpath = "(//span[text()=' All these conditions must satisfy to identify duplicate. ']//..)[7]")
	WebElement ClickOnAllTheseConditionsMustSatisfyToIdentifyDuplicateCheckBoxForMatchingContact;
	@FindBy(xpath = "(//mat-radio-button[contains(@class,'radio-checked')]//span[text()=' All these conditions must satisfy to identify duplicate. '])[3]")
	WebElement DisplayedAllTheseConditionsMustSatisfyToIdentifyDuplicateRadioButtonIsClickedForMatchingContact;

	@FindBy(xpath = "(//span[text()=' New contact record is the master record ']//..)[1]")
	WebElement ClickOnNewContactRecordIsTheMasterRecordCheckBox;
	@FindBy(xpath = "//mat-radio-button[contains(@class,'radio-checked')]//span[text()=' New contact record is the master record ']")
	WebElement DisplayedNewContactRecordIsTheMasterRecordRadioButtonIsClicked;

	@FindBy(xpath = "(//span[text()=' Existing Contact Owner owns the merged record ']//..)[1]")
	WebElement ClickOnExistingContactOwnerOwnsTheMergedRecordCheckBox;
	@FindBy(xpath = "//mat-radio-button[contains(@class,'radio-checked')]//span[text()=' Existing Contact Owner owns the merged record ']")
	WebElement DisplayedExistingContactOwnerOwnsTheMergedRecordRadioButtonIsClicked;

	@FindBy(xpath = "(//span[text()=' Existing Lead Owner owns the merged record ']//..)[1]")
	WebElement ClickOnExistingLeadOwnerOwnsTheMergedRecordCheckBox;
	@FindBy(xpath = "//mat-radio-button[contains(@class,'radio-checked')]//span[text()=' Existing Lead Owner owns the merged record ']")
	WebElement DisplayedExistingLeadOwnerOwnsTheMergedRecordRadioButtonIsClicked;

	@FindBy(xpath = "(//span[text()=' Old contact record is the master record ']//..)[1]")
	WebElement ClickOnOldContactRecordIsTheMasterRecordCheckBox;
	@FindBy(xpath = "//mat-radio-button[contains(@class,'radio-checked')]//span[text()=' Old contact record is the master record ']")
	WebElement DisplayedOldContactRecordIsTheMasterRecordRadioButtonIsClicked;

	@FindBy(xpath = "(//span[text()=' Send merged contact record for routing ']//..)[1]")
	WebElement ClickOnSendMergedContactForRoutingCheckBoxFOrMatchingContact;
	@FindBy(xpath = "//mat-checkbox[contains(@class,'checkbox-checked')]//span[text()=' Send merged contact record for routing ']")
	WebElement DisplayedSendMergedContactForRoutingCheckBoxIsCheckedFOrMatchingContact;

	//***************** Convert Leads into Contact if a matching account is found 

	@FindBy(xpath = "(//span[text()=' Convert Leads into Contact if a matching account is found ']//..)[1]")
	WebElement ClickOnConvertLeadsInToContactIfAMatchingAccountIsFoundCheckBox;
	@FindBy(xpath = "//mat-checkbox[contains(@class,'checkbox-checked')]//span[text()=' Convert Leads into Contact if a matching account is found ']")
	WebElement DisplayedConvertLeadsInToContactIfAMatchingAccountIsFoundCheckBoxIsChecked;
	
	@FindBy(xpath = "//span[text()=' Convert Leads into Contact if a matching account is found ']//..//..//..//..//..//span[@style='transform: rotate(180deg);']")
	WebElement DisplayedDropdownRotate180degLeadsInToContactIfAMatchingAccountIsFound;
	@FindBy(xpath = "//span[text()=' Convert Leads into Contact if a matching account is found ']//..//..//..//..//..//span[@style='transform: rotate(0deg);']")
	WebElement ClickOnConvertLeadsInToContactIfAMatchingAccountIsFoundDropdown;
	
	@FindBy(xpath = "(//span[text()=' Existing Account Owner owns the new Contact record ']//..)[1]")
	WebElement ClickOnExistingAccountOwnerOwnsTheNewContactRecordCheckBox;
	@FindBy(xpath = "//mat-radio-button[contains(@class,'radio-checked')]//span[text()=' Existing Account Owner owns the new Contact record ']")
	WebElement DisplayedExistingAccountOwnerOwnsTheNewContactRecordRadioButtonIsClicked;

	@FindBy(xpath = "(//span[text()=' Existing Lead Owner owns the new Contact record ']//..)[1]")
	WebElement ClickOnExistingLeadOwnerOwnsTheNewContactRecordCheckBox;
	@FindBy(xpath = "//mat-radio-button[contains(@class,'radio-checked')]//span[text()=' Existing Lead Owner owns the new Contact record ']")
	WebElement DisplayedExistingLeadOwnerOwnsTheNewContactRecordRadioButtonIsClicked;
	@FindBy(xpath = "(//span[text()=' Save '])[4]")
	WebElement ClickOnSaveButtonForConvertLeadsInToContactIfAMatchingAccountIsFound;
	//*****************  Convert leads into contact and account if no matching account is found  

	@FindBy(xpath = "(//span[text()=' Convert leads into contact and account if no matching account is found ']//..)[1]")
	WebElement ClickOnConvertLeadsInToContactAndAccountIfAMatchingAccountIsFoundCheckBox;
	@FindBy(xpath = "//mat-checkbox[contains(@class,'checkbox-checked')]//span[text()=' Convert leads into contact and account if no matching account is found ']")
	WebElement DisplayedConvertLeadsInToContactAndAccountIfAMatchingAccountIsFoundCheckBoxIsChecked;
	
	@FindBy(xpath = "//span[text()=' Convert leads into contact and account if no matching account is found ']//..//..//..//..//..//span[@style='transform: rotate(180deg);']")
	WebElement DisplayedDropdownRotate180degLeadsInToContactAndAccountIfAMatchingAccountIsFound;
	@FindBy(xpath = "//span[text()=' Convert leads into contact and account if no matching account is found ']//..//..//..//..//..//span[@style='transform: rotate(0deg);']")
	WebElement ClickOnConvertLeadsInToContactAndAccountIfAMatchingAccountIsFoundDropdown;
	
	@FindBy(xpath = "(//span[text()=' SFDC admin owns the new Contact and Account record ']//..)[1]")
	WebElement ClickOnSFDCAdminOwnsTheNewContactAndAccountRecordCheckBox;
	@FindBy(xpath = "//mat-radio-button[contains(@class,'radio-checked')]//span[text()=' SFDC admin owns the new Contact and Account record ']")
	WebElement DisplayedSFDCAdminOwnsTheNewContactAndAccountRecordRadioButtonIsClicked;

	@FindBy(xpath = "(//span[text()=' Existing Lead Owner owns the new Contact and Account record ']//..)[1]")
	WebElement ClickOnExistingLeadOwnerOwnsTheNewContactAndAccountRecordCheckBox;
	@FindBy(xpath = "//mat-radio-button[contains(@class,'radio-checked')]//span[text()=' Existing Lead Owner owns the new Contact and Account record ']")
	WebElement DisplayedExistingLeadOwnerOwnsTheNewContactAndAccountRecordRadioButtonIsClicked;

	@FindBy(xpath = "(//span[text()=' Save '])[1]")
	WebElement ClickOnSaveButtonForDataCleanupProcess;

	@FindBy(xpath = "(//div[text()='Updated Successfully'])[1]")
	WebElement DisplayedSuccessMessageDataCleanup;
	
	@FindBy(xpath = "//div[text()='Your preferences have been updated']")
	WebElement DisplayedSuccessMessageForDeupeFlagging;


	@FindBy(xpath = "//div[@class='custom-card']//h6[text()='Data Cleanup Preference']")
	WebElement DataCleanupPreference;
	@FindBy(xpath = "//ul[@class='tabs-row']//li[text()=' Data Cleanup Preference ']")
	WebElement DisplayedDataCleanupPreferencePrefernceInTabsRow;
	@FindBy(xpath = "//span[text()='Data Cleanup Preference ']")
	WebElement DisplayedDataCleanupCompanyPrefernceInLeftSideMenu;
	
	@FindBy(xpath = "(//span[text()=' Save '])[2]")
	WebElement ClickOnSaveButtonForConvertLeadsInToContactAndAccountIfAMatchingAccountIsFound;
	
	
	
	
	
	public boolean DisplayedDataCleanupCompanyPrefernceInLeftSideMenu(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedDataCleanupCompanyPrefernceInLeftSideMenu));
		return DisplayedDataCleanupCompanyPrefernceInLeftSideMenu.isDisplayed();
	}
	public boolean DisplayedDataCleanupPreferencePrefernceInTabsRow(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedDataCleanupPreferencePrefernceInTabsRow));
		return DisplayedDataCleanupPreferencePrefernceInTabsRow.isDisplayed();
	}
	
	public void ClickOnDataCleanupPreferenceIcon(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DataCleanupPreference));
		DataCleanupPreference.click();
	}
	public boolean DisplyedDataCleanupPreferenceIcon(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DataCleanupPreference));
		return DataCleanupPreference.isDisplayed();
	}



	public boolean DisplayedSuccessMessageDataCleanup(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedSuccessMessageDataCleanup));
		return DisplayedSuccessMessageDataCleanup.isDisplayed();	
	}

	public boolean DisplayedSuccessMessageForDeupeFlagging(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedSuccessMessageForDeupeFlagging));
		return DisplayedSuccessMessageForDeupeFlagging.isDisplayed();	
	}

	public void ClickOnSaveButtonForDataCleanupProcess(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSaveButtonForDataCleanupProcess));
		ClickOnSaveButtonForDataCleanupProcess.click();
	}


	public void ClickOnMergeLeadsAgainstMatchingContactsCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnMergeLeadsAgainstMatchingContactsCheckBox));
		ClickOnMergeLeadsAgainstMatchingContactsCheckBox.click();
	}
	public boolean DisplayedMergeLeadsAgainstMatchingContactsCheckBoxIsChecked(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedMergeLeadsAgainstMatchingContactsCheckBoxIsChecked));
			return DisplayedMergeLeadsAgainstMatchingContactsCheckBoxIsChecked.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}

	
	public boolean DisplayedDropdownRotate180degLeadsAgainstMatchingContacts(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedDropdownRotate180degLeadsAgainstMatchingContacts));
			return DisplayedDropdownRotate180degLeadsAgainstMatchingContacts.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	public void ClickOnMergeLeadsAgainstMatchingContactsDropdown(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnMergeLeadsAgainstMatchingContactsDropdown));
		ClickOnMergeLeadsAgainstMatchingContactsDropdown.click();
	}
	
	public void ClickOnEmailOnlyCheckBoxForMatchingContact(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnEmailOnlyCheckBoxForMatchingContact));
		ClickOnEmailOnlyCheckBoxForMatchingContact.click();
	}
	public boolean DisplayedEmailOnlyCheckBoxIsCheckedForMatchingContact(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedEmailOnlyCheckBoxIsCheckedForMatchingContact));
		return DisplayedEmailOnlyCheckBoxIsCheckedForMatchingContact.isDisplayed();	
	}

	public void ClickOnEmailAndCompanyOrAccountNameCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnEmailAndCompanyOrAccountNameCheckBox));
		ClickOnEmailAndCompanyOrAccountNameCheckBox.click();
	}
	public boolean DisplayedEmailAndCompanyOrAccountNameCheckBoxIsChecked(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedEmailAndCompanyOrAccountNameCheckBoxIsChecked));
		return DisplayedEmailAndCompanyOrAccountNameCheckBoxIsChecked.isDisplayed();	
	}

	public void ClickOnFirstNameLastNameAndCompanyOrAccountNameCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnFirstNameLastNameAndCompanyOrAccountNameCheckBox));
		ClickOnFirstNameLastNameAndCompanyOrAccountNameCheckBox.click();
	}
	public boolean DisplayedFirstNameLastNameAndCompanyOrAccountNameCheckBoxIsChecked(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedFirstNameLastNameAndCompanyOrAccountNameCheckBoxIsChecked));
		return DisplayedFirstNameLastNameAndCompanyOrAccountNameCheckBoxIsChecked.isDisplayed();	
	}

	public void ClickOnAccountNameOnlyCheckBoxForMatchingContact(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAccountNameOnlyCheckBoxForMatchingContact));
		ClickOnAccountNameOnlyCheckBoxForMatchingContact.click();
	}
	public boolean DisplayedAccountNameOnlyCheckBoxIsCheckedForMatchingContact(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedAccountNameOnlyCheckBoxIsCheckedForMatchingContact));
		return DisplayedAccountNameOnlyCheckBoxIsCheckedForMatchingContact.isDisplayed();	
	}

	public void ClickOnFirstNameLastNameAndPhoneNumberCheckBoxForMatchingContact(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnFirstNameLastNameAndPhoneNumberCheckBoxForMatchingContact));
		ClickOnFirstNameLastNameAndPhoneNumberCheckBoxForMatchingContact.click();
	}
	public boolean DisplayedFirstNameLastNameAndPhoneNumberCheckBoxIsCheckedForMatchingContact(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedFirstNameLastNameAndPhoneNumberCheckBoxIsCheckedForMatchingContact));
		return DisplayedFirstNameLastNameAndPhoneNumberCheckBoxIsCheckedForMatchingContact.isDisplayed();	
	}

	public void ClickOnFirstNameLastNameAndEmailCheckBoxForMatchingContact(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnFirstNameLastNameAndEmailCheckBoxForMatchingContact));
		ClickOnFirstNameLastNameAndEmailCheckBoxForMatchingContact.click();
	}
	public boolean DisplayedFirstNameLastNameAndEmailCheckBoxIsCheckedForMatchingContact(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedFirstNameLastNameAndEmailCheckBoxIsCheckedForMatchingContact));
		return DisplayedFirstNameLastNameAndEmailCheckBoxIsCheckedForMatchingContact.isDisplayed();	
	}

	public void ClickOnAllTheseConditionsMustSatisfyToIdentifyDuplicateRadioButtonForMatchingContact(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAllTheseConditionsMustSatisfyToIdentifyDuplicateCheckBoxForMatchingContact));
		ClickOnAllTheseConditionsMustSatisfyToIdentifyDuplicateCheckBoxForMatchingContact.click();
	}
	public boolean DisplayedAllTheseConditionsMustSatisfyToIdentifyDuplicateRadioButtonIsClickedForMatchingContact(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedAllTheseConditionsMustSatisfyToIdentifyDuplicateRadioButtonIsClickedForMatchingContact));
		return DisplayedAllTheseConditionsMustSatisfyToIdentifyDuplicateRadioButtonIsClickedForMatchingContact.isDisplayed();	
	}

	public void ClickOnNewContactRecordIsTheMasterRecordRadioButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnNewContactRecordIsTheMasterRecordCheckBox));
		ClickOnNewContactRecordIsTheMasterRecordCheckBox.click();
	}
	public boolean DisplayedNewContactRecordIsTheMasterRecordRadioButtonIsClicked(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedNewContactRecordIsTheMasterRecordRadioButtonIsClicked));
		return DisplayedNewContactRecordIsTheMasterRecordRadioButtonIsClicked.isDisplayed();	
	}

	public void ClickOnExistingContactOwnerOwnsTheMergedRecordRadioButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnExistingContactOwnerOwnsTheMergedRecordCheckBox));
		ClickOnExistingContactOwnerOwnsTheMergedRecordCheckBox.click();
	}
	public boolean DisplayedExistingContactOwnerOwnsTheMergedRecordRadioButtonIsClicked(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedExistingContactOwnerOwnsTheMergedRecordRadioButtonIsClicked));
		return DisplayedExistingContactOwnerOwnsTheMergedRecordRadioButtonIsClicked.isDisplayed();	
	}

	public void ClickOnExistingLeadOwnerOwnsTheMergedRecordRadioButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnExistingLeadOwnerOwnsTheMergedRecordCheckBox));
		ClickOnExistingLeadOwnerOwnsTheMergedRecordCheckBox.click();
	}
	public boolean DisplayedExistingLeadOwnerOwnsTheMergedRecordRadioButtonIsClicked(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedExistingLeadOwnerOwnsTheMergedRecordRadioButtonIsClicked));
		return DisplayedExistingLeadOwnerOwnsTheMergedRecordRadioButtonIsClicked.isDisplayed();	
	}

	public void ClickOnOldContactRecordIsTheMasterRecordRadioButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnOldContactRecordIsTheMasterRecordCheckBox));
		ClickOnOldContactRecordIsTheMasterRecordCheckBox.click();
	}
	public boolean DisplayedOldContactRecordIsTheMasterRecordRadioButtonIsClicked(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedOldContactRecordIsTheMasterRecordRadioButtonIsClicked));
		return DisplayedOldContactRecordIsTheMasterRecordRadioButtonIsClicked.isDisplayed();	
	}

	public void ClickOnSendMergedContactForRoutingCheckBoxFOrMatchingContact(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSendMergedContactForRoutingCheckBoxFOrMatchingContact));
		ClickOnSendMergedContactForRoutingCheckBoxFOrMatchingContact.click();
	}
	public boolean DisplayedSendMergedContactForRoutingCheckBoxIsCheckedFOrMatchingContact(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedSendMergedContactForRoutingCheckBoxIsCheckedFOrMatchingContact));
		return DisplayedSendMergedContactForRoutingCheckBoxIsCheckedFOrMatchingContact.isDisplayed();	
	}
	public void ClickOnSaveButtonForMergedublicateContact(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSaveButtonForMergedublicateContact));
		ClickOnSaveButtonForMergedublicateContact.click();
	}
	//************************

	public void ClickOnConvertLeadsInToContactIfAMatchingAccountIsFoundCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnConvertLeadsInToContactIfAMatchingAccountIsFoundCheckBox));
		ClickOnConvertLeadsInToContactIfAMatchingAccountIsFoundCheckBox.click();
	}
	public boolean DisplayedConvertLeadsInToContactIfAMatchingAccountIsFoundCheckBoxIsChecked(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedConvertLeadsInToContactIfAMatchingAccountIsFoundCheckBoxIsChecked));
			return DisplayedConvertLeadsInToContactIfAMatchingAccountIsFoundCheckBoxIsChecked.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}

	public boolean DisplayedDropdownRotate180degLeadsInToContactIfAMatchingAccountIsFound(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedDropdownRotate180degLeadsInToContactIfAMatchingAccountIsFound));
			return DisplayedDropdownRotate180degLeadsInToContactIfAMatchingAccountIsFound.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	public void ClickOnConvertLeadsInToContactIfAMatchingAccountIsFoundDropdown(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnConvertLeadsInToContactIfAMatchingAccountIsFoundDropdown));
		ClickOnConvertLeadsInToContactIfAMatchingAccountIsFoundDropdown.click();
	}
	public void ClickOnExistingAccountOwnerOwnsTheNewContactRecordRadioButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnExistingAccountOwnerOwnsTheNewContactRecordCheckBox));
		ClickOnExistingAccountOwnerOwnsTheNewContactRecordCheckBox.click();
	}
	public boolean DisplayedExistingAccountOwnerOwnsTheNewContactRecordRadioButtonIsClicked(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedExistingAccountOwnerOwnsTheNewContactRecordRadioButtonIsClicked));
		return DisplayedExistingAccountOwnerOwnsTheNewContactRecordRadioButtonIsClicked.isDisplayed();	
	}


	public void ClickOnExistingLeadOwnerOwnsTheNewContactRecordRadioButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnExistingLeadOwnerOwnsTheNewContactRecordCheckBox));
		ClickOnExistingLeadOwnerOwnsTheNewContactRecordCheckBox.click();
	}
	public boolean DisplayedExistingLeadOwnerOwnsTheNewContactRecordRadioButtonIsClicked(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedExistingLeadOwnerOwnsTheNewContactRecordRadioButtonIsClicked));
		return DisplayedExistingLeadOwnerOwnsTheNewContactRecordRadioButtonIsClicked.isDisplayed();	
	}
	public void ClickOnSaveButtonForMergeLeadsAgainstMatchingContacts(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSaveButtonForMergeLeadsAgainstMatchingContacts));
		ClickOnSaveButtonForMergeLeadsAgainstMatchingContacts.click();
	}
	//************************

	public void ClickOnConvertLeadsInToContactAndAccountIfAMatchingAccountIsFoundCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnConvertLeadsInToContactAndAccountIfAMatchingAccountIsFoundCheckBox));
		ClickOnConvertLeadsInToContactAndAccountIfAMatchingAccountIsFoundCheckBox.click();
	}
	public boolean DisplayedConvertLeadsInToContactAndAccountIfAMatchingAccountIsFoundCheckBoxIsChecked(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedConvertLeadsInToContactAndAccountIfAMatchingAccountIsFoundCheckBoxIsChecked));
			return DisplayedConvertLeadsInToContactAndAccountIfAMatchingAccountIsFoundCheckBoxIsChecked.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	
	public boolean DisplayedDropdownRotate180degLeadsInToContactAndAccountIfAMatchingAccountIsFound(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedDropdownRotate180degLeadsInToContactAndAccountIfAMatchingAccountIsFound));
			return DisplayedDropdownRotate180degLeadsInToContactAndAccountIfAMatchingAccountIsFound.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	public void ClickOnConvertLeadsInToContactAndAccountIfAMatchingAccountIsFoundDropdown(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnConvertLeadsInToContactAndAccountIfAMatchingAccountIsFoundDropdown));
		ClickOnConvertLeadsInToContactAndAccountIfAMatchingAccountIsFoundDropdown.click();
	}
	public void ClickOnSFDCAdminOwnsTheNewContactAndAccountRecordRadioButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSFDCAdminOwnsTheNewContactAndAccountRecordCheckBox));
		ClickOnSFDCAdminOwnsTheNewContactAndAccountRecordCheckBox.click();
	}
	public boolean DisplayedSFDCAdminOwnsTheNewContactAndAccountRecordRadioButtonIsClicked(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedSFDCAdminOwnsTheNewContactAndAccountRecordRadioButtonIsClicked));
		return DisplayedSFDCAdminOwnsTheNewContactAndAccountRecordRadioButtonIsClicked.isDisplayed();	
	}

	public void ClickOnExistingLeadOwnerOwnsTheNewContactAndAccountRecordCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnExistingLeadOwnerOwnsTheNewContactAndAccountRecordCheckBox));
		ClickOnExistingLeadOwnerOwnsTheNewContactAndAccountRecordCheckBox.click();
	}
	public boolean DisplayedExistingLeadOwnerOwnsTheNewContactAndAccountRecordRadioButtonIsClicked(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedExistingLeadOwnerOwnsTheNewContactAndAccountRecordRadioButtonIsClicked));
		return DisplayedExistingLeadOwnerOwnsTheNewContactAndAccountRecordRadioButtonIsClicked.isDisplayed();	
	}
	public void ClickOnSaveButtonForConvertLeadsInToContactAndAccountIfAMatchingAccountIsFound(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSaveButtonForConvertLeadsInToContactAndAccountIfAMatchingAccountIsFound));
		ClickOnSaveButtonForConvertLeadsInToContactAndAccountIfAMatchingAccountIsFound.click();
	}

	//************************
	public void ClickOnMergeDuplicateContactsCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnMergeDuplicateContactsCheckBox));
		ClickOnMergeDuplicateContactsCheckBox.click();
	}
	public boolean DisplayedMergeDuplicateContactsCheckBoxIsChecked(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedMergeDuplicateContactsCheckBoxIsChecked));
			return DisplayedMergeDuplicateContactsCheckBoxIsChecked.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	
	public boolean DisplayedDropdownRotate180degDuplicateContacts(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedDropdownRotate180degDuplicateContacts));
			return DisplayedDropdownRotate180degDuplicateContacts.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	public void ClickOnMergeDublicateContactsDropdown(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnMergeDublicateContactsDropdown));
		ClickOnMergeDublicateContactsDropdown.click();
	}
	public void ClickOnEmailOnlyCheckBoxForContact(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnEmailOnlyCheckBoxForContact));
		ClickOnEmailOnlyCheckBoxForContact.click();
	}
	public boolean DisplayedEmailOnlyCheckBoxIsCheckedForContact(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedEmailOnlyCheckBoxIsCheckedForContact));
		return DisplayedEmailOnlyCheckBoxIsCheckedForContact.isDisplayed();	
	}

	public void ClickOnEmailAndAccountNameCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnEmailAndAccountNameCheckBox));
		ClickOnEmailAndAccountNameCheckBox.click();
	}
	public boolean DisplayedEmailAndAccountNameCheckBoxIsChecked(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedEmailAndAccountNameCheckBoxIsChecked));
		return DisplayedEmailAndAccountNameCheckBoxIsChecked.isDisplayed();	
	}

	public void ClickOnFirstNameLastNameAndAccountNameCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnFirstNameLastNameAndAccountNameCheckBox));
		ClickOnFirstNameLastNameAndAccountNameCheckBox.click();
	}
	public boolean DisplayedFirstNameLastNameAndAccountNameCheckBoxIsChecked(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedFirstNameLastNameAndAccountNameCheckBoxIsChecked));
		return DisplayedFirstNameLastNameAndAccountNameCheckBoxIsChecked.isDisplayed();	
	}


	public void ClickOnAccountNameOnlyCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAccountNameOnlyCheckBox));
		ClickOnAccountNameOnlyCheckBox.click();
	}
	public boolean DisplayedAccountNameOnlyCheckBoxIsChecked(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedAccountNameOnlyCheckBoxIsChecked));
		return DisplayedAccountNameOnlyCheckBoxIsChecked.isDisplayed();	
	}

	public void ClickOnFirstNameLastNameAndPhoneNumberCheckBoxForContact(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnFirstNameLastNameAndPhoneNumberCheckBoxForContact));
		ClickOnFirstNameLastNameAndPhoneNumberCheckBoxForContact.click();
	}
	public boolean DisplayedFirstNameLastNameAndPhoneNumberCheckBoxIsCheckedForContact(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedFirstNameLastNameAndPhoneNumberCheckBoxIsCheckedForContact));
		return DisplayedFirstNameLastNameAndPhoneNumberCheckBoxIsCheckedForContact.isDisplayed();	
	}

	public void ClickOnFirstNameLastNameAndEmailCheckBoxForContact(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnFirstNameLastNameAndEmailCheckBoxForContact));
		ClickOnFirstNameLastNameAndEmailCheckBoxForContact.click();
	}
	public boolean DisplayedFirstNameLastNameAndEmailCheckBoxIsCheckedForContact(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedFirstNameLastNameAndEmailCheckBoxIsCheckedForContact));
		return DisplayedFirstNameLastNameAndEmailCheckBoxIsCheckedForContact.isDisplayed();	
	}

	public void ClickOnCreateDedupeGroupByDropdownForContact(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCreateDedupeGroupByDropdownForContact));
		ClickOnCreateDedupeGroupByDropdownForContact.click();
	}


	public void ClickOnAllTheseConditionsMustSatisfyToIdentifyDuplicateCheckBoxForContact(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAllTheseConditionsMustSatisfyToIdentifyDuplicateCheckBoxForContact));
		ClickOnAllTheseConditionsMustSatisfyToIdentifyDuplicateCheckBoxForContact.click();
	}
	public boolean DisplayedAllTheseConditionsMustSatisfyToIdentifyDuplicateRadioButtonIsClickedForContact(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedAllTheseConditionsMustSatisfyToIdentifyDuplicateRadioButtonIsClickedForContact));
		return DisplayedAllTheseConditionsMustSatisfyToIdentifyDuplicateRadioButtonIsClickedForContact.isDisplayed();	
	}


	public void ClickOnNewRecordIsMasterContactRecordCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnNewRecordIsMasterContactRecordCheckBox));
		ClickOnNewRecordIsMasterContactRecordCheckBox.click();
	}
	public boolean DisplayedNewRecordIsMasterContactRecordRadioButtonIsClicked(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedNewRecordIsMasterContactRecordRadioButtonIsClicked));
		return DisplayedNewRecordIsMasterContactRecordRadioButtonIsClicked.isDisplayed();	
	}

	public void ClickOnOldRecordIsMasterContactRecordCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnOldRecordIsMasterContactRecordCheckBox));
		ClickOnOldRecordIsMasterContactRecordCheckBox.click();
	}
	public boolean DisplayedOldRecordIsMasterContactRecordRadioButtonIsClicked(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedOldRecordIsMasterContactRecordRadioButtonIsClicked));
		return DisplayedOldRecordIsMasterContactRecordRadioButtonIsClicked.isDisplayed();	
	}

	public void ClickOnContactWithMostRecentActivityIsTheMasterContactRecordCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnContactWithMostRecentActivityIsTheMasterContactRecordCheckBox));
		ClickOnContactWithMostRecentActivityIsTheMasterContactRecordCheckBox.click();
	}
	public boolean DisplayedContactWithMostRecentActivityIsTheMasterContactRecordRadioButtonIsClicked(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedContactWithMostRecentActivityIsTheMasterContactRecordRadioButtonIsClicked));
		return DisplayedContactWithMostRecentActivityIsTheMasterContactRecordRadioButtonIsClicked.isDisplayed();	
	}

	public void ClickOnNewRecordIsTheMasterContactRecordCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnNewRecordIsTheMasterContactRecordCheckBox));
		ClickOnNewRecordIsTheMasterContactRecordCheckBox.click();
	}
	public boolean DisplayedNewRecordIsTheMasterContactRecordRadioButtonIsClicked(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedNewRecordIsTheMasterContactRecordRadioButtonIsClicked));
		return DisplayedNewRecordIsTheMasterContactRecordRadioButtonIsClicked.isDisplayed();	
	}


	public void ClickOnOldRecordIsTheMasterContactRecordCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnOldRecordIsTheMasterContactRecordCheckBox));
		ClickOnOldRecordIsTheMasterContactRecordCheckBox.click();
	}
	public boolean DisplayedOldRecordIsTheMasterContactRecordRadioButtonIsClicked(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedOldRecordIsTheMasterContactRecordRadioButtonIsClicked));
		return DisplayedOldRecordIsTheMasterContactRecordRadioButtonIsClicked.isDisplayed();	
	}

	public void ClickOnSendMergedContactForRoutingCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSendMergedContactForRoutingCheckBox));
		ClickOnSendMergedContactForRoutingCheckBox.click();
	}
	public boolean DisplayedSendMergedContactForRoutingCheckBoxIsChecked(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedSendMergedContactForRoutingCheckBoxIsChecked));
		return DisplayedSendMergedContactForRoutingCheckBoxIsChecked.isDisplayed();	
	}
	public void ClickOnSaveButtonForConvertLeadsInToContactIfAMatchingAccountIsFound(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSaveButtonForConvertLeadsInToContactIfAMatchingAccountIsFound));
		ClickOnSaveButtonForConvertLeadsInToContactIfAMatchingAccountIsFound.click();
	}
	//*******************

	public void ClickOnDataCleanupPreference(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDataCleanupPreference));
		ClickOnDataCleanupPreference.click();
	}


	public void ClickOnMergeDuplicateLeadsCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnMergeDuplicateLeadsCheckBox));
		ClickOnMergeDuplicateLeadsCheckBox.click();
	}
	public boolean DisplayedMergeDuplicateLeadsCheckBoxIsChecked(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedMergeDuplicateLeadsCheckBoxIsChecked));
			return DisplayedMergeDuplicateLeadsCheckBoxIsChecked.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	public boolean DisplayedDropdownRotate180deg(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedDropdownRotate180deg));
			return DisplayedDropdownRotate180deg.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	public void ClickOnMergeDublicateLeadsDropdown(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnMergeDublicateLeadsDropdown));
		ClickOnMergeDublicateLeadsDropdown.click();
	}
	
	public void ClickOnEmailOnlyCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnEmailOnlyCheckBox));
		ClickOnEmailOnlyCheckBox.click();
	}
	public boolean DisplayedEmailOnlyCheckBoxIsChecked(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedEmailOnlyCheckBoxIsChecked));
			return DisplayedEmailOnlyCheckBoxIsChecked.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}


	public void ClickOnCompanyNameOnlyCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCompanyNameOnlyCheckBox));
		ClickOnCompanyNameOnlyCheckBox.click();
	}
	public boolean DisplayedCompanyNameOnlyCheckBoxIsChecked(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedCompanyNameOnlyCheckBoxIsChecked));
			return DisplayedCompanyNameOnlyCheckBoxIsChecked.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}


	public void ClickOnEmailAndCompanyNameCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnEmailAndCompanyNameCheckBox));
		ClickOnEmailAndCompanyNameCheckBox.click();
	}
	public boolean DisplayedEmailAndCompanyNameCheckBoxIsChecked(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedEmailAndCompanyNameCheckBoxIsChecked));
			return DisplayedEmailAndCompanyNameCheckBoxIsChecked.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}


	public void ClickOnFirstNameLastNameAndCompanyNameCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnFirstNameLastNameAndCompanyNameCheckBox));
		ClickOnFirstNameLastNameAndCompanyNameCheckBox.click();
	}
	public boolean DisplayedFirstNameLastNameAndCompanyNameCheckBoxIsChecked(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedFirstNameLastNameAndCompanyNameCheckBoxIsChecked));
			return DisplayedFirstNameLastNameAndCompanyNameCheckBoxIsChecked.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}


	public void ClickOnFirstNameLastNameAndPhoneNumberCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnFirstNameLastNameAndPhoneNumberCheckBox));
		ClickOnFirstNameLastNameAndPhoneNumberCheckBox.click();
	}
	public boolean DisplayedFirstNameLastNameAndPhoneNumberCheckBoxIsChecked(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedFirstNameLastNameAndPhoneNumberCheckBoxIsChecked));
			return DisplayedFirstNameLastNameAndPhoneNumberCheckBoxIsChecked.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}


	public void ClickOnFirstNameLastNameEmailCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnFirstNameLastNameEmailCheckBox));
		ClickOnFirstNameLastNameEmailCheckBox.click();
	}
	public boolean DisplayedFirstNameLastNameEmailCheckBoxIsChecked(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedFirstNameLastNameEmailCheckBoxIsChecked));
			return DisplayedFirstNameLastNameEmailCheckBoxIsChecked.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}


	public void ClickOnCreateDedupeGroupByDropdown(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCreateDedupeGroupByDropdown));
		ClickOnCreateDedupeGroupByDropdown.click();
	}
	public void SelectCreateDedupeGroupByOption(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectCreateDedupeGroupByOption));
		SelectCreateDedupeGroupByOption.click();
	}
	public void SelectCreateDedupeGroupByOption2(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectCreateDedupeGroupByOption2));
		SelectCreateDedupeGroupByOption2.click();
	}


	public void ClickOnAllTheseConditionsMustSatisfyToIdentifyDuplicateRadioButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAllTheseConditionsMustSatisfyToIdentifyDuplicateRadioButton));
		ClickOnAllTheseConditionsMustSatisfyToIdentifyDuplicateRadioButton.click();
	}
	public boolean DisplayedAllTheseConditionsMustSatisfyToIdentifyDuplicateRadioButtonIsClicked(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedAllTheseConditionsMustSatisfyToIdentifyDuplicateRadioButtonIsClicked));
			return DisplayedAllTheseConditionsMustSatisfyToIdentifyDuplicateRadioButtonIsClicked.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}


	public void ClickOnNewRecordIsMasterLeadRecordRadioButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnNewRecordIsMasterLeadRecordRadioButton));
		ClickOnNewRecordIsMasterLeadRecordRadioButton.click();
	}
	public boolean DisplayedNewRecordIsMasterLeadRecordRadioButtonIsClicked(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedNewRecordIsMasterLeadRecordRadioButtonIsClicked));
			return DisplayedNewRecordIsMasterLeadRecordRadioButtonIsClicked.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}


	public void ClickOnOldRecordIsMasterLeadRecordRadioButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnOldRecordIsMasterLeadRecordRadioButton));
		ClickOnOldRecordIsMasterLeadRecordRadioButton.click();
	}
	public boolean DisplayedOldRecordIsMasterLeadRecordRadioButtonIsClicked(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedOldRecordIsMasterLeadRecordRadioButtonIsClicked));
			return DisplayedOldRecordIsMasterLeadRecordRadioButtonIsClicked.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}


	public void ClickOnLeadWithMostRecentActivityIsTheMasterLeadRecordRadioButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnLeadWithMostRecentActivityIsTheMasterLeadRecordRadioButton));
		ClickOnLeadWithMostRecentActivityIsTheMasterLeadRecordRadioButton.click();
	}
	public boolean DisplayedLeadWithMostRecentActivityIsTheMasterLeadRecordRadioButtonIsClicked(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedLeadWithMostRecentActivityIsTheMasterLeadRecordRadioButtonIsClicked));
			return DisplayedLeadWithMostRecentActivityIsTheMasterLeadRecordRadioButtonIsClicked.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}


	public void ClickOnNewRecordIsTheMasterLeadRecordRecordRadioButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnNewRecordIsTheMasterLeadRecordRecordRadioButton));
		ClickOnNewRecordIsTheMasterLeadRecordRecordRadioButton.click();
	}
	public boolean DisplayedNewRecordIsTheMasterLeadRecordRecordRadioButtonIsClicked(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedNewRecordIsTheMasterLeadRecordRecordRadioButtonIsClicked));
			return DisplayedNewRecordIsTheMasterLeadRecordRecordRadioButtonIsClicked.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}


	public void ClickOnOldRecordIsTheMasterLeadRecordRecordRadioButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnOldRecordIsTheMasterLeadRecordRecordRadioButton));
		ClickOnOldRecordIsTheMasterLeadRecordRecordRadioButton.click();
	}
	public boolean DisplayedOldRecordIsTheMasterLeadRecordRecordRadioButtonIsClicked(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedOldRecordIsTheMasterLeadRecordRecordRadioButtonIsClicked));
			return DisplayedOldRecordIsTheMasterLeadRecordRecordRadioButtonIsClicked.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}


	public void ClickOnSendMergedLeadsForRoutingCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSendMergedLeadsForRoutingCheckBox));
		ClickOnSendMergedLeadsForRoutingCheckBox.click();
	}
	public boolean DisplayedSendMergedLeadsForRoutingCheckBoxIsChecked(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedSendMergedLeadsForRoutingCheckBoxIsChecked));
			return DisplayedSendMergedLeadsForRoutingCheckBoxIsChecked.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}


	//******************************************************Dedupe Flagging Preference*********************************************************


	@FindBy(xpath = "//span[text()='Dedupe Flagging Preference ']")
	WebElement ClickOnDedupeFlaggingPreference;

	@FindBy(xpath = "(//span[text()=' Flag Duplicate Leads ']//..)[1]")
	WebElement ClickOnFlagDuplicateLeadsCheckBox;
	@FindBy(xpath = "//mat-checkbox[contains(@class,'checkbox-checked')]//span[text()=' Flag Duplicate Leads ']")
	WebElement DisplayedFlagDuplicateLeadsCheckBoxIsChecked;	

	
	
	@FindBy(xpath = "(//span[text()=' Newest lead is the master record ']//..)[1]")
	WebElement ClickOnNewestLeadIsTheMasterRecordRadioButton;
	@FindBy(xpath = "//mat-radio-button[contains(@class,'radio-checked')]//span[text()=' Newest lead is the master record ']")
	WebElement DisplayedNewestLeadIsTheMasterRecordRadioButtonIsClicked;		

	@FindBy(xpath = "(//span[text()=' Oldest lead is the master record ']//..)[1]")
	WebElement ClickOnOldestLeadIsTheMasterRecordRadioButton;
	@FindBy(xpath = "//mat-radio-button[contains(@class,'radio-checked')]//span[text()=' Oldest lead is the master record ']")
	WebElement DisplayedOldestLeadIsTheMasterRecordRadioButtonIsClicked;		

	@FindBy(xpath = "(//span[text()=' Lead with most recent activity is the master record ']//..)[1]")
	WebElement ClickOnLeadWithMostRecentActivityIsTheMasterRecordRadioButton;
	@FindBy(xpath = "//mat-radio-button[contains(@class,'radio-checked')]//span[text()=' Lead with most recent activity is the master record ']")
	WebElement DisplayedLeadWithMostRecentActivityIsTheMasterRecordRadioButtonIsClicked;		

	
	@FindBy(xpath = "(//span[text()=' Newest lead is the master record ']//..)[4]")
	WebElement ClickOnNewestLeadIsTheMasterRecordRadioButtonn;
	@FindBy(xpath = "//mat-radio-button[contains(@class,'radio-checked')]//span[text()=' Newest lead is the master record ']")
	WebElement DisplayedNewestLeadIsTheMasterRecordRadioButtonnIsClicked;
	
	@FindBy(xpath = "(//span[text()=' Oldest lead is the master record ']//..)[4]")
	WebElement ClickOnOldestLeadIsTheMasterRecordRadioButtonn;
	@FindBy(xpath = "//mat-radio-button[contains(@class,'radio-checked')]//span[text()=' Oldest lead is the master record ']")
	WebElement DisplayedOldestLeadIsTheMasterRecordRadioButtonnIsClicked;		
	
	
	
	
	
	//****************************	

	@FindBy(xpath = "(//mat-checkbox[contains(@class,'checkbox-checked')]//span[text()=' Account Name Only '])[1]")
	WebElement DisplayedAccountNameOnlyCheckBoxIsCheckedFlagDudupecontact;
	
	@FindBy(xpath = "(//span[text()=' Flag Duplicate Contacts ']//..)[1]")
	WebElement ClickOnFlagDuplicateContactsCheckBox;
	@FindBy(xpath = "//mat-checkbox[contains(@class,'checkbox-checked')]//span[text()=' Flag Duplicate Contacts ']")
	WebElement DisplayedFlagDuplicateContactsCheckBoxIsChecked;

	@FindBy(xpath = "(//span[text()=' Newest contact is the master record ']//..)[1]")
	WebElement ClickOnNewestContactIsTheMasterRecordRadioButton;
	@FindBy(xpath = "//mat-radio-button[contains(@class,'radio-checked')]//span[text()=' Newest contact is the master record ']")
	WebElement DisplayedNewestcontactIsTheMasterRecordRadioButtonIsClicked;	

	@FindBy(xpath = "(//span[text()=' Oldest contact is the master record ']//..)[1]")
	WebElement ClickOnOldestContactIsTheMasterRecordRadioButton;
	@FindBy(xpath = "//mat-radio-button[contains(@class,'radio-checked')]//span[text()=' Oldest contact is the master record ']")
	WebElement DisplayedOldestContactIsTheMasterRecordRadioButtonIsClicked;		

	@FindBy(xpath = "(//span[text()=' Contact with most recent activity is the master record ']//..)[1]")
	WebElement ClickOnContactWithmostRecentActivityIsTheMasterRecordRadioButton;
	@FindBy(xpath = "//mat-radio-button[contains(@class,'radio-checked')]//span[text()=' Contact with most recent activity is the master record ']")
	WebElement DisplayedContactWithmostRecentActivityIsTheMasterRecordRadioButtonIsClicked;	
	
	@FindBy(xpath = "(//span[text()=' Newest contact is the master record ']//..)[4]")
	WebElement ClickOnNewestContactIsTheMasterRecordRadioButtonn;
	@FindBy(xpath = "(//mat-radio-button[contains(@class,'radio-checked')]//span[text()=' Newest contact is the master record '])")
	WebElement DisplayedNewestContactIsTheMasterRecordRadioButtonnIsClicked;

	@FindBy(xpath = "(//span[text()=' Oldest contact is the master record ']//..)[4]")
	WebElement ClickOnOldestcontctsIsTheMasterRecordRadioButtonn;
	@FindBy(xpath = "//mat-radio-button[contains(@class,'radio-checked')]//span[text()=' Oldest contact is the master record ']")
	WebElement DisplayedOldestcontsctIsTheMasterRecordRadioButtonnIsClicked;	
	
	@FindBy(xpath = "//span[text()=' Flag Duplicate Contacts ']//..//..//..//..//..//span[@style='transform: rotate(180deg);']")
	WebElement DisplayedDropdownRotate180degFlagDuplicateContacts;
	@FindBy(xpath = "//span[text()=' Flag Duplicate Contacts ']//..//..//..//..//..//span[@style='transform: rotate(0deg);']")
	WebElement ClickOnFlagDuplicateContactsDropdown;
	
	
	//****************************	 
	@FindBy(xpath = "(//span[text()=' Flag duplicate leads against matching contact records ']//..)[1]")
	WebElement ClickOnFlagDuplicateLeadsAgainstMatchingContactRecordsCheckBox;
	@FindBy(xpath = "//mat-checkbox[contains(@class,'checkbox-checked')]//span[text()=' Flag duplicate leads against matching contact records ']")
	WebElement DisplayedFlagDuplicateLeadsAgainstMatchingContactRecordsCheckBoxIsChecked;

	@FindBy(xpath = "(//ng-select[@bindlabel='LabelName'])[1]")
	WebElement ClickOnCreateDedupeGroupByDropdownForFlagDuplicateLead;

	@FindBy(xpath = "//div[@class='custom-card']//h6[text()='Dedupe Flagging Preference']")
	WebElement DedupeFlaggingPreference;
	@FindBy(xpath = "//ul[@class='tabs-row']//li[text()=' Dedupe Flagging Preference ']")
	WebElement DisplayedDedupeFlaggingPreferenceInTabsRow;
	@FindBy(xpath = "//span[text()='Dedupe Flagging Preference ']")
	WebElement DisplayedDedupeFlaggingPreferenceInLeftSideMenu;
	
	@FindBy(xpath = "//span[text()=' Flag Duplicate Leads ']//..//..//..//..//..//span[@style='transform: rotate(180deg);']")
	WebElement DisplayedDropdownRotate180degFlagDuplicateLeads;
	@FindBy(xpath = "//span[text()=' Flag Duplicate Leads ']//..//..//..//..//..//span[@style='transform: rotate(0deg);']")
	WebElement ClickOnFlagDuplicateLeadsDropdown;
	
	@FindBy(xpath = "(//mat-checkbox[contains(@class,'checkbox-checked')]//span[text()=' Email Only '])[1]")
	WebElement DisplayedEmailOnlyCheckBoxIsCheckedForDedupeFlagging;
	
	@FindBy(xpath = "(//mat-checkbox[contains(@class,'checkbox-checked')]//span[text()=' First Name, Last Name and Phone Number '])[1]")
	WebElement DisplayedFirstNameLastNameAndPhoneNumberCheckBoxIsCheckedForFlagDuplicate;
	
	@FindBy(xpath = "(//mat-checkbox[contains(@class,'checkbox-checked')]//span[text()=' First Name, Last Name and Email '])[1]")
	WebElement DisplayedFirstNameLastNameEmailCheckBoxIsCheckedForFlagDuplicate;
	@FindBy(xpath = "(//mat-radio-button[contains(@class,'radio-checked')]//span[text()=' All these conditions must satisfy to identify duplicate. '])[1]")
	WebElement DisplayedAllTheseConditionsMustSatisfyToIdentifyDuplicateRadioButtonIsClickedForFlagDuplicate;
	

	@FindBy(xpath = "//span[text()=' Flag duplicate leads against matching contact records ']//..//..//..//..//..//span[@style='transform: rotate(180deg);']")
	WebElement DisplayedDropdownRotate180degFlagDuplicateLeadsAgainstMatchingContactRecords;
	@FindBy(xpath = "//span[text()=' Flag duplicate leads against matching contact records ']//..//..//..//..//..//span[@style='transform: rotate(0deg);']")
	WebElement ClickOnFlagDuplicateLeadsAgainstMatchingContactRecordsDropdown;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void ClickOnFlagDuplicateLeadsAgainstMatchingContactRecordsDropdown(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnFlagDuplicateLeadsAgainstMatchingContactRecordsDropdown));
		 ClickOnFlagDuplicateLeadsAgainstMatchingContactRecordsDropdown.click();	
	}
	
	public boolean DisplayedDropdownRotate180degFlagDuplicateLeadsAgainstMatchingContactRecords(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedDropdownRotate180degFlagDuplicateLeadsAgainstMatchingContactRecords));
			return DisplayedDropdownRotate180degFlagDuplicateLeadsAgainstMatchingContactRecords.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	
	public boolean DisplayedAccountNameOnlyCheckBoxIsCheckedFlagDudupecontact(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedAccountNameOnlyCheckBoxIsCheckedFlagDudupecontact));
		return DisplayedAccountNameOnlyCheckBoxIsCheckedFlagDudupecontact.isDisplayed();	
	}
	
	public void ClickOnFlagDuplicateContactsDropdown(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnFlagDuplicateContactsDropdown));
		ClickOnFlagDuplicateContactsDropdown.click();
	}
	public boolean DisplayedDropdownRotate180degFlagDuplicateContacts(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedDropdownRotate180degFlagDuplicateContacts));
			return DisplayedDropdownRotate180degFlagDuplicateContacts.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	public boolean DisplayedAllTheseConditionsMustSatisfyToIdentifyDuplicateRadioButtonIsClickedForFlagDuplicate(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedAllTheseConditionsMustSatisfyToIdentifyDuplicateRadioButtonIsClickedForFlagDuplicate));
			return DisplayedAllTheseConditionsMustSatisfyToIdentifyDuplicateRadioButtonIsClickedForFlagDuplicate.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	
	public boolean DisplayedFirstNameLastNameEmailCheckBoxIsCheckedForFlagDuplicate(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedFirstNameLastNameEmailCheckBoxIsCheckedForFlagDuplicate));
			return DisplayedFirstNameLastNameEmailCheckBoxIsCheckedForFlagDuplicate.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	
	public boolean DisplayedFirstNameLastNameAndPhoneNumberCheckBoxIsCheckedForFlagDuplicate(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedFirstNameLastNameAndPhoneNumberCheckBoxIsCheckedForFlagDuplicate));
			return DisplayedFirstNameLastNameAndPhoneNumberCheckBoxIsCheckedForFlagDuplicate.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	public boolean DisplayedEmailOnlyCheckBoxIsCheckedForDedupeFlagging(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedEmailOnlyCheckBoxIsCheckedForDedupeFlagging));
			return DisplayedEmailOnlyCheckBoxIsCheckedForDedupeFlagging.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	public void ClickOnFlagDuplicateLeadsDropdown(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnFlagDuplicateLeadsDropdown));
		ClickOnFlagDuplicateLeadsDropdown.click();
	}
	public boolean DisplayedDropdownRotate180degFlagDuplicateLeads(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedDropdownRotate180degFlagDuplicateLeads));
			return DisplayedDropdownRotate180degFlagDuplicateLeads.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	public boolean DisplayedDedupeFlaggingPreferenceInLeftSideMenu(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedDedupeFlaggingPreferenceInLeftSideMenu));
		return DisplayedDedupeFlaggingPreferenceInLeftSideMenu.isDisplayed();
	}
	public boolean DisplayedDedupeFlaggingPreferenceInTabsRow(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedDedupeFlaggingPreferenceInTabsRow));
		return DisplayedDedupeFlaggingPreferenceInTabsRow.isDisplayed();
	}
	public void ClickOnDedupeFlaggingPreferenceIcon(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DedupeFlaggingPreference));
		DedupeFlaggingPreference.click();
	}
	
	public boolean DisplyedDedupeFlaggingPreference(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DedupeFlaggingPreference));
		return DedupeFlaggingPreference.isDisplayed();
	}
	
	public void ClickOnCreateDedupeGroupByDropdownForFlagDuplicateLead(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCreateDedupeGroupByDropdownForFlagDuplicateLead));
		ClickOnCreateDedupeGroupByDropdownForFlagDuplicateLead.click();
	}
	
	public void ClickOnDedupeFlaggingPreference(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDedupeFlaggingPreference));
		ClickOnDedupeFlaggingPreference.click();
	}


	public void ClickOnFlagDuplicateLeadsCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnFlagDuplicateLeadsCheckBox));
		ClickOnFlagDuplicateLeadsCheckBox.click();
	}
	public boolean DisplayedFlagDuplicateLeadsCheckBoxIsChecked(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedFlagDuplicateLeadsCheckBoxIsChecked));
			return DisplayedFlagDuplicateLeadsCheckBoxIsChecked.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	} 


	public void ClickOnNewestLeadIsTheMasterRecordRadioButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnNewestLeadIsTheMasterRecordRadioButton));
		ClickOnNewestLeadIsTheMasterRecordRadioButton.click();
	}
	public boolean DisplayedNewestLeadIsTheMasterRecordRadioButtonIsClicked(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedNewestLeadIsTheMasterRecordRadioButtonIsClicked));
		return DisplayedNewestLeadIsTheMasterRecordRadioButtonIsClicked.isDisplayed();	
	}


	public void ClickOnOldestLeadIsTheMasterRecordRadioButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnOldestLeadIsTheMasterRecordRadioButton));
		ClickOnOldestLeadIsTheMasterRecordRadioButton.click();
	}
	public boolean DisplayedOldestLeadIsTheMasterRecordRadioButtonIsClicked(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedOldestLeadIsTheMasterRecordRadioButtonIsClicked));
		return DisplayedOldestLeadIsTheMasterRecordRadioButtonIsClicked.isDisplayed();	
	} 

	public void ClickOnLeadWithMostRecentActivityIsTheMasterRecordRadioButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnLeadWithMostRecentActivityIsTheMasterRecordRadioButton));
		ClickOnLeadWithMostRecentActivityIsTheMasterRecordRadioButton.click();
	}
	public boolean DisplayedLeadWithMostRecentActivityIsTheMasterRecordRadioButtonIsClicked(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedLeadWithMostRecentActivityIsTheMasterRecordRadioButtonIsClicked));
		return DisplayedLeadWithMostRecentActivityIsTheMasterRecordRadioButtonIsClicked.isDisplayed();	
	}  

	public void ClickOnNewestLeadIsTheMasterRecordRadioButtonn(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnNewestLeadIsTheMasterRecordRadioButtonn));
		ClickOnNewestLeadIsTheMasterRecordRadioButtonn.click();
	}
	public boolean DisplayedNewestLeadIsTheMasterRecordRadioButtonnIsClicked(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedNewestLeadIsTheMasterRecordRadioButtonnIsClicked));
		return DisplayedNewestLeadIsTheMasterRecordRadioButtonnIsClicked.isDisplayed();	
	}


	public void ClickOnOldestLeadIsTheMasterRecordRadioButtonn(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnOldestLeadIsTheMasterRecordRadioButtonn));
		ClickOnOldestLeadIsTheMasterRecordRadioButtonn.click();
	}
	public boolean DisplayedOldestLeadIsTheMasterRecordRadioButtonnIsClicked(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedOldestLeadIsTheMasterRecordRadioButtonnIsClicked));
		return DisplayedOldestLeadIsTheMasterRecordRadioButtonnIsClicked.isDisplayed();	
	} 

	//****************************

	public void ClickOnFlagDuplicateContactsCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnFlagDuplicateContactsCheckBox));
		ClickOnFlagDuplicateContactsCheckBox.click();
	}
	public boolean DisplayedFlagDuplicateContactsCheckBoxIsChecked(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedFlagDuplicateContactsCheckBoxIsChecked));
			return DisplayedFlagDuplicateContactsCheckBoxIsChecked.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	} 

	

	public void ClickOnNewestContactIsTheMasterRecordRadioButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnNewestContactIsTheMasterRecordRadioButton));
		ClickOnNewestContactIsTheMasterRecordRadioButton.click();
	}
	public boolean DisplayedNewestcontactIsTheMasterRecordRadioButtonIsClicked(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedNewestcontactIsTheMasterRecordRadioButtonIsClicked));
		return DisplayedNewestcontactIsTheMasterRecordRadioButtonIsClicked.isDisplayed();	
	}  


	public void ClickOnOldestContactIsTheMasterRecordRadioButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnOldestContactIsTheMasterRecordRadioButton));
		ClickOnOldestContactIsTheMasterRecordRadioButton.click();
	}
	public boolean DisplayedOldestContactIsTheMasterRecordRadioButtonIsClicked(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedOldestContactIsTheMasterRecordRadioButtonIsClicked));
		return DisplayedOldestContactIsTheMasterRecordRadioButtonIsClicked.isDisplayed();	
	}   



	public void ClickOnContactWithmostRecentActivityIsTheMasterRecordRadioButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnContactWithmostRecentActivityIsTheMasterRecordRadioButton));
		ClickOnContactWithmostRecentActivityIsTheMasterRecordRadioButton.click();
	}
	public boolean DisplayedContactWithmostRecentActivityIsTheMasterRecordRadioButtonIsClicked(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedContactWithmostRecentActivityIsTheMasterRecordRadioButtonIsClicked));
		return DisplayedContactWithmostRecentActivityIsTheMasterRecordRadioButtonIsClicked.isDisplayed();	
	}   

	
	public void ClickOnNewestContactIsTheMasterRecordRadioButtonn(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnNewestContactIsTheMasterRecordRadioButtonn));
		ClickOnNewestContactIsTheMasterRecordRadioButtonn.click();
	}
	public boolean DisplayedNewestContactIsTheMasterRecordRadioButtonnIsClicked(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedNewestContactIsTheMasterRecordRadioButtonnIsClicked));
		return DisplayedNewestContactIsTheMasterRecordRadioButtonnIsClicked.isDisplayed();	
	}  


	public void ClickOnOldestcontctsIsTheMasterRecordRadioButtonn(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnOldestcontctsIsTheMasterRecordRadioButtonn));
		ClickOnOldestcontctsIsTheMasterRecordRadioButtonn.click();
	}
	public boolean DisplayedOldestcontsctIsTheMasterRecordRadioButtonnIsClicked(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedOldestcontsctIsTheMasterRecordRadioButtonnIsClicked));
		return DisplayedOldestcontsctIsTheMasterRecordRadioButtonnIsClicked.isDisplayed();	
	}   
	
	
	
	
	

	//****************************

	public void ClickOnFlagDuplicateLeadsAgainstMatchingContactRecordsCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnFlagDuplicateLeadsAgainstMatchingContactRecordsCheckBox));
		ClickOnFlagDuplicateLeadsAgainstMatchingContactRecordsCheckBox.click();
	}
	public boolean DisplayedFlagDuplicateLeadsAgainstMatchingContactRecordsCheckBoxIsChecked(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedFlagDuplicateLeadsAgainstMatchingContactRecordsCheckBoxIsChecked));
			return DisplayedFlagDuplicateLeadsAgainstMatchingContactRecordsCheckBoxIsChecked.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	} 

	
	//****************************************************** RoutingPreference *********************************************************

	
	@FindBy(xpath = "//div[@class='custom-card']//h6[text()='Routing Preference']")
	WebElement RoutingPreference;
	@FindBy(xpath = "//ul[@class='tabs-row']//li[text()=' Routing Preference ']")
	WebElement DisplayedRoutingPreferenceInTabsRow;
	@FindBy(xpath = "//span[text()='Routing Preference ']")
	WebElement DisplayedRoutingPreferenceInLeftSideMenu;	
	
	@FindBy(xpath = "//mat-panel-title[text()=' Assignment Options ']//..//..//span[@style='transform: rotate(180deg);']")
	WebElement DisplayedDropdownRotate180degAssignmentOptions;
	@FindBy(xpath = "//mat-panel-title[text()=' Assignment Options ']//..//..//span[@style='transform: rotate(0deg);']")
	WebElement ClickOnAssignmentOptionsDropdown;
	

	@FindBy(xpath = "//mat-checkbox[@formcontrolname='assigntoinactiveownersmanager']")
	WebElement ClickOnAssignToInactiveOwnersManagerCheckBox;
	@FindBy(xpath = "//mat-checkbox[contains(@class,'checkbox-checked')][@formcontrolname='assigntoinactiveownersmanager']")
	WebElement DisplayedAssignToInactiveOwnersManagerCheckBoxIsChecked;
	
	@FindBy(xpath = "//mat-checkbox[@formcontrolname='reassignpartnerleads']")
	WebElement ClickOnReassignPartnerLeadsCheckBox;
	@FindBy(xpath = "//mat-checkbox[contains(@class,'checkbox-checked')][@formcontrolname='reassignpartnerleads']")
	WebElement DisplayedReassignPartnerLeadsCheckBoxIsChecked;
	
	@FindBy(xpath = "//select[@formcontrolname='reassignleaddays']//option[@value='3']")
	WebElement  SelectNumberOfInactivityDaysToReassignLeads;
	
	@FindBy(xpath = "//ng-select[@placeholder='Select Label Name']")
	WebElement  ClickOnSelectLabelNameDropdown;
	
	@FindBy(xpath = "//span[text()='CONFIRM']")
	WebElement  ClickOnConfirmButton;
	
	//***************************
	
	
	@FindBy(xpath = "//mat-panel-title[text()=' Custom Groups ']//..//..//span[@style='transform: rotate(180deg);']")
	WebElement DisplayedCustomGroups180degAssignmentOptions;
	@FindBy(xpath = "//mat-panel-title[text()=' Custom Groups ']//..//..//span[@style='transform: rotate(0deg);']")
	WebElement ClickOnCustomGroupsDropdown;
	
	
	
	@FindBy(xpath = "//label[text()='Group Leads by']//..//span[@title='Clear all']")
	WebElement DisplayedCrossMarkForGroupLeadsBy;
	@FindBy(xpath = "//label[text()='Group Leads by']//..//span[@class='ng-arrow-wrapper']")
	WebElement ClickOnDropdownForGroupLeadsBy;
	
	
	@FindBy(xpath = "//label[text()='Group Contact by']//..//span[@title='Clear all']")
	WebElement DisplayedCrossMarkForGroupContactBy;
	@FindBy(xpath = "//label[text()='Group Contact by']//..//span[@class='ng-arrow-wrapper']")
	WebElement ClickOnDropdownForGroupContactBy;	
	
	
	@FindBy(xpath = "//label[text()='Group Opportunity by']//..//span[@title='Clear all']")
	WebElement DisplayedCrossMarkForGroupOpportunityBy;
	@FindBy(xpath = "//label[text()='Group Opportunity by']//..//span[@class='ng-arrow-wrapper']")
	WebElement ClickOnDropdownForGroupOpportunityBy;	
	
	
	@FindBy(xpath = "//label[text()='Group Account by']//..//span[@title='Clear all']")
	WebElement DisplayedCrossMarkForGroupAccountBy;
	@FindBy(xpath = "//label[text()='Group Account by']//..//span[@class='ng-arrow-wrapper']")
	WebElement ClickOnDropdownForGroupAccountBy;
	
	
	
	
	
	
	
	
	
	
	public void ClickOnDropdownForGroupAccountBy(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDropdownForGroupAccountBy));
		ClickOnDropdownForGroupAccountBy.click();
	}
	public void ClickOnCrossMarkForGroupAccountBy(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedCrossMarkForGroupAccountBy));
		DisplayedCrossMarkForGroupAccountBy.click();
	}
	public boolean DisplayedCrossMarkForGroupAccountBy(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedCrossMarkForGroupAccountBy));
			return DisplayedCrossMarkForGroupAccountBy.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	
	public void ClickOnDropdownForGroupOpportunityBy(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDropdownForGroupOpportunityBy));
		ClickOnDropdownForGroupOpportunityBy.click();
	}
	public void ClickOnCrossMarkForGroupOpportunityBy(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedCrossMarkForGroupOpportunityBy));
		DisplayedCrossMarkForGroupOpportunityBy.click();
	}
	public boolean DisplayedCrossMarkForGroupOpportunityBy(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedCrossMarkForGroupOpportunityBy));
			return DisplayedCrossMarkForGroupOpportunityBy.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	
	public void ClickOnDropdownForGroupContactBy(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDropdownForGroupContactBy));
		ClickOnDropdownForGroupContactBy.click();
	}
	public void ClickOnCrossMarkForGroupContactBy(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedCrossMarkForGroupContactBy));
		DisplayedCrossMarkForGroupContactBy.click();
	}
	public boolean DisplayedCrossMarkForGroupContactBy(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedCrossMarkForGroupContactBy));
			return DisplayedCrossMarkForGroupContactBy.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	
	public void ClickOnDropdownForGroupLeadsBy(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDropdownForGroupLeadsBy));
		ClickOnDropdownForGroupLeadsBy.click();
	}
	public void ClickOnCrossMarkForGroupLeadsBy(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedCrossMarkForGroupLeadsBy));
		DisplayedCrossMarkForGroupLeadsBy.click();
	}
	public boolean DisplayedCrossMarkForGroupLeadsBy(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedCrossMarkForGroupLeadsBy));
			return DisplayedCrossMarkForGroupLeadsBy.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	
	public void ClickOnCustomGroupsDropdown(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCustomGroupsDropdown));
		ClickOnCustomGroupsDropdown.click();
	}
	public boolean DisplayedCustomGroups180degAssignmentOptions(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedCustomGroups180degAssignmentOptions));
			return DisplayedCustomGroups180degAssignmentOptions.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	
	//****************************
	
	public void ClickOnConfirmButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnConfirmButton));
		ClickOnConfirmButton.click();
	}
	
	public void ClickOnSelectLabelNameDropdown(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSelectLabelNameDropdown));
		ClickOnSelectLabelNameDropdown.click();
	}
	
	public void SelectNumberOfInactivityDaysToReassignLeads(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectNumberOfInactivityDaysToReassignLeads));
		SelectNumberOfInactivityDaysToReassignLeads.click();
	}
	
	
	public void ClickOnReassignPartnerLeadsCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnReassignPartnerLeadsCheckBox));
		ClickOnReassignPartnerLeadsCheckBox.click();
	}
	public boolean DisplayedReassignPartnerLeadsCheckBoxIsChecked(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedReassignPartnerLeadsCheckBoxIsChecked));
			return DisplayedReassignPartnerLeadsCheckBoxIsChecked.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	} 
	
	
	public void ClickOnAssignToInactiveOwnersManagerCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAssignToInactiveOwnersManagerCheckBox));
		ClickOnAssignToInactiveOwnersManagerCheckBox.click();
	}
	public boolean DisplayedAssignToInactiveOwnersManagerCheckBoxIsChecked(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedAssignToInactiveOwnersManagerCheckBoxIsChecked));
			return DisplayedAssignToInactiveOwnersManagerCheckBoxIsChecked.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	} 
	public void ClickOnAssignmentOptionsDropdown(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAssignmentOptionsDropdown));
		ClickOnAssignmentOptionsDropdown.click();
	}
	public boolean DisplayedDropdownRotate180degAssignmentOptions(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedDropdownRotate180degAssignmentOptions));
			return DisplayedDropdownRotate180degAssignmentOptions.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	public boolean DisplayedRoutingPreferenceInLeftSideMenu(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedRoutingPreferenceInLeftSideMenu));
		return DisplayedRoutingPreferenceInLeftSideMenu.isDisplayed();
	}
	public boolean DisplayedRoutingPreferenceInTabsRow(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedRoutingPreferenceInTabsRow));
		return DisplayedRoutingPreferenceInTabsRow.isDisplayed();
	}
	public void ClickOnRoutingPreferenceIcon(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(RoutingPreference));
		RoutingPreference.click();
	}
	
	
	public boolean DisplyedRoutingPreference(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(RoutingPreference));
		return RoutingPreference.isDisplayed();
	}

	
	//*************************************************** Upload CSV to CRM *************************************************
	
	@FindBy(xpath = "//span[text()='Upload CSV to CRM ']")
	WebElement ClickOnUploadCSVtoCRM;
	
	@FindBy(xpath = "//mat-icon[text()='clear']")
	WebElement ClearFilterBox;
	
	@FindBy(xpath = "//span[text()=' Next ']")
	WebElement ClickOnNextButton;
	
	@FindBy(xpath = "//td[text()=' FirstName']//..//span[@class='ng-arrow-wrapper']")
	WebElement ClickOnFirstNameDropdown;
	@FindBy(xpath = "//div[@class='ng-option ng-star-inserted']//span[text()=' First Name ']")
	WebElement SelectFirstNameOption;
	
	
	@FindBy(xpath = "//td[text()=' LastName']//..//span[@class='ng-arrow-wrapper']")
	WebElement ClickOnLastNameDropdown;
	@FindBy(xpath = "//div[@class='ng-option ng-star-inserted']//span[text()=' Last Name ']")
	WebElement SelectLastNameOption;
	
	
	@FindBy(xpath = "//td[text()=' Company']//..//span[@class='ng-arrow-wrapper']")
	WebElement ClickOnCompanyDropdown;
	@FindBy(xpath = "//div[@class='ng-option ng-star-inserted']//span[text()=' Company ']")
	WebElement SelectCompanyOption;
	
	@FindBy(xpath = "//div[contains(@class,'ng-option-disabled')]//span[text()=' Last Name ']")
	WebElement DisplayedLastNameIsDisabled;
	@FindBy(xpath = "//div[contains(@class,'ng-option-disabled')]//span[text()=' Company ']")
	WebElement DisplayedCompanyIsDisabled;
	@FindBy(xpath = "//div[contains(@class,'ng-option-disabled')]//span[text()=' First Name ']")
	WebElement DisplayedFirstNameIsDisabled;
	
	@FindBy(xpath = "//span[text()=' Save And Upload ']")
	WebElement ClickSaveAndUploadButton;
	
	@FindBy(xpath = "//div[text()='file Uploaded Successfully.']")
	WebElement DisplayedFileUploadSuccesMessage;
	
	
	
	
	
	public boolean DisplayedFileUploadSuccesMessage(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedFileUploadSuccesMessage));
		return DisplayedFileUploadSuccesMessage.isDisplayed();
	}
	public void ClickSaveAndUploadButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickSaveAndUploadButton));
		ClickSaveAndUploadButton.click();
	}
	public boolean DisplayedFirstNameIsDisabled(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedFirstNameIsDisabled));
		return DisplayedFirstNameIsDisabled.isDisplayed();
	}
	public boolean DisplayedCompanyIsDisabled(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedCompanyIsDisabled));
		return DisplayedCompanyIsDisabled.isDisplayed();
	}
	public boolean DisplayedLastNameIsDisabled(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedLastNameIsDisabled));
		return DisplayedLastNameIsDisabled.isDisplayed();
	}
	
	public void ClickOnCompanyDropdown(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCompanyDropdown));
		ClickOnCompanyDropdown.click();
	}
	public void SelectCompanyOption(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectCompanyOption));
		SelectCompanyOption.click();
	}
	
	public void ClickOnLastNameDropdown(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnLastNameDropdown));
		ClickOnLastNameDropdown.click();
	}
	public void SelectLastNameOption(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectLastNameOption));
		SelectLastNameOption.click();
	}
	
	public void SelectFirstNameOption(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectFirstNameOption));
		SelectFirstNameOption.click();
	}
	public void ClickOnFirstNameDropdown(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnFirstNameDropdown));
		ClickOnFirstNameDropdown.click();
	}
	public void ClickOnUploadCSVtoCRM(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnUploadCSVtoCRM));
		ClickOnUploadCSVtoCRM.click();
	}
	
	public void ClearFilterBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClearFilterBox));
		ClearFilterBox.click();
	}
	
	public void ClickOnNextButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnNextButton));
		ClickOnNextButton.click();
	}
	
	
	//*************************************************  CRM  Activation  ***************************************************
	
	@FindBy(xpath = "//span[text()='CRM Activation ']")
	WebElement ClickOnCRMactivation;
	@FindBy(xpath = "//span[text()='CRM Custom Object Sync ']")
	WebElement ClickOnCRMCustomObjectSync;
	
	@FindBy(xpath = "//a[text()='SFDC App for production']")
	WebElement ClickOnSFDCAppforProductionButton;
	@FindBy(xpath = "//a[text()='SFDC App for production']//..//..//i-tabler[@name='copy']")
	WebElement ClickOnSFDCAppforProductionCopyButton;
	
	@FindBy(xpath = "//a[text()='SFDC app for Sandbox']")
	WebElement ClickOnSFDCappforSandboxButton;
	@FindBy(xpath = "//a[text()='SFDC app for Sandbox']//..//..//i-tabler[@name='copy']")
	WebElement ClickOnSFDCappforSandboxCopyButton;
	
	@FindBy(xpath = "(//button[@mattooltip='Copy Content'])[3]")
	WebElement ClickOnSFDCappActivationKeyCopyButton;
	
	@FindBy(xpath = "//div[text()='Success']")
	WebElement DisplayedSuccessMessageCopied;
	
	
	@FindBy(xpath = "//span[text()='Integrations ']")
	WebElement ClickOnIntegrations;
	@FindBy(xpath = "//button//span[text()=' Connect CRM ']")
	WebElement ClickOnConnectCRMbutton;
	
	@FindBy(xpath = "//div[text()=' CRM Activation ']")
	WebElement DisplayedCRMactivationInTabsRow;
	
	
	public boolean DisplayedCRMactivationInTabsRow(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedCRMactivationInTabsRow));
		return DisplayedCRMactivationInTabsRow.isDisplayed();
	}
	
	public boolean DisplayedCRMactivationInLeftSideMenu(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCRMactivation));
		return ClickOnCRMactivation.isDisplayed();
	}
	public boolean DisplayedCRMCustomObjectSync(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCRMCustomObjectSync));
		return ClickOnCRMCustomObjectSync.isDisplayed();
	}
	
	public void ClickOnConnectCRMbutton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnConnectCRMbutton));
		ClickOnConnectCRMbutton.click();
	}
	
	public void ClickOnIntegrations(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnIntegrations));
		ClickOnIntegrations.click();
	}
	public void ClickOnCRMactivation(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCRMactivation));
		ClickOnCRMactivation.click();
	}

	public void ClickOnSFDCAppforProductionButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSFDCAppforProductionButton));
		ClickOnSFDCAppforProductionButton.click();
	}
	public void ClickOnSFDCAppforProductionCopyButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSFDCAppforProductionCopyButton));
		ClickOnSFDCAppforProductionCopyButton.click();
	}

	public void ClickOnSFDCappforSandboxButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSFDCappforSandboxButton));
		ClickOnSFDCappforSandboxButton.click();
	}
	public void ClickOnSFDCappforSandboxCopyButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSFDCappforSandboxCopyButton));
		ClickOnSFDCappforSandboxCopyButton.click();
	}

	public void ClickOnSFDCappActivationKeyCopyButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSFDCappActivationKeyCopyButton));
		ClickOnSFDCappActivationKeyCopyButton.click();
	}

	public boolean DisplayedSuccessMessageCopied(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedSuccessMessageCopied));
		return DisplayedSuccessMessageCopied.isDisplayed();
	}

	//************************************************* CRM Custom Object Sync ***************************************************

	
	@FindBy(xpath = "//label[text()='Custom Object API Name']//..//input[@disabled='true']")
	WebElement DisplayedCustomObjectAPInameInputBoxIsDisabled;
	@FindBy(xpath = "//label[text()='Custom Object API Name']//..//button[@disabled='true']//span[text()=' Save ']")
	WebElement DisplayedCustomObjectAPInameSaveButtonIsDisabled;
	
	
	@FindBy(xpath = "//span[text()='Account']")
	WebElement ClickOnAccountRadioButton;
	@FindBy(xpath = "//mat-radio-button[contains(@class,'mat-radio-checked')]//span[text()='Account']")
	WebElement DisplayedAccountRadioButtonIsChecked;
	
	@FindBy(xpath = "//span[text()='Lead']")
	WebElement ClickOnLeadRadioButton;
	@FindBy(xpath = "//mat-radio-button[contains(@class,'mat-radio-checked')]//span[text()='Lead']")
	WebElement DisplayedLeadRadioButtonIsChecked;
	
	@FindBy(xpath = "//div[text()='Custom Object Attribute']//..//span[@class='ng-arrow-wrapper']")
	WebElement ClickOnDropdownForCustomObjectAttribute;
	@FindBy(xpath = "//div[text()='Related Object Attribute']//..//span[@class='ng-arrow-wrapper']")
	WebElement ClickOnDropdownForRelatedObjectAttribute;
	
	@FindBy(xpath = "(//label[text()='Related To']//..//..)[1]//span[text()=' Save ']")
	WebElement ClickOnSaveButtonForRelatedTo;
	@FindBy(xpath = "(//label[text()='Related To']//..//..)[1]//button[@disabled='true']//span[text()=' Save ']")
	WebElement DisplayedRelatedToSaveButtonIsDisabled;
	
	
	@FindBy(xpath = "(//button[@mattooltip='Delete'])[1]")
	WebElement ClickOnDeleteToolTipButton;

	
	@FindBy(xpath = "//button[@mattooltip='Add Mapping']")
	WebElement ClickOnAddButton;
	@FindBy(xpath = "//ng-select[@formcontrolname='customobjectattribute']")
	WebElement ClickOnCustomAttributeDropdown;
	@FindBy(xpath = "//ng-select[@formcontrolname='operatorVal']")
	WebElement ClickOnOperatorDropdown;
	@FindBy(xpath = "//span[text()='Matches Lead Attribute']")
	WebElement SelectMatchesLeadAttributeOption;
	@FindBy(xpath = "//span[text()='Equal to Value']")
	WebElement SelectEqualToValueOption;
	@FindBy(xpath = "//ng-select[@formcontrolname='getleadattribute']")
	WebElement SelectValueDropdown;
	@FindBy(xpath = "//input[@formcontrolname='getleadattribute']")
	WebElement EnterValue;
	@FindBy(xpath = "//h1[text()='Add New Attribute']//..//..//span[text()='Add']")
	WebElement ClickOnAddButtonForAddPopup;
	
	@FindBy(xpath = "(//td[text()=' Equal to Value '])[1]//..//i-tabler[@name='edit']")
	WebElement ClickOnEditButtonForEqualToValueOperator;
	@FindBy(xpath = "(//td[text()=' Matches Lead Attribute '])[1]//..//i-tabler[@name='edit']")
	WebElement ClickOnEditButtonForMatchesLeadAttributeOperator;
	@FindBy(xpath = "//span[text()='Update']")
	WebElement ClickOnUpdateButtonEditAttribute;
	
	
	@FindBy(xpath = "//mat-icon[text()='expand_more']")
	WebElement ClickOnDefaultFilter;
	@FindBy(xpath = "//button[text()='Custom Filter']")
	WebElement SelectCustomFilter;
	@FindBy(xpath = "//input[@placeholder='Type custom filter']")
	WebElement EnterValueForCustomFilter;
	
	@FindBy(xpath = "(//span[text()=' Save '])[3]")
	WebElement ClickOnSaveButtonForMapAttribute;
	@FindBy(xpath = "(//button[@disabled='true']//span[text()=' Save '])[3]")
	WebElement DisplayedMatAttributeDetailsSaveButtonIsDisabled;
	
	@FindBy(xpath = "//span[text()=' Custom Object ']")
	WebElement ClickOnCustomObject;
	@FindBy(xpath = "//span[text()='CRM Custom Object Sync ']")
	WebElement DisplayedCRMcustomObjectSync;
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void ClickOnCustomObject(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCustomObject));
		ClickOnCustomObject.click();
	}
	public boolean DisplayedCRMcustomObjectSync(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedCRMcustomObjectSync));
		return DisplayedCRMcustomObjectSync.isDisplayed();
	}
	
	
	public boolean DisplayedCustomObjectAPInameInputBoxIsDisabled(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedCustomObjectAPInameInputBoxIsDisabled));
		return DisplayedCustomObjectAPInameInputBoxIsDisabled.isDisplayed();
	}
	public boolean DisplayedCustomObjectAPInameSaveButtonIsDisabled(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedCustomObjectAPInameSaveButtonIsDisabled));
		return DisplayedCustomObjectAPInameSaveButtonIsDisabled.isDisplayed();
	}
	
	
	public void ClickOnAccountRadioButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAccountRadioButton));
		ClickOnAccountRadioButton.click();
	}
	public boolean DisplayedAccountRadioButtonIsChecked(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedAccountRadioButtonIsChecked));
		return DisplayedAccountRadioButtonIsChecked.isDisplayed();
	}
	
	
	public void ClickOnLeadRadioButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnLeadRadioButton));
		ClickOnLeadRadioButton.click();
	}
	public boolean DisplayedLeadRadioButtonIsChecked(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedLeadRadioButtonIsChecked));
		return DisplayedLeadRadioButtonIsChecked.isDisplayed();
	}
	
	
	public void ClickOnDropdownForCustomObjectAttribute(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDropdownForCustomObjectAttribute));
		ClickOnDropdownForCustomObjectAttribute.click();
	}
	public void ClickOnDropdownForRelatedObjectAttribute(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDropdownForRelatedObjectAttribute));
		ClickOnDropdownForRelatedObjectAttribute.click();
	}
	
	
	public void ClickOnSaveButtonForRelatedTo(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSaveButtonForRelatedTo));
		ClickOnSaveButtonForRelatedTo.click();
	}
	public boolean DisplayedRelatedToSaveButtonIsDisabled(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedRelatedToSaveButtonIsDisabled));
		return DisplayedRelatedToSaveButtonIsDisabled.isDisplayed();
	}
	
	
	public void ClickOnDeleteToolTipButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDeleteToolTipButton));
		ClickOnDeleteToolTipButton.click();
	}
	public boolean DisplayedDeleteToolTipButton(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ClickOnDeleteToolTipButton));
			return ClickOnDeleteToolTipButton.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	
	
	public void ClickOnAddButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAddButton));
		ClickOnAddButton.click();
	}
	public void ClickOnCustomAttributeDropdown(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCustomAttributeDropdown));
		ClickOnCustomAttributeDropdown.click();
	}
	public void ClickOnOperatorDropdown(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnOperatorDropdown));
		ClickOnOperatorDropdown.click();
	}
	public void SelectMatchesLeadAttributeOption(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectMatchesLeadAttributeOption));
		SelectMatchesLeadAttributeOption.click();
	}
	public void SelectEqualToValueOption(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectEqualToValueOption));
		SelectEqualToValueOption.click();
	}
	public void SelectValueDropdown(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectValueDropdown));
		SelectValueDropdown.click();
	}
	public void EnterValue(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterValue));
		EnterValue.sendKeys("Automation Testing is going on..");
	}
	public void ClickOnAddButtonForAddPopup(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAddButtonForAddPopup));
		ClickOnAddButtonForAddPopup.click();
	}
	
	
	public void ClickOnEditButtonForEqualToValueOperator(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnEditButtonForEqualToValueOperator));
		ClickOnEditButtonForEqualToValueOperator.click();
	}
	public void ClickOnEditButtonForMatchesLeadAttributeOperator(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnEditButtonForMatchesLeadAttributeOperator));
		ClickOnEditButtonForMatchesLeadAttributeOperator.click();
	}
	public void ClickOnUpdateButtonEditAttribute(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnUpdateButtonEditAttribute));
		ClickOnUpdateButtonEditAttribute.click();
	}
	
	
	public void ClickOnDefaultFilter(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDefaultFilter));
		ClickOnDefaultFilter.click();
	}
	public void SelectCustomFilter(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectCustomFilter));
		SelectCustomFilter.click();
	}
	public void EnterValueForCustomFilter(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterValueForCustomFilter));
		EnterValueForCustomFilter.sendKeys("( 1 and 2 )");
	}
	
	
	public void ClickOnSaveButtonForMapAttribute(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSaveButtonForMapAttribute));
		ClickOnSaveButtonForMapAttribute.click();
	}
	public boolean DisplayedMatAttributeDetailsSaveButtonIsDisabled(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedMatAttributeDetailsSaveButtonIsDisabled));
		return DisplayedMatAttributeDetailsSaveButtonIsDisabled.isDisplayed();
	}
	
	
	//******************************************************** Slack ******************************************************
	
	
	@FindBy(xpath = "//span[text()=' Connect Slack ']")
	WebElement ClickOnConnectSlack;
	
	@FindBy(xpath = "//h4[text()='Slack Integration']")
	WebElement DisplayedSlackIntegrationInToolbar;
	@FindBy(xpath = "//span[text()='Slack ']")
	WebElement DisplayedSlackInLeftsideMenu;
	
	@FindBy(xpath = "//input[@formcontrolname='authtoken']")
	WebElement EnterUserOAuthAccessToken;
	@FindBy(xpath = "//button[@mattooltip='Copy Token']")
	WebElement ClickOnUserOAuthAccessTokenCopyButton;
	
	@FindBy(xpath = "//label[text()='Salesforce Field']//..//mat-icon[text()='close']")
	WebElement ClearSalesforceFieldSelectbox;
	@FindBy(xpath = "//app-search-dropdwon[@formcontrolname='userfield']")
	WebElement ClickOnSalesforceFieldDropdown;
	
	@FindBy(xpath = "//label[text()='Slack Field']//..//mat-icon[text()='close']")
	WebElement ClearSlackFieldSelectbox;
	@FindBy(xpath = "//app-search-dropdwon[@formcontrolname='slackfield']")
	WebElement ClickOnSlackFieldDropdown;
	
	@FindBy(xpath = "//span[text()=' Save ']")
	WebElement ClickOnSaveButtonForSlack;
	
	
	@FindBy(xpath = "(//span[text()='Send Slack notifications to both public and private channels.']//..)[1]")
	WebElement ClickOnSendSlackNotificationsToBothPublicAndPrivateChannelsCheckBox;
	@FindBy(xpath = "(//mat-checkbox[contains(@class,'mat-checkbox-checked')]//span[text()='Send Slack notifications to both public and private channels.']//..)[1]")
	WebElement DisplayedSendSlackNotificationsToBothPublicAndPrivateChannelsCheckBoxIsChecked;
	
	@FindBy(xpath = "(//mat-option[@role='option'])[1]")
	WebElement ClickAnOptionFromListBox;
	
	@FindBy(xpath = "//span[@class='custom-option-content ng-star-inserted'][text()='Email']")
	WebElement ClickAnOptionEmailFromListBox;
	
	public void ClickAnOptionEmailFromListBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickAnOptionEmailFromListBox));
		ClickAnOptionEmailFromListBox.click();
	}
	public void ClickAnOptionFromListBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickAnOptionFromListBox));
		ClickAnOptionFromListBox.click();
	}
	
	public void ClickOnConnectSlack(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnConnectSlack));
		ClickOnConnectSlack.click();
	}
	public boolean DisplayedSlackIntegrationInToolbar(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedSlackIntegrationInToolbar));
		return DisplayedSlackIntegrationInToolbar.isDisplayed();
	}
	public boolean DisplayedSlackInLeftsideMenu(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedSlackInLeftsideMenu));
		return DisplayedSlackInLeftsideMenu.isDisplayed();
	}
	
	
	public void EnterUserOAuthAccessToken(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterUserOAuthAccessToken));
		EnterUserOAuthAccessToken.clear();
		EnterUserOAuthAccessToken.sendKeys("xoxb-5465066364881-5454938918324-Gohfxv9Qv63PS9D3wREtJF9I");
	}
	public void ClickOnUserOAuthAccessTokenCopyButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnUserOAuthAccessTokenCopyButton));
		ClickOnUserOAuthAccessTokenCopyButton.click();
	}
	
	public void ClearSalesforceFieldSelectbox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClearSalesforceFieldSelectbox));
		ClearSalesforceFieldSelectbox.click();
	}
	public void ClickOnSalesforceFieldDropdown(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSalesforceFieldDropdown));
		ClickOnSalesforceFieldDropdown.click();
	}
	
	public void ClearSlackFieldSelectbox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClearSlackFieldSelectbox));
		ClearSlackFieldSelectbox.click();
	}
	public void ClickOnSlackFieldDropdown(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSlackFieldDropdown));
		ClickOnSlackFieldDropdown.click();
	}
	
	public void ClickOnSaveButtonForSlack(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSaveButtonForSlack));
		ClickOnSaveButtonForSlack.click();
	}
	
	public void ClickOnSendSlackNotificationsToBothPublicAndPrivateChannelsCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSendSlackNotificationsToBothPublicAndPrivateChannelsCheckBox));
		ClickOnSendSlackNotificationsToBothPublicAndPrivateChannelsCheckBox.click();
	}
	public boolean DisplayedSendSlackNotificationsToBothPublicAndPrivateChannelsCheckBoxIsChecked(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedSendSlackNotificationsToBothPublicAndPrivateChannelsCheckBoxIsChecked));
			return DisplayedSendSlackNotificationsToBothPublicAndPrivateChannelsCheckBoxIsChecked.isDisplayed();
		} catch (Exception e) {
		return false;
		}
	}
	
	
	//******************************************************** Twilio ******************************************************

	@FindBy(xpath = "//span[text()=' Connect Twilio ']")
	WebElement ClickOnConnectTwilio;
	
	@FindBy(xpath = "//h4[text()='Twilio Integration']")
	WebElement DisplayedTwilioIntegrationInToolbar;
	@FindBy(xpath = "//span[text()='Twilio ']")
	WebElement DisplayedTwilioInLeftsideMenu;
	
	@FindBy(xpath = "//input[@formcontrolname='authToken']")
	WebElement EnterUserAuthToken;
	@FindBy(xpath = "//label[text()='User Auth Token']//..//button[@mattooltip='Copy Token']")
	WebElement ClickOnUserAuthTokenCopyButton;
	
	@FindBy(xpath = "//input[@formcontrolname='AccountSID']")
	WebElement EnterUserAccountSIDToken;
	@FindBy(xpath = "//label[text()='User Account SID']//..//button[@mattooltip='Copy Account SID']")
	WebElement ClickOnUserAccountSIDTokenCopyButton;
	
	
	@FindBy(xpath = "//input[@formcontrolname='UserPhoneno']")
	WebElement EnterPhoneNumber;
	@FindBy(xpath = "//label[text()='Phone Number']//..//button[@mattooltip='Copy Phone Number']")
	WebElement ClickOnPhoneNumberCopyButton;
	
	
	
	
	
	
	
	
	public void ClickOnConnectTwilio(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnConnectTwilio));
		ClickOnConnectTwilio.click();
	}
	public boolean DisplayedTwilioIntegrationInToolbar(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedTwilioIntegrationInToolbar));
		return DisplayedTwilioIntegrationInToolbar.isDisplayed();
	}
	public boolean DisplayedTwilioInLeftsideMenu(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedTwilioInLeftsideMenu));
		return DisplayedTwilioInLeftsideMenu.isDisplayed();
	}
	
	
	public void EnterUserAuthToken(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterUserAuthToken));
		EnterUserAuthToken.clear();
		EnterUserAuthToken.sendKeys(randomString);
	}
	public void ClickOnUserAuthTokenCopyButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnUserAuthTokenCopyButton));
		ClickOnUserAuthTokenCopyButton.click();
	}
	
	
	public void EnterUserAccountSIDToken(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterUserAccountSIDToken));
		EnterUserAccountSIDToken.clear();
		EnterUserAccountSIDToken.sendKeys(randomString);
	}
	public void ClickOnUserAccountSIDTokenCopyButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnUserAccountSIDTokenCopyButton));
		ClickOnUserAccountSIDTokenCopyButton.click();
	}
	
	public void EnterPhoneNumber(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterPhoneNumber));
		EnterPhoneNumber.clear();
		EnterPhoneNumber.sendKeys("+916545865248");
	}
	public void ClickOnPhoneNumberCopyButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnPhoneNumberCopyButton));
		ClickOnPhoneNumberCopyButton.click();
	}
	
	
	//******************************************************** Maintenance ******************************************************

	
	@FindBy(xpath = "//span[text()='Maintenance ']")
	WebElement ClickOnMaintenance;
	@FindBy(xpath = "//span[text()=' Refresh Labels ']")
	WebElement ClickOnRefreshLabelsButton;
	
	@FindBy(xpath = "//div[text()='Labels will be refreshed in about 30 min. Please refresh the page after 30 min to check the updated status']")
	WebElement DisplayedSuccessMessageForMaintenance;
	
	
	
	public void ClickOnMaintenance(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnMaintenance));
		ClickOnMaintenance.click();
	}

	public void ClickOnRefreshLabelsButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnRefreshLabelsButton));
		ClickOnRefreshLabelsButton.click();
	}
	public boolean DisplayedSuccessMessageForMaintenance(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedSuccessMessageForMaintenance));
		return DisplayedSuccessMessageForMaintenance.isDisplayed();
	}
	
	
	
	//******************************************************** Manage Plan ******************************************************

	@FindBy(xpath = "//span[text()='Manage Plan ']")
	WebElement ClickOnManagePlan;
	@FindBy(xpath = "//span[text()='Contact Sales']")
	WebElement ClickOnContactSales;
	
	public void ClickOnManagePlan(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnManagePlan));
		ClickOnManagePlan.click();
	}
	public void ClickOnContactSales(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnContactSales));
		ClickOnContactSales.click();
	}
	
	//******************************************************** Recaptcha ******************************************************

	@FindBy(xpath = "//span[text()='Recaptcha ']")
	WebElement ClickOnRecaptcha;
	
	@FindBy(xpath = "//span[text()=' Add re-Captcha ']")
	WebElement ClickOnAddReCaptchaButton;
	
	@FindBy(xpath = "//input[@name='name']")
	public WebElement EnterKeyName;
	
	@FindBy(xpath = "//input[@name='sitekey']")
	WebElement EnterSiteKey;
	
	@FindBy(xpath = "//input[@name='securitykey']")
	WebElement EnterSecurityKey;
	
	@FindBy(xpath = "//span[text()='ADD']")
	WebElement ClickOnAddButtonForNewRecaptcha;
	@FindBy(xpath = "//span[text()='Add']")
	WebElement ClickOnAddButtonFromConsole;
	
	@FindBy(xpath = "//span[text()='Update']")
	WebElement ClickOnUpdateButtonForEditRecaptcha;
	
	@FindBy(xpath = "//div[text()='Key Name: AutoTestObject ']//..//..//..//i-tabler[@name='edit']")
	WebElement ClickOnEditButtonForRecaptcha;
	
	@FindBy(xpath = "//div[text()='Key Name: AutoTestObject ']//..//..//..//i-tabler[@name='trash']")
	public WebElement ClickOnDeleteButtonForRecaptcha;
	

	
	@FindBy(xpath = "//span[text()='Delete']")
	WebElement ClickOnDeleteButtonForRecaptchaConfirmationPopup;
	
	@FindBy(xpath = "//div[text()='Key Name: AutoTestObject ']")
	WebElement DisplayedRecaptchaKeyName;
	
	
	
	
	@FindBy(xpath = "//i-tabler[@name='x']")
	WebElement ClickOnCrossMarkFromTheSearchBox;
	@FindBy(xpath = "//input[@placeholder='Search by key name...']")
	public WebElement EnterTextInSearchBox;
	@FindBy(xpath = "//div[text()='Deleted Successfully']")
	WebElement DisplayedDeleteSuccessMessage;
	@FindBy(xpath = "//div[text()='Inserted Successfully']")
	WebElement DisplayedIncertedSuccessMessage;
	@FindBy(xpath = "//div[contains(text(),'Cannot delete this re-Captcha')]")
	WebElement DisplayedCannotDeleteErrorMessage;
	@FindBy(xpath = "//div[contains(text(),'You cannot edit')]")
	WebElement DisplayedCannotEditErrorMessage;

	@FindBy(xpath = "//li[text()=' Recaptcha List ']")
	WebElement ClickOnRecaptchaTab;
	
	@FindBy(xpath = "//span[text()='AutoTestObject ']")
	WebElement ClickOnFormsAutoTestObject;
	
	
	
	public void ClickOnFormsAutoTestObject(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnFormsAutoTestObject));
		ClickOnFormsAutoTestObject.click();
	}
	
	public void ClickOnRecaptchaTab(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnRecaptchaTab));
		ClickOnRecaptchaTab.click();
	}
	
	public void ClickOnCrossMarkFromTheSearchBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCrossMarkFromTheSearchBox));
		ClickOnCrossMarkFromTheSearchBox.click();
	}

	public boolean DisplayedDeleteSuccessMessage(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedDeleteSuccessMessage));
			return DisplayedDeleteSuccessMessage.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	public boolean DisplayedIncertedSuccessMessage(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedIncertedSuccessMessage));
			return DisplayedIncertedSuccessMessage.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	public boolean DisplayedCannotDeleteErrorMessage(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedCannotDeleteErrorMessage));
			return DisplayedCannotDeleteErrorMessage.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	public boolean DisplayedCannotEditErrorMessage(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedCannotEditErrorMessage));
			return DisplayedCannotEditErrorMessage.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	
	
	
	

	public boolean DisplayedRecaptchaKeyName(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedRecaptchaKeyName));
			return DisplayedRecaptchaKeyName.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	
	public void ClickOnRecaptcha(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnRecaptcha));
		ClickOnRecaptcha.click();
	}
	public void ClickOnAddReCaptchaButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAddReCaptchaButton));
		ClickOnAddReCaptchaButton.click();
	}
	
	public void EnterKeyName(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterKeyName));
		EnterKeyName.sendKeys("Automation");
	}
	public void EnterSiteKey(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterSiteKey));
		EnterSiteKey.sendKeys("Tech4Ganesh");
	}
	public void EnterSecurityKey(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterSecurityKey));
		EnterSecurityKey.sendKeys("Tech4Lead");
	}
	public void EditEnterSecurityKey(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterSecurityKey));
		EnterSecurityKey.sendKeys("Tech4Vyakar");
	}
	
	
	public void ClickOnAddButtonForNewRecaptcha(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAddButtonForNewRecaptcha));
		ClickOnAddButtonForNewRecaptcha.click();
	}
	public void ClickOnAddButtonFromConsole(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAddButtonFromConsole));
		ClickOnAddButtonFromConsole.click();
	}
	
	public void ClickOnEditButtonForRecaptcha(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnEditButtonForRecaptcha));
		ClickOnEditButtonForRecaptcha.click();
	}
	public void EditSiteKey(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterSiteKey));
		EnterSiteKey.sendKeys("VyakaraTechnologies033");
	}
	
	public void ClickOnUpdateButtonForEditRecaptcha(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnUpdateButtonForEditRecaptcha));
		ClickOnUpdateButtonForEditRecaptcha.click();
	}
	
	public void ClickOnDeleteButtonForRecaptcha(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDeleteButtonForRecaptcha));
		ClickOnDeleteButtonForRecaptcha.click();
	}

	public void ClickOnDeleteButtonForRecaptchaConfirmationPopup(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDeleteButtonForRecaptchaConfirmationPopup));
		ClickOnDeleteButtonForRecaptchaConfirmationPopup.click();
	}
	
	
	//******************************************************** Referral Domains ******************************************************

	
	@FindBy(xpath = "//span[text()='Referral Domains ']")
	WebElement ClickOnReferralDomains;
	
	@FindBy(xpath = "//span[text()=' Add Domain URL ']")
	WebElement ClickOnAddDomainURLbutton;
	
	@FindBy(xpath = "//input[@name='DomainUrl']")
	WebElement EnterDomainURL;
	
	@FindBy(xpath = "//td[text()='https://automationtest.com']//..//mat-icon[text()='edit']")
	WebElement ClickOnEditButtonForDomainUrl;
	
	@FindBy(xpath = "//td[text()='https://automationtest.com']//..//mat-icon[text()='delete']")
	WebElement ClickOnDeleteButtonForDomainUrl;
	@FindBy(xpath = "//td[text()='https://automationtestedit.com']//..//mat-icon[text()='delete']")
	WebElement ClickOnDeleteButtonForEditDomainUrl;
	
	@FindBy(xpath = "//td[text()='https://automationtest.com']")
	WebElement DisplayedAlreadyPresentDomainList;
	
	@FindBy(xpath = "//td[text()='https://automationtestedit.com']")
	WebElement DisplayedAlreadyPresentEditDomainList;
	
	@FindBy(xpath = "//input[@placeholder='Filter']")
	WebElement EnterDomainURLInsideFilterBox;
	
	@FindBy(xpath = "//mat-icon[text()='clear']")
	WebElement CleareFilterBox;
	
	
	
	
	public void ClickOnReferralDomains(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnReferralDomains));
		ClickOnReferralDomains.click();
	}
	public void ClickOnAddDomainURLbutton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAddDomainURLbutton));
		ClickOnAddDomainURLbutton.click();
	}
	
	
	public void EnterDomainURL(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterDomainURL));
		EnterDomainURL.sendKeys("https://automationtest.com");
	}
	
	public void EditDomainURL(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterDomainURL));
		EnterDomainURL.clear();
		EnterDomainURL.sendKeys("https://automationtestedit.com");
	}
	
	public void ClickOnEditButtonForDomainUrl(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnEditButtonForDomainUrl));
		ClickOnEditButtonForDomainUrl.click();
	}
	public void ClickOnDeleteButtonForDomainUrl(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDeleteButtonForDomainUrl));
		ClickOnDeleteButtonForDomainUrl.click();
	}
	public void ClickOnDeleteButtonForEditDomainUrl(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDeleteButtonForEditDomainUrl));
		ClickOnDeleteButtonForEditDomainUrl.click();
	}
	
	public boolean DisplayedAlreadyPresentDomainList(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedAlreadyPresentDomainList));
			return DisplayedAlreadyPresentDomainList.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	public boolean DisplayedAlreadyPresentEditDomainList(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedAlreadyPresentEditDomainList));
			return DisplayedAlreadyPresentEditDomainList.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	public void EnterDomainURLInsideFilterBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterDomainURLInsideFilterBox));
		EnterDomainURLInsideFilterBox.sendKeys("https://automationtestedit.com");
	}
	
	public void CleareFilterBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(CleareFilterBox));
		CleareFilterBox.click();
	}
	
	public void ClickOnSaveButtonForReferralDomains(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSaveButtonForHoliday));
		ClickOnSaveButtonForHoliday.click();
	}
	
	//************************************************* User and Access ***************************************************

	@FindBy(xpath = "//span[text()='User and Access ']")
	WebElement ClickOnUserAndAcces;
	
	@FindBy(xpath = "//span[text()='Automation Test']")
	WebElement DisplayedAlreadyAutomationTestUserRoleIsPresent;
	
	@FindBy(xpath = "//span[text()='Add']")
	WebElement ClickOnAddButtonForUserAndAccess;
	
	@FindBy(xpath = "//mat-select[@name='userrole']")
	WebElement ClickOnDropdownForRole;
	@FindBy(xpath = "//span[text()='Admin']")
	WebElement SelectAdminAsARole;
	@FindBy(xpath = "//span[text()='Partner Admin']")
	WebElement SelectPartnerAdminAsARole;
	@FindBy(xpath = "//mat-select[@name='partnerid']")
	WebElement SelectPartnerIdDropdown;
	@FindBy(xpath = "//input[@name='firstname']")
	WebElement EnterFirstName;
	@FindBy(xpath = "//input[@name='lastname']")
	WebElement EnterLastName;
	@FindBy(xpath = "//input[@name='useremailaddress']")
	WebElement EnterEmailId;
	
	@FindBy(xpath = "(//span[text()='SSO Enabled']//..)[1]")
	WebElement ClickOnCheckBoxSSOEnabled;
	@FindBy(xpath = "(//mat-checkbox[contains(@class,'mat-checkbox-checked')]//span[text()='SSO Enabled']//..)[1]")
	WebElement DisplayedSSOEnabledCheckBoxIsChecked;
	
	@FindBy(xpath = "//div[text()=' Your calendar user license limit is exceeded. ']")
	WebElement DisplayedYourCalendarUserLicenseLimitIsExceededWarningMessage;
	@FindBy(xpath = "//span[text()='Cancel']")
	WebElement ClickOnCancelButton;
	@FindBy(xpath = "(//td[contains(@class,'mat-column-CalendarUser')]//i-tabler[@name='circle-check'])[1]//..//..//i-tabler[@name='edit']")
	WebElement ClickOnEditButtonForWarningMessagePurpose;
	
	@FindBy(xpath = "(//span[text()='Frozen']//..)[1]")
	WebElement ClickOnCheckBoxFrozen;
	@FindBy(xpath = "(//mat-checkbox[contains(@class,'mat-checkbox-checked')]//span[text()='Frozen']//..)[1]")
	WebElement DisplayedFrozenCheckBoxIsChecked;
	
	@FindBy(xpath = "(//span[text()='Calendar User']//..)[1]")
	WebElement ClickOnCalendarUserCheckBoxEdit;
	@FindBy(xpath = "(//mat-checkbox[contains(@class,'mat-checkbox-checked')]//span[text()='Calendar User']//..)[1]")
	WebElement DisplayedCalendarUserCheckBoxIsChecked;
	
	
	@FindBy(xpath = "//span[text()='Automation Test']//..//..//..//..//..//i-tabler[@name='edit']")
	WebElement ClickOnEditButtonForUserAndAccess;
	@FindBy(xpath = "//span[text()='Automation Test']//..//..//..//..//..//i-tabler[@name='trash']")
	WebElement ClickOnDeleteButtonForUserAndAccess;
	@FindBy(xpath = "//span[text()='Automation Test']//..//..//..//..//..//i-tabler[@name='reload']")
	WebElement ClickOnReloadButtonForUserAndAccess;
	
	@FindBy(xpath = "//i-tabler[@name='user-circle']//..//..//span[text()='Automation Test']//..//..//..//..//..//td[contains(@class,'mat-column-CalendarUser')]//i-tabler[@name='circle-check']")
	WebElement DisplayedCircleCheckInCalendarEnabledColumn;
	@FindBy(xpath = "//i-tabler[@name='user-circle']//..//..//span[text()='Automation Test']//..//..//..//..//..//td[contains(@class,'mat-column-ssoEnabled')]//i-tabler[@name='circle-check']")
	WebElement DisplayedCircleCheckInSSOEnabledColumn;
	@FindBy(xpath = "//i-tabler[@name='user-circle']//..//..//span[text()='Automation Test']//..//..//..//..//..//td[contains(@class,'mat-column-userstatus')]//div[text()=' ACTIVE ']")
	WebElement DisplayedActiveInStatusColumn;
	@FindBy(xpath = "//i-tabler[@name='user-circle']//..//..//span[text()='Automation Test']//..//..//..//..//..//td[contains(@class,'mat-column-userstatus')]//div[text()=' INACTIVE ']")
	WebElement DisplayedINACTIVEInStatusColumn;
	@FindBy(xpath = "//i-tabler[@name='user-circle']//..//..//span[text()='Automation Test']//..//..//..//..//..//button[@mattooltip='Reset Password']")
	WebElement ClickOnResetPasswordIcon;
	@FindBy(xpath = "//span[text()='Send Link']")
	WebElement ClickOnSendLinkButton;
	@FindBy(xpath = "//div[text()='Reset password link has been sent successfully']")
	WebElement DisplayedReseyPasswordSuccessMessage;
	@FindBy(xpath = "//i-tabler[@name='user-circle']//..//..//span[text()='Automation Test']//..//..//..//..//..//td[contains(@class,'mat-column-role')][text()=' Admin ']")
	WebElement DisplayedAsAdminUserRoleInRoleColumn;
	@FindBy(xpath = "//i-tabler[@name='user-circle']//..//..//span[text()='Automation Test']//..//..//..//..//..//button[@mattooltip='Edit'][@disabled='true']")
	WebElement DisplayedEditButtonIsDisabledInActionsColumn;
	@FindBy(xpath = "//i-tabler[@name='user-circle']//..//..//span[text()='Automation Test']//..//..//..//..//..//button[@mattooltip='Reset Password'][@disabled='true']")
	WebElement DisplayedResetPasswordButtonIsDisabledInActionsColumn;
	@FindBy(xpath = "//i-tabler[@name='user-circle']//..//..//span[text()='Automation Test']//..//..//..//..//..//button[@mattooltip='Delete'][@disabled='true']")
	WebElement DisplayedDeleteButtonIsDisabledInActionsColumn;
	
	@FindBy(xpath = "//div[text()=' Role ']")
	WebElement ClickOnRoleTab;
	
	@FindBy(xpath = "(//div[text()=' Admin ']//..)[1]")
	WebElement ClickOnAdminCheckBox;
	@FindBy(xpath = "//div[text()=' Admin ']//..//mat-pseudo-checkbox[contains(@class,'mat-pseudo-checkbox-checked')]")
	WebElement DisplayedAdminCheckBoxIsCheckedInFilterRole;
	
	@FindBy(xpath = "(//div[text()=' Standard User ']//..)[1]")
	WebElement ClickOnStandardUserCheckBox;
	@FindBy(xpath = "//div[text()=' Standard User ']//..//mat-pseudo-checkbox[contains(@class,'mat-pseudo-checkbox-checked')]")
	WebElement DisplayedStandardUserCheckBoxIsCheckedFilterRole;
	
	@FindBy(xpath = "(//div[text()=' Read Only ']//..)[1]")
	WebElement ClickOnReadOnlyCheckBox;
	@FindBy(xpath = "//div[text()=' Read Only ']//..//mat-pseudo-checkbox[contains(@class,'mat-pseudo-checkbox-checked')]")
	WebElement DisplayedReadOnlyCheckBoxIsCheckedFilterRole;
	
	@FindBy(xpath = "(//div[text()=' Calendar User ']//..)[1]")
	WebElement ClickOnCalendarUserCheckBox;
	@FindBy(xpath = "//div[text()=' Calendar User ']//..//mat-pseudo-checkbox[contains(@class,'mat-pseudo-checkbox-checked')]")
	WebElement DisplayedCalendarUserCheckBoxIsCheckedFilterRole;
	
	@FindBy(xpath = "(//div[text()=' Partner Admin ']//..)[1]")
	WebElement ClickOnPartnerAdminCheckBox;
	@FindBy(xpath = "//div[text()=' Partner Admin ']//..//mat-pseudo-checkbox[contains(@class,'mat-pseudo-checkbox-checked')]")
	WebElement DisplayedPartnerAdminCheckBoxIsCheckedFilterRole;
	
	@FindBy(xpath = "(//div[text()=' Sales Read Only ']//..)[1]")
	WebElement ClickOnSalesReadOnlyCheckBox;
	@FindBy(xpath = "//div[text()=' Sales Read Only ']//..//mat-pseudo-checkbox[contains(@class,'mat-pseudo-checkbox-checked')]")
	WebElement DisplayedSalesReadOnlyCheckBoxIsCheckedFilterRole;
	
	@FindBy(xpath = "(//div[text()=' Sales Team Manager ']//..)[1]")
	WebElement ClickOnSalesTeamManagerCheckBox;
	@FindBy(xpath = "//div[text()=' Sales Team Manager ']//..//mat-pseudo-checkbox[contains(@class,'mat-pseudo-checkbox-checked')]")
	WebElement DisplayedSalesTeamManagerCheckBoxIsCheckedFilterRole;
	
	@FindBy(xpath = "//span[text()='Clear Selection']")
	WebElement ClickOnClearSelectionButton;
	
	
	@FindBy(xpath = "//input[@name='useremailaddress'][@readonly]")
	WebElement DisplayedEmailIdInputboxIsDisabled;
	@FindBy(xpath = "//mat-checkbox[@name='ssoEnabled']//input[@aria-checked='false']")
	WebElement DisplayedSSOEnabledCheckBoxIsUnckecked;
	@FindBy(xpath = "//mat-checkbox[@name='Frozen']//input[@aria-checked='false']")
	WebElement DisplayedFrozenCheckBoxIsUnckecked;
	@FindBy(xpath = "//mat-checkbox[@name='CalendarUser']//input[@aria-checked='false']")
	WebElement DisplayedCalendarUserCheckBoxIsUnckecked;
	
	@FindBy(xpath = "//i-tabler[@name='user-circle']//..//..//span[text()='Automation Test']//..//..//..//..//..//td[contains(@class,'mat-column-CalendarUser')]//i-tabler[@name='circle-x']")
	WebElement DisplayedCrossMarkCircleInCalendarEnabledColumn;
	@FindBy(xpath = "//i-tabler[@name='user-circle']//..//..//span[text()='Automation Test']//..//..//..//..//..//td[contains(@class,'mat-column-ssoEnabled')]//i-tabler[@name='circle-x']")
	WebElement DisplayedCrossMarkCircleInSSOEnabledColumn;
	
	
	
	
	
	
	public void ClickOnUserAndAcces(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnUserAndAcces));
		ClickOnUserAndAcces.click();
	}
	
	
	public boolean DisplayedAlreadyAutomationTestUserRoleIsPresent(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedAlreadyAutomationTestUserRoleIsPresent));
			return DisplayedAlreadyAutomationTestUserRoleIsPresent.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	
	
	public void ClickOnAddButtonForUserAndAccess(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAddButtonForUserAndAccess));
		ClickOnAddButtonForUserAndAccess.click();
	}
	public void ClickOnDropdownForRole(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDropdownForRole));
		ClickOnDropdownForRole.click();
	}
	public void SelectAdminAsARole(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectAdminAsARole));
		SelectAdminAsARole.click();
	}
	public void SelectPartnerAdminAsARole(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectPartnerAdminAsARole));
		SelectPartnerAdminAsARole.click();
	}
	public void SelectPartnerIdDropdown(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectPartnerIdDropdown));
		SelectPartnerIdDropdown.click();
	}
	public void EnterFirstName(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterFirstName));
		EnterFirstName.sendKeys("Automation");
	}
	public void EnterLastName(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterLastName));
		EnterLastName.sendKeys("Test");
	}
	public void EnterEmailId(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterEmailId));
		EnterEmailId.sendKeys("ganesh+automation@leadangel.com");
	}
	
	
	public void ClickOnCheckBoxSSOEnabled(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCheckBoxSSOEnabled));
		ClickOnCheckBoxSSOEnabled.click();
	}
	public boolean DisplayedSSOEnabledCheckBoxIsChecked(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedSSOEnabledCheckBoxIsChecked));
		return DisplayedSSOEnabledCheckBoxIsChecked.isDisplayed();
	}
	
	
	public boolean DisplayedYourCalendarUserLicenseLimitIsExceededWarningMessage(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedYourCalendarUserLicenseLimitIsExceededWarningMessage));
			return DisplayedYourCalendarUserLicenseLimitIsExceededWarningMessage.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	public void ClickOnCancelButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCancelButton));
		ClickOnCancelButton.click();
	}
	public void ClickOnEditButtonForWarningMessagePurpose(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnEditButtonForWarningMessagePurpose));
		ClickOnEditButtonForWarningMessagePurpose.click();
	}
	public void UnCheckCalendarUserCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCalendarUserCheckBox));
		ClickOnCalendarUserCheckBox.click();
	}
	
	
	public void ClickOnCheckBoxFrozen(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCheckBoxFrozen));
		ClickOnCheckBoxFrozen.click();
	}
	public boolean DisplayedFrozenCheckBoxIsChecked(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedFrozenCheckBoxIsChecked));
		return DisplayedFrozenCheckBoxIsChecked.isDisplayed();
	}
	
	
	public void ClickOnCalendarUserCheckBoxEdit(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCalendarUserCheckBoxEdit));
		ClickOnCalendarUserCheckBoxEdit.click();
	}
	public boolean DisplayedCalendarUserCheckBoxIsChecked(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedCalendarUserCheckBoxIsChecked));
		return DisplayedCalendarUserCheckBoxIsChecked.isDisplayed();
	}
	
	
	public void ClickOnEditButtonForUserAndAccess(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnEditButtonForUserAndAccess));
		ClickOnEditButtonForUserAndAccess.click();
	}
	public void ClickOnDeleteButtonForUserAndAccess(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDeleteButtonForUserAndAccess));
		ClickOnDeleteButtonForUserAndAccess.click();
	}
	public void ClickOnReloadButtonForUserAndAccess(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnReloadButtonForUserAndAccess));
		ClickOnReloadButtonForUserAndAccess.click();
	}
	
	
	public boolean DisplayedCircleCheckInCalendarEnabledColumn(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedCircleCheckInCalendarEnabledColumn));
		return DisplayedCircleCheckInCalendarEnabledColumn.isDisplayed();
	}
	public boolean DisplayedCircleCheckInSSOEnabledColumn(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedCircleCheckInSSOEnabledColumn));
		return DisplayedCircleCheckInSSOEnabledColumn.isDisplayed();
	}
	public boolean DisplayedActiveInStatusColumn(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedActiveInStatusColumn));
		return DisplayedActiveInStatusColumn.isDisplayed();
	}
	public boolean DisplayedAsAdminUserRoleInRoleColumn(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedAsAdminUserRoleInRoleColumn));
		return DisplayedAsAdminUserRoleInRoleColumn.isDisplayed();
	}
	public boolean DisplayedINACTIVEInStatusColumn(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedINACTIVEInStatusColumn));
		return DisplayedINACTIVEInStatusColumn.isDisplayed();
	}
	public void ClickOnResetPasswordIcon(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnResetPasswordIcon));
		ClickOnResetPasswordIcon.click();
	}
	public void ClickOnSendLinkButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSendLinkButton));
		ClickOnSendLinkButton.click();
	}
	public boolean DisplayedReseyPasswordSuccessMessage(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedReseyPasswordSuccessMessage));
		return DisplayedReseyPasswordSuccessMessage.isDisplayed();
	}
	
	
	public boolean DisplayedEditButtonIsDisabledInActionsColumn(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedEditButtonIsDisabledInActionsColumn));
		return DisplayedEditButtonIsDisabledInActionsColumn.isDisplayed();
	}
	public boolean DisplayedResetPasswordButtonIsDisabledInActionsColumn(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedResetPasswordButtonIsDisabledInActionsColumn));
		return DisplayedResetPasswordButtonIsDisabledInActionsColumn.isDisplayed();
	}
	public boolean DisplayedDeleteButtonIsDisabledInActionsColumn(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedDeleteButtonIsDisabledInActionsColumn));
		return DisplayedDeleteButtonIsDisabledInActionsColumn.isDisplayed();
	}
	
	
	
	
	
	public void ClickOnRoleTab(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnRoleTab));
		ClickOnRoleTab.click();
	}
	
	
	public void ClickOnAdminCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAdminCheckBox));
		ClickOnAdminCheckBox.click();
	}
	public boolean DisplayedAdminCheckBoxIsCheckedInFilterRole(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedAdminCheckBoxIsCheckedInFilterRole));
		return DisplayedAdminCheckBoxIsCheckedInFilterRole.isDisplayed();
	}	
	
	
	public void ClickOnStandardUserCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnStandardUserCheckBox));
		ClickOnStandardUserCheckBox.click();
	}
	public boolean DisplayedStandardUserCheckBoxIsCheckedFilterRole(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedStandardUserCheckBoxIsCheckedFilterRole));
		return DisplayedStandardUserCheckBoxIsCheckedFilterRole.isDisplayed();
	}	
	
	
	public void ClickOnReadOnlyCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnReadOnlyCheckBox));
		ClickOnReadOnlyCheckBox.click();
	}
	public boolean DisplayedReadOnlyCheckBoxIsCheckedFilterRole(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedReadOnlyCheckBoxIsCheckedFilterRole));
		return DisplayedReadOnlyCheckBoxIsCheckedFilterRole.isDisplayed();
	}	
	
	
	public void ClickOnCalendarUserCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCalendarUserCheckBox));
		ClickOnCalendarUserCheckBox.click();
	}
	public boolean DisplayedCalendarUserCheckBoxIsCheckedFilterRole(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedCalendarUserCheckBoxIsCheckedFilterRole));
		return DisplayedCalendarUserCheckBoxIsCheckedFilterRole.isDisplayed();
	}
	
	
	public void ClickOnPartnerAdminCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnPartnerAdminCheckBox));
		ClickOnPartnerAdminCheckBox.click();
	}
	public boolean DisplayedPartnerAdminCheckBoxIsCheckedFilterRole(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedPartnerAdminCheckBoxIsCheckedFilterRole));
		return DisplayedPartnerAdminCheckBoxIsCheckedFilterRole.isDisplayed();
	}
	
	
	public void ClickOnSalesReadOnlyCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSalesReadOnlyCheckBox));
		ClickOnSalesReadOnlyCheckBox.click();
	}
	public boolean DisplayedSalesReadOnlyCheckBoxIsCheckedFilterRole(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedSalesReadOnlyCheckBoxIsCheckedFilterRole));
		return DisplayedSalesReadOnlyCheckBoxIsCheckedFilterRole.isDisplayed();
	}
	
	
	
	public void ClickOnSalesTeamManagerCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSalesTeamManagerCheckBox));
		ClickOnSalesTeamManagerCheckBox.click();
	}
	public boolean DisplayedSalesTeamManagerCheckBoxIsCheckedFilterRole(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedSalesTeamManagerCheckBoxIsCheckedFilterRole));
		return DisplayedSalesTeamManagerCheckBoxIsCheckedFilterRole.isDisplayed();
	}
	
	
	public void ClickOnClearSelectionButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnClearSelectionButton));
		ClickOnClearSelectionButton.click();
	}
	
	
	public boolean DisplayedEmailIdInputboxIsDisabled(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedEmailIdInputboxIsDisabled));
		return DisplayedEmailIdInputboxIsDisabled.isDisplayed();
	}
	public boolean DisplayedSSOEnabledCheckBoxIsUnckecked(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedSSOEnabledCheckBoxIsUnckecked));
		return DisplayedSSOEnabledCheckBoxIsUnckecked.isDisplayed();
	}
	public boolean DisplayedFrozenCheckBoxIsUnckecked(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedFrozenCheckBoxIsUnckecked));
		return DisplayedFrozenCheckBoxIsUnckecked.isDisplayed();
	}
	public boolean DisplayedCalendarUserCheckBoxIsUnckecked(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedCalendarUserCheckBoxIsUnckecked));
		return DisplayedCalendarUserCheckBoxIsUnckecked.isDisplayed();
	}
	
	
	public boolean DisplayedCrossMarkCircleInCalendarEnabledColumn(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedCrossMarkCircleInCalendarEnabledColumn));
		return DisplayedCrossMarkCircleInCalendarEnabledColumn.isDisplayed();
	}
	public boolean DisplayedCrossMarkCircleInSSOEnabledColumn(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedCrossMarkCircleInSSOEnabledColumn));
		return DisplayedCrossMarkCircleInSSOEnabledColumn.isDisplayed();
	}
	
	//************************************************* Partner Management ***************************************************

	@FindBy(xpath = "//span[text()='Partner Management ']")
	WebElement ClickOnPartnerManagement;
	
	@FindBy(xpath = "//span[text()='New Partner ']")
	WebElement ClickOnNewPartnerButton;
	
	@FindBy(xpath = "//input[@name='partnername']")
	public WebElement EnterPartnerName;
	@FindBy(xpath = "//input[@name='partnername'][@readonly]")
	WebElement DisplayedPartnerNameTextboxIsDisabled;
	@FindBy(xpath = "//input[@name='partneradminemailid']")
	WebElement EnterParnerEmailId;
	@FindBy(xpath = "//input[@name='partneradminemailid'][@readonly]")
	WebElement DisplayedEmailIdTextboxIsDisabled;
	@FindBy(xpath = "//input[@name='location']")
	WebElement EnterParnerLocation;
	@FindBy(xpath = "//input[@name='speciality']")
	WebElement EnterParnerSpeciality;
	@FindBy(xpath = "//input[@name='customfield1']")
	WebElement EnterParnerCustomfield1;
	@FindBy(xpath = "//textarea[@name='customfield1notes']")
	WebElement EnterParnerCustomfield1notes;
	@FindBy(xpath = "//input[@name='customfield2']")
	WebElement EnterParnerCustomfield2;
	@FindBy(xpath = "//textarea[@name='customfield2notes']")
	WebElement EnterParnerCustomfield2notes;

	
	
	@FindBy(xpath = "(//span[text()='Via Email']//..)[1]")
	WebElement ClickOnViaEmailCheckBox;
	@FindBy(xpath = "//input[@name='emaildeliveryaddress']")
	WebElement EnterViaEmail;
	
	@FindBy(xpath = "//span[text()='Add']")
	WebElement ClikcOnAddButtonForNewPartnerPopup;
	
	@FindBy(xpath = "//td[contains(@class,'mat-column-PartnerAdminEmailID')]//span[text()='ganesh+automation@leadangel.com']//..//..//..//td[contains(@class,'mat-column-partnerName')]//span[text()]")
	public WebElement GetPartnaerNameText;
	@FindBy(xpath = "//td[contains(@class,'mat-column-PartnerAdminEmailID')]//span[text()='ganesh+automation@leadangel.com']//..//..//..//td[contains(@class,'mat-column-PartnerAdminEmailID')]//span[text()]")
	public WebElement GetPartnerAdminEmailIDText;
	@FindBy(xpath = "//td[contains(@class,'mat-column-PartnerAdminEmailID')]//span[text()='ganesh+automation@leadangel.com']//..//..//..//td[contains(@class,'mat-column-Location')]//span[text()]")
	public WebElement GetLocationText;
	@FindBy(xpath = "//td[contains(@class,'mat-column-PartnerAdminEmailID')]//span[text()='ganesh+automation@leadangel.com']//..//..//..//td[contains(@class,'mat-column-Speciality')]//span[text()]")
	public WebElement GetSpecialityText;
	
	
	@FindBy(xpath = "//td[contains(@class,'mat-column-PartnerAdminEmailID')]//span[text()='ganesh+automation@leadangel.com']")
    WebElement DisplayedPartnerAlreadyExists;
	@FindBy(xpath = "//td[contains(@class,'mat-column-PartnerAdminEmailID')]//span[text()='ganesh+automation@leadangel.com']//..//..//..//mat-icon[text()='delete']")
	WebElement ClickOnDeleteButtonForAlreadyExistsPartner;
	@FindBy(xpath = "//td[contains(@class,'mat-column-PartnerAdminEmailID')]//span[text()='ganesh+automation@leadangel.com']//..//..//..//mat-icon[text()='edit']")
	WebElement ClickOnEditButtonForPartner;
	
	
	@FindBy(xpath = "//input[@placeholder='Filter']")
	WebElement EnterValueInFilterBox;
	
	@FindBy(xpath = "(//div[text()='Success'])[1]")
	WebElement DisplayedSuccessMessagePartner;
	@FindBy(xpath = "(//div[text()='Can not delete Partner. It is added as USER'])[1]")
	WebElement DisplayedCannotDeleteErrorMessagePartner;
	
	
	@FindBy(xpath = "//td[contains(@class,'mat-column-PartnerAdminEmailID')]//span[text()='ganesh+automation@leadangel.com']//..//..//..//mat-icon[text()='visibility']")
	WebElement ClickOnVisibilityIcon;
	
	
	
	
	
	
	public void ClickOnVisibilityIcon(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnVisibilityIcon));
		ClickOnVisibilityIcon.click();
	}
	
	
	public void ClickOnPartnerManagement(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnPartnerManagement));
		ClickOnPartnerManagement.click();
	}
	
	public void ClickOnNewPartnerButton(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnNewPartnerButton));
		ClickOnNewPartnerButton.click();
	}
	
	
	public void EnterPartnerName(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterPartnerName));
		EnterPartnerName.sendKeys("Automation");
	}
	public boolean DisplayedPartnerNameTextboxIsDisabled(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedPartnerNameTextboxIsDisabled));
		return DisplayedPartnerNameTextboxIsDisabled.isDisplayed();
	}
	public void EnterParnerEmailId(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterParnerEmailId));
		EnterParnerEmailId.sendKeys("ganesh+automation@leadangel.com");
	}
	public boolean DisplayedEmailIdTextboxIsDisabled(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedEmailIdTextboxIsDisabled));
		return DisplayedEmailIdTextboxIsDisabled.isDisplayed();
	}
	public void EnterParnerLocation(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterParnerLocation));
		EnterParnerLocation.sendKeys("Bhilai");
	}
	public void EnterParnerSpeciality(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterParnerSpeciality));
		EnterParnerSpeciality.sendKeys("Automation Testing");
	}
	public void EnterParnerCustomfield1(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterParnerCustomfield1));
		EnterParnerCustomfield1.sendKeys("Custom Field 1");
	}
	public void EnterParnerCustomfield1notes(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterParnerCustomfield1notes));
		EnterParnerCustomfield1notes.sendKeys("Custom Field 1 (Notes)");
	}
	public void EnterParnerCustomfield2(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterParnerCustomfield2));
		EnterParnerCustomfield2.sendKeys("Custom Field 2");
	}
	public void EnterParnerCustomfield2notes(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterParnerCustomfield2notes));
		EnterParnerCustomfield2notes.sendKeys("Custom Field 2 (Notes)");
	}
	public void EnterEditParnerCustomfield2notes(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterParnerCustomfield2notes));
		EnterParnerCustomfield2notes.sendKeys("Automation Tesing Going On..........");
	}
	
	
	public void ClickOnViaEmailCheckBox(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnViaEmailCheckBox));
		ClickOnViaEmailCheckBox.click();
	}
	public void EnterViaEmail(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterViaEmail));
		EnterViaEmail.sendKeys("ganesh+testing@leadangel.com");
	}
	
	public void ClikcOnAddButtonForNewPartnerPopup(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClikcOnAddButtonForNewPartnerPopup));
		ClikcOnAddButtonForNewPartnerPopup.click();
	}
	
	
	public boolean DisplayedPartnerAlreadyExists(){
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedPartnerAlreadyExists));
			return DisplayedPartnerAlreadyExists.isDisplayed();
		} catch (Exception e) {
		return false;
		}
	}
	public void ClickOnDeleteButtonForAlreadyExistsPartner(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDeleteButtonForAlreadyExistsPartner));
		ClickOnDeleteButtonForAlreadyExistsPartner.click();
	}
	public void ClickOnEditButtonForPartner(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnEditButtonForPartner));
		ClickOnEditButtonForPartner.click();
	}
	
	public boolean DisplayedSuccessMessagePartner(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedSuccessMessagePartner));
		return DisplayedSuccessMessagePartner.isDisplayed();
	}
	public boolean DisplayedCannotDeleteErrorMessagePartner(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedCannotDeleteErrorMessagePartner));
		return DisplayedCannotDeleteErrorMessagePartner.isDisplayed();
	}
	
	public void ClickSuccessMessagePartner(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(DisplayedSuccessMessagePartner));
		 DisplayedSuccessMessagePartner.click();
	}
	
	
	
	//****************************** OverView Page ***************************************

	@FindBy(xpath="//th[@role='columnheader']//label[@class='mat-checkbox-layout']")
	WebElement ClickOnColumnHeaderCheckBox;
	@FindBy(xpath="//th[@role='columnheader']//label[@class='mat-checkbox-layout']//input[@aria-checked='true']")
	WebElement DisplayedColumnHeaderCheckBoxIsChecked;
	@FindBy(xpath="//th[@role='columnheader']//label[@class='mat-checkbox-layout']//input[@aria-checked='false']")
	WebElement DisplayedColumnHeaderCheckBoxIsNotChecked;
	@FindBy(xpath="(//span[text()=' Delete']//..)[1][@disabled='true']")
	WebElement DisplayedDeleteButtonIsDisabled;
	
	
	@FindBy(xpath="//span[text()='AutoTestObject_Rename']//..//..//..//span[text()='Lead']//..//..//..//label[@class='mat-checkbox-layout']")
	WebElement DisplayedRenameAutTestObjectCheckBox;
	@FindBy(xpath="//span[text()='AutoTestObject']//..//..//..//span[text()='Lead']//..//..//..//label[@class='mat-checkbox-layout']")
	WebElement DisplayedAutTestObjectCheckBox;
	
	@FindBy(xpath="//span[text()='AutoTestObject']//..//..//..//label[@class='mat-checkbox-layout']")
	WebElement ClickOnAutTestObjectCheckBox;
	@FindBy(xpath="//span[text()='AutoTestObject']//..//..//..//span[text()='Lead']//..//..//..//input[@type='checkbox'][@aria-checked='true']")
	WebElement DisplayedAutTestObjectCheckBoxIsChecked;
	@FindBy(xpath="//span[text()='AutoTestObject_Rename']//..//..//..//span[text()='Lead']//..//..//..//input[@type='checkbox'][@aria-checked='true']")
	WebElement DisplayedRenameAutTestObjectCheckBoxIsChecked;
	@FindBy(xpath="//span[text()='AutoTestObject']//..//..//..//span[text()='Lead']//..//..//..//input[@type='checkbox'][@aria-checked='false']")
	WebElement DisplayedAutTestObjectCheckBoxIsNotChecked;
	@FindBy(xpath="//span[text()='AutoTestObject_Rename']//..//..//..//span[text()='Lead']//..//..//..//input[@type='checkbox'][@aria-checked='false']")
	WebElement DisplayedRenameAutTestObjectCheckBoxIsNotChecked;
	
	
	@FindBy(xpath="//input[@placeholder='Filter']")
	WebElement EnterTextInFilterBox;
	@FindBy(xpath="//span[text()='Lead']//..//..//..//span[text()='AutoTestObject']")
	WebElement DisplayedLeadAutoTestObject;
	@FindBy(xpath="//span[text()='AutoTestObject_Rename']")
	WebElement DisplayedRenameAutoTestObject;

	@FindBy(xpath="//span[text()='Lead']//..//..//..//span[text()='AutoTestObject']//..//..//..//mat-icon[contains(@class,'text-danger')]")
	WebElement DisplayedLeadAutoTestObjectIsNotUsed;
	@FindBy(xpath="//span[text()='Lead']//..//..//..//span[text()='AutoTestObject']//..//..//..//mat-icon[contains(@class,'text-success ')]")
	WebElement DisplayedLeadAutoTestObjectIsUsed;
	@FindBy(xpath="//span[text()='AutoTestObject']//..//..//..//mat-icon[contains(@class,'text-success ')]")
	WebElement DisplayedRenameAutoTestObjectIsUsed;
	@FindBy(xpath="//mat-icon[text()='clear']")
	WebElement ClearTestFromTheFilterBox;
	
	
	@FindBy(xpath="//span[text()='Custom Header ']")
	WebElement ClickOnCustomHeaderFeature;
	@FindBy(xpath="//span[text()='Webhook ']")
	WebElement ClickOnWebhookFeature;
	@FindBy(xpath="//span[text()='Response Mapping ']")
	WebElement ClickOnResponseMappingFeature;
	@FindBy(xpath="//span[text()='Email ']")
	WebElement ClickOnEmailFeature;
	@FindBy(xpath="//span[text()='Twilio ']")
	WebElement ClickOnTwilioFeature;
	@FindBy(xpath="//span[text()='CRM In-App ']")
	WebElement ClickOnCRMInAppFeature;
	@FindBy(xpath="//span[text()='Slack ']")
	WebElement ClickOnSlackFeature;
	
	@FindBy(xpath="//span[text()=' Delete']")
	WebElement ClickOnDeleteButtonOverViewPage;
	@FindBy(xpath="//span[text()=' Delete ']")
	WebElement ClickAgainDeleteButtonOverViewPage;
	@FindBy(xpath="//span[text()='Delete ']")
	WebElement ClickOnDeleteButtonForWebhook;
	
	@FindBy(xpath="//input[@tabindex='-1'][contains(@class,'cdk-visually-hidden')]")
	WebElement DisplayedColumnHeaderCheckIsDisabled;
	
	@FindBy(xpath = "((//div[text()='Used By']//..)[1]//mat-icon[text()=' expand_more '])[1]")
    WebElement ClickOnUsedByDropDown;
	@FindBy(xpath = "((//div[text()='Used By']//..)[1]//span[@class='custom-option-content cursor-pointer'][text()])[1]")
	public WebElement GetTextFromUsedByRouterName;
	
	@FindBy(xpath = "//span[@class='featureTitle']")
	public WebElement GetTextOfLeftMenuTitle;
	@FindBy(xpath = "((//div[text()='Used By']//..)[1]//span[@class='custom-option-content cursor-pointer'])[1]")
	WebElement ClickUsedByRouterName;
	
	
	@FindBy(xpath = "//h4[text()='Auto Conversion Overview']")
	WebElement DisplayAutoConversionOverview;
	@FindBy(xpath = "//h4[text()='Response Mapping Overview']")
	WebElement DisplayResponseMappingOverview;
	@FindBy(xpath = "//h4[text()='Webhook Overview']")
	WebElement DisplayWebhookOverview;
	@FindBy(xpath = "//h4[text()='Email Overview']")
	WebElement DisplayEmailOverview;
	@FindBy(xpath = "//h4[text()='Twilio Overview']")
	WebElement DisplayTwilioOverview;
	
	@FindBy(xpath = "//h4[text()='Slack Overview']")
	WebElement DisplaySlackOverview;
	
	@FindBy(xpath = "//span[text()='Lead']//..//..//..//span[text()='AutoTestObject_Rename']")
	WebElement DisplayedLeadAutoTestObjectRename;

	@FindBy(xpath="//span[text()='AutoTestObject_Rename']//..//..//..//span[text()='Lead']//..//..//..//label[@class='mat-checkbox-layout']")
	WebElement DisplayedLeadAutTestObjectRenameCheckBox;
	
	@FindBy(xpath="//span[text()='Lead']//..//..//..//span[text()='AutoTestObject_Rename']//..//..//..//mat-icon[contains(@class,'text-danger')]")
	WebElement DisplayedLeadAutoTestObjectRenameIsNotUsed;
	
	@FindBy(xpath="//span[text()='Lead']//..//..//..//span[text()='AutoTestObject_Rename']//..//..//..//mat-icon[contains(@class,'text-success ')]")
	WebElement DisplayedLeadAutoTestObjectRenameIsUsed;
	
	
	
	
	public boolean DisplayedLeadAutoTestObjectRenameIsUsed() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedLeadAutoTestObjectRenameIsUsed));
			return DisplayedLeadAutoTestObjectRenameIsUsed.isDisplayed();
		}catch(Exception e) {
			return false;
		}		
	}
	
	public boolean DisplayedLeadAutoTestObjectRenameIsNotUsed() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedLeadAutoTestObjectRenameIsNotUsed));
			return DisplayedLeadAutoTestObjectRenameIsNotUsed.isDisplayed();
		}catch(Exception e) {
			return false;
		}		
	}
	
	
	public boolean DisplayedLeadAutTestObjectRenameCheckBox() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedLeadAutTestObjectRenameCheckBox));
			return DisplayedLeadAutTestObjectRenameCheckBox.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	public boolean DisplayedLeadAutoTestObjectRename() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedLeadAutoTestObjectRename));
			return DisplayedLeadAutoTestObjectRename.isDisplayed();
		}catch(Exception e) {
			return false;
		}		
	}
	public boolean DisplayResponseMappingOverview() {
		  new WebDriverWait(ldriver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(DisplayResponseMappingOverview));
		  return DisplayResponseMappingOverview.isDisplayed();
	}
	public boolean DisplayWebhookOverview() {
		  new WebDriverWait(ldriver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(DisplayWebhookOverview));
		  return DisplayWebhookOverview.isDisplayed();
	}
	public boolean DisplayEmailOverview() {
		  new WebDriverWait(ldriver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(DisplayEmailOverview));
		  return DisplayEmailOverview.isDisplayed();
	}
	public boolean DisplayAutoConversionOverview() {
		  new WebDriverWait(ldriver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(DisplayAutoConversionOverview));
		  return DisplayAutoConversionOverview.isDisplayed();
	}
	
	public boolean DisplayTwilioOverview() {
		  new WebDriverWait(ldriver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(DisplayTwilioOverview));
		  return DisplayTwilioOverview.isDisplayed();
	}
	public boolean DisplaySlackOverview() {
		  new WebDriverWait(ldriver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(DisplaySlackOverview));
		  return DisplaySlackOverview.isDisplayed();
	}
	
	public void ClickUsedByRouterName() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickUsedByRouterName));
		ClickUsedByRouterName.click();
	}

	public void ClickOnUsedByDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnUsedByDropDown));
		ClickOnUsedByDropDown.click();
	}
	public void ClickOnDeleteButtonForWebhook() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnDeleteButtonForWebhook));
		ClickOnDeleteButtonForWebhook.click();
	}
	public void ClearTestFromTheFilterBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClearTestFromTheFilterBox));
		ClearTestFromTheFilterBox.click();
	}
	
	public boolean DisplayedLeadAutoTestObjectIsUsed() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedLeadAutoTestObjectIsUsed));
			return DisplayedLeadAutoTestObjectIsUsed.isDisplayed();
		}catch(Exception e) {
			return false;
		}		
	}
	public boolean DisplayedRenameAutoTestObjectIsUsed() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedRenameAutoTestObjectIsUsed));
			return DisplayedRenameAutoTestObjectIsUsed.isDisplayed();
		}catch(Exception e) {
			return false;
		}		
	}
	
	public boolean DisplayedLeadAutoTestObjectIsNotUsed() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedLeadAutoTestObjectIsNotUsed));
			return DisplayedLeadAutoTestObjectIsNotUsed.isDisplayed();
		}catch(Exception e) {
			return false;
		}		
	}
	
	public boolean DisplayedRenameAutoTestObject() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedRenameAutoTestObject));
			return DisplayedRenameAutoTestObject.isDisplayed();
		}catch(Exception e) {
			return false;
		}		
	}
	public boolean DisplayedLeadAutoTestObject() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedLeadAutoTestObject));
			return DisplayedLeadAutoTestObject.isDisplayed();
		}catch(Exception e) {
			return false;
		}		
	}
	public boolean DisplayedColumnHeaderCheckIsDisabled() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedColumnHeaderCheckIsDisabled));
			return DisplayedColumnHeaderCheckIsDisabled.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	
	public void ClickOnDeleteButtonOverViewPage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnDeleteButtonOverViewPage));
		ClickOnDeleteButtonOverViewPage.click();
	}
	public void ClickAgainDeleteButtonOverViewPage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickAgainDeleteButtonOverViewPage));
		ClickAgainDeleteButtonOverViewPage.click();
	}
	
	

	
	
	public void ClickOnCustomHeaderFeature() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnCustomHeaderFeature));
		ClickOnCustomHeaderFeature.click();
	}
	public void ClickOnResponseMappingFeature() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnResponseMappingFeature));
		ClickOnResponseMappingFeature.click();
	}
	public void ClickOnWebhookFeature() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnWebhookFeature));
		ClickOnWebhookFeature.click();
	}
	public void ClickOnEmailFeature() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnEmailFeature));
		ClickOnEmailFeature.click();
	}
	public void ClickOnTwilioFeature() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnTwilioFeature));
		ClickOnTwilioFeature.click();
	}
	
	public void ClickOnCRMInAppFeature() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnCRMInAppFeature));
		ClickOnCRMInAppFeature.click();
	}
	public void ClickOnSlackFeature() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnSlackFeature));
		ClickOnSlackFeature.click();
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
	public boolean DisplayedRenameAutTestObjectCheckBox() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedRenameAutTestObjectCheckBox));
			return DisplayedRenameAutTestObjectCheckBox.isDisplayed();
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
	public boolean DisplayedRenameAutTestObjectCheckBoxIsChecked() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedRenameAutTestObjectCheckBoxIsChecked));
        return DisplayedRenameAutTestObjectCheckBoxIsChecked.isDisplayed();
	}
	public boolean DisplayedAutTestObjectCheckBoxIsNotChecked() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedAutTestObjectCheckBoxIsNotChecked));
        return DisplayedAutTestObjectCheckBoxIsNotChecked.isDisplayed();
	}
	public boolean DisplayedRenameAutTestObjectCheckBoxIsNotChecked() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedRenameAutTestObjectCheckBoxIsNotChecked));
        return DisplayedRenameAutTestObjectCheckBoxIsNotChecked.isDisplayed();
	}
	
	
	public void EnterTextInFilterBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(EnterTextInFilterBox));
		EnterTextInFilterBox.sendKeys("AutoTestObject");
	}
	
	
	
	//******************************  move *****************************
	
	@FindBy(xpath="//option[text()=' CRUD ']")
	WebElement SelectFolderToAutotestObject;
	@FindBy(xpath = "//input[@id='menuname']")
	WebElement txtNameObject;
	@FindBy(xpath = "//select[@id='ddlcausetype']//option[2]")
	WebElement SelectMainFolder;
	
	@FindBy(xpath="(//span[contains(text(),'AutoTestObject_Rename_Copy')])[1]")
	WebElement DisplayedAutoTestObjectRenameCopy;
	@FindBy(xpath="//button[@aria-label='toggle CRUD']")
	WebElement ClickOnCrudFolderDropdown;

	
	
	
	
	
	
	
	
	
	
	
	
	public void ClickOnCrudFolderDropdown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnCrudFolderDropdown));
		ClickOnCrudFolderDropdown.click();
	}
	
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
	public void SelectFolderToAutotestObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectFolderToAutotestObject));
		SelectFolderToAutotestObject.click();
	}
	
	public void NameInObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(txtNameObject));
		txtNameObject.sendKeys("CRUD");
	}
	
	public void SelectMainFolder() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectMainFolder));
		SelectMainFolder.click();
	}
	
	
	//***********************************************************  SAML Configuaration *****************************************************
	
	@FindBy(xpath="//span[text()=' Connect SAML ']")
	WebElement ClickOnConnectSAMLBox;
	
	@FindBy(xpath="//span[text()='SAML Configuration ']")
	WebElement ClickOnSAMLCinfuguration;
	
	@FindBy(xpath="//li[text()=' SAML Configuration ']")
	WebElement DisplayedSAMLConfiguration;
	
	@FindBy(xpath="(//label[text()='SAML Provider Entity ID ']//..//input[@id='entityID'])[2]")
	WebElement EnterEntityID;
	
	@FindBy(xpath="(//label[text()='Single Sign On (SSO) URL ']//..//input[@id='samlUrl'])[2]")
	WebElement EnterSingleSignIOn_Url;
	
	@FindBy(xpath="(//label[text()='Logout URL ']//..//input[@id='samlLogoutUrl'])[2]")
	WebElement EnterLogout_Url;
	
	
	@FindBy(xpath="(//label[text()='Certificate ']//..//textarea[@id='cert'])[2]")
	WebElement EnterLogout_Certificate;
	
	@FindBy(xpath="(//span[text()='Sandbox']//..)[2]")
	WebElement ClickOnSandBoxRadioButton;
	@FindBy(xpath="(//input[@tabindex='0'])[2]//..//..//span[text()='Sandbox']")
	WebElement DisplayedSandboxRadioButtonIsClicked;
	
	@FindBy(xpath="(//span[text()='Test']//..)[2]")
	WebElement ClickOnTestRadioButton;
	@FindBy(xpath="(//input[@tabindex='0'])[2]//..//..//span[text()='Test']")
	WebElement DisplayedTestboxRadioButtonIsClicked;
	
	@FindBy(xpath="//i-tabler[@name='copy']")
	WebElement ClickOnCpyButton;
	@FindBy(xpath="//div[text()='Copied']")
	WebElement DisplayedCpiedSuccessMessage;
	
	@FindBy(xpath="//span[text()=' Update ']")
	WebElement ClickOnUpdateButtonSAML;
	@FindBy(xpath="//div[text()='Updated Successfully']")
	WebElement DisplayedUpdatedSuccessMessage;
	
	@FindBy(xpath="//span[text()=' Save ']")
	WebElement ClickOnSaveButtonSAML;
	@FindBy(xpath="//div[text()='Inserted Successfully']")
	WebElement DisplayedInsertedSuccessfullyMessage;
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void ClickOnConnectSAMLBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnConnectSAMLBox));
		ClickOnConnectSAMLBox.click();
	}
	
	public void ClickOnSAMLCinfuguration() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnSAMLCinfuguration));
		ClickOnSAMLCinfuguration.click();
	}
	
	public boolean DisplayedSAMLConfiguration() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedSAMLConfiguration));
		return DisplayedSAMLConfiguration.isDisplayed();
	}
	
	public void EnterEntityID() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(EnterEntityID));
		EnterEntityID.clear();
		EnterEntityID.sendKeys("http://www.okta.com/exkhqnldynJ4i6l66697");
	}
	public void EnterSingleSignIOn_Url() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(EnterSingleSignIOn_Url));
		EnterSingleSignIOn_Url.clear();
		EnterSingleSignIOn_Url.sendKeys("https://trial-5773046.okta.com/app/trial-5773046_app1002_2/exkhqnldynJ4i6l66697/sso/saml");
	}
	
	public void EnterLogout_Url() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(EnterLogout_Url));
		EnterLogout_Url.clear();
		EnterLogout_Url.sendKeys("https://app.leadangel.com/uiapi/sso/logout");
	}
	
	public void EnterLogout_Certificate() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(EnterLogout_Certificate));
		EnterLogout_Certificate.clear();
		EnterLogout_Certificate.sendKeys("MIIDqjCCApKgAwIBAgIGAZFKhionMA0GCSqGSIb3DQEBCwUAMIGVMQswCQYDVQQGEwJVUzETMBEG\r\n"
				+ "A1UECAwKQ2FsaWZvcm5pYTEWMBQGA1UEBwwNU2FuIEZyYW5jaXNjbzENMAsGA1UECgwET2t0YTEU\r\n"
				+ "MBIGA1UECwwLU1NPUHJvdmlkZXIxFjAUBgNVBAMMDXRyaWFsLTU3NzMwNDYxHDAaBgkqhkiG9w0B\r\n"
				+ "CQEWDWluZm9Ab2t0YS5jb20wHhcNMjQwODEzMDY1NTMyWhcNMzQwODEzMDY1NjMyWjCBlTELMAkG\r\n"
				+ "A1UEBhMCVVMxEzARBgNVBAgMCkNhbGlmb3JuaWExFjAUBgNVBAcMDVNhbiBGcmFuY2lzY28xDTAL\r\n"
				+ "BgNVBAoMBE9rdGExFDASBgNVBAsMC1NTT1Byb3ZpZGVyMRYwFAYDVQQDDA10cmlhbC01NzczMDQ2\r\n"
				+ "MRwwGgYJKoZIhvcNAQkBFg1pbmZvQG9rdGEuY29tMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIB\r\n"
				+ "CgKCAQEA5VE6aRoMWMoOX4tuOwlEsVc6mp4fpOVMSJc/mIo/I/H8fon5mBCYOBSD7Ccyjp/SzvSd\r\n"
				+ "KIIcbagJ56n0H6hPLfN8izEdEDVTaL6mGi0MkhRnwgfzD8L/sOATmXAib3t+voc7FKG2qxu0YFSp\r\n"
				+ "ybz5Sf3WkxNWDKWZR16Cob3xKToxMFZa8eO1MtrVxk+FY6Hbxb+drOlgbbgGknW858JZox5xwnKG\r\n"
				+ "sO6Ax102lFKgyHJupX+Xq8YxDufA+UD93gLKn2WDcj9xBSR4eioFpff5VQElJXwY3vENEbExDn0L\r\n"
				+ "qG5KSOmKvquRSEUQ8TEr3z//Hc8UyKOasYMqvZLNth/VsQIDAQABMA0GCSqGSIb3DQEBCwUAA4IB\r\n"
				+ "AQAUHngCqlQSGeC2j7LHY/3HfthL3BOybZIQL9+9cfz5fQkDg49ijzbcWczD/3KhyNW1DqXKs1V+\r\n"
				+ "kRCMYSTJ9AoQwqG0e380d59H3u5K2HEPHJZUKYTl9VoMTjy7jGzUq/gClAsi9M9V/J0GbXIl41Ny\r\n"
				+ "SB/SOC/LjsqWzXR3Gybr8uaevBmHknya2LJU3hujZVJ/yzMx7k3yMaBwaNL6K70v6//sIfmJronD\r\n"
				+ "VlF0PeG+H5RlijeQ1WKRItOD8bHD43WZz1SZRuuxpiG/vTeY7gloe4HEFElbawLsai20QaJVVccH\r\n"
				+ "+GYcM/Wg3ae6NlQOUFO6sbij8nGdSLFocyFMLuZW");
	}
	
	
	public void ClickOnSandBoxRadioButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnSandBoxRadioButton));
		ClickOnSandBoxRadioButton.click();
	}
	
	public boolean DisplayedSandboxRadioButtonIsClicked() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedSandboxRadioButtonIsClicked));
		return DisplayedSandboxRadioButtonIsClicked.isDisplayed();
	}
	
	
	
	public void ClickOnTestRadioButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnTestRadioButton));
		ClickOnTestRadioButton.click();
	}
	public boolean DisplayedTestboxRadioButtonIsClicked() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedTestboxRadioButtonIsClicked));
		return DisplayedTestboxRadioButtonIsClicked.isDisplayed();
	}
	
	public void ClickOnCpyButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnCpyButton));
		ClickOnCpyButton.click();
	}
	public boolean DisplayedCpiedSuccessMessage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedCpiedSuccessMessage));
		return DisplayedCpiedSuccessMessage.isDisplayed();
	}
	
	
	public void ClickOnUpdateButtonSAML() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnUpdateButtonSAML));
		ClickOnUpdateButtonSAML.click();
	}
	public boolean DisplayedUpdatedSuccessMessage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedUpdatedSuccessMessage));
		return DisplayedUpdatedSuccessMessage.isDisplayed();
	}
	public boolean DisplayedUpdatedMessage() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(ClickOnUpdateButtonSAML));
			return ClickOnUpdateButtonSAML.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	
	
	public void ClickOnSaveButtonSAML() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnSaveButtonSAML));
		ClickOnSaveButtonSAML.click();
	}
	public boolean DisplayedInsertedSuccessfullyMessage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedInsertedSuccessfullyMessage));
		return DisplayedInsertedSuccessfullyMessage.isDisplayed();
	}
	public boolean DisplayedSavedMessage() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(ClickOnSaveButtonSAML));
			return ClickOnSaveButtonSAML.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
