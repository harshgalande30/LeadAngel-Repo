package com.leadAngel.pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResponseMappingPageObjectModel {
	  WebDriver ldriver;

	public ResponseMappingPageObjectModel(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
}

    //******************************************************** DND Process ************************************************
	
	@FindBy(xpath = "//button[@class='parent-mat-li ng-star-inserted']")
	WebElement LeadAttributes;
	
	@FindBy(xpath = "//div[@id='cdk-drop-list-0']")
	WebElement AddField;
	
	@FindBy(xpath = "(//i[@class='righticon-STRING'])[1]")
	WebElement LeadID_DND;
	@FindBy(xpath = "(//input[@mattooltipclass='custom-tooltip-style'])[1]")
	WebElement WriteLeadID;
	
	@FindBy(xpath = "(//i[@class='righticon-BOOLEAN'])[1]")
	WebElement Deleted_DND;
	@FindBy(xpath = "(//input[@mattooltipclass='custom-tooltip-style'])[2]")
	WebElement WriteDeletedBooleanValue;
	
	@FindBy(xpath = "(//i[@class='righticon-NUMBER'])[1]")
	WebElement Latitude_DND;
	@FindBy(xpath = "(//input[@mattooltipclass='custom-tooltip-style'])[3]")
	WebElement WriteLatitudeValue;
	
	@FindBy(xpath = "(//i[@class='righticon-DATETIME'])[1]")
	WebElement ConvertedDate_DND;
	@FindBy(xpath = "(//input[@mattooltipclass='custom-tooltip-style'])[4]")
	WebElement WriteConvertedDate;

	
	
	
	
	public void ClickOnLeadAttributes(){
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(LeadAttributes));
		LeadAttributes.click();
	}

	public void LeadID_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(LeadID_DND));
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(AddField));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(LeadID_DND).pause(Duration.ofSeconds(0)).clickAndHold(LeadID_DND).pause(Duration.ofSeconds(0))
		.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}
	public void Deleted_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(Deleted_DND));
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(AddField));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(Deleted_DND).pause(Duration.ofSeconds(0)).clickAndHold(Deleted_DND).pause(Duration.ofSeconds(0))
		.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}
	public void Latitude_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(Latitude_DND));
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(AddField));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(Latitude_DND).pause(Duration.ofSeconds(0)).clickAndHold(Latitude_DND).pause(Duration.ofSeconds(0))
		.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}
	public void ConvertedDate_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(ConvertedDate_DND));
		new WebDriverWait(ldriver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(AddField));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(ConvertedDate_DND).pause(Duration.ofSeconds(0)).clickAndHold(ConvertedDate_DND).pause(Duration.ofSeconds(0))
		.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}
	
	
	public void WriteLeadID() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(WriteLeadID));
		WriteLeadID.clear();
		WriteLeadID.sendKeys("LA123");
	}
	public void WriteDeletedBooleanValue() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(WriteDeletedBooleanValue));
		WriteDeletedBooleanValue.clear();
		WriteDeletedBooleanValue.sendKeys("Yes");
	}
	public void EditWriteDeletedBooleanValue() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(WriteDeletedBooleanValue));
		WriteDeletedBooleanValue.clear();
		WriteDeletedBooleanValue.sendKeys("No");
	}
	public void WriteLatitudeValue() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(WriteLatitudeValue));
		WriteLatitudeValue.clear();
		WriteLatitudeValue.sendKeys("is empty");
	}
	public void EditWriteLatitudeValue() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(WriteLatitudeValue));
		WriteLatitudeValue.clear();
		WriteLatitudeValue.sendKeys("is not empty");
	}
	public void WriteConvertedDate() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(WriteConvertedDate));
		WriteConvertedDate.clear();
		WriteConvertedDate.sendKeys("01-JAN-2023");
	}
	public void EditWriteConvertedDate() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(WriteConvertedDate));
		WriteConvertedDate.clear();
		WriteConvertedDate.sendKeys("22-May-2022");
	}
}
