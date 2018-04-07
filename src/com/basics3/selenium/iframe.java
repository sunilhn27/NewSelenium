package com.basics3.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html?org/openqa/selenium/WebElement.html");
		d.switchTo().frame(0);
		List<WebElement> f = d.findElements(By.tagName("a"));
		for (WebElement links : f) {
			String li = links.getText();
			System.out.println(li);
		}
		System.out.println("********************************************************");
		
		d.switchTo().parentFrame();
		System.out.println("SWITCHED");
		d.switchTo().frame(1);
		List<WebElement> f1 = d.findElements(By.tagName("a"));
		for (WebElement links1 : f1) {
			String li = links1.getText();
			System.out.println(li);
		}

		System.out.println("********************************************************");
		
		d.switchTo().parentFrame();
		System.out.println("SWITCHED");
		d.switchTo().frame(2);
		List<WebElement> f2 = d.findElements(By.tagName("a"));
		for (WebElement links2 : f2) {
			String li = links2.getText();
			System.out.println(li);
		
		d.close();
	}
}
}