package com.leadAngel.pageObjects;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WeightedSalesTeamPage {

	WebDriver ldriver;

	public WeightedSalesTeamPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}
	
	
	@FindBy(xpath = "//h4[text()='Weighted Sales Team Overview']")
	WebElement DisplayWSToverView;
	
	
	@FindBy(xpath = "(//mat-icon[@class='mat-icon notranslate mat-icon-rtl-mirror material-icons mat-ligature-font mat-icon-no-color'])[4]")
	WebElement WSTDropdown;

	@FindBy(xpath ="//mat-list-item[contains(@id,'Sales Rep')]")                                  //(//mat-list-item[@id='Sales Rep$#!@#$%^0'])
	WebElement SalesRepWST;

	@FindBy(xpath = "//div[@id='cdk-drop-list-0']")
	WebElement AddField_WST;

	@FindBy(xpath = "(//input[@formcontrolname='SalesRepName'])[1]")
	WebElement SalesRep_1;
	
	@FindBy(xpath="(//input[@formcontrolname='SalesRepName'])[2]")
	WebElement SalesRepII;
	
	@FindBy(xpath = "(//mat-option[@role='option'])[1]")
	WebElement SalesRepSelect;

	@FindBy(xpath = "(//input[@formcontrolname='SalesWeight'])[1]")
	WebElement Weight;

	@FindBy(xpath = "(//input[@formcontrolname='SalesRepName'])[2]")
	WebElement SalesRep_2;

	@FindBy(xpath = "(//mat-option[@role='option'])[2]")
	WebElement SalesRepSelect_2;

	@FindBy(xpath = "(//input[@formcontrolname='SalesWeight'])[2]")
	WebElement Weight1;

	@FindBy(xpath = "(//input[@formcontrolname='SalesRepName'])[3]")
	WebElement SalesRep_3;

	@FindBy(xpath = "(//mat-option[@role='option'])[3]")
	WebElement SalesRepSelect_3;

	@FindBy(xpath = "(//input[@formcontrolname='SalesWeight'])[3]")
	WebElement Weight2;

	@FindBy(xpath = "(//input[@formcontrolname=\"SalesRepName\"])[4]")
	WebElement SalesRep3;

	@FindBy(xpath = "(//span[contains(text(),' Integration User ')])[1]")
	WebElement SalesRep3Select;

	@FindBy(xpath = "((//input[@formcontrolname=\"SalesWeight\"])[4]")
	WebElement Weight3;

	@FindBy(xpath = "//mat-icon[text()='done_all']/ancestor::button")
	WebElement Approvebtn;

	@FindBy(xpath = "(//span[text()=' Approve '])[2]")
	WebElement btnApprove;

	@FindBy(xpath = "//div[text()='There are errors on the canvas. Please correct the items highlighted in red below in order to proceed.']")
	WebElement ErrorMessage;

	@FindBy(xpath = "//span[text()='Expand All ']")
	WebElement btnExpandAll;

	@FindBy(xpath = "(//div[text()='Please select sales rep name first'])[2]")
	WebElement ErrorMessage2;

	/*@FindBy(xpath = " //input[@id='mat-input-10']")
	WebElement ErrorMessage3;*/
	
	@FindBy(xpath = "//div[text()='No Names Found']") 
	WebElement ErrorMessage3;

	@FindBy(xpath = "(//div[text()='Please select weightage from 1 to 999'])[2]")
	WebElement ErrorMessage4;
	
	@FindBy(xpath="(//div[text()='Name Chatter Expert is Already used in block 1'])[2]")
	WebElement ErrorMessage5;
	

	public void BrowsingIcon() {
		  new WebDriverWait(ldriver, Duration.ofSeconds(50)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[name()='circle' and contains(@class,'ng-star-in')]")));
	}
	
	public boolean isDisplayWSTOverview() {
		  new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DisplayWSToverView));
		  return DisplayWSToverView.isDisplayed();
	}
	
	 public void getWSTDropDown()
		{
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(WSTDropdown));
			WSTDropdown.click();
		}

	 public void SalesRepWST_DND() {
		 new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SalesRepWST));
		 Actions actions = new Actions(ldriver);
		 int x = AddField_WST.getLocation().x;
		 int y = AddField_WST.getLocation().y;
		 actions.moveToElement(SalesRepWST).pause(Duration.ofSeconds(0)).clickAndHold(SalesRepWST)
		 .pause(Duration.ofSeconds(0))
		 .moveToElement(AddField_WST).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build()
		 .perform();
	 }

	public void ClickInputSalesRep() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SalesRep_1));
		SalesRep_1.click();
		
	}
	

	public void InputRandomOnSalesRep() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(SalesRep_1));
		SalesRep_1.sendKeys("testData");
	}
	public void InputSalesRepII() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(SalesRepII));
		SalesRepII.sendKeys("Chatter Expert");
	}
	
	public void ClickOnSalesRepOption_1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SalesRepSelect));
		SalesRepSelect.click();

	}

	public void InputWeight() throws InterruptedException {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(Weight));
		Weight.clear();
		Thread.sleep(1500);
		  // Generate a random number as a string
	    String randomWeight = generateRandomNumberAsString();
		Weight.sendKeys(randomWeight);
	}
	//******************************** Generate Random string number ******************************
	private String generateRandomNumberAsString() {
	    // Define the range of numbers you want to generate (e.g., between 50 and 100)
	    int minWeight = 1;
	    int maxWeight = 999;

	    // Generate a random number within the specified range
	    Random random = new Random();
	    int randomWeightValue = random.nextInt(maxWeight - minWeight + 1) + minWeight;

	    // Convert the random number to a string
	    return Integer.toString(randomWeightValue);
	}
	public void ClickOnWeight() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(Weight));
		Weight.click();
	}

	public void ClickInputSalesRep1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SalesRep_2));
		SalesRep_2.click();

	}

	public void ClickOnSalesRepOption_2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SalesRepSelect_2));
		SalesRepSelect_2.click();

	}

	public void InputWeight1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(Weight1));
		Weight1.sendKeys("62");
	}
	
	public void InputWeight3() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(Weight1));
		Weight1.sendKeys("742");

	}

	public void ClickInputSalesRep_3() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SalesRep_3));
		SalesRep_3.click();

	}

	public void ClickOnSalesRepOption_3() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SalesRepSelect_3));
		SalesRepSelect_3.click();

	}

	public void InputWeight2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(Weight2));
		Weight2.sendKeys("43");

	}

	public void ClickOnApprove() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(Approvebtn));
//		Actions actions = new Actions(ldriver);
//		actions.moveToElement(Approvebtn).click().build().perform();
//		Approvebtn.click();
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", Approvebtn);

	}

	public void ClickOnApprovebtn() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(btnApprove));

		btnApprove.click();
	}

	public boolean DisplayErrorMessage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ErrorMessage));
		return ErrorMessage.isDisplayed();
	}

	public void ClickOnExpandAll() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(btnExpandAll));
		btnExpandAll.click();
	}

	public boolean DisplayErrorMessage2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ErrorMessage2));
		return ErrorMessage2.isDisplayed();
	}

	public boolean DisplayErrorMessage3() {
		try {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ErrorMessage3));
		return ErrorMessage3.isDisplayed();
		}catch(Exception e) {
			return false;
		}		
	}
		


	public boolean DisplayErrorMessage4() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ErrorMessage4));
		return ErrorMessage4.isDisplayed();
	}
	public boolean DisplayErrorMessage5() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ErrorMessage5));
		return ErrorMessage5.isDisplayed();
	}



























}


