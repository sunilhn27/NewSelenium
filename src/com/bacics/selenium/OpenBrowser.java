package com.bacics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	static WebDriver d;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		d = new ChromeDriver();
		System.out.println("opened");
		d.get("http://www.google.co.in");
		d.manage().window().maximize();
		WebElement fiels= d.findElement(By.cssSelector("#lst-ib"));
		fiels.sendKeys("Automatiion Rocks");
		Thread.sleep(20000);
		System.out.println("clsoing");
		d.close();
	}

}
