package com.leadAngel.pageObjects;

import java.time.Duration;
import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CRM_Lead_FilterPage {

	WebDriver ldriver;
	
	public CRM_Lead_FilterPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	
}
	
	@FindBy(xpath="//button[(text()=' Lead Attributes ')]")
	WebElement LeadAttr;
	@FindBy(xpath = "//div[@id='cdk-drop-list-0']")
	WebElement AddField; 
	@FindBy(xpath="//mat-list-item[@id=\"First Name$#!@#$%^4\"]")
	WebElement FirstName;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='First Name']//parent::div//input[@type='text']")
    WebElement FirstNameContainsInput;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='First Name']//parent::div//mat-icon[text()='add_box']")
	WebElement FirstNameInAddbtn;
	@FindBy(xpath="//div[text()=\" [not \"]")
	WebElement FirstNameInAddAttr1;
	@FindBy(xpath="//div[text()=\" 11mar-101 \"]")
	WebElement FirstNameInAddAttr2;
	@FindBy(xpath="//mat-panel-title[contains(@class,'mat-expansion-panel-header-title') and ./span/text()='First Name' and ./span/text()='1']")
    WebElement FirstNameScroll; 	
	
	@FindBy(xpath="//mat-list-item[@id=\"Annual Revenue$#!@#$%^4\"]")
    WebElement LeadAnnualRevenue;	
	@FindBy(xpath="//div[text()=\" 0.1 \"]")
	WebElement LeadAnnualAddAttr1;
	@FindBy(xpath="//div[text()=\" 10.0 \"]")
	WebElement LeadAnnualAddAttr2;
	
	@FindBy(xpath="//mat-list-item[@id=\"Created Date$#!@#$%^4\"]")
	WebElement LeadCreatedDate;
	
	@FindBy(xpath="//mat-list-item[@id=\"Converted$#!@#$%^4\"]")
	WebElement Converted;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Converted']//parent::div//option[text()='True']")
	WebElement ConvertedIsTrue;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='Converted']//parent::div//option[text()='False']")
	WebElement ConvertedIsFalse;
	
	@FindBy(xpath="//button[(text()=' Smart Lead Attributes ')]")
	WebElement SmartLeadAttr;
	@FindBy(xpath="//mat-list-item[@id=\"City$#!@#$%^5\"]")
    WebElement City;
	@FindBy(xpath="//div[@class='form-group pt-3 row']//label[text()='City']//parent::div//mat-icon[text()='add_box']")
	WebElement CityInAddbtn;
	@FindBy(xpath="//div[text()=\" ?????? \"]")
	WebElement CityAddAttr1;
	@FindBy(xpath="//div[text()=\" Abbeville \"]")
	WebElement CityAddAttr2;
	
	@FindBy(xpath="//button[(text()=' Lead Activity Attributes ')]")
	WebElement LeadActivityAttr;
	@FindBy(xpath="//mat-list-item[@id=\"Account ID$#!@#$%^28\"]")
	WebElement LeadAccountId;
	
	@FindBy(xpath="//mat-list-item[@id=\"Task$#!@#$%^28\"]")
	WebElement LeadTask;
	
	@FindBy(xpath="//mat-list-item[@id=\"Duration$#!@#$%^28\"]")
	WebElement LeadDuration;
	
	@FindBy(xpath="//mat-list-item[@id=\"Completed Date/Time$#!@#$%^28\"]")
	WebElement LeadCompletedDate;
	
	@FindBy(xpath="//button[(text()=' System Lead Attribute ')]")
	WebElement SysLeadAttr;
	@FindBy(xpath="//mat-list-item[@id=\"Last Routed Date$#!@#$%^35\"]")
	WebElement LeadLastRouted;
	
	
	@FindBy(xpath="//mat-panel-title[contains(@class,'mat-expansion-panel-header-title') and ./span/text()='Converted' and ./span/text()='4']")
	WebElement ConvertedMoved;
	@FindBy(xpath="//mat-panel-title[contains(@class,'mat-expansion-panel-header-title') and ./span/text()='Converted' and ./span/text()='1']")
	WebElement ConvertedAfterMoved;
	@FindBy(xpath="//mat-panel-title[contains(@class,'mat-expansion-panel-header-title') and ./span/text()='Created Date' and ./span/text()='4']")
	WebElement CreatedDateMoved;
	@FindBy(xpath="//mat-panel-title[contains(@class,'mat-expansion-panel-header-title') and ./span/text()='Created Date' and ./span/text()='1']")
	WebElement CreatedDateAfterMoved;
	@FindBy(xpath="//mat-panel-title[contains(@class,'mat-expansion-panel-header-title') and ./span/text()='Annual Revenue' and ./span/text()='4']")
    WebElement AnnualRevenueMoved;
	@FindBy(xpath="//mat-panel-title[contains(@class,'mat-expansion-panel-header-title') and ./span/text()='Annual Revenue' and ./span/text()='1']")
	WebElement AnnualRevenueAfterMoved;
	@FindBy(xpath="//mat-panel-title[contains(@class,'mat-expansion-panel-header-title') and ./span/text()='First Name' and ./span/text()='4']")
	WebElement FirstNameMoved;
	@FindBy(xpath="//mat-panel-title[contains(@class,'mat-expansion-panel-header-title') and ./span/text()='First Name' and ./span/text()='1']")
	WebElement FirstNameAfterMoved;
	@FindBy(xpath = "(//mat-toolbar)[3]")
	WebElement ElemOnMove;
	
	@FindBy(xpath = "//span[contains(text(),' Approve ')]")
	WebElement btnApprove;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement ApproveSubmitbtn;
