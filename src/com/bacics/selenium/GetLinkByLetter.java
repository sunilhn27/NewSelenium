package com.bacics.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLinkByLetter {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		List<WebElement> links = d.findElements(By.xpath("html/body/div[1]/div[5]/table/tbody/tr/td[3]"));
		System.out.println(links.size());
		for (int i = 0; i <= links.size(); i++) {
			String  k=links.get(i).getText();
			System.out.println(k);
					
			
		}

	}
}

/*
 * if (s1.startsWith("M") || s1.startsWith("R")) {
 * System.out.println("links Starts With M and R are  " + s1); }
 */