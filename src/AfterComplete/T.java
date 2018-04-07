package AfterComplete;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class T {

	
	@Test
	public void set() {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.google.co.in");
	}
}
