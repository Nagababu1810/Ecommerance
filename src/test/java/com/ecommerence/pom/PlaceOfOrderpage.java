package com.ecommerence.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOfOrderpage {

	
	public WebDriver driver;
	
	@FindBy(xpath="//button[@title='Continue']") public WebElement placeofordercontinue;
	@FindBy(xpath="//button[@onclick='shippingMethod.save()'] ") public WebElement contubtn1;
	@FindBy(xpath="//button[@onclick='payment.save()'] ") public WebElement contubtn2;
	@FindBy(xpath="//button[@onclick='review.save();'] ") public WebElement placeorder;
	@FindBy(xpath="//input[@id='p_method_checkmo']") public WebElement moneyorder;
	
	public PlaceOfOrderpage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void PlaceOfOrder() {
		
		placeofordercontinue.click();
	}
	
	public void Continubtn() {
		
		contubtn1.click();
	}
	
	public void paymentsconu1() {
		
		contubtn2.click();
	}
	
	public void placeorderbtn() {
		
		placeorder.click();
	}
	public void moneyorderbtn() {
		
		moneyorder.click();
	}

	
	
	
	
	
}
