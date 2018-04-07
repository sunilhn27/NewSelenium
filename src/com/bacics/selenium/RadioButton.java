package com.bacics.selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RadioButton {
	static WebDriver d;

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		try {

			d = new ChromeDriver();
			d.get("http://toolsqa.com/automation-practice-form/");
			d.manage().window().maximize();
			WebElement radio = d.findElement(By.xpath(".//*[@id='sex-0']"));
			if (radio.isEnabled()) {
				System.out.println("Enabled");
				if (radio.isDisplayed()) {
					System.out.println("Displayed");
					radio.click();
					System.out.println("Clicked Male");
					WebElement radiofe = d.findElement(By.xpath(".//*[@id='sex-1']"));
					System.out.println(radiofe.getAttribute("type"));
					radiofe.click();
					System.out.println("Clicked FeMale");
					Thread.sleep(1000);
					WebElement multipuldrop = d.findElement(By.xpath(".//*[@id='']"));
					if (multipuldrop.isEnabled()) {
						System.out.println("Multipul Enabled");
						Actions a = new Actions(d);
						WebElement opt2 = d.findElement(By.xpath(".//*[@id='selenium_commands']/option[2]"));
						WebElement opt3 = d.findElement(By.xpath(".//*[@id='selenium_commands']/option[3]"));
						a.contextClick(opt2);
						System.out.println("opt2" + opt2.getText());
						a.keyDown(Keys.CONTROL);
						a.contextClick(opt3);
						System.out.println("opt2" + opt3.getText());
						System.out.println("Multipul dropdown Selected");
						// a.keyUp(Keys.CONTROL);
						Thread.sleep(3000);
						// d.close();
					}
				}
			}
		} catch (Exception e) {
			File scr = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scr, new File("D:\\MS OFFICE\\Selenium ScreenShots\\screenRadio.jpg"));
			System.out.println("inside catch block");
			d.close();
		}
	}
}
