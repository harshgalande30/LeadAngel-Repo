package com.leadAngel.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig()
	{
		File src = new File("./Configuration/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is" + e.getMessage());
		}
	}
	 
	public String getApplicationURL()
	{
		String url = pro.getProperty("baseURL");
		return url;
	} 
	public String verifyApplicationURL()
	{
		String vurl = pro.getProperty("verifyURL");
		return vurl;
	}
	public String getClientid()
	{
		String cid = pro.getProperty("clientid");
		return cid;
	}
	public String cidNotsso()
	{
		String cidNsso = pro.getProperty("clientidNotSSO");
		return cidNsso;
	}
	public String getEmail()
	{
		String email = pro.getProperty("emailid");
		return email;
	}
	
	public String getEmailStandard()
	{
		String emailstandard = pro.getProperty("emailidstandard");
		return emailstandard;
	}
	
	public String getWemail()
	{
		String Wemail = pro.getProperty("Wemailid");
		return Wemail;
	}
	public String getPassword()
	{
		String pwd = pro.getProperty("password");
		return pwd;
	}
	public String getWPassword()
	{
		String pwd = pro.getProperty("Wpassword");
		return pwd;		
	}
	public String setWclientid() {
		String Wcid = pro.getProperty("Wclientid");
		return Wcid;
	}
	public String getChromePath()
	{
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}
	public String getEdgePath()
	{
		String edgepath = pro.getProperty("edgepath");
		return edgepath;
	}
	public String getFirefoxPath()
	{
		String firefoxpath = pro.getProperty("firefoxpath");
		return firefoxpath;
	}
	public String getsignUpURL()
	{
		String signupUrl = pro.getProperty("signupURL");
		return signupUrl;
	}
	
}
