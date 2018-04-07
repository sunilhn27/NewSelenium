package package1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scroll {

	@Test()
	public void setup() throws InterruptedException {
		System.out.printf("%n[+] Thread Id : %s is started!\n", Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.boraji.com/");
		d.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
	}
}
