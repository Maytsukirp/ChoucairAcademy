package co.com.choucair.automatization.retotecnico.tasks;

import co.com.choucair.automatization.retotecnico.model.Utest_Data;
import co.com.choucair.automatization.retotecnico.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.automatization.retotecnico.userinterface.ChoucairLoginPage.*;


public class Login implements Task {



    public static Login onThePage() {
        return Tasks.instrumented(Login.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LOGIN_BUTTON),
                Enter.theValue("mrivero").into(INPUT_USER),
                Enter.theValue("Choucair2022*").into(INPUT_PASSWORD),
                Click.on(ENTER_BUTTON)
                );

    }
}
