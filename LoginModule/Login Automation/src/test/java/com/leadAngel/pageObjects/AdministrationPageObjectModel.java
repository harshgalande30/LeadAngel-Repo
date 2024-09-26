package com.leadAngel.pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdministrationPageObjectModel {
	
	  WebDriver ldriver;

	public AdministrationPageObjectModel(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
}
	
	//********************************************************Email Alerts Templates************************************************
	
	@FindBy(xpath = "//button[@aria-label='toggle Email Alerts Templates']")
	WebElement EmailAlertsTemplatesDropDown;
	
	@FindBy(xpath = "//button[text()='New Email Alerts Templates ']")
	WebElement NewEmailAlertsTemplates;
	
	@FindBy(xpath = "//input[@id='menuname']")
	WebElement EnterNameInCrudObject; 
	
	@FindBy(xpath = "//option[@value='Lead']")
	WebElement SelectRouterType; 
	
	@FindBy(xpath = "//button[@type='submit']")                        // "//span[text()=' Save ']"
	WebElement SaveButtonCrudObject;
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
	
	@FindBy(xpath = "//button//span[contains(text(),'AutoTestObject ')]")
	WebElement RightClickOnAutoTestObject;
	@FindBy(xpath = "//span[contains(text(),'AutoTestObject_Rename ')]")
	WebElement AutoTestObjectAfterRename;
	@FindBy(xpath = "//button//span[contains(text(),'AutoTestObject_Rename_Copy(1) ')]")
	WebElement AutoTestObjectAfterClone;
	
	
	//********************************************************************************************************
	
	public void ContextClickOnResponseMapping() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickAgainResponseMapping));
        Actions actions = new Actions(ldriver);
		actions.moveToElement(ClickAgainResponseMapping).click(ClickAgainResponseMapping).contextClick(ClickAgainResponseMapping).build().perform();
	}
	public void ClickOnResponseMappingDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ResponseMappingDropDown));
		ResponseMappingDropDown.click();
	}
	public void ClickAgainResponseMapping() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickAgainResponseMapping));
		ClickAgainResponseMapping.click();
	}
	
	
	
	
	
	
	public void ContextClickOnCloneAutoTestObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(AutoTestObjectAfterClone));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(AutoTestObjectAfterClone).click(AutoTestObjectAfterClone).contextClick(AutoTestObjectAfterClone).build().perform();
	}
	
	public void ContextClickOnRenameAutoTestObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(AutoTestObjectAfterRename));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(AutoTestObjectAfterRename).click(AutoTestObjectAfterRename).contextClick(AutoTestObjectAfterRename).build().perform();
	}
	public void ClickOnAgainRenameAutoTestObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(AutoTestObjectAfterRename));
		AutoTestObjectAfterRename.click();
	}
	public boolean VisibleOfRenameAutoTestObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.visibilityOf(AutoTestObjectAfterRename));
		 return    AutoTestObjectAfterRename.isDisplayed();
	}
	
	public boolean DisplayCloneAutoTestObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.visibilityOf(AutoTestObjectAfterClone));
		return AutoTestObjectAfterClone.isDisplayed();
	}
	
public boolean DisplayAutoTestObjectAfterRename(){
		
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(AutoTestObjectAfterRename));
			return AutoTestObjectAfterRename.isDisplayed();
			}catch(Exception e) {
				return false;
			}								
}
	
	public void ClickEmailAlertsTemplatesDropDown(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EmailAlertsTemplatesDropDown));
		EmailAlertsTemplatesDropDown.click();
	}
	
	public void ClickNewEmailAlertsTemplates(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(NewEmailAlertsTemplates));
		NewEmailAlertsTemplates.click();
	}
	
	public void RightClickonEmailAlertsTemplatesDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25))
				.until(ExpectedConditions.elementToBeClickable(EmailAlertsTemplatesDropDown));
		
		Actions actions = new Actions(ldriver);
		actions.moveToElement(EmailAlertsTemplatesDropDown).click(EmailAlertsTemplatesDropDown).contextClick(EmailAlertsTemplatesDropDown).build()
				.perform();
	}
	
	public void EnterNameInCrudObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(EnterNameInCrudObject));
		EnterNameInCrudObject.clear();
		EnterNameInCrudObject.sendKeys("AutoTestObject");

	}
	public void RightClickOnAutoTestObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(25))
				.until(ExpectedConditions.elementToBeClickable(RightClickOnAutoTestObject));
		
		Actions actions = new Actions(ldriver);
		actions.moveToElement(RightClickOnAutoTestObject).click(RightClickOnAutoTestObject).contextClick(RightClickOnAutoTestObject).build()
				.perform();
	}
	public void ClickagainAutoTestObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(RightClickOnAutoTestObject));
		RightClickOnAutoTestObject.click(); 
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
		actions.moveToElement(WebhookDropDown).click(WebhookDropDown).contextClick(WebhookDropDown).build()
				.perform();
	}
	
	public void ClickOnNewObject(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(NewObject));
		NewObject.click();
	}


	
	
}
