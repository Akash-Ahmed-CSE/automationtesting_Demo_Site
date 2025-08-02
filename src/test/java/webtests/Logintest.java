package webtests;

import org.testng.annotations.Test;

import pages.RegisterPage;
import utilities.DriverSetup;

public class Logintest extends DriverSetup{
	RegisterPage registerPage = new RegisterPage();
	
	@Test
	public void loginTest() {
		getDriver().get("https://demo.automationtesting.in/Register.html");


	}

}