//	@FindBy(xpath = "//li[contains(text(),' Approved ')]")
//	WebElement Approved;
	
	@FindBy(xpath = "//button[@aria-label='toggle CRM Lead Filter']")
	WebElement CRMLeedFilterDropDown;
	
	@FindBy(xpath = "//h4[text()='CRM Lead Filter Overview']")
	WebElement CRMLeadFilterView;
	
	public void clickCRMLeedFilterDropDown() {
		new WebDriverWait(ldriver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(CRMLeedFilterDropDown));
		CRMLeedFilterDropDown.click();
	}
	
	public boolean DisplayALeadListOverView() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(CRMLeadFilterView));
		return CRMLeadFilterView.isDisplayed();
	}
	
	
//--------------------- MOVED ATTRIBUTE ------------------------------//
	
	public void Converted_Move() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ConvertedMoved));
		Actions actions = new Actions(ldriver);
		int x = ElemOnMove.getLocation().x;
		int y = ElemOnMove.getLocation().y;
		actions.moveToElement(ConvertedMoved).pause(Duration.ofSeconds(0)).clickAndHold(ConvertedMoved)
				.pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(ElemOnMove).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}
	
	public boolean ConvertedAfterMoved() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ConvertedAfterMoved));
		return ConvertedAfterMoved.isDisplayed();
	}
	
	public void CreatedDate_Move() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(CreatedDateMoved));
		Actions actions = new Actions(ldriver);
		int x = ElemOnMove.getLocation().x;
		int y = ElemOnMove.getLocation().y;
		actions.moveToElement(CreatedDateMoved).pause(Duration.ofSeconds(0)).clickAndHold(CreatedDateMoved)
				.pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(ElemOnMove).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}

	public boolean CreatedDateAfterMoved() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(CreatedDateAfterMoved));
		return CreatedDateAfterMoved.isDisplayed();
	}

	public void AnnualRevenue_Move() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(AnnualRevenueMoved));
		Actions actions = new Actions(ldriver);
		int x = ElemOnMove.getLocation().x;
		int y = ElemOnMove.getLocation().y;
		actions.moveToElement(AnnualRevenueMoved).pause(Duration.ofSeconds(0)).clickAndHold(AnnualRevenueMoved)
				.pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(ElemOnMove).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}

	public boolean AnnualRevenueAfterMoved() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(AnnualRevenueAfterMoved));
		return AnnualRevenueAfterMoved.isDisplayed();
	}

	public void FirstName_Move() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(FirstNameMoved));
		Actions actions = new Actions(ldriver);
		int x = ElemOnMove.getLocation().x;
		int y = ElemOnMove.getLocation().y;
		actions.moveToElement(FirstNameMoved).pause(Duration.ofSeconds(0)).clickAndHold(FirstNameMoved)
				.pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(ElemOnMove).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}

	public boolean FirstNameAfterMoved() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(FirstNameAfterMoved));
		return FirstNameAfterMoved.isDisplayed();
	}
    
    
	
	
