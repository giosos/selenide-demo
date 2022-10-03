package selenide.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage extends Page {

    LoginPage loginPage;

    // locators

    private static By googleBtn = By.xpath("//*[@data-qa='social-provider-btn-google']");
    private static By facebookBtn = By.xpath("//*[@data-qa='social-provider-btn-facebook']");
    private static By appleBtn = By.xpath("//*[@data-qa='social-provider-btn-apple']");


    private static By checkTermsGoogle = By.cssSelector("#root>div>div>form>section>div:nth-child(2)>div.consentModal__Wrapper-sc-1favlfo-0.fJWyJT>label>i>svg");
    private static By checkTermsFacebook = By.cssSelector("#root>div>div>form>section>div:nth-child(3)>div.consentModal__Wrapper-sc-1favlfo-0.fJWyJT>label>i>svg");
    private static By checkTermsApple = By.cssSelector("#root>div>div>form>section>div:nth-child(4)>div.consentModal__Wrapper-sc-1favlfo-0.fJWyJT>label>i>svg");
    private static By connectBtn = By.xpath("//*[@data-qa='connect-btn']");

    private static By emailField = By.xpath("//*[@data-qa='email-input']");
    private static By passwordField = By.xpath("//*[@data-qa='password-input']");
    private static By loginBtn = By.xpath("//*[@data-qa='login-btn']");



    // methods
    public void fillInValidCred() {
        $(emailField).setValue(VALID_EMAIL);
        $(passwordField).setValue(VALID_PASS);
    }

    public void googleBtn(){
        $(googleBtn).click();
    }

    public void facebookBtn(){
        $(facebookBtn).click();
    }

    public void appleBtn(){
        $(appleBtn).click();
    }

    public void checkTermsGoogleBtn() {
        $(checkTermsGoogle).click();
        $(connectBtn).click();

    }
    public void checkTermsFacebookBtn(){
        $(checkTermsFacebook).click();
        $(connectBtn).click();

        }
    public void checkTermsAppleBtn(){
        $(checkTermsApple).click();
        $(connectBtn).click();

    }



    public Homepage clickOnLoginBtnHP() {
        $(loginBtn).click();
        return page(Homepage.class);
    }
}