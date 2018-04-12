package com.Listner.Basics;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {
	WebDriver d;

	@Test(priority = 1)
	public void launch() throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("http://www.google.co.in");
		File screen = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen, new File("D:\\MS OFFICE\\Selenium ScreenShots\\errors1.jpg"));

	}

	@Test(priority = 2)
	public void navigate() {

		d.manage().window().maximize();

	}

	@Test(priority = 3)
	public void sendkeys() {
		Assert.fail();
		d.findElement(By.xpath("saf")).sendKeys("Sunil");

	}

	public void ScreenShot(String Methodname) throws Exception {
		File screen = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen, new File("D:\\MS OFFICE\\Selenium ScreenShots\\errors.jpg"));
	}
}
