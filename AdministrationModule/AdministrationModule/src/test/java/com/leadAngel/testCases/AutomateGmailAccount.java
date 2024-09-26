package com.leadAngel.testCases;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class AutomateGmailAccount {
	private static final Logger Logger = LogManager.getLogger(AutomateGmailAccount.class);
	WebDriver driver;
	
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}
	
	
    @BeforeClass
	public void OpenBrowser() throws InterruptedException {
    	Thread.sleep(2500);
     	ChromeOptions options = new ChromeOptions();
     	
     	 options.addArguments("--disable-blink-features=AutomationControlled");
	        options.addArguments("--disable-infobars");
	        options.addArguments("--incognito"); // optional
	       
	        
	        
    	//options.addArguments("--remote-allow-origins=*");
//    	System.setProperty("webdriver.http.factory", "jdk-http-client");
//     driver= new ChromeDriver();
    	WebDriver driver = new ChromeDriver(options);
    	Logger.info("Chrome Browser is opened");
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
    }
	
	@AfterClass
	public void CloseBrowser() throws InterruptedException {
		Thread.sleep(3500);
		Logger.info("Chrome Browser is Pause");
		
	}
	
	@BeforeMethod
	public void GmailLogin() throws InterruptedException {
	
		 
		 
		driver.get("https://accounts.google.com");
		Logger.info("Enter Gmail URL is Passed");
		Thread.sleep(3500);
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("ganeshnaik638@gmail.com");
		Thread.sleep(3500);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(3500);
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("@Tech4Lead");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(3500);
	}
	
	
}//class Close



















