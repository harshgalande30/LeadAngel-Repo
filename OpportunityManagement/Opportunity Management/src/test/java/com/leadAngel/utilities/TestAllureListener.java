package com.leadAngel.utilities;

//package com.leadAngel.utilities;

import io.qameta.allure.Attachment;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.leadAngel.testCases.BaseClass;
import com.relevantcodes.extentreports.ExtentTest;

import io.qameta.allure.Allure;

public class TestAllureListener extends BaseClass implements ITestListener {

	private static String getTestMethodName(ITestResult iTestResult) {
		return iTestResult.getMethod().getConstructorOrMethod().getName();
	}

	// Text attachments for Allure
	@Attachment(value = "Page screenshot", type = "image/png")
	public byte[] saveScreenshotPNG(WebDriver driver) {
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	}

	// Text attachments for Allure
	@Attachment(value = "{0}", type = "text/plain")
	public static String saveTextLog(String message) {
		return message;
	}

	// HTML attachments for Allure
	@Attachment(value = "{0}", type = "text/html")
	public static String attachHtml(String html) {
		return html;
	}

	@Override
	public void onStart(ITestContext iTestContext) {
		System.out.println("I am in onStart method " + iTestContext.getName());
		// iTestContext.setAttribute("WebDriver", BaseClass.driver();
	}

	@Override
	public void onFinish(ITestContext iTestContext) {
		System.out.println("I am in onFinish method " + iTestContext.getName());
	}

	@Override
	public void onTestStart(ITestResult iTestResult) {
		System.out.println("I am in onTestStart method " + getTestMethodName(iTestResult) + " start");
	}

	@Override
	public void onTestSuccess(ITestResult iTestResult) {
		System.out.println("I am in onTestSuccess method " + getTestMethodName(iTestResult) + " succeed");
	}

	@Override
	public void onTestFailure(ITestResult iTestResult) {
		System.out.println("I am in onTestFailure method " + getTestMethodName(iTestResult) + " failed");
		Object testClass = iTestResult.getInstance();
		WebDriver driver = BaseClass.driver;
		// Allure ScreenShotRobot and SaveTestLog
		if (driver instanceof WebDriver) {
			System.out.println("Screenshot captured for test case:" + getTestMethodName(iTestResult));
			saveScreenshotPNG(driver);
		}
	//	ExtentTest.addScreenCaptureFromPath(takeScreenshot(testName,driver),testName);

		Allure.addAttachment(getTestMethodName(iTestResult),
				new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
		// Save a log on allure.
		saveTextLog(getTestMethodName(iTestResult) + " failed and screenshot taken!");
	}
	
	

	@Override
	public void onTestSkipped(ITestResult iTestResult) {
		System.out.println("I am in onTestSkipped method " + getTestMethodName(iTestResult) + " skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
		System.out.println("Test failed but it is in defined success ratio " + getTestMethodName(iTestResult));
	}

}

//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//
//
//import com.leadAngel.testCases.BaseClass;
//
//import io.qameta.allure.Attachment;
//
//public class TestAllureListener extends BaseClass implements ITestListener {
//	
//
//	private static String getTestMethodName(ITestResult iTestResult) {
//		return iTestResult.getMethod().getConstructorOrMethod().getName();
//	}
//
//	// Text attachments for Allure
//	@Attachment(value = "Page Screenshot", type = "image/png")
//	public byte[] saveScreenshotPNG(WebDriver driver) {
//		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//	}
//
//	@Attachment(value = "{0}", type="text/plain")
//	public static String saveTextLog (String message) {
//		return message;
//	}
//	@Override
//	public void onTestFailure(ITestResult iTestResult) {
//		System.out.println("onTestFailure Method" + getTestMethodName(iTestResult)+ "failed");
//		Object testClass = iTestResult.getInstance();
//		WebDriver driver = BaseClass.driver;
//		
//		if(driver instanceof WebDriver) {
//			System.out.println("Screenshot capture for test case:" + getTestMethodName(iTestResult));
//			saveScreenshotPNG(driver);
//		}
//		saveTextLog(getTestMethodName(iTestResult) + "Failed! and Screenshot Taken!!");
//		
//	}
//}
