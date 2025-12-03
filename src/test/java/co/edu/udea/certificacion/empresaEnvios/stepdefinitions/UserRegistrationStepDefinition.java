package co.edu.udea.certificacion.empresaEnvios.stepdefinitions;

import co.edu.udea.certificacion.empresaEnvios.questions.Validation;
import co.edu.udea.certificacion.empresaEnvios.tasks.DoThe;
import co.edu.udea.certificacion.empresaEnvios.tasks.EnterTo;
import co.edu.udea.certificacion.empresaEnvios.tasks.OpenThe;
import co.edu.udea.certificacion.empresaEnvios.userinterfaces.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class UserRegistrationStepDefinition {

    public final Actor DanielJose = Actor.named("DanielJose");
    @Managed(driver = "chrome", uniqueSession = true)
    public WebDriver theDriver;

    @Before
    public void config(){
        WebDriverManager.chromedriver().setup();
        DanielJose.can(BrowseTheWeb.with(theDriver));
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("DanielJose");
    }

    @Given("I am on the users tab as an administrator")
    public void iAmOnTheUsersTabAsAnAdministrator() {
        DanielJose.attemptsTo(OpenThe.navigator(new LoginPage()));
        DanielJose.attemptsTo(DoThe.login());

    }
    @When("I select register new user and fill all the required data")
    public void iSelectRegisterNewUserAndFillAllTheRequiredData() {
        DanielJose.attemptsTo(EnterTo.registrationPage());

    }
    @Then("The new user should be created successfully")
    public void theNewUserShouldBeCreatedSuccessfully() {
        // Pequeña espera adicional por estabilidad
        try { Thread.sleep(3000); } catch (InterruptedException e) { /* ignore */ }

        // Obtener el nombre generado aleatoriamente y verificar que aparece en la tabla
        String expectedUserName = DanielJose.recall("userName");
        GivenWhenThen.then(DanielJose).should(
                GivenWhenThen.seeThat(Validation.Register(expectedUserName), Matchers.containsString(expectedUserName))
        );
    }

}
