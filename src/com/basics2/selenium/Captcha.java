package com.basics2.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Captcha {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		Thread.sleep(4000);
		d.findElement(By.xpath("html/body/div[2]/div/div/button")).click();
		Thread.sleep(4000);
		d.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div/div/div/div[2]/div[1]/a")).click();
		org.openqa.selenium.Alert alert = d.switchTo().alert();
		System.out.println("switched");
		System.out.println(alert.getText());
		alert.dismiss();

		// d.close();
		//
	}
}
