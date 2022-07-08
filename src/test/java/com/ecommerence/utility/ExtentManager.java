package com.ecommerence.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.ecommerence.baseclass.BaseTest;



public class ExtentManager extends BaseTest implements ITestListener
{

	public ExtentReports report;
	public ExtentTest test; 
	public ExtentHtmlReporter htmlreporter;
	
	public void onStart(ITestContext context) {
		
		String timestamp=new SimpleDateFormat("yyyy.MM.dd.hh.ss").format(new Date());
		String RepName="test-Output"+timestamp+".html";
		
		
		htmlreporter= new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-Output/"+RepName);
		htmlreporter.loadXMLConfig(System.getProperty("user.dir")+"/ExtentReport-Config.xml");
		
	
		
		
		report= new ExtentReports();
		report.attachReporter(htmlreporter);
		report.setSystemInfo("os", "windows10");
		report.setSystemInfo("Tester", "Nagababu");
		report.setSystemInfo("Testing", "Automation");
		
		htmlreporter.config().setDocumentTitle("Automation testing");
		htmlreporter.config().setTheme(Theme.DARK);
		htmlreporter.config().setReportName("Automation report");
		
		
		
	}
	
	public void onTestSuccess(ITestResult result) 
	{
		test=report.createTest(result.getName());
		test.log(Status.PASS, MarkupHelper.createLabel(result.getName(),ExtentColor.GREEN));
		
		
	}
	public void onTestFailure(ITestResult result) {
		
		test=report.createTest(result.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel(result.getName(), ExtentColor.RED));
		
		
		
		String screenshotpath= System.getProperty("user.dir")+".\\Screenshots\\"+result.getName()+".png";
	
		
		File f= new File(screenshotpath); 
				
			
	if(f.exists()) {
		
		try {
			test.fail("Screenshot is below"+test.addScreenCaptureFromPath(screenshotpath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
		
	}
	
		
	
	
	public void onTestSkipped(ITestResult result) {
		
		test=report.createTest(result.getName());
		test.log(Status.SKIP,MarkupHelper.createLabel(result.getName(),ExtentColor.ORANGE));
		
	}
	
	public void onFinish(ITestContext context) {
		
		
		report.flush();
		
	}
	
	

	
	
	
	
}
