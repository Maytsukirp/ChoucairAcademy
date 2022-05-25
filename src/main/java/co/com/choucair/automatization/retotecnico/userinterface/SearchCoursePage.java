package co.com.choucair.automatization.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {

    public static final Target BUTTON_UC = Target.the("select universidad choucair")
            .located(By.xpath("//strong[.='Universidad  Choucair']"));

    public static final Target INPUT_COURSE = Target.the("search course")
            .located(By.id("coursesearchbox"));

    public static final Target BUTTON_GO = Target.the("click in search course")
            .located(By.xpath("//button[@class='btn btn-secondary']"));

    public static final Target SELECT_COURSE = Target.the("click in search course---")
            .located(By.xpath("//div[@class='search-results']/div[1]//a[.='Ver este resultado en su contexto']"));

    public static final Target NAME_COURSE = Target.the("name course")
            .located(By.cssSelector("h1"));
}
