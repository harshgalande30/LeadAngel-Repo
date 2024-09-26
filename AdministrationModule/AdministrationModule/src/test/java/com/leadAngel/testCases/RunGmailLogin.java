package com.leadAngel.testCases;


import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.Link;
import com.mailosaur.models.Message;
import com.mailosaur.models.MessageSearchParams;
import com.mailosaur.models.SearchCriteria;

public class RunGmailLogin extends AutomateGmailAccount{
	private static final Logger Logger = LogManager.getLogger(RunGmailLogin.class);
	@Test
//	public void LoginGmailAccount() throws IOException, MailosaurException {
//		
//		String APIkey="uQg5vfG1Hz1RulP3qW345m25dZgbo4A7";
//		String serverId="rmjak4mf";
//		String serverDomain="rmjak4mf.mailosaur.net";
//		
//		
//		MailosaurClient mailosaur= new MailosaurClient(APIkey);
//		MessageSearchParams params= new MessageSearchParams();
//		params.withServer(serverId);
//		Logger.info("start");
//		SearchCriteria criteria=new SearchCriteria();
//		Logger.info("with");
//		criteria.withSentTo("smoke-struck@"+serverDomain);
//		Logger.info("mailsaur");
//		Message message=mailosaur.messages().get(params, criteria);
//		Logger.info("Subject: "+message.subject());
//		Logger.info("From: "+message.from().get(0).email());
//		Logger.info("To: "+message.to().get(0).email());
//		Logger.info("To: "+message.text().body());
//	    Logger.info("Number of Links: "+message.html().links().size());
//	    Link FirstLink = message.html().links().get(0);
//	    Logger.info("First Link: "+FirstLink.text());
//	    Logger.info("First Link: "+FirstLink.href());
//	}
	
	
	
	public void LoginGmailAccount() {
		Logger.info("--------------");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
