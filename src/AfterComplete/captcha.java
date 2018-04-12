package AfterComplete;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class captcha {

	static WebDriver d;

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://www.ultimateqa.com/complicated-page/");
		d.manage().timeouts().implicitlyWait(10l, TimeUnit.SECONDS);
		d.findElement(By.xpath(".//*[@id='et_pb_contact_name_1']")).sendKeys("firstname");

		d.findElement(By.xpath(".//*[@id='et_pb_contact_email_1']")).sendKeys("sunil27@gmal.com");
		d.findElement(By.xpath(".//*[@id='et_pb_contact_message_1']")).sendKeys("Message");
		WebElement cap = d.findElement(By.xpath(".//*[@id='et_pb_contact_form_0']/div[2]/form/div/div/p/span"));
		System.out.println(cap.getText());
		String initial = cap.getText();
		System.out.println(initial.substring(0, 2));
		System.out.println(initial.substring(5, 6));
		int a = Integer.parseInt(initial.substring(0, 2));
		int b = Integer.parseInt(initial.substring(5, 6));
		int c = a + b;
		System.out.println(c);
		String d = String.valueOf(c);
		captcha.d.findElement(By.xpath(".//*[@id='et_pb_contact_form_0']/div[2]/form/div/div/p/input")).sendKeys(d);
		Thread.sleep(2000);
		captcha.d.findElement(By.xpath(".//*[@id='et_pb_contact_form_0']/div[2]/form/div/button")).click();
		// }
	}
}