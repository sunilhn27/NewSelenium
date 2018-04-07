package com.basics3.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JquerySlide {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/laptop-accessories/mouse/pr?count=40&otracker=nmenu_sub_Electronics_0_Mouse&p%5B%5D=facets.price_range.from%3DMin&p%5B%5D=facets.price_range.to%3DMax&sid=6bo%2Fai3%2F2ay");
		Thread.sleep(3000);
		d.manage().window().maximize();
		WebElement slide = d.findElement(By.xpath(
				".//*[@id='container']/div/div[1]/div/div[2]/div/div[1]/div/div/div[2]/section/div[3]/div[1]/div[1]/div"));
		Actions a = new Actions(d);
		a.dragAndDropBy(slide, 60, 0).perform();

	}
}
