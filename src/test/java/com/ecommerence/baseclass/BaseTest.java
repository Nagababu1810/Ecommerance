package com.ecommerence.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.ecommerence.utility.ReadConfig;

public class BaseTest {

	public WebDriver driver;
	
	public Properties p;
	public FileInputStream fis;
	public String projectpath=System.getProperty("user.dir");
	
	public ReadConfig readconfig= new ReadConfig();
	
	@Parameters("browser")
	@BeforeMethod
	public void setup(String browser) throws IOException

	{
		fis= new FileInputStream(projectpath+".//Log4jConfig.properties");
		PropertyConfigurator.configure(fis);
		
		if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", readconfig.getchropath());
		driver= new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", readconfig.getfirefoxpath());
			driver= new FirefoxDriver();
			}
		else if(browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", readconfig.getedgepath());
			driver= new EdgeDriver();
			}
		
		
		driver.get(readconfig.geturl());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	}
	
	@AfterMethod
	public void teardown() {
		
		driver.close();
	}
	
	public static String getscreenshot(WebDriver driver,String ScreenshotName) throws IOException
	{
	//TakesScreenshot ts= (TakesScreenshot)driver;
	//File Source=ts.getScreenshotAs(OutputType.FILE);
	//String destionation=System.getProperty("user.dir")+"./Screenshots/"+".png";
	//FileHandler.copy(Source, destionation);
	
	String destination =System.getProperty("user.dir")+"./Screenshots/"+ScreenshotName +".png";
	File filedestination= new File(destination);
	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		//FileUtils.copyFile(src, destination);
	FileHandler.copy(src, filedestination);
	return destination;
	
	}
	
	public void waitforelement(WebDriver driver, WebElement  locator,Duration timeout) {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	if(wait.equals("clickable")) {
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}else if(wait.equals("visible")) {
		wait.until(ExpectedConditions.visibilityOf(locator));
	}
	
	
	
	}
	

}
