package com.ecommerence.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	public WebDriver driver;

	@FindBy(xpath="//input[contains(@placeholder ,'Search entire store here...')]") public WebElement sp;
	@FindBy(xpath="//button[contains(@class,'button search-button')]") public WebElement searcclk;
	
	public SearchPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void Product_search() {
		
		sp.sendKeys("iphone");
		searcclk.click();
	}
	
}
