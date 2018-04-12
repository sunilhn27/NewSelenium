package ObjectRep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginpageORWithpageFactory {

	WebDriver d1;

	public LoginpageORWithpageFactory(WebDriver d1) {
		this.d1 = d1;
		PageFactory.initElements(d1, this);

	}

	@FindBy(id = "email")
	WebElement username;

	@FindBy(xpath = ".//*[@id='pass']")
	WebElement password;

	@FindBy(xpath = ".//*[@id='loginbutton']")
	WebElement login;

	public WebElement username1() {
		System.out.println(username);
		return username;
	}

	public WebElement password1() {

		System.out.println(password);
		return password;
	}

	public WebElement Login1() {
		System.out.println(login);
		return login;
	}

}
