package co.com.choucair.automatization.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {

    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login")
            .located(By.xpath("//ul[2]//a[contains(.,'Ingresar')]"));

    public static final Target INPUT_USER = Target.the("where do we write the user")
            .located(By.id("username"));

    public static final Target INPUT_PASSWORD = Target.the("where do we write the password")
            .located(By.id("password"));

    public static final Target ENTER_BUTTON = Target.the("button TO CONFIRM LOGIN")
            .located(By.xpath("//button[@class='btn btn-primary']"));
}
