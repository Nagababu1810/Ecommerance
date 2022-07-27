package com.ecommerence.testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

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
	public void TV_buying() throws InterruptedException, AWTException 
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
		Thread.sleep(3000);
		
		AddtoCartPage acp= new AddtoCartPage(driver);
		acp.clickaddtocart();
		Thread.sleep(3000);
		
		ProccedtoCheckoutPage pcp=new ProccedtoCheckoutPage(driver);	
		pcp.prochkoutpage();
		
		Thread.sleep(5000);
		
		PlaceOfOrderpage pop= new PlaceOfOrderpage(driver);
		pop.PlaceOfOrder();
		pop.Continubtn();
		pop.moneyorderbtn();
		pop.paymentsconu1();
		pop.placeorderbtn();
		
		Thread.sleep(3000);
	boolean title=driver.findElement(By.xpath("//div[@class='page-title']")).isDisplayed();
		
	Assert.assertTrue(title);
		
	//driver.findElement(By.linkText("here to print")).click();
	driver.findElement(By.xpath("//*[@id='sidebar']//print-preview-button-strip//div/cr-button[1]")).click();
	//*[@id="sidebar"]//print-preview-button-strip//div/cr-button[1]
	
	Robot rb=new Robot();
	rb.delay(3000);
	
	
	//put path to file in a clipboard
			StringSelection ss= new StringSelection("New file");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			
		//past the path
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			
			//Enter
			
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
	
	}
	
	
	
	
	
	
	
}
