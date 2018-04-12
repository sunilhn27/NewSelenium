package com.Reporter;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class ExtendRepo {

	public static final ExtentReports report = ExtentReports.get(ExtendRepo.class);
	public static ChromeDriver d;

	@BeforeTest
	public void init() {
		report.init("D:\\MS OFFICE\\Selenium ScreenShots\\Reports\\Report.html", true);
		// driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		d = new ChromeDriver();

	}

	@Test
	public void verifyTitle() {
		report.startTest("Verify Title Test");
		report.log(LogStatus.INFO, "Firefox launched");
		System.out.println("asdsad");
		d.get("https://www.google.co.in");
		report.log(LogStatus.INFO, "navigated to Gmail.com");
		String actual_title = d.getTitle();
		Assert.assertEquals(actual_title, d.getTitle());

		report.log(LogStatus.PASS, "Title verified");

		report.attachScreenshot("D:\\MS OFFICE\\Selenium ScreenShots\\shot.jpg");

	}

	@Test(dependsOnMethods = "verifyTitle")
	public void verifyLogin() {

		report.startTest("Verify Login Test");

		try {
			Assert.fail();
			
		} catch (Throwable t) {

			report.log(LogStatus.FAIL, "Login Failed");
			report.attachScreenshot("D:\\MS OFFICE\\Selenium ScreenShots\\shot.jpg");

		}
	}

	@AfterTest
	public void tearDown() {
		d.quit();
		report.endTest();
	}

}
