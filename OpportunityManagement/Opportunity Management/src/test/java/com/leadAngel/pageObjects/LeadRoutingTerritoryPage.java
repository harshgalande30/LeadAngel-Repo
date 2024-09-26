package com.leadAngel.pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeadRoutingTerritoryPage {

	WebDriver ldriver;

	public LeadRoutingTerritoryPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
 
	}
	
	@FindBy(xpath="//span[contains(text(),'Lead Routing Territory ')]")
	WebElement LRT;
	
	@FindBy(xpath="//button[@aria-label='toggle Lead Routing Territory']")
	WebElement LRTDropdown;
	
	@FindBy(xpath="//h4[text()='Lead Routing Territory Overview']")
	WebElement LRTOverview;
	
	@FindBy(xpath="//button[(text()=' Data Dictionary ')]")
	WebElement DataDictionary;
	@FindBy(xpath="(//mat-list-item[@mattooltipclass='custom-tooltip-style'])[1]")
	WebElement AccountList;
	@FindBy(xpath = "//div[@id='cdk-drop-list-0']")
	WebElement AddField;
	@FindBy(xpath="//option[text()='is']")
	WebElement AccountIs;
	@FindBy(xpath="//option[text()='is not']")
	WebElement AccountIsNot;
	@FindBy(xpath="//mat-select[@formcontrolname='TextBox1']")
	WebElement AccountIsSelect;
	@FindBy(xpath="(//mat-option)[2]")
	WebElement AccountIsOption1;
	@FindBy(xpath="(//mat-option)[3]")
	WebElement EditAccountIsOption1;
	@FindBy(xpath="//mat-icon[text()='clear']/ancestor::button")
	WebElement ClearDND;
//*********************************************************************************************************	
	@FindBy(xpath="(//mat-list-item[@mattooltipclass='custom-tooltip-style'])[2]")
	WebElement CRMAccFilter;
	
	@FindBy(xpath="(//option[text()='is not'])[2]")
	WebElement CRMAccFilterSelect;
	@FindBy(xpath="(//mat-select[@name='seldropDown'])[2]")
	WebElement CRMAccFilterSelectOptionDropdown;
	@FindBy(xpath="(//mat-option[@role='option'])[2]")
	WebElement CRMAccFilterSelectOption;
	
	
	
	//*********************************************************************************************************	
	@FindBy(xpath="(//mat-list-item[@mattooltipclass='custom-tooltip-style'])[3]")
	WebElement CRMLeadFilter;
	
	@FindBy(xpath="(//option[text()='is'])[3]")
	WebElement CRMLeadFilterSelect;
	@FindBy(xpath="(//option[text()='is not'])[3]")
	WebElement EditCRMLeadFilterSelect;
	
	
	@FindBy(xpath="(//mat-select[@name='seldropDown'])[3]")
	WebElement CRMLeadFilterSelectOptionDropdown;
	@FindBy(xpath="(//mat-option[@role='option'])[3]")
	WebElement CRMLeadFilterSelectOption;
	@FindBy(xpath="(//mat-option[@role='option'])[5]")
	WebElement EditCRMLeadFilterSelectOption;
	
	//*********************************************************************************************************	
	
	@FindBy(xpath="(//mat-list-item[@mattooltipclass='custom-tooltip-style'])[4]")
	WebElement SystemDataDictionary;
	@FindBy(xpath="(//option[text()='is not'])[4]")
	WebElement SystemDataDictionarySelect;
	@FindBy(xpath="(//mat-select[@name='seldropDown'])[4]")
	WebElement SystemDataDictionarySelectOptionDropdown;
	@FindBy(xpath="(//mat-option[@role='option'])[2]")
	WebElement SystemDataDictionarySelectOption;
	
	
	
	
	//*********************************************************************************************************	

	public void RightClickonLRT() {
		Actions actions = new Actions(ldriver);
//		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(RoundRobinTeam));
//		actions.contextClick(RoundRobinTeam).perform();
		actions.moveToElement(LRT).click(LRT).contextClick(LRT).build().perform();
	}
	public void ClickAgainLRT() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(LRT));
		LRT.click();
	}
	public void LRTDropdown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(LRTDropdown));
		LRTDropdown.click();
	}
	public boolean LRTOverview() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(LRTOverview));
		return LRTOverview.isDisplayed();
	}
	
	public void ClickonDataDictionary() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(DataDictionary));
		DataDictionary.click();
	}

	public void AccountList_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(AccountList));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(AccountList).pause(Duration.ofSeconds(0)).clickAndHold(AccountList).pause(Duration.ofSeconds(1))
				// .moveByOffset(x, y)
				.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();

	}
	
	public void ClickOnAccountIs() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(AccountIs));
		AccountIs.click();
	}
	public void ClickOnAccountIsNot() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(AccountIsNot));
		AccountIsNot.click();
	}
	
	public boolean DisplayLRT() {
		try {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(LRT));
			return LRT.isDisplayed();
		}catch(Exception e) {
			return false;
		}	
	}

	public void ClickOnAccountIsSelect() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(AccountIsSelect));
		AccountIsSelect.click();
	}
	
	public void ClickOnAccountIsOption1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(AccountIsOption1));
		AccountIsOption1.click();
	}
	public void EditAccountIsOption1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(EditAccountIsOption1));
		EditAccountIsOption1.click();
	}
	
	
