package com.basics2.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("http://demo.guru99.com/test/delete_customer.php");
		d.manage().window().maximize();
		d.findElement(By.name("submit")).click();
		org.openqa.selenium.Alert alert = d.switchTo().alert();
		System.out.println("switched");
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		org.openqa.selenium.Alert alert1 = d.switchTo().alert();
		alert1.accept();

	}
}
