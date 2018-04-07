package package1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		Set<String> allWindow = driver.getWindowHandles();
		Iterator<String> ite = allWindow.iterator();
		System.out.println(ite.next());
		driver.findElement(By.xpath(".//*[@id='Tabbed']/a/button")).click();
		System.out.println("After the new Tap is opiend");
		allWindow = driver.getWindowHandles();
		ite = allWindow.iterator();
		String mainwin = ite.next();
		String Tabwin = ite.next();
		System.out.println("mainwin " + mainwin);
		System.out.println("tab " + Tabwin);
		driver.switchTo().window(Tabwin);
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='container']/header/div/div/div[2]/ul/li[3]/a")).click();
		Thread.sleep(3000);
		driver.close();

		driver.switchTo().window(mainwin);
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='header']/nav/div/div[2]/ul/li[3]/a")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
