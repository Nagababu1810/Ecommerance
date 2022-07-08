package com.ecommerence.testcases;

import org.testng.annotations.Test;

import com.ecommerence.baseclass.BaseTest;
import com.ecommerence.pom.CreateLoginAccount;

public class TC_002_CreateLoginTestcase extends BaseTest{
	//WebDriver driver;

	@Test
	public void createlogin() 
	{
		CreateLoginAccount cl=new CreateLoginAccount(driver);
		cl.Aclick();
		
		cl.creataccount();
		cl.Efirstname();
		cl.Elastname();
		cl.Email();
		cl.Epassword();
		cl.Epwdconfirm();
		cl.Register();
		
		
	}
	
}
