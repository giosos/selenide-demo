package selenide.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Abstract class Page contains common locators, data and methods shared within the Quandoo pages.
 */
public abstract class Page {

    // constant credentials
    public static String VALID_EMAIL = "violetaabramova@yandex.ru";
    public static String VALID_PASS = "8vzN$ht4eFuG45$";

    // constant url
    public static String LOCALISATION_EN = "/en";
    public static String BASE_URL = "https://www.quandoo.de" + LOCALISATION_EN;

    // classes
    protected Faker faker;
    // Locators
    private static final By accCookiesBtn = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");

    // Methods
    public void accCookies() {
        $(accCookiesBtn).click();
    }

}