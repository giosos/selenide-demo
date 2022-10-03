package selenide.pages;

import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Class SignUpPage contains all Sign Up page locators and methods.
 */
public class SignUpPage extends Page {
    // locators
    private static final By firstNameField = By.xpath("//*[@data-qa='first-name-input']");
    private static final By lastNameField = By.xpath("//*[@data-qa='last-name-input']");
    private static final By emailField = By.xpath("//*[@data-qa='email-input']");
    private static final By passwordField = By.xpath("//*[@data-qa='password-input']");
    private static final By confirmPasswordField = By.xpath("//*[@data-qa='password-confirm-input']");
    private static final By createAccountBtn = By.xpath("//*[@data-qa='submit-btn']");
    private static final By checkboxTooltip = By.xpath("//*[contains(text(),'tick')]");

    // methods
    public void fillInSignUpFields() {
        faker = new Faker();
        String pwd = faker.internet().password();
        $(firstNameField).setValue(faker.name().firstName());
        $(lastNameField).setValue(faker.name().lastName());
        $(emailField).setValue(faker.internet().emailAddress());
        $(passwordField).setValue(pwd);
        $(confirmPasswordField).setValue(pwd);
    }

    public void clickOnCreateAccountBtn() {
        $(createAccountBtn).click();
    }

    public SelenideElement createAccountBtnEl() {
        return $(createAccountBtn);
    }
}