package com.leadAngel.testCases;

import java.io.IOException;

import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.leadAngel.pageObjects.LoginPage;
import com.leadAngel.utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass

{
	private final static Logger Logger = org.apache.logging.log4j.LogManager.getLogger(TC_LoginDDT_002.class);
	@Test(dataProvider="LoginData")
	public void loginDDT(String cid, String email, String pwd) throws InterruptedException
	{
		//Logger Logger = LogManager.getLogger(TC_LoginDDT_002.class);
		LoginPage lp = new LoginPage(driver);
		lp.setClientId(cid);
		Logger.info("Entered ClientID");
		Logger.info(cid);
		lp.setEmail(email);
		Logger.info("Entered Email");
		Logger.info(email);
		lp.setPassword(pwd);
		Logger.info("Entered Password");
		Logger.info(pwd);
		lp.clickSubmit();
		Logger.info("Clicked on Submit");
		Thread.sleep(2000);
		
	}
	
	
	
	
	@DataProvider(name="LoginData")
	String[][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/leadAngel/testData/LoginData.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path, "Sheet1", 1);
		
		String logindata[][]= new String [rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
		return logindata;
	}
	
}