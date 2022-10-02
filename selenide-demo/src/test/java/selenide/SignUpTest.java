package selenide;

import com.codeborne.selenide.Condition;
import org.junit.Assert;
import org.junit.Test;
import selenide.pages.Homepage;
import selenide.pages.SignUpPage;

import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.open;

public class SignUpTest {

    Homepage homepage;
    SignUpPage signUpPage;


    @Test
    public void signUpWithoutTermsAndPrivacy() {

        //open
        homepage = open("https://www.quandoo.de/en", Homepage.class);
        signUpPage = homepage.clickOnSignUpBtn();
        //insert data to all fields
        signUpPage.fillInSignUpFields();
        //Click on Create Account
        signUpPage.clickOnCreateAccountField();
        signUpPage.btn().should(Condition.visible);

        //check the checkbox tooltip appeared
        //check that Create Account button exit on the page
        Assert.assertTrue(signUpPage.checkCreateAccountBtnExists());
    }
}
