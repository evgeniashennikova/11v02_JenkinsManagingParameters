package guruqa_test.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class SampleTest extends TestBase {

    @Test
    @DisplayName("Авторизация на сайте www.saucedemo.com")
    void authorizationSwagLabs() {

        step("Открыть сайт www.saucedemo.com", () ->
                open("https://www.saucedemo.com"));
        step("Ввести логин и пароль", () -> {
            $("#user-name").setValue("standard_user");
            $("#password").setValue("secret_sauce");
        });
        step("Нажать кнопку LOGIN", () ->
                $("#login-button").click());
        step("Проверка успешной авторизации", () ->
                $(".title").shouldHave(text("Products")));

    }
}
