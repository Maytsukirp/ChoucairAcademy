package co.com.choucair.automatization.retotecnico.model.builder;

import co.com.choucair.automatization.retotecnico.model.ChoucairAcademyData;
import co.com.choucair.automatization.retotecnico.tasks.ChoucairLogin;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;

public class LoginBuilder {

    private List<ChoucairAcademyData> dataLogin;

    public LoginBuilder withUsername(List<ChoucairAcademyData> dataLogin) {
        this.dataLogin = dataLogin;
        return this;
    }

    public ChoucairLogin andWithPassword(List<ChoucairAcademyData> dataLogin){
        return Tasks.instrumented(ChoucairLogin.class,dataLogin);
    }

}
