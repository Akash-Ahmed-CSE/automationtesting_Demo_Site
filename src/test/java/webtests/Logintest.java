package webtests;

import org.testng.annotations.Test;
import pages.SelectElements;
import utilities.DriverSetup;

public class Logintest extends DriverSetup {

    @Test
    public void loginAndSelectTest() {

        // Open the site
        getDriver().get("https://rahulshettyacademy.com/AutomationPractice/");

        // Select radio button
        SelectElements selectElements = new SelectElements(getDriver());
        selectElements.addText("Test text");

        // Wait for 3 seconds
        try {
            Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
