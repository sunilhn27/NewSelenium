package com.bacics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadTextAutomationPage {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("http://toolsqa.com/automation-practice-form/");
		d.manage().window().maximize();
		Thread.sleep(4000);
		WebElement read =d.findElement(By.xpath(".//*[@id='content']/div[1]/div/div/div/div[1]/p[2]"));
		System.out.println(read.getText());
		d.close();
		
	}
	
}
