package com.leadAngel.pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountListPage {
	
	WebDriver ldriver;

	public AccountListPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	@FindBy(xpath = "//h4[text()='Account List Overview']")
	WebElement AccountListOverView;
	
	@FindBy(xpath = "(//mat-icon[@class='mat-icon notranslate mat-icon-rtl-mirror material-icons mat-ligature-font mat-icon-no-color'])[3]")
	WebElement AccountListDropDown;
	
	@FindBy(xpath="//button[text()=' Account List Attributes ']")
	WebElement AccListAttr;
	
	@FindBy(xpath="//mat-list-item[@id='Account Name$#!@#$%^8']")
	WebElement AccountName;
	
	@FindBy(xpath = "//div[@id='cdk-drop-list-0']")
	WebElement AddField;
	
	@FindBy(xpath="//select/option[text()='In']")
	WebElement AccNameIn;
	@FindBy(xpath="(//select/option[text()='In'])[2]")
	WebElement AccNameIn1;
	@FindBy(xpath="(//select/option[text()='In'])[3]")
	WebElement AccNameIn2;
	
	@FindBy(xpath="//mat-icon[text()='add_box']")
	WebElement Addbtn;
	@FindBy(xpath="(//mat-icon[text()='add_box'])[2]")
	WebElement Addbtn1;
	@FindBy(xpath="(//mat-icon[text()='add_box'])[3]")
	WebElement Addbtn2;
	
	@FindBy(xpath="(//mat-selection-list/mat-list-option)[1]")
	WebElement SelectAcc1;
	
	@FindBy(xpath="//button/span[text()='Save']")
	WebElement ClickOnSave;
	
	@FindBy(xpath = "//span[@id='autoSave' and ./text()='Saving...']")
	WebElement SavingInfo;
	
	public boolean DisplayAccountListOverView() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(AccountListOverView));
		return AccountListOverView.isDisplayed();
	}
	
	public void ClickOnAccountListDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(AccountListDropDown));
		AccountListDropDown.click();
	}
	
	public boolean DisplaySavingInfo() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(SavingInfo));
		return SavingInfo.isDisplayed();
	}
	
	public void ClickOnAccListAttr() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AccListAttr));
		AccListAttr.click();
	}
	
	public void AccountList_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(AccountName));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(AccountName).pause(Duration.ofSeconds(0)).clickAndHold(AccountName)
				.pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}
	
	public void SelectIninAccName() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AccNameIn));
		AccNameIn.click();
	}
	
	public void SelectIninAccName1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AccNameIn1));
		AccNameIn1.click();
	}
	public void SelectIninAccName2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(AccNameIn2));
		AccNameIn2.click();
	}
	
	
	public void ClickOnAddbtn() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(Addbtn));
		Addbtn.click();
	}
	public void ClickOnAddbtn1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(Addbtn1));
		Addbtn1.click();
	}
	public void ClickOnAddbtn2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(Addbtn2));
		Addbtn2.click();
	}
	public void SelectOneAcc() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(SelectAcc1));
		SelectAcc1.click();
	}
	
	public void ClickOnSavebtn() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(ClickOnSave));
		ClickOnSave.click();
	}
	
	//	Thread.sleep(4000);

}
