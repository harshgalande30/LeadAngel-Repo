package com.leadAngel.pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QueueManagementPage {

	WebDriver ldriver;

	public QueueManagementPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
}
	
	@FindBy(xpath="//li[text()= ' Queue Management ']")
	WebElement QueueManagement;
	 
	@FindBy(xpath="//mat-radio-button[@value='Y']")
	WebElement Radio;
	
	
	@FindBy(xpath="//input[contains(@class,'w-25')]")
	WebElement LeadAccrual;
	@FindBy(xpath="//mat-radio-button[@value='N']")
	WebElement RadioBtn2;
//	@FindBy(xpath="( //input[@value="N"])[1]")
//	WebElement Radio1;
	
	@FindBy(xpath="//mat-checkbox[@formcontrolname='AssignAvailableLeadUserOnly']")
	WebElement Checkbox;
	@FindBy(xpath="//mat-radio-button//span[contains(text(),'Calendar Based Availability. ')]")
	WebElement CalendarBased;
	
//	@FindBy(xpath=" ( //input[@value=\"N\"])[2]")
//	WebElement Radio2;
	
	@FindBy(xpath="(//mat-radio-button[@value='Y'])[2]")
	WebElement RadioBtn;
	
	@FindBy(xpath="//mat-checkbox[@formcontrolname='calendarSalesRepMeeting']")
	WebElement Checkboxclick;
	
	@FindBy(xpath="//select[@formcontrolname='calendarSalesRepAvailableBeforeMeeting']//option[text()='10']")
	WebElement BeforeMeeting;
	
	@FindBy(xpath="//select[@formcontrolname='calendarSalesRepAvailableAfterMeeting']//option[text()='10']")
	WebElement AfterMeeting;
	
//	@FindBy(xpath="//mat-checkbox[@formcontrolname='HoldRoutingLeadTillSalsrepAvailable']")
//	WebElement Checkbox1;
	
	
	@FindBy(xpath="(//button//span[contains(text(),'Save')])[2]")
	WebElement btnSave;
	@FindBy(xpath="(//button[@disabled='true']//span[text()='Save'])[1]")
	WebElement disabledbtnSave;
	
	
	@FindBy(xpath="(//div[contains(text(),'Success')])[2]")
	WebElement Success;	
	
	
	
	public void ClickOnQueueManagement() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(QueueManagement));
		QueueManagement.click();
	}


	public void ClickOnRadio() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(Radio));
        Radio.click();		
	}
	public void ClickOnAssignLeadsRadio() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(RadioBtn2));
		RadioBtn2.click();
	}

	public void LeadAccrual() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(LeadAccrual));
		LeadAccrual.clear();
		LeadAccrual.sendKeys("12");
		
	}
	public void LeadAccrual2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(LeadAccrual));
		LeadAccrual.clear();
		LeadAccrual.sendKeys("987654");
		
	}
	
//    public void ClickOnRadio1() {
//    Radio1.click();		
//	}
	

	public void ClickOnCheckbox() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(Checkbox));
        Checkbox.click();		
	}
	
//	public void ClickOnRadio2() {
//        Radio2.click();		
//	}
	
	public void ClickOnRadioBtn() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(RadioBtn));
        RadioBtn.click();		
	}
	public void ClickOnCheckboxck() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(Checkboxclick));
        Checkboxclick.click();		
	}
	public void CalendarBased() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(CalendarBased));
		CalendarBased.click();
	}
	
	
	public void ClickOnBeforeMeeting() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(BeforeMeeting));
        BeforeMeeting.click();		
	}
	

	public void ClickOnAfterMeeting() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(AfterMeeting));
        AfterMeeting.click();		
	}
	
//	public void ClickOnCheckbox1() {
//        Checkbox1.click();		
//	}
	
	public void ClickOnSAVE() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(btnSave));
	       btnSave.click();		
		}
	public boolean DisabledSaveBtn() {
		return disabledbtnSave.isDisplayed();
	}
	
	public Boolean DisplaySuccessMessage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(Success));
	        return Success.isDisplayed();		
		}
	
	
}
