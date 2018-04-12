package ObjectRep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginpageOR {

	WebDriver d;

	public LoginpageOR(WebDriver d) {
		this.d = d;
	}

	By username = By.xpath(".//*[@id='email']");
	By password = By.xpath(".//*[@id='pass']");
	By login = By.xpath(".//*[@id='loginbutton']");


	public WebElement username() {
		return d.findElement(username);
	}

	public WebElement password() {
		return d.findElement(password);
	}

	public WebElement Login() {
		return d.findElement(login);
	}

}
