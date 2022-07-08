package com.ecommerence.testcases;



import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ecommerence.baseclass.BaseTest;
import com.ecommerence.pom.LoginPage;

public class TC_001_loginTestcase  extends BaseTest{


	//Logger logger=logger.getLogger(TC_001_loginTestcase.class);
	//private static final Logger log=log.getloggr(TC_001_loginTestcase.class);
	private static final Logger logger = Logger.getLogger(TC_001_loginTestcase.class);

	@Test
	public void login() {
		
		LoginPage loginp=new LoginPage(driver);
		logger.info("===TC_001 Started========");
		loginp.Account();
		logger.info("===clicked Account===");
		loginp.Accountlogin();
		logger.info("=======clicked login======");
		loginp.Eusername();
		logger.info("=======enter username======");
		loginp.Epassword();
		logger.info("====enter password====");
		loginp.clickbtn();
		logger.info("====clicked login button====");
		
		
		if(driver.getTitle().equals("My Account")) {
			Assert.assertTrue(true);
			logger.info("=====Testcases  title passed====");
		}
		else  
		{
			Assert.assertTrue(false);
			logger.info("====Title failed=====");
			
		}
		
		logger.info("======TC_001 Ended======");
	}

}
