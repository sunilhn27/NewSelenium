package com.bacics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestFields {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("http://toolsqa.com/automation-practice-form/");
		d.manage().window().maximize();
		WebElement firstname = d.findElement(By.name("firstname"));
		firstname.sendKeys("Sunil");
		WebElement lastname = d.findElement(By.name("lastname"));
		lastname.sendKeys("Shetty");
		Thread.sleep(5000);
		WebElement Gender = d.findElement(By.id("sex-0"));
		Gender.click();
		WebElement exp = d.findElement(By.id("exp-2"));
		exp.click();
		WebElement date = d.findElement(By.xpath(".//*[@id='datepicker']"));
		date.sendKeys("23/11/1994");
		WebElement wb = d.findElement(By.id("continents"));
		Select sc = new Select(wb);
		sc.selectByVisibleText("Australia");
		System.out.println("success");
		WebElement multipul = d.findElement(By.id("continents"));
		Select sc1 = new Select(multipul);
		if (sc1.isMultiple()) {
			sc1.selectByVisibleText("Browser Commands");
			sc1.selectByVisibleText("Wait Commands");
			sc1.selectByVisibleText("WebElement Commands");
			System.out.println("MULTIPUL SELECTED");
		}
		System.out.println("ssssssssssssssssssssssssss");

	}
}
