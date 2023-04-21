package stepdefinitions.authentication;

import enums.data.SessionVariables;
import enums.environment.UserType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import task.Login;
import userinterfaces.UserProfileUI;
import util.UserUtil;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class AuthenticationStepDefinition {

    @Given("{actor} es un {}")
    public void isAnUserRegistered(Actor actor, String userType) {
        UserType user = UserType.findUserProperty(userType);
        actor.remember(SessionVariables.USER_TYPE.toString(), UserUtil.get(user));
    }

    @When("{actor} inicia sesion")
    public void elIniciaSesion(Actor actor) {
        actor.attemptsTo(Login.logInTheApp());
    }

    @Then("{actor} ve la ventana inicial de activo")
    public void elVeLaVentanaInicialDeActivo(Actor actor) {
        actor.should(
                seeThat("El ve las opciones relacionadas con su perfil habilitadas",
                        (Actor act) -> UserProfileUI.label_welcome.isVisibleFor(act)
                )
        );
    }


}
