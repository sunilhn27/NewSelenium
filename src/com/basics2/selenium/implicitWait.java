package com.basics2.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class implicitWait {

	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		d.manage().window().maximize();
        d.manage().timeouts().implicitlyWait(20l, TimeUnit.SECONDS);
        	
		
		
	}
}
