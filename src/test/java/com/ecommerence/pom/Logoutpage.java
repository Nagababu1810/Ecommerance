package com.ecommerence.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutpage  {

	WebDriver driver; 
	
	@FindBy(xpath="//a[@class='skip-link skip-account']") public WebElement CAcc;
	@FindBy(xpath="//a[text()='Log Out']")public WebElement Clogout;
	
	public Logoutpage(WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this);
		driver=this.driver;
	}
	
	
	public void CAbtn() {
		
		CAcc.click();
	}
	
	public void logoutbtn() {
		Clogout.click();
	}
	
}
