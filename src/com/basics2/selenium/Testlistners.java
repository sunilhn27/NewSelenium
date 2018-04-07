package com.basics2.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Testlistners {

	public static void main(String[] args) {

		WebDriver webdriver = new ChromeDriver();

		EventFiringWebDriver d = new EventFiringWebDriver(webdriver);

		Listner li = new Listner();
		d.register(li);
		d.get("http://www.google.co.in");
		d.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[1]")).click();

	}
}
