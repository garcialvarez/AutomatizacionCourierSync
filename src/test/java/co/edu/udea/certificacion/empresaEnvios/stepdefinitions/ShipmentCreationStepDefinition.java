package co.edu.udea.certificacion.empresaEnvios.stepdefinitions;

import co.edu.udea.certificacion.empresaEnvios.questions.Validation;
//import co.edu.udea.certificacion.empresaEnvios.questions.ValidationShipment;
import co.edu.udea.certificacion.empresaEnvios.tasks.DoThe;
import co.edu.udea.certificacion.empresaEnvios.tasks.GoTo;
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

public class ShipmentCreationStepDefinition {

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

    @Given("I am on the shipment tab as an administrator")
    public void iAmOnTheShipmentTabAsAnAdministrator() {

        DanielJose.attemptsTo(OpenThe.navigator(new LoginPage()));
        DanielJose.attemptsTo(DoThe.login());

    }
    @When("I select create shipment and fill all the required data")
    public void iSelectCreateShipmentAndFillAllTheRequiredData() {

        DanielJose.attemptsTo(GoTo.CreateNewShipmentPage());

    }
    @Then("The new shipment should be created successfully")
    public void theNewShipmentShouldBeCreatedSuccessfully() {

        //GivenWhenThen.then(DanielJose).should(GivenWhenThen.seeThat(ValidationShipment.created(), Matchers.containsString("Alejandro Cano")));

    }

}
