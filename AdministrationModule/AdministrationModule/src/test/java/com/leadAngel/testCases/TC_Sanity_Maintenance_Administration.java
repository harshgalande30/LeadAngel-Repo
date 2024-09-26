package com.leadAngel.testCases;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.leadAngel.pageObjects.AdministrationPageObjectModel;
import com.leadAngel.pageObjects.HomePage;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
public class TC_Sanity_Maintenance_Administration extends BaseClass{
	private static final Logger Logger = LogManager.getLogger(TC_Sanity_Maintenance_Administration.class);

	@Test(description = "Administration_Maintenance_Section")
	@Step("Administration_Maintenance_Section")
	@Description("Administration_Maintenance_Section")
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
			APOM.ClickOnMaintenance();
			Logger.info("Click On Maintenance is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Maintenance is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnRefreshLabelsButton();
			Logger.info("Click On Refresh Labels Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Refresh Labels Button is Failed",e);
			sa.assertAll();
		}

		Thread.sleep(800);
		try {
			if (APOM.DisplayedSuccessMessageForMaintenance()==true) {
				Logger.info("Displayed Success Message For Maintenance is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Success Message For Maintenance is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
	}
}
