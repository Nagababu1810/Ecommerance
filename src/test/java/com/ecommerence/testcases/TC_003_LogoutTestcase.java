package com.ecommerence.testcases;

import org.testng.annotations.Test;

import com.ecommerence.baseclass.BaseTest;
import com.ecommerence.pom.LoginPage;
import com.ecommerence.pom.Logoutpage;

public class TC_003_LogoutTestcase extends BaseTest {

	 //public WebDriver driver;
	
	@Test
	public void Logout()  {
		
		LoginPage loginp=new LoginPage(driver);
		//logger.info("===TC_001 Started========");
		loginp.Account();
		//logger.info("===clicked Account===");
		loginp.Accountlogin();
		//logger.info("=======clicked login======");
		loginp.Eusername();
		//logger.info("=======enter username======");
		loginp.Epassword();
		//logger.info("====enter password====");
		loginp.clickbtn();
		//logger.info("====clicked login button====");
		
		
		
		
		Logoutpage lp=new Logoutpage(driver);
		lp.CAbtn();
		lp.logoutbtn();
	}
	
}
