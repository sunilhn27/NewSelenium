package com.basics3.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class jquerydrapanddrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://jqueryui.com/resources/demos/draggable/default.html");
		WebElement drag =d.findElement(By.xpath(".//*[@id='draggable']"));
        Actions a =new Actions(d);
        a.dragAndDropBy(drag, 450, 400).build().perform();
		
			}
}