//-----------------------Lead Attribute(FIRST NAME)--------------------------//
	
	
	public void ScrollIntoViewFirstNameScroll() {
		((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", FirstNameScroll);
	}
	
	public void ClickonLeadAttr() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(LeadAttr));
		LeadAttr.click();
	}
	
	public void FirstName_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(FirstName));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(FirstName).pause(Duration.ofSeconds(0)).clickAndHold(FirstName).pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}
	
	public void ClickOnFirstNameInAddbtn() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(FirstNameInAddbtn));
		FirstNameInAddbtn.click();
	}
	
	public void ClickOnFirstNameInAddAttr1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(FirstNameInAddAttr1));
		FirstNameInAddAttr1.click();
	}
	public void ClickOnFirstNameInAddAttr2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(FirstNameInAddAttr2));
		FirstNameInAddAttr2.click();
	}
		
   public void InputFirstNameContains() {
   new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(FirstNameContainsInput));
   FirstNameContainsInput.sendKeys("Testing With Automation!!");
		
		
	}
	public void ProgressSpinner() {
		  new WebDriverWait(ldriver, Duration.ofSeconds(70)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//mat-progress-spinner[@role=\"progressbar\"]")));
	}

	
//------------------------Lead Attribute(ANNUAL REVENUE)------------------------//
	
	public void ScrollIntoViewLeadAnnualRevenue() {
		((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", LeadAnnualRevenue);
	}
	
	public void LeadAnnualRevenue_DND() {
		new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(LeadAnnualRevenue));
		Actions actions = new Actions(ldriver);
		int x = AddField.getLocation().x;
		int y = AddField.getLocation().y;
		actions.moveToElement(LeadAnnualRevenue).pause(Duration.ofSeconds(0)).clickAndHold(LeadAnnualRevenue)
				.pause(Duration.ofSeconds(0))
				// .moveByOffset(x, y)
				.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
	}
	
	public void ClickOnLeadAnnualInAddAttr1() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(LeadAnnualAddAttr1));
		LeadAnnualAddAttr1.click();
	}
	public void ClickOnLeadAnnualInAddAttr2() {
		new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(LeadAnnualAddAttr2));
		LeadAnnualAddAttr2.click();
	}
		
	
	//------------------------Lead Attribute(CREATED DATE)------------------------//
	
	
	
	public void ScrollIntoViewLeadCreatedDate() {
		((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", LeadCreatedDate);
	}  
	
		public void LeadCreatedDate_DND() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(LeadCreatedDate));
			Actions actions = new Actions(ldriver);
			int x = AddField.getLocation().x;
			int y = AddField.getLocation().y;
			actions.moveToElement(LeadCreatedDate).pause(Duration.ofSeconds(0)).clickAndHold(LeadCreatedDate)
					.pause(Duration.ofSeconds(0))
					// .moveByOffset(x, y)
					.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
		}
			
		
