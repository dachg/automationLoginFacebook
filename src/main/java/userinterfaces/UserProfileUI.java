package userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UserProfileUI {
    private UserProfileUI() {}

    public static final Target label_welcome = Target.the("Bienvenido a activo")
            .located(By.xpath("/html/body/app-root/app-admin-layout/div/div[2]/div/" +
                    "dashboard-cmp/div/div/div/div[1]/h3"));
}
