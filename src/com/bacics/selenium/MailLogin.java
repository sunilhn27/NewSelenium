package com.bacics.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class MailLogin {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("http://www.google.co.in");
		d.manage().window().maximize();
		System.out.println("Title " + d.getTitle());
		System.out.println("Current URL" + d.getCurrentUrl());
		//System.out.println("pageSource" + d.getPageSource());
		d.close();
	}

}
