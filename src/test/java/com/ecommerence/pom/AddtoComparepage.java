package com.ecommerence.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoComparepage {

	public WebDriver driver;
	
	@FindBy(xpath="//a[text()='Add to Compare']") public WebElement addtocomp;
	
	
	public AddtoComparepage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void AddToComp() {
		
		addtocomp.click();
	}
	
	
	
}
