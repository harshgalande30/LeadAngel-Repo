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

public class AEtoSDR_Page {

	WebDriver ldriver;

	public AEtoSDR_Page(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
}
	//************************************************************* CRUD OPERATOIN X PATH ****************************************************

	@FindBy(xpath = "//h4[text()='AE to SDR Mapping Overview']")
	WebElement DisplayAEtoSDRMapingOverview ;
	
	public boolean isDisplayAEtoSDRMapingOverview() {
		new WebDriverWait(ldriver,Duration.ofSeconds(25)).until(ExpectedConditions.visibilityOf(DisplayAEtoSDRMapingOverview));
	    return DisplayAEtoSDRMapingOverview.isDisplayed();
	}

	
	@FindBy(xpath = "(//span[contains(text(),'AutoTestObject ')])[2]/../..//i")    //mat-tooltip-trigger tabtooltip")
	WebElement ClickOnDetailAutotestObject;

	public void ClickOnDetailAutotestObject() {
		  new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ClickOnDetailAutotestObject));
		 ClickOnDetailAutotestObject.click();
	}


	@FindBy(xpath = "(//button[@role='menuitem'])[1]")
	WebElement NewObject;
	
	@FindBy(xpath ="//mat-list-item[contains(@id,'Account Executive')]")//(mat-list-item[@id='Account Executive$#!@#$%^0']")
    WebElement SalesRep;
	
	/*@FindBy(xpath ="//div[@class='dragboxemptypanel mt-3 ng-star-inserted']")
	WebElement AddField;*/
	
    @FindBy(xpath = "//div[@id='cdk-drop-list-0']")
	WebElement AddField;
	
	@FindBy(xpath = "//button//span[text()=' DELETE ']")
	WebElement btnDelete;
	@FindBy(xpath = "(//input[@formcontrolname='SalesRepName'])[1]")
	WebElement InputAE_1;	
	@FindBy(xpath = "(//mat-option[@role='option'])[1]")
	WebElement SelectAEoption_1;	 
	@FindBy(xpath="(//mat-option[@role='option'])[1]")
	WebElement RegressionSelectSDR;	
	@FindBy(xpath = "//input[@formcontrolname='ISRMappedName']")           
	WebElement InputSDR_Mapping_1;
	@FindBy(xpath="(//mat-option[@role='option'])[2]")        
	WebElement SelectSDRoption_1; 	
	@FindBy(xpath = "(//input[@formcontrolname='SalesRepName'])[2]")
	WebElement InputAE_2;
	@FindBy(xpath="(//input[@formcontrolname='ISRMappedName'])[1]")   ///Regression
	WebElement SDR_Mapping_1;
	@FindBy(xpath="//mat-expansion-panel-header[@id=\"mat-expansion-panel-header-1\"]")
	WebElement AEmoveToSecondLine;	
	@FindBy(xpath="//ul[@class=\"tab-slider--tabs\"]")
	WebElement ElemOnMove;	
	@FindBy(xpath = "//span[contains(text(),' Approve ')]")
	WebElement btnApprove;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement ApproveSubmitbtn;
	@FindBy(xpath = "//li[@class='tab-slider--trigger active ng-star-inserted']")     //"//li[contains(text(),' Approved ')]")
	WebElement Approved;	
	@FindBy(xpath="(//li[@class='tab-slider--trigger ng-star-inserted'])[1]")
	WebElement ClickOnDetail;	
	@FindBy(xpath="//button[@mattooltip='Edit Description']")
	WebElement Editbtn;	
	@FindBy(xpath="//textarea[@id=\"menudesc\"]")
	WebElement InputDesc;	
	@FindBy(xpath="//span[contains(text(),'Save')]")
	WebElement Savebtn;	
	@FindBy(xpath="//div[contains(text(),'No Names Found')]")
	WebElement noRandomNameFoundError;	
	@FindBy(xpath="//div[contains(text(),'Error')]")
	WebElement noNameFoundError;	
	@FindBy(xpath="(//div[contains(text(),'Account Executive Name and Mapped SDR Name cannot be same')])[2]")
	WebElement sameNameError;		
	@FindBy(xpath="//div[text()='There are errors on the canvas. Please correct the items highlighted in red below in order to proceed.']")
	WebElement DisplayError;
	@FindBy(xpath="(//div[contains(text(),'Please select Account Executive name first')])[2]")
	WebElement DisplayError2;	
	@FindBy(xpath="(//div[text()='Error'])[2]")
    WebElement SameAEerror;		
	@FindBy(xpath="//span[@id='autoSave' and ./text()='Saving...']")
	WebElement SavingInfo;	
	@FindBy(xpath="//mat-card-content[text()='Object created  via Docker Containers By Robin!!!']")
	WebElement DisplayUpdatedDescMsg;
	
	

	public boolean DisplaySavingInfo() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(SavingInfo));
		return SavingInfo.isDisplayed();
	}


//	<-------------------------  Drag and Drop  --------------------------->
	
	public void AccountExecutive_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(35)).until(ExpectedConditions.visibilityOf(SalesRep));
		new WebDriverWait(ldriver, Duration.ofSeconds(35)).until(ExpectedConditions.visibilityOf(AddField));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(SalesRep).pause(Duration.ofSeconds(0)).clickAndHold(SalesRep).pause(Duration.ofSeconds(0))
		.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();

	}
	
