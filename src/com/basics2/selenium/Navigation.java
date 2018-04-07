package com.basics2.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.google.co.in");
		WebElement click = d.findElement(By.xpath(".//*[@id='fsr']/a[1]"));
		click.click();
		Thread.sleep(2000);
		d.navigate().back();
		System.out.println("back");
		d.manage().window().maximize();
		d.navigate().forward();
		System.out.println("forward");
		Thread.sleep(20000);
		d.close();
	}
}
