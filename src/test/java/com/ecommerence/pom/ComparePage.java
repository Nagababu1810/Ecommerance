package com.ecommerence.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComparePage {

	public WebDriver driver;
	@FindBy(xpath="//button[@title='Compare']") public WebElement compage;
	
	
	public ComparePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void comparepg() {
		
		compage.click();
	}
}