//---------------------------Lead Attribute(CONVERTED)-------------------------//
		
		public void ScrollIntoViewConverted() {
			((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", Converted);
		}
		
		public void Converted_DND() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(Converted));
			Actions actions = new Actions(ldriver);
			int x = AddField.getLocation().x;
			int y = AddField.getLocation().y;
			actions.moveToElement(Converted).pause(Duration.ofSeconds(0)).clickAndHold(Converted)
					.pause(Duration.ofSeconds(0))
					// .moveByOffset(x, y)
					.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
		}
		
		public void InputConvertedTrue() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ConvertedIsTrue));
			ConvertedIsTrue.click();
		}

		public void InputConvertedFalse() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ConvertedIsFalse));
			ConvertedIsFalse.click();
		}
		
		
	//----------------------------Smart Lead Attribute(CITY)---------------------------//
		
		public void ScrollIntoViewSmartLead() {
			((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", SmartLeadAttr);
		}  
		
		public void ClickonSmartLeadAttr() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(SmartLeadAttr));
			SmartLeadAttr.click();
		}
		
		public void City_DND() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(City));
			Actions actions = new Actions(ldriver);
			int x = AddField.getLocation().x;
			int y = AddField.getLocation().y;
			actions.moveToElement(City).pause(Duration.ofSeconds(0)).clickAndHold(City).pause(Duration.ofSeconds(0))
					// .moveByOffset(x, y)
					.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
		}
		public void ClickOnCityInAddbtn() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(CityInAddbtn));
			CityInAddbtn.click();
		}
		
		public void ClickOnCityAddAttr1() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(CityAddAttr1));
			CityAddAttr1.click();
		}
		public void ClickOnCityAddAttr2() {
			new WebDriverWait(ldriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(CityAddAttr2));
			CityAddAttr2.click();
		}
		
		
	 //-----------------------Lead Activity Attribute(ACCOUNT ID)-----------------------//
		
		public void ScrollIntoViewLeadActivityAttr() {
			((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", LeadActivityAttr);
		}  
		
		public void ClickonLeadActivityAttr() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(LeadActivityAttr));
			LeadActivityAttr.click();
		}
		public void ScrollIntoViewLeadAccountId() {
			((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", LeadAccountId);
		}  
		public void LeadAccountId_DND() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(LeadAccountId));
			Actions actions = new Actions(ldriver);
			int x = AddField.getLocation().x;
			int y = AddField.getLocation().y;
			actions.moveToElement(LeadAccountId).pause(Duration.ofSeconds(0)).clickAndHold(LeadAccountId).pause(Duration.ofSeconds(0))
					// .moveByOffset(x, y)
					.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
		}
		
		
	//---------------------Lead Account attribute(TASK)-----------------------------------//
		
		public void LeadTask_DND() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(LeadTask));
			Actions actions = new Actions(ldriver);
			int x = AddField.getLocation().x;
			int y = AddField.getLocation().y;
			actions.moveToElement(LeadTask).pause(Duration.ofSeconds(0)).clickAndHold(LeadTask).pause(Duration.ofSeconds(0))
					// .moveByOffset(x, y)
					.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
     }
		
  //-------------------------Lead Activity attribute(DURATION)---------------------------//
		
		public void ScrollIntoViewLeadDuration() {
			((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", LeadDuration);
		}  
				
		public void LeadDuration_DND() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(LeadDuration));
			Actions actions = new Actions(ldriver);
			int x = AddField.getLocation().x;
			int y = AddField.getLocation().y;
			actions.moveToElement(LeadDuration).pause(Duration.ofSeconds(0)).clickAndHold(LeadDuration).pause(Duration.ofSeconds(0))
					// .moveByOffset(x, y)
					.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
		}
		
 //-------------------------Lead Activity attribute(COMPLETED DATE)---------------------------//
		
		public void ScrollIntoViewLeadCompletedDate() {
			((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", LeadCompletedDate);
		}  
				
		public void LeadCompletedDate_DND() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(LeadCompletedDate));
			Actions actions = new Actions(ldriver);
			int x = AddField.getLocation().x;
			int y = AddField.getLocation().y;
			actions.moveToElement(LeadCompletedDate).pause(Duration.ofSeconds(0)).clickAndHold(LeadCompletedDate).pause(Duration.ofSeconds(0))
					// .moveByOffset(x, y)
					.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
		}
		
		
	//------------------System Lead Attribute(LAST ROUTED DATE)-----------------------//
		 
		public void ScrollIntoViewSysLeadAttr() {
			((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", SysLeadAttr);
		}  
			
		
		public void ClickOnSysLeadAttr() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(SysLeadAttr));
			SysLeadAttr.click();
		}
		public void ScrollIntoViewLeadLastRouted() {
			((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", LeadLastRouted);
		}  
			
		
		public void LeadLastRouted_DND() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(LeadLastRouted));
			Actions actions = new Actions(ldriver);
			int x = AddField.getLocation().x;
			int y = AddField.getLocation().y;
			actions.moveToElement(LeadLastRouted).pause(Duration.ofSeconds(0)).clickAndHold(LeadLastRouted)
					.pause(Duration.ofSeconds(0))
					// .moveByOffset(x, y)
					.moveToElement(AddField).moveByOffset(x, y).pause(Duration.ofSeconds(0)).release().build().perform();
		}

		public void ClickOnApprove() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(btnApprove));
		//	btnApprove.click();
			JavascriptExecutor js = (JavascriptExecutor) ldriver;
			js.executeScript("arguments[0].click()", btnApprove);
		}
		
		public void ClickOnApproveSubmit() {
			new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ApproveSubmitbtn));
			//ApproveSubmitbtn.click();
			JavascriptExecutor js = (JavascriptExecutor) ldriver;
			js.executeScript("arguments[0].click()", ApproveSubmitbtn);
		}		
//		public boolean DisplayApproved() {
//	    	new WebDriverWait(ldriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(Approved));
//			return Approved.isDisplayed();
//		}
}



