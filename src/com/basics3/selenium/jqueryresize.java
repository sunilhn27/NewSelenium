package com.basics3.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class jqueryresize {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://jqueryui.com/resources/demos/resizable/default.html");
		WebElement resize =d.findElement(By.xpath(".//*[@id='resizable']/div[3]"));
        Actions a =new Actions(d);
        a.dragAndDropBy(resize, 450, 500).build().perform();
        
        
		
		
	}
}
