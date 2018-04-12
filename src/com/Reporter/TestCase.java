package com.Reporter;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

@Test
public class TestCase {
	WebDriver d;
	static ExtentReports reports = ExtentReports.get(ExtentReports.class);

	@Test(priority = 1)
	public void Launch() {
		reports.init("D:\\MS OFFICE\\Selenium ScreenShots\\Reports\\TestingReports.html", true);
		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=86KmWrHdDoeGX97pudgG/");

	}

	@Test(priority = 2)
	public void TestTitle() throws Exception {
		reports.startTest("Testing send key");
		d.manage().timeouts().implicitlyWait(10l, TimeUnit.SECONDS);
		d.manage().timeouts().pageLoadTimeout(20l, TimeUnit.SECONDS);
		reports.log(LogStatus.INFO, "writing to input box");
		d.findElement(By.xpath(".//*[@id='lst-ib']")).sendKeys("Selenium Rocks");
		File screen = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen, new File("D:\\MS OFFICE\\Selenium ScreenShots\\err.jpg"));
		reports.log(LogStatus.PASS, "succesfully Captured Screen Shot");
	}

	@Test(priority = 3, dependsOnMethods = { "TestTitle" })
	public void click() {

		reports.startTest("Click Starting");
		reports.attachScreenshot("D:\\MS OFFICE\\Selenium ScreenShots\\err.jpg");

		try {
			reports.log(LogStatus.FAIL, "Failed While Clicking");
			Assert.fail();

			d.findElement(By.xpath("safas")).click();
		} catch (Exception e) {
			reports.attachScreenshot("D:\\MS OFFICE\\Selenium ScreenShots\\err.jpg");

		}
	}

	@Test(priority = 4)
	public void close() {
		d.close();
	}
}
