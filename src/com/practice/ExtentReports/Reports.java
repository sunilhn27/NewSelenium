package com.practice.ExtentReports;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

@Test
public class Reports {

	WebDriver d;
	ExtentReports reports = ExtentReports.get(Reports.class);

	public void launch() {
		reports.init("D:\\MS OFFICE\\Selenium ScreenShots\\Testing in process\\Reoprts.html", true);
		reports.startTest("launch");
		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://www.google.com");
		reports.log(LogStatus.PASS, "succesfully passed");
	}

	@Test
	public void navigate() throws InterruptedException {
		reports.startTest("Navigate");
		d.findElement(By.xpath(".//*[@id='lst-ib']")).sendKeys("selenium");
		d.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[1]")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		d.navigate().back();
		reports.log(LogStatus.FAIL, "Passed navigate");
	}

	@Test
	public void Forward() throws InterruptedException {
		reports.startTest("Forward");
		d.navigate().forward();
		reports.log(LogStatus.FAIL, "FAILED");
		reports.attachScreenshot("screen.jpg");
		Assert.fail();
	}

	@Test(priority = 6)
	public void close() {
		reports.startTest("close");
		d.close();
	}
}
