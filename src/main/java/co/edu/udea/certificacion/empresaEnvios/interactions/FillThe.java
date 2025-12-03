package co.edu.udea.certificacion.empresaEnvios.interactions;

import co.edu.udea.certificacion.empresaEnvios.userinterfaces.AdminPage;
import co.edu.udea.certificacion.empresaEnvios.userinterfaces.RegistrationPage;
import co.edu.udea.certificacion.empresaEnvios.userinterfaces.ShipmentPage;
import co.edu.udea.certificacion.empresaEnvios.utils.DataGenerator;
import co.edu.udea.certificacion.empresaEnvios.utils.WaitTime;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

public class FillThe implements Interaction {

    private String peso, volumen;

    @Override
    public <T extends Actor> void performAs(T actor) {

        peso = DataGenerator.generatePesoVolumen();
        volumen = DataGenerator.generatePesoVolumen();

        actor.attemptsTo(Click.on(ShipmentPage.PRESS_ENVIOS));
        WaitTime.putWaitTimeOf(3000);
        actor.attemptsTo(Click.on(ShipmentPage.PRESS_CREAR_ENVIO));
        WaitTime.putWaitTimeOf(3000);
        actor.attemptsTo(
                Click.on(ShipmentPage.INPUT_CLIENTE),                      // Abre el combo
                Click.on(ShipmentPage.OPTION_CLIENTE.of("Daniel Gonzalez (ID: 2)"))   // Selecciona la opción
        );
        WaitTime.putWaitTimeOf(3000);
        actor.attemptsTo(Click.on(ShipmentPage.INPUT_VEHICULO),Click.on(ShipmentPage.OPTION_VEHICULO));
        WaitTime.putWaitTimeOf(3000);
        actor.attemptsTo(
                Click.on(ShipmentPage.INPUT_ORIGEN),          // Abre el combo
                Enter.theValue("Albania").into(ShipmentPage.INPUT_BUSCADOR_ORIGEN),
                Hit.the(Keys.ENTER).into(ShipmentPage.INPUT_BUSCADOR_ORIGEN)
        );
        WaitTime.putWaitTimeOf(3000);
        actor.attemptsTo(
                Click.on(ShipmentPage.INPUT_DESTINO),                    // Abre el selector
                Enter.theValue("Barrancas").into(ShipmentPage.INPUT_BUSCADOR_DESTINO),
                Hit.the(Keys.ENTER).into(ShipmentPage.INPUT_BUSCADOR_DESTINO)  // Selecciona Albania
        );
        WaitTime.putWaitTimeOf(3000);
        actor.attemptsTo(
                Click.on(ShipmentPage.INPUT_PRIORIDAD),     // Abre la lista
                Click.on(ShipmentPage.OPTION_PRIORIDAD.of("Baja"))   // Selecciona Alta
        );
        WaitTime.putWaitTimeOf(3000);
        actor.attemptsTo(Enter.theValue(peso).into(ShipmentPage.INPUT_PESO));
        WaitTime.putWaitTimeOf(3000);
        actor.attemptsTo(Enter.theValue(volumen).into(ShipmentPage.INPUT_VOLUMEN));
        WaitTime.putWaitTimeOf(3000);
        actor.attemptsTo(Click.on(ShipmentPage.PRESS_GUARDAR));
        WaitTime.putWaitTimeOf(10000);

    }

    public static FillThe NewShipmentData(){
        return Tasks.instrumented(FillThe.class);
    }

}