//  <-----------------Select "Automated Process" as a Input and Click on Account Executive Mapping------------------>
	
//	
//	
	  public void inputRandomAccountExecutiveName(){
		  InputAE_1.sendKeys("abcdefg");
	  new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf( InputAE_1));
	  InputAE_1.clear();
	   
	  }	  
	  public void inputRandomSDR_Mapping() {
	  SDR_Mapping_1.sendKeys("hijklmn"); 
	  new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(SDR_Mapping_1));
	  SDR_Mapping_1.clear(); 
	  }
	 

	 public void ClickonInputAE_1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(InputAE_1));
		InputAE_1.click();
	}
	public void ClickOnDelete() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(btnDelete));
		btnDelete.click();
	}
	
	public void SelectonAEoption_1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(SelectAEoption_1));
		SelectAEoption_1.click();
	}

//  <--------------------- Select randomly Attributes in SDR Mapping ---------------------->	

	public void ClickSDR_Mapping_1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(InputSDR_Mapping_1));
		InputSDR_Mapping_1.click();
		
	}
	public void SelectOnSDRoption_1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(SelectSDRoption_1));
		SelectSDRoption_1.click();
	
	}
	
//  <-----------------Select "Security User" as a Input and Click on Account Executive Mapping----------------->

	public void ClickInputAE_2()  {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(InputAE_2));
		InputAE_2.click();
		

	}
	
	  public void RegSelectSDRSame() { new WebDriverWait(ldriver,
	  Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(RegressionSelectSDR)); 
	  RegressionSelectSDR.click(); 
	  }
	
	
//  <--------------------- Select randomly Attributes in SDR Mapping ---------------------->	

	
	
	public void ClickInput_SDR_Regression() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(InputSDR_Mapping_1));
		InputSDR_Mapping_1.click();

	}
	public void ClickNewSDR_Regression(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectSDRoption_1));
		SelectSDRoption_1.click();
	}
	
	public void AEmoveToSecondLine_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(AEmoveToSecondLine));
		Actions actions = new Actions(ldriver);
		int x = ElemOnMove.getLocation().x;
		int y = ElemOnMove.getLocation().y;
		actions.moveToElement(AEmoveToSecondLine).pause(Duration.ofSeconds(0)).clickAndHold(AEmoveToSecondLine)
				.pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(ElemOnMove).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}
		
	public void ClickOnApprove() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(btnApprove));
	//	btnApprove.click();
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", btnApprove);
	}

	public void ClickOnApproveSubmit() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ApproveSubmitbtn));
		//ApproveSubmitbtn.click();
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", ApproveSubmitbtn);
	}


	public void ClickOnDetail() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnDetail));
		//ClickOnDetail.click();
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", ClickOnDetail);
	}
	
	public void ClickOnEditbtn() {
	   new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(Editbtn));
	   JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", Editbtn);
	  
	}
	
	public void ClickOnInputDesc(){
	  InputDesc.clear();
	  new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(InputDesc));
      InputDesc.sendKeys("Object created  via Docker Containers By Robin!!!");
	}
	
	
	public void ClickOnSaveBtn() {
	  new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(Savebtn));
	  JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", Savebtn);
	 // Savebtn.click();
	}

	public boolean DisplayApproved() {
    	new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(Approved));
		return Approved.isDisplayed();
	}
	
	public boolean DisplayNoRandomNameFoundError() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(noRandomNameFoundError));
		return noRandomNameFoundError.isDisplayed();
	}
	
	public boolean DisplayNoNameFoundError() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(noNameFoundError));
		return noNameFoundError.isDisplayed();
	}
	public boolean sameNameError() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(sameNameError));
		return sameNameError.isDisplayed();
	}
	public boolean DisplayError() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayError));
		return DisplayError.isDisplayed();
	}
	public boolean DisplayError2() {
	new WebDriverWait(ldriver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(DisplayError2));
		return DisplayError2.isDisplayed();
	}
	
	public boolean DisplaySameAEerror() {
		try {
		new WebDriverWait(ldriver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(SameAEerror));
		return SameAEerror.isDisplayed();
		}catch(Exception e) {
			return false;
		}		
	}
	public boolean DisplayUpdatedDescMesg() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayUpdatedDescMsg));
		return DisplayUpdatedDescMsg.isDisplayed();
	}


	public void DisplayDescMsg() {
	new WebDriverWait(ldriver, Duration.ofSeconds(50)).until(ExpectedConditions.elementToBeClickable(ClickOnDetail));
		ClickOnDetail.click();

	}	
	public void ClickOnNewObject() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(NewObject));
		NewObject.click();
	}
//========================================================== SANITY X PATH ==================================================================
	
	
	//**************************************************************AEtoSDR MAPING **********************************************************
	
	@FindBy(xpath="//input[@formcontrolname='SalesRepName']") 
   	WebElement ClickOnAccountExicutiveBox;
	
	@FindBy(xpath="//input[@formcontrolname='ISRMappedName']") 
   	WebElement ClickOnSDRmappingBox;
	

	
	public void ClickOnAccountExicutiveBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnAccountExicutiveBox));
		ClickOnAccountExicutiveBox.click();
	}
	public void ClickOnSDRmappingBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickOnSDRmappingBox));
		ClickOnSDRmappingBox.click();
	}
	
	
	
	
	
	
	
	
	
	
}
