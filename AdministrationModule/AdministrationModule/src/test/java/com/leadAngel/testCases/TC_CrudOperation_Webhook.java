package com.leadAngel.testCases;
import java.util.List;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.leadAngel.pageObjects.AEtoSDR_Page;
import com.leadAngel.pageObjects.AccountListPage;
import com.leadAngel.pageObjects.AdministrationPageObjectModel;
import com.leadAngel.pageObjects.CRM_Account_FilterPage;
import com.leadAngel.pageObjects.DetailsPage_SalesTeam;
import com.leadAngel.pageObjects.EmailAlertsTemplatesPageObjectModel;
import com.leadAngel.pageObjects.HomePage;
import com.leadAngel.pageObjects.LeadManagementPage;
import com.leadAngel.pageObjects.LeadRouterPageObjectModel;
import com.leadAngel.pageObjects.LoginPage;
import com.leadAngel.pageObjects.OTS_Router_PageObjectModel;
import com.leadAngel.pageObjects.ResponseMappingPageObjectModel;
import com.leadAngel.pageObjects.RoundRobinPage;
import com.leadAngel.pageObjects.WebhookPageObjectModel;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
@Listeners({ com.leadAngel.utilities.TestAllureListener.class })
public class TC_CrudOperation_Webhook extends BaseClass{
	private static final Logger Logger = LogManager.getLogger(TC_CrudOperation_Webhook.class);

	@Test(description = "Administration_Webhook _Section")
	@Step("Administration_Webhook_Section")
	@Description("Administration_Webhook_Section")
	public void AdministrationTest() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		HomePage hp = new HomePage(driver);
		LeadManagementPage LMP = new LeadManagementPage(driver);
		AdministrationPageObjectModel APOM=new AdministrationPageObjectModel(driver);
		EmailAlertsTemplatesPageObjectModel EATP=new EmailAlertsTemplatesPageObjectModel(driver);
		CRM_Account_FilterPage crm = new CRM_Account_FilterPage(driver);
		AEtoSDR_Page ae = new AEtoSDR_Page(driver);
		LeadRouterPageObjectModel LR=new LeadRouterPageObjectModel(driver);
		RoundRobinPage rrp = new RoundRobinPage(driver);
		DetailsPage_SalesTeam dp=new DetailsPage_SalesTeam(driver);
		WebhookPageObjectModel WPOM=new WebhookPageObjectModel(driver);
		AccountListPage ALP = new AccountListPage(driver);
		ResponseMappingPageObjectModel RM=new ResponseMappingPageObjectModel(driver);
		OTS_Router_PageObjectModel OTS=new OTS_Router_PageObjectModel(driver);

