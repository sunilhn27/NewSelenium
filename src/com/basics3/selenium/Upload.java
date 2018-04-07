package com.basics3.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://upload.cat/");
		d.manage().window().maximize();
		d.findElement(By.xpath(".//*[@id='initialUploadSection']/div[1]/div[2]/div"))
				.sendKeys("D:\\photos\\Car&bike wallpaper\\RD.jpg");
	}
}
