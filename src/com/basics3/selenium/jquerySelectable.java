package com.basics3.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class jquerySelectable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://jqueryui.com/resources/demos/selectable/default.html");
		WebElement item2 = d.findElement(By.xpath(".//*[@id='selectable']/li[2]"));
		WebElement item3 = d.findElement(By.xpath(".//*[@id='selectable']/li[4]"));
		WebElement item6 = d.findElement(By.xpath(".//*[@id='selectable']/li[6]"));
		Actions a = new Actions(d);
		a.keyDown(Keys.LEFT_CONTROL).build().perform();
		item2.click();
		Thread.sleep(3000);
		item3.click();
		Thread.sleep(4000);
		item6.click();
		a.keyUp(Keys.LEFT_CONTROL).build().perform();
		d.close();
	}
}

// a.keyDown(Keys.LEFT_CONTROL).click(item2).click(item3).click(item6).keyUp(Keys.LEFT_CONTROL).build().perform();
