package com.leadAngel.pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class SRandAM_Page {
	
	WebDriver ldriver;
	
	public SRandAM_Page(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//sraccountmapping[@class='ng-star-inserted']")
	WebElement SRandAM_Page;
	
	@FindBy(xpath="//span[contains(text(),' Download ')]")
	WebElement btnDownload;
	
	@FindBy(xpath="/html/body/app-root/app-layout/div/as-split/as-split-area[2]/sraccountmapping/mat-toolbar/app-download-csv/div")
	WebElement excelFileSave;
	
	
	public void ShowSRandAM_Page() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(SRandAM_Page));
		SRandAM_Page.click();
		
	}
		
		public void ClickonDownload() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(btnDownload));
			btnDownload.click();
			
	}
	
		public void ExcelFileSave() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(excelFileSave));
		//	OpenDesktop.click();
			
	}
	
		
}
