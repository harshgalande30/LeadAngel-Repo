package com.leadAngel.pageObjects;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage {
	WebDriver ldriver;
	public SignUpPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}
	
	@FindBy(xpath="//input[@formcontrolname='firstName']")
	WebElement fname;
	
	@FindBy(xpath="//input[@formcontrolname='lastName']")
	WebElement lname;
	
	@FindBy(xpath="//input[@formcontrolname='regEmail']")
	WebElement email;
	
	@FindBy(xpath="//input[@formcontrolname='businessPhone']")
	WebElement bussinessPhone;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement regButton;
	
	@FindBy(xpath="//div/p[contains(text(),'Your request for new account has been successfully received.')]")
	WebElement SuccessMsg;
	
	
	public void Inputfname() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(fname));
		fname.sendKeys("testFname");
	}
	
	public void Inputlname() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(lname));
		lname.sendKeys("testLname");	
	}
	
	public void InputPhone() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(bussinessPhone));
		bussinessPhone.sendKeys("9876543210");
	}
	public void ClickOnRegButton() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(regButton));
		regButton.click();
	}
	//====================Generate Random AlphaNumeric================
	public String randomstring() {
		String GeneratedS = RandomStringUtils.randomAlphanumeric(7);
		return GeneratedS;
	}
	public void InputEmail() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(email));
				email.sendKeys(randomstring()+"@te.com");

	}
	
	
	
	public boolean DisplaySuccessMessage() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(SuccessMsg));
		return SuccessMsg.isDisplayed();
	}
}
