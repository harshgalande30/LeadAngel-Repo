package com.leadAngel.pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebhookPageObjectModel {
	
	  WebDriver ldriver;

	public WebhookPageObjectModel(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
}
	
	@FindBy(xpath = "//button[@aria-label='toggle 5/3Folder']")                
	WebElement ClickOnFolder;
	
    //******************************************************** URL ************************************************
	//Some of InsertSToken operation xpath has been taken from LeadRouterPage and EmailAlertPOM
	
	@FindBy(xpath = "//textarea[@id='URL_textArea']")
	WebElement EnterURLinsideURLtextarea;

	@FindBy(xpath = "(//div[@class='ng-select-container'])[3]")    
	WebElement InsertTokenSelectFieldDropDown;
	
	@FindBy(xpath = "//div[@class='ng-select-container']")    
	WebElement EditInsertTokenSelectFieldDropDown;
	
	@FindBy(xpath = "//span[text()=' Save ']")                
	WebElement SaveButtonForInsertToken;
	
	public String URLAfterApprovedInUI="Hello lead, This is your{!Lead.Id}";
	public String URLAfterApprovedInAPI="Hello lead, This is your{!Lead.Id}";
	
	//******************************************************** Request Type ************************************************
	
	@FindBy(xpath = "//option[@value='POST']")                
	WebElement selectOptionInRequestType;
	
	@FindBy(xpath = "(//option[@value='GET'])")                
	WebElement EditselectOptionInRequestType;
	
	@FindBy(xpath = "//option[text()='POST']")                
	WebElement VerifyselectOptionInRequestType;
	  
	@FindBy(xpath = "//select[@class='form-control fsiz ng-pristine ng-valid ng-touched']")                
	WebElement VerifyselectOptionTextInRequestType;
          
	public String RequestTypeInUI="POST";
	public String RequestTypeInAPI="POST";
	
	//******************************************************** PayLoad Template ************************************************
	//Some of InsertSToken operation xpath has been taken from LeadRouterPage and EmailAlertPOM
	
	@FindBy(xpath = "//textarea[@id='payloadTemplate_textArea']")                
	WebElement WriteInsidepayloadTemplatetesxarea;
	
	public String PayLoadTemplateAfterApprovedInUI="Hello lead, This is your{!Lead.Id}";
	public String PayLoadTemplateAfterApprovedInAPI="Hello lead, This is your{!Lead.Id}";
	
	//******************************************************** Request Token Encoding ************************************************
	@FindBy(xpath = "(//option[@value='JSON'])[1]")                
	WebElement selectOptionfromRequestTokenEncoding;
	
	@FindBy(xpath = "(//option[text()='JSON'])[1]")                
	WebElement VerifyselectOptionfromRequestTokenEncoding;
	
	public String RequestTokenEncodingAfterApprovedInUI="JSON";
	public String RequestTokenEncodingAfterApprovedInAPI="JSON";
	
	//******************************************************** Response Type ************************************************

	@FindBy(xpath = "(//option[@value='JSON'])[2]")                
	WebElement selectOptionfromResponseType;
	
	@FindBy(xpath = "(//option[@value='XML'])")                
	WebElement EditselectOptionfromResponseType;
	
	@FindBy(xpath = "(//option[text()='JSON'])[2]")                
	WebElement VerifyselectOptionfromResponseType;
	
	public String ResponseTypeAfterApprovedInUI="JSON";
	public String ResponseTypeAfterApprovedInAPI="JSON";
	
	//******************************************************** Response Mapping ************************************************

	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[1]")                
	WebElement selectDropDownOfResponseMapping;
	
	@FindBy(xpath = "(//div[@role='option'])[1]")                
	WebElement selectOptioFromResponseMapping;
	
	public String ResponseMappingAfterApprovedInUI="22JulTestLead_Rename fasdfas adfasdf dsfasdfasdfas";
	public String ResponseMappingAfterApprovedInAPI="22JulTestLead_Rename fasdfas adfasdf dsfasdfasdfas";
	

	//******************************************************** Custom Header ************************************************
	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[2]")                
	WebElement selectDropDownOfCustomHeader;
	@FindBy(xpath = "(//div[@role='option'])[1]")                
	WebElement selectOptioFromCustomHeader;
	
	public String CustomHeaderAfterApprovedInUI="22JulTest_Rename aafsdfasdvasf asdfasdfasfd sdfasd";
	public String CustomHeaderAfterApprovedInAPI="22JulTest_Rename aafsdfasdvasf asdfasdfasfd sdfasd";
	
	
	//********************************************************************************************************

	

	public void ClickOnSaveButtonForInsertToken(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SaveButtonForInsertToken));
		SaveButtonForInsertToken.click();
	}
	
	public void ClickOnInsertTokenSelectFieldDropDown(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(InsertTokenSelectFieldDropDown));
		InsertTokenSelectFieldDropDown.click();
	}
	
	public void ClickOnEditInsertTokenSelectFieldDropDown(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EditInsertTokenSelectFieldDropDown));
		EditInsertTokenSelectFieldDropDown.click();
	}
//	public void ClickOnInsertTokenSelectFieldDropDown() {
//		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(InsertTokenSelectFieldDropDown));
//		//ApproveSubmitbtn.click();
//		JavascriptExecutor js = (JavascriptExecutor) ldriver;
//		js.executeScript("arguments[0].click()", InsertTokenSelectFieldDropDown);
//	}
//	
		public void EnterURLinsideURLtextarea() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterURLinsideURLtextarea));
			EnterURLinsideURLtextarea.clear();
			EnterURLinsideURLtextarea.sendKeys("Hello lead, This is your");

		}
	
		public void selectOptionInRequestType(){
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(selectOptionInRequestType));
			selectOptionInRequestType.click();
		}
		public void EditselectOptionInRequestType(){
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EditselectOptionInRequestType));
			EditselectOptionInRequestType.click();
		}
		public void WriteInsidepayloadTemplatetesxarea() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(WriteInsidepayloadTemplatetesxarea));
			WriteInsidepayloadTemplatetesxarea.clear();
			WriteInsidepayloadTemplatetesxarea.sendKeys("Hello lead, This is your");

		}
		
		public String VerifyselectOptionTextInRequestType(){
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(VerifyselectOptionTextInRequestType));
			return VerifyselectOptionTextInRequestType.getText();
		}
		
		public void ClickOnFolder() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(ClickOnFolder));
			ClickOnFolder.click();
		}
		
		public void selectOptionfromRequestTokenEncoding(){
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(selectOptionfromRequestTokenEncoding));
			selectOptionfromRequestTokenEncoding.click();
		}
		public void selectOptionfromResponseType(){
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(selectOptionfromResponseType));
			selectOptionfromResponseType.click();
		}
		public void EditselectOptionfromResponseType(){
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EditselectOptionfromResponseType));
			EditselectOptionfromResponseType.click();
		}
		public void selectDropDownOfResponseMapping(){
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(selectDropDownOfResponseMapping));
			selectDropDownOfResponseMapping.click();
		}
		public void selectOptioFromResponseMapping(){
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(selectOptioFromResponseMapping));
			selectOptioFromResponseMapping.click();
		}
		public void selectDropDownOfCustomHeader(){
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(selectDropDownOfCustomHeader));
			selectDropDownOfCustomHeader.click();
		}
		public void selectOptioFromCustomHeader(){
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(selectOptioFromCustomHeader));
			selectOptioFromCustomHeader.click();
		}
		
		
}
