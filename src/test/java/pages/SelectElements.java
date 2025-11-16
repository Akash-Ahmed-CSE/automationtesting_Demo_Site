package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectElements {

    private WebDriver driver;

    // Constructor
    public SelectElements(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By textField = By.cssSelector("#autocomplete");

    public void addText(String text) {
        driver.findElement(textField).sendKeys(text);
    }
}
