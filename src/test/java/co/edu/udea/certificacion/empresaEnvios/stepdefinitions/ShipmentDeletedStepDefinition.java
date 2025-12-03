package co.edu.udea.certificacion.empresaEnvios.stepdefinitions;

import co.edu.udea.certificacion.empresaEnvios.interactions.PressThe;
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
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

public class ShipmentDeletedStepDefinition {

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

    @Given("I am on the shipment page as an administrator")
    public void iAmOnTheShipmentPageAsAnAdministrator() {

        DanielJose.attemptsTo(OpenThe.navigator(new LoginPage()));
        DanielJose.attemptsTo(DoThe.login());

    }
    @When("I select an existing shipment and choose the delete option")
    public void iSelectAnExistingShipmentAndChooseTheDeleteOption() {

        DanielJose.attemptsTo(PressThe.DeleteButton());

    }
    @Then("The shipment should be deleted successfully")
    public void theShipmentShouldBeDeletedSuccessfully() {

    }


}
