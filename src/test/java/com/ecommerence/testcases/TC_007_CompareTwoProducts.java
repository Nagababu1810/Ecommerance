package com.ecommerence.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.ecommerence.baseclass.BaseTest;
import com.ecommerence.pom.AddtoComparepage;
import com.ecommerence.pom.ComparePage;
import com.ecommerence.pom.LoginPage;
import com.ecommerence.pom.MobilePage;
import com.ecommerence.pom.TVPage;

public class TC_007_CompareTwoProducts extends BaseTest{

	@Test
	public void compareproducts() throws InterruptedException {
		
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
		
		MobilePage mp= new MobilePage(driver);
		mp.mobilepg();
		Thread.sleep(2000);
		
		TVPage tvpg= new TVPage(driver);
		tvpg.ClKTV();
		Thread.sleep(2000);
		
		//AddtoComparepage acp=new AddtoComparepage(driver);
		//acp.AddToComp();
		//acp.AddToComp();
		//ComparePage cp=new ComparePage(driver);
		//cp.comparepg();
		
		//Thread.sleep(2000);
		
		ComparePage cp=new ComparePage(driver);
		cp.comparepg();
		Thread.sleep(2000);
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("Window.ScrollBy(0,1000)");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@title='Close Window']")).click();
	}
	
}
