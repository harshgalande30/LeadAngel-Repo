package com.leadAngel.pageObjects;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OTSnotifications_PageObjectModel {

	WebDriver ldriver;

	public OTSnotifications_PageObjectModel(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
}
	
	
	//************************************************* Accept Confirmation ***********************************************
	
	@FindBy(xpath = "//button[@aria-label='toggle OTS Notifications']")
	WebElement ClickOnOTSnotificationsDropDown;
	
	@FindBy(xpath = "//span[text()='Accept Confirmation ']")
	WebElement ClickOnAcceptConfirmation;
	
	@FindBy(xpath = "//span[text()=' Save ']")
	WebElement ClickOnSaveButton;
	
	@FindBy(xpath = "(//span[text()=' Save '])[2]")
	WebElement ClickOnSaveButtonCRMinApp;
	
	@FindBy(xpath = "//span[text()=' Restore Default ']")
	WebElement ClickOnRestoreDefaultButton;
	
	@FindBy(xpath = "//button[@mattooltip='Copy']")
	WebElement ClickOnCopyButton;
	
	@FindBy(xpath = "//button[@title='undo']")
	WebElement ClickOnUndoButton;
	
	@FindBy(xpath = "(//button[@title='undo'])[2]")
	WebElement ClickOnUndoButtonCRMinApp;
	
	@FindBy(xpath = "//button[@title='bold']")
	WebElement ClickOnBoldButton;
	@FindBy(xpath = "(//div[@class='st-area']//b)[1]")
	WebElement DisplayedSelectedTextIsBold;
	@FindBy(xpath = "(//div[@class='st-area']//b//i)[1]")
	WebElement DisplayedSelectedTextIsItalic;
	@FindBy(xpath = "(//div[@class='st-area']//b//i//u)[1]")
	WebElement DisplayedSelectedTextIsUnderlined;
	@FindBy(xpath = "(//div[@class='st-area']//ol)[1]")
	WebElement DisplayedSelectedTextIsOrderedList;
	@FindBy(xpath = "(//div[@class='st-area']//ul)[1]")
	WebElement DisplayedSelectedTextIsUnOrderedList;
	@FindBy(xpath = "(//div[@class='st-area']//ul//ul)[1]")
	WebElement DisplayedSelectedTextIsIndent;
	@FindBy(xpath = "(//div[@class='st-area']//ul//ul//li[@style='text-align: justify;'])[1]")
	WebElement DisplayedSelectedTextIsAlignJustify;
	@FindBy(xpath = "(//div[@class='st-area']//ul//ul//li[@style='text-align: center;'])[1]")
	WebElement DisplayedSelectedTextIsAligncenter;
	@FindBy(xpath = "(//div[@class='st-area']//ul//ul//li[@style='text-align: left;'])[1]")
	WebElement DisplayedSelectedTextIsAlignLeft;
	@FindBy(xpath = "(//div[@class='st-area']//ul//ul//li[@style='text-align: right;'])[1]")
	WebElement DisplayedSelectedTextIsAlignRight;
	@FindBy(xpath = "(//div[@class='st-area']//ul//ul//li[@style='text-align: right;']//font[@size='7'])[1]")
	WebElement DisplayedSelectedTextFontSizeHasBeenChanged;
	
	@FindBy(xpath = "(//button[@title='bold'])[2]")
	WebElement ClickOnBoldButtonCRMinApp;
	
	@FindBy(xpath = "//button[@title='italic']")
	WebElement ClickOnItalicButton;
	
	@FindBy(xpath = "(//button[@title='italic'])[2]")
	WebElement ClickOnItalicButtonCRMinApp;
	
	@FindBy(xpath = "//button[@title='underline']")
	WebElement ClickOnUnderlineButton;
	
	@FindBy(xpath = "(//button[@title='underline'])[2]")
	WebElement ClickOnUnderlineButtonCRMinApp;
	
	@FindBy(xpath = "//button[@title='ordered list']")
	WebElement ClickOnOrderedListButton;
	
	@FindBy(xpath = "(//button[@title='ordered list'])[2]")
	WebElement ClickOnOrderedListButtonCRMinApp;
	
	@FindBy(xpath = "//button[@title='unordered list']")
	WebElement ClickOnUnOrderedListButton;
	
	@FindBy(xpath = "(//button[@title='unordered list'])[2]")
	WebElement ClickOnUnOrderedListButtonCRMinApp;
	
	@FindBy(xpath = "//button[@title='indent']")
	WebElement ClickOnIndentButton;
	
	@FindBy(xpath = "(//button[@title='indent'])[2]")
	WebElement ClickOnIndentButtonCRMinApp;
	
	@FindBy(xpath = "//button[@title='align justify']")
	WebElement ClickOnAlignJustifyButton;
	
	@FindBy(xpath = "(//button[@title='align justify'])[2]")
	WebElement ClickOnAlignJustifyButtonCRMinApp;
	
	@FindBy(xpath = "//button[@title='align center']")
	WebElement ClickOnAlignCenterButton;
	
	@FindBy(xpath = "(//button[@title='align center'])[2]")
	WebElement ClickOnAlignCenterButtonCRMinApp;
	
	@FindBy(xpath = "//button[@title='align left']")
	WebElement ClickOnAlignLeftButton;
	
	@FindBy(xpath = "(//button[@title='align left'])[2]")
	WebElement ClickOnAlignLeftButtonCRMinApp;
	
	@FindBy(xpath = "//button[@title='align right']")
	WebElement ClickOnAlignRightButton;
	
	@FindBy(xpath = "(//button[@title='align right'])[2]")
	WebElement ClickOnAlignRightButtonCRMinApp;
	
	@FindBy(xpath = "//option[@value='7']")
	WebElement ChangeFontSize;
	@FindBy(xpath = "(//option[@value='7'])[2]")
	WebElement ChangeFontSizeCRMinApp;
	
	@FindBy(xpath = "//button[@title='font color']")
	WebElement ChangeFontColor;
	
	@FindBy(xpath = "//li[text()=' Contact : Accept Confirmation ']")
	WebElement ClickOnContactAcceptConfirmationTab;
	@FindBy(xpath = "//span[text()='Continue']")
	WebElement ClickOnContinueButton;
	
	@FindBy(xpath = "(//div[@style='text-align: center;'])[3]")
	WebElement EnterTextInsideThankYouPage;
	
	@FindBy(xpath = "(//div[@style='text-align: center;'])[3]")
	public WebElement ClickOnInputBox;
	
	
	@FindBy(xpath = "//img[@width='150px']")
	WebElement DisplayedhasPopup;
	
    
	@FindBy(xpath = "(//div[@style='text-align: center;']//div)[3]")
	public WebElement ClickOnInputBoxContactAcceptConfirmation;
	@FindBy(xpath = "(//div[@style='text-align: center;']//div)[3]")
	WebElement EnterTextInsideContactAcceptConfirmationThankYouPage;
	
	
	
	
	
	
	public void EnterTextInsideContactAcceptConfirmationThankYouPage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterTextInsideContactAcceptConfirmationThankYouPage));
		EnterTextInsideContactAcceptConfirmationThankYouPage.sendKeys("Automation Testing is Going on...");;
	}
	public void ClickOnInputBoxContactAcceptConfirmation() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnInputBoxContactAcceptConfirmation));
		ClickOnInputBoxContactAcceptConfirmation.click();
	}
	public boolean DisplayedhasPopup() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedhasPopup));
		return DisplayedhasPopup.isDisplayed();
	}
	public void ClickOnInputBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnInputBox));
		ClickOnInputBox.click();
	}
	public void EnterTextInsideThankYouPage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterTextInsideThankYouPage));
		EnterTextInsideThankYouPage.sendKeys("Automation Testing is Going on...");;
	}
	public void ClickOnOTSnotificationsDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnOTSnotificationsDropDown));
		ClickOnOTSnotificationsDropDown.click();
	}
	public void ClickOnAcceptConfirmation() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAcceptConfirmation));
		ClickOnAcceptConfirmation.click();
	}
	public void ClickOnSaveButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSaveButton));
		ClickOnSaveButton.click();
	}
	
	public void ClickOnSaveButtonCRMinApp() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSaveButtonCRMinApp));
		ClickOnSaveButtonCRMinApp.click();
	}
	public void ClickOnRestoreDefaultButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnRestoreDefaultButton));
		ClickOnRestoreDefaultButton.click();
	}
	public void ClickOnCopyButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnCopyButton));
		ClickOnCopyButton.click();
	}
	public void ClickOnUndoButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnUndoButton));
		ClickOnUndoButton.click();
	}
	public void ClickOnUndoButtonCRMinApp() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnUndoButtonCRMinApp));
		ClickOnUndoButtonCRMinApp.click();
	}
	public void ClickOnBoldButton() {
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
	public boolean DisplayedSelectedTextIsItalic() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedSelectedTextIsItalic));
			return DisplayedSelectedTextIsItalic.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	public boolean DisplayedSelectedTextIsUnderlined() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedSelectedTextIsUnderlined));
			return DisplayedSelectedTextIsUnderlined.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	public boolean DisplayedSelectedTextIsOrderedList() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedSelectedTextIsOrderedList));
			return DisplayedSelectedTextIsOrderedList.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	public boolean DisplayedSelectedTextIsUnOrderedList() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedSelectedTextIsUnOrderedList));
			return DisplayedSelectedTextIsUnOrderedList.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean DisplayedSelectedTextIsIndent() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedSelectedTextIsIndent));
			return DisplayedSelectedTextIsIndent.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	public boolean DisplayedSelectedTextIsAlignJustify() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedSelectedTextIsAlignJustify));
			return DisplayedSelectedTextIsAlignJustify.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	public boolean DisplayedSelectedTextIsAligncenter() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedSelectedTextIsAligncenter));
			return DisplayedSelectedTextIsAligncenter.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	public boolean DisplayedSelectedTextIsAlignLeft() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedSelectedTextIsAlignLeft));
			return DisplayedSelectedTextIsAlignLeft.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	public boolean DisplayedSelectedTextIsAlignRight() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedSelectedTextIsAlignRight));
			return DisplayedSelectedTextIsAlignRight.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	public boolean DisplayedSelectedTextFontSizeHasBeenChanged() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedSelectedTextFontSizeHasBeenChanged));
			return DisplayedSelectedTextFontSizeHasBeenChanged.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	public void ClickOnBoldButtonCRMinApp() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnBoldButtonCRMinApp));
		ClickOnBoldButtonCRMinApp.click();
	}
	public void ClickOnItalicButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnItalicButton));
		ClickOnItalicButton.click();
	}
	
	public void ClickOnItalicButtonCRMinApp() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnItalicButtonCRMinApp));
		ClickOnItalicButtonCRMinApp.click();
	}
	public void ClickOnUnderlineButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnUnderlineButton));
		ClickOnUnderlineButton.click();
	}
	
	public void ClickOnUnderlineButtonCRMinApp() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnUnderlineButtonCRMinApp));
		ClickOnUnderlineButtonCRMinApp.click();
	}
	public void ClickOnOrderedListButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnOrderedListButton));
		ClickOnOrderedListButton.click();
	}
	
	public void ClickOnOrderedListButtonCRMinApp() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnOrderedListButtonCRMinApp));
		ClickOnOrderedListButtonCRMinApp.click();
	}
	public void ClickOnUnOrderedListButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnUnOrderedListButton));
		ClickOnUnOrderedListButton.click();
	}
	public void ClickOnUnOrderedListButtonCRMinApp() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnUnOrderedListButtonCRMinApp));
		ClickOnUnOrderedListButtonCRMinApp.click();
	}
	public void ClickOnIndentButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnIndentButton));
		ClickOnIndentButton.click();
	}
	public void ClickOnIndentButtonCRMinApp() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnIndentButtonCRMinApp));
		ClickOnIndentButtonCRMinApp.click();
	}
	public void ClickOnAlignJustifyButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAlignJustifyButton));
		ClickOnAlignJustifyButton.click();
	}
	public void ClickOnAlignJustifyButtonCRMinApp() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAlignJustifyButtonCRMinApp));
		ClickOnAlignJustifyButtonCRMinApp.click();
	}
	public void ClickOnAlignCenterButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAlignCenterButton));
		ClickOnAlignCenterButton.click();
	}
	public void ClickOnAlignCenterButtonCRMinApp() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAlignCenterButtonCRMinApp));
		ClickOnAlignCenterButtonCRMinApp.click();
	}
	public void ClickOnAlignLeftButtonv() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAlignLeftButton));
		ClickOnAlignLeftButton.click();
	}
	public void ClickOnAlignLeftButtonCRMinApp() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAlignLeftButtonCRMinApp));
		ClickOnAlignLeftButtonCRMinApp.click();
	}
	public void ClickOnAlignRightButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAlignRightButton));
		ClickOnAlignRightButton.click();
	}
	public void ClickOnAlignRightButtonCRMinApp() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAlignRightButtonCRMinApp));
		ClickOnAlignRightButtonCRMinApp.click();
	}
	
	public void ChangeFontSize() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ChangeFontSize));
		ChangeFontSize.click();
	}
	public void ChangeFontSizeCRMinApp() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ChangeFontSizeCRMinApp));
		ChangeFontSizeCRMinApp.click();
	}
	public void ChangeFontColor() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ChangeFontColor));
		ChangeFontColor.click();
	}
	public void ClickOnContactAcceptConfirmationTab() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnContactAcceptConfirmationTab));
		ClickOnContactAcceptConfirmationTab.click();
	}
	public void ClickOnContinueButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnContinueButton));
		ClickOnContinueButton.click();
	}
	
	//************************************************* Reject Confirmation ***********************************************

	@FindBy(xpath = "//span[text()='Reject Confirmation ']")
	WebElement ClickOnRejectConfirmation;
	
	@FindBy(xpath = "//li[text()=' Contact : Reject Confirmation ']")
	WebElement ClickOnContactRejctConfirmationTab;
	
	@FindBy(xpath = "//div[@class='st-area']")
	WebElement EnterTextInsideThankYouPageRejectConfirmation;
	
	
	public void ClickOnRejectConfirmation() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnRejectConfirmation));
		ClickOnRejectConfirmation.click();
	}
	public void ClickOnContactRejctConfirmationTab() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnContactRejctConfirmationTab));
		ClickOnContactRejctConfirmationTab.click();
	}
	public void EnterTextInsideThankYouPageRejectConfirmation() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterTextInsideThankYouPageRejectConfirmation));
		EnterTextInsideThankYouPageRejectConfirmation.sendKeys("Automation Testing is Going on...");;
	}
	
	//************************************************* OTS Screen Assignment Confirmation  ***********************************************

	@FindBy(xpath = "//span[text()='OTS Screen Assignment Confirmation ']")
	WebElement ClickOnOTSScreenAssignmentConfirmation;
	
	@FindBy(xpath = "//li[text()=' Contact : OTS Screen Assignment Confirmation ']")
	WebElement ClickOnContactOTSScreenAssignmentConfirmationTab;
	
	@FindBy(xpath = "//div [@class='band']")
	WebElement DisplayedhasPopupOTSscreen;
	
	
	
	
	
	public void ClickOnOTSScreenAssignmentConfirmation() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnOTSScreenAssignmentConfirmation));
		ClickOnOTSScreenAssignmentConfirmation.click();
	}
	public void ClickOnContactOTSScreenAssignmentConfirmationTab() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnContactOTSScreenAssignmentConfirmationTab));
		ClickOnContactOTSScreenAssignmentConfirmationTab.click();
	}
	
	public String locationOfName="(336, 178)";
	public String locationOfEmail="(336, 202)";
	                         
	public String NameTextLead="Name : {!LeadOwner.Name}";
	public String EmailTextLead="Email: {!LeadOwner.Email}";
	
	public String NameTextContact="Name : {!ContactOwner.Name}";
	public String EmailTextContact="Email: {!ContactOwner.Email}";
	
	
	
	public String locationOfNameSlack="(339, 278)";
	public String locationOfEmailSlack="(339, 302)";
	
	public String NameTextLeadSlack="Name: {!LeadOwner.Name}";
	public String EmailTextLeadSlack="Email: {!LeadOwner.Email}";
	
	public String NameTextContactSlack="Name: {!ContactOwner.Name}";
	public String EmailTextContactSlack="Email: {!ContactOwner.Email}";
	
	
	
	public boolean DisplayedhasPopupOTSscreen() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedhasPopupOTSscreen));
		return DisplayedhasPopupOTSscreen.isDisplayed();
	}
	
	//************************************************* OTS Screen Assignment Confirmation  ***********************************************

	@FindBy(xpath = "//span[text()='Failed OTS Initiation ']")
	WebElement ClickOnFailedOTSInitiation;
	
	
	public String locationOfCRMvalidationFailed="(690, 195)";
	public String locationOfObjectType="(392, 216)";
	
	public String CRMvalidationfailedText="CRM validation failed!";
	public String ObjectTypeText="The <<ObjectType>> information does not align with our validation criteria.";
	
	@FindBy(xpath = "//li[text()=' Contact : Failed OTS Initiation ']")
	WebElement ClickOnContactFailedOTSInitiationTab;
	
	
	public void ClickOnFailedOTSInitiation() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnFailedOTSInitiation));
		ClickOnFailedOTSInitiation.click();
	}
	
	
	public void ClickOnContactFailedOTSInitiationTab() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnContactFailedOTSInitiationTab));
		ClickOnContactFailedOTSInitiationTab.click();
	}
	
	
	//************************************************* Failed OTS Initiation  ***********************************************
	
	
	@FindBy(xpath = "(//font[text()='CRM validation failed!'])[2]")
	WebElement DisplayedhasPopupFailedOTSInitiation;
	
	
	public boolean DisplayedhasPopupFailedOTSInitiation() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(DisplayedhasPopupFailedOTSInitiation));
		return DisplayedhasPopupFailedOTSInitiation.isDisplayed();
	}
	
	
	//************************************************* Acceptance Confirmation - Email   ***********************************************

	@FindBy(xpath = "//span[text()='Acceptance Confirmation - Email ']")
	WebElement ClickOnAcceptanceConfirmationEmail;
	
	@FindBy(xpath = "//textarea[@formcontrolname='content']")
	WebElement DisplayedMessageBody;
	
	@FindBy(xpath = "(//mat-icon[text()='data_object'])[1]")
	WebElement ClickOnInsertSnippetButtonForSubject ;
	@FindBy(xpath = "(//mat-icon[text()='data_object'])[2]")
	WebElement ClickOnInsertSnippetButtonForMessageBody ;
	
	@FindBy(xpath = "//li[text()=' Contact : Acceptance Confirmation - Email ']")
	WebElement ClickOnContactAcceptanceConfirmationEmailTab;
	
	
	
	
	
	
	
	public void ClickOnContactAcceptanceConfirmationEmailTab() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnContactAcceptanceConfirmationEmailTab));
		ClickOnContactAcceptanceConfirmationEmailTab.click();
	}
	
	public void ClickOnInsertSnippetButtonForMessageBody() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnInsertSnippetButtonForMessageBody));
		ClickOnInsertSnippetButtonForMessageBody.click();
	}
	
	public void ClickOnInsertSnippetButtonForSubject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnInsertSnippetButtonForSubject));
		ClickOnInsertSnippetButtonForSubject.click();
	}

	public String MessageBody="Hi Team,The <<ObjectType>> {!Lead.FirstName} with Email {!Lead.Email} is accepted by {!LeadOwner.Name}.Thank you";
	public String MessageBodyContact="Hi Team,The <<ObjectType>> {!Contact.FirstName} with Email {!Contact.Email} is accepted by {!ContactOwner.Name}.Thank you";

	public void ClickOnAcceptanceConfirmationEmail() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAcceptanceConfirmationEmail));
		ClickOnAcceptanceConfirmationEmail.click();
	}
	
	
	public String DisplayedMessageBody() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedMessageBody));
		return DisplayedMessageBody.getText();
	}

	//************************************************* Acceptance Confirmation - CRM   ***********************************************

	@FindBy(xpath = "//span[text()='Acceptance Confirmation - CRM ']")
	WebElement ClickOnAcceptanceConfirmationCRM;
	
	@FindBy(xpath = "//li[text()=' Contact : Acceptance Confirmation - CRM ']")
	WebElement ClickOnContactAcceptanceConfirmationCRMTab;
	@FindBy(xpath = "//li[text()=' Contact : Acceptance Confirmation - Slack ']")
	WebElement ClickOnContactAcceptanceConfirmationSlackTab;
	
	@FindBy(xpath = "//span[text()='Acceptance Confirmation - Slack ']")
	WebElement ClickOnAcceptanceConfirmationSlackTab;
	
	
	
	
	
	
	public void ClickOnAcceptanceConfirmationSlackTab() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAcceptanceConfirmationSlackTab));
		ClickOnAcceptanceConfirmationSlackTab.click();
	}
	
	public void ClickOnAcceptanceConfirmationCRM() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnAcceptanceConfirmationCRM));
		ClickOnAcceptanceConfirmationCRM.click();
	}

	public void ClickOnContactAcceptanceConfirmationCRMTab() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnContactAcceptanceConfirmationCRMTab));
		ClickOnContactAcceptanceConfirmationCRMTab.click();
	}
	
	public void ClickOnContactAcceptanceConfirmationSlackTab() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnContactAcceptanceConfirmationSlackTab));
		ClickOnContactAcceptanceConfirmationSlackTab.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
