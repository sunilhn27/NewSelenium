package com.basics3.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jquery {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://jqueryui.com/resources/demos/droppable/default.html");
		//d.switchTo().frame(0);
		Thread.sleep(2000);

		WebElement drag = d.findElement(By.xpath(".//*[@id='draggable']"));
		WebElement drop = d.findElement(By.xpath(".//*[@id='droppable']"));
		Actions a = new Actions(d);
		a.dragAndDrop(drag, drop).build().perform();
		Thread.sleep(2000);
		System.out.println("success");
		// d.close();

	}
}
