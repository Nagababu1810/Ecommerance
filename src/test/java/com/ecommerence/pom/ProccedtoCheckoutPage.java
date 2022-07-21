package com.ecommerence.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProccedtoCheckoutPage {
	public WebDriver driver;

	@FindBy(xpath="//button[@title='Proceed to Checkout']") public WebElement chkoutpg;
	
	
	public ProccedtoCheckoutPage(WebDriver driver) {
		
	
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void  prochkoutpage() {
		chkoutpg.click();
	}
}
