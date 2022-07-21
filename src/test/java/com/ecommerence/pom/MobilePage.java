package com.ecommerence.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobilePage {
	public WebDriver driver;

	@FindBy(xpath="//a[text()='Mobile']") public WebElement mpg;
	
	
	public MobilePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void mobilepg() {
		mpg.click();
	}
	
}
