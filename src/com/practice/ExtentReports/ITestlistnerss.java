package com.practice.ExtentReports;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestlistnerss extends Reports implements ITestListener {

	public static ChromeDriver d;

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			System.out.println("Test Failure");
			int i = 1;
			i++;
			File screen = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screen, new File("D:\\MS OFFICE\\Selenium ScreenShots\\Testing in process\\screen.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Percentage");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("On Test Start");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test Started");
	}

}
