package com.bacics.selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class ecommerce {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("http://store.demoqa.com/products-page/product-category/");
		d.manage().window().maximize();
		Thread.sleep(5000);
		File scr = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File("D:\\MS OFFICE\\Selenium ScreenShots\\screen.jpg"));
		d.close();
		/*
		 * WebElement cart = d.findElement( By.xpath(
		 * ".//*[@id='default_products_page_container']/div[3]/div[2]/form/div[2]/div[1]/span/input"
		 * )); cart.click(); Thread.sleep(5000);
		 * 
		 * WebElement items = d.findElement(By.xpath(".//*[@id='header_cart']/a"));
		 * items.click(); Thread.sleep(5000); WebElement remove =
		 * d.findElement(By.xpath(
		 * ".//*[@id='checkout_page_container']//*[@value='Remove']")); remove.click();
		 * Actions a = new Actions(d); WebElement products =
		 * d.findElement(By.xpath(".//*[@id='menu-item-33']/a")); WebElement macs =
		 * d.findElement(By.xpath(".//*[@id='menu-item-39']/a"));
		 * a.moveToElement(products); a.click(macs).build().perform();
		 */ }
}
