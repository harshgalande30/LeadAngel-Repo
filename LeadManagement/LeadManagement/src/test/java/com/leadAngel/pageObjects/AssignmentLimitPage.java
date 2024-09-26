package com.leadAngel.pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentLimitPage {

	WebDriver ldriver;

	public AssignmentLimitPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
}
	
	@FindBy(xpath="//li[text()=' Assignment Limit ']")
	WebElement AssignmentLimit;
	
	
	
	@FindBy(xpath="(//input[@class=\"form-control error ng-pristine ng-valid ng-touched\"])[1]")
	WebElement InputText;
	
	@FindBy(xpath="(//input[@class=\"form-control error ng-pristine ng-valid ng-touched\"])[2]")
	WebElement LeadsEveryInput;
	
	@FindBy(xpath="//span[text()=' Hour(s) ']")
    WebElement LeadsEveryInHours;
	
	@FindBy(xpath="//span[text()=' Day(s) ']")
    WebElement LeadsEveryInDays;
	
	@FindBy(xpath="//button//span[contains(text(), ' Add ')]")
	WebElement Addbtn;
	@FindBy(xpath="(//button//span[contains(text(),'Save')])[2]")
	WebElement saveBtn;
	@FindBy(xpath="(//div[contains(text(),'Updated successfully')])[2]")
	WebElement SuccessMessage;
	@FindBy(xpath="(//input[@maxlength='6'])[1]")
	WebElement inputBox1;
	
	
	@FindBy(xpath="(//input[@maxlength='2'])[1]")
	WebElement leadsEvery1;
	@FindBy(xpath="(//mat-select)[1]")
	WebElement select1;
	
	@FindBy(xpath="(//input[@maxlength='6'])[2]")
	WebElement inputBox2;
	
	@FindBy(xpath="(//input[@maxlength='2'])[2]")
	WebElement leadsEvery2;
	@FindBy(xpath="(//mat-select)[2]")
	WebElement select2;
	
	@FindBy(xpath="(//input[@maxlength='6'])[3]")
	WebElement inputBox3;
	
	@FindBy(xpath="(//input[@maxlength='2'])[3]")
	WebElement leadsEvery3;
	@FindBy(xpath="(//mat-select)[3]")
	WebElement select3;
	
	@FindBy(xpath="(//input[@maxlength='6'])[4]")
	WebElement inputBox4;
	
	@FindBy(xpath="(//input[@maxlength='2'])[4]")
	WebElement leadsEvery4;
	@FindBy(xpath="(//mat-select)[4]")
	WebElement select4;
	
	
	
	public void ClickOnAddBtn() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(Addbtn));
		Addbtn.click();
	}
	public void ClickOnSaveBtn() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
	}
	public void InputOnBox1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(inputBox1));
		inputBox1.clear();
		inputBox1.sendKeys("20");
	}
	public void InputLeads1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(leadsEvery1));
		leadsEvery1.clear();
		leadsEvery1.sendKeys("3");
	}
	public void InputLeadsMorethantheLimit() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(leadsEvery1));
		leadsEvery1.clear();
		leadsEvery1.sendKeys("24");
	}
	public void InputLeadsMorethantheLimit1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(leadsEvery1));
		leadsEvery1.clear();
		leadsEvery1.sendKeys("31");
	}
	public void ClickOnSelectOption1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(select1));
		select1.click();
	}
	public void InputOnBox2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(inputBox2));
		inputBox2.clear();
		inputBox2.sendKeys("20");
	}
	public void InputLeads2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(leadsEvery2));
		leadsEvery2.clear();
		leadsEvery2.sendKeys("19");
	}
	public void ClickOnSelectOption2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(select2));
		select2.click();
	}
	public void InputOnBox3() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(inputBox3));
		inputBox3.clear();
		inputBox3.sendKeys("20");
	}
	public void InputLeads3() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(leadsEvery3));
		leadsEvery3.clear();
		leadsEvery3.sendKeys("19");
	}
	public void ClickOnSelectOption3() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(select3));
		select3.click();
	}
	public void InputOnBox4() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(inputBox4));
		inputBox4.clear();
		inputBox4.sendKeys("20");
	}
	public void InputLeads4() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(leadsEvery4));
		leadsEvery4.clear();
		leadsEvery4.sendKeys("19");
	}
	public void ClickOnSelectOption4() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(select4));
		select4.click();
	}

	
	public void ClickOnAssignmentLimit() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(AssignmentLimit));
		AssignmentLimit.click();
	}
	
	
	
	public void InputTextArea() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(InputText));
		InputText.sendKeys("98764");
		
	}
	
	public void LeadsEveryInput() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(LeadsEveryInput));
		LeadsEveryInput.sendKeys("21");
		
	}
	
	public void ClickOnLeadsEveryInHours() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(LeadsEveryInHours));
		LeadsEveryInHours.click();		
	}
	
	public void ClickOnLeadsEveryInDays() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(LeadsEveryInDays));
		LeadsEveryInDays.click();		
	}
	
	public boolean DisplaySuccessMessage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(SuccessMessage));
		return SuccessMessage.isDisplayed();
	}
	public void ProgressSpinnerCenter() {
		  new WebDriverWait(ldriver, Duration.ofSeconds(70)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//mat-progress-spinner[@role=\"progressbar\"]")));
		}
	
}
