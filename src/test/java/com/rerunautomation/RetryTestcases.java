package com.rerunautomation;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTestcases implements IRetryAnalyzer{

	private int retrycount=0;
	private static final int maxcount=5;
	
	
	@Override
	public boolean retry(ITestResult result) {
	
		if(retrycount < maxcount) {
			retrycount++;
		}
		
		return false;
	}

}
