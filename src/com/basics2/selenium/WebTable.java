package com.basics2.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		d.manage().window().maximize();

		List<WebElement> links = d.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td/a"));
		for (WebElement l : links) {
			String s = l.getText();
			System.out.println(s);
		}

	}
}
