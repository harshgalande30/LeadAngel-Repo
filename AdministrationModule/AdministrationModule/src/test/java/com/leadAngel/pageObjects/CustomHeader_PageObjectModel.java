package com.leadAngel.pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomHeader_PageObjectModel {

	
	  WebDriver ldriver;

	public CustomHeader_PageObjectModel(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
}
	
	//******************************************************** DND Process ************************************************
	
		@FindBy(xpath = "//button[@aria-label='toggle Custom Header']")
		WebElement CustomHeaderDropDown;
	
		@FindBy(xpath = "//span[text()='Custom Header ']")
		WebElement CustomHeader;
		
		@FindBy(xpath = "//mat-list-item[@mattooltipclass='custom-tooltip-style']")
		WebElement CustomHeader_DND;
		
		@FindBy(xpath = "//div[@cdkdragboundary='.example-boundary']")
		WebElement AddFeild;
		
		@FindBy(xpath = "(//input[@placeholder='Enter Header Name'])[1]")
		WebElement EnterHeaderName1;
		@FindBy(xpath = "(//input[@placeholder='Enter Header Value'])[1]")
		WebElement EnterHeaderValue1;
		
		@FindBy(xpath = "(//input[@placeholder='Enter Header Name'])[2]")
		WebElement EnterHeaderName2;
		@FindBy(xpath = "(//input[@placeholder='Enter Header Value'])[2]")
		WebElement EnterHeaderValue2;
		
		@FindBy(xpath = "(//input[@placeholder='Enter Header Name'])[3]")
		WebElement EnterHeaderName3;
		@FindBy(xpath = "(//input[@placeholder='Enter Header Value'])[3]")
		WebElement EnterHeaderValue3;
		
		@FindBy(xpath = "//h4[text()='Custom Header Overview']")
		WebElement DisplayCustomHeaderOverview;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		public boolean DisplayCustomHeaderOverview() {
			new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.visibilityOf(DisplayCustomHeaderOverview));
			 return    DisplayCustomHeaderOverview.isDisplayed();
		}
		
		 public void CustomHeaderDropDown() {
				new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(CustomHeaderDropDown));
				CustomHeaderDropDown.click();
			}
	
		 public void ContextClickOnCustomHeader() {
				new WebDriverWait(ldriver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(CustomHeader));
				Actions actions = new Actions(ldriver);
				actions.moveToElement(CustomHeader).contextClick(CustomHeader).build().perform();
			}
		 
		 public void ClickAgainCustomHeader() {
				new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(CustomHeader));
				CustomHeader.click();
			}
		
		public void CustomHeader_DND() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(CustomHeader_DND));
			Actions actions = new Actions(ldriver);
			int x = AddFeild.getLocation().x;
			int y = AddFeild.getLocation().y;
			actions.moveToElement(CustomHeader_DND).pause(Duration.ofSeconds(0)).clickAndHold(CustomHeader_DND)
					.pause(Duration.ofSeconds(0))
					// .moveByOffset(x, y)
					.moveToElement(AddFeild).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
		}
		public void EnterHeaderName1(){
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterHeaderName1));
			EnterHeaderName1.clear();
			EnterHeaderName1.sendKeys("AutoTestObject1");
		}
		public void EnterHeaderValue1(){
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterHeaderValue1));
			EnterHeaderValue1.clear();
			EnterHeaderValue1.sendKeys("462");
		}
		public void EnterHeaderName2(){
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterHeaderName2));
			EnterHeaderName2.clear();
			EnterHeaderName2.sendKeys("AutoTestObject2");
		}
		public void EnterHeaderValue2(){
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterHeaderValue2));
			EnterHeaderValue2.clear();
			EnterHeaderValue2.sendKeys("648");
		}
		public void EnterHeaderName3(){
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterHeaderName3));
			EnterHeaderName3.clear();
			EnterHeaderName3.sendKeys("AutoTestObject3");
		}
		public void EnterHeaderValue3(){
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(EnterHeaderValue3));
			EnterHeaderValue3.clear();
			EnterHeaderValue3.sendKeys("864");
		}
		
}
