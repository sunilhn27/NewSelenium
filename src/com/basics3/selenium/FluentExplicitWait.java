package com.basics3.selenium;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://www.google.co.in");
		d.manage().timeouts().implicitlyWait(10l, TimeUnit.SECONDS);
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(d);
		wait.withTimeout(20l, TimeUnit.SECONDS).pollingEvery(4, TimeUnit.SECONDS).ignoring(NoSuchElementException.class)
				.withMessage("Could not find the element");
		d.findElement(By.xpath(".//*[@id='lst-ib']")).sendKeys("selenium");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='sbse3']/div[2]"))).click();
		Thread.sleep(3000);
	}
}