		Thread.sleep(3500);
		try {
			hp.ClickOnAdministration();
			Logger.info("Click on Administration is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Administration is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnIntegrationsDropDown();
			Logger.info("Click On Integrations DropDown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Integrations DropDown is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnWebhookIntegrationDropDown();
			Logger.info("Click On Webhook Integration DropDown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Webhook Integration DropDown is Failed",e);
			sa.assertAll();
		}
		Logger.info("//===============================CREATE OBJECT SCENARIO START========================================!");
		Thread.sleep(4500);
		try {
			APOM.RightClickonWebhookDropDown();
			Logger.info("Right Click on Webhook is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click on Webhook is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnNewObject();
			Logger.info("Click On NewObject is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On NewObject is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.EnterNameInCrudObject();
			Logger.info("Enter AutoTestObject name is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter AutoTestObject name is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.SelectRouterTypeOption();
			Logger.info("Select Router Type Option is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Router Type Option is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnSaveButtonCrudObject();
			Logger.info("Click On Save Button is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button is FAILED!!!",e);
			sa.assertAll();
		}

		Thread.sleep(800);
		if(ae.DisplaySameAEerror() == true) {
			Logger.info("Duplicate Object Found, Try to delete the Object NOW!!! then Creating New Object!!");
			Thread.sleep(4000);
			try {
				APOM.ClickOnWebhookDropdown();
				Logger.info("Click on Webhook Dropdown is passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on Webhook Dropdown is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(3500);
			try {
				APOM.RightClickOnAutoTestObject();           
				Logger.info("RightClick On LeadAutoTestObject is PASSED!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("RightClick On LeadAutoTestObject is Failed!!", e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				LMP.ClickOnDeleteOnClonedAutoTestObject();
				Logger.info("Click On Delete button is Passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Delete button is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(3200);
			try {
				LMP.ClickOnDeletebtn();
				Logger.info("Click Again Delete button is Passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click Again Delete button is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(400);
			try {
				if (APOM.DisplayedCannotDeleteErrorSuccessMessage() == true) 
				{
					Logger.info("Displayed 'Cannot Delete' Error Message");
					Thread.sleep(4500);
					try {
						APOM.RightClickOnAutoTestObject();           
						Logger.info("RightClick On LeadAutoTestObject is PASSED!!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("RightClick On LeadAutoTestObject is Failed!!", e);
						sa.assertAll();
					}
					Thread.sleep(2500);
					try {
						rrp.ClickOnObjectRename();
						Logger.info("Click on Rename Object is PASSED!!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Click on Rename Object is FAILED!!!", e);
						sa.assertAll();
					}
					Thread.sleep(2500);
					try {
						String randomString = APOM.generateRandomString(APOM.length);
						APOM.InputRename_AutoTestObject.clear();
						APOM.InputRename_AutoTestObject.sendKeys(randomString);
						Logger.info("Enter Rename is Passed!!!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Enter Rename is FAILED!", e);
						sa.assertAll();
					}
					Thread.sleep(2500);
					try {
						rrp.ClickOnRenameBtn();
						Logger.info("Click Rename Button is PASSED!!!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Click Rename Button is FAILED!!!", e);
						sa.assertAll();
					}	
				}
			} catch (Exception e) {
				sa.assertTrue(true);
			}
			Thread.sleep(5500);
			try {
				APOM.RightClickonWebhookDropDown();
				Logger.info("Right Click on Webhook DropDown is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Right Click on Webhook DropDown is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(3500);
			try {
				LMP.ClickOnNewObject();
				Logger.info("Click on New Webhook is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on New Webhook is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(3500);
			try {
				LMP.NameInCrudObject();
				Logger.info("Enter AutoTestObject Name is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter AutoTestObject Name is FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(3500);
			try {
				APOM.SelectRouterTypeOption();
				Logger.info("Select Router Type is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Select Router Type is FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				LMP.clickOnSaveNewObject();
				Logger.info("Click on Save Button is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on Save Button is FAILED!!", e);
				sa.assertAll();
			}
		}
		else {
			sa.assertTrue(true);
		}	

		driver.navigate().refresh();
		Logger.info("Refreshing The Page!!");
		Thread.sleep(5000);
		try {
			Thread.sleep(2500);
			if( APOM.DisplayWebhookOverview()==true) {
				Logger.info("Display Webhook Overview is passed");
				Thread.sleep(3000);
				try {
					APOM.ClickOnWebhookDropdown();
					Logger.info("Click on Webhook Dropdown is passed");
				}catch(Exception e) {
					sa.assertTrue(false);
					Logger.error("Click on Webhook Dropdown is FAILED!!", e);
					sa.assertAll();
				}
				Thread.sleep(3000);
				try {
					APOM.ClickOnAutoTestObject();           
					Logger.info("Click On LeadAutoTestObject is PASSED!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On LeadAutoTestObject is FAILED!", e);
					sa.assertAll();
				}
			}
		} catch (Exception e) {
			sa.assertTrue(true);
		}

		Logger.info("=============================================URL Operation=============================================!");
		Thread.sleep(5600);
		try {
			WPOM.EnterURLinsideURLtextarea();
			Logger.info("Enter text in URL textarea is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter text in URL textarea is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			WPOM.ClickOnInsertTokenButton();
			Logger.info("Click On Insert Token Button For URL is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Insert Token Button For URL is FAILED!!!",e);
			sa.assertAll();
		}

		List<WebElement> AllLinksOfOptionn= driver.findElements(By.xpath("//label[text()='Select Object']//..//select//option"));
		int CountAllLinks =AllLinksOfOptionn.size();
		for (int i = 0; i < CountAllLinks;i++) {

			if (i!=0) {
				Thread.sleep(3000);
				try {
					WPOM.ClickOnInsertTokenButton();
					Logger.info("Click On Insert Token Button For URL is PASSED!!");
				}catch(Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Insert Token Button For URL is FAILED!!!",e);
					sa.assertAll();
				}
			}
			List<WebElement> AllLinksOfOption= driver.findElements(By.xpath("//label[text()='Select Object']//..//select//option"));
			WebElement getLinksOfOption = AllLinksOfOption.get(i);
			String getLinkTextOption = getLinksOfOption.getText();
			Thread.sleep(3500);
			try {
				getLinksOfOption.click();
				Logger.info("Select "+getLinkTextOption+" is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select "+getLinkTextOption+" is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				LR.InsertValueSelectFieldDropDownForURL();
				Logger.info("Click On Insert Token Select Field DropDown is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Insert Token Select Field DropDown is FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				LR.ClickOnInsertValueSelectFieldOptionUpdateDataValue();
				Logger.info("Click On Insert Token Select Field Option is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Insert Token Select Field Option is FAILED!!!",e);
				sa.assertAll();
			}

			Thread.sleep(2500);
			try {
				WPOM.ClickOnSaveButtonForInsertToken();
				Logger.info("Click On Save Button For Insert Token is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Save Button For Insert Token is FAILED!!!",e);
				sa.assertAll();
			}

		}//for
		Thread.sleep(500);
		try {
			if (WPOM.DisplayedURLTexareaDoesHaveAvalue()==true) {
				Logger.info(WPOM.DisplayedURLTexareaDoesHaveAvalue());
				Logger.info("Displayed URL Texarea Does Have a value");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed URL Texarea Does not Have a value",e);
			sa.assertAll();
		}


		Logger.info("======================================Request Type  Operation==============================================!");
		Thread.sleep(2500);
		try {
			WPOM.selectOptionInRequestType();
			Logger.info("select Option In RequestType is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("select Option In RequestType is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(500);
		try {
			if (WPOM.DisplayedRequestTypeSelectBoxDoesHaveAvalue()==true) {
				Logger.info(WPOM.DisplayedRequestTypeSelectBoxDoesHaveAvalue());
				Logger.info("Displayed RequestType SelectBox Does Have a value");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed RequestType SelectBox Does not Have a value",e);
			sa.assertAll();
		}

		Logger.info("===============================Payload Template  Operation========================================!");
		Thread.sleep(2500);
		try {
			WPOM.WriteInsidepayloadTemplatetesxarea();
			Logger.info("Enter Text in payloadTemplate textarea is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Text in payloadTemplate textarea is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			WPOM.ClickOnInsertTokenButton2();
			Logger.info("Click On Insert Token Button For Payload Template is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Insert Token Button For Payload Template is FAILED!!!",e);
			sa.assertAll();
		}
		List<WebElement> AllLinksOfOptionnn= driver.findElements(By.xpath("//label[text()='Select Object']//..//select//option"));
		int CountAllLinks1 =AllLinksOfOptionnn.size();
		for (int i = 0; i < CountAllLinks1;i++) {

			if (i!=0) {
				Thread.sleep(3000);
				try {
					WPOM.ClickOnInsertTokenButton2();
					Logger.info("Click On Insert Token Button For Payload Template is PASSED!!");
				}catch(Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Insert Token Button For Payload Template is FAILED!!!",e);
					sa.assertAll();
				}

			}
			List<WebElement> AllLinksOfOption1= driver.findElements(By.xpath("//label[text()='Select Object']//..//select//option"));
			WebElement getLinksOfOption1 = AllLinksOfOption1.get(i);
			String getLinkTextOption1 = getLinksOfOption1.getText();
			Thread.sleep(3500);
			try {
				getLinksOfOption1.click();
				Logger.info("Select "+getLinkTextOption1+" is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Select "+getLinkTextOption1+" is Failed",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				LR.InsertValueSelectFieldDropDownForURL();
				Logger.info("Click On Insert Token Select Field DropDown is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Insert Token Select Field DropDown is FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				LR.ClickOnInsertValueSelectFieldOptionUpdateDataValue();
				Logger.info("Click On Insert Token Select Field Option is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Insert Token Select Field Option is FAILED!!!",e);
				sa.assertAll();
			}

			Thread.sleep(2500);
			try {
				WPOM.ClickOnSaveButtonForInsertToken();
				Logger.info("Click On Save Button For Insert Token is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Save Button For Insert Token is FAILED!!!",e);
				sa.assertAll();
			}

		}//for
		Thread.sleep(500);
		try {
			if (WPOM.DisplayedPayloadTemplateTextAreaDoesHaveAvalue()==true) {
				Logger.info(WPOM.DisplayedPayloadTemplateTextAreaDoesHaveAvalue());
				Logger.info("Displayed PayloadTemplate TextArea Does Have a value");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed PayloadTemplate TextArea Does not Have a value",e);
			sa.assertAll();
		}

		Logger.info("=============================== Request Token Encoding  Operation========================================!");
		Thread.sleep(2500);
		try {
			WPOM.selectOptionfromRequestTokenEncoding();
			Logger.info("select Option from Request TokenEncoding is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("select Option from Request TokenEncoding is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(500);
		try {
			if (WPOM.DisplayedRequestTokenEncodingSelectBoxDoesHaveAvalue()==true) {
				Logger.info(WPOM.DisplayedRequestTokenEncodingSelectBoxDoesHaveAvalue());
				Logger.info("Displayed RequestTokenEncoding SelectBox Does Have a value");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed RequestTokenEncoding SelectBox Does not Have a value",e);
			sa.assertAll();
		}

		Logger.info("=============================== Response Type  Operation========================================!");
		Thread.sleep(2500);
		try {
			WPOM.selectOptionfromResponseType();
			Logger.info("select Option from Response Type is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("select Option from Response Type is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(500);
		try {
			if (WPOM.DisplayedResponseTypeSelectBoxDoesHaveAvalue()==true) {
				Logger.info(WPOM.DisplayedResponseTypeSelectBoxDoesHaveAvalue());
				Logger.info("Displayed ResponseType SelectBox Does Have a value");	
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed ResponseType SelectBox Does not Have a value",e);
			sa.assertAll();
		}


		Logger.info("=============================== Response Mapping Operation========================================!");
		String ParentWindow = driver.getWindowHandle();
		Thread.sleep(2500);
		try {
			WPOM.selectDropDownOfResponseMapping();
			Logger.info("Select DropDown Of Response Mapping is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select DropDown Of Response Mapping is FAILED!!!",e);
			sa.assertAll();
		}

		//****************
		Thread.sleep(3000);
		String ObjectNameBeforeClickNewTabLink1 = driver.findElement(By.xpath("(//a[text()=' open_in_new '])[1]//..//span[text()]")).getText();
		Logger.info("Object Name Before Click NewTab Link: "+ObjectNameBeforeClickNewTabLink1);
		Thread.sleep(3000);
		try {
			APOM.ClickOnOpenInNewTabLink();
			Logger.info("Click On Open In New Tab Link is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Open In New Tab Link is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(5500);
		Set<String> Allwindow1 = driver.getWindowHandles();
		Thread.sleep(5500);
		for (String wh : Allwindow1) {
			driver.switchTo().window(wh);
			if (wh.equals(ParentWindow)) {
				continue;
			} else {
				Thread.sleep(5500);
				String ObjectNameAfterClickNewTabLink = driver.findElement(By.xpath("(//i[text()='description']//..//span[text()])[2]")).getText();
				Logger.info("Object Name After Click NewTab Link: "+ObjectNameAfterClickNewTabLink);
				Thread.sleep(4000);
				try {
					if (ObjectNameBeforeClickNewTabLink1.contentEquals(ObjectNameAfterClickNewTabLink)) {
						Logger.info("Open in New tab link is properly redirected is Passed !!");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Open in New tab link is properly redirected is Failed !!", e);
					sa.assertAll();
				}
				driver.close();	
				break;
			}
		}
		Thread.sleep(2500);
		try {
			driver.switchTo().window(ParentWindow);
			Logger.info("Swicth back to parent window is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Swicth back to parent window is Failed !!", e);
			sa.assertAll();
		}
		//****************

		Logger.info("=============================== Custom Header Operation========================================!");
		Thread.sleep(2500);
		try {
			WPOM.selectDropDownOfCustomHeader();
			Logger.info("Select DropDown Of Custom Header is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Select DropDown Of Custom Header is FAILED!!!",e);
			sa.assertAll();
		}

		//****************
		Thread.sleep(3000);
		String ObjectNameBeforeClickNewTabLink2 = driver.findElement(By.xpath("(//a[text()=' open_in_new '])[1]//..//span[text()]")).getText();
		Logger.info("Object Name Before Click NewTab Link: "+ObjectNameBeforeClickNewTabLink2);
		Thread.sleep(3000);
		try {
			APOM.ClickOnOpenInNewTabLink();
			Logger.info("Click On Open In New Tab Link is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Open In New Tab Link is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(5500);
		Set<String> Allwindow2 = driver.getWindowHandles();
		Thread.sleep(4000);
		for (String wh : Allwindow2) {
			driver.switchTo().window(wh);
			if (wh.equals(ParentWindow)) {
				continue;
			} else {
				Thread.sleep(4000);
				String ObjectNameAfterClickNewTabLink = driver.findElement(By.xpath("(//i[text()='description']//..//span[text()])[2]")).getText();
				Logger.info("Object Name After Click NewTab Link: "+ObjectNameAfterClickNewTabLink);
				Thread.sleep(4000);
				try {
					if (ObjectNameBeforeClickNewTabLink2.contentEquals(ObjectNameAfterClickNewTabLink)) {
						Logger.info("Open in New tab link is properly redirected is Passed !!");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Open in New tab link is properly redirected is Failed !!", e);
					sa.assertAll();
				}
				driver.close();	
				break;
			}
		}
		Thread.sleep(2500);
		try {
			driver.switchTo().window(ParentWindow);
			Logger.info("Swicth back to parent window is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Swicth back to parent window is Failed !!", e);
			sa.assertAll();
		}
		//****************


		Logger.info("//===============================================APPROVE SCENARIO START========================================//");
		Thread.sleep(3500);
		try {
			APOM.RightClickOnAutoTestObject();           
			Logger.info("Right Click On LeadAutoTestObject is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On LeadAutoTestObject is Failed!!", e);
			sa.assertAll();
		} 
		Thread.sleep(2500);
		try {
			rrp.ClickOnApproveObject();
			Logger.info("Click on Approve Button is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Approve Button is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			rrp.ApproveSubmitbtnForTaskList();
			Logger.info("Click again Approve button is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click again Approve button is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(5000);
		try {
			rrp.DisplayApproved();
			Logger.info("Display Approved button is PASSED!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Approved button is FAILED!!", e);
			sa.assertAll();
		}

		Logger.info("//===============================================Details page operation========================================//");
		Thread.sleep(6500);
		try {
			dp.ClickOndetailsbutton();
			Logger.info("Click On details button is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On details button is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			dp.ClickOnEditbtn();
			Logger.info("Click On Editbtn is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Editbtn is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			dp.InputDesc();
			Logger.info("Enter Description is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Description is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			dp.ClickOnSaveBtn();
			Logger.info("Click On Save Button is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (APOM.DisplayedNoRecordFound() == true) {
				Logger.info("Display 'No Record Found' is PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display 'No Record Found' is FAILED!", e);
			sa.assertAll();
		}

		//*****
		Logger.info("//==================================== OverView Page Opeartion Before Used  ==================================");
		Thread.sleep(3500);
		try {
			APOM.ClickOnWebhookFeature();
			Logger.info("Click On Webhook Feature is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Webhook Feature is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if(APOM.DisplayWebhookOverview()==true) {
				Logger.info("Display Webhook OverView Page is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Webhook OverView Page is Failed", e);
			sa.assertAll();
		}


		if (APOM.DisplayedColumnHeaderCheckIsDisabled()==false) {
			Logger.info("***************** Column Header Check Box Operation ******************");
			Logger.info("Displayed Column Header Checkbox Is Not Disabled ");

			Thread.sleep(1500);
			try {
				APOM.ClickOnColumnHeaderCheckBox();
				Logger.info("Click On ColumnHeader CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On ColumnHeader CheckBox is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				if (APOM.DisplayedColumnHeaderCheckBoxIsChecked() == true) {
					Logger.info("Displayed ColumnHeader CheckBox Is Checked is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed ColumnHeader CheckBox Is Checked is Failed", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			if (APOM.DisplayedAutTestObjectCheckBox() == true) {
				Logger.info("Displayed LeadAutTestObject CheckBox is Passed");
				try {
					if (APOM.DisplayedAutTestObjectCheckBoxIsChecked() == true) {
						Logger.info("Displayed LeadAutTestObject CheckBox Is Checked is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed LeadAutTestObject CheckBox Is Checked is Failled", e);
					sa.assertAll();
				}
			} else {
				sa.assertTrue(true);
			}
			Thread.sleep(1500);
			try {
				if (APOM.DisplayedDeleteButtonIsDisabled() == false) {
					Logger.info("Displayed Delete Button is Enabled is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Delete Button is Enabled is Failled", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				APOM.ClickOnColumnHeaderCheckBox();
				Logger.info("Uncheck the ColumnHeader CheckBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Uncheck the ColumnHeader CheckBox is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			if (APOM.DisplayedAutTestObjectCheckBox() == true) {
				Logger.info("Displayed LeadAutTestObject CheckBox is Passed");
				try {
					if (APOM.DisplayedAutTestObjectCheckBoxIsNotChecked() == true) {
						Logger.info("Displayed LeadAutTestObject CheckBox Is Not Checked is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed LeadAutTestObject CheckBox Is Not Checked is Failled", e);
					sa.assertAll();
				}
			} else {
				sa.assertTrue(true);
			}
			Thread.sleep(1500);
			try {
				if (APOM.DisplayedDeleteButtonIsDisabled() == true) {
					Logger.info("Displayed Delete Button is Disable is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Delete Button is Disable is Failled", e);
				sa.assertAll();
			}
			Logger.info("********************** Filter Operation *************************");
			Thread.sleep(1500);
			try {
				APOM.EnterTextInFilterBox();
				Logger.info("Enter Text In FilterBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter Text In FilterBox is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				if (APOM.DisplayedLeadAutoTestObject() == true) {
					Logger.info("Displayed LeadAutoTestObject is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed LeadAutoTestObject is Failled", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			if (APOM.DisplayedAutTestObjectCheckBox() == true) {
				Logger.info("Displayed LeadAutoTestObject CheckBox is Passed");
				try {
					if (APOM.DisplayedLeadAutoTestObjectIsNotUsed() == true) {
						Logger.info("Displayed LeadAutoTestObject Is Not Used is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed LeadAutoTestObject Is Not Used is Failled", e);
					sa.assertAll();
				}
			} else {

				try {
					if (APOM.DisplayedLeadAutoTestObjectIsUsed() == true) {
						Logger.info("Displayed LeadAutoTestObject Is Used is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed LeadAutoTestObject Is Used is Failled", e);
					sa.assertAll();
				}
			}
			Thread.sleep(2000);
			try {
				APOM.ClearTestFromTheFilterBox();
				Logger.info("Clear Test From The FilterBox is Passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Clear Test From The FilterBox is FAILED!!", e);
				sa.assertAll();
			} 
		}else {
			Logger.info("***************** Column Header Check Box Operation ******************");
			Thread.sleep(2500);
			try {
				if(APOM.DisplayedColumnHeaderCheckIsDisabled()==true) {
					Logger.info("Displayed Column Header Checkbox Is Disabled is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed Column Header Checkbox Is Disabled is is Failed", e);
				sa.assertAll();
			}

			Logger.info("********************** Filter Operation *************************");

			Thread.sleep(1500);
			try {
				APOM.EnterTextInFilterBox();
				Logger.info("Enter Text In FilterBox is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter Text In FilterBox is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			try {
				if( APOM.DisplayedLeadAutoTestObject()==true) {
					Logger.info("Displayed LeadAutoTestObject is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed LeadAutoTestObject is Failled", e);
				sa.assertAll();
			}
			Thread.sleep(1500);
			if (APOM.DisplayedAutTestObjectCheckBox()==true) {
				Logger.info("Displayed LeadAutoTestObject CheckBox is Passed");
				try {
					if (APOM.DisplayedLeadAutoTestObjectIsNotUsed() == true) {
						Logger.info("Displayed LeadAutoTestObject is not Uesed is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed LeadAutoTestObject is not Used is Failled", e);
					sa.assertAll();
				} 
			}else {
				try {
					if( APOM.DisplayedLeadAutoTestObjectIsUsed()==true) {
						Logger.info("Displayed LeadAutoTestObject Is Used is Passed");
					}
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Displayed LeadAutoTestObject Is Used is Failled", e);
					sa.assertAll();
				}
			}
			Thread.sleep(1500);
			try {
				APOM.ClearTestFromTheFilterBox();
				Logger.info("Clear Test From The FilterBox is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Clear Test From The FilterBox is FAILED!!", e);
				sa.assertAll();
			}
		}

		//******

		Logger.info("//*********************************************** Make Use of this Object In OTS Router(LeadManagement) *******************************************");
		Thread.sleep(2500);
		try {
			APOM.ClickOnDropDownForMenutab();
			Logger.info("Click On DropDown For Menu tab is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DropDown For Menu tab is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			APOM.ClickOnLeadManagementOption();
			Logger.info("Click On LeadManagement from menu is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On LeadManagement from menu is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(7500);
		try {
			APOM.ClickOnDropDownForLeadRouting();
			Logger.info("Click On dropdown for lead Routing is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On dropdown for lead Routing is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.RightClickOnOTSrouter();
			Logger.info("Right Click on OTSrouter is passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click on OTSrouter is failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickOnNewObject();
			Logger.info("Click on New OTSrouter is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on New OTSrouter is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.NameInCrudObject();
			Logger.info("Enter AutoTestObject Name is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter AutoTestObject Name is FAILED!!!");
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.DescInRRT();
			Logger.info("Enter Description is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Description is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.clickOnSaveNewObject();
			Logger.info("Click on Save Button is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Save Button is Failed", e);
			sa.assertAll();
		} 

		Thread.sleep(800);
		if(ae.DisplaySameAEerror() == true) {
			Logger.info("Duplicate Object Found, Try to delete the Object NOW!!! then Creating New Object!!");
			Thread.sleep(3500);
			try {
				OTS.ClickOnOTSrouterDropDownsymbol();
				Logger.info("Click on OTSrouter DropDown is passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on OTSrouter DropDown is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(3500);
			try {
				LMP.ContextClickOnAutoTestObject();            
				Logger.info("RightClick On AutoTestObject is PASSED!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("RightClick On AutoTestObject is Failed!!", e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				LMP.ClickOnDeleteOnClonedAutoTestObject();
				Logger.info("Click On Delete button is Passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Delete button is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				LMP.ClickOnDeletebtn();
				Logger.info("Click Again Delete button is Passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click Again Delete button is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(500);
			try {
				if (APOM.DisplayedCannotDeleteErrorSuccessMessage() == true) 
				{
					Logger.info("Displayed 'Cannot Delete' Error Message");
					Thread.sleep(3500);
					try {
						LMP.ContextClickOnAutoTestObject();           
						Logger.info("RightClick On AutoTestObject is PASSED!!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("RightClick On AutoTestObject is Failed!!", e);
						sa.assertAll();
					}
					Thread.sleep(2500);
					try {
						rrp.ClickOnObjectRename();
						Logger.info("Click on Rename Object is PASSED!!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Click on Rename Object is FAILED!!!", e);
						sa.assertAll();
					}
					Thread.sleep(2500);
					try {
						String randomString = APOM.generateRandomString(APOM.length);
						APOM.InputRename_AutoTestObject.clear();
						APOM.InputRename_AutoTestObject.sendKeys(randomString);
						Logger.info("Enter Rename is Passed!!!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Enter Rename is FAILED!", e);
						sa.assertAll();
					}
					Thread.sleep(2500);
					try {
						rrp.ClickOnRenameBtn();
						Logger.info("Click Rename Button is PASSED!!!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Click Rename Button is FAILED!!!", e);
						sa.assertAll();
					}	
				}
			} catch (Exception e) {
				sa.assertTrue(true);
			}
			Thread.sleep(4500);
			try {
				OTS.RightClickOnOTSrouter();
				Logger.info("Right Click on OTSrouter is passed");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Right Click on OTSrouter is failed",e);
				sa.assertAll();
			}
			Thread.sleep(3000);
			try {
				LMP.ClickOnNewObject();
				Logger.info("Click on New OTS Router is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on New OTS Router is FAILED!!", e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				LMP.NameInCrudObject();
				Logger.info("Enter AutoTestObject Name is PASSED!!");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter AutoTestObject Name is FAILED!!!",e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				LMP.DescInRRT();
				Logger.info("Enter Description is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Enter Description is FAILED!!", e);         
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				LMP.clickOnSaveNewObject();
				Logger.info("Click on Save Button is Passed");
			}catch(Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on Save Button is FAILED!!", e);
				sa.assertAll();
				Thread.sleep(1000);
			}
		}
		else {
			sa.assertTrue(true);
		}	  

		driver.navigate().refresh();
		Logger.info("Refreshing The Page!!");
		Thread.sleep(5000);
		try {
			Thread.sleep(2500);
			if( OTS.DisplayOTSrouterOverView()==true) {
				Logger.info("Display OTS router Overview");
				Thread.sleep(3000);
				try {
					OTS.ClickOnOTSrouterDropDownsymbol();
					Logger.info("Click on OTSrouter DropDown is passed");
				}catch(Exception e) {
					sa.assertTrue(false);
					Logger.error("Click on OTSrouter DropDown is FAILED!!", e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					LMP.ClickOnAutoTestObject();           
					Logger.info("Click On LeadAutoTestObject is PASSED!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On LeadAutoTestObject is FAILED!", e);
					sa.assertAll();
				}
			}
		} catch (Exception e) {
			sa.assertTrue(true);
		}

		Thread.sleep(3500);
		try {
			LR.ClickOnDNDdiagramDropDown();
			Logger.info("Click On DNDdiagram DropDown is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DNDdiagram DropDown is Failed!!", e);
			sa.assertAll();
		}

		Logger.info("******************** Decision Block DND************************");
		Thread.sleep(3500);
		try {
			APOM.Decisionblock_DND();
			Logger.info("Drag And Drop Decision Block is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag And Drop Decision Block is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			APOM.ConnectStartBlock_To_DecisionBlock();
			Logger.info("Connect StartBlock_To_DecisionBlock is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Connect StartBlock_To_DecisionBlock is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(4000);
		try {
			APOM.DoubleClickOnDecisionBlock();
			Logger.info("Double Click On DecisionBlock is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Double Click On DecisionBlock is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			LR.SelectDecisionBlockListElem();
			Logger.info("Click On NewCustomerAccountList Option is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On NewCustomerAccountList Option is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickOnAddButton();
			Logger.info("Click On AddButton is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On AddButton is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.ClickOnSaveButtonForDecisionBlock();
			Logger.info("Click On Save Button For DecisionBlock is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button For DecisionBlock is Failed !!", e);
			sa.assertAll();
		}
		Logger.info("*************************************** Action Block DND ****************************************");
		Thread.sleep(3500);
		try {
			dp.ActionBlockLPWR_DND();
			Logger.info("Drag And Drop ActionBlock is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag And Drop ActionBlock is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(4000);
		try {
			dp.ConnectDecisionBlock_To_ActionBlock();
			Logger.info("Connect DecisionBlock_To_ActionBlock is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Connect DecisionBlock_To_ActionBlock is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			dp.DoubleClickOnActionBlock();
			Logger.info("Double Click On Action Block is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Double Click On Action Block is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LR.SelectOnWeighBookOptionActionBlock();
			Logger.info("Select On Webhook Option ActionBlock is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select On Webhook Option ActionBlock is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			dp.SelectListBoxActionBlock();
			Logger.info("Click on Second ListBox dropdown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Second ListBox dropdown is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			APOM.SelectAutotestEmailObject();
			Logger.info("Select AutotestObject is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select AutotestObject is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			dp.ClickOnContinueProcessingCheckBoxActionBlockOTS();
			Logger.info("Click On Continue processing CheckBox ActionBlock is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Continue processing CheckBox ActionBlock is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			dp.SaveButtonForActionBlockOTS();
			Logger.info("Click On Save Button For ActionBlock is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button For ActionBlock is Failed",e);
			sa.assertAll();
		}
		Logger.info("******************** OTS Assignment Block DND ***************************");
		Thread.sleep(4500);
		try {
			dp.OTSAssignmentBlockDND();
			Logger.info("Drag And Drop AssignmentBlock is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Drag And Drop AssignmentBlock is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(4000);
		try {
			dp.ConnectionDecisionBlockN_To_OTSAssignmentBlock();
			Logger.info("Connection Decision BlockNO_To_OTSAssignmentBlock is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Connection Decision BlockNO_To_OTSAssignmentBlock is Failed!!!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			dp.DoubleClickOnOTSAssignmentBlock();
			Logger.info("Double Click On OTS Assignment Block is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Double Click On OTS Assignment Block is Failed !!",e);
			sa.assertAll();
		}

		Thread.sleep(4500);
		try {
			OTS.ClickOnSelectAssignmentTypeDropDown();
			Logger.info("Click On Assignment Type DropDown is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Assignment Type DropDown is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.SelectLiveClaimOption();
			Logger.info("Select LiveClaim Option is Passed !!");	
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select LiveClaim Option is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.ClickOnAssignmentOptionDropDown();
			Logger.info("Click On Assignment Option DropDown is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Assignment Option DropDown is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.SelectOptionFromAssignmentOption();
			Logger.info("Select Option From Assignment Option is Passed !!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Select Option From Assignment Option is Failed !!", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			LR.SaveButtonForOTSAssignmentBlock();
			Logger.info("Clicked On Save Button For AssignmentBlock is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked On Save Button For AssignmentBlock is Failed",e);
			sa.assertAll();
		}
		Logger.info("*********************** Details Page ************************");
		Thread.sleep(2500);
		try {
			rrp.ClickOnDetail();
			Logger.info("Enter Details Page is passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Details Page is Failed !!",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			OTS.DefaultLeadOwnerDropDownforLPWRDropDown();
			Logger.info("Default Lead Owner DropDown is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Default Lead Owner DropDown is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.SelectDefaultLeadOwnerLPWROption();
			Logger.info("SelectDefaultLeadOwnerOption is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("SelectDefaultLeadOwnerOption is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnSaveButtonFordetailsPageOTSCR();
			Logger.info("Click On Save Button For details Page OTS is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Save Button For details Page OTS is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(800);
		try {
			OTS.DisplaySuccessForDefaultLeadOwnerLPWR();
			Logger.info("Display Success is Passed!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Success is Failed!!", e);
			sa.assertAll();
		}

		Logger.info("//===============================================APPROVE SCENARIO START========================================//");
		Thread.sleep(4000);
		try {
			LMP.ContextClickOnAutoTestObject();           
			Logger.info("Right Click On AutoTestObject is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On AutoTestObject is FAILED!!", e);
			sa.assertAll();
		} 
		Thread.sleep(2500);
		try {
			rrp.ClickOnApproveObject();
			Logger.info("Click on Approve Button is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Approve Button is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			rrp.ApproveSubmitbtnForTaskList();
			Logger.info("Click again Approve Button is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click again Approve Button is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(4000);
		try {
			rrp.DisplayApproved();
			Logger.info("Displayed Approved button is PASSED!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Approved button is FAILED!!", e);
			sa.assertAll();
		}

		Logger.info("********************* Go back to Webhook Object In Administartion ********************");
		Thread.sleep(4500);
		try {
			APOM.ClickOnDropDownForMenutab1();
			Logger.info("Click On DropDown For Menu tab is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DropDown For Menu tab is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnAdministrationOption();
			Logger.info("Click On Administration from menu is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Administration from menu is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnIntegrationsDropDown();
			Logger.info("Click On Integrations DropDown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Integrations DropDown is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnWebhookIntegrationDropDown();
			Logger.info("Click On Webhook Integration DropDown is Passed");

		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Webhook Integration DropDown is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			dp.ClickOnDropDownForWebhook();
			Logger.info("Clicked on Webhook DropDown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked on Webhook DropDown is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnAutoTestObject();
			Logger.info("Click On AutoTestObject is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On AutoTestObject  is Failed",e);
			sa.assertAll();
		}
		//************
		Thread.sleep(4500);
		try {
			dp.ClickOndetailsbutton();
			Logger.info("Click On details button is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On details button is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			dp.ClickOnUsedByDropDown();
			Logger.info("Click On UsedBy Dropdown is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On UsedBy Dropdown is Failed",e);
			sa.assertAll();
		}
		String TextFromUsedByRouterName="";
		String TextFromErrorMessage   ="";
		Thread.sleep(2500);
		try {
			TextFromUsedByRouterName = dp.GetTextFromUsedByRouterName.getText();
			Logger.info("Fetch used by router name is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Fetch used by router name is Failed",e);
			sa.assertAll();
		}
		Logger.info("********************** Verifying whether Used object can delete or not *********************");
		Thread.sleep(2500);
		try {
			dp.ClickOnApproveButton();
			Logger.info("Click On Approved Button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Approved Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			dp.ClickOnDeletebutton();
			Logger.info("Click On Delete button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnDelete();
			Logger.info("Click again Delete Button	is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click again Delete Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			TextFromErrorMessage=dp.GetTextFromErrorMessage.getText();
			Logger.info("Get Text From Error Message is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Get Text From Error Message is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (TextFromErrorMessage.contains(TextFromUsedByRouterName)) {
				Logger.info("Displayed 'Cannot delete,It is Used' Error message is Passed");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed 'Cannot delete,It is Used' Error message is Failed",e);
			sa.assertAll();
		}

		Logger.info("********* Verify that the 'Used By' object name and the left menu title is Same Or Not, Once clicking the 'Used By' Router name ************");

		String TextFromLeftMenuTitleAfter="";
		String TextFromLeftMenuTitleBefore ="";
		String TextFromDetails="";
		Thread.sleep(4500);
		try {
			TextFromLeftMenuTitleBefore =APOM.GetTextOfLeftMenuTitle.getText();
			Logger.info("Get Menu Title From Left tree Menu is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Get Menu Title From Left tree Menu is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			dp.ClickOndetailsbutton();
			Logger.info("Click On details button is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On details button is FAILED!!!",e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			dp.ClickUsedByRouterName();
			Logger.info("Click Used By Router Name is PASSED!!");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Used By Router Name is FAILED!!!",e);
			sa.assertAll();
		}

		Thread.sleep(4500);
		try {
			TextFromLeftMenuTitleAfter=APOM.GetTextOfLeftMenuTitle.getText();
			Logger.info("Get Menu Title From Left tree Menu is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Get Menu Title From Left tree Menu is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (TextFromLeftMenuTitleBefore.contentEquals(TextFromLeftMenuTitleAfter)) {
				Logger.info(TextFromLeftMenuTitleBefore);
				Logger.info(TextFromLeftMenuTitleAfter);
				Logger.info("Left menu titlt is Not same before and after clicking UsedBy object name is Passed");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.info(TextFromLeftMenuTitleBefore);
			Logger.info(TextFromLeftMenuTitleAfter);
			Logger.error("Left menu titlt is same before and after clicking UsedBy object name is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(6500);
		try {
			TextFromDetails = driver.findElement(By.xpath("(//i[text()='description']//..//span[text()])[2]")).getText();
			Logger.info("Get Object Name From Details tab : "+TextFromDetails);
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Get Object Name From Details tab is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			if (TextFromDetails.contains("AutoTestObject")) {
				Logger.info("AutoTest Object Name matched with the name from Details tab is Passed");
			}
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("AutoTest Object Name matched with the name from Details tab is Failed",e);
			sa.assertAll();
		}


		Logger.info("********************* Go back to Webhook Object In Administartion ********************");
		Thread.sleep(4500);
		try {
			APOM.ClickOnDropDownForMenutab1();
			Logger.info("Click On DropDown For Menu tab is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On DropDown For Menu tab is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnAdministrationOption();
			Logger.info("Click On Administration from menu is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Administration from menu is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnIntegrationsDropDown();
			Logger.info("Click On Integrations DropDown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Integrations DropDown is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnWebhookIntegrationDropDown();
			Logger.info("Click On Webhook Integration DropDown is Passed");

		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Webhook Integration DropDown is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			dp.ClickOnDropDownForWebhook();
			Logger.info("Clicked on Webhook DropDown is Passed");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Clicked on Webhook DropDown is Failed",e);
			sa.assertAll();
		}


		Logger.info("//===============================================Crud Operation========================================//");
		Logger.info("***************************************Edit Scenario Start**********************************");
		Thread.sleep(5500);
		try {
			APOM.RightClickOnAutoTestObject();           
			Logger.info("Right Click On LeadAutoTestObject is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On LeadAutoTestObject is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			rrp.ClickOnObjectEdit();
			Logger.info("Click on Edit Button is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Edit Button is FAILED!", e);
			sa.assertAll();
		}	


		Logger.info("**************************************************Edit Request type*******************************************");
		Thread.sleep(3000);
		try {
			WPOM.EditselectOptionInRequestType();
			Logger.info("Edit select Option In RequestType is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Edit select Option In RequestType is FAILED!", e);
			sa.assertAll();
		}
		Logger.info("**********************************************Edit Response type**************************************");
		Thread.sleep(2500);
		try {
			WPOM.EditselectOptionfromResponseType();
			Logger.info("Edit select Option from ResponseType PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Edit select Option from ResponseType FAILED!", e);
			sa.assertAll();
		}

		Logger.info("*********************************************Approve*******************************************************");
		Thread.sleep(2500);
		try {
			rrp.ClickOnApprove();
			Logger.info("Click on Approve Button is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Approve Button is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			rrp.ApproveSubmitbtnForTaskList();
			Logger.info("Click again Approve button is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click again Approve button is FAILED!", e);
			sa.assertAll();
		}
		Logger.info("//========================================Delete Craft scenario=======================================");
		Thread.sleep(3500);
		try {
			WPOM.ClickOnEditButton();
			Logger.info("Click On Edit Button is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On EditButton is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(4500);
		try {
			ALP.ClickOnDeleteCraft();
			Logger.info("Click On Delete Craft buton is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Craft buton is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(6500);
		try {
			if (RM.VerifyApprovedSign()==true) {
				Logger.info("Dispalying Verified Sign is PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Dispalying Verified Sign is FAILED!", e);
			sa.assertAll();

		}	

		Logger.info("//======================================RENAME SCENARIO START=============================================//");
		Thread.sleep(4000);
		try {
			APOM.RightClickOnAutoTestObject();           
			Logger.info("Right Click On LeadAutoTestObject is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On LeadAutoTestObject is Failed!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			rrp.ClickOnObjectRename();
			Logger.info("Click on Rename Object is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Rename Object is FAILED!!!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.InputOnRenameAutoTestObject();
			Logger.info("Input on Rename AutoTestObject is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Input on Rename AutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			rrp.ClickOnRenameBtn();
			Logger.info("Click Rename Button is  PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Rename Button is FAILED!!!", e);
			sa.assertAll();
		}	
		Thread.sleep(400);
		if(ae.DisplaySameAEerror() == true) {
			Logger.info("Duplicate Object Found, Deleting Object NOW");
			Thread.sleep(4000);
			if (APOM.DisplayLeadAutoTestObjectRename() == true) {
				Logger.info("Display LeadAutoTestObjectRename Object");			
				Thread.sleep(4000);	
				try {
					APOM.ContextClickOnRenameAutoTestObject();
					Logger.info("Right Click On LeadRenamedAutoTestObject is PASSED!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Right Click On LeadRenamedAutoTestObject is FAILED!", e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					LMP.ClickOnDeleteOnClonedAutoTestObject();
					Logger.info("Click On Delete Button is Passed!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Delete Button is FAILED!", e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					LMP.ClickOnDeletebtn();
					Logger.info("Click again Delete Button is Passed!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Delete Button is FAILED!", e);
					sa.assertAll();
				}
				Thread.sleep(400);
				try {
					if (APOM.DisplayedCannotDeleteErrorSuccessMessage() == true) 
					{
						Logger.info("Displayed 'Cannot Delete' Error Message");
						Thread.sleep(4000);
						try {
							APOM.ContextClickOnRenameAutoTestObject();
							Logger.info("Right Click On LeadRenamedAutoTestObject is PASSED!!!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Right Click On LeadRenamedAutoTestObject is FAILED!", e);
							sa.assertAll();
						}
						Thread.sleep(2500);
						try {
							rrp.ClickOnObjectRename();
							Logger.info("Click on Rename Object is PASSED!!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Click on Rename Object is FAILED!!!", e);
							sa.assertAll();
						}
						Thread.sleep(2500);
						try {
							String randomString = APOM.generateRandomString(APOM.length);
							APOM.InputRename_AutoTestObject.clear();
							APOM.InputRename_AutoTestObject.sendKeys(randomString);
							Logger.info("Enter Rename is Passed!!!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Enter Rename is FAILED!", e);
							sa.assertAll();
						}
						Thread.sleep(2500);
						try {
							rrp.ClickOnRenameBtn();
							Logger.info("Click Rename Button is PASSED!!!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Click Rename Button is FAILED!!!", e);
							sa.assertAll();
						}	
					}
				} catch (Exception e) {
					sa.assertTrue(true);
				}

			} else 
			{
				Thread.sleep(2500);
				APOM.ClickOnCrudFolderDropdown();
				Logger.info("Click On CrudFolder Dropdown is PASSED!!!");
				Thread.sleep(4000);
				try {
					APOM.ContextClickOnRenameAutoTestObject();
					Logger.info("Right Click On LeadRenamedAutoTestObject is PASSED!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Right Click On LeadRenamedAutoTestObject is FAILED!", e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					LMP.ClickOnDeleteOnClonedAutoTestObject();
					Logger.info("Click On Delete Button is Passed!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click On Delete Button is FAILED!", e);
					sa.assertAll();
				}
				Thread.sleep(2500);
				try {
					LMP.ClickOnDeletebtn();
					Logger.info("Click again Delete Button is Passed!!!");
				} catch (Exception e) {
					sa.assertTrue(false);
					Logger.error("Click again Delete Button is FAILED!", e);
					sa.assertAll();
				}
				Thread.sleep(400);
				try {
					if (APOM.DisplayedCannotDeleteErrorSuccessMessage() == true) 
					{
						Logger.info("Displayed 'Cannot Delete' Error Message");
						Thread.sleep(3500);
						try {
							APOM.ContextClickOnRenameAutoTestObject();
							Logger.info("Right Click On LeadRenamedAutoTestObject is PASSED!!!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Right Click On LeadRenamedAutoTestObject is FAILED!", e);
							sa.assertAll();
						}
						Thread.sleep(2500);
						try {
							rrp.ClickOnObjectRename();
							Logger.info("Click on Rename Object is PASSED!!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Click on Rename Object is FAILED!!!", e);
							sa.assertAll();
						}
						Thread.sleep(2500);
						try {
							String randomString = APOM.generateRandomString(APOM.length);
							APOM.InputRename_AutoTestObject.clear();
							APOM.InputRename_AutoTestObject.sendKeys(randomString);
							Logger.info("Enter Rename is Passed!!!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Enter Rename is FAILED!", e);
							sa.assertAll();
						}
						Thread.sleep(2500);
						try {
							rrp.ClickOnRenameBtn();
							Logger.info("Click Rename Button is PASSED!!!");
						} catch (Exception e) {
							sa.assertTrue(false);
							Logger.error("Click Rename Button is FAILED!!!", e);
							sa.assertAll();
						}	
					}
				} catch (Exception e) {
					sa.assertTrue(true);
				}
			}
			Thread.sleep(6200);	
			Thread.sleep(3500);
			try {
				APOM.RightClickOnAutoTestObject();           
				Logger.info("Right Click On LeadAutoTestObject is PASSED!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Right Click On LeadAutoTestObject is Failed!!", e);
				sa.assertAll();
			}
			Thread.sleep(4000);
			try {
				LMP.ClickOnRenameAutoTestObject();
				Logger.info("Click On Rename AutoTestObject is Passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Rename AutoTestObject is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(4000);
			try {
				LMP.InputOnRenameAutoTestObject();
				Logger.info("Input on Rename AutoTestObject is passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Input on Rename AutoTestObject is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(2500);
			try {
				LMP.ClickOnRenameBtn();
				Logger.info("Click on Rename Button AutoTestObject is Passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click on Rename Button AutoTestObject is FAILED!", e);
				sa.assertAll();
			}
		}
		else{
			sa.assertTrue(true);
		}
		Thread.sleep(5000); 	
		try {
			if (APOM.DisplayLeadAutoTestObjectRename() == true) {
				Logger.info("Display LeadAutoTestObjectRename is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display LeadAutoTestObjectRename is Failed", e);
			sa.assertAll();
		}


		Logger.info("====================================================Clone Scenario==================================================================");
		Thread.sleep(4500);
		while (APOM.DisplayedLeadAutoTestObjectRenameCopy()==true) {
			Logger.info("Displayed LeadAutoTestObjectRenameCopy Object,So Delete that Object");
			Thread.sleep(5000);
			try {
				APOM.RightClickLeadAutoTestObjectAfterClone();
				Logger.info("Right Click On LeadAutoTestObjectRenameCopy Object is PASSED!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Right Click On LeadAutoTestObjectRenameCopy Object is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(3500);
			try {
				LMP.ClickOnDeleteOnClonedAutoTestObject();
				Logger.info("Click On Delete Button is Passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click On Delete Button is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(4000);
			try {
				LMP.ClickOnDeletebtn();
				Logger.info("Click again Delete Button is Passed!!!");
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Click again Delete Button is FAILED!", e);
				sa.assertAll();
			}
			Thread.sleep(400);
			try {
				if (APOM.DisplayedCannotDeleteErrorSuccessMessage() == true) 
				{
					Logger.info("Displayed 'Cannot Delete' Error Message");
					Thread.sleep(3500);
					try {
						APOM.RightClickLeadAutoTestObjectAfterClone();           
						Logger.info("RightClick On LeadAutoTestObjectRenameCopy Object is PASSED!!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("RightClick On LeadAutoTestObjectRenameCopy Object is Failed!!", e);
						sa.assertAll();
					}
					Thread.sleep(2500);
					try {
						rrp.ClickOnObjectRename();
						Logger.info("Click on Rename option is PASSED!!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Click on Rename option is FAILED!!!", e);
						sa.assertAll();
					}
					Thread.sleep(2500);
					try {
						String randomString = APOM.generateRandomString(APOM.length);
						APOM.InputRename_AutoTestObject.clear();
						APOM.InputRename_AutoTestObject.sendKeys(randomString);
						Logger.info("Enter Rename is Passed!!!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Enter Rename is FAILED!", e);
						sa.assertAll();
					}
					Thread.sleep(2500);
					try {
						rrp.ClickOnRenameBtn();
						Logger.info("Click Rename Button is PASSED!!!");
					} catch (Exception e) {
						sa.assertTrue(false);
						Logger.error("Click Rename Button is FAILED!!!", e);
						sa.assertAll();
					}	
				}
			} catch (Exception e) {
				sa.assertTrue(true);
			}
			Thread.sleep(4500);
			continue;
		}

		Thread.sleep(4000);
		try {
			APOM.ContextClickOnRenameAutoTestObject();
			Logger.info("Right Click On LeadRenamedAutoTestObject is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On LeadRenamedAutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickOnCloneAutoTestObject();
			Logger.info("Click On Clone option is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Clone option is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			LMP.ClickOnCloneBtn();
			Logger.info("Click On Clone button is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Clone button is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3500);
		try {
			if (APOM.DisplayCloneAutoTestObject() == true) {
				Logger.info("Displayed Cloned LeadRenameAutoTestObject is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Cloned LeadRenameAutoTestObject is FAILED!", e);
			sa.assertAll();
		}

		Logger.info("//===============================Approve Cloned Object========================================!");
		Thread.sleep(5000);
		try {
			APOM.RightClickLeadAutoTestObjectAfterClone();
			Logger.info("Right Click On LeadAutoTestObjectRenameCopy Object is PASSED!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On LeadAutoTestObjectRenameCopy Object is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(3100);
		try {
			rrp.ClickOnApproveObject();
			Logger.info("Click on Approve Button is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Approve Button is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			rrp.ApproveSubmitbtnForTaskList();
			Logger.info("Click again Approve button is PASSED!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click again Approve button is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(4200);
		try {
			rrp.DisplayApproved();
			Logger.info("Displayed Approved Button is PASSED!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Approved Button is FAILED!!",e);
			sa.assertAll();
		}

		Logger.info("********************************DELETE CLONED OBJECT SCENARIO*********************************");
		Thread.sleep(2500);
		try {
			APOM.ClickOnDeleteButtonForWebhook();
			Logger.info("Click On Delete Button is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.ClickOnDelete();
			Logger.info("Click On Delete Button	is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Delete Button is Failed",e);
			sa.assertAll();
		}
		Thread.sleep(400);
		try {
			if (LMP.DisplayDeleteAutoTestObject() == true) {
				Logger.info("Display Cloned AutoTestObject Deleted successfully is PASSED!!!");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Cloned AutoTestObject Deleted successfully is FAILED!", e);
			sa.assertAll();
		}


		Logger.info("//===============================MOVE OBJECT SCENARIO START========================================");
		Thread.sleep(6500);
		try {
			APOM.ContextClickOnRenameAutoTestObject();
			Logger.info("Right Click On LeadRenamedAutoTestObject is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Right Click On LeadRenamedAutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(4500); 
		try {
			LMP.ClickOnMoveAutoTestObject();
			Logger.info("Click On Move Renamed AutoTestObject is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Move Renamed AutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(5100);
		try {
			APOM.SelectFolderToAutotestObject();
			Logger.info("Select Folder to move the Autotest object is Passed !!!");
		} catch (Exception e) {
			Logger.info("Folder Not Found!! Craeting New Folder.");
			Thread.sleep(2500);
			rrp.ClickOnCancel();
			Logger.info("Click On Cancel button is Passed");
			Thread.sleep(4000);
			APOM.RightClickonWebhookDropDown();
			Logger.info("Right Click on Webhook DropDown is Passed");
			Thread.sleep(2500);
			LMP.ClickOnNewFolder();
			Logger.info("Click on New Folder is Passed");
			Thread.sleep(2500);
			APOM.NameInObject();
			Logger.info("Enter Folder Name is Passed");
			Thread.sleep(2500);
			LMP.clickOnSaveNewObject();
			Logger.info("Click On Save is Passed");
			Thread.sleep(4800);
			try {
				APOM.ContextClickOnRenameAutoTestObject();
				Logger.info("Right Click On LeadRenamedAutoTestObject is Passed!!!");
			} catch (Exception g) {
				sa.assertTrue(false);
				Logger.error("Right Click On LeadRenamedAutoTestObject is FAILED!", g);
				sa.assertAll();
			}
			Thread.sleep(4500);
			try {
				LMP.ClickOnMoveAutoTestObject();
				Logger.info("Click On Move Renamed AutoTestObject is Passed!!!");
			} catch (Exception f) {
				sa.assertTrue(false);
				Logger.error("Click On Move Renamed AutoTestObject is FAILED!", f);
				sa.assertAll();
			}
			Thread.sleep(4800);
			try {
				APOM.SelectFolderToAutotestObject();
				Logger.info("Select Folder to move the Autotest object is passed!!!");		
			} catch (Exception e2) {
				sa.assertTrue(false);
				Logger.error("Select Folder to move the Autotest object is Failed!!!", e2);
				sa.assertAll();
			}
			Thread.sleep(2000);
		}
		Thread.sleep(2500);
		try {
			rrp.ClickOnMoveBtn();
			Logger.info("Click On Move Button is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Move Button is FAILED!", e);
			sa.assertAll();
		}

		Logger.info("******************************* Move Back the AutoTestobject to the Main folder *****************************");
		Thread.sleep(5000);
		try {
			APOM.ContextClickOnRenameAutoTestObject();
			Logger.info("Right Click On LeadRenamedAutoTestObject is Passed!!!");
		} catch (Exception g) {
			sa.assertTrue(false);
			Logger.error("Right Click On LeadRenamedAutoTestObject is  FAILED!", g);
			sa.assertAll();
		}
		Thread.sleep(3000); 
		try {
			LMP.ClickOnMoveAutoTestObject();
			Logger.info("Click On Move Renamed AutoTestObject is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Move Renamed AutoTestObject is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			APOM.SelectMainFolder();
			Logger.info("Select Main Folder is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click Main Folder is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(2500);
		try {
			rrp.ClickOnMoveBtn();
			Logger.info("Click On Move Button is Passed!!!");
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Click On Move Button is FAILED!", e);
			sa.assertAll();
		}
		Thread.sleep(1500);

		//***
		Logger.info("//==================================== OverView Page Opeartion After approved  ==================================");
		Thread.sleep(3500);
		try {
			APOM.ClickOnWebhookFeature();
			Logger.info("Click On Webhook Feature is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Click on Webhook Feature is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(4000);
		try {
			if(APOM.DisplayWebhookOverview()==true) {
				Logger.info("Display Webhook OverView Page is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Display Webhook OverView Page is Failed", e);
			sa.assertAll();
		}


		Logger.info("*****************Verifying Column Header Check Is Disabled******************");
		Thread.sleep(2500);
		try {
			if(APOM.DisplayedColumnHeaderCheckIsDisabled()==true) {
				Logger.info("Displayed Column Header Checkbox Is Disabled is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed Column Header Checkbox Is Disabled is is Failed", e);
			sa.assertAll();
		}

		Logger.info("********************** Filter Operation *************************");

		Thread.sleep(1500);
		try {
			APOM.EnterTextInFilterBox();
			Logger.info("Enter Text In FilterBox is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Enter Text In FilterBox is FAILED!!", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		try {
			if( APOM.DisplayedLeadAutoTestObjectRename()==true) {
				Logger.info("Displayed LeadAutoTestObjectRename is Passed");
			}
		} catch (Exception e) {
			sa.assertTrue(false);
			Logger.error("Displayed LeadAutoTestObjectRename is Failled", e);
			sa.assertAll();
		}
		Thread.sleep(1500);
		if (APOM.DisplayedLeadAutTestObjectRenameCheckBox()==true) {
			Logger.info("Displayed LeadAutTestObjectRename CheckBox is Passed");
			try {
				if (APOM.DisplayedLeadAutoTestObjectRenameIsNotUsed() == true) {
					Logger.info("Displayed LeadAutoTestObjectRename is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed LeadAutoTestObjectRename is Failled", e);
				sa.assertAll();
			} 
		}else {
			try {
				if( APOM.DisplayedLeadAutoTestObjectRenameIsUsed()==true) {
					Logger.info("Displayed LeadAutoTestObjectRename Is Used is Passed");
				}
			} catch (Exception e) {
				sa.assertTrue(false);
				Logger.error("Displayed LeadAutoTestObjectRename Is Used is Failled", e);
				sa.assertAll();
			}
		}
		Thread.sleep(1500);
		try {
			APOM.ClearTestFromTheFilterBox();
			Logger.info("Clear Test From The FilterBox is Passed");
		}catch(Exception e) {
			sa.assertTrue(false);
			Logger.error("Clear Test From The FilterBox is FAILED!!", e);
			sa.assertAll();
		}

		//****

	}
}
