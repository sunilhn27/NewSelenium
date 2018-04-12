package AfterComplete;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateP {

	public static void main(String[] args) throws InterruptedException {
		//
		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://jqueryui.com/resources/demos/datepicker/default.html");
		d.manage().window().maximize();
		// d.switchTo().alert().dismiss();
		WebElement date=d.findElement(By.xpath(".//*[@id='datepicker']"));
		date.sendKeys("27/11/2018");
		System.out.println("888888888");
//		Thread.sleep(5000);
		d.close();
	}
}
