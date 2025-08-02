package webtests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.RegisterPage;
import utilities.DriverSetup;

public class RegisterTest extends DriverSetup {

    private WebDriver driver;
    RegisterPage registerPage;

    @BeforeMethod
    public void setUp() {
        // Setup driver and page
        driver = getDriver();
        registerPage = new RegisterPage();
    }

    @Test
    public void registerTest() throws InterruptedException {
        driver.get("https://demo.automationtesting.in/Register.html");

        registerPage.doRegister("Akash", "Ahmed","A-9/2 Savar, Dhaka","akash@gmail.com","01712345678");
        // Example interaction
        registerPage.genderAndHobbiesclick();
        Thread.sleep(2000);
        registerPage.selectLanguage("Bulgarian");
        Thread.sleep(2000);
        registerPage.selectSkill("C");

        Thread.sleep(2000);
    }


}
