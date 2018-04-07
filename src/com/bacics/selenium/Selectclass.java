package com.bacics.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclass {

	static WebDriver d;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://www.wikipedia.org/");
		d.manage().window().maximize();
		Select sc = new Select(d.findElement(By.id("searchLanguage")));
		sc.selectByVisibleText("Português");
		List<WebElement> wb = d.findElements(By.tagName("a"));
		System.out.println("total links " + wb.size());
		for (WebElement s : wb) {
			String res = s.getText();
			System.out.println("result is  " + res);

		}

	}
	// System.out.println("Total text are " +options.get(i).);

}
