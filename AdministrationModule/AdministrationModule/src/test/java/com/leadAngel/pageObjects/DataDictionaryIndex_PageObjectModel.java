package com.leadAngel.pageObjects;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DataDictionaryIndex_PageObjectModel {
	WebDriver ldriver;

	public DataDictionaryIndex_PageObjectModel(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	
	@FindBy(xpath = "//span[text()='Data Dictionary Index ']")
	WebElement ClickOnDataDictionaryIndex;
	
	//********************************************************* Account ************************************************************
	
	@FindBy(xpath = "//div[@class='card-details']//h6[text()='Account']")
	WebElement ClickOnAccountBox;
	//*****Account Attribute

	@FindBy(xpath = "(//mat-panel-title[text()=' Account Attributes ']//..//..//..)[1]//span[text()='Saving these changes requires a router restart. Please wait until the router restarts to save the changes.']")
	WebElement DisplayedAlertMessageForAccountAttributes;
	
	
	@FindBy(xpath = "((//mat-panel-title[text()=' Account Attributes ']//..//..//..)[1]//span[@class='mat-attr mat-attr-ng righticon-BOOLEAN'])[1]")
	WebElement SelectBooleanOptionForAccountAttributes;
	@FindBy(xpath = "(//mat-panel-title[text()=' Account Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-BOOLEAN']")
	WebElement DisplayedBooleanOptionForAccountAttributeInSelectedAttributeFieldList;
	@FindBy(xpath = "(//mat-panel-title[text()=' Account Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-BOOLEAN']")
	WebElement ClickBooleanOptionForAccountAttributeFromTheSelectedAttributeFieldList;
	
	@FindBy(xpath = "((//mat-panel-title[text()=' Account Attributes ']//..//..//..)[1]//span[@class='mat-attr mat-attr-ng righticon-STRING'])[1]")
	WebElement SelectStringOptionForAccountAttributes;
	@FindBy(xpath = "(//mat-panel-title[text()=' Account Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-STRING']")
	WebElement DisplayedStringOptionForAccountAttributeInSelectedAttributeFieldList;
	
	@FindBy(xpath = "((//mat-panel-title[text()=' Account Attributes ']//..//..//..)[1]//span[@class='mat-attr mat-attr-ng righticon-NUMBER'])[1]")
	WebElement SelectNumberOptionForAccountAttributes;
	@FindBy(xpath = "(//mat-panel-title[text()=' Account Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-NUMBER']")
	WebElement DisplayedNumberOptionForAccountAttributeInSelectedAttributeFieldList;
	
	@FindBy(xpath = "((//mat-panel-title[text()=' Account Attributes ']//..//..//..)[1]//span[@class='mat-attr mat-attr-ng righticon-DATETIME'])[1]")
	WebElement SelectDateOptionForAccountAttributes;
	@FindBy(xpath = "(//mat-panel-title[text()=' Account Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-DATETIME']")
	WebElement DisplayedDateOptionForAccountAttributeInSelectedAttributeFieldList;
	
	
	
	@FindBy(xpath = "(//mat-panel-title[text()=' Account Attributes ']//..//..//..)[1]//button[@name='addBtn']")
	WebElement ClickOnAddButtonForAccountAttributes;
	@FindBy(xpath = "(//mat-panel-title[text()=' Account Attributes ']//..//..//..)[1]//button[@name='removeBtn']")
	WebElement ClickOnRemoveButtonForAccountAttributes;
	
	@FindBy(xpath = "(//mat-panel-title[text()=' Account Attributes ']//..//..//..)[1]//span[text()='Save']")
	WebElement ClickOnSaveButtonForAccountAttributes;
	@FindBy(xpath = "//span[text()='Confirm']")
	WebElement ClickOnConfirmButton;
	@FindBy(xpath = "(//div[text()='Updated successfully'])[1]")
	WebElement DisplayedSuccessMessage;
	
	//***
	@FindBy(xpath = "(//mat-panel-title[text()=' Account Attributes ']//..//..//..)[1]//div[text()='No Record Found ! ']")
	WebElement DisplayedNoRecordFoundInSelectedAttributeFieldListAccountAttributes;
	@FindBy(xpath = "(//mat-panel-title[text()=' Account Activity Attributes ']//..//..//..)[1]//div[text()='No Record Found ! ']")
	WebElement DisplayedNoRecordFoundInSelectedAttributeFieldListForAccountActivityAttributes ;
	@FindBy(xpath = "(//mat-panel-title[text()=' Account Attributes ']//..//..//..)[1]//label[text()='Attribute Field List']//..//i-tabler[@name='x']")
	WebElement ClickOnCloseIconFromAttributeFieldListSearchBox ;
	@FindBy(xpath = "(//mat-panel-title[text()=' Account Activity Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//i-tabler[@name='x']")
	WebElement ClickOnCloseIconFromSelectedAttributeFieldListSearchBox ;


	public void ClickOnCloseIconFromSelectedAttributeFieldListSearchBox() {
		new WebDriverWait(ldriver,Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnCloseIconFromSelectedAttributeFieldListSearchBox));
		ClickOnCloseIconFromSelectedAttributeFieldListSearchBox.click();
	}
	public void ClickOnCloseIconFromAttributeFieldListSearchBox() {
		new WebDriverWait(ldriver,Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnCloseIconFromAttributeFieldListSearchBox));
		ClickOnCloseIconFromAttributeFieldListSearchBox.click();
	}
	public boolean DisplayedNoRecordFoundInSelectedAttributeFieldListAccountAttributes() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedNoRecordFoundInSelectedAttributeFieldListAccountAttributes));
			return DisplayedNoRecordFoundInSelectedAttributeFieldListAccountAttributes.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	public boolean DisplayedNoRecordFoundInSelectedAttributeFieldListForAccountActivityAttributes() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedNoRecordFoundInSelectedAttributeFieldListForAccountActivityAttributes));
			return DisplayedNoRecordFoundInSelectedAttributeFieldListForAccountActivityAttributes.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
			
	//***		
			
			
			
			
			
	public void ClickOnDataDictionaryIndex() {
		new WebDriverWait(ldriver,Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnDataDictionaryIndex));
		ClickOnDataDictionaryIndex.click();
	}

	public void ClickOnAccountBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnAccountBox));
		ClickOnAccountBox.click();
	}

	public boolean DisplayedAlertMessageForAccountAttributes() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedAlertMessageForAccountAttributes));
			return DisplayedAlertMessageForAccountAttributes.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	
	
	public void SelectBooleanOptionForAccountAttributes() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectBooleanOptionForAccountAttributes));
		SelectBooleanOptionForAccountAttributes.click();
	}
	public boolean DisplayedBooleanOptionForAccountAttributeInSelectedAttributeFieldList() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedBooleanOptionForAccountAttributeInSelectedAttributeFieldList));
			return DisplayedBooleanOptionForAccountAttributeInSelectedAttributeFieldList.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	public void ClickBooleanOptionForAccountAttributeFromTheSelectedAttributeFieldList() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickBooleanOptionForAccountAttributeFromTheSelectedAttributeFieldList));
		ClickBooleanOptionForAccountAttributeFromTheSelectedAttributeFieldList.click();
	}
	
	
	public void SelectStringOptionForAccountAttributes() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectStringOptionForAccountAttributes));
		SelectStringOptionForAccountAttributes.click();
	}
	public boolean DisplayedStringOptionForAccountAttributeInSelectedAttributeFieldList() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedStringOptionForAccountAttributeInSelectedAttributeFieldList));
		return DisplayedStringOptionForAccountAttributeInSelectedAttributeFieldList.isDisplayed();
	}
	
	public void SelectNumberOptionForAccountAttributes() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectNumberOptionForAccountAttributes));
		SelectNumberOptionForAccountAttributes.click();
	}
	public boolean DisplayedNumberOptionForAccountAttributeInSelectedAttributeFieldList() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedNumberOptionForAccountAttributeInSelectedAttributeFieldList));
		return DisplayedNumberOptionForAccountAttributeInSelectedAttributeFieldList.isDisplayed();
	}
	
	
	public void SelectDateOptionForAccountAttributes() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectDateOptionForAccountAttributes));
		SelectDateOptionForAccountAttributes.click();
	}
	public boolean DisplayedDateOptionForAccountAttributeInSelectedAttributeFieldList() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedDateOptionForAccountAttributeInSelectedAttributeFieldList));
		return DisplayedDateOptionForAccountAttributeInSelectedAttributeFieldList.isDisplayed();
	}
	
	
	public void ClickOnAddButtonForAccountAttributes() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnAddButtonForAccountAttributes));
		ClickOnAddButtonForAccountAttributes.click();
	}
	public void ClickOnRemoveButtonForAccountAttributes() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnRemoveButtonForAccountAttributes));
		ClickOnRemoveButtonForAccountAttributes.click();
	}
	
	public void ClickOnSaveButtonForAccountAttributes() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnSaveButtonForAccountAttributes));
		ClickOnSaveButtonForAccountAttributes.click();
	}
	public void ClickOnConfirmButton() {
		new WebDriverWait(ldriver,Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnConfirmButton));
		ClickOnConfirmButton.click();
	}
	public boolean DisplayedSuccessMessage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedSuccessMessage));
		return DisplayedSuccessMessage.isDisplayed();
	}
	
	//*****Account Activity Attribute
	
	@FindBy(xpath = "(//mat-panel-title[text()=' Account Activity Attributes ']//..//..//..)[1]//span[text()='Saving these changes requires a router restart. Please wait until the router restarts to save the changes.']")
	WebElement DisplayedAlertMessageForAccountActivityAttributes;
	
	@FindBy(xpath = "//span[@style='transform: rotate(0deg);']")
	WebElement ClickOnDropdownToExpansionThePannel;;
	
	@FindBy(xpath = "((//mat-panel-title[text()=' Account Activity Attributes ']//..//..//..)[1]//span[@class='mat-attr mat-attr-ng righticon-BOOLEAN'])[1]")
	WebElement SelectBooleanOptionForAccountActivityAttributes;
	@FindBy(xpath = "(//mat-panel-title[text()=' Account Activity Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-BOOLEAN']")
	WebElement DisplayedBooleanOptionForAccountActivityAttributesInSelectedAttributeFieldList;
	@FindBy(xpath = "(//mat-panel-title[text()=' Account Activity Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-BOOLEAN']")
	WebElement ClickBooleanOptionForAccountActivityAttributesFromTheSelectedAttributeFieldList;
	
	@FindBy(xpath = "((//mat-panel-title[text()=' Account Activity Attributes ']//..//..//..)[1]//span[@class='mat-attr mat-attr-ng righticon-STRING'])[1]")
	WebElement SelectStringOptionForAccountActivityAttributes;
	@FindBy(xpath = "(//mat-panel-title[text()=' Account Activity Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-STRING']")
	WebElement DisplayedStringOptionForAccountActivityAttributesInSelectedAttributeFieldList;
	
	@FindBy(xpath = "((//mat-panel-title[text()=' Account Activity Attributes ']//..//..//..)[1]//span[@class='mat-attr mat-attr-ng righticon-NUMBER'])[1]")
	WebElement SelectNumberOptionForAccountActivityAttributes;
	@FindBy(xpath = "(//mat-panel-title[text()=' Account Activity Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-NUMBER']")
	WebElement DisplayedNumberOptionForAccountActivityAttributesInSelectedAttributeFieldList;
	
	@FindBy(xpath = "((//mat-panel-title[text()=' Account Activity Attributes ']//..//..//..)[1]//span[@class='mat-attr mat-attr-ng righticon-DATETIME'])[1]")
	WebElement SelectDateOptionForAccountActivityAttributes;
	@FindBy(xpath = "(//mat-panel-title[text()=' Account Activity Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-DATETIME']")
	WebElement DisplayedDateOptionForAccountActivityAttributesInSelectedAttributeFieldList;
	
	
	
	@FindBy(xpath = "(//mat-panel-title[text()=' Account Activity Attributes ']//..//..//..)[1]//button[@name='addBtn']")
	WebElement ClickOnAddButtonForAccountActivityAttributes;
	@FindBy(xpath = "(//mat-panel-title[text()=' Account Activity Attributes ']//..//..//..)[1]//button[@name='removeBtn']")
	WebElement ClickOnRemoveButtonForAccountActivityAttributes;
	
	@FindBy(xpath = "(//mat-panel-title[text()=' Account Activity Attributes ']//..//..//..)[1]//span[text()='Save']")
	WebElement ClickOnSaveButtonForAccountActivityAttributes;
	
	
	public boolean DisplayedAlertMessageForAccountActivityAttributes() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedAlertMessageForAccountActivityAttributes));
			return DisplayedAlertMessageForAccountActivityAttributes.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	
	public void ClickOnDropdownToExpansionThePannel() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnDropdownToExpansionThePannel));
		ClickOnDropdownToExpansionThePannel.click();
	}
	
	
	public void SelectBooleanOptionForAccountActivityAttributes() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectBooleanOptionForAccountActivityAttributes));
		SelectBooleanOptionForAccountActivityAttributes.click();
	}
	public boolean DisplayedBooleanOptionForAccountActivityAttributesInSelectedAttributeFieldList() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedBooleanOptionForAccountActivityAttributesInSelectedAttributeFieldList));
			return DisplayedBooleanOptionForAccountActivityAttributesInSelectedAttributeFieldList.isDisplayed();
		} catch (Exception e) {
	return false;
		}
	}
	public void ClickBooleanOptionForAccountActivityAttributesFromTheSelectedAttributeFieldList() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickBooleanOptionForAccountActivityAttributesFromTheSelectedAttributeFieldList));
		ClickBooleanOptionForAccountActivityAttributesFromTheSelectedAttributeFieldList.click();
	}
	
	
	public void SelectStringOptionForAccountActivityAttributes() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectStringOptionForAccountActivityAttributes));
		SelectStringOptionForAccountActivityAttributes.click();
	}
	public boolean DisplayedStringOptionForAccountActivityAttributesInSelectedAttributeFieldList() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedStringOptionForAccountActivityAttributesInSelectedAttributeFieldList));
		return DisplayedStringOptionForAccountActivityAttributesInSelectedAttributeFieldList.isDisplayed();
	}
	
	
	public void SelectNumberOptionForAccountActivityAttributes() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectNumberOptionForAccountActivityAttributes));
		SelectNumberOptionForAccountActivityAttributes.click();
	}
	public boolean DisplayedNumberOptionForAccountActivityAttributesInSelectedAttributeFieldList() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedNumberOptionForAccountActivityAttributesInSelectedAttributeFieldList));
		return DisplayedNumberOptionForAccountActivityAttributesInSelectedAttributeFieldList.isDisplayed();
	}
	
	
	public void SelectDateOptionForAccountActivityAttributes() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectDateOptionForAccountActivityAttributes));
		SelectDateOptionForAccountActivityAttributes.click();
	}
	public boolean DisplayedDateOptionForAccountActivityAttributesInSelectedAttributeFieldList() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedDateOptionForAccountActivityAttributesInSelectedAttributeFieldList));
		return DisplayedDateOptionForAccountActivityAttributesInSelectedAttributeFieldList.isDisplayed();
	}
	
	
	public void ClickOnAddButtonForAccountActivityAttributes() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnAddButtonForAccountActivityAttributes));
		ClickOnAddButtonForAccountActivityAttributes.click();
	}
	public void ClickOnRemoveButtonForAccountActivityAttributes() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnRemoveButtonForAccountActivityAttributes));
		ClickOnRemoveButtonForAccountActivityAttributes.click();
	}
	
	
	public void ClickOnSaveButtonForAccountActivityAttributes() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnSaveButtonForAccountActivityAttributes));
		ClickOnSaveButtonForAccountActivityAttributes.click();
	}
	
	
	//********************************************************* Contact ************************************************************


	@FindBy(xpath = "//div[@class='card-details']//h6[text()='Contact']")
	WebElement ClickOnContactBox;
	//*****Contact Attribute

	@FindBy(xpath = "(//mat-panel-title[text()=' Contact Attributes ']//..//..//..)[1]//span[text()='Saving these changes requires a router restart. Please wait until the router restarts to save the changes.']")
	WebElement DisplayedAlertMessageForContactAttributes;
	
	
	@FindBy(xpath = "((//mat-panel-title[text()=' Contact Attributes ']//..//..//..)[1]//span[@class='mat-attr mat-attr-ng righticon-BOOLEAN'])[1]")
	WebElement SelectBooleanOptionForContactAttributes;
	@FindBy(xpath = "(//mat-panel-title[text()=' Contact Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-BOOLEAN']")
	WebElement DisplayedBooleanOptionForContactAttributeInSelectedAttributeFieldList;
	@FindBy(xpath = "(//mat-panel-title[text()=' Contact Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-BOOLEAN']")
	WebElement ClickBooleanOptionForContactAttributeFromTheSelectedAttributeFieldList;
	
	@FindBy(xpath = "((//mat-panel-title[text()=' Contact Attributes ']//..//..//..)[1]//span[@class='mat-attr mat-attr-ng righticon-STRING'])[1]")
	WebElement SelectStringOptionForContactAttributes;
	@FindBy(xpath = "(//mat-panel-title[text()=' Contact Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-STRING']")
	WebElement DisplayedStringOptionForContactAttributeInSelectedAttributeFieldList;
	
	@FindBy(xpath = "((//mat-panel-title[text()=' Contact Attributes ']//..//..//..)[1]//span[@class='mat-attr mat-attr-ng righticon-NUMBER'])[1]")
	WebElement SelectNumberOptionForContactAttributes;
	@FindBy(xpath = "(//mat-panel-title[text()=' Contact Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-NUMBER']")
	WebElement DisplayedNumberOptionForContactAttributeInSelectedAttributeFieldList;
	
	@FindBy(xpath = "((//mat-panel-title[text()=' Contact Attributes ']//..//..//..)[1]//span[@class='mat-attr mat-attr-ng righticon-DATETIME'])[1]")
	WebElement SelectDateOptionForContactAttributes;
	@FindBy(xpath = "(//mat-panel-title[text()=' Contact Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-DATETIME']")
	WebElement DisplayedDateOptionForContactAttributeInSelectedAttributeFieldList;
	
	
	
	@FindBy(xpath = "(//mat-panel-title[text()=' Contact Attributes ']//..//..//..)[1]//button[@name='addBtn']")
	WebElement ClickOnAddButtonForContactAttributes;
	@FindBy(xpath = "(//mat-panel-title[text()=' Contact Attributes ']//..//..//..)[1]//button[@name='removeBtn']")
	WebElement ClickOnRemoveButtonForContactAttributes;
	
	@FindBy(xpath = "(//mat-panel-title[text()=' Contact Attributes ']//..//..//..)[1]//span[text()='Save']")
	WebElement ClickOnSaveButtonForContactAttributes;
	
	//***
	@FindBy(xpath = "(//mat-panel-title[text()=' Contact Attributes ']//..//..//..)[1]//div[text()='No Record Found ! ']")
	WebElement DisplayedNoRecordFoundInSelectedAttributeFieldListContactAttributes;
	@FindBy(xpath = "(//mat-panel-title[text()=' Contact Activity Attributes ']//..//..//..)[1]//div[text()='No Record Found ! ']")
	WebElement DisplayedNoRecordFoundInSelectedAttributeFieldListForContactActivityAttributes ;
	@FindBy(xpath = "(//mat-panel-title[text()=' Contact Attributes ']//..//..//..)[1]//label[text()='Attribute Field List']//..//i-tabler[@name='x']")
	WebElement ClickOnCloseIconFromAttributeFieldListSearchBoxForContactAttributes ;
	@FindBy(xpath = "(//mat-panel-title[text()=' Contact Activity Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//i-tabler[@name='x']")
	WebElement ClickOnCloseIconFromSelectedAttributeFieldListSearchBoxForContactActivityAttributes ;


	public void ClickOnCloseIconFromAttributeFieldListSearchBoxForContactAttributes() {
		new WebDriverWait(ldriver,Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnCloseIconFromAttributeFieldListSearchBoxForContactAttributes));
		ClickOnCloseIconFromAttributeFieldListSearchBoxForContactAttributes.click();
	}
	public void ClickOnCloseIconFromSelectedAttributeFieldListSearchBoxForContactActivityAttributes() {
		new WebDriverWait(ldriver,Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnCloseIconFromSelectedAttributeFieldListSearchBoxForContactActivityAttributes));
		ClickOnCloseIconFromSelectedAttributeFieldListSearchBoxForContactActivityAttributes.click();
	}
	public boolean DisplayedNoRecordFoundInSelectedAttributeFieldListContactAttributes() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedNoRecordFoundInSelectedAttributeFieldListContactAttributes));
			return DisplayedNoRecordFoundInSelectedAttributeFieldListContactAttributes.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	public boolean DisplayedNoRecordFoundInSelectedAttributeFieldListForContactActivityAttributes() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedNoRecordFoundInSelectedAttributeFieldListForContactActivityAttributes));
			return DisplayedNoRecordFoundInSelectedAttributeFieldListForContactActivityAttributes.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
			
	//***
	
	

	
	


	public void ClickOnContactBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnContactBox));
		ClickOnContactBox.click();
	}

	public boolean DisplayedAlertMessageForContactAttributes() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedAlertMessageForContactAttributes));
			return DisplayedAlertMessageForContactAttributes.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	
	
	public void SelectBooleanOptionForContactAttributes() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectBooleanOptionForContactAttributes));
		SelectBooleanOptionForContactAttributes.click();
	}
	public boolean DisplayedBooleanOptionForContactAttributeInSelectedAttributeFieldList() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedBooleanOptionForContactAttributeInSelectedAttributeFieldList));
			return DisplayedBooleanOptionForContactAttributeInSelectedAttributeFieldList.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	public void ClickBooleanOptionForContactAttributeFromTheSelectedAttributeFieldList() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickBooleanOptionForContactAttributeFromTheSelectedAttributeFieldList));
		ClickBooleanOptionForContactAttributeFromTheSelectedAttributeFieldList.click();
	}
	
	
	public void SelectStringOptionForContactAttributes() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectStringOptionForContactAttributes));
		SelectStringOptionForContactAttributes.click();
	}
	public boolean DisplayedStringOptionForContactAttributeInSelectedAttributeFieldList() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedStringOptionForContactAttributeInSelectedAttributeFieldList));
		return DisplayedStringOptionForContactAttributeInSelectedAttributeFieldList.isDisplayed();
	}
	
	public void SelectNumberOptionForContactAttributes() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectNumberOptionForContactAttributes));
		SelectNumberOptionForContactAttributes.click();
	}
	public boolean DisplayedNumberOptionForContactAttributeInSelectedAttributeFieldList() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedNumberOptionForContactAttributeInSelectedAttributeFieldList));
		return DisplayedNumberOptionForContactAttributeInSelectedAttributeFieldList.isDisplayed();
	}
	
	
	public void SelectDateOptionForContactAttributes() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectDateOptionForContactAttributes));
		SelectDateOptionForContactAttributes.click();
	}
	public boolean DisplayedDateOptionForContactAttributeInSelectedAttributeFieldList() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedDateOptionForContactAttributeInSelectedAttributeFieldList));
		return DisplayedDateOptionForContactAttributeInSelectedAttributeFieldList.isDisplayed();
	}
	
	
	public void ClickOnAddButtonForContactAttributes() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnAddButtonForContactAttributes));
		ClickOnAddButtonForContactAttributes.click();
	}
	public void ClickOnRemoveButtonForContactAttributes() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnRemoveButtonForContactAttributes));
		ClickOnRemoveButtonForContactAttributes.click();
	}
	
	public void ClickOnSaveButtonForContactAttributes() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnSaveButtonForContactAttributes));
		ClickOnSaveButtonForContactAttributes.click();
	}

	//*****Contact Activity Attribute
	
		@FindBy(xpath = "(//mat-panel-title[text()=' Contact Activity Attributes ']//..//..//..)[1]//span[text()='Saving these changes requires a router restart. Please wait until the router restarts to save the changes.']")
		WebElement DisplayedAlertMessageForContactActivityAttributes;
		
		
		@FindBy(xpath = "((//mat-panel-title[text()=' Contact Activity Attributes ']//..//..//..)[1]//span[@class='mat-attr mat-attr-ng righticon-BOOLEAN'])[1]")
		WebElement SelectBooleanOptionForContactActivityAttributes;
		@FindBy(xpath = "(//mat-panel-title[text()=' Contact Activity Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-BOOLEAN']")
		WebElement DisplayedBooleanOptionForContactActivityAttributesInSelectedAttributeFieldList;
		@FindBy(xpath = "(//mat-panel-title[text()=' Contact Activity Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-BOOLEAN']")
		WebElement ClickBooleanOptionForContactActivityAttributesFromTheSelectedAttributeFieldList;
		
		@FindBy(xpath = "((//mat-panel-title[text()=' Contact Activity Attributes ']//..//..//..)[1]//span[@class='mat-attr mat-attr-ng righticon-STRING'])[1]")
		WebElement SelectStringOptionForContactActivityAttributes;
		@FindBy(xpath = "(//mat-panel-title[text()=' Contact Activity Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-STRING']")
		WebElement DisplayedStringOptionForContactActivityAttributesInSelectedAttributeFieldList;
		
		@FindBy(xpath = "((//mat-panel-title[text()=' Contact Activity Attributes ']//..//..//..)[1]//span[@class='mat-attr mat-attr-ng righticon-NUMBER'])[1]")
		WebElement SelectNumberOptionForContactActivityAttributes;
		@FindBy(xpath = "(//mat-panel-title[text()=' Contact Activity Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-NUMBER']")
		WebElement DisplayedNumberOptionForContactActivityAttributesInSelectedAttributeFieldList;
		
		@FindBy(xpath = "((//mat-panel-title[text()=' Contact Activity Attributes ']//..//..//..)[1]//span[@class='mat-attr mat-attr-ng righticon-DATETIME'])[1]")
		WebElement SelectDateOptionForContactActivityAttributes;
		@FindBy(xpath = "(//mat-panel-title[text()=' Contact Activity Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-DATETIME']")
		WebElement DisplayedDateOptionForContactActivityAttributesInSelectedAttributeFieldList;
		
		
		
		@FindBy(xpath = "(//mat-panel-title[text()=' Contact Activity Attributes ']//..//..//..)[1]//button[@name='addBtn']")
		WebElement ClickOnAddButtonForContactActivityAttributes;
		@FindBy(xpath = "(//mat-panel-title[text()=' Contact Activity Attributes ']//..//..//..)[1]//button[@name='removeBtn']")
		WebElement ClickOnRemoveButtonForContactActivityAttributes;
		
		@FindBy(xpath = "(//mat-panel-title[text()=' Contact Activity Attributes ']//..//..//..)[1]//span[text()='Save']")
		WebElement ClickOnSaveButtonForContactActivityAttributes;
		
		
		public boolean DisplayedAlertMessageForContactActivityAttributes() {
			try {
				new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedAlertMessageForContactActivityAttributes));
				return DisplayedAlertMessageForContactActivityAttributes.isDisplayed();
			} catch (Exception e) {
				return false;
			}
		}
		
		
		public void SelectBooleanOptionForContactActivityAttributes() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectBooleanOptionForContactActivityAttributes));
			SelectBooleanOptionForContactActivityAttributes.click();
		}
		public boolean DisplayedBooleanOptionForContactActivityAttributesInSelectedAttributeFieldList() {
			try {
				new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedBooleanOptionForContactActivityAttributesInSelectedAttributeFieldList));
				return DisplayedBooleanOptionForContactActivityAttributesInSelectedAttributeFieldList.isDisplayed();
			} catch (Exception e) {
		return false;
			}
		}
		public void ClickBooleanOptionForContactActivityAttributesFromTheSelectedAttributeFieldList() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickBooleanOptionForContactActivityAttributesFromTheSelectedAttributeFieldList));
			ClickBooleanOptionForContactActivityAttributesFromTheSelectedAttributeFieldList.click();
		}
		
		
		public void SelectStringOptionForContactActivityAttributes() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectStringOptionForContactActivityAttributes));
			SelectStringOptionForContactActivityAttributes.click();
		}
		public boolean DisplayedStringOptionForContactActivityAttributesInSelectedAttributeFieldList() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedStringOptionForContactActivityAttributesInSelectedAttributeFieldList));
			return DisplayedStringOptionForContactActivityAttributesInSelectedAttributeFieldList.isDisplayed();
		}
		
		
		public void SelectNumberOptionForContactActivityAttributes() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectNumberOptionForContactActivityAttributes));
			SelectNumberOptionForContactActivityAttributes.click();
		}
		public boolean DisplayedNumberOptionForContactActivityAttributesInSelectedAttributeFieldList() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedNumberOptionForContactActivityAttributesInSelectedAttributeFieldList));
			return DisplayedNumberOptionForContactActivityAttributesInSelectedAttributeFieldList.isDisplayed();
		}
		
		
		public void SelectDateOptionForContactActivityAttributes() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectDateOptionForContactActivityAttributes));
			SelectDateOptionForContactActivityAttributes.click();
		}
		public boolean DisplayedDateOptionForContactActivityAttributesInSelectedAttributeFieldList() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedDateOptionForContactActivityAttributesInSelectedAttributeFieldList));
			return DisplayedDateOptionForContactActivityAttributesInSelectedAttributeFieldList.isDisplayed();
		}
		
		
		public void ClickOnAddButtonForContactActivityAttributes() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnAddButtonForContactActivityAttributes));
			ClickOnAddButtonForContactActivityAttributes.click();
		}
		public void ClickOnRemoveButtonForContactActivityAttributes() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnRemoveButtonForContactActivityAttributes));
			ClickOnRemoveButtonForContactActivityAttributes.click();
		}
		
		
		public void ClickOnSaveButtonForContactActivityAttributes() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnSaveButtonForContactActivityAttributes));
			ClickOnSaveButtonForContactActivityAttributes.click();
		}
		
	
	
		//********************************************************* Lead ************************************************************


		@FindBy(xpath = "//div[@class='card-details']//h6[text()='Lead']")
		WebElement ClickOnLeadBox;
		//*****Lead Attribute

		@FindBy(xpath = "(//mat-panel-title[text()=' Lead Attributes ']//..//..//..)[1]//span[text()='Saving these changes requires a router restart. Please wait until the router restarts to save the changes.']")
		WebElement DisplayedAlertMessageForLeadAttributes;
		
		
		@FindBy(xpath = "((//mat-panel-title[text()=' Lead Attributes ']//..//..//..)[1]//span[@class='mat-attr mat-attr-ng righticon-BOOLEAN'])[1]")
		WebElement SelectBooleanOptionForLeadAttributes;
		@FindBy(xpath = "(//mat-panel-title[text()=' Lead Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-BOOLEAN']")
		WebElement DisplayedBooleanOptionForLeadAttributeInSelectedAttributeFieldList;
		@FindBy(xpath = "(//mat-panel-title[text()=' Lead Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-BOOLEAN']")
		WebElement ClickBooleanOptionForLeadAttributeFromTheSelectedAttributeFieldList;
		
		@FindBy(xpath = "((//mat-panel-title[text()=' Lead Attributes ']//..//..//..)[1]//span[@class='mat-attr mat-attr-ng righticon-STRING'])[1]")
		WebElement SelectStringOptionForLeadAttributes;
		@FindBy(xpath = "(//mat-panel-title[text()=' Lead Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-STRING']")
		WebElement DisplayedStringOptionForLeadAttributeInSelectedAttributeFieldList;
		
		@FindBy(xpath = "((//mat-panel-title[text()=' Lead Attributes ']//..//..//..)[1]//span[@class='mat-attr mat-attr-ng righticon-NUMBER'])[1]")
		WebElement SelectNumberOptionForLeadAttributes;
		@FindBy(xpath = "(//mat-panel-title[text()=' Lead Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-NUMBER']")
		WebElement DisplayedNumberOptionForLeadAttributeInSelectedAttributeFieldList;
		
		@FindBy(xpath = "((//mat-panel-title[text()=' Lead Attributes ']//..//..//..)[1]//span[@class='mat-attr mat-attr-ng righticon-DATETIME'])[1]")
		WebElement SelectDateOptionForLeadAttributes;
		@FindBy(xpath = "(//mat-panel-title[text()=' Lead Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-DATETIME']")
		WebElement DisplayedDateOptionForLeadAttributeInSelectedAttributeFieldList;
		
		
		
		@FindBy(xpath = "(//mat-panel-title[text()=' Lead Attributes ']//..//..//..)[1]//button[@name='addBtn']")
		WebElement ClickOnAddButtonForLeadAttributes;
		@FindBy(xpath = "(//mat-panel-title[text()=' Lead Attributes ']//..//..//..)[1]//button[@name='removeBtn']")
		WebElement ClickOnRemoveButtonForLeadAttributes;
		
		@FindBy(xpath = "(//mat-panel-title[text()=' Lead Attributes ']//..//..//..)[1]//span[text()='Save']")
		WebElement ClickOnSaveButtonForLeadAttributes;
		
		
		//***
		@FindBy(xpath = "(//mat-panel-title[text()=' Lead Attributes ']//..//..//..)[1]//div[text()='No Record Found ! ']")
		WebElement DisplayedNoRecordFoundInSelectedAttributeFieldListLeadAttributes;
		@FindBy(xpath = "(//mat-panel-title[text()=' Lead Activity Attributes ']//..//..//..)[1]//div[text()='No Record Found ! ']")
		WebElement DisplayedNoRecordFoundInSelectedAttributeFieldListForLeadActivityAttributes ;
		@FindBy(xpath = "(//mat-panel-title[text()=' Lead Attributes ']//..//..//..)[1]//label[text()='Attribute Field List']//..//i-tabler[@name='x']")
		WebElement ClickOnCloseIconFromAttributeFieldListSearchBoxLeadAttributes ;
		@FindBy(xpath = "(//mat-panel-title[text()=' Lead Activity Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//i-tabler[@name='x']")
		WebElement ClickOnCloseIconFromSelectedAttributeFieldListSearchBoxLeadActivityAttributes ;


		public void ClickOnCloseIconFromAttributeFieldListSearchBoxLeadAttributes() {
			new WebDriverWait(ldriver,Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnCloseIconFromAttributeFieldListSearchBoxLeadAttributes));
			ClickOnCloseIconFromAttributeFieldListSearchBoxLeadAttributes.click();
		}
		public void ClickOnCloseIconFromSelectedAttributeFieldListSearchBoxLeadActivityAttributes() {
			new WebDriverWait(ldriver,Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnCloseIconFromSelectedAttributeFieldListSearchBoxLeadActivityAttributes));
			ClickOnCloseIconFromSelectedAttributeFieldListSearchBoxLeadActivityAttributes.click();
		}
		public boolean DisplayedNoRecordFoundInSelectedAttributeFieldListLeadAttributes() {
			try {
				new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedNoRecordFoundInSelectedAttributeFieldListLeadAttributes));
				return DisplayedNoRecordFoundInSelectedAttributeFieldListLeadAttributes.isDisplayed();
			} catch (Exception e) {
				return false;
			}
		}
		public boolean DisplayedNoRecordFoundInSelectedAttributeFieldListForLeadActivityAttributes() {
			try {
				new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedNoRecordFoundInSelectedAttributeFieldListForLeadActivityAttributes));
				return DisplayedNoRecordFoundInSelectedAttributeFieldListForLeadActivityAttributes.isDisplayed();
			} catch (Exception e) {
				return false;
			}
		}
				
		//***
		

		
		


		public void ClickOnLeadBox() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnLeadBox));
			ClickOnLeadBox.click();
		}

		public boolean DisplayedAlertMessageForLeadAttributes() {
			try {
				new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedAlertMessageForLeadAttributes));
				return DisplayedAlertMessageForLeadAttributes.isDisplayed();
			} catch (Exception e) {
				return false;
			}
		}
		
		
		public void SelectBooleanOptionForLeadAttributes() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectBooleanOptionForLeadAttributes));
			SelectBooleanOptionForLeadAttributes.click();
		}
		public boolean DisplayedBooleanOptionForLeadAttributeInSelectedAttributeFieldList() {
			try {
				new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedBooleanOptionForLeadAttributeInSelectedAttributeFieldList));
				return DisplayedBooleanOptionForLeadAttributeInSelectedAttributeFieldList.isDisplayed();
			} catch (Exception e) {
				return false;
			}
		}
		public void ClickBooleanOptionForLeadAttributeFromTheSelectedAttributeFieldList() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickBooleanOptionForLeadAttributeFromTheSelectedAttributeFieldList));
			ClickBooleanOptionForLeadAttributeFromTheSelectedAttributeFieldList.click();
		}
		
		
		public void SelectStringOptionForLeadAttributes() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectStringOptionForLeadAttributes));
			SelectStringOptionForLeadAttributes.click();
		}
		public boolean DisplayedStringOptionForLeadAttributeInSelectedAttributeFieldList() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedStringOptionForLeadAttributeInSelectedAttributeFieldList));
			return DisplayedStringOptionForLeadAttributeInSelectedAttributeFieldList.isDisplayed();
		}
		
		public void SelectNumberOptionForLeadAttributes() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectNumberOptionForLeadAttributes));
			SelectNumberOptionForLeadAttributes.click();
		}
		public boolean DisplayedNumberOptionForLeadAttributeInSelectedAttributeFieldList() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedNumberOptionForLeadAttributeInSelectedAttributeFieldList));
			return DisplayedNumberOptionForLeadAttributeInSelectedAttributeFieldList.isDisplayed();
		}
		
		
		public void SelectDateOptionForLeadAttributes() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectDateOptionForLeadAttributes));
			SelectDateOptionForLeadAttributes.click();
		}
		public boolean DisplayedDateOptionForLeadAttributeInSelectedAttributeFieldList() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedDateOptionForLeadAttributeInSelectedAttributeFieldList));
			return DisplayedDateOptionForLeadAttributeInSelectedAttributeFieldList.isDisplayed();
		}
		
		
		public void ClickOnAddButtonForLeadAttributes() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnAddButtonForLeadAttributes));
			ClickOnAddButtonForLeadAttributes.click();
		}
		public void ClickOnRemoveButtonForLeadAttributes() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnRemoveButtonForLeadAttributes));
			ClickOnRemoveButtonForLeadAttributes.click();
		}
		
		public void ClickOnSaveButtonForLeadAttributes() {
			new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnSaveButtonForLeadAttributes));
			ClickOnSaveButtonForLeadAttributes.click();
		}

		//*****Lead Activity Attribute
		
			@FindBy(xpath = "(//mat-panel-title[text()=' Lead Activity Attributes ']//..//..//..)[1]//span[text()='Saving these changes requires a router restart. Please wait until the router restarts to save the changes.']")
			WebElement DisplayedAlertMessageForLeadActivityAttributes;
			
			
			@FindBy(xpath = "((//mat-panel-title[text()=' Lead Activity Attributes ']//..//..//..)[1]//span[@class='mat-attr mat-attr-ng righticon-BOOLEAN'])[1]")
			WebElement SelectBooleanOptionForLeadActivityAttributes;
			@FindBy(xpath = "(//mat-panel-title[text()=' Lead Activity Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-BOOLEAN']")
			WebElement DisplayedBooleanOptionForLeadActivityAttributesInSelectedAttributeFieldList;
			@FindBy(xpath = "(//mat-panel-title[text()=' Lead Activity Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-BOOLEAN']")
			WebElement ClickBooleanOptionForLeadActivityAttributesFromTheSelectedAttributeFieldList;
			
			@FindBy(xpath = "((//mat-panel-title[text()=' Lead Activity Attributes ']//..//..//..)[1]//span[@class='mat-attr mat-attr-ng righticon-STRING'])[1]")
			WebElement SelectStringOptionForLeadActivityAttributes;
			@FindBy(xpath = "(//mat-panel-title[text()=' Lead Activity Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-STRING']")
			WebElement DisplayedStringOptionForLeadActivityAttributesInSelectedAttributeFieldList;
			
			@FindBy(xpath = "((//mat-panel-title[text()=' Lead Activity Attributes ']//..//..//..)[1]//span[@class='mat-attr mat-attr-ng righticon-NUMBER'])[1]")
			WebElement SelectNumberOptionForLeadActivityAttributes;
			@FindBy(xpath = "(//mat-panel-title[text()=' Lead Activity Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-NUMBER']")
			WebElement DisplayedNumberOptionForLeadActivityAttributesInSelectedAttributeFieldList;
			
			@FindBy(xpath = "((//mat-panel-title[text()=' Lead Activity Attributes ']//..//..//..)[1]//span[@class='mat-attr mat-attr-ng righticon-DATETIME'])[1]")
			WebElement SelectDateOptionForLeadActivityAttributes;
			@FindBy(xpath = "(//mat-panel-title[text()=' Lead Activity Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-DATETIME']")
			WebElement DisplayedDateOptionForLeadActivityAttributesInSelectedAttributeFieldList;
			
			
			
			@FindBy(xpath = "(//mat-panel-title[text()=' Lead Activity Attributes ']//..//..//..)[1]//button[@name='addBtn']")
			WebElement ClickOnAddButtonForLeadActivityAttributes;
			@FindBy(xpath = "(//mat-panel-title[text()=' Lead Activity Attributes ']//..//..//..)[1]//button[@name='removeBtn']")
			WebElement ClickOnRemoveButtonForLeadActivityAttributes;
			
			@FindBy(xpath = "(//mat-panel-title[text()=' Lead Activity Attributes ']//..//..//..)[1]//span[text()='Save']")
			WebElement ClickOnSaveButtonForLeadActivityAttributes;
			
			
			public boolean DisplayedAlertMessageForLeadActivityAttributes() {
				try {
					new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedAlertMessageForLeadActivityAttributes));
					return DisplayedAlertMessageForLeadActivityAttributes.isDisplayed();
				} catch (Exception e) {
					return false;
				}
			}
			
			
			public void SelectBooleanOptionForLeadActivityAttributes() {
				new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectBooleanOptionForLeadActivityAttributes));
				SelectBooleanOptionForLeadActivityAttributes.click();
			}
			public boolean DisplayedBooleanOptionForLeadActivityAttributesInSelectedAttributeFieldList() {
				try {
					new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedBooleanOptionForLeadActivityAttributesInSelectedAttributeFieldList));
					return DisplayedBooleanOptionForLeadActivityAttributesInSelectedAttributeFieldList.isDisplayed();
				} catch (Exception e) {
			return false;
				}
			}
			public void ClickBooleanOptionForLeadActivityAttributesFromTheSelectedAttributeFieldList() {
				new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickBooleanOptionForLeadActivityAttributesFromTheSelectedAttributeFieldList));
				ClickBooleanOptionForLeadActivityAttributesFromTheSelectedAttributeFieldList.click();
			}
			
			
			public void SelectStringOptionForLeadActivityAttributes() {
				new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectStringOptionForLeadActivityAttributes));
				SelectStringOptionForLeadActivityAttributes.click();
			}
			public boolean DisplayedStringOptionForLeadActivityAttributesInSelectedAttributeFieldList() {
				new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedStringOptionForLeadActivityAttributesInSelectedAttributeFieldList));
				return DisplayedStringOptionForLeadActivityAttributesInSelectedAttributeFieldList.isDisplayed();
			}
			
			
			public void SelectNumberOptionForLeadActivityAttributes() {
				new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectNumberOptionForLeadActivityAttributes));
				SelectNumberOptionForLeadActivityAttributes.click();
			}
			public boolean DisplayedNumberOptionForLeadActivityAttributesInSelectedAttributeFieldList() {
				new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedNumberOptionForLeadActivityAttributesInSelectedAttributeFieldList));
				return DisplayedNumberOptionForLeadActivityAttributesInSelectedAttributeFieldList.isDisplayed();
			}
			
			
			public void SelectDateOptionForLeadActivityAttributes() {
				new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectDateOptionForLeadActivityAttributes));
				SelectDateOptionForLeadActivityAttributes.click();
			}
			public boolean DisplayedDateOptionForLeadActivityAttributesInSelectedAttributeFieldList() {
				new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedDateOptionForLeadActivityAttributesInSelectedAttributeFieldList));
				return DisplayedDateOptionForLeadActivityAttributesInSelectedAttributeFieldList.isDisplayed();
			}
			
			
			public void ClickOnAddButtonForLeadActivityAttributes() {
				new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnAddButtonForLeadActivityAttributes));
				ClickOnAddButtonForLeadActivityAttributes.click();
			}
			public void ClickOnRemoveButtonForLeadActivityAttributes() {
				new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnRemoveButtonForLeadActivityAttributes));
				ClickOnRemoveButtonForLeadActivityAttributes.click();
			}
			
			
			public void ClickOnSaveButtonForLeadActivityAttributes() {
				new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnSaveButtonForLeadActivityAttributes));
				ClickOnSaveButtonForLeadActivityAttributes.click();
			}
			
		
			//********************************************************* Opportunity ************************************************************


			@FindBy(xpath = "//div[@class='card-details']//h6[text()='Opportunity']")
			WebElement ClickOnOpportunityBox;
			//*****Lead Attribute

			@FindBy(xpath = "(//mat-panel-title[text()=' Opportunity Attributes ']//..//..//..)[1]//span[text()='Saving these changes requires a router restart. Please wait until the router restarts to save the changes.']")
			WebElement DisplayedAlertMessageForOpportunityAttributes;
			
			
			@FindBy(xpath = "((//mat-panel-title[text()=' Opportunity Attributes ']//..//..//..)[1]//span[@class='mat-attr mat-attr-ng righticon-BOOLEAN'])[1]")
			WebElement SelectBooleanOptionForOpportunityAttributes;
			@FindBy(xpath = "(//mat-panel-title[text()=' Opportunity Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-BOOLEAN']")
			WebElement DisplayedBooleanOptionForOpportunityAttributeInSelectedAttributeFieldList;
			@FindBy(xpath = "(//mat-panel-title[text()=' Opportunity Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-BOOLEAN']")
			WebElement ClickBooleanOptionForOpportunityAttributeFromTheSelectedAttributeFieldList;
			
			@FindBy(xpath = "((//mat-panel-title[text()=' Opportunity Attributes ']//..//..//..)[1]//span[@class='mat-attr mat-attr-ng righticon-STRING'])[1]")
			WebElement SelectStringOptionForOpportunityAttributes;
			@FindBy(xpath = "(//mat-panel-title[text()=' Opportunity Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-STRING']")
			WebElement DisplayedStringOptionForOpportunityAttributeInSelectedAttributeFieldList;
			
			@FindBy(xpath = "((//mat-panel-title[text()=' Opportunity Attributes ']//..//..//..)[1]//span[@class='mat-attr mat-attr-ng righticon-NUMBER'])[1]")
			WebElement SelectNumberOptionForOpportunityAttributes;
			@FindBy(xpath = "(//mat-panel-title[text()=' Opportunity Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-NUMBER']")
			WebElement DisplayedNumberOptionForOpportunityAttributeInSelectedAttributeFieldList;
			
			@FindBy(xpath = "((//mat-panel-title[text()=' Opportunity Attributes ']//..//..//..)[1]//span[@class='mat-attr mat-attr-ng righticon-DATETIME'])[1]")
			WebElement SelectDateOptionForOpportunityAttributes;
			@FindBy(xpath = "(//mat-panel-title[text()=' Opportunity Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-DATETIME']")
			WebElement DisplayedDateOptionForOpportunityAttributeInSelectedAttributeFieldList;
			
			
			
			@FindBy(xpath = "(//mat-panel-title[text()=' Opportunity Attributes ']//..//..//..)[1]//button[@name='addBtn']")
			WebElement ClickOnAddButtonForOpportunityAttributes;
			@FindBy(xpath = "(//mat-panel-title[text()=' Opportunity Attributes ']//..//..//..)[1]//button[@name='removeBtn']")
			WebElement ClickOnRemoveButtonForOpportunityAttributes;
			
			@FindBy(xpath = "(//mat-panel-title[text()=' Opportunity Attributes ']//..//..//..)[1]//span[text()='Save']")
			WebElement ClickOnSaveButtonForOpportunityAttributes;
			
			
			//***
			@FindBy(xpath = "(//mat-panel-title[text()=' Opportunity Attributes ']//..//..//..)[1]//div[text()='No Record Found ! ']")
			WebElement DisplayedNoRecordFoundInSelectedAttributeFieldListOpportunityAttributes;
			@FindBy(xpath = "(//mat-panel-title[text()=' Opportunity Activity Attributes ']//..//..//..)[1]//div[text()='No Record Found ! ']")
			WebElement DisplayedNoRecordFoundInSelectedAttributeFieldListForOpportunityActivityAttributes ;
			@FindBy(xpath = "(//mat-panel-title[text()=' Opportunity Attributes ']//..//..//..)[1]//label[text()='Attribute Field List']//..//i-tabler[@name='x']")
			WebElement ClickOnCloseIconFromAttributeFieldListSearchBoxOpportunityAttributes ;
			@FindBy(xpath = "(//mat-panel-title[text()=' Opportunity Activity Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//i-tabler[@name='x']")
			WebElement ClickOnCloseIconFromSelectedAttributeFieldListSearchBoxOpportunityActivityAttributes ;


			public void ClickOnCloseIconFromAttributeFieldListSearchBoxOpportunityAttributes() {
				new WebDriverWait(ldriver,Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnCloseIconFromAttributeFieldListSearchBoxOpportunityAttributes));
				ClickOnCloseIconFromAttributeFieldListSearchBoxOpportunityAttributes.click();
			}
			public void ClickOnCloseIconFromSelectedAttributeFieldListSearchBoxOpportunityActivityAttributes() {
				new WebDriverWait(ldriver,Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnCloseIconFromSelectedAttributeFieldListSearchBoxOpportunityActivityAttributes));
				ClickOnCloseIconFromSelectedAttributeFieldListSearchBoxOpportunityActivityAttributes.click();
			}
			public boolean DisplayedNoRecordFoundInSelectedAttributeFieldListOpportunityAttributes() {
				try {
					new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedNoRecordFoundInSelectedAttributeFieldListOpportunityAttributes));
					return DisplayedNoRecordFoundInSelectedAttributeFieldListOpportunityAttributes.isDisplayed();
				} catch (Exception e) {
					return false;
				}
			}
			public boolean DisplayedNoRecordFoundInSelectedAttributeFieldListForOpportunityActivityAttributes() {
				try {
					new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedNoRecordFoundInSelectedAttributeFieldListForOpportunityActivityAttributes));
					return DisplayedNoRecordFoundInSelectedAttributeFieldListForOpportunityActivityAttributes.isDisplayed();
				} catch (Exception e) {
					return false;
				}
			}
					
			//***
			

			
			


			public void ClickOnOpportunityBox() {
				new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnOpportunityBox));
				ClickOnOpportunityBox.click();
			}

			public boolean DisplayedAlertMessageForOpportunityAttributes() {
				try {
					new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedAlertMessageForOpportunityAttributes));
					return DisplayedAlertMessageForOpportunityAttributes.isDisplayed();
				} catch (Exception e) {
					return false;
				}
			}
			
			
			public void SelectBooleanOptionForOpportunityAttributes() {
				new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectBooleanOptionForOpportunityAttributes));
				SelectBooleanOptionForOpportunityAttributes.click();
			}
			public boolean DisplayedBooleanOptionForOpportunityAttributeInSelectedAttributeFieldList() {
				try {
					new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedBooleanOptionForOpportunityAttributeInSelectedAttributeFieldList));
					return DisplayedBooleanOptionForOpportunityAttributeInSelectedAttributeFieldList.isDisplayed();
				} catch (Exception e) {
					return false;
				}
			}
			public void ClickBooleanOptionForOpportunityAttributeFromTheSelectedAttributeFieldList() {
				new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickBooleanOptionForOpportunityAttributeFromTheSelectedAttributeFieldList));
				ClickBooleanOptionForOpportunityAttributeFromTheSelectedAttributeFieldList.click();
			}
			
			
			public void SelectStringOptionForOpportunityAttributes() {
				new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectStringOptionForOpportunityAttributes));
				SelectStringOptionForOpportunityAttributes.click();
			}
			public boolean DisplayedStringOptionForOpportunityAttributeInSelectedAttributeFieldList() {
				new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedStringOptionForOpportunityAttributeInSelectedAttributeFieldList));
				return DisplayedStringOptionForOpportunityAttributeInSelectedAttributeFieldList.isDisplayed();
			}
			
			public void SelectNumberOptionForOpportunityAttributes() {
				new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectNumberOptionForOpportunityAttributes));
				SelectNumberOptionForOpportunityAttributes.click();
			}
			public boolean DisplayedNumberOptionForOpportunityAttributeInSelectedAttributeFieldList() {
				new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedNumberOptionForOpportunityAttributeInSelectedAttributeFieldList));
				return DisplayedNumberOptionForOpportunityAttributeInSelectedAttributeFieldList.isDisplayed();
			}
			
			
			public void SelectDateOptionForOpportunityAttributes() {
				new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectDateOptionForOpportunityAttributes));
				SelectDateOptionForOpportunityAttributes.click();
			}
			public boolean DisplayedDateOptionForOpportunityAttributeInSelectedAttributeFieldList() {
				new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedDateOptionForOpportunityAttributeInSelectedAttributeFieldList));
				return DisplayedDateOptionForOpportunityAttributeInSelectedAttributeFieldList.isDisplayed();
			}
			
			
			public void ClickOnAddButtonForOpportunityAttributes() {
				new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnAddButtonForOpportunityAttributes));
				ClickOnAddButtonForOpportunityAttributes.click();
			}
			public void ClickOnRemoveButtonForOpportunityAttributes() {
				new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnRemoveButtonForOpportunityAttributes));
				ClickOnRemoveButtonForOpportunityAttributes.click();
			}
			
			public void ClickOnSaveButtonForOpportunityAttributes() {
				new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnSaveButtonForOpportunityAttributes));
				ClickOnSaveButtonForOpportunityAttributes.click();
			}

			//*****Lead Activity Attribute
			
				@FindBy(xpath = "(//mat-panel-title[text()=' Opportunity Activity Attributes ']//..//..//..)[1]//span[text()='Saving these changes requires a router restart. Please wait until the router restarts to save the changes.']")
				WebElement DisplayedAlertMessageForOpportunityActivityAttributes;
				
				
				@FindBy(xpath = "((//mat-panel-title[text()=' Opportunity Activity Attributes ']//..//..//..)[1]//span[@class='mat-attr mat-attr-ng righticon-BOOLEAN'])[1]")
				WebElement SelectBooleanOptionForOpportunityActivityAttributes;
				@FindBy(xpath = "(//mat-panel-title[text()=' Opportunity Activity Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-BOOLEAN']")
				WebElement DisplayedBooleanOptionForOpportunityActivityAttributesInSelectedAttributeFieldList;
				@FindBy(xpath = "(//mat-panel-title[text()=' Opportunity Activity Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-BOOLEAN']")
				WebElement ClickBooleanOptionForOpportunityActivityAttributesFromTheSelectedAttributeFieldList;
				
				@FindBy(xpath = "((//mat-panel-title[text()=' Opportunity Activity Attributes ']//..//..//..)[1]//span[@class='mat-attr mat-attr-ng righticon-STRING'])[1]")
				WebElement SelectStringOptionForOpportunityActivityAttributes;
				@FindBy(xpath = "(//mat-panel-title[text()=' Opportunity Activity Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-STRING']")
				WebElement DisplayedStringOptionForOpportunityActivityAttributesInSelectedAttributeFieldList;
				
				@FindBy(xpath = "((//mat-panel-title[text()=' Opportunity Activity Attributes ']//..//..//..)[1]//span[@class='mat-attr mat-attr-ng righticon-NUMBER'])[1]")
				WebElement SelectNumberOptionForOpportunityActivityAttributes;
				@FindBy(xpath = "(//mat-panel-title[text()=' Opportunity Activity Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-NUMBER']")
				WebElement DisplayedNumberOptionForOpportunityActivityAttributesInSelectedAttributeFieldList;
				
				@FindBy(xpath = "((//mat-panel-title[text()=' Opportunity Activity Attributes ']//..//..//..)[1]//span[@class='mat-attr mat-attr-ng righticon-DATETIME'])[1]")
				WebElement SelectDateOptionForOpportunityActivityAttributes;
				@FindBy(xpath = "(//mat-panel-title[text()=' Opportunity Activity Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-DATETIME']")
				WebElement DisplayedDateOptionForOpportunityActivityAttributesInSelectedAttributeFieldList;
				
				
				
				@FindBy(xpath = "(//mat-panel-title[text()=' Opportunity Activity Attributes ']//..//..//..)[1]//button[@name='addBtn']")
				WebElement ClickOnAddButtonForOpportunityActivityAttributes;
				@FindBy(xpath = "(//mat-panel-title[text()=' Opportunity Activity Attributes ']//..//..//..)[1]//button[@name='removeBtn']")
				WebElement ClickOnRemoveButtonForOpportunityActivityAttributes;
				
				@FindBy(xpath = "(//mat-panel-title[text()=' Opportunity Activity Attributes ']//..//..//..)[1]//span[text()='Save']")
				WebElement ClickOnSaveButtonForOpportunityActivityAttributes;
				
				
				public boolean DisplayedAlertMessageForOpportunityActivityAttributes() {
					try {
						new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedAlertMessageForOpportunityActivityAttributes));
						return DisplayedAlertMessageForOpportunityActivityAttributes.isDisplayed();
					} catch (Exception e) {
						return false;
					}
				}
				
				
				public void SelectBooleanOptionForOpportunityActivityAttributes() {
					new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectBooleanOptionForOpportunityActivityAttributes));
					SelectBooleanOptionForOpportunityActivityAttributes.click();
				}
				public boolean DisplayedBooleanOptionForOpportunityActivityAttributesInSelectedAttributeFieldList() {
					try {
						new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedBooleanOptionForOpportunityActivityAttributesInSelectedAttributeFieldList));
						return DisplayedBooleanOptionForOpportunityActivityAttributesInSelectedAttributeFieldList.isDisplayed();
					} catch (Exception e) {
				return false;
					}
				}
				public void ClickBooleanOptionForOpportunityActivityAttributesFromTheSelectedAttributeFieldList() {
					new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickBooleanOptionForOpportunityActivityAttributesFromTheSelectedAttributeFieldList));
					ClickBooleanOptionForOpportunityActivityAttributesFromTheSelectedAttributeFieldList.click();
				}
				
				
				public void SelectStringOptionForOpportunityActivityAttributes() {
					new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectStringOptionForOpportunityActivityAttributes));
					SelectStringOptionForOpportunityActivityAttributes.click();
				}
				public boolean DisplayedStringOptionForOpportunityActivityAttributesInSelectedAttributeFieldList() {
					new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedStringOptionForOpportunityActivityAttributesInSelectedAttributeFieldList));
					return DisplayedStringOptionForOpportunityActivityAttributesInSelectedAttributeFieldList.isDisplayed();
				}
				
				
				public void SelectNumberOptionForOpportunityActivityAttributes() {
					new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectNumberOptionForOpportunityActivityAttributes));
					SelectNumberOptionForOpportunityActivityAttributes.click();
				}
				public boolean DisplayedNumberOptionForOpportunityActivityAttributesInSelectedAttributeFieldList() {
					new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedNumberOptionForOpportunityActivityAttributesInSelectedAttributeFieldList));
					return DisplayedNumberOptionForOpportunityActivityAttributesInSelectedAttributeFieldList.isDisplayed();
				}
				
				
				public void SelectDateOptionForOpportunityActivityAttributes() {
					new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectDateOptionForOpportunityActivityAttributes));
					SelectDateOptionForOpportunityActivityAttributes.click();
				}
				public boolean DisplayedDateOptionForOpportunityActivityAttributesInSelectedAttributeFieldList() {
					new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(DisplayedDateOptionForOpportunityActivityAttributesInSelectedAttributeFieldList));
					return DisplayedDateOptionForOpportunityActivityAttributesInSelectedAttributeFieldList.isDisplayed();
				}
				
				
				public void ClickOnAddButtonForOpportunityActivityAttributes() {
					new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnAddButtonForOpportunityActivityAttributes));
					ClickOnAddButtonForOpportunityActivityAttributes.click();
				}
				public void ClickOnRemoveButtonForOpportunityActivityAttributes() {
					new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnRemoveButtonForOpportunityActivityAttributes));
					ClickOnRemoveButtonForOpportunityActivityAttributes.click();
				}
				
				
				public void ClickOnSaveButtonForOpportunityActivityAttributes() {
					new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnSaveButtonForOpportunityActivityAttributes));
					ClickOnSaveButtonForOpportunityActivityAttributes.click();
				}
	
	
	
				//********************************************************* Owner Attributes ************************************************************


				@FindBy(xpath = "//div[@class='card-details']//h6[text()='Owner Attributes']")
				WebElement ClickOnOwnerAttributesBox;
				//*****Lead Attribute

				@FindBy(xpath = "(//mat-panel-title[text()=' Owner Attributes ']//..//..//..)[1]//span[text()='Saving these changes requires a router restart. Please wait until the router restarts to save the changes.']")
				WebElement DisplayedAlertMessageForOwnerAttributes;
				
				
				@FindBy(xpath = "((//mat-panel-title[text()=' Owner Attributes ']//..//..//..)[1]//span[@class='mat-attr mat-attr-ng righticon-BOOLEAN'])[1]")
				WebElement SelectBooleanOptionForOwnerAttributes;
				@FindBy(xpath = "(//mat-panel-title[text()=' Owner Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-BOOLEAN']")
				WebElement DisplayedBooleanOptionForOwnerAttributeInSelectedAttributeFieldList;
				@FindBy(xpath = "(//mat-panel-title[text()=' Owner Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-BOOLEAN']")
				WebElement ClickBooleanOptionForOwnerAttributeFromTheSelectedAttributeFieldList;
				
				@FindBy(xpath = "((//mat-panel-title[text()=' Owner Attributes ']//..//..//..)[1]//span[@class='mat-attr mat-attr-ng righticon-STRING'])[1]")
				WebElement SelectStringOptionForOwnerAttributes;
				@FindBy(xpath = "(//mat-panel-title[text()=' Owner Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-STRING']")
				WebElement DisplayedStringOptionForOwnerAttributeInSelectedAttributeFieldList;
				
				@FindBy(xpath = "((//mat-panel-title[text()=' Owner Attributes ']//..//..//..)[1]//span[@class='mat-attr mat-attr-ng righticon-NUMBER'])[1]")
				WebElement SelectNumberOptionForOwnerAttributes;
				@FindBy(xpath = "(//mat-panel-title[text()=' Owner Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-NUMBER']")
				WebElement DisplayedNumberOptionForOwnerAttributeInSelectedAttributeFieldList;
				
				@FindBy(xpath = "((//mat-panel-title[text()=' Owner Attributes ']//..//..//..)[1]//span[@class='mat-attr mat-attr-ng righticon-DATETIME'])[1]")
				WebElement SelectDateOptionForOwnerAttributes;
				@FindBy(xpath = "(//mat-panel-title[text()=' Owner Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//span[@class='mat-attr mat-attr-ng righticon-DATETIME']")
				WebElement DisplayedDateOptionForOwnerAttributeInSelectedAttributeFieldList;
				
				
				
				@FindBy(xpath = "(//mat-panel-title[text()=' Owner Attributes ']//..//..//..)[1]//button[@name='addBtn']")
				WebElement ClickOnAddButtonForOwnerAttributes;
				@FindBy(xpath = "(//mat-panel-title[text()=' Owner Attributes ']//..//..//..)[1]//button[@name='removeBtn']")
				WebElement ClickOnRemoveButtonForOwnerAttributes;
				
				@FindBy(xpath = "(//mat-panel-title[text()=' Owner Attributes ']//..//..//..)[1]//span[text()='Save']")
				WebElement ClickOnSaveButtonForOwnerAttributes;
				
				
				//***
				@FindBy(xpath = "(//mat-panel-title[text()=' Owner Attributes ']//..//..//..)[1]//div[text()='No Record Found ! ']")
				WebElement DisplayedNoRecordFoundInSelectedAttributeFieldListOwnerAttributes;
				@FindBy(xpath = "(//mat-panel-title[text()=' Owner Activity Attributes ']//..//..//..)[1]//div[text()='No Record Found ! ']")
				WebElement DisplayedNoRecordFoundInSelectedAttributeFieldListForOwnerActivityAttributes ;
				@FindBy(xpath = "(//mat-panel-title[text()=' Owner Attributes ']//..//..//..)[1]//label[text()='Attribute Field List']//..//i-tabler[@name='x']")
				WebElement ClickOnCloseIconFromAttributeFieldListSearchBoxOwnerAttributes ;
				@FindBy(xpath = "(//mat-panel-title[text()=' Owner Activity Attributes ']//..//..//..)[1]//label[text()='Selected Attribute Field List']//..//i-tabler[@name='x']")
				WebElement ClickOnCloseIconFromSelectedAttributeFieldListSearchBoxOwnerActivityAttributes ;


				public void ClickOnCloseIconFromAttributeFieldListSearchBoxOwnerAttributes() {
					new WebDriverWait(ldriver,Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnCloseIconFromAttributeFieldListSearchBoxOwnerAttributes));
					ClickOnCloseIconFromAttributeFieldListSearchBoxOwnerAttributes.click();
				}
				public void ClickOnCloseIconFromSelectedAttributeFieldListSearchBoxOwnerActivityAttributes() {
					new WebDriverWait(ldriver,Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnCloseIconFromSelectedAttributeFieldListSearchBoxOwnerActivityAttributes));
					ClickOnCloseIconFromSelectedAttributeFieldListSearchBoxOwnerActivityAttributes.click();
				}
				public boolean DisplayedNoRecordFoundInSelectedAttributeFieldListOwnerAttributes() {
					try {
						new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedNoRecordFoundInSelectedAttributeFieldListOwnerAttributes));
						return DisplayedNoRecordFoundInSelectedAttributeFieldListOwnerAttributes.isDisplayed();
					} catch (Exception e) {
						return false;
					}
				}
				public boolean DisplayedNoRecordFoundInSelectedAttributeFieldListForOwnerActivityAttributes() {
					try {
						new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedNoRecordFoundInSelectedAttributeFieldListForOwnerActivityAttributes));
						return DisplayedNoRecordFoundInSelectedAttributeFieldListForOwnerActivityAttributes.isDisplayed();
					} catch (Exception e) {
						return false;
					}
				}
						
				//***
				

				
				


				public void ClickOnOwnerBox() {
					new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnOwnerAttributesBox));
					ClickOnOwnerAttributesBox.click();
				}

				public boolean DisplayedAlertMessageForOwnerAttributes() {
					try {
						new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedAlertMessageForOwnerAttributes));
						return DisplayedAlertMessageForOwnerAttributes.isDisplayed();
					} catch (Exception e) {
						return false;
					}
				}
				
				
				public void SelectBooleanOptionForOwnerAttributes() {
					new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectBooleanOptionForOwnerAttributes));
					SelectBooleanOptionForOwnerAttributes.click();
				}
				public boolean DisplayedBooleanOptionForOwnerAttributeInSelectedAttributeFieldList() {
					try {
						new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedBooleanOptionForOwnerAttributeInSelectedAttributeFieldList));
						return DisplayedBooleanOptionForOwnerAttributeInSelectedAttributeFieldList.isDisplayed();
					} catch (Exception e) {
						return false;
					}
				}
				public void ClickBooleanOptionForOwnerAttributeFromTheSelectedAttributeFieldList() {
					new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickBooleanOptionForOwnerAttributeFromTheSelectedAttributeFieldList));
					ClickBooleanOptionForOwnerAttributeFromTheSelectedAttributeFieldList.click();
				}
				
				
				public void SelectStringOptionForOwnerAttributes() {
					new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectStringOptionForOwnerAttributes));
					SelectStringOptionForOwnerAttributes.click();
				}
				public boolean DisplayedStringOptionForOwnerAttributeInSelectedAttributeFieldList() {
					new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedStringOptionForOwnerAttributeInSelectedAttributeFieldList));
					return DisplayedStringOptionForOwnerAttributeInSelectedAttributeFieldList.isDisplayed();
				}
				
				public void SelectNumberOptionForOwnerAttributes() {
					new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectNumberOptionForOwnerAttributes));
					SelectNumberOptionForOwnerAttributes.click();
				}
				public boolean DisplayedNumberOptionForOwnerAttributeInSelectedAttributeFieldList() {
					new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedNumberOptionForOwnerAttributeInSelectedAttributeFieldList));
					return DisplayedNumberOptionForOwnerAttributeInSelectedAttributeFieldList.isDisplayed();
				}
				
				
				public void SelectDateOptionForOwnerAttributes() {
					new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectDateOptionForOwnerAttributes));
					SelectDateOptionForOwnerAttributes.click();
				}
				public boolean DisplayedDateOptionForOwnerAttributeInSelectedAttributeFieldList() {
					new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayedDateOptionForOwnerAttributeInSelectedAttributeFieldList));
					return DisplayedDateOptionForOwnerAttributeInSelectedAttributeFieldList.isDisplayed();
				}
				
				
				public void ClickOnAddButtonForOwnerAttributes() {
					new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnAddButtonForOwnerAttributes));
					ClickOnAddButtonForOwnerAttributes.click();
				}
				public void ClickOnRemoveButtonForOwnerAttributes() {
					new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnRemoveButtonForOwnerAttributes));
					ClickOnRemoveButtonForOwnerAttributes.click();
				}
				
				public void ClickOnSaveButtonForOwnerAttributes() {
					new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(ClickOnSaveButtonForOwnerAttributes));
					ClickOnSaveButtonForOwnerAttributes.click();
				}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
