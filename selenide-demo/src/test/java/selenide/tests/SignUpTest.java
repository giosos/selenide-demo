package selenide.tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import selenide.pages.Homepage;
import selenide.pages.SignUpPage;

import static com.codeborne.selenide.Selenide.open;

/**
 * Class SignUpTest contains tests for the Sign Up functionality
 */
public class SignUpTest {

    Homepage homepage;
    SignUpPage signUpPage;

    @Test
    /**
     * Negative test which ensures that there is no ability to sign up without ticking Terms checkbox.
     */
    public void signUpWithoutTermsAndPrivacy() {
        //open page
        homepage = open("https://www.quandoo.de/en", Homepage.class);
        homepage.accCookies();
        signUpPage = homepage.clickOnSignUpBtn();
        //insert data to all fields
        signUpPage.fillInSignUpFields();
        //Click on Create Account
        signUpPage.clickOnCreateAccountBtn();
        // check that Create Account button exists
        signUpPage.createAccountBtnEl().should(Condition.visible);
    }
}