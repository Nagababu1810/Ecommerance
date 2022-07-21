package com.ecommerence.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.ecommerence.baseclass.BaseTest;
import com.ecommerence.pom.LoginPage;

public class TC_008_VerifyDashboard extends BaseTest {

	
	
	
	@Test
	public void VerifyDashboard() throws InterruptedException {
		
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
		
		
		
		List<WebElement> tabledata=driver.findElements(By.xpath("//table[@id='my-orders-table']"));
		
		for(WebElement data:tabledata) {
			
			System.out.println(data.getText());
			
			
			//no of columns
			
		int columns= driver.findElements(By.xpath("//table[@id='my-orders-table']//thead//th")).size();
		System.out.println("No of columns:"+columns);	
		
			
		int rows=driver.findElements(By.xpath("//table[@id='my-orders-table']//tbody//tr")).size();
			System.out.println("No of rows:"+rows);
		}
	
		int celldata=driver.findElements(By.xpath("//table[@id='my-orders-table']//tbody//td")).size();
		System.out.println("Total no of celldata:"+celldata);
	}
	
	
}
