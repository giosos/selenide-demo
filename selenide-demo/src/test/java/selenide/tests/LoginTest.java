package selenide.tests;

import org.junit.jupiter.api.Test;
import selenide.pages.Homepage;
import selenide.pages.LoginPage;

import static com.codeborne.selenide.Selenide.open;
import static selenide.pages.Page.BASE_URL;

public class LoginTest {

    // classes
    Homepage homePage;
    LoginPage loginPage;

    /**
     * This test checks successful login and logout functionality
     */
    @Test
    public void loginWithValidCredentials() throws InterruptedException {
        homePage = open(BASE_URL, Homepage.class);
        homePage.accCookies();
        loginPage = homePage.clickOnLoginBtn();
        loginPage.fillInValidCred();
        loginPage.clickOnLoginBtnHP();
        homePage.userIconPresent();
        homePage.userIconHover();
        homePage.clickOnLogoutBtn();

    }

    /**
     * This test checks functionality of social network buttons (google)
     */
    @Test
    public void googleBtnValidation() {
        homePage = open(BASE_URL, Homepage.class);
        loginPage = homePage.clickOnLoginBtn();
        loginPage.googleBtn();
        loginPage.checkTermsGoogleBtn();

    }

    /**
     * This test checks functionality of social network buttons (facebook)
     */
    @Test
    public void facebookBtnValidation(){
        homePage = open(BASE_URL, Homepage.class);
        loginPage = homePage.clickOnLoginBtn();
        loginPage.facebookBtn();
        loginPage.checkTermsFacebookBtn();

    }

    /**
     * This test checks functionality of social network buttons (apple)
     */
    @Test
    public void appleBtnValidation(){
        homePage = open(BASE_URL, Homepage.class);
        loginPage = homePage.clickOnLoginBtn();
        loginPage.appleBtn();
        loginPage.checkTermsAppleBtn();

    }
}