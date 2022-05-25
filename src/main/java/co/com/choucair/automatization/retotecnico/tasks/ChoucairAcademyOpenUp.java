package co.com.choucair.automatization.retotecnico.tasks;

import co.com.choucair.automatization.retotecnico.userinterface.ChoucairAcademyPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class ChoucairAcademyOpenUp implements Task {
    private ChoucairAcademyPage choucairAcademyPage;


    public static ChoucairAcademyOpenUp thePage() {

        return Tasks.instrumented(ChoucairAcademyOpenUp.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(choucairAcademyPage));

    }
}
