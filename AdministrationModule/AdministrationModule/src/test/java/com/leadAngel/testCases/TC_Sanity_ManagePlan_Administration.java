package com.leadAngel.testCases;
import java.util.Iterator;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.leadAngel.pageObjects.AdministrationPageObjectModel;
import com.leadAngel.pageObjects.HomePage;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
public class TC_Sanity_ManagePlan_Administration extends BaseClass{
	private static final Logger Logger = LogManager.getLogger(TC_Sanity_ManagePlan_Administration.class);

	@Test(description = "Administration_ManagePlan_Section")
	@Step("Administration_ManagePlan_Section")
	@Description("Administration_ManagePlan_Section")
	public void AdministrationTest() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		HomePage hp = new HomePage(driver);
		AdministrationPageObjectModel APOM=new AdministrationPageObjectModel(driver);

		Thread.sleep(2500);
		try {
			hp.ClickOnAdministration();
			Logger.info("Clicked on Administration is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked on Administration is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnManagePlan();
			Logger.info("Click On Manage Plan is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Manage Plan is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnContactSales();
			Logger.info("Click On Contact Sales is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Contact Sales is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3500);

		String ExpectedURl="https://www.leadangel.com/contact-us";
		Set<String> WH=driver.getWindowHandles();
		Iterator<String> ITR=WH.iterator();
		String ParentId=(String)ITR.next();
		String ChildId=(String)ITR.next();
		
		driver.switchTo().window(ChildId);
		Thread.sleep(2500);
		if (driver.getCurrentUrl().equals(ExpectedURl)) {
			Logger.info("URL is Successfully Navigated is Passed");
		}
		else {
			sa.assertTrue(false);
			Logger.error("URL is not Successfully Navigated is Failed");
		}
		Thread.sleep(2500);
		driver.quit();

	}
}
