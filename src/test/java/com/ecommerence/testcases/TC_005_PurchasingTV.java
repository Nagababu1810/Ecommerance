package com.ecommerence.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ecommerence.baseclass.BaseTest;
import com.ecommerence.pom.AddtoCartPage;
import com.ecommerence.pom.LoginPage;
import com.ecommerence.pom.PlaceOfOrderpage;
import com.ecommerence.pom.ProccedtoCheckoutPage;
import com.ecommerence.pom.TVPage;

public class TC_005_PurchasingTV extends BaseTest {
	//public Webdriver driver;

	
	@Test
	public void TV_buying() throws InterruptedException 
	{
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
		
		Thread.sleep(2000);
		
		
		TVPage tvpg= new TVPage(driver);
		tvpg.ClKTV();
		
		AddtoCartPage acp= new AddtoCartPage(driver);
		acp.clickaddtocart();
		Thread.sleep(2000);
		
		ProccedtoCheckoutPage pcp=new ProccedtoCheckoutPage(driver);	
		pcp.prochkoutpage();
		
		Thread.sleep(2000);
		
		PlaceOfOrderpage pop= new PlaceOfOrderpage(driver);
		pop.PlaceOfOrder();
		pop.Continubtn();
		pop.moneyorderbtn();
		pop.paymentsconu1();
		pop.placeorderbtn();
		
	boolean title=driver.findElement(By.xpath("//div[@class='page-title']")).isDisplayed();
		
	Assert.assertTrue(title);
		
	driver.findElement(By.linkText("here to print")).click();
	
	
	}
	
	
	
	
	
	
	
}
