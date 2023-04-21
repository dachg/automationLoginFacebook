package task;

import enums.data.SessionVariables;
import interactions.EntryTheApp;
import interactions.StartSession;
import model.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import userinterfaces.LoginUI;
import userinterfaces.StartPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Login implements Task {

    @Step("{0} inicia sesion en la app")
    public static Performable logInTheApp() {
        return instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EntryTheApp.toPerform(),
                StartSession.toPerform()
        );
    }
}
