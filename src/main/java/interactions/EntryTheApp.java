package interactions;

import model.User;
import enums.data.SessionVariables;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Browser;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import task.Login;
import userinterfaces.LoginUI;
import userinterfaces.StartPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EntryTheApp implements Interaction {

    StartPage startPage;

    public static Performable toPerform(){
        return instrumented(EntryTheApp.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        User user = actor.recall(SessionVariables.USER_TYPE.toString());
        actor.attemptsTo(
                Open.browserOn().the(startPage)
        );
    }
}
