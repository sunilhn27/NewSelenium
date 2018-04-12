package ObjectRep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestLogin {

	WebDriver d1;

	@Test(dataProvider = "getdata")
	public void testing(String user, String pass) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		d1 = new ChromeDriver();
		d1.get("https://www.facebook.com/login.php?login_attempt=1&lwv=110");
		LoginpageORWithpageFactory l = new LoginpageORWithpageFactory(d1);
		System.out.println(l.username1());
		l.username1().sendKeys(user);
		l.password1().sendKeys(pass);
//		System.out.println(status);
		l.Login1().click();

	}

	@DataProvider
	public Object[][] getdata() {
		Object[][] data = new Object[2][2];

		data[0][0] = "sunil";
		data[0][1] = "sunil123";
//		data[0][2] = "rejected";

		data[1][0] = "raju";
		data[1][1] = "raju123";
//		data[1][2] = "rejected";

		return data;
	}

}
