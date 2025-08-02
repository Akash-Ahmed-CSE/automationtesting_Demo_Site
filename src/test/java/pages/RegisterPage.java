package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utilities.DriverSetup.getDriver;

public class RegisterPage extends BasePage {
    private By FIRSTNAME = By.xpath("//input[@placeholder='First Name']");
    private By LASNAME = By.xpath("//input[@placeholder='Last Name']");
    private By ADDRESS = By.xpath("//textarea[@ng-model='Adress']");
    private By EMAIL_ADDRESS = By.xpath("//input[@type='email']");
    private By PHONE = By.xpath("//input[@type='tel']");

    private By GENDER = By.xpath("//input[@value='Male']");
    private By HOBIES = By.xpath("//label[normalize-space()='Cricket']");
    private By SKILL = By.xpath("//select[@id='Skills']");
    private By LANGUAGE_DROPDOWN = By.id("msdd");
    private By COUNTRY = By.xpath("//select[@id='countries']");



    public void doRegister(String firstName, String lastName, String address, String emamil_address, String phone) {
        writeText(FIRSTNAME, firstName);
        writeText(LASNAME, lastName);
        writeText(ADDRESS, address);
        writeText(EMAIL_ADDRESS, emamil_address);
        writeText(PHONE, phone);
    }

    public void genderAndHobbiesclick() {
        clickOnElement(GENDER);
        clickOnElement(HOBIES);
    }

    public void selectLanguage(String languageName) {
        clickOnElement(LANGUAGE_DROPDOWN);  // open dropdown
        By languageOption = By.xpath("//a[normalize-space()='" + languageName + "']");
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(languageOption));
        clickOnElement(languageOption);
    }

    public void selectSkill(String skillName) {
        Select select = new Select(getElement(SKILL));
        select.selectByVisibleText(skillName);
    }
}
