package selenide.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignUpPage<selenide> {

    Faker faker;

    private static final By firsNameField = By.xpath("[@data-qa='first-name-input']");
    private static final By lastNameField = By.xpath("[@data-qa='last-name-input']");
    private static final By emailField = By.xpath("[@data-qa='email-input']");
    private static final By passwordField = By.xpath("[@data-qa='password-input']");
    private static final By confirmPasswordField = By.xpath("[@data-qa='password-confirm-input']");
    private static final By createAccountBtn = By.xpath("[@data-qa='submit-btn']");

    public void fillInSignUpFields(){
        faker=new Faker();
        String pwd = faker.internet().password();


        $(firsNameField).setValue(faker.name().firstName());
        $(lastNameField).setValue(faker.name().lastName());
        $(emailField).setValue(faker.internet().emailAddress());
        $(passwordField).setValue(pwd);
        $(confirmPasswordField).setValue(pwd);
    }

    public void clickOnCreateAccountField(){
        $(createAccountBtn).click();
    }

    public SelenideElement btn(){
        return (SelenideElement) createAccountBtn;
    }

    public boolean checkCreateAccountBtnExists(){
        $(createAccountBtn).should(Condition.visible);
        return $(createAccountBtn).exists();
    }

    private class selenideElement {
    }
}