package com.ecommerence.testcases;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.ecommerence.baseclass.BaseTest;
import com.ecommerence.pom.CreateLoginAccount;

public class TC_002_CreateLoginTestcase extends BaseTest{
	
	//WebDriver driver;

	
	private static final Logger logger=Logger.getLogger(TC_002_CreateLoginTestcase.class);
	@Test
	public void createlogin() 
	{
		CreateLoginAccount cl=new CreateLoginAccount(driver);
		cl.Aclick();
		logger.info("==================clicked-----------------------");
		cl.creataccount();
		logger.info("==================create account-----------------------");
		cl.Efirstname();
		logger.info("==================Enter firstname-----------------------");
		cl.Elastname();
		logger.info("==================Enter lastname-----------------------");
		cl.Email();
		logger.info("==================Entered email-----------------------");
		cl.Epassword();
		logger.info("==================Entered password-----------------------");
		cl.Epwdconfirm();
		logger.info("==================Passwrod confirmation-----------------------");
		cl.Register();
		logger.info("==================Registered-----------------------");
		
		
	}
	
}
