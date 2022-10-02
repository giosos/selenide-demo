package selenide.pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;




public class Homepage {

    private static By signUpBtn = By.xpath("//*[@data-qa='header-register-btn']");

    public SignUpPage clickOnSignUpBtn(){
        $(signUpBtn).click();
        return page(SignUpPage.class);
    }
}