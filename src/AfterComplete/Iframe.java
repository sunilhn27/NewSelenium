package AfterComplete;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://jqueryui.com/datepicker/");
		d.manage().window().maximize();

		int framecount = d.findElements(By.tagName("iframe")).size();

		System.out.println("No of Frame in Page is "+framecount);
		for (int i = 0; i <= framecount; i++) {

			d.switchTo().frame(i);
			int num = d.findElements(By.xpath(".//*[@id='datepicker']")).size();
			if (num > 0) {
				d.findElement(By.xpath(".//*[@id='datepicker']")).click();
				System.out.println("Succesfully found");
				break;
			} else {
				System.out.println("Not Found");
			}
		}
	}
}
