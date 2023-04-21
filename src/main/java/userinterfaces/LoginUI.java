package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://localhost:4200/#/login")
public class LoginUI extends PageObject {
    private LoginUI() {
    }

    public static final Target user_field = Target.the("Usuario").located(
            By.id("login-user"));
    public static final Target password_field = Target.the("Usuario").located(
            By.id("login-password"));

    public static final Target login_button = Target.the("Usuario").located(
            By.id("btn_entrar"));
}
