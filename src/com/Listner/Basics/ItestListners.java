package com.Listner.Basics;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ItestListners extends TestClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {

		System.out.println("Test Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {

		System.out.println("Success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			TestClass s = new TestClass();
			s.ScreenShot(result.getName().toString().trim());
		} catch (Exception e) {
			System.out.println("Failed" + result.getName());
			e.printStackTrace();
		}
		System.out.println("test Failed" + result.getName().toString().trim());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test Started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test Finished");
	}

}
