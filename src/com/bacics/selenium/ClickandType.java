package com.bacics.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickandType {

	static WebDriver d;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://www.javatpoint.com/java-tutorial");
		d.manage().window().maximize();
		List<WebElement> wb = d.findElements(By.tagName("a"));
		int visiblelinks = 0;
		int hiddenlinks = 0;
		for (WebElement list : wb) {
			String s3 = list.getText();
			if (s3.length() != 0) {
				visiblelinks++;
			} else {
				hiddenlinks++;
			}

			System.out.println(s3);

		}
		System.out.println("Hidden Links nos" + hiddenlinks);
		System.out.println("visible Links nos" + visiblelinks);
	}
}
