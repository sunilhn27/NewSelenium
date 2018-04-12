package Dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider1 {

	@Test(dataProvider = "getdata")
	public void gmail(String username, String password, String firstname) {
		System.out.println(username);
		System.out.println(password);
		System.out.println(firstname);

	}

	@DataProvider
	public Object[][] getdata() {
	
		Object[][] obj = new Object[2][3];
		
		obj[0][0] = "sunil";
		obj[0][1] = "sunil123";
		obj[0][2] = "sunil";

		obj[0][0] = "sagar";
		obj[1][1] = "sagar123";
		obj[1][2] = "sagar";

		return obj;
	}
}