//	public void ClickOnCrossBtn() {
//		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ClearDND));
//		ClearDND.click();
//	}
	public void ClickOnCrossBtn() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ClearDND));
		//ApproveSubmitbtn.click();
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", ClearDND);
	}

	//*********************************************************************************************************	

	
	
	public void CRMAccFilter_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(CRMAccFilter));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(CRMAccFilter).pause(Duration.ofSeconds(0)).clickAndHold(CRMAccFilter).pause(Duration.ofSeconds(1))
				// .moveByOffset(x, y)
				.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();

	}
	
	public void CRMAccFilterSelect() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(CRMAccFilterSelect));
		CRMAccFilterSelect.click();
	}
	public void CRMAccFilterSelectOptionDropdown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(CRMAccFilterSelectOptionDropdown));
		CRMAccFilterSelectOptionDropdown.click();
	}
	public void CRMAccFilterSelectOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(CRMAccFilterSelectOption));
		CRMAccFilterSelectOption.click();
	}
	
	//*********************************************************************************************************	

	public void CRMLeadFilter_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(CRMLeadFilter));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(CRMLeadFilter).pause(Duration.ofSeconds(0)).clickAndHold(CRMLeadFilter).pause(Duration.ofSeconds(1))
				// .moveByOffset(x, y)
				.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();

	}
	public void CRMLeadFilterSelect() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(CRMLeadFilterSelect));
		CRMLeadFilterSelect.click();
	}
	public void EditCRMLeadFilterSelect() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(EditCRMLeadFilterSelect));
		EditCRMLeadFilterSelect.click();
	}
	public void CRMLeadFilterSelectOptionDropdown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(CRMLeadFilterSelectOptionDropdown));
		CRMLeadFilterSelectOptionDropdown.click();
	}
	public void CRMLeadFilterSelectOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(CRMLeadFilterSelectOption));
		CRMLeadFilterSelectOption.click();
	}
	public void EditCRMLeadFilterSelectOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(EditCRMLeadFilterSelectOption));
		EditCRMLeadFilterSelectOption.click();
	}
	//*********************************************************************************************************	
	public void SystemDataDictionary_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(SystemDataDictionary));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(SystemDataDictionary).pause(Duration.ofSeconds(0)).clickAndHold(SystemDataDictionary).pause(Duration.ofSeconds(1))
				// .moveByOffset(x, y)
				.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();

	}
	public void SystemDataDictionarySelect() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(SystemDataDictionarySelect));
		SystemDataDictionarySelect.click();
	}
	public void SystemDataDictionarySelectOptionDropdown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(SystemDataDictionarySelectOptionDropdown));
		SystemDataDictionarySelectOptionDropdown.click();
	}
	public void SystemDataDictionarySelectOption() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(SystemDataDictionarySelectOption));
		SystemDataDictionarySelectOption.click();
	}
	
	//***************************************************** Sanity Test Cases X path ***********************************************************************

		@FindBy(xpath="//label[text()='Account List']//..//select[@name='seldropDown']")
		WebElement ClickAccountListSelectBox;

		@FindBy(xpath="//label[text()='CRM Account Filter']//..//select[@name='seldropDown']")
		WebElement ClickOnCRMaccountFilterListBoxx;
		
		@FindBy(xpath="//label[text()='CRM Lead Filter']//..//select[@name='seldropDown']")
		WebElement ClickOnCRMleadFilter;
		
		@FindBy(xpath="//label[text()='System Data Dictionary']//..//select[@name='seldropDown']")
		WebElement ClickOnSystemDataDictionary;
		
		public void ClickAccountListSelectBox() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ClickAccountListSelectBox));
			ClickAccountListSelectBox.click();
		}

		public void ClickOnCRMaccountFilterListBoxx() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ClickOnCRMaccountFilterListBoxx));
			ClickOnCRMaccountFilterListBoxx.click();
		}

		public void ClickOnCRMleadFilter() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ClickOnCRMleadFilter));
			ClickOnCRMleadFilter.click();
		}

		public void ClickOnSystemDataDictionary() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ClickOnSystemDataDictionary));
			ClickOnSystemDataDictionary.click();
		}

		//***************************************************** Sanity Test Cases X path ***********************************************************************
				
				@FindBy(xpath="//label[text()='CRM Contact Filter']//..//select[@name='seldropDown']")
				WebElement ClickOnCRMContactFilter;
				
				@FindBy(xpath="(//ng-select[@formcontrolname='TextBox1'])[1]")
				WebElement AccountIsSelectOption;
				@FindBy(xpath="(//span[@class='custom-option-content ng-star-inserted'])[3]")
				WebElement AccountIsOption;
				@FindBy(xpath="(//ng-select[@formcontrolname='TextBox1'])[2]")
				WebElement CRMAccFilterSelectOptionDropdown1;
				
				@FindBy(xpath="(//ng-select[@formcontrolname='TextBox1'])[3]")
				WebElement CRMContactFilterSelectOptionDropdown;
				@FindBy(xpath="(//ng-select[@formcontrolname='TextBox1'])[4]")
				WebElement SystemDataDictionarySelectOptionDropdown1;
				
				@FindBy(xpath="//label[text()='CRM Opportunity Filter']//..//select[@name='seldropDown']")
				WebElement ClickOnCRMOpportunityFilter;
				
				
				
				
				
				
				
				public void ClickOnCRMOpportunityFilter() {
					new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ClickOnCRMOpportunityFilter));
					ClickOnCRMOpportunityFilter.click();
				}
				public void SystemDataDictionarySelectOptionDropdown1() {
					new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(SystemDataDictionarySelectOptionDropdown1));
					SystemDataDictionarySelectOptionDropdown1.click();
				}
				public void CRMContactFilterSelectOptionDropdown() {
					new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(CRMContactFilterSelectOptionDropdown));
					CRMContactFilterSelectOptionDropdown.click();
				}
				public void CRMAccFilterSelectOptionDropdown1() {
					new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(CRMAccFilterSelectOptionDropdown1));
					CRMAccFilterSelectOptionDropdown1.click();
				}
				public void AccountIsOption() {
					new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(AccountIsOption));
					AccountIsOption.click();
				}
				public void AccountIsSelectOption() {
					new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(AccountIsSelectOption));
					AccountIsSelectOption.click();
				}
				public void ClickOnCRMContactFilter() {
					new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ClickOnCRMContactFilter));
					ClickOnCRMContactFilter.click();
				}
		

	
}
