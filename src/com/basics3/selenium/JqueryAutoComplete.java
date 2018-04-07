package com.basics3.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryAutoComplete {

	static String m;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("http://www.google.co.in");
		d.manage().window().maximize();
		d.findElement(By.name("q")).sendKeys("s");
		// d.findElement(By.xpath(".//*[@id='ui-id-45']")).click();
		List<WebElement> opt = d.findElements(By.tagName("li"));
		for (WebElement o : opt) {
			String s = o.getText();
			System.out.println(s);
		}
		System.out.println("ff");

	}

}
