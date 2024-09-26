package com.leadAngel.pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InActiveOwnertoSalesRepPage {

	WebDriver ldriver;

	public InActiveOwnertoSalesRepPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}
	
	@FindBy(xpath="//input[@formcontrolname='SalesRepName']")
	WebElement SalesRep;
	
	@FindBy(xpath="(//div/mat-option)[1]")
	WebElement SalesRep1;
	
	@FindBy(xpath="//input[@formcontrolname='ISRMappedName']")
	WebElement ActiveUser;
	
	@FindBy(xpath="(//input[@formcontrolname='ISRMappedName'])[2]")
	WebElement ActiveUser2;
	
	@FindBy(xpath="(//input[@formcontrolname='ISRMappedName'])[3]")
	WebElement ActiveUser3;
	
	@FindBy(xpath="(//input[@formcontrolname='SalesRepName'])[2]")
	WebElement SalesRep2;
	
	@FindBy(xpath="(//div/mat-option)[2]")
	WebElement SalesRep3;
	
	@FindBy(xpath="(//input[@formcontrolname='SalesRepName'])[3]")
	WebElement SalesRep4;
	
	@FindBy(xpath="(//div/mat-option)[3]")
	WebElement SalesRep5;
	
//	@FindBy(xpath="//div[@role='listbox']//mat-option//span[text()]")
//	WebElement DropDpwnValue;
//	
//	
//	public void ClickOnDropDpwnValue() {
//		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DropDpwnValue));
//		DropDpwnValue.click();
//	}
	
	@FindBy(xpath = "//button[@aria-label='toggle Inactive Owner to Sales Rep Mapping']")
	WebElement InActiveLeadManagementDropDown;
	
	@FindBy(xpath = "//h4[text()='Inactive Owner to Sales Rep Mapping Overview']")
	WebElement InactiveOwnerToSalesRepMappingOverview;
	
	public void clickOnInActiveLeadManagementDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(InActiveLeadManagementDropDown));
		InActiveLeadManagementDropDown.click();
	}
	
	public boolean DisplayInactiveOwnerToSalesRepMappingOverview() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(InactiveOwnerToSalesRepMappingOverview));
		return InactiveOwnerToSalesRepMappingOverview.isDisplayed();
	}
	
	public void ClickOnSalesRep() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(SalesRep));
		SalesRep.click();
	}
	public void EditSalesRep() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(SalesRep));
		SalesRep.clear();
		SalesRep.click();
		SalesRep.clear();
		
	}
	
	public void ClickOnSalesRep1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(SalesRep1));
		SalesRep1.click();
	//	SalesRep1.clear();
	}
	public void ClickOnActiveUserClear() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ActiveUser));
		ActiveUser.clear();
	}	
	public void ClickOnActiveUser2Clear() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ActiveUser2));
		ActiveUser2.clear();
	}	
	public void ClickOnActiveUser() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ActiveUser));
		ActiveUser.click();
	}
	public void ClickOnSalesRep2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(SalesRep2));
		SalesRep2.click();
	}
	public void ClickOnSalesRep3() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(SalesRep3));	
		SalesRep3.click();
	
	}
	public void ClickOnSalesRep4() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(SalesRep4));
		SalesRep4.click();
	}
	public void ClickOnActiveUser2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ActiveUser2));
		ActiveUser2.click();
	}
	public void ClickOnSalesRep5() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(SalesRep5));		
		SalesRep5.click();
	}
	public void ClickOnActiveUser3() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ActiveUser3));
		ActiveUser3.click();
	}
	
	
	//*************************************** Sanity Test cases X path *********************************************		
	
	@FindBy(xpath = "//label[text()='Inactive User']//..//span[@class='ng-arrow-wrapper']")
	WebElement ClickDropdownInactiveUserBox;
	
	@FindBy(xpath="//label[text()='Active User']//..//span[@class='ng-arrow-wrapper']") 
   	WebElement ClickDropdownActiveUserBox;
	
	public void ClickDropdownInactiveUserBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickDropdownInactiveUserBox));
		ClickDropdownInactiveUserBox.click();
	}
	
	public void ClickDropdownActiveUserBox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ClickDropdownActiveUserBox));
		ClickDropdownActiveUserBox.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
