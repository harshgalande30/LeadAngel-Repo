package com.leadAngel.pageObjects;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	public WebDriver ldriver;
	public HomePage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	@FindBy(xpath ="//img[@class='dashboard-icon-size lead-management']")         //("//img[@class=\"dashboard-icon-size lead-management\"]")
	WebElement LeadManagement;
	
	@FindBy(xpath="//mat-progress-spinner[@role=\"progressbar\"]")
	WebElement ProgressSpinner;
	
	@FindBy(xpath="//img[@class='dashboard-icon-size contactRouterNav']")
    WebElement ContactManagement;
	
	@FindBy(xpath="//img[@class='dashboard-icon-size opportunityRoutingNav']")
	WebElement OpportunityManagement;
	
	
	@FindBy(xpath="//div[text()=' Administration']")
	WebElement Administration; 
	
	
	public void ClickOnAdministration() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(Administration));	
		Administration.click();
	}
	
	
	
	public void ClickOnLeadManagement() {
	//	new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(LeadManagement));
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(LeadManagement));
		LeadManagement.click();
	}
	public void ProgressSpinner() {
	  new WebDriverWait(ldriver, Duration.ofSeconds(60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//mat-progress-spinner[@role=\"progressbar\"]")));
	}
	public void ClickOnContactManagement() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ContactManagement));	
		ContactManagement.click();
	}
	public void ClickOnOpportunityManagement() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(OpportunityManagement));	
		OpportunityManagement.click();
	}
	
	
	
}
