package com.ecommerence.pom;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TVPage {
	
	public WebDriver driver;

	@FindBy(xpath="//a[text()='TV']") public WebElement clicktv;
	
	
	public TVPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}

	public void ClKTV() {
		
		clicktv.click();
		
	}
	
}
