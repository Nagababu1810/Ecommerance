package com.ecommerence.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContinueShopingPage
{
	public WebDriver driver;

	@FindBy(xpath="//button[@title='Continue Shopping']") public WebElement cspg;
	
	
	public ContinueShopingPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void Contspg() {
		cspg.click();
	}
}
