package com.ecommerence.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCartPage {

	public WebDriver driver;
	@FindBy(xpath="//button[@title='Add to Cart']") public WebElement addtocart;
	
	
	
	public AddtoCartPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		driver=this.driver;
	}
	
	public void clickaddtocart() {
		
		addtocart.click();
	}
	
	
}
