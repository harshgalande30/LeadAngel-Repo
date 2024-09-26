package com.leadAngel.testCases;
import java.util.List;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.leadAngel.pageObjects.HomePage;
import com.leadAngel.pageObjects.LeadManagementPage;
import com.leadAngel.pageObjects.LeadRouterPageObjectModel;
@Test
public class TC_Sanity_ReassignmentSchedule_LeadManagement extends BaseClass{
	private final static Logger Logger = org.apache.logging.log4j.LogManager.getLogger(TC_Sanity_ReassignmentSchedule_LeadManagement.class);	

	public void LeadManagementTest() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		HomePage hp = new HomePage(driver);
		LeadRouterPageObjectModel LR=new LeadRouterPageObjectModel(driver);
		LeadManagementPage LMP = new LeadManagementPage(driver);


		Thread.sleep(2500);
		try {
			hp.ClickOnLeadManagement();
			Logger.info("Click on Lead Management is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Lead Management is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			LMP.InActiveLeadOwnerManagement();
			Logger.info("Click on InActive Lead Owner Management is Passed");
		}catch(Exception e) {
			Logger.error("Click on InActive Lead Owner Management is FAILED!", e);
			sa.assertTrue(false);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			LR.ClickOnReassignmentSchedule();
			Logger.info("Click On ReassignmentSchedule is Passed");
		}catch(Exception e) {
			Logger.error("Click On ReassignmentSchedule is FAILED!", e);
			sa.assertTrue(false);
			sa.assertAll();
		}
		Logger.info("================================ Reset Operation ===============================");
		Thread.sleep(1500);
		try {
			LR.ClickOnResetButton();
			Logger.info("Click On Reset Button is Passed");
		}catch(Exception e) {
			Logger.error("Click On Reset Button is FAILED!", e);
			sa.assertTrue(false);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			if (LR.DisplayedSuccessMessageOnceClickResetButton()==true) {
				Logger.info("Displayed Reset Success Message is Passed");
			}
		}catch(Exception e) {
			Logger.error("Displayed Reset Success Message is FAILED!", e);
			sa.assertTrue(false);
			sa.assertAll();
		}

		Logger.info("================================ Operate All Radio Buttons ===============================");
		Thread.sleep(1500);
		try {
			LR.ClickOnRerouteLeadsWithActiveRouter();
			Logger.info("Click On RerouteLeadsWithActiveRouter is Passed");
		}catch(Exception e) {
			Logger.error("Click On RerouteLeadsWithActiveRouter is FAILED!", e);
			sa.assertTrue(false);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			if (LR.DisplayedRerouteLeadsWithActiveRouterRadioButtonIsChecked()==true) {
				Logger.info("Displayed RerouteLeadsWithActiveRouter Radio Button Is Checked is Passed");
			}
		}catch(Exception e) {
			Logger.error("Displayed RerouteLeadsWithActiveRouter Radio Button Is Checked is FAILED!", e);
			sa.assertTrue(false);
			sa.assertAll();
		}

		Logger.info("======================= Refresh Operation =====================");
		Thread.sleep(1500);
		try {
			LR.ClickOnRefreshButton();
			Logger.info("Click On Refresh Button is Passed");
		}catch(Exception e) {
			Logger.error("Click On Refresh Button is FAILED!",e);
			sa.assertTrue(false);
			sa.assertAll();
		}
		Thread.sleep(1000);
		try {
			if (LR.DisplayedRerouteLeadsWithActiveRouterRadioButtonIsChecked()==false) {
				Logger.info("Displayed RerouteLeadsWithActiveRouter RadioButton Is Not Checked is Passed");
			}
		}catch(Exception e) {
			Logger.error("Displayed RerouteLeadsWithActiveRouter RadioButton Is Checked is FAILED!", e);
			sa.assertTrue(false);
			sa.assertAll();
		}
		Logger.info("==============================================");

		Thread.sleep(500);
		try {
			LR.ClickOnRerouteLeadsWithActiveRouter();
			Logger.info("Click On RerouteLeadsWithActiveRouter is Passed");
		}catch(Exception e) {
			Logger.error("Click On RerouteLeadsWithActiveRouter is FAILED!", e);
			sa.assertTrue(false);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			if (LR.DisplayedRerouteLeadsWithActiveRouterRadioButtonIsChecked()==true) {
				Logger.info("Displayed RerouteLeadsWithActiveRouter Radio Button Is Checked is Passed");
			}
		}catch(Exception e) {
			Logger.error("Displayed RerouteLeadsWithActiveRouter Radio Button Is Checked is FAILED!", e);
			sa.assertTrue(false);
			sa.assertAll();
		}

		Thread.sleep(1500);
		try {
			LR.ClickOnRerouteLeadsToSalesPerson();
			Logger.info("Click On RerouteLeadsToSalesPerson is Passed");
		}catch(Exception e) {
			Logger.error("Click On RerouteLeadsToSalesPerson is FAILED!", e);
			sa.assertTrue(false);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			if (LR.DisplayedRerouteLeadsToSalesPersonRadioButtonIsChecked()==true) {
				Logger.info("Displayed RerouteLeadsToSalesPerson Radio Button Is Checked is Passed");
			}
		}catch(Exception e) {
			Logger.error("Displayed RerouteLeadsToSalesPerson Radio Button Is Checked is FAILED!", e);
			sa.assertTrue(false);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			LR.ClickOnRerouteLeadsToSalesPersonDropdown();
			Logger.info("Click On RerouteLeadsToSalesPerson Dropdown is Passed");
		}catch(Exception e) {
			Logger.error("Click On RerouteLeadsToSalesPerson Dropdown is FAILED!", e);
			sa.assertTrue(false);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			LR.SelectRerouteLeadsToSalesPersonOption();
			Logger.info("Select RerouteLeadsToSalesPerson Option is Passed");
		}catch(Exception e) {
			Logger.error("Select RerouteLeadsToSalesPerson Option is FAILED!", e);
			sa.assertTrue(false);
			sa.assertAll();
		}

		Thread.sleep(1500);
		try {
			LR.ClickOnRouteLeadsToInactiveOwnersManager();
			Logger.info("Click On RouteLeadsToInactiveOwnersManager is Passed");
		}catch(Exception e) {
			Logger.error("Click On RouteLeadsToInactiveOwnersManager is FAILED!", e);
			sa.assertTrue(false);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			if (LR.DisplayedRouteLeadsToInactiveOwnersManagerRadioButtonIsChecked()==true) {
				Logger.info("Displayed RouteLeadsToInactiveOwnersManager Radio Button Is Checked is Passed");
			}
		}catch(Exception e) {
			Logger.error("Displayed RouteLeadsToInactiveOwnersManager Radio Button Is Checked is FAILED!", e);
			sa.assertTrue(false);
			sa.assertAll();
		}

		Thread.sleep(1500);
		try {
			LR.ClickOnRerouteToNewOwnerBasedOnMapping();
			Logger.info("Click On RerouteToNewOwnerBasedOnMapping is Passed");
		}catch(Exception e) {
			Logger.error("Click On RerouteToNewOwnerBasedOnMapping is FAILED!", e);
			sa.assertTrue(false);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			if (LR.DisplayedRerouteToNewOwnerBasedOnMappingRadioButtonIsChecked()==true) {
				Logger.info("Displayed RerouteToNewOwnerBasedOnMapping Radio Button Is Checked is Passed");
			}
		}catch(Exception e) {
			Logger.error("Displayed RerouteToNewOwnerBasedOnMapping Radio Button Is Checked is FAILED!", e);
			sa.assertTrue(false);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			LR.ClickOnRerouteToNewOwnerBasedOnMappingDropdown();
			Logger.info("Click On RerouteToNewOwnerBasedOnMapping Dropdown is Passed");
		}catch(Exception e) {
			Logger.error("Click On RerouteToNewOwnerBasedOnMapping Dropdown is FAILED!", e);
			sa.assertTrue(false);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			LR.SelectRerouteLeadsToSalesPersonOption();
			Logger.info("Select RerouteToNewOwnerBasedOnMapping Option is Passed");
		}catch(Exception e) {
			Logger.error("Select RerouteToNewOwnerBasedOnMapping Option is FAILED!", e);
			sa.assertTrue(false);
			sa.assertAll();
		}


		Logger.info("================================ Interval Ascedule ===============================");
		Thread.sleep(1500);
		for (int i = 1; i < 4; i++) {
			List<WebElement> AllLinks = driver.findElements(By.xpath("//label[text()='Interval Type']//..//option"));

			WebElement getLink = AllLinks.get(i);
			String getLinkText = getLink.getText();
			Thread.sleep(1500);
			try {
				getLink.click();
				Logger.info("Select "+getLinkText+" is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select "+getLinkText+" is Failed",e);
				sa.assertAll();
			}

			if (getLinkText.contentEquals("Weekly")) {
				Thread.sleep(1500);
				try {
					LR.SelectIntervalDayAsMonday();
					Logger.info("Select Interval Day is Passed");
				}catch(Exception e) {
					Logger.error("Select Interval Day is FAILED!", e);
					sa.assertTrue(false);
					sa.assertAll();
				}
			}
			if (getLinkText.contentEquals("Monthly")) {
				Thread.sleep(1500);
				try {
					LR.SelectIntervalDate();
					Logger.info("Select Interval Date is Passed");
				}catch(Exception e) {
					Logger.error("Select Interval Date is FAILED!", e);
					sa.assertTrue(false);
					sa.assertAll();
				}
			}
			if (getLinkText.contentEquals("Daily")||getLinkText.contentEquals("Weekly")||getLinkText.contentEquals("Monthly")) {
				Thread.sleep(1500);
				try {
					LR.ClickOnIntervalTimeInputbox();
					Logger.info("Click On IntervalTime Inputbox is Passed");
				}catch(Exception e) {
					Logger.error("Click On IntervalTime Inputbox is FAILED!", e);
					sa.assertTrue(false);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					LR.SelectTimeInHour();
					Logger.info("Select Time In Hours is Passed");
				}catch(Exception e) {
					Logger.error("Select Time In Hours is FAILED!", e);
					sa.assertTrue(false);
					sa.assertAll();
				}
				Thread.sleep(1500);
				try {
					LR.ClickOnOkButton();
					Logger.info("Click On OK Button is Passed");
				}catch(Exception e) {
					Logger.error("Click On OK Button is FAILED!", e);
					sa.assertTrue(false);
					sa.assertAll();
				}	
			}	
			Thread.sleep(1500);
			try {
				LR.ClickOnStartButton();
				Logger.info("Click On Start Button is Passed");
			}catch(Exception e) {
				Logger.error("Click On Start Button is FAILED!", e);
				sa.assertTrue(false);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				if (LR.DisplayedSuccessMessageOnceClickStartButton()==true) {
					Logger.info("Displayed Success Message is Passed");
				}
			}catch(Exception e) {
				Logger.error("Displayed Success Message is FAILED!", e);
				sa.assertTrue(false);
				sa.assertAll();
			}
			Thread.sleep(1500);
			continue;
		}//for loop End
	}
}
