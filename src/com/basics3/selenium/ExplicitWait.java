package com.basics3.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://www.google.co.in");
		// d.manage().timeouts().implicitlyWait(10l, TimeUnit.SECONDS);
		d.manage().timeouts().pageLoadTimeout(10l, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(d, 10l);
		d.findElement(By.xpath(".//*[@id='lst-ib']")).sendKeys("selenium");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='sbse4']/div[2]"))).click();
		Thread.sleep(2000);
		d.close();

	}
}
