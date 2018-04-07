package com.basics3.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jquerySection {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://jqueryui.com/resources/demos/accordion/default.html");
		d.manage().window().maximize();
		d.findElement(By.xpath(".//*[@id='ui-id-3']/span")).click();
		WebElement para =d.findElement(By.xpath(".//*[@id='ui-id-4']/p"));
		System.out.println(para.getText());
   
	}
}
	