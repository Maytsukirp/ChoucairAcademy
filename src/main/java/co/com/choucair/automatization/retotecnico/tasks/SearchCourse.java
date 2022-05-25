package co.com.choucair.automatization.retotecnico.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.automatization.retotecnico.userinterface.SearchCoursePage.*;


public class SearchCourse implements Task {

    private String course;

    public SearchCourse(String course) {
        this.course = course;
    }

    public static SearchCourse the(String course) {
        return Tasks.instrumented(SearchCourse.class, course);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_UC),
                Enter.theValue(course).into(INPUT_COURSE),
                Click.on(BUTTON_GO),
                Click.on(SELECT_COURSE)
        );
    }
}
