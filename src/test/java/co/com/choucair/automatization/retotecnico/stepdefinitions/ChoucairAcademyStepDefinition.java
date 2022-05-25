package co.com.choucair.automatization.retotecnico.stepdefinitions;

import co.com.choucair.automatization.retotecnico.model.ChoucairAcademyData;
import co.com.choucair.automatization.retotecnico.questions.Answer;

import static co.com.choucair.automatization.retotecnico.tasks.ChoucairLogin.Login;

import co.com.choucair.automatization.retotecnico.tasks.ChoucairAcademyOpenUp;
import co.com.choucair.automatization.retotecnico.tasks.SearchCourse;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinition {

    @Before
    public void setState(){

        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than brandon wants to learn automation at the academy Choucair$")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair(List<ChoucairAcademyData> data) {
        OnStage.theActorCalled("Brandon").wasAbleTo(ChoucairAcademyOpenUp.thePage(),(Login().withUsername(data).andWithPassword(data)));

    }


    @When("^he search for the course (.*) on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(String course) {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchCourse.the(course));

    }

    @Then("^he finds the course called resources (.*)$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));

    }


}
