package com.basics2.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.icicibank.com/help/support-center.page?");
		Thread.sleep(4000);
		Set<String> WinId = d.getWindowHandles();
		Iterator<String> theiter = WinId.iterator();
		System.out.println("id " + theiter.next());
		d.manage().window().maximize();
		WebElement pri = d.findElement(By.xpath("html/body/div[1]/header/div/ul/li[4]/a"));
		pri.click();

		Set<String> WinId2 = d.getWindowHandles();
		Iterator<String> theiter2 = WinId.iterator();
//		d.switchTo().window(WinId2);
		System.out.println("id 2"+theiter2.next());
		d.close();
		/*
		 * String oldwin = theiter.next();
		 * d.findElement(By.xpath(".//*[@id='050318006316']/a/ul/li")).click();
		 * Set<String> newwin = d.getWindowHandles(); Iterator<String> Newwin =
		 * newwin.iterator(); String newwindow = Newwin.next(); System.out.println("old"
		 * + oldwin); System.out.println("new" + newwindow);
		 */
	}
}
