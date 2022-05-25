package co.com.choucair.automatization.retotecnico.tasks;

import co.com.choucair.automatization.retotecnico.model.ChoucairAcademyData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.automatization.retotecnico.userinterface.ChoucairLoginPage.*;


public class Login implements Task {
    List<ChoucairAcademyData> data;

    public Login(List<ChoucairAcademyData> data) {
        this.data = data;
    }
    
    public static Login onThePage(List<ChoucairAcademyData> data) {
        return Tasks.instrumented(Login.class, data);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LOGIN_BUTTON),
                Enter.theValue(data.get(0).getStrUser()).into(INPUT_USER),
                Enter.theValue(data.get(0).getStrPassword()).into(INPUT_PASSWORD),
                Click.on(ENTER_BUTTON)
                );

    }
}
