package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	WebDriver d;


	public void googlesearch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://www.google.co.in");
		d.manage().window().maximize();
		Thread.sleep(2000);
		d.findElement(By.id("lst-ib")).sendKeys("meghana");
		Thread.sleep(3000);
		List<WebElement> drop = d.findElements(By.xpath(".//ul[@role='listbox']/li/descendant::div[@class='sbqs_c']"));
		System.out.println(drop.size());
		for (int i = 0; i < drop.size(); i++) {
			String links = drop.get(i).getText();
			if (drop.get(i).getText().contains("meghana raj")) {
				drop.get(i).click();
				System.out.println("succesfully Clicked");
			}
			System.out.println(links);
		}
	}
}
