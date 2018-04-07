package com.basics2.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class window2handler {

	
	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.naukri.com/international-jobs");
		d.manage().window().maximize();
		d.findElement(By.xpath("html/body/div[1]/div/ul/li[2]/a/div")).click();
		String s=d.getWindowHandle();
		Set<String> mainwindow =d.getWindowHandles();
		for(String child :mainwindow) {
			System.out.println(mainwindow);
			if(!mainwindow.equals(child)) {
				d.switchTo().window(child);
			String s2 =d.getWindowHandle();
				System.out.println(s2);
					d.findElement(By.xpath(".//*[@id='skill']/div[1]/div[2]/input")).sendKeys("Selenium");
			}
			
		}
//
	}
}
