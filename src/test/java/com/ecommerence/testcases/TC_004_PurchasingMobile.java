package com.ecommerence.testcases;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ecommerence.baseclass.BaseTest;
import com.ecommerence.pom.AddtoCartPage;
import com.ecommerence.pom.LoginPage;
import com.ecommerence.pom.MobilePage;
import com.ecommerence.pom.PlaceOfOrderpage;
import com.ecommerence.pom.ProccedtoCheckoutPage;

public class TC_004_PurchasingMobile  extends BaseTest {
	private static final Logger logger=Logger.getLogger(TC_004_PurchasingMobile.class);

	@Test
	public void mobile_buying() throws InterruptedException 
	{
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
		
		Thread.sleep(2000);
		
		
		MobilePage mp= new MobilePage(driver);
		mp.mobilepg();
		logger.info("=====clicked mobilepage======");
		Thread.sleep(2000);
		
		AddtoCartPage acp= new AddtoCartPage(driver);
		acp.clickaddtocart();
		logger.info("=======clicked add to cart======");
		Thread.sleep(2000);
		
		ProccedtoCheckoutPage pcp=new ProccedtoCheckoutPage(driver);	
		pcp.prochkoutpage();
		logger.info("=======procced add to cart==========");
		
		Thread.sleep(2000);
		
		PlaceOfOrderpage pop= new PlaceOfOrderpage(driver);
		pop.PlaceOfOrder();
		logger.info("==================Proced place of order=========");
		pop.Continubtn();
		logger.info("============proced continue button==========");
		pop.moneyorderbtn();
		logger.info("=================proceed order button==============");
		pop.paymentsconu1();
		logger.info("===============procced paymet page=============");
		pop.placeorderbtn();
		logger.info("=============procced place of order=================");
		
	boolean title=driver.findElement(By.xpath("//div[@class='page-title']")).isDisplayed();
		
	Assert.assertTrue(title);
		
	driver.findElement(By.linkText("here to print")).click();
	
	
	}
	
	
	
	
	
	
}
