package com.basics3.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDatePicker {

	static String m;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://jqueryui.com/resources/demos/datepicker/default.html");
		d.manage().window().maximize();
		d.findElement(By.xpath(".//*[@id='datepicker']")).click();

		List<WebElement> month = d.findElements(By.xpath(".//*[@id='ui-datepicker-div']/div/div"));
		// WebElement year =
		// d.findElement(By.xpath(".//*[@class='ui-datepicker-year']"));
		for (WebElement mon : month) {
			m = mon.getText();
			System.out.println(m);
			d.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]/span")).click();
		}

		/*
		 * while () {
		 * d.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]/span")).click(
		 * ); }
		 */

		// List<WebElement> date = d.findElements(By.cssSelector("[href='#']"));
		// for (int i = 0; i <= date.size(); i++) {
		// if (date.get(i).getText().contains("27")) {
		// date.get(i).click();
		// break;
	}

	// }
	// System.out.println("Succes fill");

}
